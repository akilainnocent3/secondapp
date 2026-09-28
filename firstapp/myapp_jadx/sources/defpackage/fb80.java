package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fb80 {
    public final tsr a;
    public final r3g b;
    public final gwo<tsr> c;
    public final etw<va80> d = new etw<>(2);

    public fb80(tsr tsrVar, r3g r3gVar, msw mswVar) {
        this.a = tsrVar;
        this.b = r3gVar;
        this.c = mswVar;
    }

    public final bb80 a() {
        return new bb80(this.b, false, this.a, new sa80());
    }
}
