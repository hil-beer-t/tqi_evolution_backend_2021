import {BrowserRouter, Route, Routes} from "react-router-dom";

import Home from "./pages/Home";
import Navbar from "./components/Navbar";
import Register from "./pages/Register";
import Login from "./pages/Login";
import Listing from "./pages/Feed";
import Loan from "./pages/Loan";

function App() {
  return (
    <BrowserRouter>
        <Navbar />
        <Routes>
            <Route path="/" element={<Home/>} />
            <Route path="/listing/" >
                <Route path=":clientId" element={<Listing/>}/>
                <Route path=":clientId/create-loan-sim" element={<Loan/>}/>
            </Route>
            <Route path="/register" element={<Register/>} />
            <Route path="/login" element={<Login/>} />
            <Route path="/loan" element={<Loan/>} />
        </Routes>
    </BrowserRouter>
  );
}

export default App;
