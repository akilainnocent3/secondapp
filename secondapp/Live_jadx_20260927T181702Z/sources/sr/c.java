package sr;

import dr.a3;
import dr.f1;
import dr.l1;
import dr.p0;
import dr.v;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    @l1(version = "2.0")
    @a3(markerClass = {v.class})
    public static final /* synthetic */ <T extends Enum<T>> a<T> a() {
        throw new p0(null, 1, 0 == true ? 1 : 0);
    }

    @f1
    @l
    @l1(version = "1.8")
    public static final <E extends Enum<E>> a<E> b(@l ds.a<E[]> entriesProvider) {
        m0.p(entriesProvider, "entriesProvider");
        return new d(entriesProvider.invoke());
    }

    @f1
    @l
    @l1(version = "1.8")
    public static final <E extends Enum<E>> a<E> c(@l E[] entries) {
        m0.p(entries, "entries");
        return new d(entries);
    }
}
