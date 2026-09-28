package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.newcms.CMSRes;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public class thj extends jp5 implements gl7, vd90, zi40, aje {
    public final CMSRes A;
    public final CMSRes B;
    public final CMSRes C;
    public final CMSRes D;
    public final CMSRes E;
    public final CMSRes F;
    public final CMSRes G;
    public final CMSRes H;
    public final CMSRes I;
    public final CMSRes J;
    public final CMSRes K;
    public final CMSRes L;
    public final CMSRes M;
    public final CMSRes N;
    public final CMSRes O;
    public final CMSRes P;
    public final CMSRes Q;
    public final CMSRes R;
    public final CMSRes S;
    public final CMSRes T;
    public final CMSRes U;
    public final CMSRes V;
    public final CMSRes W;
    public final CMSRes X;
    public final CMSRes Y;
    public final CMSRes Z;
    public final CMSRes a0;
    public final /* synthetic */ ibd b;
    public final CMSRes b0;
    public final /* synthetic */ vfd c;
    public final CMSRes c0;
    public final /* synthetic */ dfd d;
    public final CMSRes d0;
    public final /* synthetic */ tbd e;
    public final CMSRes e0;
    public final int f;
    public final CMSRes f0;
    public final CMSRes g;
    public final CMSRes g0;
    public final CMSRes h;
    public final CMSRes h0;
    public final CMSRes i;
    public final CMSRes i0;
    public final CMSRes j;
    public final CMSRes j0;
    public final CMSRes k;
    public final CMSRes k0;
    public final CMSRes l;
    public final CMSRes l0;
    public final CMSRes m;
    public final CMSRes m0;
    public final CMSRes n;
    public final CMSRes n0;
    public final CMSRes o;
    public final CMSRes o0;
    public final CMSRes p;
    public final CMSRes p0;
    public final CMSRes q;
    public final CMSRes q0;
    public final CMSRes r;
    public final CMSRes r0;
    public final CMSRes s;
    public final CMSRes s0;
    public final CMSRes t;
    public final CMSRes t0;
    public final CMSRes u;
    public final CMSRes u0;
    public final CMSRes v;
    public final CMSRes w;
    public final CMSRes x;
    public final CMSRes y;
    public final CMSRes z;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thj(on5 on5Var) {
        super(on5Var);
        on5Var.getClass();
        boolean z = on5Var instanceof com.sportygames.newcms.a;
        this.b = z ? hl7.h : new ibd(on5Var);
        this.c = z ? wd90.k : new vfd(on5Var);
        this.d = z ? efd.i : new dfd(on5Var);
        this.e = z ? ubd.o : new tbd(on5Var);
        this.f = a.class.hashCode();
        this.g = on5.h(this, this, "sg_night_n_day", AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, null, null, 12);
        this.h = on5.h(this, this, "sg_night_n_day", "sorry_you_chose_day", null, null, 12);
        this.i = on5.h(this, this, "sg_night_n_day", "sorry_you_chose_night", null, null, 12);
        this.j = on5.h(this, this, "sg_night_n_day", "you_win", null, null, 12);
        this.k = on5.h(this, this, "sg_night_n_day", "day", null, null, 12);
        this.l = on5.h(this, this, "sg_night_n_day", "night", null, null, 12);
        this.m = on5.h(this, this, "sg_night_n_day", "dwan", null, null, 12);
        this.n = on5.h(this, this, "sg_night_n_day", "losing_condition", null, null, 12);
        this.o = on5.h(this, this, "sg_night_n_day", "how_to_play_html", null, null, 12);
        this.p = on5.h(this, this, "sg_common", "pay2x_text", null, null, 12);
        this.q = on5.h(this, this, "sg_common", "pay2x", null, null, 12);
        this.r = on5.h(this, this, "sg_common_dialog_message", "rebet_btn", null, null, 12);
        this.s = on5.h(this, this, "sg_common_dialog_message", "new_round_btn", null, null, 12);
        this.t = on5.h(this, this, "sg_bethistory", "time", null, null, 12);
        this.u = on5.h(this, this, "sg_bethistory", "stake", null, null, 12);
        this.v = on5.h(this, this, "sg_bethistory", AnalyticsParam.EVENT_STATUS, null, null, 12);
        this.w = on5.h(this, this, "sg_bethistory", AnalyticsParam.EVENT_PARAM_RESULT, null, null, 12);
        this.x = on5.h(this, this, "sg_bethistory", "details", null, null, 12);
        this.y = on5.h(this, this, "sg_bethistory", "total_stake", null, null, 12);
        this.z = on5.h(this, this, "sg_bethistory", "total_win", null, null, 12);
        this.A = on5.h(this, this, "sg_bethistory", "fbg_title", null, null, 12);
        this.B = on5.h(this, this, "sg_bethistory", "you_paid", null, null, 12);
        this.C = on5.h(this, this, "sg_bethistory", "you_won", null, null, 12);
        this.D = on5.h(this, this, "sg_bethistory", "your_pick", null, null, 12);
        this.E = on5.h(this, this, "sg_bethistory", "more", null, null, 12);
        this.F = on5.h(this, this, "sg_bethistory", "lost", null, null, 12);
        nn5 nn5Var = nn5.Image;
        this.G = on5.h(this, this, "sg_night_n_day", "game_logo_png_3x", nn5Var, null, 8);
        this.H = on5.h(this, this, "sg_night_n_day", "pointer_png_3x", nn5Var, null, 8);
        this.I = on5.h(this, this, "sg_night_n_day", "pointer_center_png_3x", nn5Var, null, 8);
        this.J = on5.h(this, this, "sg_night_n_day", "gift_png", nn5Var, null, 8);
        this.K = on5.h(this, this, "sg_night_n_day", "side_menu_bg_png_3x", nn5Var, null, 8);
        this.L = on5.h(this, this, "sg_night_n_day", "how_to_play_bg_png_3x", nn5Var, null, 8);
        this.M = on5.h(this, this, "sg_night_n_day", "result_win_night_png_3x", nn5Var, null, 8);
        this.N = on5.h(this, this, "sg_night_n_day", "result_lose_night_png_3x", nn5Var, null, 8);
        this.O = on5.h(this, this, "sg_night_n_day", "result_lose_day_png_3x", nn5Var, null, 8);
        this.P = on5.h(this, this, "sg_night_n_day", "result_win_day_png_3x", nn5Var, null, 8);
        this.Q = on5.h(this, this, "sg_night_n_day", "result_lose_dawn_png_3x", nn5Var, null, 8);
        this.R = on5.h(this, this, "sg_night_n_day", "bet_history_bg_png_3x", nn5Var, null, 8);
        this.S = on5.h(this, this, "sg_night_n_day", "android_main_spine", nn5.SpineAnimation, null, 8);
        this.T = on5.h(this, this, "sg_night_n_day", "bg_mp3", nn5.LongMusic, null, 8);
        nn5 nn5Var2 = nn5.ShortSound;
        this.U = on5.h(this, this, "sg_night_n_day", "sfx_rebet_mp3", nn5Var2, null, 8);
        this.V = on5.h(this, this, "sg_night_n_day", "sfx_next_round_mp3", nn5Var2, null, 8);
        this.W = on5.h(this, this, "sg_night_n_day", "sfx_lose_night_mp3", nn5Var2, null, 8);
        this.X = on5.h(this, this, "sg_night_n_day", "sfx_lose_dawn_mp3", nn5Var2, null, 8);
        this.Y = on5.h(this, this, "sg_night_n_day", "sfx_spin_mp3", nn5Var2, null, 8);
        this.Z = on5.h(this, this, "sg_night_n_day", "sfx_click_chip_mp3", nn5Var2, null, 8);
        this.a0 = on5.h(this, this, "sg_night_n_day", "sfx_lose_day_mp3", nn5Var2, null, 8);
        this.b0 = on5.h(this, this, "sg_night_n_day", "sfx_win_night_mp3", nn5Var2, null, 8);
        this.c0 = on5.h(this, this, "sg_night_n_day", "sfx_draw_chip_bar_mp3", nn5Var2, null, 8);
        this.d0 = on5.h(this, this, "sg_night_n_day", "sfx_win_day_mp3", nn5Var2, null, 8);
        this.e0 = on5.h(this, this, "sg_night_n_day", "sfx_select_nigh_day", nn5Var2, null, 8);
        this.f0 = on5.h(this, this, "sg_common_dialog_message", "yes_btn", null, null, 12);
        this.g0 = on5.h(this, this, "sg_common_dialog_message", "no_btn", null, null, 12);
        this.h0 = on5.h(this, this, "sg_common_dialog_message", "otb_dialog_msg", null, null, 12);
        this.i0 = on5.h(this, this, "sg_night_n_day", "place_bet_confirm_message_day", null, null, 12);
        this.j0 = on5.h(this, this, "sg_night_n_day", "place_bet_confirm_message_night", null, null, 12);
        this.k0 = on5.h(this, this, "sg_common_dialog_message", "add_money_btn", null, null, 12);
        this.l0 = on5.h(this, this, "sg_common_dialog_message", "exit_btn", null, null, 12);
        this.m0 = on5.h(this, this, "sg_common_dialog_message", "err_something_wrong_try_later", null, null, 12);
        this.n0 = on5.h(this, this, "sg_common_dialog_message", "ok_btn", null, null, 12);
        this.o0 = on5.h(this, this, "sg_common_dialog_message", "cancel_btn", null, null, 12);
        this.p0 = on5.h(this, this, "sg_common_dialog_message", "confirm_btn", null, null, 12);
        this.q0 = on5.h(this, this, "sg_common_dialog_message", "unavailable_country", null, null, 12);
        this.r0 = on5.h(this, this, "sg_common_dialog_message", "err_gift_not_applicable", null, null, 12);
        this.s0 = on5.h(this, this, "sg_common_dialog_message", "msg_something_went_wrong", null, null, 12);
        this.t0 = on5.h(this, this, "sg_common_dialog_message", "app_payout_outdated", null, null, 12);
        this.u0 = on5.h(this, this, "sg_common_dialog_message", "low_balance_message", null, null, 12);
    }

    @Override // defpackage.zi40
    public final CMSRes a() {
        return this.d.e;
    }

    @Override // defpackage.gl7
    public final CMSRes b(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        return this.b.b(bigDecimal);
    }

    @Override // defpackage.zi40
    public final CMSRes c() {
        return this.d.c;
    }

    @Override // defpackage.gl7
    public final CMSRes e() {
        return this.b.f;
    }

    @Override // defpackage.aje
    public final CMSRes f() {
        return this.e.e;
    }

    @Override // defpackage.aje
    public final CMSRes g() {
        return this.e.c;
    }

    @Override // defpackage.gl7
    public final CMSRes i() {
        return this.b.d;
    }

    @Override // defpackage.vd90
    public final CMSRes j() {
        return this.c.j;
    }

    @Override // defpackage.gl7
    public final uf00 k() {
        return this.b.g;
    }

    @Override // defpackage.zi40
    public final CMSRes l() {
        return this.d.f;
    }

    @Override // defpackage.aje
    public final CMSRes m() {
        return this.e.g;
    }

    @Override // defpackage.aje
    public final CMSRes n() {
        return this.e.h;
    }

    @Override // defpackage.zi40
    public final CMSRes o() {
        return this.d.d;
    }

    @Override // defpackage.aje
    public final CMSRes p() {
        return this.e.d;
    }

    @Override // defpackage.gl7
    public final CMSRes q() {
        return this.b.c;
    }

    @Override // defpackage.gl7
    public final CMSRes s() {
        return this.b.e;
    }

    @Override // defpackage.jp5
    public final int t() {
        return this.f;
    }
}
