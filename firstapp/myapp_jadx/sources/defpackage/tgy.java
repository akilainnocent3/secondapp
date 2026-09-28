package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tgy {
    public final ht7<Float> a;
    public final lhy b;
    public final qcn<khy> c;

    public tgy(ht7<Float> ht7Var, lhy lhyVar, qcn<khy> qcnVar) {
        ht7Var.getClass();
        qcnVar.getClass();
        this.a = ht7Var;
        this.b = lhyVar;
        this.c = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgy)) {
            return false;
        }
        tgy tgyVar = (tgy) obj;
        return Intrinsics.g(this.a, tgyVar.a) && this.b == tgyVar.b && Intrinsics.g(this.c, tgyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OddsFilterCustomOptionState(range=");
        sb.append(this.a);
        sb.append(", selectionState=");
        sb.append(this.b);
        sb.append(", oddsTicks=");
        return ts3.a(sb, this.c, ")");
    }
}
