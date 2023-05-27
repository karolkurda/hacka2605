import React from 'react';
import './App.css';

const Nav = () => {
  return (
      <nav className="wrapper">
        <button className="burger-icon"><i className="fas fa-bars"></i></button>
        <div className="nav-items">
          {/*<form action="/logout" method="post" id="logout-form">*/}
          {/*  <a href="#" onClick={() => document.getElementById('logout-form').submit()}>Sign Out</a>*/}
          {/*</form>*/}
          {/* <a href="#about-us">o nas</a>
        <a href="#products-wrapper">produkty</a>
        <a href="#contact-wrapper">kontakt</a> */}
          <a href="#"></a>
        </div>
      </nav>
  );
};

const Header = () => {
  return (
      <header className="hdr">
        <div className="img-big"></div>
        <div className="img-txt">
          <h1>J-<span>Sok</span></h1>
          <p>Jednolity System Obsługi Konfidentów</p>
        </div>
      </header>
  );
};

const Main = () => {
  return (
      <main>
      </main>
  );
};

const Footer = () => {
  return (
      <footer>
        <p>&copy; 2023 Telekoxy</p>
      </footer>
  );
};

const App = () => {
  return (
      <div>
        <Nav />
        <Header />
        <Main />
        <Footer />
      </div>
  );
};

export default App;
