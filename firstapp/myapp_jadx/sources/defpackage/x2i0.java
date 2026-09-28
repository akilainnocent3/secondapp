package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportygames.crash.models.header.CrashHeaderState;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class x2i0 {
    public static final Set<String> a = ay0.V(new String[]{"sporty-jet", "galaxy-go", "sporty-kick", "sporty-skills", "crazy-rider", "sporty-hero"});

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final String str2, final mz1 mz1Var, final cj5 cj5Var, final ip8 ip8Var, final float f, final Function0 function0, final Function0 function1, final Function0 function2, final Function0 function3, final Function0 function4, final Function0 function5, long j, final boolean z, a aVar, final int i, final int i2) {
        int i3;
        b bVar;
        final long j2;
        boolean z2;
        str.getClass();
        str2.getClass();
        ip8Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        b bVarI = aVar.i(-1338840930);
        int i4 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.A(mz1Var) ? 256 : 128) | (bVarI.A(cj5Var) ? 2048 : 1024) | (bVarI.A(ip8Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if ((i & 196608) == 0) {
            i4 |= bVarI.c(f) ? 131072 : 65536;
        }
        int i5 = 16;
        int i6 = i4 | (bVarI.A(function0) ? 1048576 : 524288) | (bVarI.A(function1) ? 8388608 : 4194304) | (bVarI.A(function2) ? 67108864 : 33554432) | (bVarI.A(function3) ? 536870912 : 268435456);
        int i7 = bVarI.A(function4) ? 4 : 2;
        if (bVarI.A(function5)) {
            i5 = 32;
        }
        int i8 = i7 | i5;
        int i9 = i2 & 4096;
        if (i9 != 0) {
            i3 = i8 | 384;
        } else {
            i3 = i8 | (bVarI.e(j) ? 256 : 128);
        }
        int i10 = i3 | (bVarI.b(z) ? 2048 : 1024);
        if (bVarI.q(i6 & 1, ((i6 & 306783379) == 306783378 && (i10 & 1171) == 1170) ? false : true)) {
            long j3 = i9 != 0 ? j58.l : j;
            ytw ytwVarC = wyh.c(ip8Var.A, bVarI, 0, 7);
            ytw<Boolean> ytwVar = ip8Var.y;
            Set<String> set = a;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    } else if (str.equalsIgnoreCase((String) it.next())) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarB = androidx.compose.foundation.a.b(j.c(j.g(aVar2, 1.0f), 1.0f), j58.l, zk40.a);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarB);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String currencyValue = ((CrashHeaderState) ytwVarC.getValue()).getCurrencyValue();
            String currencyCode = ((CrashHeaderState) ytwVarC.getValue()).getCurrencyCode();
            boolean zIsChatEnable = ((CrashHeaderState) ytwVarC.getValue()).isChatEnable();
            boolean toShowRedDot = ((CrashHeaderState) ytwVarC.getValue()).getToShowRedDot();
            boolean headerVisibility = ((CrashHeaderState) ytwVarC.getValue()).getHeaderVisibility();
            boolean rainVisibility = ((CrashHeaderState) ytwVarC.getValue()).getRainVisibility();
            boolean zBooleanValue = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
            boolean zEqualsIgnoreCase = str.equalsIgnoreCase("sporty-hero");
            int i11 = i6 << 9;
            int i12 = i6 >> 3;
            int i13 = (64512 & i11) | (i12 & 3670016) | (i12 & 29360128);
            int i14 = i6 << 6;
            int i15 = i13 | (i14 & 234881024) | (i6 & 1879048192);
            int i16 = (i10 & WebSocketProtocol.PAYLOAD_SHORT) | (i11 & 458752) | (i11 & 3670016) | (i14 & 29360128);
            int i17 = i10 << 18;
            pda.b(currencyValue, currencyCode, zIsChatEnable, str, str2, toShowRedDot, function1, function2, function0, function3, function4, function5, headerVisibility, rainVisibility, mz1Var, cj5Var, f, j3, z, zBooleanValue, zEqualsIgnoreCase, z2, bVarI, i15, i16 | (i17 & 234881024) | (i17 & 1879048192));
            bVar = bVarI;
            bVar.X(true);
            bVar.X(true);
            j2 = j3;
        } else {
            bVar = bVarI;
            bVar.G();
            j2 = j;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: w2i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    x2i0.a(str, str2, mz1Var, cj5Var, ip8Var, f, function0, function1, function2, function3, function4, function5, j2, z, (a) obj, iA, i2);
                    return Unit.a;
                }
            };
        }
    }
}
