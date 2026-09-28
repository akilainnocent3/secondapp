package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.dateofbirth.BirthdayGiftHintResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.dateofbirth.data.repository.DobRepositoryImpl$getBirthdayGiftHintData$2", f = "DobRepositoryImpl.kt", l = {41}, m = "invokeSuspend", v = 2)
public final class tve extends tje0 implements Function2<v5b, v1b<? super BirthdayGiftHintResponse>, Object> {
    public int a;
    public final /* synthetic */ xve b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tve(xve xveVar, v1b<? super tve> v1bVar) {
        super(2, v1bVar);
        this.b = xveVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tve(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super BirthdayGiftHintResponse> v1bVar) {
        return ((tve) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            x430 x430Var = this.b.b;
            this.a = 1;
            obj = x430Var.y(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return n52.b((BaseResponse) obj);
    }
}
