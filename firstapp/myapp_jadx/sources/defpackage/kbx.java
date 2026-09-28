package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.nightnday.data.dto.NNDGiftDTO;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.nightnday.domain.usecase.NNDWalletGiftUseCaseImpl$giftFlow$2", f = "NNDWalletGiftUseCaseImpl.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class kbx extends tje0 implements gaj<myh<? super NNDGiftDTO>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super NNDGiftDTO> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        kbx kbxVar = new kbx(3, v1bVar);
        kbxVar.b = myhVar;
        return kbxVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            NNDGiftDTO nNDGiftDTO = new NNDGiftDTO(m2g.a);
            this.b = null;
            this.a = 1;
            if (myhVar.emit(nNDGiftDTO, this) == y5bVar) {
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
