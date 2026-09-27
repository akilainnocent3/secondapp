package xi;

import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@t0(21)
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f145148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f145149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f145150c;

    public c(int i10, int i11, boolean z10) {
        this.f145148a = i10;
        this.f145149b = i11;
        this.f145150c = z10;
    }

    public static c a(int i10, int i11) {
        return new c(i10, i11, true);
    }

    public static c b(int i10, int i11) {
        return new c(i10, i11, false);
    }
}
