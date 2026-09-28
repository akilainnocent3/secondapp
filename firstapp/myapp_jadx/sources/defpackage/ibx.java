package defpackage;

import com.sportygames.nightnday.data.dto.NNDGiftDTO;
import com.sportygames.nightnday.data.dto.NNDWalletInfoDTO;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.nightnday.domain.usecase.NNDWalletGiftUseCaseImpl$fetch$1", f = "NNDWalletGiftUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
public final class ibx extends tje0 implements gaj<NNDWalletInfoDTO, NNDGiftDTO, v1b<? super gbx>, Object> {
    public /* synthetic */ NNDWalletInfoDTO a;
    public /* synthetic */ NNDGiftDTO b;
    public final /* synthetic */ mbx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibx(mbx mbxVar, v1b<? super ibx> v1bVar) {
        super(3, v1bVar);
        this.c = mbxVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(NNDWalletInfoDTO nNDWalletInfoDTO, NNDGiftDTO nNDGiftDTO, v1b<? super gbx> v1bVar) {
        ibx ibxVar = new ibx(this.c, v1bVar);
        ibxVar.a = nNDWalletInfoDTO;
        ibxVar.b = nNDGiftDTO;
        return ibxVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        NNDWalletInfoDTO nNDWalletInfoDTO = this.a;
        NNDGiftDTO nNDGiftDTO = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new gbx(nNDWalletInfoDTO.getBalance(), nNDWalletInfoDTO.getCurrency(), a4h.f(nNDGiftDTO.getEntityList()));
    }
}
