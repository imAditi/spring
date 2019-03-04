import axios from "axios";
import { GET_ERRORS } from "./types";
import { GET_PROJECTS } from "./types";
import { DELETE_PROJECTS } from "./types";

export const createProject = (project, history) => async dispatch => {
    try {
        const res = await axios.post("http://localhost:8080/web/projects", project);
        history.push("/dashboard");
    } catch (error) {
        dispatch({
            type: GET_ERRORS,
            payload: error.response.data
        });
    }
};

export const getAllProjects = () => async dispatch => {
    const res = await axios.get("http://localhost:8080/web/projects/all");
    dispatch({
        type: GET_PROJECTS,
        payload: res.data
    });
};

export const deleteProject = projectId => async dispatch => {
    if (
        window.confirm(
            "You are deleting project id" +
            projectId +
            ",this action can not be completed"
        )
    ) {
        await axios.delete("http://localhost:8080/web/projects/" + projectId);
        dispatch({
            type: DELETE_PROJECTS,
            payload: projectId
        });
    }
};

// export const getProject = (projectId, history) => async dispatch => {
//   try {
//     const res = await axios.get(
//       "http://localhost:8080/web/projects/" + projectId
//     );
//     dispatch({
//       type: GET_PROJECTS,
//       payload: res.data
//     });
//   } catch (error) {
//     history.push("/");
//   }
// };

export const updateProject = (project, history) => async dispatch => {
    try {
        const res = await axios.put("http://localhost:8080/web/projects", project);
        history.push("/dashboard");
    } catch (error) {
        dispatch({
            type: GET_ERRORS,
            payload: error.response.data
        });
    }
};
