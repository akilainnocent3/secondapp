package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes8.dex */
public final class snd0 {
    public static final void a(final long j, final tnd0 tnd0Var, final String str, final Function0<Unit> function0, final long j2, a aVar, final int i) {
        function0.getClass();
        b bVarI = aVar.i(-85895555);
        int i2 = i | (bVarI.e(j) ? 4 : 2) | (bVarI.M(str) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.e(j2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            mez.a(tnd0Var == tnd0.b ? new kod0(260.0f, 550.0f, 48.0f, 61.0f, (int) (j >> 32), (int) (j & 4294967295L), (int) (j2 >> 32), (int) (j2 & 4294967295L), 768) : new kod0(40.0f, 550.0f, 48.0f, 61.0f, (int) (j >> 32), (int) (j & 4294967295L), 0.0f, 0.0f, 960), pp8.b(-750744126, new iaj() { // from class: qnd0
                @Override // defpackage.iaj
                public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i3;
                    g7f g7fVar = (g7f) obj;
                    g7f g7fVar2 = (g7f) obj2;
                    a aVar2 = (a) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if ((iIntValue & 6) == 0) {
                        i3 = (aVar2.c(g7fVar.a) ? 4 : 2) | iIntValue;
                    } else {
                        i3 = iIntValue;
                    }
                    if ((iIntValue & 48) == 0) {
                        i3 |= aVar2.c(g7fVar2.a) ? 32 : 16;
                    }
                    if (aVar2.q(i3 & 1, (i3 & 147) != 146)) {
                        float f = g7fVar.a;
                        float f2 = g7fVar2.a;
                        d.a aVar3 = d.a.b;
                        d dVarT = j.t(aVar3, f, f2);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarT);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        d dVarE = j.e(aVar3, 1.0f);
                        Object objY = aVar2.y();
                        if (objY == a.C0041a.a) {
                            objY = pr7.a(aVar2);
                        }
                        mw90.a(str, "", androidx.compose.foundation.d.b(dVarE, (psw) objY, null, false, null, function0, 28), null, null, null, null, aVar2, 48, 2040);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 48);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j, tnd0Var, str, function0, j2, i) { // from class: rnd0
                public final /* synthetic */ long a;
                public final /* synthetic */ tnd0 b;
                public final /* synthetic */ String c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ long e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    snd0.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
