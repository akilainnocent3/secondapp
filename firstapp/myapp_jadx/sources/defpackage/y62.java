package defpackage;

import android.content.Intent;
import android.view.View;
import com.sporty.android.core.model.MyLog;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import com.sportygames.commons.chat.views.ChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y62 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y62(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                TradeAdditionalResult tradeAdditionalResult = (TradeAdditionalResult) obj;
                bc6 bc6Var = ((tng0.f) ((tng0) obj2)).b;
                if (bc6Var.p() instanceof bzx) {
                    zi50.a aVar = zi50.b;
                    bc6Var.resumeWith(tradeAdditionalResult);
                } else {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_COMMON);
                    aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                }
                break;
            default:
                ChatActivity chatActivity = (ChatActivity) obj2;
                int i2 = ChatActivity.B0;
                ((View) obj).getClass();
                ha7 ha7Var = (ha7) chatActivity.a;
                if (ha7Var != null) {
                    ha7Var.d.setClickable(false);
                }
                ha7 ha7Var2 = (ha7) chatActivity.a;
                if (ha7Var2 != null) {
                    ha7Var2.d.setAlpha(0.5f);
                }
                Intent intent = new Intent("cashoutCall");
                intent.putExtra("betIndex", 1);
                fdt.a(chatActivity).c(intent);
                ha7 ha7Var3 = (ha7) chatActivity.a;
                if (ha7Var3 != null) {
                    ha7Var3.d.setClickable(false);
                }
                ha7 ha7Var4 = (ha7) chatActivity.a;
                if (ha7Var4 != null) {
                    ha7Var4.d.setAlpha(0.5f);
                }
                break;
        }
        return Unit.a;
    }
}
