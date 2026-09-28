package defpackage;

import com.sportybet.core.segmentation.HomeSegment;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.segmentation.repository.SegmentationRepositoryImpl$segmentationFromLoggedUserFlow$$inlined$flatMapLatest$1", f = "SegmentationRepositoryImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class q580 extends tje0 implements gaj<myh<? super HomeSegment>, t8, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o580 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q580(v1b v1bVar, o580 o580Var) {
        super(3, v1bVar);
        this.d = o580Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super HomeSegment> myhVar, t8 t8Var, v1b<? super Unit> v1bVar) {
        q580 q580Var = new q580(v1bVar, this.d);
        q580Var.b = myhVar;
        q580Var.c = t8Var;
        return q580Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh lyhVarD;
        String str;
        o580 o580Var = this.d;
        i580 i580Var = o580Var.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            t8 t8Var = (t8) this.c;
            if (t8Var != null) {
                try {
                    str = t8Var.f;
                } catch (Exception e) {
                    itf0.a.d("SegmentationRepositoryImp segmentationFromLoggedUserFlow error: " + e, new Object[0]);
                    lyhVarD = new wm20("stored_backoffice_default_segmentation", jq40.a(HomeSegment.class), i580Var).d(HomeSegment.Sports);
                }
            } else {
                str = null;
            }
            if (str != null) {
                lyhVarD = new wm20("stored_user_segmentation_".concat(str), jq40.a(HomeSegment.class), i580Var).c();
            } else {
                String code = o580Var.c.getCountryCode().getCode();
                code.getClass();
                lyhVarD = new n1i(new wm20("stored_country_default_segmentation_".concat(code), jq40.a(HomeSegment.class), i580Var).c(), new wm20("stored_backoffice_default_segmentation", jq40.a(HomeSegment.class), i580Var).c(), new r580(3, null));
            }
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarD, this) == y5bVar) {
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
