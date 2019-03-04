import { createStore, applyMiddleware, compose } from "redux";
import thunk from "redux-thunk";
import rootReducer from "./reducers";
import AddProject from "./components/Project/AddProject";
import { createProject } from "./actions/projectActions";
import { PropTypes } from "prop-types";

const initialState = {};
const middleware = [thunk];

let store;
if (window.navigator.userAgent.includes("Chrome")) {
    store = createStore(
        rootReducer,
        compose(
            applyMiddleware(...middleware),
            window.__REDUX_DEVTOOLS_EXTENSION__ &&
            window.__REDUX_DEVTOOLS_EXTENSION__()
        )
    );
} else {
    store = createStore(rootReducer, compose(applyMiddleware(...middleware)));
}
export default store;
