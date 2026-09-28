package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k6g0 {
    public static final void a(final List list, final Set set, final Function0 function0, d dVar, a aVar, final int i) {
        final d dVar2;
        String strA0;
        list.getClass();
        set.getClass();
        function0.getClass();
        b bVarI = aVar.i(464586508);
        int i2 = i | (bVarI.M(list) ? 4 : 2) | (bVarI.M(set) ? 32 : 16) | 3072;
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            if (set.isEmpty()) {
                bVarI.N(2112254481);
                strA0 = cb40.a(R.string.sporty_picks__all_leagues, new Object[0], bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(2112331020);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (set.contains(((pt00) obj).a)) {
                        arrayList.add(obj);
                    }
                }
                Object objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new i6g0();
                    bVarI.r(objY);
                }
                strA0 = CollectionsKt.a0(arrayList, ", ", null, null, (Function1) objY, 30);
                bVarI.X(false);
            }
            String str = strA0;
            d.a aVar2 = d.a.b;
            d dVarD = androidx.compose.foundation.d.d(j.g(aVar2, 1.0f), false, null, null, function0, 15);
            qyd0 qyd0Var = ejb0.a;
            d dVarG = h.g(dVarD, ((cjb0) bVarI.O(qyd0Var)).f, ((cjb0) bVarI.O(qyd0Var)).e);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).j;
            qyd0 qyd0Var2 = oib0.a;
            lkf0.d(str, new LayoutWeightElement(1.0f, false), ((lib0) bVarI.O(qyd0Var2)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 131064);
            bVarI = bVarI;
            ty0.a(bVarI, j.w(aVar2, ((cjb0) bVarI.O(qyd0Var)).c));
            h6n.b(erz.a(R.drawable.ic_chevron_down, 0, bVarI), null, j.r(aVar2, ((cjb0) bVarI.O(qyd0Var)).f), ((lib0) bVarI.O(qyd0Var2)).P, bVarI, 48, 0);
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(list, set, function0, dVar2, i) { // from class: j6g0
                public final /* synthetic */ List a;
                public final /* synthetic */ Set b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ d d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(385);
                    k6g0.a(this.a, this.b, this.c, this.d, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }
}
