package jw;

import fx.g1;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface e extends Cloneable {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        @oy.l
        e a(@oy.l l0 l0Var);
    }

    void cancel();

    @oy.l
    /* JADX INFO: renamed from: clone */
    e mo3452clone();

    @oy.l
    n0 execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    void n4(@oy.l f fVar);

    @oy.l
    l0 request();

    @oy.l
    g1 timeout();
}
