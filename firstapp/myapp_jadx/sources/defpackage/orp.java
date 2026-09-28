package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class orp {
    public static final chf a = new chf(new jck(1));
    public static final chf b = new chf(new mrp());

    public static final void a(final lrp lrpVar, final op8 op8Var, a aVar, final int i) {
        lrpVar.getClass();
        krp krpVar = lrpVar.a;
        b bVarI = aVar.i(-1672936023);
        if ((((bVarI.A(lrpVar) ? 4 : 2) | i) & 19) == 18 && bVarI.j()) {
            bVarI.G();
        } else {
            hna.b(new j730[]{a.a(krpVar), b.a(krpVar.c.d)}, op8Var, bVarI, 56);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(op8Var, i) { // from class: nrp
                public final /* synthetic */ op8 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    orp.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final qn70 b(a aVar) {
        aVar.N(1668867238);
        qn70 qn70Var = (qn70) aVar.O(b);
        aVar.H();
        return qn70Var;
    }

    public static final krp c(a aVar) {
        aVar.N(523578110);
        try {
            krp krpVar = (krp) aVar.O(a);
            aVar.H();
            return krpVar;
        } catch (Exception e) {
            ogf.a(e, "Can't get Koin context due to error:");
            return null;
        }
    }
}
