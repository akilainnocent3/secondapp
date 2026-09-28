package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.EditTextWithKeyBoard;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.data.BetSlipInfo;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class so3 {
    public final BetSlipFooter a;

    public so3(BetSlipFooter betSlipFooter, BetslipActivity betslipActivity, nas nasVar, LinkedHashMap linkedHashMap) {
        this.a = betSlipFooter;
        betSlipFooter.setListener(betslipActivity);
        betSlipFooter.setActivityLifecycleScope(nasVar);
        betSlipFooter.setTextUpdateJobs(linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    public final boolean a(int i, imn imnVar) {
        imnVar.getClass();
        BetSlipFooter betSlipFooter = this.a;
        boolean zD = betSlipFooter.d(i, imnVar);
        boolean z = false;
        if (i == 1) {
            it90 singleBetUseCases = betSlipFooter.getSingleBetUseCases();
            if (singleBetUseCases.c().compareTo(singleBetUseCases.f.a()) > 0) {
                z = true;
            }
        } else if (i == 2) {
            if (!iu2.p() || TextUtils.isEmpty(imnVar.a) || new BigDecimal(imnVar.a).compareTo(betSlipFooter.getGetMaxStakeUseCase().a()) <= 0) {
                pmw multipleBetUseCases = betSlipFooter.getMultipleBetUseCases();
                if (multipleBetUseCases.b().compareTo(multipleBetUseCases.g.a()) > 0) {
                    z = true;
                }
            } else {
                z = true;
            }
        }
        betSlipFooter.setWarningAndInputUIStatus(i, imnVar.b, z);
        return zD;
    }

    public final void b(boolean z) {
        this.a.setGiftsVisible(z);
    }

    public final void c(boolean z) {
        this.a.setSimGiftsVisible(z);
    }

    public final void d(luo luoVar, luo luoVar2, luo luoVar3, luo luoVar4, boolean z, boolean z2) {
        this.a.setSportyInsure(luoVar, luoVar2, luoVar3, luoVar4, z, z2);
    }

    public final void e(boolean z) {
        BetSlipFooter betSlipFooter = this.a;
        mgd0 mgd0Var = betSlipFooter.G;
        to3 to3Var = betSlipFooter.H;
        Integer numValueOf = to3Var != null ? Integer.valueOf(to3Var.x()) : null;
        boolean z2 = false;
        if (z) {
            betSlipFooter.setGiftsVisible(false);
        }
        EditTextWithKeyBoard editTextWithKeyBoard = mgd0Var.M0;
        editTextWithKeyBoard.L = z && numValueOf != null && numValueOf.intValue() == 1;
        editTextWithKeyBoard.c();
        EditTextWithKeyBoard editTextWithKeyBoard2 = mgd0Var.j0;
        if (z && numValueOf != null && numValueOf.intValue() == 2) {
            z2 = true;
        }
        editTextWithKeyBoard2.L = z2;
        editTextWithKeyBoard2.c();
    }

    public final void f(int i, vwv vwvVar) {
        mgd0 mgd0Var = this.a.G;
        boolean z = vwvVar instanceof vwv.c;
        ComposeView composeView = null;
        vwv.c cVar = z ? (vwv.c) vwvVar : null;
        ftv.a aVar = cVar != null ? cVar.b : null;
        if (i == 1) {
            composeView = mgd0Var.B0;
        } else if (i == 2) {
            composeView = mgd0Var.w;
        } else if (i == 3) {
            composeView = mgd0Var.P0;
        }
        for (ComposeView composeView2 : b.k(mgd0Var.B0, mgd0Var.w, mgd0Var.P0)) {
            boolean z2 = Intrinsics.g(composeView2, composeView) && z && aVar != null;
            composeView2.getClass();
            hxv.c(composeView2, z2, aVar, new xwv());
            if (z2) {
                mgd0Var.z.setVisibility(8);
            }
        }
    }

    public final void g(BetSlipInfo betSlipInfo, Long l) {
        Object bVar;
        long jLongValue = l.longValue();
        BetSlipFooter betSlipFooter = this.a;
        mgd0 mgd0Var = betSlipFooter.G;
        TextView textView = mgd0Var.p0;
        String netWin = betSlipInfo.getNetWin();
        netWin.getClass();
        c8i0.m(textView, netWin, betSlipFooter.I, betSlipFooter.J);
        TextView textView2 = mgd0Var.a1;
        String whTax = betSlipInfo.getWhTax();
        whTax.getClass();
        c8i0.m(textView2, whTax, betSlipFooter.I, betSlipFooter.J);
        String whTax2 = betSlipInfo.getWhTax();
        String netWin2 = betSlipInfo.getNetWin();
        Context context = betSlipFooter.getContext();
        context.getClass();
        betSlipFooter.A(hu2.f(whTax2, netWin2, sn5.b(context, R.string.app_common__tilde, new Object[0])));
        if (jLongValue > 1) {
            String str = g93.a().d0().a;
            betSlipFooter.u(str != null ? bjb0.L(new BigDecimal(str).multiply(new BigDecimal((int) jLongValue)), Locale.US) : null, true);
        } else {
            betSlipFooter.u("", false);
        }
        Boolean hasTax = betSlipInfo.getHasTax();
        hasTax.getClass();
        betSlipFooter.x(betSlipInfo.getBetType(), hasTax.booleanValue());
        if (betSlipInfo.getBetType() == 2) {
            if (!betSlipFooter.V) {
                TextView textView3 = mgd0Var.m0;
                String totalOdds = betSlipInfo.getTotalOdds();
                totalOdds.getClass();
                c8i0.m(textView3, totalOdds, betSlipFooter.I, betSlipFooter.J);
            }
            betSlipFooter.c(betSlipInfo.getMinScaled());
            if (iu2.p()) {
                String str2 = g93.a().d0().a;
                str2.getClass();
                betSlipFooter.T.onNext(str2);
            }
            try {
                zi50.a aVar = zi50.b;
                zd2<onw> zd2Var = betSlipFooter.P;
                BigDecimal minScaled = betSlipInfo.getMinScaled();
                minScaled.getClass();
                BigDecimal maxScaled = betSlipInfo.getMaxScaled();
                maxScaled.getClass();
                BigDecimal maxPW = betSlipInfo.getMaxPW();
                maxPW.getClass();
                BigDecimal stake = betSlipInfo.getStake();
                stake.getClass();
                zd2Var.onNext(new onw(minScaled, maxScaled, maxPW, stake, jLongValue, betSlipInfo.isCanBetOneCut()));
                bVar = Unit.a;
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            Throwable thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a aVar3 = itf0.a;
                aVar3.a(e40.a(aVar3, MyLog.TAG_COMMON, "[updateTotalOddAndWHTaxAndNetWin] : ", thA), new Object[0]);
            }
        }
    }
}
