package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.attribution.OneUpPromoAttributionDataStore$update$2$1", f = "OneUpPromoAttributionDataStore.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xsy extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ysy b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsy(ysy ysyVar, boolean z, String str, v1b<? super xsy> v1bVar) {
        super(2, v1bVar);
        this.b = ysyVar;
        this.c = z;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xsy xsyVar = new xsy(this.b, this.c, this.d, v1bVar);
        xsyVar.a = obj;
        return xsyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((xsy) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
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
        boolean z = this.c;
        String str = this.d;
        jtwVar.h(aVar, z ? yi80.f(set, str) : yi80.c(set, str));
        return Unit.a;
    }
}
