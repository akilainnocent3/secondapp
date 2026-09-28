package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportygames.crash.models.BetComponentColors;
import com.sportygames.crash.remote.models.DetailResponse;
import com.sportygames.crash.remote.models.MultiplierResponse;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class u51 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final float f, final float f2, final float f3, final float f4, final float f5, final float f6, final float f7, final float f8, float f9, final float f10, final double d, final boolean z, final boolean z2, final t290 t290Var, final BetComponentColors betComponentColors, final cj5 cj5Var, final boolean z3, final boolean z4, final boolean z5, final int i, final int i2, final boolean z6, final fsw fswVar, final ytw ytwVar, final ytw ytwVar2, final ytw ytwVar3, final ytw ytwVar4, final DetailResponse detailResponse, final Function2 function2, final Function1 function1, final Function1 function3, final Function1 function4, final Function2 function5, final Function0 function0, final Function0 function6, final boolean z7, final osw oswVar, final l1z l1zVar, final long j, final MultiplierResponse multiplierResponse, final String str, final boolean z8, final boolean z9, final boolean z10, final boolean z11, a aVar, final int i3) {
        float f11;
        t290Var.getClass();
        fswVar.getClass();
        ytwVar.getClass();
        ytwVar3.getClass();
        ytwVar4.getClass();
        detailResponse.getClass();
        function2.getClass();
        function1.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function0.getClass();
        function6.getClass();
        l1zVar.getClass();
        multiplierResponse.getClass();
        b bVarI = aVar.i(-671789522);
        int i4 = i3 | (bVarI.c(f) ? 32 : 16) | (bVarI.M(null) ? 256 : 128) | (bVarI.c(f2) ? 2048 : 1024);
        boolean zC = bVarI.c(f3);
        int i5 = Http2.INITIAL_MAX_FRAME_SIZE;
        int i6 = i4 | (zC ? 16384 : 8192) | (bVarI.c(f4) ? 131072 : 65536) | (bVarI.c(f5) ? 1048576 : 524288) | (bVarI.c(f6) ? 8388608 : 4194304) | (bVarI.c(f7) ? 67108864 : 33554432) | (bVarI.c(f8) ? 536870912 : 268435456);
        int i7 = (bVarI.c(f9) ? 4 : 2) | (bVarI.c(f10) ? 32 : 16) | (bVarI.f(d) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.b(z2) ? 16384 : 8192) | (bVarI.A(t290Var) ? 131072 : 65536) | (bVarI.M(betComponentColors) ? 1048576 : 524288) | (bVarI.A(cj5Var) ? 8388608 : 4194304) | (bVarI.b(z3) ? 67108864 : 33554432) | (bVarI.b(z4) ? 536870912 : 268435456);
        int i8 = 14352384 | (bVarI.b(z5) ? 4 : 2) | (bVarI.d(i) ? 32 : 16) | (bVarI.d(i2) ? 256 : 128) | (bVarI.b(z6) ? 2048 : 1024) | (bVarI.M(fswVar) ? 16384 : 8192) | (bVarI.M(ytwVar4) ? 67108864 : 33554432) | (bVarI.A(detailResponse) ? 536870912 : 268435456);
        int i9 = (bVarI.A(function2) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function3) ? 256 : 128) | (bVarI.A(function4) ? 2048 : 1024) | (bVarI.A(function5) ? 16384 : 8192) | (bVarI.A(function0) ? 131072 : 65536) | (bVarI.A(function6) ? 1048576 : 524288) | (bVarI.b(z7) ? 8388608 : 4194304) | (bVarI.M(oswVar) ? 67108864 : 33554432) | (bVarI.A(l1zVar) ? 536870912 : 268435456);
        int i10 = (bVarI.e(j) ? 4 : 2) | (bVarI.M(multiplierResponse) ? 32 : 16) | (bVarI.M(str) ? 256 : 128) | (bVarI.b(z8) ? 2048 : 1024);
        if (!bVarI.b(z9)) {
            i5 = 8192;
        }
        int i11 = i10 | i5 | (bVarI.b(z10) ? 131072 : 65536) | (bVarI.b(z11) ? 1048576 : 524288);
        if (bVarI.q(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 306783379) == 306783378 && (i8 & 306783379) == 306783378 && (i9 & 306783379) == 306783378 && (599187 & i11) == 599186) ? false : true)) {
            bVarI.A0();
            if ((i3 & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            int i12 = i11 << 3;
            int i13 = i7 << 6;
            int i14 = i13 & 458752;
            int i15 = (i12 & 896) | ((i9 >> 27) & 14) | (i12 & 112) | ((i8 << 9) & 7168) | ((i9 >> 9) & 57344) | i14 | ((i11 << 21) & 1879048192);
            int i16 = i7 >> 15;
            ya1.a(l1zVar, j, multiplierResponse, z5, z7, z, ((Boolean) ytwVar2.getValue()).booleanValue(), !z, (((Boolean) ytwVar2.getValue()).booleanValue() || z5 || z7 || z) ? false : true, str, Integer.valueOf(detailResponse.getBetIndex()), Double.valueOf(detailResponse.getMinAmount()), CollectionsKt.A0(detailResponse.getDefaultChips()), Boolean.valueOf(z3), bVarI, i15, i16 & 7168);
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            if (f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            d dVarN = dVarG.n(new LayoutWeightElement(f <= Float.MAX_VALUE ? f : Float.MAX_VALUE, true));
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.m());
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
            d dVarC2 = j.c(j.g(aVar2, 1.0f), 1.0f);
            kw0.c cVar2 = kw0.e;
            n54.b bVar2 = ht.a.j;
            d160 d160VarA = b160.a(cVar2, bVar2, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.m());
            ne00 ne00VarS2 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarC2);
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
            hlh0.a(bVarI, dVarC3, cVar);
            f160 f160Var = f160.a;
            ty0.a(bVarI, f160Var.a(1.5f, aVar2, true));
            d dVarB = f160Var.b(f160Var.a(5.2f, aVar2, true), bVar2);
            bVarI.N(940559367);
            float fB = lla.b(((float) d) * 0.02f, bVarI);
            bVarI.X(false);
            d dVarK = j.k(h.j(dVarB, 0.0f, fB, 0.0f, 0.0f, 13), f7, 0.0f, 2);
            kw0.j jVar = kw0.a;
            n54.b bVar3 = ht.a.k;
            d160 d160VarA2 = b160.a(jVar, bVar3, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.m());
            ne00 ne00VarS3 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarK);
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
            hlh0.a(bVarI, dVarC4, cVar);
            d dVarD = j.D(aVar2, null, 3);
            d160 d160VarA3 = b160.a(jVar, bVar3, bVarI, 54);
            int iHashCode4 = Long.hashCode(bVarI.m());
            ne00 ne00VarS4 = bVarI.S();
            d dVarC5 = c.c(bVarI, dVarD);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC5, cVar);
            int i17 = (i7 << 3) & 3670016;
            int i18 = (i8 >> 6) & 29360128;
            int i19 = i13 & 234881024;
            int i20 = i13 & 1879048192;
            int i21 = i11 << 15;
            c61.a(fswVar, ytwVar, ytwVar2, ytwVar3, ytwVar4, z, t290Var, detailResponse, betComponentColors, cj5Var, z2, function2, function3, function4, function5, function0, function6, oswVar, z8, z9, f3, f4, f5, z11, bVarI, ((i8 >> 12) & 65534) | i14 | i17 | i18 | i19 | i20, ((i7 >> 12) & 14) | ((i9 << 3) & 112) | (i9 & 896) | (i9 & 7168) | (i9 & 57344) | (i9 & 458752) | (i9 & 3670016) | ((i9 >> 3) & 29360128) | (i21 & 234881024) | (i21 & 1879048192), ((i6 >> 12) & 1022) | ((i11 >> 9) & 7168));
            ty0.a(bVarI, j.w(aVar2, f2));
            int i22 = i8 >> 9;
            int i23 = i17 | (i8 & 14) | (i22 & 112) | 28032 | (i22 & 458752) | i18 | i19 | i20;
            int i24 = i6 << 3;
            int i25 = (i9 & WebSocketProtocol.PAYLOAD_SHORT) | ((i9 >> 15) & 896) | (i11 & 7168) | (i11 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128);
            int i26 = i11 << 9;
            fc1.a(z5, fswVar, ytwVar, ytwVar2, ytwVar3, ytwVar4, t290Var, detailResponse, betComponentColors, cj5Var, function2, function1, z7, z8, z9, f3, f4, f5, z10, z11, bVarI, i23, i25 | (i26 & 234881024) | (i26 & 1879048192));
            bVarI.X(true);
            f11 = f9;
            ty0.a(bVarI, j.w(aVar2, f11));
            int i27 = i7 >> 18;
            int i28 = 6 | (i16 & 112) | (i27 & 896) | (i27 & 7168);
            int i29 = i8 << 12;
            int i30 = i28 | (i29 & 57344) | (i29 & 458752) | (i29 & 3670016) | (i29 & 29360128) | (i29 & 234881024) | 805306368;
            int i31 = i9 << 12;
            int i32 = i6 >> 3;
            oc1.a(betComponentColors, z3, z4, z5, i, i2, z6, fswVar, ytwVar, ytwVar2, ytwVar3, ytwVar4, detailResponse, function2, function1, f6, f7, f8, f10, z10, z11, bVarI, i30, ((i8 >> 18) & 8190) | (i31 & 57344) | (i31 & 458752) | (3670016 & i32) | (i32 & 29360128) | (i32 & 234881024) | ((i7 << 24) & 1879048192), (i11 >> 15) & WebSocketProtocol.PAYLOAD_SHORT);
            bVarI = bVarI;
            f30.a(bVarI, true, true, true);
        } else {
            f11 = f9;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final float f12 = f11;
            eVarZ.d = new Function2(f, f2, f3, f4, f5, f6, f7, f8, f12, f10, d, z, z2, t290Var, betComponentColors, cj5Var, z3, z4, z5, i, i2, z6, fswVar, ytwVar, ytwVar2, ytwVar3, ytwVar4, detailResponse, function2, function1, function3, function4, function5, function0, function6, z7, oswVar, l1zVar, j, multiplierResponse, str, z8, z9, z10, z11, i3) { // from class: t51
                public final /* synthetic */ boolean A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ t290 C;
                public final /* synthetic */ BetComponentColors D;
                public final /* synthetic */ cj5 E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ int I;
                public final /* synthetic */ int J;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ fsw L;
                public final /* synthetic */ ytw M;
                public final /* synthetic */ ytw N;
                public final /* synthetic */ ytw O;
                public final /* synthetic */ ytw P;
                public final /* synthetic */ DetailResponse Q;
                public final /* synthetic */ Function2 R;
                public final /* synthetic */ Function1 S;
                public final /* synthetic */ Function1 T;
                public final /* synthetic */ Function1 U;
                public final /* synthetic */ Function2 V;
                public final /* synthetic */ Function0 W;
                public final /* synthetic */ Function0 X;
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ osw Z;
                public final /* synthetic */ float a;
                public final /* synthetic */ l1z a0;
                public final /* synthetic */ float b;
                public final /* synthetic */ long b0;
                public final /* synthetic */ float c;
                public final /* synthetic */ MultiplierResponse c0;
                public final /* synthetic */ float d;
                public final /* synthetic */ String d0;
                public final /* synthetic */ float e;
                public final /* synthetic */ boolean e0;
                public final /* synthetic */ float f;
                public final /* synthetic */ boolean f0;
                public final /* synthetic */ boolean g0;
                public final /* synthetic */ boolean h0;
                public final /* synthetic */ float i;
                public final /* synthetic */ float v;
                public final /* synthetic */ float w;
                public final /* synthetic */ float y;
                public final /* synthetic */ double z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    u51.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
