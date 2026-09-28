package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class mmj0 extends x200 {
    public final l8k q;
    public final ga00 r;

    public static final class a {
        public final jak a;
        public final psm b;
        public final va00 c;
        public final uqm d;
        public final l8k e;
        public final gip f;

        public a(jak jakVar, psm psmVar, va00 va00Var, uqm uqmVar, l8k l8kVar, gip gipVar) {
            v4c v4cVar = v4c.a;
            psmVar.getClass();
            uqmVar.getClass();
            this.a = jakVar;
            this.b = psmVar;
            this.c = va00Var;
            this.d = uqmVar;
            this.e = l8kVar;
            this.f = gipVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmj0(qxd0 qxd0Var, et7 et7Var, h400 h400Var, c100 c100Var, jak jakVar, psm psmVar, va00 va00Var, uqm uqmVar, gip gipVar, l8k l8kVar) {
        super(qxd0Var, et7Var, jakVar, psmVar, va00Var, h400Var, c100Var, uqmVar, gipVar);
        v4c v4cVar = v4c.a;
        psmVar.getClass();
        uqmVar.getClass();
        this.q = l8kVar;
        this.r = ga00.WITHDRAW;
    }

    @Override // defpackage.x200
    public final gtp.a e(int i) {
        if (i == 0) {
            return new gtp.a.b(new ResourceUiText(R.string.page_payment__you_will_need_kyc_verification_for_this_withdraw_to_credit));
        }
        qxd0<gtp> qxd0Var = this.a;
        if (qxd0Var != null) {
            qxd0Var.a((gtp) new skk(1).invoke(qxd0Var.a.invoke()));
        }
        return new gtp.a.C0608a(i, new ResourceUiText(R.string.page_payment__you_will_need_tier_vnum_verification_to_make_withdrawals_please_click_here_to_confirm_your_account_details, kotlin.collections.a.c(String.valueOf(i))));
    }

    @Override // defpackage.x200
    public final ga00 f() {
        return this.r;
    }

    @Override // defpackage.x200
    public final void i() {
        c().d = this.q.a(this.l, this.m, (String) this.p.getValue(), (String) this.o.getValue(), this.r);
    }

    @Override // defpackage.x200
    public final g0l k(String str) {
        str.getClass();
        return c().f(str);
    }
}
