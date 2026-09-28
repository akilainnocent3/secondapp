package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.homeshortcut.sidepanel.SidePanelViewModel$handleFillWithDefaults$1", f = "SidePanelViewModel.kt", l = {335}, m = "invokeSuspend", v = 2)
public final class fh90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zg90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh90(zg90 zg90Var, v1b<? super fh90> v1bVar) {
        super(2, v1bVar);
        this.b = zg90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fh90(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fh90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            zg90 zg90Var = this.b;
            List list = (List) zg90Var.v.getValue();
            int size = 5 - list.size();
            uf00<x690> uf00Var = zg90Var.a;
            ArrayList arrayList = new ArrayList();
            for (x690 x690Var : uf00Var) {
                x690 x690Var2 = x690Var;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!Intrinsics.g(((x690) it.next()).a, x690Var2.a));
                }
                arrayList.add(x690Var);
            }
            List listT0 = CollectionsKt.t0(arrayList, size);
            ArrayList arrayList2 = new ArrayList(l48.r(listT0, 10));
            Iterator it2 = listT0.iterator();
            while (it2.hasNext()) {
                arrayList2.add(x690.a((x690) it2.next(), null, true, 255));
            }
            ArrayList arrayListI0 = CollectionsKt.i0(arrayList2, list);
            zg90Var.y1(Boolean.FALSE, null);
            zg90Var.x1();
            l790 l790Var = zg90Var.b;
            this.a = 1;
            if (l790Var.a(arrayListI0, this) == y5bVar) {
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
