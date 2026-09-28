package defpackage;

import com.sportygames.refscall.data.dto.RCGiftDTO;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportygames.refscall.domain.usecase.RCGetWalletGiftUseCaseImpl$giftFlow$2", f = "RCGetWalletGiftUseCaseImpl.kt", l = {28}, m = "invokeSuspend", v = 1)
public final class fo30 extends tje0 implements gaj<myh<? super RCGiftDTO>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super RCGiftDTO> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        fo30 fo30Var = new fo30(3, v1bVar);
        fo30Var.b = myhVar;
        return fo30Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            RCGiftDTO rCGiftDTO = new RCGiftDTO(m2g.a);
            this.b = null;
            this.a = 1;
            if (myhVar.emit(rCGiftDTO, this) == y5bVar) {
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
