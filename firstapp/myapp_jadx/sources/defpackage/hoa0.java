package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pocketrocket.viewmodels.SocketViewModel$getUserInfo$dispTopic$2$1", f = "SocketViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class hoa0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ eoa0 a;
    public final /* synthetic */ f1e0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoa0(eoa0 eoa0Var, f1e0 f1e0Var, v1b<? super hoa0> v1bVar) {
        super(2, v1bVar);
        this.a = eoa0Var;
        this.b = f1e0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hoa0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hoa0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.d.m(this.b.c);
        return Unit.a;
    }
}
