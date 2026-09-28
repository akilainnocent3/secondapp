package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.repository.FirebaseRemoteConfigRepositoryImpl$createTaskFlow$1", f = "FirebaseRemoteConfigRepositoryImpl.kt", l = {191}, m = "invokeSuspend", v = 2)
public final class rrh extends tje0 implements Function2<ez20<? super zi50<Object>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function0<Task<Object>> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rrh(Function0<? extends Task<Object>> function0, v1b<? super rrh> v1bVar) {
        super(2, v1bVar);
        this.c = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rrh rrhVar = new rrh(this.c, v1bVar);
        rrhVar.b = obj;
        return rrhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super zi50<Object>> ez20Var, v1b<? super Unit> v1bVar) {
        return ((rrh) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final ez20 ez20Var = (ez20) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.c.invoke().addOnCompleteListener(new OnCompleteListener() { // from class: prh
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    Object bVar;
                    if (task.isSuccessful()) {
                        zi50.a aVar = zi50.b;
                        bVar = task.getResult();
                    } else {
                        zi50.a aVar2 = zi50.b;
                        Exception exception = task.getException();
                        if (exception == null) {
                            exception = new Exception("Remote Config task failed");
                        }
                        bVar = new zi50.b(exception);
                    }
                    zi50 zi50Var = new zi50(bVar);
                    ez20 ez20Var2 = ez20Var;
                    ez20Var2.c(zi50Var);
                    ez20Var2.k(null);
                }
            });
            qrh qrhVar = new qrh();
            this.b = null;
            this.a = 1;
            if (az20.a(ez20Var, qrhVar, this) == y5bVar) {
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
