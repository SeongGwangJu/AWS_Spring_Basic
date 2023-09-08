import axios from "axios"

    const api = axios.create({
        baseURL: "http://localhost:8080" //백엔드서버
    });

export default api;