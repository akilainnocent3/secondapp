package defpackage;

import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer$collectSocketMessage$1$1", f = "FeaturedContainer.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rdh extends tje0 implements Function2<Object, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ FeaturedContainer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdh(FeaturedContainer featuredContainer, v1b<? super rdh> v1bVar) {
        super(2, v1bVar);
        this.b = featuredContainer;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rdh rdhVar = new rdh(this.b, v1bVar);
        rdhVar.a = obj;
        return rdhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
        return ((rdh) create(obj, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = obj2 instanceof SocketEventMessage;
        FeaturedContainer featuredContainer = this.b;
        if (z) {
            int i = FeaturedContainer.u0;
            featuredContainer.L((SocketEventMessage) obj2);
        } else if (obj2 instanceof SocketMarketMessage) {
            int i2 = FeaturedContainer.u0;
            featuredContainer.M((SocketMarketMessage) obj2);
        }
        return Unit.a;
    }
}
