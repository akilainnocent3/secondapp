package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r760 implements rc60 {
    public final qcn<t760> a;
    public final goh0 b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public r760(qcn<? extends t760> qcnVar, goh0 goh0Var) {
        qcnVar.getClass();
        goh0Var.getClass();
        this.a = qcnVar;
        this.b = goh0Var;
        boolean z = false;
        if (qcnVar == 0 || !qcnVar.isEmpty()) {
            Iterator it = qcnVar.iterator();
            while (it.hasNext()) {
                if (Intrinsics.g((t760) it.next(), this.b.a)) {
                    z = true;
                    break;
                }
            }
        }
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r760)) {
            return false;
        }
        r760 r760Var = (r760) obj;
        return Intrinsics.g(this.a, r760Var.a) && Intrinsics.g(this.b, r760Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SBAutoDialogState(countList=" + this.a + ", currentChoose=" + this.b + ')';
    }

    public r760(int i) {
        this(n1a0.c, new goh0(0));
    }

    public r760() {
        this(0);
    }
}
