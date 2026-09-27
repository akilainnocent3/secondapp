package yads;

import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class xb3 {
    public static final void a(ou3 ou3Var, eo2 eo2Var) {
        String strA;
        Set setK;
        try {
            c cVarA = eo2Var.a();
            if (cVarA == null || (strA = cVarA.a()) == null) {
                strA = "";
            }
            c cVarA2 = eo2Var.a();
            if (cVarA2 == null || (setK = cVarA2.b()) == null) {
                setK = fr.y1.k();
            }
            ou3Var.a(strA);
            ou3Var.a(setK);
            Objects.toString(setK);
            boolean z10 = ad1.f146762a;
        } catch (Throwable th2) {
            th2.toString();
            boolean z11 = ad1.f146762a;
        }
    }
}
