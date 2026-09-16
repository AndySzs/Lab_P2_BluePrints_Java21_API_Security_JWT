package co.edu.eci.blueprints.filters;

import co.edu.eci.blueprints.model.Blueprint;
import org.springframework.stereotype.Component;

@Component
public class IdentityFilter implements BlueprintsFilter {
    @Override
    public Blueprint apply(Blueprint bp) { return bp; }
}
