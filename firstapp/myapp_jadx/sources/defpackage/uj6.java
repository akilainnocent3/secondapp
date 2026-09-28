package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.android.cashoutphase3.b;
import com.sportybet.plugin.realsports.data.Bet;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uj6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uj6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                xh6 xh6Var = ((b) obj2).c0;
                if (xh6Var == null) {
                    Intrinsics.n("adapter");
                    throw null;
                }
                try {
                    HashSet<Bet> hashSet = new HashSet();
                    ArrayList arrayList = xh6Var.A;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        pl6 pl6Var = (pl6) obj3;
                        Bet bet = pl6Var.a;
                        if (bet != null && !hashSet.contains(bet)) {
                            Bet bet2 = pl6Var.a;
                            bet2.getClass();
                            hashSet.add(bet2);
                        }
                    }
                    for (Bet bet3 : hashSet) {
                        if (bet3.isHugeCombo) {
                            xh6Var.j(bet3);
                        } else {
                            xh6Var.d.s(bet3);
                        }
                    }
                    xh6Var.p();
                    break;
                } catch (Exception e) {
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_CASHOUT);
                    aVar.e(e);
                }
                return Unit.a;
            default:
                fuj fujVar = (fuj) obj2;
                try {
                    if (((Throwable) obj) instanceof IllegalStateException) {
                        fujVar.x1();
                    }
                    break;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return Unit.a;
        }
    }
}
