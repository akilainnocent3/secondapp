package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class vvz {
    @fae
    public static final void a(final d dVar, final ijf0 ijf0Var, final Function1 function1, final dwz dwzVar, final ycg.b bVar, String str, a aVar, final int i, final int i2) {
        int i3;
        final String strA;
        b bVarI = aVar.i(-2033529183);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(ijf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? bVarI.M(dwzVar) : bVarI.A(dwzVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? bVarI.M(bVar) : bVarI.A(bVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                strA = str;
                int i4 = bVarI.M(strA) ? 131072 : 65536;
                i3 |= i4;
            } else {
                strA = str;
            }
            i3 |= i4;
        } else {
            strA = str;
        }
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            } else if ((i2 & 32) != 0) {
                strA = cb40.a(R.string.common_functions__password, new Object[0], bVarI);
                i3 &= -458753;
            }
            String str2 = strA;
            bVarI.Y();
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new pc8(ytwVar, 1);
                bVarI.r(objY2);
            }
            qwz.b(androidx.compose.ui.focus.a.a(dVar, (Function1) objY2), ijf0Var, !bVar.equals(new ycg.b("", "error_text")), bVar, false, null, str2, new gop(7, 6, 115), null, null, null, function1, null, bVarI, (i3 & 112) | 12582912 | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016), i3 & 896, 12080);
            bVarI = bVarI;
            if (ijf0Var.a.b.length() > 0) {
                bVarI.N(-353181541);
                d.a aVar2 = d.a.b;
                ty0.a(bVarI, j.i(aVar2, 8.0f));
                d160 d160VarA = b160.a(new kw0.i(8.0f, true, new hw0()), ht.a.j, bVarI, 6);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, aVar2);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar2 = yka.a.f;
                hlh0.a(bVarI, d160VarA, bVar2);
                yka.a.d dVar2 = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar2);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                kw0.i iVar = new kw0.i(8.0f, true, new hw0());
                n54.a aVar4 = ht.a.m;
                i78 i78VarA = g78.a(iVar, aVar4, bVarI, 6);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, layoutWeightElement);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, bVar2);
                hlh0.a(bVarI, ne00VarS2, dVar2);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                puh0.a(null, dwzVar.a, cb40.a(R.string.component_register__password_rule_minimum_characters, new Object[]{Integer.valueOf(dwzVar.g)}, bVarI), null, bVarI, 0, 9);
                puh0.a(null, dwzVar.b, cb40.a(R.string.component_register__password_rule_maximum_characters, new Object[]{Integer.valueOf(dwzVar.h)}, bVarI), null, bVarI, 0, 9);
                puh0.a(null, dwzVar.c, cb40.a(R.string.component_register__password_rule_one_number, new Object[0], bVarI), null, bVarI, 0, 9);
                bVarI.X(true);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                i78 i78VarA2 = g78.a(new kw0.i(8.0f, true, new hw0()), aVar4, bVarI, 6);
                int iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, layoutWeightElement2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, bVar2);
                hlh0.a(bVarI, ne00VarS3, dVar2);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                puh0.a(null, dwzVar.d, cb40.a(R.string.component_register__password_rule_one_uppercase_character, new Object[0], bVarI), null, bVarI, 0, 9);
                puh0.a(null, dwzVar.e, cb40.a(R.string.component_register__password_rule_one_lowercase_character, new Object[0], bVarI), null, bVarI, 0, 9);
                puh0.a(null, dwzVar.f, cb40.a(R.string.component_register__password_rule_one_special_character, new Object[0], bVarI), null, bVarI, 0, 9);
                f30.a(bVarI, true, true, false);
            } else {
                bVarI.N(-351299903);
                bVarI.X(false);
            }
            strA = str2;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: uvz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vvz.a(dVar, ijf0Var, function1, dwzVar, bVar, strA, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
