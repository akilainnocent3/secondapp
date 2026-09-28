package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nm implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                hm hmVar = (hm) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Float fValueOf = Float.valueOf(1.0f);
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    hmVar.b.d(fValueOf, fValueOf, aVar, 54);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                v550.a((w550) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ nm(w550 w550Var, int i) {
        this.b = w550Var;
    }
}
