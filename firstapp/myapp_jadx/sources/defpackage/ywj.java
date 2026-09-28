package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.sporty.android.book.domain.entity.Category;
import com.sportybet.android.gp.tz.R;
import com.sportygames.common.network.campaign.Campaign;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.ServiceObserver;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.utils.CasinoLogger;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.compose.lobbyv2.models.GameLogData;
import com.sportygames.compose.lobbyv2.models.LobbyV2AddFavouritesResponse;
import com.sportygames.compose.lobbyv2.models.LobbyV2CategoryItemModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2ProviderDetailsModel;
import com.sportygames.compose.lobbyv2.models.UIState;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import com.sportygames.compose.lobbyv2.viewmodels.e;
import com.sportygames.lobby.remote.models.CategoriesResponse;
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
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import ywj.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lywj;", "Ll12;", "Lcom/sportygames/compose/lobbyv2/viewmodels/LobbyV2ViewModel;", "Lw3t;", "", "Lr0t;", "Lxjj;", "<init>", "()V", "", "isManualRefreshingState", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ywj extends l12<LobbyV2ViewModel, w3t> implements r0t, xjj {
    public fq5 A;
    public final String B;
    public ck60 C;
    public String D;
    public List<? extends File> E;
    public String F;
    public String G;
    public phx H;
    public GameLogData I;
    public final q8i0 J;
    public final q8i0 K;
    public boolean L;
    public final ttr M;
    public boolean e;
    public boolean f;
    public Bundle i;
    public boolean w;
    public final ttr c = hwr.a(a1s.a, new l());
    public final String d = "Lobby";
    public final yjj v = new yjj();
    public final ArrayList<CategoriesResponse> y = new ArrayList<>();
    public String z = "";

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

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
            int[] iArr2 = new int[gbh0.values().length];
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                gbh0 gbh0Var = gbh0.a;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr2;
            int[] iArr3 = new int[Status.values().length];
            try {
                iArr3[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Status.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Status.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr3;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((ywj) this.receiver).y0();
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<nt4, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(nt4 nt4Var) {
            nt4 nt4Var2 = nt4Var;
            nt4Var2.getClass();
            ywj ywjVar = (ywj) this.receiver;
            ywjVar.getClass();
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
                        ywjVar.v0(gameDetails, 0, "");
                    }
                } else if (!z || str2.length() <= 0) {
                    Intent intent = new Intent(ywjVar.requireContext(), (Class<?>) GameMainActivity.class);
                    intent.putExtra("gameDetail", new GameDetails(null, null, null, "Bonus Cup", null, null, null, null, "sportygames/Bonus Cup", null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 16776950, null));
                    ywjVar.requireContext().startActivity(intent);
                } else {
                    ywjVar.v0(gameDetails, 0, "");
                }
            } else if (!z || str2.length() <= 0) {
                ywjVar.y0();
            } else {
                ywjVar.v0(gameDetails, 0, "");
            }
            return Unit.a;
        }
    }

    public static final class d implements ikx {
        public final /* synthetic */ ytw<Boolean> b;
        public final /* synthetic */ LobbyV2ViewModel c;
        public final /* synthetic */ ComposeView d;

        public d(ytw<Boolean> ytwVar, LobbyV2ViewModel lobbyV2ViewModel, ComposeView composeView) {
            this.b = ytwVar;
            this.c = lobbyV2ViewModel;
            this.d = composeView;
        }

        @Override // defpackage.ikx
        public final void a(Integer num, String str, String str2) {
            this.b.setValue(Boolean.FALSE);
            ywj ywjVar = ywj.this;
            w3t w3tVar = (w3t) ywjVar.b;
            if (w3tVar != null) {
                w3tVar.e.c.setVisibility(8);
            }
            w3t w3tVar2 = (w3t) ywjVar.b;
            if (w3tVar2 != null) {
                w3tVar2.e.b.setVisibility(0);
            }
            w3t w3tVar3 = (w3t) ywjVar.b;
            if (w3tVar3 != null) {
                w3tVar3.e.y.setVisibility(0);
            }
            w3t w3tVar4 = (w3t) ywjVar.b;
            if (w3tVar4 != null) {
                w3tVar4.e.y.setSelected(true);
            }
            if (str != null) {
                if (Intrinsics.g(str2, "game_providers")) {
                    w3t w3tVar5 = (w3t) ywjVar.b;
                    if (w3tVar5 != null) {
                        w3tVar5.e.y.setText(str);
                    }
                } else {
                    String strC = mn5.c(mn5.d(ywjVar.getContext(), str2 == null ? "" : str2, str, 6));
                    w3t w3tVar6 = (w3t) ywjVar.b;
                    if (w3tVar6 != null) {
                        w3tVar6.e.y.setText(strC);
                    }
                }
            }
            if (num == null || str2 == null) {
                return;
            }
            l1z l1zVarT0 = ywjVar.t0();
            l1zVarT0.getClass();
            hym.a(l1zVarT0.a, "game_lobby__game_section__click", jpu.b(new Pair("section", str2)), 12);
            boolean zEquals = str2.equals("my_favourites");
            final LobbyV2ViewModel lobbyV2ViewModel = this.c;
            if (zEquals) {
                lobbyV2ViewModel.I1();
                return;
            }
            if (str2.equals("recommended_games")) {
                lobbyV2ViewModel.getClass();
                lobbyV2ViewModel.X = rs5.a(new ymz(new joz(new qbt(lobbyV2ViewModel, 0), null), new iqz(30, 10, true, 30, 0, 48), null).e, o8i0.d(lobbyV2ViewModel));
                return;
            }
            if (str2.equals("trending_for_players_like_you")) {
                lobbyV2ViewModel.getClass();
                lobbyV2ViewModel.b0 = rs5.a(new ymz(new joz(new Function0() { // from class: nbt
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        LobbyV2ViewModel lobbyV2ViewModel2 = lobbyV2ViewModel;
                        List<Integer> list = lobbyV2ViewModel2.a0;
                        list.getClass();
                        return new LobbyV2ViewModel.b(new LobbyV2ViewModel.c(LobbyV2ViewModel.d.f, null, list, 2), lobbyV2ViewModel2.a);
                    }
                }, null), new iqz(30, 10, true, 30, 0, 48), null).e, o8i0.d(lobbyV2ViewModel));
                return;
            }
            if (str2.equals("recently_played")) {
                ComposeView composeView = this.d;
                if (composeView.getContext() != null) {
                    Context context = composeView.getContext();
                    context.getClass();
                    lobbyV2ViewModel.H1(context);
                    return;
                }
                return;
            }
            if (str2.equals("game_providers")) {
                int iIntValue = num.intValue();
                lobbyV2ViewModel.getClass();
                ej5.c(o8i0.d(lobbyV2ViewModel), null, null, new com.sportygames.compose.lobbyv2.viewmodels.f(lobbyV2ViewModel, iIntValue, null), 3);
            } else if (!lobbyV2ViewModel.d0.containsKey(num)) {
                ej5.c(o8i0.d(lobbyV2ViewModel), null, null, new com.sportygames.compose.lobbyv2.viewmodels.e(lobbyV2ViewModel, num.intValue(), true, null), 3);
            } else {
                final int iIntValue2 = num.intValue();
                lobbyV2ViewModel.e0.put(num, rs5.a(new ymz(new joz(new Function0() { // from class: pbt
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        LobbyV2ViewModel lobbyV2ViewModel2 = lobbyV2ViewModel;
                        List list = (List) lobbyV2ViewModel2.d0.get(Integer.valueOf(iIntValue2));
                        if (list == null) {
                            list = m2g.a;
                        }
                        list.getClass();
                        return new LobbyV2ViewModel.b(new LobbyV2ViewModel.c(LobbyV2ViewModel.d.i, null, list, 2), lobbyV2ViewModel2.a);
                    }
                }, null), new iqz(30, 10, true, 30, 0, 48), null).e, o8i0.d(lobbyV2ViewModel)));
            }
        }

        @Override // defpackage.ikx
        public final void b() {
            this.b.setValue(Boolean.FALSE);
            ywj ywjVar = ywj.this;
            w3t w3tVar = (w3t) ywjVar.b;
            if (w3tVar != null) {
                w3tVar.e.c.setVisibility(0);
            }
            w3t w3tVar2 = (w3t) ywjVar.b;
            if (w3tVar2 != null) {
                w3tVar2.e.b.setVisibility(8);
            }
            w3t w3tVar3 = (w3t) ywjVar.b;
            if (w3tVar3 != null) {
                w3tVar3.e.y.setVisibility(8);
            }
            w3t w3tVar4 = (w3t) ywjVar.b;
            if (w3tVar4 != null) {
                w3tVar4.e.y.setText(ywjVar.getString(R.string.app_name_lib));
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
            return ywj.this.requireActivity().getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ywj.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class h extends qlr implements Function0<r8i0.c> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ywj.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class i extends qlr implements Function0<v8i0> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ywj.this.requireActivity().getViewModelStore();
        }
    }

    public static final class j extends qlr implements Function0<cyb> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ywj.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class k extends qlr implements Function0<r8i0.c> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ywj.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class l implements Function0<l1z> {
        public l() {
        }

        /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, l1z] */
        /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, l1z] */
        @Override // kotlin.jvm.functions.Function0
        public final l1z invoke() {
            nv60 nv60Var = ywj.this;
            return nv60Var instanceof rrp ? ((rrp) nv60Var).j().a(jq40.a(l1z.class), null, null) : sjj.b().c.d.a(jq40.a(l1z.class), null, null);
        }
    }

    public static final class m implements Function0<Fragment> {
        public m() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return ywj.this;
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
            v8i0 viewModelStore = ywj.this.getViewModelStore();
            ywj ywjVar = ywj.this;
            cyb defaultViewModelCreationExtras = ywjVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(xw4.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(ywjVar), null);
        }
    }

    public ywj() {
        new Handler(Looper.getMainLooper());
        this.B = "My Fav";
        this.D = "";
        this.F = "en";
        this.G = "";
        this.J = new q8i0(jq40.a(fuj.class), new f(), new h(), new g());
        this.K = new q8i0(jq40.a(db6.class), new i(), new k(), new j());
        this.M = hwr.a(a1s.c, new n(new m()));
    }

    @Override // defpackage.r0t
    public final void a0() {
        LobbyV2ViewModel lobbyV2ViewModel = (LobbyV2ViewModel) this.a;
        if (lobbyV2ViewModel != null) {
            lobbyV2ViewModel.C1(null);
        }
    }

    @Override // defpackage.r0t
    public final void e0() {
        this.f = true;
    }

    @Override // defpackage.l12
    public final g6i0 o0() {
        View viewInflate = getLayoutInflater().inflate(R.layout.lobby_v2_fragment, (ViewGroup) null, false);
        int i2 = R.id.lobby_content;
        ComposeView composeView = (ComposeView) h5e.a(R.id.lobby_content, viewInflate);
        if (composeView != null) {
            i2 = R.id.lobby_toast_container;
            ComposeView composeView2 = (ComposeView) h5e.a(R.id.lobby_toast_container, viewInflate);
            if (composeView2 != null) {
                i2 = R.id.snowfall_content;
                ComposeView composeView3 = (ComposeView) h5e.a(R.id.snowfall_content, viewInflate);
                if (composeView3 != null) {
                    i2 = R.id.toolbar_layout;
                    View viewA = h5e.a(R.id.toolbar_layout, viewInflate);
                    if (viewA != null) {
                        return new w3t((ConstraintLayout) viewInflate, composeView, composeView2, composeView3, do80.a(viewA));
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        LobbyV2ViewModel lobbyV2ViewModel = (LobbyV2ViewModel) this.a;
        if (lobbyV2ViewModel != null) {
            ej5.c(o8i0.d(lobbyV2ViewModel), null, null, new sbt(lobbyV2ViewModel, null), 3);
        }
        this.A = null;
        LobbyV2ViewModel lobbyV2ViewModel2 = (LobbyV2ViewModel) this.a;
        if (lobbyV2ViewModel2 != null) {
            ssw<UIState<HTTPResponse<LobbyV2AddFavouritesResponse>>> sswVar = lobbyV2ViewModel2.w;
            lobbyV2ViewModel2.d.l(this);
            lobbyV2ViewModel2.e.l(this);
            sswVar.l(this);
            sswVar.l(this);
            lobbyV2ViewModel2.y.l(this);
            lobbyV2ViewModel2.B.l(this);
            lobbyV2ViewModel2.C.l(this);
        }
        if (this.G.length() == 0) {
            SportyGamesManager.setCurrentLanguageCode("");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.e = false;
        try {
            s0().y1();
            s0().e.l(getViewLifecycleOwner());
            s0().d.l(getViewLifecycleOwner());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        SharedPreferences sharedPreferences;
        fq5 fq5Var;
        final LobbyV2ViewModel lobbyV2ViewModel;
        LobbyV2ViewModel lobbyV2ViewModel2;
        super.onResume();
        SportyGamesManager.getInstance().setScreenName("sportygames/lobby");
        wz.a("LobbyVisit", "Android", new String[0]);
        CasinoLogger.INSTANCE.logEventToCasino("LobbyVisit", vj5.a(new Pair("Platform", "ANDROID"), new Pair("countryCode", this.z)));
        hym.a(t0().a, "game_lobby__game__view", null, 14);
        Context context = getContext();
        if (context != null) {
            SportyGamesManager.setApplicationContext(context.getApplicationContext());
        }
        op5.a.getClass();
        op5.d = 0L;
        if (this.w && (lobbyV2ViewModel2 = (LobbyV2ViewModel) this.a) != null) {
            w3t w3tVar = (w3t) this.b;
            lobbyV2ViewModel2.C1(jpu.b(new Pair("user_logged_in_status", String.valueOf(w3tVar != null && w3tVar.e.v.getVisibility() == 8))));
        }
        try {
            if (getView() != null && (lobbyV2ViewModel = (LobbyV2ViewModel) this.a) != null) {
                lobbyV2ViewModel.z.f(getViewLifecycleOwner(), new e(new Function1() { // from class: ewj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Integer num = (Integer) obj;
                        LobbyV2ViewModel lobbyV2ViewModel3 = lobbyV2ViewModel;
                        if (num != null && num.intValue() == 999888999) {
                            Context context2 = this.a.getContext();
                            if (context2 != null) {
                                lobbyV2ViewModel3.getClass();
                                ej5.c(o8i0.d(lobbyV2ViewModel3), null, null, new xbt(context2, lobbyV2ViewModel3, null, null), 3);
                            }
                        } else if (num != null && num.intValue() == 888999888) {
                            lobbyV2ViewModel3.I1();
                        } else {
                            num.getClass();
                            int iIntValue = num.intValue();
                            lobbyV2ViewModel3.getClass();
                            ej5.c(o8i0.d(lobbyV2ViewModel3), null, null, new e(lobbyV2ViewModel3, iIntValue, false, null), 3);
                        }
                        return Unit.a;
                    }
                }));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            if (getView() != null) {
                String str = this.d;
                ibs viewLifecycleOwner = getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                db6 db6VarR0 = r0();
                fuj fujVarS0 = s0();
                str.getClass();
                db6VarR0.B1(str, new ia6(db6VarR0, false, fujVarS0, viewLifecycleOwner, new bq40()));
            }
            s0().x1();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        if (!Intrinsics.g(SportyGamesManager.getInstance().getLanguageCode(), this.D)) {
            SportyGamesManager.setCurrentLanguageCode(SportyGamesManager.getInstance().getLanguageCode());
            String languageCode = SportyGamesManager.getInstance().getLanguageCode();
            languageCode.getClass();
            this.D = languageCode;
            ArrayList<String> arrayList = vlr.a.get("lobby");
            if (arrayList != null && arrayList.contains(SportyGamesManager.getInstance().getLanguageCode())) {
                this.F = xwj.a();
            }
            Context context2 = getContext();
            if (context2 != null && (fq5Var = this.A) != null) {
                fq5Var.x1(context2, kotlin.collections.b.f("currency_symbols", "sg_lobby_banner", "sg_lobby_categories", "sg_lobby", "sg_lobby_sections", "sg_game_description", "sg_game_common", "sg_common", "sg_common_dialog_message", "sg_exit_dialog", "sg_campaign", "sg_games_promotions"), this.F);
            }
        }
        op5 op5Var = op5.a;
        List<? extends File> list = this.E;
        op5Var.getClass();
        op5.b = list;
        this.w = true;
        ck60 ck60Var = this.C;
        if (ck60Var == null || (sharedPreferences = ck60Var.a) == null) {
            return;
        }
        sharedPreferences.getBoolean("search_visited", false);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [twj] */
    /* JADX WARN: Type inference failed for: r8v0, types: [swj] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        fq5 fq5Var;
        LobbyV2ViewModel lobbyV2ViewModel;
        final ywj ywjVar;
        w3t w3tVar;
        ssw<UIState<HTTPResponse<List<LobbyV2CategoryItemModel>>>> sswVar;
        ssw<LoadingState<HTTPResponse<WalletInfo>>> sswVar2;
        Resources resources;
        Configuration configuration;
        String str;
        ssw<LoadingState<List<File>>> sswVar3;
        view.getClass();
        super.onViewCreated(view, bundle);
        SportyGamesManager.setApplicationContext(requireContext().getApplicationContext());
        SportyGamesManager.getInstance().setScreenName("sportygames/lobby");
        androidx.fragment.app.e activity = getActivity();
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
        this.A = fq5Var;
        Bundle arguments = getArguments();
        this.v.getClass();
        this.i = yjj.f(arguments);
        Bundle arguments2 = getArguments();
        int i2 = 0;
        this.L = arguments2 != null ? arguments2.getBoolean("isChristmasThemeEnabled") : false;
        fq5 fq5Var2 = this.A;
        if (fq5Var2 != null && (sswVar3 = fq5Var2.c) != null) {
            sswVar3.f(getViewLifecycleOwner(), new e(new Function1() { // from class: yvj
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    LoadingState loadingState = (LoadingState) obj;
                    Status status = loadingState.getStatus();
                    Status status2 = Status.SUCCESS;
                    ywj ywjVar2 = this.a;
                    if (status == status2) {
                        op5 op5Var = op5.a;
                        List<? extends File> list = (List) loadingState.getData();
                        op5Var.getClass();
                        op5.b = list;
                        ywjVar2.E = (List) loadingState.getData();
                        ywjVar2.w0();
                        w3t w3tVar2 = (w3t) ywjVar2.b;
                        op5.r(op5Var, b.f(w3tVar2 != null ? w3tVar2.e.i : null, w3tVar2 != null ? w3tVar2.e.w : null), null, 6);
                    } else if (loadingState.getStatus() == Status.FAILED) {
                        ywjVar2.w0();
                    }
                    return Unit.a;
                }
            }));
        }
        final androidx.fragment.app.e activity2 = getActivity();
        if (activity2 != null) {
            mny.a(activity2.getOnBackPressedDispatcher(), this, new Function1() { // from class: zvj
                /* JADX WARN: Code duplicated, block: B:14:0x0042  */
                /* JADX WARN: Code duplicated, block: B:16:0x0046  */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    phx phxVar;
                    ((cny) obj).getClass();
                    ywj ywjVar2 = this.a;
                    phx phxVar2 = ywjVar2.H;
                    if (phxVar2 == null) {
                        phxVar = ywjVar2.H;
                        if (phxVar != null) {
                            phxVar.j();
                        }
                    } else {
                        igx igxVar = phxVar2.b;
                        ygx ygxVarI = igxVar.i();
                        if (Intrinsics.g(ygxVarI != null ? ygxVarI.b.f : null, igxVar.j().i.e)) {
                            boolean z = ywjVar2.e;
                            androidx.fragment.app.e eVar = activity2;
                            if (z) {
                                eVar.finish();
                            } else {
                                mpe0 mpe0Var = yyf0.a;
                                yyf0.a(0, eVar, eVar.getString(R.string.app_common__press_once_again_to_exit));
                                ywjVar2.e = true;
                            }
                        } else {
                            phxVar = ywjVar2.H;
                            if (phxVar != null) {
                                phxVar.j();
                            }
                        }
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
            this.z = upperCase;
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
        if (lobbyV2ViewModel != null) {
            UIState<List<LobbyV2GameDetailsModel>> uIStateD = lobbyV2ViewModel.D.d();
            if ((uIStateD != null ? uIStateD.getUiStatus() : null) != gbh0.b) {
                if ((uIStateD != null ? uIStateD.getUiStatus() : null) != gbh0.c) {
                    ej5.c(o8i0.d(lobbyV2ViewModel), null, null, new com.sportygames.compose.lobbyv2.viewmodels.d(lobbyV2ViewModel, null), 3);
                }
            }
        }
        if (Intrinsics.g(SportyGamesManager.getInstance().getLanguageCode(), SportyGamesManager.getCurrentLanguageCode())) {
            this.D = xwj.a();
            w0();
        }
        Context context = getContext();
        if (context != null) {
            this.C = new ck60(context, "sg_user_search");
            if (!context.getSharedPreferences("ram_check", 0).getBoolean("ram_check_event", false)) {
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
                    hym.a(t0().a, "game_lobby__device__ram", jpu.b(new Pair("ram", str)), 12);
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
                    t0().b(awa.a(fValueOf.floatValue()), fValueOf);
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
                t0().c(displayMetrics.heightPixels, displayMetrics.widthPixels, dJ1);
            }
        }
        w3t w3tVar2 = (w3t) this.b;
        if (w3tVar2 != null) {
            w3tVar2.e.c.setVisibility(0);
        }
        w3t w3tVar3 = (w3t) this.b;
        if (w3tVar3 != null) {
            w3tVar3.e.b.setVisibility(8);
        }
        w3t w3tVar4 = (w3t) this.b;
        if (w3tVar4 != null) {
            w3tVar4.e.y.setVisibility(8);
        }
        w3t w3tVar5 = (w3t) this.b;
        if (w3tVar5 != null) {
            w3tVar5.e.A.setEnabled(true);
        }
        try {
            Context context3 = getContext();
            if (context3 != null) {
                context3.startService(new Intent(context3, (Class<?>) ServiceObserver.class));
            }
        } catch (Exception unused) {
        }
        LobbyV2ViewModel lobbyV2ViewModel2 = (LobbyV2ViewModel) this.a;
        if (lobbyV2ViewModel2 != null && (sswVar2 = lobbyV2ViewModel2.d) != null) {
            sswVar2.f(getViewLifecycleOwner(), new e(new wvj(this, i2)));
        }
        msj.l.f(getViewLifecycleOwner(), new e(new xvj(i2)));
        try {
            LobbyV2ViewModel lobbyV2ViewModel3 = (LobbyV2ViewModel) this.a;
            if (lobbyV2ViewModel3 != null && (sswVar = lobbyV2ViewModel3.B) != null) {
                sswVar.f(getViewLifecycleOwner(), new e(new Function1() { // from class: gwj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List<LobbyV2CategoryItemModel> list;
                        UIState uIState = (UIState) obj;
                        if (ywj.a.a[uIState.getUiStatus().ordinal()] == 1) {
                            HTTPResponse hTTPResponse = (HTTPResponse) uIState.getData();
                            if (hTTPResponse == null || (list = (List) hTTPResponse.getData()) == null) {
                                list = m2g.a;
                            }
                            if (!list.isEmpty()) {
                                ywj ywjVar2 = this.a;
                                Bundle bundle2 = ywjVar2.i;
                                if (bundle2 != null) {
                                    String string = bundle2.containsKey(Category.CATEGORY_ID) ? bundle2.getString(Category.CATEGORY_ID) : null;
                                    if (string != null) {
                                        String strP = c.p(string, "+", " ", false);
                                        int id = -1;
                                        for (LobbyV2CategoryItemModel lobbyV2CategoryItemModel : list) {
                                            if (c.l(lobbyV2CategoryItemModel.getName(), strP, true)) {
                                                id = lobbyV2CategoryItemModel.getId();
                                            }
                                        }
                                        if (id != -1) {
                                            LobbyV2ViewModel lobbyV2ViewModel4 = (LobbyV2ViewModel) ywjVar2.a;
                                            if (lobbyV2ViewModel4 != null) {
                                                lobbyV2ViewModel4.z.j(Integer.valueOf(id));
                                            }
                                            LobbyV2ViewModel lobbyV2ViewModel5 = (LobbyV2ViewModel) ywjVar2.a;
                                            if (lobbyV2ViewModel5 != null) {
                                                lobbyV2ViewModel5.O1(id);
                                            }
                                        }
                                    }
                                }
                                Bundle bundle3 = ywjVar2.i;
                                if (bundle3 != null && !bundle3.containsKey("game")) {
                                    ywjVar2.i = null;
                                    ywjVar2.setArguments(null);
                                }
                            }
                        }
                        return Unit.a;
                    }
                }));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        ebs.a(getLifecycle()).b(new zwj(this, null));
        w3t w3tVar6 = (w3t) this.b;
        if (w3tVar6 != null) {
            w3tVar6.e.i.setOnClickListener(new bwj());
        }
        w3t w3tVar7 = (w3t) this.b;
        if (w3tVar7 != null) {
            w3tVar7.e.w.setOnClickListener(new cwj());
        }
        w3t w3tVar8 = (w3t) this.b;
        if (w3tVar8 != null) {
            w3tVar8.e.A.setOnClickListener(new dwj());
        }
        w3t w3tVar9 = (w3t) this.b;
        if (w3tVar9 != null) {
            w3tVar9.e.b.setOnClickListener(new fwj(this, i2));
        }
        w3t w3tVar10 = (w3t) this.b;
        if (w3tVar10 != null) {
            w3tVar10.e.d.setOnClickListener(new pwj());
        }
        final LobbyV2ViewModel lobbyV2ViewModel4 = (LobbyV2ViewModel) this.a;
        if (lobbyV2ViewModel4 != null) {
            final qwj qwjVar = new qwj(this, i2);
            final rwj rwjVar = new rwj(i2, this, lobbyV2ViewModel4);
            final ?? r8 = new Function2() { // from class: swj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    zj60 bridge;
                    LobbyV2ProviderDetailsModel lobbyV2ProviderDetailsModel = (LobbyV2ProviderDetailsModel) obj;
                    ((Integer) obj2).getClass();
                    lobbyV2ProviderDetailsModel.getClass();
                    String name = lobbyV2ProviderDetailsModel.getName();
                    if (name != null && name.length() > 0) {
                        try {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("Provider", name);
                            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                            if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
                                ((bk60) bridge).a("ProviderClick", bundle2);
                            }
                            CasinoLogger.INSTANCE.logEventToCasino("ProviderClick", vj5.a(new Pair("Provider", name)));
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                    phx phxVar = this.a.H;
                    if (phxVar != null) {
                        Integer id = lobbyV2ProviderDetailsModel.getId();
                        int iIntValue = id != null ? id.intValue() : 0;
                        String name2 = lobbyV2ProviderDetailsModel.getName();
                        if (name2 == null) {
                            name2 = "";
                        }
                        yfx.i(phxVar, uf80.a(uqe0.a(iIntValue, "section?id=", "&name=", Uri.encode(name2), "&key="), Uri.encode("game_providers"), "&catId=0"), null, 6);
                    }
                    return Unit.a;
                }
            };
            final ?? r10 = new Function0() { // from class: twj
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Context context4 = this.a.getContext();
                    if (context4 != null) {
                        LobbyV2ViewModel lobbyV2ViewModel5 = lobbyV2ViewModel4;
                        lobbyV2ViewModel5.getClass();
                        ej5.c(o8i0.d(lobbyV2ViewModel5), null, null, new xbt(context4, lobbyV2ViewModel5, null, null), 3);
                    }
                    return Unit.a;
                }
            };
            w3t w3tVar11 = (w3t) this.b;
            if (w3tVar11 != null) {
                w3tVar11.c.setContent(new op8(30616264, new Function2() { // from class: uwj
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        int i3 = 0;
                        int i4 = 1;
                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            ywj ywjVar2 = this.a;
                            a390<nw4> a390Var = ywjVar2.q0().y;
                            s9s.b bVar = s9s.b.a;
                            nw4 nw4Var = (nw4) wyh.b(a390Var, nw4.c.a, aVar, 3072, 10).getValue();
                            Campaign campaign = (Campaign) wyh.b(ywjVar2.r0().w, null, aVar, 48, 14).getValue();
                            boolean zA = aVar.A(ywjVar2);
                            Object objY = aVar.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (zA || objY == c0042a) {
                                objY = new vaf(ywjVar2, i4);
                                aVar.r(objY);
                            }
                            Function0 function0 = (Function0) objY;
                            boolean zA2 = aVar.A(ywjVar2);
                            Object objY2 = aVar.y();
                            if (zA2 || objY2 == c0042a) {
                                objY2 = new awj(ywjVar2, i3);
                                aVar.r(objY2);
                            }
                            Function0 function1 = (Function0) objY2;
                            boolean zA3 = aVar.A(ywjVar2);
                            Object objY3 = aVar.y();
                            if (zA3 || objY3 == c0042a) {
                                objY3 = new mr6(ywjVar2, i4);
                                aVar.r(objY3);
                            }
                            uw4.a(nw4Var, false, "", campaign, function0, function1, (Function0) objY3, null, null, false, aVar, 384, 898);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true));
            }
            w3t w3tVar12 = (w3t) this.b;
            if (w3tVar12 != null) {
                final ComposeView composeView = w3tVar12.b;
                ywjVar = this;
                composeView.setContent(new op8(1678349119, new Function2() { // from class: vwj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            lrp lrpVarA = sjj.a();
                            final ywj ywjVar2 = this.a;
                            final LobbyV2ViewModel lobbyV2ViewModel5 = lobbyV2ViewModel4;
                            final rwj rwjVar2 = rwjVar;
                            final swj swjVar = r8;
                            final qwj qwjVar2 = qwjVar;
                            final twj twjVar = r10;
                            final ComposeView composeView2 = composeView;
                            orp.a(lrpVarA, pp8.b(-922750498, new Function2() { // from class: hwj
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    a aVar2 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        phx phxVarC = mr10.c(new vkx[0], aVar2);
                                        final ywj ywjVar3 = ywjVar2;
                                        ywjVar3.H = phxVarC;
                                        Object objY = aVar2.y();
                                        a.C0041a.C0042a c0042a = a.C0041a.a;
                                        if (objY == c0042a) {
                                            objY = m.b(Boolean.FALSE);
                                            aVar2.r(objY);
                                        }
                                        final ytw ytwVar = (ytw) objY;
                                        Object objY2 = aVar2.y();
                                        if (objY2 == c0042a) {
                                            objY2 = new iwj(ytwVar, 0);
                                            aVar2.r(objY2);
                                        }
                                        Function0 function0 = (Function0) objY2;
                                        Object objY3 = aVar2.y();
                                        if (objY3 == c0042a) {
                                            objY3 = new jwj(ytwVar, 0);
                                            aVar2.r(objY3);
                                        }
                                        Function0 function1 = (Function0) objY3;
                                        phx phxVar = ywjVar3.H;
                                        xw4 xw4VarQ0 = ywjVar3.q0();
                                        fuj fujVarS0 = ywjVar3.s0();
                                        db6 db6VarR0 = ywjVar3.r0();
                                        boolean zA = aVar2.A(ywjVar3);
                                        Object objY4 = aVar2.y();
                                        if (zA || objY4 == c0042a) {
                                            ywj.b bVar = new ywj.b(0, ywjVar3, ywj.class, "onStackerIconClick", "onStackerIconClick()V", 0);
                                            aVar2.r(bVar);
                                            objY4 = bVar;
                                        }
                                        chp chpVar = (chp) objY4;
                                        boolean zA2 = aVar2.A(ywjVar3);
                                        Object objY5 = aVar2.y();
                                        if (zA2 || objY5 == c0042a) {
                                            ywj.c cVar = new ywj.c(1, ywjVar3, ywj.class, "onBonusVaultGameClick", "onBonusVaultGameClick(Lcom/sportygames/component/vault/models/BonusVaultGame;)V", 0);
                                            aVar2.r(cVar);
                                            objY5 = cVar;
                                        }
                                        LobbyV2ViewModel lobbyV2ViewModel6 = lobbyV2ViewModel5;
                                        ywj.d dVar = ywjVar3.new d(ytwVar, lobbyV2ViewModel6, composeView2);
                                        boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                                        Function0 function2 = (Function0) chpVar;
                                        Function1 function3 = (Function1) ((chp) objY5);
                                        final qwj qwjVar3 = qwjVar2;
                                        boolean zM = aVar2.M(qwjVar3) | aVar2.A(ywjVar3);
                                        Object objY6 = aVar2.y();
                                        if (zM || objY6 == c0042a) {
                                            objY6 = new Function1() { // from class: kwj
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj5) {
                                                    LobbyV2CategoryItemModel lobbyV2CategoryItemModel = (LobbyV2CategoryItemModel) obj5;
                                                    lobbyV2CategoryItemModel.getClass();
                                                    ytwVar.setValue(Boolean.FALSE);
                                                    qwjVar3.invoke(lobbyV2CategoryItemModel);
                                                    l1z l1zVarT0 = ywjVar3.t0();
                                                    String name = lobbyV2CategoryItemModel.getName();
                                                    l1zVarT0.getClass();
                                                    name.getClass();
                                                    hym.a(l1zVarT0.a, "game_lobby__game_category__click", jpu.b(new Pair(Category.CATEGORY_ID, name)), 12);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar2.r(objY6);
                                        }
                                        Function1 function4 = (Function1) objY6;
                                        boolean zA3 = aVar2.A(ywjVar3);
                                        Object objY7 = aVar2.y();
                                        if (zA3 || objY7 == c0042a) {
                                            objY7 = new Function2() { // from class: lwj
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj5, Object obj6) {
                                                    ssw<UIState<HTTPResponse<List<LobbyV2GameDetailsModel>>>> sswVar4;
                                                    ssw<UIState<HTTPResponse<LobbyV2AddFavouritesResponse>>> sswVar5;
                                                    int iIntValue3 = ((Integer) obj5).intValue();
                                                    boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                                                    final ywj ywjVar4 = ywjVar3;
                                                    Context context4 = ywjVar4.getContext();
                                                    if (context4 != null) {
                                                        VM vm = ywjVar4.a;
                                                        if (zBooleanValue2) {
                                                            LobbyV2ViewModel lobbyV2ViewModel7 = (LobbyV2ViewModel) vm;
                                                            if (lobbyV2ViewModel7 != null) {
                                                                lobbyV2ViewModel7.L1(iIntValue3, context4, true);
                                                            }
                                                            LobbyV2ViewModel lobbyV2ViewModel8 = (LobbyV2ViewModel) ywjVar4.a;
                                                            if (lobbyV2ViewModel8 != null && (sswVar5 = lobbyV2ViewModel8.w) != null) {
                                                                sswVar5.f(ywjVar4.getViewLifecycleOwner(), new ywj.e(new Function1() { // from class: owj
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj7) {
                                                                        ssw<UIState<HTTPResponse<LobbyV2AddFavouritesResponse>>> sswVar6;
                                                                        ssw<UIState<HTTPResponse<LobbyV2AddFavouritesResponse>>> sswVar7;
                                                                        UIState<HTTPResponse<LobbyV2AddFavouritesResponse>> uIStateD2;
                                                                        HTTPResponse<LobbyV2AddFavouritesResponse> data;
                                                                        ssw<UIState<HTTPResponse<LobbyV2AddFavouritesResponse>>> sswVar8;
                                                                        UIState uIState = (UIState) obj7;
                                                                        int iOrdinal = uIState.getUiStatus().ordinal();
                                                                        ywj ywjVar5 = ywjVar4;
                                                                        if (iOrdinal == 2) {
                                                                            LobbyV2ViewModel lobbyV2ViewModel9 = (LobbyV2ViewModel) ywjVar5.a;
                                                                            if (lobbyV2ViewModel9 != null && (sswVar7 = lobbyV2ViewModel9.w) != null && (uIStateD2 = sswVar7.d()) != null && (data = uIStateD2.getData()) != null) {
                                                                                data.setData(null);
                                                                            }
                                                                            LobbyV2ViewModel lobbyV2ViewModel10 = (LobbyV2ViewModel) ywjVar5.a;
                                                                            if (lobbyV2ViewModel10 != null && (sswVar6 = lobbyV2ViewModel10.w) != null) {
                                                                                sswVar6.l(ywjVar5.getViewLifecycleOwner());
                                                                            }
                                                                        } else if (iOrdinal == 3) {
                                                                            LobbyV2ViewModel lobbyV2ViewModel11 = (LobbyV2ViewModel) ywjVar5.a;
                                                                            if (lobbyV2ViewModel11 != null && (sswVar8 = lobbyV2ViewModel11.w) != null) {
                                                                                sswVar8.l(ywjVar5.getViewLifecycleOwner());
                                                                            }
                                                                            rcn<String, String> additionalInfo = uIState.getAdditionalInfo();
                                                                            if (additionalInfo != null && additionalInfo.containsKey("LOGIN_REQUIRED")) {
                                                                                ywjVar5.a0();
                                                                            }
                                                                        }
                                                                        return Unit.a;
                                                                    }
                                                                }));
                                                            }
                                                        } else {
                                                            LobbyV2ViewModel lobbyV2ViewModel9 = (LobbyV2ViewModel) vm;
                                                            if (lobbyV2ViewModel9 != null) {
                                                                lobbyV2ViewModel9.L1(iIntValue3, context4, false);
                                                            }
                                                            LobbyV2ViewModel lobbyV2ViewModel10 = (LobbyV2ViewModel) ywjVar4.a;
                                                            if (lobbyV2ViewModel10 != null && (sswVar4 = lobbyV2ViewModel10.y) != null) {
                                                                sswVar4.f(ywjVar4.getViewLifecycleOwner(), new ywj.e(new Function1() { // from class: nwj
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj7) {
                                                                        ssw<UIState<HTTPResponse<List<LobbyV2GameDetailsModel>>>> sswVar6;
                                                                        ssw<UIState<HTTPResponse<List<LobbyV2GameDetailsModel>>>> sswVar7;
                                                                        UIState<HTTPResponse<List<LobbyV2GameDetailsModel>>> uIStateD2;
                                                                        HTTPResponse<List<LobbyV2GameDetailsModel>> data;
                                                                        ssw<UIState<HTTPResponse<List<LobbyV2GameDetailsModel>>>> sswVar8;
                                                                        UIState uIState = (UIState) obj7;
                                                                        int iOrdinal = uIState.getUiStatus().ordinal();
                                                                        ywj ywjVar5 = ywjVar4;
                                                                        if (iOrdinal == 2) {
                                                                            LobbyV2ViewModel lobbyV2ViewModel11 = (LobbyV2ViewModel) ywjVar5.a;
                                                                            if (lobbyV2ViewModel11 != null && (sswVar7 = lobbyV2ViewModel11.y) != null && (uIStateD2 = sswVar7.d()) != null && (data = uIStateD2.getData()) != null) {
                                                                                data.setData(null);
                                                                            }
                                                                            LobbyV2ViewModel lobbyV2ViewModel12 = (LobbyV2ViewModel) ywjVar5.a;
                                                                            if (lobbyV2ViewModel12 != null && (sswVar6 = lobbyV2ViewModel12.y) != null) {
                                                                                sswVar6.l(ywjVar5.getViewLifecycleOwner());
                                                                            }
                                                                        } else if (iOrdinal == 3) {
                                                                            LobbyV2ViewModel lobbyV2ViewModel13 = (LobbyV2ViewModel) ywjVar5.a;
                                                                            if (lobbyV2ViewModel13 != null && (sswVar8 = lobbyV2ViewModel13.y) != null) {
                                                                                sswVar8.l(ywjVar5.getViewLifecycleOwner());
                                                                            }
                                                                            rcn<String, String> additionalInfo = uIState.getAdditionalInfo();
                                                                            if (additionalInfo != null && additionalInfo.containsKey("LOGIN_REQUIRED")) {
                                                                                ywjVar5.a0();
                                                                            }
                                                                        }
                                                                        return Unit.a;
                                                                    }
                                                                }));
                                                            }
                                                        }
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            aVar2.r(objY7);
                                        }
                                        Function2 function5 = (Function2) objY7;
                                        Object objY8 = aVar2.y();
                                        if (objY8 == c0042a) {
                                            objY8 = new mwj(0);
                                            aVar2.r(objY8);
                                        }
                                        j7t.b(phxVar, xw4VarQ0, lobbyV2ViewModel6, fujVarS0, db6VarR0, dVar, function2, function3, rwjVar2, swjVar, function4, function5, twjVar, (Function0) objY8, zBooleanValue, function0, function1, aVar2, 0);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar), aVar, 48);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true));
            } else {
                ywjVar = this;
            }
            w3t w3tVar13 = (w3t) ywjVar.b;
            if (w3tVar13 != null) {
                w3tVar13.d.setVisibility(ywjVar.L ? 0 : 8);
            }
            if (ywjVar.L && (w3tVar = (w3t) ywjVar.b) != null) {
                w3tVar.d.setContent(o39.a);
            }
            try {
                ywjVar.s0().d.f(ywjVar.getViewLifecycleOwner(), new e(new wwj(ywjVar, i2)));
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    public final void p0() {
        Bundle bundle = this.i;
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

    public final xw4 q0() {
        return (xw4) this.M.getValue();
    }

    public final db6 r0() {
        return (db6) this.K.getValue();
    }

    public final fuj s0() {
        return (fuj) this.J.getValue();
    }

    public final l1z t0() {
        return (l1z) this.c.getValue();
    }

    public final void u0() {
        String string;
        Bundle bundle = this.i;
        if (bundle == null || (string = bundle.getString("action")) == null) {
            return;
        }
        if (string.equals("bonus-vault")) {
            q0().A1();
        }
        this.i = null;
        setArguments(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r11.isConnectedOrConnecting() != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(com.sportygames.lobby.remote.models.GameDetails r9, int r10, java.lang.String r11) {
        /*
            r8 = this;
            android.content.Context r2 = r8.getContext()
            if (r2 == 0) goto L7a
            r0 = 1
            r8.f = r0
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
            com.sportygames.compose.lobbyv2.models.GameLogData r6 = r8.I
            r7 = 64
            yjj r0 = r8.v
            r3 = 0
            r1 = r9
            r4 = r10
            defpackage.yjj.c(r0, r1, r2, r3, r4, r5, r6, r7)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywj.v0(com.sportygames.lobby.remote.models.GameDetails, int, java.lang.String):void");
    }

    public final void w0() {
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager != null) {
            sportyGamesManager.getUser();
        }
        LobbyV2ViewModel lobbyV2ViewModel = (LobbyV2ViewModel) this.a;
        if (lobbyV2ViewModel != null) {
            lobbyV2ViewModel.C1(null);
        }
    }

    public final void y0() {
        Intent intent = new Intent(requireContext(), (Class<?>) GameMainActivity.class);
        intent.putExtra("gameDetail", new GameDetails(null, null, null, "Stacker", null, null, null, null, "sportygames/Stacker", null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 16776950, null));
        requireContext().startActivity(intent);
    }

    @Override // defpackage.r0t
    public final void A() {
    }

    @Override // defpackage.r0t
    public final void M() {
    }

    @Override // defpackage.r0t
    public final void r() {
    }

    @Override // defpackage.r0t
    public final void t() {
    }
}
