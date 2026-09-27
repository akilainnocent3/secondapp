package yl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public enum k implements wk.g {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ sr.a f159634f = sr.c.c(d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f159635b;

    k(int i10) {
        this.f159635b = i10;
    }

    @oy.l
    public static sr.a<k> g() {
        return f159634f;
    }

    @Override // wk.g
    public int getNumber() {
        return this.f159635b;
    }
}
