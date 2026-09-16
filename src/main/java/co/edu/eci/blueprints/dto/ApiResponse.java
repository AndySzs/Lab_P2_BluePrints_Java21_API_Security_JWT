package co.edu.eci.blueprints.dto;

public record ApiResponse<T>(int code, String message, T data) {

    public static <T> ApiResponse<T> of(int code, String message, T data) {
        return new ApiResponse<>(code, message, data);
    }

    public static <T> ApiResponse<T> ok(T data) {
        return new ApiResponse<>(200, "execute ok", data);
    }
}
