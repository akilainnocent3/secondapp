package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface fmt extends qmt {

    public static final class a {
        /* JADX WARN: Code duplicated, block: B:32:0x0050  */
        public static Object a(fmt fmtVar, xmt xmtVar, int i, boolean z, float f, wmt wmtVar, float f2, v1b v1bVar, int i2) {
            float f3;
            umt umtVar = umt.a;
            int iB = (i2 & 2) != 0 ? fmtVar.B() : 1;
            if ((i2 & 4) != 0) {
                i = fmtVar.y();
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                z = fmtVar.w();
            }
            boolean z2 = z;
            float fZ = (i2 & 16) != 0 ? fmtVar.z() : f;
            wmt wmtVarI = (i2 & 32) != 0 ? fmtVar.I() : wmtVar;
            if ((i2 & 64) != 0) {
                float fB = 0.0f;
                if (fZ < 0.0f && xmtVar == null) {
                    fB = 1.0f;
                } else if (xmtVar != null) {
                    if (fZ < 0.0f) {
                        if (wmtVarI != null) {
                            fB = wmtVarI.a();
                        } else {
                            fB = 1.0f;
                        }
                    } else if (wmtVarI != null) {
                        fB = wmtVarI.b();
                    }
                }
                f3 = fB;
            } else {
                f3 = f2;
            }
            return fmtVar.G(xmtVar, iB, i3, z2, fZ, wmtVarI, f3, false, umtVar, false, v1bVar);
        }

        public static /* synthetic */ Object b(fmt fmtVar, xmt xmtVar, float f, tje0 tje0Var, int i) {
            if ((i & 1) != 0) {
                xmtVar = fmtVar.E();
            }
            return fmtVar.C(xmtVar, f, (i & 4) != 0 ? fmtVar.B() : 1, !(f == fmtVar.g()), tje0Var);
        }
    }

    Object C(xmt xmtVar, float f, int i, boolean z, tje0 tje0Var);

    Object G(xmt xmtVar, int i, int i2, boolean z, float f, wmt wmtVar, float f2, boolean z2, umt umtVar, boolean z3, v1b v1bVar);
}
