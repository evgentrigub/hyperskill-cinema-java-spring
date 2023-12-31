package cinema.models;

import java.util.List;

public class SeatsInfoDto {
    int total_rows;
    int total_columns;
    List<SeatDto> available_seats;

    public SeatsInfoDto() {}

    public SeatsInfoDto(int total_rows, int total_columns, List<SeatDto> available_seats) {
        this.total_rows = total_rows;
        this.total_columns = total_columns;
        this.available_seats = available_seats;
    }

    public int getTotal_rows() {
        return total_rows;
    }

    public void setTotal_rows(int total_rows) {
        this.total_rows = total_rows;
    }

    public int getTotal_columns() {
        return total_columns;
    }

    public void setTotal_columns(int total_columns) {
        this.total_columns = total_columns;
    }

    public List<SeatDto> getAvailable_seats() {
        return available_seats;
    }

    public void setAvailable_seats(List<SeatDto> available_seats) {
        this.available_seats = available_seats;
    }

}
