package defpackage;

import com.sportygames.refscall.data.dto.RCGiftDTO;
import com.sportygames.refscall.data.dto.RCWalletInfoDTO;
import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportygames.refscall.domain.usecase.RCGetWalletGiftUseCaseImpl$invoke$1", f = "RCGetWalletGiftUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
public final class go30 extends tje0 implements gaj<RCWalletInfoDTO, RCGiftDTO, v1b<? super uq30>, Object> {
    public /* synthetic */ RCWalletInfoDTO a;
    public /* synthetic */ RCGiftDTO b;
    public final /* synthetic */ io30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go30(io30 io30Var, v1b<? super go30> v1bVar) {
        super(3, v1bVar);
        this.c = io30Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(RCWalletInfoDTO rCWalletInfoDTO, RCGiftDTO rCGiftDTO, v1b<? super uq30> v1bVar) {
        go30 go30Var = new go30(this.c, v1bVar);
        go30Var.a = rCWalletInfoDTO;
        go30Var.b = rCGiftDTO;
        return go30Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        RCWalletInfoDTO rCWalletInfoDTO = this.a;
        RCGiftDTO rCGiftDTO = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(rCWalletInfoDTO.getBalance());
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimal = skd0.b;
        return new uq30(bigDecimalValueOf, rCWalletInfoDTO.getCurrency(), a4h.f(rCGiftDTO.getEntityList()));
    }
}
