package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.domain.betitem.BetItemImpl$createJsonString$snapshot$1", f = "BetItemImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class uu2 extends tje0 implements Function2<v5b, v1b<? super List<? extends Selection>>, Object> {
    public final /* synthetic */ pu2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu2(pu2 pu2Var, v1b<? super uu2> v1bVar) {
        super(2, v1bVar);
        this.a = pu2Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new uu2(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super List<? extends Selection>> v1bVar) {
        return ((uu2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ArrayList arrayList = this.a.j;
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(g880.z((Selection) obj2));
        }
        return arrayList2;
    }
}
