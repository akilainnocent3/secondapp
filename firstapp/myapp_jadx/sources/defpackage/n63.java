package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Event;
import com.sportybet.android.instantwin.newtork.model.response.Market;
import com.sportybet.android.instantwin.newtork.model.response.Outcome;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n63 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n63(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                q73 q73Var = (q73) obj2;
                jrm jrmVar = q73Var.N;
                if (((AlertDialogCallbackType) obj) instanceof AlertDialogCallbackType.Positive) {
                    jrmVar.B();
                    jrmVar.d1(true);
                    q73Var.Q0.a(Unit.a);
                    ku90<a> ku90Var = q73Var.k1;
                    StringUiText stringUiText = vch0.a;
                    b.i(ku90Var, new ResourceUiText(R.string.component_betslip__auto_accept_odds_change_successfully_enabled), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                }
                return Unit.a;
            default:
                final Event event = (Event) obj2;
                final Market market = (Market) obj;
                Iterable iterable = market.outcomes;
                if (iterable == null) {
                    iterable = m2g.a;
                }
                return new ysg0(ld80.d(CollectionsKt.K(iterable), new q0v()), new Function1() { // from class: r0v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return new bxg0(event, market, (Outcome) obj3);
                    }
                });
        }
    }
}
