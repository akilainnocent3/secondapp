package defpackage;

import androidx.compose.runtime.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class dlm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ dlm(int i, int i2, List list) {
        this.a = i2;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(1);
                klm.f(this.b, (a) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                rfc0.c((qcn) this.b, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
