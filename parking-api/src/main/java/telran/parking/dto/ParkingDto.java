package telran.parking.dto;

import java.time.LocalDateTime;
import jakarta.validation.constraints.*;
public record ParkingDto(@NotNull long cameraId,@NotNull long slotId,String carNumber,@NotNull LocalDateTime timeStamp) {

}
