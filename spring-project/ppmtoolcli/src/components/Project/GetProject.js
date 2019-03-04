import React, { Component } from "react";
import PropTypes from "prop-types";
import { connect } from "react-redux";
import classnames from "classnames";
import { getAllProjects } from "./../../actions/projectActions";

class GetProject extends Component {
    constructor() {
        super();
        this.state = {
            projectName: "",
            projectIdentifier: "",
            description: "",
            start_date: "",
            end_date: "",
            errors: {}
        };
    }

    componentDidMount() {
        this.props.getAllProjects();
 
    }

    render() {
        if (this.props.errors != undefined) {
            console.log("this.props.errors", this.state.projectName);
        }

        const { errors } = this.state;
        return (
            <div className="project">
                <div className="container">
                    <div className="row">
                        <div className="col-md-8 m-auto">
                            <h5 className="display-4 text-center">
                                Create / Edit Project form
              </h5>
                            <hr />
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}
GetProject.propTypes = {
    getAllProjects: PropTypes.func.isRequired,
    errors: PropTypes.object.isRequired
};

const mapStateToProps = state => ({
    errors: state.errors
});
export default connect(
    mapStateToProps,
    { getAllProjects }
)(GetProject);
