package defpackage;

import com.sportybet.core.segmentation.HomeSegment;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.segmentation.repository.SegmentationRepositoryImpl$segmentationFromLoggedUserFlow$1$1", f = "SegmentationRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r580 extends tje0 implements gaj<HomeSegment, HomeSegment, v1b<? super HomeSegment>, Object> {
    public /* synthetic */ HomeSegment a;
    public /* synthetic */ HomeSegment b;

    @Override // defpackage.gaj
    public final Object invoke(HomeSegment homeSegment, HomeSegment homeSegment2, v1b<? super HomeSegment> v1bVar) {
        r580 r580Var = new r580(3, v1bVar);
        r580Var.a = homeSegment;
        r580Var.b = homeSegment2;
        return r580Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        HomeSegment homeSegment = this.a;
        HomeSegment homeSegment2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return homeSegment == null ? homeSegment2 : homeSegment;
    }
}
