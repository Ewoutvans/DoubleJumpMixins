package cloud.zeroprox.doublejumpmixins.event;

import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.event.impl.AbstractEvent;

public class ToggleFlyEvent extends AbstractEvent {

    private final boolean isFlying;
    private final Cause cause;

    public ToggleFlyEvent(boolean isFlying, Cause cause) {
        this.isFlying = isFlying;
        this.cause = cause;
    }

    @Override
    public Cause getCause() {
        return this.cause;
    }

    public boolean isFlying() {
        return this.isFlying;
    }
}
