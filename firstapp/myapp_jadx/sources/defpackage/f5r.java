package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f5r implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f5r(t4r t4rVar, boolean z, int i) {
        this.c = t4rVar;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String strA;
        imf0 imf0Var;
        int i = this.a;
        boolean z = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                u5r.g((t4r) obj3, z, (a) obj, qj40.a(1));
                return Unit.a;
            default:
                qfg0 qfg0Var = (qfg0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int iOrdinal = qfg0Var.ordinal();
                    if (iOrdinal == 0) {
                        aVar.N(742241799);
                        strA = cb40.a(R.string.world_cup_tournament__groups, new Object[0], aVar);
                        aVar.H();
                    } else {
                        if (iOrdinal != 1) {
                            throw rg.a(742240585, aVar);
                        }
                        aVar.N(742244489);
                        strA = cb40.a(R.string.world_cup_tournament__knockout, new Object[0], aVar);
                        aVar.H();
                    }
                    String str = strA;
                    if (z) {
                        aVar.N(1374405724);
                        imf0Var = ((ijb0) aVar.O(kjb0.a)).m;
                    } else {
                        aVar.N(1374406364);
                        imf0Var = ((ijb0) aVar.O(kjb0.a)).o;
                    }
                    aVar.H();
                    lkf0.d(str, null, ((lib0) aVar.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, imf0Var, aVar, 0, 24960, 110586);
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ f5r(qfg0 qfg0Var, boolean z) {
        this.c = qfg0Var;
        this.b = z;
    }
}
