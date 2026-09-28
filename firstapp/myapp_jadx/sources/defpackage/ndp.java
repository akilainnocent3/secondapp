package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ndp extends bep {
    public final boolean a;
    public final pd80 b;
    public final String c;

    public ndp(Object obj, boolean z, pd80 pd80Var) {
        obj.getClass();
        this.a = z;
        this.b = pd80Var;
        this.c = obj.toString();
        if (pd80Var == null || pd80Var.isInline()) {
            return;
        }
        hb5.a("Failed requirement.");
        throw null;
    }

    @Override // defpackage.bep
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ndp.class != obj.getClass()) {
            return false;
        }
        ndp ndpVar = (ndp) obj;
        return this.a == ndpVar.a && Intrinsics.g(this.c, ndpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.bep
    public final String toString() {
        boolean z = this.a;
        String str = this.c;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        dae0.a(sb, str);
        return sb.toString();
    }
}
