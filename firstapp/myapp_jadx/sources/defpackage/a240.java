package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.reached.ReachedLimitsViewModel$onAdjustSettingsClicked$1", f = "ReachedLimitsViewModel.kt", l = {79}, m = "invokeSuspend", v = 2)
public final class a240 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c240 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a240(c240 c240Var, v1b<? super a240> v1bVar) {
        super(2, v1bVar);
        this.b = c240Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a240(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a240) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        Object obj2 = null;
        if (i == 0) {
            uj50.b(obj);
            c240 c240Var = this.b;
            List<c140> list = ((y140) c240Var.b.a.getValue()).a;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((c140) it.next()).a);
            }
            List listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList));
            rcs rcsVar = rcs.TIME;
            if (!listA0.contains(rcsVar)) {
                uag uagVar = rcs.v;
                q3.b bVarA = ocx.a(uagVar, uagVar);
                while (bVarA.hasNext()) {
                    Object next = bVarA.next();
                    if (listA0.contains((rcs) next)) {
                        obj2 = next;
                        break;
                    }
                }
                rcsVar = (rcs) obj2;
            }
            b390 b390Var = c240Var.c;
            i140.b bVar = new i140.b(rcsVar);
            this.a = 1;
            if (b390Var.emit(bVar, this) == y5bVar) {
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
