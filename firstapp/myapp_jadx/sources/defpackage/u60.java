package defpackage;

import android.view.View;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u60 {

    @c0d(c = "androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1", f = "AndroidDialog.android.kt", l = {}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ gme a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gme gmeVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = gmeVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.show();
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function1<use, tse> {
        public final /* synthetic */ gme a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gme gmeVar) {
            super(1);
            this.a = gmeVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final tse invoke(use useVar) {
            return new v60(this.a);
        }
    }

    public static final class c extends qlr implements Function0<Unit> {
        public final /* synthetic */ gme a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ yle c;
        public final /* synthetic */ asr d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(gme gmeVar, Function0<Unit> function0, yle yleVar, asr asrVar) {
            super(0);
            this.a = gmeVar;
            this.b = function0;
            this.c = yleVar;
            this.d = asrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.a.e(this.b, this.c, this.d);
            return Unit.a;
        }
    }

    public static final class d extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> a;
        public final /* synthetic */ yle b;
        public final /* synthetic */ Function2<androidx.compose.runtime.a, Integer, Unit> c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function0<Unit> function0, yle yleVar, Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.a = function0;
            this.b = yleVar;
            this.c = function2;
            this.d = i;
            this.e = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            u60.a(this.a, this.b, this.c, aVar, qj40.a(this.d | 1), this.e);
            return Unit.a;
        }
    }

    public static final class e extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ ytw a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ytw ytwVar) {
            super(2);
            this.a = ytwVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                Object objY = aVar2.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = w60.a;
                    aVar2.r(objY);
                }
                u60.b(xa80.b(androidx.compose.ui.d.a.b, false, (Function1) objY), (Function2) this.a.getValue(), aVar2, 0);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class f extends qlr implements Function0<UUID> {
        public static final f a = new f(0);

        @Override // kotlin.jvm.functions.Function0
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    /* JADX WARN: Code duplicated, block: B:63:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x014a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0154  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void a(Function0<Unit> function0, yle yleVar, Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        yle yleVar2;
        int i4;
        boolean z;
        yle yleVar3;
        androidx.compose.runtime.e eVarZ;
        View view;
        mmd mmdVar;
        asr asrVar;
        androidx.compose.runtime.b.C0043b c0043bJ;
        ytw ytwVarC;
        Object objY;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        UUID uuid;
        boolean zM;
        Object objY2;
        gme gmeVar;
        boolean zA;
        Object objY3;
        boolean zA2;
        Object objY4;
        boolean z2;
        boolean zD;
        Object objY5;
        int i5;
        androidx.compose.runtime.b bVarI = aVar.i(826668973);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                yleVar2 = yleVar;
                i3 |= bVarI.M(yleVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (bVarI.A(function2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i4 = i3;
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i4 & 1, z)) {
                if (i6 != 0) {
                    yleVar3 = new yle(false, false, 7);
                } else {
                    yleVar3 = yleVar2;
                }
                view = (View) bVarI.O(AndroidCompositionLocals_androidKt.f);
                mmdVar = (mmd) bVarI.O(kna.h);
                asrVar = (asr) bVarI.O(kna.n);
                c0043bJ = bVarI.J();
                ytwVarC = m.c(function2, bVarI);
                Object[] objArr = new Object[0];
                objY = bVarI.y();
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (objY == c0042a) {
                    objY = f.a;
                    bVarI.r(objY);
                }
                uuid = (UUID) o350.e(objArr, (Function0) objY, bVarI, 48);
                zM = bVarI.M(view) | bVarI.M(mmdVar);
                objY2 = bVarI.y();
                if (zM || objY2 == c0042a) {
                    gme gmeVar2 = new gme(function0, yleVar3, view, asrVar, mmdVar, uuid);
                    op8 op8Var = new op8(346960332, new e(ytwVarC), true);
                    qle qleVar = gmeVar2.i;
                    qleVar.setParentCompositionContext(c0043bJ);
                    ((x5a0) qleVar.y).setValue(op8Var);
                    qleVar.C = true;
                    qleVar.d();
                    bVarI.r(gmeVar2);
                    objY2 = gmeVar2;
                }
                gmeVar = (gme) objY2;
                Unit unit = Unit.a;
                zA = bVarI.A(gmeVar);
                objY3 = bVarI.y();
                if (zA || objY3 == c0042a) {
                    objY3 = new a(gmeVar, null);
                    bVarI.r(objY3);
                }
                xvf.e(bVarI, unit, (Function2) objY3);
                zA2 = bVarI.A(gmeVar);
                objY4 = bVarI.y();
                if (zA2 || objY4 == c0042a) {
                    objY4 = new b(gmeVar);
                    bVarI.r(objY4);
                }
                xvf.c(gmeVar, (Function1) objY4, bVarI);
                boolean zA3 = bVarI.A(gmeVar);
                if ((i4 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zD = zA3 | z2 | ((i4 & 112) == 32) | bVarI.d(asrVar.ordinal());
                objY5 = bVarI.y();
                if (zD || objY5 == c0042a) {
                    objY5 = new c(gmeVar, function0, yleVar3, asrVar);
                    bVarI.r(objY5);
                }
                bVarI.t((Function0) objY5);
            } else {
                bVarI.G();
                yleVar3 = yleVar2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new d(function0, yleVar3, function2, i, i2);
            }
        }
        i3 |= 48;
        yleVar2 = yleVar;
        if ((i & 384) == 0) {
            if (bVarI.A(function2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        i4 = i3;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i4 & 1, z)) {
            if (i6 != 0) {
                yleVar3 = new yle(false, false, 7);
            } else {
                yleVar3 = yleVar2;
            }
            view = (View) bVarI.O(AndroidCompositionLocals_androidKt.f);
            mmdVar = (mmd) bVarI.O(kna.h);
            asrVar = (asr) bVarI.O(kna.n);
            c0043bJ = bVarI.J();
            ytwVarC = m.c(function2, bVarI);
            Object[] objArr2 = new Object[0];
            objY = bVarI.y();
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = f.a;
                bVarI.r(objY);
            }
            uuid = (UUID) o350.e(objArr2, (Function0) objY, bVarI, 48);
            zM = bVarI.M(view) | bVarI.M(mmdVar);
            objY2 = bVarI.y();
            if (zM) {
                gme gmeVar3 = new gme(function0, yleVar3, view, asrVar, mmdVar, uuid);
                op8 op8Var2 = new op8(346960332, new e(ytwVarC), true);
                qle qleVar2 = gmeVar3.i;
                qleVar2.setParentCompositionContext(c0043bJ);
                ((x5a0) qleVar2.y).setValue(op8Var2);
                qleVar2.C = true;
                qleVar2.d();
                bVarI.r(gmeVar3);
                objY2 = gmeVar3;
            } else {
                gme gmeVar4 = new gme(function0, yleVar3, view, asrVar, mmdVar, uuid);
                op8 op8Var3 = new op8(346960332, new e(ytwVarC), true);
                qle qleVar3 = gmeVar4.i;
                qleVar3.setParentCompositionContext(c0043bJ);
                ((x5a0) qleVar3.y).setValue(op8Var3);
                qleVar3.C = true;
                qleVar3.d();
                bVarI.r(gmeVar4);
                objY2 = gmeVar4;
            }
            gmeVar = (gme) objY2;
            Unit unit2 = Unit.a;
            zA = bVarI.A(gmeVar);
            objY3 = bVarI.y();
            if (zA) {
                objY3 = new a(gmeVar, null);
                bVarI.r(objY3);
            } else {
                objY3 = new a(gmeVar, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, unit2, (Function2) objY3);
            zA2 = bVarI.A(gmeVar);
            objY4 = bVarI.y();
            if (zA2) {
                objY4 = new b(gmeVar);
                bVarI.r(objY4);
            } else {
                objY4 = new b(gmeVar);
                bVarI.r(objY4);
            }
            xvf.c(gmeVar, (Function1) objY4, bVarI);
            boolean zA4 = bVarI.A(gmeVar);
            if ((i4 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            zD = zA4 | z2 | ((i4 & 112) == 32) | bVarI.d(asrVar.ordinal());
            objY5 = bVarI.y();
            if (zD) {
                objY5 = new c(gmeVar, function0, yleVar3, asrVar);
                bVarI.r(objY5);
            } else {
                objY5 = new c(gmeVar, function0, yleVar3, asrVar);
                bVarI.r(objY5);
            }
            bVarI.t((Function0) objY5);
        } else {
            bVarI.G();
            yleVar3 = yleVar2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new d(function0, yleVar3, function2, i, i2);
        }
    }

    public static final void b(androidx.compose.ui.d dVar, Function2 function2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(1090521195);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.A(function2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = x60.a;
                bVarI.r(objY);
            }
            aiv aivVar = (aiv) objY;
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            int i3 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVar, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            function2.invoke(bVarI, Integer.valueOf((i3 >> 6) & 14));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new y60(dVar, function2, i);
        }
    }
}
