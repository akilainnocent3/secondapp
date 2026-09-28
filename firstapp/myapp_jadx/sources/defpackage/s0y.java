package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s0y implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                v3a0 v3a0Var = (v3a0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    s3a0.b(v3a0Var, null, og9.a, aVar, 390, 2);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                vwa0.a((String) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
