import React, { Component } from "react";

class Header extends Component {
    render() {
        return (
            <div>
                <nav class="navbar navbar-expand-sm navbar-dark bg-primary mb-4">
                    <div class="container">
                        <a class="navbar-brand" href="Dashboard.html">
                            Personal Project Management Tool
            </a>
                        <button
                            class="navbar-toggler"
                            type="button"
                            data-toggle="collapse"
                            data-target="#mobile-nav"
                        >
                            <span class="navbar-toggler-icon" />
                        </button>

                        <div className="collapse navbar-collapse" id="mobile-nav">
                            <ul className="navbar-nav mr-auto">
                                <li className="nav-item">
                                    <a className="nav-link" href="/dashboard">
                                        Dashboard
                  </a>
                                </li>
                            </ul>

                            <ul className="navbar-nav ml-auto">
                                <li className="nav-item">
                                    <a className="nav-link " href="register.html">
                                        Sign Up
                  </a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="login.html">
                                        Login
                  </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>
        );
    }
}
export default Header;
