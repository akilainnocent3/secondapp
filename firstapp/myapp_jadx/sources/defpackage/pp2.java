package defpackage;

import android.content.Context;
import androidx.compose.animation.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pp2 {
    public static final void a(final StringUiText stringUiText, boolean z, float f, Function2 function2, a aVar, final int i) {
        final boolean z2;
        final float f2;
        final Function2 function3;
        b bVarI = aVar.i(-917777936);
        int i2 = i | (bVarI.M(stringUiText) ? 4 : 2) | 28080;
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            final long jA = rzg.a(bVarI, -1516283616, R.color.bg_info_secondary, bVarI, false);
            final float f3 = 48.0f;
            z2 = true;
            hh0.e(true, null, f.f(yi0.e(150, 0, null, 6), 2).b(f.d(yi0.e(150, 0, null, 6), 14)), f.g(yi0.e(150, 0, null, 6), 2).b(f.l(yi0.e(150, 0, null, 6), 14)), null, pp8.b(-1113920312, new gaj() { // from class: np2
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
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
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, i78VarA, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        d dVarG = h.g(androidx.compose.foundation.a.b(aVar3, jA, zk40.a), 16.0f, 12.0f);
                        d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar2, 48);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarG);
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
                        hlh0.a(aVar2, d160VarA, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        aVar2.N(1129559210);
                        vr8.a.invoke(aVar2, 0);
                        aVar2.H();
                        ty0.a(aVar2, j.w(aVar3, 8.0f));
                        lkf0.e(wk0.d(stringUiText.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), new String[]{"<strong>", "</strong>"}, new ora0(0L, d2l.f(12), t9i.E, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65529), mla.l(R.style.B2_R, aVar2).a).a, null, c68.a(R.color.text_type1_tertiary, aVar2), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, aVar2, 0, 0, 524282);
                        aVar2.s();
                        aVar2.s();
                        ty0.a(aVar2, j.i(aVar3, f3));
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 200070, 18);
            function3 = vr8.a;
            f2 = 48.0f;
        } else {
            bVarI.G();
            z2 = z;
            f2 = f;
            function3 = function2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z2, f2, function3, i) { // from class: op2
                public final /* synthetic */ boolean b;
                public final /* synthetic */ float c;
                public final /* synthetic */ Function2 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    pp2.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
