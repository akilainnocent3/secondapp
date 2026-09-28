package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i5g0 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        t tVar = (t) obj;
        vhv vhvVar = (vhv) obj2;
        tVar.getClass();
        vhvVar.getClass();
        final y yVarD0 = vhvVar.d0(((kxa) obj3).a);
        return t.z1(tVar, yVarD0.a, yVarD0.b, new Function1() { // from class: k5g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                y.a aVar = (y.a) obj4;
                aVar.getClass();
                y yVar = yVarD0;
                aVar.s(yVar, 0, -yVar.b, 0.0f);
                return Unit.a;
            }
        });
    }
}
