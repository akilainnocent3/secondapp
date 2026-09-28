package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.utils.CasinoLogger;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.compose.lobbyv2.models.GameLogData;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import com.sportygames.compose.lobbyv2.webview.GamesFallbackLobbyV2;
import com.sportygames.compose.lobbyv2.webview.LobbyWebView;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.WalletInfo;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loxj;", "Ll12;", "Lcom/sportygames/compose/lobbyv2/viewmodels/LobbyV2ViewModel;", "Lq3t;", "Lxjj;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class oxj extends l12<LobbyV2ViewModel, q3t> implements xjj {
    public List<? extends File> A;
    public GameLogData D;
    public GamesFallbackLobbyV2 G;
    public boolean J;
    public boolean e;
    public Bundle f;
    public boolean v;
    public fq5 y;
    public final ttr c = hwr.a(a1s.a, new l());
    public final String d = "Lobby";
    public final yjj i = new yjj();
    public String w = "";
    public String z = "";
    public String B = "en";
    public String C = "";
    public List<Integer> E = m2g.a;
    public final ytw<Boolean> F = androidx.compose.runtime.m.b(Boolean.FALSE);
    public final q8i0 H = new q8i0(jq40.a(fuj.class), new f(), new h(), new g());
    public final q8i0 I = new q8i0(jq40.a(db6.class), new i(), new k(), new j());
    public final ttr K = hwr.a(a1s.c, new n(new m()));

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[wt4.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                wt4 wt4Var = wt4.UNKNOWN;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                wt4 wt4Var2 = wt4.UNKNOWN;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Status.values().length];
            try {
                iArr2[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Status.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Status.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr2;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((oxj) this.receiver).u0();
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<nt4, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(nt4 nt4Var) {
            nt4 nt4Var2 = nt4Var;
            nt4Var2.getClass();
            oxj oxjVar = (oxj) this.receiver;
            oxjVar.getClass();
            String str = nt4Var2.a;
            boolean z = nt4Var2.j;
            String str2 = nt4Var2.f;
            GameDetails gameDetails = new GameDetails(null, null, null, str, null, null, null, null, str2, Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 16776439, null);
            int iOrdinal = nt4Var2.d.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return null;
                    }
                    if (str2.length() > 0) {
                        oxjVar.s0(gameDetails, 0, "");
                    }
                } else if (!z || str2.length() <= 0) {
                    Intent intent = new Intent(oxjVar.requireContext(), (Class<?>) GameMainActivity.class);
                    intent.putExtra("gameDetail", new GameDetails(null, null, null, "Bonus Cup", null, null, null, null, "sportygames/Bonus Cup", null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 16776950, null));
                    oxjVar.requireContext().startActivity(intent);
                } else {
                    oxjVar.s0(gameDetails, 0, "");
                }
            } else if (!z || str2.length() <= 0) {
                oxjVar.u0();
            } else {
                oxjVar.s0(gameDetails, 0, "");
            }
            return Unit.a;
        }
    }

    public static final class d implements ikx {
        public d() {
        }

        @Override // defpackage.ikx
        public final void a(Integer num, String str, String str2) {
            oxj oxjVar = oxj.this;
            ((x5a0) oxjVar.F).setValue(Boolean.FALSE);
            q3t q3tVar = (q3t) oxjVar.b;
            if (q3tVar != null) {
                q3tVar.e.c.setVisibility(8);
            }
            q3t q3tVar2 = (q3t) oxjVar.b;
            if (q3tVar2 != null) {
                q3tVar2.e.b.setVisibility(0);
            }
            q3t q3tVar3 = (q3t) oxjVar.b;
            if (q3tVar3 != null) {
                q3tVar3.e.y.setVisibility(0);
            }
            q3t q3tVar4 = (q3t) oxjVar.b;
            if (q3tVar4 != null) {
                q3tVar4.e.y.setSelected(true);
            }
            if (str != null) {
                if (Intrinsics.g(str2, "game_providers")) {
                    q3t q3tVar5 = (q3t) oxjVar.b;
                    if (q3tVar5 != null) {
                        q3tVar5.e.y.setText(str);
                        return;
                    }
                    return;
                }
                Context context = oxjVar.getContext();
                if (str2 == null) {
                    str2 = "";
                }
                String strC = mn5.c(mn5.d(context, str2, str, 6));
                q3t q3tVar6 = (q3t) oxjVar.b;
                if (q3tVar6 != null) {
                    q3tVar6.e.y.setText(strC);
                }
            }
        }

        @Override // defpackage.ikx
        public final void b() {
            oxj oxjVar = oxj.this;
            ((x5a0) oxjVar.F).setValue(Boolean.FALSE);
            q3t q3tVar = (q3t) oxjVar.b;
            if (q3tVar != null) {
                q3tVar.e.c.setVisibility(0);
            }
            q3t q3tVar2 = (q3t) oxjVar.b;
            if (q3tVar2 != null) {
                q3tVar2.e.b.setVisibility(8);
            }
            q3t q3tVar3 = (q3t) oxjVar.b;
            if (q3tVar3 != null) {
                q3tVar3.e.y.setVisibility(8);
            }
            q3t q3tVar4 = (q3t) oxjVar.b;
            if (q3tVar4 != null) {
                q3tVar4.e.y.setText(oxjVar.getString(R.string.app_name_lib));
            }
        }
    }

    public static final class e implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public e(Function1 function1) {
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

    public static final class f extends qlr implements Function0<v8i0> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return oxj.this.requireActivity().getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return oxj.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class h extends qlr implements Function0<r8i0.c> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return oxj.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class i extends qlr implements Function0<v8i0> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return oxj.this.requireActivity().getViewModelStore();
        }
    }

    public static final class j extends qlr implements Function0<cyb> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return oxj.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class k extends qlr implements Function0<r8i0.c> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return oxj.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class l implements Function0<l1z> {
        public l() {
        }

        /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, l1z] */
        /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, l1z] */
        @Override // kotlin.jvm.functions.Function0
        public final l1z invoke() {
            nv60 nv60Var = oxj.this;
            return nv60Var instanceof rrp ? ((rrp) nv60Var).j().a(jq40.a(l1z.class), null, null) : sjj.b().c.d.a(jq40.a(l1z.class), null, null);
        }
    }

    public static final class m implements Function0<Fragment> {
        public m() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return oxj.this;
        }
    }

    public static final class n implements Function0<xw4> {
        public final /* synthetic */ m b;

        public n(m mVar) {
            this.b = mVar;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, xw4] */
        @Override // kotlin.jvm.functions.Function0
        public final xw4 invoke() {
            v8i0 viewModelStore = oxj.this.getViewModelStore();
            oxj oxjVar = oxj.this;
            cyb defaultViewModelCreationExtras = oxjVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(xw4.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(oxjVar), null);
        }
    }

    @Override // defpackage.l12
    public final g6i0 o0() {
        View viewInflate = getLayoutInflater().inflate(R.layout.lobby_v2_fallback_fragment, (ViewGroup) null, false);
        int i2 = R.id.campaign_content;
        ComposeView composeView = (ComposeView) h5e.a(R.id.campaign_content, viewInflate);
        if (composeView != null) {
            i2 = R.id.lobby_fallback_container;
            FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.lobby_fallback_container, viewInflate);
            if (frameLayout != null) {
                i2 = R.id.snowfall_content;
                ComposeView composeView2 = (ComposeView) h5e.a(R.id.snowfall_content, viewInflate);
                if (composeView2 != null) {
                    i2 = R.id.toolbar_layout;
                    View viewA = h5e.a(R.id.toolbar_layout, viewInflate);
                    if (viewA != null) {
                        return new q3t((ConstraintLayout) viewInflate, composeView, frameLayout, composeView2, do80.a(viewA));
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.E = CollectionsKt.m0(CollectionsKt.A0(LobbyV2ViewModel.a.b(contextRequireContext)));
    }

    @Override // defpackage.l12, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        GamesFallbackLobbyV2 gamesFallbackLobbyV2 = this.G;
        if (gamesFallbackLobbyV2 != null) {
            LobbyWebView lobbyWebView = gamesFallbackLobbyV2.a;
            ViewParent parent = gamesFallbackLobbyV2.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(gamesFallbackLobbyV2);
            }
            lobbyWebView.setLoadingCallbacks(null);
            lobbyWebView.d();
        }
        this.G = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        GamesFallbackLobbyV2 gamesFallbackLobbyV2 = this.G;
        ViewParent parent = gamesFallbackLobbyV2 != null ? gamesFallbackLobbyV2.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.G);
        }
        this.y = null;
        LobbyV2ViewModel lobbyV2ViewModel = (LobbyV2ViewModel) this.a;
        if (lobbyV2ViewModel != null) {
            lobbyV2ViewModel.d.l(this);
        }
        if (this.C.length() == 0) {
            SportyGamesManager.setCurrentLanguageCode("");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            q0().y1();
            q0().e.l(getViewLifecycleOwner());
            q0().d.l(getViewLifecycleOwner());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        fq5 fq5Var;
        LobbyV2ViewModel lobbyV2ViewModel;
        super.onResume();
        SportyGamesManager.getInstance().setScreenName("sportygames/lobby");
        boolean z = false;
        wz.a("LobbyVisit", "Android", new String[0]);
        CasinoLogger.INSTANCE.logEventToCasino("LobbyVisit", vj5.a(new Pair("Platform", "ANDROID"), new Pair("countryCode", this.w)));
        hym.a(((l1z) this.c.getValue()).a, "game_lobby__game__view", null, 14);
        Context context = getContext();
        if (context != null) {
            SportyGamesManager.setApplicationContext(context.getApplicationContext());
        }
        op5.a.getClass();
        op5.d = 0L;
        if (this.v && (lobbyV2ViewModel = (LobbyV2ViewModel) this.a) != null) {
            q3t q3tVar = (q3t) this.b;
            if (q3tVar != null && q3tVar.e.v.getVisibility() == 8) {
                z = true;
            }
            lobbyV2ViewModel.C1(jpu.b(new Pair("user_logged_in_status", String.valueOf(z))));
        }
        try {
            if (getView() != null) {
                String str = this.d;
                ibs viewLifecycleOwner = getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                db6 db6Var = (db6) this.I.getValue();
                fuj fujVarQ0 = q0();
                str.getClass();
                db6Var.B1(str, new ia6(db6Var, false, fujVarQ0, viewLifecycleOwner, new bq40()));
            }
            q0().x1();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (!Intrinsics.g(SportyGamesManager.getInstance().getLanguageCode(), this.z)) {
            SportyGamesManager.setCurrentLanguageCode(SportyGamesManager.getInstance().getLanguageCode());
            String languageCode = SportyGamesManager.getInstance().getLanguageCode();
            languageCode.getClass();
            this.z = languageCode;
            ArrayList<String> arrayList = vlr.a.get("lobby");
            if (arrayList != null && arrayList.contains(SportyGamesManager.getInstance().getLanguageCode())) {
                this.B = xwj.a();
            }
            Context context2 = getContext();
            if (context2 != null && (fq5Var = this.y) != null) {
                fq5Var.x1(context2, kotlin.collections.b.f("currency_symbols", "sg_lobby_banner", "sg_lobby_categories", "sg_lobby", "sg_lobby_sections", "sg_game_description", "sg_game_common", "sg_common", "sg_common_dialog_message", "sg_exit_dialog", "sg_campaign", "sg_games_promotions"), this.B);
            }
        }
        op5 op5Var = op5.a;
        List<? extends File> list = this.A;
        op5Var.getClass();
        op5.b = list;
        this.v = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [gxj] */
    /* JADX WARN: Type inference failed for: r7v0, types: [hxj] */
    /* JADX WARN: Type inference failed for: r8v0, types: [ixj] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        fq5 fq5Var;
        LobbyV2ViewModel lobbyV2ViewModel;
        q3t q3tVar;
        ssw<LoadingState<HTTPResponse<WalletInfo>>> sswVar;
        Resources resources;
        Configuration configuration;
        String str;
        ssw<LoadingState<List<File>>> sswVar2;
        view.getClass();
        super.onViewCreated(view, bundle);
        SportyGamesManager.setApplicationContext(requireContext().getApplicationContext());
        SportyGamesManager.getInstance().setScreenName("sportygames/lobby");
        androidx.fragment.app.e activity = getActivity();
        Object[] objArr = 0;
        if (activity != null) {
            v8i0 viewModelStore = activity.getViewModelStore();
            r8i0.c defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
            s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, sd7.a(activity, viewModelStore, defaultViewModelProviderFactory));
            dq7 dq7VarA = jq40.a(fq5.class);
            String strI = dq7VarA.i();
            if (strI == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            fq5Var = (fq5) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        } else {
            fq5Var = null;
        }
        this.y = fq5Var;
        Bundle arguments = getArguments();
        this.i.getClass();
        this.f = yjj.f(arguments);
        Bundle arguments2 = getArguments();
        int i2 = 0;
        this.J = arguments2 != null ? arguments2.getBoolean("isChristmasThemeEnabled") : false;
        fq5 fq5Var2 = this.y;
        if (fq5Var2 != null && (sswVar2 = fq5Var2.c) != null) {
            sswVar2.f(getViewLifecycleOwner(), new e(new bxj(this, i2)));
        }
        final androidx.fragment.app.e activity2 = getActivity();
        if (activity2 != null) {
            mny.a(activity2.getOnBackPressedDispatcher(), this, new Function1() { // from class: exj
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    cny cnyVar = (cny) obj;
                    cnyVar.getClass();
                    oxj oxjVar = this.a;
                    GamesFallbackLobbyV2 gamesFallbackLobbyV2 = oxjVar.G;
                    if (gamesFallbackLobbyV2 == null || gamesFallbackLobbyV2.getCurrentLobbyWebViewPage() != b5c.a) {
                        GamesFallbackLobbyV2 gamesFallbackLobbyV3 = oxjVar.G;
                        if (gamesFallbackLobbyV3 != null) {
                            gamesFallbackLobbyV3.e();
                        }
                    } else {
                        cnyVar.f(false);
                        activity2.getOnBackPressedDispatcher().d();
                        cnyVar.f(true);
                    }
                    return Unit.a;
                }
            }, 2);
        }
        String country = SportyGamesManager.getInstance().getCountry();
        if (country != null) {
            Locale locale = SportyGamesManager.locale;
            locale.getClass();
            String upperCase = country.toUpperCase(locale);
            upperCase.getClass();
            this.w = upperCase;
        }
        androidx.fragment.app.e activity3 = getActivity();
        if (activity3 != null) {
            v8i0 viewModelStore2 = activity3.getViewModelStore();
            r8i0.c defaultViewModelProviderFactory2 = activity3.getDefaultViewModelProviderFactory();
            s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, sd7.a(activity3, viewModelStore2, defaultViewModelProviderFactory2));
            dq7 dq7VarA2 = jq40.a(LobbyV2ViewModel.class);
            String strI2 = dq7VarA2.i();
            if (strI2 == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            lobbyV2ViewModel = (LobbyV2ViewModel) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        } else {
            lobbyV2ViewModel = null;
        }
        this.a = lobbyV2ViewModel;
        if (Intrinsics.g(SportyGamesManager.getInstance().getLanguageCode(), SportyGamesManager.getCurrentLanguageCode())) {
            this.z = xwj.a();
            t0();
        }
        Context context = getContext();
        int i3 = 1;
        if (context != null) {
            boolean z = context.getSharedPreferences("ram_check", 0).getBoolean("ram_check_event", false);
            ttr ttrVar = this.c;
            if (!z) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("ram_check", 0);
                sharedPreferences.getClass();
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean("ram_check_event", true);
                editorEdit.apply();
                double dJ0 = l12.j0(context);
                if (dJ0 <= 2.0d) {
                    wz.a("2GBDevice", "Android", new String[0]);
                    str = "2gb";
                } else if (dJ0 <= 3.0d) {
                    wz.a("3GBDevice", "Android", new String[0]);
                    str = "3gb";
                } else if (dJ0 <= 4.0d) {
                    wz.a("4GBDevice", "Android", new String[0]);
                    str = "4gb";
                } else if (dJ0 <= 6.0d) {
                    wz.a("6GBDevice", "Android", new String[0]);
                    str = "6gb";
                } else if (dJ0 <= 8.0d) {
                    str = "8gb";
                } else if (dJ0 <= 10.0d) {
                    str = "10gb";
                } else if (dJ0 <= 12.0d) {
                    str = "12gb";
                } else if (dJ0 <= 16.0d) {
                    str = "16gb";
                } else {
                    str = dJ0 <= 24.0d ? "24gb" : null;
                }
                if (str != null) {
                    hym.a(((l1z) ttrVar.getValue()).a, "game_lobby__device__ram", jpu.b(new Pair("ram", str)), 12);
                }
            }
            if (!context.getSharedPreferences("font_check", 0).getBoolean("font_check_event", false)) {
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("font_check", 0);
                sharedPreferences2.getClass();
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                editorEdit2.putBoolean("font_check_event", true);
                editorEdit2.apply();
                Context context2 = getContext();
                Float fValueOf = (context2 == null || (resources = context2.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? null : Float.valueOf(configuration.fontScale);
                if (fValueOf != null) {
                    ((l1z) ttrVar.getValue()).b(awa.a(fValueOf.floatValue()), fValueOf);
                }
            }
            if (!context.getSharedPreferences("ratio_check", 0).getBoolean("ratio_check_event", false)) {
                SharedPreferences sharedPreferences3 = context.getSharedPreferences("ratio_check", 0);
                sharedPreferences3.getClass();
                SharedPreferences.Editor editorEdit3 = sharedPreferences3.edit();
                editorEdit3.putBoolean("ratio_check_event", true);
                editorEdit3.apply();
                double dJ1 = l12.j0(context);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                ((l1z) ttrVar.getValue()).c(displayMetrics.heightPixels, displayMetrics.widthPixels, dJ1);
            }
        }
        q3t q3tVar2 = (q3t) this.b;
        if (q3tVar2 != null) {
            q3tVar2.e.c.setVisibility(0);
        }
        q3t q3tVar3 = (q3t) this.b;
        if (q3tVar3 != null) {
            q3tVar3.e.b.setVisibility(8);
        }
        q3t q3tVar4 = (q3t) this.b;
        if (q3tVar4 != null) {
            q3tVar4.e.y.setVisibility(8);
        }
        q3t q3tVar5 = (q3t) this.b;
        if (q3tVar5 != null) {
            q3tVar5.e.A.setEnabled(true);
        }
        LobbyV2ViewModel lobbyV2ViewModel2 = (LobbyV2ViewModel) this.a;
        if (lobbyV2ViewModel2 != null && (sswVar = lobbyV2ViewModel2.d) != null) {
            sswVar.f(getViewLifecycleOwner(), new e(new cxj(this, i2)));
        }
        msj.l.f(getViewLifecycleOwner(), new e(new dxj()));
        ebs.a(getLifecycle()).b(new pxj(this, null));
        q3t q3tVar6 = (q3t) this.b;
        if (q3tVar6 != null) {
            q3tVar6.e.i.setOnClickListener(new kxj());
        }
        q3t q3tVar7 = (q3t) this.b;
        if (q3tVar7 != null) {
            q3tVar7.e.w.setOnClickListener(new lxj());
        }
        q3t q3tVar8 = (q3t) this.b;
        if (q3tVar8 != null) {
            q3tVar8.e.A.setOnClickListener(new mxj());
        }
        q3t q3tVar9 = (q3t) this.b;
        if (q3tVar9 != null) {
            q3tVar9.e.b.setOnClickListener(new View.OnClickListener() { // from class: nxj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GamesFallbackLobbyV2 gamesFallbackLobbyV2 = this.a.G;
                    if (gamesFallbackLobbyV2 != null) {
                        gamesFallbackLobbyV2.e();
                    }
                }
            });
        }
        q3t q3tVar10 = (q3t) this.b;
        if (q3tVar10 != null) {
            q3tVar10.e.d.setOnClickListener(new axj());
        }
        final LobbyV2ViewModel lobbyV2ViewModel3 = (LobbyV2ViewModel) this.a;
        if (lobbyV2ViewModel3 != null) {
            ?? r6 = new gaj() { // from class: gxj
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    LobbyV2GameDetailsModel lobbyV2GameDetailsModel = (LobbyV2GameDetailsModel) obj;
                    gnj gnjVar = (gnj) obj2;
                    lobbyV2GameDetailsModel.getClass();
                    gnjVar.getClass();
                    oxj oxjVar = this.a;
                    oxjVar.D = (GameLogData) obj3;
                    lobbyV2ViewModel3.K1();
                    GameDetails legacyGameDetails = lobbyV2GameDetailsModel.toLegacyGameDetails();
                    Integer position = lobbyV2GameDetailsModel.getPosition();
                    oxjVar.s0(legacyGameDetails, position != null ? position.intValue() : 0, gnjVar.name());
                    try {
                        Integer id = legacyGameDetails.getId();
                        if (id != null) {
                            int iIntValue = id.intValue();
                            GamesFallbackLobbyV2 gamesFallbackLobbyV2 = oxjVar.G;
                            if (gamesFallbackLobbyV2 != null) {
                                gamesFallbackLobbyV2.d(iIntValue);
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    return Unit.a;
                }
            };
            GamesFallbackLobbyV2 gamesFallbackLobbyV2 = this.G;
            if (gamesFallbackLobbyV2 == null) {
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                GamesFallbackLobbyV2 gamesFallbackLobbyV3 = new GamesFallbackLobbyV2(contextRequireContext, objArr == true ? 1 : 0, 6, i2);
                this.G = gamesFallbackLobbyV3;
                List<Integer> list = this.E;
                d dVar = new d();
                ?? r7 = new Function0() { // from class: hxj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ((x5a0) this.a.F).setValue(Boolean.TRUE);
                        return Unit.a;
                    }
                };
                ?? r8 = new Function0() { // from class: ixj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ((x5a0) this.a.F).setValue(Boolean.FALSE);
                        return Unit.a;
                    }
                };
                list.getClass();
                LobbyWebView lobbyWebView = gamesFallbackLobbyV3.a;
                lobbyWebView.setLoadingCallbacks(gamesFallbackLobbyV3);
                gamesFallbackLobbyV3.a.f(list, dVar, r6, r7, r8);
                gamesFallbackLobbyV3.b.setVisibility(0);
                lobbyWebView.e();
                gamesFallbackLobbyV2 = gamesFallbackLobbyV3;
            }
            if (gamesFallbackLobbyV2.getCurrentLobbyWebViewPage() != b5c.a) {
                gamesFallbackLobbyV2.e();
            }
            ViewParent parent = gamesFallbackLobbyV2.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(gamesFallbackLobbyV2);
            }
            q3t q3tVar11 = (q3t) this.b;
            if (q3tVar11 != null) {
                q3tVar11.c.addView(gamesFallbackLobbyV2, new FrameLayout.LayoutParams(-1, -1));
            }
            q3t q3tVar12 = (q3t) this.b;
            if (q3tVar12 != null) {
                q3tVar12.b.setContent(new op8(1036670113, new Function2() { // from class: jxj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            orp.a(sjj.a(), pp8.b(-1564429504, new eo1(this.a, lobbyV2ViewModel3), aVar), aVar, 48);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true));
            }
            q3t q3tVar13 = (q3t) this.b;
            if (q3tVar13 != null) {
                q3tVar13.d.setVisibility(this.J ? 0 : 8);
            }
            if (this.J && (q3tVar = (q3t) this.b) != null) {
                q3tVar.d.setContent(q39.a);
            }
            try {
                q0().d.f(getViewLifecycleOwner(), new e(new qt6(this, i3)));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void p0() {
        Bundle bundle = this.f;
        if (bundle != null) {
            String string = bundle.containsKey("game") ? bundle.getString("game") : null;
            if (string != null) {
                Map<String, String> map = o8d.a;
                String str = o8d.a.get(URLEncoder.encode(string, "UTF-8"));
                VM vm = this.a;
                if (str != null) {
                    LobbyV2ViewModel lobbyV2ViewModel = (LobbyV2ViewModel) vm;
                    if (lobbyV2ViewModel != null) {
                        lobbyV2ViewModel.B1(str);
                        return;
                    }
                    return;
                }
                LobbyV2ViewModel lobbyV2ViewModel2 = (LobbyV2ViewModel) vm;
                if (lobbyV2ViewModel2 != null) {
                    lobbyV2ViewModel2.B1(string);
                }
            }
        }
    }

    public final fuj q0() {
        return (fuj) this.H.getValue();
    }

    public final void r0() {
        String string;
        Bundle bundle = this.f;
        if (bundle == null || (string = bundle.getString("action")) == null) {
            return;
        }
        if (string.equals("bonus-vault")) {
            ((xw4) this.K.getValue()).A1();
        }
        this.f = null;
        setArguments(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r11.isConnectedOrConnecting() != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0(com.sportygames.lobby.remote.models.GameDetails r9, int r10, java.lang.String r11) {
        /*
            r8 = this;
            android.content.Context r2 = r8.getContext()
            if (r2 == 0) goto L8b
            r0 = 1
            r8.e = r0
            java.lang.String r1 = "FAVOURITE"
            boolean r1 = kotlin.jvm.internal.Intrinsics.g(r11, r1)
            if (r1 == 0) goto L13
            java.lang.String r11 = "My favourites"
        L13:
            r5 = r11
            java.lang.String r11 = "connectivity"
            java.lang.Object r11 = r2.getSystemService(r11)
            r11.getClass()
            android.net.ConnectivityManager r11 = (android.net.ConnectivityManager) r11
            android.net.Network r1 = r11.getActiveNetwork()
            r3 = 0
            if (r1 != 0) goto L27
            goto L56
        L27:
            android.net.NetworkCapabilities r1 = r11.getNetworkCapabilities(r1)
            if (r1 != 0) goto L2e
            goto L56
        L2e:
            boolean r4 = r1.hasTransport(r3)
            if (r4 != 0) goto L6e
            r4 = 3
            boolean r4 = r1.hasTransport(r4)
            if (r4 != 0) goto L6e
            boolean r0 = r1.hasTransport(r0)
            if (r0 == 0) goto L42
            goto L6e
        L42:
            android.net.NetworkInfo r0 = r11.getActiveNetworkInfo()
            if (r0 == 0) goto L56
            android.net.NetworkInfo r11 = r11.getActiveNetworkInfo()
            r11.getClass()
            boolean r11 = r11.isConnectedOrConnecting()
            if (r11 == 0) goto L56
            goto L6e
        L56:
            op5 r8 = defpackage.op5.a
            r9 = 2132021401(0x7f141099, float:1.9681192E38)
            java.lang.String r9 = r2.getString(r9)
            r10 = 2132021400(0x7f141098, float:1.968119E38)
            java.lang.String r8 = defpackage.at6.a(r9, r2, r10, r8, r9)
            android.widget.Toast r8 = android.widget.Toast.makeText(r2, r8, r3)
            r8.show()
            return
        L6e:
            java.lang.Integer r11 = r9.getId()
            if (r11 == 0) goto L7f
            int r11 = r11.intValue()
            com.sportygames.compose.lobbyv2.webview.GamesFallbackLobbyV2 r0 = r8.G
            if (r0 == 0) goto L7f
            r0.d(r11)
        L7f:
            com.sportygames.compose.lobbyv2.models.GameLogData r6 = r8.D
            r7 = 64
            yjj r0 = r8.i
            r3 = 0
            r1 = r9
            r4 = r10
            defpackage.yjj.c(r0, r1, r2, r3, r4, r5, r6, r7)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxj.s0(com.sportygames.lobby.remote.models.GameDetails, int, java.lang.String):void");
    }

    public final void t0() {
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager != null) {
            sportyGamesManager.getUser();
        }
        LobbyV2ViewModel lobbyV2ViewModel = (LobbyV2ViewModel) this.a;
        if (lobbyV2ViewModel != null) {
            lobbyV2ViewModel.C1(null);
        }
    }

    public final void u0() {
        Intent intent = new Intent(requireContext(), (Class<?>) GameMainActivity.class);
        intent.putExtra("gameDetail", new GameDetails(null, null, null, "Stacker", null, null, null, null, "sportygames/Stacker", null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 16776950, null));
        requireContext().startActivity(intent);
    }
}
