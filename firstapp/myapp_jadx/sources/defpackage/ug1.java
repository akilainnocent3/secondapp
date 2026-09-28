package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ug1 extends in8 {
    public final ki1 a;
    public final in8.a b;

    public ug1(ki1 ki1Var) {
        in8.a aVar = in8.a.a;
        this.a = ki1Var;
        this.b = aVar;
    }

    @Override // defpackage.in8
    public final h4h a() {
        return this.a;
    }

    @Override // defpackage.in8
    public final in8.a b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof in8)) {
            return false;
        }
        in8 in8Var = (in8) obj;
        ki1 ki1Var = this.a;
        if (ki1Var == null) {
            if (in8Var.a() != null) {
                return false;
            }
        } else if (!ki1Var.equals(in8Var.a())) {
            return false;
        }
        in8.a aVar = this.b;
        if (aVar == null) {
            return in8Var.b() == null;
        }
        return aVar.equals(in8Var.b());
    }

    public final int hashCode() {
        ki1 ki1Var = this.a;
        int iHashCode = ((ki1Var == null ? 0 : ki1Var.hashCode()) ^ 1000003) * 1000003;
        in8.a aVar = this.b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + this.b + "}";
    }
}
