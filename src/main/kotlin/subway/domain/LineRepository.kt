package subway.domain

import java.util.Collections
import java.util.Objects


class LineRepository(private val lines: MutableList<Line>) {
    fun lines(): List<Line> {
        return Collections.unmodifiableList(lines)
    }

    fun addLine(line: Line) {
        lines.add(line)
    }

    fun deleteLineByName(name: String?): Boolean {
        return lines.removeIf { line: Line ->
            Objects.equals(
                line.getName(),
                name
            )
        }
    }
}