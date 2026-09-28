package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class dh9 {
    public static final op8 a = new op8(1612191826, new ah9(), false);
    public static final op8 b = new op8(764319297, new bh9(), false);
    public static final op8 c = new op8(-623610731, new ch9(), false);
    public static final /* synthetic */ int d = 0;

    public static final void a(int i, op8 op8Var, a aVar) {
        b bVarI = aVar.i(-709502251);
        int i2 = 1;
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            qyd0 qyd0Var = pt60.a;
            final mt60 mt60Var = (mt60) bVarI.O(qyd0Var);
            final kt60 kt60VarA = i3k.a(bVarI);
            Object[] objArr = {mt60Var};
            uv60 uv60Var = new uv60(new Function1() { // from class: o0s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return new q0s(mt60Var, (Map) obj, kt60VarA);
                }
            }, new cn4(i2));
            boolean zA = bVarI.A(mt60Var) | bVarI.A(kt60VarA);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new jdi(1, mt60Var, kt60VarA);
                bVarI.r(objY);
            }
            q0s q0sVar = (q0s) o350.c(objArr, uv60Var, (Function0) objY, bVarI, 0);
            hna.a(qyd0Var.a(q0sVar), pp8.b(-412824043, new s0s(op8Var, q0sVar), bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new r0s(i, op8Var);
        }
    }
}
