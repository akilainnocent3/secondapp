package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m1l implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m1l(int i, String str, Function0 function0, Function0 function1) {
        this.c = str;
        this.b = function0;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(1);
                n1l.a(iA, (a) obj, (String) obj4, this.b, (Function0) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = qj40.a(1);
                dfz.d((ob30) obj4, (twd0) obj3, this.b, d.a.b, (a) obj, iA2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ m1l(ob30 ob30Var, twd0 twd0Var, Function0 function0, int i) {
        this.c = ob30Var;
        this.d = twd0Var;
        this.b = function0;
    }
}
