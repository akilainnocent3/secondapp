package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.components.ComposeBetContainerInitiatedKt$ComposeBetContainerInitiated$1$1", f = "ComposeBetContainerInitiated.kt", l = {}, m = "invokeSuspend", v = 1)
public final class n5a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ tl2 a;
    public final /* synthetic */ ytw<Boolean> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5a(tl2 tl2Var, ytw<Boolean> ytwVar, v1b<? super n5a> v1bVar) {
        super(2, v1bVar);
        this.a = tl2Var;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new n5a(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((n5a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!((Boolean) ((x5a0) this.a.g0).getValue()).booleanValue()) {
            this.b.setValue(Boolean.FALSE);
        }
        return Unit.a;
    }
}
