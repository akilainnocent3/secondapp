package defpackage;

import com.sportybet.model.cashOut.CashOutData;
import com.sportybet.plugin.realsports.data.Bet;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lq6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lq6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj2;
                CashOutData cashOutData = (CashOutData) obj;
                cashOutData.getClass();
                Iterator<Bet> it = cashOutData.getCashAbleBets().iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                    } else if (!Intrinsics.g(it.next().id, str)) {
                        i2++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i2);
                if (i2 < 0) {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    return cashOutData;
                }
                int iIntValue = numValueOf.intValue();
                ArrayList arrayListC0 = CollectionsKt.C0(cashOutData.getCashAbleBets());
                arrayListC0.remove(iIntValue);
                return CashOutData.copy$default(cashOutData, cashOutData.getTotalNum() - 1, arrayListC0, null, null, false, false, null, 124, null);
            case 1:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.f(((abf) obj2).o.d().floatValue());
                return Unit.a;
            default:
                a7l a7lVar2 = (a7l) obj;
                a7lVar2.getClass();
                a7lVar2.b(((Number) ((wd0) obj2).d()).floatValue());
                return Unit.a;
        }
    }
}
