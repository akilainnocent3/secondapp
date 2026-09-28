package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.models.NetworkStateManager;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import com.sportygames.fruithunt.network.models.FruitItem;
import com.sportygames.fruithunt.utils.WaterDropletView;
import com.sportygames.fruithunt.utils.objects.FruitMap;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu6j;", "Ln2j;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u6j extends n2j {
    public boolean A0;
    public final ArrayList<ObjectAnimator> B0;
    public final a6h C0;
    public float D0;
    public float E0;
    public final AnimatorSet F0;
    public ViewPropertyAnimator G0;
    public Long H0;
    public float I0;
    public float J0;
    public float K0;
    public int L0;
    public int M0;
    public ObjectAnimator N0;
    public ObjectAnimator O0;
    public ObjectAnimator P0;
    public final AnimatorSet Q0;
    public final AnimatorSet R0;
    public boolean S0;
    public ConstraintLayout T0;
    public int U0;
    public boolean V0;
    public boolean W0;
    public boolean X0;
    public final q8i0 j0;
    public ImageView k0;
    public z66 l0;
    public boolean m0;
    public final q8i0 n0;
    public final q8i0 o0;
    public final eal p0;
    public final String q0;
    public final String r0;
    public final ArrayList s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public int w0;
    public int x0;
    public final Path[] y0;
    public long z0;

    /* JADX INFO: loaded from: classes7.dex */
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
            a = iArr;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b implements poy {
        public b() {
        }

        @Override // defpackage.poy
        public final void a() {
            u6j u6jVar = u6j.this;
            u6jVar.t0().D1(1);
            u6jVar.o0(new m5j(u6jVar, 0));
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c implements noy {
        public final /* synthetic */ androidx.fragment.app.e a;

        public c(androidx.fragment.app.e eVar) {
            this.a = eVar;
        }

        @Override // defpackage.noy
        public final void a(boolean z) {
            ((GameMainActivity) this.a).b2(z);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$initUiClickActions$10$1", f = "FruitHuntFragment.kt", l = {251}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        @c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$initUiClickActions$10$1$1", f = "FruitHuntFragment.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<khp, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ u6j b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(u6j u6jVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = u6jVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.b, v1bVar);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(khp khpVar, v1b<? super Unit> v1bVar) {
                return ((a) create(khpVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                khp khpVar = (khp) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                u6j u6jVar = this.b;
                if (((Boolean) u6jVar.t0().z.getValue()).booleanValue()) {
                    int iOrdinal = khpVar.ordinal();
                    if (iOrdinal == 1) {
                        u6jVar.r1();
                        u6jVar.c1();
                    } else if (iOrdinal == 2) {
                        ajh ajhVarL1 = u6jVar.l1();
                        if (ajhVarL1 != null) {
                            ajhVarL1.A.c.setVisibility(4);
                        }
                        ajh ajhVarL2 = u6jVar.l1();
                        if (ajhVarL2 != null) {
                            ajhVarL2.B.c.setVisibility(4);
                        }
                        ajh ajhVarL3 = u6jVar.l1();
                        if (ajhVarL3 != null) {
                            ajhVarL3.z.c.setVisibility(4);
                        }
                        if (u6jVar.A0) {
                            u6jVar.A0 = false;
                            u6jVar.k1();
                            r750.c(u6jVar.v0(), u6jVar.getString(R.string.sg_fruit_hunt_knife_fire));
                            u6jVar.F0.start();
                            djh djhVar = u6jVar.b;
                            if (djhVar != null) {
                                djhVar.f.c.setAlpha(0.5f);
                            }
                            u6jVar.Y = false;
                            wwd0 wwd0Var = u6jVar.t0().B;
                            Boolean bool = Boolean.FALSE;
                            wwd0Var.getClass();
                            wwd0Var.k(null, bool);
                            u6jVar.t0().C1(1);
                        }
                    } else if (iOrdinal == 4) {
                        u6jVar.r1();
                        ajh ajhVarL4 = u6jVar.l1();
                        if (ajhVarL4 != null) {
                            e6i0.b(ajhVarL4.e, 0.5f);
                        }
                        ajh ajhVarL5 = u6jVar.l1();
                        if (ajhVarL5 != null) {
                            e6i0.b(ajhVarL5.f, 0.5f);
                        }
                        u6jVar.v1(0.3f, 0.6f);
                        djh djhVar2 = u6jVar.b;
                        if (djhVar2 != null) {
                            djhVar2.H.setVisibility(0);
                        }
                        djh djhVar3 = u6jVar.b;
                        if (djhVar3 != null) {
                            djhVar3.y.f.setVisibility(0);
                        }
                        djh djhVar4 = u6jVar.b;
                        if (djhVar4 != null) {
                            djhVar4.C.F(R.drawable.fh_hamburger_add_more_bg);
                        }
                        u6jVar.M0();
                    } else if (iOrdinal == 5) {
                        u6jVar.r1();
                        u6jVar.c1();
                    }
                }
                return Unit.a;
            }
        }

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return u6j.this.new d(v1bVar);
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
                u6j u6jVar = u6j.this;
                wwd0 wwd0Var = u6jVar.t0().N;
                a aVar = new a(u6jVar, null);
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

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$initUiClickActions$10$2", f = "FruitHuntFragment.kt", l = {265}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        @c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$initUiClickActions$10$2$1", f = "FruitHuntFragment.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<Integer, v1b<? super Unit>, Object> {
            public /* synthetic */ int a;
            public final /* synthetic */ u6j b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(u6j u6jVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = u6jVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.b, v1bVar);
                aVar.a = ((Number) obj).intValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Integer num, v1b<? super Unit> v1bVar) {
                return ((a) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                final int i = this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                final u6j u6jVar = this.b;
                int i2 = 0;
                u6jVar.t0().C1(0);
                if (((Boolean) u6jVar.t0().z.getValue()).booleanValue() && i != 2) {
                    if (i == -1) {
                        u6jVar.u1(-22.0f);
                        ajh ajhVarL1 = u6jVar.l1();
                        if (ajhVarL1 != null) {
                            e6i0.a(ajhVarL1.A.b);
                        }
                        ajh ajhVarL2 = u6jVar.l1();
                        if (ajhVarL2 != null) {
                            e6i0.c(ajhVarL2.A.c, new Function0() { // from class: d6j
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    u6j u6jVar2 = u6jVar;
                                    u6jVar2.n0(new j6j(u6jVar2, 0));
                                    return Unit.a;
                                }
                            });
                        }
                        ajh ajhVarL3 = u6jVar.l1();
                        if (ajhVarL3 != null) {
                            e6i0.b(ajhVarL3.z.b, 0.5f);
                        }
                        ajh ajhVarL4 = u6jVar.l1();
                        if (ajhVarL4 != null) {
                            e6i0.d(ajhVarL4.z.c);
                        }
                        ajh ajhVarL5 = u6jVar.l1();
                        if (ajhVarL5 != null) {
                            e6i0.b(ajhVarL5.B.b, 0.5f);
                        }
                        ajh ajhVarL6 = u6jVar.l1();
                        if (ajhVarL6 != null) {
                            e6i0.d(ajhVarL6.B.c);
                        }
                    } else if (i == 0) {
                        u6jVar.u1(0.0f);
                        ajh ajhVarL7 = u6jVar.l1();
                        if (ajhVarL7 != null) {
                            e6i0.a(ajhVarL7.z.b);
                        }
                        ajh ajhVarL8 = u6jVar.l1();
                        if (ajhVarL8 != null) {
                            e6i0.c(ajhVarL8.z.c, new f6j(u6jVar, i2));
                        }
                        ajh ajhVarL9 = u6jVar.l1();
                        if (ajhVarL9 != null) {
                            e6i0.b(ajhVarL9.A.b, 0.5f);
                        }
                        ajh ajhVarL10 = u6jVar.l1();
                        if (ajhVarL10 != null) {
                            e6i0.d(ajhVarL10.A.c);
                        }
                        ajh ajhVarL11 = u6jVar.l1();
                        if (ajhVarL11 != null) {
                            e6i0.b(ajhVarL11.B.b, 0.5f);
                        }
                        ajh ajhVarL12 = u6jVar.l1();
                        if (ajhVarL12 != null) {
                            e6i0.d(ajhVarL12.B.c);
                        }
                    } else if (i == 1) {
                        u6jVar.u1(22.0f);
                        ajh ajhVarL13 = u6jVar.l1();
                        if (ajhVarL13 != null) {
                            e6i0.a(ajhVarL13.B.b);
                        }
                        ajh ajhVarL14 = u6jVar.l1();
                        if (ajhVarL14 != null) {
                            e6i0.c(ajhVarL14.B.c, new g6j(u6jVar, i2));
                        }
                        ajh ajhVarL15 = u6jVar.l1();
                        if (ajhVarL15 != null) {
                            e6i0.b(ajhVarL15.A.b, 0.5f);
                        }
                        ajh ajhVarL16 = u6jVar.l1();
                        if (ajhVarL16 != null) {
                            e6i0.d(ajhVarL16.A.c);
                        }
                        ajh ajhVarL17 = u6jVar.l1();
                        if (ajhVarL17 != null) {
                            e6i0.b(ajhVarL17.z.b, 0.5f);
                        }
                        ajh ajhVarL18 = u6jVar.l1();
                        if (ajhVarL18 != null) {
                            e6i0.d(ajhVarL18.z.c);
                        }
                    }
                    u6jVar.n0(new Function0() { // from class: k7j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String str;
                            zj60 bridge;
                            if (u6jVar.f != null) {
                                Bundle bundle = new Bundle();
                                int i3 = i;
                                if (i3 != -1) {
                                    str = i3 != 1 ? "centre" : "right";
                                } else {
                                    str = "left";
                                }
                                bundle.putString("aimPosition", str);
                                SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                                if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
                                    ((bk60) bridge).a("KnifeMissed", bundle);
                                }
                            }
                            return Unit.a;
                        }
                    });
                }
                return Unit.a;
            }
        }

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return u6j.this.new e(v1bVar);
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
                u6j u6jVar = u6j.this;
                wwd0 wwd0Var = u6jVar.t0().L;
                a aVar = new a(u6jVar, null);
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

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$onViewCreated$1", f = "FruitHuntFragment.kt", l = {158}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        @c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$onViewCreated$1$1", f = "FruitHuntFragment.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
            public /* synthetic */ boolean a;
            public final /* synthetic */ u6j b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(u6j u6jVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = u6jVar;
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
                u6j u6jVar = this.b;
                if (z) {
                    u6jVar.t0().B1(u6jVar.y);
                    if (u6jVar.t0().N.getValue() == khp.b) {
                        u6jVar.r1();
                        u6jVar.c1();
                    }
                    u6jVar.N0();
                    AnimatorSet animatorSet = u6jVar.F0;
                    animatorSet.setDuration(800L);
                    animatorSet.addListener(new o7j(u6jVar));
                    int i = 1;
                    animatorSet.addPauseListener(new kk0(new gce(u6jVar, i), jk0.a));
                    animatorSet.addListener(new n7j(u6jVar));
                    u6jVar.n0(new y6a(u6jVar, i));
                } else {
                    u6jVar.t0().D1(-1);
                    u6jVar.t0().B1(2);
                }
                return Unit.a;
            }
        }

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return u6j.this.new f(v1bVar);
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
                u6j u6jVar = u6j.this;
                wwd0 wwd0Var = u6jVar.t0().z;
                a aVar = new a(u6jVar, null);
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

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$removeOverlayOnFruits$1", f = "FruitHuntFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return u6j.this.new g(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ArrayList arrayList = u6j.this.s0;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                int i3 = i + 1;
                if (i < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                ((ImageView) obj2).clearColorFilter();
                i = i3;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public h(Function1 function1) {
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

    /* JADX INFO: loaded from: classes7.dex */
    public static final class i extends qlr implements Function0<v8i0> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return u6j.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class j extends qlr implements Function0<cyb> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return u6j.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class k extends qlr implements Function0<r8i0.c> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return u6j.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class l extends qlr implements Function0<v8i0> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return u6j.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class m extends qlr implements Function0<cyb> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return u6j.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class n extends qlr implements Function0<r8i0.c> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return u6j.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class o extends qlr implements Function0<Fragment> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return u6j.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class p extends qlr implements Function0<w8i0> {
        public final /* synthetic */ o a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(o oVar) {
            super(0);
            this.a = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class q extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class r extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ttr ttrVar) {
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

    /* JADX INFO: loaded from: classes7.dex */
    public static final class s extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? u6j.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public u6j() {
        ttr ttrVarA = hwr.a(a1s.c, new p(new o()));
        this.j0 = new q8i0(jq40.a(n8j.class), new q(ttrVarA), new s(ttrVarA), new r(ttrVarA));
        this.n0 = new q8i0(jq40.a(fuj.class), new i(), new k(), new j());
        this.o0 = new q8i0(jq40.a(db6.class), new l(), new n(), new m());
        this.p0 = new eal();
        this.q0 = "translationY";
        this.r0 = "translationX";
        this.s0 = new ArrayList();
        Path[] pathArr = new Path[4];
        for (int i2 = 0; i2 < 4; i2++) {
            pathArr[i2] = null;
        }
        this.y0 = pathArr;
        this.A0 = true;
        this.B0 = new ArrayList<>();
        a6h a6hVar = new a6h();
        a6hVar.b = 1;
        a6hVar.e = new HashMap<>();
        this.C0 = a6hVar;
        this.F0 = new AnimatorSet();
        this.K0 = 1.0f;
        this.Q0 = new AnimatorSet();
        this.R0 = new AnimatorSet();
        this.V0 = true;
    }

    public static void Z0(u6j u6jVar, final ImageView imageView, float f2) {
        Context context = u6jVar.getContext();
        if (context != null) {
            final int color = context.getColor(R.color.trans_black_40);
            imageView.setColorFilter(new PorterDuffColorFilter(b78.f(color, (int) (255.0f * f2)), PorterDuff.Mode.SRC_ATOP));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, 0.6f);
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: k6j
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    imageView.setColorFilter(new PorterDuffColorFilter(b78.f(color, (int) (((Float) flk.a(valueAnimator)).floatValue() * 255.0f)), PorterDuff.Mode.SRC_ATOP));
                }
            });
            valueAnimatorOfFloat.addListener(new v6j(u6jVar, imageView));
            valueAnimatorOfFloat.start();
        }
    }

    public static float f1(float f2) {
        return kotlin.ranges.f.k(new IntRange(0, (int) f2, 1), lx30.INSTANCE);
    }

    public static float g1(float f2) {
        return kotlin.ranges.f.k(new IntRange(0, (int) (f2 / 2.0f), 1), lx30.INSTANCE);
    }

    public static float p1() {
        return (kotlin.ranges.f.k(new IntRange(1, 10, 1), lx30.INSTANCE) * 5) / 10.0f;
    }

    @Override // defpackage.n2j
    public final void E0() {
        ajh ajhVarL1 = l1();
        int i2 = 0;
        if (ajhVarL1 != null) {
            ajhVarL1.A.b.setOnClickListener(new w4j(this, 0));
        }
        ajh ajhVarL2 = l1();
        if (ajhVarL2 != null) {
            ajhVarL2.z.b.setOnClickListener(new View.OnClickListener() { // from class: x4j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.o1(0);
                }
            });
        }
        ajh ajhVarL3 = l1();
        if (ajhVarL3 != null) {
            ajhVarL3.B.b.setOnClickListener(new y4j(this, i2));
        }
        ajh ajhVarL4 = l1();
        if (ajhVarL4 != null) {
            ajhVarL4.A.c.setOnClickListener(new z4j(this, i2));
        }
        ajh ajhVarL5 = l1();
        if (ajhVarL5 != null) {
            ajhVarL5.z.c.setOnClickListener(new b5j(this, i2));
        }
        ajh ajhVarL6 = l1();
        if (ajhVarL6 != null) {
            ajhVarL6.B.c.setOnClickListener(new c5j(this, i2));
        }
        djh djhVar = this.b;
        if (djhVar != null) {
            djhVar.y.e.setOnClickListener(new View.OnClickListener() { // from class: d5j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u6j u6jVar = this.a;
                    khp khpVar = (khp) u6jVar.t0().N.getValue();
                    if (khpVar == khp.c || khpVar == khp.d) {
                        return;
                    }
                    u6jVar.o0(new n5j(u6jVar, 0));
                }
            });
        }
        djh djhVar2 = this.b;
        if (djhVar2 != null) {
            djhVar2.y.c.setOnClickListener(new e5j(this, i2));
        }
        djh djhVar3 = this.b;
        if (djhVar3 != null) {
            djhVar3.H.setOnClickListener(new f5j(this, i2));
        }
        if (getView() != null) {
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ebs.a(viewLifecycleOwner.getLifecycle()).b(new d(null));
            ibs viewLifecycleOwner2 = getViewLifecycleOwner();
            viewLifecycleOwner2.getClass();
            ebs.a(viewLifecycleOwner2.getLifecycle()).b(new e(null));
        }
    }

    @Override // defpackage.n2j
    public final void F0() {
        String name;
        String name2;
        String name3;
        djh djhVar;
        q8i0 q8i0Var = this.o0;
        int i2 = 0;
        this.F = false;
        djh djhVar2 = this.b;
        if (djhVar2 != null) {
            djhVar2.w.B.setVisibility(0);
        }
        y0();
        t0().V = true;
        xbg xbgVar = this.L;
        if (xbgVar != null && xbgVar.isShowing()) {
            xbgVar.dismiss();
            this.L = null;
        }
        r4j.e.a();
        if (this.h0) {
            SharedPreferences sharedPreferences = this.J;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("MUSIC", true)) : null;
            if (isAdded() && (djhVar = this.b) != null) {
                ProgressMeterComponent progressMeterComponent = djhVar.G;
                ypa0 ypa0VarV0 = v0();
                String string = getString(R.string.bg_music);
                string.getClass();
                progressMeterComponent.K(ypa0VarV0, boolValueOf, string);
            }
        }
        if (Intrinsics.g(NetworkStateManager.INSTANCE.isConnected(), Boolean.FALSE)) {
            R0();
        } else {
            djh djhVar3 = this.b;
            if (djhVar3 != null) {
                djhVar3.w.B.setVisibility(0);
            }
            GameDetails gameDetails = this.c;
            if (gameDetails != null && (name = gameDetails.getName()) != null) {
                aij aijVarU0 = u0();
                ej5.c(o8i0.d(aijVarU0), null, null, new zhj(aijVarU0, name, null), 3);
            }
        }
        try {
            GameDetails gameDetails2 = this.c;
            String str = "";
            if (gameDetails2 == null || (name2 = gameDetails2.getName()) == null) {
                name2 = "";
            }
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ra6.c(name2, viewLifecycleOwner, (db6) q8i0Var.getValue(), e1());
            GameDetails gameDetails3 = this.c;
            if (gameDetails3 != null && (name3 = gameDetails3.getName()) != null) {
                str = name3;
            }
            androidx.fragment.app.e activity = getActivity();
            ibs viewLifecycleOwner2 = getViewLifecycleOwner();
            viewLifecycleOwner2.getClass();
            djh djhVar4 = this.b;
            ra6.b(str, activity, viewLifecycleOwner2, djhVar4 != null ? djhVar4.A : null, this.l0, e1(), (db6) q8i0Var.getValue(), 0L, null, new tld0(this.c), new Function1() { // from class: k5j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    u6j u6jVar = this.a;
                    CampaignTopicResponse campaignTopicResponse = (CampaignTopicResponse) obj;
                    try {
                        u6jVar.m0 = campaignTopicResponse != null;
                        if (campaignTopicResponse != null && !Intrinsics.g(campaignTopicResponse.getMessageType(), "ACTIVITY_INIT") && campaignTopicResponse.getCampaignCompletedJustNow()) {
                            u6jVar.w1();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    return Unit.a;
                }
            }, new u5j(this, i2), null, 18048);
            e1().x1();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // defpackage.n2j
    public final void I0(boolean z) {
        o8j o8jVarT0 = t0();
        ej5.c(o8i0.d(o8jVarT0), null, null, new t8j(o8jVarT0, z, null), 3);
    }

    @Override // defpackage.n2j
    public final void J0() {
        djh djhVar = this.b;
        if (djhVar != null) {
            djhVar.y.e.setAlpha(1.0f);
        }
        r750.a(t0(), new ede(this, 1));
    }

    @Override // defpackage.n2j
    public final void N0() {
        o0(new rbe(this, 1));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0124  */
    public final void a1(boolean z) {
        float y;
        djh djhVar;
        djh djhVar2 = this.b;
        if (djhVar2 != null) {
            bjh bjhVar = djhVar2.w;
            ConstraintLayout constraintLayout = bjhVar.y;
            AppCompatImageView appCompatImageView = bjhVar.d;
            AppCompatImageView appCompatImageView2 = bjhVar.e;
            c9i0 c9i0Var = this.i;
            try {
                float y2 = constraintLayout.getY() + (constraintLayout.getLayoutParams().height / 2);
                Drawable drawable = appCompatImageView.getDrawable();
                drawable.getClass();
                appCompatImageView.setY(y2 - (((BitmapDrawable) drawable).getBitmap().getHeight() * 0.5f));
                float y3 = constraintLayout.getY() + (constraintLayout.getLayoutParams().height / 2);
                Drawable drawable2 = appCompatImageView2.getDrawable();
                drawable2.getClass();
                appCompatImageView2.setY(y3 - (((BitmapDrawable) drawable2).getBitmap().getHeight() * 0.5f));
                if (constraintLayout.getX() < 0.0f) {
                    djh djhVar3 = this.b;
                    if (djhVar3 != null) {
                        djhVar3.w.y.setX(0.0f);
                    }
                    appCompatImageView.setX(0.0f - (appCompatImageView.getLayoutParams().width / 2.0f));
                    appCompatImageView2.setX((20.0f * this.K0) + appCompatImageView.getX() + appCompatImageView.getLayoutParams().width);
                    djh djhVar4 = this.b;
                    if (djhVar4 != null) {
                        djhVar4.w.y.setY(constraintLayout.getY() - (constraintLayout.getLayoutParams().height / 2));
                    }
                } else if (c9i0Var.a - (constraintLayout.getX() + constraintLayout.getLayoutParams().width) < 0.0f) {
                    djh djhVar5 = this.b;
                    if (djhVar5 != null) {
                        djhVar5.w.y.setX(c9i0Var.a - constraintLayout.getLayoutParams().width);
                    }
                    appCompatImageView2.setX(c9i0Var.a - (appCompatImageView2.getLayoutParams().width / 2.0f));
                    appCompatImageView.setX((appCompatImageView2.getX() - (20.0f * this.K0)) - appCompatImageView.getLayoutParams().width);
                    djh djhVar6 = this.b;
                    if (djhVar6 != null) {
                        djhVar6.w.y.setY(constraintLayout.getY() - (constraintLayout.getLayoutParams().height / 2));
                    }
                }
                djh djhVar7 = this.b;
                if (z) {
                    if (djhVar7 != null) {
                        y = djhVar7.w.w.getY();
                    } else {
                        y = 0.0f;
                    }
                } else if (djhVar7 != null) {
                    y = djhVar7.w.C.getY();
                } else {
                    y = 0.0f;
                }
                if (this.M0 == 3) {
                    float y4 = y == 0.0f ? -50.0f : y - (constraintLayout.getY() + constraintLayout.getHeight());
                    if (y4 < 0.0f) {
                        constraintLayout.setY(constraintLayout.getY() + y4);
                        djh djhVar8 = this.b;
                        if (djhVar8 != null) {
                            AppCompatImageView appCompatImageView3 = djhVar8.w.d;
                            appCompatImageView3.setY(appCompatImageView3.getY() + y4);
                        }
                        djh djhVar9 = this.b;
                        if (djhVar9 != null) {
                            AppCompatImageView appCompatImageView4 = djhVar9.w.e;
                            appCompatImageView4.setY(appCompatImageView4.getY() + y4);
                        }
                    }
                }
                djh djhVar10 = this.b;
                float y5 = djhVar10 != null ? djhVar10.b.getY() : 0.0f;
                float f2 = this.w0;
                if (y5 < f2 && (djhVar = this.b) != null) {
                    djhVar.b.setY(f2);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        r750.d(t0(), new o5j(this, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b1(final ConstraintLayout constraintLayout, boolean z, x1b x1bVar) {
        y6j y6jVar;
        androidx.fragment.app.e eVar;
        if (x1bVar instanceof y6j) {
            y6jVar = (y6j) x1bVar;
            int i2 = y6jVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y6jVar.e = i2 - Integer.MIN_VALUE;
            } else {
                y6jVar = new y6j(this, x1bVar);
            }
        } else {
            y6jVar = new y6j(this, x1bVar);
        }
        Object obj = y6jVar.c;
        y5b y5bVar = y5b.a;
        int i3 = y6jVar.e;
        int i4 = 1;
        if (i3 == 0) {
            uj50.b(obj);
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                return Unit.a;
            }
            WaterDropletView waterDropletView = new WaterDropletView(activity);
            if (constraintLayout != null) {
                constraintLayout.addView(waterDropletView);
            }
            waterDropletView.a(new q3a(i4, this, z));
            y6jVar.a = constraintLayout;
            y6jVar.b = activity;
            y6jVar.e = 1;
            if (hkd.b(1200L, y6jVar) == y5bVar) {
                return y5bVar;
            }
            eVar = activity;
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = y6jVar.b;
            constraintLayout = y6jVar.a;
            uj50.b(obj);
        }
        WaterDropletView waterDropletView2 = new WaterDropletView(eVar);
        if (constraintLayout != null) {
            constraintLayout.addView(waterDropletView2);
        }
        waterDropletView2.a(new Function0() { // from class: u4j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ConstraintLayout constraintLayout2 = constraintLayout;
                if (constraintLayout2 != null) {
                    constraintLayout2.removeAllViews();
                }
                return Unit.a;
            }
        });
        return Unit.a;
    }

    public final void c1() {
        ajh ajhVarL1 = l1();
        if (ajhVarL1 != null) {
            e6i0.a(ajhVarL1.e);
        }
        ajh ajhVarL2 = l1();
        if (ajhVarL2 != null) {
            e6i0.a(ajhVarL2.f);
        }
        v1(0.5f, 1.0f);
        djh djhVar = this.b;
        if (djhVar != null) {
            djhVar.H.setVisibility(8);
        }
        djh djhVar2 = this.b;
        if (djhVar2 != null) {
            djhVar2.y.f.setVisibility(8);
        }
        djh djhVar3 = this.b;
        if (djhVar3 != null) {
            djhVar3.C.F(R.drawable.fh_hamburger_add_money);
        }
        r750.b(t0(), 800L, new t4j(this, 0));
    }

    public final void d1(androidx.fragment.app.e eVar) {
        if (!yju.a("br")) {
            t0().D1(1);
            o0(new m5j(this, 0));
        } else if (eVar instanceof GameMainActivity) {
            ((GameMainActivity) eVar).J1(new b(), new c(eVar));
        }
    }

    public final fuj e1() {
        return (fuj) this.n0.getValue();
    }

    public final Path h1(float f2, float f3, boolean z) {
        Path path = new Path();
        c9i0 c9i0Var = this.i;
        if (!z) {
            path.moveTo(-(c9i0Var.c * 80.0f), c9i0Var.b * f3);
            float f4 = c9i0Var.a;
            float f5 = c9i0Var.b;
            path.quadTo(f4 / 2.0f, f2 * f5, (c9i0Var.c * 20.0f) + f4, f5 * f3);
            return path;
        }
        path.moveTo((c9i0Var.c * 20.0f) + c9i0Var.a, c9i0Var.b * f3);
        float f6 = c9i0Var.a / 2.0f;
        float f7 = c9i0Var.b;
        path.quadTo(f6, f2 * f7, -(c9i0Var.c * 80.0f), f7 * f3);
        return path;
    }

    public final AppCompatImageView i1(final int i2, boolean z) {
        final AppCompatImageView appCompatImageView;
        if (getActivity() != null) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                appCompatImageView = null;
            } else if (!activity.isFinishing() && !activity.isDestroyed()) {
                appCompatImageView = new AppCompatImageView(activity);
            }
            c9i0 c9i0Var = this.i;
            float f2 = c9i0Var.a;
            float f3 = c9i0Var.b;
            if (z) {
                if (appCompatImageView != null) {
                    appCompatImageView.setImageResource(R.drawable.fh_glow_worm);
                }
                if (appCompatImageView != null) {
                    appCompatImageView.setLayoutParams(m7i0.c(c9i0Var.c * 1.0f, 8, 8));
                }
            }
            if (appCompatImageView != null) {
                appCompatImageView.setId(View.generateViewId());
            }
            if (appCompatImageView != null) {
                appCompatImageView.setX(f1(f2));
            }
            if (appCompatImageView != null) {
                appCompatImageView.setY(g1(f3));
            }
            if (z) {
                if (appCompatImageView != null) {
                    IntRange intRange = new IntRange(10000, 30000, 1);
                    lx30.Companion companion = lx30.INSTANCE;
                    long jK = kotlin.ranges.f.k(intRange, companion);
                    float fK = kotlin.ranges.f.k(new IntRange(8, 20, 1), companion) * 0.1f;
                    float fK2 = kotlin.ranges.f.k(new IntRange(1, 10, 1), companion) * 0.1f;
                    float fF1 = f1(f2);
                    float fF2 = f1(f2);
                    float fF3 = f1(f2);
                    float fG1 = g1(f3);
                    float fG2 = g1(f3);
                    float fG3 = g1(f3);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatImageView, "translationX", fF1, fF2, fF3);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatImageView, "translationY", fG1, fG2, fG3);
                    objectAnimatorOfFloat.setInterpolator(null);
                    objectAnimatorOfFloat.setDuration(jK);
                    objectAnimatorOfFloat.setRepeatMode(2);
                    objectAnimatorOfFloat.setRepeatCount(-1);
                    objectAnimatorOfFloat2.setInterpolator(null);
                    objectAnimatorOfFloat2.setDuration(jK);
                    objectAnimatorOfFloat2.setRepeatMode(2);
                    objectAnimatorOfFloat2.setRepeatCount(-1);
                    appCompatImageView.setAlpha(fK2);
                    appCompatImageView.setScaleX(fK);
                    appCompatImageView.setScaleY(fK);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                    objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y5j
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            valueAnimator.getClass();
                            if (valueAnimator.getCurrentPlayTime() % 1000 == 0) {
                                int i3 = i2 % 2;
                                u6j u6jVar = this;
                                AppCompatImageView appCompatImageView2 = appCompatImageView;
                                if (i3 == 1) {
                                    if (u6jVar.V0) {
                                        appCompatImageView2.setScaleX(appCompatImageView2.getScaleX() + 0.05f);
                                        appCompatImageView2.setScaleY(appCompatImageView2.getScaleY() + 0.05f);
                                        if (appCompatImageView2.getScaleX() > 2.0f) {
                                            u6jVar.V0 = false;
                                        }
                                    } else {
                                        appCompatImageView2.setScaleX(appCompatImageView2.getScaleX() - 0.05f);
                                        appCompatImageView2.setScaleY(appCompatImageView2.getScaleY() - 0.05f);
                                        if (appCompatImageView2.getScaleX() < 0.2f) {
                                            u6jVar.V0 = true;
                                        }
                                    }
                                } else if (u6jVar.W0) {
                                    appCompatImageView2.setScaleX(appCompatImageView2.getScaleX() + 0.05f);
                                    appCompatImageView2.setScaleY(appCompatImageView2.getScaleY() + 0.05f);
                                    if (appCompatImageView2.getScaleX() > 2.0f) {
                                        u6jVar.W0 = false;
                                    }
                                } else {
                                    appCompatImageView2.setScaleX(appCompatImageView2.getScaleX() - 0.05f);
                                    appCompatImageView2.setScaleY(appCompatImageView2.getScaleY() - 0.05f);
                                    if (appCompatImageView2.getScaleX() < 0.3f) {
                                        u6jVar.W0 = true;
                                    }
                                }
                                float f4 = 1.0f;
                                if (appCompatImageView2.getScaleX() / 2.0f <= 0.7d) {
                                    float scaleX = appCompatImageView2.getScaleX() / 2.0f;
                                    if (scaleX <= 1.0f) {
                                        f4 = scaleX;
                                    }
                                }
                                appCompatImageView2.setAlpha(f4);
                                if (appCompatImageView2.getScaleX() > 3.0f) {
                                    appCompatImageView2.setScaleX(0.05f);
                                    appCompatImageView2.setScaleY(0.05f);
                                    if (i3 == 1) {
                                        u6jVar.V0 = false;
                                        return;
                                    } else {
                                        u6jVar.W0 = false;
                                        return;
                                    }
                                }
                                if (appCompatImageView2.getScaleX() < 0.0f) {
                                    appCompatImageView2.setScaleX(0.04f);
                                    appCompatImageView2.setScaleY(0.04f);
                                    if (i3 == 1) {
                                        u6jVar.V0 = true;
                                    } else {
                                        u6jVar.W0 = true;
                                    }
                                }
                            }
                        }
                    });
                    r750.d(t0(), new ki0(animatorSet, 2));
                    return appCompatImageView;
                }
            } else if (appCompatImageView != null) {
                appCompatImageView.setImageResource(R.drawable.fh_glow_worm_success);
                int i3 = (int) (c9i0Var.c * 40.0f);
                appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(i3, i3));
                r750.d(t0(), new p5j(appCompatImageView, 0));
            }
            return appCompatImageView;
        }
        return null;
    }

    @Override // defpackage.n2j
    public final void j0() {
        if (this.H) {
            return;
        }
        n8j n8jVar = (n8j) this.j0.getValue();
        n8jVar.c = true;
        kd2.a(0, n8jVar.f, null);
        StompClient stompClient = n8jVar.b;
        if (stompClient != null && stompClient.isConnected()) {
            stompClient.disconnect();
        }
        y0();
        this.a = false;
    }

    public final void j1() {
        djh djhVar = this.b;
        if (djhVar != null) {
            djhVar.w.v.removeAllViews();
        }
        djh djhVar2 = this.b;
        if (djhVar2 != null) {
            djhVar2.e.A.setVisibility(8);
        }
        djh djhVar3 = this.b;
        if (djhVar3 != null) {
            djhVar3.w.i.setVisibility(8);
        }
        djh djhVar4 = this.b;
        if (djhVar4 != null) {
            djhVar4.w.w.setVisibility(8);
        }
        djh djhVar5 = this.b;
        if (djhVar5 != null) {
            djhVar5.w.c.setVisibility(8);
        }
    }

    public final void k1() {
        float f2;
        double width;
        double d2;
        int iIntValue = ((Number) t0().L.getValue()).intValue();
        if (iIntValue == 0) {
            ajh ajhVarL1 = l1();
            if (ajhVarL1 != null) {
                View view = ajhVarL1.v;
                ajh ajhVarL2 = l1();
                view.setY(ajhVarL2 != null ? ajhVarL2.F.getY() : 0.0f);
                view.setPivotY(view.getHeight() != 0 ? view.getHeight() : 0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(0.0f);
                view.setAlpha(1.0f);
            }
            ajh ajhVarL3 = l1();
            if (ajhVarL3 != null) {
                ajhVarL3.i.setScaleY(0.0f);
            }
        } else {
            int[] iArr = new int[2];
            djh djhVar = this.b;
            if (djhVar != null) {
                djhVar.v.d.getLocationOnScreen(iArr);
            }
            float f3 = iArr[1];
            ajh ajhVarL4 = l1();
            this.J0 = (f3 - (ajhVarL4 != null ? ajhVarL4.e.getHeight() : 0)) + this.w0;
            if (iIntValue == -1) {
                f2 = iArr[0];
                ajh ajhVarL5 = l1();
                width = ajhVarL5 != null ? ajhVarL5.e.getWidth() : 0;
                d2 = 0.15d;
            } else {
                f2 = iArr[0];
                ajh ajhVarL6 = l1();
                width = ajhVarL6 != null ? ajhVarL6.e.getWidth() : 0;
                d2 = 0.8d;
            }
            this.I0 = f2 - ((int) (width * d2));
            ajh ajhVarL7 = l1();
            if (ajhVarL7 != null) {
                View view2 = ajhVarL7.i;
                ajh ajhVarL8 = l1();
                view2.setY(ajhVarL8 != null ? ajhVarL8.d.getY() : 0.0f);
                view2.setPivotY(view2.getHeight());
                view2.setScaleX(1.0f);
                view2.setScaleY(0.0f);
                view2.setAlpha(1.0f);
            }
            ajh ajhVarL9 = l1();
            if (ajhVarL9 != null) {
                ajhVarL9.v.setScaleY(0.0f);
            }
        }
        ajh ajhVarL10 = l1();
        if (ajhVarL10 != null) {
            AppCompatImageView appCompatImageView = ajhVarL10.e;
            AnimatorSet animatorSet = this.F0;
            if (iIntValue == 0) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatImageView, this.r0, 0.0f, 0.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatImageView, this.q0, 0.0f, this.i.b * (-1.0f));
                objectAnimatorOfFloat.setRepeatCount(0);
                objectAnimatorOfFloat2.setRepeatCount(0);
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                return;
            }
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(appCompatImageView, "x", appCompatImageView.getX(), this.I0);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(appCompatImageView, "y", appCompatImageView.getY(), this.J0);
            objectAnimatorOfFloat3.setRepeatCount(0);
            objectAnimatorOfFloat4.setRepeatCount(0);
            animatorSet.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        }
    }

    public final ajh l1() {
        djh djhVar = this.b;
        if (djhVar != null) {
            return djhVar.v;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ce, code lost:
    
        if (r10 == r1) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1(defpackage.x1b r11) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6j.m1(x1b):java.lang.Object");
    }

    public final void n1(ResultWrapper.GenericError genericError) {
        S0(getActivity(), genericError);
        r750.d(t0(), new h5j(this, 0));
        r750.b(t0(), 600L, new i5j(this, 0));
        ej5.c(o8i0.d(t0()), null, null, new s750(new j5j(this, 0), null), 3);
    }

    public final void o1(int i2) {
        this.y = i2;
        t0().B1(i2);
        r750.a(t0(), new r5j(this, 0));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030 A[Catch: Exception -> 0x0036, TRY_LEAVE, TryCatch #1 {Exception -> 0x0036, blocks: (B:2:0x0000, B:16:0x002c, B:18:0x0030, B:15:0x0029, B:3:0x0006, B:5:0x000a, B:8:0x0010, B:10:0x0014, B:11:0x001d, B:13:0x0021), top: B:26:0x0000, inners: #0 }] */
    @Override // defpackage.n2j, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        djh djhVar;
        try {
            j0();
            x1();
            try {
                ConstraintLayout constraintLayout = this.T0;
                if (constraintLayout != null) {
                    constraintLayout.removeAllViews();
                }
                djh djhVar2 = this.b;
                if (djhVar2 != null) {
                    djhVar2.e.d.removeView(this.T0);
                }
                djh djhVar3 = this.b;
                if (djhVar3 != null) {
                    djhVar3.w.v.removeAllViews();
                    djhVar = this.b;
                    if (djhVar != null) {
                        djhVar.c.removeAllViews();
                    }
                } else {
                    djhVar = this.b;
                    if (djhVar != null) {
                        djhVar.c.removeAllViews();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            e1().e.l(getViewLifecycleOwner());
            e1().d.l(getViewLifecycleOwner());
            e1().y1();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // defpackage.n2j, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        try {
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ebs.a(viewLifecycleOwner.getLifecycle()).b(new f(null));
            try {
                androidx.fragment.app.e activity = getActivity();
                if (activity != null) {
                    String str = ((db6) this.o0.getValue()).c;
                    if (str == null) {
                        str = "Ongoing";
                    }
                    this.l0 = new z66(activity, str);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            n0(new bee(this, 1));
            djh djhVar = this.b;
            if (djhVar != null) {
                djhVar.i.setContent(new op8(1488798300, new Function2() { // from class: g1j
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        int i2 = 0;
                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            orp.a(sjj.a(), pp8.b(903065339, new n1j(this.a, i2), aVar), aVar, 48);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true));
            }
            ibs viewLifecycleOwner2 = getViewLifecycleOwner();
            viewLifecycleOwner2.getClass();
            ebs.a(viewLifecycleOwner2.getLifecycle()).b(new k3j(this, null));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final void q1() {
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new g(null), 3);
        ArrayList arrayList = this.s0;
        if (arrayList.size() > 10) {
            List listA0 = CollectionsKt.A0(CollectionsKt.u0(10, arrayList));
            arrayList.clear();
            arrayList.addAll(listA0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009a A[Catch: Exception -> 0x0096, TryCatch #0 {Exception -> 0x0096, blocks: (B:36:0x0092, B:40:0x009a, B:41:0x009d, B:43:0x00a3, B:44:0x00a7), top: B:49:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3 A[Catch: Exception -> 0x0096, TryCatch #0 {Exception -> 0x0096, blocks: (B:36:0x0092, B:40:0x009a, B:41:0x009d, B:43:0x00a3, B:44:0x00a7), top: B:49:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7 A[Catch: Exception -> 0x0096, TRY_LEAVE, TryCatch #0 {Exception -> 0x0096, blocks: (B:36:0x0092, B:40:0x009a, B:41:0x009d, B:43:0x00a3, B:44:0x00a7), top: B:49:0x0092 }] */
    public final void r1() {
        ajh ajhVarL1;
        this.k0 = null;
        djh djhVar = this.b;
        if (djhVar != null) {
            AppCompatTextView appCompatTextView = djhVar.w.D;
            appCompatTextView.animate().alpha(0.0f).setDuration(200L).setListener(new f6i0(appCompatTextView));
        }
        ajh ajhVarL2 = l1();
        if (ajhVarL2 != null) {
            ConstraintLayout constraintLayout = ajhVarL2.w;
            ajh ajhVarL3 = l1();
            if (ajhVarL3 != null) {
                ajhVarL3.w.setZ(0.0f);
            }
            ajh ajhVarL4 = l1();
            if (ajhVarL4 != null && ajhVarL4.C.indexOfChild(constraintLayout) == -1 && (ajhVarL1 = l1()) != null) {
                ajhVarL1.C.addView(constraintLayout);
            }
        }
        int i2 = 0;
        if (this.D0 == 0.0f) {
            ajh ajhVarL5 = l1();
            if (ajhVarL5 != null) {
                ajhVarL5.e.setVisibility(0);
            }
        } else {
            ajh ajhVarL6 = l1();
            if (ajhVarL6 != null) {
                ajhVarL6.e.setX(this.D0);
            }
            ajh ajhVarL7 = l1();
            if (ajhVarL7 != null) {
                ajhVarL7.e.setY(this.E0);
            }
            ajh ajhVarL8 = l1();
            if (ajhVarL8 != null) {
                final AppCompatImageView appCompatImageView = ajhVarL8.e;
                ajh ajhVarL9 = l1();
                ConstraintLayout constraintLayout2 = ajhVarL9 != null ? ajhVarL9.w : null;
                if (constraintLayout2 != null) {
                    try {
                        constraintLayout2.removeView(appCompatImageView);
                        if (constraintLayout2 != null) {
                            constraintLayout2.addView(appCompatImageView);
                        }
                        if (appCompatImageView.getWidth() == 0) {
                            e6i0.a(appCompatImageView);
                        } else {
                            appCompatImageView.setPivotX(appCompatImageView.getWidth() / 2.0f);
                            appCompatImageView.setPivotY(appCompatImageView.getHeight() / 2.0f);
                            appCompatImageView.setScaleX(1.0f);
                            appCompatImageView.setScaleY(1.0f);
                            appCompatImageView.setVisibility(0);
                            appCompatImageView.animate().scaleX(1.06f).setDuration(100L).setListener(null);
                            appCompatImageView.animate().scaleY(1.06f).setDuration(100L).withEndAction(new Runnable() { // from class: z5i0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    View view = appCompatImageView;
                                    view.setScaleX(1.0f);
                                    view.setScaleY(1.0f);
                                }
                            });
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    if (constraintLayout2 != null) {
                        constraintLayout2.addView(appCompatImageView);
                    }
                    if (appCompatImageView.getWidth() == 0) {
                        e6i0.a(appCompatImageView);
                    } else {
                        appCompatImageView.setPivotX(appCompatImageView.getWidth() / 2.0f);
                        appCompatImageView.setPivotY(appCompatImageView.getHeight() / 2.0f);
                        appCompatImageView.setScaleX(1.0f);
                        appCompatImageView.setScaleY(1.0f);
                        appCompatImageView.setVisibility(0);
                        appCompatImageView.animate().scaleX(1.06f).setDuration(100L).setListener(null);
                        appCompatImageView.animate().scaleY(1.06f).setDuration(100L).withEndAction(new Runnable() { // from class: z5i0
                            @Override // java.lang.Runnable
                            public final void run() {
                                View view = appCompatImageView;
                                view.setScaleX(1.0f);
                                view.setScaleY(1.0f);
                            }
                        });
                    }
                }
            }
        }
        n0(new s6j(this, i2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x0130  */
    public final void s1(FruitMap fruitMap, float f2, Bitmap bitmap) {
        ViewGroup.LayoutParams layoutParamsC;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
        djh djhVar = this.b;
        if (djhVar != null) {
            AppCompatImageView appCompatImageView = djhVar.w.d;
            appCompatImageView.setRotation(0.0f);
            appCompatImageView.setAlpha(1.0f);
            appCompatImageView.setImageDrawable(bitmapDrawable);
            FruitItem.FruitRecord fruitItem = fruitMap.getFruitItem();
            float f3 = this.K0;
            String strValueOf = String.valueOf(fruitItem != null ? fruitItem.getFruitObj() : null);
            Locale locale = SportyGamesManager.locale;
            switch (gvf.a(locale, strValueOf, locale)) {
                case "banana":
                    layoutParamsC = m7i0.c(f3, 57, 30);
                    break;
                case "orange":
                    layoutParamsC = m7i0.c(f3, 40, 60);
                    break;
                case "papaya":
                    layoutParamsC = m7i0.c(f3, 54, 60);
                    break;
                case "avocado":
                    layoutParamsC = m7i0.c(f3, 36, 60);
                    break;
                case "pineapple":
                    layoutParamsC = m7i0.c(f3, 48, 60);
                    break;
                case "dragon_fruit":
                    layoutParamsC = m7i0.c(f3, 56, 60);
                    break;
                case "kiwi":
                    layoutParamsC = m7i0.c(f3, 44, 60);
                    break;
                case "pear":
                    layoutParamsC = m7i0.c(f3, 52, 60);
                    break;
                case "apple":
                    layoutParamsC = m7i0.c(f3, 42, 60);
                    break;
                case "guava":
                    layoutParamsC = m7i0.c(f3, 46, 60);
                    break;
                case "mango":
                    layoutParamsC = m7i0.c(f3, 46, 60);
                    break;
                case "strawberry":
                    layoutParamsC = m7i0.c(f3, 40, 60);
                    break;
                case "coconut":
                    layoutParamsC = m7i0.c(f3, 54, 60);
                    break;
                case "pomegranate":
                    layoutParamsC = m7i0.c(f3, 50, 60);
                    break;
                case "watermelon":
                    layoutParamsC = m7i0.c(f3, 56, 60);
                    break;
                default:
                    layoutParamsC = m7i0.c(f3, 50, 50);
                    break;
            }
            appCompatImageView.setLayoutParams(layoutParamsC);
            appCompatImageView.setX((f2 - (appCompatImageView.getLayoutParams().width * 0.75f)) - (this.L0 / 2));
        }
    }

    public final void u1(float f2) {
        ajh ajhVarL1 = l1();
        if (ajhVarL1 != null) {
            ajhVarL1.e.animate().rotation(f2).setDuration(400L);
        }
        ajh ajhVarL2 = l1();
        if (ajhVarL2 != null) {
            ajhVarL2.G.setRotation(f2);
        }
    }

    public final void v1(float f2, float f3) {
        ajh ajhVarL1 = l1();
        if (ajhVarL1 != null) {
            e6i0.b(ajhVarL1.A.b, f2);
        }
        ajh ajhVarL2 = l1();
        if (ajhVarL2 != null) {
            e6i0.b(ajhVarL2.B.b, f2);
        }
        ajh ajhVarL3 = l1();
        if (ajhVarL3 != null) {
            e6i0.b(ajhVarL3.z.b, f2);
        }
        int iIntValue = ((Number) t0().L.getValue()).intValue();
        if (iIntValue == -1) {
            ajh ajhVarL4 = l1();
            if (ajhVarL4 != null) {
                e6i0.b(ajhVarL4.A.b, f3);
            }
            ajh ajhVarL5 = l1();
            if (ajhVarL5 != null) {
                e6i0.b(ajhVarL5.A.c, f3);
                return;
            }
            return;
        }
        if (iIntValue == 0) {
            ajh ajhVarL6 = l1();
            if (ajhVarL6 != null) {
                e6i0.b(ajhVarL6.z.b, f3);
            }
            ajh ajhVarL7 = l1();
            if (ajhVarL7 != null) {
                e6i0.b(ajhVarL7.z.c, f3);
                return;
            }
            return;
        }
        if (iIntValue != 1) {
            return;
        }
        ajh ajhVarL8 = l1();
        if (ajhVarL8 != null) {
            e6i0.b(ajhVarL8.B.b, f3);
        }
        ajh ajhVarL9 = l1();
        if (ajhVarL9 != null) {
            e6i0.b(ajhVarL9.B.c, f3);
        }
    }

    public final void w1() {
        boolean z;
        int i2 = 0;
        try {
            z = this.z0 != 0 && System.currentTimeMillis() - this.z0 < 30000;
            this.z0 = System.currentTimeMillis();
        } catch (Exception e2) {
            e2.printStackTrace();
            z = false;
        }
        if (z) {
            return;
        }
        try {
            o0(new n6j(this, i2));
            ej5.c(o8i0.d(t0()), null, null, new z7j(this, null), 3);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final void x1() {
        djh djhVar = this.b;
        if (djhVar != null) {
            djhVar.e.v.removeAllViews();
        }
        djh djhVar2 = this.b;
        if (djhVar2 != null) {
            djhVar2.e.w.removeAllViews();
        }
        djh djhVar3 = this.b;
        if (djhVar3 != null) {
            djhVar3.e.y.removeAllViews();
        }
        djh djhVar4 = this.b;
        if (djhVar4 != null) {
            djhVar4.e.z.removeAllViews();
        }
    }

    @Override // defpackage.n2j
    public final void y0() {
        if (this.H) {
            return;
        }
        this.x0 = 0;
        o8j o8jVarT0 = t0();
        ej5.c(o8i0.d(o8jVarT0), null, null, new s8j(o8jVarT0, false, null), 3);
        this.b0 = false;
        o0(new n3a(this, 1));
        n0(new a5j(this, 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x0130  */
    public final void t1(FruitMap fruitMap, float f2, Bitmap bitmap) {
        ViewGroup.LayoutParams layoutParamsC;
        djh djhVar = this.b;
        if (djhVar != null) {
            AppCompatImageView appCompatImageView = djhVar.w.e;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(appCompatImageView.getResources(), bitmap);
            appCompatImageView.setRotation(0.0f);
            appCompatImageView.setAlpha(1.0f);
            appCompatImageView.setImageDrawable(bitmapDrawable);
            FruitItem.FruitRecord fruitItem = fruitMap.getFruitItem();
            float f3 = this.K0;
            String strValueOf = String.valueOf(fruitItem != null ? fruitItem.getFruitObj() : null);
            Locale locale = SportyGamesManager.locale;
            String strA = gvf.a(locale, strValueOf, locale);
            switch (strA.hashCode()) {
                case -1396355227:
                    if (!strA.equals("banana")) {
                        layoutParamsC = m7i0.c(f3, 50, 50);
                    } else {
                        layoutParamsC = m7i0.c(f3, 66, 30);
                    }
                    break;
                case -1008851410:
                    if (!strA.equals("orange")) {
                        layoutParamsC = m7i0.c(f3, 50, 50);
                    } else {
                        layoutParamsC = m7i0.c(f3, 44, 60);
                    }
                    break;
                case -995487190:
                    if (!strA.equals("papaya")) {
                        layoutParamsC = m7i0.c(f3, 50, 50);
                    } else {
                        layoutParamsC = m7i0.c(f3, 56, 60);
                    }
                    break;
                case -622659773:
                    if (!strA.equals("avocado")) {
                        layoutParamsC = m7i0.c(f3, 50, 50);
                    } else {
                        layoutParamsC = m7i0.c(f3, 34, 60);
                    }
                    break;
                case -434214934:
                    if (!strA.equals("pineapple")) {
                        layoutParamsC = m7i0.c(f3, 50, 50);
                    } else {
                        layoutParamsC = m7i0.c(f3, 64, 60);
                    }
                    break;
                case -199755032:
                    if (!strA.equals("dragon_fruit")) {
                        layoutParamsC = m7i0.c(f3, 50, 50);
                    } else {
                        layoutParamsC = m7i0.c(f3, 58, 60);
                    }
                    break;
                case 3292336:
                    if (!strA.equals("kiwi")) {
                        layoutParamsC = m7i0.c(f3, 50, 50);
                    } else {
                        layoutParamsC = m7i0.c(f3, 44, 60);
                    }
                    break;
                case 3436774:
                    if (!strA.equals("pear")) {
                        layoutParamsC = m7i0.c(f3, 50, 50);
                    } else {
                        layoutParamsC = m7i0.c(f3, 42, 60);
                    }
                    break;
                case 93029210:
                    if (!strA.equals(rarBonoqWB.aPOZEv)) {
                        layoutParamsC = m7i0.c(f3, 50, 50);
                    } else {
                        layoutParamsC = m7i0.c(f3, 42, 60);
                    }
                    break;
                case 98705182:
                    if (!strA.equals("guava")) {
                        layoutParamsC = m7i0.c(f3, 50, 50);
                    } else {
                        layoutParamsC = m7i0.c(f3, 44, 60);
                    }
                    break;
                case 103662530:
                    if (!strA.equals("mango")) {
                        layoutParamsC = m7i0.c(f3, 50, 50);
                    } else {
                        layoutParamsC = m7i0.c(f3, 50, 60);
                    }
                    break;
                case 170385743:
                    if (!strA.equals("strawberry")) {
                        layoutParamsC = m7i0.c(f3, 50, 50);
                    } else {
                        layoutParamsC = m7i0.c(f3, 36, 60);
                    }
                    break;
                case 941231797:
                    if (!strA.equals("coconut")) {
                        layoutParamsC = m7i0.c(f3, 50, 50);
                    } else {
                        layoutParamsC = m7i0.c(f3, 54, 60);
                    }
                    break;
                case 1033169283:
                    if (!strA.equals("pomegranate")) {
                        layoutParamsC = m7i0.c(f3, 50, 50);
                    } else {
                        layoutParamsC = m7i0.c(f3, 50, 60);
                    }
                    break;
                case 1973903356:
                    if (!strA.equals("watermelon")) {
                        layoutParamsC = m7i0.c(f3, 50, 50);
                    } else {
                        layoutParamsC = m7i0.c(f3, 54, 60);
                    }
                    break;
                default:
                    layoutParamsC = m7i0.c(f3, 50, 50);
                    break;
            }
            appCompatImageView.setLayoutParams(layoutParamsC);
            appCompatImageView.setX((f2 - (appCompatImageView.getLayoutParams().width * 0.25f)) + (this.L0 / 2));
        }
    }
}
