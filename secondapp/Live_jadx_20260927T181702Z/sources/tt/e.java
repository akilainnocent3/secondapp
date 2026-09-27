package tt;

import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @m
    public static final <M extends yt.i.d<M>, T> T a(@l yt.i.d<M> dVar, @l yt.i.g<M, T> extension) {
        m0.p(dVar, "<this>");
        m0.p(extension, "extension");
        if (dVar.t(extension)) {
            return (T) dVar.q(extension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public static final <M extends yt.i.d<M>, T> T b(@l yt.i.d<M> dVar, @l yt.i.g<M, List<T>> extension, int i10) {
        m0.p(dVar, "<this>");
        m0.p(extension, "extension");
        if (i10 < dVar.s(extension)) {
            return (T) dVar.r(extension, i10);
        }
        return null;
    }
}
