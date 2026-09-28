package defpackage;

import com.sportygames.goldmine.data.dto.TGGiftDTO;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.usecase.TGGetUserUseCase$giftFlow$2", f = "TGGetUserUseCase.kt", l = {38}, m = "invokeSuspend", v = 1)
public final class bwe0 extends tje0 implements gaj<myh<? super TGGiftDTO>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super TGGiftDTO> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        bwe0 bwe0Var = new bwe0(3, v1bVar);
        bwe0Var.b = myhVar;
        return bwe0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            TGGiftDTO tGGiftDTO = new TGGiftDTO(m2g.a);
            this.b = null;
            this.a = 1;
            if (myhVar.emit(tGGiftDTO, this) == y5bVar) {
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
