package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.ui.d;
import com.google.protobuf.Reader;
import com.sportygames.newcms.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class rj30 {
    public static final long a = r58.d(4293389554L);
    public static final long b = r58.d(4291352304L);
    public static final i060 c = j060.c(7.0f);
    public static final long d = r58.d(4279900718L);
    public static final long e = r58.d(4283058778L);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [zi50$b] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    public static final void a(final mxs mxsVar, a aVar, final int i) {
        b bVar;
        ?? bVar2;
        b bVarI = aVar.i(1033895870);
        int i2 = i | (bVarI.M(mxsVar) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            String strC = c.c(lu00.b2.W0, new String[0], bVarI);
            boolean zM = bVarI.M(strC);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                try {
                    zi50.a aVar2 = zi50.b;
                    JSONArray jSONArray = new JSONArray(strC);
                    int length = jSONArray.length();
                    bVar2 = new ArrayList(length);
                    for (int i3 = 0; i3 < length; i3++) {
                        bVar2.add(jSONArray.getString(i3));
                    }
                } catch (Throwable th) {
                    zi50.a aVar3 = zi50.b;
                    bVar2 = new zi50.b(th);
                }
                List listC = kotlin.collections.a.c(strC);
                zi50.a aVar4 = zi50.b;
                boolean z = bVar2 instanceof zi50.b;
                ?? r8 = bVar2;
                if (z) {
                    r8 = listC;
                }
                objY = (List) r8;
                bVarI.r(objY);
            }
            List list = (List) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = k.a(0);
                bVarI.r(objY2);
            }
            osw oswVar = (osw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = ee0.a(1.0f);
                bVarI.r(objY3);
            }
            wd0 wd0Var = (wd0) objY3;
            boolean zA = bVarI.A(wd0Var) | bVarI.A(list);
            Object objY4 = bVarI.y();
            if (zA || objY4 == c0042a) {
                objY4 = new qj30(wd0Var, list, oswVar, null);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, list, (Function2) objY4);
            d dVarA = dw.a(d.a.b, ((Number) wd0Var.d()).floatValue());
            int iD = oswVar.D();
            Object obj = strC;
            if (iD >= 0 && iD < list.size()) {
                obj = strC;
                obj = list.get(iD);
            }
            obj = strC;
            obj.getClass();
            String str = (String) obj;
            List listH = new Regex("\\s+").h(StringsKt.t0(str).toString());
            if (listH.size() > 1) {
                int size = listH.size();
                int i4 = Reader.READ_DONE;
                int i5 = 1;
                boolean z2 = false;
                for (int i6 = 1; i6 < size; i6++) {
                    int length2 = CollectionsKt.a0(CollectionsKt.t0(listH, i6), " ", null, null, null, 62).length();
                    int length3 = CollectionsKt.a0(CollectionsKt.O(listH, i6), " ", null, null, null, 62).length();
                    int iAbs = Math.abs(length2 - length3);
                    boolean z3 = length2 >= length3;
                    if (iAbs < i4) {
                        i5 = i6;
                        z2 = z3;
                        i4 = iAbs;
                    } else if (iAbs == i4 && z3 && !z2) {
                        z2 = true;
                        i5 = i6;
                    }
                }
                str = CollectionsKt.a0(CollectionsKt.t0(listH, i5), " ", null, null, null, 62) + '\n' + CollectionsKt.a0(CollectionsKt.O(listH, i5), " ", null, null, null, 62);
            }
            b bVar3 = bVarI;
            lkf0.b(str, dVarA, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 2, null, new imf0(e, i7f.b(12.0f, bVarI), t9i.e, null, mxsVar, 0L, null, null, 3, 0L, null, null, 16744408), bVar3, 0, 27696, 38908);
            bVar = bVar3;
        } else {
            b bVar4 = bVarI;
            bVar4.G();
            bVar = bVar4;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: pj30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(1);
                    rj30.a(this.a, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d dVar, a aVar, int i) {
        b bVar;
        b bVarI = aVar.i(1820227037);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            lu00 lu00Var = lu00.b2;
            mxs mxsVarA = d1a.a(d9i.a(lu00Var.h, bVarI));
            d dVarG = j.g(dVar, 1.0f);
            i060 i060Var = c;
            d dVarH = h.h(d35.a(androidx.compose.foundation.a.b(ls7.a(dVarG, i060Var), a, zk40.a), 2.0f, b, i060Var), 0.0f, 12.0f, 1);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.b(c.c(lu00Var.V0, new String[0], bVarI), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new imf0(d, i7f.b(14.0f, bVarI), t9i.E, null, mxsVarA, 0L, null, null, 0, 0L, null, null, 16777176), bVarI, 0, 0, 65534);
            bVar = bVarI;
            ty0.a(bVar, j.i(d.a.b, 4.0f));
            a(mxsVarA, bVar, 0);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new oj30(dVar, i);
        }
    }
}
