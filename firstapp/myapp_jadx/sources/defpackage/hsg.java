package defpackage;

import com.sporty.android.book.domain.entity.FeaturedBetBuilderMarket;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventViewModel$fetchFeaturedBetBuilderMarkets$1", f = "EventViewModel.kt", l = {380}, m = "invokeSuspend", v = 2)
public final class hsg extends tje0 implements gaj<myh<? super List<? extends FeaturedBetBuilderMarket>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super List<? extends FeaturedBetBuilderMarket>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        hsg hsgVar = new hsg(3, v1bVar);
        hsgVar.b = myhVar;
        return hsgVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            m2g m2gVar = m2g.a;
            this.b = null;
            this.a = 1;
            if (myhVar.emit(m2gVar, this) == y5bVar) {
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
