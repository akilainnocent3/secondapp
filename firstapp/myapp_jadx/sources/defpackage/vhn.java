package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vhn {
    public final c100 a;
    public final String b;
    public final List<p610> c;

    public vhn(c100 c100Var, String str, List<p610> list) {
        c100Var.getClass();
        str.getClass();
        this.a = c100Var;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhn)) {
            return false;
        }
        vhn vhnVar = (vhn) obj;
        return this.a == vhnVar.a && Intrinsics.g(this.b, vhnVar.b) && this.c.equals(vhnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Initialized(payChannel=");
        sb.append(this.a);
        sb.append(", cpf=");
        sb.append(this.b);
        sb.append(", registeredBankAccounts=");
        return ng1.a(sb, this.c, ")");
    }
}
