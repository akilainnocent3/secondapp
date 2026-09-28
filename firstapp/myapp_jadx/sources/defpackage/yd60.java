package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.speedybingo.data.dto.SBGiftDTO;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.domain.usecase.SBGetWalletUseCaseImpl$giftFlow$2", f = "SBGetWalletUseCaseImpl.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class yd60 extends tje0 implements gaj<myh<? super SBGiftDTO>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super SBGiftDTO> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        yd60 yd60Var = new yd60(3, v1bVar);
        yd60Var.b = myhVar;
        return yd60Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            SBGiftDTO sBGiftDTO = new SBGiftDTO(m2g.a);
            this.b = null;
            this.a = 1;
            if (myhVar.emit(sBGiftDTO, this) == y5bVar) {
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
