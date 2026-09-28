package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.luckywheel.LuckyWheelSpinResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.luckywheel.LuckyWheelUseCase$getSpinResult$3", f = "LuckyWheelUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ubu extends tje0 implements Function2<Integer, v1b<? super lyh<? extends BaseResponse<LuckyWheelSpinResponse>>>, Object> {
    public /* synthetic */ int a;
    public final /* synthetic */ wbu b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubu(wbu wbuVar, int i, v1b<? super ubu> v1bVar) {
        super(2, v1bVar);
        this.b = wbuVar;
        this.c = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ubu ubuVar = new ubu(this.b, this.c, v1bVar);
        ubuVar.a = ((Number) obj).intValue();
        return ubuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, v1b<? super lyh<? extends BaseResponse<LuckyWheelSpinResponse>>> v1bVar) {
        return ((ubu) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return this.b.a.d(this.c, i);
    }
}
