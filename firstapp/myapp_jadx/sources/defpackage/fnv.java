package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fnv {
    /* JADX WARN: Code duplicated, block: B:52:0x0169  */
    /* JADX WARN: Code duplicated, block: B:55:0x0173  */
    /* JADX WARN: Code duplicated, block: B:58:0x017d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0191  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c6  */
    public static final void a(final aev.a aVar, a aVar2, final int i) {
        Integer num;
        d dVar;
        d dVarB;
        d dVarE;
        String str;
        tmz tmzVar;
        long jA;
        boolean z;
        imf0 imf0VarL;
        b bVarI = aVar2.i(1007575839);
        int i2 = (bVarI.A(aVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            boolean z2 = aVar instanceof aev.a.C0015a;
            d.a aVar3 = d.a.b;
            if (z2) {
                bVarI.N(-834459263);
                mw90.a(null, null, h.j(j.t(aVar3, 36.0f, 29.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), null, null, null, null, bVarI, 384, 1976);
                bVarI.X(false);
            } else if (aVar instanceof aev.a.b) {
                bVarI.N(-834080815);
                aev.a.b bVar = (aev.a.b) aVar;
                h9n.a(erz.a(bVar.a, 0, bVarI), bVar.b, j.r(h.j(aVar3, 0.0f, 0.0f, 8.0f, 0.0f, 11), 48.0f), null, null, 0.0f, null, bVarI, 384, 120);
                bVarI.X(false);
            } else if (aVar instanceof aev.a.c) {
                bVarI.N(-833689626);
                aev.a.c cVar = (aev.a.c) aVar;
                Integer num2 = cVar.b;
                Integer num3 = cVar.j;
                Integer num4 = cVar.c;
                g7f g7fVar = cVar.m;
                boolean zG = Intrinsics.g(cVar.d, Boolean.TRUE);
                qx80 qx80VarC = zk40.a;
                if (zG) {
                    bVarI.N(-833646195);
                    List<j58> list = cVar.e;
                    List<Float> list2 = cVar.f;
                    Integer num5 = cVar.g;
                    int iIntValue = num5 != null ? num5.intValue() : 800;
                    gly glyVar = cVar.h;
                    long j = glyVar != null ? glyVar.a : 0L;
                    Function1<Float, gly> function1 = cVar.i;
                    if (function1 == null) {
                        bVarI.N(-833050871);
                        Object objY = bVarI.y();
                        if (objY == a.C0041a.a) {
                            objY = new dnv();
                            bVarI.r(objY);
                        }
                        function1 = (Function1) objY;
                    } else {
                        bVarI.N(1912787685);
                    }
                    bVarI.X(false);
                    num = num3;
                    hfs hfsVarA = p590.a(list, list2, iIntValue, j, function1, bVarI, 6, 2);
                    bVarI = bVarI;
                    if (g7fVar != null) {
                        qx80VarC = j060.c(g7fVar.a);
                    }
                    dVarB = androidx.compose.foundation.a.a(aVar3, hfsVarA, qx80VarC, 0.0f, 4);
                    bVarI.X(false);
                } else {
                    num = num3;
                    if (num4 != null) {
                        bVarI.N(-832315396);
                        long jA2 = c68.a(num4.intValue(), bVarI);
                        if (g7fVar != null) {
                            qx80VarC = j060.c(g7fVar.a);
                        }
                        dVarB = androidx.compose.foundation.a.b(aVar3, jA2, qx80VarC);
                        bVarI.X(false);
                    } else {
                        bVarI.N(1912825735);
                        bVarI.X(false);
                        dVar = aVar3;
                    }
                    dVarE = aVar3;
                    d dVarN = h.j(dVarE, 0.0f, 0.0f, 8.0f, 0.0f, 11).n(dVar);
                    str = cVar.k;
                    if (str == null) {
                        str = "";
                    }
                    d dVarH = g3w.h(dVarN, str);
                    tmzVar = cVar.l;
                    if (tmzVar != null) {
                        dVarE = h.e(dVarE, tmzVar);
                    }
                    d dVarN2 = dVarH.n(dVarE);
                    if (num != null) {
                        bVarI.N(1912841735);
                        jA = c68.a(num.intValue(), bVarI);
                        bVarI.X(false);
                    } else {
                        bVarI.N(1912843370);
                        bVarI.X(false);
                        jA = j58.m;
                    }
                    long j2 = jA;
                    UiText uiText = cVar.a;
                    uiText.getClass();
                    String strG = uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                    if (num2 != null) {
                        bVarI.N(1912847597);
                        imf0VarL = mla.l(num2.intValue(), bVarI);
                        z = false;
                    } else {
                        z = false;
                        bVarI.N(1912849702);
                        imf0VarL = (imf0) bVarI.O(lkf0.a);
                    }
                    bVarI.X(z);
                    b bVar2 = bVarI;
                    lkf0.d(strG, dVarN2, j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, bVar2, 0, 0, 131064);
                    bVarI = bVar2;
                    bVarI.X(z);
                }
                dVar = dVarB;
                dVarE = aVar3;
                d dVarN3 = h.j(dVarE, 0.0f, 0.0f, 8.0f, 0.0f, 11).n(dVar);
                str = cVar.k;
                if (str == null) {
                    str = "";
                }
                d dVarH2 = g3w.h(dVarN3, str);
                tmzVar = cVar.l;
                if (tmzVar != null) {
                    dVarE = h.e(dVarE, tmzVar);
                }
                d dVarN4 = dVarH2.n(dVarE);
                if (num != null) {
                    bVarI.N(1912841735);
                    jA = c68.a(num.intValue(), bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(1912843370);
                    bVarI.X(false);
                    jA = j58.m;
                }
                long j3 = jA;
                UiText uiText2 = cVar.a;
                uiText2.getClass();
                String strG2 = uiText2.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                if (num2 != null) {
                    bVarI.N(1912847597);
                    imf0VarL = mla.l(num2.intValue(), bVarI);
                    z = false;
                } else {
                    z = false;
                    bVarI.N(1912849702);
                    imf0VarL = (imf0) bVarI.O(lkf0.a);
                }
                bVarI.X(z);
                b bVar3 = bVarI;
                lkf0.d(strG2, dVarN4, j3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, bVar3, 0, 0, 131064);
                bVarI = bVar3;
                bVarI.X(z);
            } else {
                bVarI.N(1912851267);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: env
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    fnv.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
