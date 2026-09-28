package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportygames.crash.remote.models.DetailResponse;
import com.sportygames.crash.remote.models.MultiplierResponse;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s51 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z, final boolean z2, final boolean z3, final int i, final int i2, final boolean z4, final boolean z5, final ytw ytwVar, final boolean z6, final ytw ytwVar2, final ytw ytwVar3, final mz1 mz1Var, final cj5 cj5Var, final ytw ytwVar4, final t290 t290Var, final fsw fswVar, final ytw ytwVar5, final ytw ytwVar6, final DetailResponse detailResponse, final Function2 function2, final Function1 function1, final Function2 function3, final Function1 function4, final Function1 function5, final Function0 function0, final Function0 function6, final float f, final float f2, final float f3, final String str, final int i3, final l1z l1zVar, final long j, final MultiplierResponse multiplierResponse, final osw oswVar, final boolean z7, final boolean z8, a aVar, final int i4) {
        ytwVar2.getClass();
        mz1Var.getClass();
        cj5Var.getClass();
        ytwVar4.getClass();
        t290Var.getClass();
        fswVar.getClass();
        ytwVar5.getClass();
        ytwVar6.getClass();
        function2.getClass();
        function1.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function0.getClass();
        function6.getClass();
        str.getClass();
        l1zVar.getClass();
        multiplierResponse.getClass();
        b bVarI = aVar.i(-719832742);
        int i5 = i4 | (bVarI.b(z) ? 32 : 16) | (bVarI.b(z2) ? 256 : 128) | (bVarI.b(z3) ? 2048 : 1024) | (bVarI.d(i) ? 16384 : 8192) | (bVarI.d(i2) ? 131072 : 65536) | (bVarI.b(z4) ? 1048576 : 524288) | (bVarI.b(z5) ? 8388608 : 4194304) | (bVarI.b(z6) ? 536870912 : 268435456);
        int i6 = 114843702 | (bVarI.A(mz1Var) ? 256 : 128) | (bVarI.A(cj5Var) ? 2048 : 1024) | (bVarI.A(t290Var) ? 131072 : 65536) | (bVarI.A(detailResponse) ? 536870912 : 268435456);
        int i7 = (bVarI.A(function2) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function3) ? 256 : 128) | (bVarI.A(function4) ? 2048 : 1024) | (bVarI.A(function5) ? 16384 : 8192) | (bVarI.A(function0) ? 131072 : 65536) | (bVarI.A(function6) ? 1048576 : 524288) | (bVarI.c(f) ? 8388608 : 4194304) | (bVarI.b(false) ? 67108864 : 33554432) | (bVarI.c(f2) ? 536870912 : 268435456);
        int i8 = (bVarI.c(f3) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.d(i3) ? 256 : 128) | (bVarI.A(l1zVar) ? 2048 : 1024) | (bVarI.e(j) ? 16384 : 8192) | (bVarI.M(multiplierResponse) ? 131072 : 65536) | (bVarI.M(oswVar) ? 1048576 : 524288) | (bVarI.b(z7) ? 8388608 : 4194304) | (bVarI.b(z8) ? 67108864 : 33554432);
        if (bVarI.q(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 306783379) == 306783378 && (i7 & 306783379) == 306783378 && (i8 & 38347923) == 38347922) ? false : true)) {
            int i9 = i5 >> 9;
            ya1.a(l1zVar, j, multiplierResponse, z4, z5, ((Boolean) ytwVar4.getValue()).booleanValue(), ((Boolean) ytwVar3.getValue()).booleanValue(), !((Boolean) ytwVar4.getValue()).booleanValue(), (((Boolean) ytwVar3.getValue()).booleanValue() || z4 || z5 || ((Boolean) ytwVar4.getValue()).booleanValue()) ? false : true, str, Integer.valueOf(i3), Double.valueOf(detailResponse.getMinAmount()), CollectionsKt.A0(detailResponse.getDefaultChips()), Boolean.valueOf(z3), bVarI, (i9 & 57344) | (i9 & 7168) | ((i8 >> 9) & 1022) | ((i8 << 24) & 1879048192), ((i8 >> 6) & 14) | (i5 & 7168));
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            float f4 = f + f2 + f3;
            if (f4 <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (f4 > Float.MAX_VALUE) {
                f4 = Float.MAX_VALUE;
            }
            d dVarN = dVarG.n(new LayoutWeightElement(f4, true));
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarN);
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
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarE = j.e(aVar2, 1.0f);
            kw0.c cVar2 = kw0.e;
            n54.b bVar2 = ht.a.j;
            d160 d160VarA = b160.a(cVar2, bVar2, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarE);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            if (5.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(5.0f <= Float.MAX_VALUE ? 5.0f : Float.MAX_VALUE, true);
            d160 d160VarA2 = b160.a(kw0.g, bVar2, bVarI, 6);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, layoutWeightElement);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = m.b(null);
                bVarI.r(objY);
            }
            hna.a(zva.a.a((ytw) objY), pp8.b(-911206900, new Function2() { // from class: q51
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ytw ytwVar7 = ytwVar;
                        boolean z9 = z6;
                        ytw ytwVar8 = ytwVar2;
                        ytw ytwVar9 = ytwVar3;
                        mz1 mz1Var2 = mz1Var;
                        cj5 cj5Var2 = cj5Var;
                        ytw ytwVar10 = ytwVar4;
                        t290 t290Var2 = t290Var;
                        fsw fswVar2 = fswVar;
                        ytw ytwVar11 = ytwVar5;
                        ytw ytwVar12 = ytwVar6;
                        DetailResponse detailResponse2 = detailResponse;
                        Function2 function7 = function2;
                        Function1 function8 = function1;
                        Function2 function9 = function3;
                        Function1 function10 = function4;
                        Function0 function11 = function0;
                        Function0 function12 = function6;
                        String str2 = str;
                        int i10 = i3;
                        osw oswVar2 = oswVar;
                        boolean z10 = z7;
                        boolean z11 = z8;
                        h91.a(ytwVar7, z9, ytwVar8, ytwVar9, mz1Var2, cj5Var2, ytwVar10, t290Var2, fswVar2, ytwVar11, ytwVar12, detailResponse2, function7, function8, function9, function10, function11, function12, str2, i10, oswVar2, z10, z11, aVar4, 0);
                        ty0.a(aVar4, j.w(d.a.b, 4.0f));
                        ic1.a(z4, z5, ((Boolean) ytwVar10.getValue()).booleanValue(), ytwVar7, ytwVar8, ytwVar9, mz1Var2, cj5Var2, t290Var2, fswVar2, ytwVar11, ytwVar12, detailResponse2, function7, function5, str2, i10, z10, z11, aVar4, 0);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 56);
            bVarI.X(true);
            int i10 = i6 << 6;
            int i11 = i5 << 15;
            cc1.a(ytwVar, ytwVar2, ytwVar3, mz1Var, cj5Var, z3, z2, z4, i, i2, z, fswVar, ytwVar5, ytwVar6, detailResponse, function5, function2, z7, bVarI, (i10 & 458752) | 3510 | (i10 & 57344) | ((i5 << 9) & 3670016) | (i11 & 29360128) | ((i5 << 6) & 234881024) | (i11 & 1879048192), ((i5 >> 15) & 14) | (i5 & 112) | 28032 | ((i6 >> 12) & 458752) | ((i7 << 6) & 3670016) | ((i7 >> 3) & 29360128) | ((i7 << 24) & 234881024) | ((i8 << 6) & 1879048192));
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, z2, z3, i, i2, z4, z5, ytwVar, z6, ytwVar2, ytwVar3, mz1Var, cj5Var, ytwVar4, t290Var, fswVar, ytwVar5, ytwVar6, detailResponse, function2, function1, function3, function4, function5, function0, function6, f, f2, f3, str, i3, l1zVar, j, multiplierResponse, oswVar, z7, z8, i4) { // from class: r51
                public final /* synthetic */ mz1 A;
                public final /* synthetic */ cj5 B;
                public final /* synthetic */ ytw C;
                public final /* synthetic */ t290 D;
                public final /* synthetic */ fsw E;
                public final /* synthetic */ ytw F;
                public final /* synthetic */ ytw G;
                public final /* synthetic */ DetailResponse H;
                public final /* synthetic */ Function2 I;
                public final /* synthetic */ Function1 J;
                public final /* synthetic */ Function2 K;
                public final /* synthetic */ Function1 L;
                public final /* synthetic */ Function1 M;
                public final /* synthetic */ Function0 N;
                public final /* synthetic */ Function0 O;
                public final /* synthetic */ float P;
                public final /* synthetic */ float Q;
                public final /* synthetic */ float R;
                public final /* synthetic */ String S;
                public final /* synthetic */ int T;
                public final /* synthetic */ l1z U;
                public final /* synthetic */ long V;
                public final /* synthetic */ MultiplierResponse W;
                public final /* synthetic */ osw X;
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ boolean Z;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ ytw v;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ ytw y;
                public final /* synthetic */ ytw z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(100663303);
                    s51.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
