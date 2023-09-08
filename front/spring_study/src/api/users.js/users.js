import api from "../api";

export const registerUser = async (user) => {
    //자동으로 Json으로 변환해 요청
    return api.post("/user", user);
};

export const getUserListALl = async () => {
    return api.get("/user/list");
}

export const updateUser = async (user) => {
    return api.put(`/users/${user.userId}`, user)
}

export const deleteUser = async (user) => {
    return api.delete(`/users/${user.userId}`)
}