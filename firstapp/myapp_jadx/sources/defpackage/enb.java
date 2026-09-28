package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.models.LeftMenuButton;
import com.sportygames.commons.models.MenuIconSize;
import com.sportygames.commons.models.OnboardingItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.models.ToastCommonModel;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.crash.models.header.CrashHeaderState;
import com.sportygames.crashInitiated.model.request.BetData;
import com.sportygames.crashInitiated.model.response.CrashInitiatedCoeffListResponse;
import com.sportygames.crashInitiated.model.response.DetailResponse;
import com.sportygames.crashInitiated.model.response.UserValidateResponse;
import com.sportygames.crashInitiated.remote.models.ChatRoomResponse;
import com.sportygames.crashInitiated.remote.models.PreviousMultiplierResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.LobbyMetaInfo;
import enb.i;
import enb.l;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lenb;", "Landroidx/fragment/app/Fragment;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "Lbb;", "", "Lxjj;", "<init>", "()V", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class enb extends Fragment implements GameMainActivity.b, bb, xjj {
    public boolean A;
    public final ee<Intent> A0;
    public List<ChatRoomResponse> B;
    public boolean C;
    public String D;
    public String E;
    public final ttr F;
    public GameDetails G;
    public xbg H;
    public final q8i0 I;
    public String J;
    public boolean K;
    public final ytw<Boolean> L;
    public final ytw<Boolean> M;
    public final ytw<Boolean> N;
    public boolean O;
    public final ytw<Boolean> P;
    public final q8i0 Q;
    public final ytw<Boolean> R;
    public int S;
    public String T;
    public a U;
    public final ytw<Boolean> V;
    public final ytw<Boolean> W;
    public final ytw<Boolean> X;
    public SharedPreferences.Editor Y;
    public bb8 Z;
    public hvi a;
    public UserValidateResponse a0;
    public SharedPreferences b;
    public int b0;
    public final q8i0 c;
    public Double c0;
    public mz1 d;
    public double d0;
    public cj5 e;
    public final ytw<Boolean> e0;
    public final ArrayList f;
    public ArrayList<GameDetails> f0;
    public PromotionGiftsResponse g0;
    public final ytw<Boolean> h0;
    public final q8i0 i;
    public final ttr i0;
    public xi60 j0;
    public final ytw<HashMap<Double, Double>> k0;
    public boolean l0;
    public s9b m0;
    public List<tpy> n0;
    public boolean o0;
    public com.sportygames.commons.components.a p0;
    public final ytw<Boolean> q0;
    public final ytw<Boolean> r0;
    public jvd0 s0;
    public double t0;
    public final ytw<Boolean> u0;
    public final ttr v;
    public String v0;
    public final q8i0 w;
    public final ytw<Boolean> w0;
    public final SnapshotStateList<CrashInitiatedCoeffListResponse> x0;
    public final q8i0 y;
    public int y0;
    public z66 z;
    public final ytw<Integer> z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("NONE", 0);
            a = aVar;
            a aVar2 = new a("CHAT", 1);
            b = aVar2;
            a aVar3 = new a("BET_HISTORY", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public static final class a0 implements Function0<yt2> {
        public final /* synthetic */ z b;

        public a0(z zVar) {
            this.b = zVar;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, yt2] */
        @Override // kotlin.jvm.functions.Function0
        public final yt2 invoke() {
            v8i0 viewModelStore = enb.this.getViewModelStore();
            enb enbVar = enb.this;
            cyb defaultViewModelCreationExtras = enbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(yt2.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(enbVar), null);
        }
    }

    public static final /* synthetic */ class b {
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
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a aVar = a.a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a aVar2 = a.a;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b0 implements Function0<Fragment> {
        public b0() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return enb.this;
        }
    }

    public static final class c implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ enb b;

        public c(View view, enb enbVar) {
            this.a = view;
            this.b = enbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((x5a0) this.b.z0).setValue(Integer.valueOf(this.a.getHeight()));
        }
    }

    public static final class c0 implements Function0<tl2> {
        public final /* synthetic */ eae0 b;
        public final /* synthetic */ b0 c;

        public c0(eae0 eae0Var, b0 b0Var) {
            this.b = eae0Var;
            this.c = b0Var;
        }

        /* JADX WARN: Type inference failed for: r7v1, types: [j8i0, tl2] */
        @Override // kotlin.jvm.functions.Function0
        public final tl2 invoke() {
            v8i0 viewModelStore = enb.this.getViewModelStore();
            enb enbVar = enb.this;
            cyb defaultViewModelCreationExtras = enbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(tl2.class), viewModelStore, defaultViewModelCreationExtras, this.b, e80.a(enbVar), null);
        }
    }

    public static final /* synthetic */ class d extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            enb enbVar = (enb) this.receiver;
            ((x5a0) enbVar.p0().K).setValue(13);
            ((x5a0) enbVar.p0().N).setValue(Boolean.valueOf(!((Boolean) ((x5a0) enbVar.p0().N).getValue()).booleanValue()));
            return Unit.a;
        }
    }

    public static final class d0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? enb.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final /* synthetic */ class e extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            enb enbVar = (enb) this.receiver;
            ((x5a0) enbVar.p0().K).setValue(12);
            ((x5a0) enbVar.p0().N).setValue(Boolean.valueOf(!((Boolean) ((x5a0) enbVar.p0().N).getValue()).booleanValue()));
            return Unit.a;
        }
    }

    public static final class e0 extends qlr implements Function0<Fragment> {
        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return enb.this;
        }
    }

    public static final /* synthetic */ class f extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            enb enbVar = (enb) this.receiver;
            ((x5a0) enbVar.p0().K).setValue(14);
            ((x5a0) enbVar.p0().N).setValue(Boolean.valueOf(!((Boolean) ((x5a0) enbVar.p0().N).getValue()).booleanValue()));
            ytw<Boolean> ytwVar = enbVar.p0().Q;
            Boolean bool = Boolean.FALSE;
            ((x5a0) ytwVar).setValue(bool);
            ((x5a0) enbVar.h0).setValue(bool);
            return Unit.a;
        }
    }

    public static final class f0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ e0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(e0 e0Var) {
            super(0);
            this.a = e0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final /* synthetic */ class g extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((enb) this.receiver).F0();
            return Unit.a;
        }
    }

    public static final class g0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final /* synthetic */ class h extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            enb enbVar = (enb) this.receiver;
            hvi hviVar = enbVar.a;
            if (hviVar != null) {
                hviVar.e.n(8388613);
            }
            GameDetails gameDetails = enbVar.G;
            wz.a("MenuClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
            return Unit.a;
        }
    }

    public static final class h0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(ttr ttrVar) {
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

    @c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$onViewCreated$4$1$7$1$15$1", f = "CrashInitiatedFragment.kt", l = {650}, m = "invokeSuspend", v = 1)
    public static final class i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public i(v1b<? super i> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return enb.this.new i(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(900L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ((x5a0) enb.this.s0().a).setValue(Boolean.FALSE);
            return Unit.a;
        }
    }

    public static final class i0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? enb.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$onViewCreated$4$1$7$1$17$1", f = "CrashInitiatedFragment.kt", l = {671}, m = "invokeSuspend", v = 1)
    public static final class j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new j(2, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(3000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class j0 extends qlr implements Function0<Fragment> {
        public j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return enb.this;
        }
    }

    public static final /* synthetic */ class k extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            iny onBackPressedDispatcher;
            androidx.fragment.app.e activity = ((enb) this.receiver).getActivity();
            if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                onBackPressedDispatcher.d();
            }
            return Unit.a;
        }
    }

    public static final class k0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ j0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(j0 j0Var) {
            super(0);
            this.a = j0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    @c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$onViewCreated$4$1$7$1$20$1$2", f = "CrashInitiatedFragment.kt", l = {793}, m = "invokeSuspend", v = 1)
    public static final class l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public l(v1b<? super l> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return enb.this.new l(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            enb enbVar = enb.this;
            if (i == 0) {
                uj50.b(obj);
                enbVar.J0();
                this.a = 1;
                if (hkd.b(200L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ((x5a0) enbVar.p0().V).setValue("punch-Looking-up-final");
            return Unit.a;
        }
    }

    public static final class l0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final /* synthetic */ class m extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((enb) this.receiver).E0();
            return Unit.a;
        }
    }

    public static final class m0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(ttr ttrVar) {
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

    public static final /* synthetic */ class n extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((enb) this.receiver).getClass();
            SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
            return Unit.a;
        }
    }

    public static final class n0 extends qlr implements Function0<Fragment> {
        public n0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return enb.this;
        }
    }

    @c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$onViewCreated$4$1$7$1$9$1$3", f = "CrashInitiatedFragment.kt", l = {586}, m = "invokeSuspend", v = 1)
    public static final class o extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public o(v1b<? super o> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return enb.this.new o(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((o) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            enb enbVar = enb.this;
            if (i == 0) {
                uj50.b(obj);
                enbVar.J0();
                this.a = 1;
                if (hkd.b(200L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ((x5a0) enbVar.p0().V).setValue("punch-Looking-up-final");
            return Unit.a;
        }
    }

    public static final class o0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? enb.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$onViewCreated$4$1$7$1$9$1$4", f = "CrashInitiatedFragment.kt", l = {591}, m = "invokeSuspend", v = 1)
    public static final class p extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public p(v1b<? super p> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return enb.this.new p(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((p) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
            ((x5a0) enb.this.p0().V).setValue("Looking-up-final");
            return Unit.a;
        }
    }

    public static final class p0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ n0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(n0 n0Var) {
            super(0);
            this.a = n0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class q implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public q(Function1 function1) {
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

    public static final class q0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class r extends qlr implements Function0<v8i0> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return enb.this.requireActivity().getViewModelStore();
        }
    }

    public static final class r0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(ttr ttrVar) {
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

    public static final class s extends qlr implements Function0<cyb> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return enb.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class s0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? enb.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class t extends qlr implements Function0<r8i0.c> {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return enb.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class t0 extends qlr implements Function0<Fragment> {
        public t0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return enb.this;
        }
    }

    public static final class u extends qlr implements Function0<v8i0> {
        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return enb.this.requireActivity().getViewModelStore();
        }
    }

    public static final class u0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ t0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(t0 t0Var) {
            super(0);
            this.a = t0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class v extends qlr implements Function0<cyb> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return enb.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class v0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class w extends qlr implements Function0<r8i0.c> {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return enb.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class w0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(ttr ttrVar) {
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

    public static final class x implements Function0<Fragment> {
        public x() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return enb.this;
        }
    }

    public static final class y implements Function0<zob> {
        public final /* synthetic */ x b;

        public y(x xVar) {
            this.b = xVar;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, zob] */
        @Override // kotlin.jvm.functions.Function0
        public final zob invoke() {
            v8i0 viewModelStore = enb.this.getViewModelStore();
            enb enbVar = enb.this;
            cyb defaultViewModelCreationExtras = enbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(zob.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(enbVar), null);
        }
    }

    public static final class z implements Function0<Fragment> {
        public z() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return enb.this;
        }
    }

    public enb() {
        n0 n0Var = new n0();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new p0(n0Var));
        this.c = new q8i0(jq40.a(fq5.class), new q0(ttrVarA), new s0(ttrVarA), new r0(ttrVarA));
        this.f = new ArrayList();
        ttr ttrVarA2 = hwr.a(a1sVar, new u0(new t0()));
        this.i = new q8i0(jq40.a(koj.class), new v0(ttrVarA2), new d0(ttrVarA2), new w0(ttrVarA2));
        this.v = hwr.a(a1sVar, new y(new x()));
        this.w = new q8i0(jq40.a(fuj.class), new r(), new t(), new s());
        this.y = new q8i0(jq40.a(db6.class), new u(), new w(), new v());
        this.D = "";
        this.E = "";
        this.F = hwr.a(a1sVar, new a0(new z()));
        ttr ttrVarA3 = hwr.a(a1sVar, new f0(new e0()));
        this.I = new q8i0(jq40.a(ypa0.class), new g0(ttrVarA3), new i0(ttrVarA3), new h0(ttrVarA3));
        this.J = "en";
        Boolean bool = Boolean.FALSE;
        this.L = androidx.compose.runtime.m.b(bool);
        this.M = androidx.compose.runtime.m.b(bool);
        this.N = androidx.compose.runtime.m.b(bool);
        this.P = androidx.compose.runtime.m.b(bool);
        ttr ttrVarA4 = hwr.a(a1sVar, new k0(new j0()));
        this.Q = new q8i0(jq40.a(ip8.class), new l0(ttrVarA4), new o0(ttrVarA4), new m0(ttrVarA4));
        this.R = androidx.compose.runtime.m.b(bool);
        this.T = "";
        this.U = a.a;
        this.V = androidx.compose.runtime.m.b(bool);
        this.W = androidx.compose.runtime.m.b(bool);
        this.X = androidx.compose.runtime.m.b(bool);
        this.e0 = androidx.compose.runtime.m.b(bool);
        this.h0 = androidx.compose.runtime.m.b(bool);
        this.i0 = hwr.a(a1sVar, new c0(new eae0("first_bet_container"), new b0()));
        this.k0 = androidx.compose.runtime.m.b(new HashMap());
        this.q0 = androidx.compose.runtime.m.b(bool);
        this.r0 = androidx.compose.runtime.m.b(bool);
        this.u0 = androidx.compose.runtime.m.b(bool);
        this.v0 = "";
        this.w0 = androidx.compose.runtime.m.b(bool);
        this.x0 = new SnapshotStateList<>();
        this.z0 = androidx.compose.runtime.m.b(null);
        ee<Intent> eeVarRegisterForActivityResult = registerForActivityResult(new ce(), new ud() { // from class: ijb
            @Override // defpackage.ud
            public final void a(Object obj) {
                ((ActivityResult) obj).getClass();
                enb enbVar = this.a;
                ((x5a0) enbVar.R).setValue(Boolean.FALSE);
                if (((Boolean) ((x5a0) enbVar.p0().e).getValue()).booleanValue()) {
                    ((x5a0) enbVar.e0).setValue(Boolean.TRUE);
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.A0 = eeVarRegisterForActivityResult;
    }

    public static void D0(enb enbVar) {
        int i2;
        boolean zBooleanValue;
        Float fValueOf = Float.valueOf(0.0f);
        ytw<Boolean> ytwVar = enbVar.N;
        enbVar.w0().getClass();
        if (SportyGamesManager.getInstance().getUser() == null || (enbVar.C0() && ((Boolean) ((x5a0) enbVar.u0().P).getValue()).booleanValue())) {
            x5a0 x5a0Var = (x5a0) ytwVar;
            if (!((Boolean) x5a0Var.getValue()).booleanValue()) {
                x5a0Var.setValue(Boolean.TRUE);
                enbVar.H0(enbVar.C0() && ((Boolean) ((x5a0) enbVar.u0().P).getValue()).booleanValue());
            }
        }
        Context context = enbVar.getContext();
        if (context != null) {
            enbVar.w0().getClass();
            if (SportyGamesManager.getInstance().getUser() == null || ((Boolean) ((x5a0) enbVar.u0().P).getValue()).booleanValue()) {
                return;
            }
            hvi hviVar = enbVar.a;
            if (hviVar == null || hviVar.E.getVisibility() != 0) {
                ArrayList<OnboardingItem> arrayListA = sny.a(context, "one-punch");
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
                ((x5a0) ytwVar).setValue(Boolean.TRUE);
                if (zBooleanValue) {
                    enbVar.O = false;
                    enbVar.H0(enbVar.C0());
                    return;
                }
                enbVar.O = true;
                if (enbVar.G != null) {
                    Map<String, Float> mapF = kpu.f(new Pair("RUSH_BET_BUTTON_HEIGHT", fValueOf), new Pair("RUSH_BET_BUTTON_WIDTH", fValueOf));
                    boolean zBooleanValue2 = ((Boolean) ((x5a0) enbVar.u0().v).getValue()).booleanValue();
                    if (((String) ((x5a0) enbVar.u0().a).getValue()).equals("one-punch")) {
                        String str = (String) ((x5a0) enbVar.u0().d).getValue();
                        Context context2 = enbVar.getContext();
                        if (context2 != null) {
                            if (sny.a(context2, str).isEmpty()) {
                                ArrayList arrayList = new ArrayList();
                                List<tpy> list = enbVar.n0;
                                if (list == null) {
                                    Intrinsics.n("onboardingPages");
                                    throw null;
                                }
                                int i3 = 0;
                                for (Object obj : list) {
                                    int i4 = i3 + 1;
                                    if (i3 < 0) {
                                        kotlin.collections.b.q();
                                        throw null;
                                    }
                                    arrayList.add(new OnboardingItem(Integer.valueOf(i3), Boolean.FALSE));
                                    i3 = i4;
                                }
                                sny.b(enbVar.Y, arrayList, str);
                                pfd pfdVar = fse.a;
                                ej5.c(w5b.a(gku.a), null, null, new vnb(enbVar, i2, null), 3);
                            } else {
                                s9b s9bVar = enbVar.m0;
                                if (s9bVar != null) {
                                    s9bVar.invoke(Integer.valueOf(i2));
                                }
                            }
                        }
                    } else {
                        FragmentManager childFragmentManager = enbVar.getChildFragmentManager();
                        androidx.fragment.app.a aVarA = oke.a(childFragmentManager, childFragmentManager);
                        op5.a.getClass();
                        List<? extends File> list2 = op5.b;
                        com.sportygames.commons.views.a aVar = new com.sportygames.commons.views.a();
                        aVar.c = "rush";
                        aVar.d = i2;
                        aVar.w = list2;
                        aVar.z = mapF;
                        aVar.A = zBooleanValue2;
                        aVarA.f(R.id.onboarding_images, aVar, null);
                        aVarA.d();
                    }
                }
                hvi hviVar2 = enbVar.a;
                if (hviVar2 != null) {
                    hviVar2.D.setVisibility(0);
                }
                ytw<Boolean> ytwVar2 = enbVar.V;
                Boolean bool = Boolean.FALSE;
                ((x5a0) ytwVar2).setValue(bool);
                ((x5a0) enbVar.W).setValue(bool);
            }
        }
    }

    public static HashMap y0(double d2, double d3) {
        HashMap map = new HashMap();
        double dDoubleValue = 0.0d;
        for (double d4 = 1.01d; d4 <= d3; d4 += 0.01d) {
            map.put(Double.valueOf(Double.parseDouble(krh0.l(d4))), Double.valueOf((Math.pow(d4, -2.0d) * d2 * 0.01d) + dDoubleValue));
            Double d5 = (Double) map.get(Double.valueOf(Double.parseDouble(krh0.l(d4))));
            dDoubleValue = d5 != null ? d5.doubleValue() : 0.0d;
        }
        return map;
    }

    public final boolean C0() {
        w0().getClass();
        return !(SportyGamesManager.getInstance().getUser() == null);
    }

    public final void E0() {
        Context context = getContext();
        if (context != null) {
            Boolean bool = Boolean.TRUE;
            ((x5a0) this.R).setValue(bool);
            ((x5a0) s0().i).setValue(bool);
            Intent intent = new Intent(context, (Class<?>) ChatActivity.class);
            intent.putExtra("availableHeight", (Serializable) ((x5a0) this.z0).getValue());
            intent.putExtra(getString(R.string.room_id), (String) ((x5a0) s0().v).getValue());
            intent.putExtra(getString(R.string.color), R.color.toolbar_strip_bottle);
            String string = getString(R.string.game_name);
            GameDetails gameDetails = this.G;
            intent.putExtra(string, gameDetails != null ? gameDetails.getName() : null);
            intent.putExtra(getString(R.string.sound), this.G);
            intent.putExtra("autobetCount", String.valueOf(this.y0));
            op5 op5Var = op5.a;
            String currencyCode = ((CrashHeaderState) s0().A.getValue()).getCurrencyCode();
            if (currencyCode == null) {
                currencyCode = "";
            }
            op5Var.getClass();
            intent.putExtra("currency", op5.i(currencyCode));
            intent.putExtra(getString(R.string.rainV2Enabled), true);
            intent.putExtra(getString(R.string.sound_on), false);
            intent.putExtra(getString(R.string.bot_id), (String) ((x5a0) s0().w).getValue());
            intent.putExtra(getString(R.string.colors_game_name), (String) ((x5a0) u0().a).getValue());
            if (((Boolean) ((x5a0) p0().e).getValue()).booleanValue()) {
                intent.putExtra("fragment_to_load", "fragment_one_punch_component");
            }
            this.A0.b(intent);
            GameDetails gameDetails2 = this.G;
            wz.a("ChatClicked", gameDetails2 != null ? gameDetails2.getName() : null, "Off");
        }
    }

    public final void F0() {
        ((x5a0) p0().K).setValue(15);
        ((x5a0) p0().N).setValue(Boolean.valueOf(!((Boolean) ((x5a0) p0().N).getValue()).booleanValue()));
        ytw<Boolean> ytwVar = p0().Q;
        Boolean bool = Boolean.FALSE;
        ((x5a0) ytwVar).setValue(bool);
        ((x5a0) this.h0).setValue(bool);
    }

    public final void G0() {
        GameDetails gameDetails = this.G;
        String name = gameDetails != null ? gameDetails.getName() : null;
        if (name == null) {
            name = "";
        }
        wz.a("PopupAction", name, "Logged in", "error_alert", "Exit");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void H0(boolean z2) {
        if (z2) {
            pfd pfdVar = fse.a;
            ej5.c(w5b.a(gku.a), null, null, new pnb(this, null), 3);
            Boolean bool = Boolean.TRUE;
            ((x5a0) this.W).setValue(bool);
            hvi hviVar = this.a;
            if ((hviVar == null || hviVar.E.getVisibility() != 0) && this.o0) {
                ((x5a0) this.V).setValue(bool);
            }
        }
    }

    public abstract void I0();

    public abstract void J0();

    public final void K0() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences == null || !sharedPreferences.getBoolean("ONE_PUNCH_ONE_SOUND", true)) {
            return;
        }
        ypa0 ypa0VarV0 = v0();
        String string = getString(R.string.sfx_coefficient);
        string.getClass();
        this.S = ypa0VarV0.C1(string);
    }

    public abstract void L0();

    public abstract void M0();

    public final void N0() {
        LobbyMetaInfo metaInfo;
        Long minimumCMSVersionSupported;
        try {
            long versionCode = SportyGamesManager.getInstance().getVersionCode();
            GameDetails gameDetails = this.G;
            if (versionCode < ((gameDetails == null || (metaInfo = gameDetails.getMetaInfo()) == null || (minimumCMSVersionSupported = metaInfo.getMinimumCMSVersionSupported()) == null) ? 0L : minimumCMSVersionSupported.longValue())) {
                this.J = "en";
            }
            ArrayList<String> arrayList = vlr.a.get(((x5a0) u0().a).getValue());
            if (arrayList == null || !arrayList.contains(SportyGamesManager.getInstance().getLanguageCode())) {
                return;
            }
            String languageCode = SportyGamesManager.getInstance().getLanguageCode();
            languageCode.getClass();
            this.J = languageCode;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void O0() {
        Context applicationContext;
        try {
            new brr();
            GameDetails gameDetails = this.G;
            if (gameDetails != null) {
                gameDetails.getDisplayName();
            }
            SharedPreferences sharedPreferences = this.b;
            if (sharedPreferences == null || sharedPreferences.getBoolean(((String[]) ((x5a0) u0().e).getValue())[2], false)) {
                return;
            }
            this.o0 = true;
            Context context = getContext();
            String string = (context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getString(R.string.one_tap_choice_label);
            if (string != null) {
                ytw<String> ytwVar = u0().A;
                op5 op5Var = op5.a;
                String string2 = getString(R.string.otb_dialog_msg_cms);
                string2.getClass();
                op5Var.getClass();
                ((x5a0) ytwVar).setValue(op5.b(string2, string, null));
                ytw<String> ytwVar2 = u0().G;
                String string3 = getString(R.string.yes_btn_cms);
                string3.getClass();
                String string4 = getString(R.string.yes_bet);
                string4.getClass();
                ((x5a0) ytwVar2).setValue(op5.b(string3, string4, null));
                ytw<String> ytwVar3 = u0().H;
                String string5 = getString(R.string.no_btn_cms);
                string5.getClass();
                String string6 = getString(R.string.no_bet);
                string6.getClass();
                ((x5a0) ytwVar3).setValue(op5.b(string5, string6, null));
                ((x5a0) u0().I).setValue(Boolean.FALSE);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void P0(String str, String str2, String str3) {
        String nickName;
        String avatarUrl;
        UserValidateResponse userValidateResponse = this.a0;
        String str4 = "";
        if (userValidateResponse == null || (nickName = userValidateResponse.getNickName()) == null) {
            nickName = "";
        }
        UserValidateResponse userValidateResponse2 = this.a0;
        if (userValidateResponse2 != null && (avatarUrl = userValidateResponse2.getAvatarUrl()) != null) {
            str4 = avatarUrl;
        }
        z0(nickName, str4);
        hvi hviVar = this.a;
        if (hviVar != null) {
            hviVar.z.setUserDetails(str, str2);
        }
        SportyGamesManager.getInstance().setUserId(str3);
        hvi hviVar2 = this.a;
        if (hviVar2 != null) {
            hviVar2.E.P();
        }
        zob zobVarW0 = w0();
        zobVarW0.getClass();
        ej5.c(o8i0.d(zobVarW0), null, null, new yob(zobVarW0, null), 3);
    }

    @Override // defpackage.bb
    public final void Q(xnh0 xnh0Var) {
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
        hvi hviVar = this.a;
        if (hviVar != null) {
            hviVar.E.O(0);
        }
        this.K = false;
        try {
            hvi hviVar2 = this.a;
            if (hviVar2 != null) {
                hviVar2.e.d();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        hvi hviVar3 = this.a;
        if (hviVar3 != null) {
            hviVar3.E.setProgressForApi(14);
        }
        hvi hviVar4 = this.a;
        if (hviVar4 != null) {
            hviVar4.E.L();
        }
        hvi hviVar5 = this.a;
        if (hviVar5 != null) {
            hviVar5.E.O(2);
        }
        hvi hviVar6 = this.a;
        if (hviVar6 != null) {
            hviVar6.E.setVisibility(0);
        }
        x5a0 x5a0Var = (x5a0) s0().y;
        x5a0Var.setValue(Boolean.valueOf(!((Boolean) x5a0Var.getValue()).booleanValue()));
        op5.a.getClass();
        String str = op5.c;
        if (str != null) {
            N0();
            ((x5a0) u0().O).setValue(Boolean.FALSE);
            hvi hviVar7 = this.a;
            if (hviVar7 != null) {
                ProgressMeterComponent progressMeterComponent = hviVar7.E;
                fq5 fq5Var = (fq5) this.c.getValue();
                List listA0 = CollectionsKt.A0(this.f);
                listA0.getClass();
                progressMeterComponent.E(fq5Var, (ArrayList) listA0, str, this.J);
            }
        }
    }

    public final void Q0(DetailResponse detailResponse, double d2) {
        try {
            Double d3 = this.c0;
            double dDoubleValue = d3 != null ? d3.doubleValue() : 0.0d;
            boolean z2 = dDoubleValue <= (detailResponse != null ? detailResponse.getMaxAmount() : 0.0d);
            boolean z3 = (dDoubleValue - d2) / dDoubleValue < 0.2d;
            final yp40 yp40Var = new yp40();
            if (d2 > dDoubleValue || (z2 && z3)) {
                yp40Var.a = true;
            }
            boolean z4 = yp40Var.a;
            hvi hviVar = this.a;
            if (z4) {
                if (hviVar != null) {
                    hviVar.b.setVisibility(0);
                }
            } else if (hviVar != null) {
                hviVar.b.setVisibility(8);
            }
            hvi hviVar2 = this.a;
            if (hviVar2 != null) {
                ComposeView composeView = hviVar2.b;
                composeView.setViewCompositionStrategy(u6i0.c.a);
                composeView.setContent(new op8(-454145949, new Function2() { // from class: xkb
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            enb enbVar = this.a;
                            if (enbVar.C0()) {
                                aVar.N(-314942221);
                                enbVar.j0(yp40Var.a, aVar, 0);
                            } else {
                                aVar.N(-459126817);
                            }
                            aVar.H();
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void R0() {
        bb8 bb8Var = this.Z;
        if (bb8Var == null || !bb8Var.isShowing()) {
            int i2 = 0;
            if (!q0().b.e()) {
                q0().b.f(getViewLifecycleOwner(), new q(new imb(this, i2)));
            }
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                final bb8 bb8Var2 = new bb8(activity, (String) ((x5a0) u0().i).getValue(), t0());
                bb8Var2.C = new wlb(this);
                bb8Var2.D = new xlb(this);
                Window window = bb8Var2.getWindow();
                WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                if (attributes != null) {
                    attributes.gravity = 17;
                }
                if (attributes != null) {
                    attributes.flags &= -5;
                }
                Window window2 = bb8Var2.getWindow();
                if (window2 != null) {
                    window2.setAttributes(attributes);
                }
                Window window3 = bb8Var2.getWindow();
                if (window3 != null) {
                    window3.setBackgroundDrawableResource(R.color.trans_black_45);
                }
                bb8Var2.show();
                Window window4 = bb8Var2.getWindow();
                if (window4 != null) {
                    window4.setLayout(-1, -1);
                }
                pn80 pn80Var = new pn80();
                pn80Var.e = activity;
                RecyclerView recyclerViewC = bb8Var2.c();
                bb8Var2.getContext();
                recyclerViewC.setLayoutManager(new LinearLayoutManager());
                va8 va8Var = new va8(bb8Var2, 0);
                Function0<Unit> function0 = new Function0() { // from class: xa8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        bb8 bb8Var3 = bb8Var2;
                        if (bb8Var3.H == bb8.a.b) {
                            xlb xlbVar = bb8Var3.D;
                            if (xlbVar == null) {
                                Intrinsics.n("betHistoryArchiveFetchManager");
                                throw null;
                            }
                            xlbVar.invoke(Integer.valueOf(bb8Var3.F + bb8Var3.E), Integer.valueOf(bb8Var3.E));
                        }
                        return Unit.a;
                    }
                };
                pn80Var.b = va8Var;
                pn80Var.c = function0;
                bb8Var2.c().setAdapter(pn80Var);
                op5 op5Var = op5.a;
                TextView textView = bb8Var2.c;
                if (textView == null) {
                    Intrinsics.n("time");
                    throw null;
                }
                TextView textView2 = bb8Var2.d;
                if (textView2 == null) {
                    Intrinsics.n("stake");
                    throw null;
                }
                TextView textView3 = bb8Var2.e;
                if (textView3 == null) {
                    Intrinsics.n(AnalyticsParam.EVENT_STATUS);
                    throw null;
                }
                TextView textView4 = bb8Var2.f;
                if (textView4 == null) {
                    Intrinsics.n("coeff");
                    throw null;
                }
                TextView textView5 = bb8Var2.i;
                if (textView5 == null) {
                    Intrinsics.n("noRecordText");
                    throw null;
                }
                op5.r(op5Var, kotlin.collections.b.f(textView, textView2, textView3, textView4, textView5), null, 4);
                wlb wlbVar = bb8Var2.C;
                if (wlbVar == null) {
                    Intrinsics.n("betHistoryFetchManager");
                    throw null;
                }
                wlbVar.invoke(Integer.valueOf(bb8Var2.F + bb8Var2.E), Integer.valueOf(bb8Var2.E));
                this.Z = bb8Var2;
            }
            bb8 bb8Var3 = this.Z;
            if (bb8Var3 != null) {
                bb8Var3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ylb
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        bb8 bb8Var4 = this.a.Z;
                        if (bb8Var4 != null) {
                            bb8Var4.b();
                        }
                    }
                });
            }
        }
    }

    public final void S0(final Integer num, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVarI = aVar.i(549700738);
        int i3 = (bVarI.M(num) ? 4 : 2) | i2 | (bVarI.A(this) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            bVarI.N(-575454145);
            if (num.intValue() > 0) {
                bVarI.N(922945693);
                float fIntValue = num.intValue() / getResources().getDisplayMetrics().widthPixels;
                float f2 = 0.298f;
                if (fIntValue < 2.2f && fIntValue < 2.0f) {
                    if (fIntValue >= 1.89f) {
                        f2 = 0.305f;
                    } else {
                        f2 = 0.30625f;
                        if (fIntValue < 1.8f && fIntValue < 1.7f) {
                            f2 = fIntValue >= 1.5f ? 0.36f : 0.32f;
                        }
                    }
                }
                final float fIntValue2 = num.intValue() * f2;
                hvi hviVar = this.a;
                ComposeView composeView = hviVar != null ? hviVar.i : null;
                if (composeView == null) {
                    bVarI.N(923325752);
                } else {
                    bVarI.N(923325753);
                    composeView.setViewCompositionStrategy(u6i0.c.a);
                    composeView.setContent(pp8.b(496266686, new Function2() { // from class: ikb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar2;
                            a aVar3 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                float fB = lla.b((((Configuration) aVar3.O(AndroidCompositionLocals_androidKt.a)).screenWidthDp * ((mmd) aVar3.O(kna.h)).getDensity()) / 30.0f, aVar3);
                                d.a aVar4 = d.a.b;
                                d dVarE = j.e(aVar4, 1.0f);
                                n54 n54Var = ht.a.a;
                                aiv aivVarC = g75.c(n54Var, false);
                                int iHashCode = Long.hashCode(aVar3.m());
                                ne00 ne00VarO = aVar3.o();
                                d dVarC = c.c(aVar3, dVarE);
                                yka.k.getClass();
                                tsr.a aVar5 = yka.a.b;
                                if (aVar3.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar3.D();
                                if (aVar3.g()) {
                                    aVar3.F(aVar5);
                                } else {
                                    aVar3.p();
                                }
                                yka.a.b bVar = yka.a.f;
                                hlh0.a(aVar3, aivVarC, bVar);
                                yka.a.d dVar = yka.a.e;
                                hlh0.a(aVar3, ne00VarO, dVar);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                }
                                yka.a.c cVar = yka.a.d;
                                hlh0.a(aVar3, dVarC, cVar);
                                if (((Boolean) ((x5a0) this.a.p0().W).getValue()).booleanValue()) {
                                    aVar3.N(-78946358);
                                    d dVarF = h.f(androidx.compose.foundation.a.b(h.h(g.d(androidx.compose.foundation.layout.d.a.b(j.A(j.g(aVar4, 1.0f), null, 3), ht.a.h), 0.0f, (-lla.b(fIntValue2, aVar3)) - 5.0f, 1), fB, 0.0f, 2), r58.d(4294498313L), j060.c(fw20.a(R.dimen._6sdp, aVar3))), 4.0f);
                                    aiv aivVarC2 = g75.c(n54Var, false);
                                    int iHashCode2 = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO2 = aVar3.o();
                                    d dVarC2 = c.c(aVar3, dVarF);
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, aivVarC2, bVar);
                                    hlh0.a(aVar3, ne00VarO2, dVar);
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                                    }
                                    hlh0.a(aVar3, dVarC2, cVar);
                                    lkf0.b(op5.c(op5.a, pwo.e(R.string.exceed_error_text_cms, aVar3), pwo.e(R.string.exceed_max_payout_error, aVar3)), h.h(aVar4, 4.0f, 0.0f, 2), r58.d(4282597432L), 0L, null, null, null, 0L, new gdf0(3), 0L, 2, false, 2, 0, null, ni60.g(((sfd0) aVar3.O(ni60.b)).c, R.dimen._10ssp, aVar3), aVar3, 432, 3120, 54776);
                                    aVar2 = aVar3;
                                    aVar2.s();
                                } else {
                                    aVar2 = aVar3;
                                    aVar2.N(-123976214);
                                }
                                aVar2.H();
                                aVar2.s();
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI));
                }
                bVarI.X(false);
            } else {
                bVarI.N(878932854);
            }
            bVarI.X(false);
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(num, i2) { // from class: jkb
                public final /* synthetic */ Integer b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.S0(this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public final void T0(Context context, ResultWrapper.GenericError genericError) {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            l260 l260Var = l260.e;
            v0();
            jcg.d(l260Var, activity, "Rush", genericError, new ljb(this, 0), null, null, 0, context.getColor(R.color.try_again_color), null, null, null, new Function1() { // from class: mjb
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    str.getClass();
                    this.a.o0(str);
                    return Unit.a;
                }
            }, null, 97760);
        }
    }

    public final void U0() {
        Double d2 = this.c0;
        if ((d2 != null ? d2.doubleValue() : 0.0d) < this.t0 * 2.0d) {
            s0().C1(true);
            hvi hviVar = this.a;
            if (hviVar != null) {
                hviVar.z.F(R.drawable.hamberger_add_more_red);
                return;
            }
            return;
        }
        s0().C1(false);
        hvi hviVar2 = this.a;
        if (hviVar2 != null) {
            hviVar2.z.F(R.drawable.hamberger_add_more_bg);
        }
    }

    @Override // defpackage.bb
    public final void f0(m8 m8Var) {
        System.currentTimeMillis();
    }

    public final void j0(final boolean z2, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVar;
        boolean z3;
        androidx.compose.runtime.b bVarI = aVar.i(1552409368);
        int i3 = (bVarI.b(z2) ? 4 : 2) | i2 | (bVarI.A(this) ? 32 : 16);
        int i4 = 0;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            if (z2) {
                bVarI.N(-380244399);
                String strConcat = "+".concat(op5.c(op5.a, pwo.e(R.string.addmoney_text_cms, bVarI), pwo.e(R.string.sg_rush_add_money, bVarI)));
                imf0 imf0VarB = imf0.b(ni60.g(((sfd0) bVarI.O(ni60.b)).e, R.dimen._10sdp, bVarI), c68.a(R.color.add_button_color, bVarI), 0L, null, null, null, 0L, null, new ix80(2.0f, j58.b, (((long) Float.floatToRawIntBits(6.0f)) << 32) | (((long) Float.floatToRawIntBits(6.0f)) & 4294967295L)), null, 0, 0L, null, null, 16769022);
                androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.h.j(androidx.compose.ui.d.a.b, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                boolean zA = bVarI.A(this);
                Object objY = bVarI.y();
                if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new jmb(this, i4);
                    bVarI.r(objY);
                }
                z3 = false;
                lkf0.b(strConcat, androidx.compose.foundation.d.d(dVarJ, false, null, null, (Function0) objY, 15), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarB, bVarI, 0, 0, 65532);
                bVar = bVarI;
            } else {
                bVar = bVarI;
                z3 = false;
                bVar.N(-551660790);
            }
            bVar.X(z3);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z2, i2) { // from class: kmb
                public final /* synthetic */ boolean b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.j0(this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0143  */
    /* JADX WARN: Code duplicated, block: B:58:0x0150  */
    /* JADX WARN: Code duplicated, block: B:61:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x015e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0168  */
    /* JADX WARN: Code duplicated, block: B:69:0x019a  */
    /* JADX WARN: Code duplicated, block: B:70:0x019e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d9  */
    public final void m0(final int i2, androidx.compose.runtime.a aVar, androidx.compose.ui.d dVar, final Function0 function0, final boolean z2) {
        final androidx.compose.ui.d dVar2;
        int i3;
        float f2;
        float f3;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objY;
        int iHashCode;
        boolean zA;
        Object objY2;
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(434840134);
        int i4 = i2 | (bVarI.b(z2) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | 384 | (bVarI.A(this) ? 2048 : 1024);
        if (bVarI.q(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z6 = ((Number) ((x5a0) p0().a0).getValue()).doubleValue() > 0.0d;
            Object objY3 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY3 == c0042a) {
                objY3 = ee0.a(0.0f);
                bVarI.r(objY3);
            }
            final wd0 wd0Var = (wd0) objY3;
            Unit unit = Unit.a;
            boolean zA2 = bVarI.A(wd0Var);
            Object objY4 = bVarI.y();
            if (zA2 || objY4 == c0042a) {
                objY4 = new dnb(wd0Var, null);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, unit, (Function2) objY4);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarA = s3w.a(androidx.compose.foundation.layout.h.h(androidx.compose.foundation.layout.j.g(aVar2, 1.0f), 16.0f, 0.0f, 2), "fbg_button");
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                i3 = i4;
            } else {
                i3 = i4;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                androidx.compose.ui.d dVarA2 = ls7.a(lx80.d(androidx.compose.foundation.layout.c.a(aVar2, 1.2f), 10.0f, j060.c(4.0f), false, 0L, 0L, 24), j060.c(6.0f));
                boolean z7 = z6;
                long j2 = j58.b;
                if (!z2 || z7) {
                    f2 = 0.3f;
                } else {
                    f2 = 0.5f;
                }
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarA2, j58.c(f2, j2), zk40.a);
                if (!z2 || z7) {
                    f3 = 0.5f;
                } else {
                    f3 = 1.0f;
                }
                androidx.compose.ui.d dVarA3 = dw.a(dVarB, f3);
                if (!z2 || z7) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                boolean zA3 = bVarI.A(this);
                if ((i3 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zA3 | z4;
                objY = bVarI.y();
                if (z5 || objY == c0042a) {
                    objY = new Function0() { // from class: qlb
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            enb enbVar = this.a;
                            if (((Boolean) ((x5a0) enbVar.p0().Q).getValue()).booleanValue()) {
                                enbVar.F0();
                            }
                            function0.invoke();
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                androidx.compose.ui.d dVarD = androidx.compose.foundation.d.d(dVarA3, z3, null, null, (Function0) objY, 14);
                aiv aivVarC2 = g75.c(ht.a.e, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarD);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                crz crzVarA = erz.a(R.drawable.fbg_icon, 0, bVarI);
                androidx.compose.ui.d dVarE = androidx.compose.foundation.layout.j.e(aVar2, 0.75f);
                zA = bVarI.A(wd0Var);
                objY2 = bVarI.y();
                if (zA || objY2 == c0042a) {
                    objY2 = new Function1() { // from class: rlb
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            a7l a7lVar = (a7l) obj;
                            a7lVar.getClass();
                            a7lVar.u(((Number) wd0Var.d()).floatValue());
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                h9n.a(crzVarA, "Next Rain Cloud", androidx.compose.ui.graphics.a.a(dVarE, (Function1) objY2), null, null, 0.0f, null, bVarI, 48, 120);
                bVarI.X(true);
                bVarI.X(true);
                dVar2 = aVar2;
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            androidx.compose.ui.d dVarA4 = ls7.a(lx80.d(androidx.compose.foundation.layout.c.a(aVar2, 1.2f), 10.0f, j060.c(4.0f), false, 0L, 0L, 24), j060.c(6.0f));
            boolean z8 = z6;
            long j3 = j58.b;
            if (z2) {
                f2 = 0.3f;
            } else {
                f2 = 0.3f;
            }
            androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(dVarA4, j58.c(f2, j3), zk40.a);
            if (z2) {
                f3 = 0.5f;
            } else {
                f3 = 0.5f;
            }
            androidx.compose.ui.d dVarA5 = dw.a(dVarB2, f3);
            if (z2) {
                z3 = false;
            } else {
                z3 = false;
            }
            boolean zA4 = bVarI.A(this);
            if ((i3 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = zA4 | z4;
            objY = bVarI.y();
            if (z5) {
                objY = new Function0() { // from class: qlb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        enb enbVar = this.a;
                        if (((Boolean) ((x5a0) enbVar.p0().Q).getValue()).booleanValue()) {
                            enbVar.F0();
                        }
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                objY = new Function0() { // from class: qlb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        enb enbVar = this.a;
                        if (((Boolean) ((x5a0) enbVar.p0().Q).getValue()).booleanValue()) {
                            enbVar.F0();
                        }
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarD2 = androidx.compose.foundation.d.d(dVarA5, z3, null, null, (Function0) objY, 14);
            aiv aivVarC3 = g75.c(ht.a.e, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarD2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC3, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar3);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar2);
            crz crzVarA2 = erz.a(R.drawable.fbg_icon, 0, bVarI);
            androidx.compose.ui.d dVarE2 = androidx.compose.foundation.layout.j.e(aVar2, 0.75f);
            zA = bVarI.A(wd0Var);
            objY2 = bVarI.y();
            if (zA) {
                objY2 = new Function1() { // from class: rlb
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.u(((Number) wd0Var.d()).floatValue());
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            } else {
                objY2 = new Function1() { // from class: rlb
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.u(((Number) wd0Var.d()).floatValue());
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            h9n.a(crzVarA2, "Next Rain Cloud", androidx.compose.ui.graphics.a.a(dVarE2, (Function1) objY2), null, null, 0.0f, null, bVarI, 48, 120);
            bVarI.X(true);
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z2, function0, dVar2, i2) { // from class: slb
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ d d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.m0(iA, (a) obj, this.d, this.c, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public final void n0(int i2, final int i3, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-1731700938);
        int i4 = (bVarI.d(R.color.sb_black_100) ? 4 : 2) | i3 | (bVarI.A(this) ? 32 : 16);
        if (bVarI.q(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            View view = (View) bVarI.O(AndroidCompositionLocals_androidKt.f);
            context.getClass();
            Activity activity = (Activity) context;
            if (view.isInEditMode()) {
                bVarI.N(1991211468);
            } else {
                bVarI.N(2044724226);
                boolean zA = bVarI.A(this) | bVarI.A(activity) | ((i4 & 14) == 4);
                Object objY = bVarI.y();
                if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new olb(this, activity);
                    bVarI.r(objY);
                }
                use useVar = xvf.a;
                bVarI.t((Function0) objY);
            }
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i3) { // from class: plb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.n0(R.color.sb_black_100, iA, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00d0  */
    public final void o0(String str) {
        svg svgVar;
        Integer numValueOf;
        androidx.fragment.app.e activity;
        String name;
        Integer id;
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        if (C0() && ((this.O || !((Boolean) ((x5a0) this.N).getValue()).booleanValue()) && str == null)) {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        bb8 bb8Var = this.Z;
        if (bb8Var != null && bb8Var.isShowing()) {
            bb8 bb8Var2 = this.Z;
            if (bb8Var2 != null) {
                bb8Var2.dismiss();
                return;
            }
            return;
        }
        if (((Boolean) ((x5a0) this.V).getValue()).booleanValue()) {
            return;
        }
        androidx.fragment.app.e activity3 = getActivity();
        int i2 = 0;
        if (((activity3 == null || (supportFragmentManager2 = activity3.getSupportFragmentManager()) == null) ? 0 : supportFragmentManager2.L()) > 0) {
            androidx.fragment.app.e activity4 = getActivity();
            if (activity4 == null || (supportFragmentManager = activity4.getSupportFragmentManager()) == null) {
                return;
            }
            supportFragmentManager.a0();
            return;
        }
        ArrayList<GameDetails> arrayList = this.f0;
        if (arrayList != null) {
            GameDetails gameDetails = this.G;
            int iIntValue = (gameDetails == null || (id = gameDetails.getId()) == null) ? 0 : id.intValue();
            GameDetails gameDetails2 = this.G;
            if (gameDetails2 == null || (name = gameDetails2.getName()) == null) {
                name = "";
            }
            svgVar = new svg();
            svgVar.c = arrayList;
            svgVar.d = Integer.valueOf(iIntValue);
            svgVar.e = name;
            svgVar.i = str;
        } else {
            svgVar = null;
        }
        androidx.fragment.app.e activity5 = getActivity();
        if (activity5 != null) {
            FragmentManager supportFragmentManager3 = activity5.getSupportFragmentManager();
            supportFragmentManager3.getClass();
            if (svgVar != null) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager3);
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
        GameDetails gameDetails3 = this.G;
        wz.a("BackInGame", gameDetails3 != null ? gameDetails3.getName() : null, new String[0]);
        if (str != null) {
            xbg xbgVar = this.H;
            if (xbgVar != null) {
                String string = getString(R.string.label_dialog_exit);
                string.getClass();
                xbg.c(xbgVar, str, string, new zkb(this, i2), new klb(), activity.getColor(R.color.try_again_color), 224);
                xbgVar.a();
                return;
            }
            return;
        }
        v0();
        op5 op5Var = op5.a;
        String string2 = getString(R.string.exit_confirm_msg_cms);
        string2.getClass();
        String string3 = getString(R.string.exit_text);
        string3.getClass();
        op5Var.getClass();
        String strB = op5.b(string2, string3, null);
        String string4 = getString(R.string.stay_btn_cms);
        string4.getClass();
        String string5 = getString(R.string.stay);
        string5.getClass();
        String strB2 = op5.b(string4, string5, null);
        String string6 = getString(R.string.exit_btn_cms);
        string6.getClass();
        String string7 = getString(R.string.label_dialog_exit);
        string7.getClass();
        this.p0 = com.sportygames.commons.components.a.C0437a.a("Rush", JsPluginCommon.GAMES_EXIT, strB, "", strB2, op5.b(string6, string7, null), new gkb(this, i2), new qkb(0), activity.getColor(R.color.redblack_confirm_dialog_left_button), activity.getColor(R.color.redblack_confirm_dialog_right_button), 4096);
        androidx.fragment.app.e activity6 = getActivity();
        FragmentManager supportFragmentManager4 = activity6 != null ? activity6.getSupportFragmentManager() : null;
        com.sportygames.commons.components.a aVar2 = this.p0;
        if (aVar2 == null || supportFragmentManager4 == null) {
            return;
        }
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager4);
        aVar3.f(R.id.flContent, aVar2, null);
        aVar3.c("CONFIRM_DIALOG_FRAGMENT");
        aVar3.k(false, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        try {
            hvi hviVarA = hvi.a(layoutInflater);
            this.a = hviVarA;
            return hviVarA.a;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ((fuj) this.w.getValue()).y1();
        ((x5a0) this.q0).setValue(Boolean.FALSE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String name;
        String name2;
        q8i0 q8i0Var = this.y;
        q8i0 q8i0Var2 = this.w;
        super.onResume();
        if (((Boolean) ((x5a0) this.N).getValue()).booleanValue()) {
            L0();
        }
        try {
            ((fuj) q8i0Var2.getValue()).x1();
            GameDetails gameDetails = this.G;
            String str = "";
            if (gameDetails == null || (name = gameDetails.getName()) == null) {
                name = "";
            }
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ra6.c(name, viewLifecycleOwner, (db6) q8i0Var.getValue(), (fuj) q8i0Var2.getValue());
            GameDetails gameDetails2 = this.G;
            if (gameDetails2 != null && (name2 = gameDetails2.getName()) != null) {
                str = name2;
            }
            androidx.fragment.app.e activity = getActivity();
            ibs viewLifecycleOwner2 = getViewLifecycleOwner();
            viewLifecycleOwner2.getClass();
            hvi hviVar = this.a;
            ra6.b(str, activity, viewLifecycleOwner2, hviVar != null ? hviVar.w : null, this.z, (fuj) q8i0Var2.getValue(), (db6) q8i0Var.getValue(), p58.a, null, new tld0(this.G), new rhb(this, 0), new Function0() { // from class: yjb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    try {
                        this.a.w0().y1();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    return Unit.a;
                }
            }, null, 17920);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((x5a0) p0().e).setValue(Boolean.FALSE);
        ((x5a0) p0().B).setValue(0);
        v91.b.j("0");
        if (this.a != null) {
            v0().I1();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        float fFloatValue;
        ssw<Integer> liveData;
        Resources resources;
        DisplayMetrics displayMetrics;
        Resources resources2;
        Resources resources3;
        String[] stringArray;
        view.getClass();
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            this.b = un20.a(context);
        }
        Context context2 = getContext();
        if (context2 != null && (resources3 = context2.getResources()) != null && (stringArray = resources3.getStringArray(R.array.cms_array)) != null) {
            ArrayList arrayListU = ay0.U(stringArray);
            ArrayList arrayList = this.f;
            arrayList.addAll(arrayListU);
            arrayList.add("sg_campaign");
        }
        qry.a(view, new c(view, this));
        s0().A1(true);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            String str = ((db6) this.y.getValue()).c;
            if (str == null) {
                str = "Ongoing";
            }
            this.z = new z66(activity, str);
            if (getContext() != null) {
                v0();
                this.H = new xbg(activity, "Rush");
                SportyGamesManager.getInstance().addAccountUpdatedListener(this);
                ((x5a0) this.R).setValue(Boolean.FALSE);
                this.l0 = true;
                hvi hviVar = this.a;
                ViewGroup.LayoutParams layoutParams = null;
                ViewGroup.LayoutParams layoutParams2 = hviVar != null ? hviVar.F.getLayoutParams() : null;
                layoutParams2.getClass();
                ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
                layoutParams3.S -= 0.0205f;
                hvi hviVar2 = this.a;
                if (hviVar2 != null) {
                    hviVar2.F.setLayoutParams(layoutParams3);
                }
                hvi hviVar3 = this.a;
                int i2 = 0;
                if (hviVar3 != null) {
                    hviVar3.F.setVisibility(0);
                }
                hvi hviVar4 = this.a;
                u6i0.c cVar = u6i0.c.a;
                if (hviVar4 != null) {
                    ComposeView composeView = hviVar4.F;
                    composeView.setViewCompositionStrategy(cVar);
                    composeView.setContent(new op8(529365845, new Function2() { // from class: vlb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                d dVarA = s3w.a(androidx.compose.foundation.a.b(j.c(j.g(d.a.b, 1.0f), 1.0f), j58.l, zk40.a), "round_history_view");
                                aiv aivVarC = g75.c(ht.a.e, false);
                                int iHashCode = Long.hashCode(aVar.m());
                                ne00 ne00VarO = aVar.o();
                                d dVarC = c.c(aVar, dVarA);
                                yka.k.getClass();
                                tsr.a aVar2 = yka.a.b;
                                if (aVar.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar.D();
                                if (aVar.g()) {
                                    aVar.F(aVar2);
                                } else {
                                    aVar.p();
                                }
                                hlh0.a(aVar, aivVarC, yka.a.f);
                                hlh0.a(aVar, ne00VarO, yka.a.e);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar, iHashCode, c1350a);
                                }
                                hlh0.a(aVar, dVarC, yka.a.d);
                                enb enbVar = this.a;
                                uia.a(new PreviousMultiplierResponse(CollectionsKt.C0((Collection) ((x5a0) enbVar.s0().C).getValue())), (CrashInitiatedCoeffListResponse) ((x5a0) enbVar.s0().D).getValue(), enbVar.t0(), aVar, 0);
                                aVar.s();
                            } else {
                                aVar.G();
                            }
                            return Unit.a;
                        }
                    }, true));
                }
                hvi hviVar5 = this.a;
                if (hviVar5 != null) {
                    ComposeView composeView2 = hviVar5.v;
                    composeView2.setViewCompositionStrategy(cVar);
                    composeView2.setContent(new op8(-1886074828, new gmb(this), true));
                }
                hvi hviVar6 = this.a;
                if (hviVar6 != null) {
                    ComposeView composeView3 = hviVar6.A;
                    composeView3.setViewCompositionStrategy(cVar);
                    composeView3.setContent(new op8(-6548205, new rmb(this, i2), true));
                }
                hvi hviVar7 = this.a;
                if (hviVar7 != null) {
                    ComposeView composeView4 = hviVar7.I;
                    composeView4.setViewCompositionStrategy(cVar);
                    composeView4.setContent(new op8(1872978418, new cnb(this), true));
                }
                hvi hviVar8 = this.a;
                if (hviVar8 != null) {
                    ComposeView composeView5 = hviVar8.J;
                    composeView5.setViewCompositionStrategy(cVar);
                    composeView5.setContent(new op8(-542462255, new Function2() { // from class: cib
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                enb enbVar = this.a;
                                if (!((Boolean) ((x5a0) enbVar.u0().P).getValue()).booleanValue() || ((CharSequence) ((x5a0) enbVar.u0().Q).getValue()).length() <= 0) {
                                    aVar.N(1448282385);
                                } else {
                                    aVar.N(1469042000);
                                    z3w.a(0, enbVar.t0(), aVar, (String) ((x5a0) enbVar.u0().Q).getValue());
                                }
                                aVar.H();
                            } else {
                                aVar.G();
                            }
                            return Unit.a;
                        }
                    }, true));
                }
                hvi hviVar9 = this.a;
                ComposeView composeView6 = hviVar9 != null ? hviVar9.d : null;
                SharedPreferences sharedPreferences = this.b;
                this.Y = sharedPreferences != null ? sharedPreferences.edit() : null;
                Context context3 = getContext();
                DisplayMetrics displayMetrics2 = (context3 == null || (resources2 = context3.getResources()) == null) ? null : resources2.getDisplayMetrics();
                Integer num = (Integer) ((x5a0) this.z0).getValue();
                if (num != null) {
                    Context context4 = getContext();
                    Float f2 = (Float) qi8.c(num.intValue(), (context4 == null || (resources = context4.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 1 : displayMetrics.widthPixels).get("cashoutToastHeight");
                    fFloatValue = f2 != null ? f2.floatValue() : 0.065f;
                } else {
                    fFloatValue = 0.075f;
                }
                int iMax = Math.max((int) ((displayMetrics2 != null ? displayMetrics2.heightPixels : 1) * fFloatValue), (int) TypedValue.applyDimension(1, 40.0f, displayMetrics2));
                if (composeView6 != null) {
                    ViewGroup.LayoutParams layoutParams4 = composeView6.getLayoutParams();
                    if (layoutParams4 != null) {
                        layoutParams4.height = iMax;
                        layoutParams = layoutParams4;
                    }
                    composeView6.setLayoutParams(layoutParams);
                }
                if (composeView6 != null) {
                    composeView6.requestLayout();
                }
                hvi hviVar10 = this.a;
                if (hviVar10 != null) {
                    hviVar10.E.setVisibility(0);
                }
                hvi hviVar11 = this.a;
                if (hviVar11 != null) {
                    hviVar11.E.setProgressForApi(14);
                }
                hvi hviVar12 = this.a;
                if (hviVar12 != null) {
                    hviVar12.E.setCurrentProgress(2);
                }
                hvi hviVar13 = this.a;
                if (hviVar13 != null && (liveData = hviVar13.E.getLiveData()) != null) {
                    liveData.f(getViewLifecycleOwner(), new lfy() { // from class: hkb
                        @Override // defpackage.lfy
                        public final void u1(Object obj) {
                            Integer num2 = (Integer) obj;
                            if (num2 != null && num2.intValue() == 100) {
                                pfd pfdVar = fse.a;
                                ej5.c(w5b.a(gku.a), null, null, new qnb(this.a, null), 3);
                            }
                        }
                    });
                }
                if (composeView6 != null) {
                    composeView6.setViewCompositionStrategy(cVar);
                    composeView6.setContent(new op8(801150318, new Function2() { // from class: mib
                        /* JADX WARN: Code duplicated, block: B:70:0x0280  */
                        /* JADX WARN: Code duplicated, block: B:73:0x0290  */
                        /* JADX WARN: Code duplicated, block: B:76:0x02a0  */
                        /* JADX WARN: Code duplicated, block: B:79:0x02b0  */
                        /* JADX WARN: Code duplicated, block: B:82:0x02c0  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r12v16 */
                        /* JADX WARN: Type inference failed for: r12v17, types: [a6b, kotlin.coroutines.CoroutineContext, v1b] */
                        /* JADX WARN: Type inference failed for: r12v25 */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) throws Throwable {
                            a.C0041a.C0042a c0042a;
                            Object nVar;
                            enb enbVar;
                            a.C0041a.C0042a c0042a2;
                            int i3;
                            a.C0041a.C0042a c0042a3;
                            ?? r12;
                            int i4;
                            Integer num2;
                            hvi hviVar14;
                            Throwable th;
                            ytw<DetailResponse> ytwVar;
                            DetailResponse detailResponse;
                            ytw<DetailResponse> ytwVar2;
                            DetailResponse detailResponse2;
                            ytw<DetailResponse> ytwVar3;
                            DetailResponse detailResponse3;
                            ytw<DetailResponse> ytwVar4;
                            DetailResponse detailResponse4;
                            a.C0041a.C0042a c0042a4;
                            int i5;
                            boolean zA;
                            Object objY;
                            Object objY2;
                            Object objY3;
                            Object objY4;
                            Object objY5;
                            List<tpy> listB;
                            a aVar = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            Double dValueOf = Double.valueOf(0.0d);
                            int i6 = 0;
                            if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final enb enbVar2 = this.a;
                                ip8 ip8VarS0 = enbVar2.s0();
                                ytw<Boolean> ytwVar5 = enbVar2.W;
                                ytw<Boolean> ytwVar6 = enbVar2.q0;
                                ytw<Boolean> ytwVar7 = enbVar2.N;
                                ytw ytwVarC = wyh.c(ip8VarS0.A, aVar, 0, 7);
                                ip8 ip8VarS1 = enbVar2.s0();
                                mz1 mz1VarT0 = enbVar2.t0();
                                cj5 cj5VarR0 = enbVar2.r0();
                                String str2 = (String) ((x5a0) enbVar2.u0().a).getValue();
                                String str3 = (String) ((x5a0) enbVar2.u0().c).getValue();
                                boolean zA2 = aVar.A(enbVar2);
                                Object objY6 = aVar.y();
                                a.C0041a.C0042a c0042a5 = a.C0041a.a;
                                if (zA2 || objY6 == c0042a5) {
                                    c0042a = c0042a5;
                                    enb.h hVar = new enb.h(0, enbVar2, enb.class, "onMenuClicked", "onMenuClicked()V", 0);
                                    aVar.r(hVar);
                                    objY6 = hVar;
                                } else {
                                    c0042a = c0042a5;
                                }
                                chp chpVar = (chp) objY6;
                                boolean zA3 = aVar.A(enbVar2);
                                Object objY7 = aVar.y();
                                if (zA3 || objY7 == c0042a) {
                                    enb.k kVar = new enb.k(0, enbVar2, enb.class, "showExitRecommendation", "showExitRecommendation()V", 0);
                                    aVar.r(kVar);
                                    objY7 = kVar;
                                }
                                chp chpVar2 = (chp) objY7;
                                boolean zA4 = aVar.A(enbVar2);
                                Object objY8 = aVar.y();
                                if (zA4 || objY8 == c0042a) {
                                    enb.m mVar = new enb.m(0, enbVar2, enb.class, "onChatClicked", "onChatClicked()V", 0);
                                    aVar.r(mVar);
                                    objY8 = mVar;
                                }
                                chp chpVar3 = (chp) objY8;
                                boolean zA5 = aVar.A(enbVar2);
                                Object objY9 = aVar.y();
                                if (zA5 || objY9 == c0042a) {
                                    nVar = new enb.n(0, enbVar2, enb.class, "onAddMoneyClicked", "onAddMoneyClicked()V", 0);
                                    aVar.r(nVar);
                                } else {
                                    nVar = objY9;
                                }
                                boolean zBooleanValue = ((Boolean) ((x5a0) enbVar2.u0().P).getValue()).booleanValue();
                                Function0 function0 = (Function0) chpVar;
                                Function0 function1 = (Function0) chpVar2;
                                Function0 function2 = (Function0) chpVar3;
                                Function0 function3 = (Function0) ((chp) nVar);
                                boolean zA6 = aVar.A(enbVar2);
                                Object objY10 = aVar.y();
                                if (zA6 || objY10 == c0042a) {
                                    objY10 = new Function0() { // from class: qjb
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Boolean.valueOf(enbVar2.C0());
                                        }
                                    };
                                    aVar.r(objY10);
                                }
                                Function0 function4 = (Function0) objY10;
                                boolean zA7 = aVar.A(enbVar2);
                                Object objY11 = aVar.y();
                                if (zA7 || objY11 == c0042a) {
                                    objY11 = new xjb(enbVar2, i6);
                                    aVar.r(objY11);
                                }
                                a.C0041a.C0042a c0042a6 = c0042a;
                                x2i0.a(str2, str3, mz1VarT0, cj5VarR0, ip8VarS1, 0.7f, function0, function1, function2, function3, function4, (Function0) objY11, 0L, zBooleanValue, aVar, 196608, 4096);
                                a aVar2 = aVar;
                                Integer num3 = (Integer) ((x5a0) enbVar2.z0).getValue();
                                if (num3 != null) {
                                    int iIntValue2 = num3.intValue();
                                    String str4 = (String) ((x5a0) enbVar2.u0().a).getValue();
                                    boolean zIsChatEnable = ((CrashHeaderState) ytwVarC.getValue()).isChatEnable();
                                    if (Intrinsics.g(str4, "one-punch")) {
                                        Context context5 = enbVar2.getContext();
                                        listB = context5 != null ? ry60.b(iIntValue2, context5, zIsChatEnable) : null;
                                        listB.getClass();
                                    } else {
                                        Context context6 = enbVar2.getContext();
                                        listB = context6 != null ? ry60.b(iIntValue2, context6, zIsChatEnable) : null;
                                        listB.getClass();
                                    }
                                    enbVar2.n0 = listB;
                                    Unit unit = Unit.a;
                                }
                                if (((Boolean) ((x5a0) enbVar2.w0).getValue()).booleanValue()) {
                                    aVar2.N(-62346734);
                                    HashMap map = new HashMap();
                                    op5 op5Var = op5.a;
                                    String currencyCode = ((CrashHeaderState) enbVar2.s0().A.getValue()).getCurrencyCode();
                                    if (currencyCode == null) {
                                        currencyCode = "";
                                    }
                                    op5Var.getClass();
                                    map.put("{currency}", op5.i(currencyCode));
                                    map.put("{amount}", String.valueOf(enbVar2.w0().c));
                                    String strB = op5.b("bet_per_round:sg_common", "Bet Per Round : ", map);
                                    ArrayList<Double> autoBetChips = ((DetailResponse) ((x5a0) enbVar2.p0().d0).getValue()).getAutoBetChips();
                                    String currencyCode2 = ((CrashHeaderState) enbVar2.s0().A.getValue()).getCurrencyCode();
                                    if (currencyCode2 == null) {
                                        currencyCode2 = "";
                                    }
                                    String strI = op5.i(currencyCode2);
                                    ytw ytwVarB = m.b(dValueOf);
                                    ytw ytwVarB2 = m.b(dValueOf);
                                    ytw ytwVarB3 = m.b(dValueOf);
                                    ytw ytwVarB4 = m.b(dValueOf);
                                    boolean zA8 = aVar2.A(enbVar2);
                                    Object objY12 = aVar2.y();
                                    if (zA8) {
                                        c0042a4 = c0042a6;
                                    } else {
                                        c0042a4 = c0042a6;
                                        if (objY12 != c0042a4) {
                                            i5 = 0;
                                        }
                                        Function0 function5 = (Function0) objY12;
                                        zA = aVar2.A(enbVar2);
                                        objY = aVar2.y();
                                        if (zA || objY == c0042a4) {
                                            objY = new akb(enbVar2, i5);
                                            aVar2.r(objY);
                                        }
                                        Function1 function6 = (Function1) objY;
                                        objY2 = aVar2.y();
                                        if (objY2 == c0042a4) {
                                            objY2 = new bkb();
                                            aVar2.r(objY2);
                                        }
                                        Function0 function7 = (Function0) objY2;
                                        objY3 = aVar2.y();
                                        if (objY3 == c0042a4) {
                                            objY3 = new ckb();
                                            aVar2.r(objY3);
                                        }
                                        Function0 function8 = (Function0) objY3;
                                        objY4 = aVar2.y();
                                        if (objY4 == c0042a4) {
                                            objY4 = new dkb();
                                            aVar2.r(objY4);
                                        }
                                        Function0 function9 = (Function0) objY4;
                                        objY5 = aVar2.y();
                                        if (objY5 == c0042a4) {
                                            objY5 = new ekb();
                                            aVar2.r(objY5);
                                        }
                                        c0042a2 = c0042a4;
                                        enbVar = enbVar2;
                                        f81.a(strB, autoBetChips, function5, function6, null, strI, ytwVarB, ytwVarB2, null, ytwVarB3, ytwVarB4, function7, function8, null, function9, (Function0) objY5, "", "", false, false, aVar2, 0, 920347056, 8464);
                                        aVar2 = aVar2;
                                        aVar2.H();
                                        i3 = -86677580;
                                    }
                                    i5 = 0;
                                    objY12 = new zjb(enbVar2, i5);
                                    aVar2.r(objY12);
                                    Function0 function10 = (Function0) objY12;
                                    zA = aVar2.A(enbVar2);
                                    objY = aVar2.y();
                                    if (zA) {
                                        objY = new akb(enbVar2, i5);
                                        aVar2.r(objY);
                                    } else {
                                        objY = new akb(enbVar2, i5);
                                        aVar2.r(objY);
                                    }
                                    Function1 function11 = (Function1) objY;
                                    objY2 = aVar2.y();
                                    if (objY2 == c0042a4) {
                                        objY2 = new bkb();
                                        aVar2.r(objY2);
                                    }
                                    Function0 function12 = (Function0) objY2;
                                    objY3 = aVar2.y();
                                    if (objY3 == c0042a4) {
                                        objY3 = new ckb();
                                        aVar2.r(objY3);
                                    }
                                    Function0 function13 = (Function0) objY3;
                                    objY4 = aVar2.y();
                                    if (objY4 == c0042a4) {
                                        objY4 = new dkb();
                                        aVar2.r(objY4);
                                    }
                                    Function0 function14 = (Function0) objY4;
                                    objY5 = aVar2.y();
                                    if (objY5 == c0042a4) {
                                        objY5 = new ekb();
                                        aVar2.r(objY5);
                                    }
                                    c0042a2 = c0042a4;
                                    enbVar = enbVar2;
                                    f81.a(strB, autoBetChips, function10, function11, null, strI, ytwVarB, ytwVarB2, null, ytwVarB3, ytwVarB4, function12, function13, null, function14, (Function0) objY5, "", "", false, false, aVar2, 0, 920347056, 8464);
                                    aVar2 = aVar2;
                                    aVar2.H();
                                    i3 = -86677580;
                                } else {
                                    enbVar = enbVar2;
                                    c0042a2 = c0042a6;
                                    i3 = -86677580;
                                    aVar2.N(-86677580);
                                    aVar2.H();
                                }
                                final enb enbVar3 = enbVar;
                                if (((Boolean) ((x5a0) enbVar3.P).getValue()).booleanValue()) {
                                    aVar2.N(-56305454);
                                    TreeMap treeMap = pw.a;
                                    DetailResponse detailResponse5 = (DetailResponse) ((x5a0) enbVar3.p0().d0).getValue();
                                    String strN = pw.n(detailResponse5 != null ? detailResponse5.getMaxPayout() : 0.0d);
                                    tl2 tl2VarP0 = enbVar3.p0();
                                    String strConcat = pw.n((tl2VarP0 == null || (ytwVar4 = tl2VarP0.d0) == null || (detailResponse4 = (DetailResponse) ((x5a0) ytwVar4).getValue()) == null) ? 0.0d : detailResponse4.getMinUserCoefficient()).concat("x");
                                    tl2 tl2VarP1 = enbVar3.p0();
                                    String strConcat2 = pw.n((tl2VarP1 == null || (ytwVar3 = tl2VarP1.d0) == null || (detailResponse3 = (DetailResponse) ((x5a0) ytwVar3).getValue()) == null) ? 0.0d : detailResponse3.getMaxUserCoefficient()).concat("x");
                                    op5 op5Var2 = op5.a;
                                    String currencyCode3 = ((CrashHeaderState) enbVar3.s0().A.getValue()).getCurrencyCode();
                                    String str5 = currencyCode3 != null ? currencyCode3 : "";
                                    op5Var2.getClass();
                                    String strI2 = op5.i(str5);
                                    tl2 tl2VarP2 = enbVar3.p0();
                                    String strN2 = pw.n((tl2VarP2 == null || (ytwVar2 = tl2VarP2.d0) == null || (detailResponse2 = (DetailResponse) ((x5a0) ytwVar2).getValue()) == null) ? 0.0d : detailResponse2.getMinAmount());
                                    tl2 tl2VarP3 = enbVar3.p0();
                                    String strN3 = pw.n((tl2VarP3 == null || (ytwVar = tl2VarP3.d0) == null || (detailResponse = (DetailResponse) ((x5a0) ytwVar).getValue()) == null) ? 0.0d : detailResponse.getMaxAmount());
                                    mz1 mz1Var = (mz1) ((x5a0) enbVar3.u0().M).getValue();
                                    boolean zA9 = aVar2.A(enbVar3);
                                    Object objY13 = aVar2.y();
                                    c0042a3 = c0042a2;
                                    if (zA9 || objY13 == c0042a3) {
                                        objY13 = new Function0() { // from class: fkb
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                ((x5a0) enbVar3.P).setValue(Boolean.FALSE);
                                                return Unit.a;
                                            }
                                        };
                                        aVar2.r(objY13);
                                    }
                                    a aVar3 = aVar2;
                                    zda.c(strI2, strConcat, strConcat2, strN2, strN3, strN, (Function0) objY13, mz1Var, aVar3, 0);
                                    aVar2 = aVar3;
                                } else {
                                    c0042a3 = c0042a2;
                                    aVar2.N(i3);
                                }
                                aVar2.H();
                                x5a0 x5a0Var = (x5a0) ytwVar6;
                                a aVar4 = aVar2;
                                a.C0041a.C0042a c0042a7 = c0042a3;
                                z7a.a(((Boolean) x5a0Var.getValue()).booleanValue(), ((ToastCommonModel) ((x5a0) enbVar3.u0().U).getValue()).getGiftVal() > 0.0d, ((ToastCommonModel) ((x5a0) enbVar3.u0().U).getValue()).getText(), ((ToastCommonModel) ((x5a0) enbVar3.u0().U).getValue()).getCurrency(), ((ToastCommonModel) ((x5a0) enbVar3.u0().U).getValue()).getAt(), ((ToastCommonModel) ((x5a0) enbVar3.u0().U).getValue()).getCoeff(), ((ToastCommonModel) ((x5a0) enbVar3.u0().U).getValue()).getBgColor(), ((ToastCommonModel) ((x5a0) enbVar3.u0().U).getValue()).getGiftAmount(), ((ToastCommonModel) ((x5a0) enbVar3.u0().U).getValue()).getActualUsedAmount(), (mz1) ((x5a0) enbVar3.u0().M).getValue(), (cj5) ((x5a0) enbVar3.u0().N).getValue(), false, aVar4, 0);
                                a aVar5 = aVar4;
                                if (!((Boolean) ((x5a0) enbVar3.s0().a).getValue()).booleanValue() || ((Boolean) x5a0Var.getValue()).booleanValue()) {
                                    r12 = 0;
                                    i4 = 0;
                                    aVar5.N(-86677580);
                                } else {
                                    aVar5.N(-53297493);
                                    Unit unit2 = Unit.a;
                                    boolean zA10 = aVar5.A(enbVar3);
                                    Object objY14 = aVar5.y();
                                    if (zA10 || objY14 == c0042a7) {
                                        th = null;
                                        objY14 = enbVar3.new i(null);
                                        aVar5.r(objY14);
                                    } else {
                                        th = null;
                                    }
                                    xvf.e(aVar5, unit2, (Function2) objY14);
                                    d dVarE = j.e(d.a.b, 1.0f);
                                    i4 = 0;
                                    aiv aivVarC = g75.c(ht.a.e, false);
                                    int iHashCode = Long.hashCode(aVar5.m());
                                    ne00 ne00VarO = aVar5.o();
                                    d dVarC = c.c(aVar5, dVarE);
                                    yka.k.getClass();
                                    tsr.a aVar6 = yka.a.b;
                                    if (aVar5.k() == null) {
                                        l2a.b();
                                        throw th;
                                    }
                                    aVar5.D();
                                    if (aVar5.g()) {
                                        aVar5.F(aVar6);
                                    } else {
                                        aVar5.p();
                                    }
                                    hlh0.a(aVar5, aivVarC, yka.a.f);
                                    hlh0.a(aVar5, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar5, iHashCode, c1350a);
                                    }
                                    hlh0.a(aVar5, dVarC, yka.a.d);
                                    pda.a(Math.abs(enbVar3.d0), 0, aVar5, enbVar3.v0);
                                    aVar5.s();
                                    r12 = th;
                                }
                                aVar5.H();
                                x5a0 x5a0Var2 = (x5a0) ytwVar5;
                                if (((Boolean) x5a0Var2.getValue()).booleanValue() && ((Boolean) ((x5a0) ytwVar7).getValue()).booleanValue() && enbVar3.C0()) {
                                    ((Boolean) x5a0Var2.getValue()).getClass();
                                    ej5.c(ebs.a(enbVar3.getLifecycle()), r12, r12, new ynb(enbVar3, r12), 3);
                                }
                                if (((Boolean) ((x5a0) enbVar3.V).getValue()).booleanValue() && ((Boolean) ((x5a0) ytwVar7).getValue()).booleanValue() && enbVar3.C0() && ((hviVar14 = enbVar3.a) == null || hviVar14.E.getVisibility() != 0)) {
                                    aVar5.N(-52263426);
                                    Unit unit3 = Unit.a;
                                    Object objY15 = aVar5.y();
                                    if (objY15 == c0042a7) {
                                        objY15 = new enb.j(2, r12);
                                        aVar5.r(objY15);
                                    }
                                    xvf.e(aVar5, unit3, (Function2) objY15);
                                    if (((CharSequence) ((x5a0) enbVar3.u0().A).getValue()).length() > 0) {
                                        aVar5.N(-52065305);
                                        String str6 = (String) ((x5a0) enbVar3.u0().A).getValue();
                                        String str7 = (String) ((x5a0) enbVar3.u0().G).getValue();
                                        String str8 = (String) ((x5a0) enbVar3.u0().H).getValue();
                                        boolean zA11 = aVar5.A(enbVar3);
                                        Object objY16 = aVar5.y();
                                        if (zA11 || objY16 == c0042a7) {
                                            objY16 = new um2(enbVar3, 1);
                                            aVar5.r(objY16);
                                        }
                                        Function0 function15 = (Function0) objY16;
                                        boolean zA12 = aVar5.A(enbVar3);
                                        Object objY17 = aVar5.y();
                                        if (zA12 || objY17 == c0042a7) {
                                            objY17 = new Function0() { // from class: tjb
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    enb enbVar4 = enbVar3;
                                                    enbVar4.o0 = false;
                                                    ((x5a0) enbVar4.V).setValue(Boolean.FALSE);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar5.r(objY17);
                                        }
                                        num2 = num3;
                                        p9a.a(num2, str6, str7, str8, function15, (Function0) objY17, enbVar3.r0(), aVar5, 0);
                                        aVar5.H();
                                    } else {
                                        num2 = num3;
                                        aVar5.N(-86677580);
                                        aVar5.H();
                                    }
                                } else {
                                    num2 = num3;
                                    aVar5.N(-86677580);
                                }
                                aVar5.H();
                                if (((Boolean) ((x5a0) enbVar3.X).getValue()).booleanValue() && ((Boolean) ((x5a0) ytwVar7).getValue()).booleanValue() && enbVar3.C0()) {
                                    aVar5.N(-50230322);
                                    String str9 = (String) ((x5a0) enbVar3.u0().A).getValue();
                                    String str10 = (String) ((x5a0) enbVar3.u0().G).getValue();
                                    String str11 = (String) ((x5a0) enbVar3.u0().H).getValue();
                                    boolean zA13 = aVar5.A(enbVar3);
                                    Object objY18 = aVar5.y();
                                    if (zA13 || objY18 == c0042a7) {
                                        objY18 = new Function0() { // from class: ujb
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                String nickName;
                                                String avatarUrl;
                                                enb enbVar4 = enbVar3;
                                                koj kojVarU0 = enbVar4.u0();
                                                ytw<Boolean> ytwVar8 = enbVar4.X;
                                                Boolean boolIsSingleBet = ((BetData) ((x5a0) kojVarU0.B).getValue()).isSingleBet();
                                                Boolean bool = Boolean.FALSE;
                                                if (Intrinsics.g(boolIsSingleBet, bool)) {
                                                    if (enbVar4.b != null) {
                                                        enbVar4.u0().x1(true);
                                                    }
                                                    SharedPreferences.Editor editor = enbVar4.Y;
                                                    if (editor != null) {
                                                        editor.putBoolean(((String[]) ((x5a0) enbVar4.u0().e).getValue())[2], ((Boolean) ((x5a0) enbVar4.u0().T).getValue()).booleanValue());
                                                    }
                                                    SharedPreferences.Editor editor2 = enbVar4.Y;
                                                    if (editor2 != null) {
                                                        editor2.apply();
                                                    }
                                                    UserValidateResponse userValidateResponse = enbVar4.a0;
                                                    if (userValidateResponse == null || (nickName = userValidateResponse.getNickName()) == null) {
                                                        nickName = "";
                                                    }
                                                    UserValidateResponse userValidateResponse2 = enbVar4.a0;
                                                    if (userValidateResponse2 == null || (avatarUrl = userValidateResponse2.getAvatarUrl()) == null) {
                                                        avatarUrl = "";
                                                    }
                                                    enbVar4.z0(nickName, avatarUrl);
                                                }
                                                if (yju.a("br") && Intrinsics.g(((BetData) ((x5a0) enbVar4.u0().B).getValue()).isSingleBet(), bool)) {
                                                    ((x5a0) enbVar4.w0).setValue(Boolean.TRUE);
                                                    ((x5a0) ytwVar8).setValue(bool);
                                                    return Unit.a;
                                                }
                                                GameDetails gameDetails = enbVar4.G;
                                                wz.a("BetPlaced", gameDetails != null ? gameDetails.getName() : null, "On", "Manual", "1");
                                                ytw<Boolean> ytwVar9 = enbVar4.p0().O;
                                                Boolean boolIsSingleBet2 = ((BetData) ((x5a0) enbVar4.u0().B).getValue()).isSingleBet();
                                                Boolean bool2 = Boolean.TRUE;
                                                ((x5a0) ytwVar9).setValue(Boolean.valueOf(Intrinsics.g(boolIsSingleBet2, bool2)));
                                                enbVar4.w0().c = String.valueOf(enbVar4.w0().c);
                                                ytw<Boolean> ytwVar10 = enbVar4.p0().e;
                                                Boolean boolIsSingleBet3 = ((BetData) ((x5a0) enbVar4.u0().B).getValue()).isSingleBet();
                                                boolIsSingleBet3.getClass();
                                                ((x5a0) ytwVar10).setValue(Boolean.valueOf(true ^ boolIsSingleBet3.booleanValue()));
                                                if ("br".equalsIgnoreCase(new SportyGamesManager().getSubCountry())) {
                                                    zob zobVarW0 = enbVar4.w0();
                                                    String str12 = enbVar4.T;
                                                    String str13 = enbVar4.w0().c;
                                                    zobVarW0.C1(enbVar4.getActivity(), enbVar4.w0().b, str12, str13 == null ? "" : str13, String.valueOf(enbVar4.w0().d), enbVar4.w0().f, enbVar4.A);
                                                } else {
                                                    zob zobVarW1 = enbVar4.w0();
                                                    String str14 = enbVar4.T;
                                                    String str15 = enbVar4.w0().c;
                                                    zobVarW1.A1(str14, str15 == null ? "" : str15, String.valueOf(enbVar4.w0().d), enbVar4.w0().f, enbVar4.w0().b, enbVar4.A, null, false);
                                                    ((BetData) ((x5a0) enbVar4.u0().B).getValue()).getOnConfirmClick().invoke(bool2);
                                                }
                                                ((x5a0) enbVar4.p0().g0).setValue(bool2);
                                                if (((Boolean) ((x5a0) enbVar4.p0().e).getValue()).booleanValue()) {
                                                    enbVar4.I0();
                                                } else {
                                                    enbVar4.M0();
                                                }
                                                ((x5a0) ytwVar8).setValue(bool);
                                                pfd pfdVar = fse.a;
                                                ej5.c(w5b.a(gku.a), null, null, enbVar4.new l(null), 3);
                                                return Unit.a;
                                            }
                                        };
                                        aVar5.r(objY18);
                                    }
                                    Function0 function16 = (Function0) objY18;
                                    boolean zA14 = aVar5.A(enbVar3);
                                    Object objY19 = aVar5.y();
                                    if (zA14 || objY19 == c0042a7) {
                                        objY19 = new vjb(enbVar3, i4);
                                        aVar5.r(objY19);
                                    }
                                    p9a.a(num2, str9, str10, str11, function16, (Function0) objY19, enbVar3.r0(), aVar5, 0);
                                } else {
                                    aVar5.N(-86677580);
                                }
                                aVar5.H();
                                if (!((Boolean) ((x5a0) enbVar3.L).getValue()).booleanValue() || num2 == null) {
                                    aVar5.N(-86677580);
                                } else {
                                    aVar5.N(-44854395);
                                    String str12 = (String) ((x5a0) enbVar3.u0().a).getValue();
                                    int iIntValue3 = num2.intValue();
                                    mz1 mz1VarT1 = enbVar3.t0();
                                    boolean zA15 = aVar5.A(enbVar3);
                                    Object objY20 = aVar5.y();
                                    if (zA15 || objY20 == c0042a7) {
                                        objY20 = new wjb(enbVar3, i4);
                                        aVar5.r(objY20);
                                    }
                                    afa.c(str12, mz1VarT1, false, iIntValue3, (Function0) objY20, 0.0d, false, false, aVar5, 0, 228);
                                    aVar5 = aVar5;
                                    boolean zBooleanValue2 = ((Boolean) ((x5a0) enbVar3.M).getValue()).booleanValue();
                                    GameDetails gameDetails = enbVar3.G;
                                    if (zBooleanValue2) {
                                        wz.a("PaytableCheck", gameDetails != null ? gameDetails.getName() : r12, new String[i4]);
                                    } else {
                                        wz.a("HTPClicked", gameDetails != null ? gameDetails.getName() : r12, new String[i4]);
                                    }
                                }
                                aVar5.H();
                            } else {
                                aVar.G();
                            }
                            return Unit.a;
                        }
                    }, true));
                }
                hvi hviVar14 = this.a;
                if (hviVar14 != null) {
                    ComposeView composeView7 = hviVar14.i;
                    composeView7.setViewCompositionStrategy(cVar);
                    composeView7.setContent(new op8(-1229143392, new Function2() { // from class: xib
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                enb enbVar = this.a;
                                Integer num2 = (Integer) ((x5a0) enbVar.z0).getValue();
                                if (num2 != null) {
                                    aVar.N(1480486164);
                                    enbVar.S0(num2, aVar, 0);
                                } else {
                                    aVar.N(1437253378);
                                }
                                aVar.H();
                            } else {
                                aVar.G();
                            }
                            return Unit.a;
                        }
                    }, true));
                }
            }
        }
    }

    public final tl2 p0() {
        return (tl2) this.i0.getValue();
    }

    public final yt2 q0() {
        return (yt2) this.F.getValue();
    }

    public final cj5 r0() {
        cj5 cj5Var = this.e;
        if (cj5Var != null) {
            return cj5Var;
        }
        Intrinsics.n("buildVariantColors");
        throw null;
    }

    public final ip8 s0() {
        return (ip8) this.Q.getValue();
    }

    public final mz1 t0() {
        mz1 mz1Var = this.d;
        if (mz1Var != null) {
            return mz1Var;
        }
        Intrinsics.n("gameColors");
        throw null;
    }

    public final koj u0() {
        return (koj) this.i.getValue();
    }

    public final ypa0 v0() {
        return (ypa0) this.I.getValue();
    }

    public final zob w0() {
        return (zob) this.v.getValue();
    }

    public final void z0(String str, String str2) {
        int i2;
        Boolean boolValueOf;
        qo80 binding;
        hvi hviVar = this.a;
        if (hviVar != null) {
            hviVar.z.setHeaderColor(r58.l(t0().d0()));
        }
        hvi hviVar2 = this.a;
        if (hviVar2 != null) {
            hviVar2.z.setBodyColor(r58.l(t0().c0()));
        }
        op5 op5Var = op5.a;
        String string = getString(R.string.music_cms);
        string.getClass();
        String string2 = getString(R.string.music_menu);
        string2.getClass();
        op5Var.getClass();
        String strB = op5.b(string, string2, null);
        MenuIconSize menuIconSize = new MenuIconSize(2131165245, R.dimen._12sdp);
        blb blbVar = new blb();
        SharedPreferences sharedPreferences = this.b;
        LeftMenuButton leftMenuButton = new LeftMenuButton(0, strB, R.drawable.ic_music_icon, menuIconSize, blbVar, true, sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean(((String[]) ((x5a0) u0().e).getValue())[0], true)) : null, Integer.valueOf(u0().w), Integer.valueOf(u0().y), null, false, new Function1() { // from class: elb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                enb enbVar = this.a;
                SharedPreferences.Editor editor = enbVar.Y;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean(((String[]) ((x5a0) enbVar.u0().e).getValue())[0], true);
                    }
                    SharedPreferences.Editor editor2 = enbVar.Y;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    enbVar.L0();
                    GameDetails gameDetails = enbVar.G;
                    wz.a("Music", gameDetails != null ? gameDetails.getName() : null, "On");
                } else {
                    if (editor != null) {
                        editor.putBoolean(((String[]) ((x5a0) enbVar.u0().e).getValue())[0], false);
                    }
                    if (enbVar.a != null) {
                        enbVar.v0().I1();
                    }
                    GameDetails gameDetails2 = enbVar.G;
                    wz.a("Music", gameDetails2 != null ? gameDetails2.getName() : null, "Off");
                }
                SharedPreferences.Editor editor3 = enbVar.Y;
                if (editor3 != null) {
                    editor3.apply();
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
        int i3 = 0;
        flb flbVar = new flb(0);
        SharedPreferences sharedPreferences2 = this.b;
        LeftMenuButton leftMenuButton2 = new LeftMenuButton(0, strB2, R.drawable.ic_sound, menuIconSize2, flbVar, true, sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean(((String[]) ((x5a0) u0().e).getValue())[1], true)) : null, Integer.valueOf(u0().w), Integer.valueOf(u0().y), null, false, new glb(this, i3), 1536, null);
        String string5 = getString(R.string.one_tap_bet_cms);
        string5.getClass();
        String string6 = getString(R.string.onetap_bet_menu);
        string6.getClass();
        String strB3 = op5.b(string5, string6, null);
        MenuIconSize menuIconSize3 = new MenuIconSize(R.dimen._15sdp, R.dimen._10sdp);
        hlb hlbVar = new hlb();
        SharedPreferences sharedPreferences3 = this.b;
        if (sharedPreferences3 != null) {
            i2 = 0;
            boolValueOf = Boolean.valueOf(sharedPreferences3.getBoolean(((String[]) ((x5a0) u0().e).getValue())[2], false));
        } else {
            i2 = 0;
            boolValueOf = null;
        }
        LeftMenuButton leftMenuButton3 = new LeftMenuButton(0, strB3, R.drawable.ic_one_tap_bet, menuIconSize3, hlbVar, true, boolValueOf, Integer.valueOf(u0().w), Integer.valueOf(u0().y), null, false, new ilb(this, i2), 1536, null);
        String string7 = getString(R.string.how_to_play_nav_cms);
        string7.getClass();
        String string8 = getString(R.string.how_to_play_menu);
        string8.getClass();
        LeftMenuButton leftMenuButton4 = new LeftMenuButton(0, op5.b(string7, string8, null), R.drawable.ic_how_to_play, new MenuIconSize(R.dimen._13sdp, R.dimen._13sdp), new jlb(this, 0), false, null, null, null, null, false, null, 3072, null);
        String string9 = getString(R.string.bet_history_cms);
        string9.getClass();
        String string10 = getString(R.string.bethistory_menu);
        string10.getClass();
        LeftMenuButton leftMenuButton5 = new LeftMenuButton(0, op5.b(string9, string10, null), R.drawable.ic_bethistory, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new llb(this, 0), false, null, null, null, null, false, null, 3072, null);
        String string11 = getString(R.string.game_limits_nav_cms);
        string11.getClass();
        String string12 = getString(R.string.game_limits);
        string12.getClass();
        ArrayList arrayListL = kotlin.collections.b.l(leftMenuButton, leftMenuButton2, leftMenuButton3, leftMenuButton4, leftMenuButton5, new LeftMenuButton(0, op5.b(string11, string12, null), R.drawable.game_limit, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new Function0() { // from class: mlb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FragmentManager supportFragmentManager;
                enb enbVar = this.a;
                e activity = enbVar.getActivity();
                if (!(((activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.G(R.id.flContent)) instanceof com.sportygames.commons.components.a)) {
                    ((x5a0) enbVar.P).setValue(Boolean.TRUE);
                }
                return Unit.a;
            }
        }, false, null, null, null, null, false, null, 3072, null));
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            hvi hviVar3 = this.a;
            if (hviVar3 != null) {
                int i4 = 0;
                SGHamburgerMenu.setup$default(hviVar3.z, new SGHamburgerMenu.b(v0(), u0().f.getValue().intValue(), str2, str, arrayListL, new nlb(this, i4), new clb(i4), "", null), activity, false, null, new dlb(this, i4), 12, null);
            }
            hvi hviVar4 = this.a;
            op5.r(op5Var, kotlin.collections.b.f((hviVar4 == null || (binding = hviVar4.z.getBinding()) == null) ? null : binding.c), null, 6);
            hvi hviVar5 = this.a;
            if (hviVar5 != null) {
                SGHamburgerMenu.setCrashImage$default(hviVar5.z, (String) ((x5a0) u0().a).getValue(), false, false, 6, null);
            }
        }
    }
}
