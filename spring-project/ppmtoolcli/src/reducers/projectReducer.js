import { GET_PROJECTS, DELETE_PROJECTS } from "./../actions/types";

const initialState = {
    projects: []
};
export default function (state = initialState, action) {
    switch (action.type) {
        case GET_PROJECTS:
            return {
                ...state,
                projects: action.payload
            };

        case DELETE_PROJECTS:
            return {
                ...state,
                projects: state.projects.filter(
                    projects => projects.id !== action.payload
                )
            };

        default:
            return state;
    }
}
