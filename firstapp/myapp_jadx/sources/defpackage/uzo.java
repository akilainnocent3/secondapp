package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class uzo extends ii50 {
    public int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ v1b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzo(v1b v1bVar, v1b v1bVar2, Function2 function2) {
        super(v1bVar);
        this.b = function2;
        this.c = v1bVar2;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                ib5.a("This coroutine had already completed");
                return null;
            }
            this.a = 2;
            uj50.b(obj);
            return obj;
        }
        this.a = 1;
        uj50.b(obj);
        Function2 function2 = this.b;
        function2.getClass();
        y8h0.d(2, function2);
        return function2.invoke(this.c, this);
    }
}
