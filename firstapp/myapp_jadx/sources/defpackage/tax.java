package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.j;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class tax {

    @c0d(c = "com.sportygames.nightnday.presentation.ui.NNDPointerKt$Content$1$1", f = "NNDPointer.kt", l = {70}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ uax.a b;
        public final /* synthetic */ gzg0<Float> c;
        public final /* synthetic */ Function0<Unit> d;
        public final /* synthetic */ isw e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(uax.a aVar, gzg0<Float> gzg0Var, Function0<Unit> function0, isw iswVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
            this.c = gzg0Var;
            this.d = function0;
            this.e = iswVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            a aVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                uax.a aVar2 = this.b;
                boolean z = aVar2.b;
                isw iswVar = this.e;
                if (!z) {
                    iswVar.A(aVar2.a);
                }
                float f = aVar2.a;
                sax saxVar = new sax(iswVar);
                this.a = 1;
                aVar = this;
                if (sje0.c(0.0f, f, 0.0f, this.c, saxVar, aVar, 4) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                aVar = this;
            }
            aVar.d.invoke();
            return Unit.a;
        }
    }

    public static final void a(final d dVar, final float f, uax.a aVar, final Function0<Unit> function0, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        Function0<Unit> function1;
        uax.a aVar3;
        isw iswVar;
        b bVarI = aVar2.i(380315972);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function1 = function0;
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        } else {
            function1 = function0;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = j.a(0.0f);
                bVarI.r(objY);
            }
            isw iswVar2 = (isw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = yi0.e(1500, 0, xkf.a, 2);
                bVarI.r(objY2);
            }
            gzg0 gzg0Var = (gzg0) objY2;
            boolean z = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objY3 = bVarI.y();
            if (z || objY3 == c0042a) {
                iswVar = iswVar2;
                aVar3 = aVar;
                a aVar4 = new a(aVar3, gzg0Var, function1, iswVar, null);
                bVarI.r(aVar4);
                objY3 = aVar4;
            } else {
                iswVar = iswVar2;
                aVar3 = aVar;
            }
            xvf.e(bVarI, aVar3, (Function2) objY3);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            float fJ = iswVar.j();
            d.a aVar6 = d.a.b;
            c(f, i3 & 112, bVarI, p1a.a(aVar6, fJ));
            mw90.a(com.sportygames.newcms.c.c(shj.v0.I, new String[0], bVarI), "pointer", androidx.compose.foundation.layout.j.r(aVar6, 32.0f * f), null, null, null, null, bVarI, 48, 2040);
            bVarI.X(true);
        } else {
            aVar3 = aVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final uax.a aVar7 = aVar3;
            eVarZ.d = new Function2() { // from class: qax
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tax.a(dVar, f, aVar7, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d dVar, float f, uax.a aVar, Function0<Unit> function0, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        final Function0<Unit> function1;
        final uax.a aVar3;
        final float f2;
        final d dVar2;
        dVar.getClass();
        function0.getClass();
        b bVarI = aVar2.i(-420275288);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d dVarE = androidx.compose.foundation.layout.j.e(d.a.b, 1.0f);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            a(dVar, f, aVar, function0, bVarI, i2 & 8190);
            dVar2 = dVar;
            f2 = f;
            aVar3 = aVar;
            function1 = function0;
            bVarI.X(true);
        } else {
            function1 = function0;
            aVar3 = aVar;
            f2 = f;
            dVar2 = dVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pax
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tax.b(dVar2, f2, aVar3, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final float f, final int i, androidx.compose.runtime.a aVar, final d dVar) {
        int i2;
        b bVarI = aVar.i(1617678462);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.c(f) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            mw90.a(com.sportygames.newcms.c.c(shj.v0.H, new String[0], bVarI), "pointer", androidx.compose.foundation.layout.j.i(androidx.compose.foundation.layout.j.w(dVar, 98.0f * f), 162.0f * f), null, null, d0b.a.g, null, bVarI, 1572912, 1976);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: rax
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    tax.c(f, iA, (a) obj, dVar);
                    return Unit.a;
                }
            };
        }
    }
}
