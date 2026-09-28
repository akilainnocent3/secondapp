package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.data.local.RecentSearchQueriesDataStore$addRecentQuery$2", f = "RecentSearchQueriesDataStore.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ei40 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ci40 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei40(ci40 ci40Var, String str, v1b<? super ei40> v1bVar) {
        super(2, v1bVar);
        this.b = ci40Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ei40 ei40Var = new ei40(this.b, this.c, v1bVar);
        ei40Var.a = obj;
        return ei40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((ei40) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jtw jtwVar = (jtw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = (String) jtwVar.c(ci40.c);
        ci40 ci40Var = this.b;
        List<String> listB = ci40Var.b(str);
        ngs ngsVarB = a.b();
        String str2 = this.c;
        ngsVarB.add(str2);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listB) {
            if (!c.l((String) obj2, str2, true)) {
                arrayList.add(obj2);
            }
        }
        ngsVarB.addAll(arrayList);
        jtwVar.g(ci40.c, ci40Var.b.toJson(CollectionsKt.t0(a.a(ngsVarB), 10)));
        return Unit.a;
    }
}
