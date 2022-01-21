import {
    BrowserRouter,
    Routes,
    Route
} from "react-router-dom";

import Home from "./pages/Home";
import Navbar from "./components/Navbar";

function App() {
  return (
    <BrowserRouter>
        <Navbar />
        <Routes>
            <Route path="/" element={<Home/>} />
            <Route path="/feed">
                {/*<Route path=":movieId" element={Listing} />*/}
            </Route>
        </Routes>
    </BrowserRouter>
  );
}

export default App;
