package defpackage;

import com.sportygames.newcms.b;
import com.sportygames.newcms.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.newcms.CMSUseCase$getLoadingTask$1", f = "CMSUseCase.kt", l = {158}, m = "invokeSuspend", v = 1)
public final class zp5 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ dq40<List<do5>> c;
    public final /* synthetic */ dq40<b> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp5(d dVar, dq40<List<do5>> dq40Var, dq40<b> dq40Var2, v1b<? super zp5> v1bVar) {
        super(1, v1bVar);
        this.b = dVar;
        this.c = dq40Var;
        this.d = dq40Var2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new zp5(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((zp5) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (ej5.d(this.b.b, new cq5(this.c, this.d, null), this) == y5bVar) {
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
