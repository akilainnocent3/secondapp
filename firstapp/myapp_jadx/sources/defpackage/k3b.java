package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k3b implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ k3b(d dVar, Object obj, Function2 function2, int i, int i2) {
        this.a = i2;
        this.b = dVar;
        this.c = obj;
        this.d = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function2 function2 = this.d;
        Object obj3 = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                j4b.b(dVar, (iif0) obj3, (op8) function2, (a) obj, qj40.a(385));
                break;
            default:
                ((Integer) obj2).getClass();
                kiy.c(dVar, (uiy) obj3, function2, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
