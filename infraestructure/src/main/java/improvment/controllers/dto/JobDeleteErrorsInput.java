package improvment.controllers.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.Data;

@Data
public class JobDeleteErrorsInput {

  private String endDate;
  private int limit;

  public LocalDateTime getEndDateLocalDateTime() {
    return formatterDate(endDate);
  }

  private LocalDateTime formatterDate(String date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    return  LocalDateTime.parse(date, formatter);
  }

}
