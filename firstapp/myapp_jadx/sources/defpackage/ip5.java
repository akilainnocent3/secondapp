package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sporty.android.core.model.cms.CMSResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ip5 {
    public static final void a(final ifx ifxVar, final et60 et60Var, final op8 op8Var, a aVar, final int i) {
        b bVarI = aVar.i(233973821);
        if ((((bVarI.A(ifxVar) ? 4 : 2) | i | (bVarI.A(et60Var) ? 32 : 16)) & 147) == 146 && bVarI.j()) {
            bVarI.G();
        } else {
            hna.b(new j730[]{zdt.a.a(ifxVar), ndt.a.a(ifxVar), udt.a.a(ifxVar)}, pp8.b(1808964477, new qfx(et60Var, op8Var), bVarI), bVarI, 56);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(et60Var, op8Var, i) { // from class: nfx
                public final /* synthetic */ et60 b;
                public final /* synthetic */ op8 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(385);
                    ip5.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final et60 et60Var, final op8 op8Var, a aVar, final int i) {
        b bVarI = aVar.i(832919318);
        int i2 = (bVarI.A(et60Var) ? 4 : 2) | i | (bVarI.A(op8Var) ? 32 : 16);
        if ((i2 & 19) == 18 && bVarI.j()) {
            bVarI.G();
        } else {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new ofx(0);
                bVarI.r(objY);
            }
            Function1 function1 = (Function1) objY;
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            dq7 dq7VarA = jq40.a(bs1.class);
            cin cinVar = new cin();
            cinVar.a(jq40.a(bs1.class), function1);
            bs1 bs1Var = (bs1) p8i0.a(dq7VarA, w8i0VarA, null, cinVar.b(), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            bs1Var.b = new f4p(et60Var);
            et60Var.f(bs1Var.a, op8Var, bVarI, ((i2 << 6) & 896) | (i2 & 112));
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(op8Var, i) { // from class: pfx
                public final /* synthetic */ op8 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ip5.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final CMSResponse c(hp5 hp5Var) {
        hp5Var.getClass();
        return new CMSResponse(hp5Var.a, hp5Var.e, hp5Var.f, hp5Var.b);
    }
}
