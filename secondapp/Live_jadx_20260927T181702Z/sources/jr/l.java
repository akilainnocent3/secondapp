package jr;

import java.util.Comparator;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class l<T> implements Comparator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Comparator<T> f100684b;

    public l(@oy.l Comparator<T> comparator) {
        m0.p(comparator, "comparator");
        this.f100684b = comparator;
    }

    @oy.l
    public final Comparator<T> b() {
        return this.f100684b;
    }

    @Override // java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f100684b.compare(t11, t10);
    }

    @Override // java.util.Comparator
    @oy.l
    public final Comparator<T> reversed() {
        return this.f100684b;
    }
}
