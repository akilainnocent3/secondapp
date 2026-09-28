package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class as70 implements oze {
    public final jso a;

    public as70(qs70 qs70Var, String str) {
        this.a = new jso(str, lso.f, mso.b, qs70Var);
    }

    @Override // defpackage.oze
    public xjt c() {
        jso jsoVar = this.a;
        return new ms70(jsoVar.b, jsoVar.a, jsoVar.f, jsoVar.g, jsoVar.e);
    }

    public final String toString() {
        return this.a.d(getClass().getSimpleName());
    }
}
