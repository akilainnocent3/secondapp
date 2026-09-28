package defpackage;

import com.sportygames.speedybingo.data.dto.SBGiftDTO;
import com.sportygames.speedybingo.data.dto.SBUserDTO;
import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.domain.usecase.SBGetWalletUseCaseImpl$invoke$1", f = "SBGetWalletUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
public final class zd60 extends tje0 implements gaj<SBUserDTO, SBGiftDTO, v1b<? super hg60>, Object> {
    public /* synthetic */ SBUserDTO a;
    public /* synthetic */ SBGiftDTO b;
    public final /* synthetic */ be60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd60(be60 be60Var, v1b<? super zd60> v1bVar) {
        super(3, v1bVar);
        this.c = be60Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(SBUserDTO sBUserDTO, SBGiftDTO sBGiftDTO, v1b<? super hg60> v1bVar) {
        zd60 zd60Var = new zd60(this.c, v1bVar);
        zd60Var.a = sBUserDTO;
        zd60Var.b = sBGiftDTO;
        return zd60Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        SBUserDTO sBUserDTO = this.a;
        SBGiftDTO sBGiftDTO = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(sBUserDTO.getBalance());
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimal = skd0.b;
        return new hg60(bigDecimalValueOf, sBUserDTO.getCurrency(), a4h.f(sBGiftDTO.getEntityList()));
    }
}
