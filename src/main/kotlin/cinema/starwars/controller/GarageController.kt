package cinema.starwars.controller

import cinema.starwars.entities.Garage
import cinema.starwars.entities.StarwarsVehicles
import cinema.starwars.service.GarageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/starwars")
class GarageController {

    @Autowired
    lateinit var garageService: GarageService

    @GetMapping("all")
    fun getGarage(): Garage? {
        return garageService.getGarage()
    }

}