package com.sportygames.sportysoccer.activities;

import android.app.Dialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.tw_commons.data.BaseResponse;
import com.sportygames.sportysoccer.activities.GameActivity;
import com.sportygames.sportysoccer.activities.GameModeActivity;
import com.sportygames.sportysoccer.activities.IntroductionActivity;
import com.sportygames.sportysoccer.activities.SettingsActivity;
import com.sportygames.sportysoccer.model.FlickBall;
import com.sportygames.sportysoccer.model.Login;
import com.sportygames.sportysoccer.model.TutorialStatus;
import com.sportygames.sportysoccer.widget.ButtonLayout;
import defpackage.bb;
import defpackage.bi50;
import defpackage.bp0;
import defpackage.cbd0;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.fbd0;
import defpackage.fbn;
import defpackage.gv5;
import defpackage.hb5;
import defpackage.i0;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.m6f;
import defpackage.m8;
import defpackage.mb5;
import defpackage.nzf0;
import defpackage.o6f;
import defpackage.qke;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.ssw;
import defpackage.su5;
import defpackage.th8;
import defpackage.v8i0;
import defpackage.wij;
import defpackage.wn20;
import defpackage.xae;
import defpackage.xnh0;
import defpackage.y3l;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes8.dex */
public class GameModeActivity extends com.sportygames.sportysoccer.activities.a implements bb {
    public static final /* synthetic */ int C = 0;
    public GameModeActivity A;
    public ButtonLayout v;
    public ViewGroup w;
    public String y;
    public o6f z;
    public final m6f e = new m6f();
    public Boolean f = Boolean.FALSE;
    public final HashSet i = new HashSet();
    public boolean B = false;

    public class a implements gv5<BaseResponse<FlickBall>> {
        public final /* synthetic */ GameModeActivity a;

        /* JADX INFO: renamed from: com.sportygames.sportysoccer.activities.GameModeActivity$a$a, reason: collision with other inner class name */
        public class C0447a extends com.sportygames.sportysoccer.activities.a.C0449a<Login> {
            public C0447a(GameModeActivity gameModeActivity) {
                super(gameModeActivity);
            }

            @Override // com.sportygames.sportysoccer.activities.a.C0449a, defpackage.y3l
            public final void o(mb5 mb5Var) {
                GameModeActivity gameModeActivity = GameModeActivity.this;
                if (gameModeActivity.B) {
                    return;
                }
                gameModeActivity.A1();
            }

            @Override // com.sportygames.sportysoccer.activities.a.C0449a, defpackage.y3l
            public final void p(su5 su5Var, Object obj) {
                Login login = (Login) obj;
                GameModeActivity gameModeActivity = GameModeActivity.this;
                if (gameModeActivity.B) {
                    return;
                }
                try {
                    super.p(su5Var, login);
                    String accessToken = login.getAccessToken();
                    if (TextUtils.isEmpty(accessToken)) {
                        new IllegalArgumentException("can not get access token from api");
                        if (gameModeActivity.B) {
                            return;
                        }
                        gameModeActivity.A1();
                        return;
                    }
                    wn20.e(gameModeActivity.A, "userSession", "open_net_access_token", accessToken);
                    SportyGamesManager.getInstance().setSportySoccerToken(accessToken);
                    su5<TutorialStatus> su5VarX = gameModeActivity.b.x();
                    com.sportygames.sportysoccer.activities.b bVar = new com.sportygames.sportysoccer.activities.b(gameModeActivity, gameModeActivity);
                    gameModeActivity.v1(0);
                    i0.a(su5VarX, 2, bVar);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public a(GameModeActivity gameModeActivity) {
            this.a = gameModeActivity;
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<FlickBall>> su5Var, Throwable th) {
            GameModeActivity gameModeActivity = GameModeActivity.this;
            if (gameModeActivity.B) {
                return;
            }
            gameModeActivity.A1();
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<FlickBall>> su5Var, bi50<BaseResponse<FlickBall>> bi50Var) {
            FlickBall flickBall;
            GameModeActivity gameModeActivity = GameModeActivity.this;
            try {
                if (gameModeActivity.B) {
                    return;
                }
                BaseResponse<FlickBall> baseResponse = bi50Var.b;
                if (baseResponse == null || (flickBall = baseResponse.data) == null || TextUtils.isEmpty(flickBall.token)) {
                    SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                    return;
                }
                su5<Login> su5VarQ = gameModeActivity.b.q(flickBall.token, SportyGamesManager.getInstance().getCountry().toUpperCase(Locale.ENGLISH));
                C0447a c0447a = new C0447a(this.a);
                gameModeActivity.v1(0);
                i0.a(su5VarQ, 2, c0447a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class b extends y3l {
        @Override // defpackage.y3l
        public final void p(su5 su5Var, Object obj) {
        }
    }

    public final void A1() {
        try {
            final Dialog dialog = new Dialog(this.A);
            String string = getString(R.string.sg_common_feedback_connection_error);
            String string2 = getString(R.string.sg_sporty_soccer_building_connection_failed);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: wlj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = GameModeActivity.C;
                    this.a.finish();
                    dialog.dismiss();
                }
            };
            GameModeActivity gameModeActivity = this.A;
            qke.a(gameModeActivity.getString(R.string.sg_common_functions__ok), null, string, string2, onClickListener, null, false, dialog, R.drawable.sg_err_btn_bg, new View.OnClickListener() { // from class: xlj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = GameModeActivity.C;
                    dialog.dismiss();
                }
            }, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.bb
    public final void Q(xnh0 xnh0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = nzf0.a;
        if (!z && jCurrentTimeMillis - nzf0.b <= 500) {
            z = true;
        }
        if (z) {
            return;
        }
        x1();
    }

    @Override // defpackage.bb
    public final void f0(m8 m8Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = nzf0.a;
        if (!z && jCurrentTimeMillis - nzf0.b <= 500) {
            z = true;
        }
        if (z) {
            return;
        }
        finish();
    }

    @Override // com.sportygames.sportysoccer.activities.a, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.sg_ss_activity_game_mode);
        this.A = this;
        this.w = (ViewGroup) findViewById(R.id.main_menus);
        if (SportyGamesManager.getInstance() == null || SportyGamesManager.getInstance().getOperId() == null) {
            finish();
            return;
        }
        ImageView imageView = (ImageView) findViewById(R.id.background);
        fbn fbnVarA = th8.a();
        if (SportyGamesManager.getInstance() != null) {
            SportyGamesManager.getInstance().setScreenName("sportygames/sportysoccer");
            if (SportyGamesManager.getInstance().getCountry() == null || SportyGamesManager.getInstance().getCountry().equalsIgnoreCase("GH")) {
                fbnVarA.a("https://s.football.com/common/main/res/a24673048b8a336e17b65dc096c4a2e5.png", imageView);
            } else {
                fbnVarA.a("https://s.sporty.net/ke/main/res/c7c6c3296c170059a177457b3a4cba5b.webp", imageView);
            }
        } else {
            fbnVarA.a("https://s.football.com/common/main/res/a24673048b8a336e17b65dc096c4a2e5.png", imageView);
        }
        ButtonLayout buttonLayout = (ButtonLayout) this.w.findViewById(R.id.btn_practice);
        buttonLayout.a(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, R.drawable.sg_icon_practice, getString(R.string.sg_common_functions_practice));
        buttonLayout.setOnClickListener(new View.OnClickListener() { // from class: plj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = GameModeActivity.C;
                this.a.startActivity(new Intent("action_practice", null, view.getContext(), GameActivity.class));
            }
        });
        ButtonLayout buttonLayout2 = (ButtonLayout) this.w.findViewById(R.id.btn_play);
        this.v = buttonLayout2;
        buttonLayout2.a(100, R.drawable.sg_icon_play, getString(R.string.sg_sporty_soccer_functions__play));
        buttonLayout2.setOnClickListener(new View.OnClickListener() { // from class: qlj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = GameModeActivity.C;
                Intent intent = new Intent("action_real_money", null, view.getContext(), GameActivity.class);
                GameModeActivity gameModeActivity = this.a;
                if (TextUtils.equals(gameModeActivity.y, "action_continue_game")) {
                    intent.addFlags(65536);
                }
                gameModeActivity.startActivity(intent);
            }
        });
        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() { // from class: rlj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = GameModeActivity.C;
                this.a.finish();
            }
        });
        ButtonLayout buttonLayout3 = (ButtonLayout) this.w.findViewById(R.id.btn_settings);
        buttonLayout3.a(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, R.drawable.sg_icon_settings, getString(R.string.sg_common_functions_settings));
        buttonLayout3.setOnClickListener(new View.OnClickListener() { // from class: slj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = GameModeActivity.C;
                this.a.startActivity(new Intent(view.getContext(), (Class<?>) SettingsActivity.class));
            }
        });
        ButtonLayout buttonLayout4 = (ButtonLayout) this.w.findViewById(R.id.btn_rules);
        buttonLayout4.a(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, R.drawable.sg_icon_rules, getString(R.string.sg_common_functions_rules));
        buttonLayout4.setOnClickListener(new View.OnClickListener() { // from class: tlj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = GameModeActivity.C;
                this.a.startActivity(new Intent(view.getContext(), (Class<?>) IntroductionActivity.class));
            }
        });
        SportyGamesManager.getInstance().addAccountUpdatedListener(this);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(o6f.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        o6f o6fVar = (o6f) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.z = o6fVar;
        ssw sswVar = o6fVar.b;
        final HashSet hashSet = this.i;
        Objects.requireNonNull(hashSet);
        sswVar.f(this, new lfy() { // from class: ulj
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                hashSet.addAll((Set) obj);
            }
        });
        this.z.c.f(this, new lfy() { // from class: vlj
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i = GameModeActivity.C;
                GameModeActivity gameModeActivity = this.a;
                HashSet hashSet2 = gameModeActivity.i;
                if (hashSet2.remove((Long) obj) && hashSet2.isEmpty()) {
                    gameModeActivity.x1();
                }
            }
        });
        int i = Build.VERSION.SDK_INT;
        m6f m6fVar = this.e;
        if (i <= 26) {
            registerReceiver(m6fVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        } else {
            registerReceiver(m6fVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 4);
        }
        this.f = Boolean.TRUE;
        w1();
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        this.B = true;
        if (this.f.booleanValue()) {
            unregisterReceiver(this.e);
            this.f = Boolean.FALSE;
        }
        SportyGamesManager.getInstance().removeAccountUpdatedListener(this);
        super.onDestroy();
    }

    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        w1();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (TextUtils.isEmpty(getSharedPreferences("userSession", 0).getString("open_net_access_token", ""))) {
            return;
        }
        findViewById(R.id.main_game_bg).setVisibility(8);
        y1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w1() {
        Collection<Pair<String, String>> collectionValues = fbd0.a.values();
        collectionValues.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            HashMap<Integer, Pair<String, String>> map = fbd0.a;
            File file = new File(getExternalFilesDir(null), (String) ((Pair) obj).b);
            if (!file.exists() || !file.canRead() || file.length() <= 0) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            this.z.x1(this, arrayList);
        }
        x1();
    }

    public final void x1() {
        u1();
        wij.a().b(this);
        Intent intent = getIntent();
        this.y = intent.getAction();
        switch (String.valueOf(intent.getAction())) {
            case "action_start_real_money_mode":
                this.v.callOnClick();
                break;
            case "action_continue_game":
                findViewById(R.id.main_game_bg).setVisibility(0);
                wn20.e(this, "userSession", "open_net_user_id", "");
                SportyGamesManager.getInstance().setSportySoccerToken("");
                wn20.e(this, "userSession", "open_net_access_token", "");
                z1();
                break;
            case "action_login":
                wn20.e(this, "userSession", "open_net_user_id", "");
                SportyGamesManager.getInstance().setSportySoccerToken("");
                wn20.e(this, "userSession", "open_net_access_token", "");
                z1();
                break;
            default:
                y1();
                break;
        }
    }

    public final void y1() {
        try {
            this.w.setVisibility(0);
            findViewById(R.id.back_button).setVisibility(0);
            i0.a(this.b.o(), 2, new b());
        } catch (Exception unused) {
        }
    }

    public final void z1() {
        if (SportyGamesManager.getInstance().getUser() == null) {
            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
            return;
        }
        Object value = bp0.a.getValue();
        value.getClass();
        ((cbd0) value).w(SportyGamesManager.getInstance().getUser().a).G(new a(this));
    }
}
