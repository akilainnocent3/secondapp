package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class djq {
    public static final qyd0 a = new qyd0(new l23(1));

    public static final void a(final hlr hlrVar, final op8 op8Var, a aVar, final int i) {
        ugq ugqVar;
        ugq ugqVar2;
        hlrVar.getClass();
        b bVarI = aVar.i(1446696809);
        int i2 = (bVarI.d(hlrVar.ordinal()) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = hlrVar.ordinal();
            if (iOrdinal == 0) {
                bVarI.N(915754356);
                qyd0 qyd0Var = oib0.a;
                ugqVar = new ugq(((lib0) bVarI.O(qyd0Var)).f1, ((lib0) bVarI.O(qyd0Var)).f1, ((lib0) bVarI.O(qyd0Var)).o, ((lib0) bVarI.O(qyd0Var)).a, ((lib0) bVarI.O(qyd0Var)).f1, ((lib0) bVarI.O(qyd0Var)).a, ((lib0) bVarI.O(qyd0Var)).f1, ((lib0) bVarI.O(qyd0Var)).a);
                bVarI.X(false);
                ugqVar2 = ugqVar;
            } else if (iOrdinal == 1) {
                bVarI.N(915718233);
                qyd0 qyd0Var2 = oib0.a;
                ugqVar = new ugq(((lib0) bVarI.O(qyd0Var2)).x0, ((lib0) bVarI.O(qyd0Var2)).B0, ((lib0) bVarI.O(qyd0Var2)).g, ((lib0) bVarI.O(qyd0Var2)).g, ((lib0) bVarI.O(qyd0Var2)).x0, ((lib0) bVarI.O(qyd0Var2)).g, ((lib0) bVarI.O(qyd0Var2)).x0, ((lib0) bVarI.O(qyd0Var2)).g);
                bVarI.X(false);
                ugqVar2 = ugqVar;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3 && iOrdinal != 4) {
                    throw igf0.a(bVarI, 915717658, false);
                }
                bVarI.N(915754356);
                qyd0 qyd0Var3 = oib0.a;
                ugqVar = new ugq(((lib0) bVarI.O(qyd0Var3)).f1, ((lib0) bVarI.O(qyd0Var3)).f1, ((lib0) bVarI.O(qyd0Var3)).o, ((lib0) bVarI.O(qyd0Var3)).a, ((lib0) bVarI.O(qyd0Var3)).f1, ((lib0) bVarI.O(qyd0Var3)).a, ((lib0) bVarI.O(qyd0Var3)).f1, ((lib0) bVarI.O(qyd0Var3)).a);
                bVarI.X(false);
                ugqVar2 = ugqVar;
            } else {
                bVarI.N(915736413);
                qyd0 qyd0Var4 = oib0.a;
                ugqVar2 = new ugq(((lib0) bVarI.O(qyd0Var4)).h1, ((lib0) bVarI.O(qyd0Var4)).h1, ((lib0) bVarI.O(qyd0Var4)).o, ((lib0) bVarI.O(qyd0Var4)).q, ((lib0) bVarI.O(qyd0Var4)).h1, ((lib0) bVarI.O(qyd0Var4)).b, ((lib0) bVarI.O(qyd0Var4)).h1, ((lib0) bVarI.O(qyd0Var4)).b);
                bVarI.X(false);
            }
            hna.a(a.a(ugqVar2), op8Var, bVarI, 56);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(op8Var, i) { // from class: cjq
                public final /* synthetic */ op8 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    djq.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
