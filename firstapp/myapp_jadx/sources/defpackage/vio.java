package defpackage;

import com.sporty.android.core.model.instantwin.InstantWinPromotionData;
import com.sportybet.android.instantwin.presentation.promotiondialog.model.InstantWinPromotionDialogInput;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.manager.promotion.InstantWinPromotionManagerImpl$special$$inlined$flatMapLatest$1", f = "InstantWinPromotionManagerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class vio extends tje0 implements gaj<myh<? super InstantWinPromotionDialogInput>, Pair<? extends Boolean, ? extends InstantWinPromotionData>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pio d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vio(v1b v1bVar, pio pioVar) {
        super(3, v1bVar);
        this.d = pioVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super InstantWinPromotionDialogInput> myhVar, Pair<? extends Boolean, ? extends InstantWinPromotionData> pair, v1b<? super Unit> v1bVar) {
        vio vioVar = new vio(v1bVar, this.d);
        vioVar.b = myhVar;
        vioVar.c = pair;
        return vioVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh lyhVarB;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            Pair pair = (Pair) this.c;
            boolean zBooleanValue = ((Boolean) pair.a).booleanValue();
            InstantWinPromotionData instantWinPromotionData = (InstantWinPromotionData) pair.b;
            if (!zBooleanValue || instantWinPromotionData == null) {
                lyhVarB = i2g.a;
            } else {
                pio pioVar = this.d;
                wo5 wo5Var = pioVar.d;
                String cmsPage = instantWinPromotionData.getCmsPage();
                if (cmsPage == null) {
                    cmsPage = "";
                }
                lyhVarB = uzh.b(new b0i(new uio(wo5.b(wo5Var, cmsPage, pioVar.c.getLanguageCode(null), 2), pioVar, instantWinPromotionData), new tio(4, null)));
            }
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarB, this) == y5bVar) {
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
