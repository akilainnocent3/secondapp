package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e7 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        t tVar = (t) obj;
        final int iY0 = tVar.y0(10.0f);
        long j = ((kxa) obj3).a;
        int i = iY0 * 2;
        final y yVarD0 = ((vhv) obj2).d0(oxa.i(i, j, 0));
        return t.z1(tVar, yVarD0.a - i, yVarD0.b, new Function1() { // from class: j7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                ((y.a) obj4).s(yVarD0, -iY0, 0, 0.0f);
                return Unit.a;
            }
        });
    }
}
