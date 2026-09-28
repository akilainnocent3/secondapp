package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.withdraw.transfer.TransferStatus;
import com.sporty.android.core.model.pocket.withdraw.transfer.TransferStatusDto;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$getTransferStatus$1", f = "PocketRepositoryImpl.kt", l = {966}, m = "invokeSuspend", v = 2)
public final class mt10 extends tje0 implements Function1<v1b<? super TransferStatus>, Object> {
    public int a;
    public final /* synthetic */ ms10 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt10(ms10 ms10Var, v1b<? super mt10> v1bVar) {
        super(1, v1bVar);
        this.b = ms10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new mt10(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super TransferStatus> v1bVar) {
        return ((mt10) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objR;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            pr10 pr10Var = this.b.a;
            this.a = 1;
            objR = pr10Var.R(this);
            if (objR == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objR = obj;
        }
        TransferStatusDto transferStatusDto = (TransferStatusDto) n52.b((BaseResponse) objR);
        transferStatusDto.getClass();
        Boolean bvn = transferStatusDto.getBvn();
        Boolean email = transferStatusDto.getEmail();
        Boolean withdrawPin = transferStatusDto.getWithdrawPin();
        Boolean otp = transferStatusDto.getOtp();
        Boolean enableTransfer = transferStatusDto.getEnableTransfer();
        Integer maxRecipients = transferStatusDto.getMaxRecipients();
        Integer maxSenders = transferStatusDto.getMaxSenders();
        Long enableTime = transferStatusDto.getEnableTime();
        Long maxDailyTransferAmount = transferStatusDto.getMaxDailyTransferAmount();
        BigDecimal bigDecimalA = maxDailyTransferAmount != null ? bsg0.a(maxDailyTransferAmount.longValue(), "maxDailyTransferAmount") : null;
        Long minTransferAmount = transferStatusDto.getMinTransferAmount();
        BigDecimal bigDecimalA2 = minTransferAmount != null ? bsg0.a(minTransferAmount.longValue(), "minTransferAmount") : null;
        Long maxTransferAmount = transferStatusDto.getMaxTransferAmount();
        return new TransferStatus(bvn, email, withdrawPin, otp, enableTransfer, maxRecipients, maxSenders, enableTime, bigDecimalA, bigDecimalA2, maxTransferAmount != null ? bsg0.a(maxTransferAmount.longValue(), "maxTransferAmount") : null);
    }
}
