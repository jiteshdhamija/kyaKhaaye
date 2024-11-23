import React, { useState } from "react";

export default function FoodSarch() {
    const [filterFields, setFilterFields] = useState([{ id: 1, dish: 'biryani', cuisine: 'hyrabadi', beverage: true, hot: true, veg: true, course: 'maincourse', region: 'Indian' }, { id: 2, dish: 'Aappam', cuisine: 'indian', beverage: false, hot: false, veg: true, course: 'snacks', region: 'Indian' }])
    const [selectedValue, setSelectedValue] = useState({ dish: '', cuisine: '', beverage: false, hot: false, veg: false, course: '', region: '' })
    const [errors, setErrors]=useState({});
    const handleChange = (e) => {
        const { name, value } = e.target;
        setSelectedValue((preValue) => ({ ...preValue, [name]: value }))
        setErrors((preValue) => ({ ...preValue, [name]: '' }))
    }
    const handleChecked = (e) => {
        const { name, checked } = e.target;
        setSelectedValue((prevValue) => ({ ...prevValue, [name]: checked }));
    };
    const handleSubmit=(e)=>{
        e.preventDefault();
        const newError={};
        if(!selectedValue.dish) newError.dish="Please select a dish";
        if(!selectedValue.cuisine) newError.cuisine="Please select a cuisine";
        if(!selectedValue.course) newError.course="Please select a course";
        if(!selectedValue.region) newError.region="Please select a region";
        setErrors(newError);
        if (Object.keys(newError).length === 0) {
            console.log(selectedValue);
            // Proceed with form submission
        }
    }
    const getUniqueRegions = (fields) => {
        const regions = fields.map(field => field.region);
        return [...new Set(regions)];
    };

    const uniqueRegions = getUniqueRegions(filterFields);


    return (<div>
        <br/>
        <h1 className="fw-light">Do you want me to suggest your today's food?</h1>
        <hr className="w-75 mx-auto"/>
        <br/>
        <br/>
        <br/>
        <form onSubmit={handleSubmit}>
            <div className="container text-center border border-3 border-subtle p-3 rounded">
                <div className="row m-2">
                    <div className="col text-start">
                        <label htmlFor="Dish" className="form-label fw-semibold text-start">Dish:</label>
                        <select className="form-select" aria-label="Dish" name="dish" value={selectedValue.dish} onChange={handleChange}>
                            {selectedValue.dish==='' && <option selected>Select Dish</option>}
                            {filterFields.map((i) => (
                                <option key={i.id} value={i.dish}>{i.dish}</option>

                            ))}
                        </select>
                        {errors.dish && <div className="text-danger">{errors.dish}</div>}
                    </div>
                    <div className="col text-start">
                        <label htmlFor="Cuisine" className="form-label fw-semibold text-start">Cuisine:</label>
                        <select className="form-select" aria-label="Cuisine" name="cuisine" value={selectedValue.cuisine} onChange={handleChange}>
                        {selectedValue.cuisine==='' && <option selected>Select Cuisine</option>}
                            {filterFields.map((i) => (
                                <option key={i.id} value={i.cuisine}>{i.cuisine}</option>

                            ))}
                        </select>
                        {errors.cuisine && <div className="text-danger">{errors.cuisine}</div>}
                    </div>
                    <div className="col-md-auto ">
                        <label htmlFor="BeverageCheckBox" className="form-label fw-semibold text-start">Beverage:</label>
                        <br />
                        <input className="form-check-input mt-3" type="checkbox" id="BeverageCheckBox" name="beverage" checked={selectedValue.beverage} onChange={handleChecked} />
                    </div>
                    <div className="col-md-auto ">
                        <label htmlFor="HotCheckBox" className="form-label fw-semibold text-start">Hot:</label>
                        <br />
                        <input className="form-check-input mt-3" type="checkbox" id="HotCheckBox" name="hot" checked={selectedValue.hot} onChange={handleChecked} />
                    </div>
                    <div className="col-md-auto">
                        <label htmlFor="VegCheckBox" className="form-label fw-semibold text-start">Veg:</label>
                        <br />
                        <input className="form-check-input mt-3" type="checkbox" id="VegCheckBox" name="veg" checked={selectedValue.veg} onChange={handleChecked} />
                    </div>
                    <div className="col text-start">
                        <label htmlFor="Course" className="form-label fw-semibold text-start">Course:</label>
                        <select className="form-select" aria-label="Course" name="course" value={selectedValue.course} onChange={handleChange}>
                            {selectedValue.course==='' && <option selected>Select Course</option>}
                            {filterFields.map((i) => (
                                <option key={i.id} value={i.course}>{i.course}</option>

                            ))}
                        </select>
                        {errors.course && <div className="text-danger">{errors.course}</div>}
                    </div>
                    <div className="col text-start">
                        <label htmlFor="region" className="form-label fw-semibold text-start" >Region:</label>
                        <select className="form-select" aria-label="region" name="region" value={selectedValue.region} onChange={handleChange}>
                            {selectedValue.region==='' && <option selected>Select Region</option>}
                            {uniqueRegions.map((i,index) => (
                                <option key={index} value={i}>{i}</option>

                            ))}
                        </select>
                        {errors.region && <div className="text-danger">{errors.region}</div>}
                    </div>
                </div>
                <div className="row mt-2">
                    <div className="col">
                    <button type="submit" className="btn btn-primary">Submit</button>
                    </div>
                </div>

            </div>
        </form>
    </div>)
}