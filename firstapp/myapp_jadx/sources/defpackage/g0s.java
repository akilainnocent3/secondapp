package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", f = "LazyPagingItems.kt", l = {179}, m = "invokeSuspend")
public final class g0s extends tje0 implements Function2<kqz<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h0s<Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0s(h0s<Object> h0sVar, v1b<? super g0s> v1bVar) {
        super(2, v1bVar);
        this.c = h0sVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        g0s g0sVar = new g0s(this.c, v1bVar);
        g0sVar.b = obj;
        return g0sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kqz<Object> kqzVar, v1b<? super Unit> v1bVar) {
        return ((g0s) create(kqzVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            kqz kqzVar = (kqz) this.b;
            h0s.a aVar = this.c.c;
            this.a = 1;
            Object objA = aVar.g.a(0, new tqz(aVar, kqzVar, null), this);
            if (objA != y5bVar) {
                objA = Unit.a;
            }
            if (objA == y5bVar) {
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
