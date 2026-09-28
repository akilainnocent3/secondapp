package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b530 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b530(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                e530 e530Var = (e530) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e160) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    lkf0.d(e530Var.b, null, 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).n, aVar, 0, 0, 130046);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                kxa kxaVar = (kxa) obj3;
                long j = ((cjf0) obj4).f;
                long j2 = kxaVar.a;
                int iK = kxa.k(j2);
                long j3 = kxaVar.a;
                final y yVarD0 = ((vhv) obj2).d0(kxa.b(f.e((int) (j >> 32), iK, kxa.i(j3)), 0, f.e((int) (j & 4294967295L), kxa.j(j3), kxa.h(j3)), 0, 10, j2));
                return t.z1((t) obj, yVarD0.a, yVarD0.b, new Function1() { // from class: djf0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        y.a.A((y.a) obj5, yVarD0, 0, 0);
                        return Unit.a;
                    }
                });
        }
    }
}
