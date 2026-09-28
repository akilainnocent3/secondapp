package defpackage;

import android.accounts.Account;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.book.domain.entity.UIState;
import com.sporty.android.core.model.ads.RealSportsAdSpots;
import com.sporty.android.core.model.ads.RealSportsAds;
import com.sporty.android.core.model.welcomereward.DepositFloatingIconPage;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.router.Sender;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.data.Categories;
import com.sportybet.plugin.realsports.data.OrderedSportItem;
import com.sportybet.plugin.realsports.data.OrderedSportItemHelper;
import com.sportybet.plugin.realsports.data.Popular;
import com.sportybet.plugin.realsports.data.PopularAndSportData;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.webcontainer.WebViewWrapperServiceImpl;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class v0 extends gll implements SwipeRefreshLayout.f, TabLayout.d, wym, k9j, i8 {
    public SwipeRefreshLayout A;
    public String A0;
    public RecyclerView B;
    public RecyclerView C;
    public LoadingView D;
    public y0 E;
    public z0 F;
    public TabLayout.g S;
    public TabLayout.g T;
    public TabLayout.g U;
    public WebView V;
    public WebView W;
    public boolean X;
    public TextView a0;
    public TextView b0;
    public c1 c0;
    public oku d0;
    public TextView e0;
    public TextView f0;
    public TextView g0;
    public TextView h0;
    public View i;
    public TextView i0;
    public TextView j0;
    public TextView k0;
    public TextView l0;
    public TabLayout n0;
    public y8j o0;
    public psm p0;
    public azm q0;
    public erb r0;
    public wsm s0;
    public iym t0;
    public k650 u0;
    public WebViewWrapperServiceImpl v0;
    public i9j w0;
    public uqm x0;
    public j7e y0;
    public String z0;
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public int y = 0;
    public final mo0 z = l840.a();
    public boolean G = true;
    public int H = 0;
    public int I = 0;
    public String J = null;
    public String K = null;
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final ArrayList O = new ArrayList();
    public final ArrayList P = new ArrayList();
    public final ArrayList Q = new ArrayList();
    public final HashMap R = new HashMap();
    public boolean Y = true;
    public boolean Z = false;
    public long m0 = 0;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            v0 v0Var = v0.this;
            if (TextUtils.equals(str, v0Var.z0)) {
                return true;
            }
            String path = Uri.parse(str).getPath();
            if (path != null) {
                xxi0[] xxi0VarArr = xxi0.a;
                if (!path.endsWith("/m/promotions")) {
                    Bundle bundle = new Bundle();
                    bundle.putString("data_share_dialog_title", sn5.b(v0Var.requireActivity(), R.string.az_menu__promotion_share_title, new Object[0]));
                    bundle.putString("data_share_dialog_sharing_content", str);
                    bundle.putInt("data_share_dialog_title_style", R.style.H3_B);
                    bundle.putInt("data_share_dialog_title_bottom_padding", 16);
                    sh8.c().c(str, bundle);
                }
            }
            return false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("MAIN", 0);
            a = bVar;
            b bVar2 = new b("PROMOTIONS", 1);
            b = bVar2;
            b bVar3 = new b("FEATURES", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public static void m0(TextView textView, String str, View.OnClickListener onClickListener) {
        textView.setTag(str);
        textView.setOnClickListener(onClickListener);
        Drawable drawable = textView.getCompoundDrawables()[1];
        if (drawable != null) {
            drawable.mutate();
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            drawable.invalidateSelf();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        TabLayout.g gVar2 = this.S;
        b bVar = b.a;
        if (gVar == gVar2) {
            t0(bVar);
            this.G = false;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            TextView textView = this.a0;
            if (size == 0) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            v0(this.H, arrayList);
            p0();
            u0("AZMenu-Live");
            return;
        }
        if (gVar == this.T) {
            t0(b.b);
            u0("AZMenu-Promotions");
            return;
        }
        if (gVar == this.U) {
            t0(b.c);
            u0("AZMenu-Features");
            return;
        }
        t0(bVar);
        this.G = true;
        y0 y0Var = this.E;
        int i = this.I;
        y0Var.a = this.v;
        y0Var.c = i;
        y0Var.notifyDataSetChanged();
        this.a0.setVisibility(8);
        r0();
        u0("AZMenu-Sports");
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() {
        o0(true);
    }

    @Override // defpackage.wym
    public final boolean k0() {
        return false;
    }

    public final void n0(View view) {
        this.b0 = (TextView) view.findViewById(R.id.search);
        Drawable drawableA = gr0.a(requireContext(), R.drawable.ic_action_bar_search);
        if (drawableA != null) {
            drawableA.mutate();
            drawableA.setTint(Color.parseColor("#9ca0ab"));
        }
        this.b0.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableA, (Drawable) null);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.az_menu_swipe);
        this.A = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        LoadingView loadingView = (LoadingView) view.findViewById(R.id.az_menu_loading);
        this.D = loadingView;
        loadingView.setOnClickListener(new View.OnClickListener() { // from class: p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.o0(false);
            }
        });
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        this.n0 = tabLayout;
        TabLayout.g gVarL = tabLayout.l();
        gVarL.e(sn5.d(this, R.string.wap_home__sports, new Object[0]));
        tabLayout.b(gVarL);
        TabLayout.g gVarL2 = this.n0.l();
        this.S = gVarL2;
        gVarL2.e(sn5.d(this, R.string.sports_menu__live, "0"));
        this.n0.b(this.S);
        this.T = this.n0.l();
        this.U = this.n0.l();
        this.n0.a(this);
        this.B = (RecyclerView) view.findViewById(R.id.az_menu_left_list_view);
        this.C = (RecyclerView) view.findViewById(R.id.az_menu_right_recycler_view);
        this.a0 = (TextView) view.findViewById(R.id.no_match_info);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                v0 v0Var = this.a;
                if (jCurrentTimeMillis - v0Var.m0 < 1000) {
                    return;
                }
                v0Var.m0 = System.currentTimeMillis();
                if (view2.getId() == v0Var.b0.getId()) {
                    yrh0.k(v0Var.requireActivity());
                    return;
                }
                if (v0Var.p0.r() && view2.getId() == v0Var.f0.getId() && !v0Var.u0.b("intl_enable_virtual_and_jackpot")) {
                    zyf0.c(1, sn5.d(v0Var, R.string.common_functions__coming_soon, new Object[0]));
                    return;
                }
                if (view2.getId() == v0Var.g0.getId()) {
                    sh8.c().f((String) view2.getTag(), null, Sender.AZ_MENU);
                } else if (view2.getId() != v0Var.h0.getId()) {
                    sh8.c().e((String) view2.getTag());
                } else {
                    v0Var.c0.e.a(o7d0.a, k00.d);
                    sh8.c().f(o7d.a(wae.SPORTY_PICKS), null, Sender.AZ_MENU);
                }
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                v0 v0Var = this.a;
                if (jCurrentTimeMillis - v0Var.m0 < 1000) {
                    return;
                }
                v0Var.m0 = System.currentTimeMillis();
                v0Var.q0.d(wae.VIRTUALS_LOBBY);
            }
        };
        TextView textView = (TextView) view.findViewById(R.id.entry_liveGames);
        this.e0 = textView;
        m0(textView, o7d.a(wae.LIVE_GAME), onClickListener);
        TextView textView2 = (TextView) view.findViewById(R.id.entry_virtuals);
        this.f0 = textView2;
        m0(textView2, null, onClickListener2);
        this.g0 = (TextView) view.findViewById(R.id.entry_jackpot);
        this.i0 = (TextView) view.findViewById(R.id.entry_clone_bet);
        this.j0 = (TextView) view.findViewById(R.id.entry_multi_maker);
        this.k0 = (TextView) view.findViewById(R.id.entry_games);
        this.l0 = (TextView) view.findViewById(R.id.entry_code_hub);
        if (this.p0.O()) {
            this.l0.setVisibility(0);
            m0(this.l0, o7d.a(wae.CODE_HUB), onClickListener);
            this.k0.setVisibility(0);
            m0(this.k0, o7d.a(wae.GAMES_LOBBY), onClickListener);
        }
        if (this.p0.F()) {
            this.j0.setVisibility(0);
            m0(this.j0, o7d.a(wae.MULTI_MAKER), onClickListener);
        } else {
            this.i0.setVisibility(0);
            m0(this.i0, o7d.a(wae.BET_SLIP), onClickListener);
        }
        boolean zO = this.p0.O();
        TextView textView3 = this.g0;
        if (zO) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            m0(this.g0, o7d.a(wae.JACKPOT), onClickListener);
        }
        TextView textView4 = (TextView) view.findViewById(R.id.entry_livescore);
        if (this.p0.F()) {
            textView4.setVisibility(8);
        } else {
            m0(textView4, o7d.a(wae.LIVESCORE), onClickListener);
        }
        m0((TextView) view.findViewById(R.id.entry_results), o7d.a(wae.RESULTS), onClickListener);
        TextView textView5 = (TextView) view.findViewById(R.id.entry_sporty_picks);
        this.h0 = textView5;
        m0(textView5, o7d.a(wae.SPORTY_PICKS), onClickListener);
        this.b0.setOnClickListener(onClickListener);
        WebView webView = (WebView) view.findViewById(R.id.promotion_webview);
        this.V = webView;
        webView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: s0
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i, int i2, int i3, int i4) {
                this.a.A.setEnabled(i2 == 0);
            }
        });
        this.o0.d(this.V, "fs-unmask");
        WebSettings settings = this.V.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setCacheMode(2);
        settings.setDomStorageEnabled(true);
        WebViewWrapperServiceImpl webViewWrapperServiceImpl = this.v0;
        if (webViewWrapperServiceImpl != null) {
            webViewWrapperServiceImpl.installJsBridge(requireActivity(), this.V, new a(), null);
        }
        WebView webView2 = (WebView) view.findViewById(R.id.features_webview);
        this.W = webView2;
        webView2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: t0
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i, int i2, int i3, int i4) {
                this.a.A.setEnabled(i2 == 0);
            }
        });
        this.o0.d(this.W, "fs-unmask");
        WebSettings settings2 = this.W.getSettings();
        settings2.setJavaScriptEnabled(true);
        settings2.setJavaScriptCanOpenWindowsAutomatically(true);
        settings2.setCacheMode(2);
        settings2.setDomStorageEnabled(true);
        WebViewWrapperServiceImpl webViewWrapperServiceImpl2 = this.v0;
        if (webViewWrapperServiceImpl2 != null) {
            webViewWrapperServiceImpl2.installJsBridge(requireActivity(), this.W, new u0(this), null);
        }
        View viewFindViewById = view.findViewById(R.id.edit_bet_space);
        k53 k53VarC = iu2.c();
        k53VarC.getClass();
        viewFindViewById.setVisibility(kotlin.collections.a.c(k53.EDIT).contains(k53VarC) ? 0 : 8);
    }

    @Override // defpackage.wym
    public final boolean o() {
        return false;
    }

    public final void o0(boolean z) {
        this.Z = z;
        this.X = false;
        if (!z) {
            this.D.K();
            this.A.setRefreshing(false);
        }
        c1 c1Var = this.c0;
        h530 h530Var = c1Var.a;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("spotId", "azMenuBanner"));
            jSONArray.put(new JSONObject().put("spotId", "popularList2"));
            jSONObject.put("adSpots", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String string = jSONObject.toString();
        string.getClass();
        kzh.d(new yzh(new g1i(new xzh(r1i.a(h530Var.i(string), c1Var.b.z(null), c1Var.c.a(), new h1(4, null)), new i1(c1Var, null)), new j1(c1Var, null)), new k1(c1Var, null)), o8i0.d(c1Var));
        c1 c1Var2 = this.c0;
        if (c1Var2 != null) {
            String str = ((m1) c1Var2.A.a.getValue()).a;
            String strE = c8i0.e(this.V);
            h0j0.c(h0j0.b(str), "locale", this.x0.getLanguageCode());
            Uri uriBuild = Uri.parse(str);
            if (uriBuild.getQueryParameter("from") == null) {
                uriBuild = uriBuild.buildUpon().appendQueryParameter("from", "azmenu").build();
            }
            this.z0 = yrh0.d(strE, uriBuild.toString());
            HashMap map = new HashMap();
            map.put("Platform", "android");
            this.V.loadUrl(this.z0, map);
        }
        c1 c1Var3 = this.c0;
        if (c1Var3 != null) {
            String str2 = ((m1) c1Var3.A.a.getValue()).c;
            String strE2 = c8i0.e(this.W);
            h0j0.c(h0j0.b(str2), "locale", this.x0.getLanguageCode());
            Uri uriBuild2 = Uri.parse(str2);
            if (uriBuild2.getQueryParameter("from") == null) {
                uriBuild2 = uriBuild2.buildUpon().appendQueryParameter("from", "azmenu").build();
            }
            this.A0 = yrh0.d(strE2, uriBuild2.toString());
            HashMap map2 = new HashMap();
            map2.put("Platform", "android");
            this.W.loadUrl(this.A0, map2);
        }
        this.c0.x1();
        c1 c1Var4 = this.c0;
        c1Var4.getClass();
        ej5.c(o8i0.d(c1Var4), null, null, new g1(c1Var4, null), 3);
    }

    @Override // defpackage.i8
    public final void onAccountChange(Account account) {
        if (account == null) {
            this.d0.g0.m(Boolean.TRUE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.i != null) {
            this.Y = !this.X;
        } else {
            try {
                View viewInflate = layoutInflater.inflate(R.layout.spr_fragment_az_menu, viewGroup, false);
                this.i = viewInflate;
                n0(viewInflate);
            } catch (Resources.NotFoundException | InflateException e) {
                this.r0.b(requireContext(), sn5.b(requireContext(), R.string.app_common__system_crash_dialog_error_title, new Object[0]), sn5.b(requireContext(), R.string.app_common__system_crash_dialog_error_message, new Object[0]));
                this.s0.g("Resources.NotFoundException or InflateException detected in AZMenuFragment", "", e, null);
                if (isAdded() && getActivity() != null) {
                    requireActivity().finish();
                }
                return null;
            }
        }
        return this.i;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.v0.uninstallJsBridge(this.V);
        WebView webView = this.V;
        if (webView != null) {
            webView.destroy();
            this.V = null;
        }
        this.v0.uninstallJsBridge(this.W);
        WebView webView2 = this.W;
        if (webView2 != null) {
            webView2.destroy();
            this.W = null;
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.X = false;
    }

    @Override // defpackage.jr10, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.y0.a();
    }

    @Override // defpackage.jr10, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.i == null) {
            return;
        }
        if (this.w0 == null) {
            this.w0 = this.o0.b("AZMenu-Sports");
        }
        if (this.Y) {
            o0(false);
        } else {
            this.Y = true;
            c1 c1Var = this.c0;
            kzh.d(new yzh(new g1i(new xzh(c1Var.b.z(null), new d1(c1Var, null)), new e1(c1Var, null)), new f1(c1Var, null)), o8i0.d(c1Var));
        }
        if (this.X) {
            gym.a(this.t0, new b1());
        }
        this.c0.x1();
        this.y0.d(requireActivity(), DepositFloatingIconPage.AZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(c1.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        c1 c1Var = (c1) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.c0 = c1Var;
        c1Var.v.f(getViewLifecycleOwner(), new lfy() { // from class: k0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    return;
                }
                this.a.e0.setVisibility(bool.booleanValue() ? 0 : 8);
            }
        });
        this.c0.y.f(getViewLifecycleOwner(), new lfy() { // from class: l0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                this.a.h0.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
            }
        });
        yyh.b(this.c0.A, getViewLifecycleOwner(), s9s.b.d, new Function1() { // from class: m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                m1 m1Var = (m1) obj;
                int i = m1Var.b;
                int i2 = m1Var.d;
                v0 v0Var = this.a;
                TabLayout.g gVar = v0Var.T;
                if (i > 0) {
                    gVar.e(sn5.d(v0Var, R.string.az_menu__promotions_vnum, String.valueOf(i)));
                    TabLayout.g gVar2 = v0Var.T;
                    if (gVar2.e == -1) {
                        v0Var.n0.b(gVar2);
                    }
                } else if (gVar.e != -1) {
                    v0Var.n0.p(gVar);
                }
                TabLayout.g gVar3 = v0Var.U;
                if (i2 > 0) {
                    gVar3.e(sn5.d(v0Var, R.string.common_functions__features, new Object[0]) + " (" + i2 + ")");
                    TabLayout.g gVar4 = v0Var.U;
                    if (gVar4.e == -1) {
                        v0Var.n0.b(gVar4);
                    }
                } else if (gVar3.e != -1) {
                    v0Var.n0.p(gVar3);
                }
                return Unit.a;
            }
        });
        this.c0.C.f(getViewLifecycleOwner(), new lfy() { // from class: n0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                UIState uIState = (UIState) obj;
                v0 v0Var = this.a;
                if (v0Var.getViewLifecycleOwner().getLifecycle().b() != s9s.b.e || (uIState instanceof UIState.Loading)) {
                    return;
                }
                SwipeRefreshLayout swipeRefreshLayout = v0Var.A;
                if (swipeRefreshLayout.c) {
                    swipeRefreshLayout.setRefreshing(false);
                } else {
                    v0Var.D.E();
                }
                if (uIState instanceof UIState.Success) {
                    v0Var.q0((List) uIState.getData());
                    v0Var.S.e(sn5.d(v0Var, R.string.sports_menu__live, String.valueOf(v0Var.y)));
                    v0Var.s0();
                }
            }
        });
        this.c0.E.f(getViewLifecycleOwner(), new lfy() { // from class: o0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                RealSportsAds firstAd;
                UIState uIState = (UIState) obj;
                v0 v0Var = this.a;
                if (v0Var.getViewLifecycleOwner().getLifecycle().b() != s9s.b.e || (uIState instanceof UIState.Loading)) {
                    return;
                }
                SwipeRefreshLayout swipeRefreshLayout = v0Var.A;
                if (swipeRefreshLayout.c) {
                    swipeRefreshLayout.setRefreshing(false);
                } else {
                    v0Var.D.E();
                }
                if (uIState instanceof UIState.Error) {
                    if (v0Var.Z) {
                        zyf0.a(R.string.common_feedback__no_internet_connection_try_again);
                    } else {
                        v0Var.D.I();
                    }
                    v0Var.Z = false;
                    return;
                }
                v0Var.X = true;
                if (!v0Var.Z) {
                    gym.a(v0Var.t0, new b1());
                }
                if (uIState instanceof UIState.Success) {
                    List<RealSportsAdSpots> list = ((fq1) uIState.getData()).a;
                    ArrayList arrayList = v0Var.L;
                    if (list != null && list.size() > 0) {
                        arrayList.clear();
                        for (RealSportsAdSpots realSportsAdSpots : list) {
                            if ("azMenuBanner".equals(realSportsAdSpots.getSpotId())) {
                                if (realSportsAdSpots.getAds() != null && (firstAd = realSportsAdSpots.getFirstAd()) != null) {
                                    Popular popular = new Popular();
                                    popular.iconUrl = firstAd.getImgUrl();
                                    popular.linkUrl = firstAd.getLinkUrl();
                                    popular.type = 4;
                                    arrayList.add(0, popular);
                                }
                            } else if (TextUtils.equals("popularList2", realSportsAdSpots.getSpotId()) && realSportsAdSpots.getAds() != null) {
                                for (RealSportsAds realSportsAds : realSportsAdSpots.getAds()) {
                                    if (v0Var.q0.g(realSportsAds.getLinkUrl())) {
                                        Popular popular2 = new Popular();
                                        popular2.iconUrl = realSportsAds.getImgUrl();
                                        popular2.text = realSportsAds.getText();
                                        popular2.linkUrl = realSportsAds.getLinkUrl();
                                        popular2.type = 3;
                                        arrayList.add(popular2);
                                    }
                                }
                            }
                        }
                    }
                    v0Var.q0(((fq1) uIState.getData()).b);
                    PopularAndSportData popularAndSportData = ((fq1) uIState.getData()).c;
                    ArrayList arrayList2 = v0Var.M;
                    ArrayList arrayList3 = v0Var.N;
                    if (popularAndSportData.popularEvents != null) {
                        arrayList3.clear();
                        arrayList3.addAll(popularAndSportData.popularEvents);
                    }
                    arrayList2.clear();
                    List<Sport> list2 = popularAndSportData.sportList;
                    if (list2 != null) {
                        arrayList2.addAll(list2);
                    }
                    v0Var.S.e(sn5.d(v0Var, R.string.sports_menu__live, String.valueOf(v0Var.y)));
                    v0Var.s0();
                }
            }
        });
        e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        v8i0 viewModelStore2 = eVarRequireActivity.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = eVarRequireActivity.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, sd7.a(eVarRequireActivity, viewModelStore2, defaultViewModelProviderFactory2));
        dq7 dq7VarA2 = jq40.a(oku.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.d0 = (oku) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        s0();
        TabLayout tabLayout = this.n0;
        if (tabLayout == null || this.T == null || tabLayout.k(tabLayout.getSelectedTabPosition()) != this.T) {
            return;
        }
        this.c0.e.a(w430.a.a, k00.d);
    }

    public final void p0() {
        List<Categories> list = (List) this.R.get(this.K);
        RecyclerView recyclerView = this.C;
        if (list == null) {
            recyclerView.setVisibility(8);
            return;
        }
        recyclerView.setVisibility(0);
        ArrayList arrayList = this.Q;
        arrayList.clear();
        x0 x0Var = (x0) this.w.get(this.H);
        ArrayList arrayList2 = new ArrayList();
        j0 j0Var = new j0();
        j0Var.b = 0;
        String str = x0Var.b;
        j0Var.d = x0Var.a;
        arrayList2.add(j0Var);
        Collections.sort(list);
        for (Categories categories : list) {
            j0 j0Var2 = new j0();
            j0Var2.b = 2;
            j0Var2.a = categories;
            j0Var2.d = categories.name;
            arrayList2.add(j0Var2);
        }
        arrayList.addAll(arrayList2);
        w0(1, this.K, arrayList);
    }

    public final void q0(List<Sport> list) {
        ArrayList arrayList = this.P;
        arrayList.clear();
        ArrayList arrayList2 = this.w;
        arrayList2.clear();
        ArrayList arrayList3 = new ArrayList(list);
        int i = -1;
        boolean z = false;
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            if ("sr:sport:202120001".equals(((Sport) arrayList3.get(i2)).id)) {
                i = i2;
            }
            if ("sr:sport:1".equals(((Sport) arrayList3.get(i2)).id)) {
                z = true;
            }
        }
        if (i != -1) {
            Sport sport = (Sport) arrayList3.remove(i);
            if (z) {
                arrayList3.add(1, sport);
            } else {
                arrayList3.add(0, sport);
            }
        }
        arrayList.addAll(arrayList3);
        HashMap map = this.R;
        map.clear();
        this.y = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Sport sport2 = (Sport) arrayList.get(i3);
            x0 x0Var = new x0();
            x0Var.a = sport2.name;
            String str = sport2.id;
            x0Var.b = str;
            x0Var.c = sport2.eventSize;
            String str2 = this.K;
            if (str2 != null && str2.equals(str)) {
                this.H = i3;
            }
            this.y += sport2.eventSize;
            map.put(sport2.id, sport2.categories);
            arrayList2.add(x0Var);
        }
        if (this.H >= arrayList2.size()) {
            this.H = 0;
        }
        this.K = arrayList2.size() == 0 ? null : ((x0) arrayList2.get(this.H)).b;
    }

    public final void r0() {
        Sport sport;
        List<Categories> list;
        List<Categories> list2;
        if (this.G) {
            ArrayList arrayList = this.O;
            arrayList.clear();
            int i = this.I;
            if (i == 0) {
                ArrayList arrayList2 = this.L;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    Popular popular = (Popular) obj;
                    j0 j0Var = new j0();
                    j0Var.c = popular;
                    j0Var.b = popular.type;
                    arrayList.add(j0Var);
                }
            } else {
                String str = this.J;
                String str2 = ((x0) this.v.get(i)).a;
                ArrayList arrayList3 = this.M;
                int size2 = arrayList3.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        sport = null;
                        break;
                    }
                    Object obj2 = arrayList3.get(i3);
                    i3++;
                    sport = (Sport) obj2;
                    if (str != null && str.equals(sport.id)) {
                        break;
                    }
                }
                if (sport != null && (list = sport.categories) != null && list.size() != 0) {
                    j0 j0Var2 = new j0();
                    j0Var2.b = 0;
                    j0Var2.d = str2;
                    arrayList.add(j0Var2);
                    ArrayList arrayList4 = this.N;
                    if (arrayList4.size() > 0) {
                        int size3 = arrayList4.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            Object obj3 = arrayList4.get(i4);
                            i4++;
                            Sport sport2 = (Sport) obj3;
                            if (TextUtils.equals(str, sport2.id) && (list2 = sport2.categories) != null && list2.size() > 0) {
                                for (Categories categories : sport2.categories) {
                                    j0 j0Var3 = new j0();
                                    j0Var3.b = 2;
                                    j0Var3.d = categories.name;
                                    j0Var3.a = categories;
                                    arrayList.add(j0Var3);
                                }
                                break;
                            }
                        }
                    }
                    j0 j0Var4 = new j0();
                    j0Var4.b = 1;
                    arrayList.add(j0Var4);
                    arrayList.size();
                    List<Categories> list3 = sport.categories;
                    final Collator collator = Collator.getInstance(Locale.getDefault());
                    Collections.sort(list3, new Comparator() { // from class: a1
                        @Override // java.util.Comparator
                        public final int compare(Object obj4, Object obj5) {
                            return collator.compare(((Categories) obj4).name, ((Categories) obj5).name);
                        }
                    });
                    for (int i5 = 0; i5 < list3.size(); i5++) {
                        Categories categories2 = list3.get(i5);
                        j0 j0Var5 = new j0();
                        j0Var5.b = 2;
                        j0Var5.d = categories2.name;
                        j0Var5.a = categories2;
                        arrayList.add(j0Var5);
                    }
                }
            }
            this.C.setVisibility(arrayList.size() == 0 ? 8 : 0);
            w0(3, this.J, arrayList);
        }
    }

    public final void s0() {
        ArrayList arrayList = this.v;
        arrayList.clear();
        x0 x0Var = new x0();
        x0Var.a = sn5.d(this, R.string.az_menu__popular, new Object[0]);
        x0Var.b = null;
        arrayList.add(x0Var);
        for (OrderedSportItem orderedSportItem : OrderedSportItemHelper.getFromStorage(3)) {
            x0 x0Var2 = new x0();
            x0Var2.a = orderedSportItem.nameUiText.g(requireContext());
            x0Var2.b = orderedSportItem.id;
            arrayList.add(x0Var2);
        }
        if (this.G) {
            v0(this.I, arrayList);
            r0();
        } else {
            v0(this.H, this.w);
            p0();
        }
    }

    public final void t0(b bVar) {
        WebView webView = this.V;
        b bVar2 = b.b;
        webView.setVisibility(bVar == bVar2 ? 0 : 8);
        WebView webView2 = this.W;
        if (webView2 != null) {
            webView2.setVisibility(bVar == b.c ? 0 : 8);
        }
        if (bVar == bVar2) {
            this.c0.e.a(w430.a.a, k00.d);
        }
    }

    public final void u0(String str) {
        i9j i9jVar = this.w0;
        if (i9jVar != null) {
            if (i9jVar.getName().equals(str)) {
                return;
            } else {
                this.w0.getClass();
            }
        }
        this.w0 = this.o0.b(str);
    }

    public final void v0(int i, ArrayList arrayList) {
        y0 y0Var = this.E;
        if (y0Var != null) {
            y0Var.a = arrayList;
            y0Var.c = i;
            y0Var.notifyDataSetChanged();
        } else {
            y0 y0Var2 = new y0(arrayList);
            this.E = y0Var2;
            y0Var2.b = new tjl0(this);
            this.B.setAdapter(y0Var2);
        }
    }

    public final void w0(int i, String str, ArrayList arrayList) {
        z0 z0Var = this.F;
        if (z0Var != null) {
            z0Var.b = str;
            z0Var.a = arrayList;
            z0Var.c = i;
            z0Var.notifyDataSetChanged();
            return;
        }
        z0 z0Var2 = new z0();
        z0Var2.b = str;
        z0Var2.a = arrayList;
        z0Var2.c = i;
        this.F = z0Var2;
        this.C.setAdapter(z0Var2);
    }

    @Override // defpackage.wym
    public final boolean y() {
        return false;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
    }
}
