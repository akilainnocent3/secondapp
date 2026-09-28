package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.extensions.CoroutinesExtKt$withRun$1$1", f = "CoroutinesExt.kt", l = {9}, m = "invokeSuspend", v = 2)
public final class c6b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ v0x b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6b(v0x v0xVar, Object obj, v1b v1bVar) {
        super(2, v1bVar);
        this.b = v0xVar;
        this.c = obj;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c6b(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c6b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            this.b.invoke(this.c, this);
            return y5bVar;
        }
        if (i == 1) {
            uj50.b(obj);
            return Unit.a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
