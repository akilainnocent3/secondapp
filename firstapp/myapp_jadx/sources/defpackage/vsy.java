package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.attribution.OneUpPromoAttributionDataStore$consume$2$1", f = "OneUpPromoAttributionDataStore.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vsy extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ysy b;
    public final /* synthetic */ yp40 c;
    public final /* synthetic */ Set<String> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsy(ysy ysyVar, yp40 yp40Var, Set<String> set, v1b<? super vsy> v1bVar) {
        super(2, v1bVar);
        this.b = ysyVar;
        this.c = yp40Var;
        this.d = set;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vsy vsyVar = new vsy(this.b, this.c, this.d, v1bVar);
        vsyVar.a = obj;
        return vsyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((vsy) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jtw jtwVar = (jtw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zn20.a<Set<String>> aVar = this.b.b;
        Set set = (Set) jtwVar.c(aVar);
        if (set == null) {
            set = t3g.a;
        }
        Set set2 = set;
        boolean z = set2 instanceof Collection;
        boolean z2 = false;
        Set<String> set3 = this.d;
        if (!z || !set2.isEmpty()) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                if (set3.contains((String) it.next())) {
                    z2 = true;
                    break;
                }
            }
        }
        this.c.a = z2;
        if (z2) {
            jtwVar.h(aVar, yi80.d(set, set3));
        }
        return Unit.a;
    }
}
