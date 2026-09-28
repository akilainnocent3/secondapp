package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oz4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oz4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                sy4 sy4Var = (sy4) obj;
                ((Function2) obj2).invoke(sy4Var.a, sy4Var.b);
                break;
            default:
                Function0 function0 = (Function0) obj;
                if (((uxs) obj2).a) {
                    function0.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
