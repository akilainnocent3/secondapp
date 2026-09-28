package defpackage;

import androidx.compose.animation.f;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class xvc {
    public static final umz a = androidx.compose.foundation.layout.h.b(0.0f, 0.0f, 12.0f, 12.0f, 3);
    public static final umz b = androidx.compose.foundation.layout.h.b(24.0f, 16.0f, 12.0f, 0.0f, 8);
    public static final umz c = androidx.compose.foundation.layout.h.b(24.0f, 0.0f, 12.0f, 12.0f, 2);
    public static final float d = 16.0f;

    @c0d(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$1", f = "DatePicker.kt", l = {1552}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, v1b v1bVar, zzr zzrVar) {
            super(2, v1bVar);
            this.b = zzrVar;
            this.c = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, v1bVar, this.b);
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
                zzr zzrVar = this.b;
                if (!zzrVar.i.c()) {
                    int iH = zzrVar.h();
                    int i2 = this.c;
                    if (iH != i2) {
                        this.a = 1;
                        if (zzrVar.k(i2, 0, this) == y5bVar) {
                            return y5bVar;
                        }
                    }
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

    @c0d(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1$1", f = "DatePicker.kt", l = {1572}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zzr zzrVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = zzrVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    zzr zzrVar = this.b;
                    int iH = zzrVar.h() + 1;
                    this.a = 1;
                    if (zzrVar.f(iH, 0, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
            } catch (IllegalArgumentException unused) {
            }
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1", f = "DatePicker.kt", l = {1584}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(zzr zzrVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = zzrVar;
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
            try {
                if (i == 0) {
                    uj50.b(obj);
                    zzr zzrVar = this.b;
                    int iH = zzrVar.h() - 1;
                    this.a = 1;
                    if (zzrVar.f(iH, 0, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
            } catch (IllegalArgumentException unused) {
            }
            return Unit.a;
        }
    }

    public static final class d implements gaj<jh0, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ long a;
        public final /* synthetic */ ytw<Boolean> b;
        public final /* synthetic */ v5b c;
        public final /* synthetic */ zzr d;
        public final /* synthetic */ IntRange e;
        public final /* synthetic */ iu5 f;
        public final /* synthetic */ h780 i;
        public final /* synthetic */ du5 v;
        public final /* synthetic */ gtc w;

        public d(long j, ytw<Boolean> ytwVar, v5b v5bVar, zzr zzrVar, IntRange intRange, iu5 iu5Var, h780 h780Var, du5 du5Var, gtc gtcVar) {
            this.a = j;
            this.b = ytwVar;
            this.c = v5bVar;
            this.d = zzrVar;
            this.e = intRange;
            this.f = iu5Var;
            this.i = h780Var;
            this.v = du5Var;
            this.w = gtcVar;
        }

        @Override // defpackage.gaj
        public final Unit invoke(jh0 jh0Var, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            String strA = xae0.a(R.string.m3c_date_picker_year_picker_pane_title, aVar2);
            boolean zM = aVar2.M(strA);
            Object objY = aVar2.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new i64(strA, 1);
                aVar2.r(objY);
            }
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarB = xa80.b(aVar3, false, (Function1) objY);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar2, dVarB);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar4);
            } else {
                aVar2.p();
            }
            hlh0.a(aVar2, i78VarA, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                j3c.a(I, aVar2, I, c1350a);
            }
            hlh0.a(aVar2, dVarC, yka.a.d);
            umz umzVar = xvc.a;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.h.h(androidx.compose.foundation.layout.j.l(aVar3, 336.0f - ote.a), 12.0f, 0.0f, 2);
            final ytw<Boolean> ytwVar = this.b;
            boolean zM2 = aVar2.M(ytwVar);
            final v5b v5bVar = this.c;
            boolean zA = zM2 | aVar2.A(v5bVar);
            final zzr zzrVar = this.d;
            boolean zM3 = zA | aVar2.M(zzrVar);
            final IntRange intRange = this.e;
            boolean zA2 = zM3 | aVar2.A(intRange);
            final iu5 iu5Var = this.f;
            boolean zM4 = zA2 | aVar2.M(iu5Var);
            Object objY2 = aVar2.y();
            if (zM4 || objY2 == c0042a) {
                Function1 function1 = new Function1() { // from class: yvc
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int iIntValue = ((Integer) obj).intValue();
                        umz umzVar2 = xvc.a;
                        ytw ytwVar2 = ytwVar;
                        ytwVar2.setValue(Boolean.valueOf(!((Boolean) ytwVar2.getValue()).booleanValue()));
                        ej5.c(v5bVar, null, null, new zvc(zzrVar, iIntValue, intRange, iu5Var, null), 3);
                        return Unit.a;
                    }
                };
                aVar2.r(function1);
                objY2 = function1;
            }
            long j = this.a;
            h780 h780Var = this.i;
            du5 du5Var = this.v;
            gtc gtcVar = this.w;
            xvc.n(dVarH, j, (Function1) objY2, h780Var, du5Var, intRange, gtcVar, aVar2, 6);
            ute.b(null, 0.0f, gtcVar.x, aVar2, 0, 3);
            aVar2.s();
            return Unit.a;
        }
    }

    public static final class e implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Function1<mse, Unit> b;
        public final /* synthetic */ androidx.compose.ui.d c;

        public e(int i, androidx.compose.ui.d dVar, Function1 function1) {
            this.a = i;
            this.b = function1;
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                int i = this.a;
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                final Function1<mse, Unit> function1 = this.b;
                if (i == 0) {
                    aVar2.N(-101264927);
                    rbn rbnVarB = j6n.b;
                    if (rbnVarB == null) {
                        rbn.a aVar3 = new rbn.a("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        m2g m2gVar = lwh0.a;
                        soa0 soa0Var = new soa0(j58.b);
                        fxz fxzVar = new fxz();
                        fxzVar.f(3.0f, 17.25f);
                        qxz.s sVar = new qxz.s(21.0f);
                        ArrayList<qxz> arrayList = fxzVar.a;
                        arrayList.add(sVar);
                        fxzVar.c(3.75f);
                        fxzVar.d(17.81f, 9.94f);
                        fxzVar.e(-3.75f, -3.75f);
                        fxzVar.d(3.0f, 17.25f);
                        fxzVar.a();
                        fxzVar.f(20.71f, 7.04f);
                        fxzVar.b(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                        fxzVar.e(-2.34f, -2.34f);
                        fxzVar.b(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        fxzVar.e(-1.83f, 1.83f);
                        fxzVar.e(3.75f, 3.75f);
                        fxzVar.e(1.83f, -1.83f);
                        fxzVar.a();
                        rbn.a.a(aVar3, arrayList, soa0Var);
                        rbnVarB = aVar3.b();
                        j6n.b = rbnVarB;
                    }
                    String strA = xae0.a(R.string.m3c_date_picker_switch_to_input_mode, aVar2);
                    boolean zM = aVar2.M(function1);
                    Object objY = aVar2.y();
                    if (zM || objY == c0042a) {
                        objY = new dwc(function1, 0);
                        aVar2.r(objY);
                    }
                    xvc.h((Function0) objY, rbnVarB, strA, this.c, false, aVar2, 0, 16);
                    aVar2.H();
                } else {
                    aVar2.N(-100967048);
                    rbn rbnVarB2 = j6n.c;
                    if (rbnVarB2 == null) {
                        rbn.a aVar4 = new rbn.a("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        m2g m2gVar2 = lwh0.a;
                        soa0 soa0Var2 = new soa0(j58.b);
                        fxz fxzVar2 = new fxz();
                        fxzVar2.f(9.0f, 11.0f);
                        fxzVar2.d(7.0f, 11.0f);
                        fxzVar2.h(2.0f);
                        fxzVar2.c(2.0f);
                        fxzVar2.h(-2.0f);
                        fxzVar2.a();
                        fxzVar2.f(13.0f, 11.0f);
                        fxzVar2.c(-2.0f);
                        fxzVar2.h(2.0f);
                        fxzVar2.c(2.0f);
                        fxzVar2.h(-2.0f);
                        fxzVar2.a();
                        fxzVar2.f(17.0f, 11.0f);
                        fxzVar2.c(-2.0f);
                        fxzVar2.h(2.0f);
                        fxzVar2.c(2.0f);
                        fxzVar2.h(-2.0f);
                        fxzVar2.a();
                        fxzVar2.f(19.0f, 4.0f);
                        fxzVar2.c(-1.0f);
                        fxzVar2.d(18.0f, 2.0f);
                        fxzVar2.c(-2.0f);
                        fxzVar2.h(2.0f);
                        fxzVar2.d(8.0f, 4.0f);
                        fxzVar2.d(8.0f, 2.0f);
                        fxzVar2.d(6.0f, 2.0f);
                        fxzVar2.h(2.0f);
                        fxzVar2.d(5.0f, 4.0f);
                        fxzVar2.b(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        fxzVar2.d(3.0f, 20.0f);
                        fxzVar2.b(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                        fxzVar2.c(14.0f);
                        fxzVar2.b(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        fxzVar2.d(21.0f, 6.0f);
                        fxzVar2.b(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        fxzVar2.a();
                        fxzVar2.f(19.0f, 20.0f);
                        fxzVar2.d(5.0f, 20.0f);
                        fxzVar2.d(5.0f, 9.0f);
                        fxzVar2.c(14.0f);
                        fxzVar2.h(11.0f);
                        fxzVar2.a();
                        rbn.a.a(aVar4, fxzVar2.a, soa0Var2);
                        rbnVarB2 = aVar4.b();
                        j6n.c = rbnVarB2;
                    }
                    String strA2 = xae0.a(R.string.m3c_date_picker_switch_to_calendar_mode, aVar2);
                    boolean zM2 = aVar2.M(function1);
                    Object objY2 = aVar2.y();
                    if (zM2 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: ewc
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(new mse(0));
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY2);
                    }
                    xvc.h((Function0) objY2, rbnVarB2, strA2, this.c, false, aVar2, 0, 16);
                    aVar2.H();
                }
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class f implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ zzr a;
        public final /* synthetic */ IntRange b;
        public final /* synthetic */ du5 c;
        public final /* synthetic */ iu5 d;
        public final /* synthetic */ Function1<Long, Unit> e;
        public final /* synthetic */ xt5 f;
        public final /* synthetic */ Long i;
        public final /* synthetic */ guc v;
        public final /* synthetic */ h780 w;
        public final /* synthetic */ gtc y;

        /* JADX WARN: Multi-variable type inference failed */
        public f(zzr zzrVar, IntRange intRange, du5 du5Var, iu5 iu5Var, Function1<? super Long, Unit> function1, xt5 xt5Var, Long l, guc gucVar, h780 h780Var, gtc gtcVar) {
            this.a = zzrVar;
            this.b = intRange;
            this.c = du5Var;
            this.d = iu5Var;
            this.e = function1;
            this.f = xt5Var;
            this.i = l;
            this.v = gucVar;
            this.w = h780Var;
            this.y = gtcVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                Object objY = aVar2.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (objY == c0042a) {
                    objY = new fwc(0);
                    aVar2.r(objY);
                }
                androidx.compose.ui.d dVarB = xa80.b(androidx.compose.ui.d.a.b, false, (Function1) objY);
                ktc ktcVar = ktc.a;
                i4d i4dVarB = j4d.b(3, 0.0f);
                goh gohVarB = a6w.b(z5w.c, aVar2);
                boolean zM = aVar2.M(i4dVarB);
                zzr zzrVar = this.a;
                boolean zM2 = zM | aVar2.M(zzrVar);
                Object objY2 = aVar2.y();
                if (zM2 || objY2 == c0042a) {
                    t4a0 t4a0Var = new t4a0(new ltc(new vzr(zzrVar, z4a0.a.a)), i4dVarB, gohVarB);
                    aVar2.r(t4a0Var);
                    objY2 = t4a0Var;
                }
                l5f0 l5f0Var = (l5f0) objY2;
                boolean zA = aVar2.A(this.b) | aVar2.A(this.c) | aVar2.M(this.d) | aVar2.M(this.e) | aVar2.M(this.f) | aVar2.M(this.i) | aVar2.A(this.v) | aVar2.M(this.w);
                final gtc gtcVar = this.y;
                boolean zM3 = zA | aVar2.M(gtcVar);
                Object objY3 = aVar2.y();
                if (zM3 || objY3 == c0042a) {
                    final IntRange intRange = this.b;
                    final du5 du5Var = this.c;
                    final iu5 iu5Var = this.d;
                    final Function1<Long, Unit> function1 = this.e;
                    final xt5 xt5Var = this.f;
                    final Long l = this.i;
                    final guc gucVar = this.v;
                    final h780 h780Var = this.w;
                    Function1 function2 = new Function1() { // from class: gwc
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            umz umzVar = xvc.a;
                            IntRange intRange2 = intRange;
                            szr.f((szr) obj, ((intRange2.b - intRange2.a) + 1) * 12, null, new op8(72599078, new jwc(du5Var, iu5Var, function1, xt5Var, l, gucVar, h780Var, gtcVar), true), 6);
                            return Unit.a;
                        }
                    };
                    aVar2.r(function2);
                    objY3 = function2;
                }
                aur.b(dVarB, zzrVar, null, null, null, l5f0Var, false, null, (Function1) objY3, aVar2, 0, 444);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1", f = "DatePicker.kt", l = {1754}, m = "invokeSuspend")
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;
        public final /* synthetic */ Function1<Long, Unit> c;
        public final /* synthetic */ du5 d;
        public final /* synthetic */ IntRange e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(zzr zzrVar, Function1<? super Long, Unit> function1, du5 du5Var, IntRange intRange, v1b<? super g> v1bVar) {
            super(2, v1bVar);
            this.b = zzrVar;
            this.c = function1;
            this.d = du5Var;
            this.e = intRange;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new g(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                umz umzVar = xvc.a;
                zzr zzrVar = this.b;
                Object objCollect = n95.c(new lvc(zzrVar)).collect(new twc(zzrVar, this.c, this.d, this.e), this);
                if (objCollect != y5bVar) {
                    objCollect = Unit.a;
                }
                if (objCollect == y5bVar) {
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

    public static final class h implements gaj<x0g0, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ String a;

        public h(String str) {
            this.a = str;
        }

        @Override // defpackage.gaj
        public final Unit invoke(x0g0 x0g0Var, androidx.compose.runtime.a aVar, Integer num) {
            x0g0 x0g0Var2 = x0g0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(x0g0Var2) : aVar2.A(x0g0Var2) ? 4 : 2;
            }
            if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                r0g0.a(x0g0Var2, null, null, 0.0f, null, 0L, 0L, pp8.b(1905952188, new kwc(this.a), aVar2), aVar2, (iIntValue & 14) | 805306368, 255);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class i implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> a;
        public final /* synthetic */ androidx.compose.ui.d b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ rbn d;
        public final /* synthetic */ String e;

        public i(Function0<Unit> function0, androidx.compose.ui.d dVar, boolean z, rbn rbnVar, String str) {
            this.a = function0;
            this.b = dVar;
            this.c = z;
            this.d = rbnVar;
            this.e = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                c6n.a(this.a, this.b, this.c, null, null, pp8.b(-1301085432, new lwc(this.d, this.e), aVar2), aVar2, 1572864, 56);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class j implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ gtc b;

        public j(String str, gtc gtcVar) {
            this.a = str;
            this.b = gtcVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                final String str = this.a;
                boolean zM = aVar2.M(str);
                Object objY = aVar2.y();
                if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new Function1() { // from class: mwc
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            pb80 pb80Var = (pb80) obj;
                            lb80.d(pb80Var, 0);
                            lb80.c(pb80Var, str);
                            return Unit.a;
                        }
                    };
                    aVar2.r(objY);
                }
                lkf0.d(str, xa80.b(androidx.compose.ui.d.a.b, false, (Function1) objY), this.b.f, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262136);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class k implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ boolean d;

        public k(Function0<Unit> function0, boolean z, Function0<Unit> function1, boolean z2) {
            this.a = function0;
            this.b = z;
            this.c = function1;
            this.d = z2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar2, 0);
                int I = aVar2.I();
                ne00 ne00VarO = aVar2.o();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar2, androidx.compose.ui.d.a.b);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                if (aVar2.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar2.D();
                if (aVar2.g()) {
                    aVar2.F(aVar3);
                } else {
                    aVar2.p();
                }
                hlh0.a(aVar2, d160VarA, yka.a.f);
                hlh0.a(aVar2, ne00VarO, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                    j3c.a(I, aVar2, I, c1350a);
                }
                hlh0.a(aVar2, dVarC, yka.a.d);
                rbn rbnVarB = i6n.a;
                if (rbnVarB == null) {
                    rbn.a aVar4 = new rbn.a("AutoMirrored.Filled.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                    m2g m2gVar = lwh0.a;
                    soa0 soa0Var = new soa0(j58.b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new qxz.f(15.41f, 16.59f));
                    arrayList.add(new qxz.e(10.83f, 12.0f));
                    arrayList.add(new qxz.m(4.58f, -4.59f));
                    arrayList.add(new qxz.e(14.0f, 6.0f));
                    arrayList.add(new qxz.m(-6.0f, 6.0f));
                    arrayList.add(new qxz.m(6.0f, 6.0f));
                    arrayList.add(new qxz.m(1.41f, -1.41f));
                    arrayList.add(qxz.b.c);
                    rbn.a.a(aVar4, arrayList, soa0Var);
                    rbnVarB = aVar4.b();
                    i6n.a = rbnVarB;
                }
                xvc.h(this.a, rbnVarB, xae0.a(R.string.m3c_date_picker_switch_to_previous_month, aVar2), null, this.b, aVar2, 0, 8);
                rbn rbnVarB2 = i6n.b;
                if (rbnVarB2 == null) {
                    rbn.a aVar5 = new rbn.a("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                    m2g m2gVar2 = lwh0.a;
                    soa0 soa0Var2 = new soa0(j58.b);
                    ArrayList arrayList2 = new ArrayList(32);
                    arrayList2.add(new qxz.f(8.59f, 16.59f));
                    arrayList2.add(new qxz.e(13.17f, 12.0f));
                    arrayList2.add(new qxz.e(8.59f, 7.41f));
                    arrayList2.add(new qxz.e(10.0f, 6.0f));
                    arrayList2.add(new qxz.m(6.0f, 6.0f));
                    arrayList2.add(new qxz.m(-6.0f, 6.0f));
                    arrayList2.add(new qxz.m(-1.41f, -1.41f));
                    arrayList2.add(qxz.b.c);
                    rbn.a.a(aVar5, arrayList2, soa0Var2);
                    rbnVarB2 = aVar5.b();
                    i6n.b = rbnVarB2;
                }
                xvc.h(this.c, rbnVarB2, xae0.a(R.string.m3c_date_picker_switch_to_next_month, aVar2), null, this.d, aVar2, 0, 8);
                aVar2.s();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class l implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ gtc b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;

        public l(String str, gtc gtcVar, boolean z, boolean z2, boolean z3) {
            this.a = str;
            this.b = gtcVar;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            long j;
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarG = androidx.compose.foundation.layout.j.g(aVar3, 1.0f);
                aiv aivVarC = g75.c(ht.a.e, false);
                int I = aVar2.I();
                ne00 ne00VarO = aVar2.o();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar2, dVarG);
                yka.k.getClass();
                tsr.a aVar4 = yka.a.b;
                if (aVar2.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar2.D();
                if (aVar2.g()) {
                    aVar2.F(aVar4);
                } else {
                    aVar2.p();
                }
                hlh0.a(aVar2, aivVarC, yka.a.f);
                hlh0.a(aVar2, ne00VarO, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                    j3c.a(I, aVar2, I, c1350a);
                }
                hlh0.a(aVar2, dVarC, yka.a.d);
                Object objY = aVar2.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new owc();
                    aVar2.r(objY);
                }
                androidx.compose.ui.d dVarA = xa80.a(aVar3, (Function1) objY);
                gtc gtcVar = this.b;
                boolean z = this.d;
                boolean z2 = this.e;
                if (z && z2) {
                    j = gtcVar.j;
                } else if (z && !z2) {
                    j = gtcVar.k;
                } else if (this.c && z2) {
                    j = gtcVar.i;
                } else {
                    j = z2 ? gtcVar.g : gtcVar.h;
                }
                lkf0.d(this.a, dVarA, ((j58) hw90.a(j, a6w.b(z5w.c, aVar2), null, aVar2, 0, 12).getValue()).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 261112);
                aVar2.s();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class m implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ du5 a;
        public final /* synthetic */ long b;
        public final /* synthetic */ IntRange c;
        public final /* synthetic */ androidx.compose.ui.d d;
        public final /* synthetic */ gtc e;
        public final /* synthetic */ Function1<Integer, Unit> f;
        public final /* synthetic */ h780 i;

        /* JADX WARN: Multi-variable type inference failed */
        public m(du5 du5Var, long j, IntRange intRange, androidx.compose.ui.d dVar, gtc gtcVar, Function1<? super Integer, Unit> function1, h780 h780Var) {
            this.a = du5Var;
            this.b = j;
            this.c = intRange;
            this.d = dVar;
            this.e = gtcVar;
            this.f = function1;
            this.i = h780Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                du5 du5Var = this.a;
                final int i = du5Var.g(du5Var.h()).a;
                final int i2 = du5Var.f(this.b).a;
                IntRange intRange = this.c;
                zvr zvrVarA = dwr.a(Math.max(0, (i2 - intRange.a) - 3), 2, aVar2);
                p7l.a aVar3 = new p7l.a(3);
                final gtc gtcVar = this.e;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(this.d, gtcVar.a, zk40.a);
                kw0.i iVar = new kw0.i(xvc.d, true, new hw0());
                boolean zA = aVar2.A(du5Var) | aVar2.A(intRange) | aVar2.d(i2) | aVar2.d(i) | aVar2.M(this.f) | aVar2.M(this.i) | aVar2.M(gtcVar);
                Object objY = aVar2.y();
                if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                    final IntRange intRange2 = this.c;
                    final du5 du5Var2 = this.a;
                    final Function1<Integer, Unit> function1 = this.f;
                    final h780 h780Var = this.i;
                    Function1 function2 = new Function1() { // from class: pwc
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int size;
                            lvr lvrVar = (lvr) obj;
                            IntRange intRange3 = intRange2;
                            intRange3.getClass();
                            if (intRange3 instanceof Collection) {
                                size = ((Collection) intRange3).size();
                            } else {
                                Iterator<Integer> it = intRange3.iterator();
                                int i3 = 0;
                                while (((mwo) it).c) {
                                    ((zvo) it).next();
                                    i3++;
                                    if (i3 < 0) {
                                        b.p();
                                        throw null;
                                    }
                                }
                                size = i3;
                            }
                            lvr.g(lvrVar, size, null, new op8(674613074, new rwc(intRange3, du5Var2, i2, i, function1, h780Var, gtcVar), true), 14);
                            return Unit.a;
                        }
                    };
                    aVar2.r(function2);
                    objY = function2;
                }
                iur.a(aVar3, dVarB, zvrVarA, null, iVar, kw0.f, null, false, null, (Function1) objY, aVar2, 1769472, 0, 920);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final void a(final androidx.compose.ui.d dVar, final Function2 function2, final Function2 function3, final Function2 function4, final gtc gtcVar, final imf0 imf0Var, final float f2, final op8 op8Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        Function2 function5;
        Function2 function6;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(1539132883);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.A(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function5 = function3;
            i3 |= bVarI.A(function5) ? 256 : 128;
        } else {
            function5 = function3;
        }
        if ((i2 & 3072) == 0) {
            function6 = function4;
            i3 |= bVarI.A(function6) ? 2048 : 1024;
        } else {
            function6 = function4;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.M(gtcVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bVarI.M(imf0Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= bVarI.c(f2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= bVarI.A(op8Var) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (bVarI.q(i4 & 1, (i4 & 4793491) != 4793490)) {
            androidx.compose.ui.d dVarV = androidx.compose.foundation.layout.j.v(dVar, dxc.d, 0.0f, 0.0f, 14);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new quc();
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(xa80.b(dVarV, false, (Function1) objY), gtcVar.a, zk40.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d(function2, gtcVar.b, gtcVar.c, f2, pp8.b(-1658370654, new pvc(function5, function6, function2, gtcVar, imf0Var), bVarI), bVarI, (i4 & 112) | 196614 | (57344 & (i4 >> 6)));
            bVar = bVarI;
            w1i.a(14 & (i4 >> 21), op8Var, bVar, true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ruc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xvc.a(dVar, function2, function3, function4, gtcVar, imf0Var, f2, op8Var, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final fxc fxcVar, androidx.compose.ui.d dVar, guc gucVar, final gtc gtcVar, Function2 function2, Function2 function3, final boolean z, b5i b5iVar, androidx.compose.runtime.a aVar, final int i2) {
        final androidx.compose.ui.d dVar2;
        final guc gucVar2;
        final Function2 function4;
        final Function2 function5;
        final b5i b5iVar2;
        guc gucVar3;
        int i3;
        Function2 function2B;
        Function2 function2B2;
        b5i b5iVar3;
        androidx.compose.ui.d dVar3;
        op8 op8VarB;
        androidx.compose.runtime.b bVarI = aVar.i(1105472031);
        int i4 = i2 | (bVarI.M(fxcVar) ? 4 : 2) | 176 | (bVarI.M(gtcVar) ? 2048 : 1024) | 12804096;
        if (bVarI.q(i4 & 1, (4793491 & i4) != 4793490)) {
            bVarI.A0();
            int i5 = i2 & 1;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i5 == 0 || bVarI.h0()) {
                Object objY = bVarI.y();
                if (objY == c0042a) {
                    ktc ktcVar = ktc.a;
                    objY = new huc();
                    bVarI.r(objY);
                }
                gucVar3 = (guc) objY;
                i3 = i4 & (-897);
                function2B = pp8.b(1655706771, new qvc(fxcVar, gtcVar), bVarI);
                function2B2 = pp8.b(1439279037, new rvc(fxcVar, gucVar3, gtcVar), bVarI);
                Object objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new b5i();
                    bVarI.r(objY2);
                }
                b5iVar3 = (b5i) objY2;
                dVar3 = androidx.compose.ui.d.a.b;
            } else {
                bVarI.G();
                i3 = i4 & (-897);
                dVar3 = dVar;
                gucVar3 = gucVar;
                function2B = function2;
                function2B2 = function3;
                b5iVar3 = b5iVar;
            }
            int i6 = i3;
            bVarI.Y();
            boolean zM = bVarI.M(fxcVar.b);
            Object objY3 = bVarI.y();
            if (zM || objY3 == c0042a) {
                objY3 = fxcVar.c;
                bVarI.r(objY3);
            }
            du5 du5Var = (du5) objY3;
            if (z) {
                bVarI.N(-690551113);
                op8VarB = pp8.b(-1483431603, new tvc(fxcVar, gtcVar), bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(-690163489);
                bVarI.X(false);
                op8VarB = null;
            }
            op8 op8Var = op8VarB;
            Function2 function6 = function2B;
            guc gucVar4 = gucVar3;
            b5i b5iVar4 = b5iVar3;
            Function2 function7 = function2B2;
            androidx.compose.ui.d dVar4 = dVar3;
            a(dVar4, function6, function7, op8Var, gtcVar, gah0.a(dxc.r, bVarI), dxc.p, pp8.b(-1346903698, new wvc(fxcVar, du5Var, gucVar4, gtcVar, b5iVar4), bVarI), bVarI, 14156214 | (57344 & (i6 << 3)));
            function5 = function7;
            gucVar2 = gucVar4;
            function4 = function6;
            dVar2 = dVar4;
            b5iVar2 = b5iVar4;
        } else {
            bVarI.G();
            dVar2 = dVar;
            gucVar2 = gucVar;
            function4 = function2;
            function5 = function3;
            b5iVar2 = b5iVar;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(dVar2, gucVar2, gtcVar, function4, function5, z, b5iVar2, i2) { // from class: ouc
                public final /* synthetic */ d b;
                public final /* synthetic */ guc c;
                public final /* synthetic */ gtc d;
                public final /* synthetic */ Function2 e;
                public final /* synthetic */ Function2 f;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ b5i v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1572865);
                    xvc.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0296  */
    /* JADX WARN: Code duplicated, block: B:70:0x0190  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01db  */
    /* JADX WARN: Code duplicated, block: B:85:0x0231  */
    /* JADX WARN: Code duplicated, block: B:86:0x0235  */
    /* JADX WARN: Code duplicated, block: B:91:0x0250  */
    /* JADX WARN: Code duplicated, block: B:94:0x0277  */
    /* JADX WARN: Code duplicated, block: B:95:0x027b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final Long l2, final long j2, final Function1<? super Long, Unit> function1, final Function1<? super Long, Unit> function2, final du5 du5Var, final IntRange intRange, final guc gucVar, final h780 h780Var, final gtc gtcVar, androidx.compose.runtime.a aVar, final int i2) {
        yka.a.b bVar;
        String strA;
        boolean zA;
        Object objY;
        boolean zA2;
        Object objY2;
        boolean zM;
        Object objY3;
        int I;
        int I2;
        androidx.compose.runtime.b bVarI = aVar.i(-434467002);
        int i3 = i2 | (bVarI.M(l2) ? 4 : 2) | (bVarI.e(j2) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(du5Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(intRange) ? 131072 : 65536) | (bVarI.M(gucVar) ? 1048576 : 524288) | (bVarI.M(h780Var) ? 8388608 : 4194304) | (bVarI.M(gtcVar) ? 67108864 : 33554432);
        if (bVarI.q(i3 & 1, (38347923 & i3) != 38347922)) {
            iu5 iu5VarF = du5Var.f(j2);
            int i4 = (((iu5VarF.a - intRange.a) * 12) + iu5VarF.b) - 1;
            if (i4 < 0) {
                i4 = 0;
            }
            final zzr zzrVarA = e0s.a(i4, 2, bVarI);
            Integer numValueOf = Integer.valueOf(i4);
            boolean zM2 = bVarI.M(zzrVarA) | bVarI.d(i4);
            Object objY4 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM2 || objY4 == c0042a) {
                objY4 = new a(i4, null, zzrVarA);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, numValueOf, (Function2) objY4);
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY5);
            }
            final v5b v5bVar = (v5b) objY5;
            Object[] objArr = new Object[0];
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                objY6 = new bvc();
                bVarI.r(objY6);
            }
            ytw ytwVar = (ytw) o350.e(objArr, (Function0) objY6, bVarI, 48);
            kw0.k kVar = kw0.c;
            n54.a aVar2 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar2, bVarI, 0);
            int I3 = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, aVar3);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                bVar = bVar2;
            } else {
                bVar = bVar2;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(I3))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.h.h(aVar3, 12.0f, 0.0f, 2);
                boolean zE = zzrVarA.e();
                boolean zD = zzrVarA.d();
                boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                strA = gucVar.a(Long.valueOf(j2), du5Var.a);
                if (strA == null) {
                    strA = "-";
                }
                String str = strA;
                zA = bVarI.A(v5bVar) | bVarI.M(zzrVarA);
                objY = bVarI.y();
                if (zA || objY == c0042a) {
                    objY = new Function0() { // from class: cvc
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ej5.c(v5bVar, null, null, new xvc.b(zzrVarA, null), 3);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                Function0 function0 = (Function0) objY;
                zA2 = bVarI.A(v5bVar) | bVarI.M(zzrVarA);
                objY2 = bVarI.y();
                if (zA2 || objY2 == c0042a) {
                    objY2 = new Function0() { // from class: evc
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ej5.c(v5bVar, null, null, new xvc.c(zzrVarA, null), 3);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                Function0 function3 = (Function0) objY2;
                zM = bVarI.M(ytwVar);
                objY3 = bVarI.y();
                if (zM || objY3 == c0042a) {
                    objY3 = new k4w(ytwVar, 2);
                    bVarI.r(objY3);
                }
                int i5 = i3 & 234881024;
                yka.a.b bVar3 = bVar;
                j(dVarH, zE, zD, zBooleanValue, str, function0, function3, (Function0) objY3, gtcVar, bVarI, i5 | 6);
                bVarI = bVarI;
                aiv aivVarC = g75.c(ht.a.a, false);
                I = bVarI.I();
                ne00 ne00VarS2 = bVarI.S();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, aVar3);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, bVar3);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                    n30.a(I, bVarI, I, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                androidx.compose.ui.d dVarH2 = androidx.compose.foundation.layout.h.h(aVar3, 12.0f, 0.0f, 2);
                i78 i78VarA2 = g78.a(kVar, aVar2, bVarI, 0);
                I2 = bVarI.I();
                ne00 ne00VarS3 = bVarI.S();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarH2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, bVar3);
                hlh0.a(bVarI, ne00VarS3, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I2))) {
                    n30.a(I2, bVarI, I2, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                l(gtcVar, du5Var, bVarI, ((i3 >> 24) & 14) | ((i3 >> 9) & 112));
                g(zzrVarA, l2, function1, function2, du5Var, intRange, gucVar, h780Var, gtcVar, bVarI, ((i3 << 3) & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128) | i5);
                bVarI.X(true);
                z5w z5wVar = z5w.c;
                goh gohVarB = a6w.b(z5wVar, bVarI);
                goh gohVarB2 = a6w.b(z5w.d, bVarI);
                goh gohVarB3 = a6w.b(z5wVar, bVarI);
                hh0.e(((Boolean) ytwVar.getValue()).booleanValue(), ls7.b(aVar3), androidx.compose.animation.f.e(gohVarB3, null, 14).b(new t9g(new ntg0(new o8h(0.6f, gohVarB), (xy90) null, (x57) null, (wy60) null, (LinkedHashMap) null, 62))), androidx.compose.animation.f.m(gohVarB3, null, 14).b(androidx.compose.animation.f.g(gohVarB2, 2)), null, pp8.b(1193716082, new d(j2, ytwVar, v5bVar, zzrVarA, intRange, iu5VarF, h780Var, du5Var, gtcVar), bVarI), bVarI, 196656, 16);
                bVarI.X(true);
                bVarI.X(true);
            }
            n30.a(I3, bVarI, I3, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            androidx.compose.ui.d dVarH3 = androidx.compose.foundation.layout.h.h(aVar3, 12.0f, 0.0f, 2);
            boolean zE2 = zzrVarA.e();
            boolean zD2 = zzrVarA.d();
            boolean zBooleanValue2 = ((Boolean) ytwVar.getValue()).booleanValue();
            strA = gucVar.a(Long.valueOf(j2), du5Var.a);
            if (strA == null) {
                strA = "-";
            }
            String str2 = strA;
            zA = bVarI.A(v5bVar) | bVarI.M(zzrVarA);
            objY = bVarI.y();
            if (zA) {
                objY = new Function0() { // from class: cvc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ej5.c(v5bVar, null, null, new xvc.b(zzrVarA, null), 3);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                objY = new Function0() { // from class: cvc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ej5.c(v5bVar, null, null, new xvc.b(zzrVarA, null), 3);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            Function0 function4 = (Function0) objY;
            zA2 = bVarI.A(v5bVar) | bVarI.M(zzrVarA);
            objY2 = bVarI.y();
            if (zA2) {
                objY2 = new Function0() { // from class: evc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ej5.c(v5bVar, null, null, new xvc.c(zzrVarA, null), 3);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            } else {
                objY2 = new Function0() { // from class: evc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ej5.c(v5bVar, null, null, new xvc.c(zzrVarA, null), 3);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            Function0 function5 = (Function0) objY2;
            zM = bVarI.M(ytwVar);
            objY3 = bVarI.y();
            if (zM) {
                objY3 = new k4w(ytwVar, 2);
                bVarI.r(objY3);
            } else {
                objY3 = new k4w(ytwVar, 2);
                bVarI.r(objY3);
            }
            int i6 = i3 & 234881024;
            yka.a.b bVar4 = bVar;
            j(dVarH3, zE2, zD2, zBooleanValue2, str2, function4, function5, (Function0) objY3, gtcVar, bVarI, i6 | 6);
            bVarI = bVarI;
            aiv aivVarC2 = g75.c(ht.a.a, false);
            I = bVarI.I();
            ne00 ne00VarS4 = bVarI.S();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar4);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S) {
                n30.a(I, bVarI, I, c1350a);
            } else {
                n30.a(I, bVarI, I, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar2);
            androidx.compose.ui.d dVarH4 = androidx.compose.foundation.layout.h.h(aVar3, 12.0f, 0.0f, 2);
            i78 i78VarA3 = g78.a(kVar, aVar2, bVarI, 0);
            I2 = bVarI.I();
            ne00 ne00VarS5 = bVarI.S();
            androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(bVarI, dVarH4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA3, bVar4);
            hlh0.a(bVarI, ne00VarS5, dVar);
            if (bVarI.S) {
                n30.a(I2, bVarI, I2, c1350a);
            } else {
                n30.a(I2, bVarI, I2, c1350a);
            }
            hlh0.a(bVarI, dVarC5, cVar2);
            l(gtcVar, du5Var, bVarI, ((i3 >> 24) & 14) | ((i3 >> 9) & 112));
            g(zzrVarA, l2, function1, function2, du5Var, intRange, gucVar, h780Var, gtcVar, bVarI, ((i3 << 3) & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128) | i6);
            bVarI.X(true);
            z5w z5wVar2 = z5w.c;
            goh gohVarB4 = a6w.b(z5wVar2, bVarI);
            goh gohVarB5 = a6w.b(z5w.d, bVarI);
            goh gohVarB6 = a6w.b(z5wVar2, bVarI);
            hh0.e(((Boolean) ytwVar.getValue()).booleanValue(), ls7.b(aVar3), androidx.compose.animation.f.e(gohVarB6, null, 14).b(new t9g(new ntg0(new o8h(0.6f, gohVarB4), (xy90) null, (x57) null, (wy60) null, (LinkedHashMap) null, 62))), androidx.compose.animation.f.m(gohVarB6, null, 14).b(androidx.compose.animation.f.g(gohVarB5, 2)), null, pp8.b(1193716082, new d(j2, ytwVar, v5bVar, zzrVarA, intRange, iu5VarF, h780Var, du5Var, gtcVar), bVarI), bVarI, 196656, 16);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(l2, j2, function1, function2, du5Var, intRange, gucVar, h780Var, gtcVar, i2) { // from class: fvc
                public final /* synthetic */ Long a;
                public final /* synthetic */ long b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ du5 e;
                public final /* synthetic */ IntRange f;
                public final /* synthetic */ guc i;
                public final /* synthetic */ h780 v;
                public final /* synthetic */ gtc w;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    xvc.c(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final Function2 function2, final long j2, final long j3, final float f2, final op8 op8Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        boolean z;
        androidx.compose.runtime.b bVarI = aVar.i(2020490761);
        int i4 = i2 & 6;
        androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
        if (i4 == 0) {
            i3 = (bVarI.M(aVar2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.A(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.e(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.e(j3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.c(f2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bVarI.A(op8Var) ? 131072 : 65536;
        }
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.j.g(aVar2, 1.0f).n(function2 != null ? androidx.compose.foundation.layout.j.b(aVar2, 0.0f, f2, 1) : aVar2);
            i78 i78VarA = g78.a(kw0.g, ht.a.m, bVarI, 6);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarN);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (function2 != null) {
                bVarI.N(396894187);
                z = true;
                i730.a(j2, gah0.a(dxc.t, bVarI), pp8.b(1344395458, new awc(function2), bVarI), bVarI, ((i3 >> 6) & 14) | 384);
                bVarI.X(false);
            } else {
                z = true;
                bVarI.N(397163267);
                bVarI.X(false);
            }
            hna.a(tp0.a(j3, iza.a), op8Var, bVarI, ((i3 >> 12) & 112) | 8);
            bVarI.X(z);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: tuc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xvc.d(function2, j2, j3, f2, op8Var, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final String str, final boolean z, final Function0 function0, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final String str2, final gtc gtcVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        boolean z6;
        long j2;
        twd0 twd0VarC;
        androidx.compose.runtime.b bVarI = aVar.i(-945355136);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i2 & 48;
        androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
        if (i4 == 0) {
            i3 |= bVarI.M(aVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bVarI.b(z3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= bVarI.b(z4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            z6 = z5;
            i3 |= bVarI.b(z6) ? 8388608 : 4194304;
        } else {
            z6 = z5;
        }
        if ((100663296 & i2) == 0) {
            i3 |= bVarI.M(str2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= bVarI.M(gtcVar) ? 536870912 : 268435456;
        }
        if (bVarI.q(i3 & 1, (306783379 & i3) != 306783378)) {
            boolean z7 = (234881024 & i3) == 67108864;
            Object objY = bVarI.y();
            if (z7 || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new kuc(str2, 0);
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarB = xa80.b(aVar2, true, (Function1) objY);
            qx80 qx80VarB = xy80.b(dxc.f, bVarI);
            int i5 = i3 >> 6;
            if (z) {
                j2 = z3 ? gtcVar.r : gtcVar.s;
            } else {
                j2 = j58.l;
            }
            long j3 = j2;
            if (z2) {
                bVarI.N(-1319856736);
                twd0VarC = hw90.a(j3, a6w.b(z5w.c, bVarI), null, bVarI, 0, 12);
                bVarI.X(false);
            } else {
                bVarI.N(-1319630064);
                twd0VarC = androidx.compose.runtime.m.c(new j58(j3), bVarI);
                bVarI.X(false);
            }
            ihe0.b(z, function0, dVarB, z3, qx80VarB, ((j58) twd0VarC.getValue()).a, 0.0f, (!z4 || z) ? null : m35.a(dxc.m, gtcVar.u), null, pp8.b(1126347158, new cwc(str, gtcVar, z4, z, z6, z3), bVarI), bVarI, i5 & 7294, 1472);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: luc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xvc.e(str, z, function0, z2, z3, z4, z5, str2, gtcVar, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final androidx.compose.ui.d dVar, final int i2, final Function1<? super mse, Unit> function1, final gtc gtcVar, androidx.compose.runtime.a aVar, final int i3) {
        androidx.compose.runtime.b bVarI = aVar.i(-1461252485);
        int i4 = (bVarI.d(i2) ? 32 : 16) | i3 | (bVarI.A(function1) ? 256 : 128) | (bVarI.M(gtcVar) ? 2048 : 1024);
        if (bVarI.q(i4 & 1, (i4 & 1171) != 1170)) {
            hna.a(tp0.a(gtcVar.c, iza.a), pp8.b(-1734512197, new e(i2, dVar, function1), bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i2, function1, gtcVar, i3) { // from class: xuc
                public final /* synthetic */ int b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ gtc d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    xvc.f(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(zzr zzrVar, final Long l2, final Function1<? super Long, Unit> function1, final Function1<? super Long, Unit> function2, final du5 du5Var, final IntRange intRange, final guc gucVar, final h780 h780Var, final gtc gtcVar, androidx.compose.runtime.a aVar, final int i2) {
        Object gVar;
        final zzr zzrVar2 = zzrVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1994757941);
        int i3 = i2 | (bVarI.M(zzrVar2) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(l2) ? 32 : 16;
        }
        int i4 = i3 | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(du5Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(intRange) ? 131072 : 65536) | (bVarI.M(gucVar) ? 1048576 : 524288) | (bVarI.M(h780Var) ? 8388608 : 4194304) | (bVarI.M(gtcVar) ? 67108864 : 33554432);
        if (bVarI.q(i4 & 1, (38347923 & i4) != 38347922)) {
            xt5 xt5VarH = du5Var.h();
            boolean zM = bVarI.M(intRange);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = du5Var.e(intRange.a, 1);
                bVarI.r(objY);
            }
            lkf0.a(gah0.a(dxc.h, bVarI), pp8.b(1504086906, new f(zzrVar2, intRange, du5Var, (iu5) objY, function1, xt5VarH, l2, gucVar, h780Var, gtcVar), bVarI), bVarI, 48);
            boolean zA = ((i4 & 14) == 4) | ((i4 & 7168) == 2048) | bVarI.A(du5Var) | bVarI.A(intRange);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                zzrVar2 = zzrVar;
                gVar = new g(zzrVar2, function2, du5Var, intRange, null);
                bVarI.r(gVar);
            } else {
                gVar = objY2;
                zzrVar2 = zzrVar;
            }
            xvf.e(bVarI, zzrVar2, (Function2) gVar);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ivc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xvc.g(zzrVar2, l2, function1, function2, du5Var, intRange, gucVar, h780Var, gtcVar, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(final Function0<Unit> function0, final rbn rbnVar, final String str, androidx.compose.ui.d dVar, boolean z, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        final androidx.compose.ui.d dVar2;
        int i4;
        boolean z2;
        int i5;
        final boolean z3;
        androidx.compose.runtime.b bVarI = aVar.i(-368059805);
        int i6 = i2 | (bVarI.A(function0) ? 4 : 2) | (bVarI.M(rbnVar) ? 32 : 16) | (bVarI.M(str) ? 256 : 128);
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = i6 | 3072;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i4 = i6 | (bVarI.M(dVar2) ? 2048 : 1024);
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i5 = i4 | 24576;
            z2 = z;
        } else {
            z2 = z;
            i5 = i4 | (bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        }
        if (bVarI.q(i5 & 1, (i5 & 9363) != 9362)) {
            androidx.compose.ui.d dVar3 = i7 != 0 ? androidx.compose.ui.d.a.b : dVar2;
            if (i8 != 0) {
                z2 = true;
            }
            boolean z4 = z2;
            r0g0.b(i0g0.a(1, 0.0f, bVarI, 390, 2), pp8.b(-456272562, new h(str), bVarI), r0g0.d(0, 7, bVarI, false), null, null, false, pp8.b(-1124908186, new i(function0, dVar3, z4, rbnVar, str), bVarI), bVarI, 100663344, 248);
            dVar2 = dVar3;
            z3 = z4;
        } else {
            bVarI.G();
            z3 = z2;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(rbnVar, str, dVar2, z3, i2, i3) { // from class: suc
                public final /* synthetic */ rbn b;
                public final /* synthetic */ String c;
                public final /* synthetic */ d d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ int f;

                {
                    this.f = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    xvc.h(this.a, this.b, this.c, this.d, this.e, (a) obj, iA, this.f);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0262  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(final iu5 iu5Var, final Function1<? super Long, Unit> function1, final long j2, final Long l2, final Long l3, final o780 o780Var, final guc gucVar, final h780 h780Var, final gtc gtcVar, final Locale locale, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVar;
        androidx.compose.ui.d dVarC;
        androidx.compose.runtime.b bVar2;
        androidx.compose.ui.d.a aVar2;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        boolean z;
        boolean z2;
        boolean z3;
        final Function1<? super Long, Unit> function2 = function1;
        guc gucVar2 = gucVar;
        Locale locale2 = locale;
        androidx.compose.runtime.b bVarI = aVar.i(-333300603);
        int i3 = (bVarI.M(iu5Var) ? 4 : 2) | i2 | (bVarI.A(function2) ? 32 : 16) | (bVarI.e(j2) ? 256 : 128) | (bVarI.M(l2) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.M(l3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bVarI.M(o780Var) ? 131072 : 65536;
        }
        int i4 = i3 | (bVarI.M(gucVar2) ? 1048576 : 524288) | (bVarI.M(h780Var) ? 8388608 : 4194304) | (bVarI.M(gtcVar) ? 67108864 : 33554432) | (bVarI.A(locale2) ? 536870912 : 268435456);
        if (bVarI.q(i4 & 1, (i4 & 306783379) != 306783378)) {
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (o780Var != null) {
                bVarI.N(606579709);
                boolean z4 = ((i4 & 458752) == 131072) | ((i4 & 234881024) == 67108864);
                Object objY = bVarI.y();
                if (z4 || objY == c0042a2) {
                    objY = new Function1() { // from class: mvc
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            lza lzaVar = (lza) obj;
                            long j3 = gtcVar.v;
                            umz umzVar = byc.a;
                            float fC1 = lzaVar.C1(48.0f);
                            float fC2 = lzaVar.C1(48.0f);
                            float fC3 = lzaVar.C1(dxc.k);
                            float f2 = (fC2 - fC3) / 2.0f;
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - (7.0f * fC1)) / 7.0f;
                            o780 o780Var2 = o780Var;
                            long j4 = o780Var2.a;
                            int i5 = (int) (j4 >> 32);
                            int i6 = (int) (j4 & 4294967295L);
                            long j5 = o780Var2.b;
                            int i7 = (int) (j5 >> 32);
                            int i8 = (int) (j5 & 4294967295L);
                            float f3 = fC1 + fIntBitsToFloat;
                            float f4 = fIntBitsToFloat / 2.0f;
                            float fIntBitsToFloat2 = (i5 * f3) + (o780Var2.c ? fC1 / 2.0f : 0.0f) + f4;
                            float f5 = (i6 * fC2) + f2;
                            float f6 = i7 * f3;
                            if (o780Var2.d) {
                                fC1 /= 2.0f;
                            }
                            float fIntBitsToFloat3 = f6 + fC1 + f4;
                            float f7 = (i8 * fC2) + f2;
                            boolean z5 = lzaVar.getLayoutDirection() == asr.b;
                            if (z5) {
                                fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - fIntBitsToFloat2;
                                fIntBitsToFloat3 = Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - fIntBitsToFloat3;
                            }
                            float fIntBitsToFloat4 = fIntBitsToFloat3;
                            tcf.m0(lzaVar, j3, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(i6 == i8 ? fIntBitsToFloat4 - fIntBitsToFloat2 : z5 ? -fIntBitsToFloat2 : Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fC3)) & 4294967295L), 0.0f, null, 0, 120);
                            if (i6 != i8) {
                                for (int i9 = (i8 - i6) - 1; i9 > 0; i9--) {
                                    tcf.m0(lzaVar, j3, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i9 * fC2) + f5)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fC3)) & 4294967295L), 0.0f, null, 0, 120);
                                }
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(lzaVar.getLayoutDirection() == asr.a ? 0.0f : Float.intBitsToFloat((int) (lzaVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
                                if (z5) {
                                    fIntBitsToFloat4 -= Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                                }
                                tcf.m0(lzaVar, j3, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(fC3)) & 4294967295L), 0.0f, null, 0, 120);
                            }
                            lzaVar.b2();
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                dVarC = androidx.compose.ui.draw.a.c(aVar3, (Function1) objY);
                bVarI.X(false);
            } else {
                bVarI.N(606771165);
                bVarI.X(false);
                dVarC = aVar3;
            }
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.j.l(aVar3, 288.0f).n(dVarC);
            n54.a aVar4 = ht.a.m;
            kw0.h hVar = kw0.f;
            i78 i78VarA = g78.a(hVar, aVar4, bVarI, 6);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarN);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            bVarI.N(-680088486);
            int i5 = 0;
            int i6 = 0;
            while (i6 < 6) {
                androidx.compose.ui.d dVarG = androidx.compose.foundation.layout.j.g(aVar3, 1.0f);
                d160 d160VarA = b160.a(hVar, ht.a.k, bVarI, 54);
                int I2 = bVarI.I();
                ne00 ne00VarS2 = bVarI.S();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarG);
                yka.k.getClass();
                int i7 = i5;
                tsr.a aVar6 = yka.a.b;
                bVarI.D();
                int i8 = i6;
                if (bVarI.S) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I2))) {
                    n30.a(I2, bVarI, I2, c1350a2);
                }
                hlh0.a(bVarI, dVarC3, yka.a.d);
                bVarI.N(1542622325);
                int i9 = i7;
                int i10 = 0;
                while (i10 < 7) {
                    int i11 = iu5Var.d;
                    if (i9 < i11 || i9 >= i11 + iu5Var.c) {
                        bVar2 = bVarI;
                        aVar2 = aVar3;
                        c0042a = c0042a2;
                        bVar2.N(576825328);
                        androidx.compose.ui.d dVarV = androidx.compose.foundation.layout.j.v(aVar2, dxc.g, dxc.e, 0.0f, 12);
                        qyd0 qyd0Var = zxo.d;
                        ty0.a(bVar2, androidx.compose.foundation.layout.j.t(dVarV, ((g7f) bVar2.O(qyd0Var)).a, ((g7f) bVar2.O(qyd0Var)).a));
                        bVar2.X(false);
                    } else {
                        bVarI.N(577914947);
                        int i12 = i9 - iu5Var.d;
                        final long j3 = (((long) i12) * 86400000) + iu5Var.e;
                        boolean z5 = j3 == j2;
                        boolean z6 = l2 != null && j3 == l2.longValue();
                        boolean z7 = l3 != null && j3 == l3.longValue();
                        if (o780Var != null) {
                            bVarI.N(578361347);
                            boolean zE = ((i4 & 458752) == 131072) | bVarI.e(j3);
                            Object objY2 = bVarI.y();
                            if (zE || objY2 == c0042a2) {
                                if (j3 < (l2 != null ? l2.longValue() : Long.MAX_VALUE)) {
                                    z3 = false;
                                } else {
                                    if (j3 <= (l3 != null ? l3.longValue() : Long.MIN_VALUE)) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                }
                                objY2 = nvc.a(z3, bVarI);
                            }
                            boolean zBooleanValue = ((Boolean) ((ytw) objY2).getValue()).booleanValue();
                            bVarI.X(false);
                            z = zBooleanValue;
                        } else {
                            bVarI.N(578890300);
                            bVarI.X(false);
                            z = false;
                        }
                        boolean z8 = o780Var != null;
                        StringBuilder sb = new StringBuilder();
                        if (z8) {
                            bVarI.N(974450583);
                            if (z6) {
                                bVarI.N(1416909399);
                                sb.append(xae0.a(R.string.m3c_date_range_picker_start_headline, bVarI));
                                z2 = false;
                                bVarI.X(false);
                            } else {
                                z2 = false;
                                if (z7) {
                                    bVarI.N(1416913397);
                                    sb.append(xae0.a(R.string.m3c_date_range_picker_end_headline, bVarI));
                                    z2 = false;
                                    bVarI.X(false);
                                } else {
                                    if (z) {
                                        bVarI.N(1416917332);
                                        sb.append(xae0.a(R.string.m3c_date_range_picker_day_in_range, bVarI));
                                        z2 = false;
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(974832875);
                                        bVarI.X(false);
                                    }
                                    bVarI.X(z2);
                                }
                            }
                            bVarI.X(z2);
                        } else {
                            aVar3 = aVar3;
                            bVarI.N(974838827);
                            bVarI.X(false);
                        }
                        if (z5) {
                            bVarI.N(1416920485);
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(xae0.a(R.string.m3c_date_picker_today_description, bVarI));
                            bVarI.X(false);
                        } else {
                            bVarI.N(975029291);
                            bVarI.X(false);
                        }
                        String string = sb.length() == 0 ? null : sb.toString();
                        boolean z9 = z7;
                        String strB = gucVar2.b(Long.valueOf(j3), locale2, true);
                        if (strB == null) {
                            strB = "";
                        }
                        String strA = cu5.a(i12 + 1, locale2);
                        boolean z10 = z6 || z9;
                        boolean zE2 = ((i4 & 112) == 32) | bVarI.e(j3);
                        Object objY3 = bVarI.y();
                        if (zE2 || objY3 == c0042a2) {
                            objY3 = new Function0() { // from class: iuc
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function2.invoke(Long.valueOf(j3));
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY3);
                        }
                        Function0 function0 = (Function0) objY3;
                        boolean zE3 = bVarI.e(j3) | ((i4 & 29360128) == 8388608);
                        Object objY4 = bVarI.y();
                        if (zE3 || objY4 == c0042a2) {
                            objY4 = Boolean.valueOf(h780Var.a(iu5Var.a) && h780Var.b(j3));
                            bVarI.r(objY4);
                        }
                        boolean zBooleanValue2 = ((Boolean) objY4).booleanValue();
                        if (string != null) {
                            strB = tug.a(string, ", ", strB);
                        }
                        c0042a = c0042a2;
                        String str = strB;
                        androidx.compose.runtime.b bVar3 = bVarI;
                        aVar2 = aVar3;
                        e(strA, z10, function0, z6, zBooleanValue2, z5, z, str, gtcVar, bVar3, ((i4 << 3) & 1879048192) | 48);
                        bVar2 = bVar3;
                        bVar2.X(false);
                    }
                    function2 = function1;
                    gucVar2 = gucVar;
                    c0042a2 = c0042a;
                    hVar = hVar;
                    aVar3 = aVar2;
                    i9++;
                    i10++;
                    locale2 = locale;
                    bVarI = bVar2;
                }
                androidx.compose.runtime.b bVar4 = bVarI;
                bVar4.X(false);
                bVar4.X(true);
                function2 = function1;
                gucVar2 = gucVar;
                i6 = i8 + 1;
                i5 = i9;
                locale2 = locale;
            }
            bVar = bVarI;
            bVar.X(false);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: juc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xvc.i(iu5Var, function1, j2, l2, l3, o780Var, gucVar, h780Var, gtcVar, locale, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(androidx.compose.ui.d dVar, final boolean z, final boolean z2, final boolean z3, final String str, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final gtc gtcVar, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.ui.d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(-773929258);
        int i3 = i2 | (bVarI.b(z) ? 32 : 16) | (bVarI.b(z2) ? 256 : 128) | (bVarI.b(z3) ? 2048 : 1024) | (bVarI.M(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function0) ? 131072 : 65536) | (bVarI.A(function1) ? 1048576 : 524288) | (bVarI.A(function2) ? 8388608 : 4194304) | (bVarI.M(gtcVar) ? 67108864 : 33554432);
        if (bVarI.q(i3 & 1, (38347923 & i3) != 38347922)) {
            dVar2 = dVar;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.j.l(androidx.compose.foundation.layout.j.g(dVar2, 1.0f), 56.0f);
            d160 d160VarA = b160.a(z3 ? kw0.a : kw0.g, ht.a.k, bVarI, 48);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarL);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            o(((i3 >> 21) & 14) | 3072 | ((i3 >> 6) & 112), pp8.b(619076006, new j(str, gtcVar), bVarI), bVarI, null, function2, z3);
            if (z3) {
                bVarI.N(282432080);
                bVarI.X(false);
            } else {
                bVarI.N(281624840);
                hna.a(tp0.a(gtcVar.f, iza.a), pp8.b(-128317193, new k(function1, z2, function0, z), bVarI), bVarI, 56);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            dVar2 = dVar;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final androidx.compose.ui.d dVar3 = dVar2;
            eVarZ.d = new Function2(z, z2, z3, str, function0, function1, function2, gtcVar, i2) { // from class: hvc
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ String e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 v;
                public final /* synthetic */ gtc w;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    xvc.j(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(final Long l2, final long j2, final int i2, final Function1 function1, final Function1 function2, final du5 du5Var, final IntRange intRange, final guc gucVar, final h780 h780Var, final gtc gtcVar, final b5i b5iVar, androidx.compose.runtime.a aVar, final int i3) {
        boolean z;
        androidx.compose.runtime.b bVarI = aVar.i(-2053685029);
        int i4 = i3 | (bVarI.M(l2) ? 4 : 2) | (bVarI.e(j2) ? 32 : 16) | (bVarI.d(i2) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(du5Var) ? 131072 : 65536) | (bVarI.A(intRange) ? 1048576 : 524288) | (bVarI.M(gucVar) ? 8388608 : 4194304) | (bVarI.M(h780Var) ? 67108864 : 33554432) | (bVarI.M(gtcVar) ? 536870912 : 268435456);
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && ((bVarI.M(b5iVar) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            final int i5 = -((mmd) bVarI.O(kna.h)).y0(48.0f);
            final goh gohVarB = a6w.b(z5w.c, bVarI);
            final goh gohVarB2 = a6w.b(z5w.d, bVarI);
            z5w z5wVar = z5w.a;
            final goh gohVarB3 = a6w.b(z5wVar, bVarI);
            final goh gohVarB4 = a6w.b(z5wVar, bVarI);
            mse mseVar = new mse(i2);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                z = false;
                objY = new uuc(0);
                bVarI.r(objY);
            } else {
                z = false;
            }
            androidx.compose.ui.d dVarB = xa80.b(androidx.compose.ui.d.a.b, z, (Function1) objY);
            boolean zA = bVarI.A(gohVarB3) | bVarI.A(gohVarB) | bVarI.A(gohVarB2) | bVarI.d(i5) | bVarI.A(gohVarB4);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new Function1() { // from class: vuc
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        androidx.compose.animation.d dVar = (androidx.compose.animation.d) obj;
                        int i6 = ((mse) dVar.a()).a;
                        goh gohVar = gohVarB3;
                        goh gohVar2 = gohVarB;
                        goh gohVar3 = gohVarB2;
                        final int i7 = i5;
                        return dVar.b(i6 == 1 ? androidx.compose.animation.a.d(f.p(gohVar, new yuc()).b(f.f(gohVar2, 2)), f.g(gohVar3, 2).b(f.t(gohVar, new Function1() { // from class: zuc
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ((Integer) obj2).getClass();
                                return Integer.valueOf(i7);
                            }
                        }))) : androidx.compose.animation.a.d(f.p(gohVar, new Function1() { // from class: zuc
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ((Integer) obj2).getClass();
                                return Integer.valueOf(i7);
                            }
                        }).b(f.f(gohVar2, 2)), f.t(gohVar, new yuc()).b(f.g(gohVar3, 2))), new jx90(true, new avc(gohVarB4)));
                    }
                };
                bVarI.r(objY2);
            }
            androidx.compose.animation.a.b(mseVar, dVarB, (Function1) objY2, null, "DatePickerDisplayModeAnimation", null, pp8.b(1838500091, new nwc(l2, j2, function1, function2, du5Var, intRange, gucVar, h780Var, gtcVar, b5iVar), bVarI), bVarI, ((i4 >> 6) & 14) | 1597440, 40);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(l2, j2, i2, function1, function2, du5Var, intRange, gucVar, h780Var, gtcVar, b5iVar, i3) { // from class: wuc
                public final /* synthetic */ Long a;
                public final /* synthetic */ long b;
                public final /* synthetic */ int c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ du5 f;
                public final /* synthetic */ IntRange i;
                public final /* synthetic */ guc v;
                public final /* synthetic */ h780 w;
                public final /* synthetic */ gtc y;
                public final /* synthetic */ b5i z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    xvc.k(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void l(final gtc gtcVar, final du5 du5Var, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1849465391);
        int i3 = (i2 & 6) == 0 ? (bVarI.M(gtcVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= bVarI.A(du5Var) ? 32 : 16;
        }
        boolean z = 0;
        boolean z2 = true;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            int iD = du5Var.d();
            List<Pair<String, String>> listI = du5Var.i();
            ArrayList arrayList = new ArrayList();
            int i4 = iD - 1;
            int size = listI.size();
            for (int i5 = i4; i5 < size; i5++) {
                arrayList.add(listI.get(i5));
            }
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList.add(listI.get(i6));
            }
            imf0 imf0VarA = gah0.a(dxc.B, bVarI);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            float f2 = 0.0f;
            androidx.compose.ui.d dVarG = androidx.compose.foundation.layout.j.g(androidx.compose.foundation.layout.j.b(aVar2, 0.0f, 48.0f, 1), 1.0f);
            d160 d160VarA = b160.a(kw0.f, ht.a.k, bVarI, 54);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            bVarI.N(24563235);
            int size2 = arrayList.size();
            int i7 = 0;
            while (i7 < size2) {
                Pair pair = (Pair) arrayList.get(i7);
                boolean zM = bVarI.M(pair);
                Object objY = bVarI.y();
                if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new dvc(pair, z);
                    bVarI.r(objY);
                }
                androidx.compose.ui.d dVarV = androidx.compose.foundation.layout.j.v(xa80.a(aVar2, (Function1) objY), dxc.g, dxc.e, f2, 12);
                androidx.compose.runtime.d dVar = zxo.d;
                androidx.compose.ui.d dVarT = androidx.compose.foundation.layout.j.t(dVarV, ((g7f) bVarI.O(dVar)).a, ((g7f) bVarI.O(dVar)).a);
                aiv aivVarC = g75.c(ht.a.e, z);
                int I2 = bVarI.I();
                ne00 ne00VarS2 = bVarI.S();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarT);
                yka.k.getClass();
                tsr.a aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I2))) {
                    n30.a(I2, bVarI, I2, c1350a2);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                androidx.compose.runtime.b bVar2 = bVarI;
                lkf0.d((String) pair.b, androidx.compose.foundation.layout.j.C(aVar2, null, 3), gtcVar.d, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0VarA, bVar2, 48, 0, 130040);
                bVar2.X(true);
                i7++;
                aVar2 = aVar2;
                z2 = true;
                bVarI = bVar2;
                f2 = f2;
                arrayList = arrayList;
                size2 = size2;
                z = 0;
            }
            androidx.compose.runtime.b bVar3 = bVarI;
            bVar3.X(z);
            bVar3.X(z2);
            bVar = bVar3;
        } else {
            androidx.compose.runtime.b bVar4 = bVarI;
            bVar4.G();
            bVar = bVar4;
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gvc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    xvc.l(gtcVar, du5Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void m(final String str, final androidx.compose.ui.d dVar, final boolean z, final boolean z2, final Function0<Unit> function0, final boolean z3, String str2, final gtc gtcVar, androidx.compose.runtime.a aVar, final int i2) {
        long j2;
        String str3 = str2;
        androidx.compose.runtime.b bVarI = aVar.i(-1153850597);
        int i3 = i2 | (bVarI.M(str) ? 4 : 2) | (bVarI.b(z) ? 256 : 128) | (bVarI.b(z2) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.b(z3) ? 131072 : 65536) | (bVarI.M(str3) ? 1048576 : 524288) | (bVarI.M(gtcVar) ? 8388608 : 4194304);
        if (bVarI.q(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean z4 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z4 || objY == c0042a) {
                objY = (!z2 || z) ? null : m35.a(dxc.m, gtcVar.u);
                bVarI.r(objY);
            }
            l35 l35Var = (l35) objY;
            boolean z5 = (3670016 & i3) == 1048576;
            Object objY2 = bVarI.y();
            if (z5 || objY2 == c0042a) {
                str3 = str2;
                objY2 = new muc(str3, 0);
                bVarI.r(objY2);
            } else {
                str3 = str2;
            }
            androidx.compose.ui.d dVarB = xa80.b(dVar, true, (Function1) objY2);
            qx80 qx80VarB = xy80.b(dxc.H, bVarI);
            int i4 = i3 >> 6;
            int i5 = i4 & 14;
            if (z) {
                j2 = z3 ? gtcVar.l : gtcVar.m;
            } else {
                j2 = j58.l;
            }
            ihe0.b(z, function0, dVarB, z3, qx80VarB, ((j58) hw90.a(j2, a6w.b(z5w.c, bVarI), null, bVarI, 0, 12).getValue()).a, 0.0f, l35Var, null, pp8.b(-564400443, new l(str, gtcVar, z2, z, z3), bVarI), bVarI, i5 | ((i3 >> 9) & 112) | (i4 & 7168), 1472);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final String str4 = str3;
            eVarZ.d = new Function2(str, dVar, z, z2, function0, z3, str4, gtcVar, i2) { // from class: nuc
                public final /* synthetic */ String a;
                public final /* synthetic */ d b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ String i;
                public final /* synthetic */ gtc v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    xvc.m(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void n(final androidx.compose.ui.d dVar, final long j2, final Function1<? super Integer, Unit> function1, final h780 h780Var, final du5 du5Var, final IntRange intRange, final gtc gtcVar, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVarI = aVar.i(-1286899812);
        int i3 = i2 | (bVarI.e(j2) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.M(h780Var) ? 2048 : 1024) | (bVarI.A(du5Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(intRange) ? 131072 : 65536) | (bVarI.M(gtcVar) ? 1048576 : 524288);
        if (bVarI.q(i3 & 1, (599187 & i3) != 599186)) {
            lkf0.a(gah0.a(dxc.E, bVarI), pp8.b(1301915789, new m(du5Var, j2, intRange, dVar, gtcVar, function1, h780Var), bVarI), bVarI, 48);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j2, function1, h780Var, du5Var, intRange, gtcVar, i2) { // from class: kvc
                public final /* synthetic */ long b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ h780 d;
                public final /* synthetic */ du5 e;
                public final /* synthetic */ IntRange f;
                public final /* synthetic */ gtc i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    xvc.n(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void o(final int i2, final op8 op8Var, androidx.compose.runtime.a aVar, androidx.compose.ui.d dVar, final Function0 function0, final boolean z) {
        int i3;
        final androidx.compose.ui.d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(-709923073);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.A(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.b(z) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.A(op8Var) ? 2048 : 1024;
        }
        if (bVarI.q(i4 & 1, (i4 & 1171) != 1170)) {
            i060 i060Var = j060.a;
            umz umzVar = ek5.a;
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            nk5.c(function0, aVar2, false, i060Var, ek5.g(((j58) bVarI.O(iza.a)).a, 0L, bVarI, 13), null, null, null, pp8.b(1899489890, new swc(op8Var, z), bVarI), bVarI, (i4 & 14) | 807075840 | ((i4 >> 3) & 112), 388);
            bVarI = bVarI;
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: jvc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xvc.o(qj40.a(i2 | 1), op8Var, (a) obj, dVar2, function0, z);
                    return Unit.a;
                }
            };
        }
    }
}
