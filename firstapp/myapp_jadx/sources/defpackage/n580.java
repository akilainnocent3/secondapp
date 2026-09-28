package defpackage;

import com.sportybet.core.segmentation.HomeSegment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.segmentation.repository.SegmentationRepositoryImpl$getCurrentActiveSegment$2", f = "SegmentationRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n580 extends tje0 implements Function2<HomeSegment, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        n580 n580Var = new n580(2, v1bVar);
        n580Var.a = obj;
        return n580Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HomeSegment homeSegment, v1b<? super Unit> v1bVar) {
        return ((n580) create(homeSegment, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        HomeSegment homeSegment = (HomeSegment) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a.a("SegmentationRepositoryImp getCurrentActiveSegment result: " + homeSegment, new Object[0]);
        return Unit.a;
    }
}
