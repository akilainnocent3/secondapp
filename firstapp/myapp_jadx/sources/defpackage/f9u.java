package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.luckywheel.components.LuckyWheelKt$LuckyWheel$1$1", f = "LuckyWheel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f9u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ osw a;
    public final /* synthetic */ ytw<Boolean> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9u(osw oswVar, ytw<Boolean> ytwVar, v1b<? super f9u> v1bVar) {
        super(2, v1bVar);
        this.a = oswVar;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f9u(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f9u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.k(0);
        this.b.setValue(Boolean.TRUE);
        return Unit.a;
    }
}
