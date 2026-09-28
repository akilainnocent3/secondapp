package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qfa implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ qfa(int i, int i2, Function0 function0) {
        this.a = i2;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        a aVar = (a) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                xfa.d(this.b, aVar, qj40.a(1));
                break;
            default:
                awx.a(this.b, aVar, qj40.a(7));
                break;
        }
        return Unit.a;
    }
}
