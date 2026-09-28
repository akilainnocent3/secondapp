package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ioz extends saj implements Function1<v1b<? super wqz<Object, Object>>, Object> {
    public ioz(Object obj) {
        super(1, obj, vje0.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super wqz<Object, Object>> v1bVar) {
        vje0 vje0Var = (vje0) this.receiver;
        return ej5.d(vje0Var.a, new uje0(vje0Var, null), v1bVar);
    }
}
