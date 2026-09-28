package defpackage;

import com.sportybet.plugin.realsports.data.GiftGrabData;
import com.sportybet.plugin.realsports.data.GiftGrabProgressData;
import com.sportybet.plugin.realsports.data.GiftGrabProgressInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.GiftGrabViewModel$getGiftGrabProgress$2", f = "GiftGrabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lmk extends tje0 implements Function2<lk50<? extends GiftGrabProgressData>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hmk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmk(hmk hmkVar, v1b<? super lmk> v1bVar) {
        super(2, v1bVar);
        this.b = hmkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lmk lmkVar = new lmk(this.b, v1bVar);
        lmkVar.a = obj;
        return lmkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends GiftGrabProgressData> lk50Var, v1b<? super Unit> v1bVar) {
        return ((lmk) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        GiftGrabProgressData giftGrabProgressData;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!(lk50Var instanceof lk50.c)) {
            lk50Var = null;
        }
        lk50.c cVar = (lk50.c) lk50Var;
        if (cVar != null && (giftGrabProgressData = (GiftGrabProgressData) cVar.a) != null) {
            hmk hmkVar = this.b;
            hmkVar.E.m(new Integer(giftGrabProgressData.percentage));
            wwd0 wwd0Var = hmkVar.I;
            GiftGrabData.Data data = new GiftGrabData.Data(new GiftGrabProgressInfo(giftGrabProgressData.grabAvailable, giftGrabProgressData.giftGrabActivityEnded));
            wwd0Var.getClass();
            wwd0Var.k(null, data);
        }
        return Unit.a;
    }
}
