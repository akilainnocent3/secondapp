package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportygames.piggybash.data.repository.error.NetworkCallsHandler$onMessageParsingError$1", f = "NetworkCallsHandler.kt", l = {96}, m = "invokeSuspend", v = 1)
public final class amx extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xlx b;
    public final /* synthetic */ Exception c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amx(xlx xlxVar, Exception exc, v1b v1bVar) {
        super(2, v1bVar);
        this.b = xlxVar;
        this.c = exc;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new amx(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((amx) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            b390 b390Var = this.b.b;
            ou00.b bVar = new ou00.b(dov.b, this.c);
            this.a = 1;
            if (b390Var.emit(bVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a(siPCzPFw.CfCYIrqXf);
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
