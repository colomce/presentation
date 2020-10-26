import React, {useState} from "react";

function Signup() {
    const [email, setEmail] = useState("");
    const [name, setName] = useState("");

    const signup = () => {
        console.log(email);
        console.log(name);

        /* dispatch action here */
        alert("You have successfully Logged in! ");
    }

    return (
        <form>
            <h3>Register</h3>

            <div className="form-group">
                <label>Email address</label>
                <input type="email" className="form-control" placeholder="Enter email" onChange={e => setEmail(e.target.value)}/>
            </div>

            <div className="form-group">
                <label>Name</label>
                <input type="name" className="form-control" placeholder="Enter your name" onChange={e => setName(e.target.value)}/>
            </div>

            <button type="submit" className="btn btn-primary btn-block" onClick={signup}>Submit</button>
        </form>
    );
}

export default Signup;