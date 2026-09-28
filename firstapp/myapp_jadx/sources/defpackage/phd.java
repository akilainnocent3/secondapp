package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class phd implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ phd(tef0 tef0Var, bef0 bef0Var, Function0 function0, int i) {
        this.d = tef0Var;
        this.e = bef0Var;
        this.b = function0;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).intValue();
                int iA = qj40.a(this.c | 1);
                vhd.c((tef0) this.d, (bef0) this.e, this.b, (a) obj, iA);
                break;
            default:
                ((Integer) obj2).intValue();
                int iA2 = qj40.a(this.c | 1);
                zoh0.a(this.b, (Function0) this.d, (Function0) this.e, (a) obj, iA2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ phd(Function0 function0, Function0 function1, Function0 function2, int i) {
        this.b = function0;
        this.d = function1;
        this.e = function2;
        this.c = i;
    }
}
