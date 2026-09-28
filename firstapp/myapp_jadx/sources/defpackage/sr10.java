package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.common.ClabeType;
import com.sporty.android.core.model.pocket.common.TradeAdditionalRequest;
import com.sporty.android.core.model.pocket.deposit.DepositRequest;
import com.sporty.android.core.model.pocket.deposit.sportybank.DedicatedAccountCreateRequest;
import com.sporty.android.core.model.pocket.deposit.sportybank.SportyBankDto;
import com.sporty.android.core.model.pocket.withdraw.WithdrawNoticeData;
import com.sporty.android.core.model.pocket.withdraw.WithdrawRequest;
import com.sporty.android.core.model.pocket.withdraw.partner.PartnerWithdrawRequest;
import com.sporty.android.core.model.pocket.withdraw.transfer.TransferRequest;
import com.sporty.android.core.model.realsports.TransactionStatus;
import com.sporty.android.core.model.service.CountryCodeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface sr10 {
    static /* synthetic */ Object y(sr10 sr10Var, int i, String str, int i2, String str2, String str3, TransactionStatus transactionStatus, x1b x1bVar, int i3) {
        if ((i3 & 8) != 0) {
            str2 = null;
        }
        if ((i3 & 16) != 0) {
            str3 = null;
        }
        if ((i3 & 32) != 0) {
            transactionStatus = null;
        }
        return sr10Var.w(i, str, i2, str2, str3, transactionStatus, x1bVar);
    }

    Object A(String str, hj7 hj7Var);

    Object B(x1b x1bVar);

    Object C(int i, BigDecimal bigDecimal, String str, String str2, String str3, Integer num, String str4, ag6 ag6Var);

    g1i D(int i, String str);

    Object E(int i, x1b x1bVar);

    lyh<lk50<List<SportyBankDto>>> F(pu0 pu0Var);

    g1i G(pu0 pu0Var);

    Object H(j4k j4kVar);

    Object I(WithdrawRequest withdrawRequest, boolean z, x1b x1bVar);

    Object J(int i, tje0 tje0Var, String str);

    lyh<BaseResponse<WithdrawNoticeData>> K();

    g1i L(String str, String str2);

    Object M(x1b x1bVar);

    Object N(String str, ztz ztzVar);

    Object O(j6k j6kVar);

    Object P(String str, CountryCodeName countryCodeName, String str2, x1b x1bVar);

    Object Q(String str, ClabeType clabeType, uwb uwbVar);

    g1i R(pu0 pu0Var);

    Object S(int i, int i2, int i3, tje0 tje0Var);

    Object T(String str, vtz vtzVar);

    Object U(fel felVar);

    Object V(String str, w5h0 w5h0Var);

    g1i W(pu0 pu0Var);

    g1i X(pu0 pu0Var);

    Object Y(WithdrawRequest withdrawRequest, bj7 bj7Var);

    Object Z(PartnerWithdrawRequest partnerWithdrawRequest, rnj0 rnj0Var);

    lyh<String> a(log0 log0Var);

    g1i a0(pu0 pu0Var);

    g1i b(pu0 pu0Var);

    Object b0(long j, x1b x1bVar);

    Object c(long j, x1b x1bVar);

    e77 c0(pu0 pu0Var);

    Object d(int i, h4k h4kVar);

    void d0(et7 et7Var);

    Object e(int i, String str, String str2, ag6 ag6Var);

    g1i e0(pu0 pu0Var);

    Object f(ArrayList arrayList, cnu cnuVar);

    Object f0(String str, sak sakVar);

    g1i g(pu0 pu0Var);

    g1i g0(pu0 pu0Var);

    g1i h(pu0 pu0Var);

    g1i h0(pu0 pu0Var);

    void i(et7 et7Var);

    Object i0(TransferRequest transferRequest, tpj0 tpj0Var);

    jvd0 j(et7 et7Var);

    g1i j0(pu0 pu0Var);

    g1i k(pu0 pu0Var, String str);

    Object k0(int i, pud.b.a aVar);

    g1i l(pu0 pu0Var);

    g1i l0(pu0 pu0Var);

    Object m(String str, x1b x1bVar);

    g1i m0(pu0 pu0Var);

    Object n(fbk fbkVar);

    lyh n0();

    Object o(DepositRequest depositRequest, x1b x1bVar);

    Object o0(String str, tje0 tje0Var);

    Object p0(TradeAdditionalRequest tradeAdditionalRequest, x1b x1bVar);

    Object q(int i, int i2, String str, iw1 iw1Var, ohj0 ohj0Var);

    g1i q0(pu0 pu0Var);

    g1i r(pu0 pu0Var);

    g1i r0(iw1 iw1Var, String str);

    Object s(DedicatedAccountCreateRequest dedicatedAccountCreateRequest, x1b x1bVar);

    Object s0(int i, BigDecimal bigDecimal, String str, Integer num, String str2, String str3, ag6 ag6Var);

    Object t(int i, int i2, String str, Long l, yi7 yi7Var);

    Object t0(int i, Integer num, String str, ag6 ag6Var);

    g1i u(pu0 pu0Var);

    g1i v(pu0 pu0Var);

    Object w(int i, String str, int i2, String str2, String str3, TransactionStatus transactionStatus, x1b x1bVar);

    Object x(int i, String str, Integer num, kyd kydVar);

    Object z(TransferRequest transferRequest, bqj0 bqj0Var);
}
