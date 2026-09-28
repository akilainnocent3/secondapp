package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 c100[], still in use, count: 1, list:
  (r0v1 c100[]) from 0x03e8: CONSTRUCTOR (r0v1 c100[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:1001) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class c100 {
    e(0, 12, "NONE", "None"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(0, 12, "SAVED_ASSET", "Saved_Asset"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(0, 12, "MPESA", "Mpesa"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(R.drawable.mpesa, 8, "PAYSTACK_CARD", "Paystack_Card"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(0, 12, "PAYSTACK_BANK", "Paystack_Bank"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(0, 12, "ONE_TIME_ACCOUNT", "One_Time_Account"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6(0, 12, "HUBTEL_MOBILE", "Hubtel_Mobile_Money"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7(0, 12, "HUBTEL_PAYBILL", "Hubtel_USSD"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8(0, 12, "PALMPAY", "PALMPAY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9(0, 12, "MASTERCARD", "Mastercard"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10(0, 12, "GT_BANK", "GT Bank"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11(0, 12, "OPAY", "OPAY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12(0, 12, "TENN", "TENN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13(0, 12, "PAYSTACK_DEDICATED_NUBAN", "Paystack_Dedicated_Nuban"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14(0, 12, "BTG_V2_DEPOSIT", "BTG"),
    /* JADX INFO: Fake field, exist only in values array */
    EF16(0, 12, "BTG_V2_WITHDRAWAL", "BTG"),
    /* JADX INFO: Fake field, exist only in values array */
    EF16(0, 12, "ZRO_BANK_PIX_DEPOSIT", "Zro Bank Pix"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17(0, 12, "ZRO_BANK_PIX_WITHDRAWAL", "Zro Bank Pix"),
    f(R.drawable.eft_ozow_logo, 8, "EFT_OZOW", "Instant EFT by Ozow"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19(R.drawable.capitec_ozow_logo, 8, "CAPITEC_OZOW", "Capitec Pay"),
    /* JADX INFO: Fake field, exist only in values array */
    EF20(R.drawable.payshap_ozow_logo, 8, "PAYSHAP_OZOW", "Payshap by Ozow"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21(R.drawable.eft_provider, 8, "EFT_OZOW_PAYOUTS", "Ozow Payouts"),
    /* JADX INFO: Fake field, exist only in values array */
    EF22(R.drawable.eft_provider, 8, "EFT_PEACH_PAYOUTS", "Peach Payouts"),
    /* JADX INFO: Fake field, exist only in values array */
    EF23(R.drawable.peach_card_deposit_logo, 8, "PEACH_CARD", "Peach"),
    /* JADX INFO: Fake field, exist only in values array */
    EF24(R.drawable.one_voucher_logo, 8, "ONE_VOUCHER", "Peach 1Voucher"),
    /* JADX INFO: Fake field, exist only in values array */
    EF25(R.drawable.one_voucher_logo, 8, "ONE_VOUCHER_BY_FLASH_DEPOSIT", "Flash 1Voucher"),
    i(R.drawable.sportybet_voucher_logo, 8, "SPORTY_BET_VOUCHER_DEPOSIT", "SportyBet Voucher"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27(R.drawable.ott_voucher_logo, 8, "OTT_VOUCHER", "OTT Voucher"),
    /* JADX INFO: Fake field, exist only in values array */
    EF28(R.drawable.blu_voucher_logo, 8, "BLU_VOUCHER", "Blu Voucher"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29(R.drawable.ott_payout_fnb_logo, "OTT_PAYOUT_FNB", "FNB eWallet", "1-FNB"),
    /* JADX INFO: Fake field, exist only in values array */
    EF30(R.drawable.ott_payout_standard_bank_logo, "OTT_PAYOUT_STANDARD_BANK", "Standard Bank eWallet", "2-Standard Bank Instant Money"),
    /* JADX INFO: Fake field, exist only in values array */
    EF32(R.drawable.ott_payout_nedbank_logo, "OTT_PAYOUT_NEDBANK", "Nedbank Cardless eWallet", "4-Nedbank Cardless"),
    /* JADX INFO: Fake field, exist only in values array */
    EF32(R.drawable.ott_payout_absa_cashsend_logo, "OTT_PAYOUT_ABSA_CASHSEND", "ABSA CashSend", "67-ABSA CashSend"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33(R.drawable.wallet_doc_by_sporty_pay, 8, "SPORTYPAY_CARD", "SportyPay Card"),
    /* JADX INFO: Fake field, exist only in values array */
    EF34(R.drawable.instant_eft_by_sporty_pay, 8, "EFT_SPORTYPAY", "Instant EFT by SportyPay"),
    /* JADX INFO: Fake field, exist only in values array */
    EF35(R.drawable.capitec_pay_by_sporty_pay, 8, "CAPITEC_SPORTYPAY", "Capitec Pay by SportyPay"),
    /* JADX INFO: Fake field, exist only in values array */
    EF36(R.drawable.wallet_doc_card, 8, "WALLETDOC_CARD", "WalletDoc Card"),
    /* JADX INFO: Fake field, exist only in values array */
    EF37(R.drawable.wallet_doc_bank_2_bank, 8, "WALLETDOC_BANK2BANK", "Bank2Bank by WalletDoc"),
    /* JADX INFO: Fake field, exist only in values array */
    EF38(R.drawable.capitec_pay_by_wallet_doc, 8, "CAPITEC_WALLETDOC", "Capitec Pay by WalletDoc"),
    /* JADX INFO: Fake field, exist only in values array */
    EF39(R.drawable.nuvei_credit_card_logo, 8, "NUVEI_CARD", "Credit card"),
    /* JADX INFO: Fake field, exist only in values array */
    EF40(R.drawable.spei_by_nuvei_logo, 8, "NUVEI_SPEI_DEPOSIT", "Nuvei spei"),
    /* JADX INFO: Fake field, exist only in values array */
    EF41(R.drawable.nuvei_oxxo_logo, 8, "NUVEI_OXXO", "Oxxo"),
    /* JADX INFO: Fake field, exist only in values array */
    EF42(R.drawable.spei_logo, 8, "NUVEI_SPEI_WITHDRAWAL", "Spei"),
    v(R.drawable.spei_by_stp_logo, 8, "SPEI_BY_STP_DEPOSIT", "SPEI by STP"),
    /* JADX INFO: Fake field, exist only in values array */
    EF44(R.drawable.spei_logo, 8, "SPEI_BY_STP_WITHDRAWAL", "SPEI by STP"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45(R.drawable.eft_provider, 8, "EFT_WALLETDOC", "Instant EFT by WalletDoc"),
    /* JADX INFO: Fake field, exist only in values array */
    EF46(R.drawable.logo_intouch_mobile_money, 8, "INTOUCH_MOBILE_MONEY", "InTouch Mobile MTN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF48(R.drawable.logo_intouch_orange_money, 8, "INTOUCH_ORANGE_MONEY", "InTouch Mobile Orange"),
    /* JADX INFO: Fake field, exist only in values array */
    EF48(R.drawable.logo_intouch_mobile_money, 8, "CAMPAY_MOBILE_MONEY", "CamPay Mobile MTN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF49(R.drawable.logo_intouch_orange_money, 8, "CAMPAY_ORANGE_MONEY", "CamPay Mobile Orange"),
    w(R.drawable.pawapay_mpesa_logo, 8, "PAWAPAY_MPESA", "M-Pesa");

    public static final /* synthetic */ uag z;
    public final int a;
    public final String b;
    public final int c;
    public final String d;

    static {
        z = new uag(c100VarArr);
    }

    public /* synthetic */ c100(int i2, int i3, String str, String str2) {
        this((i3 & 4) != 0 ? R.drawable.ic_payment_account : i2, str, str2, (String) null);
    }

    public static c100 valueOf(String str) {
        return (c100) Enum.valueOf(c100.class, str);
    }

    public static c100[] values() {
        return (c100[]) y.clone();
    }

    public c100(int i2, String str, String str2, String str3) {
        super(str, i);
        this.a = i;
        this.b = str2;
        this.c = i2;
        this.d = str3;
    }
}
