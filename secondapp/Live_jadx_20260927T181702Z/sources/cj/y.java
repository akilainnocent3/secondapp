package cj;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public enum y {
    OPEN(false),
    CLOSED(true);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24709b;

    y(boolean inclusive) {
        this.f24709b = inclusive;
    }

    public static y e(boolean inclusive) {
        return inclusive ? CLOSED : OPEN;
    }
}
