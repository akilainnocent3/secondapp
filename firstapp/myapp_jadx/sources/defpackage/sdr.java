package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sdr implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sdr(int i, haj hajVar, Object obj) {
        this.a = i;
        this.b = hajVar;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((Function1) this.b).invoke(new jcr.c(((x8r) this.c).b));
                break;
            default:
                Function0 function0 = (Function0) this.b;
                Function0 function1 = (Function0) this.c;
                function0.invoke();
                function1.invoke();
                break;
        }
        return Unit.a;
    }
}
