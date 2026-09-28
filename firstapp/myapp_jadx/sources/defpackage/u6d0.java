package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u6d0 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ haj b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                b7d0.b((Function0) hajVar, (a) obj, qj40.a(1));
                break;
            default:
                ((Function1) hajVar).invoke(obj);
                break;
        }
        return Unit.a;
    }
}
