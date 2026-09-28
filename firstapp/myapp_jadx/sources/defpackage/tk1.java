package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class tk1 extends ryd0 {
    public final uk1 a;
    public final wk1 b;
    public final vk1 c;

    public tk1(uk1 uk1Var, wk1 wk1Var, vk1 vk1Var) {
        this.a = uk1Var;
        this.b = wk1Var;
        this.c = vk1Var;
    }

    @Override // defpackage.ryd0
    public final ryd0.a a() {
        return this.a;
    }

    @Override // defpackage.ryd0
    public final ryd0.b b() {
        return this.c;
    }

    @Override // defpackage.ryd0
    public final ryd0.c c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ryd0)) {
            return false;
        }
        ryd0 ryd0Var = (ryd0) obj;
        return this.a.equals(ryd0Var.a()) && this.b.equals(ryd0Var.c()) && this.c.equals(ryd0Var.b());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
