package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.navigation.NavigationView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.components.SgErrorToastContainer;
import com.sportygames.commons.components.a;
import com.sportygames.commons.models.LeftMenuButton;
import com.sportygames.commons.models.MenuIconSize;
import com.sportygames.commons.models.OnboardingItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.LobbyMetaInfo;
import com.sportygames.spinmatch.components.BetChips;
import com.sportygames.spinmatch.components.BetConfig;
import com.sportygames.spinmatch.components.RoundResult;
import com.sportygames.spinmatch.components.SMHeaderContainer;
import com.sportygames.spinmatch.components.WheelLayout;
import com.sportygames.spinmatch.model.request.PlaceBetPayload;
import com.sportygames.spinmatch.model.response.ChatRoomResponse;
import com.sportygames.spinmatch.model.response.DetailResponse;
import com.sportygames.spinmatch.model.response.UserValidateResponse;
import com.sportygames.sportyherov2.components.SHToastContainer;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.xml.KonfettiView;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkab0;", "Landroidx/fragment/app/Fragment;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "", "Lbb;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class kab0 extends Fragment implements GameMainActivity.b, bb {
    public PromotionGiftsResponse A;
    public xi60 B;
    public boolean C;
    public SharedPreferences D;
    public SharedPreferences.Editor E;
    public final q8i0 F;
    public fo2 G;
    public final q8i0 H;
    public xbg I;
    public final q8i0 J;
    public com.sportygames.commons.components.a K;
    public String L;
    public double M;
    public boolean N;
    public boolean O;
    public final String P;
    public final ArrayList<String> Q;
    public boolean R;
    public List<GameDetails> S;
    public boolean T;
    public boolean U;
    public com.sportygames.commons.components.a V;
    public List<ChatRoomResponse> W;
    public boolean X;
    public boolean Y;
    public int Z;
    public final j1b a;
    public final x0g a0;
    public GameDetails b;
    public String b0;
    public fo80 c;
    public z66 c0;
    public UserValidateResponse d;
    public boolean d0;
    public final q8i0 e;
    public final q8i0 e0;
    public HashMap<Integer, List<Double>> f;
    public final q8i0 f0;
    public float g0;
    public float h0;
    public int i;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public nle l0;
    public mke m0;
    public long n0;
    public final b o0;
    public double v;
    public ArrayList<Double> w;
    public ArrayList<DetailResponse.BetConfigList> y;
    public DetailResponse z;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class a0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ttr ttrVar) {
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

    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            editable.getClass();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            charSequence.getClass();
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            AppCompatImageView redMark;
            AppCompatImageView redMark2;
            kab0 kab0Var = kab0.this;
            charSequence.getClass();
            try {
                double d = kab0Var.M;
                DetailResponse detailResponse = kab0Var.z;
                kab0Var.H0(d, detailResponse != null ? detailResponse.getMinStakeAmount() : 0.0d);
                double d2 = kab0Var.M;
                DetailResponse detailResponse2 = kab0Var.z;
                double minStakeAmount = detailResponse2 != null ? detailResponse2.getMinStakeAmount() : 0.0d;
                fo80 fo80Var = kab0Var.c;
                if (d2 < minStakeAmount) {
                    if (fo80Var != null && (redMark2 = fo80Var.G.getRedMark()) != null) {
                        redMark2.setVisibility(0);
                    }
                    fo80 fo80Var2 = kab0Var.c;
                    if (fo80Var2 != null) {
                        fo80Var2.F.F(R.drawable.hamberger_add_more_red);
                        return;
                    }
                    return;
                }
                if (fo80Var != null && (redMark = fo80Var.G.getRedMark()) != null) {
                    redMark.setVisibility(8);
                }
                fo80 fo80Var3 = kab0Var.c;
                if (fo80Var3 != null) {
                    fo80Var3.F.F(R.drawable.hamberger_add_money_spin_match_bg);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
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

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return kab0.this.requireActivity().getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return kab0.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class f extends qlr implements Function0<r8i0.c> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return kab0.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class g extends qlr implements Function0<v8i0> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return kab0.this.requireActivity().getViewModelStore();
        }
    }

    public static final class h extends qlr implements Function0<cyb> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return kab0.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class i extends qlr implements Function0<r8i0.c> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return kab0.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class j extends qlr implements Function0<v8i0> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return kab0.this.requireActivity().getViewModelStore();
        }
    }

    public static final class k extends qlr implements Function0<cyb> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return kab0.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class l extends qlr implements Function0<r8i0.c> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return kab0.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class m extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? kab0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class n extends qlr implements Function0<Fragment> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return kab0.this;
        }
    }

    public static final class o extends qlr implements Function0<w8i0> {
        public final /* synthetic */ n a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(n nVar) {
            super(0);
            this.a = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class p extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class q extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ttr ttrVar) {
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

    public static final class r extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? kab0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class s extends qlr implements Function0<Fragment> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return kab0.this;
        }
    }

    public static final class t extends qlr implements Function0<w8i0> {
        public final /* synthetic */ s a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(s sVar) {
            super(0);
            this.a = sVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class u extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class v extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ttr ttrVar) {
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

    public static final class w extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? kab0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class x extends qlr implements Function0<Fragment> {
        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return kab0.this;
        }
    }

    public static final class y extends qlr implements Function0<w8i0> {
        public final /* synthetic */ x a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(x xVar) {
            super(0);
            this.a = xVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class z extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public kab0() {
        pfd pfdVar = fse.a;
        this.a = w5b.a(gku.a);
        s sVar = new s();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new t(sVar));
        this.e = new q8i0(jq40.a(nbb0.class), new u(ttrVarA), new w(ttrVarA), new v(ttrVarA));
        this.f = new HashMap<>();
        this.w = new ArrayList<>();
        this.y = new ArrayList<>();
        ttr ttrVarA2 = hwr.a(a1sVar, new y(new x()));
        this.F = new q8i0(jq40.a(ypa0.class), new z(ttrVarA2), new m(ttrVarA2), new a0(ttrVarA2));
        ttr ttrVarA3 = hwr.a(a1sVar, new o(new n()));
        this.H = new q8i0(jq40.a(fu2.class), new p(ttrVarA3), new r(ttrVarA3), new q(ttrVarA3));
        this.J = new q8i0(jq40.a(fq5.class), new d(), new f(), new e());
        this.L = "";
        this.N = true;
        this.O = true;
        this.P = "sg_spin_match";
        this.Q = kotlin.collections.b.f("sg_spin_match", "sg_common_dialog_message", "sg_chat", "sg_fbg_dialog", "sg_ham_menu", "sg_input_dialog", "sg_bethistory", "sg_common", "sg_exit_dialog", "sg_game_common", "currency_symbols", "sg_onboarding", "common_functions", "sg_campaign");
        TimeUnit.SECONDS.getClass();
        x0g x0gVar = new x0g();
        x0gVar.a = 1000L;
        x0gVar.b = 0.0014285714f;
        this.a0 = x0gVar;
        this.b0 = "en";
        this.e0 = new q8i0(jq40.a(fuj.class), new g(), new i(), new h());
        this.f0 = new q8i0(jq40.a(db6.class), new j(), new l(), new k());
        this.o0 = new b();
    }

    public final void C0(float f2, float f3) {
        int i2;
        boolean zBooleanValue;
        Map<String, Float> mapF;
        AppCompatImageView chat;
        Context context = getContext();
        if (context != null) {
            ArrayList<OnboardingItem> arrayListA = sny.a(context, "spin-match");
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
            this.Y = true;
            if (zBooleanValue) {
                this.U = false;
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new sab0(this, null), 3);
                return;
            }
            this.U = true;
            if (f2 == 0.0f || f3 == 0.0f) {
                mapF = o2g.a;
                mapF.getClass();
            } else {
                mapF = kpu.f(new Pair("SM_VIEW1_PERCENT", Float.valueOf(f2)), new Pair("SM_VIEW2_PERCENT", Float.valueOf(f3)));
            }
            if (this.b != null) {
                fo80 fo80Var = this.c;
                boolean z2 = (fo80Var == null || (chat = fo80Var.G.getChat()) == null || chat.getVisibility() != 0) ? false : true;
                FragmentManager childFragmentManager = getChildFragmentManager();
                androidx.fragment.app.a aVarA = oke.a(childFragmentManager, childFragmentManager);
                op5.a.getClass();
                List<? extends File> list = op5.b;
                com.sportygames.commons.views.a.b bVar = new com.sportygames.commons.views.a.b() { // from class: o9b0
                    @Override // com.sportygames.commons.views.a.b
                    public final void a(int i3) {
                        fo80 fo80Var2;
                        vk2 binding;
                        ViewTreeObserver viewTreeObserver;
                        kab0 kab0Var = this.a;
                        if (i3 >= 1) {
                            try {
                                if ((kab0Var.f.size() != 0 && kab0Var.f.values().size() != 0) || (fo80Var2 = kab0Var.c) == null || (binding = fo80Var2.c.getBinding()) == null || (viewTreeObserver = binding.b.getViewTreeObserver()) == null) {
                                    return;
                                }
                                viewTreeObserver.addOnPreDrawListener(new tab0(kab0Var));
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                };
                com.sportygames.commons.views.a aVar = new com.sportygames.commons.views.a();
                aVar.c = "spin-match";
                aVar.d = i2;
                aVar.w = list;
                aVar.z = mapF;
                aVar.A = z2;
                aVar.v = bVar;
                aVarA.f(R.id.onboarding_images, aVar, null);
                aVarA.d();
            }
            fo80 fo80Var2 = this.c;
            if (fo80Var2 != null) {
                fo80Var2.L.setVisibility(0);
            }
        }
    }

    public final void D0(boolean z2) {
        GameDetails gameDetails = this.b;
        wz.a("PopupAction", gameDetails != null ? gameDetails.getName() : null, z2 ? "Logged in" : "Not logged in", "error_alert", "Exit");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void E0(boolean z2, boolean z3, Double d2, String str) {
        z0(false);
        ArrayList arrayList = new ArrayList();
        Set<Map.Entry<Integer, List<Double>>> setEntrySet = this.f.entrySet();
        setEntrySet.getClass();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strValueOf = String.valueOf(((Number) entry.getKey()).intValue());
            TreeMap treeMap = pw.a;
            Object value = entry.getValue();
            value.getClass();
            arrayList.add(new PlaceBetPayload.IndividualBetRequestList(strValueOf, new BigDecimal(CollectionsKt.s0((Iterable) value)).setScale(2, RoundingMode.HALF_EVEN).doubleValue()));
        }
        if (!z2) {
            String string = getString(R.string.place_bet);
            string.getClass();
            F0(string);
            PlaceBetPayload placeBetPayload = new PlaceBetPayload(arrayList, this.L, str, d2, Boolean.valueOf(z3), this.d0, null, 64, null);
            if (!yju.a("br")) {
                nbb0 nbb0VarW0 = w0();
                ej5.c(o8i0.d(nbb0VarW0), null, null, new tbb0(false, nbb0VarW0, placeBetPayload, null), 3);
                return;
            }
            nbb0 nbb0VarW1 = w0();
            androidx.fragment.app.e activity = getActivity();
            nbb0VarW1.w.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
            if (activity instanceof GameMainActivity) {
                GameMainActivity gameMainActivity = (GameMainActivity) activity;
                gameMainActivity.J1(new ubb0(nbb0VarW1, placeBetPayload, gameMainActivity.E), new vbb0(nbb0VarW1));
                return;
            }
            return;
        }
        String string2 = getString(R.string.rebet_sound);
        string2.getClass();
        F0(string2);
        fo80 fo80Var = this.c;
        if (fo80Var != null) {
            fo80Var.c.H();
        }
        PlaceBetPayload placeBetPayload2 = new PlaceBetPayload(arrayList, this.L, null, null, Boolean.FALSE, this.d0, null, 64, null);
        if (!yju.a("br")) {
            nbb0 nbb0VarW2 = w0();
            ej5.c(o8i0.d(nbb0VarW2), null, null, new ybb0(false, nbb0VarW2, placeBetPayload2, null), 3);
            return;
        }
        nbb0 nbb0VarW3 = w0();
        androidx.fragment.app.e activity2 = getActivity();
        nbb0VarW3.w.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
        if (activity2 instanceof GameMainActivity) {
            GameMainActivity gameMainActivity2 = (GameMainActivity) activity2;
            gameMainActivity2.J1(new wbb0(nbb0VarW3, placeBetPayload2, gameMainActivity2.E), new xbb0(nbb0VarW3));
        }
    }

    public final void F0(String str) {
        if (isVisible() && !isHidden() && this.R) {
            v0().A1(0L, str);
        }
    }

    public final void G0() {
        this.j0 = false;
        this.k0 = false;
        fo80 fo80Var = this.c;
        if (fo80Var != null) {
            fo80Var.H.setVisibility(8);
        }
        fo80 fo80Var2 = this.c;
        if (fo80Var2 != null) {
            BetConfig betConfig = fo80Var2.c;
            boolean z2 = this.j0;
            vk2 vk2Var = betConfig.binding;
            RecyclerView.f adapter = vk2Var != null ? vk2Var.b.getAdapter() : null;
            tk2 tk2Var = adapter instanceof tk2 ? (tk2) adapter : null;
            if (tk2Var != null) {
                tk2Var.v = z2;
            }
        }
        fo80 fo80Var3 = this.c;
        if (fo80Var3 != null) {
            fo80Var3.c.F(0.0d, u0(), false);
        }
        this.B = null;
        nbb0 nbb0VarW0 = w0();
        nbb0VarW0.c = null;
        nbb0VarW0.b = null;
    }

    public final void H0(double d2, double d3) {
        f6j0 binding;
        f6j0 binding2;
        fo80 fo80Var = this.c;
        if (d2 < d3) {
            if (fo80Var == null || (binding2 = fo80Var.c0.getBinding()) == null) {
                return;
            }
            binding2.b.setVisibility(0);
            return;
        }
        if (fo80Var == null || (binding = fo80Var.c0.getBinding()) == null) {
            return;
        }
        binding.b.setVisibility(8);
    }

    public final void I0() {
        Context context;
        androidx.fragment.app.e activity = getActivity();
        if (activity == null || (context = getContext()) == null) {
            return;
        }
        fo2 fo2Var = new fo2(activity, "Spin Match");
        fo2Var.H = new erp(this, 1);
        fo2Var.I = new l7b(this, 2);
        fo2Var.d();
        lq80 lq80Var = new lq80();
        lq80Var.e = context;
        fo2Var.e().setBackground(fo2Var.getContext().getDrawable(R.drawable.rush_bet_history_bg));
        SpinKitView spinKitView = fo2Var.O;
        if (spinKitView == null) {
            Intrinsics.n("spinKit");
            throw null;
        }
        spinKitView.setColor(fo2Var.getContext().getColor(R.color.redblack_bg_dark));
        RecyclerView recyclerViewF = fo2Var.f();
        fo2Var.getContext();
        recyclerViewF.setLayoutManager(new LinearLayoutManager());
        int i2 = 0;
        gn2 gn2Var = new gn2(fo2Var, i2);
        vm2 vm2Var = new vm2(fo2Var, i2);
        lq80Var.b = gn2Var;
        lq80Var.c = vm2Var;
        fo2Var.f().setAdapter(lq80Var);
        fo2Var.b();
        this.G = fo2Var;
        fo2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: aab0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kab0 kab0Var = this.a;
                GameDetails gameDetails = kab0Var.b;
                wz.a("PopupAction", gameDetails != null ? gameDetails.getName() : null, "Logged in", "Bet History", "Close");
                fo2 fo2Var2 = kab0Var.G;
                if (fo2Var2 != null) {
                    fo2Var2.c();
                }
            }
        });
    }

    public final void J0() {
        boolean z2;
        try {
            z2 = this.n0 != 0 && System.currentTimeMillis() - this.n0 < 30000;
            this.n0 = System.currentTimeMillis();
        } catch (Exception e2) {
            e2.printStackTrace();
            z2 = false;
        }
        if (z2) {
            return;
        }
        fo80 fo80Var = this.c;
        if (fo80Var != null) {
            fo80Var.E.setCampaignCompletedText();
        }
        fo80 fo80Var2 = this.c;
        if (fo80Var2 != null) {
            fo80Var2.E.setVisibility(0);
        }
        fo80 fo80Var3 = this.c;
        if (fo80Var3 != null) {
            fo80Var3.E.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_fade_out_toast));
        }
        ej5.c(ebs.a(getLifecycle()), null, null, new xab0(this, null), 3);
    }

    public final void K0(Context context, ResultWrapper.GenericError genericError) {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            t8b0 t8b0Var = t8b0.e;
            v0();
            jcg.d(t8b0Var, activity, "Spin Match", genericError, new bab0(this, 0), null, null, 0, context.getColor(R.color.try_again_color), null, null, null, new Function1() { // from class: cab0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    str.getClass();
                    this.a.r0(str);
                    return Unit.a;
                }
            }, null, 97760);
        }
    }

    public final void L0() {
        AppCompatImageView chat;
        AppCompatImageView chat2;
        AppCompatImageView chat3;
        fo80 fo80Var = this.c;
        boolean z2 = (fo80Var == null || (chat3 = fo80Var.G.getChat()) == null || chat3.getVisibility() != 0) ? false : true;
        boolean z3 = this.X;
        fo80 fo80Var2 = this.c;
        if (z3) {
            if (fo80Var2 != null && (chat2 = fo80Var2.G.getChat()) != null) {
                chat2.setVisibility(0);
            }
        } else if (fo80Var2 != null && (chat = fo80Var2.G.getChat()) != null) {
            chat.setVisibility(8);
        }
        if (z2 != this.X) {
            fo80 fo80Var3 = this.c;
            FrameLayout frameLayout = fo80Var3 != null ? fo80Var3.L : null;
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            if (frameLayout == null || frameLayout.getVisibility() != 0 || childFragmentManager.G(R.id.onboarding_images) == null) {
                return;
            }
            if (!yju.a("br")) {
                C0(this.g0, this.h0);
                return;
            }
            nle nleVar = this.l0;
            if (nleVar == null || nleVar.isShowing()) {
                return;
            }
            C0(this.g0, this.h0);
        }
    }

    public final void M0(boolean z2, Function0<Unit> function0) {
        Context context = getContext();
        if (context != null) {
            GameDetails gameDetails = this.b;
            nle nleVar = new nle(context, gameDetails != null ? gameDetails.getName() : null, Integer.valueOf(context.getColor(R.color.htp_spin_match_bg)), null, function0, 8);
            this.l0 = nleVar;
            nleVar.show();
            nle nleVar2 = this.l0;
            if (nleVar2 != null) {
                nleVar2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: dab0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        GameDetails gameDetails2 = this.a.b;
                        wz.a("PopupAction", gameDetails2 != null ? gameDetails2.getName() : null, "Logged in", "How to play", "Close");
                    }
                });
            }
            if (z2) {
                GameDetails gameDetails2 = this.b;
                wz.a("PaytableCheck", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
            }
        }
    }

    public final void N0(final boolean z2) {
        fo80 fo80Var = this.c;
        if (fo80Var != null) {
            fo80Var.c.setChipAlpha(0.5f);
        }
        SharedPreferences sharedPreferences = this.D;
        if (Intrinsics.g(sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("spin_match_one_tap", false)) : null, Boolean.TRUE)) {
            E0(z2, false, w0().b, w0().c);
            GameDetails gameDetails = this.b;
            wz.a("BetPlaced", gameDetails != null ? gameDetails.getName() : null, "On");
            return;
        }
        fo80 fo80Var2 = this.c;
        if (fo80Var2 != null) {
            fo80Var2.i.E();
        }
        GameDetails gameDetails2 = this.b;
        wz.a("BetPlaced", gameDetails2 != null ? gameDetails2.getName() : null, "Off");
        Context context = getContext();
        if (context != null) {
            Set<Map.Entry<Integer, List<Double>>> setEntrySet = this.f.entrySet();
            setEntrySet.getClass();
            Iterator<T> it = setEntrySet.iterator();
            double dS0 = 0.0d;
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                value.getClass();
                dS0 += CollectionsKt.s0((Iterable) value);
            }
            w0();
            String.valueOf(dS0);
            String string = getString(R.string.place_bet_message_cms);
            string.getClass();
            HashMap map = new HashMap();
            String string2 = getString(R.string.currency_cms);
            op5 op5Var = op5.a;
            String str = this.L;
            op5Var.getClass();
            map.put(string2, op5.i(str));
            String string3 = getString(R.string.amount_cms);
            TreeMap treeMap = pw.a;
            map.put(string3, String.valueOf(pw.a(krh0.l(dS0))));
            String string4 = context.getString(R.string.match_confirm_txt, op5.i(this.L), pw.a(krh0.l(dS0)));
            string4.getClass();
            v0();
            String strB = op5.b(string, string4, map);
            String string5 = getString(R.string.confirm_btn_cms);
            string5.getClass();
            String string6 = getString(R.string.confirm_bet);
            string6.getClass();
            String strB2 = op5.b(string5, string6, null);
            String string7 = getString(R.string.cancel_btn_cms);
            string7.getClass();
            String string8 = getString(R.string.cancel_bet);
            string8.getClass();
            this.K = com.sportygames.commons.components.a.C0437a.a("Spin Match", JsPluginCommon.GAMES_EXIT, strB, "", strB2, op5.b(string7, string8, null), new Function1() { // from class: u9b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    DetailResponse.BetConfigList betConfigList;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    kab0 kab0Var = this.a;
                    fo80 fo80Var3 = kab0Var.c;
                    if (fo80Var3 != null) {
                        BetChips betChips = fo80Var3.i;
                        Double dValueOf = Double.valueOf(kab0Var.v);
                        List<Double> list = kab0Var.f.get(Integer.valueOf(kab0Var.i));
                        betChips.J(dValueOf, list != null ? Double.valueOf(CollectionsKt.s0(list)) : null);
                    }
                    boolean z3 = z2;
                    if (zBooleanValue) {
                        fo80 fo80Var4 = kab0Var.c;
                        if (fo80Var4 != null) {
                            fo80Var4.i.I(false);
                        }
                        GameDetails gameDetails3 = kab0Var.b;
                        wz.a("BetConfirmed", gameDetails3 != null ? gameDetails3.getName() : null, new String[0]);
                        if (kab0Var.L.length() > 0) {
                            kab0Var.E0(z3, false, kab0Var.w0().b, kab0Var.w0().c);
                        }
                        kab0Var.getParentFragmentManager().a0();
                    } else {
                        GameDetails gameDetails4 = kab0Var.b;
                        wz.a("BetCancelled", gameDetails4 != null ? gameDetails4.getName() : null, new String[0]);
                        nbb0 nbb0VarW0 = kab0Var.w0();
                        nbb0VarW0.c = null;
                        nbb0VarW0.b = null;
                        if (!z3) {
                            String string9 = kab0Var.getString(R.string.clear_all);
                            string9.getClass();
                            kab0Var.F0(string9);
                            Iterator<Integer> it2 = kab0Var.f.keySet().iterator();
                            while (it2.hasNext()) {
                                int iIntValue = it2.next().intValue();
                                ArrayList<DetailResponse.BetConfigList> arrayList = kab0Var.y;
                                int size = arrayList.size();
                                int i2 = 0;
                                do {
                                    if (i2 >= size) {
                                        betConfigList = null;
                                        break;
                                    }
                                    betConfigList = arrayList.get(i2);
                                    i2++;
                                } while (betConfigList.getId() != iIntValue);
                                int iIndexOf = arrayList.indexOf(betConfigList);
                                boolean z4 = kab0Var.j0;
                                fo80 fo80Var5 = kab0Var.c;
                                if (z4) {
                                    if (fo80Var5 != null) {
                                        BetConfig betConfig = fo80Var5.c;
                                        List<Double> list2 = kab0Var.f.get(Integer.valueOf(kab0Var.i));
                                        betConfig.I(iIndexOf, list2 != null ? CollectionsKt.s0(list2) : 0.0d);
                                    }
                                } else if (fo80Var5 != null) {
                                    BetConfig betConfig2 = fo80Var5.c;
                                    List<Double> list3 = kab0Var.f.get(Integer.valueOf(kab0Var.i));
                                    betConfig2.E(iIndexOf, list3 != null ? CollectionsKt.s0(list3) : 0.0d, kab0Var.w, true);
                                }
                            }
                            fo80 fo80Var6 = kab0Var.c;
                            if (fo80Var6 != null) {
                                BetConfig betConfig3 = fo80Var6.c;
                                Set<Integer> setKeySet = kab0Var.f.keySet();
                                setKeySet.getClass();
                                betConfig3.J(CollectionsKt.A0(setKeySet));
                            }
                            kab0Var.f.clear();
                            fo80 fo80Var7 = kab0Var.c;
                            if (fo80Var7 != null) {
                                fo80Var7.b.setVisibility(8);
                            }
                            if (kab0Var.j0) {
                                kab0Var.G0();
                            }
                            fo80 fo80Var8 = kab0Var.c;
                            if (fo80Var8 != null) {
                                fo80Var8.c.setChipAlpha(1.0f);
                            }
                            fo80 fo80Var9 = kab0Var.c;
                            if (fo80Var9 != null) {
                                BetConfig betConfig4 = fo80Var9.c;
                                int iU0 = kab0Var.u0();
                                vk2 vk2Var = betConfig4.binding;
                                RecyclerView.f adapter = vk2Var != null ? vk2Var.b.getAdapter() : null;
                                adapter.getClass();
                                pfd pfdVar = fse.a;
                                ej5.c(w5b.a(gku.a), null, null, new uk2((tk2) adapter, iU0, null), 3);
                            }
                            fo80 fo80Var10 = kab0Var.c;
                            if (fo80Var10 != null) {
                                fo80Var10.i.F(true);
                            }
                            kab0Var.p0();
                        }
                        kab0Var.getParentFragmentManager().a0();
                    }
                    kab0Var.K = null;
                    return Unit.a;
                }
            }, new x02(2), context.getColor(R.color.redblack_confirm_dialog_left_button), context.getColor(R.color.redblack_confirm_dialog_right_button), 8192);
            androidx.fragment.app.e activity = getActivity();
            FragmentManager supportFragmentManager = activity != null ? activity.getSupportFragmentManager() : null;
            com.sportygames.commons.components.a aVar = this.K;
            if (aVar == null || supportFragmentManager == null) {
                return;
            }
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            aVar2.f(R.id.flContent, aVar, null);
            aVar2.c("CONFIRM_DIALOG_FRAGMENT");
            aVar2.d();
        }
    }

    public final void O0() {
        char c2;
        fo80 fo80Var = this.c;
        px80.a aVar = px80.a.a;
        px80.d dVar = px80.d.a;
        x0g x0gVar = this.a0;
        if (fo80Var != null) {
            KonfettiView konfettiView = fo80Var.J;
            c2 = 1;
            iuz iuzVar = new iuz(x0gVar);
            iuzVar.a(-75);
            iuzVar.f();
            iuzVar.e(kotlin.collections.b.k(dVar, aVar));
            iuzVar.b(kotlin.collections.b.k(16777215, 16766720, 12632256, 16740285, 5631999));
            iuzVar.d(80.0f);
            iuzVar.c(new i620.c(0.0d, 0.8d));
            p48.A(konfettiView.a, new trp(iuzVar.a, 0));
        } else {
            c2 = 1;
        }
        fo80 fo80Var2 = this.c;
        if (fo80Var2 != null) {
            KonfettiView konfettiView2 = fo80Var2.J;
            iuz iuzVar2 = new iuz(x0gVar);
            iuzVar2.a(255);
            iuzVar2.f();
            px80[] px80VarArr = new px80[2];
            px80VarArr[0] = dVar;
            px80VarArr[c2] = aVar;
            iuzVar2.e(kotlin.collections.b.k(px80VarArr));
            iuzVar2.b(kotlin.collections.b.k(16777215, 16766720, 12632256, 16740285, 5631999));
            iuzVar2.d(80.0f);
            iuzVar2.c(new i620.c(1.0d, 0.8d));
            p48.A(konfettiView2.a, new trp(iuzVar2.a, 0));
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
        if ((xnh0Var != null ? xnh0Var.a : null) == null || xnh0Var.a.length() <= 0) {
            return;
        }
        this.N = true;
        this.T = false;
        Context context = getContext();
        int length = ((context == null || (resources = context.getResources()) == null || (stringArray = resources.getStringArray(R.array.spin_match_array)) == null) ? 0 : stringArray.length) + 7;
        fo80 fo80Var = this.c;
        if (fo80Var != null) {
            fo80Var.N.setProgressForApi(100 / length);
        }
        fo80 fo80Var2 = this.c;
        if (fo80Var2 != null) {
            fo80Var2.N.L();
        }
        int i2 = 100 - ((100 / length) * length);
        fo80 fo80Var3 = this.c;
        if (fo80Var3 != null) {
            fo80Var3.N.O(i2);
        }
        fo80 fo80Var4 = this.c;
        if (fo80Var4 != null) {
            fo80Var4.N.setVisibility(0);
        }
        if (getContext() != null) {
            String strA = xwj.a();
            long versionCode = SportyGamesManager.getInstance().getVersionCode();
            GameDetails gameDetails = this.b;
            if (versionCode < ((gameDetails == null || (metaInfo = gameDetails.getMetaInfo()) == null || (minimumCMSVersionSupported = metaInfo.getMinimumCMSVersionSupported()) == null) ? 0L : minimumCMSVersionSupported.longValue())) {
                strA = "en";
            }
            ArrayList<String> arrayList = vlr.a.get("spin-match");
            if (arrayList != null && arrayList.contains(strA)) {
                this.b0 = xwj.a();
            }
            GameDetails gameDetails2 = this.b;
            if (gameDetails2 != null && (name = gameDetails2.getName()) != null) {
                nbb0 nbb0VarW0 = w0();
                ej5.c(o8i0.d(nbb0VarW0), null, null, new pbb0(nbb0VarW0, name, null), 3);
            }
            fo80 fo80Var5 = this.c;
            if (fo80Var5 != null) {
                fo80Var5.N.E((fq5) this.J.getValue(), this.Q, this.P, this.b0);
            }
        }
    }

    @Override // defpackage.bb
    public final void f0(m8 m8Var) {
        androidx.fragment.app.e activity;
        androidx.fragment.app.e activity2;
        Context context;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = nzf0.a;
        int i2 = 1;
        if (!z2 && jCurrentTimeMillis - nzf0.b <= 500) {
            z2 = true;
        }
        if (z2 || (activity = getActivity()) == null || activity.isFinishing() || (activity2 = getActivity()) == null || activity2.isDestroyed() || (context = getContext()) == null) {
            return;
        }
        hht hhtVar = new hht(context, "Spin Match");
        String string = getString(R.string.game_not_available);
        string.getClass();
        String string2 = getString(R.string.label_dialog_exit);
        string2.getClass();
        hhtVar.c(string, string2, new e8b(this, i2), new fab0(), context.getColor(R.color.try_again_color));
        hhtVar.a();
    }

    public final void j0(double d2) {
        DetailResponse.BetConfigList betConfigList;
        String str = "0.00";
        boolean zContainsKey = this.f.containsKey(Integer.valueOf(this.i));
        HashMap<Integer, List<Double>> map = this.f;
        int i2 = this.i;
        if (zContainsKey) {
            List<Double> list = map.get(Integer.valueOf(i2));
            if (list != null) {
                list.add(Double.valueOf(d2));
            }
            List<Double> list2 = this.f.get(Integer.valueOf(this.i));
            if (list2 != null) {
                CollectionsKt.j0(list2, Double.valueOf(d2));
            }
            if (list != null) {
                this.f.put(Integer.valueOf(this.i), list);
            }
        } else {
            map.put(Integer.valueOf(i2), kotlin.collections.b.l(Double.valueOf(d2)));
        }
        if ((this.f.size() == 1 && this.f.values().size() > 0) || this.f.size() > 1) {
            q0();
        }
        fo80 fo80Var = this.c;
        if (fo80Var != null) {
            BetChips betChips = fo80Var.i;
            Double dValueOf = Double.valueOf(this.v);
            List<Double> list3 = this.f.get(Integer.valueOf(this.i));
            betChips.J(dValueOf, list3 != null ? Double.valueOf(CollectionsKt.s0(list3)) : null);
        }
        fo80 fo80Var2 = this.c;
        if (fo80Var2 != null) {
            fo80Var2.i.I(true);
        }
        ArrayList<DetailResponse.BetConfigList> arrayList = this.y;
        int size = arrayList.size();
        int i3 = 0;
        do {
            if (i3 >= size) {
                betConfigList = null;
                break;
            } else {
                betConfigList = arrayList.get(i3);
                i3++;
            }
        } while (betConfigList.getId() != this.i);
        int iIndexOf = arrayList.indexOf(betConfigList);
        List<Double> list4 = this.f.get(Integer.valueOf(this.i));
        boolean z2 = list4 != null && list4.size() == 1;
        fo80 fo80Var3 = this.c;
        if (fo80Var3 != null) {
            BetConfig betConfig = fo80Var3.c;
            List<Double> list5 = this.f.get(Integer.valueOf(this.i));
            betConfig.E(iIndexOf, list5 != null ? CollectionsKt.s0(list5) : 0.0d, this.w, z2);
        }
        double dS0 = 0.0d;
        for (List<Double> list6 : this.f.values()) {
            list6.getClass();
            dS0 += CollectionsKt.s0(list6);
        }
        H0(this.M * 0.8d, dS0);
        if (dS0 > 0.0d) {
            op5 op5Var = op5.a;
            String string = getString(R.string.btn_spin_total_stake_text_cms);
            string.getClass();
            String string2 = getString(R.string.total_stake);
            string2.getClass();
            op5Var.getClass();
            String strB = op5.b(string, string2, null);
            String strI = op5.i(this.L);
            TreeMap treeMap = pw.a;
            try {
                String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dS0);
                str2.getClass();
                str = str2;
            } catch (Exception unused) {
            }
            String strA = tx5.a(strB, " : ", strI, " ", pw.a(str));
            fo80 fo80Var4 = this.c;
            if (fo80Var4 != null) {
                fo80Var4.b.setText(strA);
            }
            fo80 fo80Var5 = this.c;
            if (fo80Var5 != null) {
                fo80Var5.b.setVisibility(0);
            }
        } else {
            fo80 fo80Var6 = this.c;
            if (fo80Var6 != null) {
                fo80Var6.b.setVisibility(8);
            }
        }
        fo80 fo80Var7 = this.c;
        if (fo80Var7 != null) {
            fo80Var7.i.F(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object m0(TextView textView, double d2, String str, x1b x1bVar) {
        lab0 lab0Var;
        String str2;
        TranslateAnimation translateAnimation;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        TextView textView2 = textView;
        String str3 = "0.00";
        if (x1bVar instanceof lab0) {
            lab0Var = (lab0) x1bVar;
            int i2 = lab0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lab0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                lab0Var = new lab0(this, x1bVar);
            }
        } else {
            lab0Var = new lab0(this, x1bVar);
        }
        Object obj = lab0Var.b;
        y5b y5bVar = y5b.a;
        int i3 = lab0Var.d;
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
                    translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -2.5f);
                    str2 = "+ ";
                } else {
                    str2 = "- ";
                    translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.8f);
                }
                if (textView2 != null) {
                    TreeMap treeMap = pw.a;
                    try {
                        String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d2);
                        str4.getClass();
                        str3 = str4;
                    } catch (Exception unused) {
                    }
                    textView2.setText(str2 + pw.a(str3));
                }
                AnimationSet animationSet = new AnimationSet(true);
                translateAnimation.setDuration(1800L);
                animationSet.addAnimation(translateAnimation);
                if (textView2 != null) {
                    textView2.startAnimation(translateAnimation);
                }
                lab0Var.a = textView2;
                lab0Var.d = 1;
                if (hkd.b(900L, lab0Var) == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        }
        if (i3 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        textView2 = lab0Var.a;
        uj50.b(obj);
        if (textView2 != null && (viewPropertyAnimatorAnimate = textView2.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) != null) {
            viewPropertyAnimatorAlpha.setDuration(1500L);
        }
        return Unit.a;
    }

    public final void n0() {
        kk2 binding;
        kk2 binding2;
        DetailResponse.BetConfigList betConfigList;
        fo80 fo80Var = this.c;
        if (fo80Var != null) {
            BetChips betChips = fo80Var.i;
            Double dValueOf = Double.valueOf(0.0d);
            List<Double> list = this.f.get(Integer.valueOf(this.i));
            betChips.J(dValueOf, list != null ? Double.valueOf(CollectionsKt.s0(list)) : null);
        }
        fo80 fo80Var2 = this.c;
        if (fo80Var2 != null) {
            fo80Var2.i.I(false);
        }
        Iterator<Integer> it = this.f.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            ArrayList<DetailResponse.BetConfigList> arrayList = this.y;
            int size = arrayList.size();
            int i2 = 0;
            do {
                if (i2 >= size) {
                    betConfigList = null;
                    break;
                } else {
                    betConfigList = arrayList.get(i2);
                    i2++;
                }
            } while (betConfigList.getId() != iIntValue);
            int iIndexOf = arrayList.indexOf(betConfigList);
            boolean z2 = this.j0;
            fo80 fo80Var3 = this.c;
            if (z2) {
                if (fo80Var3 != null) {
                    BetConfig betConfig = fo80Var3.c;
                    List<Double> list2 = this.f.get(Integer.valueOf(this.i));
                    betConfig.I(iIndexOf, list2 != null ? CollectionsKt.s0(list2) : 0.0d);
                }
            } else if (fo80Var3 != null) {
                BetConfig betConfig2 = fo80Var3.c;
                List<Double> list3 = this.f.get(Integer.valueOf(this.i));
                betConfig2.E(iIndexOf, list3 != null ? CollectionsKt.s0(list3) : 0.0d, this.w, true);
            }
        }
        fo80 fo80Var4 = this.c;
        if (fo80Var4 != null) {
            BetConfig betConfig3 = fo80Var4.c;
            Set<Integer> setKeySet = this.f.keySet();
            setKeySet.getClass();
            betConfig3.J(CollectionsKt.A0(setKeySet));
        }
        this.f.clear();
        fo80 fo80Var5 = this.c;
        if (fo80Var5 != null) {
            fo80Var5.b.setVisibility(8);
        }
        p0();
        fo80 fo80Var6 = this.c;
        if (fo80Var6 != null && (binding2 = fo80Var6.i.getBinding()) != null) {
            binding2.e.setText("--");
        }
        fo80 fo80Var7 = this.c;
        if (fo80Var7 != null && (binding = fo80Var7.i.getBinding()) != null) {
            binding.c.setText("--");
        }
        double d2 = this.M;
        DetailResponse detailResponse = this.z;
        H0(d2, detailResponse != null ? detailResponse.getMinStakeAmount() : 0.0d);
    }

    public final void o0() {
        fo80 fo80Var;
        fo80 fo80Var2 = this.c;
        if (fo80Var2 != null) {
            fo80Var2.V.setAlpha(0.4f);
        }
        fo80 fo80Var3 = this.c;
        if (fo80Var3 != null) {
            fo80Var3.X.setAlpha(0.4f);
        }
        Context context = getContext();
        if (context != null && (fo80Var = this.c) != null) {
            fo80Var.W.setBackgroundColor(context.getColor(R.color.sg_spin_match_disable_undo_color));
        }
        fo80 fo80Var4 = this.c;
        if (fo80Var4 != null) {
            fo80Var4.W.setClickable(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof mke) {
            this.m0 = (mke) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.sg_fragment_spin_match, viewGroup, false);
        int i2 = R.id.amount;
        TextView textView = (TextView) h5e.a(R.id.amount, viewInflate);
        if (textView != null) {
            i2 = R.id.bet_config_data_list;
            BetConfig betConfig = (BetConfig) h5e.a(R.id.bet_config_data_list, viewInflate);
            if (betConfig != null) {
                i2 = R.id.button_layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.button_layout, viewInflate);
                if (constraintLayout != null) {
                    i2 = R.id.cashAddTxt;
                    TextView textView2 = (TextView) h5e.a(R.id.cashAddTxt, viewInflate);
                    if (textView2 != null) {
                        i2 = R.id.cashMinusTxt;
                        TextView textView3 = (TextView) h5e.a(R.id.cashMinusTxt, viewInflate);
                        if (textView3 != null) {
                            i2 = R.id.chip_layout;
                            BetChips betChips = (BetChips) h5e.a(R.id.chip_layout, viewInflate);
                            if (betChips != null) {
                                i2 = R.id.cordLayout;
                                if (((CoordinatorLayout) h5e.a(R.id.cordLayout, viewInflate)) != null) {
                                    i2 = R.id.delete_all;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.delete_all, viewInflate);
                                    if (constraintLayout2 != null) {
                                        i2 = R.id.delete_image;
                                        ImageView imageView = (ImageView) h5e.a(R.id.delete_image, viewInflate);
                                        if (imageView != null) {
                                            i2 = R.id.delete_text;
                                            TextView textView4 = (TextView) h5e.a(R.id.delete_text, viewInflate);
                                            if (textView4 != null) {
                                                i2 = R.id.drawer_layout;
                                                DrawerLayout drawerLayout = (DrawerLayout) h5e.a(R.id.drawer_layout, viewInflate);
                                                if (drawerLayout != null) {
                                                    i2 = R.id.error_toast;
                                                    SgErrorToastContainer sgErrorToastContainer = (SgErrorToastContainer) h5e.a(R.id.error_toast, viewInflate);
                                                    if (sgErrorToastContainer != null) {
                                                        i2 = R.id.flContent;
                                                        if (((FrameLayout) h5e.a(R.id.flContent, viewInflate)) != null) {
                                                            i2 = R.id.free_spin;
                                                            TextView textView5 = (TextView) h5e.a(R.id.free_spin, viewInflate);
                                                            if (textView5 != null) {
                                                                i2 = R.id.free_spin_layout;
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.free_spin_layout, viewInflate);
                                                                if (constraintLayout3 != null) {
                                                                    i2 = R.id.games_campaign_progress;
                                                                    ComposeView composeView = (ComposeView) h5e.a(R.id.games_campaign_progress, viewInflate);
                                                                    if (composeView != null) {
                                                                        i2 = R.id.gift_toast_bar;
                                                                        GiftToast giftToast = (GiftToast) h5e.a(R.id.gift_toast_bar, viewInflate);
                                                                        if (giftToast != null) {
                                                                            i2 = R.id.hamburger_menu;
                                                                            SGHamburgerMenu sGHamburgerMenu = (SGHamburgerMenu) h5e.a(R.id.hamburger_menu, viewInflate);
                                                                            if (sGHamburgerMenu != null) {
                                                                                i2 = R.id.header;
                                                                                SMHeaderContainer sMHeaderContainer = (SMHeaderContainer) h5e.a(R.id.header, viewInflate);
                                                                                if (sMHeaderContainer != null) {
                                                                                    i2 = R.id.ic_fbg;
                                                                                    ImageView imageView2 = (ImageView) h5e.a(R.id.ic_fbg, viewInflate);
                                                                                    if (imageView2 != null) {
                                                                                        i2 = R.id.layout;
                                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.layout, viewInflate);
                                                                                        if (constraintLayout4 != null) {
                                                                                            i2 = R.id.layout_toasts;
                                                                                            if (((ConstraintLayout) h5e.a(R.id.layout_toasts, viewInflate)) != null) {
                                                                                                i2 = R.id.match_konfetti;
                                                                                                KonfettiView konfettiView = (KonfettiView) h5e.a(R.id.match_konfetti, viewInflate);
                                                                                                if (konfettiView != null) {
                                                                                                    i2 = R.id.navigationView;
                                                                                                    if (((NavigationView) h5e.a(R.id.navigationView, viewInflate)) != null) {
                                                                                                        i2 = R.id.new_round_btn;
                                                                                                        TextView textView6 = (TextView) h5e.a(R.id.new_round_btn, viewInflate);
                                                                                                        if (textView6 != null) {
                                                                                                            i2 = R.id.onboarding_images;
                                                                                                            FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.onboarding_images, viewInflate);
                                                                                                            if (frameLayout != null) {
                                                                                                                i2 = R.id.one_free_spin_layout;
                                                                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.one_free_spin_layout, viewInflate);
                                                                                                                if (constraintLayout5 != null) {
                                                                                                                    i2 = R.id.progress_meter_component;
                                                                                                                    ProgressMeterComponent progressMeterComponent = (ProgressMeterComponent) h5e.a(R.id.progress_meter_component, viewInflate);
                                                                                                                    if (progressMeterComponent != null) {
                                                                                                                        i2 = R.id.rebet_btn;
                                                                                                                        TextView textView7 = (TextView) h5e.a(R.id.rebet_btn, viewInflate);
                                                                                                                        if (textView7 != null) {
                                                                                                                            i2 = R.id.rebet_layout;
                                                                                                                            ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.rebet_layout, viewInflate);
                                                                                                                            if (constraintLayout6 != null) {
                                                                                                                                i2 = R.id.result;
                                                                                                                                RoundResult roundResult = (RoundResult) h5e.a(R.id.result, viewInflate);
                                                                                                                                if (roundResult != null) {
                                                                                                                                    i2 = R.id.spin;
                                                                                                                                    TextView textView8 = (TextView) h5e.a(R.id.spin, viewInflate);
                                                                                                                                    if (textView8 != null) {
                                                                                                                                        i2 = R.id.spin_color_layout;
                                                                                                                                        ConstraintLayout constraintLayout7 = (ConstraintLayout) h5e.a(R.id.spin_color_layout, viewInflate);
                                                                                                                                        if (constraintLayout7 != null) {
                                                                                                                                            i2 = R.id.spin_kit_symbol;
                                                                                                                                            SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.spin_kit_symbol, viewInflate);
                                                                                                                                            if (spinKitView != null) {
                                                                                                                                                i2 = R.id.spin_layout;
                                                                                                                                                ConstraintLayout constraintLayout8 = (ConstraintLayout) h5e.a(R.id.spin_layout, viewInflate);
                                                                                                                                                if (constraintLayout8 != null) {
                                                                                                                                                    i2 = R.id.undo_image;
                                                                                                                                                    ImageView imageView3 = (ImageView) h5e.a(R.id.undo_image, viewInflate);
                                                                                                                                                    if (imageView3 != null) {
                                                                                                                                                        i2 = R.id.undo_layout;
                                                                                                                                                        ConstraintLayout constraintLayout9 = (ConstraintLayout) h5e.a(R.id.undo_layout, viewInflate);
                                                                                                                                                        if (constraintLayout9 != null) {
                                                                                                                                                            i2 = R.id.undo_text;
                                                                                                                                                            TextView textView9 = (TextView) h5e.a(R.id.undo_text, viewInflate);
                                                                                                                                                            if (textView9 != null) {
                                                                                                                                                                i2 = R.id.view1;
                                                                                                                                                                View viewA = h5e.a(R.id.view1, viewInflate);
                                                                                                                                                                if (viewA != null) {
                                                                                                                                                                    i2 = R.id.view2;
                                                                                                                                                                    View viewA2 = h5e.a(R.id.view2, viewInflate);
                                                                                                                                                                    if (viewA2 != null) {
                                                                                                                                                                        i2 = R.id.view4;
                                                                                                                                                                        View viewA3 = h5e.a(R.id.view4, viewInflate);
                                                                                                                                                                        if (viewA3 != null) {
                                                                                                                                                                            i2 = R.id.view_divider;
                                                                                                                                                                            View viewA4 = h5e.a(R.id.view_divider, viewInflate);
                                                                                                                                                                            if (viewA4 != null) {
                                                                                                                                                                                i2 = R.id.wheel_game;
                                                                                                                                                                                WheelLayout wheelLayout = (WheelLayout) h5e.a(R.id.wheel_game, viewInflate);
                                                                                                                                                                                if (wheelLayout != null) {
                                                                                                                                                                                    i2 = R.id.win_toast_bar;
                                                                                                                                                                                    SHToastContainer sHToastContainer = (SHToastContainer) h5e.a(R.id.win_toast_bar, viewInflate);
                                                                                                                                                                                    if (sHToastContainer != null) {
                                                                                                                                                                                        i2 = R.id.you_have;
                                                                                                                                                                                        TextView textView10 = (TextView) h5e.a(R.id.you_have, viewInflate);
                                                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                                                            ConstraintLayout constraintLayout10 = (ConstraintLayout) viewInflate;
                                                                                                                                                                                            this.c = new fo80(constraintLayout10, textView, betConfig, constraintLayout, textView2, textView3, betChips, constraintLayout2, imageView, textView4, drawerLayout, sgErrorToastContainer, textView5, constraintLayout3, composeView, giftToast, sGHamburgerMenu, sMHeaderContainer, imageView2, constraintLayout4, konfettiView, textView6, frameLayout, constraintLayout5, progressMeterComponent, textView7, constraintLayout6, roundResult, textView8, constraintLayout7, spinKitView, constraintLayout8, imageView3, constraintLayout9, textView9, viewA, viewA2, viewA3, viewA4, wheelLayout, sHToastContainer, textView10);
                                                                                                                                                                                            return constraintLayout10;
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
        SportyGamesManager.getInstance().removeAccountUpdatedListener(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            t0().e.l(getViewLifecycleOwner());
            t0().d.l(getViewLifecycleOwner());
            t0().y1();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String name;
        String name2;
        super.onResume();
        this.R = true;
        GameDetails gameDetails = this.b;
        wz.a("GameForeground", gameDetails != null ? gameDetails.getName() : null, new String[0]);
        if (this.Y) {
            SharedPreferences sharedPreferences = this.D;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("spin_match_music", true)) : null;
            fo80 fo80Var = this.c;
            if (fo80Var != null) {
                ProgressMeterComponent progressMeterComponent = fo80Var.N;
                ypa0 ypa0VarV0 = v0();
                String string = getString(R.string.bg_music_spin_match);
                string.getClass();
                progressMeterComponent.K(ypa0VarV0, boolValueOf, string);
            }
        }
        GameDetails gameDetails2 = this.b;
        if (gameDetails2 == null || (name = gameDetails2.getName()) == null) {
            name = "";
        }
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        q8i0 q8i0Var = this.f0;
        ra6.c(name, viewLifecycleOwner, (db6) q8i0Var.getValue(), t0());
        GameDetails gameDetails3 = this.b;
        String str = (gameDetails3 == null || (name2 = gameDetails3.getName()) == null) ? "" : name2;
        androidx.fragment.app.e activity = getActivity();
        ibs viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        fo80 fo80Var2 = this.c;
        ra6.b(str, activity, viewLifecycleOwner2, fo80Var2 != null ? fo80Var2.D : null, this.c0, t0(), (db6) q8i0Var.getValue(), 0L, Float.valueOf(3.0f), new tld0(this.b), new az6(this, 1), new x3b(this, 2), null, 17792);
        t0().x1();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        this.R = false;
        GameDetails gameDetails = this.b;
        wz.a("GameBackground", gameDetails != null ? gameDetails.getName() : null, new String[0]);
        v0().G1();
        if (this.c != null) {
            v0().I1();
        }
        super.onStop();
    }

    /* JADX WARN: Failed to calculate best type for var: r11v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v16 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v17 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v4 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v45 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v45 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: double
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 1812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kab0.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void p0() {
        fo80 fo80Var = this.c;
        if (fo80Var != null) {
            fo80Var.V.setAlpha(0.4f);
        }
        fo80 fo80Var2 = this.c;
        if (fo80Var2 != null) {
            fo80Var2.X.setAlpha(0.4f);
        }
        Context context = getContext();
        if (context != null) {
            fo80 fo80Var3 = this.c;
            if (fo80Var3 != null) {
                fo80Var3.b0.setBackgroundColor(context.getColor(R.color.sg_spin_match_divider_de_color));
            }
            fo80 fo80Var4 = this.c;
            if (fo80Var4 != null) {
                fo80Var4.R.setTextColor(context.getColor(R.color.sg_spin_match_disable_text_color));
            }
            fo80 fo80Var5 = this.c;
            if (fo80Var5 != null) {
                fo80Var5.S.setBackgroundColor(context.getColor(R.color.sg_spin_match_disable_spin_background_color));
            }
            fo80 fo80Var6 = this.c;
            if (fo80Var6 != null) {
                fo80Var6.W.setBackgroundColor(context.getColor(R.color.sg_spin_match_disable_undo_color));
            }
            fo80 fo80Var7 = this.c;
            if (fo80Var7 != null) {
                fo80Var7.v.setBackgroundColor(context.getColor(R.color.sg_spin_match_disable_undo_color));
            }
        }
        fo80 fo80Var8 = this.c;
        if (fo80Var8 != null) {
            fo80Var8.W.setClickable(false);
        }
        fo80 fo80Var9 = this.c;
        if (fo80Var9 != null) {
            fo80Var9.w.setAlpha(0.4f);
        }
        fo80 fo80Var10 = this.c;
        if (fo80Var10 != null) {
            fo80Var10.y.setAlpha(0.4f);
        }
        fo80 fo80Var11 = this.c;
        if (fo80Var11 != null) {
            fo80Var11.v.setClickable(false);
        }
        fo80 fo80Var12 = this.c;
        if (fo80Var12 != null) {
            fo80Var12.U.setClickable(false);
        }
    }

    public final void q0() {
        fo80 fo80Var = this.c;
        if (fo80Var != null) {
            fo80Var.V.setAlpha(1.0f);
        }
        fo80 fo80Var2 = this.c;
        if (fo80Var2 != null) {
            fo80Var2.X.setAlpha(1.0f);
        }
        Context context = getContext();
        if (context != null) {
            fo80 fo80Var3 = this.c;
            if (fo80Var3 != null) {
                fo80Var3.b0.setBackgroundColor(context.getColor(R.color.sg_spin_match_divider_color));
            }
            fo80 fo80Var4 = this.c;
            if (fo80Var4 != null) {
                fo80Var4.R.setTextColor(context.getColor(R.color.white));
            }
            fo80 fo80Var5 = this.c;
            if (fo80Var5 != null) {
                fo80Var5.S.setBackgroundColor(context.getColor(R.color.sg_spin_match_next_button));
            }
            fo80 fo80Var6 = this.c;
            if (fo80Var6 != null) {
                fo80Var6.W.setBackgroundColor(context.getColor(R.color.sg_spin_match_undo_button));
            }
            fo80 fo80Var7 = this.c;
            if (fo80Var7 != null) {
                fo80Var7.v.setBackgroundColor(context.getColor(R.color.sg_spin_match_undo_button));
            }
        }
        fo80 fo80Var8 = this.c;
        if (fo80Var8 != null) {
            fo80Var8.W.setClickable(true);
        }
        fo80 fo80Var9 = this.c;
        if (fo80Var9 != null) {
            fo80Var9.w.setAlpha(1.0f);
        }
        fo80 fo80Var10 = this.c;
        if (fo80Var10 != null) {
            fo80Var10.y.setAlpha(1.0f);
        }
        fo80 fo80Var11 = this.c;
        if (fo80Var11 != null) {
            fo80Var11.v.setClickable(true);
        }
        fo80 fo80Var12 = this.c;
        if (fo80Var12 != null) {
            fo80Var12.U.setClickable(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    public final void r0(String str) {
        svg svgVar;
        Integer numValueOf;
        androidx.fragment.app.e activity;
        String name;
        Integer id;
        if ((this.U || !this.Y) && str == null) {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        List<GameDetails> list = this.S;
        if (list != null) {
            GameDetails gameDetails = this.b;
            int iIntValue = (gameDetails == null || (id = gameDetails.getId()) == null) ? 0 : id.intValue();
            GameDetails gameDetails2 = this.b;
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
        int i2 = 1;
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
        if (numValueOf != null || (activity = getActivity()) == null) {
            return;
        }
        GameDetails gameDetails3 = this.b;
        wz.a("BackInGame", gameDetails3 != null ? gameDetails3.getName() : null, new String[0]);
        if (str == null) {
            v0();
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
            this.V = com.sportygames.commons.components.a.C0437a.a("Spin Match", JsPluginCommon.GAMES_EXIT, strB, "", strB2, op5.b(string5, string6, null), new Function1() { // from class: j9b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    iny onBackPressedDispatcher;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    kab0 kab0Var = this.a;
                    if (zBooleanValue) {
                        e activity4 = kab0Var.getActivity();
                        if (activity4 != null && (onBackPressedDispatcher = activity4.getOnBackPressedDispatcher()) != null) {
                            onBackPressedDispatcher.d();
                        }
                    } else {
                        e activity5 = kab0Var.getActivity();
                        if (activity5 != null) {
                            activity5.finish();
                        }
                    }
                    return Unit.a;
                }
            }, new q9b0(), activity.getColor(R.color.redblack_confirm_dialog_left_button), activity.getColor(R.color.redblack_confirm_dialog_right_button), 4096);
            androidx.fragment.app.e activity4 = getActivity();
            FragmentManager supportFragmentManager2 = activity4 != null ? activity4.getSupportFragmentManager() : null;
            com.sportygames.commons.components.a aVar2 = this.V;
            if (aVar2 != null && supportFragmentManager2 != null) {
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager2);
                aVar3.f(R.id.flContent, aVar2, null);
                aVar3.c("CONFIRM_DIALOG_FRAGMENT");
                aVar3.d();
            }
        } else {
            xbg xbgVar = this.I;
            if (xbgVar != null) {
                String string7 = getString(R.string.label_dialog_exit);
                string7.getClass();
                xbg.c(xbgVar, str, string7, new vnf(this, i2), new z9b0(), activity.getColor(R.color.try_again_color), 224);
                xbgVar.a();
            }
        }
        GameDetails gameDetails4 = this.b;
        wz.a("BackClicked", gameDetails4 != null ? gameDetails4.getName() : null, new String[0]);
        Unit unit = Unit.a;
    }

    public final fu2 s0() {
        return (fu2) this.H.getValue();
    }

    public final fuj t0() {
        return (fuj) this.e0.getValue();
    }

    public final int u0() {
        DetailResponse.BetConfigList betConfigList;
        ArrayList<DetailResponse.BetConfigList> arrayList = this.y;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            betConfigList = arrayList.get(i2);
            i2++;
            if (betConfigList.getId() == this.i) {
                return CollectionsKt.X(arrayList, betConfigList);
            }
        }
        betConfigList = null;
        return CollectionsKt.X(arrayList, betConfigList);
    }

    public final ypa0 v0() {
        return (ypa0) this.F.getValue();
    }

    public final nbb0 w0() {
        return (nbb0) this.e.getValue();
    }

    public final void y0(String str, String str2) {
        int i2;
        Boolean boolValueOf;
        qo80 binding;
        qo80 binding2;
        fo80 fo80Var;
        Integer numValueOf = Integer.valueOf(R.color.sg_spin_match_toggle_off_color);
        Integer numValueOf2 = Integer.valueOf(R.color.sg_spin_match_toggle_on_color);
        op5 op5Var = op5.a;
        String string = getString(R.string.music_cms);
        string.getClass();
        String string2 = getString(R.string.music_menu);
        string2.getClass();
        op5Var.getClass();
        String strB = op5.b(string, string2, null);
        MenuIconSize menuIconSize = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        cqp cqpVar = new cqp(1);
        SharedPreferences sharedPreferences = this.D;
        LeftMenuButton leftMenuButton = new LeftMenuButton(0, strB, R.drawable.music, menuIconSize, cqpVar, true, sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("spin_match_music", true)) : null, numValueOf2, numValueOf, null, false, new Function1() { // from class: v9b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                fo80 fo80Var2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                kab0 kab0Var = this.a;
                GameDetails gameDetails = kab0Var.b;
                wz.a("MusicClicked", gameDetails != null ? gameDetails.getName() : null, zBooleanValue ? "On" : "Off");
                SharedPreferences.Editor editor = kab0Var.E;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean("spin_match_music", true);
                    }
                    SharedPreferences.Editor editor2 = kab0Var.E;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    SharedPreferences sharedPreferences2 = kab0Var.D;
                    Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("spin_match_music", true)) : null;
                    SharedPreferences sharedPreferences3 = kab0Var.D;
                    Boolean boolValueOf3 = sharedPreferences3 != null ? Boolean.valueOf(sharedPreferences3.getBoolean("spin_match_sound", true)) : null;
                    Context context = kab0Var.getContext();
                    if (context != null && (fo80Var2 = kab0Var.c) != null) {
                        ProgressMeterComponent progressMeterComponent = fo80Var2.N;
                        String string3 = kab0Var.getString(R.string.spin_match_name);
                        string3.getClass();
                        rk60.b bVar = rk60.b.v;
                        GameDetails gameDetails2 = kab0Var.b;
                        ypa0 ypa0VarV0 = kab0Var.v0();
                        String string4 = kab0Var.getString(R.string.bg_music_spin_match);
                        string4.getClass();
                        progressMeterComponent.I("Spin Match/", string3, boolValueOf3, bVar, gameDetails2, context, ypa0VarV0, boolValueOf2, string4);
                    }
                } else {
                    if (editor != null) {
                        editor.putBoolean("spin_match_music", false);
                    }
                    SharedPreferences.Editor editor3 = kab0Var.E;
                    if (editor3 != null) {
                        editor3.apply();
                    }
                    if (kab0Var.c != null) {
                        kab0Var.v0().I1();
                    }
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
        w9b0 w9b0Var = new w9b0();
        SharedPreferences sharedPreferences2 = this.D;
        if (sharedPreferences2 != null) {
            i2 = 1;
            boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("spin_match_sound", true));
        } else {
            i2 = 1;
            boolValueOf = null;
        }
        LeftMenuButton leftMenuButton2 = new LeftMenuButton(0, strB2, R.drawable.ic_sound, menuIconSize2, w9b0Var, true, boolValueOf, numValueOf2, numValueOf, null, false, new znf(this, i2), 1536, null);
        String string5 = getString(R.string.one_tap_bet_cms);
        string5.getClass();
        String string6 = getString(R.string.onetap_bet_menu);
        string6.getClass();
        String strB3 = op5.b(string5, string6, null);
        MenuIconSize menuIconSize3 = new MenuIconSize(R.dimen._15sdp, R.dimen._10sdp);
        x9b0 x9b0Var = new x9b0();
        SharedPreferences sharedPreferences3 = this.D;
        LeftMenuButton leftMenuButton3 = new LeftMenuButton(0, strB3, R.drawable.ic_one_tap_bet, menuIconSize3, x9b0Var, true, sharedPreferences3 != null ? Boolean.valueOf(sharedPreferences3.getBoolean("spin_match_one_tap", false)) : null, numValueOf2, numValueOf, null, false, new il20(this, 1), 1536, null);
        String string7 = getString(R.string.how_to_play_nav_cms);
        string7.getClass();
        String string8 = getString(R.string.how_to_play_menu);
        string8.getClass();
        LeftMenuButton leftMenuButton4 = new LeftMenuButton(0, op5.b(string7, string8, null), R.drawable.ic_how_to_play, new MenuIconSize(R.dimen._13sdp, R.dimen._13sdp), new Function0() { // from class: y9b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FragmentManager supportFragmentManager;
                kab0 kab0Var = this.a;
                GameDetails gameDetails = kab0Var.b;
                Fragment fragmentG = null;
                wz.a("HTPClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                e activity = kab0Var.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    fragmentG = supportFragmentManager.G(R.id.flContent);
                }
                if (!(fragmentG instanceof a)) {
                    kab0Var.M0(false, new gab0());
                }
                return Unit.a;
            }
        }, false, null, null, null, null, false, null, 3072, null);
        String string9 = getString(R.string.bet_history_cms);
        string9.getClass();
        String string10 = getString(R.string.bethistory_menu);
        string10.getClass();
        int i3 = 2;
        LeftMenuButton leftMenuButton5 = new LeftMenuButton(0, op5.b(string9, string10, null), R.drawable.ic_bethistory, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new g7b(this, i3), false, null, null, null, null, false, null, 3072, null);
        String string11 = getString(R.string.game_limits_nav_cms);
        string11.getClass();
        String string12 = getString(R.string.game_limits);
        string12.getClass();
        List listK = kotlin.collections.b.k(leftMenuButton, leftMenuButton2, leftMenuButton3, leftMenuButton4, leftMenuButton5, new LeftMenuButton(0, op5.b(string11, string12, null), R.drawable.game_limit, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new rl20(this, 1), false, null, null, null, null, false, null, 3072, null));
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (fo80Var = this.c) != null) {
            SGHamburgerMenu.setup$default(fo80Var.F, new SGHamburgerMenu.b(v0(), R.string.spin_match_name, str2, str, listK, new c22(this, i3), new wnf(this, i3)), activity, false, null, null, 24, null);
        }
        fo80 fo80Var2 = this.c;
        if (fo80Var2 != null) {
            fo80Var2.F.setSpinMatchImage();
        }
        fo80 fo80Var3 = this.c;
        if (fo80Var3 == null || (binding = fo80Var3.F.getBinding()) == null) {
            return;
        }
        TextView textView = binding.c;
        fo80 fo80Var4 = this.c;
        String strValueOf = String.valueOf((fo80Var4 == null || (binding2 = fo80Var4.F.getBinding()) == null) ? null : binding2.c.getTag());
        String string13 = getString(R.string.label_dialog_add_money);
        string13.getClass();
        textView.setText("+ ".concat(op5.c(op5Var, strValueOf, string13)));
    }

    public final void z0(boolean z2) {
        vk2 vk2Var;
        RecyclerView.f adapter;
        fo80 fo80Var = this.c;
        if (fo80Var == null || (vk2Var = fo80Var.c.binding) == null || (adapter = vk2Var.b.getAdapter()) == null) {
            return;
        }
        tk2 tk2Var = (tk2) adapter;
        try {
            ArrayList<DetailResponse.BetConfigList> arrayList = tk2Var.a;
            if (arrayList != null) {
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    DetailResponse.BetConfigList betConfigList = arrayList.get(i3);
                    i3++;
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    RecyclerView recyclerView = tk2Var.c;
                    RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(i2));
                    d0VarQ.getClass();
                    tk2.a aVar = (tk2.a) d0VarQ;
                    ((ConstraintLayout) aVar.itemView.findViewById(R.id.parentLayout)).setClickable(z2);
                    aVar.a.d.setImageDrawable(null);
                    i2 = i4;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void I() {
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void d0() {
    }
}
