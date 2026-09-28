package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSelectionHandlerImpl$init$1", f = "ScheduledFootballSelectionHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gi70 extends tje0 implements Function2<List<? extends bi70>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ li70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi70(li70 li70Var, v1b<? super gi70> v1bVar) {
        super(2, v1bVar);
        this.b = li70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gi70 gi70Var = new gi70(this.b, v1bVar);
        gi70Var.a = obj;
        return gi70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends bi70> list, v1b<? super Unit> v1bVar) {
        return ((gi70) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        ArrayList arrayList;
        List<bi70> list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        li70 li70Var = this.b;
        wwd0 wwd0Var = li70Var.c;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, new d880(((d880) value).b, list.size())));
        wwd0 wwd0Var2 = li70Var.d;
        do {
            value2 = wwd0Var2.getValue();
            List list2 = (List) value2;
            int iA = jpu.a(l48.r(list2, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Object obj2 : list2) {
                linkedHashMap.put(((cz2) obj2).c, obj2);
            }
            arrayList = new ArrayList(l48.r(list, 10));
            for (bi70 bi70Var : list) {
                cz2 cz2Var = (cz2) linkedHashMap.get(bi70Var.f.a);
                if (cz2Var == null) {
                    String str = bi70Var.d.a;
                    String str2 = bi70Var.e.a;
                    ad70 ad70Var = bi70Var.f;
                    cz2Var = new cz2(str, str2, ad70Var.a, ad70Var.b, ad70Var.c);
                }
                arrayList.add(cz2Var);
            }
        } while (!wwd0Var2.g(value2, arrayList));
        if (!list.isEmpty()) {
            String strA0 = CollectionsKt.a0(CollectionsKt.r0(list, new ki70()), "\n", "\n", null, new ci70(), 28);
            itf0.a aVar = itf0.a;
            aVar.q(li70.class.getSimpleName());
            aVar.a(strA0, new Object[0]);
        }
        return Unit.a;
    }
}
