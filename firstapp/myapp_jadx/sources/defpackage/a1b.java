package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a1b {
    public final SnapshotStateList<gaj<v0b, a, Integer, Unit>> a = new SnapshotStateList<>();

    public static void b(a1b a1bVar, Function2 function2, op8 op8Var, Function0 function0, int i) {
        if ((i & 8) != 0) {
            op8Var = null;
        }
        a1bVar.a.add(new op8(424163756, new z0b(function2, op8Var, function0), true));
    }

    public final void a(final v0b v0bVar, a aVar, final int i) {
        b bVarI = aVar.i(1320309496);
        int i2 = (bVarI.M(v0bVar) ? 4 : 2) | i | (bVarI.M(this) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            SnapshotStateList<gaj<v0b, a, Integer, Unit>> snapshotStateList = this.a;
            int size = snapshotStateList.size();
            for (int i3 = 0; i3 < size; i3++) {
                snapshotStateList.get(i3).invoke(v0bVar, bVarI, Integer.valueOf(i2 & 14));
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(v0bVar, i) { // from class: y0b
                public final /* synthetic */ v0b b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.a(this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
