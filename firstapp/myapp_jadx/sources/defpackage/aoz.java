package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.PagedList$Companion$create$resolvedInitialPage$1", f = "PagedList.kt", l = {178}, m = "invokeSuspend")
public final class aoz extends tje0 implements Function2<v5b, v1b<? super wqz.b.c<Object, Object>>, Object> {
    public int a;
    public final /* synthetic */ wqz<Object, Object> b;
    public final /* synthetic */ wqz.a.c<Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoz(wqz<Object, Object> wqzVar, wqz.a.c<Object> cVar, v1b<? super aoz> v1bVar) {
        super(2, v1bVar);
        this.b = wqzVar;
        this.c = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new aoz(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super wqz.b.c<Object, Object>> v1bVar) {
        return ((aoz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            obj = this.b.d(this.c, this);
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
        wqz.b bVar = (wqz.b) obj;
        if (bVar instanceof wqz.b.c) {
            return (wqz.b.c) bVar;
        }
        if (bVar instanceof wqz.b.a) {
            throw ((wqz.b.a) bVar).a;
        }
        if (bVar instanceof wqz.b.C1263b) {
            ib5.a("Failed to create PagedList. The provided PagingSource returned LoadResult.Invalid, but a LoadResult.Page was expected. To use a PagingSource which supports invalidation, use a PagedList builder that accepts a factory method for PagingSource or DataSource.Factory, such as LivePagedList.");
            return null;
        }
        uhc.a();
        return null;
    }
}
