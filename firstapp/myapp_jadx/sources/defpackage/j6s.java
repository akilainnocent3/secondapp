package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j6s {
    public static void a(jee0 jee0Var, int i, oya<q4c> oyaVar) {
        long jC = jee0Var.c(i);
        List<j4c> listB = jee0Var.b(jC);
        if (listB.isEmpty()) {
            return;
        }
        if (i == jee0Var.d() - 1) {
            fm20.a();
            return;
        }
        long jC2 = jee0Var.c(i + 1) - jee0Var.c(i);
        if (jC2 > 0) {
            oyaVar.accept(new q4c(jC, jC2, listB));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    public static void b(jee0 jee0Var, ree0.b bVar, oya<q4c> oyaVar) {
        int iA;
        boolean z;
        long j = bVar.a;
        if (j == -9223372036854775807L) {
            iA = 0;
        } else {
            iA = jee0Var.a(j);
            if (iA == -1) {
                iA = jee0Var.d();
            }
            if (iA > 0 && jee0Var.c(iA - 1) == j) {
                iA--;
            }
        }
        if (j == -9223372036854775807L || iA >= jee0Var.d()) {
            z = false;
        } else {
            List<j4c> listB = jee0Var.b(j);
            long jC = jee0Var.c(iA);
            if (listB.isEmpty()) {
                z = false;
            } else {
                long j2 = bVar.a;
                if (j2 < jC) {
                    oyaVar.accept(new q4c(j2, jC - j2, listB));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i = iA; i < jee0Var.d(); i++) {
            a(jee0Var, i, oyaVar);
        }
        if (bVar.b) {
            if (z) {
                iA--;
            }
            for (int i2 = 0; i2 < iA; i2++) {
                a(jee0Var, i2, oyaVar);
            }
            if (z) {
                oyaVar.accept(new q4c(jee0Var.c(iA), j - jee0Var.c(iA), jee0Var.b(j)));
            }
        }
    }
}
