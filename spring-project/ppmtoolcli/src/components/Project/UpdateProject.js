import React, { Component } from "react";
import PropTypes from "prop-types";
import { connect } from "react-redux";
import { updateProject } from "./../../actions/projectActions";
import classnames from "classnames";

class UpdateProject extends Component {
    constructor(props) {
        super(props);

        this.onChange = this.onChange.bind(this);
        this.onSubmit = this.onSubmit.bind(this);
        this.state = {
            id: this.props.location.id,
            projectName: this.props.location.projectName,
            projectIdentifier: this.props.location.projectIdentifier,
            description: this.props.location.description,
            start_date: this.props.location.start_date,
            end_date: this.props.location.end_date,
            created_at: this.props.location.created_at,
            updated_at: this.props.location.updated_at,
            errors: {}
        };
    }

    componentWillReceiveProps(nextProps) {
        if (nextProps.errors) {
            this.setState({ errors: nextProps.errors });
        }
    }
    onChange(event) {
        this.setState({
            [event.target.name]: event.target.value
        });
    }

    onSubmit(event) {
        event.preventDefault();
        var newProject = {
            id: this.state.id,
            projectName: this.state.projectName,
            projectIdentifier: this.state.projectIdentifier,
            description: this.state.description,
            start_date: this.state.start_date,
            end_date: this.state.end_date,
            created_at: this.state.created_at,
            updated_at: this.state.updated_at
        };
        this.props.updateProject(newProject, this.props.history);
    }

    render() {
        const { errors } = this.state;
        return (
            <div className="container">
                <h2>{this.props.location.projectName}</h2>
                <div className="row">
                    <div className="col-md-8 m-auto">
                        <h5 className="display-4 text-center">Edit Project form</h5>
                        <hr />
                        <form onSubmit={this.onSubmit}>
                            <div className="form-group">
                                <input
                                    onChange={this.onChange}
                                    name="projectName"
                                    value={this.state.projectName}
                                    type="text"
                                    className={classnames("form-control form-control-lg ", {
                                        "is-invalid": errors.projectName
                                    })}
                                    placeholder="Project Name"
                                />
                                {errors.projectName && (
                                    <div className="invalid-feedback">{errors.projectName}</div>
                                )}
                            </div>
                            <div className="form-group">
                                <input
                                    onChange={this.onChange}
                                    name="projectIdentifier"
                                    value={this.state.projectIdentifier}
                                    type="text"
                                    className={classnames("form-control form-control-lg ", {
                                        "is-invalid": errors.projectIdentifier
                                    })}
                                    placeholder="Unique Project ID"
                                />
                                {errors.projectIdentifier && (
                                    <div className="invalid-feedback">
                                        {errors.projectIdentifier}
                                    </div>
                                )}
                            </div>

                            <div className="form-group">
                                <textarea
                                    onChange={this.onChange}
                                    name="description"
                                    value={this.state.description}
                                    className={classnames("form-control form-control-lg ", {
                                        "is-invalid": errors.description
                                    })}
                                    placeholder="Project Description"
                                />
                                {errors.description && (
                                    <div className="invalid-feedback">{errors.description}</div>
                                )}
                            </div>

                            <input type="submit" className="btn btn-primary btn-block mt-4" />
                        </form>
                    </div>
                </div>
            </div>
        );
    }
}

UpdateProject.prototypes = {
    updateProject: PropTypes.func.isRequired,
    errors: PropTypes.object.isRequired
};

const mapStateToProps = state => ({
    errors: state.errors
});

export default connect(
    mapStateToProps,
    { updateProject }
)(UpdateProject);
