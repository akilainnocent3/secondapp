package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class edj0 {
    public static final void a(d dVar, final yfj0.a aVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final Function0<Unit> function3, final Function0<Unit> function4, final Function0<Unit> function5, final Function0<Unit> function6, final Function0<Unit> function7, final Function1<? super String, Unit> function8, final ssd0 ssd0Var, a aVar2, final int i, final int i2, final int i3) {
        d dVar2;
        int i4;
        Function0<Unit> function9;
        Function0<Unit> function10;
        Function0<Unit> function11;
        Function0<Unit> function12;
        int i5;
        final d dVar3;
        aVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        function8.getClass();
        b bVarI = aVar2.i(-1189428465);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i4 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i4 = i;
        }
        int i7 = i4 | (bVarI.A(aVar) ? 32 : 16);
        if ((i & 384) == 0) {
            function9 = function0;
            i7 |= bVarI.A(function9) ? 256 : 128;
        } else {
            function9 = function0;
        }
        if ((i & 3072) == 0) {
            function10 = function1;
            i7 |= bVarI.A(function10) ? 2048 : 1024;
        } else {
            function10 = function1;
        }
        if ((i & 24576) == 0) {
            function11 = function2;
            i7 |= bVarI.A(function11) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            function11 = function2;
        }
        if ((196608 & i) == 0) {
            i7 |= bVarI.A(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            function12 = function4;
            i7 |= bVarI.A(function12) ? 1048576 : 524288;
        } else {
            function12 = function4;
        }
        if ((i & 12582912) == 0) {
            i7 |= bVarI.A(function5) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i7 |= bVarI.A(function6) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i7 |= bVarI.A(function7) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (bVarI.A(function8) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i8 = i5 | (bVarI.M(ssd0Var) ? 32 : 16);
        if (bVarI.q(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 19) == 18) ? false : true)) {
            d dVar4 = i6 != 0 ? d.a.b : dVar2;
            rcj0 rcj0Var = aVar.a;
            if (Intrinsics.g(rcj0Var, rcj0.a.a)) {
                bVarI.N(-782617798);
                ycj0.a((i7 & 14) | ((i7 >> 24) & 112), bVarI, dVar4, function7);
                bVarI.X(false);
            } else if (Intrinsics.g(rcj0Var, rcj0.b.a)) {
                bVarI.N(-782406812);
                bdj0.c(dVar4, bVarI, i7 & 14);
                bVarI.X(false);
            } else {
                if (!(rcj0Var instanceof rcj0.c)) {
                    throw igf0.a(bVarI, -579437073, false);
                }
                bVarI.N(-782245891);
                cej0.f(dVar4, ((rcj0.c) rcj0Var).a, function9, function10, function11, function3, function12, function5, function6, function8, ssd0Var, bVarI, (i7 & 14) | (mdj0.u << 3) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7) | ((i8 << 27) & 1879048192), (i8 >> 3) & 14);
                bVarI.X(false);
            }
            dVar3 = dVar4;
        } else {
            bVarI.G();
            dVar3 = dVar2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ddj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    edj0.a(dVar3, aVar, function0, function1, function2, function3, function4, function5, function6, function7, function8, ssd0Var, (a) obj, iA, iA2, i3);
                    return Unit.a;
                }
            };
        }
    }
}
