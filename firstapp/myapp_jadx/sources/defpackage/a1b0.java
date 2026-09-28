package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.BetChipContainerSpin2Win;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.components.SgErrorToastContainer;
import com.sportygames.commons.components.a;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.LeftMenuButton;
import com.sportygames.commons.models.MenuIconSize;
import com.sportygames.commons.models.OnboardingItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.utils.CasinoLogger;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.LobbyMetaInfo;
import com.sportygames.spin2win.components.Spin2WinButtonBoard;
import com.sportygames.spin2win.components.Spin2WinHeader;
import com.sportygames.spin2win.components.Spin2WinNumberBoard;
import com.sportygames.spin2win.components.Spin2WinWheel;
import com.sportygames.spin2win.model.IndividualBetRequest;
import com.sportygames.spin2win.model.PlaceBetPayload;
import com.sportygames.spin2win.model.local.BetList;
import com.sportygames.spin2win.model.local.LocalGameDetailsEntity;
import com.sportygames.spin2win.model.local.Payouts;
import com.sportygames.spin2win.model.local.RecentWins;
import com.sportygames.spin2win.model.response.BetAmountList;
import com.sportygames.spin2win.model.response.BetConfig;
import com.sportygames.spin2win.model.response.BetTypeAndPayouts;
import com.sportygames.spin2win.model.response.ChatRoomResponse;
import com.sportygames.spin2win.model.response.GameDetailsResponse;
import com.sportygames.spin2win.model.response.GameInfoResponse;
import com.sportygames.spin2win.model.response.NumberBetDetails;
import com.sportygames.spin2win.model.response.Spin2WinIndividualBetResponse;
import com.sportygames.spin2win.model.response.Spin2WinPlaceBetResponse;
import com.sportygames.spin2win.model.response.UserValidateResponse;
import com.sportygames.spin2win.model.response.WalletInfoResponse;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La1b0;", "Landroidx/fragment/app/Fragment;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "Lbb;", "", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a1b0 extends Fragment implements GameMainActivity.b, bb {
    public com.sportygames.commons.components.a A;
    public com.sportygames.commons.components.a B;
    public xi60 C;
    public fo2 D;
    public int E;
    public boolean F;
    public String G;
    public boolean H;
    public boolean I;
    public final ArrayList J;
    public boolean K;
    public LocalGameDetailsEntity L;
    public jvd0 M;
    public boolean N;
    public x3b0 O;
    public WalletInfoResponse P;
    public List<ChatRoomResponse> Q;
    public List<GameDetails> R;
    public GameInfoResponse S;
    public GameDetailsResponse T;
    public UserValidateResponse U;
    public PromotionGiftsResponse V;
    public Spin2WinPlaceBetResponse W;
    public final String X;
    public final ArrayList<String> Y;
    public boolean Z;
    public final q8i0 a;
    public boolean a0;
    public final q8i0 b;
    public boolean b0;
    public final q8i0 c;
    public boolean c0;
    public final q8i0 d;
    public mke d0;
    public final q8i0 e;
    public z66 e0;
    public final q8i0 f;
    public boolean f0;
    public final ee<Intent> g0;
    public long h0;
    public GameDetails i;
    public wxi v;
    public xbg w;
    public SharedPreferences y;
    public SharedPreferences.Editor z;

    /* JADX INFO: loaded from: classes6.dex */
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

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportygames.spin2win.view.Spin2WinFragment$showFbgAlreadyAppliedToast$1$1", f = "Spin2WinFragment.kt", l = {3925}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return a1b0.this.new b(v1bVar);
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
                this.a = 1;
                if (hkd.b(2000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            wxi wxiVar = a1b0.this.v;
            if (wxiVar != null) {
                wxiVar.y.setVisibility(8);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return a1b0.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return a1b0.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class e extends qlr implements Function0<r8i0.c> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return a1b0.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class f extends qlr implements Function0<v8i0> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return a1b0.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class g extends qlr implements Function0<cyb> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return a1b0.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class h extends qlr implements Function0<r8i0.c> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return a1b0.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class i extends qlr implements Function0<v8i0> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return a1b0.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class j extends qlr implements Function0<cyb> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return a1b0.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class k extends qlr implements Function0<r8i0.c> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return a1b0.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class l extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? a1b0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class m extends qlr implements Function0<Fragment> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return a1b0.this;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class n extends qlr implements Function0<w8i0> {
        public final /* synthetic */ m a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(m mVar) {
            super(0);
            this.a = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class o extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class p extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class q extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? a1b0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class r extends qlr implements Function0<Fragment> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return a1b0.this;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class s extends qlr implements Function0<w8i0> {
        public final /* synthetic */ r a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(r rVar) {
            super(0);
            this.a = rVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class t extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class u extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class v extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? a1b0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class w extends qlr implements Function0<Fragment> {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return a1b0.this;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class x extends qlr implements Function0<w8i0> {
        public final /* synthetic */ w a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(w wVar) {
            super(0);
            this.a = wVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class y extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class z extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public a1b0() {
        r rVar = new r();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new s(rVar));
        this.a = new q8i0(jq40.a(v4b0.class), new t(ttrVarA), new v(ttrVarA), new u(ttrVarA));
        this.b = new q8i0(jq40.a(fq5.class), new c(), new e(), new d());
        ttr ttrVarA2 = hwr.a(a1sVar, new x(new w()));
        this.c = new q8i0(jq40.a(ypa0.class), new y(ttrVarA2), new l(ttrVarA2), new z(ttrVarA2));
        ttr ttrVarA3 = hwr.a(a1sVar, new n(new m()));
        this.d = new q8i0(jq40.a(du2.class), new o(ttrVarA3), new q(ttrVarA3), new p(ttrVarA3));
        this.e = new q8i0(jq40.a(fuj.class), new f(), new h(), new g());
        this.f = new q8i0(jq40.a(db6.class), new i(), new k(), new j());
        this.G = "en";
        this.J = new ArrayList();
        this.X = "sg_spin2win";
        this.Y = kotlin.collections.b.f("sg_spin2win", "sg_common_dialog_message", "sg_chat", "sg_fbg_dialog", "sg_ham_menu", "sg_input_dialog", "sg_bethistory", "sg_common", "sg_exit_dialog", "sg_game_common", "currency_symbols", "sg_onboarding", "common_functions", "sg_campaign");
        ee<Intent> eeVarRegisterForActivityResult = registerForActivityResult(new ce(), new oya0());
        eeVarRegisterForActivityResult.getClass();
        this.g0 = eeVarRegisterForActivityResult;
    }

    public static ArrayList I0(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            if (arrayList != null) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ArrayList arrayList3 = (ArrayList) obj;
                    Object obj2 = arrayList3.get(0);
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    Object obj3 = arrayList3.get(1);
                    Double d2 = obj3 instanceof Double ? (Double) obj3 : null;
                    Double dValueOf = Double.valueOf(d2 != null ? d2.doubleValue() : 0.0d);
                    Object obj4 = arrayList3.get(2);
                    String str3 = obj4 instanceof String ? (String) obj4 : null;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    arrayList2.add(new RecentWins(str, dValueOf, str2));
                }
            }
            return arrayList2;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void U0(a1b0 a1b0Var, ArrayList arrayList) {
        ArrayList arrayList2;
        wxi wxiVar = a1b0Var.v;
        int i2 = 0;
        ArrayList arrayList3 = null;
        if (wxiVar != null) {
            Spin2WinNumberBoard spin2WinNumberBoard = wxiVar.J;
            if (arrayList != null) {
                arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    if (Intrinsics.g(((LocalGameDetailsEntity) obj).getCategory(), "NUMBER")) {
                        arrayList2.add(obj);
                    }
                }
            } else {
                arrayList2 = null;
            }
            spin2WinNumberBoard.setNumberBoardData(arrayList2, null);
        }
        wxi wxiVar2 = a1b0Var.v;
        if (wxiVar2 != null) {
            Spin2WinButtonBoard spin2WinButtonBoard = wxiVar2.i;
            if (arrayList != null) {
                arrayList3 = new ArrayList();
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (!Intrinsics.g(((LocalGameDetailsEntity) obj2).getCategory(), "NUMBER")) {
                        arrayList3.add(obj2);
                    }
                }
            }
            Spin2WinButtonBoard.setButtonBoardData$default(spin2WinButtonBoard, arrayList3, null, null, 4, null);
        }
    }

    public final void C0() {
        wxi wxiVar = this.v;
        if (wxiVar != null) {
            wxiVar.b0.setVisibility(8);
        }
        wxi wxiVar2 = this.v;
        if (wxiVar2 != null) {
            wxiVar2.e.setVisibility(8);
        }
        wxi wxiVar3 = this.v;
        if (wxiVar3 != null) {
            wxiVar3.H.setVisibility(8);
        }
    }

    public final void D0() {
        final androidx.fragment.app.e activity;
        qo80 binding;
        qo80 binding2;
        Integer numValueOf = Integer.valueOf(R.color.spin2win_toggle_off_color);
        Integer numValueOf2 = Integer.valueOf(R.color.spin2win_toggle_on_color);
        if (getContext() == null || (activity = getActivity()) == null) {
            return;
        }
        op5 op5Var = op5.a;
        String string = getString(R.string.music_cms);
        string.getClass();
        String string2 = getString(R.string.music_menu);
        string2.getClass();
        op5Var.getClass();
        String strB = op5.b(string, string2, null);
        MenuIconSize menuIconSize = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        h0b0 h0b0Var = new h0b0();
        SharedPreferences sharedPreferences = this.y;
        LeftMenuButton leftMenuButton = new LeftMenuButton(0, strB, R.drawable.music, menuIconSize, h0b0Var, true, sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("spin2win_music", true)) : null, numValueOf2, numValueOf, null, false, new Function1() { // from class: i0b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wxi wxiVar;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                a1b0 a1b0Var = this.a;
                GameDetails gameDetails = a1b0Var.i;
                wz.a("MusicClicked", gameDetails != null ? gameDetails.getName() : null, zBooleanValue ? "On" : "Off");
                SharedPreferences.Editor editor = a1b0Var.z;
                if (editor != null) {
                    editor.putBoolean("spin2win_music", zBooleanValue);
                }
                SharedPreferences.Editor editor2 = a1b0Var.z;
                if (editor2 != null) {
                    editor2.apply();
                }
                if (zBooleanValue) {
                    SharedPreferences sharedPreferences2 = a1b0Var.y;
                    Boolean boolValueOf = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("spin2win_music", true)) : null;
                    SharedPreferences sharedPreferences3 = a1b0Var.y;
                    Boolean boolValueOf2 = sharedPreferences3 != null ? Boolean.valueOf(sharedPreferences3.getBoolean("spin2win_sound", true)) : null;
                    Context context = a1b0Var.getContext();
                    if (context != null && (wxiVar = a1b0Var.v) != null) {
                        ProgressMeterComponent progressMeterComponent = wxiVar.M;
                        String str = a1b0Var.X;
                        rk60.b bVar = rk60.b.y;
                        GameDetails gameDetails2 = a1b0Var.i;
                        ypa0 ypa0VarZ0 = a1b0Var.z0();
                        String string3 = a1b0Var.getString(R.string.bg_music);
                        string3.getClass();
                        progressMeterComponent.I("Spin2Win/", str, boolValueOf2, bVar, gameDetails2, context, ypa0VarZ0, boolValueOf, string3);
                    }
                } else if (a1b0Var.v != null) {
                    a1b0Var.z0().I1();
                }
                return Unit.a;
            }
        }, 1536, null);
        String string3 = getString(R.string.sound_cms);
        string3.getClass();
        String string4 = getString(R.string.sound_menu);
        string4.getClass();
        String strB2 = op5.b(string3, string4, null);
        MenuIconSize menuIconSize2 = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        j0b0 j0b0Var = new j0b0();
        SharedPreferences sharedPreferences2 = this.y;
        LeftMenuButton leftMenuButton2 = new LeftMenuButton(0, strB2, R.drawable.ic_sound, menuIconSize2, j0b0Var, true, sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("spin2win_sound", true)) : null, numValueOf2, numValueOf, null, false, new db1(this, 2), 1536, null);
        String string5 = getString(R.string.one_tap_bet_cms);
        string5.getClass();
        String string6 = getString(R.string.onetap_bet_menu);
        string6.getClass();
        String strB3 = op5.b(string5, string6, null);
        MenuIconSize menuIconSize3 = new MenuIconSize(R.dimen._15sdp, R.dimen._10sdp);
        k0b0 k0b0Var = new k0b0();
        SharedPreferences sharedPreferences3 = this.y;
        LeftMenuButton leftMenuButton3 = new LeftMenuButton(0, strB3, R.drawable.ic_one_tap_bet, menuIconSize3, k0b0Var, true, sharedPreferences3 != null ? Boolean.valueOf(sharedPreferences3.getBoolean("spin2win_one_tap", false)) : null, numValueOf2, numValueOf, null, false, new l0b0(this, 0), 1536, null);
        String string7 = getString(R.string.key_top_recent_wins);
        string7.getClass();
        String string8 = getString(R.string.sg_spin2win_top_recent_wins);
        string8.getClass();
        LeftMenuButton leftMenuButton4 = new LeftMenuButton(0, op5.b(string7, string8, null), R.drawable.sg_top_recent_wins, new MenuIconSize(R.dimen._15sdp, R.dimen._15sdp), new Function0() { // from class: m0b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                x3b0 x3b0Var;
                final a1b0 a1b0Var = this.a;
                GameDetails gameDetails = a1b0Var.i;
                wz.a("TRWClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                if (!(activity.getSupportFragmentManager().G(R.id.flContent) instanceof a)) {
                    e activity2 = a1b0Var.getActivity();
                    if (activity2 != null) {
                        x3b0Var = new x3b0(activity2);
                        x3b0Var.setCancelable(false);
                    } else {
                        x3b0Var = null;
                    }
                    a1b0Var.O = x3b0Var;
                    if (x3b0Var != null) {
                        ArrayList<RecentWins> arrayListI0 = a1b0.I0(null);
                        x0b0 x0b0Var = new x0b0();
                        x3b0Var.a = arrayListI0;
                        x3b0Var.b = x0b0Var;
                        Window window = x3b0Var.getWindow();
                        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                        if (attributes != null) {
                            attributes.gravity = 17;
                        }
                        if (attributes != null) {
                            attributes.flags &= -5;
                        }
                        Window window2 = x3b0Var.getWindow();
                        if (window2 != null) {
                            window2.setAttributes(attributes);
                        }
                        Window window3 = x3b0Var.getWindow();
                        if (window3 != null) {
                            window3.setBackgroundDrawableResource(R.color.dialog_bg_color);
                        }
                        x3b0Var.show();
                        Window window4 = x3b0Var.getWindow();
                        if (window4 != null) {
                            window4.setLayout(-1, -1);
                        }
                    }
                    v4b0 v4b0VarW0 = a1b0Var.w0();
                    ej5.c(o8i0.d(v4b0VarW0), null, null, new b5b0(v4b0VarW0, null), 3);
                    GameDetails gameDetails2 = a1b0Var.i;
                    wz.a("TopRecentWinsClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                    x3b0 x3b0Var2 = a1b0Var.O;
                    if (x3b0Var2 != null) {
                        x3b0Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: y0b0
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                GameDetails gameDetails3 = a1b0Var.i;
                                String name = gameDetails3 != null ? gameDetails3.getName() : null;
                                if (name == null) {
                                    name = "";
                                }
                                wz.a("PopupAction", name, "Logged in", "Top win", "Close");
                            }
                        });
                    }
                }
                return Unit.a;
            }
        }, false, null, null, null, null, false, null, 3072, null);
        String string9 = getString(R.string.how_to_play_nav_cms);
        string9.getClass();
        String string10 = getString(R.string.how_to_play_menu);
        string10.getClass();
        LeftMenuButton leftMenuButton5 = new LeftMenuButton(0, op5.b(string9, string10, null), R.drawable.ic_how_to_play, new MenuIconSize(R.dimen._13sdp, R.dimen._13sdp), new Function0() { // from class: n0b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                a1b0 a1b0Var = this.a;
                GameDetails gameDetails = a1b0Var.i;
                wz.a("HTPClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                if (!(activity.getSupportFragmentManager().G(R.id.flContent) instanceof a)) {
                    a1b0Var.S0(false, new z0b0());
                }
                return Unit.a;
            }
        }, false, null, null, null, null, false, null, 3072, null);
        String string11 = getString(R.string.bet_history_cms);
        string11.getClass();
        String string12 = getString(R.string.bethistory_menu);
        string12.getClass();
        List listK = kotlin.collections.b.k(leftMenuButton, leftMenuButton2, leftMenuButton3, leftMenuButton4, leftMenuButton5, new LeftMenuButton(0, op5.b(string11, string12, null), R.drawable.ic_bethistory, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new Function0() { // from class: o0b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                a1b0 a1b0Var = this.a;
                GameDetails gameDetails = a1b0Var.i;
                wz.a("BetHistoryClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                if (!(activity.getSupportFragmentManager().G(R.id.flContent) instanceof a)) {
                    a1b0Var.N0();
                }
                return Unit.a;
            }
        }, false, null, null, null, null, false, null, 3072, null));
        wxi wxiVar = this.v;
        if (wxiVar != null) {
            SGHamburgerMenu sGHamburgerMenu = wxiVar.E;
            ypa0 ypa0VarZ0 = z0();
            UserValidateResponse userValidateResponse = this.U;
            String avatarUrl = userValidateResponse != null ? userValidateResponse.getAvatarUrl() : null;
            String str = avatarUrl == null ? "" : avatarUrl;
            UserValidateResponse userValidateResponse2 = this.U;
            String nickName = userValidateResponse2 != null ? userValidateResponse2.getNickName() : null;
            SGHamburgerMenu.setup$default(sGHamburgerMenu, new SGHamburgerMenu.b(ypa0VarZ0, R.string.sg_spin2win, str, nickName == null ? "" : nickName, listK, new Function0() { // from class: p0b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    wxi wxiVar2 = this.a.v;
                    if (wxiVar2 != null) {
                        wxiVar2.w.d();
                    }
                    return Unit.a;
                }
            }, new qqa(this, 1)), activity, false, null, null, 28, null);
        }
        wxi wxiVar2 = this.v;
        if (wxiVar2 != null) {
            wxiVar2.E.setSpin2WinImage();
        }
        wxi wxiVar3 = this.v;
        if (wxiVar3 == null || (binding = wxiVar3.E.getBinding()) == null) {
            return;
        }
        TextView textView = binding.c;
        wxi wxiVar4 = this.v;
        String strValueOf = String.valueOf((wxiVar4 == null || (binding2 = wxiVar4.E.getBinding()) == null) ? null : binding2.c.getTag());
        String string13 = getString(R.string.label_dialog_add_money);
        string13.getClass();
        textView.setText("+ ".concat(op5.c(op5Var, strValueOf, string13)));
    }

    public final boolean E0() {
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!Intrinsics.c(((LocalGameDetailsEntity) obj).getBetAmount(), 0.0d)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00e0  */
    public final void F0(LocalGameDetailsEntity localGameDetailsEntity) {
        String string;
        Double betAmount;
        Double maxAmount;
        Double betAmount2;
        Double betAmount3;
        List<String> allBetAmountList;
        Double maxAmount2;
        Double betAmount4;
        Integer maxBetCount;
        Double betAmount5;
        Integer maxBetCount2;
        Integer maxBetCount3;
        Double balance;
        double dDoubleValue = 0.0d;
        Double dValueOf = Double.valueOf(0.0d);
        WalletInfoResponse walletInfoResponse = this.P;
        double dDoubleValue2 = (walletInfoResponse == null || (balance = walletInfoResponse.getBalance()) == null) ? 0.0d : balance.doubleValue();
        wxi wxiVar = this.v;
        if (dDoubleValue2 <= 0.0d) {
            if (wxiVar != null) {
                wxiVar.z.setRedMarkVisibility(0);
            }
            wxi wxiVar2 = this.v;
            if (wxiVar2 != null) {
                wxiVar2.E.F(R.drawable.hamberger_add_more_red);
            }
        } else {
            if (wxiVar != null) {
                wxiVar.z.setRedMarkVisibility(8);
            }
            wxi wxiVar3 = this.v;
            if (wxiVar3 != null) {
                wxiVar3.E.F(R.drawable.menu_add_more_bg_plain);
            }
        }
        GameDetailsResponse gameDetailsResponse = this.T;
        if (((gameDetailsResponse == null || (maxBetCount3 = gameDetailsResponse.getMaxBetCount()) == null) ? 0 : maxBetCount3.intValue()) <= 0) {
            if (((localGameDetailsEntity == null || (betAmount = localGameDetailsEntity.getBetAmount()) == null) ? 0.0d : betAmount.doubleValue()) > 0.0d && !Intrinsics.g(this.L, localGameDetailsEntity)) {
                ypa0 ypa0VarZ0 = z0();
                Context context = getContext();
                string = context != null ? context.getString(R.string.sg_spin2win_sound_number_select) : null;
                ypa0VarZ0.A1(0L, string != null ? string : "");
            }
        } else if (!Intrinsics.g(this.L, localGameDetailsEntity)) {
            ypa0 ypa0VarZ1 = z0();
            Context context2 = getContext();
            string = context2 != null ? context2.getString(R.string.sg_spin2win_sound_number_select) : null;
            ypa0VarZ1.A1(0L, string != null ? string : "");
        }
        this.L = localGameDetailsEntity;
        GameDetailsResponse gameDetailsResponse2 = this.T;
        if (((gameDetailsResponse2 == null || (maxBetCount2 = gameDetailsResponse2.getMaxBetCount()) == null) ? 0 : maxBetCount2.intValue()) > 0) {
            V0(localGameDetailsEntity);
        } else {
            LocalGameDetailsEntity localGameDetailsEntity2 = this.L;
            if (((localGameDetailsEntity2 == null || (betAmount5 = localGameDetailsEntity2.getBetAmount()) == null) ? 0.0d : betAmount5.doubleValue()) > 0.0d) {
                V0(localGameDetailsEntity);
            } else {
                wxi wxiVar4 = this.v;
                if (wxiVar4 != null) {
                    wxiVar4.c.setMinMaxChip(dValueOf, dValueOf);
                }
            }
        }
        GameDetailsResponse gameDetailsResponse3 = this.T;
        if (((gameDetailsResponse3 == null || (maxBetCount = gameDetailsResponse3.getMaxBetCount()) == null) ? 0 : maxBetCount.intValue()) > 0) {
            wxi wxiVar5 = this.v;
            if (wxiVar5 != null) {
                BetChipContainerSpin2Win betChipContainerSpin2Win = wxiVar5.c;
                Double dValueOf2 = Double.valueOf((localGameDetailsEntity == null || (betAmount4 = localGameDetailsEntity.getBetAmount()) == null) ? 0.0d : betAmount4.doubleValue());
                if (localGameDetailsEntity != null && (maxAmount2 = localGameDetailsEntity.getMaxAmount()) != null) {
                    dDoubleValue = maxAmount2.doubleValue();
                }
                betChipContainerSpin2Win.setBetAmount(dValueOf2, Double.valueOf(dDoubleValue));
            }
        } else {
            double dDoubleValue3 = (localGameDetailsEntity == null || (betAmount3 = localGameDetailsEntity.getBetAmount()) == null) ? 0.0d : betAmount3.doubleValue();
            wxi wxiVar6 = this.v;
            if (dDoubleValue3 > 0.0d) {
                if (wxiVar6 != null) {
                    BetChipContainerSpin2Win betChipContainerSpin2Win2 = wxiVar6.c;
                    Double dValueOf3 = Double.valueOf((localGameDetailsEntity == null || (betAmount2 = localGameDetailsEntity.getBetAmount()) == null) ? 0.0d : betAmount2.doubleValue());
                    if (localGameDetailsEntity != null && (maxAmount = localGameDetailsEntity.getMaxAmount()) != null) {
                        dDoubleValue = maxAmount.doubleValue();
                    }
                    betChipContainerSpin2Win2.setBetAmount(dValueOf3, Double.valueOf(dDoubleValue));
                }
            } else if (wxiVar6 != null) {
                wxiVar6.c.setBetAmount(dValueOf, dValueOf);
            }
        }
        boolean zE0 = E0();
        wxi wxiVar7 = this.v;
        if (zE0) {
            if (wxiVar7 != null) {
                wxiVar7.c.E(true);
            }
        } else if (wxiVar7 != null) {
            wxiVar7.c.E(false);
        }
        LocalGameDetailsEntity localGameDetailsEntity3 = this.L;
        if (localGameDetailsEntity3 == null || (allBetAmountList = localGameDetailsEntity3.getAllBetAmountList()) == null || allBetAmountList.isEmpty()) {
            wxi wxiVar8 = this.v;
            if (wxiVar8 != null) {
                wxiVar8.a0.setEnabled(false);
            }
            wxi wxiVar9 = this.v;
            if (wxiVar9 != null) {
                wxiVar9.a0.setAlpha(0.5f);
                return;
            }
            return;
        }
        wxi wxiVar10 = this.v;
        if (wxiVar10 != null) {
            wxiVar10.a0.setEnabled(true);
        }
        wxi wxiVar11 = this.v;
        if (wxiVar11 != null) {
            wxiVar11.a0.setAlpha(1.0f);
        }
    }

    public final void G0() {
        int i2;
        boolean zBooleanValue;
        iq80 binding;
        Context context = getContext();
        if (context != null) {
            ArrayList<OnboardingItem> arrayListA = sny.a(context, "spin-to-win");
            if (arrayListA.isEmpty()) {
                i2 = 0;
                zBooleanValue = false;
            } else {
                int size = arrayListA.size();
                i2 = 0;
                zBooleanValue = false;
                while (true) {
                    if (i2 >= size) {
                        i2 = 0;
                        break;
                    }
                    Boolean isView = arrayListA.get(i2).getIsView();
                    zBooleanValue = isView != null ? isView.booleanValue() : false;
                    if (!zBooleanValue) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (zBooleanValue) {
                this.Z = false;
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new h1b0(this, null), 3);
                return;
            }
            this.Z = true;
            if (this.i != null && !isRemoving()) {
                wxi wxiVar = this.v;
                boolean z2 = (wxiVar == null || (binding = wxiVar.z.getBinding()) == null || binding.f.getVisibility() != 0) ? false : true;
                FragmentManager childFragmentManager = getChildFragmentManager();
                androidx.fragment.app.a aVarA = oke.a(childFragmentManager, childFragmentManager);
                op5.a.getClass();
                List<? extends File> list = op5.b;
                com.sportygames.commons.views.a.b bVar = new com.sportygames.commons.views.a.b() { // from class: qza0
                    @Override // com.sportygames.commons.views.a.b
                    public final void a(int i3) {
                        double dDoubleValue;
                        wxi wxiVar2;
                        zp80 binding2;
                        ViewTreeObserver viewTreeObserver;
                        a1b0 a1b0Var = this.a;
                        if (i3 >= 1) {
                            try {
                                ArrayList arrayList = a1b0Var.J;
                                if (arrayList != null) {
                                    int size2 = arrayList.size();
                                    int i4 = 0;
                                    dDoubleValue = 0.0d;
                                    while (i4 < size2) {
                                        Object obj = arrayList.get(i4);
                                        i4++;
                                        Double betAmount = ((LocalGameDetailsEntity) obj).getBetAmount();
                                        dDoubleValue += betAmount != null ? betAmount.doubleValue() : 0.0d;
                                    }
                                } else {
                                    dDoubleValue = 0.0d;
                                }
                                if (dDoubleValue > 0.0d || (wxiVar2 = a1b0Var.v) == null || (binding2 = wxiVar2.J.getBinding()) == null || (viewTreeObserver = binding2.c3.getViewTreeObserver()) == null) {
                                    return;
                                }
                                viewTreeObserver.addOnPreDrawListener(new i1b0(a1b0Var));
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                };
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                com.sportygames.commons.views.a aVar = new com.sportygames.commons.views.a();
                aVar.c = "spin-to-win";
                aVar.d = i2;
                aVar.w = list;
                aVar.z = o2gVar;
                aVar.A = z2;
                aVar.v = bVar;
                aVarA.f(R.id.onboarding_images, aVar, null);
                aVarA.d();
            }
            wxi wxiVar2 = this.v;
            if (wxiVar2 != null) {
                wxiVar2.K.setVisibility(0);
            }
        }
    }

    public final void H0(boolean z2) {
        GameDetails gameDetails = this.i;
        String name = gameDetails != null ? gameDetails.getName() : null;
        if (name == null) {
            name = "";
        }
        wz.a("PopupAction", name, z2 ? "Logged in" : "Not logged in", "error_alert", "Exit");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void I() {
    }

    public final void J0() {
        PlaceBetPayload placeBetPayload;
        PlaceBetPayload placeBetPayload2;
        Integer numValueOf;
        int id;
        String localizedTitle;
        List<BetTypeAndPayouts> betTypesAndPayouts;
        BetTypeAndPayouts betTypeAndPayouts;
        Long roundId;
        WalletInfoResponse walletInfoResponse = this.P;
        String currency = walletInfoResponse != null ? walletInfoResponse.getCurrency() : null;
        if (currency == null) {
            currency = "";
        }
        GameInfoResponse gameInfoResponse = this.S;
        long jLongValue = (gameInfoResponse == null || (roundId = gameInfoResponse.getRoundId()) == null) ? 0L : roundId.longValue();
        String str = w0().b;
        Double d2 = w0().a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.J;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                LocalGameDetailsEntity localGameDetailsEntity = (LocalGameDetailsEntity) obj;
                Double betAmount = localGameDetailsEntity.getBetAmount();
                double dDoubleValue = betAmount != null ? betAmount.doubleValue() : 0.0d;
                if (dDoubleValue > 0.0d) {
                    Integer betTypeId = localGameDetailsEntity.getBetTypeId();
                    int iIntValue = betTypeId != null ? betTypeId.intValue() : 0;
                    try {
                        Integer betTypeId2 = localGameDetailsEntity.getBetTypeId();
                        placeBetPayload2 = placeBetPayload;
                        try {
                            GameDetailsResponse gameDetailsResponse = this.T;
                            if (gameDetailsResponse == null || (betTypesAndPayouts = gameDetailsResponse.getBetTypesAndPayouts()) == null || (betTypeAndPayouts = (BetTypeAndPayouts) CollectionsKt.firstOrNull(betTypesAndPayouts)) == null || (id = betTypeAndPayouts.getId()) == null) {
                                id = 0;
                            }
                            numValueOf = (!Intrinsics.g(betTypeId2, id) || (localizedTitle = localGameDetailsEntity.getLocalizedTitle()) == null) ? null : Integer.valueOf(Integer.parseInt(localizedTitle));
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        placeBetPayload2 = placeBetPayload;
                    }
                    arrayList.add(new IndividualBetRequest(iIntValue, numValueOf, dDoubleValue));
                } else {
                    placeBetPayload2 = placeBetPayload;
                }
                placeBetPayload = placeBetPayload2;
            }
        }
        PlaceBetPayload placeBetPayload3 = new PlaceBetPayload(currency, jLongValue, str, d2, arrayList, this.f0, null, 64, null);
        if (placeBetPayload3.getIndividualBetRequestList().isEmpty()) {
            return;
        }
        if (!yju.a("br")) {
            v4b0 v4b0VarW0 = w0();
            ej5.c(o8i0.d(v4b0VarW0), null, null, new d5b0(false, v4b0VarW0, placeBetPayload3, null), 3);
            return;
        }
        v4b0 v4b0VarW1 = w0();
        androidx.fragment.app.e activity = getActivity();
        v4b0VarW1.H.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
        if (activity instanceof GameMainActivity) {
            GameMainActivity gameMainActivity = (GameMainActivity) activity;
            gameMainActivity.J1(new e5b0(v4b0VarW1, placeBetPayload3, gameMainActivity.E), new f5b0(v4b0VarW1));
        }
    }

    public final void K0() {
        this.a0 = false;
        this.c0 = false;
        wxi wxiVar = this.v;
        if (wxiVar != null) {
            wxiVar.i.setFbgApplied(false);
        }
        wxi wxiVar2 = this.v;
        if (wxiVar2 != null) {
            wxiVar2.J.setFbgApplied(false);
        }
        wxi wxiVar3 = this.v;
        if (wxiVar3 != null) {
            wxiVar3.F.setVisibility(8);
        }
        wxi wxiVar4 = this.v;
        ViewGroup.LayoutParams layoutParams = wxiVar4 != null ? wxiVar4.R.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd(getResources().getDimensionPixelSize(R.dimen._9sdp));
        }
        wxi wxiVar5 = this.v;
        if (wxiVar5 != null) {
            wxiVar5.R.setLayoutParams(marginLayoutParams);
        }
    }

    public final void L0() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        wxi wxiVar = this.v;
        if (wxiVar != null && (layoutParams2 = wxiVar.d0.getLayoutParams()) != null) {
            layoutParams2.height = 0;
        }
        wxi wxiVar2 = this.v;
        if (wxiVar2 != null && (layoutParams = wxiVar2.d0.getLayoutParams()) != null) {
            layoutParams.width = 0;
        }
        wxi wxiVar3 = this.v;
        if (wxiVar3 != null) {
            wxiVar3.d0.setRadius(0.0f);
        }
        wxi wxiVar4 = this.v;
        if (wxiVar4 != null) {
            wxiVar4.d0.requestLayout();
        }
    }

    public final void M0(Spin2WinWheel spin2WinWheel) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int width = spin2WinWheel != null ? spin2WinWheel.getWidth() : 0;
        int height = spin2WinWheel != null ? spin2WinWheel.getHeight() : 0;
        wxi wxiVar = this.v;
        if (wxiVar != null && (layoutParams2 = wxiVar.d0.getLayoutParams()) != null) {
            layoutParams2.height = height;
        }
        wxi wxiVar2 = this.v;
        if (wxiVar2 != null && (layoutParams = wxiVar2.d0.getLayoutParams()) != null) {
            layoutParams.width = width;
        }
        wxi wxiVar3 = this.v;
        if (wxiVar3 != null) {
            wxiVar3.d0.setRadius((float) (((double) width) / 0.1d));
        }
        wxi wxiVar4 = this.v;
        if (wxiVar4 != null) {
            wxiVar4.d0.requestLayout();
        }
    }

    public final void O0() {
        boolean z2;
        try {
            z2 = this.h0 != 0 && System.currentTimeMillis() - this.h0 < 30000;
            this.h0 = System.currentTimeMillis();
        } catch (Exception e2) {
            e2.printStackTrace();
            z2 = false;
        }
        if (z2) {
            return;
        }
        wxi wxiVar = this.v;
        if (wxiVar != null) {
            wxiVar.C.setCampaignCompletedText();
        }
        wxi wxiVar2 = this.v;
        if (wxiVar2 != null) {
            wxiVar2.C.setVisibility(0);
        }
        wxi wxiVar3 = this.v;
        if (wxiVar3 != null) {
            wxiVar3.C.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_fade_out_toast));
        }
        ej5.c(ebs.a(getLifecycle()), null, null, new n1b0(this, null), 3);
    }

    public final void P0(String str) {
        zn80 binding;
        zn80 binding2;
        zn80 binding3;
        Context context = getContext();
        if (context != null) {
            wxi wxiVar = this.v;
            if (wxiVar != null) {
                wxiVar.y.setVisibility(0);
            }
            wxi wxiVar2 = this.v;
            if (wxiVar2 != null && (binding3 = wxiVar2.y.getBinding()) != null) {
                binding3.b.setBackgroundColor(context.getColor(R.color.warn_toast));
            }
            wxi wxiVar3 = this.v;
            if (wxiVar3 != null && (binding2 = wxiVar3.y.getBinding()) != null) {
                binding2.c.setTextColor(context.getColor(R.color.white));
            }
            wxi wxiVar4 = this.v;
            if (wxiVar4 != null && (binding = wxiVar4.y.getBinding()) != null) {
                binding.c.setText(str);
            }
            pfd pfdVar = fse.a;
            ej5.c(w5b.a(gku.a), null, null, new b(null), 3);
        }
    }

    @Override // defpackage.bb
    public final void Q(xnh0 xnh0Var) {
        String name;
        LobbyMetaInfo metaInfo;
        Long minimumCMSVersionSupported;
        Resources resources;
        String[] stringArray;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = nzf0.a;
        if (!z2 && jCurrentTimeMillis - nzf0.b <= 500) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        if ((xnh0Var != null ? xnh0Var.a : null) == null || xnh0Var.a.length() <= 0 || getContext() == null) {
            return;
        }
        q8i0 q8i0Var = this.b;
        Context context = getContext();
        int length = ((context == null || (resources = context.getResources()) == null || (stringArray = resources.getStringArray(R.array.spin2win_array)) == null) ? 0 : stringArray.length) + 7;
        wxi wxiVar = this.v;
        if (wxiVar != null) {
            wxiVar.M.setProgressForApi(100 / length);
        }
        wxi wxiVar2 = this.v;
        if (wxiVar2 != null) {
            wxiVar2.M.L();
        }
        int i2 = 100 - ((100 / length) * length);
        wxi wxiVar3 = this.v;
        if (wxiVar3 != null) {
            wxiVar3.M.O(i2);
        }
        wxi wxiVar4 = this.v;
        if (wxiVar4 != null) {
            wxiVar4.M.setVisibility(0);
        }
        if (getContext() != null) {
            String strA = xwj.a();
            long versionCode = SportyGamesManager.getInstance().getVersionCode();
            GameDetails gameDetails = this.i;
            if (versionCode < ((gameDetails == null || (metaInfo = gameDetails.getMetaInfo()) == null || (minimumCMSVersionSupported = metaInfo.getMinimumCMSVersionSupported()) == null) ? 0L : minimumCMSVersionSupported.longValue())) {
                strA = "en";
            }
            ArrayList<String> arrayList = vlr.a.get("spin-to-win");
            if (arrayList != null && arrayList.contains(strA)) {
                this.G = xwj.a();
            }
            GameDetails gameDetails2 = this.i;
            if (gameDetails2 != null && (name = gameDetails2.getName()) != null) {
                v4b0 v4b0VarW0 = w0();
                ej5.c(o8i0.d(v4b0VarW0), null, null, new x4b0(v4b0VarW0, name, null), 3);
            }
            wxi wxiVar5 = this.v;
            if (wxiVar5 != null) {
                wxiVar5.M.E((fq5) q8i0Var.getValue(), this.Y, this.X, this.G);
            }
        }
    }

    public final void Q0(Context context, ResultWrapper.GenericError genericError) {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            nya0 nya0Var = nya0.e;
            z0();
            jcg.d(nya0Var, activity, "Spin2Win", genericError, new Function0() { // from class: uza0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    this.a.H0(true);
                    return Unit.a;
                }
            }, null, null, 0, context.getColor(R.color.try_again_color), null, null, null, new vj6(this, 1), null, 97760);
        }
    }

    public final void R0() {
        wxi wxiVar;
        iq80 binding;
        iq80 binding2;
        Context context = getContext();
        if (context != null) {
            wxi wxiVar2 = this.v;
            boolean z2 = false;
            if (wxiVar2 != null && (binding2 = wxiVar2.z.getBinding()) != null && binding2.f.getVisibility() == 0) {
                z2 = true;
            }
            if (this.F && (wxiVar = this.v) != null && (binding = wxiVar.z.getBinding()) != null) {
                binding.f.setImageDrawable(context.getDrawable(R.drawable.chat_rb));
            }
            wxi wxiVar3 = this.v;
            if (wxiVar3 != null) {
                wxiVar3.z.setChatVisibility(this.F);
            }
            if (z2 != this.F) {
                wxi wxiVar4 = this.v;
                FrameLayout frameLayout = wxiVar4 != null ? wxiVar4.K : null;
                FragmentManager childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                if (frameLayout == null || frameLayout.getVisibility() != 0 || childFragmentManager.G(R.id.onboarding_images) == null || yju.a("br")) {
                    return;
                }
                G0();
            }
        }
    }

    public final void S0(boolean z2, Function0<Unit> function0) {
        Context context = getContext();
        if (context != null) {
            GameDetails gameDetails = this.i;
            nle nleVar = new nle(context, gameDetails != null ? gameDetails.getName() : null, null, context.getDrawable(R.drawable.spin2win_bet_history_bg), function0, 4);
            nleVar.show();
            nleVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: rya0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    GameDetails gameDetails2 = this.a.i;
                    String name = gameDetails2 != null ? gameDetails2.getName() : null;
                    if (name == null) {
                        name = "";
                    }
                    wz.a("PopupAction", name, "Logged in", "How to play", "Close");
                }
            });
        }
        if (z2) {
            GameDetails gameDetails2 = this.i;
            wz.a("PaytableCheck", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
        }
    }

    public final void T0(String str) {
        ConstraintLayout constraintLayout;
        wxi wxiVar = this.v;
        if (wxiVar == null || (constraintLayout = wxiVar.a) == null) {
            return;
        }
        int height = wxiVar.b.getHeight();
        Snackbar snackbarH = Snackbar.h(constraintLayout, "", -1);
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = snackbarH.i;
        Snackbar.SnackbarLayout snackbarLayout = snackbarBaseLayout instanceof Snackbar.SnackbarLayout ? (Snackbar.SnackbarLayout) snackbarBaseLayout : null;
        if (snackbarLayout == null) {
            return;
        }
        snackbarLayout.removeAllViews();
        LayoutInflater.from(constraintLayout.getContext()).inflate(R.layout.spin_to_win_snackbar, snackbarLayout);
        int i2 = R.id.snackbar_close;
        ImageButton imageButton = (ImageButton) h5e.a(R.id.snackbar_close, snackbarLayout);
        if (imageButton != null) {
            i2 = R.id.snackbar_text;
            TextView textView = (TextView) h5e.a(R.id.snackbar_text, snackbarLayout);
            if (textView != null) {
                textView.setText(str);
                imageButton.setOnClickListener(new vza0(snackbarH, 0));
                float fApplyDimension = TypedValue.applyDimension(1, 10.0f, requireContext().getResources().getDisplayMetrics());
                snackbarLayout.setPadding(0, 0, 0, 0);
                snackbarLayout.setTranslationY((-height) - fApplyDimension);
                snackbarH.j();
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(snackbarLayout.getResources().getResourceName(i2)));
    }

    public final void V0(LocalGameDetailsEntity localGameDetailsEntity) {
        Double maxAmount;
        Double betAmount;
        Double maxAmount2;
        Double minAmount;
        wxi wxiVar = this.v;
        double dDoubleValue = 0.0d;
        if (wxiVar != null) {
            wxiVar.c.setMinMaxChip(Double.valueOf((localGameDetailsEntity == null || (minAmount = localGameDetailsEntity.getMinAmount()) == null) ? 0.0d : minAmount.doubleValue()), Double.valueOf((localGameDetailsEntity == null || (maxAmount2 = localGameDetailsEntity.getMaxAmount()) == null) ? 0.0d : maxAmount2.doubleValue()));
        }
        wxi wxiVar2 = this.v;
        if (wxiVar2 != null) {
            BetChipContainerSpin2Win betChipContainerSpin2Win = wxiVar2.c;
            Double dValueOf = Double.valueOf((localGameDetailsEntity == null || (betAmount = localGameDetailsEntity.getBetAmount()) == null) ? 0.0d : betAmount.doubleValue());
            if (localGameDetailsEntity != null && (maxAmount = localGameDetailsEntity.getMaxAmount()) != null) {
                dDoubleValue = maxAmount.doubleValue();
            }
            betChipContainerSpin2Win.setBetAmount(dValueOf, Double.valueOf(dDoubleValue));
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x0582  */
    /* JADX WARN: Code duplicated, block: B:229:0x0587  */
    /* JADX WARN: Code duplicated, block: B:232:0x0593  */
    /* JADX WARN: Code duplicated, block: B:239:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:241:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:244:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:246:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:249:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:251:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:254:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:256:0x05db  */
    /* JADX WARN: Code duplicated, block: B:259:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:261:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:266:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:274:0x061d  */
    /* JADX WARN: Code duplicated, block: B:277:0x062a  */
    /* JADX WARN: Code duplicated, block: B:281:0x063e  */
    /* JADX WARN: Code duplicated, block: B:282:0x0643  */
    /* JADX WARN: Code duplicated, block: B:72:0x0195  */
    /* JADX WARN: Code duplicated, block: B:75:0x01db  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e0  */
    public final void X0() {
        int i2;
        String strI;
        String str;
        double d2;
        String str2;
        TextView textView;
        String str3;
        LinkedHashMap linkedHashMap;
        String str4;
        String str5;
        double d3;
        String str6;
        ArrayList arrayList;
        TextView textView2;
        String str7;
        LinkedHashMap linkedHashMap2;
        int i3;
        int i4;
        double dM0;
        double dM1;
        double dM2;
        String color;
        double dM3;
        double dM4;
        double dM5;
        Double d4;
        double dDoubleValue;
        LinkedHashMap linkedHashMap3;
        String str8;
        double dM6;
        double dMax;
        Double d5;
        double dDoubleValue2;
        String currency;
        String strI2;
        String str9;
        String currency2;
        String str10 = " ";
        double d6 = 0.0d;
        String str11 = "0.00";
        ArrayList arrayList2 = this.J;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            double dDoubleValue3 = 0.0d;
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                Double betAmount = ((LocalGameDetailsEntity) obj).getBetAmount();
                dDoubleValue3 += betAmount != null ? betAmount.doubleValue() : 0.0d;
            }
            wxi wxiVar = this.v;
            if (wxiVar != null) {
                TextView textView3 = wxiVar.R;
                WalletInfoResponse walletInfoResponse = this.P;
                if (walletInfoResponse == null || (currency2 = walletInfoResponse.getCurrency()) == null) {
                    strI2 = null;
                } else {
                    op5.a.getClass();
                    strI2 = op5.i(currency2);
                }
                TreeMap treeMap = pw.a;
                try {
                    str9 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue3);
                    str9.getClass();
                } catch (Exception unused) {
                    str9 = "0.00";
                }
                textView3.setText(strI2 + " " + pw.a(str9));
            }
        }
        wxi wxiVar2 = this.v;
        if (wxiVar2 != null) {
            TextView textView4 = wxiVar2.L;
            WalletInfoResponse walletInfoResponse2 = this.P;
            if (walletInfoResponse2 == null || (currency = walletInfoResponse2.getCurrency()) == null) {
                strI = null;
            } else {
                op5.a.getClass();
                strI = op5.i(currency);
            }
            TreeMap treeMap2 = pw.a;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayList2.get(i6);
                    i6++;
                    LocalGameDetailsEntity localGameDetailsEntity = (LocalGameDetailsEntity) obj2;
                    localGameDetailsEntity.getBetAmount();
                    linkedHashMap4.put(localGameDetailsEntity.getCategory(), Double.valueOf(0.0d));
                }
                Unit unit = Unit.a;
            }
            if (arrayList2 != null) {
                int size3 = arrayList2.size();
                int i7 = 0;
                while (i7 < size3) {
                    Object obj3 = arrayList2.get(i7);
                    i7++;
                    LocalGameDetailsEntity localGameDetailsEntity2 = (LocalGameDetailsEntity) obj3;
                    Double betAmount2 = localGameDetailsEntity2.getBetAmount();
                    if ((betAmount2 != null ? betAmount2.doubleValue() : d6) > d6) {
                        String category = localGameDetailsEntity2.getCategory();
                        if (category != null) {
                            d3 = d6;
                            arrayList = arrayList2;
                            i3 = size3;
                            i4 = i7;
                            textView2 = textView4;
                            str5 = str10;
                            str7 = strI;
                            str6 = str11;
                            LinkedHashMap linkedHashMap5 = linkedHashMap4;
                            switch (category.hashCode()) {
                                case -1981034679:
                                    if (!category.equals("NUMBER")) {
                                        linkedHashMap2 = linkedHashMap5;
                                    } else {
                                        Double betAmount3 = localGameDetailsEntity2.getBetAmount();
                                        double dDoubleValue4 = betAmount3 != null ? betAmount3.doubleValue() : d3;
                                        Double payMultiplier = localGameDetailsEntity2.getPayMultiplier();
                                        double dDoubleValue5 = dDoubleValue4 * (payMultiplier != null ? payMultiplier.doubleValue() : d3);
                                        Integer value = localGameDetailsEntity2.getValue();
                                        double dIntValue = value != null ? value.intValue() : d3;
                                        if (1.0d <= dIntValue && dIntValue <= 12.0d) {
                                            dM0 = m0("1-12");
                                        } else if (13.0d > dIntValue || dIntValue > 24.0d) {
                                            if (25.0d <= dIntValue && dIntValue <= 36.0d) {
                                                dM0 = m0("25-36");
                                            }
                                            if (dIntValue % 2.0d == d3) {
                                                dM1 = m0("EVEN");
                                            } else {
                                                dM1 = m0("ODD");
                                            }
                                            dM2 = dDoubleValue5 + dM1;
                                            color = localGameDetailsEntity2.getColor();
                                            if (color != null) {
                                                dM2 = m0(color) + dM2;
                                                Unit unit2 = Unit.a;
                                            }
                                            if (1.0d > dIntValue && dIntValue <= 6.0d) {
                                                dM3 = m0("A");
                                            } else if (7.0d > dIntValue && dIntValue <= 12.0d) {
                                                dM3 = m0("B");
                                            } else if (13.0d > dIntValue && dIntValue <= 18.0d) {
                                                dM3 = m0("C");
                                            } else if (19.0d > dIntValue && dIntValue <= 24.0d) {
                                                dM3 = m0("D");
                                            } else if (25.0d <= dIntValue || dIntValue > 30.0d) {
                                                if (31.0d <= dIntValue && dIntValue <= 36.0d) {
                                                    dM3 = m0("F");
                                                }
                                                if (1.0d <= dIntValue || dIntValue > 18.0d) {
                                                    dM4 = m0("HIGH") + dM2;
                                                    String color2 = localGameDetailsEntity2.getColor();
                                                    dM5 = m0("HIGH_".concat(color2 != null ? color2 : ""));
                                                } else {
                                                    dM4 = m0("LOW") + dM2;
                                                    String color3 = localGameDetailsEntity2.getColor();
                                                    dM5 = m0("LOW_".concat(color3 != null ? color3 : ""));
                                                }
                                                double d7 = dM5 + dM4;
                                                linkedHashMap2 = linkedHashMap5;
                                                d4 = (Double) linkedHashMap2.get("NUMBER");
                                                if (d4 != null) {
                                                    dDoubleValue = d4.doubleValue();
                                                } else {
                                                    dDoubleValue = d3;
                                                }
                                                linkedHashMap2.put("NUMBER", Double.valueOf(Math.max(dDoubleValue, d7)));
                                                Unit unit3 = Unit.a;
                                            } else {
                                                dM3 = m0("E");
                                            }
                                            dM2 = dM3 + dM2;
                                            if (1.0d <= dIntValue) {
                                                dM4 = m0("HIGH") + dM2;
                                                String color4 = localGameDetailsEntity2.getColor();
                                                dM5 = m0("HIGH_".concat(color4 != null ? color4 : ""));
                                            } else {
                                                dM4 = m0("HIGH") + dM2;
                                                String color5 = localGameDetailsEntity2.getColor();
                                                dM5 = m0("HIGH_".concat(color5 != null ? color5 : ""));
                                            }
                                            double d8 = dM5 + dM4;
                                            linkedHashMap2 = linkedHashMap5;
                                            d4 = (Double) linkedHashMap2.get("NUMBER");
                                            if (d4 != null) {
                                                dDoubleValue = d4.doubleValue();
                                            } else {
                                                dDoubleValue = d3;
                                            }
                                            linkedHashMap2.put("NUMBER", Double.valueOf(Math.max(dDoubleValue, d8)));
                                            Unit unit4 = Unit.a;
                                        } else {
                                            dM0 = m0("13-24");
                                        }
                                        dDoubleValue5 = dM0 + dDoubleValue5;
                                        if (dIntValue % 2.0d == d3) {
                                            dM1 = m0("EVEN");
                                        } else {
                                            dM1 = m0("ODD");
                                        }
                                        dM2 = dDoubleValue5 + dM1;
                                        color = localGameDetailsEntity2.getColor();
                                        if (color != null) {
                                            dM2 = m0(color) + dM2;
                                            Unit unit5 = Unit.a;
                                        }
                                        if (1.0d > dIntValue) {
                                            if (7.0d > dIntValue) {
                                                if (13.0d > dIntValue) {
                                                    if (19.0d > dIntValue) {
                                                        if (25.0d <= dIntValue) {
                                                            if (31.0d <= dIntValue) {
                                                                dM3 = m0("F");
                                                                dM2 = dM3 + dM2;
                                                            }
                                                        } else if (31.0d <= dIntValue) {
                                                            dM3 = m0("F");
                                                            dM2 = dM3 + dM2;
                                                        }
                                                    } else if (25.0d <= dIntValue) {
                                                        if (31.0d <= dIntValue) {
                                                            dM3 = m0("F");
                                                            dM2 = dM3 + dM2;
                                                        }
                                                    } else if (31.0d <= dIntValue) {
                                                        dM3 = m0("F");
                                                        dM2 = dM3 + dM2;
                                                    }
                                                } else if (19.0d > dIntValue) {
                                                    if (25.0d <= dIntValue) {
                                                        if (31.0d <= dIntValue) {
                                                            dM3 = m0("F");
                                                            dM2 = dM3 + dM2;
                                                        }
                                                    } else if (31.0d <= dIntValue) {
                                                        dM3 = m0("F");
                                                        dM2 = dM3 + dM2;
                                                    }
                                                } else if (25.0d <= dIntValue) {
                                                    if (31.0d <= dIntValue) {
                                                        dM3 = m0("F");
                                                        dM2 = dM3 + dM2;
                                                    }
                                                } else if (31.0d <= dIntValue) {
                                                    dM3 = m0("F");
                                                    dM2 = dM3 + dM2;
                                                }
                                            } else if (13.0d > dIntValue) {
                                                if (19.0d > dIntValue) {
                                                    if (25.0d <= dIntValue) {
                                                        if (31.0d <= dIntValue) {
                                                            dM3 = m0("F");
                                                            dM2 = dM3 + dM2;
                                                        }
                                                    } else if (31.0d <= dIntValue) {
                                                        dM3 = m0("F");
                                                        dM2 = dM3 + dM2;
                                                    }
                                                } else if (25.0d <= dIntValue) {
                                                    if (31.0d <= dIntValue) {
                                                        dM3 = m0("F");
                                                        dM2 = dM3 + dM2;
                                                    }
                                                } else if (31.0d <= dIntValue) {
                                                    dM3 = m0("F");
                                                    dM2 = dM3 + dM2;
                                                }
                                            } else if (19.0d > dIntValue) {
                                                if (25.0d <= dIntValue) {
                                                    if (31.0d <= dIntValue) {
                                                        dM3 = m0("F");
                                                        dM2 = dM3 + dM2;
                                                    }
                                                } else if (31.0d <= dIntValue) {
                                                    dM3 = m0("F");
                                                    dM2 = dM3 + dM2;
                                                }
                                            } else if (25.0d <= dIntValue) {
                                                if (31.0d <= dIntValue) {
                                                    dM3 = m0("F");
                                                    dM2 = dM3 + dM2;
                                                }
                                            } else if (31.0d <= dIntValue) {
                                                dM3 = m0("F");
                                                dM2 = dM3 + dM2;
                                            }
                                        } else if (7.0d > dIntValue) {
                                            if (13.0d > dIntValue) {
                                                if (19.0d > dIntValue) {
                                                    if (25.0d <= dIntValue) {
                                                        if (31.0d <= dIntValue) {
                                                            dM3 = m0("F");
                                                            dM2 = dM3 + dM2;
                                                        }
                                                    } else if (31.0d <= dIntValue) {
                                                        dM3 = m0("F");
                                                        dM2 = dM3 + dM2;
                                                    }
                                                } else if (25.0d <= dIntValue) {
                                                    if (31.0d <= dIntValue) {
                                                        dM3 = m0("F");
                                                        dM2 = dM3 + dM2;
                                                    }
                                                } else if (31.0d <= dIntValue) {
                                                    dM3 = m0("F");
                                                    dM2 = dM3 + dM2;
                                                }
                                            } else if (19.0d > dIntValue) {
                                                if (25.0d <= dIntValue) {
                                                    if (31.0d <= dIntValue) {
                                                        dM3 = m0("F");
                                                        dM2 = dM3 + dM2;
                                                    }
                                                } else if (31.0d <= dIntValue) {
                                                    dM3 = m0("F");
                                                    dM2 = dM3 + dM2;
                                                }
                                            } else if (25.0d <= dIntValue) {
                                                if (31.0d <= dIntValue) {
                                                    dM3 = m0("F");
                                                    dM2 = dM3 + dM2;
                                                }
                                            } else if (31.0d <= dIntValue) {
                                                dM3 = m0("F");
                                                dM2 = dM3 + dM2;
                                            }
                                        } else if (13.0d > dIntValue) {
                                            if (19.0d > dIntValue) {
                                                if (25.0d <= dIntValue) {
                                                    if (31.0d <= dIntValue) {
                                                        dM3 = m0("F");
                                                        dM2 = dM3 + dM2;
                                                    }
                                                } else if (31.0d <= dIntValue) {
                                                    dM3 = m0("F");
                                                    dM2 = dM3 + dM2;
                                                }
                                            } else if (25.0d <= dIntValue) {
                                                if (31.0d <= dIntValue) {
                                                    dM3 = m0("F");
                                                    dM2 = dM3 + dM2;
                                                }
                                            } else if (31.0d <= dIntValue) {
                                                dM3 = m0("F");
                                                dM2 = dM3 + dM2;
                                            }
                                        } else if (19.0d > dIntValue) {
                                            if (25.0d <= dIntValue) {
                                                if (31.0d <= dIntValue) {
                                                    dM3 = m0("F");
                                                    dM2 = dM3 + dM2;
                                                }
                                            } else if (31.0d <= dIntValue) {
                                                dM3 = m0("F");
                                                dM2 = dM3 + dM2;
                                            }
                                        } else if (25.0d <= dIntValue) {
                                            if (31.0d <= dIntValue) {
                                                dM3 = m0("F");
                                                dM2 = dM3 + dM2;
                                            }
                                        } else if (31.0d <= dIntValue) {
                                            dM3 = m0("F");
                                            dM2 = dM3 + dM2;
                                        }
                                        if (1.0d <= dIntValue) {
                                            dM4 = m0("HIGH") + dM2;
                                            String color6 = localGameDetailsEntity2.getColor();
                                            dM5 = m0("HIGH_".concat(color6 != null ? color6 : ""));
                                        } else {
                                            dM4 = m0("HIGH") + dM2;
                                            String color7 = localGameDetailsEntity2.getColor();
                                            dM5 = m0("HIGH_".concat(color7 != null ? color7 : ""));
                                        }
                                        double d9 = dM5 + dM4;
                                        linkedHashMap2 = linkedHashMap5;
                                        d4 = (Double) linkedHashMap2.get("NUMBER");
                                        if (d4 != null) {
                                            dDoubleValue = d4.doubleValue();
                                        } else {
                                            dDoubleValue = d3;
                                        }
                                        linkedHashMap2.put("NUMBER", Double.valueOf(Math.max(dDoubleValue, d9)));
                                        Unit unit6 = Unit.a;
                                    }
                                    break;
                                case -1852945562:
                                    linkedHashMap3 = linkedHashMap5;
                                    if (category.equals("SECTOR")) {
                                        Double betAmount4 = localGameDetailsEntity2.getBetAmount();
                                        double dDoubleValue6 = betAmount4 != null ? betAmount4.doubleValue() : d3;
                                        Double payMultiplier2 = localGameDetailsEntity2.getPayMultiplier();
                                        double dDoubleValue7 = (dDoubleValue6 * (payMultiplier2 != null ? payMultiplier2.doubleValue() : d3)) + ((Intrinsics.g(localGameDetailsEntity2.getLocalizedTitle(), "A") || Intrinsics.g(localGameDetailsEntity2.getLocalizedTitle(), "B") || Intrinsics.g(localGameDetailsEntity2.getLocalizedTitle(), "C")) ? m0("LOW") + Math.max(m0("LOW_RED"), m0("LOW_BLACK")) : Math.max(m0("HIGH_RED"), m0("HIGH_BLACK")) + m0("HIGH"));
                                        Double d10 = (Double) linkedHashMap3.get("SECTOR");
                                        linkedHashMap3.put("SECTOR", Double.valueOf(Math.max(d10 != null ? d10.doubleValue() : d3, dDoubleValue7)));
                                        Unit unit7 = Unit.a;
                                        linkedHashMap2 = linkedHashMap3;
                                    }
                                    linkedHashMap2 = linkedHashMap3;
                                    break;
                                case -901346537:
                                    linkedHashMap3 = linkedHashMap5;
                                    if (category.equals("HIGH_LOW")) {
                                        Double betAmount5 = localGameDetailsEntity2.getBetAmount();
                                        double dDoubleValue8 = betAmount5 != null ? betAmount5.doubleValue() : d3;
                                        Double payMultiplier3 = localGameDetailsEntity2.getPayMultiplier();
                                        double dDoubleValue9 = (dDoubleValue8 * (payMultiplier3 != null ? payMultiplier3.doubleValue() : d3)) + (Intrinsics.g(localGameDetailsEntity2.getLocalizedTitle(), "LOW") ? Math.max(m0("LOW_RED"), m0("LOW_BLACK")) : Math.max(m0("HIGH_RED"), m0("HIGH_BLACK")));
                                        Double d11 = (Double) linkedHashMap3.get("HIGH_LOW");
                                        linkedHashMap3.put("HIGH_LOW", Double.valueOf(Math.max(d11 != null ? d11.doubleValue() : d3, dDoubleValue9)));
                                        Unit unit8 = Unit.a;
                                        linkedHashMap2 = linkedHashMap3;
                                    }
                                    linkedHashMap2 = linkedHashMap3;
                                    break;
                                case -338441228:
                                    linkedHashMap3 = linkedHashMap5;
                                    if (category.equals("HIGH_LOW_COLOUR")) {
                                        Double betAmount6 = localGameDetailsEntity2.getBetAmount();
                                        double dDoubleValue10 = betAmount6 != null ? betAmount6.doubleValue() : d3;
                                        Double payMultiplier4 = localGameDetailsEntity2.getPayMultiplier();
                                        double dDoubleValue11 = dDoubleValue10 * (payMultiplier4 != null ? payMultiplier4.doubleValue() : d3);
                                        Double d12 = (Double) linkedHashMap3.get("HIGH_LOW_COLOUR");
                                        linkedHashMap3.put("HIGH_LOW_COLOUR", Double.valueOf(Math.max(d12 != null ? d12.doubleValue() : d3, dDoubleValue11)));
                                        Unit unit9 = Unit.a;
                                        linkedHashMap2 = linkedHashMap3;
                                    }
                                    linkedHashMap2 = linkedHashMap3;
                                    break;
                                case 65241624:
                                    if (!category.equals("DOZEN")) {
                                        linkedHashMap2 = linkedHashMap5;
                                    } else {
                                        Double betAmount7 = localGameDetailsEntity2.getBetAmount();
                                        double dDoubleValue12 = betAmount7 != null ? betAmount7.doubleValue() : d3;
                                        Double payMultiplier5 = localGameDetailsEntity2.getPayMultiplier();
                                        double dDoubleValue13 = dDoubleValue12 * (payMultiplier5 != null ? payMultiplier5.doubleValue() : d3);
                                        String localizedTitle = localGameDetailsEntity2.getLocalizedTitle();
                                        if (localizedTitle != null) {
                                            int iHashCode = localizedTitle.hashCode();
                                            str8 = "RED";
                                            if (iHashCode != 1504573) {
                                                if (iHashCode != 46816717) {
                                                    if (iHashCode == 47799853 && localizedTitle.equals("25-36")) {
                                                        dDoubleValue13 = m0("HIGH") + Math.max(m0("HIGH_RED"), m0("HIGH_BLACK")) + Math.max(m0("E"), m0("F")) + dDoubleValue13;
                                                    }
                                                } else if (localizedTitle.equals("13-24")) {
                                                    dM6 = wl8.c(m0("LOW_RED"), m0("HIGH_RED"), m0("LOW_BLACK"), m0("HIGH_BLACK")) + Math.max(m0("LOW"), m0("HIGH")) + Math.max(m0("C"), m0("D"));
                                                    dDoubleValue13 = dM6 + dDoubleValue13;
                                                }
                                            } else if (localizedTitle.equals("1-12")) {
                                                dM6 = m0("LOW") + Math.max(m0("LOW_RED"), m0("LOW_BLACK")) + Math.max(m0("A"), m0("B"));
                                                dDoubleValue13 = dM6 + dDoubleValue13;
                                            }
                                        } else {
                                            str8 = "RED";
                                        }
                                        double dMax2 = Math.max(m0(str8), m0("BLACK")) + Math.max(m0("EVEN"), m0("ODD")) + dDoubleValue13;
                                        linkedHashMap3 = linkedHashMap5;
                                        Double d13 = (Double) linkedHashMap3.get("DOZEN");
                                        linkedHashMap3.put("DOZEN", Double.valueOf(Math.max(d13 != null ? d13.doubleValue() : d3, dMax2)));
                                        Unit unit10 = Unit.a;
                                        linkedHashMap2 = linkedHashMap3;
                                    }
                                    break;
                                case 1061088362:
                                    if (!category.equals("EVEN_ODD")) {
                                        linkedHashMap2 = linkedHashMap5;
                                    } else {
                                        Double betAmount8 = localGameDetailsEntity2.getBetAmount();
                                        double dDoubleValue14 = betAmount8 != null ? betAmount8.doubleValue() : d3;
                                        Double payMultiplier6 = localGameDetailsEntity2.getPayMultiplier();
                                        double dC = wl8.c(m0("LOW_RED"), m0("HIGH_RED"), m0("LOW_BLACK"), m0("HIGH_BLACK")) + Math.max(m0("LOW"), m0("HIGH")) + wl8.c(m0("A"), m0("B"), m0("C"), m0("D"), m0("E"), m0("F")) + Math.max(m0("RED"), m0("BLACK")) + (dDoubleValue14 * (payMultiplier6 != null ? payMultiplier6.doubleValue() : d3));
                                        linkedHashMap2 = linkedHashMap5;
                                        Double d14 = (Double) linkedHashMap2.get("EVEN_ODD");
                                        linkedHashMap2.put("EVEN_ODD", Double.valueOf(Math.max(d14 != null ? d14.doubleValue() : d3, dC)));
                                        Unit unit11 = Unit.a;
                                    }
                                    break;
                                case 1993454028:
                                    if (!category.equals("COLOUR")) {
                                        linkedHashMap2 = linkedHashMap5;
                                    } else {
                                        Double betAmount9 = localGameDetailsEntity2.getBetAmount();
                                        double dDoubleValue15 = betAmount9 != null ? betAmount9.doubleValue() : d3;
                                        Double payMultiplier7 = localGameDetailsEntity2.getPayMultiplier();
                                        double dDoubleValue16 = dDoubleValue15 * (payMultiplier7 != null ? payMultiplier7.doubleValue() : d3);
                                        String localizedTitle2 = localGameDetailsEntity2.getLocalizedTitle();
                                        if (!Intrinsics.g(localizedTitle2, "RED")) {
                                            if (Intrinsics.g(localizedTitle2, "BLACK")) {
                                                dMax = Math.max(m0("LOW_BLACK"), m0("HIGH_BLACK"));
                                            }
                                            if (!Intrinsics.g(localGameDetailsEntity2.getLocalizedTitle(), "GREEN")) {
                                                dDoubleValue16 = Math.max(m0("LOW"), m0("HIGH")) + wl8.c(m0("A"), m0("B"), m0("C"), m0("D"), m0("E"), m0("F")) + dDoubleValue16;
                                            }
                                            double d15 = dDoubleValue16;
                                            d5 = (Double) linkedHashMap5.get("COLOUR");
                                            if (d5 != null) {
                                                dDoubleValue2 = d5.doubleValue();
                                            } else {
                                                dDoubleValue2 = d3;
                                            }
                                            linkedHashMap5.put("COLOUR", Double.valueOf(Math.max(dDoubleValue2, d15)));
                                            Unit unit12 = Unit.a;
                                            linkedHashMap2 = linkedHashMap5;
                                        } else {
                                            dMax = Math.max(m0("LOW_RED"), m0("HIGH_RED"));
                                        }
                                        dDoubleValue16 = dMax + dDoubleValue16;
                                        if (!Intrinsics.g(localGameDetailsEntity2.getLocalizedTitle(), "GREEN")) {
                                            dDoubleValue16 = Math.max(m0("LOW"), m0("HIGH")) + wl8.c(m0("A"), m0("B"), m0("C"), m0("D"), m0("E"), m0("F")) + dDoubleValue16;
                                        }
                                        double d16 = dDoubleValue16;
                                        d5 = (Double) linkedHashMap5.get("COLOUR");
                                        if (d5 != null) {
                                            dDoubleValue2 = d5.doubleValue();
                                        } else {
                                            dDoubleValue2 = d3;
                                        }
                                        linkedHashMap5.put("COLOUR", Double.valueOf(Math.max(dDoubleValue2, d16)));
                                        Unit unit13 = Unit.a;
                                        linkedHashMap2 = linkedHashMap5;
                                    }
                                    break;
                                default:
                                    linkedHashMap2 = linkedHashMap5;
                                    break;
                            }
                            linkedHashMap4 = linkedHashMap2;
                            d6 = d3;
                            arrayList2 = arrayList;
                            size3 = i3;
                            i7 = i4;
                            textView4 = textView2;
                            str10 = str5;
                            strI = str7;
                            str11 = str6;
                        } else {
                            str5 = str10;
                            d3 = d6;
                            str6 = str11;
                            arrayList = arrayList2;
                            textView2 = textView4;
                            str7 = strI;
                            linkedHashMap2 = linkedHashMap4;
                            i3 = size3;
                            i4 = i7;
                        }
                        Unit unit14 = Unit.a;
                        linkedHashMap4 = linkedHashMap2;
                        d6 = d3;
                        arrayList2 = arrayList;
                        size3 = i3;
                        i7 = i4;
                        textView4 = textView2;
                        str10 = str5;
                        strI = str7;
                        str11 = str6;
                    }
                }
                str = str10;
                d2 = d6;
                str2 = str11;
                textView = textView4;
                str3 = strI;
                linkedHashMap = linkedHashMap4;
                i2 = 0;
                Unit unit15 = Unit.a;
            } else {
                str = " ";
                d2 = 0.0d;
                str2 = "0.00";
                textView = textView4;
                str3 = strI;
                linkedHashMap = linkedHashMap4;
                i2 = 0;
            }
            Iterator it = linkedHashMap.values().iterator();
            double dMax3 = d2;
            while (it.hasNext()) {
                dMax3 = Math.max(dMax3, ((Number) it.next()).doubleValue());
            }
            try {
                str4 = str2;
                try {
                    String str12 = new DecimalFormat(str4, SportyGamesManager.decimalFormatSymbols).format(dMax3);
                    str12.getClass();
                    str4 = str12;
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
                str4 = str2;
            }
            textView.setText(str3 + str + pw.a(str4));
        } else {
            i2 = 0;
        }
        wxi wxiVar3 = this.v;
        ViewGroup.LayoutParams layoutParams = wxiVar3 != null ? wxiVar3.R.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (this.a0) {
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(getResources().getDimensionPixelSize(R.dimen._18sdp));
            }
            wxi wxiVar4 = this.v;
            if (wxiVar4 != null) {
                wxiVar4.R.setLayoutParams(marginLayoutParams);
            }
            wxi wxiVar5 = this.v;
            if (wxiVar5 != null) {
                wxiVar5.F.setVisibility(i2);
                return;
            }
            return;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd(getResources().getDimensionPixelSize(R.dimen._9sdp));
        }
        wxi wxiVar6 = this.v;
        if (wxiVar6 != null) {
            wxiVar6.R.setLayoutParams(marginLayoutParams);
        }
        wxi wxiVar7 = this.v;
        if (wxiVar7 != null) {
            wxiVar7.F.setVisibility(8);
        }
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void d0() {
    }

    @Override // defpackage.bb
    public final void f0(m8 m8Var) {
        androidx.fragment.app.e activity;
        androidx.fragment.app.e activity2;
        Context context;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = nzf0.a;
        if (!z2 && jCurrentTimeMillis - nzf0.b <= 500) {
            z2 = true;
        }
        if (z2 || (activity = getActivity()) == null || activity.isFinishing() || (activity2 = getActivity()) == null || activity2.isDestroyed() || (context = getContext()) == null) {
            return;
        }
        hht hhtVar = new hht(context, "Spin2Win");
        String string = getString(R.string.game_not_available);
        string.getClass();
        String string2 = getString(R.string.label_dialog_exit);
        string2.getClass();
        hhtVar.c(string, string2, new Function0() { // from class: pya0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.a.H0(false);
                return Unit.a;
            }
        }, new qya0(), context.getColor(R.color.try_again_color));
        hhtVar.a();
    }

    public final void j0(double d2, String str) {
        wxi wxiVar;
        Double maxAmount;
        Double betAmount;
        Integer maxBetCount;
        double dDoubleValue = 0.0d;
        Double dValueOf = Double.valueOf(0.0d);
        v4b0 v4b0VarW0 = w0();
        GameDetailsResponse gameDetailsResponse = this.T;
        v4b0VarW0.c = Integer.valueOf((gameDetailsResponse == null || (maxBetCount = gameDetailsResponse.getMaxBetCount()) == null) ? 0 : maxBetCount.intValue());
        LocalGameDetailsEntity localGameDetailsEntity = this.L;
        ArrayList arrayList = this.J;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                LocalGameDetailsEntity localGameDetailsEntity2 = (LocalGameDetailsEntity) obj;
                if (Intrinsics.g(localGameDetailsEntity2.getCategory(), localGameDetailsEntity != null ? localGameDetailsEntity.getCategory() : null)) {
                    if (Intrinsics.g(localGameDetailsEntity2.getBetTypeId(), localGameDetailsEntity != null ? localGameDetailsEntity.getBetTypeId() : null)) {
                        if (Intrinsics.g(localGameDetailsEntity2.getLocalizedTitle(), localGameDetailsEntity != null ? localGameDetailsEntity.getLocalizedTitle() : null)) {
                            arrayList2.add(obj);
                        }
                    }
                }
            }
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                LocalGameDetailsEntity localGameDetailsEntity3 = (LocalGameDetailsEntity) obj2;
                Double betAmount2 = localGameDetailsEntity3.getBetAmount();
                double dDoubleValue2 = betAmount2 != null ? betAmount2.doubleValue() : 0.0d;
                Double maxAmount2 = localGameDetailsEntity3.getMaxAmount();
                if (dDoubleValue2 + d2 <= (maxAmount2 != null ? maxAmount2.doubleValue() : 0.0d)) {
                    List<String> allBetAmountList = localGameDetailsEntity3.getAllBetAmountList();
                    if (allBetAmountList != null) {
                        allBetAmountList.add(String.valueOf(d2));
                    }
                    Double betAmount3 = localGameDetailsEntity3.getBetAmount();
                    localGameDetailsEntity3.setBetAmount(betAmount3 != null ? Double.valueOf(betAmount3.doubleValue() + d2) : null);
                }
            }
        }
        wxi wxiVar2 = this.v;
        if (wxiVar2 != null) {
            BetChipContainerSpin2Win betChipContainerSpin2Win = wxiVar2.c;
            LocalGameDetailsEntity localGameDetailsEntity4 = this.L;
            Double dValueOf2 = Double.valueOf((localGameDetailsEntity4 == null || (betAmount = localGameDetailsEntity4.getBetAmount()) == null) ? 0.0d : betAmount.doubleValue());
            LocalGameDetailsEntity localGameDetailsEntity5 = this.L;
            if (localGameDetailsEntity5 != null && (maxAmount = localGameDetailsEntity5.getMaxAmount()) != null) {
                dDoubleValue = maxAmount.doubleValue();
            }
            betChipContainerSpin2Win.setBetAmount(dValueOf2, Double.valueOf(dDoubleValue));
        }
        wxi wxiVar3 = this.v;
        if (wxiVar3 != null) {
            wxiVar3.a0.setEnabled(true);
        }
        wxi wxiVar4 = this.v;
        if (wxiVar4 != null) {
            wxiVar4.a0.setAlpha(1.0f);
        }
        wxi wxiVar5 = this.v;
        if (wxiVar5 != null) {
            wxiVar5.v.setEnabled(true);
        }
        wxi wxiVar6 = this.v;
        if (wxiVar6 != null) {
            wxiVar6.v.setAlpha(1.0f);
        }
        wxi wxiVar7 = this.v;
        if (wxiVar7 != null) {
            wxiVar7.O.setEnabled(true);
        }
        wxi wxiVar8 = this.v;
        if (wxiVar8 != null) {
            wxiVar8.O.setAlpha(1.0f);
        }
        wxi wxiVar9 = this.v;
        if (wxiVar9 != null) {
            wxiVar9.P.setVisibility(0);
        }
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        wxi wxiVar10 = this.v;
        bVar.f(wxiVar10 != null ? wxiVar10.O : null);
        wxi wxiVar11 = this.v;
        int id = wxiVar11 != null ? wxiVar11.W.getId() : 0;
        wxi wxiVar12 = this.v;
        bVar.g(id, 4, wxiVar12 != null ? wxiVar12.D.getId() : 0, 4);
        wxi wxiVar13 = this.v;
        bVar.b(wxiVar13 != null ? wxiVar13.O : null);
        X0();
        LocalGameDetailsEntity localGameDetailsEntity6 = this.L;
        boolean zG = Intrinsics.g(localGameDetailsEntity6 != null ? localGameDetailsEntity6.getCategory() : null, "NUMBER");
        wxi wxiVar14 = this.v;
        if (zG) {
            if (wxiVar14 != null) {
                Spin2WinNumberBoard spin2WinNumberBoard = wxiVar14.J;
                LocalGameDetailsEntity localGameDetailsEntity7 = this.L;
                GameDetailsResponse gameDetailsResponse2 = this.T;
                spin2WinNumberBoard.Q(localGameDetailsEntity7, gameDetailsResponse2 != null ? gameDetailsResponse2.getBetChipList() : null, str);
            }
        } else if (wxiVar14 != null) {
            Spin2WinButtonBoard spin2WinButtonBoard = wxiVar14.i;
            LocalGameDetailsEntity localGameDetailsEntity8 = this.L;
            GameDetailsResponse gameDetailsResponse3 = this.T;
            spin2WinButtonBoard.N(localGameDetailsEntity8, gameDetailsResponse3 != null ? gameDetailsResponse3.getBetChipList() : null, str);
        }
        if (str.equals("fbg") && (wxiVar = this.v) != null) {
            wxiVar.c.setBetAmount(dValueOf, dValueOf);
        }
        wxi wxiVar15 = this.v;
        if (wxiVar15 != null) {
            wxiVar15.c.E(false);
        }
    }

    public final double m0(String str) {
        Double payMultiplier;
        Double betAmount;
        LocalGameDetailsEntity localGameDetailsEntity = null;
        Object obj = null;
        double dDoubleValue = 0.0d;
        ArrayList arrayList = this.J;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                LocalGameDetailsEntity localGameDetailsEntity2 = (LocalGameDetailsEntity) obj2;
                Double betAmount2 = localGameDetailsEntity2.getBetAmount();
                if ((betAmount2 != null ? betAmount2.doubleValue() : 0.0d) > 0.0d && Intrinsics.g(localGameDetailsEntity2.getBetType(), str)) {
                    obj = obj2;
                    break;
                }
            }
            localGameDetailsEntity = (LocalGameDetailsEntity) obj;
        }
        double dDoubleValue2 = (localGameDetailsEntity == null || (betAmount = localGameDetailsEntity.getBetAmount()) == null) ? 0.0d : betAmount.doubleValue();
        if (localGameDetailsEntity != null && (payMultiplier = localGameDetailsEntity.getPayMultiplier()) != null) {
            dDoubleValue = payMultiplier.doubleValue();
        }
        return dDoubleValue2 * dDoubleValue;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object n0(TextView textView, double d2, String str, x1b x1bVar) {
        c1b0 c1b0Var;
        String str2;
        TranslateAnimation translateAnimation;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        TextView textView2 = textView;
        if (x1bVar instanceof c1b0) {
            c1b0Var = (c1b0) x1bVar;
            int i2 = c1b0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1b0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                c1b0Var = new c1b0(this, x1bVar);
            }
        } else {
            c1b0Var = new c1b0(this, x1bVar);
        }
        Object obj = c1b0Var.b;
        y5b y5bVar = y5b.a;
        int i3 = c1b0Var.d;
        if (i3 == 0) {
            uj50.b(obj);
            if (d2 > 0.0d) {
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                if (textView2 != null) {
                    textView2.setAlpha(1.0f);
                }
                if (Intrinsics.g(str, "up")) {
                    translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -3.5f);
                    str2 = "+ ";
                } else {
                    str2 = "- ";
                    translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 3.5f);
                }
                if (textView2 != null) {
                    TreeMap treeMap = pw.a;
                    textView2.setText(str2.concat(pw.g(new Double(d2))));
                }
                AnimationSet animationSet = new AnimationSet(true);
                translateAnimation.setDuration(1200L);
                animationSet.addAnimation(translateAnimation);
                if (textView2 != null) {
                    textView2.startAnimation(translateAnimation);
                }
                c1b0Var.a = textView2;
                c1b0Var.d = 1;
                if (hkd.b(800L, c1b0Var) == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        }
        if (i3 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        textView2 = c1b0Var.a;
        uj50.b(obj);
        if (textView2 != null && (viewPropertyAnimatorAnimate = textView2.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) != null) {
            viewPropertyAnimatorAlpha.setDuration(500L);
        }
        return Unit.a;
    }

    public final boolean o0(LocalGameDetailsEntity localGameDetailsEntity) {
        List<String> allBetAmountList;
        if (localGameDetailsEntity != null && (allBetAmountList = localGameDetailsEntity.getAllBetAmountList()) != null && allBetAmountList.isEmpty()) {
            mxa0 mxa0VarX1 = w0().x1(localGameDetailsEntity, false);
            if (Intrinsics.g(mxa0VarX1, mxa0.a.a)) {
                op5 op5Var = op5.a;
                String string = getString(R.string.key_max_bet_count_alert);
                string.getClass();
                String string2 = getString(R.string.max_bet_count_alert);
                string2.getClass();
                op5Var.getClass();
                T0(op5.b(string, string2, null));
                return false;
            }
            if (Intrinsics.g(mxa0VarX1, mxa0.b.a)) {
                op5 op5Var2 = op5.a;
                String string3 = getString(R.string.key_coverage_alert);
                string3.getClass();
                String string4 = getString(R.string.coverage_alert);
                string4.getClass();
                op5Var2.getClass();
                T0(op5.b(string3, string4, null));
                return false;
            }
            if (!Intrinsics.g(mxa0VarX1, mxa0.c.a)) {
                uhc.a();
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof mke) {
            this.d0 = (mke) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_spin2_win, viewGroup, false);
        int i2 = R.id.bet_button_layout;
        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.bet_button_layout, viewInflate);
        if (constraintLayout != null) {
            i2 = R.id.bet_chips;
            BetChipContainerSpin2Win betChipContainerSpin2Win = (BetChipContainerSpin2Win) h5e.a(R.id.bet_chips, viewInflate);
            if (betChipContainerSpin2Win != null) {
                i2 = R.id.bet_list;
                RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.bet_list, viewInflate);
                if (recyclerView != null) {
                    i2 = R.id.bet_list_group;
                    Group group = (Group) h5e.a(R.id.bet_list_group, viewInflate);
                    if (group != null) {
                        i2 = R.id.board_header_layout;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.board_header_layout, viewInflate);
                        if (constraintLayout2 != null) {
                            i2 = R.id.button_board_layout;
                            Spin2WinButtonBoard spin2WinButtonBoard = (Spin2WinButtonBoard) h5e.a(R.id.button_board_layout, viewInflate);
                            if (spin2WinButtonBoard != null) {
                                i2 = R.id.clear_all_layout;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.clear_all_layout, viewInflate);
                                if (constraintLayout3 != null) {
                                    i2 = R.id.cordLayout;
                                    if (((CoordinatorLayout) h5e.a(R.id.cordLayout, viewInflate)) != null) {
                                        i2 = R.id.drawer_layout;
                                        DrawerLayout drawerLayout = (DrawerLayout) h5e.a(R.id.drawer_layout, viewInflate);
                                        if (drawerLayout != null) {
                                            i2 = R.id.error_toast;
                                            SgErrorToastContainer sgErrorToastContainer = (SgErrorToastContainer) h5e.a(R.id.error_toast, viewInflate);
                                            if (sgErrorToastContainer != null) {
                                                i2 = R.id.flContent;
                                                if (((FrameLayout) h5e.a(R.id.flContent, viewInflate)) != null) {
                                                    i2 = R.id.game_header;
                                                    Spin2WinHeader spin2WinHeader = (Spin2WinHeader) h5e.a(R.id.game_header, viewInflate);
                                                    if (spin2WinHeader != null) {
                                                        i2 = R.id.games_campaign_progress;
                                                        ComposeView composeView = (ComposeView) h5e.a(R.id.games_campaign_progress, viewInflate);
                                                        if (composeView != null) {
                                                            i2 = R.id.games_campaign_progress_container;
                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.games_campaign_progress_container, viewInflate);
                                                            if (constraintLayout4 != null) {
                                                                i2 = R.id.gift_toast_bar;
                                                                GiftToast giftToast = (GiftToast) h5e.a(R.id.gift_toast_bar, viewInflate);
                                                                if (giftToast != null) {
                                                                    i2 = R.id.guideline1;
                                                                    Guideline guideline = (Guideline) h5e.a(R.id.guideline1, viewInflate);
                                                                    if (guideline != null) {
                                                                        i2 = R.id.guideline2;
                                                                        if (((Guideline) h5e.a(R.id.guideline2, viewInflate)) != null) {
                                                                            i2 = R.id.hamburger_menu;
                                                                            SGHamburgerMenu sGHamburgerMenu = (SGHamburgerMenu) h5e.a(R.id.hamburger_menu, viewInflate);
                                                                            if (sGHamburgerMenu != null) {
                                                                                i2 = R.id.ic_clear;
                                                                                if (((ImageView) h5e.a(R.id.ic_clear, viewInflate)) != null) {
                                                                                    i2 = R.id.ic_fbg;
                                                                                    ImageView imageView = (ImageView) h5e.a(R.id.ic_fbg, viewInflate);
                                                                                    if (imageView != null) {
                                                                                        i2 = R.id.ic_undo;
                                                                                        if (((ImageView) h5e.a(R.id.ic_undo, viewInflate)) != null) {
                                                                                            i2 = R.id.invisible_board;
                                                                                            View viewA = h5e.a(R.id.invisible_board, viewInflate);
                                                                                            if (viewA != null) {
                                                                                                i2 = R.id.navigationView;
                                                                                                if (((NavigationView) h5e.a(R.id.navigationView, viewInflate)) != null) {
                                                                                                    i2 = R.id.new_bet_layout;
                                                                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.new_bet_layout, viewInflate);
                                                                                                    if (constraintLayout5 != null) {
                                                                                                        i2 = R.id.new_round;
                                                                                                        TextView textView = (TextView) h5e.a(R.id.new_round, viewInflate);
                                                                                                        if (textView != null) {
                                                                                                            i2 = R.id.number_board_layout;
                                                                                                            Spin2WinNumberBoard spin2WinNumberBoard = (Spin2WinNumberBoard) h5e.a(R.id.number_board_layout, viewInflate);
                                                                                                            if (spin2WinNumberBoard != null) {
                                                                                                                i2 = R.id.onboarding_images;
                                                                                                                FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.onboarding_images, viewInflate);
                                                                                                                if (frameLayout != null) {
                                                                                                                    i2 = R.id.potential_win_value;
                                                                                                                    TextView textView2 = (TextView) h5e.a(R.id.potential_win_value, viewInflate);
                                                                                                                    if (textView2 != null) {
                                                                                                                        i2 = R.id.progress_meter_component;
                                                                                                                        ProgressMeterComponent progressMeterComponent = (ProgressMeterComponent) h5e.a(R.id.progress_meter_component, viewInflate);
                                                                                                                        if (progressMeterComponent != null) {
                                                                                                                            i2 = R.id.re_bet;
                                                                                                                            TextView textView3 = (TextView) h5e.a(R.id.re_bet, viewInflate);
                                                                                                                            if (textView3 != null) {
                                                                                                                                i2 = R.id.spin_layout;
                                                                                                                                ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.spin_layout, viewInflate);
                                                                                                                                if (constraintLayout6 != null) {
                                                                                                                                    i2 = R.id.stake_group;
                                                                                                                                    Group group2 = (Group) h5e.a(R.id.stake_group, viewInflate);
                                                                                                                                    if (group2 != null) {
                                                                                                                                        i2 = R.id.table_layout;
                                                                                                                                        ConstraintLayout constraintLayout7 = (ConstraintLayout) h5e.a(R.id.table_layout, viewInflate);
                                                                                                                                        if (constraintLayout7 != null) {
                                                                                                                                            i2 = R.id.total_stake_value;
                                                                                                                                            TextView textView4 = (TextView) h5e.a(R.id.total_stake_value, viewInflate);
                                                                                                                                            if (textView4 != null) {
                                                                                                                                                i2 = R.id.tv_clear;
                                                                                                                                                TextView textView5 = (TextView) h5e.a(R.id.tv_clear, viewInflate);
                                                                                                                                                if (textView5 != null) {
                                                                                                                                                    i2 = R.id.tv_my_bets;
                                                                                                                                                    TextView textView6 = (TextView) h5e.a(R.id.tv_my_bets, viewInflate);
                                                                                                                                                    if (textView6 != null) {
                                                                                                                                                        i2 = R.id.tv_payouts;
                                                                                                                                                        TextView textView7 = (TextView) h5e.a(R.id.tv_payouts, viewInflate);
                                                                                                                                                        if (textView7 != null) {
                                                                                                                                                            i2 = R.id.tv_potential_win;
                                                                                                                                                            TextView textView8 = (TextView) h5e.a(R.id.tv_potential_win, viewInflate);
                                                                                                                                                            if (textView8 != null) {
                                                                                                                                                                i2 = R.id.tv_spin;
                                                                                                                                                                TextView textView9 = (TextView) h5e.a(R.id.tv_spin, viewInflate);
                                                                                                                                                                if (textView9 != null) {
                                                                                                                                                                    i2 = R.id.tv_stats;
                                                                                                                                                                    TextView textView10 = (TextView) h5e.a(R.id.tv_stats, viewInflate);
                                                                                                                                                                    if (textView10 != null) {
                                                                                                                                                                        i2 = R.id.tv_total_stake;
                                                                                                                                                                        TextView textView11 = (TextView) h5e.a(R.id.tv_total_stake, viewInflate);
                                                                                                                                                                        if (textView11 != null) {
                                                                                                                                                                            i2 = R.id.tv_undo;
                                                                                                                                                                            TextView textView12 = (TextView) h5e.a(R.id.tv_undo, viewInflate);
                                                                                                                                                                            if (textView12 != null) {
                                                                                                                                                                                i2 = R.id.undo_layout;
                                                                                                                                                                                ConstraintLayout constraintLayout8 = (ConstraintLayout) h5e.a(R.id.undo_layout, viewInflate);
                                                                                                                                                                                if (constraintLayout8 != null) {
                                                                                                                                                                                    i2 = R.id.wheel_group;
                                                                                                                                                                                    Group group3 = (Group) h5e.a(R.id.wheel_group, viewInflate);
                                                                                                                                                                                    if (group3 != null) {
                                                                                                                                                                                        i2 = R.id.wheel_layout;
                                                                                                                                                                                        Spin2WinWheel spin2WinWheel = (Spin2WinWheel) h5e.a(R.id.wheel_layout, viewInflate);
                                                                                                                                                                                        if (spin2WinWheel != null) {
                                                                                                                                                                                            i2 = R.id.wheel_layout_shadow;
                                                                                                                                                                                            CardView cardView = (CardView) h5e.a(R.id.wheel_layout_shadow, viewInflate);
                                                                                                                                                                                            if (cardView != null) {
                                                                                                                                                                                                ConstraintLayout constraintLayout9 = (ConstraintLayout) viewInflate;
                                                                                                                                                                                                this.v = new wxi(constraintLayout9, constraintLayout, betChipContainerSpin2Win, recyclerView, group, constraintLayout2, spin2WinButtonBoard, constraintLayout3, drawerLayout, sgErrorToastContainer, spin2WinHeader, composeView, constraintLayout4, giftToast, guideline, sGHamburgerMenu, imageView, viewA, constraintLayout5, textView, spin2WinNumberBoard, frameLayout, textView2, progressMeterComponent, textView3, constraintLayout6, group2, constraintLayout7, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, constraintLayout8, group3, spin2WinWheel, cardView);
                                                                                                                                                                                                return constraintLayout9;
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
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        nya0.e.a = null;
        getViewModelStore().a();
        SportyGamesManager.getInstance().removeAccountUpdatedListener(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            y0().e.l(getViewLifecycleOwner());
            y0().d.l(getViewLifecycleOwner());
            y0().y1();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String name;
        wxi wxiVar;
        Context context;
        wxi wxiVar2;
        String name2;
        super.onResume();
        GameDetails gameDetails = this.i;
        if (gameDetails == null || (name = gameDetails.getName()) == null) {
            name = "";
        }
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        q8i0 q8i0Var = this.f;
        ra6.c(name, viewLifecycleOwner, (db6) q8i0Var.getValue(), y0());
        GameDetails gameDetails2 = this.i;
        String str = (gameDetails2 == null || (name2 = gameDetails2.getName()) == null) ? "" : name2;
        androidx.fragment.app.e activity = getActivity();
        ibs viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        wxi wxiVar3 = this.v;
        ra6.b(str, activity, viewLifecycleOwner2, wxiVar3 != null ? wxiVar3.A : null, this.e0, y0(), (db6) q8i0Var.getValue(), 0L, Float.valueOf(2.55f), new tld0(this.i), new Function1() { // from class: zya0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                a1b0 a1b0Var = this.a;
                CampaignTopicResponse campaignTopicResponse = (CampaignTopicResponse) obj;
                try {
                    a1b0Var.f0 = campaignTopicResponse != null;
                    if (campaignTopicResponse != null && !Intrinsics.g(campaignTopicResponse.getMessageType(), "ACTIVITY_INIT") && campaignTopicResponse.getCampaignCompletedJustNow()) {
                        a1b0Var.O0();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return Unit.a;
            }
        }, new Function0() { // from class: fza0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                try {
                    this.a.w0().z1();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return Unit.a;
            }
        }, null, 16768);
        y0().x1();
        if (!this.K) {
            GameDetails gameDetails3 = this.i;
            wz.a("GameForeground", gameDetails3 != null ? gameDetails3.getName() : null, new String[0]);
        }
        if (!this.I || (wxiVar = this.v) == null || wxiVar.M.getVisibility() != 8 || (context = getContext()) == null) {
            return;
        }
        SharedPreferences sharedPreferences = this.y;
        Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("spin2win_music", true)) : null;
        if (Intrinsics.g(boolValueOf, Boolean.FALSE) || (wxiVar2 = this.v) == null) {
            return;
        }
        ProgressMeterComponent progressMeterComponent = wxiVar2.M;
        ypa0 ypa0VarZ0 = z0();
        String string = context.getString(R.string.bg_music);
        string.getClass();
        progressMeterComponent.K(ypa0VarZ0, boolValueOf, string);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        wxi wxiVar = this.v;
        if (wxiVar != null && wxiVar.c0.isWheelSpinning) {
            ypa0 ypa0VarZ0 = z0();
            ej5.c(o8i0.d(ypa0VarZ0), null, null, new xpa0(ypa0VarZ0, null), 3);
            this.N = true;
            this.M = ej5.c(ebs.a(getLifecycle()), null, null, new o1b0(0L, this, null), 3);
            return;
        }
        this.N = false;
        jvd0 jvd0Var = this.M;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        z0().x1();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.v != null) {
            z0().I1();
        }
        this.N = false;
        jvd0 jvd0Var = this.M;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        GameDetails gameDetails = this.i;
        wz.a("GameBackground", gameDetails != null ? gameDetails.getName() : null, new String[0]);
    }

    /* JADX WARN: Type inference failed for: r10v18, types: [cza0] */
    /* JADX WARN: Type inference failed for: r10v19, types: [bza0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [eza0] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        iq80 binding;
        String name;
        androidx.fragment.app.e activity;
        ssw<Integer> liveData;
        Resources resources;
        String[] stringArray;
        LobbyMetaInfo metaInfo;
        Long minimumCMSVersionSupported;
        iq80 iq80Var;
        view.getClass();
        super.onViewCreated(view, bundle);
        Context context = getContext();
        q8i0 q8i0Var = this.b;
        int i2 = 1;
        if (context != null && (activity = getActivity()) != null) {
            z0();
            this.w = new xbg(activity, "Spin2Win");
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                String str = ((db6) this.f.getValue()).c;
                if (str == null) {
                    str = "Ongoing";
                }
                this.e0 = new z66(activity2, str);
            }
            SportyGamesManager.getInstance().setScreenName("sportygames/spin-to-win");
            wxi wxiVar = this.v;
            if (wxiVar != null && (iq80Var = wxiVar.z.binding) != null) {
                iq80Var.A.setVisibility(4);
            }
            wxi wxiVar2 = this.v;
            if (wxiVar2 != null) {
                wxiVar2.c.setColor(R.color.sg_color_0d3525);
            }
            SharedPreferences sharedPreferencesA = un20.a(context);
            this.y = sharedPreferencesA;
            this.z = sharedPreferencesA != null ? sharedPreferencesA.edit() : null;
            androidx.fragment.app.e activity3 = getActivity();
            if (activity3 != null) {
                Window window = activity3.getWindow();
                window.addFlags(Integer.MIN_VALUE);
                qlf.d(activity3);
                qlf.c(window, activity3.getColor(R.color.sg_color_115439));
            }
            SportyGamesManager.getInstance().addAccountUpdatedListener(this);
            op5.a.getClass();
            String str2 = this.X;
            op5.c = str2;
            String strA = xwj.a();
            long versionCode = SportyGamesManager.getInstance().getVersionCode();
            GameDetails gameDetails = this.i;
            if (versionCode < ((gameDetails == null || (metaInfo = gameDetails.getMetaInfo()) == null || (minimumCMSVersionSupported = metaInfo.getMinimumCMSVersionSupported()) == null) ? 0L : minimumCMSVersionSupported.longValue())) {
                strA = "en";
            }
            ArrayList<String> arrayList = vlr.a.get("spin-to-win");
            if (arrayList != null && arrayList.contains(strA)) {
                this.G = xwj.a();
            }
            wxi wxiVar3 = this.v;
            if (wxiVar3 != null) {
                wxiVar3.M.E((fq5) q8i0Var.getValue(), this.Y, str2, this.G);
            }
            final Context context2 = getContext();
            if (context2 != null) {
                Context context3 = getContext();
                int length = ((context3 == null || (resources = context3.getResources()) == null || (stringArray = resources.getStringArray(R.array.spin2win_array)) == null) ? 0 : stringArray.length) + 7;
                wxi wxiVar4 = this.v;
                if (wxiVar4 != null) {
                    wxiVar4.M.setProgressForApi(100 / length);
                }
                wxi wxiVar5 = this.v;
                if (wxiVar5 != null) {
                    wxiVar5.M.setVisibility(0);
                }
                wxi wxiVar6 = this.v;
                if (wxiVar6 != null) {
                    wxiVar6.M.setCurrentProgress(100 - ((100 / length) * length));
                }
                wxi wxiVar7 = this.v;
                if (wxiVar7 != null && (liveData = wxiVar7.M.getLiveData()) != null) {
                    liveData.f(getViewLifecycleOwner(), new lfy() { // from class: lza0
                        @Override // defpackage.lfy
                        public final void u1(Object obj) {
                            Integer num = (Integer) obj;
                            a1b0 a1b0Var = this.a;
                            if (num != null && num.intValue() == 60) {
                                a1b0Var.w0().y1();
                                pfd pfdVar = fse.a;
                                ej5.c(w5b.a(gku.a), null, null, new l1b0(a1b0Var, null), 3);
                            }
                            if (num != null && num.intValue() == 100) {
                                pfd pfdVar2 = fse.a;
                                ej5.c(w5b.a(gku.a), null, null, new m1b0(a1b0Var, context2, null), 3);
                            }
                        }
                    });
                }
            }
            wxi wxiVar8 = this.v;
            if (wxiVar8 != null) {
                wxiVar8.i.setViewModel(w0());
            }
            wxi wxiVar9 = this.v;
            if (wxiVar9 != null) {
                wxiVar9.J.setViewModel(w0());
            }
        }
        GameDetails gameDetails2 = this.i;
        int i3 = 3;
        if (gameDetails2 != null && (name = gameDetails2.getName()) != null) {
            v4b0 v4b0VarW0 = w0();
            ej5.c(o8i0.d(v4b0VarW0), null, null, new x4b0(v4b0VarW0, name, null), 3);
        }
        this.K = true;
        w0().I.f(getViewLifecycleOwner(), new p1b0(new hb20(this, i2)));
        w0().H.f(getViewLifecycleOwner(), new p1b0(new Function1() { // from class: wya0
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:184:0x030a  */
            /* JADX WARN: Code duplicated, block: B:218:0x037b  */
            /* JADX WARN: Code duplicated, block: B:239:0x03ba  */
            /* JADX WARN: Failed to clean up code after switch over string restore
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v4 int, still in use, count: 1, list:
              (r8v4 int) from 0x02c9: SWITCH (r8v4 int)
             case 65: goto B:181:0x0300
             case 66: goto B:178:0x02f6
             case 67: goto B:175:0x02ec
             case 68: goto B:172:0x02e2
             case 69: goto B:169:0x02d8
             case 70: goto B:166:0x02ce
             default: goto B:239:0x03ba A[RegionRef:SW:164] (LINE:714)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
            	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
            	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
             */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List<Spin2WinIndividualBetResponse> individualBetResponseList;
                String str3;
                Spin2WinPlaceBetResponse spin2WinPlaceBetResponse;
                Double giftAmount;
                e activity4;
                ResultWrapper.GenericError error;
                Integer code;
                Integer code2;
                Integer code3;
                wxi wxiVar10;
                final LoadingState loadingState = (LoadingState) obj;
                int i4 = a1b0.a.a[loadingState.getStatus().ordinal()];
                final a1b0 a1b0Var = this.a;
                boolean z2 = false;
                if (i4 != 1) {
                    int i5 = 2;
                    if (i4 == 2) {
                        Context context4 = a1b0Var.getContext();
                        if (context4 != null && (activity4 = a1b0Var.getActivity()) != null && !a1b0Var.isRemoving()) {
                            a1b0Var.w0().z1();
                            if (a1b0Var.a0) {
                                a1b0Var.p0();
                                wxi wxiVar11 = a1b0Var.v;
                                if (wxiVar11 != null) {
                                    wxiVar11.c.E(false);
                                }
                                a1b0Var.K0();
                            }
                            wxi wxiVar12 = a1b0Var.v;
                            if (wxiVar12 != null) {
                                wxiVar12.c0.F();
                            }
                            wxi wxiVar13 = a1b0Var.v;
                            if (wxiVar13 != null) {
                                wxiVar13.b.setVisibility(0);
                            }
                            wxi wxiVar14 = a1b0Var.v;
                            if (wxiVar14 != null) {
                                wxiVar14.c.setVisibility(0);
                            }
                            wxi wxiVar15 = a1b0Var.v;
                            if (wxiVar15 != null) {
                                wxiVar15.J.setVisibility(0);
                            }
                            wxi wxiVar16 = a1b0Var.v;
                            if (wxiVar16 != null) {
                                wxiVar16.i.setVisibility(0);
                            }
                            wxi wxiVar17 = a1b0Var.v;
                            if (wxiVar17 != null) {
                                wxiVar17.f.setVisibility(0);
                            }
                            wxi wxiVar18 = a1b0Var.v;
                            if (wxiVar18 != null) {
                                wxiVar18.z.a(false);
                            }
                            a1b0Var.C0();
                            v4b0 v4b0VarW1 = a1b0Var.w0();
                            v4b0VarW1.b = null;
                            v4b0VarW1.a = null;
                            a1b0Var.N = false;
                            wxi wxiVar19 = a1b0Var.v;
                            if (wxiVar19 != null) {
                                wxiVar19.c0.setWheelSpinning(false);
                            }
                            jvd0 jvd0Var = a1b0Var.M;
                            if (jvd0Var != null) {
                                jvd0Var.cancel((CancellationException) null);
                            }
                            a1b0Var.z0().x1();
                            a1b0Var.w0().J.j(Boolean.TRUE);
                            ResultWrapper.GenericError error2 = loadingState.getError();
                            if (error2 == null || (code3 = error2.getCode()) == null || code3.intValue() != 403) {
                                ResultWrapper.GenericError error3 = loadingState.getError();
                                if ((error3 == null || (code2 = error3.getCode()) == null || code2.intValue() != 123450) && ((error = loadingState.getError()) == null || (code = error.getCode()) == null || code.intValue() != 123451)) {
                                    nya0 nya0Var = nya0.e;
                                    a1b0Var.z0();
                                    jcg.d(nya0Var, activity4, "Spin2Win", loadingState.getError(), new ca1(a1b0Var, 1), new nj60(a1b0Var, 1), new Function0() { // from class: wza0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            HTTPResponse<Object> error4;
                                            List listC = kotlin.collections.a.c(-11);
                                            ResultWrapper.GenericError error5 = loadingState.getError();
                                            if (!CollectionsKt.M(listC, (error5 == null || (error4 = error5.getError()) == null) ? null : error4.getBizCode())) {
                                                a1b0Var.w0().y1();
                                            }
                                            return Unit.a;
                                        }
                                    }, 0, context4.getColor(R.color.try_again_color), new xza0(), new Function0() { // from class: zza0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            HTTPResponse<Object> error4;
                                            List listK = b.k(8009, -11);
                                            ResultWrapper.GenericError error5 = loadingState.getError();
                                            if (!CollectionsKt.M(listK, (error5 == null || (error4 = error5.getError()) == null) ? null : error4.getBizCode())) {
                                                a1b0Var.w0().y1();
                                            }
                                            return Unit.a;
                                        }
                                    }, null, new b7p(a1b0Var, i5), new v920(a1b0Var, i5), 29056);
                                } else {
                                    e activity5 = a1b0Var.getActivity();
                                    GameMainActivity gameMainActivity = activity5 instanceof GameMainActivity ? (GameMainActivity) activity5 : null;
                                    if (gameMainActivity != null) {
                                        Integer code4 = loadingState.getError().getCode();
                                        if (code4 != null && code4.intValue() == 123450) {
                                            z2 = true;
                                        }
                                        gameMainActivity.b2(z2);
                                    }
                                }
                            } else {
                                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                            }
                        }
                    } else {
                        if (i4 != 3) {
                            uhc.a();
                            return null;
                        }
                        wxi wxiVar20 = a1b0Var.v;
                        if (wxiVar20 != null) {
                            wxiVar20.b.setVisibility(8);
                        }
                        wxi wxiVar21 = a1b0Var.v;
                        if (wxiVar21 != null) {
                            wxiVar21.c.setVisibility(8);
                        }
                        wxi wxiVar22 = a1b0Var.v;
                        if (wxiVar22 != null) {
                            wxiVar22.J.setVisibility(8);
                        }
                        wxi wxiVar23 = a1b0Var.v;
                        if (wxiVar23 != null) {
                            wxiVar23.i.setVisibility(8);
                        }
                        wxi wxiVar24 = a1b0Var.v;
                        if (wxiVar24 != null) {
                            wxiVar24.f.setVisibility(8);
                        }
                        wxi wxiVar25 = a1b0Var.v;
                        if (wxiVar25 != null) {
                            wxiVar25.H.setVisibility(8);
                        }
                        wxi wxiVar26 = a1b0Var.v;
                        if (wxiVar26 != null) {
                            wxiVar26.z.a(true);
                        }
                        if (a1b0Var.getContext() != null && (wxiVar10 = a1b0Var.v) != null) {
                            RecyclerView recyclerView = wxiVar10.d;
                            recyclerView.getContext();
                            recyclerView.setLayoutManager(new GridLayoutManager(2));
                            ArrayList arrayListV0 = a1b0Var.v0();
                            pxa0 pxa0Var = new pxa0();
                            pxa0Var.a = arrayListV0;
                            recyclerView.setAdapter(pxa0Var);
                        }
                        wxi wxiVar27 = a1b0Var.v;
                        if (wxiVar27 != null) {
                            wxiVar27.c0.F();
                        }
                        wxi wxiVar28 = a1b0Var.v;
                        if (wxiVar28 == null || wxiVar28.b0.getVisibility() != 0) {
                            wxi wxiVar29 = a1b0Var.v;
                            if (wxiVar29 != null) {
                                wxiVar29.b0.setVisibility(0);
                            }
                            wxi wxiVar30 = a1b0Var.v;
                            if (wxiVar30 != null) {
                                wxiVar30.e.setVisibility(0);
                            }
                            a1b0Var.L0();
                            Animation animationLoadAnimation = AnimationUtils.loadAnimation(SportyGamesManager.getApplicationContext(), R.anim.sg_spin2win_wheel_down);
                            wxi wxiVar31 = a1b0Var.v;
                            if (wxiVar31 != null) {
                                wxiVar31.c0.startAnimation(animationLoadAnimation);
                            }
                            if (animationLoadAnimation != null) {
                                animationLoadAnimation.setAnimationListener(new b1b0(a1b0Var));
                            }
                        } else {
                            pfd pfdVar = fse.a;
                            ej5.c(w5b.a(gku.a), null, null, new f1b0(a1b0Var, null), 3);
                        }
                    }
                } else {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    a1b0Var.W = hTTPResponse != null ? (Spin2WinPlaceBetResponse) hTTPResponse.getData() : null;
                    HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    if (((hTTPResponse2 == null || (spin2WinPlaceBetResponse = (Spin2WinPlaceBetResponse) hTTPResponse2.getData()) == null || (giftAmount = spin2WinPlaceBetResponse.getGiftAmount()) == null) ? 0.0d : giftAmount.doubleValue()) > 0.0d) {
                        a1b0Var.w0().z1();
                    }
                    v4b0 v4b0VarW2 = a1b0Var.w0();
                    v4b0VarW2.b = null;
                    v4b0VarW2.a = null;
                    wxi wxiVar32 = a1b0Var.v;
                    if (wxiVar32 != null) {
                        wxiVar32.c0.setPlaceBetApiResponse(a1b0Var.W);
                    }
                    GameDetails gameDetails3 = a1b0Var.i;
                    String name2 = gameDetails3 != null ? gameDetails3.getName() : null;
                    Spin2WinPlaceBetResponse spin2WinPlaceBetResponse2 = a1b0Var.W;
                    StringBuilder sb = new StringBuilder();
                    if (spin2WinPlaceBetResponse2 != null && (individualBetResponseList = spin2WinPlaceBetResponse2.getIndividualBetResponseList()) != null) {
                        for (Spin2WinIndividualBetResponse spin2WinIndividualBetResponse : individualBetResponseList) {
                            String betCategory = spin2WinIndividualBetResponse.getBetCategory();
                            String betType = spin2WinIndividualBetResponse.getBetType();
                            if (Intrinsics.g(betCategory, "WHEEL_NUMBERS")) {
                                str3 = "Number";
                            } else if (betType != null) {
                                switch (betType) {
                                    case "LOW_BLACK":
                                        str3 = "LowBlack";
                                        break;
                                    case "HIGH_RED":
                                        str3 = "HighRed";
                                        break;
                                    case "LOW":
                                        str3 = "Low";
                                        break;
                                    case "ODD":
                                        str3 = "Odd";
                                        break;
                                    case "RED":
                                        str3 = "Red";
                                        break;
                                    case "1-12":
                                        str3 = "Range";
                                        break;
                                    case "EVEN":
                                        str3 = "Even";
                                        break;
                                    case "HIGH":
                                        str3 = "High";
                                        break;
                                    case "13-24":
                                    case "25-36":
                                        str3 = "Range";
                                        break;
                                    case "BLACK":
                                        str3 = "Black";
                                        break;
                                    case "GREEN":
                                        str3 = "Green";
                                        break;
                                    case "LOW_RED":
                                        str3 = "LowRed";
                                        break;
                                    case "HIGH_BLACK":
                                        str3 = "HighBlack";
                                        break;
                                    default:
                                        switch (betType) {
                                            case 65:
                                                if (betType.equals("A")) {
                                                    str3 = "Alphabet";
                                                } else {
                                                    str3 = "";
                                                }
                                                break;
                                            case 66:
                                                if (betType.equals("B")) {
                                                    str3 = "Alphabet";
                                                } else {
                                                    str3 = "";
                                                }
                                                break;
                                            case 67:
                                                if (betType.equals("C")) {
                                                    str3 = "Alphabet";
                                                } else {
                                                    str3 = "";
                                                }
                                                break;
                                            case 68:
                                                if (betType.equals("D")) {
                                                    str3 = "Alphabet";
                                                } else {
                                                    str3 = "";
                                                }
                                                break;
                                            case 69:
                                                if (betType.equals("E")) {
                                                    str3 = "Alphabet";
                                                } else {
                                                    str3 = "";
                                                }
                                                break;
                                            case 70:
                                                if (betType.equals("F")) {
                                                    str3 = "Alphabet";
                                                } else {
                                                    str3 = "";
                                                }
                                                break;
                                            default:
                                                str3 = "";
                                                break;
                                        }
                                }
                            } else {
                                str3 = "";
                            }
                            sb.append((Object) str3);
                            sb.append("/");
                        }
                    }
                    if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '/') {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    wz.a("BetPlaced", name2, sb.toString());
                    CasinoLogger casinoLogger = CasinoLogger.INSTANCE;
                    Pair pair = new Pair(JsPluginCommon.GAMES_BET_PLACED_IS_REBET_ARGUMENT, Boolean.valueOf(a1b0Var.b0));
                    GameDetails gameDetails4 = a1b0Var.i;
                    Pair pair2 = new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, gameDetails4 != null ? gameDetails4.getName() : null);
                    Pair pair3 = new Pair("isFBG", Boolean.valueOf(a1b0Var.a0));
                    Pair pair4 = new Pair("isPartialFBG", Boolean.valueOf(a1b0Var.c0));
                    SharedPreferences sharedPreferences = a1b0Var.y;
                    casinoLogger.logEventToCasino("BetPlaced", vj5.a(pair, pair2, pair3, pair4, new Pair("isOneTapBet", sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("spin2win_one_tap", false)) : null), new Pair("Platform", "ANDROID")));
                }
                return Unit.a;
            }
        }));
        u0().b.f(getViewLifecycleOwner(), new p1b0(new uh6(this, 1)));
        ((fq5) q8i0Var.getValue()).c.f(getViewLifecycleOwner(), new p1b0(new vh6(this, 1)));
        w0().i.f(getViewLifecycleOwner(), new p1b0(new u620(this, i2)));
        int i4 = 2;
        w0().v.f(getViewLifecycleOwner(), new p1b0(new v620(this, i4)));
        w0().y.f(getViewLifecycleOwner(), new p1b0(new Function1() { // from class: xya0
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:119:0x0241  */
            /* JADX WARN: Code duplicated, block: B:123:0x024d A[PHI: r23
              0x024d: PHI (r23v4 java.lang.String) = (r23v1 java.lang.String), (r23v3 java.lang.String), (r23v1 java.lang.String) binds: [B:136:0x026f, B:144:0x0280, B:121:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:144:0x0280  */
            /* JADX WARN: Code duplicated, block: B:152:0x02be  */
            /* JADX WARN: Code duplicated, block: B:155:0x02c9  */
            /* JADX WARN: Code duplicated, block: B:158:0x02d8  */
            /* JADX WARN: Code duplicated, block: B:160:0x02f8  */
            /* JADX WARN: Code duplicated, block: B:167:0x0314  */
            /* JADX WARN: Code duplicated, block: B:170:0x031d  */
            /* JADX WARN: Code duplicated, block: B:171:0x0322  */
            /* JADX WARN: Code duplicated, block: B:174:0x0330  */
            /* JADX WARN: Code duplicated, block: B:177:0x0338  */
            /* JADX WARN: Code duplicated, block: B:180:0x0341  */
            /* JADX WARN: Code duplicated, block: B:181:0x0343 A[PHI: r17
              0x0343: PHI (r17v5 java.lang.String) = 
              (r17v4 java.lang.String)
              (r17v6 java.lang.String)
              (r17v7 java.lang.String)
              (r17v8 java.lang.String)
              (r17v9 java.lang.String)
              (r17v10 java.lang.String)
             binds: [B:197:0x036f, B:196:0x036c, B:192:0x0360, B:188:0x0356, B:185:0x034d, B:180:0x0341] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:182:0x0346  */
            /* JADX WARN: Code duplicated, block: B:185:0x034d  */
            /* JADX WARN: Code duplicated, block: B:186:0x0350  */
            /* JADX WARN: Code duplicated, block: B:188:0x0356  */
            /* JADX WARN: Code duplicated, block: B:189:0x0359  */
            /* JADX WARN: Code duplicated, block: B:192:0x0360  */
            /* JADX WARN: Code duplicated, block: B:193:0x0363  */
            /* JADX WARN: Code duplicated, block: B:196:0x036c  */
            /* JADX WARN: Code duplicated, block: B:197:0x036f A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:199:0x0372  */
            /* JADX WARN: Code duplicated, block: B:254:0x046c  */
            /* JADX WARN: Code duplicated, block: B:255:0x0471  */
            /* JADX WARN: Code duplicated, block: B:321:0x02fb A[SYNTHETIC] */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ArrayList arrayList2;
                Double d2;
                a1b0 a1b0Var;
                Integer maxBetCount;
                Double d3;
                ArrayList<Double> betChipList;
                Context context4;
                List<BetTypeAndPayouts> betTypesAndPayouts;
                Double d4;
                String str3;
                double dDoubleValue;
                List<BetAmountList> betAmountList;
                a1b0 a1b0Var2;
                BetConfig betConfig;
                Double d5;
                String betType;
                String str4;
                ArrayList arrayList3;
                Iterator it;
                BetAmountList betAmountList2;
                Object next;
                Double minAmount;
                List<NumberBetDetails> numberBetDetails;
                Double payMultiplier;
                Double d6;
                BetAmountList betAmountList3;
                Double minAmount2;
                List<BetTypeAndPayouts> betTypesAndPayouts2;
                List<BetTypeAndPayouts> betTypesAndPayouts3;
                BetTypeAndPayouts betTypeAndPayouts;
                Integer id;
                List<BetAmountList> betAmountList4;
                Context context5;
                LoadingState loadingState = (LoadingState) obj;
                Double dValueOf = Double.valueOf(0.0d);
                int i5 = a1b0.a.a[loadingState.getStatus().ordinal()];
                a1b0 a1b0Var3 = this.a;
                int i6 = 1;
                if (i5 == 1) {
                    wxi wxiVar10 = a1b0Var3.v;
                    if (wxiVar10 != null) {
                        wxiVar10.M.P();
                    }
                    GameDetails gameDetails3 = a1b0Var3.i;
                    if (gameDetails3 != null && gameDetails3.getName() != null) {
                        v4b0 v4b0VarW1 = a1b0Var3.w0();
                        ej5.c(o8i0.d(v4b0VarW1), null, null, new w4b0(v4b0VarW1, null), 3);
                    }
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    GameDetailsResponse gameDetailsResponse = hTTPResponse != null ? (GameDetailsResponse) hTTPResponse.getData() : null;
                    a1b0Var3.T = gameDetailsResponse;
                    ArrayList arrayList4 = a1b0Var3.J;
                    if (arrayList4 != null) {
                        arrayList4.clear();
                    }
                    if (gameDetailsResponse == null || (betAmountList4 = gameDetailsResponse.getBetAmountList()) == null) {
                        arrayList2 = null;
                    } else {
                        arrayList2 = new ArrayList();
                        for (Object obj2 : betAmountList4) {
                            if (Intrinsics.g(((BetAmountList) obj2).getBetType(), "1-36")) {
                                arrayList2.add(obj2);
                            }
                        }
                    }
                    BetConfig betConfig2 = gameDetailsResponse != null ? gameDetailsResponse.getBetConfig() : null;
                    int iIntValue = (gameDetailsResponse == null || (betTypesAndPayouts3 = gameDetailsResponse.getBetTypesAndPayouts()) == null || (betTypeAndPayouts = (BetTypeAndPayouts) CollectionsKt.firstOrNull(betTypesAndPayouts3)) == null || (id = betTypeAndPayouts.getId()) == null) ? 0 : id.intValue();
                    if (gameDetailsResponse != null && (numberBetDetails = gameDetailsResponse.getNumberBetDetails()) != null && !numberBetDetails.isEmpty()) {
                        int i7 = 1;
                        while (true) {
                            if (i7 >= 7) {
                                break;
                            }
                            int i8 = i6;
                            int i9 = i7;
                            for (int i10 = 7; i8 < i10; i10 = 7) {
                                if (arrayList4 != null) {
                                    Integer number = numberBetDetails.get(i9).getNumber();
                                    String colour = numberBetDetails.get(i9).getColour();
                                    String sector = numberBetDetails.get(i9).getSector();
                                    String dozen = numberBetDetails.get(i9).getDozen();
                                    GameDetailsResponse gameDetailsResponse2 = a1b0Var3.T;
                                    if (gameDetailsResponse2 == null || (betTypesAndPayouts2 = gameDetailsResponse2.getBetTypesAndPayouts()) == null) {
                                        payMultiplier = dValueOf;
                                        break;
                                    }
                                    int size = betTypesAndPayouts2.size();
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= size) {
                                            payMultiplier = dValueOf;
                                            break;
                                        }
                                        if (Intrinsics.g(betTypesAndPayouts2.get(i11).getBetType(), "1-36")) {
                                            payMultiplier = betTypesAndPayouts2.get(i11).getPayMultiplier();
                                            break;
                                        }
                                        i11++;
                                    }
                                    double dDoubleValue2 = (betConfig2 == null || (minAmount2 = betConfig2.getMinAmount()) == null) ? 0.1d : minAmount2.doubleValue();
                                    if (arrayList2 == null || (betAmountList3 = (BetAmountList) arrayList2.get(0)) == null || (defaultAmount = betAmountList3.getMaxAmount()) == null) {
                                        BetConfig betConfig3 = gameDetailsResponse.getBetConfig();
                                        if (betConfig3 != null) {
                                            Double defaultAmount = betConfig3.getDefaultAmount();
                                            d6 = defaultAmount;
                                        } else {
                                            d6 = null;
                                        }
                                    } else {
                                        d6 = defaultAmount;
                                    }
                                    arrayList4.add(new LocalGameDetailsEntity(null, "NUMBER", colour, null, null, number, Double.valueOf(dDoubleValue2), d6, null, Integer.valueOf(iIntValue), payMultiplier, null, String.valueOf(numberBetDetails.get(i9).getNumber()), dozen, sector, null, null, 100633, null));
                                }
                                i9 += 6;
                                i8++;
                            }
                            i7++;
                            i6 = 1;
                        }
                    }
                    if (arrayList4 == null || arrayList4.isEmpty() || arrayList4.size() != 36) {
                        d2 = dValueOf;
                        a1b0Var = a1b0Var3;
                        Context context6 = a1b0Var.getContext();
                        if (context6 != null) {
                            a1b0Var.Q0(context6, null);
                        }
                    } else {
                        if (gameDetailsResponse != null && (betTypesAndPayouts = gameDetailsResponse.getBetTypesAndPayouts()) != null && !betTypesAndPayouts.isEmpty()) {
                            int size2 = betTypesAndPayouts.size();
                            int i12 = 0;
                            while (i12 < size2) {
                                String betCategory = betTypesAndPayouts.get(i12).getBetCategory();
                                String betType2 = betTypesAndPayouts.get(i12).getBetType();
                                String str5 = "";
                                GameDetailsResponse gameDetailsResponse3 = gameDetailsResponse;
                                BetConfig betConfig4 = betConfig2;
                                int i13 = size2;
                                if (betCategory != null) {
                                    int iHashCode = betCategory.hashCode();
                                    String str6 = oAudzpbdOhCI.ufBrwRwgoR;
                                    d4 = dValueOf;
                                    switch (iHashCode) {
                                        case -1852945562:
                                            if (betCategory.equals("SECTOR")) {
                                                str6 = DZsoPoBl.FsXkuedhDfPwydF;
                                                str3 = str6;
                                                break;
                                            }
                                            break;
                                        case -901346537:
                                            if (betCategory.equals("HIGH_LOW")) {
                                                str6 = DZsoPoBl.FsXkuedhDfPwydF;
                                                str3 = str6;
                                                break;
                                            }
                                            break;
                                        case -338441228:
                                            if (betCategory.equals("HIGH_LOW_COLOUR")) {
                                                if (Intrinsics.g(betType2, "LOW_RED") || Intrinsics.g(betType2, "HIGH_RED")) {
                                                    str3 = "RED";
                                                } else {
                                                    str3 = str6;
                                                }
                                                break;
                                            }
                                            break;
                                        case 65241624:
                                            if (betCategory.equals("DOZEN")) {
                                                str6 = DZsoPoBl.FsXkuedhDfPwydF;
                                                str3 = str6;
                                                break;
                                            }
                                            break;
                                        case 1061088362:
                                            if (betCategory.equals("EVEN_ODD")) {
                                                str6 = DZsoPoBl.FsXkuedhDfPwydF;
                                                str3 = str6;
                                                break;
                                            }
                                            break;
                                        case 1993454028:
                                            if (betCategory.equals("COLOUR")) {
                                                if (Intrinsics.g(betType2, "RED")) {
                                                    str3 = "RED";
                                                } else if (Intrinsics.g(betType2, "GREEN")) {
                                                    str3 = "GREEN";
                                                } else {
                                                    str3 = str6;
                                                }
                                            }
                                            break;
                                    }
                                    Integer id2 = betTypesAndPayouts.get(i12).getId();
                                    String betCategory2 = betTypesAndPayouts.get(i12).getBetCategory();
                                    String betType3 = betTypesAndPayouts.get(i12).getBetType();
                                    Double payMultiplier2 = betTypesAndPayouts.get(i12).getPayMultiplier();
                                    if (betConfig4 != null || (minAmount = betConfig4.getMinAmount()) == null) {
                                        dDoubleValue = 0.1d;
                                    } else {
                                        dDoubleValue = minAmount.doubleValue();
                                    }
                                    betAmountList = gameDetailsResponse3.getBetAmountList();
                                    if (betAmountList != null) {
                                        arrayList3 = new ArrayList();
                                        it = betAmountList.iterator();
                                        while (it.hasNext()) {
                                            next = it.next();
                                            Iterator it2 = it;
                                            a1b0 a1b0Var4 = a1b0Var3;
                                            if (Intrinsics.g(((BetAmountList) next).getBetType(), betTypesAndPayouts.get(i12).getBetType())) {
                                                arrayList3.add(next);
                                            }
                                            it = it2;
                                            a1b0Var3 = a1b0Var4;
                                        }
                                        a1b0Var2 = a1b0Var3;
                                        betAmountList2 = (BetAmountList) arrayList3.get(0);
                                        if (betAmountList2 == null && (defaultAmount = betAmountList2.getMaxAmount()) != null) {
                                            d5 = defaultAmount;
                                        }
                                        betType = betTypesAndPayouts.get(i12).getBetType();
                                        if (betType != null) {
                                            switch (betType) {
                                                case "LOW_BLACK":
                                                    str5 = "Low\nBlack";
                                                case "HIGH_RED":
                                                    str5 = "High\nRed";
                                                case "GREEN":
                                                    str5 = "0, Green";
                                                case "LOW_RED":
                                                    str5 = "Low\nRed";
                                                case "HIGH_BLACK":
                                                    str5 = "High\nBlack";
                                                default:
                                                    if (betType == null) {
                                                        str4 = betType;
                                                        break;
                                                    }
                                            }
                                        } else if (betType == null) {
                                            str4 = betType;
                                        }
                                        arrayList4.add(new LocalGameDetailsEntity(null, betCategory2, str3, null, null, null, Double.valueOf(dDoubleValue), d5, null, id2, payMultiplier2, null, str4, null, null, betType3, null, 92473, null));
                                        i12++;
                                        gameDetailsResponse = gameDetailsResponse3;
                                        betConfig2 = betConfig4;
                                        size2 = i13;
                                        dValueOf = d4;
                                        a1b0Var3 = a1b0Var2;
                                    } else {
                                        a1b0Var2 = a1b0Var3;
                                    }
                                    betConfig = gameDetailsResponse3.getBetConfig();
                                    if (betConfig != null) {
                                        Double defaultAmount2 = betConfig.getDefaultAmount();
                                        d5 = defaultAmount2;
                                    } else {
                                        d5 = null;
                                    }
                                    betType = betTypesAndPayouts.get(i12).getBetType();
                                    if (betType != null) {
                                        switch (betType) {
                                            case -1293030636:
                                                if (betType.equals("LOW_BLACK")) {
                                                    str5 = "Low\nBlack";
                                                } else if (betType == null) {
                                                    str4 = betType;
                                                    break;
                                                }
                                                break;
                                            case -901341100:
                                                if (betType.equals("HIGH_RED")) {
                                                    str5 = "High\nRed";
                                                } else if (betType == null) {
                                                    str4 = betType;
                                                    break;
                                                }
                                                break;
                                            case 68081379:
                                                if (!betType.equals("GREEN")) {
                                                    str5 = "0, Green";
                                                } else if (betType == null) {
                                                    str4 = betType;
                                                    break;
                                                }
                                                break;
                                            case 1075763430:
                                                if (betType.equals("LOW_RED")) {
                                                    str5 = "Low\nRed";
                                                } else if (betType == null) {
                                                    str4 = betType;
                                                    break;
                                                }
                                                break;
                                            case 1380028162:
                                                if (betType.equals("HIGH_BLACK")) {
                                                    str5 = "High\nBlack";
                                                } else if (betType == null) {
                                                    str4 = betType;
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (betType == null) {
                                                    str4 = betType;
                                                }
                                                break;
                                        }
                                    } else if (betType == null) {
                                        str4 = betType;
                                    }
                                    arrayList4.add(new LocalGameDetailsEntity(null, betCategory2, str3, null, null, null, Double.valueOf(dDoubleValue), d5, null, id2, payMultiplier2, null, str4, null, null, betType3, null, 92473, null));
                                    i12++;
                                    gameDetailsResponse = gameDetailsResponse3;
                                    betConfig2 = betConfig4;
                                    size2 = i13;
                                    dValueOf = d4;
                                    a1b0Var3 = a1b0Var2;
                                } else {
                                    d4 = dValueOf;
                                }
                                str3 = "";
                                Integer id3 = betTypesAndPayouts.get(i12).getId();
                                String betCategory3 = betTypesAndPayouts.get(i12).getBetCategory();
                                String betType4 = betTypesAndPayouts.get(i12).getBetType();
                                Double payMultiplier3 = betTypesAndPayouts.get(i12).getPayMultiplier();
                                if (betConfig4 != null) {
                                    dDoubleValue = 0.1d;
                                } else {
                                    dDoubleValue = 0.1d;
                                }
                                betAmountList = gameDetailsResponse3.getBetAmountList();
                                if (betAmountList != null) {
                                    arrayList3 = new ArrayList();
                                    it = betAmountList.iterator();
                                    while (it.hasNext()) {
                                        next = it.next();
                                        Iterator it3 = it;
                                        a1b0 a1b0Var5 = a1b0Var3;
                                        if (Intrinsics.g(((BetAmountList) next).getBetType(), betTypesAndPayouts.get(i12).getBetType())) {
                                            arrayList3.add(next);
                                        }
                                        it = it3;
                                        a1b0Var3 = a1b0Var5;
                                    }
                                    a1b0Var2 = a1b0Var3;
                                    betAmountList2 = (BetAmountList) arrayList3.get(0);
                                    if (betAmountList2 == null) {
                                    }
                                    betType = betTypesAndPayouts.get(i12).getBetType();
                                    if (betType != null) {
                                        switch (betType) {
                                            case -1293030636:
                                                if (betType.equals("LOW_BLACK")) {
                                                    str5 = "Low\nBlack";
                                                } else if (betType == null) {
                                                    str4 = betType;
                                                    break;
                                                }
                                                break;
                                            case -901341100:
                                                if (betType.equals("HIGH_RED")) {
                                                    str5 = "High\nRed";
                                                } else if (betType == null) {
                                                    str4 = betType;
                                                    break;
                                                }
                                                break;
                                            case 68081379:
                                                if (!betType.equals("GREEN")) {
                                                    str5 = "0, Green";
                                                } else if (betType == null) {
                                                    str4 = betType;
                                                    break;
                                                }
                                                break;
                                            case 1075763430:
                                                if (betType.equals("LOW_RED")) {
                                                    str5 = "Low\nRed";
                                                } else if (betType == null) {
                                                    str4 = betType;
                                                    break;
                                                }
                                                break;
                                            case 1380028162:
                                                if (betType.equals("HIGH_BLACK")) {
                                                    str5 = "High\nBlack";
                                                } else if (betType == null) {
                                                    str4 = betType;
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (betType == null) {
                                                    str4 = betType;
                                                }
                                                break;
                                        }
                                    } else if (betType == null) {
                                        str4 = betType;
                                    }
                                    arrayList4.add(new LocalGameDetailsEntity(null, betCategory3, str3, null, null, null, Double.valueOf(dDoubleValue), d5, null, id3, payMultiplier3, null, str4, null, null, betType4, null, 92473, null));
                                    i12++;
                                    gameDetailsResponse = gameDetailsResponse3;
                                    betConfig2 = betConfig4;
                                    size2 = i13;
                                    dValueOf = d4;
                                    a1b0Var3 = a1b0Var2;
                                } else {
                                    a1b0Var2 = a1b0Var3;
                                }
                                betConfig = gameDetailsResponse3.getBetConfig();
                                if (betConfig != null) {
                                    Double defaultAmount3 = betConfig.getDefaultAmount();
                                    d5 = defaultAmount3;
                                } else {
                                    d5 = null;
                                }
                                betType = betTypesAndPayouts.get(i12).getBetType();
                                if (betType != null) {
                                    switch (betType) {
                                        case -1293030636:
                                            if (betType.equals("LOW_BLACK")) {
                                                str5 = "Low\nBlack";
                                            } else if (betType == null) {
                                                str4 = betType;
                                                break;
                                            }
                                            break;
                                        case -901341100:
                                            if (betType.equals("HIGH_RED")) {
                                                str5 = "High\nRed";
                                            } else if (betType == null) {
                                                str4 = betType;
                                                break;
                                            }
                                            break;
                                        case 68081379:
                                            if (!betType.equals("GREEN")) {
                                                str5 = "0, Green";
                                            } else if (betType == null) {
                                                str4 = betType;
                                                break;
                                            }
                                            break;
                                        case 1075763430:
                                            if (betType.equals("LOW_RED")) {
                                                str5 = "Low\nRed";
                                            } else if (betType == null) {
                                                str4 = betType;
                                                break;
                                            }
                                            break;
                                        case 1380028162:
                                            if (betType.equals("HIGH_BLACK")) {
                                                str5 = "High\nBlack";
                                            } else if (betType == null) {
                                                str4 = betType;
                                                break;
                                            }
                                            break;
                                        default:
                                            if (betType == null) {
                                                str4 = betType;
                                            }
                                            break;
                                    }
                                } else if (betType == null) {
                                    str4 = betType;
                                }
                                arrayList4.add(new LocalGameDetailsEntity(null, betCategory3, str3, null, null, null, Double.valueOf(dDoubleValue), d5, null, id3, payMultiplier3, null, str4, null, null, betType4, null, 92473, null));
                                i12++;
                                gameDetailsResponse = gameDetailsResponse3;
                                betConfig2 = betConfig4;
                                size2 = i13;
                                dValueOf = d4;
                                a1b0Var3 = a1b0Var2;
                            }
                        }
                        d2 = dValueOf;
                        a1b0 a1b0Var6 = a1b0Var3;
                        int i14 = 0;
                        if (arrayList4.isEmpty()) {
                            a1b0Var = a1b0Var6;
                            context4 = a1b0Var.getContext();
                            if (context4 != null) {
                                a1b0Var.Q0(context4, null);
                            }
                        } else {
                            int size3 = arrayList4.size();
                            int i15 = 0;
                            int i16 = 0;
                            int i17 = 0;
                            int i18 = 0;
                            int i19 = 0;
                            int i20 = 0;
                            int i21 = 0;
                            while (true) {
                                if (i14 < size3) {
                                    Object obj3 = arrayList4.get(i14);
                                    int i22 = i14 + 1;
                                    LocalGameDetailsEntity localGameDetailsEntity = (LocalGameDetailsEntity) obj3;
                                    if (localGameDetailsEntity.getCategory() != null) {
                                        int i23 = size3;
                                        if (Intrinsics.g(localGameDetailsEntity.getCategory(), "SECTOR")) {
                                            i16++;
                                        }
                                        if (Intrinsics.g(localGameDetailsEntity.getCategory(), "DOZEN")) {
                                            i15++;
                                        }
                                        if (Intrinsics.g(localGameDetailsEntity.getCategory(), "COLOUR")) {
                                            i17++;
                                        }
                                        if (Intrinsics.g(localGameDetailsEntity.getCategory(), "WHEEL_NUMBERS")) {
                                            i18++;
                                        }
                                        if (Intrinsics.g(localGameDetailsEntity.getCategory(), "EVEN_ODD")) {
                                            i19++;
                                        }
                                        if (Intrinsics.g(localGameDetailsEntity.getCategory(), "HIGH_LOW")) {
                                            i20++;
                                        }
                                        if (Intrinsics.g(localGameDetailsEntity.getCategory(), "HIGH_LOW_COLOUR")) {
                                            i21++;
                                        }
                                        size3 = i23;
                                        i14 = i22;
                                    }
                                } else if (i16 == 6 && i15 == 3 && i17 == 3 && i18 == 1 && i19 == 2 && i20 == 2 && i21 == 4 && arrayList4.size() == 57) {
                                    a1b0Var = a1b0Var6;
                                    a1b0.U0(a1b0Var, arrayList4);
                                    wxi wxiVar11 = a1b0Var.v;
                                    if (wxiVar11 != null) {
                                        wxiVar11.i.J();
                                    }
                                    wxi wxiVar12 = a1b0Var.v;
                                    if (wxiVar12 != null) {
                                        wxiVar12.J.M();
                                    }
                                }
                                a1b0Var = a1b0Var6;
                                context4 = a1b0Var.getContext();
                                if (context4 != null) {
                                    a1b0Var.Q0(context4, null);
                                }
                            }
                        }
                    }
                    GameDetailsResponse gameDetailsResponse4 = a1b0Var.T;
                    if (((gameDetailsResponse4 == null || (betChipList = gameDetailsResponse4.getBetChipList()) == null) ? 0 : betChipList.size()) > 0) {
                        wxi wxiVar13 = a1b0Var.v;
                        if (wxiVar13 != null) {
                            d3 = d2;
                            wxiVar13.c.setMinMaxChip(d3, d3);
                        } else {
                            d3 = d2;
                        }
                        wxi wxiVar14 = a1b0Var.v;
                        if (wxiVar14 != null) {
                            wxiVar14.c.setBetAmount(d3, d3);
                        }
                    }
                    a1b0Var.r0();
                    op5 op5Var = op5.a;
                    wxi wxiVar15 = a1b0Var.v;
                    op5.r(op5Var, b.f(wxiVar15 != null ? wxiVar15.U : null, wxiVar15 != null ? wxiVar15.X : null, wxiVar15 != null ? wxiVar15.Z : null, wxiVar15 != null ? wxiVar15.S : null, wxiVar15 != null ? wxiVar15.W : null, wxiVar15 != null ? wxiVar15.V : null, wxiVar15 != null ? wxiVar15.Y : null), null, 6);
                    a1b0Var.D0();
                    v4b0 v4b0VarW2 = a1b0Var.w0();
                    GameDetailsResponse gameDetailsResponse5 = a1b0Var.T;
                    v4b0VarW2.c = Integer.valueOf((gameDetailsResponse5 == null || (maxBetCount = gameDetailsResponse5.getMaxBetCount()) == null) ? 0 : maxBetCount.intValue());
                    v4b0 v4b0VarW3 = a1b0Var.w0();
                    ej5.c(o8i0.d(v4b0VarW3), null, null, new a5b0(v4b0VarW3, null), 3);
                } else if (i5 != 2) {
                    if (i5 != 3) {
                        uhc.a();
                        return null;
                    }
                    a1b0Var3.s0();
                } else if (a1b0Var3.getActivity() != null && (context5 = a1b0Var3.getContext()) != null) {
                    wxi wxiVar16 = a1b0Var3.v;
                    if (wxiVar16 != null) {
                        wxiVar16.M.O(100);
                    }
                    a1b0Var3.s0();
                    a1b0Var3.Q0(context5, loadingState.getError());
                }
                return Unit.a;
            }
        }));
        w0().C.f(getViewLifecycleOwner(), new p1b0(new Function1() { // from class: yya0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String currency;
                Context context4;
                LoadingState loadingState = (LoadingState) obj;
                int i5 = a1b0.a.a[loadingState.getStatus().ordinal()];
                final a1b0 a1b0Var = this.a;
                if (i5 == 1) {
                    wxi wxiVar10 = a1b0Var.v;
                    if (wxiVar10 != null) {
                        wxiVar10.M.P();
                    }
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    a1b0Var.S = hTTPResponse != null ? (GameInfoResponse) hTTPResponse.getData() : null;
                    if (a1b0Var.H) {
                        int i6 = 0;
                        a1b0Var.H = false;
                        SharedPreferences sharedPreferences = a1b0Var.y;
                        if (Intrinsics.g(sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("spin2win_one_tap", false)) : null, Boolean.TRUE)) {
                            WalletInfoResponse walletInfoResponse = a1b0Var.P;
                            if (walletInfoResponse != null && (currency = walletInfoResponse.getCurrency()) != null && currency.length() > 0) {
                                a1b0Var.J0();
                            }
                        } else {
                            Context context5 = a1b0Var.getContext();
                            if (context5 != null) {
                                ArrayList arrayList2 = a1b0Var.J;
                                double d2 = 0.0d;
                                if (arrayList2 != null) {
                                    int size = arrayList2.size();
                                    double dDoubleValue = 0.0d;
                                    while (i6 < size) {
                                        Object obj2 = arrayList2.get(i6);
                                        i6++;
                                        Double betAmount = ((LocalGameDetailsEntity) obj2).getBetAmount();
                                        dDoubleValue += betAmount != null ? betAmount.doubleValue() : 0.0d;
                                    }
                                    d2 = dDoubleValue;
                                }
                                String string = a1b0Var.getString(R.string.key_place_bet_confirm);
                                string.getClass();
                                HashMap map = new HashMap();
                                String string2 = a1b0Var.getString(R.string.currency_cms);
                                op5 op5Var = op5.a;
                                WalletInfoResponse walletInfoResponse2 = a1b0Var.P;
                                String currency2 = walletInfoResponse2 != null ? walletInfoResponse2.getCurrency() : null;
                                if (currency2 == null) {
                                    currency2 = "";
                                }
                                op5Var.getClass();
                                map.put(string2, op5.i(currency2));
                                map.put(a1b0Var.getString(R.string.amount_cms), krh0.l(d2));
                                WalletInfoResponse walletInfoResponse3 = a1b0Var.P;
                                String currency3 = walletInfoResponse3 != null ? walletInfoResponse3.getCurrency() : null;
                                String strI = op5.i(currency3 != null ? currency3 : "");
                                TreeMap treeMap = pw.a;
                                String string3 = context5.getString(R.string.sg_spin2win_place_bet_text, tug.a(strI, " ", pw.a(krh0.l(d2))));
                                string3.getClass();
                                a1b0Var.z0();
                                String strB = op5.b(string, string3, map);
                                String string4 = a1b0Var.getString(R.string.confirm_btn_cms);
                                string4.getClass();
                                String string5 = a1b0Var.getString(R.string.confirm_bet);
                                string5.getClass();
                                String strB2 = op5.b(string4, string5, null);
                                String string6 = a1b0Var.getString(R.string.cancel_btn_cms);
                                string6.getClass();
                                String string7 = a1b0Var.getString(R.string.cancel_bet);
                                string7.getClass();
                                a1b0Var.B = a.C0437a.a("Spin2Win", "place bet", strB, "", strB2, op5.b(string6, string7, null), new Function1() { // from class: v0b0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        WalletInfoResponse walletInfoResponse4;
                                        String currency4;
                                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                        a1b0 a1b0Var2 = a1b0Var;
                                        if (zBooleanValue && (walletInfoResponse4 = a1b0Var2.P) != null && (currency4 = walletInfoResponse4.getCurrency()) != null && currency4.length() > 0) {
                                            a1b0Var2.J0();
                                        }
                                        a1b0Var2.getParentFragmentManager().a0();
                                        a1b0Var2.B = null;
                                        return Unit.a;
                                    }
                                }, new g8f(1), context5.getColor(R.color.redblack_confirm_dialog_left_button), context5.getColor(R.color.redblack_confirm_dialog_right_button), 8192);
                                e activity4 = a1b0Var.getActivity();
                                FragmentManager supportFragmentManager = activity4 != null ? activity4.getSupportFragmentManager() : null;
                                a aVar = a1b0Var.B;
                                if (aVar != null && supportFragmentManager != null) {
                                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                                    aVar2.f(R.id.flContent, aVar, null);
                                    aVar2.c("CONFIRM_DIALOG_FRAGMENT");
                                    aVar2.d();
                                }
                            }
                        }
                    }
                    a1b0Var.I = true;
                    wxi wxiVar11 = a1b0Var.v;
                    if (wxiVar11 != null) {
                        wxiVar11.G.setVisibility(8);
                    }
                } else if (i5 != 2) {
                    if (i5 != 3) {
                        uhc.a();
                        return null;
                    }
                    if (!a1b0Var.H) {
                        a1b0Var.s0();
                    }
                } else if (a1b0Var.getActivity() != null && (context4 = a1b0Var.getContext()) != null) {
                    wxi wxiVar12 = a1b0Var.v;
                    if (wxiVar12 != null) {
                        wxiVar12.M.O(100);
                    }
                    a1b0Var.s0();
                    a1b0Var.Q0(context4, loadingState.getError());
                }
                return Unit.a;
            }
        }));
        w0().w.f(getViewLifecycleOwner(), new p1b0(new ikt(this, i4)));
        w0().D.f(getViewLifecycleOwner(), new p1b0(new z71(this, i2)));
        w0().G.f(getViewLifecycleOwner(), new p1b0(new nb20(this, i2)));
        w0().E.f(getViewLifecycleOwner(), new p1b0(new xqj(this, i2)));
        w0().F.f(getViewLifecycleOwner(), new p1b0(new Function1() { // from class: uya0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PromotionGiftsResponse promotionGiftsResponse;
                LoadingState loadingState = (LoadingState) obj;
                int i5 = a1b0.a.a[loadingState.getStatus().ordinal()];
                a1b0 a1b0Var = this.a;
                if (i5 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (promotionGiftsResponse = (PromotionGiftsResponse) hTTPResponse.getData()) != null) {
                        a1b0Var.w0().F.l(a1b0Var.getViewLifecycleOwner());
                        wxi wxiVar10 = a1b0Var.v;
                        if (wxiVar10 != null) {
                            wxiVar10.M.P();
                        }
                        List<GiftItem> entityList = promotionGiftsResponse.getEntityList();
                        entityList.getClass();
                        ArrayList arrayList2 = (ArrayList) entityList;
                        p48.A(arrayList2, new s0b0());
                        PromotionGiftsResponse promotionGiftsResponseCopy$default = PromotionGiftsResponse.copy$default(promotionGiftsResponse, arrayList2, 0, 0, 0, 14, null);
                        a1b0Var.V = promotionGiftsResponseCopy$default;
                        List<GiftItem> entityList2 = promotionGiftsResponseCopy$default != null ? promotionGiftsResponseCopy$default.getEntityList() : null;
                        if (entityList2 == null || entityList2.isEmpty()) {
                            wxi wxiVar11 = a1b0Var.v;
                            if (wxiVar11 != null) {
                                BetChipContainerSpin2Win betChipContainerSpin2Win = wxiVar11.c;
                                GameDetailsResponse gameDetailsResponse = a1b0Var.T;
                                betChipContainerSpin2Win.setChipList(gameDetailsResponse != null ? gameDetailsResponse.getBetChipList() : null);
                            }
                            wxi wxiVar12 = a1b0Var.v;
                            if (wxiVar12 != null) {
                                wxiVar12.c.setIfFbgAvailable(false);
                            }
                        } else {
                            wxi wxiVar13 = a1b0Var.v;
                            if (wxiVar13 != null) {
                                wxiVar13.c.setIfFbgAvailable(true);
                            }
                            wxi wxiVar14 = a1b0Var.v;
                            if (wxiVar14 != null) {
                                BetChipContainerSpin2Win betChipContainerSpin2Win2 = wxiVar14.c;
                                GameDetailsResponse gameDetailsResponse2 = a1b0Var.T;
                                ArrayList<Double> betChipList = gameDetailsResponse2 != null ? gameDetailsResponse2.getBetChipList() : null;
                                ArrayList<Double> arrayList3 = new ArrayList<>();
                                arrayList3.add(Double.valueOf(-1.0d));
                                if (betChipList != null) {
                                    arrayList3.addAll(betChipList);
                                }
                                betChipContainerSpin2Win2.setChipList(arrayList3);
                            }
                            wxi wxiVar15 = a1b0Var.v;
                            if (wxiVar15 != null) {
                                wxiVar15.c.E(false);
                            }
                        }
                    }
                } else if (i5 == 2) {
                    wxi wxiVar16 = a1b0Var.v;
                    if (wxiVar16 != null) {
                        wxiVar16.M.P();
                    }
                    wxi wxiVar17 = a1b0Var.v;
                    if (wxiVar17 != null) {
                        BetChipContainerSpin2Win betChipContainerSpin2Win3 = wxiVar17.c;
                        GameDetailsResponse gameDetailsResponse3 = a1b0Var.T;
                        betChipContainerSpin2Win3.setChipList(gameDetailsResponse3 != null ? gameDetailsResponse3.getBetChipList() : null);
                    }
                    wxi wxiVar18 = a1b0Var.v;
                    if (wxiVar18 != null) {
                        wxiVar18.c.setIfFbgAvailable(false);
                    }
                } else if (i5 != 3) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
            }
        }));
        w0().J.f(getViewLifecycleOwner(), new p1b0(new Function1() { // from class: vya0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    a1b0 a1b0Var = this.a;
                    a1b0Var.N = false;
                    wxi wxiVar10 = a1b0Var.v;
                    if (wxiVar10 != null) {
                        wxiVar10.c0.setWheelSpinning(false);
                    }
                    jvd0 jvd0Var = a1b0Var.M;
                    if (jvd0Var != null) {
                        jvd0Var.cancel((CancellationException) null);
                    }
                    pfd pfdVar = fse.a;
                    ej5.c(w5b.a(gku.a), null, null, new e1b0(a1b0Var, null), 3);
                }
                return Unit.a;
            }
        }));
        wxi wxiVar10 = this.v;
        if (wxiVar10 != null) {
            wxiVar10.c.setFbgClickListener(new ci60(this, i2));
        }
        wxi wxiVar11 = this.v;
        if (wxiVar11 != null) {
            gr60.a(wxiVar11.I, new Function1() { // from class: iza0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((View) obj).getClass();
                    a1b0 a1b0Var = this.a;
                    a1b0Var.b0 = false;
                    if (a1b0Var.a0) {
                        a1b0Var.K0();
                        wxi wxiVar12 = a1b0Var.v;
                        if (wxiVar12 != null) {
                            wxiVar12.c.setEnabled(true);
                        }
                        wxi wxiVar13 = a1b0Var.v;
                        if (wxiVar13 != null) {
                            wxiVar13.c.setAlpha(1.0f);
                        }
                        wxi wxiVar14 = a1b0Var.v;
                        if (wxiVar14 != null) {
                            CardView cardView = wxiVar14.c.I;
                            cardView.setEnabled(true);
                            cardView.setAlpha(1.0f);
                        }
                    }
                    ypa0 ypa0VarZ0 = a1b0Var.z0();
                    Context context4 = a1b0Var.getContext();
                    String string = context4 != null ? context4.getString(R.string.click_primary) : null;
                    if (string == null) {
                        string = "";
                    }
                    ypa0VarZ0.A1(0L, string);
                    wxi wxiVar15 = a1b0Var.v;
                    if (wxiVar15 != null) {
                        wxiVar15.H.setVisibility(8);
                    }
                    a1b0Var.q0();
                    a1b0Var.C0();
                    wxi wxiVar16 = a1b0Var.v;
                    if (wxiVar16 != null) {
                        wxiVar16.f.setVisibility(0);
                    }
                    wxi wxiVar17 = a1b0Var.v;
                    if (wxiVar17 != null) {
                        wxiVar17.J.setVisibility(0);
                    }
                    wxi wxiVar18 = a1b0Var.v;
                    if (wxiVar18 != null) {
                        wxiVar18.i.setVisibility(0);
                    }
                    wxi wxiVar19 = a1b0Var.v;
                    if (wxiVar19 != null) {
                        wxiVar19.c.setVisibility(0);
                    }
                    wxi wxiVar20 = a1b0Var.v;
                    if (wxiVar20 != null) {
                        wxiVar20.b.setVisibility(0);
                    }
                    a1b0Var.r0();
                    a1b0Var.L0();
                    v4b0 v4b0VarW1 = a1b0Var.w0();
                    v4b0VarW1.f.clear();
                    wwd0 wwd0Var = v4b0VarW1.e;
                    z3b0 z3b0Var = new z3b0(0);
                    wwd0Var.getClass();
                    wwd0Var.k(null, z3b0Var);
                    wxi wxiVar21 = a1b0Var.v;
                    if (wxiVar21 != null) {
                        wxiVar21.i.J();
                    }
                    wxi wxiVar22 = a1b0Var.v;
                    if (wxiVar22 != null) {
                        wxiVar22.J.M();
                    }
                    a1b0Var.w0().y1();
                    wxi wxiVar23 = a1b0Var.v;
                    if (wxiVar23 != null) {
                        wxiVar23.z.a(false);
                    }
                    GameDetails gameDetails3 = a1b0Var.i;
                    wz.a("NewBetClicked", gameDetails3 != null ? gameDetails3.getName() : null, new String[0]);
                    return Unit.a;
                }
            });
        }
        wxi wxiVar12 = this.v;
        if (wxiVar12 != null) {
            gr60.a(wxiVar12.N, new zi6(this, i2));
        }
        wxi wxiVar13 = this.v;
        if (wxiVar13 != null) {
            gr60.a(wxiVar13.O, new bsj(this, i2));
        }
        wxi wxiVar14 = this.v;
        if (wxiVar14 != null) {
            wxiVar14.a0.setOnClickListener(new bj6(this, i2));
        }
        wxi wxiVar15 = this.v;
        if (wxiVar15 != null) {
            wxiVar15.z.setBackListener(new s3f(this, 1));
        }
        wxi wxiVar16 = this.v;
        if (wxiVar16 != null) {
            wxiVar16.z.setNavigationListener(new t3f(this, 1));
        }
        wxi wxiVar17 = this.v;
        if (wxiVar17 != null && (binding = wxiVar17.z.getBinding()) != null) {
            gr60.a(binding.f, new d4y(this, i2));
        }
        wxi wxiVar18 = this.v;
        if (wxiVar18 != null) {
            wxiVar18.c.setBetAmountAddListener(new Function1() { // from class: kza0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    double dDoubleValue = ((Double) obj).doubleValue();
                    a1b0 a1b0Var = this.a;
                    if (a1b0Var.a0) {
                        return Unit.a;
                    }
                    a1b0Var.w0().x1(a1b0Var.L, true);
                    a1b0Var.j0(dDoubleValue, AnalyticsParam.DATA_NORMAL);
                    Context context4 = a1b0Var.getContext();
                    if (context4 != null) {
                        ypa0 ypa0VarZ0 = a1b0Var.z0();
                        String string = context4.getString(R.string.click_chip);
                        string.getClass();
                        ypa0VarZ0.A1(0L, string);
                    }
                    GameDetails gameDetails3 = a1b0Var.i;
                    wz.a("ChipSelected", gameDetails3 != null ? gameDetails3.getName() : null, String.valueOf(dDoubleValue));
                    return Unit.a;
                }
            });
        }
        wxi wxiVar19 = this.v;
        if (wxiVar19 != null) {
            wxiVar19.c0.setAnimationEndListener(new x3f(this, i2));
        }
        wxi wxiVar20 = this.v;
        if (wxiVar20 != null) {
            wxiVar20.c0.setWheelAnimationListener(new Function1() { // from class: aza0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str3 = (String) obj;
                    str3.getClass();
                    boolean zEquals = str3.equals("START");
                    a1b0 a1b0Var = this.a;
                    if (zEquals) {
                        if (!a1b0Var.N) {
                            a1b0Var.N = true;
                            ypa0 ypa0VarZ0 = a1b0Var.z0();
                            ej5.c(o8i0.d(ypa0VarZ0), null, null, new xpa0(ypa0VarZ0, null), 3);
                            ypa0 ypa0VarZ1 = a1b0Var.z0();
                            Context context4 = a1b0Var.getContext();
                            String string = context4 != null ? context4.getString(R.string.sg_spin2win_sound_wheel_spin_start) : null;
                            ypa0VarZ1.A1(0L, string != null ? string : "");
                            a1b0Var.N = true;
                            a1b0Var.M = ej5.c(ebs.a(a1b0Var.getLifecycle()), null, null, new o1b0(900L, a1b0Var, null), 3);
                        }
                    } else if (str3.equals("MIDDLE")) {
                        a1b0Var.N = false;
                        jvd0 jvd0Var = a1b0Var.M;
                        if (jvd0Var != null) {
                            jvd0Var.cancel((CancellationException) null);
                        }
                    } else {
                        a1b0Var.N = false;
                        jvd0 jvd0Var2 = a1b0Var.M;
                        if (jvd0Var2 != null) {
                            jvd0Var2.cancel((CancellationException) null);
                        }
                        ypa0 ypa0VarZ2 = a1b0Var.z0();
                        Context context5 = a1b0Var.getContext();
                        String string2 = context5 != null ? context5.getString(R.string.sg_spin2win_sound_wheel_spin_end) : null;
                        ypa0VarZ2.A1(0L, string2 != null ? string2 : "");
                    }
                    return Unit.a;
                }
            });
        }
        wxi wxiVar21 = this.v;
        if (wxiVar21 != null) {
            final Spin2WinNumberBoard spin2WinNumberBoard = wxiVar21.J;
            final ?? r10 = new Function2() { // from class: bza0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    LocalGameDetailsEntity localGameDetailsEntity = (LocalGameDetailsEntity) obj;
                    ((View) obj2).getClass();
                    a1b0 a1b0Var = this.a;
                    wxi wxiVar22 = a1b0Var.v;
                    if (wxiVar22 != null) {
                        wxiVar22.i.J();
                    }
                    a1b0Var.F0(localGameDetailsEntity);
                    return Unit.a;
                }
            };
            final d81 d81Var = new d81(this, i4);
            final gi60 gi60Var = new gi60(this, 1);
            zp80 zp80Var = spin2WinNumberBoard.binding;
            if (zp80Var != null) {
                zp80Var.O2.setOnClickListener(new View.OnClickListener() { // from class: t1b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var2 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var2 != null ? zp80Var2.K0 : null;
                            Object tag = zp80Var2 != null ? zp80Var2.O2.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var2 = spin2WinNumberBoard.binding;
            if (zp80Var2 != null) {
                zp80Var2.Z2.setOnClickListener(new View.OnClickListener() { // from class: v1b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var3 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var3 != null ? zp80Var3.V0 : null;
                            Object tag = zp80Var3 != null ? zp80Var3.Z2.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var3 = spin2WinNumberBoard.binding;
            if (zp80Var3 != null) {
                zp80Var3.k3.setOnClickListener(new View.OnClickListener() { // from class: h2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var4 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var4 != null ? zp80Var4.g1 : null;
                            Object tag = zp80Var4 != null ? zp80Var4.k3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var4 = spin2WinNumberBoard.binding;
            if (zp80Var4 != null) {
                zp80Var4.s3.setOnClickListener(new View.OnClickListener() { // from class: o2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var5 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var5 != null ? zp80Var5.o1 : null;
                            Object tag = zp80Var5 != null ? zp80Var5.s3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var5 = spin2WinNumberBoard.binding;
            if (zp80Var5 != null) {
                zp80Var5.t3.setOnClickListener(new View.OnClickListener() { // from class: q2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var6 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var6 != null ? zp80Var6.p1 : null;
                            Object tag = zp80Var6 != null ? zp80Var6.t3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var6 = spin2WinNumberBoard.binding;
            if (zp80Var6 != null) {
                zp80Var6.u3.setOnClickListener(new View.OnClickListener() { // from class: r2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var7 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var7 != null ? zp80Var7.q1 : null;
                            Object tag = zp80Var7 != null ? zp80Var7.u3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var7 = spin2WinNumberBoard.binding;
            if (zp80Var7 != null) {
                zp80Var7.v3.setOnClickListener(new View.OnClickListener() { // from class: s2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var8 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var8 != null ? zp80Var8.r1 : null;
                            Object tag = zp80Var8 != null ? zp80Var8.v3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var8 = spin2WinNumberBoard.binding;
            if (zp80Var8 != null) {
                zp80Var8.w3.setOnClickListener(new View.OnClickListener() { // from class: t2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var9 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var9 != null ? zp80Var9.s1 : null;
                            Object tag = zp80Var9 != null ? zp80Var9.w3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var9 = spin2WinNumberBoard.binding;
            if (zp80Var9 != null) {
                zp80Var9.x3.setOnClickListener(new View.OnClickListener() { // from class: u2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var10 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var10 != null ? zp80Var10.t1 : null;
                            Object tag = zp80Var10 != null ? zp80Var10.x3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var10 = spin2WinNumberBoard.binding;
            if (zp80Var10 != null) {
                zp80Var10.P2.setOnClickListener(new View.OnClickListener() { // from class: v2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var11 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var11 != null ? zp80Var11.L0 : null;
                            Object tag = zp80Var11 != null ? zp80Var11.P2.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var11 = spin2WinNumberBoard.binding;
            if (zp80Var11 != null) {
                zp80Var11.Q2.setOnClickListener(new View.OnClickListener() { // from class: e2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var12 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var12 != null ? zp80Var12.M0 : null;
                            Object tag = zp80Var12 != null ? zp80Var12.Q2.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var12 = spin2WinNumberBoard.binding;
            if (zp80Var12 != null) {
                zp80Var12.R2.setOnClickListener(new View.OnClickListener() { // from class: p2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var13 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var13 != null ? zp80Var13.N0 : null;
                            Object tag = zp80Var13 != null ? zp80Var13.R2.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var13 = spin2WinNumberBoard.binding;
            if (zp80Var13 != null) {
                zp80Var13.S2.setOnClickListener(new View.OnClickListener() { // from class: w2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var14 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var14 != null ? zp80Var14.O0 : null;
                            Object tag = zp80Var14 != null ? zp80Var14.S2.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var14 = spin2WinNumberBoard.binding;
            if (zp80Var14 != null) {
                zp80Var14.T2.setOnClickListener(new View.OnClickListener() { // from class: x2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var15 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var15 != null ? zp80Var15.P0 : null;
                            Object tag = zp80Var15 != null ? zp80Var15.T2.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var15 = spin2WinNumberBoard.binding;
            if (zp80Var15 != null) {
                zp80Var15.U2.setOnClickListener(new View.OnClickListener() { // from class: y2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var16 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var16 != null ? zp80Var16.Q0 : null;
                            Object tag = zp80Var16 != null ? zp80Var16.U2.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var16 = spin2WinNumberBoard.binding;
            if (zp80Var16 != null) {
                zp80Var16.V2.setOnClickListener(new View.OnClickListener() { // from class: z2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var17 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var17 != null ? zp80Var17.R0 : null;
                            Object tag = zp80Var17 != null ? zp80Var17.V2.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var17 = spin2WinNumberBoard.binding;
            if (zp80Var17 != null) {
                zp80Var17.W2.setOnClickListener(new View.OnClickListener() { // from class: a3b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var18 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var18 != null ? zp80Var18.S0 : null;
                            Object tag = zp80Var18 != null ? zp80Var18.W2.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var18 = spin2WinNumberBoard.binding;
            if (zp80Var18 != null) {
                zp80Var18.X2.setOnClickListener(new View.OnClickListener() { // from class: b3b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var19 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var19 != null ? zp80Var19.T0 : null;
                            Object tag = zp80Var19 != null ? zp80Var19.X2.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var19 = spin2WinNumberBoard.binding;
            if (zp80Var19 != null) {
                zp80Var19.Y2.setOnClickListener(new View.OnClickListener() { // from class: c3b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var20 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var20 != null ? zp80Var20.U0 : null;
                            Object tag = zp80Var20 != null ? zp80Var20.Y2.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var20 = spin2WinNumberBoard.binding;
            if (zp80Var20 != null) {
                zp80Var20.a3.setOnClickListener(new View.OnClickListener() { // from class: u1b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var21 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var21 != null ? zp80Var21.W0 : null;
                            Object tag = zp80Var21 != null ? zp80Var21.a3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var21 = spin2WinNumberBoard.binding;
            if (zp80Var21 != null) {
                zp80Var21.b3.setOnClickListener(new View.OnClickListener() { // from class: w1b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var22 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var22 != null ? zp80Var22.X0 : null;
                            Object tag = zp80Var22 != null ? zp80Var22.b3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var22 = spin2WinNumberBoard.binding;
            if (zp80Var22 != null) {
                zp80Var22.c3.setOnClickListener(new View.OnClickListener() { // from class: x1b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var23 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var23 != null ? zp80Var23.Y0 : null;
                            Object tag = zp80Var23 != null ? zp80Var23.c3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var23 = spin2WinNumberBoard.binding;
            if (zp80Var23 != null) {
                zp80Var23.d3.setOnClickListener(new View.OnClickListener() { // from class: y1b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var24 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var24 != null ? zp80Var24.Z0 : null;
                            Object tag = zp80Var24 != null ? zp80Var24.d3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var24 = spin2WinNumberBoard.binding;
            if (zp80Var24 != null) {
                zp80Var24.e3.setOnClickListener(new View.OnClickListener() { // from class: z1b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var25 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var25 != null ? zp80Var25.a1 : null;
                            Object tag = zp80Var25 != null ? zp80Var25.e3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var25 = spin2WinNumberBoard.binding;
            if (zp80Var25 != null) {
                zp80Var25.f3.setOnClickListener(new View.OnClickListener() { // from class: a2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var26 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var26 != null ? zp80Var26.b1 : null;
                            Object tag = zp80Var26 != null ? zp80Var26.f3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var26 = spin2WinNumberBoard.binding;
            if (zp80Var26 != null) {
                zp80Var26.g3.setOnClickListener(new View.OnClickListener() { // from class: b2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var27 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var27 != null ? zp80Var27.c1 : null;
                            Object tag = zp80Var27 != null ? zp80Var27.g3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var27 = spin2WinNumberBoard.binding;
            if (zp80Var27 != null) {
                zp80Var27.h3.setOnClickListener(new View.OnClickListener() { // from class: c2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var28 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var28 != null ? zp80Var28.d1 : null;
                            Object tag = zp80Var28 != null ? zp80Var28.h3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var28 = spin2WinNumberBoard.binding;
            if (zp80Var28 != null) {
                zp80Var28.i3.setOnClickListener(new View.OnClickListener() { // from class: d2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var29 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var29 != null ? zp80Var29.e1 : null;
                            Object tag = zp80Var29 != null ? zp80Var29.i3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var29 = spin2WinNumberBoard.binding;
            if (zp80Var29 != null) {
                zp80Var29.j3.setOnClickListener(new View.OnClickListener() { // from class: f2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var30 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var30 != null ? zp80Var30.f1 : null;
                            Object tag = zp80Var30 != null ? zp80Var30.j3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var30 = spin2WinNumberBoard.binding;
            if (zp80Var30 != null) {
                zp80Var30.l3.setOnClickListener(new View.OnClickListener() { // from class: g2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var31 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var31 != null ? zp80Var31.h1 : null;
                            Object tag = zp80Var31 != null ? zp80Var31.l3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var31 = spin2WinNumberBoard.binding;
            if (zp80Var31 != null) {
                zp80Var31.m3.setOnClickListener(new View.OnClickListener() { // from class: i2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var32 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var32 != null ? zp80Var32.i1 : null;
                            Object tag = zp80Var32 != null ? zp80Var32.m3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var32 = spin2WinNumberBoard.binding;
            if (zp80Var32 != null) {
                zp80Var32.n3.setOnClickListener(new View.OnClickListener() { // from class: j2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var33 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var33 != null ? zp80Var33.j1 : null;
                            Object tag = zp80Var33 != null ? zp80Var33.n3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var33 = spin2WinNumberBoard.binding;
            if (zp80Var33 != null) {
                zp80Var33.o3.setOnClickListener(new View.OnClickListener() { // from class: k2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var34 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var34 != null ? zp80Var34.k1 : null;
                            Object tag = zp80Var34 != null ? zp80Var34.o3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var34 = spin2WinNumberBoard.binding;
            if (zp80Var34 != null) {
                zp80Var34.p3.setOnClickListener(new View.OnClickListener() { // from class: l2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var35 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var35 != null ? zp80Var35.l1 : null;
                            Object tag = zp80Var35 != null ? zp80Var35.p3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var35 = spin2WinNumberBoard.binding;
            if (zp80Var35 != null) {
                zp80Var35.q3.setOnClickListener(new View.OnClickListener() { // from class: m2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var36 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var36 != null ? zp80Var36.m1 : null;
                            Object tag = zp80Var36 != null ? zp80Var36.q3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            zp80 zp80Var36 = spin2WinNumberBoard.binding;
            if (zp80Var36 != null) {
                zp80Var36.r3.setOnClickListener(new View.OnClickListener() { // from class: n2b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinNumberBoard.K;
                        view2.getClass();
                        if (Spin2WinNumberBoard.E(view2, gi60Var)) {
                            Spin2WinNumberBoard spin2WinNumberBoard2 = spin2WinNumberBoard;
                            if (spin2WinNumberBoard2.fbgApplied) {
                                d81Var.invoke();
                                return;
                            }
                            Spin2WinNumberBoard.L(view2, r10);
                            zp80 zp80Var37 = spin2WinNumberBoard2.binding;
                            ImageView imageView = zp80Var37 != null ? zp80Var37.n1 : null;
                            Object tag = zp80Var37 != null ? zp80Var37.r3.getTag() : null;
                            spin2WinNumberBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
        }
        wxi wxiVar22 = this.v;
        if (wxiVar22 != null) {
            final Spin2WinButtonBoard spin2WinButtonBoard = wxiVar22.i;
            final ?? r11 = new Function2() { // from class: cza0
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String lowerCase;
                    String lowerCase2;
                    String lowerCase3;
                    String betType;
                    String lowerCase4;
                    String lowerCase5;
                    Integer num;
                    LocalGameDetailsEntity localGameDetailsEntity = (LocalGameDetailsEntity) obj;
                    ((View) obj2).getClass();
                    a1b0 a1b0Var = this.a;
                    wxi wxiVar23 = a1b0Var.v;
                    if (wxiVar23 != null) {
                        wxiVar23.J.M();
                    }
                    wxi wxiVar24 = a1b0Var.v;
                    if (wxiVar24 != null) {
                        Spin2WinNumberBoard spin2WinNumberBoard2 = wxiVar24.J;
                        v4b0 v4b0Var = spin2WinNumberBoard2.H;
                        if (((v4b0Var == null || (num = v4b0Var.c) == null) ? 0 : num.intValue()) > 0) {
                            String category = localGameDetailsEntity != null ? localGameDetailsEntity.getCategory() : null;
                            if (category != null) {
                                switch (category.hashCode()) {
                                    case -1852945562:
                                        if (category.equals("SECTOR")) {
                                            String betType2 = localGameDetailsEntity.getBetType();
                                            if (betType2 != null) {
                                                lowerCase = betType2.toLowerCase(Locale.ROOT);
                                                lowerCase.getClass();
                                            } else {
                                                lowerCase = null;
                                            }
                                            if (lowerCase != null) {
                                                switch (lowerCase.hashCode()) {
                                                    case 97:
                                                        if (lowerCase.equals("a")) {
                                                            pfd pfdVar = fse.a;
                                                            ej5.c(w5b.a(gku.a), null, null, new n3b0(spin2WinNumberBoard2, null), 3);
                                                        }
                                                        break;
                                                    case 98:
                                                        if (lowerCase.equals("b")) {
                                                            pfd pfdVar2 = fse.a;
                                                            ej5.c(w5b.a(gku.a), null, null, new o3b0(spin2WinNumberBoard2, null), 3);
                                                        }
                                                        break;
                                                    case 99:
                                                        if (lowerCase.equals("c")) {
                                                            pfd pfdVar3 = fse.a;
                                                            ej5.c(w5b.a(gku.a), null, null, new p3b0(spin2WinNumberBoard2, null), 3);
                                                        }
                                                        break;
                                                    case 100:
                                                        if (lowerCase.equals("d")) {
                                                            pfd pfdVar4 = fse.a;
                                                            ej5.c(w5b.a(gku.a), null, null, new q3b0(spin2WinNumberBoard2, null), 3);
                                                        }
                                                        break;
                                                    case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                                                        if (lowerCase.equals("e")) {
                                                            pfd pfdVar5 = fse.a;
                                                            ej5.c(w5b.a(gku.a), null, null, new r3b0(spin2WinNumberBoard2, null), 3);
                                                        }
                                                        break;
                                                    case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                                                        if (lowerCase.equals("f")) {
                                                            pfd pfdVar6 = fse.a;
                                                            ej5.c(w5b.a(gku.a), null, null, new s3b0(spin2WinNumberBoard2, null), 3);
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case -901346537:
                                        if (category.equals("HIGH_LOW")) {
                                            String betType3 = localGameDetailsEntity.getBetType();
                                            if (betType3 != null) {
                                                lowerCase2 = betType3.toLowerCase(Locale.ROOT);
                                                lowerCase2.getClass();
                                            } else {
                                                lowerCase2 = null;
                                            }
                                            if (Intrinsics.g(lowerCase2, "high")) {
                                                pfd pfdVar7 = fse.a;
                                                ej5.c(w5b.a(gku.a), null, null, new l3b0(spin2WinNumberBoard2, null), 3);
                                            } else if (Intrinsics.g(lowerCase2, "low")) {
                                                pfd pfdVar8 = fse.a;
                                                ej5.c(w5b.a(gku.a), null, null, new m3b0(spin2WinNumberBoard2, null), 3);
                                            }
                                        }
                                        break;
                                    case -338441228:
                                        if (category.equals("HIGH_LOW_COLOUR")) {
                                            String betType4 = localGameDetailsEntity.getBetType();
                                            if (betType4 != null) {
                                                lowerCase3 = betType4.toLowerCase(Locale.ROOT);
                                                lowerCase3.getClass();
                                            } else {
                                                lowerCase3 = null;
                                            }
                                            if (lowerCase3 != null) {
                                                switch (lowerCase3.hashCode()) {
                                                    case -1684921228:
                                                        if (lowerCase3.equals("high_red")) {
                                                            pfd pfdVar9 = fse.a;
                                                            ej5.c(w5b.a(gku.a), null, null, new g3b0(spin2WinNumberBoard2, null), 3);
                                                        }
                                                        break;
                                                    case -700790956:
                                                        if (lowerCase3.equals("low_black")) {
                                                            pfd pfdVar10 = fse.a;
                                                            ej5.c(w5b.a(gku.a), null, null, new h3b0(spin2WinNumberBoard2, null), 3);
                                                        }
                                                        break;
                                                    case -21197022:
                                                        if (lowerCase3.equals("high_black")) {
                                                            pfd pfdVar11 = fse.a;
                                                            ej5.c(w5b.a(gku.a), null, null, new i3b0(spin2WinNumberBoard2, null), 3);
                                                        }
                                                        break;
                                                    case 356827430:
                                                        if (lowerCase3.equals("low_red")) {
                                                            pfd pfdVar12 = fse.a;
                                                            ej5.c(w5b.a(gku.a), null, null, new f3b0(spin2WinNumberBoard2, null), 3);
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case 65241624:
                                        if (category.equals("DOZEN") && (betType = localGameDetailsEntity.getBetType()) != null) {
                                            int iHashCode = betType.hashCode();
                                            if (iHashCode == 1504573) {
                                                if (betType.equals("1-12")) {
                                                    pfd pfdVar13 = fse.a;
                                                    ej5.c(w5b.a(gku.a), null, null, new t3b0(spin2WinNumberBoard2, null), 3);
                                                }
                                            } else if (iHashCode == 46816717) {
                                                if (betType.equals("13-24")) {
                                                    pfd pfdVar14 = fse.a;
                                                    ej5.c(w5b.a(gku.a), null, null, new u3b0(spin2WinNumberBoard2, null), 3);
                                                }
                                            } else if (iHashCode == 47799853 && betType.equals(Chyeyik.xvp)) {
                                                pfd pfdVar15 = fse.a;
                                                ej5.c(w5b.a(gku.a), null, null, new v3b0(spin2WinNumberBoard2, null), 3);
                                            }
                                        }
                                        break;
                                    case 1061088362:
                                        if (category.equals("EVEN_ODD")) {
                                            String betType5 = localGameDetailsEntity.getBetType();
                                            if (betType5 != null) {
                                                lowerCase4 = betType5.toLowerCase(Locale.ROOT);
                                                lowerCase4.getClass();
                                            } else {
                                                lowerCase4 = null;
                                            }
                                            if (Intrinsics.g(lowerCase4, "odd")) {
                                                pfd pfdVar16 = fse.a;
                                                ej5.c(w5b.a(gku.a), null, null, new j3b0(spin2WinNumberBoard2, null), 3);
                                            } else if (Intrinsics.g(lowerCase4, "even")) {
                                                pfd pfdVar17 = fse.a;
                                                ej5.c(w5b.a(gku.a), null, null, new k3b0(spin2WinNumberBoard2, null), 3);
                                            }
                                        }
                                        break;
                                    case 1993454028:
                                        if (category.equals("COLOUR")) {
                                            String betType6 = localGameDetailsEntity.getBetType();
                                            if (betType6 != null) {
                                                lowerCase5 = betType6.toLowerCase(Locale.ROOT);
                                                lowerCase5.getClass();
                                            } else {
                                                lowerCase5 = null;
                                            }
                                            if (lowerCase5 != null) {
                                                int iHashCode2 = lowerCase5.hashCode();
                                                if (iHashCode2 == 112785) {
                                                    if (lowerCase5.equals("red")) {
                                                        pfd pfdVar18 = fse.a;
                                                        ej5.c(w5b.a(gku.a), null, null, new d3b0(spin2WinNumberBoard2, null), 3);
                                                    }
                                                } else if (iHashCode2 == 93818879) {
                                                    if (lowerCase5.equals("black")) {
                                                        pfd pfdVar19 = fse.a;
                                                        ej5.c(w5b.a(gku.a), null, null, new e3b0(spin2WinNumberBoard2, null), 3);
                                                    }
                                                } else if (iHashCode2 == 98619139) {
                                                    lowerCase5.equals("green");
                                                }
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    a1b0Var.F0(localGameDetailsEntity);
                    return Unit.a;
                }
            };
            final dza0 dza0Var = new dza0(this);
            final ?? r4 = new Function1() { // from class: eza0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(this.a.o0((LocalGameDetailsEntity) obj));
                }
            };
            yp80 yp80Var = spin2WinButtonBoard.F;
            if (yp80Var != null) {
                yp80Var.m1.setOnClickListener(new View.OnClickListener() { // from class: aya0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        boolean zF = Spin2WinButtonBoard.F(view2, r4);
                        Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                        yp80 yp80Var2 = spin2WinButtonBoard2.F;
                        if (zF) {
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            ImageView imageView = yp80Var2 != null ? yp80Var2.e0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.m1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                            spin2WinButtonBoard2.H(yp80Var2 != null ? yp80Var2.m1 : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.n1.setOnClickListener(new View.OnClickListener() { // from class: sxa0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        boolean zF = Spin2WinButtonBoard.F(view2, r4);
                        Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                        yp80 yp80Var2 = spin2WinButtonBoard2.F;
                        if (zF) {
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            ImageView imageView = yp80Var2 != null ? yp80Var2.f0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.n1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                            spin2WinButtonBoard2.H(yp80Var2 != null ? yp80Var2.n1 : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.o1.setOnClickListener(new View.OnClickListener() { // from class: txa0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        boolean zF = Spin2WinButtonBoard.F(view2, r4);
                        Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                        yp80 yp80Var2 = spin2WinButtonBoard2.F;
                        if (zF) {
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            ImageView imageView = yp80Var2 != null ? yp80Var2.g0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.o1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                            spin2WinButtonBoard2.H(yp80Var2 != null ? yp80Var2.o1 : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.v1.setOnClickListener(new View.OnClickListener() { // from class: uxa0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        boolean zF = Spin2WinButtonBoard.F(view2, r4);
                        Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                        yp80 yp80Var2 = spin2WinButtonBoard2.F;
                        if (zF) {
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            ImageView imageView = yp80Var2 != null ? yp80Var2.n0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.v1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                            spin2WinButtonBoard2.H(yp80Var2 != null ? yp80Var2.v1 : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.E1.setOnClickListener(new View.OnClickListener() { // from class: vxa0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        boolean zF = Spin2WinButtonBoard.F(view2, r4);
                        Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                        yp80 yp80Var2 = spin2WinButtonBoard2.F;
                        if (zF) {
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            ImageView imageView = yp80Var2 != null ? yp80Var2.w0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.E1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                            spin2WinButtonBoard2.H(yp80Var2 != null ? yp80Var2.E1 : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.F1.setOnClickListener(new View.OnClickListener() { // from class: wxa0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        if (Spin2WinButtonBoard.F(view2, r4)) {
                            Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            yp80 yp80Var2 = spin2WinButtonBoard2.F;
                            ImageView imageView = yp80Var2 != null ? yp80Var2.x0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.F1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.r1.setOnClickListener(new View.OnClickListener() { // from class: xxa0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        if (Spin2WinButtonBoard.F(view2, r4)) {
                            Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            yp80 yp80Var2 = spin2WinButtonBoard2.F;
                            ImageView imageView = yp80Var2 != null ? yp80Var2.j0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.r1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.B1.setOnClickListener(new View.OnClickListener() { // from class: yxa0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        boolean zF = Spin2WinButtonBoard.F(view2, r4);
                        Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                        yp80 yp80Var2 = spin2WinButtonBoard2.F;
                        if (zF) {
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            ImageView imageView = yp80Var2 != null ? yp80Var2.t0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.B1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                            spin2WinButtonBoard2.H(yp80Var2 != null ? yp80Var2.B1 : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.y1.setOnClickListener(new View.OnClickListener() { // from class: zxa0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        boolean zF = Spin2WinButtonBoard.F(view2, r4);
                        Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                        yp80 yp80Var2 = spin2WinButtonBoard2.F;
                        if (zF) {
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            ImageView imageView = yp80Var2 != null ? yp80Var2.q0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.y1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                            spin2WinButtonBoard2.H(yp80Var2 != null ? yp80Var2.y1 : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.D1.setOnClickListener(new View.OnClickListener() { // from class: bya0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        if (Spin2WinButtonBoard.F(view2, r4)) {
                            Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            yp80 yp80Var2 = spin2WinButtonBoard2.F;
                            ImageView imageView = yp80Var2 != null ? yp80Var2.v0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.D1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.C1.setOnClickListener(new View.OnClickListener() { // from class: cya0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        if (Spin2WinButtonBoard.F(view2, r4)) {
                            Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            yp80 yp80Var2 = spin2WinButtonBoard2.F;
                            ImageView imageView = yp80Var2 != null ? yp80Var2.u0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.C1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.A1.setOnClickListener(new View.OnClickListener() { // from class: dya0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        if (Spin2WinButtonBoard.F(view2, r4)) {
                            Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            yp80 yp80Var2 = spin2WinButtonBoard2.F;
                            ImageView imageView = yp80Var2 != null ? yp80Var2.s0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.A1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.z1.setOnClickListener(new View.OnClickListener() { // from class: eya0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        if (Spin2WinButtonBoard.F(view2, r4)) {
                            Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            yp80 yp80Var2 = spin2WinButtonBoard2.F;
                            ImageView imageView = yp80Var2 != null ? yp80Var2.r0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.z1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.p1.setOnClickListener(new View.OnClickListener() { // from class: fya0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        boolean zF = Spin2WinButtonBoard.F(view2, r4);
                        Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                        yp80 yp80Var2 = spin2WinButtonBoard2.F;
                        if (zF) {
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            ImageView imageView = yp80Var2 != null ? yp80Var2.h0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.p1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                            spin2WinButtonBoard2.H(yp80Var2 != null ? yp80Var2.p1 : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.q1.setOnClickListener(new View.OnClickListener() { // from class: gya0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        boolean zF = Spin2WinButtonBoard.F(view2, r4);
                        Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                        yp80 yp80Var2 = spin2WinButtonBoard2.F;
                        if (zF) {
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            ImageView imageView = yp80Var2 != null ? yp80Var2.i0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.q1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                            spin2WinButtonBoard2.H(yp80Var2 != null ? yp80Var2.q1 : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.s1.setOnClickListener(new View.OnClickListener() { // from class: hya0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        boolean zF = Spin2WinButtonBoard.F(view2, r4);
                        Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                        yp80 yp80Var2 = spin2WinButtonBoard2.F;
                        if (zF) {
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            ImageView imageView = yp80Var2 != null ? yp80Var2.k0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.s1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                            spin2WinButtonBoard2.H(yp80Var2 != null ? yp80Var2.s1 : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.t1.setOnClickListener(new View.OnClickListener() { // from class: iya0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        boolean zF = Spin2WinButtonBoard.F(view2, r4);
                        Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                        yp80 yp80Var2 = spin2WinButtonBoard2.F;
                        if (zF) {
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            ImageView imageView = yp80Var2 != null ? yp80Var2.l0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.t1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                            spin2WinButtonBoard2.H(yp80Var2 != null ? yp80Var2.t1 : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.u1.setOnClickListener(new View.OnClickListener() { // from class: jya0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        boolean zF = Spin2WinButtonBoard.F(view2, r4);
                        Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                        yp80 yp80Var2 = spin2WinButtonBoard2.F;
                        if (zF) {
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            ImageView imageView = yp80Var2 != null ? yp80Var2.m0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.u1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                            spin2WinButtonBoard2.H(yp80Var2 != null ? yp80Var2.u1 : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.w1.setOnClickListener(new View.OnClickListener() { // from class: qxa0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        boolean zF = Spin2WinButtonBoard.F(view2, r4);
                        Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                        yp80 yp80Var2 = spin2WinButtonBoard2.F;
                        if (zF) {
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            ImageView imageView = yp80Var2 != null ? yp80Var2.o0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.w1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                            spin2WinButtonBoard2.H(yp80Var2 != null ? yp80Var2.w1 : null);
                        }
                    }
                });
            }
            if (yp80Var != null) {
                yp80Var.x1.setOnClickListener(new View.OnClickListener() { // from class: rxa0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = Spin2WinButtonBoard.J;
                        view2.getClass();
                        if (Spin2WinButtonBoard.F(view2, r4)) {
                            Spin2WinButtonBoard spin2WinButtonBoard2 = spin2WinButtonBoard;
                            if (spin2WinButtonBoard2.fbgApplied) {
                                dza0Var.invoke();
                                return;
                            }
                            Spin2WinButtonBoard.I(view2, r11);
                            yp80 yp80Var2 = spin2WinButtonBoard2.F;
                            ImageView imageView = yp80Var2 != null ? yp80Var2.p0 : null;
                            Object tag = yp80Var2 != null ? yp80Var2.x1.getTag() : null;
                            spin2WinButtonBoard2.G(imageView, tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null);
                        }
                    }
                });
            }
        }
        wxi wxiVar23 = this.v;
        if (wxiVar23 != null) {
            gr60.a(wxiVar23.U, new Function1() { // from class: gza0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    List<BetTypeAndPayouts> betTypesAndPayouts;
                    ((View) obj).getClass();
                    final a1b0 a1b0Var = this.a;
                    Context context4 = a1b0Var.getContext();
                    if (context4 != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        GameDetailsResponse gameDetailsResponse = a1b0Var.T;
                        if (gameDetailsResponse != null && (betTypesAndPayouts = gameDetailsResponse.getBetTypesAndPayouts()) != null) {
                            for (BetTypeAndPayouts betTypeAndPayouts : betTypesAndPayouts) {
                                String betCategory = betTypeAndPayouts.getBetCategory();
                                String str3 = "";
                                if (betCategory == null) {
                                    betCategory = "";
                                }
                                Double payMultiplier = betTypeAndPayouts.getPayMultiplier();
                                String str4 = (payMultiplier != null ? Integer.valueOf((int) payMultiplier.doubleValue()) : null) + "x";
                                String betTitle = betTypeAndPayouts.getBetTitle();
                                if (betTitle != null) {
                                    str3 = betTitle;
                                }
                                linkedHashSet.add(new Payouts(betCategory, str4, str3));
                            }
                        }
                        cq80 cq80Var = new cq80(context4);
                        cq80Var.setCancelable(false);
                        bq80 bq80Var = new bq80(0);
                        cq80Var.a = linkedHashSet;
                        cq80Var.b = bq80Var;
                        Window window2 = cq80Var.getWindow();
                        WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
                        if (attributes != null) {
                            attributes.gravity = 17;
                        }
                        if (attributes != null) {
                            attributes.flags &= -5;
                        }
                        Window window3 = cq80Var.getWindow();
                        if (window3 != null) {
                            window3.setAttributes(attributes);
                        }
                        Window window4 = cq80Var.getWindow();
                        if (window4 != null) {
                            window4.setBackgroundDrawableResource(R.color.dialog_bg_color);
                        }
                        cq80Var.show();
                        Window window5 = cq80Var.getWindow();
                        if (window5 != null) {
                            window5.setLayout(-1, -1);
                        }
                        wxi wxiVar24 = a1b0Var.v;
                        if (wxiVar24 != null) {
                            wxiVar24.c.setVisibility(8);
                        }
                        GameDetails gameDetails3 = a1b0Var.i;
                        wz.a("PayoutsClicked", gameDetails3 != null ? gameDetails3.getName() : null, new String[0]);
                        cq80Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: f0b0
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                a1b0 a1b0Var2 = a1b0Var;
                                wxi wxiVar25 = a1b0Var2.v;
                                if (wxiVar25 != null) {
                                    wxiVar25.c.setVisibility(0);
                                }
                                GameDetails gameDetails4 = a1b0Var2.i;
                                String name2 = gameDetails4 != null ? gameDetails4.getName() : null;
                                if (name2 == null) {
                                    name2 = "";
                                }
                                wz.a("PopupAction", name2, "Logged in", "Payouts", "Close");
                            }
                        });
                    }
                    return Unit.a;
                }
            });
        }
        wxi wxiVar24 = this.v;
        if (wxiVar24 != null) {
            gr60.a(wxiVar24.X, new xrj(this, i2));
        }
        wxi wxiVar25 = this.v;
        if (wxiVar25 != null) {
            gr60.a(wxiVar25.v, new Function1() { // from class: hza0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Context context4;
                    a aVar;
                    FragmentManager supportFragmentManager;
                    ((View) obj).getClass();
                    a1b0 a1b0Var = this.a;
                    Context context5 = a1b0Var.getContext();
                    String string = context5 != null ? context5.getString(R.string.sg_spin2win_delete_all_bets) : null;
                    if (string != null && (context4 = a1b0Var.getContext()) != null) {
                        e activity4 = a1b0Var.getActivity();
                        FragmentManager supportFragmentManager2 = activity4 != null ? activity4.getSupportFragmentManager() : null;
                        op5 op5Var = op5.a;
                        String string2 = a1b0Var.getString(R.string.key_delete_all_bets_msg);
                        string2.getClass();
                        op5Var.getClass();
                        String strB = op5.b(string2, string, null);
                        String string3 = a1b0Var.getString(R.string.yes_btn_cms);
                        string3.getClass();
                        String string4 = a1b0Var.getString(R.string.yes_bet);
                        string4.getClass();
                        String strB2 = op5.b(string3, string4, null);
                        String string5 = a1b0Var.getString(R.string.no_btn_cms);
                        string5.getClass();
                        String string6 = a1b0Var.getString(R.string.no_bet);
                        string6.getClass();
                        a aVarA = a.C0437a.a("Spin2Win", "one tap bet", strB, "", strB2, op5.b(string5, string6, null), new r8p(a1b0Var, 2), new r0b0(), context4.getColor(R.color.redblack_confirm_dialog_left_button), context4.getColor(R.color.redblack_confirm_dialog_right_button), 12288);
                        e activity5 = a1b0Var.getActivity();
                        if (!(((activity5 == null || (supportFragmentManager = activity5.getSupportFragmentManager()) == null) ? null : supportFragmentManager.G(R.id.flContent)) instanceof a) && (((aVar = a1b0Var.A) == null || !aVar.isVisible()) && supportFragmentManager2 != null)) {
                            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
                            aVar2.f(R.id.flContent, aVarA, null);
                            aVar2.c("CONFIRM_DIALOG_FRAGMENT");
                            aVar2.d();
                        }
                    }
                    return Unit.a;
                }
            });
        }
        ypa0 ypa0VarZ0 = z0();
        GameDetails gameDetails3 = this.i;
        String name2 = gameDetails3 != null ? gameDetails3.getName() : null;
        if (name2 == null) {
            name2 = "";
        }
        ypa0VarZ0.e = name2;
        y0().d.f(getViewLifecycleOwner(), new p1b0(new rtj(this, i3)));
    }

    public final void p0() {
        Integer maxBetCount;
        int i2;
        Integer maxBetCount2;
        Double dValueOf = Double.valueOf(0.0d);
        r0();
        this.L = null;
        GameDetailsResponse gameDetailsResponse = this.T;
        int iIntValue = (gameDetailsResponse == null || (maxBetCount2 = gameDetailsResponse.getMaxBetCount()) == null) ? 0 : maxBetCount2.intValue();
        GameDetailsResponse gameDetailsResponse2 = this.T;
        ArrayList arrayList = this.J;
        if (gameDetailsResponse2 != null) {
            if (arrayList != null) {
                int size = arrayList.size();
                i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    if (!Intrinsics.c(((LocalGameDetailsEntity) obj).getBetAmount(), 0.0d)) {
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            gameDetailsResponse2.setMaxBetCount(Integer.valueOf(iIntValue + i2));
        }
        v4b0 v4b0VarW0 = w0();
        GameDetailsResponse gameDetailsResponse3 = this.T;
        v4b0VarW0.c = Integer.valueOf((gameDetailsResponse3 == null || (maxBetCount = gameDetailsResponse3.getMaxBetCount()) == null) ? 0 : maxBetCount.intValue());
        if (arrayList != null) {
            int size2 = arrayList.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList.get(i4);
                i4++;
                LocalGameDetailsEntity localGameDetailsEntity = (LocalGameDetailsEntity) obj2;
                List<String> allBetAmountList = localGameDetailsEntity.getAllBetAmountList();
                if (allBetAmountList != null) {
                    allBetAmountList.clear();
                }
                localGameDetailsEntity.setBetAmount(dValueOf);
            }
        }
        U0(this, arrayList);
        wxi wxiVar = this.v;
        if (wxiVar != null) {
            wxiVar.c.setScrollPosition(0);
        }
        wxi wxiVar2 = this.v;
        if (wxiVar2 != null) {
            wxiVar2.c.setMinMaxChip(dValueOf, dValueOf);
        }
        wxi wxiVar3 = this.v;
        if (wxiVar3 != null) {
            wxiVar3.c.setBetAmount(dValueOf, dValueOf);
        }
        wxi wxiVar4 = this.v;
        if (wxiVar4 != null) {
            wxiVar4.i.J();
        }
        wxi wxiVar5 = this.v;
        if (wxiVar5 != null) {
            wxiVar5.J.M();
        }
        v4b0 v4b0VarW1 = w0();
        v4b0VarW1.f.clear();
        wwd0 wwd0Var = v4b0VarW1.e;
        z3b0 z3b0Var = new z3b0(0);
        wwd0Var.getClass();
        wwd0Var.k(null, z3b0Var);
    }

    public final void q0() {
        Double dValueOf = Double.valueOf(0.0d);
        ArrayList arrayList = this.J;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                LocalGameDetailsEntity localGameDetailsEntity = (LocalGameDetailsEntity) obj;
                List<String> allBetAmountList = localGameDetailsEntity.getAllBetAmountList();
                if (allBetAmountList != null) {
                    allBetAmountList.clear();
                }
                localGameDetailsEntity.setBetAmount(dValueOf);
            }
        }
        U0(this, arrayList);
        wxi wxiVar = this.v;
        if (wxiVar != null) {
            wxiVar.c.setScrollPosition(0);
        }
        wxi wxiVar2 = this.v;
        if (wxiVar2 != null) {
            wxiVar2.c.setMinMaxChip(dValueOf, dValueOf);
        }
        wxi wxiVar3 = this.v;
        if (wxiVar3 != null) {
            wxiVar3.c.setBetAmount(dValueOf, dValueOf);
        }
    }

    public final void r0() {
        wxi wxiVar = this.v;
        if (wxiVar != null) {
            wxiVar.a0.setEnabled(false);
        }
        wxi wxiVar2 = this.v;
        if (wxiVar2 != null) {
            wxiVar2.v.setEnabled(false);
        }
        wxi wxiVar3 = this.v;
        if (wxiVar3 != null) {
            wxiVar3.O.setEnabled(false);
        }
        wxi wxiVar4 = this.v;
        if (wxiVar4 != null) {
            wxiVar4.P.setVisibility(8);
        }
        wxi wxiVar5 = this.v;
        if (wxiVar5 != null) {
            wxiVar5.a0.setAlpha(0.5f);
        }
        wxi wxiVar6 = this.v;
        if (wxiVar6 != null) {
            wxiVar6.v.setAlpha(0.5f);
        }
        wxi wxiVar7 = this.v;
        if (wxiVar7 != null) {
            wxiVar7.O.setAlpha(0.5f);
        }
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        wxi wxiVar8 = this.v;
        bVar.f(wxiVar8 != null ? wxiVar8.O : null);
        wxi wxiVar9 = this.v;
        int id = wxiVar9 != null ? wxiVar9.W.getId() : 0;
        wxi wxiVar10 = this.v;
        bVar.g(id, 4, wxiVar10 != null ? wxiVar10.O.getId() : 0, 4);
        wxi wxiVar11 = this.v;
        bVar.b(wxiVar11 != null ? wxiVar11.O : null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    public final void t0(String str) {
        svg svgVar;
        Integer numValueOf;
        androidx.fragment.app.e activity;
        String name;
        Integer id;
        if ((this.Z || !this.I) && str == null) {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        List<GameDetails> list = this.R;
        int i2 = 0;
        if (list != null) {
            GameDetails gameDetails = this.i;
            int iIntValue = (gameDetails == null || (id = gameDetails.getId()) == null) ? 0 : id.intValue();
            GameDetails gameDetails2 = this.i;
            if (gameDetails2 == null || (name = gameDetails2.getName()) == null) {
                name = "";
            }
            svgVar = new svg();
            svgVar.c = list;
            svgVar.d = Integer.valueOf(iIntValue);
            svgVar.e = name;
            svgVar.i = str;
        } else {
            svgVar = null;
        }
        androidx.fragment.app.e activity3 = getActivity();
        if (activity3 != null) {
            FragmentManager supportFragmentManager = activity3.getSupportFragmentManager();
            supportFragmentManager.getClass();
            if (svgVar != null) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.f(R.id.flContent, svgVar, null);
                aVar.c("CONFIRM_DIALOG_FRAGMENT");
                numValueOf = Integer.valueOf(aVar.k(false, true));
            } else {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null || getContext() == null || (activity = getActivity()) == null) {
            return;
        }
        GameDetails gameDetails3 = this.i;
        wz.a("BackInGame", gameDetails3 != null ? gameDetails3.getName() : null, new String[0]);
        if (str == null) {
            z0();
            op5 op5Var = op5.a;
            String string = getString(R.string.exit_confirm_msg_cms);
            string.getClass();
            String string2 = getString(R.string.exit_text);
            string2.getClass();
            op5Var.getClass();
            String strB = op5.b(string, string2, null);
            String string3 = getString(R.string.stay_btn_cms);
            string3.getClass();
            String string4 = getString(R.string.stay);
            string4.getClass();
            String strB2 = op5.b(string3, string4, null);
            String string5 = getString(R.string.exit_btn_cms);
            string5.getClass();
            String string6 = getString(R.string.label_dialog_exit);
            string6.getClass();
            this.A = com.sportygames.commons.components.a.C0437a.a("Spin2Win", JsPluginCommon.GAMES_EXIT, strB, "", strB2, op5.b(string5, string6, null), new jza0(this, i2), new sza0(), activity.getColor(R.color.redblack_confirm_dialog_left_button), activity.getColor(R.color.redblack_confirm_dialog_right_button), 4096);
            androidx.fragment.app.e activity4 = getActivity();
            FragmentManager supportFragmentManager2 = activity4 != null ? activity4.getSupportFragmentManager() : null;
            com.sportygames.commons.components.a aVar2 = this.A;
            if (aVar2 != null && supportFragmentManager2 != null) {
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager2);
                aVar3.f(R.id.flContent, aVar2, null);
                aVar3.c("CONFIRM_DIALOG_FRAGMENT");
                aVar3.d();
            }
        } else {
            xbg xbgVar = this.w;
            if (xbgVar != null) {
                String string7 = getString(R.string.label_dialog_exit);
                string7.getClass();
                xbg.c(xbgVar, str, string7, new Function0() { // from class: yza0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.a.H0(true);
                        return Unit.a;
                    }
                }, new g0b0(), activity.getColor(R.color.try_again_color), 224);
                xbgVar.a();
            }
        }
        GameDetails gameDetails4 = this.i;
        wz.a("BackClicked", gameDetails4 != null ? gameDetails4.getName() : null, new String[0]);
        Unit unit = Unit.a;
    }

    public final du2 u0() {
        return (du2) this.d.getValue();
    }

    public final ArrayList v0() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.J;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                LocalGameDetailsEntity localGameDetailsEntity = (LocalGameDetailsEntity) obj;
                Double betAmount = localGameDetailsEntity.getBetAmount();
                if ((betAmount != null ? betAmount.doubleValue() : 0.0d) > 0.0d) {
                    String color = localGameDetailsEntity.getColor();
                    if (color == null) {
                        color = "";
                    }
                    op5 op5Var = op5.a;
                    WalletInfoResponse walletInfoResponse = this.P;
                    String str = null;
                    String strValueOf = String.valueOf(walletInfoResponse != null ? walletInfoResponse.getCurrency() : null);
                    op5Var.getClass();
                    String strI = op5.i(strValueOf);
                    TreeMap treeMap = pw.a;
                    Double betAmount2 = localGameDetailsEntity.getBetAmount();
                    if (betAmount2 != null) {
                        try {
                            String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(betAmount2.doubleValue());
                            str2.getClass();
                            str = str2;
                        } catch (Exception unused) {
                            str = "0.00";
                        }
                    }
                    if (str == null) {
                        str = "";
                    }
                    String strA = tug.a(strI, " ", pw.a(str));
                    String localizedTitle = localGameDetailsEntity.getLocalizedTitle();
                    arrayList.add(new BetList(color, strA, "", localizedTitle == null ? "" : localizedTitle, String.valueOf(localGameDetailsEntity.getBetTypeId()), "", this.a0));
                }
            }
        }
        return arrayList;
    }

    public final v4b0 w0() {
        return (v4b0) this.a.getValue();
    }

    public final fuj y0() {
        return (fuj) this.e.getValue();
    }

    public final ypa0 z0() {
        return (ypa0) this.c.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void s0() {
        ArrayList arrayList;
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String betType;
        String lowerCase4;
        String lowerCase5;
        ArrayList arrayList2;
        wxi wxiVar = this.v;
        if (wxiVar != null) {
            wxiVar.G.setVisibility(0);
        }
        q0();
        r0();
        wxi wxiVar2 = this.v;
        ArrayList arrayList3 = this.J;
        if (wxiVar2 != null) {
            Spin2WinNumberBoard spin2WinNumberBoard = wxiVar2.J;
            if (arrayList3 != null) {
                arrayList2 = new ArrayList();
                int size = arrayList3.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList3.get(i2);
                    i2++;
                    if (Intrinsics.g(((LocalGameDetailsEntity) obj).getCategory(), "NUMBER")) {
                        arrayList2.add(obj);
                    }
                }
            } else {
                arrayList2 = null;
            }
            GameDetailsResponse gameDetailsResponse = this.T;
            spin2WinNumberBoard.F(arrayList2, gameDetailsResponse != null ? gameDetailsResponse.getBetChipList() : null);
        }
        wxi wxiVar3 = this.v;
        if (wxiVar3 != null) {
            Spin2WinButtonBoard spin2WinButtonBoard = wxiVar3.i;
            if (arrayList3 != null) {
                arrayList = new ArrayList();
                int size2 = arrayList3.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList3.get(i3);
                    i3++;
                    if (!Intrinsics.g(((LocalGameDetailsEntity) obj2).getCategory(), "NUMBER")) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = null;
            }
            GameDetailsResponse gameDetailsResponse2 = this.T;
            ArrayList<Double> betChipList = gameDetailsResponse2 != null ? gameDetailsResponse2.getBetChipList() : null;
            yp80 yp80Var = spin2WinButtonBoard.F;
            if (arrayList != null && !arrayList.isEmpty()) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    String category = ((LocalGameDetailsEntity) arrayList.get(i4)).getCategory();
                    if (category != null) {
                        switch (category.hashCode()) {
                            case -1852945562:
                                if (!category.equals("SECTOR")) {
                                    break;
                                } else {
                                    String betType2 = ((LocalGameDetailsEntity) arrayList.get(i4)).getBetType();
                                    if (betType2 != null) {
                                        lowerCase = betType2.toLowerCase(Locale.ROOT);
                                        lowerCase.getClass();
                                    } else {
                                        lowerCase = null;
                                    }
                                    if (lowerCase == null) {
                                        break;
                                    } else {
                                        switch (lowerCase.hashCode()) {
                                            case 97:
                                                if (lowerCase.equals("a")) {
                                                    if (yp80Var != null) {
                                                        yp80Var.p1.setTag(arrayList.get(i4));
                                                        Unit unit = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.B0.setText("");
                                                        Unit unit2 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.V0.setText("");
                                                        Unit unit3 = Unit.a;
                                                    }
                                                    spin2WinButtonBoard.L(yp80Var != null ? yp80Var.B0 : null, yp80Var != null ? yp80Var.V0 : null, yp80Var != null ? yp80Var.N : null, yp80Var != null ? yp80Var.e : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                                }
                                                break;
                                            case 98:
                                                if (lowerCase.equals("b")) {
                                                    if (yp80Var != null) {
                                                        yp80Var.q1.setTag(arrayList.get(i4));
                                                        Unit unit4 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.C0.setText("");
                                                        Unit unit5 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.W0.setText("");
                                                        Unit unit6 = Unit.a;
                                                    }
                                                    spin2WinButtonBoard.L(yp80Var != null ? yp80Var.C0 : null, yp80Var != null ? yp80Var.W0 : null, yp80Var != null ? yp80Var.O : null, yp80Var != null ? yp80Var.f : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                                }
                                                break;
                                            case 99:
                                                if (lowerCase.equals("c")) {
                                                    if (yp80Var != null) {
                                                        yp80Var.s1.setTag(arrayList.get(i4));
                                                        Unit unit7 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.E0.setText("");
                                                        Unit unit8 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.Y0.setText("");
                                                        Unit unit9 = Unit.a;
                                                    }
                                                    spin2WinButtonBoard.L(yp80Var != null ? yp80Var.E0 : null, yp80Var != null ? yp80Var.Y0 : null, yp80Var != null ? yp80Var.Q : null, yp80Var != null ? yp80Var.v : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                                }
                                                break;
                                            case 100:
                                                if (lowerCase.equals("d")) {
                                                    if (yp80Var != null) {
                                                        yp80Var.t1.setTag(arrayList.get(i4));
                                                        Unit unit10 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.F0.setText("");
                                                        Unit unit11 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.Z0.setText("");
                                                        Unit unit12 = Unit.a;
                                                    }
                                                    spin2WinButtonBoard.L(yp80Var != null ? yp80Var.F0 : null, yp80Var != null ? yp80Var.Z0 : null, yp80Var != null ? yp80Var.R : null, yp80Var != null ? yp80Var.w : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                                }
                                                break;
                                            case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                                                if (lowerCase.equals("e")) {
                                                    if (yp80Var != null) {
                                                        yp80Var.u1.setTag(arrayList.get(i4));
                                                        Unit unit13 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.G0.setText("");
                                                        Unit unit14 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.a1.setText("");
                                                        Unit unit15 = Unit.a;
                                                    }
                                                    spin2WinButtonBoard.L(yp80Var != null ? yp80Var.G0 : null, yp80Var != null ? yp80Var.a1 : null, yp80Var != null ? yp80Var.S : null, yp80Var != null ? yp80Var.y : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                                }
                                                break;
                                            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                                                if (lowerCase.equals("f")) {
                                                    if (yp80Var != null) {
                                                        yp80Var.w1.setTag(arrayList.get(i4));
                                                        Unit unit16 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.I0.setText("");
                                                        Unit unit17 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.c1.setText("");
                                                        Unit unit18 = Unit.a;
                                                    }
                                                    spin2WinButtonBoard.L(yp80Var != null ? yp80Var.I0 : null, yp80Var != null ? yp80Var.c1 : null, yp80Var != null ? yp80Var.U : null, yp80Var != null ? yp80Var.A : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                                }
                                                break;
                                        }
                                    }
                                }
                                break;
                            case -901346537:
                                if (category.equals("HIGH_LOW")) {
                                    String betType3 = ((LocalGameDetailsEntity) arrayList.get(i4)).getBetType();
                                    if (betType3 != null) {
                                        lowerCase2 = betType3.toLowerCase(Locale.ROOT);
                                        lowerCase2.getClass();
                                    } else {
                                        lowerCase2 = null;
                                    }
                                    if (Intrinsics.g(lowerCase2, "high")) {
                                        if (yp80Var != null) {
                                            yp80Var.y1.setTag(arrayList.get(i4));
                                            Unit unit19 = Unit.a;
                                        }
                                        if (yp80Var != null) {
                                            yp80Var.K0.setText("");
                                            Unit unit20 = Unit.a;
                                        }
                                        if (yp80Var != null) {
                                            yp80Var.e1.setText("");
                                            Unit unit21 = Unit.a;
                                        }
                                        spin2WinButtonBoard.L(yp80Var != null ? yp80Var.K0 : null, yp80Var != null ? yp80Var.e1 : null, yp80Var != null ? yp80Var.W : null, yp80Var != null ? yp80Var.C : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                    } else if (Intrinsics.g(lowerCase2, "low")) {
                                        if (yp80Var != null) {
                                            yp80Var.B1.setTag(arrayList.get(i4));
                                            Unit unit22 = Unit.a;
                                        }
                                        if (yp80Var != null) {
                                            yp80Var.N0.setText("");
                                            Unit unit23 = Unit.a;
                                        }
                                        if (yp80Var != null) {
                                            yp80Var.h1.setText("");
                                            Unit unit24 = Unit.a;
                                        }
                                        spin2WinButtonBoard.L(yp80Var != null ? yp80Var.N0 : null, yp80Var != null ? yp80Var.h1 : null, yp80Var != null ? yp80Var.Z : null, yp80Var != null ? yp80Var.F : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                    }
                                }
                                break;
                            case -338441228:
                                if (!category.equals("HIGH_LOW_COLOUR")) {
                                    break;
                                } else {
                                    String betType4 = ((LocalGameDetailsEntity) arrayList.get(i4)).getBetType();
                                    if (betType4 != null) {
                                        lowerCase3 = betType4.toLowerCase(Locale.ROOT);
                                        lowerCase3.getClass();
                                    } else {
                                        lowerCase3 = null;
                                    }
                                    if (lowerCase3 == null) {
                                        break;
                                    } else {
                                        switch (lowerCase3.hashCode()) {
                                            case -1684921228:
                                                if (lowerCase3.equals("high_red")) {
                                                    if (yp80Var != null) {
                                                        yp80Var.A1.setTag(arrayList.get(i4));
                                                        Unit unit25 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.A1.setBackgroundColor(spin2WinButtonBoard.getContext().getColor(R.color.default_spin2win_board));
                                                        Unit unit26 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.M0.setText("");
                                                        Unit unit27 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.g1.setText("");
                                                        Unit unit28 = Unit.a;
                                                    }
                                                    spin2WinButtonBoard.L(yp80Var != null ? yp80Var.M0 : null, yp80Var != null ? yp80Var.g1 : null, yp80Var != null ? yp80Var.Y : null, yp80Var != null ? yp80Var.E : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                                }
                                                break;
                                            case -700790956:
                                                if (lowerCase3.equals("low_black")) {
                                                    if (yp80Var != null) {
                                                        yp80Var.C1.setTag(arrayList.get(i4));
                                                        Unit unit29 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.C1.setBackgroundColor(spin2WinButtonBoard.getContext().getColor(R.color.default_spin2win_board));
                                                        Unit unit30 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.O0.setText("");
                                                        Unit unit31 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.i1.setText("");
                                                        Unit unit32 = Unit.a;
                                                    }
                                                    spin2WinButtonBoard.L(yp80Var != null ? yp80Var.O0 : null, yp80Var != null ? yp80Var.i1 : null, yp80Var != null ? yp80Var.a0 : null, yp80Var != null ? yp80Var.G : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                                }
                                                break;
                                            case -21197022:
                                                if (lowerCase3.equals("high_black")) {
                                                    if (yp80Var != null) {
                                                        yp80Var.z1.setTag(arrayList.get(i4));
                                                        Unit unit33 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.z1.setBackgroundColor(spin2WinButtonBoard.getContext().getColor(R.color.default_spin2win_board));
                                                        Unit unit34 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.L0.setText("");
                                                        Unit unit35 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.f1.setText("");
                                                        Unit unit36 = Unit.a;
                                                    }
                                                    spin2WinButtonBoard.L(yp80Var != null ? yp80Var.L0 : null, yp80Var != null ? yp80Var.f1 : null, yp80Var != null ? yp80Var.X : null, yp80Var != null ? yp80Var.D : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                                }
                                                break;
                                            case 356827430:
                                                if (lowerCase3.equals("low_red")) {
                                                    if (yp80Var != null) {
                                                        yp80Var.D1.setTag(arrayList.get(i4));
                                                        Unit unit37 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.D1.setBackgroundColor(spin2WinButtonBoard.getContext().getColor(R.color.default_spin2win_board));
                                                        Unit unit38 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.P0.setText("");
                                                        Unit unit39 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.j1.setText("");
                                                        Unit unit40 = Unit.a;
                                                    }
                                                    spin2WinButtonBoard.L(yp80Var != null ? yp80Var.P0 : null, yp80Var != null ? yp80Var.j1 : null, yp80Var != null ? yp80Var.b0 : null, yp80Var != null ? yp80Var.H : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                                }
                                                break;
                                        }
                                    }
                                }
                                break;
                            case 65241624:
                                if (category.equals("DOZEN") && (betType = ((LocalGameDetailsEntity) arrayList.get(i4)).getBetType()) != null) {
                                    int iHashCode = betType.hashCode();
                                    if (iHashCode != 1504573) {
                                        if (iHashCode != 46816717) {
                                            if (iHashCode == 47799853 && betType.equals("25-36")) {
                                                if (yp80Var != null) {
                                                    yp80Var.o1.setTag(arrayList.get(i4));
                                                    Unit unit41 = Unit.a;
                                                }
                                                if (yp80Var != null) {
                                                    yp80Var.A0.setText("");
                                                    Unit unit42 = Unit.a;
                                                }
                                                if (yp80Var != null) {
                                                    yp80Var.U0.setText("");
                                                    Unit unit43 = Unit.a;
                                                }
                                                spin2WinButtonBoard.L(yp80Var != null ? yp80Var.A0 : null, yp80Var != null ? yp80Var.U0 : null, yp80Var != null ? yp80Var.M : null, yp80Var != null ? yp80Var.d : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                            }
                                        } else if (betType.equals("13-24")) {
                                            if (yp80Var != null) {
                                                yp80Var.n1.setTag(arrayList.get(i4));
                                                Unit unit44 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                yp80Var.z0.setText("");
                                                Unit unit45 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                yp80Var.T0.setText("");
                                                Unit unit46 = Unit.a;
                                            }
                                            spin2WinButtonBoard.L(yp80Var != null ? yp80Var.z0 : null, yp80Var != null ? yp80Var.T0 : null, yp80Var != null ? yp80Var.L : null, yp80Var != null ? yp80Var.c : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                        }
                                    } else if (betType.equals("1-12")) {
                                        if (yp80Var != null) {
                                            yp80Var.m1.setTag(arrayList.get(i4));
                                            Unit unit47 = Unit.a;
                                        }
                                        if (yp80Var != null) {
                                            yp80Var.y0.setText("");
                                            Unit unit48 = Unit.a;
                                        }
                                        if (yp80Var != null) {
                                            yp80Var.S0.setText("");
                                            Unit unit49 = Unit.a;
                                        }
                                        spin2WinButtonBoard.L(yp80Var != null ? yp80Var.y0 : null, yp80Var != null ? yp80Var.S0 : null, yp80Var != null ? yp80Var.K : null, yp80Var != null ? yp80Var.b : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                    }
                                }
                                break;
                            case 1061088362:
                                if (category.equals("EVEN_ODD")) {
                                    String betType5 = ((LocalGameDetailsEntity) arrayList.get(i4)).getBetType();
                                    if (betType5 != null) {
                                        lowerCase4 = betType5.toLowerCase(Locale.ROOT);
                                        lowerCase4.getClass();
                                    } else {
                                        lowerCase4 = null;
                                    }
                                    if (Intrinsics.g(lowerCase4, ACKxwYRsuWyGz.LdpWJ)) {
                                        if (yp80Var != null) {
                                            yp80Var.v1.setTag(arrayList.get(i4));
                                            Unit unit50 = Unit.a;
                                        }
                                        if (yp80Var != null) {
                                            yp80Var.H0.setText("");
                                            Unit unit51 = Unit.a;
                                        }
                                        if (yp80Var != null) {
                                            yp80Var.b1.setText("");
                                            Unit unit52 = Unit.a;
                                        }
                                        spin2WinButtonBoard.L(yp80Var != null ? yp80Var.H0 : null, yp80Var != null ? yp80Var.b1 : null, yp80Var != null ? yp80Var.T : null, yp80Var != null ? yp80Var.z : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                    } else if (Intrinsics.g(lowerCase4, "odd")) {
                                        if (yp80Var != null) {
                                            yp80Var.E1.setTag(arrayList.get(i4));
                                            Unit unit53 = Unit.a;
                                        }
                                        if (yp80Var != null) {
                                            yp80Var.Q0.setText("");
                                            Unit unit54 = Unit.a;
                                        }
                                        if (yp80Var != null) {
                                            yp80Var.k1.setText("");
                                            Unit unit55 = Unit.a;
                                        }
                                        spin2WinButtonBoard.L(yp80Var != null ? yp80Var.Q0 : null, yp80Var != null ? yp80Var.k1 : null, yp80Var != null ? yp80Var.c0 : null, yp80Var != null ? yp80Var.I : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                    }
                                }
                                break;
                            case 1993454028:
                                if (category.equals("COLOUR")) {
                                    String betType6 = ((LocalGameDetailsEntity) arrayList.get(i4)).getBetType();
                                    if (betType6 != null) {
                                        lowerCase5 = betType6.toLowerCase(Locale.ROOT);
                                        lowerCase5.getClass();
                                    } else {
                                        lowerCase5 = null;
                                    }
                                    if (lowerCase5 != null) {
                                        int iHashCode2 = lowerCase5.hashCode();
                                        if (iHashCode2 != 112785) {
                                            if (iHashCode2 != 93818879) {
                                                if (iHashCode2 == 98619139 && lowerCase5.equals("green")) {
                                                    if (yp80Var != null) {
                                                        yp80Var.x1.setTag(arrayList.get(i4));
                                                        Unit unit56 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.x1.setBackgroundColor(spin2WinButtonBoard.getContext().getColor(R.color.default_spin2win_board));
                                                        Unit unit57 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.J0.setText("");
                                                        Unit unit58 = Unit.a;
                                                    }
                                                    if (yp80Var != null) {
                                                        yp80Var.d1.setText("");
                                                        Unit unit59 = Unit.a;
                                                    }
                                                    spin2WinButtonBoard.L(yp80Var != null ? yp80Var.J0 : null, yp80Var != null ? yp80Var.d1 : null, yp80Var != null ? yp80Var.V : null, yp80Var != null ? yp80Var.B : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                                }
                                            } else if (lowerCase5.equals("black")) {
                                                if (yp80Var != null) {
                                                    yp80Var.r1.setTag(arrayList.get(i4));
                                                    Unit unit60 = Unit.a;
                                                }
                                                if (yp80Var != null) {
                                                    yp80Var.r1.setBackgroundColor(spin2WinButtonBoard.getContext().getColor(R.color.default_spin2win_board));
                                                    Unit unit61 = Unit.a;
                                                }
                                                if (yp80Var != null) {
                                                    yp80Var.D0.setText("");
                                                    Unit unit62 = Unit.a;
                                                }
                                                if (yp80Var != null) {
                                                    yp80Var.X0.setText("");
                                                    Unit unit63 = Unit.a;
                                                }
                                                spin2WinButtonBoard.L(yp80Var != null ? yp80Var.D0 : null, yp80Var != null ? yp80Var.X0 : null, yp80Var != null ? yp80Var.P : null, yp80Var != null ? yp80Var.i : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                            }
                                        } else if (lowerCase5.equals("red")) {
                                            if (yp80Var != null) {
                                                yp80Var.F1.setTag(arrayList.get(i4));
                                                Unit unit64 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                yp80Var.F1.setBackgroundColor(spin2WinButtonBoard.getContext().getColor(R.color.default_spin2win_board));
                                                Unit unit65 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                yp80Var.R0.setText("");
                                                Unit unit66 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                yp80Var.l1.setText("");
                                                Unit unit67 = Unit.a;
                                            }
                                            spin2WinButtonBoard.L(yp80Var != null ? yp80Var.R0 : null, yp80Var != null ? yp80Var.l1 : null, yp80Var != null ? yp80Var.d0 : null, yp80Var != null ? yp80Var.J : null, (LocalGameDetailsEntity) arrayList.get(i4), betChipList, AnalyticsParam.DATA_NORMAL);
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }
            }
        }
        wxi wxiVar4 = this.v;
        if (wxiVar4 != null) {
            wxiVar4.i.J();
        }
        wxi wxiVar5 = this.v;
        if (wxiVar5 != null) {
            wxiVar5.J.M();
        }
    }

    public final void N0() {
        androidx.fragment.app.e activity;
        if (getContext() != null && (activity = getActivity()) != null) {
            fo2 fo2Var = new fo2(activity, vZBMKENANSz.hujLcEXSHNz);
            fo2Var.H = new Function2() { // from class: sya0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj).intValue();
                    int iIntValue2 = ((Integer) obj2).intValue();
                    du2 du2VarU0 = this.a.u0();
                    PagingFetchType pagingFetchType = PagingFetchType.VIEW_MORE;
                    pagingFetchType.getClass();
                    ej5.c(o8i0.d(du2VarU0), null, null, new st2(du2VarU0, pagingFetchType, iIntValue, iIntValue2, null), 3);
                    return Unit.a;
                }
            };
            fo2Var.I = new cla(this, 2);
            fo2Var.d();
            xp80 xp80Var = new xp80();
            xp80Var.e = activity;
            fo2Var.g(xp80Var, Integer.valueOf(R.drawable.spin2win_bet_history_bg));
            fo2Var.b();
            this.D = fo2Var;
            fo2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: tya0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    a1b0 a1b0Var = this.a;
                    fo2 fo2Var2 = a1b0Var.D;
                    if (fo2Var2 != null) {
                        fo2Var2.c();
                    }
                    GameDetails gameDetails = a1b0Var.i;
                    String name = gameDetails != null ? gameDetails.getName() : null;
                    if (name == null) {
                        name = "";
                    }
                    wz.a("PopupAction", name, "Logged in", "Bet History", "Close");
                }
            });
        }
    }
}
