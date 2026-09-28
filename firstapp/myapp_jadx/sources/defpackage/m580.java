package defpackage;

import com.sportybet.core.segmentation.HomeSegment;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.segmentation.repository.SegmentationRepositoryImpl$getCurrentActiveSegment$$inlined$flatMapLatest$1", f = "SegmentationRepositoryImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class m580 extends tje0 implements gaj<myh<? super HomeSegment>, i580.a, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o580 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m580(v1b v1bVar, o580 o580Var) {
        super(3, v1bVar);
        this.d = o580Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super HomeSegment> myhVar, i580.a aVar, v1b<? super Unit> v1bVar) {
        m580 m580Var = new m580(v1bVar, this.d);
        m580Var.b = myhVar;
        m580Var.c = aVar;
        return m580Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh lyhVarC;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            int iOrdinal = ((i580.a) this.c).ordinal();
            o580 o580Var = this.d;
            if (iOrdinal == 0) {
                itf0.a.a("SegmentationRepositoryImp getCurrentActiveSegment segmentationFromLoggedUserFlow()", new Object[0]);
                lyhVarC = ozh.c(r0i.f(o580Var.d.getAccountHolderFlow(), new q580(null, o580Var)), o580Var.f);
            } else if (iOrdinal == 1) {
                itf0.a.a("SegmentationRepositoryImp getCurrentActiveSegment feature disabled on Backoffice. Returning BO Default", new Object[0]);
                lyhVarC = new wm20("stored_backoffice_default_segmentation", jq40.a(HomeSegment.class), o580Var.b).d(HomeSegment.Sports);
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                itf0.a.a("SegmentationRepositoryImp Backoffice config not loaded yet. Returning null", new Object[0]);
                lyhVarC = new gzh(null);
            }
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarC, this) == y5bVar) {
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
