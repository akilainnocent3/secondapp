package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class rs70 implements gpv {
    public final bp8<qs70> a;
    public final String b;
    public String c;
    public String d;

    public rs70(bp8<qs70> bp8Var, String str) {
        this.a = bp8Var;
        this.b = str;
    }

    @Override // defpackage.gpv
    public final gpv a(String str) {
        this.c = str;
        return this;
    }

    @Override // defpackage.gpv
    public final gpv b(String str) {
        this.d = str;
        return this;
    }

    @Override // defpackage.gpv
    public final fpv build() {
        return this.a.b(this.b, this.c, this.d, vw0.d);
    }
}
