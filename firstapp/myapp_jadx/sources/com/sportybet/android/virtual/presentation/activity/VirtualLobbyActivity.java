package com.sportybet.android.virtual.presentation.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.welcomereward.DepositFloatingIconPage;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.virtual.presentation.activity.VirtualLobbyActivity;
import defpackage.agi0;
import defpackage.azm;
import defpackage.bb40;
import defpackage.bgi0;
import defpackage.bmy;
import defpackage.bnh0;
import defpackage.cyb;
import defpackage.d1f0;
import defpackage.dfm;
import defpackage.dgi0;
import defpackage.ebs;
import defpackage.ee;
import defpackage.ef;
import defpackage.ej5;
import defpackage.fqk;
import defpackage.h5e;
import defpackage.haj;
import defpackage.hmi0;
import defpackage.j7e;
import defpackage.jfe;
import defpackage.jlo;
import defpackage.jq40;
import defpackage.k7m;
import defpackage.k9j;
import defpackage.kli0;
import defpackage.ku90;
import defpackage.lfy;
import defpackage.lli0;
import defpackage.m0t;
import defpackage.n0z;
import defpackage.oje;
import defpackage.oku;
import defpackage.op8;
import defpackage.ou1;
import defpackage.paj;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rja0;
import defpackage.s9s;
import defpackage.sk0;
import defpackage.u420;
import defpackage.u6i0;
import defpackage.v0;
import defpackage.v420;
import defpackage.v8i0;
import defpackage.vzy;
import defpackage.ydv;
import defpackage.yi5;
import defpackage.zch0;
import defpackage.zfi0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/virtual/presentation/activity/VirtualLobbyActivity;", "Lpy1;", "Lbb40;", "Lk9j;", "Lv420;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class VirtualLobbyActivity extends k7m implements bb40, k9j, v420 {
    public static final /* synthetic */ int E = 0;
    public j7e A;
    public ou1 B;
    public jlo C;
    public yi5 D;
    public ef b;
    public ee<fqk> i;
    public azm y;
    public bnh0 z;
    public final q8i0 c = new q8i0(jq40.a(n0z.class), new f(), new e(), new g());
    public final q8i0 d = new q8i0(jq40.a(hmi0.class), new i(), new h(), new j());
    public final q8i0 e = new q8i0(jq40.a(com.sportybet.android.instantwin.presentation.buildandgo.f.class), new l(), new k(), new m());
    public final q8i0 f = new q8i0(jq40.a(oku.class), new c(), new b(), new d());
    public final LinkedHashMap v = new LinkedHashMap();
    public final LinkedHashMap w = new LinkedHashMap();

    public static final class a implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public a(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return VirtualLobbyActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return VirtualLobbyActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return VirtualLobbyActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return VirtualLobbyActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return VirtualLobbyActivity.this.getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return VirtualLobbyActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class h extends qlr implements Function0<r8i0.c> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return VirtualLobbyActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class i extends qlr implements Function0<v8i0> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return VirtualLobbyActivity.this.getViewModelStore();
        }
    }

    public static final class j extends qlr implements Function0<cyb> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return VirtualLobbyActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class k extends qlr implements Function0<r8i0.c> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return VirtualLobbyActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class l extends qlr implements Function0<v8i0> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return VirtualLobbyActivity.this.getViewModelStore();
        }
    }

    public static final class m extends qlr implements Function0<cyb> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return VirtualLobbyActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final azm A1() {
        azm azmVar = this.y;
        if (azmVar != null) {
            return azmVar;
        }
        Intrinsics.n("router");
        throw null;
    }

    public final hmi0 B1() {
        return (hmi0) this.d.getValue();
    }

    @Override // defpackage.v420
    public final u420 E() {
        return u420.k.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean, int] */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i2;
        ef efVar;
        super.onCreate(bundle);
        ?? r4 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_virtuals_lobby, (ViewGroup) null, false);
        int i3 = R.id.lobby_view;
        ComposeView composeView = (ComposeView) h5e.a(R.id.lobby_view, viewInflate);
        if (composeView != null) {
            i3 = R.id.tabs;
            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.tabs, viewInflate);
            if (linearLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                ef efVar2 = new ef(constraintLayout, composeView, linearLayout);
                setContentView(constraintLayout);
                this.b = efVar2;
                jlo jloVar = this.C;
                if (jloVar == null) {
                    Intrinsics.n("instantWinRouter");
                    throw null;
                }
                this.i = registerForActivityResult(jloVar.a(), new dgi0(this));
                getSupportFragmentManager().n0("request_open_build_and_go_entry_sheet", this, new rja0(this));
                if (!isFinishing() && !isDestroyed() && (efVar = this.b) != null) {
                    ComposeView composeView2 = efVar.b;
                    hmi0 hmi0VarB1 = B1();
                    com.sportybet.android.instantwin.presentation.buildandgo.f fVarZ1 = z1();
                    composeView2.setViewCompositionStrategy(u6i0.c.a);
                    composeView2.setContent(new op8(-1392944620, new oje(hmi0VarB1, fVarZ1), true));
                }
                if (getCountryManager().W() || getCountryManager().F()) {
                    i2 = R.drawable.tab_games_color_br;
                } else {
                    i2 = getCountryManager().O() ? R.drawable.tab_games_selector_colored_za : R.drawable.tab_games_color;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(new d1f0(R.drawable.tab_today, dfm.class, "Home", getCMSString(R.string.wap_main_bottom_nav__home, new Object[0])));
                arrayList.add(new d1f0(R.drawable.tab_az_menu, v0.class, "AZ Menu", getCMSString(R.string.wap_main_bottom_nav__az_menu, new Object[0])));
                arrayList.add(new d1f0(i2, m0t.class, "Game", getCMSString(R.string.wap_home__games, new Object[0])));
                arrayList.add(new d1f0(R.drawable.tab_cashout, vzy.class, "Open Bets", getCMSString(R.string.wap_main_bottom_nav__open_bets, new Object[0])));
                arrayList.add(new d1f0(R.drawable.tab_me, ydv.class, "Me", getCMSString(R.string.wap_main_bottom_nav__me, new Object[0])));
                ef efVar3 = this.b;
                if (efVar3 != null) {
                    LinearLayout linearLayout2 = efVar3.c;
                    linearLayout2.removeAllViews();
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
                    Iterator it = arrayList.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        final d1f0 d1f0Var = (d1f0) next;
                        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.tab_indicator, linearLayout2, (boolean) r4);
                        viewInflate2.findViewById(R.id.tab_im_bottom).setVisibility(8);
                        viewInflate2.setLayoutParams(new LinearLayout.LayoutParams(r4, -1, 1.0f));
                        ImageView imageView = (ImageView) viewInflate2.findViewById(R.id.tab_img);
                        TextView textView = (TextView) viewInflate2.findViewById(R.id.tab_txt);
                        TextView textView2 = (TextView) viewInflate2.findViewById(R.id.count);
                        ImageView imageView2 = (ImageView) viewInflate2.findViewById(R.id.red_dot);
                        String str = d1f0Var.a;
                        String string = StringsKt.t0(str).toString();
                        Locale locale = Locale.ROOT;
                        locale.getClass();
                        String lowerCase = string.toLowerCase(locale);
                        lowerCase.getClass();
                        String strReplace = lowerCase.replace(' ', '_');
                        strReplace.getClass();
                        String strConcat = "tab_".concat(strReplace);
                        viewInflate2.setContentDescription(strConcat);
                        imageView.setContentDescription(strConcat.concat("_img"));
                        textView.setContentDescription(strConcat.concat("_txt"));
                        imageView.setImageResource(d1f0Var.b);
                        textView.setText(d1f0Var.c);
                        if (str.equalsIgnoreCase("Game") && getCountryManager().O()) {
                            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                            layoutParams.width = zch0.b(getResources(), 28);
                            layoutParams.height = zch0.b(getResources(), 28);
                            imageView.setLayoutParams(layoutParams);
                            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        }
                        this.v.put(str, textView2);
                        this.w.put(str, imageView2);
                        viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: wfi0
                            /* JADX WARN: Code duplicated, block: B:25:0x004a  */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                wae waeVar;
                                int i4 = VirtualLobbyActivity.E;
                                String str2 = d1f0Var.a;
                                int iHashCode = str2.hashCode();
                                if (iHashCode != -804335080) {
                                    if (iHashCode != 2488) {
                                        if (iHashCode != 2211858) {
                                            if (iHashCode == 166767878 && str2.equals("AZ Menu")) {
                                                waeVar = wae.v;
                                            } else {
                                                waeVar = wae.HOME;
                                            }
                                        } else if (str2.equals("Game")) {
                                            waeVar = wae.GAMES_LOBBY;
                                        } else {
                                            waeVar = wae.HOME;
                                        }
                                    } else if (str2.equals("Me")) {
                                        waeVar = wae.ME;
                                    } else {
                                        waeVar = wae.HOME;
                                    }
                                } else if (str2.equals("Open Bets")) {
                                    waeVar = wae.OPEN_BETS_IN_MAIN_TAB;
                                } else {
                                    waeVar = wae.HOME;
                                }
                                this.a.A1().j(waeVar, null, null);
                            }
                        });
                        linearLayout2.addView(viewInflate2);
                        r4 = 0;
                    }
                }
                ku90<lli0> ku90Var = B1().z;
                s9s.b bVar = s9s.b.a;
                ej5.c(ebs.a(getLifecycle()), null, null, new zfi0(this, ku90Var, null, this), 3);
                ej5.c(ebs.a(getLifecycle()), null, null, new agi0(this, z1().B, null, this), 3);
                q8i0 q8i0Var = this.c;
                ((n0z) q8i0Var.getValue()).A.f(this, new a(new sk0(this, 2)));
                q8i0 q8i0Var2 = this.f;
                ((oku) q8i0Var2.getValue()).b0.f(this, new a(new jfe(this, 1)));
                j7e j7eVar = this.A;
                if (j7eVar == null) {
                    Intrinsics.n("depositToUnlockBtManager");
                    throw null;
                }
                ej5.c(ebs.a(getLifecycle()), null, null, new bgi0(this, j7eVar.g, null, this), 3);
                if (getAccountManager().isLogin()) {
                    ((n0z) q8i0Var.getValue()).A1();
                    ((oku) q8i0Var2.getValue()).z1();
                    return;
                }
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        j7e j7eVar = this.A;
        if (j7eVar != null) {
            j7eVar.a();
        } else {
            Intrinsics.n("depositToUnlockBtManager");
            throw null;
        }
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        B1().x1(kli0.p.a);
        j7e j7eVar = this.A;
        if (j7eVar != null) {
            j7eVar.d(this, DepositFloatingIconPage.IV);
        } else {
            Intrinsics.n("depositToUnlockBtManager");
            throw null;
        }
    }

    public final com.sportybet.android.instantwin.presentation.buildandgo.f z1() {
        return (com.sportybet.android.instantwin.presentation.buildandgo.f) this.e.getValue();
    }
}
