package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.common.business.repositories.ResultsKt$asResults$3", f = "Results.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class jl50 extends tje0 implements gaj<myh<? super mk50<Object>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super mk50<Object>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        jl50 jl50Var = new jl50(3, v1bVar);
        jl50Var.b = myhVar;
        jl50Var.c = th;
        return jl50Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            mk50.a aVar = new mk50.a(th);
            this.b = null;
            this.c = th;
            this.a = 1;
            if (myhVar.emit(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        itf0.a aVar2 = itf0.a;
        aVar2.a(e40.a(aVar2, "asResult", "Results Failure ", th), new Object[0]);
        return Unit.a;
    }
}
