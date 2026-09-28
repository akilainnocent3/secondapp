package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.dateofbirth.DobVerificationRequest;
import com.sporty.android.core.model.dateofbirth.DobVerificationResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.dateofbirth.data.repository.DobRepositoryImpl$verifyDob$2", f = "DobRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class wve extends tje0 implements Function2<v5b, v1b<? super DobVerificationResponse>, Object> {
    public int a;
    public final /* synthetic */ xve b;
    public final /* synthetic */ DobVerificationRequest c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wve(xve xveVar, DobVerificationRequest dobVerificationRequest, v1b<? super wve> v1bVar) {
        super(2, v1bVar);
        this.b = xveVar;
        this.c = dobVerificationRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wve(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super DobVerificationResponse> v1bVar) {
        return ((wve) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            xxz xxzVar = this.b.a;
            this.a = 1;
            obj = xxzVar.H(this.c, this);
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
