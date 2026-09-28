package defpackage;

import com.sportygames.newcms.b;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.newcms.CMSUseCase$getLoadingTask$release$2", f = "CMSUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
public final class cq5 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ dq40<List<do5>> a;
    public final /* synthetic */ dq40<b> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq5(dq40<List<do5>> dq40Var, dq40<b> dq40Var2, v1b<? super cq5> v1bVar) {
        super(2, v1bVar);
        this.a = dq40Var;
        this.b = dq40Var2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cq5(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cq5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List<do5> list = this.a.a;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((do5) it.next()).release();
            }
        }
        b bVar = this.b.a;
        if (bVar == null) {
            return null;
        }
        bVar.d();
        return Unit.a;
    }
}
