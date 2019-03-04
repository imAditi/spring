import React, { Component } from "react";
import ProjectItem from "./Project/ProjectItem";
import CreateProjectButton from "./Project/CreateProjectButton";
import PropTypes from "prop-types";
import { connect } from "react-redux";
import { getAllProjects } from "./../actions/projectActions";
class Dashboard extends Component {
    componentDidMount() {
        this.props.getAllProjects();
    }
    render() {
        const { projects } = this.props.projects;
        let boardContext;
        let AllProjects = [];
        const Listproject = projects => {
            if (projects.length < 1) {
                return (
                    <div classname="alert alert-info text-center" role="alert">
                        No Project to Show !
          </div>
                );
            } else {
                const list = projects.map(project => (
                    <ProjectItem key={project.id} project={project} />
                ));
                for (let i = 0; i < list.length; i++) {
                    AllProjects.push(list[i]);
                }
                return <React.Fragment>{AllProjects}</React.Fragment>;
            }
        };
        boardContext = Listproject(projects);

        return (
            <div>
                <div className="projects">
                    <div className="container">
                        <div className="row">
                            <div className="col-md-12">
                                <h1 className="display-4 text-center">Projects</h1>
                                <br />
                                <CreateProjectButton />
                                <br />
                                <hr />
                                {boardContext}
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}
Dashboard.propTypes = {
    getAllProjects: PropTypes.func.isRequired,
    projects: PropTypes.object.isRequired
};

const mapStateToProps = state => ({
    projects: state.projects
});
export default connect(
    mapStateToProps,
    { getAllProjects }
)(Dashboard);
