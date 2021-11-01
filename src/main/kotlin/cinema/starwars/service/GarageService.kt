package cinema.starwars.service

import cinema.starwars.entities.Garage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class GarageService {

    @Autowired
    lateinit var restTemplate: RestTemplate

    var url: String = "https://swapi.dev/api/vehicles"

    fun getGarage(): Garage? {

        return restTemplate.getForObject(url, Garage::class.java)
    }
}