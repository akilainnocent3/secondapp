package defpackage;

import androidx.compose.animation.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class n5n {
    public static final void a(final d dVar, final String str, final String str2, final int i, final int i2, final int i3, final int i4, final boolean z, a aVar, final int i5) {
        str.getClass();
        str2.getClass();
        b bVarI = aVar.i(1365447971);
        int i6 = i5 | (bVarI.M(str) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128) | (bVarI.d(i) ? 2048 : 1024) | (bVarI.d(i2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.d(i3) ? 131072 : 65536) | (bVarI.d(i4) ? 1048576 : 524288) | (bVarI.b(z) ? 8388608 : 4194304);
        if (bVarI.q(i6 & 1, (4793491 & i6) != 4793490)) {
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            t9g t9gVarF = f.f(null, 3);
            gzg0 gzg0VarE = yi0.e(i3, 0, null, 6);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new g5n();
                bVarI.r(objY);
            }
            t9g t9gVarB = t9gVarF.b(f.n(gzg0VarE, (Function1) objY));
            owg owgVarG = f.g(null, 3);
            gzg0 gzg0VarE2 = yi0.e(i4, 0, null, 6);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new h5n();
                bVarI.r(objY2);
            }
            owg owgVarB = owgVarG.b(f.r(gzg0VarE2, (Function1) objY2));
            n54 n54Var = ht.a.d;
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            d.a aVar3 = d.a.b;
            d dVarB = dVar2.b(aVar3, n54Var);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new i5n();
                bVarI.r(objY3);
            }
            int i7 = ((i6 >> 21) & 14) | 196608;
            hh0.e(z, xa80.b(dVarB, false, (Function1) objY3), t9gVarB, owgVarB, null, pp8.b(1674026501, new gaj() { // from class: j5n
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        lkf0.d(str, g3w.h(h.j(androidx.compose.foundation.a.b(d.a.b, c68.a(i, aVar4), zk40.a), 16.0f, 0.0f, 8.0f, 0.0f, 10), "ib_team_name_home_text"), c68.a(R.color.text_inverse_primary, aVar4), null, mla.m(32.0f, aVar4), null, t9i.v, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar4, 1572864, 0, 262056);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, i7, 16);
            t9g t9gVarF2 = f.f(null, 3);
            gzg0 gzg0VarE3 = yi0.e(i3, 0, null, 6);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new k5n();
                bVarI.r(objY4);
            }
            t9g t9gVarB2 = t9gVarF2.b(f.n(gzg0VarE3, (Function1) objY4));
            owg owgVarG2 = f.g(null, 3);
            gzg0 gzg0VarE4 = yi0.e(i4, 0, null, 6);
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new qoz();
                bVarI.r(objY5);
            }
            hh0.e(z, dVar2.b(aVar3, ht.a.f), t9gVarB2, owgVarG2.b(f.r(gzg0VarE4, (Function1) objY5)), null, pp8.b(-350929682, new gaj() { // from class: l5n
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        lkf0.d(str2, g3w.h(h.j(androidx.compose.foundation.a.b(d.a.b, c68.a(i2, aVar4), zk40.a), 16.0f, 0.0f, 8.0f, 0.0f, 10), "ib_team_name_away_text"), c68.a(R.color.text_inverse_primary, aVar4), null, mla.m(32.0f, aVar4), null, t9i.v, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar4, 1572864, 0, 262056);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, i7, 16);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, i, i2, i3, i4, z, i5) { // from class: m5n
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ int i;
                public final /* synthetic */ boolean v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    n5n.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
