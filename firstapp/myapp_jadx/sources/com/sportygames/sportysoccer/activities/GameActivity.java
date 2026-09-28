package com.sportygames.sportysoccer.activities;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.sportysoccer.activities.GameActivity;
import com.sportygames.sportysoccer.activities.GameModeActivity;
import com.sportygames.sportysoccer.model.GameSessionBaseline;
import com.sportygames.sportysoccer.model.StakeData;
import com.sportygames.sportysoccer.surfaceview.GameSurfaceView;
import com.sportygames.sportysoccer.widget.CashOutLayout;
import com.sportygames.sportysoccer.widget.CelebrationLayout;
import com.sportygames.sportysoccer.widget.StakeLayout;
import com.sportygames.sportysoccer.widget.StatusBarLayout;
import com.sportygames.sportysoccer.widget.TutorialBallsLayout;
import defpackage.anj;
import defpackage.b3;
import defpackage.bbd0;
import defpackage.bsh0;
import defpackage.bwf;
import defpackage.cny;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.fw;
import defpackage.gpa0;
import defpackage.gpc;
import defpackage.hb5;
import defpackage.hpa0;
import defpackage.i0;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.lmj;
import defpackage.mb5;
import defpackage.moj;
import defpackage.nmj;
import defpackage.ohj;
import defpackage.pby;
import defpackage.pmj;
import defpackage.qcy;
import defpackage.qke;
import defpackage.qmj;
import defpackage.r8i0;
import defpackage.rby;
import defpackage.s8i0;
import defpackage.v8i0;
import defpackage.wij;
import defpackage.wrc;
import defpackage.xmj;
import defpackage.y66;
import defpackage.ysd0;
import defpackage.zsd0;
import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public class GameActivity extends com.sportygames.sportysoccer.activities.a implements moj, GameSurfaceView.a {
    public static final /* synthetic */ int H = 0;
    public ohj A;
    public hpa0 B;
    public boolean C;
    public zsd0 D;
    public ImageView E;
    public GameActivity F;
    public boolean G = false;
    public GameSurfaceView e;
    public View f;
    public TutorialBallsLayout i;
    public StakeLayout v;
    public CashOutLayout w;
    public CelebrationLayout y;
    public lmj z;

    public class a extends cny {
        public a() {
            super(true);
        }

        @Override // defpackage.cny
        public final void b() {
            GameActivity gameActivity = GameActivity.this;
            if (gameActivity.z.b()) {
                return;
            }
            f(false);
            gameActivity.getOnBackPressedDispatcher().d();
            f(true);
        }
    }

    public class b {
        public boolean a;

        public b() {
        }
    }

    public class c {
        public boolean a;
        public boolean b;

        public c() {
        }
    }

    public class d {
        public boolean a;

        public d() {
        }
    }

    @Override // defpackage.moj
    public final void L(boolean z, boolean z2, boolean z3, int i, int i2, float f, int i3) {
        int[] iArr;
        GameSurfaceView gameSurfaceView = this.e;
        int iD = this.z.h.d(i);
        pby pbyVar = gameSurfaceView.e;
        SecureRandom secureRandom = pbyVar.m;
        pbyVar.k = z;
        pbyVar.p = pbyVar.g.d.clone();
        pbyVar.d();
        if (pbyVar.o != iD) {
            pbyVar.o = iD;
            if (iD != 201) {
                iArr = iD != 202 ? bsh0.b : bsh0.c;
            } else {
                iArr = bsh0.d;
            }
            Resources resources = pbyVar.e.getResources();
            BitmapFactory.Options optionsD = bsh0.d(resources, iArr[0]);
            bwf bwfVar = pbyVar.g.c;
            bwfVar.l = bsh0.j(resources, iArr, (int) bwfVar.i(), (int) pbyVar.g.c.d(), optionsD);
        }
        bwf bwfVarClone = pbyVar.g.c.clone();
        pbyVar.t = bwfVarClone;
        pbyVar.t.f((bwfVarClone.i() * 0.5f) + pbyVar.g.g.left + secureRandom.nextInt((int) (pbyVar.g.g.width() - pbyVar.t.i())), (pbyVar.t.d() * 0.5f) + pbyVar.g.g.top + secureRandom.nextInt((int) (pbyVar.g.g.height() - pbyVar.t.d())));
        pbyVar.t.e(0.0f);
        long jCurrentTimeMillis = System.currentTimeMillis();
        wrc wrcVar = new wrc(pbyVar.t, pbyVar.g.g);
        pbyVar.v = wrcVar;
        wrcVar.k = 0.0f;
        wrcVar.h = new fw(0.0f, 1.0f, jCurrentTimeMillis, jCurrentTimeMillis + 250);
        wrcVar.i = null;
        wrcVar.j = null;
        rby rbyVar = pbyVar.g;
        pbyVar.A = new gpc(rbyVar.e, rbyVar.h);
        pbyVar.C = null;
        pbyVar.D = null;
        pbyVar.j = true;
        pbyVar.q = null;
        pbyVar.w = null;
        pbyVar.f = "ready_to_kick";
        GameSurfaceView.a aVar = pbyVar.n.a.a;
        if (aVar != null) {
            GameActivity gameActivity = (GameActivity) aVar;
            lmj lmjVar = gameActivity.z;
            boolean z4 = gameActivity.G;
            lmjVar.d("game_ready");
            hpa0 hpa0Var = lmjVar.a;
            if (hpa0Var != null && !z4) {
                new Handler(Looper.getMainLooper()).postDelayed(new gpa0(hpa0Var), 100L);
            }
            if (lmjVar.k) {
                lmjVar.k = false;
                lmjVar.e("welcome_tutorial", null);
            }
        }
        GameSurfaceView gameSurfaceView2 = this.e;
        if (z2) {
            qcy qcyVar = gameSurfaceView2.d;
            StatusBarLayout statusBarLayout = qcyVar.e;
            TextView textView = statusBarLayout.a;
            if (i2 > 0) {
                textView.setText(statusBarLayout.getContext().getString(R.string.sg_app_common_winning_streak_info, String.valueOf(i + 1), String.valueOf(i2)));
            } else {
                textView.setText(String.valueOf(i));
            }
            if (f > 0.0f) {
                statusBarLayout.b(f);
            }
            if (i3 > -1) {
                statusBarLayout.a(i3);
            }
            qcyVar.c();
        } else {
            gameSurfaceView2.d.f = null;
        }
        TutorialBallsLayout tutorialBallsLayout = this.i;
        if (z3) {
            tutorialBallsLayout.a.setAlpha(i3 >= 1 ? 0.5f : 1.0f);
            tutorialBallsLayout.b.setAlpha(i3 >= 2 ? 0.5f : 1.0f);
            tutorialBallsLayout.c.setAlpha(i3 < 3 ? 1.0f : 0.5f);
            this.i.setVisibility(0);
        } else {
            tutorialBallsLayout.setVisibility(8);
        }
        this.E.setVisibility(0);
        this.v.setVisibility(8);
        ohj ohjVar = this.A;
        if (ohjVar != null) {
            ohjVar.cancel();
            this.A = null;
        }
        this.w.setVisibility(8);
        this.f.setVisibility(8);
    }

    @Override // defpackage.moj
    public final void L0(mb5 mb5Var) {
        hpa0 hpa0Var = this.B;
        if (hpa0Var != null) {
            hpa0Var.a(120, false, false);
        }
        final Dialog dialog = new Dialog(this.F);
        try {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: xgj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = GameActivity.H;
                    moj mojVar = this.a.z.c.get();
                    if (mojVar != null) {
                        mojVar.T0();
                    }
                    dialog.dismiss();
                }
            };
            GameActivity gameActivity = this.F;
            qke.a(gameActivity.getString(R.string.sg_common_functions_exit_game), null, mb5Var.h(gameActivity), mb5Var.f(gameActivity), onClickListener, null, false, dialog, R.drawable.sg_err_btn_bg, new View.OnClickListener() { // from class: dhj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = GameActivity.H;
                    dialog.dismiss();
                }
            }, 4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.moj
    public final void R0() {
        hpa0 hpa0Var = this.B;
        if (hpa0Var != null) {
            hpa0Var.b();
        }
        startActivity(new Intent(this, (Class<?>) LeaderBoardActivity.class));
    }

    @Override // defpackage.moj
    public final void d0(Bundle bundle) {
        CashOutLayout cashOutLayout = this.w;
        cashOutLayout.e = new d();
        cashOutLayout.setAmount(bundle.getInt("dialog_extra_current_shot_round"), bundle.getFloat("dialog_extra_next_win_amount"));
        this.w.setVisibility(0);
        ohj ohjVar = this.A;
        if (ohjVar != null) {
            ohjVar.cancel();
            this.A = null;
        }
        ohj ohjVar2 = new ohj(this);
        this.A = ohjVar2;
        ohjVar2.start();
    }

    @Override // defpackage.moj
    public final void e0(final String str, Bundle bundle) {
        hpa0 hpa0Var = this.B;
        if (hpa0Var != null) {
            hpa0Var.a(120, false, false);
        }
        switch (str) {
            case "real_money_mode_practice":
                final Dialog dialog = new Dialog(this.F);
                String string = getString(R.string.sg_sporty_soccer_practice_completed);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: khj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = GameActivity.H;
                        GameActivity gameActivity = this.a;
                        gameActivity.startActivity(new Intent("action_start_real_money_mode", null, gameActivity, GameModeActivity.class));
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("dialog_extra_exit_game", true);
                        gameActivity.z.c(str, bundle2);
                        dialog.dismiss();
                    }
                };
                View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: lhj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = GameActivity.H;
                        this.a.z.c(str, null);
                        dialog.dismiss();
                    }
                };
                GameActivity gameActivity = this.F;
                qke.a(gameActivity.getString(R.string.sg_common_functions_go), gameActivity.getString(R.string.sg_common_functions__later), string, gameActivity.getString(R.string.sg_sporty_soccer_real_money_msg), onClickListener, onClickListener2, true, dialog, R.drawable.sg_pos_dia_bg, onClickListener2, 0);
                break;
            case "illegal_session":
                final Dialog dialog2 = new Dialog(this.F);
                View.OnClickListener onClickListener3 = new View.OnClickListener() { // from class: fhj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = GameActivity.H;
                        this.a.z.c(str, null);
                        dialog2.dismiss();
                    }
                };
                GameActivity gameActivity2 = this.F;
                qke.a(gameActivity2.getString(R.string.sg_common_functions__ok), null, gameActivity2.getString(R.string.sg_common_feedback_login_error), gameActivity2.getString(R.string.sg_sporty_soccer_illegal_session_msg), onClickListener3, null, false, dialog2, R.drawable.sg_err_btn_bg, new View.OnClickListener() { // from class: ghj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = GameActivity.H;
                        this.a.z.c(str, null);
                        dialog2.dismiss();
                    }
                }, 0);
                break;
            case "cash_out_celebration":
                ohj ohjVar = this.A;
                if (ohjVar != null) {
                    ohjVar.cancel();
                    this.A = null;
                }
                this.w.setVisibility(8);
                this.f.setVisibility(0);
                this.E.setVisibility(8);
                CelebrationLayout celebrationLayout = this.y;
                celebrationLayout.e = new b();
                celebrationLayout.setData(bundle.getBoolean("dialog_extra_is_max_streak"), bundle.getFloat("dialog_extra_current_win_amount"), bundle.getString("dialog_extra_balance"));
                this.y.setVisibility(0);
                hpa0 hpa0Var2 = this.B;
                if (hpa0Var2 != null) {
                    hpa0Var2.a(118, false, false);
                    break;
                }
                break;
            case "real_money_mode_tutorial":
                final Dialog dialog3 = new Dialog(this.F);
                String string2 = getString(R.string.sg_sporty_soccer_training_completed);
                View.OnClickListener onClickListener4 = new View.OnClickListener() { // from class: ihj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = GameActivity.H;
                        GameActivity gameActivity3 = this.a;
                        gameActivity3.startActivity(new Intent("action_start_real_money_mode", null, gameActivity3, GameModeActivity.class));
                        gameActivity3.z.c(str, null);
                        dialog3.dismiss();
                    }
                };
                View.OnClickListener onClickListener5 = new View.OnClickListener() { // from class: jhj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = GameActivity.H;
                        GameActivity gameActivity3 = this.a;
                        gameActivity3.startActivity(new Intent(gameActivity3, (Class<?>) GameModeActivity.class));
                        gameActivity3.z.c(str, null);
                        dialog3.dismiss();
                    }
                };
                GameActivity gameActivity3 = this.F;
                qke.a(gameActivity3.getString(R.string.sg_common_functions_go), gameActivity3.getString(R.string.sg_common_functions__later), string2, gameActivity3.getString(R.string.sg_sporty_soccer_real_money_msg), onClickListener4, onClickListener5, true, dialog3, R.drawable.sg_pos_dia_bg, onClickListener5, 0);
                break;
            case "welcome_tutorial":
                final Dialog dialog4 = new Dialog(this.F);
                GameActivity gameActivity4 = this.F;
                qke.a(gameActivity4.getString(R.string.sg_common_functions__ok), null, gameActivity4.getString(R.string.sg_sporty_soccer_get_ready), gameActivity4.getString(R.string.sg_sporty_soccer_tutorial_msg), new View.OnClickListener() { // from class: ygj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = GameActivity.H;
                        this.a.z.c(str, null);
                        dialog4.dismiss();
                    }
                }, null, false, dialog4, R.drawable.sg_pos_dia_bg, new View.OnClickListener() { // from class: zgj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = GameActivity.H;
                        this.a.z.c(str, null);
                        dialog4.dismiss();
                    }
                }, 0);
                break;
            case "exit_warning":
                final Dialog dialog5 = new Dialog(this.F);
                View.OnClickListener onClickListener6 = new View.OnClickListener() { // from class: ehj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = GameActivity.H;
                        this.a.z.c(str, x6.a("dialog_extra_exit_game", true));
                        dialog5.dismiss();
                    }
                };
                GameActivity gameActivity5 = this.F;
                qke.a(gameActivity5.getString(R.string.sg_common_functions__ok), null, gameActivity5.getString(R.string.sg_common_functions_exit_game), gameActivity5.getString(R.string.sg_sporty_soccer_leave_game_msg), onClickListener6, null, false, dialog5, R.drawable.sg_exit_btn_bg, new View.OnClickListener() { // from class: hhj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = GameActivity.H;
                        this.a.z.c(str, x6.a("dialog_extra_exit_game", false));
                        dialog5.dismiss();
                    }
                }, 0);
                break;
            case "auto_forfeit":
                final Dialog dialog6 = new Dialog(this.F);
                View.OnClickListener onClickListener7 = new View.OnClickListener() { // from class: ahj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = GameActivity.H;
                        this.a.z.c(str, null);
                        dialog6.dismiss();
                    }
                };
                GameActivity gameActivity6 = this.F;
                qke.a(gameActivity6.getString(R.string.sg_common_functions__ok), null, gameActivity6.getString(R.string.sg_sporty_soccer_unfinished_game_settled), gameActivity6.getString(R.string.sg_sporty_soccer_you_last_game_was_unifinished_over_14_days_and_has_been_settled_automatically), onClickListener7, null, false, dialog6, R.drawable.sg_err_btn_bg, new View.OnClickListener() { // from class: bhj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = GameActivity.H;
                        dialog6.dismiss();
                    }
                }, 0);
                break;
        }
    }

    @Override // com.sportygames.sportysoccer.activities.a, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        nmj xmjVar;
        super.onCreate(bundle);
        if (SportyGamesManager.getInstance() == null || SportyGamesManager.getInstance().getOperId() == null) {
            finish();
            return;
        }
        this.F = this;
        wij wijVarA = wij.a();
        wijVarA.b(this);
        this.B = wijVarA.c;
        switch (String.valueOf(getIntent().getAction())) {
            case "action_real_money":
                xmjVar = new xmj(this.F);
                break;
            case "action_practice":
                xmjVar = new qmj(this.F);
                break;
            case "action_tutorial":
                xmjVar = new anj(this.F);
                break;
            case "action_no_win":
                xmjVar = new pmj(this.F);
                break;
            default:
                hb5.a("no action for GameActivity");
                return;
        }
        lmj lmjVar = new lmj(this, this, xmjVar);
        this.z = lmjVar;
        moj mojVar = lmjVar.c.get();
        if (mojVar != null) {
            mojVar.p();
        }
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(zsd0.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        zsd0 zsd0Var = (zsd0) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.D = zsd0Var;
        zsd0Var.a.f(this, new lfy() { // from class: chj
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                GameSessionBaseline gameSessionBaseline = (GameSessionBaseline) obj;
                int i = GameActivity.H;
                if (gameSessionBaseline == null) {
                    return;
                }
                this.a.v.setPayoutBaseline(gameSessionBaseline);
            }
        });
        getOnBackPressedDispatcher().a(this, new a());
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            lmj lmjVar = this.z;
            lmjVar.getClass();
            lmjVar.j = true;
            lmjVar.a = null;
            lmjVar.b = null;
            lmjVar.c.clear();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.G = true;
        lmj lmjVar = this.z;
        nmj nmjVar = lmjVar.h;
        hpa0 hpa0Var = lmjVar.a;
        if (hpa0Var != null) {
            hpa0Var.c();
        }
        if ("dialog".equals(lmjVar.m) && TextUtils.equals("cash_out", lmjVar.n)) {
            nmjVar.j(lmjVar);
        }
        int i = lmjVar.i;
        if (i > 0) {
            nmjVar.c(i, null);
            lmjVar.i = 0;
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        byte b2 = 0;
        this.G = false;
        lmj lmjVar = this.z;
        String str = lmjVar.m;
        str.getClass();
        switch (str.hashCode()) {
            case -1332085432:
                if (!str.equals("dialog")) {
                    b2 = -1;
                }
                break;
            case 109757306:
                b2 = !str.equals("stake") ? (byte) -1 : (byte) 1;
                break;
            case 336650556:
                b2 = !str.equals("loading") ? (byte) -1 : (byte) 2;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                if (TextUtils.equals("cash_out_celebration", lmjVar.n)) {
                    return;
                }
                break;
            case 1:
            case 2:
                return;
        }
        hpa0 hpa0Var = lmjVar.a;
        if (hpa0Var != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new gpa0(hpa0Var), 100L);
        }
    }

    @Override // defpackage.moj
    public final void p() {
        try {
            setContentView(R.layout.sg_ss_activity_game);
            getWindow().addFlags(128);
            GameSurfaceView gameSurfaceView = (GameSurfaceView) findViewById(R.id.game_surface_view);
            this.e = gameSurfaceView;
            gameSurfaceView.setListener(this);
            this.f = findViewById(R.id.game_surface_view_mask);
            this.v = (StakeLayout) findViewById(R.id.layout_stake);
            this.w = (CashOutLayout) findViewById(R.id.layout_cash_out);
            this.i = (TutorialBallsLayout) findViewById(R.id.tutorial_balls);
            this.y = (CelebrationLayout) findViewById(R.id.layout_maximum_streak);
            ImageView imageView = (ImageView) findViewById(R.id.back_button);
            this.E = imageView;
            imageView.setOnClickListener(new y66(this, 1));
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.moj
    public final void t0(String str, List<StakeData> list) {
        zsd0 zsd0Var = this.D;
        zsd0Var.getClass();
        i0.a(bbd0.b.a.y(), 2, new ysd0(zsd0Var));
        this.f.setVisibility(0);
        this.E.setVisibility(8);
        this.y.setVisibility(8);
        ohj ohjVar = this.A;
        if (ohjVar != null) {
            ohjVar.cancel();
            this.A = null;
        }
        this.w.setVisibility(8);
        StakeLayout stakeLayout = this.v;
        c cVar = new c();
        stakeLayout.getClass();
        stakeLayout.Q = Float.parseFloat(str);
        stakeLayout.G.setText(stakeLayout.getResources().getString(R.string.sg_common_functions_game_balance, b3.K(str)));
        stakeLayout.K = list;
        if (list != null && list.size() >= 3) {
            for (int i = 0; i < 3; i++) {
                StakeData stakeData = list.get(i);
                TextView textView = stakeLayout.F[i];
                Locale locale = Locale.US;
                textView.setText("+" + Math.round(stakeData.getAmount().floatValue()));
                stakeLayout.J.put(Integer.valueOf(stakeLayout.F[i].getId()), Integer.valueOf(Math.round(stakeData.getAmount().floatValue())));
            }
            stakeLayout.I = cVar;
        }
        this.v.setVisibility(0);
    }

    public final void w1(boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("dialog_extra_cash_out", z);
        bundle.putBoolean("dialog_extra_timeout", z2);
        this.z.c("cash_out", bundle);
    }
}
