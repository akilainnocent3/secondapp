package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class qj1 extends npv {
    public final String c;
    public final String d;
    public final nl1 e;
    public final bj1 f;

    public qj1(String str, String str2, nl1 nl1Var, bj1 bj1Var) {
        if (str == null) {
            bmy.a("Null name");
            throw null;
        }
        this.c = str;
        if (str2 == null) {
            bmy.a("Null description");
            throw null;
        }
        this.d = str2;
        if (nl1Var == null) {
            bmy.a("Null view");
            throw null;
        }
        this.e = nl1Var;
        this.f = bj1Var;
    }

    @Override // defpackage.npv
    public final String b() {
        return this.d;
    }

    @Override // defpackage.npv
    public final String c() {
        return this.c;
    }

    @Override // defpackage.npv
    public final bj1 d() {
        return this.f;
    }

    @Override // defpackage.npv
    public final nl1 e() {
        return this.e;
    }

    public final String toString() {
        return "MetricDescriptor{name=" + this.c + ", description=" + this.d + ", view=" + this.e + ", sourceInstrument=" + this.f + "}";
    }
}
