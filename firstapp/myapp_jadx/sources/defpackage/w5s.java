package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.jvm.kt", l = {110}, m = "invokeSuspend")
public final class w5s extends tje0 implements Function2<v5b, v1b<? super wqz.b.c<Object, Object>>, Object> {
    public int a;
    public final /* synthetic */ u5s<Object, Object> b;
    public final /* synthetic */ aqc.g<Object> c;
    public final /* synthetic */ wqz.a<Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5s(u5s<Object, Object> u5sVar, aqc.g<Object> gVar, wqz.a<Object> aVar, v1b<? super w5s> v1bVar) {
        super(2, v1bVar);
        this.b = u5sVar;
        this.c = gVar;
        this.d = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new w5s(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super wqz.b.c<Object, Object>> v1bVar) {
        return ((w5s) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            aqc<Object, Object> aqcVar = this.b.c;
            this.a = 1;
            obj = aqcVar.b(this.c, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        aqc.c cVar = (aqc.c) obj;
        List<Value> list = cVar.a;
        boolean zIsEmpty = list.isEmpty();
        wqz.a<Object> aVar = this.d;
        return new wqz.b.c(list, (zIsEmpty && (aVar instanceof wqz.a.b)) ? null : cVar.b, (cVar.a.isEmpty() && (aVar instanceof wqz.a.C1262a)) ? null : cVar.c, cVar.d, cVar.e);
    }
}
