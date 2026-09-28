package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.gift.GiftGroup;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.plugin.common.gift.GiftViewModel$fetchValidGiftAndSetDefaultGift$1", f = "GiftViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qyk extends tje0 implements gaj<List<? extends GiftGroup>, BaseResponse<List<? extends GiftGroup>>, v1b<? super Unit>, Object> {
    public /* synthetic */ List a;
    public /* synthetic */ BaseResponse b;
    public final /* synthetic */ yyk c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Integer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyk(yyk yykVar, boolean z, Integer num, v1b v1bVar) {
        super(3, v1bVar);
        this.c = yykVar;
        this.d = z;
        this.e = num;
    }

    @Override // defpackage.gaj
    public final Object invoke(List<? extends GiftGroup> list, BaseResponse<List<? extends GiftGroup>> baseResponse, v1b<? super Unit> v1bVar) {
        boolean z = this.d;
        Integer num = this.e;
        qyk qykVar = new qyk(this.c, z, num, v1bVar);
        qykVar.a = list;
        qykVar.b = baseResponse;
        return qykVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list = this.a;
        BaseResponse baseResponse = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        yyk yykVar = this.c;
        h53 h53Var = yykVar.d;
        if (!h53Var.b()) {
            return Unit.a;
        }
        h53Var.d(true);
        boolean z = this.d;
        if (list != null) {
            wwd0 wwd0Var = yykVar.F;
            wwd0Var.getClass();
            wwd0Var.k(null, list);
            yykVar.M1(new n780.d(list));
            yykVar.F1(z);
        }
        List<GiftGroup> list2 = (List) n52.b(baseResponse);
        if (this.e.intValue() == 0) {
            ej5.c(o8i0.d(yykVar), yykVar.a, null, new azk(list2, yykVar, null), 2);
        }
        yykVar.L1(list2);
        yykVar.M1(new n780.d(list2));
        yykVar.F1(z);
        return Unit.a;
    }
}
