package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.api.mission.MissionTabContentKt$MissionTabContent$4$1", f = "MissionTabContent.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wvv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ List<kwv> a;
    public final /* synthetic */ Function2<dwt, List<? extends k00>, Unit> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wvv(List<kwv> list, Function2<? super dwt, ? super List<? extends k00>, Unit> function2, v1b<? super wvv> v1bVar) {
        super(2, v1bVar);
        this.a = list;
        this.b = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wvv(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wvv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List<kwv> list = this.a;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((kwv) it.next()).l);
            }
            boolean zContains = arrayList.contains(wwv.b);
            Function2<dwt, List<? extends k00>, Unit> function2 = this.b;
            if (zContains) {
                function2.invoke(dwt.b.a, a.c(k00.d));
            } else if (arrayList.contains(wwv.a)) {
                function2.invoke(dwt.d.a, a.c(k00.d));
            } else if (arrayList.contains(wwv.e)) {
                function2.invoke(dwt.c.a, a.c(k00.d));
            }
        }
        return Unit.a;
    }
}
