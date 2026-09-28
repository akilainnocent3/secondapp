package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.cashoutphase3.AutoCashoutSettingView;
import com.sportybet.android.cashoutphase3.CashoutFloatView;
import com.sportybet.android.cashoutphase3.InstantCashoutView;
import com.sportybet.android.cashoutphase3.h;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import com.sportybet.plugin.realsports.data.CashOut;
import java.math.BigDecimal;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ek6 implements zzy {
    public final /* synthetic */ com.sportybet.android.cashoutphase3.b a;

    @c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$initAdapter$openBetListener$1$shareBet$1", f = "CashOutFragment.kt", l = {599}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.sportybet.android.cashoutphase3.b b;
        public final /* synthetic */ ez80 c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.sportybet.android.cashoutphase3.b bVar, ez80 ez80Var, String str, String str2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = bVar;
            this.c = ez80Var;
            this.d = str;
            this.e = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                Boolean bool = Boolean.TRUE;
                zha0 zha0Var = new zha0(bool, Boolean.FALSE, bool, this.d, this.e);
                this.a = 1;
                if (this.b.M0(this.c, zha0Var, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$initAdapter$openBetListener$1$shareBet$2", f = "CashOutFragment.kt", l = {616}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.sportybet.android.cashoutphase3.b b;
        public final /* synthetic */ ez80 c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.sportybet.android.cashoutphase3.b bVar, ez80 ez80Var, String str, String str2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = bVar;
            this.c = ez80Var;
            this.d = str;
            this.e = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                Boolean bool = Boolean.TRUE;
                Boolean bool2 = Boolean.FALSE;
                zha0 zha0Var = new zha0(bool, bool2, bool2, this.d, this.e);
                this.a = 1;
                if (this.b.M0(this.c, zha0Var, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public ek6(com.sportybet.android.cashoutphase3.b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.zzy
    public final void a(String str) {
        com.sportybet.android.cashoutphase3.b bVar = this.a;
        bnh0 bnh0Var = bVar.H;
        if (bnh0Var == null) {
            Intrinsics.n("urlCreator");
            throw null;
        }
        String strB = bnh0Var.b("matches", "matchDetail", str);
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(strB));
            bVar.startActivity(intent);
            f00 f00Var = vgb0.a;
            vgb0.a("play_in_dot_com__launch_success");
        } catch (Exception unused) {
            Toast.makeText(bVar.requireContext(), R.string.live__launch_sporty_dot_com_failed, 0).show();
            f00 f00Var2 = vgb0.a;
            vgb0.a("play_in_dot_com__launch_failed");
        }
    }

    @Override // defpackage.zzy
    public final void b() {
        FragmentManager supportFragmentManager = this.a.requireActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        if (supportFragmentManager.H("LiveEventTutorialDialog") != null) {
            return;
        }
        Bundle bundle = new Bundle();
        lls llsVar = new lls();
        llsVar.setArguments(bundle);
        llsVar.show(supportFragmentManager, "LiveEventTutorialDialog");
    }

    @Override // defpackage.zzy
    public final void c(String str) {
        com.sportybet.android.cashoutphase3.b bVar = this.a;
        n0z n0zVar = (n0z) bVar.V.getValue();
        ej5.c(o8i0.d(n0zVar), null, null, new m0z(n0zVar, str, null), 3);
        gym.a(bVar.E0(), eyy.a);
    }

    @Override // defpackage.zzy
    public final void d(View view, boolean z) {
        this.a.z0().c(view, z ? AnalyticsEvent.OPEN_BETS_FALLBACK_CASHOUT_BTN : AnalyticsEvent.OPEN_BETS_CASHOUT_BTN);
    }

    @Override // defpackage.zzy
    public final void e(AppCompatImageView appCompatImageView, ils ilsVar) {
        String str;
        int iOrdinal = ilsVar.ordinal();
        if (iOrdinal == 1) {
            str = AnalyticsEvent.CASHOUT_LIVE_EVENT_STV_ICON;
        } else if (iOrdinal != 2) {
            str = iOrdinal != 3 ? null : AnalyticsEvent.CASHOUT_LIVE_EVENT_LMT_ICON;
        } else {
            str = AnalyticsEvent.CASHOUT_LIVE_EVENT_STATS_ICON;
        }
        if (str != null) {
            this.a.z0().c(appCompatImageView, str);
        }
    }

    @Override // defpackage.zzy
    public final void f() {
        ku90<com.sporty.android.common.uievent.a> ku90Var = this.a.s0().d0;
        StringUiText stringUiText = vch0.a;
        com.sporty.android.common.uievent.b.e(ku90Var, new ResourceUiText(R.string.cashout__fallback_cashout_popup_title), null, new ResourceUiText(R.string.cashout__fallback_cashout_confirm_popup_hint), new ResourceUiText(R.string.common_functions__ok), null, null, null, 498);
    }

    @Override // defpackage.zzy
    public final void g(View view) {
        int i;
        int i2;
        View contentView;
        Object tag = view.getTag();
        View viewFindViewById = null;
        if (!(tag instanceof BetSelection)) {
            tag = null;
        }
        BetSelection betSelection = (BetSelection) tag;
        if (betSelection != null) {
            xec xecVar = (xec) this.a.t0.getValue();
            xecVar.getClass();
            int i3 = betSelection.status;
            if (i3 > 0) {
                if (i3 == 1) {
                    int i4 = betSelection.settleType;
                    if (i4 == 1) {
                        i = R.string.bet_history__flash_win;
                    } else if (i4 == 2) {
                        i = R.string.bet_history__flash_save;
                    } else if (i4 == 3) {
                        i = R.string.bet_history__2up_early_payout;
                    } else if (i4 == 5) {
                        i = R.string.bet_history__1up_early_payout;
                    } else if (i4 != 6) {
                        i = i4 != 7 ? R.string.bet_history__won : R.string.bet_history__dc_1up_early_payout;
                    } else {
                        i = R.string.bet_history__early_goal;
                    }
                } else if (i3 == 2) {
                    i = R.string.bet_history__lost;
                } else if (i3 != 3) {
                    i = i3 != 4 ? -1 : R.string.cashout__refundall;
                } else {
                    i = R.string.bet_history__void;
                }
            } else if (b3.T(betSelection.eventId) || (i2 = betSelection.eventStatus) == 0 || i2 == 6) {
                i = kgb0.a.contains(betSelection.tournamentId) ? R.string.bet_history__not_started_delayed_settlement : R.string.common_functions__not_start;
            } else {
                i = kgb0.a.contains(betSelection.tournamentId) ? R.string.bet_history__ongoing_delayed_settlement : R.string.bet_history__ongoing;
            }
            PopupWindow popupWindow = xecVar.i;
            if (popupWindow != null && (contentView = popupWindow.getContentView()) != null) {
                viewFindViewById = contentView.findViewById(R.id.status_text);
            }
            viewFindViewById.getClass();
            ((AppCompatTextView) viewFindViewById).setText(i);
            PopupWindow popupWindow2 = xecVar.i;
            if (popupWindow2 != null) {
                popupWindow2.showAsDropDown(view);
            }
        }
    }

    @Override // defpackage.zzy
    public final void h(final onf onfVar) {
        final com.sportybet.android.cashoutphase3.b bVar = this.a;
        if (!bVar.q0().o0() || !bVar.q0().W()) {
            Context contextRequireContext = bVar.requireContext();
            contextRequireContext.getClass();
            uq7.a(contextRequireContext, new uq7.b() { // from class: dk6
                @Override // uq7.b
                public final void a() {
                    h hVarS0 = bVar.s0();
                    String str = onfVar.a;
                    str.getClass();
                    emf emfVar = hVarS0.b;
                    emfVar.getClass();
                    kzh.d(new g1i(bm50.a(new or60(new bmf(emfVar, str, null))), new bo6(hVarS0, str, null)), o8i0.d(hVarS0));
                }
            });
            return;
        }
        h hVarS0 = bVar.s0();
        String str = onfVar.a;
        str.getClass();
        emf emfVar = hVarS0.b;
        emfVar.getClass();
        kzh.d(new g1i(bm50.a(new or60(new bmf(emfVar, str, null))), new bo6(hVarS0, str, null)), o8i0.d(hVarS0));
        gym.a(bVar.E0(), new myy(onfVar.b));
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_EDIT_BET);
        aVar.a("cash navigate to Home and open BetSlip", new Object[0]);
    }

    @Override // defpackage.zzy
    public final void i(zyy zyyVar) {
        com.sportybet.android.cashoutphase3.b bVar = this.a;
        bVar.D0().p();
        bVar.s0().B1(zyyVar);
    }

    @Override // defpackage.zzy
    public final void j(String str) {
        this.a.s0().D1(str);
    }

    @Override // defpackage.zzy
    public final void k(ez80 ez80Var, boolean z) {
        String str;
        String str2 = ez80Var.a;
        com.sportybet.android.cashoutphase3.b bVar = this.a;
        if (str2 == null || str2.length() == 0 || (str = ez80Var.b) == null || str.length() == 0) {
            ku90<com.sporty.android.common.uievent.a> ku90Var = bVar.s0().d0;
            StringUiText stringUiText = vch0.a;
            com.sporty.android.common.uievent.b.j(ku90Var, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later));
            return;
        }
        String lastNickName = bVar.getAccountHelper().getLastNickName();
        String avatarUrl = bVar.getAccountHelper().getAvatarUrl();
        if (!bVar.getAccountHelper().hasPersonalPage()) {
            ej5.c(ebs.a(bVar.getLifecycle()), null, null, new b(bVar, ez80Var, lastNickName, avatarUrl, null), 3);
        } else {
            if (z) {
                ej5.c(ebs.a(bVar.getLifecycle()), null, null, new a(bVar, ez80Var, lastNickName, avatarUrl, null), 3);
                return;
            }
            bVar.i0 = ez80Var;
            ((eja0) bVar.X.getValue()).x1(str2);
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.zzy
    public final String l() {
        svj svjVar = this.a.Q;
        if (svjVar != null) {
            return svjVar.b(false);
        }
        Intrinsics.n("gamesLobbyManager");
        throw null;
    }

    @Override // defpackage.zzy
    public final boolean m() {
        com.sportybet.android.cashoutphase3.b bVar = this.a;
        return bVar.getAccountHelper().isLogin() && bVar.s0().A.d().s;
    }

    @Override // defpackage.zzy
    public final void n(ils ilsVar, boolean z) {
        this.a.z0().f(AnalyticsEvent.CASHOUT_TOGGLE_OPENBET_WIDGET, kpu.f(new Pair("Type", ilsVar.a), new Pair("Display", z ? "On" : "Off")));
    }

    @Override // defpackage.zzy
    public final void o(String str) {
        com.sportybet.android.cashoutphase3.b bVar = this.a;
        u350 u350Var = bVar.U;
        if (u350Var == null) {
            Intrinsics.n("remixBetAnTestManager");
            throw null;
        }
        u350Var.c();
        if (str.length() == 0) {
            ku90<com.sporty.android.common.uievent.a> ku90Var = bVar.s0().d0;
            StringUiText stringUiText = vch0.a;
            com.sporty.android.common.uievent.b.j(ku90Var, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later));
        } else {
            bVar.H0(str, g08.REBET_FROM_OPEN_BETS);
            gym.a(bVar.E0(), qyy.a);
            gym.a(bVar.E0(), pyy.a);
        }
    }

    @Override // defpackage.zzy
    public final void p(String str, String str2) {
        str.getClass();
        h hVarS0 = this.a.s0();
        ej5.c(o8i0.d(hVarS0), null, null, new so6(hVarS0, str, str2, null), 3);
    }

    @Override // defpackage.zzy
    public final void q(String str) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_EDIT_BET);
        aVar.a("viewBetHistory orderId: ".concat(str), new Object[0]);
        smf smfVar = new smf();
        Bundle bundle = new Bundle();
        bundle.putString("key_order_id", str);
        smfVar.setArguments(bundle);
        smfVar.show(this.a.getChildFragmentManager(), smf.class.getName());
    }

    @Override // defpackage.zzy
    public final void r(int i, String str) {
        str.getClass();
        h hVarS0 = this.a.s0();
        hdk hdkVar = hVarS0.e;
        hdkVar.getClass();
        kzh.d(new g1i(new edk(new sl50(bm50.a(hdkVar.a.j(str))), str, hdkVar), new do6(hVarS0, i, null)), o8i0.d(hVarS0));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001f  */
    public final void s(Bet bet) {
        String betId;
        InstantCashoutView instantCashoutView;
        if (bet != null) {
            com.sportybet.android.cashoutphase3.b bVar = this.a;
            CashoutFloatView cashoutFloatViewU0 = bVar.u0();
            if (cashoutFloatViewU0 == null) {
                betId = "";
            } else {
                if (!cashoutFloatViewU0.isShown()) {
                    cashoutFloatViewU0 = null;
                }
                if (cashoutFloatViewU0 == null || (instantCashoutView = cashoutFloatViewU0.b) == null || (betId = instantCashoutView.getBetId()) == null) {
                    betId = "";
                }
            }
            bVar.s0().z1(bet, betId);
        }
    }

    public final boolean t() {
        CashoutFloatView cashoutFloatViewU0 = this.a.u0();
        if (cashoutFloatViewU0 != null) {
            return cashoutFloatViewU0.isShown();
        }
        return false;
    }

    public final void u(boolean z) {
        h330 h330Var = this.a.v0;
        if (z) {
            if (h330Var != null) {
                h330Var.b();
                return;
            } else {
                Intrinsics.n("progressDialogManager");
                throw null;
            }
        }
        if (h330Var != null) {
            h330Var.a();
        } else {
            Intrinsics.n("progressDialogManager");
            throw null;
        }
    }

    public final void v(pl6 pl6Var) {
        CashoutFloatView cashoutFloatViewU0 = this.a.u0();
        if (cashoutFloatViewU0 == null || cashoutFloatViewU0.e) {
            return;
        }
        InstantCashoutView instantCashoutView = cashoutFloatViewU0.b;
        instantCashoutView.getClass();
        Bet bet = instantCashoutView.w;
        if (bet == null) {
            Intrinsics.n("betItem");
            throw null;
        }
        if (TextUtils.equals(bet.id, pl6Var.a.id)) {
            Bet bet2 = instantCashoutView.w;
            if (bet2 == null) {
                Intrinsics.n("betItem");
                throw null;
            }
            bet2.cashOut.update(pl6Var.a.cashOut);
            Bet bet3 = instantCashoutView.w;
            if (bet3 == null) {
                Intrinsics.n("betItem");
                throw null;
            }
            Bet bet4 = pl6Var.a;
            bet3.isFallbackCashOut = bet4.isFallbackCashOut;
            bet3.isCashable = bet4.isCashable;
            bet3.maxCashOutAmount = bet4.maxCashOutAmount;
            bet3.isCashoutAmountNotAcquired = bet4.isCashoutAmountNotAcquired;
            bet3.shouldShowRefreshButton = bet4.shouldShowRefreshButton;
            bet3.isCalcByFE = bet4.isCalcByFE;
            bet3.isCashAbleJS = bet4.isCashAbleJS;
            instantCashoutView.d();
        }
        AutoCashoutSettingView autoCashoutSettingView = cashoutFloatViewU0.c;
        pl6 pl6Var2 = autoCashoutSettingView.d;
        if (pl6Var2 == null || !TextUtils.equals(pl6Var2.a.id, pl6Var.a.id)) {
            return;
        }
        Bet bet5 = autoCashoutSettingView.d.a;
        CashOut cashOut = bet5.cashOut;
        Bet bet6 = pl6Var.a;
        CashOut cashOut2 = bet6.cashOut;
        cashOut.coefficient = cashOut2.coefficient;
        cashOut.isSupportPartial = cashOut2.isSupportPartial;
        cashOut.maxCashOutAmount = cashOut2.maxCashOutAmount;
        cashOut.availableStake = cashOut2.availableStake;
        cashOut.errorMsg = cashOut2.errorMsg;
        bet5.isCashable = bet6.isCashable;
        bet5.isCashoutAmountNotAcquired = bet6.isCashoutAmountNotAcquired;
        try {
            autoCashoutSettingView.J = new BigDecimal(pl6Var.a.cashOut.maxCashOutAmount);
        } catch (Exception unused) {
        }
        autoCashoutSettingView.f();
    }
}
