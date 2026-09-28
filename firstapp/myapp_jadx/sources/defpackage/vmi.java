package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vmi {
    public static final void a(final d dVar, final py90 py90Var, final Function0 function0, a aVar, final int i) {
        py90Var.getClass();
        function0.getClass();
        b bVarI = aVar.i(-335783729);
        int i2 = (bVarI.d(py90Var.ordinal()) ? 32 : 16) | i | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            List listK = kotlin.collections.b.k(new j58(shi.f), new j58(shi.g));
            float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            rg6.b(function0, dVar, false, j060.c(4.0f), gg6.b(shi.h, 0L, bVarI, 24576, 14), null, new l35(1.0f, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (14 & 8) == 0 ? 2 : 0)), null, pp8.b(1444238522, new gaj() { // from class: tmi
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar3 = d.a.b;
                        d dVarF = h.f(aVar3, 10.0f);
                        d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarF);
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
                        if (py90Var == py90.b) {
                            aVar2.N(-332187154);
                            q330.a(j.r(aVar3, 16.0f), c68.a(R.color.brand_tertiary, aVar2), 2.0f, 0L, 0, 0.0f, aVar2, 390, 56);
                            ty0.a(aVar2, j.w(aVar3, 10.0f));
                            aVar2.H();
                        } else {
                            aVar2.N(-331912308);
                            aVar2.H();
                        }
                        lkf0.d(pwo.e(R.string.common_functions__skip, aVar2), null, c68.a(R.color.text_type2_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar2), aVar2, 0, 0, 131066);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 6) & 14) | 100663344, 164);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(py90Var, function0, i) { // from class: umi
                public final /* synthetic */ py90 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    vmi.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
