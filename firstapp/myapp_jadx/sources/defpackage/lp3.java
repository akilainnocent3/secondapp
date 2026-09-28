package defpackage;

import android.content.Context;
import androidx.fragment.app.e;
import androidx.window.layout.oKr.TEFcJcMqR;
import com.sportybet.android.instantwin.presentation.widget.NextButtonLayout;
import com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class lp3 implements NextButtonLayout.a {
    public final /* synthetic */ jp3 a;
    public final /* synthetic */ r4p b;

    public lp3(jp3 jp3Var, r4p r4pVar) {
        this.a = jp3Var;
        this.b = r4pVar;
    }

    @Override // com.sportybet.android.instantwin.presentation.widget.NextButtonLayout.a
    public final void a() {
        eeo eeoVar;
        InstantWinFooterLayout instantWinFooterLayout = this.b.e;
        jp3 jp3Var = this.a;
        try {
            if (jp3Var.getAccountHelper().isLogin()) {
                uy0 uy0Var = jp3Var.L;
                if (uy0Var == null) {
                    Intrinsics.n("assetsInfoRepository");
                    throw null;
                }
                if (uy0Var.c() != null && !jp3Var.w0()) {
                    i5s i5sVar = jp3Var.Q;
                    if (i5sVar == null) {
                        Intrinsics.n("legacyInstantWinUtil");
                        throw null;
                    }
                    e eVarRequireActivity = jp3Var.requireActivity();
                    eVarRequireActivity.getClass();
                    i5sVar.d(eVarRequireActivity);
                    return;
                }
                if (instantWinFooterLayout.c.A.isChecked()) {
                    BigDecimal currentFlexOdds = instantWinFooterLayout.getCurrentFlexOdds();
                    Double d = ((n4p) jp3Var.s0()).E;
                    d.getClass();
                    if (currentFlexOdds.compareTo(new BigDecimal(d.doubleValue())) < 0) {
                        Context contextRequireContext = jp3Var.requireContext();
                        contextRequireContext.getClass();
                        jp3Var.K0(contextRequireContext);
                        return;
                    }
                }
                if (jp3Var.z != null && !jp3Var.a0 && ((eeoVar = jp3Var.b0) == null || !eeoVar.isVisible())) {
                    ((n4p) jp3Var.s0()).f = jp3Var.z;
                    jp3Var.L0(true);
                }
            } else {
                if (jp3Var.Q == null) {
                    Intrinsics.n("legacyInstantWinUtil");
                    throw null;
                }
                uqm accountHelper = jp3Var.getAccountHelper();
                e eVarRequireActivity2 = jp3Var.requireActivity();
                eVarRequireActivity2.getClass();
                i5s.c(accountHelper, eVarRequireActivity2, new a(jp3Var), false);
            }
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(TEFcJcMqR.JNcIXIOYb);
            aVar.f(e, "Fail to place a bet", new Object[0]);
        }
        jp3.a aVar2 = jp3.c0;
        jp3Var.F0("bet_and_kick_off");
        rdd0 rdd0Var = jp3Var.M;
        if (rdd0Var != null) {
            rdd0Var.a(new a5o.f0(((n4p) jp3Var.s0()).c()), k00.d);
        } else {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a implements yfo {
        public final /* synthetic */ jp3 a;

        public a(jp3 jp3Var) {
            this.a = jp3Var;
        }

        @Override // defpackage.yfo
        public final void b(boolean z) {
            jp3.a aVar = jp3.c0;
            jp3 jp3Var = this.a;
            jp3Var.L0(false);
            ((n4p) jp3Var.s0()).d();
            u0v u0vVar = jp3Var.S;
            if (u0vVar == null) {
                Intrinsics.n("matchEventDetailDataSource");
                throw null;
            }
            u0vVar.a();
            jp3Var.z0();
        }

        @Override // defpackage.yfo
        public final void a() {
        }
    }
}
