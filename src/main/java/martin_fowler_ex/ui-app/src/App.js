import logo from './logo.svg';
import './App.css';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import Signup from "./components/Signup";
function App() {
  return (
    <div className="App">
        <div className="auth-wrapper">
        <div className="auth-inner">
            <Signup/>
        </div>
    </div>
    </div>
  );
}

export default App;


