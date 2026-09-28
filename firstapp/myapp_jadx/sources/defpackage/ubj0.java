package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import java.io.FileNotFoundException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class ubj0 {
    public static final void a(final yfj0 yfj0Var, final Function0 function0, final Function0 function1, final Function0 function2, final Function0 function3, final Function0 function4, final Function0 function5, final Function0 function6, final Function0 function7, final Function1 function8, final i4f.a aVar, a aVar2, final int i) {
        yfj0Var.getClass();
        function8.getClass();
        b bVarI = aVar2.i(-1677520653);
        int i2 = i | (bVarI.A(yfj0Var) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function4) ? 131072 : 65536) | (bVarI.A(function5) ? 1048576 : 524288) | (bVarI.A(function6) ? 8388608 : 4194304) | (bVarI.A(function7) ? 67108864 : 33554432) | (bVarI.A(function8) ? 536870912 : 268435456);
        if (bVarI.q(i2 & 1, ((306783379 & i2) == 306783378 && ((bVarI.M(aVar) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            o0z.a(null, null, null, null, null, pp8.b(1485686882, new Function2() { // from class: sbj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        yfj0 yfj0Var2 = yfj0Var;
                        boolean z = yfj0Var2 instanceof yfj0.b;
                        d.a aVar4 = d.a.b;
                        Function0 function9 = function0;
                        Function0 function10 = function1;
                        Function0 function11 = function2;
                        if (z) {
                            aVar3.N(1815953795);
                            dfj0.a(j.g(aVar4, 1.0f), (yfj0.b) yfj0Var2, function9, function10, function11, aVar3, 70);
                            aVar3.H();
                        } else if (yfj0Var2 instanceof yfj0.c) {
                            aVar3.N(1815964450);
                            egj0.a(j.g(aVar4, 1.0f), (yfj0.c) yfj0Var2, function9, function10, function11, aVar3, 70);
                            aVar3.H();
                        } else {
                            if (!(yfj0Var2 instanceof yfj0.a)) {
                                throw rg.a(1815953056, aVar3);
                            }
                            aVar3.N(460675915);
                            edj0.a(j.g(aVar4, 1.0f), (yfj0.a) yfj0Var2, function9, function10, function11, function3, function4, function7, function5, function6, function8, aVar, aVar3, 70, 0, 0);
                            aVar3.H();
                        }
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196608);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, function3, function4, function5, function6, function7, function8, aVar, i) { // from class: tbj0
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 v;
                public final /* synthetic */ Function0 w;
                public final /* synthetic */ Function1 y;
                public final /* synthetic */ i4f.a z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    ubj0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
