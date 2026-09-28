package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportykick.components.OngoingComponentKt$OngoingComponent$4$1", f = "OngoingComponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class twy extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Function1<gly, Unit> c;
    public final /* synthetic */ ytw<gly> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public twy(String str, long j, Function1<? super gly, Unit> function1, ytw<gly> ytwVar, v1b<? super twy> v1bVar) {
        super(2, v1bVar);
        this.a = str;
        this.b = j;
        this.c = function1;
        this.d = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new twy(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((twy) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (Intrinsics.g(this.a, "ROUND_END_WAIT")) {
            int i = bxy.a;
            ytw<gly> ytwVar = this.d;
            this.c.invoke(new gly(!gly.c(ytwVar.getValue().a, 0L) ? ytwVar.getValue().a : this.b));
        }
        return Unit.a;
    }
}
