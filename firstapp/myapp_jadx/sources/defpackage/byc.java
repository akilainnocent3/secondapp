package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class byc {
    public static final umz a = h.b(24.0f, 20.0f, 0.0f, 8.0f, 4);
    public static final float b;

    @c0d(c = "androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$1$1", f = "DateRangePicker.kt", l = {775}, m = "invokeSuspend")
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
                int iH = zzrVar.h();
                int i2 = this.c;
                if (iH != i2) {
                    this.a = 1;
                    if (zzrVar.k(i2, 0, this) == y5bVar) {
                        return y5bVar;
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

    public static final class b implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ Long a;
        public final /* synthetic */ Long b;
        public final /* synthetic */ Function2<Long, Long, Unit> c;
        public final /* synthetic */ zzr d;
        public final /* synthetic */ IntRange e;
        public final /* synthetic */ du5 f;
        public final /* synthetic */ iu5 i;
        public final /* synthetic */ guc v;
        public final /* synthetic */ gtc w;
        public final /* synthetic */ xt5 y;
        public final /* synthetic */ h780 z;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Long l, Long l2, Function2<? super Long, ? super Long, Unit> function2, zzr zzrVar, IntRange intRange, du5 du5Var, iu5 iu5Var, guc gucVar, gtc gtcVar, xt5 xt5Var, h780 h780Var) {
            this.a = l;
            this.b = l2;
            this.c = function2;
            this.d = zzrVar;
            this.e = intRange;
            this.f = du5Var;
            this.i = iu5Var;
            this.v = gucVar;
            this.w = gtcVar;
            this.y = xt5Var;
            this.z = h780Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            int i = 1;
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                Object objY = aVar2.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (objY == c0042a) {
                    objY = xvf.i(e.a, aVar2);
                    aVar2.r(objY);
                }
                final v5b v5bVar = (v5b) objY;
                String strA = xae0.a(R.string.m3c_date_range_picker_scroll_to_previous_month, aVar2);
                String strA2 = xae0.a(R.string.m3c_date_range_picker_scroll_to_next_month, aVar2);
                final Long l = this.a;
                boolean zM = aVar2.M(l);
                final Long l2 = this.b;
                boolean zM2 = zM | aVar2.M(l2);
                final Function2<Long, Long, Unit> function2 = this.c;
                boolean zM3 = zM2 | aVar2.M(function2);
                Object objY2 = aVar2.y();
                if (zM3 || objY2 == c0042a) {
                    objY2 = new Function1() { // from class: dyc
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Long l3 = (Long) obj;
                            long jLongValue = l3.longValue();
                            umz umzVar = byc.a;
                            Long l4 = l;
                            Long l5 = l2;
                            Function2 function3 = function2;
                            if (!(l4 == null && l5 == null) && ((l4 == null || l5 == null) && l4 != null && jLongValue >= l4.longValue())) {
                                function3.invoke(l4, l3);
                            } else {
                                function3.invoke(l3, null);
                            }
                            return Unit.a;
                        }
                    };
                    aVar2.r(objY2);
                }
                final Function1 function1 = (Function1) objY2;
                final zzr zzrVar = this.d;
                final List listK = kotlin.collections.b.k(new a6c(strA, new h84(i, zzrVar, v5bVar)), new a6c(strA2, new Function0() { // from class: txc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean z;
                        zzr zzrVar2 = zzrVar;
                        if (zzrVar2.e()) {
                            ej5.c(v5bVar, null, null, new lyc(zzrVar2, null), 3);
                            z = true;
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                }));
                Object objY3 = aVar2.y();
                if (objY3 == c0042a) {
                    objY3 = new eyc();
                    aVar2.r(objY3);
                }
                d dVarB = xa80.b(d.a.b, false, (Function1) objY3);
                boolean zA = aVar2.A(this.e) | aVar2.A(this.f) | aVar2.M(this.i) | aVar2.A(this.v) | aVar2.A(listK);
                final gtc gtcVar = this.w;
                boolean zM4 = zA | aVar2.M(gtcVar) | aVar2.M(l) | aVar2.M(l2) | aVar2.M(function1) | aVar2.M(this.y) | aVar2.M(this.z);
                Object objY4 = aVar2.y();
                if (zM4 || objY4 == c0042a) {
                    final IntRange intRange = this.e;
                    final du5 du5Var = this.f;
                    final iu5 iu5Var = this.i;
                    final Long l3 = this.a;
                    final Long l4 = this.b;
                    final xt5 xt5Var = this.y;
                    final guc gucVar = this.v;
                    final h780 h780Var = this.z;
                    Function1 function3 = new Function1() { // from class: fyc
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            umz umzVar = xvc.a;
                            IntRange intRange2 = intRange;
                            szr.f((szr) obj, ((intRange2.b - intRange2.a) + 1) * 12, null, new op8(682334170, new kyc(du5Var, iu5Var, l3, l4, function1, xt5Var, gucVar, h780Var, gtcVar, listK), true), 6);
                            return Unit.a;
                        }
                    };
                    aVar2.r(function3);
                    objY4 = function3;
                }
                aur.a(dVarB, this.d, null, false, null, null, null, false, null, (Function1) objY4, aVar2, 0, 508);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1", f = "DateRangePicker.kt", l = {901}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;
        public final /* synthetic */ Function1<Long, Unit> c;
        public final /* synthetic */ du5 d;
        public final /* synthetic */ IntRange e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(zzr zzrVar, Function1<? super Long, Unit> function1, du5 du5Var, IntRange intRange, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = zzrVar;
            this.c = function1;
            this.d = du5Var;
            this.e = intRange;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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

    static {
        h.b(64.0f, 0.0f, 12.0f, 0.0f, 10);
        h.b(64.0f, 0.0f, 12.0f, 12.0f, 2);
        b = 60.0f;
    }

    public static final void a(final oyc oycVar, final d dVar, guc gucVar, final gtc gtcVar, final op8 op8Var, final op8 op8Var2, final boolean z, b5i b5iVar, androidx.compose.runtime.a aVar, final int i) {
        final guc gucVar2;
        final b5i b5iVar2;
        guc gucVar3;
        int i2;
        b5i b5iVar3;
        op8 op8VarB;
        androidx.compose.runtime.b bVarI = aVar.i(1969726368);
        int i3 = i | (bVarI.M(oycVar) ? 4 : 2) | (bVarI.M(dVar) ? 32 : 16) | 128 | (bVarI.M(gtcVar) ? 2048 : 1024) | 12582912;
        if (bVarI.q(i3 & 1, (4793491 & i3) != 4793490)) {
            bVarI.A0();
            int i4 = i & 1;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i4 == 0 || bVarI.h0()) {
                Object objY = bVarI.y();
                if (objY == c0042a) {
                    ktc ktcVar = ktc.a;
                    objY = new huc();
                    bVarI.r(objY);
                }
                gucVar3 = (guc) objY;
                i2 = i3 & (-897);
                Object objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new b5i();
                    bVarI.r(objY2);
                }
                b5iVar3 = (b5i) objY2;
            } else {
                bVarI.G();
                i2 = i3 & (-897);
                gucVar3 = gucVar;
                b5iVar3 = b5iVar;
            }
            int i5 = i2;
            bVarI.Y();
            boolean zM = bVarI.M(oycVar.b);
            Object objY3 = bVarI.y();
            if (zM || objY3 == c0042a) {
                objY3 = oycVar.c;
                bVarI.r(objY3);
            }
            du5 du5Var = (du5) objY3;
            if (z) {
                bVarI.N(-2018438858);
                op8VarB = pp8.b(1343236786, new xxc(oycVar, gtcVar), bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(-2018051234);
                bVarI.X(false);
                op8VarB = null;
            }
            guc gucVar4 = gucVar3;
            xvc.a(dVar, op8Var, op8Var2, op8VarB, gtcVar, gah0.a(dxc.x, bVarI), dxc.w - b, pp8.b(684885105, new ayc(oycVar, du5Var, gucVar4, gtcVar, b5iVar3), bVarI), bVarI, ((i5 >> 3) & 14) | 14156208 | (57344 & (i5 << 3)));
            gucVar2 = gucVar4;
            b5iVar2 = b5iVar3;
        } else {
            bVarI.G();
            gucVar2 = gucVar;
            b5iVar2 = b5iVar;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(dVar, gucVar2, gtcVar, op8Var, op8Var2, z, b5iVar2, i) { // from class: vxc
                public final /* synthetic */ d b;
                public final /* synthetic */ guc c;
                public final /* synthetic */ gtc d;
                public final /* synthetic */ op8 e;
                public final /* synthetic */ op8 f;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ b5i v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1794049);
                    byc.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final Long l, final Long l2, final long j, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final du5 du5Var, final IntRange intRange, final guc gucVar, final h780 h780Var, final gtc gtcVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-787063721);
        int i2 = i | (bVarI.M(l) ? 4 : 2) | (bVarI.M(l2) ? 32 : 16) | (bVarI.e(j) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(du5Var) ? 131072 : 65536) | (bVarI.A(intRange) ? 1048576 : 524288) | (bVarI.M(gucVar) ? 8388608 : 4194304) | (bVarI.M(h780Var) ? 67108864 : 33554432) | (bVarI.M(gtcVar) ? 536870912 : 268435456);
        if (bVarI.q(i2 & 1, (306783379 & i2) != 306783378)) {
            iu5 iu5VarF = du5Var.f(j);
            int i3 = (((iu5VarF.a - intRange.a) * 12) + iu5VarF.b) - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            zzr zzrVarA = e0s.a(i3, 2, bVarI);
            Integer numValueOf = Integer.valueOf(i3);
            boolean zM = bVarI.M(zzrVarA) | bVarI.d(i3);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new a(i3, null, zzrVarA);
                bVarI.r(objY);
            }
            xvf.e(bVarI, numValueOf, (Function2) objY);
            umz umzVar = xvc.a;
            d dVarH = h.h(d.a.b, 12.0f, 0.0f, 2);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
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
            xvc.l(gtcVar, du5Var, bVarI, ((i2 >> 27) & 14) | ((i2 >> 12) & 112));
            d(zzrVarA, l, l2, function2, function1, du5Var, intRange, gucVar, h780Var, gtcVar, bVarI, ((i2 << 3) & 1008) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (234881024 & i2) | (i2 & 1879048192));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(l, l2, j, function2, function1, du5Var, intRange, gucVar, h780Var, gtcVar, i) { // from class: rxc
                public final /* synthetic */ Long a;
                public final /* synthetic */ Long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ Function2 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ du5 f;
                public final /* synthetic */ IntRange i;
                public final /* synthetic */ guc v;
                public final /* synthetic */ h780 w;
                public final /* synthetic */ gtc y;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    byc.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final Long l, final Long l2, final long j, final int i, final Function2 function2, final Function1 function1, final du5 du5Var, final IntRange intRange, final guc gucVar, final h780 h780Var, final gtc gtcVar, final b5i b5iVar, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVarI = aVar.i(621028059);
        int i3 = i2 | (bVarI.M(l) ? 4 : 2) | (bVarI.M(l2) ? 32 : 16) | (bVarI.e(j) ? 256 : 128) | (bVarI.d(i) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536) | (bVarI.A(du5Var) ? 1048576 : 524288) | (bVarI.A(intRange) ? 8388608 : 4194304) | (bVarI.M(gucVar) ? 67108864 : 33554432) | (bVarI.M(h780Var) ? 536870912 : 268435456);
        int i4 = 0;
        if (bVarI.q(i3 & 1, ((i3 & 306783379) == 306783378 && (((bVarI.M(gtcVar) ? (char) 4 : (char) 2) | (bVarI.M(b5iVar) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            goh gohVarB = a6w.b(z5w.d, bVarI);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new pxc(i4);
                bVarI.r(objY);
            }
            q3c.b(new mse(i), xa80.b(d.a.b, false, (Function1) objY), gohVarB, null, pp8.b(-773828161, new cyc(l, l2, j, function2, function1, du5Var, intRange, gucVar, h780Var, gtcVar, b5iVar), bVarI), bVarI, ((i3 >> 9) & 14) | 24576, 8);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(l, l2, j, i, function2, function1, du5Var, intRange, gucVar, h780Var, gtcVar, b5iVar, i2) { // from class: qxc
                public final /* synthetic */ b5i A;
                public final /* synthetic */ Long a;
                public final /* synthetic */ Long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ int d;
                public final /* synthetic */ Function2 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ du5 i;
                public final /* synthetic */ IntRange v;
                public final /* synthetic */ guc w;
                public final /* synthetic */ h780 y;
                public final /* synthetic */ gtc z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    byc.c(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(zzr zzrVar, final Long l, final Long l2, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final du5 du5Var, final IntRange intRange, final guc gucVar, final h780 h780Var, final gtc gtcVar, androidx.compose.runtime.a aVar, final int i) {
        Long l3;
        Object cVar;
        final zzr zzrVar2 = zzrVar;
        androidx.compose.runtime.b bVarI = aVar.i(1257365001);
        int i2 = (bVarI.M(zzrVar2) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            l3 = l;
            i2 |= bVarI.M(l3) ? 32 : 16;
        } else {
            l3 = l;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(l2) ? 256 : 128;
        }
        int i3 = i2 | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function1) ? 16384 : 8192) | (bVarI.A(du5Var) ? 131072 : 65536) | (bVarI.A(intRange) ? 1048576 : 524288) | (bVarI.M(gucVar) ? 8388608 : 4194304) | (bVarI.M(h780Var) ? 67108864 : 33554432) | (bVarI.M(gtcVar) ? 536870912 : 268435456);
        if (bVarI.q(i3 & 1, (i3 & 306783379) != 306783378)) {
            xt5 xt5VarH = du5Var.h();
            boolean zM = bVarI.M(intRange);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = du5Var.e(intRange.a, 1);
                bVarI.r(objY);
            }
            lkf0.a(gah0.a(dxc.h, bVarI), pp8.b(1090773432, new b(l3, l2, function2, zzrVar2, intRange, du5Var, (iu5) objY, gucVar, gtcVar, xt5VarH, h780Var), bVarI), bVarI, 48);
            boolean zA = ((i3 & 14) == 4) | ((i3 & 57344) == 16384) | bVarI.A(du5Var) | bVarI.A(intRange);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                zzrVar2 = zzrVar;
                cVar = new c(zzrVar2, function1, du5Var, intRange, null);
                bVarI.r(cVar);
            } else {
                cVar = objY2;
                zzrVar2 = zzrVar;
            }
            xvf.e(bVarI, zzrVar2, (Function2) cVar);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: sxc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    byc.d(zzrVar2, l, l2, function2, function1, du5Var, intRange, gucVar, h780Var, gtcVar, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
