package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$undoLastDeletedOrders$1", f = "RealBetHistoryViewModel.kt", l = {407}, m = "invokeSuspend", v = 2)
public final class u740 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d740 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u740(v1b v1bVar, d740 d740Var) {
        super(2, v1bVar);
        this.c = d740Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        u740 u740Var = new u740(v1bVar, this.c);
        u740Var.b = obj;
        return u740Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u740) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        d740 d740Var = this.c;
        try {
            if (i == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                at2 at2Var = d740Var.b;
                this.b = null;
                this.a = 1;
                obj = at2Var.m(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            obj = new zi50.b(th);
        }
        if (!(obj instanceof zi50.b)) {
            ku90<a> ku90Var = d740Var.B;
            StringUiText stringUiText = vch0.a;
            b.i(ku90Var, new ResourceUiText(R.string.bet_history__undo_completed), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        Throwable thA = zi50.a(obj);
        if (thA != null) {
            b.i(d740Var.B, thA instanceof SprThrowable ? vch0.d(((SprThrowable) thA).getE()) : vch0.b, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        return Unit.a;
    }
}
