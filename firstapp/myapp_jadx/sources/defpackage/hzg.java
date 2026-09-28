package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hzg implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hzg(v5b v5bVar, Function1 function1) {
        this.c = v5bVar;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c);
                break;
            default:
                ej5.c((v5b) this.c, null, null, new e600(this.b, null), 3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hzg(Object obj, Function1 function1) {
        this.b = function1;
        this.c = obj;
    }
}
