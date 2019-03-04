import React, { Component } from "react";
import PropTypes from "prop-types";
import { connect } from "react-redux";
import { createProject } from "../../actions/projectActions";
import classnames from "classnames";
class AddProject extends Component {
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
        this.onChange = this.onChange.bind(this);
        this.onSubmit = this.onSubmit.bind(this);
    }
    componentWillReceiveProps(nextProps) {
        if (nextProps.errors) {
            this.setState({ errors: nextProps.errors });
        }
    }
    onChange(event) {
        //console.log("------event trigger-------", event.target);
        this.setState({ [event.target.name]: event.target.value });
    }
    onSubmit(event) {
        event.preventDefault();
        const newProject = {
            projectName: this.state.projectName,
            projectIdentifier: this.state.projectIdentifier,
            description: this.state.description,
            start_date: this.state.start_date,
            end_date: this.state.end_date
        };
        this.props.createProject(newProject, this.props.history);
    }
    render() {
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
                            <form onSubmit={this.onSubmit}>
                                <div className="form-group">
                                    <input
                                        type="text"
                                        name="projectName"
                                        value={this.state.projectName}
                                        className={classnames("form-control form-control-lg ", {
                                            "is-invalid": errors.projectName
                                        })}
                                        placeholder="Project Name"
                                        onChange={this.onChange}
                                    />
                                    {errors.projectName && (
                                        <div className="invalid-feedback">{errors.projectName}</div>
                                    )}
                                </div>
                                <div className="form-group">
                                    <input
                                        type="text"
                                        name="projectIdentifier"
                                        value={this.state.projectIdentifier}
                                        className={classnames("form-control form-control-lg ", {
                                            "is-invalid": errors.projectIdentifier
                                        })}
                                        placeholder="Unique Project ID"
                                        onChange={this.onChange}
                                    />
                                    {errors.projectIdentifier && (
                                        <div className="invalid-feedback">
                                            {errors.projectIdentifier}
                                        </div>
                                    )}
                                </div>
                                <div className="form-group">
                                    <textarea
                                        name="description"
                                        value={this.state.description}
                                        className={classnames("form-control form-control-lg ", {
                                            "is-invalid": errors.description
                                        })}
                                        placeholder="Project Description"
                                        onChange={this.onChange}
                                    />
                                    {errors.description && (
                                        <div className="invalid-feedback">{errors.description}</div>
                                    )}
                                </div>
                                <h6>Start Date</h6>
                                <div className="form-group">
                                    <input
                                        type="date"
                                        value={this.state.start_date}
                                        className={classnames("form-control form-control-lg ", {
                                            "is-invalid": errors.start_date
                                        })}
                                        name="start_date"
                                        onChange={this.onChange}
                                    />
                                    {errors.start_date && (
                                        <div className="invalid-feedback">{errors.start_date}</div>
                                    )}
                                </div>
                                <h6>Estimated End Date</h6>
                                <div className="form-group">
                                    <input
                                        type="date"
                                        value={this.state.end_date}
                                        className={classnames("form-control form-control-lg ", {
                                            "is-invalid": errors.end_date
                                        })}
                                        name="end_date"
                                        onChange={this.onChange}
                                    />
                                    {errors.end_date && (
                                        <div className="invalid-feedback">{errors.end_date}</div>
                                    )}
                                </div>
                                <input
                                    type="submit"
                                    className="btn btn-primary btn-block mt-4"
                                />
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}
AddProject.propType = {
    createProject: PropTypes.func.isRequired,
    errors: PropTypes.object.isRequired
};
const mapStateToProps = state => ({
    errors: state.errors
});
export default connect(
    mapStateToProps,
    { createProject }
)(AddProject);