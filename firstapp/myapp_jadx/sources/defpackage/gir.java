package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gir implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gir(Function2 function2) {
        this.a = 1;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                sir.k((x3r) obj3, (a) obj, qj40.a(1));
                break;
            case 1:
                String str = (String) obj;
                z7a0.d dVar = (z7a0.d) obj2;
                str.getClass();
                dVar.getClass();
                ((Function2) obj3).invoke(str, dVar);
                break;
            default:
                ((Integer) obj2).getClass();
                qvg0.e((d) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gir(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
    }
}
