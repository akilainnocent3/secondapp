package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nhd implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nhd(bef0 bef0Var, Function0 function0) {
        this.c = bef0Var;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new iwo(jwo.a(((bef0) this.c).Q0((urr) this.b.invoke())));
            default:
                Function0 function0 = (Function0) this.c;
                this.b.invoke();
                function0.invoke();
                return Unit.a;
        }
    }

    public /* synthetic */ nhd(Function0 function0, Function0 function1) {
        this.b = function0;
        this.c = function1;
    }
}
