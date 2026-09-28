package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ki1 extends h4h {
    public final ji1 a;

    public ki1(ji1 ji1Var) {
        this.a = ji1Var;
    }

    @Override // defpackage.h4h
    public final g4h a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h4h)) {
            return false;
        }
        h4h h4hVar = (h4h) obj;
        ji1 ji1Var = this.a;
        if (ji1Var == null) {
            return h4hVar.a() == null;
        }
        return ji1Var.equals(h4hVar.a());
    }

    public final int hashCode() {
        ji1 ji1Var = this.a;
        return (ji1Var == null ? 0 : ji1Var.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }
}
