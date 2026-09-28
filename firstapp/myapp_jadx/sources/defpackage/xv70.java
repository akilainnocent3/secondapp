package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.search.SearchFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.search.SearchFragment$updateSubscribers$1", f = "SearchFragment.kt", l = {1169}, m = "invokeSuspend", v = 2)
public final class xv70 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ SearchFragment b;
    public final /* synthetic */ List<Event> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xv70(SearchFragment searchFragment, List<? extends Event> list, v1b<? super xv70> v1bVar) {
        super(2, v1bVar);
        this.b = searchFragment;
        this.c = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xv70(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xv70) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ohp<Object>[] ohpVarArr = SearchFragment.V;
            rw70 rw70VarQ0 = this.b.q0();
            this.a = 1;
            pfd pfdVar = fse.a;
            Object objD = ej5.d(odd.b, new qw70(rw70VarQ0, this.c, null), this);
            if (objD != obj2) {
                objD = Unit.a;
            }
            if (objD == obj2) {
                return obj2;
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
