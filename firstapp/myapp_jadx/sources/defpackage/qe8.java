package defpackage;

import android.content.Context;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.fragment.app.e;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Event;
import com.sportybet.android.instantwin.newtork.model.response.Market;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qe8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qe8(q1c0 q1c0Var, Context context) {
        this.a = 2;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i = this.a;
        int i2 = 1;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                re8 re8Var = (re8) obj3;
                vhg vhgVar = (vhg) obj;
                re8.a aVar = re8.P;
                if (vhgVar.b) {
                    obj2 = null;
                } else {
                    vhgVar.b = true;
                    obj2 = vhgVar.a;
                }
                t6e t6eVar = (t6e) obj2;
                if (t6eVar == null) {
                    return Unit.a;
                }
                ((zc8) re8Var.G.getValue()).y1();
                e activity = re8Var.getActivity();
                if (activity != null) {
                    if (t6eVar instanceof t6e.e) {
                        f00 f00Var = vgb0.a;
                        vgb0.a(AnalyticsEvent.DEPOSIT);
                        t6e.e eVar = (t6e.e) t6eVar;
                        re8Var.H = eVar.a;
                        re8Var.I = eVar.c;
                        re8Var.J = eVar.b.a;
                        re8Var.q0(activity);
                        activity.finish();
                    } else if (t6eVar instanceof t6e.f) {
                        f00 f00Var2 = vgb0.a;
                        vgb0.a(AnalyticsEvent.DEPOSIT);
                        t6e.f fVar = (t6e.f) t6eVar;
                        re8Var.H = fVar.a;
                        re8Var.I = fVar.c;
                        re8Var.J = fVar.b.a;
                        fth fthVar = re8Var.O;
                        if (fthVar == null || !fthVar.j1()) {
                            re8Var.q0(activity);
                        } else {
                            fth fthVar2 = re8Var.O;
                            if (fthVar2 != null) {
                                fthVar2.N();
                            }
                        }
                    } else if (t6eVar instanceof t6e.g) {
                        b.a aVar2 = new b.a(activity);
                        String str = ((t6e.g) t6eVar).a;
                        AlertController.b bVar = aVar2.a;
                        bVar.f = str;
                        bVar.k = false;
                        aVar2.c(sn5.d(re8Var, R.string.common_functions__ok, new Object[0]), null);
                        aVar2.f();
                    } else if (t6eVar instanceof t6e.d) {
                        String strD = ((t6e.d) t6eVar).a;
                        if (strD.length() == 0) {
                            strD = sn5.d(re8Var, R.string.common_payment_providers__deposit_request_confirm_msg, new Object[0]);
                        }
                        ie8 ie8Var = new ie8(re8Var, 0);
                        sc00.a(activity, strD, ie8Var, ie8Var).show();
                    } else if (t6eVar instanceof t6e.b) {
                        String strD2 = ((t6e.b) t6eVar).a;
                        if (strD2.length() == 0) {
                            strD2 = sn5.d(re8Var, R.string.page_payment__sorry_your_payment_request_has_a_problem_options_tip, new Object[0]);
                        }
                        b.a aVar3 = new b.a(activity);
                        AlertController.b bVar2 = aVar3.a;
                        bVar2.f = strD2;
                        bVar2.k = false;
                        b.a title = aVar3.setTitle(sn5.d(re8Var, R.string.page_payment__error_during_transaction, new Object[0]));
                        title.c(sn5.d(re8Var, R.string.common_functions__ok, new Object[0]), null);
                        title.f();
                    } else if (t6eVar instanceof t6e.a) {
                        b.a aVar4 = new b.a(activity);
                        String str2 = ((t6e.a) t6eVar).a;
                        AlertController.b bVar3 = aVar4.a;
                        bVar3.f = str2;
                        bVar3.k = false;
                        aVar4.c(sn5.d(re8Var, R.string.common_functions__ok, new Object[0]), null);
                        aVar4.f();
                    } else if (t6eVar instanceof t6e.h) {
                        String strD3 = ((t6e.h) t6eVar).a;
                        if (strD3.length() == 0) {
                            strD3 = sn5.d(re8Var, R.string.page_payment__sorry_your_payment_request_has_a_problem_options_tip, new Object[0]);
                        }
                        b.a aVar5 = new b.a(activity);
                        AlertController.b bVar4 = aVar5.a;
                        bVar4.f = strD3;
                        bVar4.k = false;
                        b.a title2 = aVar5.setTitle(sn5.d(re8Var, R.string.page_payment__error_during_transaction, new Object[0]));
                        title2.c(sn5.d(re8Var, R.string.common_functions__ok, new Object[0]), null);
                        title2.f();
                    } else {
                        if (!t6eVar.equals(t6e.i.b)) {
                            uhc.a();
                            return null;
                        }
                        String strD4 = sn5.d(re8Var, R.string.page_payment__sorry_your_payment_request_has_a_problem_options_tip, new Object[0]);
                        b.a aVar6 = new b.a(activity);
                        AlertController.b bVar5 = aVar6.a;
                        bVar5.f = strD4;
                        bVar5.k = false;
                        b.a title3 = aVar6.setTitle(sn5.d(re8Var, R.string.page_payment__error_during_transaction, new Object[0]));
                        title3.c(sn5.d(re8Var, R.string.common_functions__ok, new Object[0]), null);
                        title3.f();
                    }
                }
                return Unit.a;
            case 1:
                Event event = (Event) obj3;
                Market market = (Market) obj;
                Iterable iterable = market.outcomes;
                if (iterable == null) {
                    iterable = m2g.a;
                }
                return new ysg0(ld80.d(CollectionsKt.K(iterable), new k5v()), new af8(i2, event, market));
            default:
                Context context = (Context) obj3;
                Long l = (Long) obj;
                l.longValue();
                HashMap mapQ1 = q1c0.q1(context);
                mapQ1.remove(l);
                q1c0.s2(context, mapQ1);
                return Unit.a;
        }
    }

    public /* synthetic */ qe8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
