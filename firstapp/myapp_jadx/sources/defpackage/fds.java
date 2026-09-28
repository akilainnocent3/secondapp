package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class fds {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(kds kdsVar, Function0 function0, a aVar, int i) {
        function0.getClass();
        b bVarI = aVar.i(1117134674);
        int i2 = i | 2 | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                kdsVar = (kds) p8i0.a(jq40.a(kds.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            } else {
                bVarI.G();
            }
            int i3 = i2 & (-15);
            bVarI.Y();
            ytw ytwVarC = wyh.c(kdsVar.b, bVarI, 0, 7);
            xfa.a(kdsVar, bVarI, 8);
            ids idsVar = (ids) ytwVarC.getValue();
            if (idsVar instanceof ids.b) {
                bVarI.N(-175392761);
                qcs.a(0, bVarI);
                bVarI.X(false);
            } else if (idsVar instanceof ids.c) {
                bVarI.N(-175390601);
                b(((ids.c) idsVar).a, function0, bVarI, i3 & 112);
                bVarI.X(false);
            } else {
                if (!(idsVar instanceof ids.a)) {
                    throw igf0.a(bVarI, -175394750, false);
                }
                bVarI.N(-175385084);
                cdg.a(0, 1, bVarI, null);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new pz4(kdsVar, function0, i, 1);
        }
    }

    public static final void b(final hds hdsVar, final Function0<Unit> function0, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-1263315060);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(hdsVar) : bVarI.A(hdsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            z990.d(hdsVar.a, hdsVar.b, function0, bVarI, (i2 << 3) & 896);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: eds
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    fds.b(hdsVar, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
