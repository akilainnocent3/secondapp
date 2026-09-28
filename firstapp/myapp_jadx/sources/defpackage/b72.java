package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.sporty.android.core.model.MyLog;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import com.sportygames.commons.chat.views.ChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b72 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b72(Object obj, int i) {
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
                bc6 bc6Var = ((tng0.b) ((tng0) obj2)).b;
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
                Object systemService = chatActivity.getSystemService("input_method");
                systemService.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                ha7 ha7Var = (ha7) chatActivity.a;
                uke ukeVar = ha7Var != null ? ha7Var.I : null;
                ukeVar.getClass();
                inputMethodManager.hideSoftInputFromWindow(ukeVar.e.getWindowToken(), 0);
                chatActivity.S1();
                chatActivity.a2();
                break;
        }
        return Unit.a;
    }
}
