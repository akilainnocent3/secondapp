package defpackage;

import com.sportybet.plugin.realsports.data.GiftGrabGiftValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.GiftGrabViewModel$getGiftValue$2", f = "GiftGrabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class nmk extends tje0 implements Function2<lk50<? extends GiftGrabGiftValue>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hmk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmk(hmk hmkVar, v1b<? super nmk> v1bVar) {
        super(2, v1bVar);
        this.b = hmkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nmk nmkVar = new nmk(this.b, v1bVar);
        nmkVar.a = obj;
        return nmkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends GiftGrabGiftValue> lk50Var, v1b<? super Unit> v1bVar) {
        return ((nmk) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.b;
        hmk hmkVar = this.b;
        if (z) {
            wwd0 wwd0Var = hmkVar.G;
            Boolean bool = Boolean.TRUE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
        } else if (lk50Var instanceof lk50.c) {
            hmkVar.A.m((GiftGrabGiftValue) ((lk50.c) lk50Var).a);
            wwd0 wwd0Var2 = hmkVar.G;
            Boolean bool2 = Boolean.FALSE;
            wwd0Var2.getClass();
            wwd0Var2.k(null, bool2);
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            hmkVar.y.m(((lk50.a) lk50Var).b);
            wwd0 wwd0Var3 = hmkVar.G;
            Boolean bool3 = Boolean.FALSE;
            wwd0Var3.getClass();
            wwd0Var3.k(null, bool3);
        }
        return Unit.a;
    }
}
