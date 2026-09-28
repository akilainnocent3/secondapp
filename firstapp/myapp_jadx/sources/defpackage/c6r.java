package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.data.LNRecentSearchDao_Impl$cleanupTable$2", f = "LNRecentSearchDao_Impl.kt", l = {47}, m = "invokeSuspend", v = 2)
public final class c6r extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ b6r b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6r(b6r b6rVar, long j, v1b<? super c6r> v1bVar) {
        super(1, v1bVar);
        this.b = b6rVar;
        this.c = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new c6r(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((c6r) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (w5r.a(this.b, this.c, this) == y5bVar) {
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
