package defpackage;

import androidx.compose.animation.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m0n {
    public static final void a(final d dVar, final UiText uiText, final boolean z, a aVar, final int i) {
        uiText.getClass();
        b bVarI = aVar.i(1627139232);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(uiText) ? 32 : 16) | (bVarI.b(z) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = z && !uiText.equals(vch0.a);
            gzg0 gzg0VarE = yi0.e(400, 0, null, 6);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new h0n(0);
                bVarI.r(objY);
            }
            t9g t9gVarB = f.p(gzg0VarE, (Function1) objY).b(f.f(null, 3));
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new i0n();
                bVarI.r(objY2);
            }
            owg owgVarB = f.u((Function1) objY2).b(f.g(null, 3));
            d dVarJ = h.j(dVar, 0.0f, 0.0f, 0.0f, 17.0f, 7);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new j0n();
                bVarI.r(objY3);
            }
            hh0.e(z2, xa80.b(dVarJ, false, (Function1) objY3), t9gVarB, owgVarB, null, pp8.b(1706740600, new gaj() { // from class: k0n
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    int i3 = 1;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d dVarH = g3w.h(h.i(androidx.compose.foundation.a.b(h.j(j.v(d.a.b, 0.0f, 20.0f, 0.0f, 13), 30.0f, 0.0f, 25.0f, 0.0f, 10), j58.c(0.6f, c68.a(R.color.bg_surface_primary, aVar2)), j060.c(32.0f)), 4.0f, 2.0f, 8.0f, 2.0f), "ib_commentary_container");
                        d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarH);
                        yka.k.getClass();
                        tsr.a aVar3 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar3);
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
                        xmf0.a(pp8.b(1798621169, new h74(uiText, i3), aVar2), 4.0f, m59.a, null, aVar2, 3510, 8);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 199680, 16);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(uiText, z, i) { // from class: l0n
                public final /* synthetic */ UiText b;
                public final /* synthetic */ boolean c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    m0n.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
