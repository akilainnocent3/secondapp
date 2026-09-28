package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.activities.JackpotSuccessfulPageActivity;
import com.sportybet.plugin.jackpot.data.Order;

/* JADX INFO: loaded from: classes4.dex */
public final class e7p implements gv5<BaseResponse<Order>> {
    public final /* synthetic */ c7p a;

    public e7p(c7p c7pVar) {
        this.a = c7pVar;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<Order>> su5Var, Throwable th) {
        c7p c7pVar = this.a;
        c7pVar.S.cancel();
        e activity = c7pVar.getActivity();
        if (activity == null || activity.isFinishing() || su5Var.isCanceled() || c7pVar.isDetached()) {
            return;
        }
        c7pVar.I.setButtonText(R.string.component_betslip__place_bet);
        c7pVar.I.setLoadingText(R.string.component_betslip__place_bet);
        c7pVar.I.setLoading(false);
        c7pVar.Z.setEnabled(true);
        c7pVar.y0(q5p.b.REQUEST_FAILED);
        c7pVar.v0(-1, null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<Order>> su5Var, bi50<BaseResponse<Order>> bi50Var) {
        Object value;
        Object value2;
        c7p c7pVar = this.a;
        c7pVar.S.cancel();
        e activity = c7pVar.getActivity();
        if (activity == null || activity.isFinishing() || su5Var.isCanceled() || c7pVar.isDetached()) {
            return;
        }
        c7pVar.I.setButtonText(R.string.component_betslip__place_bet);
        c7pVar.I.setLoadingText(R.string.component_betslip__place_bet);
        c7pVar.I.setLoading(false);
        c7pVar.Z.setEnabled(true);
        BaseResponse<Order> baseResponse = bi50Var.b;
        if (!bi50Var.a.getIsSuccessful() || baseResponse == null) {
            c7pVar.y0(q5p.b.EMPTY_RESPONSE);
            c7pVar.v0(-1, null);
            return;
        }
        int i = baseResponse.bizCode;
        if (i != 10000) {
            if (i != 80001) {
                c7pVar.w0(i);
                c7pVar.v0(baseResponse.bizCode, baseResponse.message);
                return;
            } else {
                c7pVar.w0(i);
                fbh0 fbh0VarC = sh8.c();
                Order order = baseResponse.data;
                fbh0VarC.b(x140.a(order != null ? order.reachedLimits : null));
                return;
            }
        }
        Order order2 = baseResponse.data;
        if (order2 == null || order2.orderId == null) {
            c7pVar.y0(q5p.b.MISSING_ORDER_ID);
            c7pVar.v0(-1, null);
            return;
        }
        c7pVar.w0(i);
        c7pVar.d0.g();
        j7p j7pVar = c7pVar.e0;
        wwd0 wwd0Var = j7pVar.d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ayk.j));
        wwd0 wwd0Var2 = j7pVar.e;
        do {
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, nvk.c));
        Order order3 = baseResponse.data;
        q5p q5pVar = c7pVar.e0.c;
        q5pVar.getClass();
        q5pVar.b(o7p.g.a);
        Intent intent = new Intent(c7pVar.getActivity(), (Class<?>) JackpotSuccessfulPageActivity.class);
        Bundle bundle = new Bundle();
        order3.combinations = c7pVar.C.getText().toString();
        bundle.putParcelable("jackpot_order", order3);
        intent.putExtras(bundle);
        c7pVar.startActivity(intent);
        c7pVar.r0();
    }
}
