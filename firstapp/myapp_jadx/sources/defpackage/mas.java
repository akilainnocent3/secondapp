package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
public final class mas extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ nas b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mas(nas nasVar, v1b<? super mas> v1bVar) {
        super(2, v1bVar);
        this.b = nasVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mas masVar = new mas(this.b, v1bVar);
        masVar.a = obj;
        return masVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mas) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        v5b v5bVar = (v5b) this.a;
        nas nasVar = this.b;
        s9s s9sVar = nasVar.a;
        if (s9sVar.b().compareTo(s9s.b.b) >= 0) {
            s9sVar.a(nasVar);
        } else {
            i9p.b(v5bVar.getCoroutineContext(), null);
        }
        return Unit.a;
    }
}
