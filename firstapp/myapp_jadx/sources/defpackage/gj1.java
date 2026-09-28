package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class gj1 implements inp {
    public final String a;
    public final ruh0<?> b;

    public gj1(String str, ruh0<?> ruh0Var) {
        if (str == null) {
            bmy.a("Null key");
            throw null;
        }
        this.a = str;
        if (ruh0Var != null) {
            this.b = ruh0Var;
        } else {
            bmy.a("Null value");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gj1) {
            gj1 gj1Var = (gj1) obj;
            if (this.a.equals(gj1Var.a) && this.b.equals(gj1Var.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.inp
    public final String getKey() {
        return this.a;
    }

    @Override // defpackage.inp
    public final ruh0<?> getValue() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "KeyValueImpl{key=" + this.a + ", value=" + this.b + "}";
    }
}
