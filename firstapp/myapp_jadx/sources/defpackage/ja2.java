package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ja2 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ja2(int i, Function0 function0, Function0 function1) {
        this.b = function0;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(7);
                ((ka2) this.c).b(this.b, (a) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = qj40.a(1);
                w9u.a(this.b, (Function0) this.c, (a) obj, iA2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ja2(ka2 ka2Var, Function0 function0, int i) {
        this.c = ka2Var;
        this.b = function0;
    }
}
