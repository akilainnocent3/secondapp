package defpackage;

import com.sportygames.newcms.b;
import com.sportygames.newcms.d;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.newcms.CMSUseCase$getLoadingTask$flow$3", f = "CMSUseCase.kt", l = {150}, m = "invokeSuspend", v = 1)
public final class bq5 extends tje0 implements gaj<myh<? super xxs<b>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ d c;
    public final /* synthetic */ dq40<List<do5>> d;
    public final /* synthetic */ dq40<b> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq5(d dVar, dq40<List<do5>> dq40Var, dq40<b> dq40Var2, v1b<? super bq5> v1bVar) {
        super(3, v1bVar);
        this.c = dVar;
        this.d = dq40Var;
        this.e = dq40Var2;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super xxs<b>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        dq40<List<do5>> dq40Var = this.d;
        dq40<b> dq40Var2 = this.e;
        bq5 bq5Var = new bq5(this.c, dq40Var, dq40Var2, v1bVar);
        bq5Var.b = th;
        return bq5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (th != null) {
                this.b = null;
                this.a = 1;
                if (ej5.d(this.c.b, new cq5(this.d, this.e, null), this) == y5bVar) {
                    return y5bVar;
                }
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
