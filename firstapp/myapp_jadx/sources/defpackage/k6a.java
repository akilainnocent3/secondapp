package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.ComposeBetContainerKt$ComposeBetContainer$8$2$2$1", f = "ComposeBetContainer.kt", l = {740}, m = "invokeSuspend", v = 1)
public final class k6a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ytw<Boolean> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6a(boolean z, ytw<Boolean> ytwVar, v1b<? super k6a> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k6a(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k6a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        ytw<Boolean> ytwVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            if (this.b) {
                ytwVar.setValue(Boolean.TRUE);
                this.a = 1;
                if (hkd.b(1600L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                ytwVar.setValue(Boolean.TRUE);
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ytwVar.setValue(Boolean.FALSE);
        return Unit.a;
    }
}
