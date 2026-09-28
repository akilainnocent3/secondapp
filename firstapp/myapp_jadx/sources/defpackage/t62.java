package defpackage;

import android.os.SystemClock;
import com.sporty.android.core.model.MyLog;
import com.sportybet.feature.gift.gift.presentation.GiftActivity;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t62 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t62(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                TradeAdditionalResult tradeAdditionalResult = (TradeAdditionalResult) obj;
                bc6 bc6Var = ((tng0.h) ((tng0) obj2)).c;
                if (bc6Var.p() instanceof bzx) {
                    zi50.a aVar = zi50.b;
                    bc6Var.resumeWith(tradeAdditionalResult);
                } else {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_COMMON);
                    aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                }
                return Unit.a;
            case 1:
                fgb fgbVar = (fgb) obj2;
                cgb.a(fgbVar.e1(), (String) ((x5a0) fgbVar.c1().v).getValue(), "placeBet", (String) obj);
                return Unit.a;
            case 2:
                wae waeVar = (wae) obj;
                int i3 = GiftActivity.e;
                waeVar.getClass();
                ((GiftActivity) obj2).z1().d(waeVar);
                return Unit.a;
            default:
                String str = (String) obj2;
                qcn qcnVar = (qcn) obj;
                ArrayList arrayList = qcnVar != null ? new ArrayList(qcnVar) : new ArrayList();
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        if (Intrinsics.g(((g7q) obj3).a(), str)) {
                            return qcnVar;
                        }
                    }
                }
                arrayList.add(new g7q.b(str, SystemClock.elapsedRealtime()));
                return a4h.f(arrayList);
        }
    }
}
