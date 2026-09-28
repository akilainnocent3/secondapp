package com.sportygames.lobby.views.fragment;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.appsflyer.internal.u;
import com.google.android.material.tabs.TabLayout;
import com.google.protobuf.Reader;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.ServiceObserver;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.utils.CasinoLogger;
import com.sportygames.lobby.remote.models.BannerDetailResponse;
import com.sportygames.lobby.remote.models.CategoriesResponse;
import com.sportygames.lobby.utils.VerticalViewPager;
import com.sportygames.lobby.views.LobbyBannerPlaceHolder;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import com.sportygames.sportyherov2.utils.FadingEdgeLayout;
import defpackage.bk60;
import defpackage.bmy;
import defpackage.ck60;
import defpackage.cn80;
import defpackage.cqc;
import defpackage.cyb;
import defpackage.d5f0;
import defpackage.do80;
import defpackage.dq7;
import defpackage.dvj;
import defpackage.ea50;
import defpackage.ej5;
import defpackage.fq5;
import defpackage.fvj;
import defpackage.g1t;
import defpackage.g6i0;
import defpackage.h5e;
import defpackage.haj;
import defpackage.hb5;
import defpackage.hec;
import defpackage.hre;
import defpackage.hv70;
import defpackage.hx1;
import defpackage.iu6;
import defpackage.ivj;
import defpackage.jct;
import defpackage.jf1;
import defpackage.jq40;
import defpackage.jvd0;
import defpackage.jvj;
import defpackage.kf1;
import defpackage.kvj;
import defpackage.l12;
import defpackage.lct;
import defpackage.lfy;
import defpackage.lo80;
import defpackage.lvj;
import defpackage.nvj;
import defpackage.o8d;
import defpackage.o8i0;
import defpackage.op5;
import defpackage.paj;
import defpackage.po80;
import defpackage.qvj;
import defpackage.r0t;
import defpackage.r7i0;
import defpackage.r8i0;
import defpackage.rvj;
import defpackage.s8i0;
import defpackage.sn6;
import defpackage.ssw;
import defpackage.t7i0;
import defpackage.tp80;
import defpackage.v8i0;
import defpackage.ve1;
import defpackage.vj5;
import defpackage.vlr;
import defpackage.w1t;
import defpackage.wa50;
import defpackage.whs;
import defpackage.wuj;
import defpackage.wz;
import defpackage.xa50;
import defpackage.xnh0;
import defpackage.xp6;
import defpackage.xuj;
import defpackage.xwj;
import defpackage.xzk;
import defpackage.yjj;
import defpackage.yn80;
import defpackage.zj60;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sportygames/lobby/views/fragment/GamesLobbyMainFragment;", "Ll12;", "Ljct;", "Lcn80;", "", "Lr0t;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GamesLobbyMainFragment extends l12<jct, cn80> implements r0t {
    public static boolean Z;
    public hx1 A;
    public int E;
    public int F;
    public Timer G;
    public fq5 H;
    public List<BannerDetailResponse> I;
    public wuj K;
    public hec M;
    public hv70 N;
    public ck60 O;
    public jvd0 Q;
    public nvj S;
    public List<? extends File> U;
    public boolean W;
    public boolean Y;
    public boolean c;
    public Bundle d;
    public jct f;
    public boolean i;
    public ViewPager2 v;
    public ViewPager2 w;
    public g1t z;
    public final yjj e = new yjj();
    public String y = "";
    public final ArrayList<CategoriesResponse> B = new ArrayList<>();
    public String C = "All";
    public String D = "";
    public final Handler J = new Handler(Looper.getMainLooper());
    public final String L = "My Fav";
    public Boolean P = Boolean.FALSE;
    public final ArrayList<CategoriesResponse> R = new ArrayList<>();
    public String T = "";
    public String V = "en";
    public String X = "";

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            wuj wujVar;
            GamesLobbyMainFragment gamesLobbyMainFragment = GamesLobbyMainFragment.this;
            if (!gamesLobbyMainFragment.requireActivity().hasWindowFocus() || (wujVar = gamesLobbyMainFragment.K) == null) {
                return;
            }
            gamesLobbyMainFragment.J.post(wujVar);
        }
    }

    public static final class c implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public c(Function1 function1) {
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

    public static final class d implements wa50<Drawable> {
        public final /* synthetic */ hec a;

        public d(hec hecVar) {
            this.a = hecVar;
        }

        @Override // defpackage.wa50
        public final boolean f(Drawable drawable, Object obj, d5f0<Drawable> d5f0Var, cqc cqcVar, boolean z) {
            this.a.b.setAlpha(1.0f);
            return false;
        }

        @Override // defpackage.wa50
        public final boolean l(xzk xzkVar, Object obj, d5f0<Drawable> d5f0Var, boolean z) {
            this.a.b.setAlpha(0.5f);
            return false;
        }
    }

    public static void y0(String str, String str2) {
        zj60 bridge;
        Bundle bundleA = whs.a("banner_position", str, "banner_game", str2);
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
            return;
        }
        ((bk60) bridge).a("lobby_carousel_click", bundleA);
    }

    public static void z0(String str, String str2, String str3) {
        zj60 bridge;
        String str4 = SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in";
        Bundle bundleA = whs.a("category_name", str, "source_screen", str3);
        bundleA.putString("tile_position", str2);
        bundleA.putString("user_state", str4);
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
            return;
        }
        ((bk60) bridge).a("category_visit", bundleA);
    }

    @Override // defpackage.r0t
    public final void A() {
        r0();
    }

    public final void C0(ArrayList<CategoriesResponse> arrayList) {
        ViewPager2 viewPager2;
        ViewPager2 viewPager3;
        try {
            cn80 cn80Var = (cn80) this.b;
            TabLayout tabLayout = cn80Var != null ? cn80Var.C : null;
            tabLayout.getClass();
            int i = 0;
            this.z = new g1t(this, this, tabLayout, this.d, arrayList, this.y.length() > 0, kotlin.collections.b.f("sg_lobby_banner", "sg_lobby_categories", "sg_lobby", "sg_game_common", "sg_common", "sg_exit_dialog"));
            ViewPager2 viewPager4 = this.v;
            if (viewPager4 != null) {
                viewPager4.setSaveEnabled(false);
            }
            ViewPager2 viewPager5 = this.v;
            if (viewPager5 != null) {
                g1t g1tVar = this.z;
                if (g1tVar == null) {
                    Intrinsics.n("adapter");
                    throw null;
                }
                viewPager5.setAdapter(g1tVar);
            }
            if (arrayList == null || arrayList.isEmpty()) {
                Integer num = SportyGamesManager.LobbyCurrentPage;
                if (num != null && num.intValue() == -1) {
                    ViewPager2 viewPager6 = this.v;
                    if (viewPager6 != null) {
                        viewPager6.setCurrentItem(0);
                    }
                } else if (num != null && num.intValue() == -2 && (viewPager2 = this.v) != null) {
                    viewPager2.setCurrentItem(1);
                }
            }
            Bundle bundle = this.d;
            if (bundle != null && !bundle.isEmpty()) {
                ViewPager2 viewPager7 = this.v;
                if (viewPager7 != null) {
                    viewPager7.setCurrentItem(0);
                    return;
                }
                return;
            }
            for (CategoriesResponse categoriesResponse : arrayList) {
                int i2 = i + 1;
                if (categoriesResponse.getId().length() > 0) {
                    int i3 = Integer.parseInt(categoriesResponse.getId());
                    Integer num2 = SportyGamesManager.LobbyCurrentPage;
                    if (num2 != null && i3 == num2.intValue() && (viewPager3 = this.v) != null) {
                        viewPager3.setCurrentItem(i);
                    }
                }
                i = i2;
            }
        } catch (Exception unused) {
        }
    }

    public final void D0(String str, String str2, String str3, final int i, boolean z) {
        TabLayout.g gVarK;
        TabLayout.g gVarK2;
        ViewTreeObserver viewTreeObserver;
        try {
            Context context = getContext();
            if (context != null) {
                TabLayout.g gVarL = null;
                final hec hecVarA = hec.a(LayoutInflater.from(context).inflate(R.layout.custom_lobby_tab_layout, (ViewGroup) null, false));
                ConstraintLayout constraintLayout = hecVarA.d;
                AppCompatTextView appCompatTextView = hecVarA.c;
                AppCompatImageView appCompatImageView = hecVarA.b;
                if (kotlin.text.c.l(str2, "All", false)) {
                    appCompatImageView.setImageResource(R.drawable.all_category);
                } else if (kotlin.text.c.l(str2, this.L, false)) {
                    appCompatImageView.setImageResource(R.drawable.my_fav_category);
                } else {
                    appCompatImageView.setAlpha(0.3f);
                    xa50 xa50VarD = com.bumptech.glide.a.b(getContext()).d(this);
                    xa50VarD.getClass();
                    ea50 ea50VarP = xa50VarD.f(Drawable.class).P(str3);
                    ea50VarP.getClass();
                    po80 po80Var = new po80(xa50VarD, str3, ea50VarP, lo80.a);
                    po80Var.f = new d(hecVarA);
                    po80Var.f(R.drawable.placeholder_category);
                    hre.a aVar = hre.a;
                    aVar.getClass();
                    po80Var.c(aVar);
                    po80Var.e(appCompatImageView);
                }
                appCompatTextView.setSelected(true);
                appCompatTextView.setText(str2);
                op5.r(op5.a, kotlin.collections.b.f(appCompatTextView), null, 4);
                B b2 = this.b;
                cn80 cn80Var = (cn80) b2;
                if (cn80Var != null) {
                    TabLayout tabLayout = cn80Var.C;
                    cn80 cn80Var2 = (cn80) b2;
                    if (cn80Var2 != null) {
                        gVarL = cn80Var2.C.l();
                        int i2 = str != null ? Integer.parseInt(str) : -1;
                        gVarL.i = i2;
                        TabLayout.TabView tabView = gVarL.h;
                        if (tabView != null) {
                            tabView.setId(i2);
                        }
                    }
                    gVarL.getClass();
                    gVarL.a = str2;
                    tabLayout.d(gVarL, false);
                }
                cn80 cn80Var3 = (cn80) this.b;
                if (cn80Var3 != null && (viewTreeObserver = cn80Var3.C.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: yuj
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            GamesLobbyMainFragment gamesLobbyMainFragment = this.a;
                            cn80 cn80Var4 = (cn80) gamesLobbyMainFragment.b;
                            FadingEdgeLayout fadingEdgeLayout = cn80Var4 != null ? cn80Var4.c : null;
                            ViewGroup.LayoutParams layoutParams = fadingEdgeLayout != null ? fadingEdgeLayout.getLayoutParams() : null;
                            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                                cn80 cn80Var5 = (cn80) gamesLobbyMainFragment.b;
                                if ((cn80Var5 != null ? cn80Var5.C.getScrollX() : 0) > 0) {
                                    fadingEdgeLayout.setFadeEdges(false, true, false, false);
                                    ((RelativeLayout.LayoutParams) layoutParams).setMargins(10, 0, 0, 0);
                                } else {
                                    fadingEdgeLayout.setFadeEdges(false, false, false, false);
                                    ((RelativeLayout.LayoutParams) layoutParams).setMargins(20, 0, 0, 0);
                                }
                                fadingEdgeLayout.setLayoutParams(layoutParams);
                            }
                        }
                    });
                }
                if (z) {
                    cn80 cn80Var4 = (cn80) this.b;
                    if (cn80Var4 != null && (gVarK = cn80Var4.C.k(i)) != null) {
                        gVarK.e(str2);
                    }
                    cn80 cn80Var5 = (cn80) this.b;
                    if (cn80Var5 != null) {
                        cn80Var5.C.setSelectedTabIndicatorHeight(5);
                        return;
                    }
                    return;
                }
                constraintLayout.setBackgroundResource(R.drawable.category_tab_selector);
                cn80 cn80Var6 = (cn80) this.b;
                if (cn80Var6 != null) {
                    cn80Var6.C.setSelectedTabIndicatorHeight(0);
                }
                cn80 cn80Var7 = (cn80) this.b;
                if (cn80Var7 != null && (gVarK2 = cn80Var7.C.k(i)) != null) {
                    gVarK2.c(constraintLayout);
                }
                constraintLayout.setOnTouchListener(new View.OnTouchListener() { // from class: zuj
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        ConstraintLayout constraintLayout2 = hecVarA.d;
                        int action = motionEvent.getAction();
                        GamesLobbyMainFragment gamesLobbyMainFragment = this.a;
                        if (action == 0) {
                            constraintLayout2.getClass();
                            gamesLobbyMainFragment.w0(constraintLayout2, R.animator.category_on_press);
                            return true;
                        }
                        if (action != 1) {
                            if (action != 3) {
                                return false;
                            }
                            constraintLayout2.getClass();
                            gamesLobbyMainFragment.w0(constraintLayout2, R.animator.category_on_release);
                            return false;
                        }
                        constraintLayout2.getClass();
                        gamesLobbyMainFragment.w0(constraintLayout2, R.animator.category_on_release);
                        cn80 cn80Var8 = (cn80) gamesLobbyMainFragment.b;
                        if (cn80Var8 == null) {
                            return false;
                        }
                        TabLayout tabLayout2 = cn80Var8.C;
                        tabLayout2.s(tabLayout2.k(i), true);
                        return false;
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    public final void E0() {
        try {
            cn80 cn80Var = (cn80) this.b;
            if (cn80Var != null) {
                cn80Var.C.n();
            }
            D0("-1", "All", "", 0, true);
            ViewPager2 viewPager2 = this.v;
            ViewGroup.LayoutParams layoutParams = viewPager2 != null ? viewPager2.getLayoutParams() : null;
            layoutParams.getClass();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (this.y.length() > 0) {
                D0("-2", "My Favourites", "", 1, true);
                cn80 cn80Var2 = (cn80) this.b;
                if (cn80Var2 != null) {
                    cn80Var2.G.setVisibility(0);
                }
                cn80 cn80Var3 = (cn80) this.b;
                if (cn80Var3 != null) {
                    cn80Var3.C.setVisibility(0);
                }
                cn80 cn80Var4 = (cn80) this.b;
                if (cn80Var4 != null) {
                    cn80Var4.D.setVisibility(0);
                }
                cn80 cn80Var5 = (cn80) this.b;
                if (cn80Var5 != null) {
                    cn80Var5.e.setVisibility(8);
                }
                layoutParams2.setMargins(0, 0, 0, 0);
            } else {
                cn80 cn80Var6 = (cn80) this.b;
                if (cn80Var6 != null) {
                    cn80Var6.G.setVisibility(8);
                }
                cn80 cn80Var7 = (cn80) this.b;
                if (cn80Var7 != null) {
                    cn80Var7.C.setVisibility(8);
                }
                cn80 cn80Var8 = (cn80) this.b;
                if (cn80Var8 != null) {
                    cn80Var8.D.setVisibility(8);
                }
                cn80 cn80Var9 = (cn80) this.b;
                if (cn80Var9 != null) {
                    cn80Var9.e.setVisibility(8);
                }
                layoutParams2.setMargins(0, (int) getResources().getDimension(R.dimen._8sdp), 0, 0);
            }
            ViewPager2 viewPager3 = this.v;
            if (viewPager3 != null) {
                viewPager3.setLayoutParams(layoutParams2);
            }
            cn80 cn80Var10 = (cn80) this.b;
            if (cn80Var10 != null) {
                cn80Var10.C.setTabMode(1);
            }
            cn80 cn80Var11 = (cn80) this.b;
            ViewGroup.LayoutParams layoutParams3 = cn80Var11 != null ? cn80Var11.G.getLayoutParams() : null;
            layoutParams3.getClass();
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.height = (int) getResources().getDimension(R.dimen._45sdp);
            cn80 cn80Var12 = (cn80) this.b;
            if (cn80Var12 != null) {
                cn80Var12.G.setLayoutParams(layoutParams4);
            }
            cn80 cn80Var13 = (cn80) this.b;
            ViewGroup.LayoutParams layoutParams5 = cn80Var13 != null ? cn80Var13.C.getLayoutParams() : null;
            layoutParams5.getClass();
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
            layoutParams6.height = (int) getResources().getDimension(R.dimen._45sdp);
            cn80 cn80Var14 = (cn80) this.b;
            if (cn80Var14 != null) {
                cn80Var14.C.setPadding(0, 0, 0, (int) getResources().getDimension(R.dimen._8sdp));
            }
            cn80 cn80Var15 = (cn80) this.b;
            if (cn80Var15 != null) {
                cn80Var15.C.setLayoutParams(layoutParams6);
            }
        } catch (Exception unused) {
        }
    }

    public final void F0(String str, String str2) {
        cn80 cn80Var = (cn80) this.b;
        if (cn80Var != null) {
            cn80Var.F.setVisibility(0);
        }
        cn80 cn80Var2 = (cn80) this.b;
        if (cn80Var2 != null) {
            cn80Var2.d.d.setText(str);
        }
        cn80 cn80Var3 = (cn80) this.b;
        if (cn80Var3 != null) {
            cn80Var3.d.e.setText(str2);
        }
        cn80 cn80Var4 = (cn80) this.b;
        op5.r(op5.a, kotlin.collections.b.f(cn80Var4 != null ? cn80Var4.d.i : null), null, 4);
    }

    public final void G0() {
        cn80 cn80Var = (cn80) this.b;
        if (cn80Var != null) {
            cn80Var.f.setVisibility(0);
        }
        cn80 cn80Var2 = (cn80) this.b;
        if (cn80Var2 != null) {
            cn80Var2.E.setVisibility(4);
        }
        cn80 cn80Var3 = (cn80) this.b;
        if (cn80Var3 != null) {
            cn80Var3.f.setLayoutManager(null);
        }
        cn80 cn80Var4 = (cn80) this.b;
        if (cn80Var4 != null) {
            cn80Var4.f.setAdapter(null);
        }
        cn80 cn80Var5 = (cn80) this.b;
        if (cn80Var5 != null) {
            RecyclerView recyclerView = cn80Var5.f;
            requireContext();
            recyclerView.setLayoutManager(new GamesLobbyMainFragment$showSgShimmer$1(2));
        }
        cn80 cn80Var6 = (cn80) this.b;
        if (cn80Var6 != null) {
            cn80Var6.f.setAdapter(new w1t());
        }
    }

    public final void H0(boolean z) {
        ViewPager2 viewPager2 = this.v;
        if (viewPager2 != null) {
            viewPager2.setUserInputEnabled(z);
        }
    }

    @Override // defpackage.r0t
    public final void M() {
        s0();
    }

    @Override // defpackage.r0t
    public final void a0() {
        jct jctVar = this.f;
        if (jctVar != null) {
            ej5.c(o8i0.d(jctVar), null, null, new lct(jctVar, null, null), 3);
        } else {
            Intrinsics.n("viewModelLobby");
            throw null;
        }
    }

    @Override // defpackage.r0t
    public final void e0() {
        this.c = true;
        if (t0()) {
            hv70 hv70Var = this.N;
            if (hv70Var != null) {
                hv70Var.p0();
            }
            this.N = null;
            getChildFragmentManager().Y();
        }
    }

    @Override // defpackage.l12
    public final g6i0 o0() {
        View viewInflate = getLayoutInflater().inflate(R.layout.sg_activity_lobby, (ViewGroup) null, false);
        int i = R.id.banner_shimmer;
        LobbyBannerPlaceHolder lobbyBannerPlaceHolder = (LobbyBannerPlaceHolder) h5e.a(R.id.banner_shimmer, viewInflate);
        if (lobbyBannerPlaceHolder != null) {
            i = R.id.fade;
            FadingEdgeLayout fadingEdgeLayout = (FadingEdgeLayout) h5e.a(R.id.fade, viewInflate);
            if (fadingEdgeLayout != null) {
                i = R.id.include_layout;
                View viewA = h5e.a(R.id.include_layout, viewInflate);
                if (viewA != null) {
                    yn80 yn80VarA = yn80.a(viewA);
                    i = R.id.lobby_category_shimmer;
                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.lobby_category_shimmer, viewInflate);
                    if (recyclerView != null) {
                        i = R.id.lobby_list_shimmer;
                        RecyclerView recyclerView2 = (RecyclerView) h5e.a(R.id.lobby_list_shimmer, viewInflate);
                        if (recyclerView2 != null) {
                            i = R.id.not_image;
                            if (((ImageView) h5e.a(R.id.not_image, viewInflate)) != null) {
                                i = R.id.notification_layout;
                                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.notification_layout, viewInflate);
                                if (constraintLayout != null) {
                                    i = R.id.notification_list;
                                    VerticalViewPager verticalViewPager = (VerticalViewPager) h5e.a(R.id.notification_list, viewInflate);
                                    if (verticalViewPager != null) {
                                        i = R.id.notification_shimmer;
                                        LobbyBannerPlaceHolder lobbyBannerPlaceHolder2 = (LobbyBannerPlaceHolder) h5e.a(R.id.notification_shimmer, viewInflate);
                                        if (lobbyBannerPlaceHolder2 != null) {
                                            i = R.id.search_fragment;
                                            FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.search_fragment, viewInflate);
                                            if (frameLayout != null) {
                                                i = R.id.sg_banner_viewpager;
                                                ViewPager2 viewPager2 = (ViewPager2) h5e.a(R.id.sg_banner_viewpager, viewInflate);
                                                if (viewPager2 != null) {
                                                    i = R.id.sg_search_tab;
                                                    View viewA2 = h5e.a(R.id.sg_search_tab, viewInflate);
                                                    if (viewA2 != null) {
                                                        hec hecVarA = hec.a(viewA2);
                                                        i = R.id.sg_search_tooltip;
                                                        View viewA3 = h5e.a(R.id.sg_search_tooltip, viewInflate);
                                                        if (viewA3 != null) {
                                                            TextView textView = (TextView) h5e.a(R.id.sg_search_tooltip_text, viewA3);
                                                            if (textView == null) {
                                                                bmy.a("Missing required view with ID: ".concat(viewA3.getResources().getResourceName(R.id.sg_search_tooltip_text)));
                                                                return null;
                                                            }
                                                            tp80 tp80Var = new tp80((ConstraintLayout) viewA3, textView);
                                                            int i2 = R.id.sg_tab_layout;
                                                            TabLayout tabLayout = (TabLayout) h5e.a(R.id.sg_tab_layout, viewInflate);
                                                            if (tabLayout != null) {
                                                                i2 = R.id.sg_view;
                                                                View viewA4 = h5e.a(R.id.sg_view, viewInflate);
                                                                if (viewA4 != null) {
                                                                    i2 = R.id.sg_viewpager;
                                                                    ViewPager2 viewPager3 = (ViewPager2) h5e.a(R.id.sg_viewpager, viewInflate);
                                                                    if (viewPager3 != null) {
                                                                        i2 = R.id.swipe_container_error;
                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe_container_error, viewInflate);
                                                                        if (swipeRefreshLayout != null) {
                                                                            i2 = R.id.tab_relative;
                                                                            RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.tab_relative, viewInflate);
                                                                            if (relativeLayout != null) {
                                                                                i2 = R.id.toolbar_layout;
                                                                                View viewA5 = h5e.a(R.id.toolbar_layout, viewInflate);
                                                                                if (viewA5 != null) {
                                                                                    return new cn80((ConstraintLayout) viewInflate, lobbyBannerPlaceHolder, fadingEdgeLayout, yn80VarA, recyclerView, recyclerView2, constraintLayout, verticalViewPager, lobbyBannerPlaceHolder2, frameLayout, viewPager2, hecVarA, tp80Var, tabLayout, viewA4, viewPager3, swipeRefreshLayout, relativeLayout, do80.a(viewA5));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            i = i2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        hv70 hv70Var = this.N;
        if (hv70Var != null) {
            hv70Var.p0();
        }
        this.N = null;
        this.H = null;
        jct jctVar = this.f;
        if (jctVar != null) {
            jctVar.b.l(this);
            jctVar.f.l(this);
            jctVar.i.l(this);
            jctVar.c.l(this);
            jctVar.d.l(this);
            jctVar.e.l(this);
            jctVar.v.l(this);
            jctVar.A.l(this);
            jctVar.G.l(this);
            jctVar.H.l(this);
            jctVar.I.l(this);
        }
        if (this.X.length() == 0) {
            SportyGamesManager.setCurrentLanguageCode("");
        }
        Timer timer = this.G;
        if (timer != null) {
            timer.cancel();
        }
        this.B.clear();
        this.R.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        cn80 cn80Var;
        super.onPause();
        Z = false;
        Timer timer = this.G;
        if (timer != null) {
            timer.cancel();
        }
        try {
            cn80 cn80Var2 = (cn80) this.b;
            if (cn80Var2 != null) {
                VerticalViewPager.a aVar = cn80Var2.v.E0;
                aVar.getClass();
                aVar.removeMessages(0);
            }
        } catch (Exception unused) {
        }
        nvj nvjVar = this.S;
        if (nvjVar == null || (cn80Var = (cn80) this.b) == null) {
            return;
        }
        cn80Var.z.f(nvjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        fq5 fq5Var;
        cn80 cn80Var;
        super.onResume();
        wz.a("LobbyVisit", "Android", new String[0]);
        CasinoLogger.INSTANCE.logEventToCasino("LobbyVisit", vj5.a(new Pair("Platform", "ANDROID"), new Pair("countryCode", this.D)));
        Context context = getContext();
        if (context != null) {
            SportyGamesManager.setApplicationContext(context.getApplicationContext());
        }
        op5.a.getClass();
        op5.d = 0L;
        Boolean boolValueOf = null;
        if (this.i) {
            if (this.Y) {
                this.Y = false;
                s0();
                cn80 cn80Var2 = (cn80) this.b;
                if (cn80Var2 != null) {
                    cn80Var2.C.setVisibility(4);
                }
            }
            jct jctVar = this.f;
            if (jctVar != null) {
                cn80 cn80Var3 = (cn80) this.b;
                ej5.c(o8i0.d(jctVar), null, null, new lct(jctVar, u.a("user_logged_in_status", String.valueOf(cn80Var3 != null && cn80Var3.H.v.getVisibility() == 8)), null), 3);
            }
            Z = true;
            ViewPager2 viewPager2 = this.v;
            if (viewPager2 != null) {
                viewPager2.post(new Runnable() { // from class: gvj
                    @Override // java.lang.Runnable
                    public final void run() {
                        RecyclerView.f adapter;
                        try {
                            ViewPager2 viewPager3 = this.a.v;
                            if (viewPager3 == null || (adapter = viewPager3.getAdapter()) == null) {
                                return;
                            }
                            adapter.notifyDataSetChanged();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
            ViewPager2 viewPager3 = this.w;
            if (viewPager3 != null) {
                viewPager3.post(new Runnable() { // from class: hvj
                    @Override // java.lang.Runnable
                    public final void run() {
                        RecyclerView.f adapter;
                        try {
                            ViewPager2 viewPager4 = this.a.w;
                            if (viewPager4 == null || (adapter = viewPager4.getAdapter()) == null) {
                                return;
                            }
                            adapter.notifyDataSetChanged();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
            List<BannerDetailResponse> list = this.I;
            if (list == null || !(!list.isEmpty())) {
                cn80 cn80Var4 = (cn80) this.b;
                if (cn80Var4 != null) {
                    cn80Var4.z.post(new ivj(this, null == true ? 1 : 0));
                }
            } else {
                hx1 hx1Var = this.A;
                if ((hx1Var != null ? hx1Var.y.size() : -1) >= 0) {
                    this.G = new Timer();
                    b bVar = new b();
                    Timer timer = this.G;
                    if (timer == null) {
                        Intrinsics.n("timer");
                        throw null;
                    }
                    timer.schedule(bVar, 2500L, 2500L);
                }
            }
            nvj nvjVar = this.S;
            if (nvjVar != null && (cn80Var = (cn80) this.b) != null) {
                cn80Var.z.c(nvjVar);
            }
        }
        if (!Intrinsics.g(SportyGamesManager.getInstance().getLanguageCode(), this.T)) {
            SportyGamesManager.setCurrentLanguageCode(SportyGamesManager.getInstance().getLanguageCode());
            String languageCode = SportyGamesManager.getInstance().getLanguageCode();
            languageCode.getClass();
            this.T = languageCode;
            ArrayList<String> arrayList = vlr.a.get("lobby");
            if (arrayList != null && arrayList.contains(SportyGamesManager.getInstance().getLanguageCode())) {
                this.V = xwj.a();
            }
            Context context2 = getContext();
            if (context2 != null && (fq5Var = this.H) != null) {
                fq5Var.x1(context2, kotlin.collections.b.f("currency_symbols", "sg_lobby_banner", "sg_lobby_categories", "sg_lobby", "sg_game_common", "sg_common", "sg_common_dialog_message", "sg_exit_dialog"), this.V);
            }
        }
        op5.b = this.U;
        this.i = true;
        ck60 ck60Var = this.O;
        if (ck60Var != null) {
            SharedPreferences sharedPreferences = ck60Var.a;
            boolValueOf = Boolean.valueOf(sharedPreferences != null ? sharedPreferences.getBoolean("search_visited", false) : false);
        }
        this.P = boolValueOf;
    }

    /* JADX WARN: Type inference failed for: r7v52, types: [wuj] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ssw<LoadingState<List<File>>> sswVar;
        view.getClass();
        super.onViewCreated(view, bundle);
        SportyGamesManager.setApplicationContext(requireContext().getApplicationContext());
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(fq5.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.H = (fq5) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        Bundle arguments = getArguments();
        this.e.getClass();
        this.d = yjj.f(arguments);
        fq5 fq5Var = this.H;
        int i = 1;
        if (fq5Var != null && (sswVar = fq5Var.c) != null) {
            sswVar.f(getViewLifecycleOwner(), new c(new ve1(this, i)));
        }
        String country = SportyGamesManager.getInstance().getCountry();
        if (country != null) {
            Locale locale = SportyGamesManager.locale;
            locale.getClass();
            String upperCase = country.toUpperCase(locale);
            upperCase.getClass();
            this.D = upperCase;
        }
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        dq7 dq7VarA2 = jq40.a(jct.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.f = (jct) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        if (Intrinsics.g(SportyGamesManager.getInstance().getLanguageCode(), SportyGamesManager.getCurrentLanguageCode())) {
            this.T = xwj.a();
            u0();
        }
        cn80 cn80Var = (cn80) this.b;
        this.v = cn80Var != null ? cn80Var.E : null;
        if ((cn80Var != null ? new r7i0(cn80Var.E) : null) != null) {
            r7i0 r7i0Var = cn80Var != null ? new r7i0(cn80Var.E) : null;
            r7i0Var.getClass();
            Iterator<View> it = r7i0Var.iterator();
            while (true) {
                t7i0 t7i0Var = (t7i0) it;
                if (!t7i0Var.hasNext()) {
                    break;
                }
                View view2 = (View) t7i0Var.next();
                if (view2 instanceof RecyclerView) {
                    ((RecyclerView) view2).setId(Reader.READ_DONE);
                    break;
                }
            }
        }
        ViewPager2 viewPager2 = this.v;
        if (viewPager2 != null) {
            viewPager2.setOffscreenPageLimit(1);
        }
        cn80 cn80Var2 = (cn80) this.b;
        this.w = cn80Var2 != null ? cn80Var2.z : null;
        if ((cn80Var2 != null ? new r7i0(cn80Var2.z) : null) != null && cn80Var2 != null) {
            Iterator<View> it2 = new r7i0(cn80Var2.z).iterator();
            while (true) {
                t7i0 t7i0Var2 = (t7i0) it2;
                if (!t7i0Var2.hasNext()) {
                    break;
                }
                View view3 = (View) t7i0Var2.next();
                if (view3 instanceof RecyclerView) {
                    ((RecyclerView) view3).setId(Reader.READ_DONE);
                    break;
                }
            }
        }
        s0();
        Context context = getContext();
        if (context != null) {
            this.O = new ck60(context, "sg_user_search");
        }
        cn80 cn80Var3 = (cn80) this.b;
        int i2 = 0;
        if (cn80Var3 != null) {
            cn80Var3.H.c.setVisibility(0);
        }
        cn80 cn80Var4 = (cn80) this.b;
        if (cn80Var4 != null) {
            cn80Var4.H.y.setVisibility(8);
        }
        cn80 cn80Var5 = (cn80) this.b;
        if (cn80Var5 != null) {
            cn80Var5.H.b.setVisibility(8);
        }
        try {
            Context context2 = getContext();
            if (context2 != null) {
                context2.startService(new Intent(context2, (Class<?>) ServiceObserver.class));
            }
        } catch (Exception unused) {
        }
        jct jctVar = this.f;
        if (jctVar == null) {
            Intrinsics.n("viewModelLobby");
            throw null;
        }
        jctVar.b.f(getViewLifecycleOwner(), new c(new xp6(this, i)));
        jct jctVar2 = this.f;
        if (jctVar2 == null) {
            Intrinsics.n("viewModelLobby");
            throw null;
        }
        jctVar2.A.f(getViewLifecycleOwner(), new c(new jf1(this, i)));
        jct jctVar3 = this.f;
        if (jctVar3 == null) {
            Intrinsics.n("viewModelLobby");
            throw null;
        }
        jctVar3.G.f(getViewLifecycleOwner(), new c(new xuj(this, i2)));
        jct jctVar4 = this.f;
        if (jctVar4 == null) {
            Intrinsics.n("viewModelLobby");
            throw null;
        }
        jctVar4.i.f(getViewLifecycleOwner(), new c(new sn6(this, 1)));
        jct jctVar5 = this.f;
        if (jctVar5 == null) {
            Intrinsics.n("viewModelLobby");
            throw null;
        }
        jctVar5.H.f(getViewLifecycleOwner(), new c(new kf1(this, i)));
        cn80 cn80Var6 = (cn80) this.b;
        if (cn80Var6 != null) {
            cn80Var6.H.i.setOnClickListener(new jvj());
        }
        cn80 cn80Var7 = (cn80) this.b;
        if (cn80Var7 != null) {
            cn80Var7.H.w.setOnClickListener(new kvj());
        }
        cn80 cn80Var8 = (cn80) this.b;
        if (cn80Var8 != null) {
            cn80Var8.H.A.setOnClickListener(new lvj());
        }
        ViewPager2 viewPager3 = this.v;
        if (viewPager3 != null) {
            viewPager3.c(new qvj(this));
        }
        cn80 cn80Var9 = (cn80) this.b;
        if (cn80Var9 != null) {
            cn80Var9.C.a(new rvj(this));
        }
        this.K = new Runnable() { // from class: wuj
            @Override // java.lang.Runnable
            public final void run() {
                GamesLobbyMainFragment gamesLobbyMainFragment = this.a;
                List<BannerDetailResponse> list = gamesLobbyMainFragment.I;
                if (list == null || gamesLobbyMainFragment.E != list.size()) {
                    cn80 cn80Var10 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var10 != null) {
                        ViewPager2 viewPager4 = cn80Var10.z;
                        int i3 = gamesLobbyMainFragment.E;
                        gamesLobbyMainFragment.E = i3 + 1;
                        viewPager4.setCurrentItem(i3, true);
                        return;
                    }
                    return;
                }
                gamesLobbyMainFragment.E = 0;
                cn80 cn80Var11 = (cn80) gamesLobbyMainFragment.b;
                if (cn80Var11 != null) {
                    ViewPager2 viewPager5 = cn80Var11.z;
                    gamesLobbyMainFragment.E = 1;
                    viewPager5.setCurrentItem(0, false);
                }
            }
        };
        cn80 cn80Var10 = (cn80) this.b;
        if (cn80Var10 != null) {
            cn80Var10.H.d.setOnClickListener(new dvj());
        }
        cn80 cn80Var11 = (cn80) this.b;
        if (cn80Var11 != null) {
            cn80Var11.d.i.setOnClickListener(new fvj(this, i2));
        }
    }

    public final void p0() {
        Bundle bundle = this.d;
        if (bundle != null) {
            String string = bundle.containsKey("game") ? bundle.getString("game") : null;
            if (string != null) {
                Map<String, String> map = o8d.a;
                String str = o8d.a.get(URLEncoder.encode(string, "UTF-8"));
                jct jctVar = this.f;
                if (str != null) {
                    if (jctVar != null) {
                        jctVar.B1(str);
                        return;
                    } else {
                        Intrinsics.n("viewModelLobby");
                        throw null;
                    }
                }
                if (jctVar != null) {
                    jctVar.B1(string);
                } else {
                    Intrinsics.n("viewModelLobby");
                    throw null;
                }
            }
        }
    }

    public final void q0() {
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if ((sportyGamesManager != null ? sportyGamesManager.getBridge() : null) == null) {
            Intent intent = new Intent();
            intent.setAction("com.sportybet.android.game.REOPEN_GAME_LOBBY");
            Context context = getContext();
            intent.setPackage(context != null ? context.getPackageName() : null);
            Context context2 = getContext();
            if (context2 != null) {
                context2.sendBroadcast(intent);
            }
        }
    }

    @Override // defpackage.r0t
    public final void r() {
        this.Y = true;
    }

    public final void r0() {
        cn80 cn80Var = (cn80) this.b;
        if (cn80Var != null) {
            cn80Var.f.setVisibility(8);
        }
        cn80 cn80Var2 = (cn80) this.b;
        if (cn80Var2 != null) {
            cn80Var2.E.setVisibility(0);
        }
    }

    public final void s0() {
        cn80 cn80Var = (cn80) this.b;
        if (cn80Var != null) {
            cn80Var.f.setVisibility(0);
        }
        cn80 cn80Var2 = (cn80) this.b;
        if (cn80Var2 != null) {
            cn80Var2.E.setVisibility(4);
        }
        cn80 cn80Var3 = (cn80) this.b;
        if (cn80Var3 != null) {
            RecyclerView recyclerView = cn80Var3.f;
            requireContext();
            recyclerView.setLayoutManager(new GamesLobbyMainFragment$initializeSgShimmerList$1(2));
        }
        cn80 cn80Var4 = (cn80) this.b;
        if (cn80Var4 != null) {
            cn80Var4.f.setAdapter(new w1t());
        }
        cn80 cn80Var5 = (cn80) this.b;
        if (cn80Var5 != null) {
            cn80Var5.e.setVisibility(0);
        }
        cn80 cn80Var6 = (cn80) this.b;
        if (cn80Var6 != null) {
            cn80Var6.G.setVisibility(0);
        }
        cn80 cn80Var7 = (cn80) this.b;
        if (cn80Var7 != null) {
            RecyclerView recyclerView2 = cn80Var7.e;
            requireContext();
            recyclerView2.setLayoutManager(new GamesLobbyMainFragment$initializeSgShimmerList$2(0, false));
        }
        cn80 cn80Var8 = (cn80) this.b;
        if (cn80Var8 != null) {
            cn80Var8.e.setAdapter(new iu6());
        }
    }

    @Override // defpackage.r0t
    public final void t() {
        ViewPager2 viewPager2;
        ArrayList<CategoriesResponse> arrayList = this.B;
        try {
            ViewPager2 viewPager3 = this.v;
            Integer numValueOf = viewPager3 != null ? Integer.valueOf(viewPager3.getCurrentItem()) : null;
            if (numValueOf == null || arrayList.get(numValueOf.intValue()).getId().equals(SportyGamesManager.LobbyCurrentPage)) {
                return;
            }
            int i = 0;
            for (CategoriesResponse categoriesResponse : arrayList) {
                int i2 = i + 1;
                if (categoriesResponse.getId().length() > 0) {
                    int i3 = Integer.parseInt(categoriesResponse.getId());
                    Integer num = SportyGamesManager.LobbyCurrentPage;
                    if (num != null && i3 == num.intValue() && (viewPager2 = this.v) != null) {
                        viewPager2.setCurrentItem(i);
                    }
                }
                i = i2;
            }
        } catch (Exception unused) {
        }
    }

    public final boolean t0() {
        return getChildFragmentManager().H("search_fragment") != null;
    }

    public final void u0() {
        xnh0 user;
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (((sportyGamesManager == null || (user = sportyGamesManager.getUser()) == null) ? "" : user.a).length() != 0) {
            jct jctVar = this.f;
            if (jctVar != null) {
                ej5.c(o8i0.d(jctVar), null, null, new lct(jctVar, null, null), 3);
                return;
            } else {
                Intrinsics.n("viewModelLobby");
                throw null;
            }
        }
        cn80 cn80Var = (cn80) this.b;
        if (cn80Var != null) {
            cn80Var.H.v.setVisibility(0);
        }
        cn80 cn80Var2 = (cn80) this.b;
        if (cn80Var2 != null) {
            cn80Var2.H.A.setVisibility(8);
        }
        if (this.D.length() == 0) {
            q0();
        }
        if (!Intrinsics.g(this.D, "INT")) {
            jct jctVar2 = this.f;
            if (jctVar2 == null) {
                Intrinsics.n("viewModelLobby");
                throw null;
            }
            jctVar2.C1();
        }
        Bundle bundle = this.d;
        if (bundle == null || !bundle.containsKey("game")) {
            jct jctVar3 = this.f;
            if (jctVar3 == null) {
                Intrinsics.n("viewModelLobby");
                throw null;
            }
            jctVar3.A1();
        } else {
            p0();
        }
        jct jctVar4 = this.f;
        if (jctVar4 != null) {
            jctVar4.z1();
        } else {
            Intrinsics.n("viewModelLobby");
            throw null;
        }
    }

    public final void v0(TabLayout.g gVar) {
        z0(String.valueOf(gVar.a), String.valueOf(gVar.e + 1), this.C);
        Z = false;
        ViewPager2 viewPager2 = this.v;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(gVar.e);
        }
        SportyGamesManager.LobbyCurrentPage = Integer.valueOf(gVar.i);
    }

    public final void w0(ConstraintLayout constraintLayout, int i) {
        Context context = getContext();
        if (context != null) {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            animatorLoadAnimator.getClass();
            AnimatorSet animatorSet = (AnimatorSet) animatorLoadAnimator;
            animatorSet.setTarget(constraintLayout);
            animatorSet.start();
        }
    }
}
