package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sporty.android.core.model.OrderBetType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class qwb {
    public static final void a(final twb twbVar, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function2, final Function1<? super String, Unit> function3, final Function1<? super Boolean, Unit> function4, final Function0<Unit> function0, final Function0<Unit> function5, final Function0<Unit> function6, final Function0<Unit> function7, final Function0<Unit> function8, final Function0<Unit> function9, final float f, a aVar, final int i, final int i2) {
        int i3;
        Function1<? super String, Unit> function10;
        Function1<? super String, Unit> function11;
        Function1<? super String, Unit> function12;
        Function1<? super Boolean, Unit> function13;
        Function0<Unit> function14;
        int i4;
        twbVar.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function0.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        function8.getClass();
        function9.getClass();
        b bVarI = aVar.i(1781770654);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? bVarI.M(twbVar) : bVarI.A(twbVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function10 = function1;
            i3 |= bVarI.A(function10) ? 32 : 16;
        } else {
            function10 = function1;
        }
        if ((i & 384) == 0) {
            function11 = function2;
            i3 |= bVarI.A(function11) ? 256 : 128;
        } else {
            function11 = function2;
        }
        if ((i & 3072) == 0) {
            function12 = function3;
            i3 |= bVarI.A(function12) ? 2048 : 1024;
        } else {
            function12 = function3;
        }
        if ((i & 24576) == 0) {
            function13 = function4;
            i3 |= bVarI.A(function13) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            function13 = function4;
        }
        if ((196608 & i) == 0) {
            function14 = function0;
            i3 |= bVarI.A(function14) ? 131072 : 65536;
        } else {
            function14 = function0;
        }
        if ((1572864 & i) == 0) {
            i3 |= bVarI.A(function5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= bVarI.A(function6) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bVarI.A(function7) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bVarI.A(function8) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (bVarI.A(function9) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.c(f) ? 32 : 16;
        }
        int i5 = i3;
        if (!bVarI.q(i5 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            bVarI.G();
        } else if (twbVar instanceof twb.a) {
            bVarI.N(-770675365);
            twb.a aVar2 = (twb.a) twbVar;
            OrderBetType orderBetType = aVar2.a;
            String str = aVar2.b;
            String strA = vch0.a(aVar2.e, bVarI);
            String strA2 = vch0.a(aVar2.c, bVarI);
            String strA3 = vch0.a(aVar2.d, bVarI);
            String str2 = aVar2.f;
            String strA4 = vch0.a(aVar2.h, bVarI);
            String strA5 = vch0.a(aVar2.g, bVarI);
            m980 m980Var = aVar2.i;
            boolean z = (m980Var instanceof m980.f) || (m980Var instanceof m980.g);
            oxb.c(orderBetType, str, strA, strA2, strA3, aVar2.o, str2, strA4, vch0.a(aVar2.n, bVarI), m980Var, z, aVar2.k, aVar2.l, aVar2.m, aVar2.p, aVar2.j, function10, function11, function12, function13, function14, function5, function6, strA5, bVarI, 1073741824, (i5 << 15) & 2146959360, (i5 >> 15) & 1022);
            bVarI.X(false);
        } else if (twbVar instanceof twb.d) {
            bVarI.N(-769217187);
            twb.d dVar = (twb.d) twbVar;
            sbg.a(dVar.a, dVar.b, vch0.a(dVar.c, bVarI), bVarI, 0);
            bVarI.X(false);
        } else if (twbVar instanceof twb.f) {
            bVarI.N(-768918626);
            twb.f fVar = (twb.f) twbVar;
            yee0.a(vch0.a(fVar.c, bVarI), vch0.a(fVar.d, bVarI), vch0.a(fVar.e, bVarI), fVar.f, fVar.g, vch0.a(fVar.h, bVarI), fVar.i, function8, function7, bVarI, ((i5 >> 6) & 29360128) | (i5 & 234881024));
            bVarI.X(false);
        } else if (twbVar instanceof twb.b) {
            bVarI.N(-768285699);
            twb.b bVar = (twb.b) twbVar;
            OrderBetType orderBetType2 = bVar.a;
            String strA6 = vch0.a(bVar.g, bVarI);
            String strA7 = vch0.a(bVar.f, bVarI);
            q3g.c(orderBetType2, bVar.n, strA6, vch0.a(bVar.m, bVarI), bVar.j, bVar.k, bVar.l, bVar.o, bVar.i, function1, function2, function3, function4, function0, function5, function6, function9, strA7, bVarI, (i5 << 24) & 1879048192, ((i5 >> 6) & 524286) | (3670016 & (i4 << 18)));
            bVarI.X(false);
        } else if (twbVar instanceof twb.e) {
            bVarI.N(-767241960);
            bVarI.X(false);
        } else {
            if (!(twbVar instanceof twb.c)) {
                throw igf0.a(bVarI, -1410333964, false);
            }
            bVarI.N(-767183990);
            pbg.a(f, bVarI, (i4 >> 3) & 14);
            bVarI.X(false);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pwb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    qwb.a(twbVar, function1, function2, function3, function4, function0, function5, function6, function7, function8, function9, f, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }
}
