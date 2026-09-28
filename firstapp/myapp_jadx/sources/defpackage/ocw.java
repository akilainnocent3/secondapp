package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.common.components.MultiLevelRoundBarHostKt$MultiLevelRoundBarHost$6$1", f = "MultiLevelRoundBarHost.kt", l = {}, m = "invokeSuspend", v = 1)
public final class ocw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> a;
    public final /* synthetic */ ytw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocw(v1b v1bVar, ytw ytwVar, Function0 function0) {
        super(2, v1bVar);
        this.a = function0;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ocw(v1bVar, this.b, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ocw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (((Boolean) this.b.getValue()).booleanValue()) {
            this.a.invoke();
        }
        return Unit.a;
    }
}
