import React from 'react';
import  {BrowserRouter, Routes, Route } from 'react-router-dom';
import Products from './components/Products';
import Cart from './Pages/Cart';

export default function App() {
  return (
    <BrowserRouter>
        <Routes>
        <Route path="/" element={<Products/>}></Route>
        <Route path="/cart" element={<Cart />} />
        </Routes>
    </BrowserRouter>
  );
}
