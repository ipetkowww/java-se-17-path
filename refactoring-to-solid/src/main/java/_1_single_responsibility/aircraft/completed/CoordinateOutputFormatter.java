package _1_single_responsibility.aircraft.completed;

import java.util.List;

public class CoordinateOutputFormatter {

    private final boolean latFirst;

    public CoordinateOutputFormatter(boolean latFirst) {
        this.latFirst = latFirst;
    }

    public String parse(List<AircraftTarget> targets) {
        var sb = new StringBuilder();
        if (latFirst) {
            targets.forEach(target -> buildLatLon(sb, target));
        } else {
            targets.forEach(target -> buildLonLat(sb, target));
        }

        return sb.toString();
    }

    private StringBuilder buildLatLon(StringBuilder stringBuilder, AircraftTarget aircraftTarget) {
        return stringBuilder.append("[")
                .append(aircraftTarget.lat())
                .append(" ")
                .append(aircraftTarget.lon())
                .append("] ");
    }

    private StringBuilder buildLonLat(StringBuilder stringBuilder, AircraftTarget aircraftTarget) {
        return stringBuilder.append("[")
                .append(aircraftTarget.lon())
                .append(" ")
                .append(aircraftTarget.lat())
                .append("] ");
    }
}
