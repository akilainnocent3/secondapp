package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.LeftMenuButton;
import com.sportygames.commons.models.MenuIconSize;
import com.sportygames.commons.models.NetworkStateManager;
import com.sportygames.commons.models.OnboardingItem;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.LobbyMetaInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n2j.b;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Ln2j;", "Landroidx/fragment/app/Fragment;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "Lbb;", "<init>", "()V", "Ld4j;", "state", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class n2j extends Fragment implements GameMainActivity.b, bb {
    public float A;
    public float B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public nle I;
    public SharedPreferences J;
    public SharedPreferences.Editor K;
    public xbg L;
    public boolean M;
    public final ssw<Boolean> N;
    public int O;
    public double P;
    public boolean Q;
    public int R;
    public String S;
    public String T;
    public boolean U;
    public ArrayList<GameDetails> V;
    public fo2 W;
    public final ArrayList<mk2> X;
    public boolean Y;
    public ArrayList<Double> Z;
    public boolean a;
    public double a0;
    public djh b;
    public boolean b0;
    public GameDetails c;
    public List<GiftItem> c0;
    public final q8i0 d;
    public xi60 d0;
    public final q8i0 e;
    public boolean e0;
    public rso f;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public final c9i0 i;
    public boolean i0;
    public final q8i0 v;
    public final q8i0 w;
    public int y;
    public String z;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @c0d(c = "com.sportygames.fruithunt.views.FruitHuntBase$observeProgressBarVisibility$1$1", f = "FruitHuntBase.kt", l = {1754}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return n2j.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            djh djhVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            int i2 = 1;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(150L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            n2j n2jVar = n2j.this;
            djh djhVar2 = n2jVar.b;
            if (djhVar2 != null) {
                djhVar2.G.N();
            }
            djh djhVar3 = n2jVar.b;
            if (djhVar3 != null) {
                djhVar3.G.setVisibility(8);
            }
            if (n2jVar.g0) {
                SharedPreferences sharedPreferences = n2jVar.J;
                Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("MUSIC", true)) : null;
                if (n2jVar.isAdded() && (djhVar = n2jVar.b) != null) {
                    ProgressMeterComponent progressMeterComponent = djhVar.G;
                    ypa0 ypa0VarV0 = n2jVar.v0();
                    String string = n2jVar.getString(R.string.bg_music);
                    string.getClass();
                    progressMeterComponent.K(ypa0VarV0, boolValueOf, string);
                }
                if (!n2jVar.isRemoving()) {
                    if (yju.a("br")) {
                        n2jVar.T0(n2jVar.getActivity(), true, new h8e(n2jVar, i2));
                    } else {
                        djh djhVar4 = n2jVar.b;
                        if (((djhVar4 == null || djhVar4.w.B.getVisibility() != 0) ? n2j.H0(n2jVar, n2jVar.getContext(), 0.0f, 0.0f, 0.0f, 0.0f, WebSocketProtocol.PAYLOAD_SHORT) : false) && n2jVar.a && ((Boolean) n2jVar.t0().z.getValue()).booleanValue()) {
                            n2jVar.p0();
                        }
                    }
                }
            }
            djh djhVar5 = n2jVar.b;
            if (djhVar5 != null) {
                djhVar5.G.setVisibility(8);
            }
            return Unit.a;
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

    @c0d(c = "com.sportygames.fruithunt.views.FruitHuntBase$showErrorInternetUnavailable$1", f = "FruitHuntBase.kt", l = {833}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return n2j.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(1000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            boolean zG = Intrinsics.g(NetworkStateManager.INSTANCE.isConnected(), Boolean.TRUE);
            n2j n2jVar = n2j.this;
            if (zG) {
                n2jVar.R = 0;
            } else {
                n2jVar.R++;
                n2jVar.R0();
            }
            return Unit.a;
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return n2j.this.requireActivity().getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return n2j.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class g extends qlr implements Function0<r8i0.c> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return n2j.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class h extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? n2j.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class i extends qlr implements Function0<Fragment> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return n2j.this;
        }
    }

    public static final class j extends qlr implements Function0<w8i0> {
        public final /* synthetic */ i a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.a = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class k extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class l extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ttr ttrVar) {
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? n2j.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class n extends qlr implements Function0<Fragment> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return n2j.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? n2j.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class s extends qlr implements Function0<Fragment> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return n2j.this;
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

    public n2j() {
        n nVar = new n();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new o(nVar));
        this.d = new q8i0(jq40.a(o8j.class), new p(ttrVarA), new r(ttrVarA), new q(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new t(new s()));
        this.e = new q8i0(jq40.a(ypa0.class), new u(ttrVarA2), new h(ttrVarA2), new v(ttrVarA2));
        this.i = new c9i0();
        ttr ttrVarA3 = hwr.a(a1sVar, new j(new i()));
        this.v = new q8i0(jq40.a(aij.class), new k(ttrVarA3), new m(ttrVarA3), new l(ttrVarA3));
        this.w = new q8i0(jq40.a(fq5.class), new e(), new g(), new f());
        this.z = "en";
        this.N = NetworkStateManager.INSTANCE.observeNetworkState();
        this.S = "";
        this.T = "";
        this.X = new ArrayList<>();
        this.Z = new ArrayList<>();
    }

    public static boolean H0(n2j n2jVar, Context context, float f2, float f3, float f4, float f5, int i2) {
        djh djhVar;
        boolean z = (i2 & 2) == 0;
        boolean z2 = (i2 & 4) == 0;
        if ((i2 & 8) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            f5 = 0.0f;
        }
        n2jVar.getClass();
        if (context == null) {
            return false;
        }
        ArrayList<OnboardingItem> arrayListA = sny.a(context, "fruit-hunt");
        djh djhVar2 = n2jVar.b;
        boolean z3 = djhVar2 != null && djhVar2.y.d.getVisibility() == 0;
        int i3 = z2 ? z3 ? 4 : 3 : 0;
        int size = z2 ? arrayListA.size() : z3 ? 4 : 3;
        boolean zBooleanValue = false;
        if (!arrayListA.isEmpty()) {
            for (int i4 = i3; i4 < size; i4++) {
                Boolean isView = arrayListA.get(i4).getIsView();
                zBooleanValue = isView != null ? isView.booleanValue() : false;
                if (!zBooleanValue) {
                    i3 = i4;
                    break;
                }
            }
        }
        if (z || (djhVar = n2jVar.b) == null || djhVar.F.getVisibility() != 0) {
            n2jVar.h0 = true;
            if (zBooleanValue) {
                n2jVar.f0 = false;
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new h3j(n2jVar, null), 3);
                return zBooleanValue;
            }
            n2jVar.f0 = true;
            if (n2jVar.c != null) {
                Map<String, Float> mapF = kpu.f(new Pair("FH_HAM_ITEM0_HEIGHT", Float.valueOf(f2)), new Pair("FH_HAM_ITEM1_HEIGHT", Float.valueOf(f3)), new Pair("FH_HAM_ITEM2_HEIGHT", Float.valueOf(f4)), new Pair("FH_HAM_ITEM_WIDTH", Float.valueOf(f5)));
                try {
                    FragmentManager childFragmentManager = n2jVar.getChildFragmentManager();
                    childFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                    op5.a.getClass();
                    List<? extends File> list = op5.b;
                    com.sportygames.commons.views.a aVar2 = new com.sportygames.commons.views.a();
                    aVar2.c = "fruit-hunt";
                    aVar2.d = i3;
                    aVar2.w = list;
                    aVar2.z = mapF;
                    aVar2.A = z3;
                    aVar.f(R.id.onboarding_images, aVar2, null);
                    aVar.k(false, true);
                } catch (IllegalStateException e2) {
                    e2.printStackTrace();
                    Unit unit = Unit.a;
                }
            }
            djh djhVar3 = n2jVar.b;
            if (djhVar3 != null) {
                djhVar3.F.setVisibility(0);
            }
        }
        return zBooleanValue;
    }

    public static List r0(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((GiftItem) it.next());
        }
        return CollectionsKt.A0(arrayList);
    }

    public static ArrayList s0() {
        return kotlin.collections.b.f("sg_fruit_hunt", "sg_common_dialog_message", "sg_fbg_dialog", "sg_chat", "sg_bethistory", "sg_ham_menu", "sg_common", "sg_exit_dialog", "sg_game_common", "currency_symbols", "sg_onboarding", "sg_campaign");
    }

    public final void C0() {
        r750.d(t0(), new xf5(this, 1));
    }

    public final void D0(final androidx.fragment.app.e eVar, final String str, final String str2) {
        if (eVar == null) {
            return;
        }
        final LeftMenuButton leftMenuButtonV0 = V0(R.string.music_menu, R.string.music_cms, R.drawable.music, R.dimen._15sdp, R.dimen._12sdp, "MUSIC", true, null, new Function1() { // from class: f1j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                n2j n2jVar = this.a;
                SharedPreferences.Editor editor = n2jVar.K;
                if (editor != null) {
                    editor.putBoolean("MUSIC", zBooleanValue);
                }
                SharedPreferences.Editor editor2 = n2jVar.K;
                if (editor2 != null) {
                    editor2.apply();
                }
                n2jVar.v0().y1();
                if (zBooleanValue) {
                    r750.a(n2jVar.t0(), new kh5(n2jVar, 2));
                } else if (n2jVar.b != null) {
                    n2jVar.v0().I1();
                }
                return Unit.a;
            }
        });
        final LeftMenuButton leftMenuButtonV1 = V0(R.string.sound_menu, R.string.sound_cms, R.drawable.ic_sound, R.dimen._14sdp, R.dimen._13sdp, "SOUND", true, null, new h1j(this, 0));
        final LeftMenuButton leftMenuButtonV2 = V0(R.string.menu_fixed_coeff, R.string.menu_fixed_coeff_cms, R.drawable.fh_hamburger_fixed_coef, R.dimen._12sdp, R.dimen._12sdp, "FIXED_CO_EFF", false, m7i0.a(R.string.menu_fixed_coeff_hint_cms, R.string.menu_fixed_coeff_hint, this), new nb0(this, 1));
        final LeftMenuButton leftMenuButtonU0 = U0(R.string.how_to_play_menu, R.string.how_to_play_nav_cms, R.drawable.ic_how_to_play, R.dimen._13sdp, R.dimen._13sdp, new Function0() { // from class: i1j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.a.T0(eVar, false, new w1j());
                return Unit.a;
            }
        });
        final LeftMenuButton leftMenuButtonU1 = U0(R.string.bethistory_menu, R.string.bet_history_cms, R.drawable.ic_bethistory, R.dimen._14sdp, R.dimen._14sdp, new Function0() { // from class: j1j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                final n2j n2jVar = this.a;
                fo2 fo2Var = n2jVar.W;
                if (fo2Var != null) {
                    fo2Var.dismiss();
                }
                Activity activity = eVar;
                fo2 fo2Var2 = new fo2(activity, "Fruit Hunt");
                int i2 = 0;
                fo2Var2.H = new e2j(n2jVar, i2);
                fo2Var2.I = new Function2() { // from class: f2j
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        n2jVar.t0().z1(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                        return Unit.a;
                    }
                };
                fo2Var2.d();
                x5h x5hVar = new x5h();
                x5hVar.e = activity;
                fo2Var2.e().setBackground(fo2Var2.getContext().getDrawable(R.drawable.fh_bet_history_bg));
                int paddingTop = fo2Var2.e().getPaddingTop();
                fo2Var2.e().setPadding(0, paddingTop, 0, 0);
                ConstraintLayout constraintLayout = fo2Var2.w;
                if (constraintLayout == null) {
                    Intrinsics.n("header");
                    throw null;
                }
                constraintLayout.setPadding(paddingTop, 0, paddingTop, 0);
                ConstraintLayout constraintLayout2 = fo2Var2.w;
                if (constraintLayout2 == null) {
                    Intrinsics.n("header");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
                layoutParams.getClass();
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.setMargins(0, 0, 0, 0);
                ConstraintLayout constraintLayout3 = fo2Var2.w;
                if (constraintLayout3 == null) {
                    Intrinsics.n("header");
                    throw null;
                }
                constraintLayout3.setLayoutParams(layoutParams2);
                RecyclerView recyclerViewF = fo2Var2.f();
                fo2Var2.getContext();
                recyclerViewF.setLayoutManager(new LinearLayoutManager());
                wm2 wm2Var = new wm2(fo2Var2, i2);
                xm2 xm2Var = new xm2(fo2Var2, 0);
                x5hVar.b = wm2Var;
                x5hVar.c = xm2Var;
                fo2Var2.f().setAdapter(x5hVar);
                fo2Var2.b();
                n2jVar.W = fo2Var2;
                LinearLayoutCompat linearLayoutCompat = fo2Var2.y;
                if (linearLayoutCompat != null) {
                    linearLayoutCompat.setBackgroundResource(R.color.fh_bet_history_no_records);
                }
                int paddingTop2 = fo2Var2.e().getPaddingTop();
                LinearLayoutCompat linearLayoutCompat2 = fo2Var2.y;
                LinearLayoutCompat.LayoutParams layoutParams3 = (LinearLayoutCompat.LayoutParams) (linearLayoutCompat2 != null ? linearLayoutCompat2.getLayoutParams() : null);
                if (layoutParams3 != null) {
                    layoutParams3.setMargins(paddingTop2, paddingTop2, paddingTop2, paddingTop2);
                }
                LinearLayoutCompat linearLayoutCompat3 = fo2Var2.y;
                if (linearLayoutCompat3 != null) {
                    linearLayoutCompat3.setLayoutParams(layoutParams3);
                }
                fo2 fo2Var3 = n2jVar.W;
                if (fo2Var3 != null) {
                    fo2Var3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: q1j
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            fo2 fo2Var4 = n2jVar.W;
                            if (fo2Var4 != null) {
                                fo2Var4.c();
                            }
                        }
                    });
                }
                return Unit.a;
            }
        });
        o0(new Function0() { // from class: k1j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                n2j n2jVar = this.a;
                djh djhVar = n2jVar.b;
                Activity activity = eVar;
                if (djhVar != null) {
                    SGHamburgerMenu.setup$default(djhVar.C, new SGHamburgerMenu.b(n2jVar.v0(), R.string.fh_game_name, null, null, b.k(leftMenuButtonV0, leftMenuButtonV1, leftMenuButtonV2, leftMenuButtonU0, leftMenuButtonU1), new x1j(n2jVar, 0), new y1j(n2jVar)), activity, false, new z1j(n2jVar), null, 20, null);
                }
                djh djhVar2 = n2jVar.b;
                if (djhVar2 != null) {
                    djhVar2.C.setFruitHuntImage(th50.b(activity, R.font.motley_forces));
                }
                djh djhVar3 = n2jVar.b;
                if (djhVar3 != null) {
                    djhVar3.C.setUserDetails(str, str2);
                }
                return Unit.a;
            }
        });
    }

    public abstract void E0();

    public abstract void F0();

    public final void G0() {
        ssw<Integer> liveData;
        djh djhVar = this.b;
        if (djhVar == null || (liveData = djhVar.G.getLiveData()) == null) {
            return;
        }
        liveData.f(getViewLifecycleOwner(), new c(new Function1() { // from class: p0j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                djh djhVar2;
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 100) {
                    n2j n2jVar = this.a;
                    if (!n2jVar.E) {
                        n2jVar.E = true;
                        pfd pfdVar = fse.a;
                        wcl wclVar = gku.a;
                        ej5.c(w5b.a(wclVar), null, null, new o2j(n2jVar, null), 3);
                        if (n2jVar.G) {
                            n2jVar.F0();
                        }
                        if (n2jVar.i0 && (djhVar2 = n2jVar.b) != null) {
                            djhVar2.w.B.setVisibility(8);
                        }
                        ej5.c(w5b.a(wclVar), null, null, n2jVar.new b(null), 3);
                    }
                }
                return Unit.a;
            }
        }));
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void I() {
        LobbyMetaInfo metaInfo;
        Long minimumCMSVersionSupported;
        androidx.fragment.app.e activity;
        try {
            if (this.b == null && (activity = getActivity()) != null) {
                activity.finish();
            }
            djh djhVar = this.b;
            if (djhVar != null) {
                djhVar.z.setVisibility(8);
            }
            m0();
            if (this.G && !this.H) {
                djh djhVar2 = this.b;
                if (djhVar2 != null) {
                    djhVar2.G.setVisibility(8);
                }
                djh djhVar3 = this.b;
                if (djhVar3 != null) {
                    djhVar3.G.setProgressMeterVisible(false);
                }
                if (getContext() != null) {
                    String languageCode = SportyGamesManager.getInstance().getLanguageCode();
                    languageCode.getClass();
                    long versionCode = SportyGamesManager.getInstance().getVersionCode();
                    GameDetails gameDetails = this.c;
                    if (versionCode < ((gameDetails == null || (metaInfo = gameDetails.getMetaInfo()) == null || (minimumCMSVersionSupported = metaInfo.getMinimumCMSVersionSupported()) == null) ? 0L : minimumCMSVersionSupported.longValue())) {
                        languageCode = "en";
                    }
                    ArrayList<String> arrayList = vlr.a.get("fruit-hunt");
                    if (arrayList != null && arrayList.contains(languageCode)) {
                        String languageCode2 = SportyGamesManager.getInstance().getLanguageCode();
                        languageCode2.getClass();
                        this.z = languageCode2;
                    }
                    djh djhVar4 = this.b;
                    if (djhVar4 != null) {
                        djhVar4.G.E((fq5) this.w.getValue(), s0(), "sg_fruit_hunt", this.z);
                    }
                }
            }
            this.H = false;
            if (!this.F || this.G) {
                return;
            }
            F0();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public abstract void I0(boolean z);

    public abstract void J0();

    public final void K0(int i2) {
        SharedPreferences sharedPreferences = this.J;
        if (sharedPreferences == null || !sharedPreferences.getBoolean("MUSIC", true)) {
            return;
        }
        ypa0 ypa0VarV0 = v0();
        androidx.fragment.app.e activity = getActivity();
        r750.c(ypa0VarV0, activity != null ? activity.getString(i2) : null);
    }

    public final void L0() {
        Resources resources;
        String[] stringArray;
        Resources resources2;
        String[] stringArray2;
        djh djhVar = this.b;
        int length = 0;
        if (djhVar != null) {
            djhVar.G.setVisibility(0);
        }
        djh djhVar2 = this.b;
        if (djhVar2 != null) {
            djhVar2.G.setOnClickListener(new e440());
        }
        Context context = getContext();
        int i2 = 89;
        if (((context == null || (resources2 = context.getResources()) == null || (stringArray2 = resources2.getStringArray(R.array.images_array)) == null) ? 0 : stringArray2.length) < 89) {
            Context context2 = getContext();
            if (context2 != null && (resources = context2.getResources()) != null && (stringArray = resources.getStringArray(R.array.images_array)) != null) {
                length = stringArray.length;
            }
            i2 = length;
        }
        djh djhVar3 = this.b;
        if (djhVar3 != null) {
            djhVar3.G.setProgressForApi(93 / i2);
        }
        djh djhVar4 = this.b;
        if (djhVar4 != null) {
            djhVar4.G.setCurrentProgress(100 - ((93 / i2) * i2));
        }
        G0();
    }

    public final void M0() {
        o8j o8jVarT0 = t0();
        double d2 = this.a0;
        wwd0 wwd0Var = o8jVarT0.G;
        Double dValueOf = Double.valueOf(d2);
        wwd0Var.getClass();
        wwd0Var.k(null, dValueOf);
        Double d3 = (Double) t0().E.a.getValue();
        if ((d3 != null ? d3.doubleValue() : 0.0d) * 0.8d < ((Number) t0().I.a.getValue()).doubleValue()) {
            r750.d(t0(), new o5e((u6j) this, 1));
        } else {
            r750.d(t0(), new cc0((u6j) this, 3));
        }
    }

    public abstract void N0();

    public final void O0(ResultWrapper.GenericError genericError) {
        if (this.O < 3) {
            t0().y1();
            this.O++;
        } else {
            S0(getActivity(), genericError);
            X0(false);
        }
    }

    public final void P0(androidx.fragment.app.e eVar) {
        LobbyMetaInfo metaInfo;
        Long minimumCMSVersionSupported;
        int iF = m7i0.f(this);
        int iE = m7i0.e(this);
        c9i0 c9i0Var = this.i;
        c9i0Var.a = iF;
        c9i0Var.b = iE;
        float f2 = iF / 360.0f;
        c9i0Var.c = f2;
        float f3 = iE / 640.0f;
        c9i0Var.d = f3;
        c9i0Var.e = Math.min(f2, f3) * 0.95f;
        ypa0 ypa0VarV0 = v0();
        GameDetails gameDetails = this.c;
        String name = gameDetails != null ? gameDetails.getName() : null;
        if (name == null) {
            name = "";
        }
        ypa0VarV0.e = name;
        if (eVar == null) {
            return;
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            qlf.d(activity);
            qlf.c(window, activity.getColor(R.color.fh_toolbar_strip));
        }
        SportyGamesManager.getInstance().addAccountUpdatedListener(this);
        SharedPreferences sharedPreferencesA = un20.a(eVar);
        this.J = sharedPreferencesA;
        this.K = sharedPreferencesA != null ? sharedPreferencesA.edit() : null;
        v0();
        this.L = new xbg(eVar, "Fruit Hunt");
        if (getContext() != null) {
            String strA = xwj.a();
            long versionCode = SportyGamesManager.getInstance().getVersionCode();
            GameDetails gameDetails2 = this.c;
            if (versionCode < ((gameDetails2 == null || (metaInfo = gameDetails2.getMetaInfo()) == null || (minimumCMSVersionSupported = metaInfo.getMinimumCMSVersionSupported()) == null) ? 0L : minimumCMSVersionSupported.longValue())) {
                strA = "en";
            }
            ArrayList<String> arrayList = vlr.a.get("fruit-hunt");
            if (arrayList != null && arrayList.contains(strA)) {
                this.z = xwj.a();
            }
            djh djhVar = this.b;
            if (djhVar != null) {
                djhVar.G.E((fq5) this.w.getValue(), s0(), "sg_fruit_hunt", this.z);
            }
        }
    }

    @Override // defpackage.bb
    public final void Q(xnh0 xnh0Var) {
        String name;
        LobbyMetaInfo metaInfo;
        Long minimumCMSVersionSupported;
        Resources resources;
        String[] stringArray;
        Resources resources2;
        String[] stringArray2;
        ssw<Integer> liveData;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = nzf0.a;
        if (!z && jCurrentTimeMillis - nzf0.b <= 500) {
            z = true;
        }
        if (z) {
            return;
        }
        this.Q = false;
        if ((xnh0Var != null ? xnh0Var.a : null) == null || xnh0Var.a.length() <= 0) {
            return;
        }
        this.G = false;
        this.h0 = false;
        djh djhVar = this.b;
        if (djhVar != null && (liveData = djhVar.G.getLiveData()) != null) {
            liveData.m(0);
        }
        G0();
        Context context = getContext();
        int length = 89;
        if (((context == null || (resources2 = context.getResources()) == null || (stringArray2 = resources2.getStringArray(R.array.images_array)) == null) ? 0 : stringArray2.length) < 89) {
            Context context2 = getContext();
            length = (context2 == null || (resources = context2.getResources()) == null || (stringArray = resources.getStringArray(R.array.images_array)) == null) ? 0 : stringArray.length;
        }
        djh djhVar2 = this.b;
        if (djhVar2 != null) {
            djhVar2.G.setProgressForApi(93 / length);
        }
        int i2 = 100 - ((93 / length) * length);
        djh djhVar3 = this.b;
        if (djhVar3 != null) {
            djhVar3.G.L();
        }
        djh djhVar4 = this.b;
        if (djhVar4 != null) {
            djhVar4.G.O(i2);
        }
        djh djhVar5 = this.b;
        if (djhVar5 != null) {
            djhVar5.G.setVisibility(0);
        }
        if (getContext() != null) {
            String strA = xwj.a();
            long versionCode = SportyGamesManager.getInstance().getVersionCode();
            GameDetails gameDetails = this.c;
            if (versionCode < ((gameDetails == null || (metaInfo = gameDetails.getMetaInfo()) == null || (minimumCMSVersionSupported = metaInfo.getMinimumCMSVersionSupported()) == null) ? 0L : minimumCMSVersionSupported.longValue())) {
                strA = "en";
            }
            ArrayList<String> arrayList = vlr.a.get("fruit-hunt");
            if (arrayList != null && arrayList.contains(strA)) {
                this.z = xwj.a();
            }
            GameDetails gameDetails2 = this.c;
            if (gameDetails2 != null && (name = gameDetails2.getName()) != null) {
                aij aijVarU0 = u0();
                ej5.c(o8i0.d(aijVarU0), null, null, new zhj(aijVarU0, name, null), 3);
            }
            djh djhVar6 = this.b;
            if (djhVar6 != null) {
                djhVar6.G.E((fq5) this.w.getValue(), s0(), "sg_fruit_hunt", this.z);
            }
        }
    }

    public final void Q0() {
        this.Y = false;
        wwd0 wwd0Var = t0().B;
        Boolean bool = Boolean.TRUE;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
        r750.d(t0(), new i5e(this, 1));
        t0().a = null;
        t0().b = null;
        r750.d(t0(), new l2j(this, 0));
        N0();
    }

    public final void R0() {
        if (this.R <= 1) {
            ej5.c(o8i0.d(t0()), null, null, new d(null), 3);
            return;
        }
        this.M = true;
        j0();
        S0(getActivity(), new ResultWrapper.GenericError(-11, null));
        this.R = 0;
    }

    public final void S0(final androidx.fragment.app.e eVar, final ResultWrapper.GenericError genericError) {
        xbg xbgVar;
        Integer bizCode;
        HTTPResponse<Object> error;
        Integer code;
        Integer code2;
        X0(false);
        xbg xbgVar2 = this.L;
        if (xbgVar2 != null) {
            xbgVar2.dismiss();
        }
        boolean z = true;
        if (genericError != null && (code2 = genericError.getCode()) != null && code2.intValue() == 403) {
            if (this.Q) {
                return;
            }
            this.Q = true;
            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
            return;
        }
        if ((genericError == null || (code = genericError.getCode()) == null || code.intValue() != -11) && Intrinsics.g(NetworkStateManager.INSTANCE.isConnected(), Boolean.FALSE)) {
            R0();
            return;
        }
        if (eVar == null || (xbgVar = this.L) == null || xbgVar.isShowing()) {
            return;
        }
        if (genericError == null || (bizCode = genericError.getCode()) == null) {
            bizCode = (genericError == null || (error = genericError.getError()) == null) ? null : error.getBizCode();
        }
        if (bizCode != null) {
            r4j.e.getClass();
            if (r4j.f.contains(bizCode)) {
                Integer num = r4j.g.get(bizCode);
                int iIntValue = num != null ? num.intValue() : R.string.fh_unable_to_place_bet_cms;
                Integer num2 = r4j.h.get(bizCode);
                o0(new a1j(z, this, m7i0.a(iIntValue, num2 != null ? num2.intValue() : R.string.fh_unable_to_place_bet, this)));
                ej5.c(o8i0.d(t0()), null, null, new r3j(this, null), 3);
                return;
            }
        }
        r750.d(t0(), new Function0() { // from class: q0j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                r4j r4jVar = r4j.e;
                ResultWrapper.GenericError genericError2 = genericError;
                final n2j n2jVar = this;
                if (genericError2 == null) {
                    genericError2 = new ResultWrapper.GenericError(80001, new HTTPResponse(9005, n2jVar.getString(R.string.game_not_available), null, null, null, null, null, 64, null));
                }
                ResultWrapper.GenericError genericError3 = genericError2;
                final Activity activity = eVar;
                jcg.d(r4jVar, activity, "Fruit Hunt", genericError3, new Function0() { // from class: u0j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        activity.finish();
                        return Unit.a;
                    }
                }, new v0j(), new x0j(n2jVar, 0), 0, activity.getColor(R.color.try_again_color), null, null, null, new Function1() { // from class: y0j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str = (String) obj;
                        str.getClass();
                        n2jVar.q0(str);
                        return Unit.a;
                    }
                }, null, 89472);
                return Unit.a;
            }
        });
    }

    public final void T0(Activity activity, boolean z, Function0<Unit> function0) {
        if (activity == null) {
            return;
        }
        GameDetails gameDetails = this.c;
        nle nleVar = new nle(activity, gameDetails != null ? gameDetails.getName() : null, Integer.valueOf(activity.getColor(R.color.htp_fruit_hunt_bg)), null, function0, 8);
        this.I = nleVar;
        nleVar.show();
        GameDetails gameDetails2 = this.c;
        if (z) {
            wz.a("PaytableCheck", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
        } else {
            wz.a("HTPClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
        }
    }

    public final LeftMenuButton U0(int i2, int i3, int i4, int i5, int i6, Function0<Unit> function0) {
        op5 op5Var = op5.a;
        String string = getString(i3);
        string.getClass();
        String string2 = getString(i2);
        string2.getClass();
        return new LeftMenuButton(0, op5.c(op5Var, string, string2), i4, new MenuIconSize(i5, i6), function0, false, null, null, null, null, false, null, 4064, null);
    }

    public final LeftMenuButton V0(int i2, int i3, int i4, int i5, int i6, String str, boolean z, String str2, Function1<? super Boolean, Unit> function1) {
        op5 op5Var = op5.a;
        String string = getString(i3);
        string.getClass();
        String string2 = getString(i2);
        string2.getClass();
        String strC = op5.c(op5Var, string, string2);
        MenuIconSize menuIconSize = new MenuIconSize(i5, i6);
        a2j a2jVar = new a2j();
        SharedPreferences sharedPreferences = this.J;
        return new LeftMenuButton(0, strC, i4, menuIconSize, a2jVar, true, sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean(str, z)) : null, Integer.valueOf(R.color.fh_toggle_on_color), Integer.valueOf(R.color.fh_toggle_off_color), str2, false, function1);
    }

    public final void X0(final boolean z) {
        djh djhVar = this.b;
        if (djhVar == null || djhVar.G.getVisibility() != 0) {
            return;
        }
        o0(new Function0() { // from class: e1j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                djh djhVar2 = this.b;
                if (z) {
                    if (djhVar2 != null) {
                        djhVar2.G.P();
                    }
                } else if (djhVar2 != null) {
                    djhVar2.G.O(100);
                }
                return Unit.a;
            }
        });
    }

    public final void Y0(boolean z) {
        SharedPreferences sharedPreferences = this.J;
        Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("FIXED_CO_EFF", false)) : null;
        djh djhVar = this.b;
        if (djhVar != null) {
            SGHamburgerMenu sGHamburgerMenu = djhVar.C;
            boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
            SGHamburgerMenu.b bVar = sGHamburgerMenu.G;
            if (bVar == null) {
                Intrinsics.n("setUpDetails");
                throw null;
            }
            LeftMenuButton leftMenuButton = bVar.e.get(2);
            if (leftMenuButton != null) {
                leftMenuButton.setLoading(z);
            }
            SGHamburgerMenu.b bVar2 = sGHamburgerMenu.G;
            if (bVar2 == null) {
                Intrinsics.n("setUpDetails");
                throw null;
            }
            LeftMenuButton leftMenuButton2 = bVar2.e.get(2);
            if (leftMenuButton2 != null) {
                leftMenuButton2.setToggleState(Boolean.valueOf(zBooleanValue));
            }
            k4s k4sVar = sGHamburgerMenu.adapter;
            if (k4sVar != null) {
                k4sVar.notifyItemChanged(2);
            }
        }
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void d0() {
        m0();
        this.G = true;
        this.i0 = false;
        djh djhVar = this.b;
        if (djhVar != null) {
            djhVar.G.N();
        }
    }

    @Override // defpackage.bb
    public final void f0(m8 m8Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = nzf0.a;
        int i2 = 1;
        if (!z && jCurrentTimeMillis - nzf0.b <= 500) {
            z = true;
        }
        if (z) {
            return;
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity == null || !activity.isFinishing()) {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 == null || !activity2.isDestroyed()) {
                t0().V = true;
                this.a = false;
                androidx.fragment.app.e activity3 = getActivity();
                if (activity3 != null && isAdded()) {
                    hht hhtVar = new hht(activity3, "Fruit Hunt");
                    String string = getString(R.string.game_not_available);
                    string.getClass();
                    String string2 = getString(R.string.label_dialog_exit);
                    string2.getClass();
                    hhtVar.c(string, string2, new mh5(this, i2), new p1j(), activity3.getColor(R.color.try_again_color));
                    hhtVar.a();
                }
            }
        }
    }

    public abstract void j0();

    public final void m0() {
        xi60 xi60Var;
        Dialog dialog;
        if (!isRemoving() && (xi60Var = this.d0) != null && (dialog = xi60Var.getDialog()) != null && dialog.isShowing()) {
            xi60 xi60Var2 = this.d0;
            if (xi60Var2 != null) {
                xi60Var2.dismiss();
            }
            this.d0 = null;
        }
        djh djhVar = this.b;
        if (djhVar != null) {
            djhVar.d.setDrawerLockMode(0);
        }
    }

    public final void n0(Function0<Unit> function0) {
        r750.a(t0(), new d2j(function0, 0));
    }

    public final void o0(final Function0<Unit> function0) {
        r750.d(t0(), new Function0() { // from class: t1j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                function0.invoke();
                return Unit.a;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        try {
            djh djhVarA = djh.a(layoutInflater, viewGroup);
            this.b = djhVarA;
            return djhVarA.a;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        try {
            this.N.l(this);
            r4j r4jVar = r4j.e;
            xbg xbgVar = r4jVar.a;
            if (xbgVar != null) {
                xbgVar.dismiss();
            }
            r4jVar.a = null;
            SportyGamesManager.getInstance().removeAccountUpdatedListener(this);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        try {
            super.onDestroyView();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        try {
            this.c0 = null;
            this.d0 = null;
            djh djhVar = this.b;
            if (djhVar != null) {
                djhVar.B.setVisibility(8);
            }
            this.E = false;
            this.F = true;
            if (this.b != null) {
                v0().I1();
            }
            j0();
            nle nleVar = this.I;
            if (nleVar != null) {
                nleVar.dismiss();
            }
            fo2 fo2Var = this.W;
            if (fo2Var != null) {
                fo2Var.dismiss();
            }
            y0();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        try {
            super.onViewCreated(view, bundle);
            SportyGamesManager.getInstance().setScreenName("sportygames/fruit-hunt");
            P0(getActivity());
            ej5.c(o8i0.d(u0()), null, null, new j3j(this, null), 3);
            L0();
            F0();
            djh djhVar = this.b;
            if (djhVar != null) {
                djhVar.y.d.setOnClickListener(new View.OnClickListener() { // from class: w0j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        final n2j n2jVar = this.a;
                        r750.a(n2jVar.t0(), new Function0() { // from class: s0j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                n2j n2jVar2 = n2jVar;
                                Intent intent = new Intent(n2jVar2.getActivity(), (Class<?>) ChatActivity.class);
                                intent.putExtra("roomId", n2jVar2.S);
                                intent.putExtra("botId", n2jVar2.T);
                                intent.putExtra("color", R.color.fh_toolbar_strip);
                                GameDetails gameDetails = n2jVar2.c;
                                intent.putExtra(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, gameDetails != null ? gameDetails.getName() : null);
                                intent.putExtra("sound", n2jVar2.c);
                                SharedPreferences sharedPreferences = n2jVar2.J;
                                intent.putExtra("soundOn", sharedPreferences != null ? sharedPreferences.getBoolean("SOUND", false) : false);
                                e activity = n2jVar2.getActivity();
                                if (activity != null) {
                                    activity.overridePendingTransition(R.anim.slide_in_up, R.anim.slide_in_up);
                                }
                                r750.d(n2jVar2.t0(), new ub0(1, n2jVar2, intent));
                                return Unit.a;
                            }
                        });
                    }
                });
            }
            ej5.c(o8i0.d(u0()), null, null, new l3j(this, null), 3);
            op5.a.getClass();
            op5.c = "sg_fruit_hunt";
            ej5.c(o8i0.d(t0()), null, null, new n3j(this, null), 3);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void p0() {
        List<GiftItem> list = this.c0;
        if (list != null && !list.isEmpty()) {
            Q0();
        } else {
            if (this.e0) {
                return;
            }
            C0();
        }
    }

    public final void q0(String str) {
        xbg xbgVar;
        String name;
        Integer id;
        try {
            if ((this.f0 || !this.h0) && str == null) {
                androidx.fragment.app.e activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            djh djhVar = this.b;
            int iIntValue = 0;
            int i2 = 1;
            if (djhVar != null) {
                View viewF = djhVar.d.f(8388613);
                if (viewF != null ? DrawerLayout.l(viewF) : false) {
                    o0(new o0j(this));
                    return;
                }
            }
            xi60 xi60Var = this.d0;
            if (xi60Var != null && xi60Var.isVisible()) {
                m0();
                return;
            }
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 == null) {
                return;
            }
            djh djhVar2 = this.b;
            if (djhVar2 != null) {
                djhVar2.z.setVisibility(0);
            }
            if (isRemoving() || activity2.isFinishing() || activity2.isDestroyed()) {
                return;
            }
            ArrayList<GameDetails> arrayList = this.V;
            String str2 = "";
            if (arrayList != null) {
                GameDetails gameDetails = this.c;
                if (gameDetails != null && (id = gameDetails.getId()) != null) {
                    iIntValue = id.intValue();
                }
                GameDetails gameDetails2 = this.c;
                if (gameDetails2 != null && (name = gameDetails2.getName()) != null) {
                    str2 = name;
                }
                svg svgVar = new svg();
                svgVar.c = arrayList;
                svgVar.d = Integer.valueOf(iIntValue);
                svgVar.e = str2;
                svgVar.i = str;
                FragmentManager supportFragmentManager = activity2.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.f(R.id.flContent, svgVar, null);
                aVar.c("CONFIRM_DIALOG_FRAGMENT");
                aVar.d();
                return;
            }
            if (str == null) {
                String strA = m7i0.a(R.string.exit_confirm_msg_cms, R.string.exit_text, this);
                String strA2 = m7i0.a(R.string.stay_btn_cms, R.string.stay, this);
                String strA3 = m7i0.a(R.string.exit_btn_cms, R.string.label_dialog_exit, this);
                a2e a2eVar = new a2e(this, i2);
                int color = activity2.getColor(R.color.redblack_confirm_dialog_left_button);
                int color2 = activity2.getColor(R.color.redblack_confirm_dialog_right_button);
                fm60 fm60Var = new fm60();
                fm60Var.a = strA;
                fm60Var.b = JsPluginCommon.GAMES_EXIT;
                fm60Var.c = strA2;
                fm60Var.d = strA3;
                fm60Var.e = a2eVar;
                fm60Var.v = color;
                fm60Var.w = color2;
                fm60Var.i = true;
                FragmentManager supportFragmentManager2 = activity2.getSupportFragmentManager();
                supportFragmentManager2.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
                aVar2.f(R.id.flContent, fm60Var, null);
                aVar2.c("");
                aVar2.d();
            } else {
                androidx.fragment.app.e activity3 = getActivity();
                String string = getString(R.string.label_dialog_exit);
                string.getClass();
                if (activity3 != null && (xbgVar = this.L) != null) {
                    xbg.c(xbgVar, str, string, new m2j(activity3, iIntValue), new n0j(), activity3.getColor(R.color.try_again_color), 224);
                    xbgVar.a();
                }
            }
            GameDetails gameDetails3 = this.c;
            wz.a("BackClicked", gameDetails3 != null ? gameDetails3.getName() : null, "1", "On", "No");
        } catch (Exception unused) {
        }
    }

    public final o8j t0() {
        return (o8j) this.d.getValue();
    }

    public final aij u0() {
        return (aij) this.v.getValue();
    }

    public final ypa0 v0() {
        return (ypa0) this.e.getValue();
    }

    public final void w0(Status status, ResultWrapper.GenericError genericError, Function0<Unit> function0) {
        status.getClass();
        int i2 = a.a[status.ordinal()];
        if (i2 == 1) {
            n0(new z0j(this, genericError));
        } else {
            if (i2 != 3) {
                return;
            }
            function0.invoke();
        }
    }

    public abstract void y0();

    public final void z0() {
        djh djhVar = this.b;
        boolean z = djhVar != null && djhVar.y.d.getVisibility() == 0;
        this.U = false;
        djh djhVar2 = this.b;
        if (djhVar2 != null) {
            djhVar2.y.d.setVisibility(8);
        }
        if (z != this.U) {
            djh djhVar3 = this.b;
            FrameLayout frameLayout = djhVar3 != null ? djhVar3.F : null;
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            if (frameLayout == null || frameLayout.getVisibility() != 0 || childFragmentManager.G(R.id.onboarding_images) == null) {
                return;
            }
            H0(this, getContext(), 0.0f, 0.0f, 0.0f, 0.0f, 124);
        }
    }
}
