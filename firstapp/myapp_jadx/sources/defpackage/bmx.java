package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.data.repository.error.NetworkCallsHandler$onMessageParsingError$1", f = "NetworkCallsHandler.kt", l = {85}, m = "invokeSuspend", v = 1)
public final class bmx extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ylx b;
    public final /* synthetic */ NumberFormatException c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmx(ylx ylxVar, NumberFormatException numberFormatException, v1b v1bVar) {
        super(2, v1bVar);
        this.b = ylxVar;
        this.c = numberFormatException;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bmx(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bmx) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            b390 b390Var = this.b.b;
            lmd0.b bVar = new lmd0.b(eov.c, this.c);
            this.a = 1;
            if (b390Var.emit(bVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
