package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q2w implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        t tVar = (t) obj;
        vhv vhvVar = (vhv) obj2;
        tVar.getClass();
        vhvVar.getClass();
        final y yVarD0 = vhvVar.d0(((kxa) obj3).a);
        mjm mjmVar = mt.a;
        if (yVarD0.f0(mjmVar) == Integer.MIN_VALUE) {
            ib5.a("Check failed.");
            return null;
        }
        final int iY0 = tVar.y0(15.0f) - yVarD0.f0(mjmVar);
        return t.z1(tVar, yVarD0.a, yVarD0.b + iY0, new Function1() { // from class: u2w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                y.a aVar = (y.a) obj4;
                aVar.getClass();
                y.a.A(aVar, yVarD0, 0, iY0);
                return Unit.a;
            }
        });
    }
}
