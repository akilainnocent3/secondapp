package defpackage;

import android.view.View;
import com.sporty.android.core.model.MyLog;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import com.sportygames.chat.remote.models.LeaveRequest;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.chat.views.ChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a72 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a72(Object obj, int i) {
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
                bc6 bc6Var = ((tng0.a) ((tng0) obj2)).b;
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
                if (!Intrinsics.g(chatActivity.c, SportyGamesManager.getInstance().getUserId())) {
                    sh7 sh7VarG1 = chatActivity.G1();
                    ej5.c(o8i0.d(sh7VarG1), null, null, new ph7(sh7VarG1, new LeaveRequest(chatActivity.L), null), 3);
                }
                chatActivity.getOnBackPressedDispatcher().d();
                break;
        }
        return Unit.a;
    }
}
