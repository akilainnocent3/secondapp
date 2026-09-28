package defpackage;

import com.sportybet.plugin.realsports.data.Results;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.results.search.ResultsSearchViewModel$onSearch$1", f = "ResultsSearchViewModel.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class um50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ vm50 b;
    public final /* synthetic */ rm50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um50(vm50 vm50Var, rm50 rm50Var, v1b<? super um50> v1bVar) {
        super(2, v1bVar);
        this.b = vm50Var;
        this.c = rm50Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new um50(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((um50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object obj2;
        vm50 vm50Var = this.b;
        wwd0 wwd0Var = vm50Var.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            jm50 jm50Var = vm50Var.a;
            this.a = 1;
            objB = jm50Var.b(this.c, this);
            if (objB == y5bVar) {
                obj2 = objB;
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            obj2 = ((zi50) obj).a;
        }
        obj2 = objB;
        sm50 sm50Var = vm50Var.b;
        zi50.a aVar = zi50.b;
        boolean z = obj2 instanceof zi50.b;
        Object bVar = obj2;
        if (!z) {
            try {
                Results results = (Results) obj2;
                sm50Var.getClass();
                results.getClass();
                List list = results.tournaments;
                if (list == null) {
                    list = m2g.a;
                }
                ArrayList arrayListH = kgb0.h(list, true);
                boolean zIsEmpty = arrayListH.isEmpty();
                bVar = arrayListH;
                if (!zIsEmpty) {
                    arrayListH.add(0, new c7b());
                    bVar = arrayListH;
                }
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        if (!(bVar instanceof zi50.b)) {
            List list2 = (List) bVar;
            wwd0Var.setValue(list2.isEmpty() ? tm50.b.a : new tm50.a(list2));
        }
        if (zi50.a(bVar) != null) {
            wwd0Var.setValue(tm50.c.a);
        }
        return Unit.a;
    }
}
