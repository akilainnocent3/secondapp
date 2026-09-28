package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.gift.GiftGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.plugin.common.gift.GiftViewModel$fetchValidGiftGroups$1", f = "GiftViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class syk extends tje0 implements Function2<BaseResponse<List<? extends GiftGroup>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ yyk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syk(v1b v1bVar, yyk yykVar) {
        super(2, v1bVar);
        this.b = yykVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        syk sykVar = new syk(v1bVar, this.b);
        sykVar.a = obj;
        return sykVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BaseResponse<List<? extends GiftGroup>> baseResponse, v1b<? super Unit> v1bVar) {
        return ((syk) create(baseResponse, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BaseResponse baseResponse = (BaseResponse) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.F.setValue(n52.b(baseResponse));
        return Unit.a;
    }
}
