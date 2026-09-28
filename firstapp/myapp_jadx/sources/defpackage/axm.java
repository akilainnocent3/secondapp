package defpackage;

import android.view.View;
import com.sportybet.android.account.international.verify.INTVerifyFragment;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class axm implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ INTVerifyFragment b;
    public final /* synthetic */ ProgressButton c;

    public axm(cq40 cq40Var, INTVerifyFragment iNTVerifyFragment, ProgressButton progressButton) {
        this.a = cq40Var;
        this.b = iNTVerifyFragment;
        this.c = progressButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        INTVerifyFragment iNTVerifyFragment = this.b;
        wwd0 wwd0Var = iNTVerifyFragment.E;
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 350) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        if (((Boolean) wwd0Var.getValue()).booleanValue()) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
        this.c.setUppercasedButtonText(R.string.register_login_int__next);
        String strA0 = CollectionsKt.a0(iNTVerifyFragment.s0().v.getInputList(), "", null, null, zwm.a, 30);
        if (Intrinsics.g(iNTVerifyFragment.r0().c, "register")) {
            vxm vxmVarU0 = iNTVerifyFragment.u0();
            String token = iNTVerifyFragment.u0().x1().getToken();
            token.getClass();
            r5b r5bVarC = i2i.c(new yzh(new xzh(bm50.a(vxmVarU0.a.g(token, strA0)), new nxm(2, null)), new oxm(3, null)), o8i0.d(vxmVarU0).a, 2);
            ibs viewLifecycleOwner = iNTVerifyFragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            r5bVarC.f(viewLifecycleOwner, new wwm(new bxm(r5bVarC, viewLifecycleOwner, iNTVerifyFragment)));
            return;
        }
        vxm vxmVarU1 = iNTVerifyFragment.u0();
        String token2 = iNTVerifyFragment.u0().x1().getToken();
        token2.getClass();
        r5b r5bVarC2 = i2i.c(new yzh(new xzh(new sxm(vxmVarU1.a.c(token2, strA0)), new txm(2, null)), new uxm(3, null)), o8i0.d(vxmVarU1).a, 2);
        ibs viewLifecycleOwner2 = iNTVerifyFragment.getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        r5bVarC2.f(viewLifecycleOwner2, new wwm(new cxm(r5bVarC2, viewLifecycleOwner2, iNTVerifyFragment)));
    }
}
