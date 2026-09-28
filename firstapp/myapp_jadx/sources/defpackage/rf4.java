package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {180}, m = "invokeSuspend")
public final class rf4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tf4<Object> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf4(tf4<Object> tf4Var, v1b<? super rf4> v1bVar) {
        super(2, v1bVar);
        this.b = tf4Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rf4(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rf4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        tf4<Object> tf4Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            tf4Var.getClass();
            this.a = 1;
            if (hkd.b(5000L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        if (!tf4Var.a.e()) {
            jvd0 jvd0Var = tf4Var.e;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            tf4Var.e = null;
        }
        return Unit.a;
    }
}
