package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class rsf {
    public static final void a(d dVar, final boolean z, uxs uxsVar, final Function0<Unit> function0, final Function0<Unit> function1, a aVar, final int i, final int i2) {
        final d dVar2;
        int i3;
        final uxs uxsVar2;
        uxsVar.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(1831383127);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.d(uxsVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            d dVar3 = i4 != 0 ? d.a.b : dVar2;
            uxsVar2 = uxsVar;
            q75.a(h.g(androidx.compose.foundation.a.b(lx80.d(j.g(dVar3, 1.0f), 8.0f, null, false, 0L, 0L, 30), c68.a(R.color.background_general_primary, bVarI), zk40.a), 24.0f, 20.0f), null, false, pp8.b(-1112105939, new gaj() { // from class: psf
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fD = r75Var.d() * 0.3f;
                        d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d.a aVar3 = d.a.b;
                        d dVarC = c.c(aVar2, aVar3);
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
                        hlh0.a(aVar2, d160VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        vuc0.a(j.b(aVar3, fD, 0.0f, 2), z, null, null, function0, null, null, null, null, n09.a, aVar2, 805306368, 492);
                        aza.a(zqu.a(1.0f, h.j(aVar3, 8.0f, 0.0f, 0.0f, 0.0f, 14), true), cb40.a(R.string.common_functions__save, new Object[0], aVar2), uxsVar2, null, null, null, null, null, function1, null, aVar2, 0, 760);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3072, 6);
            dVar2 = dVar3;
        } else {
            uxsVar2 = uxsVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qsf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rsf.a(dVar2, z, uxsVar2, function0, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
