import React from "react";
import { Link } from "react-router-dom";

const UpdateProjectButton = props => {
    const newTo = {
        pathname: "/updateProject/" + props.project.projectIdentifier,
        id: props.project.id,
        projectName: props.project.projectName,
        projectIdentifier: props.project.projectIdentifier,
        description: props.project.description,
        start_date: props.project.start_date,
        end_date: props.project.end_date,
        created_at: props.project.created_at,
        updated_at: props.project.updated_at
    };
    return <React.Fragment>
        <Link to={newTo}>
            <ul className="list-group">
          <button className="btn btn-xs btn-success">
            Update Project Info
          </button>
          </ul>
        </Link>
      </React.Fragment>;
};

export default UpdateProjectButton;
