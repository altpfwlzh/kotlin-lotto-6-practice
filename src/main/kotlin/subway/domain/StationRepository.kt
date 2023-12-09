package subway.domain

import java.util.Collections


class StationRepository(private val stations: MutableList<Station>) {

    fun stations(): List<Station?>? {
        return Collections.unmodifiableList(stations)
    }

    fun addStation(station: Station) {
      stations.add(station)
    }

    fun deleteStation(name: String?): Boolean {
        return stations.removeIf { station: Station ->
            station.getName() == name
        }
    }
}