import logo from "./logo.svg";
import About from "./components/About";
import Contact from "./components/Contact";
import Home from "./components/Home";
import "./App.css";

function App() {
  return (
    <div className="Container">
      <Home />
      <About />
      <Contact />
    </div>
  );
}

export default App;
