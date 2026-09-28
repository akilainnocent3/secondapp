package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class q020 {
    public final tsr a;
    public final ham b;
    public final n020 c = new n020();
    public final iam d = new iam();
    public boolean e;

    public q020(tsr tsrVar) {
        this.a = tsrVar;
        this.b = new ham(tsrVar.U.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(o020 o020Var, AndroidComposeView androidComposeView, boolean z) {
        int i;
        Object[] objArr;
        ham hamVar;
        int i2;
        int i3;
        iam iamVar = this.d;
        if (this.e) {
            return 0;
        }
        try {
            this.e = true;
            czo czoVarA = this.c.a(o020Var, androidComposeView);
            qkt<m020> qktVar = czoVarA.a;
            int iH = qktVar.h();
            while (true) {
                if (i >= iH) {
                    objArr = true;
                    break;
                }
                m020 m020VarI = qktVar.i(i);
                i = (m020VarI.d || m020VarI.h) ? 0 : i + 1;
                objArr = false;
                break;
            }
            int iH2 = qktVar.h();
            int i4 = 0;
            while (true) {
                hamVar = this.b;
                if (i4 >= iH2) {
                    break;
                }
                m020 m020VarI2 = qktVar.i(i4);
                if (objArr != false || ovo.c(m020VarI2)) {
                    tsr tsrVar = this.a;
                    long j = m020VarI2.c;
                    int i5 = m020VarI2.i;
                    tsr.c cVar = tsr.g0;
                    tsrVar.L(j, iamVar, i5, true);
                    if (!iamVar.a.d()) {
                        hamVar.a(m020VarI2.a, iamVar, ovo.c(m020VarI2));
                        iamVar.clear();
                    }
                }
                i4++;
            }
            boolean zB = hamVar.b(czoVarA, z);
            if (czoVarA.c) {
                i2 = 0;
                break;
            }
            int iH3 = qktVar.h();
            int i6 = 0;
            while (true) {
                if (i6 >= iH3) {
                    i2 = 0;
                    break;
                }
                m020 m020VarI3 = qktVar.i(i6);
                if (!gly.c(ovo.h(m020VarI3, true), 0L) && m020VarI3.b()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int iH4 = qktVar.h();
            for (int i7 = 0; i7 < iH4; i7++) {
                if (qktVar.i(i7).b()) {
                    i3 = 1;
                    return (((i2 << 1) | (zB ? 1 : 0)) == true ? 1 : 0) | (i3 << 2);
                }
            }
            i3 = 0;
            return (((i2 << 1) | (zB ? 1 : 0)) == true ? 1 : 0) | (i3 << 2);
        } finally {
            this.e = false;
        }
    }
}
