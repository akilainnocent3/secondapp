package com.sportybet.plugin.swipebet.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pairip.VMRunner;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.swipebet.activities.SwipeBetActivity;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackView;
import defpackage.ah6;
import defpackage.bb40;
import defpackage.bh6;
import defpackage.br3;
import defpackage.cld0;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.fdt;
import defpackage.fj60;
import defpackage.fzg0;
import defpackage.g1i;
import defpackage.g9i0;
import defpackage.gj60;
import defpackage.hb5;
import defpackage.hj60;
import defpackage.hle0;
import defpackage.hp0;
import defpackage.ile0;
import defpackage.itf0;
import defpackage.iu2;
import defpackage.iym;
import defpackage.jle0;
import defpackage.jq40;
import defpackage.k53;
import defpackage.kle0;
import defpackage.kzh;
import defpackage.lfy;
import defpackage.lj60;
import defpackage.lle0;
import defpackage.mke0;
import defpackage.mmc;
import defpackage.n8j0;
import defpackage.o8i0;
import defpackage.o8k;
import defpackage.qoa0;
import defpackage.qqe;
import defpackage.r6i0;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.tlf;
import defpackage.v8i0;
import defpackage.vn20;
import defpackage.vza0;
import defpackage.wym;
import defpackage.x4m;
import defpackage.xg6;
import defpackage.xzh;
import defpackage.yzh;
import defpackage.zch0;
import defpackage.zg6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class SwipeBetActivity extends x4m implements ah6, wym, bb40 {
    public static final /* synthetic */ int Q = 0;
    public View A;
    public View B;
    public View C;
    public View D;
    public View E;
    public TextView F;
    public ile0 H;
    public int L;
    public iym M;
    public hle0 N;
    public o8k O;
    public CountDownTimer P;
    public CardStackView b;
    public CardStackLayoutManager c;
    public xg6 d;
    public View e;
    public View f;
    public LinearLayout i;
    public View v;
    public View w;
    public View y;
    public View z;
    public fzg0 G = fzg0.a;
    public final ArrayList I = new ArrayList();
    public boolean J = false;
    public final a K = new a();

    /* JADX INFO: loaded from: classes2.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            VMRunner.invoke("LiNxYNMElvzF1lWz", new Object[]{this, context, intent});
        }
    }

    public class b implements Animation.AnimationListener {
        public final /* synthetic */ RotateAnimation a;

        public b(RotateAnimation rotateAnimation) {
            this.a = rotateAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeBetActivity.this.A.startAnimation(this.a);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class c implements Animation.AnimationListener {
        public final /* synthetic */ RotateAnimation a;

        public c(RotateAnimation rotateAnimation) {
            this.a = rotateAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeBetActivity.this.A.startAnimation(this.a);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class d extends CountDownTimer {
        public d() {
            super(3000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            SwipeBetActivity.this.finish();
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
        }
    }

    public class e extends CountDownTimer {
        public e() {
            super(3000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            int i = SwipeBetActivity.Q;
            SwipeBetActivity swipeBetActivity = SwipeBetActivity.this;
            swipeBetActivity.E.setVisibility(8);
            swipeBetActivity.J = true;
            ile0 ile0Var = swipeBetActivity.H;
            if (ile0Var != null) {
                ile0Var.y1();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
        }
    }

    public final void A1(View view) {
        int height = view.getHeight() - zch0.a(getBaseContext(), 189);
        int iF = zch0.f(getBaseContext()) - zch0.a(getBaseContext(), 52);
        int i = (int) (((double) iF) * 1.47d);
        if (height > i) {
            height = i;
        } else {
            iF = (int) (((double) height) / 1.47d);
            int iF2 = (zch0.f(getBaseContext()) - iF) / 2;
            this.b.setPadding(iF2, 0, iF2, 0);
        }
        this.b.getLayoutParams().height = height;
        this.b.requestLayout();
        this.i.getLayoutParams().height = height;
        this.i.getLayoutParams().width = iF;
        this.i.requestLayout();
        this.z.getLayoutParams().height = height;
        this.z.getLayoutParams().width = iF;
        this.z.requestLayout();
        this.B.getLayoutParams().height = height;
        this.B.getLayoutParams().width = iF;
        xg6 xg6Var = new xg6(this.accountHelper.getLanguageCode());
        this.d = xg6Var;
        this.b.setAdapter(xg6Var);
        this.J = false;
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(ile0.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        ile0 ile0Var = (ile0) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.H = ile0Var;
        ile0Var.d.f(this, new lfy() { // from class: qke0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                hqc hqcVar = (hqc) obj;
                int i2 = SwipeBetActivity.Q;
                SwipeBetActivity swipeBetActivity = this.a;
                ArrayList arrayList = swipeBetActivity.I;
                if (hqcVar instanceof lqc) {
                    arrayList.clear();
                    swipeBetActivity.D1();
                    xg6 xg6Var2 = swipeBetActivity.d;
                    if (xg6Var2 != null && xg6Var2.a.size() == 0) {
                        swipeBetActivity.b.setVisibility(8);
                    }
                    swipeBetActivity.B.setVisibility(8);
                    swipeBetActivity.e.setVisibility(0);
                    return;
                }
                if (hqcVar instanceof kqc) {
                    swipeBetActivity.E1();
                    swipeBetActivity.B.setVisibility(0);
                    swipeBetActivity.b.setVisibility(8);
                    swipeBetActivity.e.setVisibility(8);
                    return;
                }
                if (hqcVar instanceof nqc) {
                    swipeBetActivity.E1();
                    swipeBetActivity.B.setVisibility(8);
                    ArrayList arrayList2 = new ArrayList();
                    List list = (List) ((nqc) hqcVar).a;
                    if (list.size() == 0) {
                        swipeBetActivity.B1();
                        return;
                    }
                    arrayList.addAll(list);
                    Event event = (Event) list.get(list.size() - 1);
                    if (event != null) {
                        vn20.i("swipe_bet", swipeBetActivity.N.d.isLogin() ? "pref_key_paginate_index" : "pref_key_default_paginate_index", hle0.c(event), true);
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new zg6((Event) it.next()));
                    }
                    xg6 xg6Var3 = swipeBetActivity.d;
                    ArrayList arrayList3 = xg6Var3.a;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    xg6Var3.notifyDataSetChanged();
                    swipeBetActivity.b.setVisibility(0);
                    if (((ArrayList) iu2.d()).size() >= swipeBetActivity.L) {
                        swipeBetActivity.C1();
                        return;
                    }
                    if (vn20.c("sportybet", "key_swipe_bet_tutorial_show", true)) {
                        swipeBetActivity.G = fzg0.b;
                        swipeBetActivity.z1();
                    }
                    swipeBetActivity.e.setVisibility(0);
                }
            }
        });
        this.H.f.f(this, new lfy() { // from class: rke0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                hqc hqcVar = (hqc) obj;
                int i2 = SwipeBetActivity.Q;
                boolean z = hqcVar instanceof lqc;
                SwipeBetActivity swipeBetActivity = this.a;
                if (z) {
                    swipeBetActivity.D1();
                    return;
                }
                if (hqcVar instanceof kqc) {
                    swipeBetActivity.E1();
                    return;
                }
                swipeBetActivity.getClass();
                if (hqcVar instanceof nqc) {
                    ArrayList arrayList = new ArrayList();
                    List list = (List) ((nqc) hqcVar).a;
                    if (list.size() == 0) {
                        swipeBetActivity.E1();
                        return;
                    }
                    swipeBetActivity.I.addAll(list);
                    Event event = (Event) list.get(list.size() - 1);
                    if (event != null) {
                        vn20.i("swipe_bet", swipeBetActivity.N.d.isLogin() ? "pref_key_paginate_index" : "pref_key_default_paginate_index", hle0.c(event), true);
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new zg6((Event) it.next()));
                    }
                    xg6 xg6Var2 = swipeBetActivity.d;
                    ArrayList arrayList2 = xg6Var2.a;
                    int size = arrayList2.size();
                    arrayList2.addAll(arrayList);
                    xg6Var2.notifyItemInserted(size);
                    swipeBetActivity.E1();
                }
            }
        });
        ((ImageView) findViewById(R.id.tool_btn_close)).setOnClickListener(new View.OnClickListener() { // from class: ske0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = SwipeBetActivity.Q;
                this.a.finish();
            }
        });
        ((ImageView) findViewById(R.id.tool_btn_setting)).setOnClickListener(new mke0());
        ((ImageView) findViewById(R.id.tool_btn_tutorial)).setOnClickListener(new View.OnClickListener() { // from class: nke0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = SwipeBetActivity.Q;
                fzg0 fzg0Var = fzg0.b;
                SwipeBetActivity swipeBetActivity = this.a;
                swipeBetActivity.G = fzg0Var;
                swipeBetActivity.z1();
            }
        });
        int i2 = 1;
        ((ImageView) findViewById(R.id.swipe_action_remove)).setOnClickListener(new hj60(this, i2));
        ((ImageView) findViewById(R.id.swipe_action_next_odds)).setOnClickListener(new vza0(this, i2));
        ((ImageView) findViewById(R.id.swipe_action_accept)).setOnClickListener(new lj60(this, i2));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("open_bet_slip");
        fdt.a(this).b(this.K, intentFilter);
    }

    public final void B1() {
        this.E.setVisibility(0);
        CountDownTimer countDownTimer = this.P;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        } else {
            this.P = new e();
        }
        this.P.start();
    }

    public final void C1() {
        this.D.setVisibility(0);
        this.F.setText(getCMSString(R.string.component_betslip__max_selection, String.valueOf(this.L)));
        CountDownTimer countDownTimer = this.P;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        } else {
            this.P = new d();
        }
        this.P.start();
    }

    public final void D1() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(400L);
        rotateAnimation.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, -360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setDuration(400L);
        rotateAnimation2.setFillAfter(true);
        rotateAnimation.setAnimationListener(new b(rotateAnimation2));
        rotateAnimation2.setAnimationListener(new c(rotateAnimation));
        this.A.startAnimation(rotateAnimation);
        this.z.setVisibility(0);
    }

    public final void E1() {
        View view = this.A;
        if (view != null && view.getAnimation() != null) {
            this.A.getAnimation().cancel();
        }
        this.z.setVisibility(8);
    }

    @Override // defpackage.ah6
    public final void b1(qqe qqeVar) {
        ile0 ile0Var;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SWIPE_BET);
        aVar.a("onCardSwiped - direction = %s", qqeVar.name());
        int i = this.c.H.f;
        aVar.q(MyLog.TAG_SWIPE_BET);
        aVar.a("topPosition = %d", Integer.valueOf(i));
        if (i == this.d.a.size() - 5 && (ile0Var = this.H) != null) {
            aVar.q(MyLog.TAG_SWIPE_BET);
            aVar.a("loadMore", new Object[0]);
            kzh.d(new yzh(new g1i(new xzh(ile0Var.a.c(ile0Var.z1(false)), new jle0(ile0Var, null)), new kle0(ile0Var, null)), new lle0(ile0Var, null)), o8i0.d(ile0Var));
        }
        aVar.q(MyLog.TAG_SWIPE_BET);
        aVar.a("getItemCount = %d", Integer.valueOf(this.d.a.size()));
        if (i == this.d.a.size() && this.z.getVisibility() == 8) {
            B1();
        } else {
            this.E.setVisibility(8);
        }
        if (qqeVar == qqe.b) {
            xg6 xg6Var = this.d;
            if (i != 0) {
                i--;
            }
            ArrayList arrayList = xg6Var.a;
            zg6 zg6Var = (i < 0 || i >= arrayList.size()) ? null : (zg6) arrayList.get(i);
            if (zg6Var == null) {
                return;
            }
            Event event = zg6Var.a;
            Market market = event.markets.get(0);
            if (iu2.s(event, market, market.outcomes.get(zg6Var.b), true)) {
                iu2.a.j().s1(true);
                if (((ArrayList) iu2.d()).size() >= this.L) {
                    C1();
                }
            }
            iym iymVar = this.M;
            PageMeta.INSTANCE.getClass();
            iymVar.f(AnalyticsEvent.SWIPE_BET_ADD_TO_BETSLIP, new PageMeta("swipebet", null));
        }
    }

    @Override // defpackage.ah6
    public final void j0(int i) {
        ArrayList arrayList = this.d.a;
        zg6 zg6Var = (i < 0 || i >= arrayList.size()) ? null : (zg6) arrayList.get(i);
        if (zg6Var == null) {
            return;
        }
        Event event = zg6Var.a;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SWIPE_BET);
        aVar.a("onCardDisappeared - position = %d", Integer.valueOf(i));
        aVar.q(MyLog.TAG_SWIPE_BET);
        aVar.a("match : %1$s vs %2$s", event.homeTeamName, event.awayTeamName);
        vn20.i("swipe_bet", this.N.d.isLogin() ? "pref_key_current_appeared_index" : "pref_key_default_current_appeared_index", hle0.c(event), true);
    }

    @Override // defpackage.wym
    public final boolean k0() {
        return true;
    }

    @Override // defpackage.wym
    public final boolean o() {
        return true;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        n8j0.g cVar;
        super.onCreate(bundle);
        this.L = this.O.a();
        setContentView(R.layout.spr_activity_swipe_bet);
        boolean z = true;
        char c2 = 1;
        char c3 = 1;
        setRequireBetslipBtnLater(true);
        if (Build.VERSION.SDK_INT >= 35) {
            Window window = getWindow();
            qoa0 qoa0Var = new qoa0(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                cVar = new n8j0.f(window, qoa0Var);
            } else if (i >= 30) {
                cVar = new n8j0.d(window, qoa0Var);
            } else {
                cVar = i >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
            }
            cVar.d(true);
            cVar.c(true);
            View viewFindViewById = findViewById(android.R.id.content);
            tlf tlfVar = new tlf(viewFindViewById, z);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.d.n(viewFindViewById, tlfVar);
        } else {
            Window window2 = getWindow();
            window2.addFlags(Integer.MIN_VALUE);
            window2.clearFlags(67108864);
            window2.setStatusBarColor(0);
        }
        k53 k53Var = k53.REAL;
        iu2 iu2Var = iu2.a;
        iu2Var.j().r0(k53Var);
        iu2Var.j().b1();
        CardStackLayoutManager cardStackLayoutManager = new CardStackLayoutManager(this, this);
        bh6 bh6Var = cardStackLayoutManager.G;
        bh6Var.a = cld0.b;
        bh6Var.b = 4;
        bh6Var.c = 4.0f;
        bh6Var.d = 0.95f;
        bh6Var.f = qqe.e;
        bh6Var.h = false;
        bh6Var.e = 0.3f;
        this.c = cardStackLayoutManager;
        CardStackView cardStackView = (CardStackView) findViewById(R.id.card_stack_view);
        this.b = cardStackView;
        cardStackView.setLayoutManager(this.c);
        this.f = findViewById(R.id.swipe_action_tutorial_container);
        this.i = (LinearLayout) findViewById(R.id.swipe_action_tutorial);
        this.v = findViewById(R.id.left_right_container);
        this.w = findViewById(R.id.swipe_down_container);
        this.y = findViewById(R.id.tap_container);
        this.z = findViewById(R.id.loading_view_container);
        this.A = findViewById(R.id.loading_view);
        this.B = findViewById(R.id.error_view_container);
        View viewFindViewById2 = findViewById(R.id.error_retry_btn);
        this.C = viewFindViewById2;
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: lke0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = SwipeBetActivity.Q;
                SwipeBetActivity swipeBetActivity = this.a;
                ile0 ile0Var = swipeBetActivity.H;
                if (ile0Var != null) {
                    if (swipeBetActivity.J) {
                        ile0Var.y1();
                    } else {
                        ile0Var.x1();
                    }
                }
            }
        });
        View viewFindViewById3 = findViewById(R.id.max_selection_container);
        this.D = viewFindViewById3;
        viewFindViewById3.setOnClickListener(new fj60(this, c3 == true ? 1 : 0));
        View viewFindViewById4 = findViewById(R.id.no_more_bets_container);
        this.E = viewFindViewById4;
        viewFindViewById4.setOnClickListener(new gj60(this, c2 == true ? 1 : 0));
        this.F = (TextView) findViewById(R.id.max_selection_hint);
        this.e = findViewById(R.id.swipe_bet_actions);
        final View viewFindViewById5 = findViewById(R.id.root_view);
        viewFindViewById5.post(new Runnable() { // from class: pke0
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = SwipeBetActivity.Q;
                this.a.A1(viewFindViewById5);
            }
        });
        iym iymVar = this.M;
        PageMeta.INSTANCE.getClass();
        iymVar.f(AnalyticsEvent.SWIPE_BET_VIEW, new PageMeta("swipebet", null));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.K;
        if (aVar != null) {
            fdt.a(this).d(aVar);
        }
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((br3) mmc.a(hp0.A, br3.class)).U().a(this, true);
    }

    @Override // defpackage.wym
    public final boolean y() {
        return true;
    }

    public final void z1() {
        int iOrdinal = this.G.ordinal();
        View view = this.f;
        if (iOrdinal == 1) {
            view.setVisibility(0);
            this.v.setVisibility(0);
            this.w.setVisibility(0);
            this.y.setVisibility(8);
        } else if (iOrdinal != 2) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            this.v.setVisibility(4);
            this.w.setVisibility(8);
            this.y.setVisibility(0);
        }
        this.f.setOnClickListener(new View.OnClickListener() { // from class: oke0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i = SwipeBetActivity.Q;
                SwipeBetActivity swipeBetActivity = this.a;
                fzg0 fzg0Var = swipeBetActivity.G;
                fzg0 fzg0Var2 = fzg0.b;
                fzg0 fzg0Var3 = fzg0.c;
                if (fzg0Var == fzg0Var2) {
                    swipeBetActivity.G = fzg0Var3;
                } else if (fzg0Var == fzg0Var3) {
                    swipeBetActivity.G = fzg0.a;
                }
                swipeBetActivity.z1();
                vn20.g("sportybet", "key_swipe_bet_tutorial_show", false, true);
            }
        });
    }
}
