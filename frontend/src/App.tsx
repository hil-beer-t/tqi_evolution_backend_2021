import {BrowserRouter, Route, Routes} from "react-router-dom";

import Home from "./pages/Home";
import Navbar from "./components/Navbar";
import Register from "./pages/Register";
import Login from "./pages/Login";
import Listing from "./pages/Feed";

function App() {
  return (
    <BrowserRouter>
        <Navbar />
        <Routes>
            <Route path="/" element={<Home/>} />
            <Route path="/listing" element={<Listing/>} />
            <Route path="/register" element={<Register/>} />
            <Route path="/login" element={<Login/>} />
        </Routes>
    </BrowserRouter>
  );
}

export default App;
