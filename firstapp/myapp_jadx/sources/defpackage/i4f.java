package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import java.io.FileNotFoundException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class i4f {

    public static final class a implements ssd0 {
        public final /* synthetic */ Function1<rfj0, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super rfj0, Unit> function1) {
            this.a = function1;
        }

        @Override // defpackage.ssd0
        public final void a() {
            this.a.invoke(ufj0.a);
        }

        @Override // defpackage.ssd0
        public final void b() {
            this.a.invoke(vfj0.a);
        }

        @Override // defpackage.ssd0
        public final void c(String str) {
            str.getClass();
            this.a.invoke(new xfj0(str));
        }

        @Override // defpackage.ssd0
        public final void d(boolean z) {
            this.a.invoke(new wfj0(z));
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.component.DoubleOrNothingRootKt$DoubleOrNothingScreen$1$4$1", f = "DoubleOrNothingRoot.kt", l = {179}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ v3a0 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Function1<w5f, Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(v3a0 v3a0Var, String str, Function1<? super w5f, Unit> function1, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = v3a0Var;
            this.c = str;
            this.d = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            b bVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                bVar = this;
                if (v3a0.b(this.b, this.c, null, false, null, bVar, 14) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                bVar = this;
            }
            bVar.d.invoke(w5f.a.a);
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(d dVar, final j0f j0fVar, final i0f i0fVar, final q5f q5fVar, final Function1 function1, final Function1 function2, final Function0 function0, androidx.compose.runtime.a aVar, final int i) throws FileNotFoundException {
        final d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(-1041939461);
        int i2 = i | 6 | (bVarI.M(j0fVar) ? 32 : 16) | (bVarI.M(i0fVar) ? 256 : 128) | (bVarI.M(q5fVar) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function2) ? 131072 : 65536) | (bVarI.A(function0) ? 1048576 : 524288);
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            long j = ((lib0) bVarI.O(oib0.a)).t0;
            zk40.a aVar2 = zk40.a;
            d.a aVar3 = d.a.b;
            d dVarE = j.e(androidx.compose.foundation.a.b(aVar3, j, aVar2), 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z || objY == c0042a) {
                objY = m.b(null);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            d dVarT = j.t(aVar3, i0fVar.a, i0fVar.b);
            aiv aivVarC2 = g75.c(ht.a.a, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarT);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d dVarE2 = j.e(aVar3, 1.0f);
            boolean zM = bVarI.M(ytwVar);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = new x3f(ytwVar, 0);
                bVarI.r(objY2);
            }
            vze.a(dVarE2, i0fVar, (Function1) objY2, bVarI, ((i2 >> 3) & 112) | 6);
            p5f.a(androidx.compose.foundation.layout.d.a.b(j.i(aVar3, i0fVar.k), ht.a.b), q5fVar, bVarI, (i2 >> 6) & 112);
            d0f.a(j.e(aVar3, 1.0f), j0fVar, i0fVar, (owo) ytwVar.getValue(), function1, function2, function0, bVarI, 6 | (i2 & 112) | i3 | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016));
            bVarI.X(true);
            bVarI.X(true);
            dVar2 = aVar3;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j0fVar, i0fVar, q5fVar, function1, function2, function0, i) { // from class: y3f
                public final /* synthetic */ j0f b;
                public final /* synthetic */ i0f c;
                public final /* synthetic */ q5f d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function0 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    i4f.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d dVar, final y5f y5fVar, final Function1<? super w5f, Unit> function1, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final d dVar2;
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(2006270153);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? bVarI.M(y5fVar) : bVarI.A(y5fVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            d dVar3 = i4 != 0 ? d.a.b : dVar;
            if (y5fVar == null) {
                e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    final d dVar4 = dVar3;
                    eVarZ.d = new Function2() { // from class: a4f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            i4f.b(dVar4, y5fVar, function1, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            d dVar5 = dVar3;
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new b4f();
                bVarI.r(objY);
            }
            tr1.a(true, (Function0) objY, bVarI, 54, 0);
            c(dVar5, y5fVar, function1, bVarI, (i3 & 14) | (y5f.f << 3) | (i3 & 112) | (i3 & 896), 0);
            dVar2 = dVar5;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ2 = bVarI.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new Function2() { // from class: c4f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i4f.b(dVar2, y5fVar, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(d dVar, final y5f y5fVar, final Function1<? super w5f, Unit> function1, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(343844031);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? bVarI.M(y5fVar) : bVarI.A(y5fVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.A(function1) ? 256 : 128;
        }
        int i5 = 0;
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                dVar = d.a.b;
            }
            int i6 = i3 & 896;
            boolean z = i6 == 256;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new d4f(function1, i5);
                bVarI.r(objY);
            }
            final Function1 function2 = (Function1) objY;
            boolean z2 = i6 == 256;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new e4f(function1, 0);
                bVarI.r(objY2);
            }
            final Function1 function3 = (Function1) objY2;
            q75.a(j.e(dVar, 1.0f), null, false, pp8.b(948774057, new gaj() { // from class: f4f
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) throws FileNotFoundException {
                    a.C0041a.C0042a c0042a2;
                    y5f y5fVar2;
                    a aVar2;
                    a.C0041a.C0042a c0042a3;
                    i0f i0fVar;
                    final Function1 function4;
                    a.C0041a.C0042a c0042a4;
                    r75 r75Var = (r75) obj;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar3.M(r75Var) ? 4 : 2;
                    }
                    if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d.a aVar4 = d.a.b;
                        i4f.d(j.e(aVar4, 1.0f), aVar3, 6);
                        float fD = r75Var.d();
                        float fE = r75Var.e();
                        boolean zC = aVar3.c(fD) | aVar3.c(fE);
                        Object objY3 = aVar3.y();
                        a.C0041a.C0042a c0042a5 = a.C0041a.a;
                        if (zC || objY3 == c0042a5) {
                            g7f g7fVar = new g7f(fD);
                            float f = (fD / 360.0f) * 640.0f;
                            Pair pair = Float.compare(f, fE) <= 0 ? new Pair(g7fVar, new g7f(f)) : new Pair(new g7f((fE / 640.0f) * 360.0f), new g7f(fE));
                            float f2 = ((g7f) pair.a).a;
                            float f3 = ((g7f) pair.b).a;
                            objY3 = new i0f(f2, f3, f3 * 0.6046875f, f3 * 0.4828125f, f2 * 0.92777777f, f3 * 0.0390625f, f2 * 0.8888889f, f3 * 0.8888889f, f2 * 0.125f, f2 * 0.26666668f, f3 * 0.2421875f);
                            aVar3.r(objY3);
                        }
                        i0f i0fVar2 = (i0f) objY3;
                        y5f y5fVar3 = y5fVar;
                        j0f j0fVar = y5fVar3.b;
                        final Function1 function5 = function1;
                        Function1 function6 = function3;
                        if (j0fVar == null) {
                            aVar3.N(-251643775);
                            aVar3.H();
                            c0042a2 = c0042a5;
                            aVar2 = aVar3;
                            y5fVar2 = y5fVar3;
                        } else {
                            aVar3.N(-251643774);
                            q5f q5fVar = y5fVar3.a;
                            boolean zM = aVar3.M(function5);
                            Object objY4 = aVar3.y();
                            if (zM || objY4 == c0042a5) {
                                objY4 = new Function1() { // from class: h4f
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        d2f d2fVar = (d2f) obj4;
                                        d2fVar.getClass();
                                        function5.invoke(new w5f.d(d2fVar));
                                        return Unit.a;
                                    }
                                };
                                aVar3.r(objY4);
                            }
                            Function1 function7 = (Function1) objY4;
                            boolean zM2 = aVar3.M(function5);
                            Object objY5 = aVar3.y();
                            if (zM2 || objY5 == c0042a5) {
                                objY5 = new Function0() { // from class: o3f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function5.invoke(w5f.e.a);
                                        return Unit.a;
                                    }
                                };
                                aVar3.r(objY5);
                            }
                            Function0 function0 = (Function0) objY5;
                            c0042a2 = c0042a5;
                            y5fVar2 = y5fVar3;
                            i4f.a(null, j0fVar, i0fVar2, q5fVar, function7, function6, function0, aVar3, 0);
                            aVar2 = aVar3;
                            aVar2.H();
                        }
                        yfj0 yfj0Var = y5fVar2.c;
                        if (yfj0Var == null) {
                            aVar2.N(-251023341);
                            aVar2.H();
                            i0fVar = i0fVar2;
                            c0042a3 = c0042a2;
                        } else {
                            aVar2.N(-251023340);
                            final Function1 function8 = function2;
                            boolean zM3 = aVar2.M(function8);
                            Object objY6 = aVar2.y();
                            if (zM3 || objY6 == c0042a2) {
                                objY6 = new Function0() { // from class: p3f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function8.invoke(rfj0.e.a);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY6);
                            }
                            Function0 function9 = (Function0) objY6;
                            boolean zM4 = aVar2.M(function8);
                            Object objY7 = aVar2.y();
                            if (zM4 || objY7 == c0042a2) {
                                objY7 = new Function0() { // from class: q3f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function8.invoke(rfj0.f.a);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY7);
                            }
                            Function0 function10 = (Function0) objY7;
                            boolean zM5 = aVar2.M(function8);
                            Object objY8 = aVar2.y();
                            if (zM5 || objY8 == c0042a2) {
                                objY8 = new p81(function8, 1);
                                aVar2.r(objY8);
                            }
                            Function0 function11 = (Function0) objY8;
                            boolean zM6 = aVar2.M(function8);
                            Object objY9 = aVar2.y();
                            if (zM6 || objY9 == c0042a2) {
                                objY9 = new Function0() { // from class: r3f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function8.invoke(rfj0.b.a);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY9);
                            }
                            Function0 function12 = (Function0) objY9;
                            boolean zM7 = aVar2.M(function8);
                            Object objY10 = aVar2.y();
                            if (zM7 || objY10 == c0042a2) {
                                objY10 = new s3f(function8, 0);
                                aVar2.r(objY10);
                            }
                            Function0 function13 = (Function0) objY10;
                            boolean zM8 = aVar2.M(function8);
                            Object objY11 = aVar2.y();
                            if (zM8 || objY11 == c0042a2) {
                                objY11 = new t3f(function8, 0);
                                aVar2.r(objY11);
                            }
                            Function0 function14 = (Function0) objY11;
                            boolean zM9 = aVar2.M(function8);
                            Object objY12 = aVar2.y();
                            if (zM9 || objY12 == c0042a2) {
                                objY12 = new Function0() { // from class: u3f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function8.invoke(tfj0.a);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY12);
                            }
                            Function0 function15 = (Function0) objY12;
                            boolean zM10 = aVar2.M(function8);
                            Object objY13 = aVar2.y();
                            if (zM10 || objY13 == c0042a2) {
                                objY13 = new w3f(function8, 0);
                                aVar2.r(objY13);
                            }
                            i4f.a aVar5 = new i4f.a(function8);
                            c0042a3 = c0042a2;
                            i0fVar = i0fVar2;
                            a aVar6 = aVar2;
                            ubj0.a(yfj0Var, function9, function10, function11, function12, function13, function14, function15, (Function0) objY13, function6, aVar5, aVar6, 8);
                            aVar2 = aVar6;
                            aVar2.H();
                        }
                        g1f g1fVar = y5fVar2.d;
                        if (g1fVar == null) {
                            aVar2.N(-248814901);
                            aVar2.H();
                            function4 = function5;
                            c0042a4 = c0042a3;
                        } else {
                            aVar2.N(-248814900);
                            d dVarG = j.g(aVar4, 1.0f);
                            float f4 = i0fVar.a;
                            function4 = function5;
                            boolean zM11 = aVar2.M(function4);
                            Object objY14 = aVar2.y();
                            c0042a4 = c0042a3;
                            if (zM11 || objY14 == c0042a4) {
                                objY14 = new Function0() { // from class: m3f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function4.invoke(w5f.c.a);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY14);
                            }
                            Function0 function16 = (Function0) objY14;
                            boolean zM12 = aVar2.M(function4);
                            Object objY15 = aVar2.y();
                            if (zM12 || objY15 == c0042a4) {
                                objY15 = new Function0() { // from class: n3f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function4.invoke(w5f.b.a);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY15);
                            }
                            Function0 function17 = (Function0) objY15;
                            int i7 = g1f.f;
                            a aVar7 = aVar2;
                            f1f.b(dVarG, f4, g1fVar, function16, function17, aVar7, 6, 0);
                            aVar2 = aVar7;
                            aVar2.H();
                        }
                        UiText uiText = y5fVar2.e;
                        uiText.getClass();
                        String strG = uiText.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b));
                        if (strG.length() > 0) {
                            aVar2.N(-248156584);
                            Object objY16 = aVar2.y();
                            if (objY16 == c0042a4) {
                                objY16 = new v3a0();
                                aVar2.r(objY16);
                            }
                            v3a0 v3a0Var = (v3a0) objY16;
                            boolean zM13 = aVar2.M(strG) | aVar2.M(function4);
                            Object objY17 = aVar2.y();
                            if (zM13 || objY17 == c0042a4) {
                                objY17 = new i4f.b(v3a0Var, strG, function4, null);
                                aVar2.r(objY17);
                            }
                            xvf.e(aVar2, strG, (Function2) objY17);
                            s3a0.b(v3a0Var, r75Var.b(aVar4, ht.a.h), uz8.a, aVar2, 390, 0);
                            aVar2.H();
                        } else {
                            aVar2.N(-247540583);
                            aVar2.H();
                        }
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3072, 6);
        } else {
            bVarI.G();
        }
        final d dVar2 = dVar;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: g4f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i4f.c(dVar2, y5fVar, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(d dVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(162318802);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            dVar.getClass();
            g75.a(wje0.a(dVar, Unit.a, h3w.a), bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new z3f(dVar, i);
        }
    }
}
