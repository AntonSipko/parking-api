package telran.parking.dto;


import java.time.LocalDateTime;

import jakarta.validation.constraints.Email;

public record ReportDto(long carNumber,long cameraId,String cameraAdress,LocalDateTime timeStamp,long ownerId,String ownerEnail,double adressFinePrice,FineStatus fineStatus,String ownerFirstName,String ownerLastName) {

}
