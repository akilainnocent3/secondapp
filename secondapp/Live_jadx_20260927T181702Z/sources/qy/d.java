package qy;

import fx.g1;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface d<T> extends Cloneable {
    void R0(f<T> fVar);

    void cancel();

    /* JADX INFO: renamed from: clone */
    d<T> mo3453clone();

    i0<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    jw.l0 request();

    g1 timeout();
}
