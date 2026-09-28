package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class os4 implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ os4(uo90.b bVar, Function1 function1) {
        this.c = bVar;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                function1.invoke((nt4) obj);
                break;
            default:
                String str = ((uo90.b) obj).b;
                if (str != null) {
                    function1.invoke(str);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ os4(Function1 function1, nt4 nt4Var) {
        this.b = function1;
        this.c = nt4Var;
    }
}
