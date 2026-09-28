package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.book.presentation.eventsorting.EventStreamType;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mrg {
    public static final void a(final Set set, final Function1 function1, a aVar, final int i) {
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> irgVar;
        b bVarI = aVar.i(568023739);
        int i2 = (bVarI.M(set) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            if (set.isEmpty()) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    irgVar = new irg(set, function1, i, 0);
                }
            } else {
                d.a aVar2 = d.a.b;
                d dVarG = h.g(j.g(aVar2, 1.0f), 8.0f, 2.0f);
                d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
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
                bVarI.N(-1568685412);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    b((EventStreamType) it.next(), function1, bVarI, i2 & 112);
                    ty0.a(bVarI, j.r(aVar2, 4.0f));
                }
                bVarI.X(false);
                bVarI.X(true);
            }
            eVarZ.d = irgVar;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            irgVar = new Function2(set, function1, i) { // from class: jrg
                public final /* synthetic */ Set a;
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    mrg.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
            eVarZ.d = irgVar;
        }
    }

    public static final void b(final EventStreamType eventStreamType, final Function1<? super EventStreamType, Unit> function1, a aVar, final int i) {
        int i2;
        eventStreamType.getClass();
        function1.getClass();
        b bVarI = aVar.i(-632466366);
        if ((i & 6) == 0) {
            i2 = (bVarI.d(eventStreamType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function0() { // from class: krg
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(eventStreamType);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d.a aVar2 = d.a.b;
            d dVarG = h.g(androidx.compose.foundation.d.d(aVar2, false, null, null, (Function0) objY, 15), 8.0f, 6.0f);
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
            String strA = cb40.a(eventStreamType.getTextRes(), new Object[0], bVarI);
            lkf0.d(strA, null, c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((eah0) bVarI.O(gah0.a)).n, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            h6n.b(erz.a(R.drawable.ic_close_24dp, 0, bVarI), strA, j.r(h.j(aVar2, 4.0f, 0.0f, 0.0f, 0.0f, 14), 18.0f), c68.a(R.color.text_type1_secondary, bVarI), bVarI, 384, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lrg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    mrg.b(eventStreamType, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
