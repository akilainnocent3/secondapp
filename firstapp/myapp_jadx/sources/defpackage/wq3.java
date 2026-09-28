package defpackage;

import android.R;
import android.accounts.Account;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.pairip.VMRunner;
import com.sporty.android.book.domain.entity.BetTypeAnyWinConfig;
import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.permission.location.UserAddress;
import com.sportybet.android.data.GetInsureBetOddsData;
import com.sportybet.android.data.GetInsureBetResult;
import com.sportybet.android.home.MainActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.sim.SimShareData;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import com.sportybet.plugin.realsports.data.sim.SimulateWinOnlineRes;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class wq3 implements mrm, rdd {
    public static volatile boolean k0 = true;
    public static volatile boolean l0;
    public final sfy A;
    public final s1p B;
    public final med C;
    public final nzm D;
    public final mgb0 E;
    public final bnh0 F;
    public ComposeView G;
    public QuickBetView H;
    public boolean I;
    public boolean J;
    public b K;
    public WeakReference<Activity> L;
    public boolean M;
    public final a N;
    public final c O;
    public gm3 P;
    public ykf Q;
    public float R;
    public float S;
    public float T;
    public boolean U;
    public int V;
    public zc30 W;
    public boolean X;
    public final bqy Y;
    public BetTypeAnyWinConfig Z;
    public final lrm a;
    public BetTypeFlexiBetConfig a0;
    public final krm b;
    public el0 b0;
    public final jrm c;
    public jvd0 c0;
    public final lq1 d;
    public jvd0 d0;
    public final gl0 e;
    public jvd0 e0;
    public final jvh f;
    public jvd0 f0;
    public final j1b g0;
    public final lyh<Boolean> h0;
    public final w43 i;
    public boolean i0;
    public final wwd0 j0;
    public final zq3 v;
    public final iky w;
    public final gv2 y;
    public final uv3 z;

    public final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            final UserAddress userAddress = (UserAddress) intent.getParcelableExtra("user_address");
            if ("quick_bet_confirm".equals(intent.getAction())) {
                boolean booleanExtra = intent.getBooleanExtra("quick_bet_ready", false);
                final QuickBetView quickBetView = wq3.this.H;
                if (quickBetView != null) {
                    quickBetView.z = booleanExtra;
                    WeakReference<Activity> weakReference = quickBetView.f;
                    Activity activity = weakReference != null ? weakReference.get() : null;
                    if (activity == null || activity.isFinishing()) {
                        return;
                    }
                    quickBetView.getAccountHelper().demandAccount(activity, new tit() { // from class: be30
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z) {
                            QuickBetView.X(quickBetView, userAddress);
                        }
                    });
                }
            }
        }
    }

    public interface b {
        boolean a();

        void b(int i);

        void c(boolean z);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            VMRunner.invoke("B3mLUuaSfj68A4pY", new Object[]{this, context, intent});
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$addQuickBetMiniIcon$3$1", f = "BetslipManager.kt", l = {584}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return wq3.this.new d(v1bVar);
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
                zq3 zq3Var = wq3.this.v;
                wm20 wm20VarA = zq3Var.b.a(zq3Var, zq3.c[0]);
                Boolean bool = Boolean.TRUE;
                this.a = 1;
                if (wm20VarA.g(this, bool) == y5bVar) {
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

    @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$addQuickBetMiniIcon$4$1", f = "BetslipManager.kt", l = {591}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return wq3.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                zq3 zq3Var = wq3.this.v;
                wm20 wm20VarA = zq3Var.b.a(zq3Var, zq3.c[0]);
                Boolean bool = Boolean.TRUE;
                this.a = 1;
                if (wm20VarA.g(this, bool) == y5bVar) {
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

    public static final class f implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ QuickBetView b;

        public f(View view, QuickBetView quickBetView) {
            this.a = view;
            this.b = quickBetView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.setInterpolator(new DecelerateInterpolator());
            animationSet.setDuration(225L);
            animationSet.setFillAfter(true);
            QuickBetView quickBetView = this.b;
            animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, quickBetView.getHeight(), 0.0f));
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            quickBetView.clearAnimation();
            quickBetView.startAnimation(animationSet);
        }
    }

    public static final class g implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ QuickBetView b;

        public g(QuickBetView quickBetView) {
            this.b = quickBetView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            wq3 wq3Var = wq3.this;
            int i = wq3Var.V;
            QuickBetView quickBetView = this.b;
            if (i != quickBetView.getHeight()) {
                wq3Var.V = quickBetView.getHeight();
                b bVar = wq3Var.K;
                if (bVar != null) {
                    if (!bVar.a()) {
                        bVar = null;
                    }
                    if (bVar != null) {
                        k53 k53VarC = iu2.c();
                        k53VarC.getClass();
                        if (!kotlin.collections.a.c(k53.EDIT).contains(k53VarC)) {
                            bVar.b(quickBetView.getHeight());
                        }
                    }
                }
            }
            quickBetView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1", f = "BetslipManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$1", f = "BetslipManager.kt", l = {241}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wq3 b;

            /* JADX INFO: renamed from: wq3$h$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$1$1", f = "BetslipManager.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C1256a extends tje0 implements Function2<Integer, v1b<? super Unit>, Object> {
                public final /* synthetic */ wq3 a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1256a(wq3 wq3Var, v1b<? super C1256a> v1bVar) {
                    super(2, v1bVar);
                    this.a = wq3Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C1256a(this.a, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Integer num, v1b<? super Unit> v1bVar) {
                    return ((C1256a) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    QuickBetView quickBetView;
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    wq3 wq3Var = this.a;
                    wq3Var.D();
                    if (wq3Var.c.U().size() == 1 && (quickBetView = wq3Var.H) != null) {
                        quickBetView.L0();
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wq3 wq3Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = wq3Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    wq3 wq3Var = this.b;
                    lyh<Integer> lyhVarE0 = wq3Var.c.E0();
                    C1256a c1256a = new C1256a(wq3Var, null);
                    this.a = 1;
                    if (kzh.b(lyhVarE0, c1256a, this) == y5bVar) {
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

        @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$2", f = "BetslipManager.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ wq3 b;

            @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$2$1", f = "BetslipManager.kt", l = {251, 257}, m = "invokeSuspend", v = 2)
            public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ wq3 b;

                /* JADX INFO: renamed from: wq3$h$b$a$a, reason: collision with other inner class name */
                @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$2$1$1", f = "BetslipManager.kt", l = {258}, m = "invokeSuspend", v = 2)
                public static final class C1257a extends tje0 implements Function2<List<? extends Event>, v1b<? super Unit>, Object> {
                    public int a;
                    public /* synthetic */ Object b;
                    public final /* synthetic */ wq3 c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C1257a(wq3 wq3Var, v1b<? super C1257a> v1bVar) {
                        super(2, v1bVar);
                        this.c = wq3Var;
                    }

                    @Override // defpackage.pz1
                    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                        C1257a c1257a = new C1257a(this.c, v1bVar);
                        c1257a.b = obj;
                        return c1257a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(List<? extends Event> list, v1b<? super Unit> v1bVar) {
                        return ((C1257a) create(list, v1bVar)).invokeSuspend(Unit.a);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        List list = (List) this.b;
                        y5b y5bVar = y5b.a;
                        int i = this.a;
                        wq3 wq3Var = this.c;
                        if (i == 0) {
                            uj50.b(obj);
                            gv2 gv2Var = wq3Var.y;
                            ArrayList arrayListU = wq3Var.c.U();
                            this.b = null;
                            this.a = 1;
                            if (gv2Var.a(list, arrayListU, this) == y5bVar) {
                                return y5bVar;
                            }
                        } else {
                            if (i != 1) {
                                ib5.a("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            uj50.b(obj);
                        }
                        wq3Var.D();
                        return Unit.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(wq3 wq3Var, v1b<? super a> v1bVar) {
                    super(2, v1bVar);
                    this.b = wq3Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new a(this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
                
                    if (defpackage.kzh.b(r1, r4, r7) == r0) goto L17;
                 */
                @Override // defpackage.pz1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        r7 = this;
                        y5b r0 = defpackage.y5b.a
                        int r1 = r7.a
                        r2 = 0
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L1b
                        if (r1 == r4) goto L17
                        if (r1 != r3) goto L11
                        defpackage.uj50.b(r8)
                        goto L61
                    L11:
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ib5.a(r7)
                        return r2
                    L17:
                        defpackage.uj50.b(r8)
                        goto L29
                    L1b:
                        defpackage.uj50.b(r8)
                        r7.a = r4
                        r4 = 1000(0x3e8, double:4.94E-321)
                        java.lang.Object r8 = defpackage.hkd.b(r4, r7)
                        if (r8 != r0) goto L29
                        goto L60
                    L29:
                        wq3 r8 = r7.b
                        boolean r1 = r8.t()
                        itf0$a r4 = defpackage.itf0.a
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        java.lang.String r6 = "BetslipManager isButtonVisible "
                        r5.<init>(r6)
                        r5.append(r1)
                        java.lang.String r5 = r5.toString()
                        r6 = 0
                        java.lang.Object[] r6 = new java.lang.Object[r6]
                        r4.a(r5, r6)
                        if (r1 == 0) goto L61
                        iky r1 = r8.w
                        hky r4 = new hky
                        r4.<init>(r1, r2)
                        or60 r1 = new or60
                        r1.<init>(r4)
                        wq3$h$b$a$a r4 = new wq3$h$b$a$a
                        r4.<init>(r8, r2)
                        r7.a = r3
                        java.lang.Object r7 = defpackage.kzh.b(r1, r4, r7)
                        if (r7 != r0) goto L61
                    L60:
                        return r0
                    L61:
                        kotlin.Unit r7 = kotlin.Unit.a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: wq3.h.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: renamed from: wq3$h$b$b, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$2$2", f = "BetslipManager.kt", l = {268}, m = "invokeSuspend", v = 2)
            public static final class C1258b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public /* synthetic */ Object b;
                public final /* synthetic */ wq3 c;

                /* JADX INFO: renamed from: wq3$h$b$b$a */
                @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$2$2$1", f = "BetslipManager.kt", l = {270}, m = "invokeSuspend", v = 2)
                public static final class a extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
                    public int a;
                    public /* synthetic */ boolean b;
                    public final /* synthetic */ wq3 c;
                    public final /* synthetic */ v5b d;

                    /* JADX INFO: renamed from: wq3$h$b$b$a$a, reason: collision with other inner class name */
                    @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$2$2$1$1", f = "BetslipManager.kt", l = {273}, m = "invokeSuspend", v = 2)
                    public static final class C1259a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                        public int a;
                        public final /* synthetic */ wq3 b;

                        /* JADX INFO: renamed from: wq3$h$b$b$a$a$a, reason: collision with other inner class name */
                        @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$2$2$1$1$1", f = "BetslipManager.kt", l = {}, m = "invokeSuspend", v = 2)
                        public static final class C1260a extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
                            public final /* synthetic */ wq3 a;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C1260a(wq3 wq3Var, v1b<? super C1260a> v1bVar) {
                                super(2, v1bVar);
                                this.a = wq3Var;
                            }

                            @Override // defpackage.pz1
                            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                                return new C1260a(this.a, v1bVar);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
                                return ((C1260a) create(unit, v1bVar)).invokeSuspend(Unit.a);
                            }

                            @Override // defpackage.pz1
                            public final Object invokeSuspend(Object obj) {
                                y5b y5bVar = y5b.a;
                                uj50.b(obj);
                                itf0.a.a("BetslipManager Socket Message received and button updated!", new Object[0]);
                                this.a.D();
                                return Unit.a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C1259a(wq3 wq3Var, v1b<? super C1259a> v1bVar) {
                            super(2, v1bVar);
                            this.b = wq3Var;
                        }

                        @Override // defpackage.pz1
                        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                            return new C1259a(this.b, v1bVar);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                            return ((C1259a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                        }

                        @Override // defpackage.pz1
                        public final Object invokeSuspend(Object obj) {
                            y5b y5bVar = y5b.a;
                            int i = this.a;
                            if (i == 0) {
                                uj50.b(obj);
                                wq3 wq3Var = this.b;
                                lyh lyhVarA = szh.a(wq3Var.z.e, 1000L);
                                C1260a c1260a = new C1260a(wq3Var, null);
                                this.a = 1;
                                if (kzh.b(lyhVarA, c1260a, this) == y5bVar) {
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

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(wq3 wq3Var, v5b v5bVar, v1b<? super a> v1bVar) {
                        super(2, v1bVar);
                        this.c = wq3Var;
                        this.d = v5bVar;
                    }

                    @Override // defpackage.pz1
                    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                        a aVar = new a(this.c, this.d, v1bVar);
                        aVar.b = ((Boolean) obj).booleanValue();
                        return aVar;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return ((a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
                    }

                    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        boolean z = this.b;
                        y5b y5bVar = y5b.a;
                        int i = this.a;
                        jvd0 jvd0VarC = null;
                        wq3 wq3Var = this.c;
                        if (i == 0) {
                            uj50.b(obj);
                            itf0.a.a("BetslipManager is button visible :" + z, new Object[0]);
                            jvd0 jvd0Var = wq3Var.e0;
                            if (jvd0Var != null) {
                                this.b = z;
                                this.a = 1;
                                obj = i9p.c(jvd0Var, this);
                                if (obj == y5bVar) {
                                    return y5bVar;
                                }
                            }
                            if (z) {
                                jvd0VarC = ej5.c(this.d, null, null, new C1259a(wq3Var, null), 3);
                            }
                            wq3Var.e0 = jvd0VarC;
                            return Unit.a;
                        }
                        if (i != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj);
                        if (z) {
                            jvd0VarC = ej5.c(this.d, null, null, new C1259a(wq3Var, null), 3);
                        }
                        wq3Var.e0 = jvd0VarC;
                        return Unit.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1258b(wq3 wq3Var, v1b<? super C1258b> v1bVar) {
                    super(2, v1bVar);
                    this.c = wq3Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    C1258b c1258b = new C1258b(this.c, v1bVar);
                    c1258b.b = obj;
                    return c1258b;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C1258b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    v5b v5bVar = (v5b) this.b;
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    if (i == 0) {
                        uj50.b(obj);
                        wq3 wq3Var = this.c;
                        wwd0 wwd0Var = wq3Var.j0;
                        a aVar = new a(wq3Var, v5bVar, null);
                        this.b = null;
                        this.a = 1;
                        if (kzh.b(wwd0Var, aVar, this) == y5bVar) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(wq3 wq3Var, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = wq3Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                b bVar = new b(this.b, v1bVar);
                bVar.a = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                wq3 wq3Var = this.b;
                wq3Var.d0 = ej5.c(v5bVar, null, null, new a(wq3Var, null), 3);
                wq3Var.f0 = ej5.c(v5bVar, null, null, new C1258b(wq3Var, null), 3);
                return Unit.a;
            }
        }

        @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$3", f = "BetslipManager.kt", l = {286}, m = "invokeSuspend", v = 2)
        public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wq3 b;

            @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$3$1", f = "BetslipManager.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class a extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
                public /* synthetic */ boolean a;
                public final /* synthetic */ wq3 b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(wq3 wq3Var, v1b<? super a> v1bVar) {
                    super(2, v1bVar);
                    this.b = wq3Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    a aVar = new a(this.b, v1bVar);
                    aVar.a = ((Boolean) obj).booleanValue();
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    boolean z = this.a;
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    wq3 wq3Var = this.b;
                    wq3Var.i0 = z;
                    gm3 gm3Var = wq3Var.P;
                    if (gm3Var != null) {
                        gm3Var.c(wq3Var.A());
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(wq3 wq3Var, v1b<? super c> v1bVar) {
                super(2, v1bVar);
                this.b = wq3Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new c(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    wq3 wq3Var = this.b;
                    lyh<Boolean> lyhVar = wq3Var.h0;
                    a aVar = new a(wq3Var, null);
                    this.a = 1;
                    if (kzh.b(lyhVar, aVar, this) == y5bVar) {
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

        @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$4", f = "BetslipManager.kt", l = {298}, m = "invokeSuspend", v = 2)
        public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wq3 b;

            @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$4$1", f = "BetslipManager.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class a extends tje0 implements Function2<BetTypeFlexiBetConfig, v1b<? super Unit>, Object> {
                public /* synthetic */ Object a;
                public final /* synthetic */ wq3 b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(wq3 wq3Var, v1b<? super a> v1bVar) {
                    super(2, v1bVar);
                    this.b = wq3Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    a aVar = new a(this.b, v1bVar);
                    aVar.a = obj;
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BetTypeFlexiBetConfig betTypeFlexiBetConfig, v1b<? super Unit> v1bVar) {
                    return ((a) create(betTypeFlexiBetConfig, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    BetTypeFlexiBetConfig betTypeFlexiBetConfig = (BetTypeFlexiBetConfig) this.a;
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    this.b.a0 = betTypeFlexiBetConfig;
                    return Unit.a;
                }
            }

            @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$4$2", f = "BetslipManager.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class b extends tje0 implements gaj<myh<? super BetTypeFlexiBetConfig>, Throwable, v1b<? super Unit>, Object> {
                public /* synthetic */ Throwable a;

                @Override // defpackage.gaj
                public final Object invoke(myh<? super BetTypeFlexiBetConfig> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
                    b bVar = new b(3, v1bVar);
                    bVar.a = th;
                    return bVar.invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    Throwable th = this.a;
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    itf0.a.p(th, "Flexi bet type config flow failed", new Object[0]);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(wq3 wq3Var, v1b<? super d> v1bVar) {
                super(2, v1bVar);
                this.b = wq3Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new d(this.b, v1bVar);
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
                    wq3 wq3Var = this.b;
                    yzh yzhVar = new yzh(new g1i(wq3Var.f.d, new a(wq3Var, null)), new b(3, null));
                    this.a = 1;
                    if (kzh.a(yzhVar, this) == y5bVar) {
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

        @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$5", f = "BetslipManager.kt", l = {305}, m = "invokeSuspend", v = 2)
        public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wq3 b;

            @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$5$1", f = "BetslipManager.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class a extends tje0 implements Function2<el0, v1b<? super Unit>, Object> {
                public /* synthetic */ Object a;
                public final /* synthetic */ wq3 b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(wq3 wq3Var, v1b<? super a> v1bVar) {
                    super(2, v1bVar);
                    this.b = wq3Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    a aVar = new a(this.b, v1bVar);
                    aVar.a = obj;
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(el0 el0Var, v1b<? super Unit> v1bVar) {
                    return ((a) create(el0Var, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    el0 el0Var = (el0) this.a;
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    this.b.b0 = el0Var;
                    return Unit.a;
                }
            }

            @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$5$2", f = "BetslipManager.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class b extends tje0 implements gaj<myh<? super el0>, Throwable, v1b<? super Unit>, Object> {
                public final /* synthetic */ wq3 a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(wq3 wq3Var, v1b<? super b> v1bVar) {
                    super(3, v1bVar);
                    this.a = wq3Var;
                }

                @Override // defpackage.gaj
                public final Object invoke(myh<? super el0> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
                    return new b(this.a, v1bVar).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    this.a.b0 = el0.c;
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(wq3 wq3Var, v1b<? super e> v1bVar) {
                super(2, v1bVar);
                this.b = wq3Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new e(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    wq3 wq3Var = this.b;
                    yzh yzhVar = new yzh(new g1i(wq3Var.e.g, new a(wq3Var, null)), new b(wq3Var, null));
                    this.a = 1;
                    if (kzh.a(yzhVar, this) == y5bVar) {
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

        @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$6", f = "BetslipManager.kt", l = {312}, m = "invokeSuspend", v = 2)
        public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wq3 b;

            @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$6$1", f = "BetslipManager.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class a extends tje0 implements Function2<BetTypeAnyWinConfig, v1b<? super Unit>, Object> {
                public /* synthetic */ Object a;
                public final /* synthetic */ wq3 b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(wq3 wq3Var, v1b<? super a> v1bVar) {
                    super(2, v1bVar);
                    this.b = wq3Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    a aVar = new a(this.b, v1bVar);
                    aVar.a = obj;
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BetTypeAnyWinConfig betTypeAnyWinConfig, v1b<? super Unit> v1bVar) {
                    return ((a) create(betTypeAnyWinConfig, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    BetTypeAnyWinConfig betTypeAnyWinConfig = (BetTypeAnyWinConfig) this.a;
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    this.b.Z = betTypeAnyWinConfig;
                    return Unit.a;
                }
            }

            @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$6$2", f = "BetslipManager.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class b extends tje0 implements gaj<myh<? super BetTypeAnyWinConfig>, Throwable, v1b<? super Unit>, Object> {
                public /* synthetic */ Throwable a;

                @Override // defpackage.gaj
                public final Object invoke(myh<? super BetTypeAnyWinConfig> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
                    b bVar = new b(3, v1bVar);
                    bVar.a = th;
                    return bVar.invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    Throwable th = this.a;
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    itf0.a.p(th, "AnyWin config flow failed", new Object[0]);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(wq3 wq3Var, v1b<? super f> v1bVar) {
                super(2, v1bVar);
                this.b = wq3Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new f(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    wq3 wq3Var = this.b;
                    yzh yzhVar = new yzh(new g1i(wq3Var.e.f, new a(wq3Var, null)), new b(3, null));
                    this.a = 1;
                    if (kzh.a(yzhVar, this) == y5bVar) {
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

        @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$7", f = "BetslipManager.kt", l = {323}, m = "invokeSuspend", v = 2)
        public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wq3 b;

            public static final class a<T> implements myh {
                public final /* synthetic */ wq3 a;

                public a(wq3 wq3Var) {
                    this.a = wq3Var;
                }

                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    String str = (String) obj;
                    gm3 gm3Var = this.a.P;
                    if (gm3Var != null) {
                        ((x5a0) gm3Var.h).setValue(str);
                    }
                    return Unit.a;
                }
            }

            public static final class b implements lyh<String> {
                public final /* synthetic */ lyh a;
                public final /* synthetic */ wq3 b;

                @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$7$invokeSuspend$$inlined$map$1", f = "BetslipManager.kt", l = {109}, m = "collect", v = 2)
                public static final class a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return b.this.collect(null, this);
                    }
                }

                /* JADX INFO: renamed from: wq3$h$g$b$b, reason: collision with other inner class name */
                public static final class C1261b<T> implements myh {
                    public final /* synthetic */ myh a;
                    public final /* synthetic */ wq3 b;

                    /* JADX INFO: renamed from: wq3$h$g$b$b$a */
                    @c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$onStart$1$7$invokeSuspend$$inlined$map$1$2", f = "BetslipManager.kt", l = {50}, m = "emit", v = 2)
                    public static final class a extends x1b {
                        public /* synthetic */ Object a;
                        public int b;

                        public a(v1b v1bVar) {
                            super(v1bVar);
                        }

                        @Override // defpackage.pz1
                        public final Object invokeSuspend(Object obj) {
                            this.a = obj;
                            this.b |= Integer.MIN_VALUE;
                            return C1261b.this.emit(null, this);
                        }
                    }

                    public C1261b(myh myhVar, wq3 wq3Var) {
                        this.a = myhVar;
                        this.b = wq3Var;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // defpackage.myh
                    public final Object emit(Object obj, v1b v1bVar) {
                        a aVar;
                        if (v1bVar instanceof a) {
                            aVar = (a) v1bVar;
                            int i = aVar.b;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                aVar.b = i - Integer.MIN_VALUE;
                            } else {
                                aVar = new a(v1bVar);
                            }
                        } else {
                            aVar = new a(v1bVar);
                        }
                        Object obj2 = aVar.a;
                        y5b y5bVar = y5b.a;
                        int i2 = aVar.b;
                        if (i2 == 0) {
                            uj50.b(obj2);
                            AccountInfo accountInfo = (AccountInfo) obj;
                            String strK = this.b.k(accountInfo != null ? accountInfo.getBetslipTheme() : null);
                            aVar.b = 1;
                            if (this.a.emit(strK, aVar) == y5bVar) {
                                return y5bVar;
                            }
                        } else {
                            if (i2 != 1) {
                                ib5.a("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            uj50.b(obj2);
                        }
                        return Unit.a;
                    }
                }

                public b(lyh lyhVar, wq3 wq3Var) {
                    this.a = lyhVar;
                    this.b = wq3Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.lyh
                public final Object collect(myh<? super String> myhVar, v1b v1bVar) {
                    a aVar;
                    if (v1bVar instanceof a) {
                        aVar = (a) v1bVar;
                        int i = aVar.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            aVar.b = i - Integer.MIN_VALUE;
                        } else {
                            aVar = new a(v1bVar);
                        }
                    } else {
                        aVar = new a(v1bVar);
                    }
                    Object obj = aVar.a;
                    y5b y5bVar = y5b.a;
                    int i2 = aVar.b;
                    if (i2 == 0) {
                        uj50.b(obj);
                        C1261b c1261b = new C1261b(myhVar, this.b);
                        aVar.b = 1;
                        if (this.a.collect(c1261b, aVar) == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i2 != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(wq3 wq3Var, v1b<? super g> v1bVar) {
                super(2, v1bVar);
                this.b = wq3Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new g(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    wq3 wq3Var = this.b;
                    lyh lyhVarB = uzh.b(new b(wq3Var.E.getAccountInfoFlow(), wq3Var));
                    a aVar = new a(wq3Var);
                    this.a = 1;
                    if (lyhVarB.collect(aVar, this) == y5bVar) {
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

        public h(v1b<? super h> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h hVar = wq3.this.new h(v1bVar);
            hVar.a = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wq3 wq3Var = wq3.this;
            ej5.c(v5bVar, null, null, new a(wq3Var, null), 3);
            ej5.c(v5bVar, null, null, new b(wq3Var, null), 3);
            ej5.c(v5bVar, null, null, new c(wq3Var, null), 3);
            ej5.c(v5bVar, null, null, new d(wq3Var, null), 3);
            ej5.c(v5bVar, null, null, new e(wq3Var, null), 3);
            ej5.c(v5bVar, null, null, new f(wq3Var, null), 3);
            ej5.c(v5bVar, null, null, new g(wq3Var, null), 3);
            return Unit.a;
        }
    }

    public wq3(lrm lrmVar, krm krmVar, jrm jrmVar, lq1 lq1Var, gl0 gl0Var, jvh jvhVar, w43 w43Var, zq3 zq3Var, iky ikyVar, gv2 gv2Var, uv3 uv3Var, sfy sfyVar, s1p s1pVar, med medVar, ynh ynhVar, y8k y8kVar, p8k p8kVar, q8k q8kVar, nzm nzmVar, mgb0 mgb0Var, bnh0 bnh0Var, Context context, ibs ibsVar) {
        lrmVar.getClass();
        krmVar.getClass();
        jrmVar.getClass();
        lq1Var.getClass();
        gl0Var.getClass();
        jvhVar.getClass();
        w43Var.getClass();
        uv3Var.getClass();
        sfyVar.getClass();
        nzmVar.getClass();
        mgb0Var.getClass();
        bnh0Var.getClass();
        this.a = lrmVar;
        this.b = krmVar;
        this.c = jrmVar;
        this.d = lq1Var;
        this.e = gl0Var;
        this.f = jvhVar;
        this.i = w43Var;
        this.v = zq3Var;
        this.w = ikyVar;
        this.y = gv2Var;
        this.z = uv3Var;
        this.A = sfyVar;
        this.B = s1pVar;
        this.C = medVar;
        this.D = nzmVar;
        this.E = mgb0Var;
        this.F = bnh0Var;
        this.Q = ykf.b;
        this.R = 1.0f;
        this.S = 12.0f;
        this.T = 57.0f;
        this.b0 = el0.c;
        yq3 yq3Var = new yq3(l5b.a.a);
        kfe0 kfe0VarA = lfe0.a();
        pfd pfdVar = fse.a;
        j1b j1bVarA = w5b.a(CoroutineContext.Element.a.d(kfe0VarA, gku.a.h0()).plus(yq3Var));
        this.g0 = j1bVarA;
        wm20 wm20VarA = zq3Var.b.a(zq3Var, zq3.c[0]);
        Boolean bool = Boolean.FALSE;
        this.h0 = wm20VarA.d(bool);
        this.j0 = xwd0.a(bool);
        ej5.c(j1bVarA, null, null, new uq3(ibsVar, this, null), 3);
        ej5.c(j1bVarA, null, null, new vq3(this, null), 3);
        a aVar = this.N;
        if (aVar != null) {
            fdt.a(context).d(aVar);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("quick_bet_confirm");
        this.N = new a();
        fdt fdtVarA = fdt.a(context);
        a aVar2 = this.N;
        aVar2.getClass();
        fdtVarA.b(aVar2, intentFilter);
        c cVar = this.O;
        if (cVar != null) {
            fdt.a(context).d(cVar);
        }
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("quick_bet_gifts");
        this.O = new c();
        fdt fdtVarA2 = fdt.a(context);
        c cVar2 = this.O;
        cVar2.getClass();
        fdtVarA2.b(cVar2, intentFilter2);
        bqy bqyVarA = bqy.a();
        bqyVarA.getClass();
        this.Y = bqyVarA;
    }

    public static /* synthetic */ String l(wq3 wq3Var) {
        AccountInfo accountInfoLastAccountInfo = wq3Var.E.lastAccountInfo();
        return wq3Var.k(accountInfoLastAccountInfo != null ? accountInfoLastAccountInfo.getBetslipTheme() : null);
    }

    public static boolean s(Activity activity) {
        return (activity == null || activity.isFinishing()) ? false : true;
    }

    public final boolean A() {
        return !this.i0 && m() >= 2;
    }

    public final void B(Long l) {
        WeakReference<Activity> weakReference = this.L;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity instanceof androidx.fragment.app.e) {
            final androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
            final FragmentManager supportFragmentManager = eVar.getSupportFragmentManager();
            supportFragmentManager.getClass();
            if (l.longValue() > 0) {
                Fragment fragmentH = supportFragmentManager.H("WinningDialog");
                if ((fragmentH instanceof oaj0 ? (oaj0) fragmentH : null) == null) {
                    BigDecimal bigDecimalDivide = new BigDecimal(l.longValue()).divide(SimulateBetConsts.MAGIC_NUMBER);
                    String str = SimulateWinOnlineRes.WINNING_IMAGE;
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("arg_return_amount", bigDecimalDivide);
                    bundle.putString("arg_img_path", str);
                    oaj0 oaj0Var = new oaj0();
                    oaj0Var.setArguments(bundle);
                    oaj0Var.show(supportFragmentManager, "WinningDialog");
                    ((Handler) gpf0.a.getValue()).postDelayed(new Runnable() { // from class: pq3
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (eVar.isFinishing()) {
                                return;
                            }
                            Fragment fragmentH2 = supportFragmentManager.H("WinningDialog");
                            oaj0 oaj0Var2 = fragmentH2 instanceof oaj0 ? (oaj0) fragmentH2 : null;
                            if (oaj0Var2 != null) {
                                oaj0Var2.dismissAllowingStateLoss();
                            }
                        }
                    }, 2000L);
                }
            }
        }
    }

    public final void C() {
        QuickBetView quickBetView = this.H;
        if (quickBetView == null) {
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.setDuration(250L);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, quickBetView.getHeight()));
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        quickBetView.clearAnimation();
        quickBetView.startAnimation(animationSet);
    }

    public final void D() {
        Activity activityE = oti.c().e();
        boolean z = this.H != null;
        int iM = m();
        if ((z && iM > 1) || (z && iw2.b())) {
            zc30 zc30Var = this.W;
            if (zc30Var == null || zc30Var.b) {
                QuickBetView quickBetView = this.H;
                if (quickBetView != null) {
                    quickBetView.v0();
                }
                this.J = true;
            } else {
                g();
            }
        }
        if (this.G != null && this.P != null) {
            String strP = p();
            gm3 gm3Var = this.P;
            if (gm3Var != null) {
                ((x5a0) gm3Var.f).setValue(Integer.valueOf(iM));
                ((x5a0) gm3Var.e).setValue(strP);
                ((x5a0) gm3Var.g).setValue(this.c.m0() ? im3.a : im3.b);
                ((x5a0) gm3Var.h).setValue(l(this));
                gm3Var.c(A());
            }
        }
        if (this.H == null || !k0) {
            return;
        }
        if (iM != 0) {
            QuickBetView quickBetView2 = this.H;
            if (quickBetView2 != null) {
                quickBetView2.setVisibility(0);
                return;
            }
            return;
        }
        C();
        v();
        z();
        if (s(activityE)) {
            c(activityE);
        }
    }

    @Override // defpackage.mrm
    public final void a(Activity activity, boolean z) {
        if (!z) {
            this.I = false;
            x(true);
        } else if (s(activity)) {
            b3.b = activity.getClass().getSimpleName();
            this.I = true;
            Activity activityE = oti.c().e();
            if (activityE != null) {
                i(activityE);
            }
        }
    }

    @Override // defpackage.mrm
    public final boolean b() {
        QuickBetView quickBetView = this.H;
        return (quickBetView == null || quickBetView.getParent() == null || quickBetView.getVisibility() != 0) ? false : true;
    }

    public final void c(Activity activity) {
        final gm3 gm3Var;
        gm3 gm3Var2;
        gm3 gm3Var3;
        Integer num;
        if (s(activity)) {
            zc30 zc30Var = this.W;
            if (zc30Var == null || !zc30Var.b) {
                int i = 0;
                this.U = false;
                Boolean bool = Boolean.TRUE;
                wwd0 wwd0Var = this.j0;
                wwd0Var.getClass();
                wwd0Var.k(null, bool);
                ComposeView composeView = this.G;
                jrm jrmVar = this.c;
                if (composeView != null && (gm3Var2 = this.P) != null) {
                    ((x5a0) gm3Var2.n).setValue(Boolean.FALSE);
                    gm3 gm3Var4 = this.P;
                    if (gm3Var4 != null) {
                        gm3Var4.b = null;
                    }
                    if (gm3Var4 != null) {
                        gm3Var4.a = new sq3(this, i);
                    }
                    ComposeView composeView2 = this.G;
                    if (Intrinsics.g(composeView2 != null ? composeView2.getContext() : null, activity)) {
                        int iM = m();
                        gm3 gm3Var5 = this.P;
                        if ((gm3Var5 == null || (num = (Integer) ((x5a0) gm3Var5.f).getValue()) == null || num.intValue() != iM) && (gm3Var3 = this.P) != null) {
                            ((x5a0) gm3Var3.f).setValue(Integer.valueOf(iM));
                            ((x5a0) gm3Var3.e).setValue(p());
                            ((x5a0) gm3Var3.g).setValue(jrmVar.m0() ? im3.a : im3.b);
                            ((x5a0) gm3Var3.h).setValue(l(this));
                            gm3Var3.c(A());
                        }
                        ComposeView composeView3 = this.G;
                        if (composeView3 != null) {
                            composeView3.setVisibility(0);
                        }
                        ComposeView composeView4 = this.G;
                        if (composeView4 != null) {
                            composeView4.bringToFront();
                        }
                        this.U = false;
                        return;
                    }
                    gm3 gm3Var6 = this.P;
                    if (gm3Var6 != null) {
                        this.Q = gm3Var6.b();
                        this.R = ((t5a0) gm3Var6.k).j();
                        this.S = ((t5a0) gm3Var6.l).j();
                        this.T = ((t5a0) gm3Var6.m).j();
                    }
                    iai0.a(this.G);
                    this.G = null;
                    this.P = null;
                    composeView = null;
                }
                if (composeView == null) {
                    this.G = new ComposeView(activity, null, 6, 0);
                }
                int iM2 = m();
                im3 im3Var = jrmVar.m0() ? im3.a : im3.b;
                gm3 gm3Var7 = this.P;
                if (gm3Var7 == null) {
                    gm3Var = new gm3(p(), Integer.valueOf(iM2), im3Var, l(this), this.Q, kotlin.ranges.f.d(this.R, 0.0f, 1.0f), this.S, this.T, A(), new sq3(this, i), new kq3(this, i), new lq3(this, i));
                    this.P = gm3Var;
                } else {
                    ((x5a0) gm3Var7.n).setValue(Boolean.FALSE);
                    gm3Var = this.P;
                    if (gm3Var != null) {
                        gm3Var.b = null;
                    }
                    if ((gm3Var != null ? gm3Var.a : null) == null && gm3Var != null) {
                        gm3Var.a = new sq3(this, i);
                    }
                }
                ComposeView composeView5 = this.G;
                if (composeView5 != null && gm3Var != null) {
                    composeView5.setViewCompositionStrategy(u6i0.b.a);
                    composeView5.setContent(new op8(-1402036435, new Function2() { // from class: qq3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                scv.b(null, null, null, pp8.b(117082625, new tq3(gm3Var), aVar), aVar, 3072, 7);
                            } else {
                                aVar.G();
                            }
                            return Unit.a;
                        }
                    }, true));
                }
                ComposeView composeView6 = this.G;
                if (composeView6 == null || composeView6.isAttachedToWindow()) {
                    return;
                }
                activity.addContentView(this.G, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    public final void d(py1 py1Var) {
        QuickBetView quickBetView;
        if (s(py1Var)) {
            try {
                if (!py1Var.isFinishing() && !py1Var.isDestroyed() && (quickBetView = this.H) != null) {
                    if (quickBetView.getParent() != null) {
                        quickBetView.bringToFront();
                        return;
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 80;
                    if (this.c.D() && (py1Var instanceof MainActivity)) {
                        layoutParams.setMargins(0, 0, 0, f7f.a(58.0f, py1Var));
                    }
                    ViewGroup viewGroup = (ViewGroup) py1Var.findViewById(R.id.content);
                    if (viewGroup != null) {
                        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                            View childAt = viewGroup.getChildAt(childCount);
                            if (childAt.getId() == com.sportybet.android.gp.tz.R.id.quick_bet_root && childAt != quickBetView) {
                                if (childAt instanceof QuickBetView) {
                                    ((QuickBetView) childAt).Y();
                                }
                                viewGroup.removeViewAt(childCount);
                            }
                        }
                    }
                    py1Var.addContentView(quickBetView, layoutParams, true);
                    qry.a(quickBetView, new f(quickBetView, quickBetView));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void e() {
        WeakReference<Activity> weakReference = this.L;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity == null || !this.M) {
            return;
        }
        this.I = true;
        i(activity);
        this.M = false;
    }

    public final void f(boolean z) {
        ComposeView composeView = this.G;
        if (composeView != null) {
            if (z && this.H == null) {
                composeView.setVisibility(0);
                D();
            } else {
                y();
            }
        }
        QuickBetView quickBetView = this.H;
        if (quickBetView != null) {
            if (m() == 0) {
                QuickBetView.w(quickBetView, 2);
            }
            if (z) {
                quickBetView.setVisibility(0);
                D();
                return;
            }
            v();
            if (l0) {
                quickBetView.postDelayed(new Runnable() { // from class: nq3
                    @Override // java.lang.Runnable
                    public final void run() {
                        wq3 wq3Var = this.a;
                        if (wq3Var.H != null) {
                            wq3Var.z();
                            wq3.l0 = false;
                        }
                    }
                }, 500L);
            } else {
                z();
            }
        }
    }

    public final void g() {
        if (this.H != null) {
            v();
            this.J = false;
            k0 = false;
            C();
            z();
            Activity activityE = oti.c().e();
            if (s(activityE)) {
                c(activityE);
            }
        }
    }

    public final void h() {
        if (this.H == null) {
            Activity activityE = oti.c().e();
            if (s(activityE)) {
                c(activityE);
                return;
            }
            return;
        }
        k0 = true;
        C();
        v();
        z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Activity activity) {
        boolean z;
        boolean zK0;
        boolean zO;
        QuickBetView quickBetView;
        QuickBetView quickBetView2;
        QuickBetView quickBetView3;
        QuickBetView quickBetView4;
        QuickBetView quickBetView5;
        int i = 0;
        if (!Intrinsics.g(Looper.myLooper(), Looper.getMainLooper())) {
            ((Handler) gpf0.a.getValue()).post(new oq3(i, this, activity));
            return;
        }
        if (this.I && !(activity instanceof BetslipActivity) && s(activity) && (activity instanceof py1)) {
            int iM = m();
            if (iM > 1) {
                z = false;
            } else {
                z = iM == 0 ? true : k0;
            }
            k0 = z;
            if (iM == 0 && (quickBetView5 = this.H) != null) {
                QuickBetView.w(quickBetView5, 2);
            }
            if (activity instanceof wym) {
                wym wymVar = (wym) activity;
                zO = wymVar.o();
                zK0 = wymVar.k0();
            } else {
                zK0 = false;
                zO = false;
            }
            if (this.c.D()) {
                zK0 = true;
            }
            this.W = new zc30(zO, zK0, SimShareData.INSTANCE.isAutoBetEnabled() && this.c.m0());
            gm3 gm3Var = this.P;
            if (gm3Var != null) {
                ((x5a0) gm3Var.g).setValue(this.c.m0() ? im3.a : im3.b);
                ((x5a0) gm3Var.h).setValue(l(this));
            }
            if (t() || this.H != null) {
                if (iM == 1 && this.J && this.H != null) {
                    z();
                    py1 py1Var = (py1) activity;
                    j(py1Var);
                    d(py1Var);
                    if (this.K != null && (quickBetView2 = this.H) != null) {
                        u(quickBetView2);
                    }
                    this.J = false;
                    k0 = true;
                    return;
                }
                if (!t() || this.H != null || ((!this.c.D() && !k0) || iM == 0)) {
                    f(true);
                    return;
                }
                y();
                py1 py1Var2 = (py1) activity;
                j(py1Var2);
                if (this.K != null && (quickBetView = this.H) != null) {
                    u(quickBetView);
                }
                d(py1Var2);
                return;
            }
            if (iM == 0 || !(zK0 || this.c.D() || k0 || this.J)) {
                c(activity);
                return;
            }
            if (iM <= 1 && !this.c.D() && !k0) {
                py1 py1Var3 = (py1) activity;
                j(py1Var3);
                if (this.K != null && (quickBetView4 = this.H) != null) {
                    u(quickBetView4);
                }
                d(py1Var3);
                return;
            }
            py1 py1Var4 = (py1) activity;
            j(py1Var4);
            d(py1Var4);
            if (iM > 1 && (quickBetView3 = this.H) != null) {
                zc30 zc30Var = this.W;
                if (zc30Var == null || zc30Var.b) {
                    quickBetView3.v0();
                    this.J = true;
                } else {
                    g();
                }
            }
            QuickBetView quickBetView6 = this.H;
            if (quickBetView6 == null || this.K == null) {
                return;
            }
            u(quickBetView6);
        }
    }

    public final void j(py1 py1Var) {
        if (s(py1Var) && !this.X) {
            try {
                try {
                    if (!py1Var.isFinishing() && !py1Var.isDestroyed()) {
                        QuickBetView quickBetView = this.H;
                        if (quickBetView != null) {
                            if (Intrinsics.g(quickBetView.getContext(), py1Var)) {
                                return;
                            } else {
                                z();
                            }
                        }
                        this.X = true;
                        View viewInflate = LayoutInflater.from(py1Var).inflate(com.sportybet.android.gp.tz.R.layout.spr_quick_bet, (ViewGroup) py1Var.findViewById(R.id.content), false);
                        viewInflate.getClass();
                        QuickBetView quickBetView2 = (QuickBetView) viewInflate;
                        this.H = quickBetView2;
                        quickBetView2.J(py1Var, this.W);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } finally {
                this.X = false;
            }
        }
    }

    public final String k(String str) {
        if (!this.c.m0()) {
            if (str == null) {
                str = "";
            }
            bnh0 bnh0Var = this.F;
            bnh0Var.getClass();
            if (StringsKt.U(str)) {
                str = null;
            }
            if (str != null) {
                return bnh0Var.e(str);
            }
        }
        return null;
    }

    public final int m() {
        return this.c.U().size();
    }

    public final String n(GetInsureBetOddsData getInsureBetOddsData) {
        BigDecimal bigDecimal;
        GetInsureBetResult getInsureBetResultE = vuo.e(this.b, getInsureBetOddsData);
        if (getInsureBetResultE == null || (bigDecimal = getInsureBetResultE.odds) == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        return bigDecimal.compareTo(BigDecimal.ZERO) == 0 ? "--" : gky.a.a(bjb0.L(bigDecimal, Locale.US), false);
    }

    public final String o() {
        new BigDecimal(-1);
        new Handler(Looper.myLooper());
        boolean zN = this.c.n();
        krm krmVar = this.b;
        if (!zN) {
            String strD = hu2.d(krmVar.j(), krmVar.M());
            strD.getClass();
            return strD;
        }
        med medVar = this.C;
        String strD2 = hu2.d(krmVar.e(medVar), krmVar.p(medVar));
        strD2.getClass();
        return strD2;
    }

    @Override // defpackage.rdd
    public final void onStart(ibs ibsVar) {
        jvd0 jvd0Var = this.c0;
        if (jvd0Var == null || !jvd0Var.isActive()) {
            this.c0 = ej5.c(this.g0, null, null, new h(null), 3);
        }
    }

    @Override // defpackage.rdd
    public final void onStop(ibs ibsVar) {
        jvd0 jvd0Var = this.e0;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.e0 = null;
        jvd0 jvd0Var2 = this.f0;
        if (jvd0Var2 != null) {
            jvd0Var2.cancel((CancellationException) null);
        }
        this.f0 = null;
        jvd0 jvd0Var3 = this.c0;
        if (jvd0Var3 != null) {
            jvd0Var3.cancel((CancellationException) null);
        }
        this.c0 = null;
        jvd0 jvd0Var4 = this.d0;
        if (jvd0Var4 != null) {
            jvd0Var4.cancel((CancellationException) null);
        }
        this.d0 = null;
    }

    public final String p() {
        List<? extends Selection> listA0 = CollectionsKt.A0(this.c.U());
        if (listA0.isEmpty()) {
            return "";
        }
        int typeName = this.a.getTypeName();
        if (typeName == 0) {
            return qz3.g() ? q(listA0) : r();
        }
        if (typeName == 1) {
            return q(listA0);
        }
        if (typeName == 2) {
            return qz3.g() ? q(listA0) : r();
        }
        if (listA0.size() > 15) {
            return o();
        }
        if (qz3.g()) {
            return q(listA0);
        }
        new BigDecimal(-1);
        new Handler(Looper.myLooper());
        krm krmVar = this.b;
        String strD = hu2.d(krmVar.j(), krmVar.M());
        strD.getClass();
        return strD;
    }

    public final String q(List<? extends Selection> list) {
        BigDecimal bigDecimal;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Selection) obj).b.status == 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Selection selection = (Selection) it.next();
            Outcome outcome = selection.c;
            BigDecimal bigDecimal2 = new BigDecimal(outcome.odds);
            String eventId = selection.getEventId();
            int i = selection.b.status;
            s1p s1pVar = this.B;
            boolean zA = s1pVar.a(eventId, i, outcome);
            sfy sfyVar = this.A;
            if (zA) {
                outcome.getClass();
                bigDecimal2 = bigDecimal2.multiply(sfyVar.a(outcome));
            }
            while (it.hasNext()) {
                Selection selection2 = (Selection) it.next();
                Outcome outcome2 = selection2.c;
                BigDecimal bigDecimal3 = new BigDecimal(outcome2.odds);
                if (s1pVar.a(selection2.getEventId(), selection2.b.status, outcome2)) {
                    outcome2.getClass();
                    bigDecimal3 = bigDecimal3.multiply(sfyVar.a(outcome2));
                }
                if (bigDecimal2.compareTo(bigDecimal3) < 0) {
                    bigDecimal2 = bigDecimal3;
                }
            }
            bigDecimal = bigDecimal2;
        } else {
            bigDecimal = null;
        }
        if (bigDecimal == null) {
            return "";
        }
        return gky.a.a(bjb0.L(bigDecimal.setScale(2, RoundingMode.HALF_UP), Locale.US), false);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008a  */
    public final String r() {
        BetTypeFlexiBetConfig betTypeFlexiBetConfig = this.a0;
        krm krmVar = this.b;
        luo luoVarD = vuo.d(betTypeFlexiBetConfig, krmVar);
        luo luoVarF = vuo.f(this.d, this.Y, krmVar);
        BetTypeAnyWinConfig betTypeAnyWinConfig = this.Z;
        el0 el0Var = this.b0;
        lrm lrmVar = this.a;
        luo luoVarA = vuo.a(betTypeAnyWinConfig, el0Var, lrmVar);
        luo luoVar = luo.c;
        if (luoVarD != luoVar) {
            lrmVar.G(false);
        }
        if (luoVarF != luoVar) {
            lrmVar.K(false);
        }
        if (luoVarA != luoVar) {
            lrmVar.E(false);
        }
        krmVar.B();
        int size = krmVar.s().size();
        jrm jrmVar = this.c;
        if (krmVar.L(jrmVar.m0())) {
            lrmVar.Y(krmVar.Q(size));
        } else if (luoVarD == luoVar) {
            try {
                if (lrmVar.o()) {
                    int iW = krmVar.w();
                    if (iW < size) {
                        GetInsureBetOddsData getInsureBetOddsData = new GetInsureBetOddsData(0, false, 0, null, null, null, null, 127, null);
                        getInsureBetOddsData.flexibleCount = iW;
                        getInsureBetOddsData.isSimMode = jrmVar.m0();
                        getInsureBetOddsData.betType = 4;
                        getInsureBetOddsData.selections = jrmVar.U();
                        getInsureBetOddsData.flexiBetConfig = this.a0;
                        getInsureBetOddsData.anyWinBetConfig = this.Z;
                        return n(getInsureBetOddsData);
                    }
                } else if (luoVarA == luoVar && lrmVar.A() && lrmVar.getTypeName() == 2) {
                    int iW2 = krmVar.w();
                    GetInsureBetOddsData getInsureBetOddsData2 = new GetInsureBetOddsData(0, false, 0, null, null, null, null, 127, null);
                    getInsureBetOddsData2.flexibleCount = iW2;
                    getInsureBetOddsData2.isSimMode = jrmVar.m0();
                    getInsureBetOddsData2.betType = 6;
                    getInsureBetOddsData2.selections = jrmVar.U();
                    getInsureBetOddsData2.flexiBetConfig = this.a0;
                    getInsureBetOddsData2.anyWinBetConfig = this.Z;
                    return n(getInsureBetOddsData2);
                }
            } catch (IndexOutOfBoundsException e2) {
                gph.a().b(e2);
                return "-";
            }
        } else if (luoVarA == luoVar) {
            int iW3 = krmVar.w();
            GetInsureBetOddsData getInsureBetOddsData3 = new GetInsureBetOddsData(0, false, 0, null, null, null, null, 127, null);
            getInsureBetOddsData3.flexibleCount = iW3;
            getInsureBetOddsData3.isSimMode = jrmVar.m0();
            getInsureBetOddsData3.betType = 6;
            getInsureBetOddsData3.selections = jrmVar.U();
            getInsureBetOddsData3.flexiBetConfig = this.a0;
            getInsureBetOddsData3.anyWinBetConfig = this.Z;
            return n(getInsureBetOddsData3);
        }
        return o();
    }

    public final boolean t() {
        ComposeView composeView = this.G;
        return (composeView == null || !composeView.isAttachedToWindow() || this.U) ? false : true;
    }

    public final void u(QuickBetView quickBetView) {
        if (quickBetView == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = quickBetView.getViewTreeObserver();
        viewTreeObserver.getClass();
        viewTreeObserver.addOnGlobalLayoutListener(new g(quickBetView));
    }

    public final void v() {
        this.V = 0;
        QuickBetView quickBetView = this.H;
        boolean z = quickBetView != null ? quickBetView.isPlaceBetSuccess : false;
        b bVar = this.K;
        if (bVar != null) {
            if (!bVar.a()) {
                bVar = null;
            }
            if (bVar != null) {
                bVar.c(z);
            }
        }
    }

    public final void w(boolean z) {
        if (!this.M) {
            this.L = new WeakReference<>(oti.c().e());
            this.M = true;
        }
        l0 = z;
        yrh0.t(hp0.A, BetslipActivity.class, true);
        Intent intent = new Intent();
        intent.setAction("open_bet_slip");
        fdt.a(hp0.A).c(intent);
    }

    public final void x(boolean z) {
        int iM = m();
        if (iM == 0) {
            k0 = true;
        } else if (iM > 1) {
            k0 = false;
        }
        if (z) {
            y();
        }
        QuickBetView quickBetView = this.H;
        if (quickBetView != null) {
            v();
            if (l0) {
                quickBetView.postDelayed(new Runnable() { // from class: mq3
                    @Override // java.lang.Runnable
                    public final void run() {
                        wq3 wq3Var = this.a;
                        if (wq3Var.H != null) {
                            wq3Var.z();
                            wq3.l0 = false;
                        }
                    }
                }, 500L);
            } else {
                z();
            }
        }
    }

    public final void y() {
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0Var = this.j0;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
        ComposeView composeView = this.G;
        gm3 gm3Var = this.P;
        if (composeView == null || gm3Var == null || this.U) {
            if (composeView != null || gm3Var == null) {
                return;
            }
            this.P = null;
            return;
        }
        this.Q = gm3Var.b();
        this.R = ((t5a0) gm3Var.k).j();
        this.S = ((t5a0) gm3Var.l).j();
        this.T = ((t5a0) gm3Var.m).j();
        gm3Var.a = null;
        this.U = true;
        gm3Var.b = new rq3(this, composeView, gm3Var, 0);
        ((x5a0) gm3Var.n).setValue(Boolean.TRUE);
    }

    public final void z() {
        QuickBetView quickBetView = this.H;
        if (quickBetView != null) {
            quickBetView.setVisibility(8);
            quickBetView.Y();
            iai0.a(quickBetView);
            this.H = null;
        }
    }
}
