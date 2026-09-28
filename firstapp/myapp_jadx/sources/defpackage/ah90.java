package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.homeshortcut.sidepanel.SidePanelViewModel$createSidePanelShortcut$1", f = "SidePanelViewModel.kt", l = {190}, m = "invokeSuspend", v = 2)
public final class ah90 extends tje0 implements Function2<myh<? super uf00<? extends zg90.c>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uf00<x690> c;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Integer.valueOf(((zg90.c) t).a.ordinal()).compareTo(Integer.valueOf(((zg90.c) t2).a.ordinal()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah90(uf00<x690> uf00Var, v1b<? super ah90> v1bVar) {
        super(2, v1bVar);
        this.c = uf00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ah90 ah90Var = new ah90(this.c, v1bVar);
        ah90Var.b = obj;
        return ah90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super uf00<? extends zg90.c>> myhVar, v1b<? super Unit> v1bVar) {
        return ((ah90) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (x690 x690Var : this.c) {
                v690 v690Var = x690Var.g;
                Object arrayList = linkedHashMap.get(v690Var);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(v690Var, arrayList);
                }
                ((List) arrayList).add(x690Var);
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList2.add(new zg90.c(a4h.f((List) entry.getValue()), (v690) entry.getKey()));
            }
            uf00 uf00VarF = a4h.f(CollectionsKt.r0(arrayList2, new a()));
            this.b = null;
            this.a = 1;
            if (myhVar.emit(uf00VarF, this) == y5bVar) {
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
