package zhenyatevo.rezervation;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController {
    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/{id}")
    public Reservation getReservaionById(
            @PathVariable("id") Long id){
        return reservationService.getReservationById(id);
    }
    @GetMapping()
    public List<Reservation> getAllReservaion(){
        return reservationService.findAllReservation();
    }

}
