package jr;

import java.util.Comparator;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class j implements Comparator<Comparable<? super Object>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final j f100682b = new j();

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(@oy.l Comparable<Object> a10, @oy.l Comparable<Object> b10) {
        m0.p(a10, "a");
        m0.p(b10, "b");
        return a10.compareTo(b10);
    }

    @Override // java.util.Comparator
    @oy.l
    public final Comparator<Comparable<? super Object>> reversed() {
        return k.f100683b;
    }
}
