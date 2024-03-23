import logo from './logo.svg';
import "bootstrap/dist/css/bootstrap.min.css";
import './App.css';
import { useEffect, useState } from 'react';



function App() {
  const [products, setProducts] = useState([])

  useEffect(() => {
     fetch('http://localhost:8084/products')
      .then((res) => {
        return res.json();
      })
      .then((data) => {
        console.log(data);
        setProducts(data);
      });
  }, []);
  return (

    <div className="container">
      <h1>Shop Project</h1>
      <table className="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Product Name</th>
            <th scope="col">Price</th>
            <th scope="col">Stock</th>
          </tr>
        </thead>
        <tbody>

          {products.map(product => {
            console.log("**", product)
            return (<tr key={product.id}>
              <th scope="row">{product.id}</th>
              <td>{product.name}</td>
              <td>{product.price}</td>
              <td>{product.stock}</td>
            </tr>
            )
          }
          )}

        </tbody>
      </table>
    </div>
  );
}

export default App;

