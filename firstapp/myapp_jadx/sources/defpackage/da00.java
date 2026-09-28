package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class da00 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ da00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj4;
                d dVar = (d) obj;
                a aVar = (a) obj2;
                ((Integer) obj3).getClass();
                dVar.getClass();
                aVar.N(2053589242);
                function0.getClass();
                d dVarD = androidx.compose.foundation.d.d(dVar, false, null, null, function0, 15);
                aVar.H();
                return dVarD;
            default:
                String str = (String) obj4;
                a aVar2 = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((gwr) obj).getClass();
                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    hfg0.i(6, aVar2, j.g(d.a.b, 1.0f), str);
                } else {
                    aVar2.G();
                }
                return Unit.a;
        }
    }
}
