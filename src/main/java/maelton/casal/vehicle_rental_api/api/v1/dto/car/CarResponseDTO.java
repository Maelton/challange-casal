package maelton.casal.vehicle_rental_api.api.v1.dto.car;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

@Schema(description = "DTO used to represent cars data in responses")
public record CarResponseDTO(UUID id, String name, String chassis, int numberOfDoors) {
}