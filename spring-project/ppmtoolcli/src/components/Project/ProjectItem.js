import React, { Component } from "react";
import { Link } from "react-router-dom";
import { deleteProject } from "../../actions/projectActions";
import projectReducer from "../../reducers/projectReducer";
import { PropTypes } from "prop-types";
import { connect } from "react-redux";
import UpdateProjectButton from "./UpdateProjectButton";

class ProjectItem extends Component {
    onDeleteClick(projectId) {
        this.props.deleteProject(projectId);
    }
    render() {
        const { project } = this.props;
        return <div className="container">
            <div className="card card-body bg-light mb-3">
              <div className="row">
                <div className="col-2">
                  <span className="mx-auto">
                    {project.id} : {project.projectName}
                  </span>
                </div>
                <div className="col-lg-6 col-md-4 col-8">
                  <h3>{project.projectIdentifier}</h3>
                  <p>{project.description}</p>
                </div>
                <div className="col-md-4 d-none d-lg-block">
                        <ul className="list-group">
                            <button className="btn btn-xs btn-info">Project Board</button>
                            <UpdateProjectButton project={project} />

                            <button
                                className="btn btn-xs btn-danger"
                                onClick={this.onDeleteClick.bind(this, project.projectIdentifier)}
                            >
                                Delete Project
              </button>
                        </ul>
                </div>
              </div>
            </div>
          </div>;
    }
}
ProjectItem.propTypes = { deleteProject: PropTypes.func.isRequired };
export default connect(
    null,
    { deleteProject }
)(ProjectItem);
