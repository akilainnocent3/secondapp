package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class et70 implements ajg0 {
    public final bp8<dt70> a;
    public final String b;
    public String c;
    public String d;

    public et70(bp8<dt70> bp8Var, String str) {
        this.a = bp8Var;
        this.b = str;
    }

    @Override // defpackage.ajg0
    public final ajg0 a(String str) {
        this.c = str;
        return this;
    }

    @Override // defpackage.ajg0
    public final ajg0 b(String str) {
        this.d = str;
        return this;
    }

    @Override // defpackage.ajg0
    public final zig0 build() {
        return this.a.b(this.b, this.c, this.d, vw0.d);
    }
}
