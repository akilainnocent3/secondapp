package defpackage;

import android.text.TextUtils;
import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.transaction.Transaction;
import com.sporty.android.core.model.pocket.transaction.TransactionProgressDetail;
import com.sportybet.android.gp.tz.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h4h0 implements Function1<t3h0, t3h0> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Transaction b;
    public final /* synthetic */ r4h0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ t8h0 e;
    public final /* synthetic */ f1h0 f;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ int v;

    public h4h0(boolean z, Transaction transaction, r4h0 r4h0Var, boolean z2, t8h0 t8h0Var, f1h0 f1h0Var, boolean z3, int i) {
        this.a = z;
        this.b = transaction;
        this.c = r4h0Var;
        this.d = z2;
        this.e = t8h0Var;
        this.f = f1h0Var;
        this.i = z3;
        this.v = i;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x037c  */
    /* JADX WARN: Code duplicated, block: B:114:0x038a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0394  */
    /* JADX WARN: Code duplicated, block: B:117:0x0398  */
    /* JADX WARN: Code duplicated, block: B:118:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:121:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:125:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:128:0x0402  */
    /* JADX WARN: Code duplicated, block: B:134:0x041b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0428  */
    /* JADX WARN: Code duplicated, block: B:143:0x043e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0444  */
    /* JADX WARN: Code duplicated, block: B:147:0x044c  */
    /* JADX WARN: Code duplicated, block: B:148:0x044e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0456  */
    /* JADX WARN: Code duplicated, block: B:156:0x0461  */
    /* JADX WARN: Code duplicated, block: B:159:0x0474  */
    /* JADX WARN: Code duplicated, block: B:161:0x047a  */
    /* JADX WARN: Code duplicated, block: B:173:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:179:0x0506  */
    /* JADX WARN: Code duplicated, block: B:182:0x0517  */
    /* JADX WARN: Code duplicated, block: B:183:0x051f  */
    /* JADX WARN: Code duplicated, block: B:185:0x052c  */
    /* JADX WARN: Code duplicated, block: B:186:0x054e  */
    /* JADX WARN: Code duplicated, block: B:189:0x055c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0573  */
    /* JADX WARN: Code duplicated, block: B:193:0x0581  */
    /* JADX WARN: Code duplicated, block: B:195:0x058b  */
    /* JADX WARN: Code duplicated, block: B:198:0x0594  */
    /* JADX WARN: Code duplicated, block: B:200:0x059c  */
    /* JADX WARN: Code duplicated, block: B:203:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:205:0x05af  */
    /* JADX WARN: Code duplicated, block: B:207:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:211:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:214:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:218:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:221:0x0600  */
    /* JADX WARN: Code duplicated, block: B:222:0x060e  */
    /* JADX WARN: Code duplicated, block: B:225:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:230:0x0716  */
    /* JADX WARN: Code duplicated, block: B:232:0x0729  */
    /* JADX WARN: Code duplicated, block: B:233:0x0755  */
    /* JADX WARN: Code duplicated, block: B:235:0x0761  */
    /* JADX WARN: Code duplicated, block: B:236:0x0790  */
    /* JADX WARN: Code duplicated, block: B:238:0x0798  */
    /* JADX WARN: Code duplicated, block: B:239:0x07da  */
    /* JADX WARN: Code duplicated, block: B:242:0x05da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:44:0x0157  */
    /* JADX WARN: Code duplicated, block: B:45:0x015a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0197  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x020c  */
    /* JADX WARN: Code duplicated, block: B:64:0x021d  */
    /* JADX WARN: Code duplicated, block: B:66:0x022a  */
    /* JADX WARN: Code duplicated, block: B:68:0x024b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0254  */
    /* JADX WARN: Code duplicated, block: B:71:0x0262  */
    /* JADX WARN: Code duplicated, block: B:73:0x026f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0279  */
    /* JADX WARN: Code duplicated, block: B:76:0x0282  */
    /* JADX WARN: Code duplicated, block: B:77:0x0291  */
    /* JADX WARN: Code duplicated, block: B:79:0x029a  */
    /* JADX WARN: Code duplicated, block: B:81:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:83:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:84:0x02d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v16, types: [m2g] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final t3h0 invoke(t3h0 t3h0Var) {
        t2h0 t2h0Var;
        ResourceUiText resourceUiText;
        UiText coloredUiText;
        UiText uiText;
        boolean z;
        UiText resourceUiText2;
        String str;
        UiText resourceUiText3;
        int i;
        boolean z2;
        ResourceUiText resourceUiText4;
        UiText uiText2;
        boolean zG;
        String str2;
        StringUiText stringUiText;
        String str3;
        boolean z3;
        String str4;
        StringUiText stringUiText2;
        boolean z4;
        String str5;
        boolean z5;
        String str6;
        UiText coloredUiText2;
        UiText stringUiText3;
        int i2;
        Long l;
        UiText stringUiText4;
        boolean z6;
        t2h0 t2h0Var2;
        ?? arrayList;
        String str7;
        boolean z7;
        u2h0 u2h0Var;
        String str8;
        String strValueOf;
        b2h0 b2h0Var;
        ArrayList<TransactionProgressDetail> arrayList2;
        int size;
        int i3;
        TransactionProgressDetail transactionProgressDetail;
        String progress;
        StringUiText stringUiText5;
        StringUiText stringUiText6;
        String content;
        StringUiText stringUiText7;
        StringUiText stringUiText8;
        Integer status;
        Long updateTime;
        StringUiText stringUiText9;
        String str9;
        t3h0 t3h0Var2 = t3h0Var;
        t3h0Var2.getClass();
        String str10 = this.c.z;
        boolean z8 = this.a;
        Transaction transaction = this.b;
        if (z8) {
            t2h0Var = rqg0.a(transaction, str10);
        } else {
            SimpleDateFormat simpleDateFormat = rqg0.a;
            str10.getClass();
            t2h0 t2h0VarA = rqg0.a(transaction, str10);
            StringUiText stringUiText10 = vch0.a;
            ResourceUiText resourceUiText5 = new ResourceUiText(R.string.common_functions__amount_label, ay0.S(new Object[]{str10}));
            UiText uiText3 = t2h0VarA.b;
            uiText3.getClass();
            t2h0Var = new t2h0((UiText) resourceUiText5, uiText3, true);
        }
        String str11 = transaction.tradeCode;
        kog0[] kog0VarArr = kog0.a;
        int i4 = Intrinsics.g(str11, "WD0004") ? R.string.page_withdraw__commission_to_partner : R.string.common_functions__additional_fee;
        StringUiText stringUiText11 = vch0.a;
        ResourceUiText resourceUiText6 = new ResourceUiText(i4);
        long j = transaction.feeAmount;
        UiText resourceUiText7 = j != 0 ? new ResourceUiText(R.string.page_transaction__neg_amount, ay0.S(new Object[]{bjb0.U(j, Locale.US)})) : vch0.a;
        StringUiText stringUiText12 = vch0.a;
        t2h0 t2h0Var3 = new t2h0(resourceUiText6, resourceUiText7, !Intrinsics.g(resourceUiText7, stringUiText12));
        ResourceUiText resourceUiText8 = new ResourceUiText(R.string.common_functions__time);
        String str12 = rqg0.a.format(new Date(transaction.createTime));
        str12.getClass();
        t2h0 t2h0Var4 = new t2h0(resourceUiText8, new StringUiText(str12), 4);
        Integer numValueOf = Integer.valueOf(R.color.warning_primary);
        int i5 = transaction.status;
        if (i5 == 10) {
            String str13 = transaction.auditStatus;
            j41[] j41VarArr = j41.a;
            if (Intrinsics.g(str13, "11")) {
                resourceUiText = new ResourceUiText(R.string.page_transaction__withdrawals_blocked);
            } else if (Intrinsics.g(str13, "12")) {
                resourceUiText = new ResourceUiText(R.string.page_transaction__pending_verification);
            } else {
                resourceUiText = Intrinsics.g(str13, "13") ? new ResourceUiText(R.string.page_transaction__verification_failed) : new ResourceUiText(R.string.page_transaction__pending);
            }
            coloredUiText = new ColoredUiText(resourceUiText, numValueOf, null);
        } else {
            if (i5 != 20) {
                if (i5 == 30) {
                    coloredUiText = new ColoredUiText(new ResourceUiText(R.string.page_transaction__failed), numValueOf, null);
                } else if (i5 == 90) {
                    coloredUiText = new ColoredUiText(new ResourceUiText(R.string.page_transaction__closed), Integer.valueOf(R.color.text_type1_secondary), null);
                } else if (i5 == 33 || i5 == 34) {
                    coloredUiText = new ColoredUiText(new ResourceUiText(R.string.page_transaction__failed), numValueOf, null);
                } else {
                    uiText = stringUiText12;
                }
                ResourceUiText resourceUiText9 = new ResourceUiText(R.string.common_functions__status);
                if (transaction.status == 20) {
                    z = true;
                } else {
                    z = false;
                }
                q3h0 q3h0Var = new q3h0(resourceUiText9, uiText, z, transaction.showFixStatus, this.d);
                t2h0 t2h0Var5 = t2h0Var;
                t2h0 t2h0Var6 = new t2h0((UiText) new ResourceUiText(R.string.common_functions__type), this.e.a(Integer.valueOf(transaction.bizType), transaction.tradeCode, transaction.bizTypeName, transaction.subBizTypeName), true);
                if (!TextUtils.isEmpty(transaction.counterFull)) {
                    String str14 = transaction.counterFull;
                    str14.getClass();
                    resourceUiText2 = new StringUiText(str14);
                } else if (!TextUtils.isEmpty(transaction.counterAuthority) || TextUtils.isEmpty(transaction.counterpart)) {
                    resourceUiText2 = stringUiText12;
                } else {
                    String str15 = transaction.counterAuthority;
                    str15.getClass();
                    String str16 = transaction.counterpart;
                    str16.getClass();
                    resourceUiText2 = new ResourceUiText(R.string.page_transaction__paystack, ay0.S(new Object[]{str15, str16}));
                }
                str = transaction.tradeCode;
                if (Intrinsics.g(str, "AD0001")) {
                    if (Intrinsics.g(str, "DP0001")) {
                        if (Intrinsics.g(str, "TF0005")) {
                            ResourceUiText resourceUiText10 = new ResourceUiText(R.string.page_transaction__deposit_from);
                            String str17 = transaction.counterpart;
                            str17.getClass();
                            uiText2 = resourceUiText10;
                            resourceUiText2 = new ResourceUiText(R.string.common_functions__partner_amount, ay0.S(new Object[]{str17}));
                        } else {
                            if (Intrinsics.g(str, "TF0007")) {
                                if (Intrinsics.g(str, "WD0001")) {
                                    resourceUiText3 = new ResourceUiText(R.string.page_transaction__withdraw_to);
                                    zG = Intrinsics.g(resourceUiText2, stringUiText12);
                                } else if (Intrinsics.g(str, "WD0003")) {
                                    resourceUiText3 = new ResourceUiText(R.string.page_transaction__withdraw_to);
                                    resourceUiText2 = new ResourceUiText(R.string.common_functions__offline);
                                } else {
                                    if (Intrinsics.g(str, "WD0004")) {
                                        ResourceUiText resourceUiText11 = new ResourceUiText(R.string.page_transaction__withdraw_to);
                                        String str18 = transaction.counterpart;
                                        str18.getClass();
                                        uiText2 = resourceUiText11;
                                        resourceUiText4 = new ResourceUiText(R.string.common_functions__partner_amount, ay0.S(new Object[]{str18}));
                                    } else if (Intrinsics.g(str, "AD0002")) {
                                        resourceUiText3 = new ResourceUiText(R.string.page_transaction__transfer_to);
                                        resourceUiText2 = new ResourceUiText(R.string.page_transaction__operator);
                                    } else if (!Intrinsics.g(str, "RF0001") || Intrinsics.g(str, QWvyvNzGsBpRT.bpOLPh) || Intrinsics.g(str, "RF0003")) {
                                        resourceUiText3 = new ResourceUiText(R.string.page_transaction__refundto);
                                        i = transaction.payChId;
                                        c100 c100Var = c100.e;
                                        if (i == 0) {
                                            resourceUiText2 = new ResourceUiText(R.string.common_functions__balance);
                                        } else if (i == 10) {
                                            String str19 = transaction.counterpart;
                                            str19.getClass();
                                            uiText2 = resourceUiText3;
                                            resourceUiText4 = new ResourceUiText(R.string.page_transaction__mpesa, ay0.S(new Object[]{str19}));
                                        } else {
                                            resourceUiText2 = stringUiText12;
                                            z2 = false;
                                        }
                                    } else if (Intrinsics.g(str, "CB0007")) {
                                        resourceUiText3 = new ResourceUiText(R.string.common_functions__from);
                                        resourceUiText2 = new ResourceUiText(R.string.page_transaction__sportybet_exclusive_offer);
                                    } else if (Intrinsics.g(str, "CB0003")) {
                                        resourceUiText3 = new ResourceUiText(R.string.common_functions__from);
                                        resourceUiText2 = new ResourceUiText(R.string.common_functions__offline);
                                    } else if (Intrinsics.g(str, "CB0005")) {
                                        resourceUiText3 = new ResourceUiText(R.string.common_functions__from);
                                        resourceUiText2 = new ResourceUiText(R.string.common_functions__bookmaker);
                                    } else if (Intrinsics.g(str, "CB0006")) {
                                        resourceUiText3 = new ResourceUiText(R.string.common_functions__from);
                                        resourceUiText2 = new ResourceUiText(R.string.page_transaction__bookmaker_compensation_brackets);
                                    } else if (Intrinsics.g(str, "RB0001")) {
                                        resourceUiText3 = new ResourceUiText(R.string.page_payment__deposit_from);
                                        resourceUiText2 = new ResourceUiText(R.string.page_transaction__sportybet_exclusive_offer);
                                    } else {
                                        if (!Intrinsics.g(str, "FE0001") && !Intrinsics.g(str, "TF0001")) {
                                            Intrinsics.g(str, "WT0001");
                                        }
                                        resourceUiText3 = stringUiText12;
                                        resourceUiText2 = resourceUiText3;
                                        z2 = false;
                                    }
                                    resourceUiText2 = resourceUiText4;
                                }
                                o3h0 o3h0Var = new o3h0(resourceUiText3, resourceUiText2, z2);
                                String str20 = transaction.tradeId;
                                str20.getClass();
                                t2h0 t2h0Var7 = new t2h0(new ResourceUiText(R.string.page_transaction__trade_no), new StringUiText(str20), !Intrinsics.g(transaction.tradeCode, "WT0001"));
                                ResourceUiText resourceUiText12 = new ResourceUiText(R.string.page_transaction__transaction_no);
                                str2 = transaction.payChTxId;
                                if (str2 != null || str2.length() == 0) {
                                    stringUiText = stringUiText12;
                                } else {
                                    String str21 = transaction.payChTxId;
                                    str21.getClass();
                                    stringUiText = new StringUiText(str21);
                                }
                                str3 = transaction.tradeId;
                                if (str3 != null && str3.length() != 0) {
                                    String str22 = transaction.tradeId;
                                    str22.getClass();
                                    stringUiText = new StringUiText(str22);
                                }
                                if (!Intrinsics.g(transaction.tradeCode, "TF0007") || (str9 = transaction.payChTxId) == null || str9.length() == 0) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                t2h0 t2h0Var8 = new t2h0(resourceUiText12, stringUiText, z3);
                                ResourceUiText resourceUiText13 = new ResourceUiText(R.string.jackpot__round_no_dot);
                                str4 = transaction.goodsName;
                                if (str4 != null) {
                                    stringUiText2 = new StringUiText(str4);
                                } else {
                                    stringUiText2 = stringUiText12;
                                }
                                if (transaction.bizType == 4) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                t2h0 t2h0Var9 = new t2h0(resourceUiText13, stringUiText2, z4);
                                str5 = transaction.orderId;
                                if (str5 != null || str5.length() == 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                boolean z9 = !z5;
                                ResourceUiText resourceUiText14 = new ResourceUiText(R.string.page_transaction__ticket_id);
                                str6 = transaction.orderId;
                                f1h0 f1h0Var = this.f;
                                if (str6 == null && str6.length() != 0) {
                                    String str23 = transaction.orderId;
                                    str23.getClass();
                                    coloredUiText2 = new ColoredUiText(new StringUiText(str23), ((f1h0Var.a instanceof q8h0.a) || f1h0Var.b.length() <= 0) ? null : Integer.valueOf(R.color.brand_secondary), null);
                                }
                                f5h0 f5h0Var = new f5h0(resourceUiText14, coloredUiText2, z9, f1h0Var);
                                str10.getClass();
                                ResourceUiText resourceUiText15 = new ResourceUiText(R.string.page_transaction__balance);
                                boolean z10 = !Intrinsics.g(transaction.tradeCode, "WT0001");
                                if (transaction.status != 10 || Intrinsics.g(transaction.tradeCode, "WD0003") || Intrinsics.g(transaction.tradeCode, "CB0003")) {
                                    stringUiText3 = new StringUiText("- - -");
                                } else {
                                    stringUiText3 = new StringUiText(bjb0.U(transaction.afterBal, Locale.US)).h(new StringUiText(" ")).h(new StringUiText(str10));
                                }
                                t2h0 t2h0Var10 = new t2h0(resourceUiText15, stringUiText3, z10);
                                str10.getClass();
                                if (this.i) {
                                    i2 = 0;
                                    ResourceUiText resourceUiText16 = new ResourceUiText(R.string.page_transaction__initial_balance);
                                    l = transaction.initBal;
                                    if (l != null) {
                                        stringUiText4 = new StringUiText(bjb0.U(l.longValue(), Locale.US)).h(new StringUiText(" ")).h(new StringUiText(str10));
                                    } else {
                                        stringUiText4 = new StringUiText("- - -");
                                    }
                                    z6 = true;
                                    t2h0Var2 = new t2h0((UiText) resourceUiText16, stringUiText4, true);
                                } else {
                                    i2 = 0;
                                    t2h0Var2 = new t2h0((UiText) stringUiText12, (UiText) stringUiText12, false);
                                    z6 = true;
                                }
                                if (z8) {
                                    arrayList2 = transaction.transactionProgressDetailList;
                                    arrayList2.getClass();
                                    arrayList = new ArrayList(l48.r(arrayList2, 10));
                                    size = arrayList2.size();
                                    i3 = i2;
                                    while (i3 < size) {
                                        TransactionProgressDetail transactionProgressDetail2 = arrayList2.get(i3);
                                        i3++;
                                        transactionProgressDetail = transactionProgressDetail2;
                                        progress = transactionProgressDetail.getProgress();
                                        if (progress != null) {
                                            StringUiText stringUiText13 = vch0.a;
                                            stringUiText5 = new StringUiText(progress);
                                        } else {
                                            stringUiText5 = vch0.a;
                                        }
                                        stringUiText6 = stringUiText5;
                                        content = transactionProgressDetail.getContent();
                                        if (content != null) {
                                            stringUiText7 = new StringUiText(content);
                                        } else {
                                            stringUiText7 = vch0.a;
                                        }
                                        stringUiText8 = stringUiText7;
                                        status = transactionProgressDetail.getStatus();
                                        if (status != null) {
                                            uj5.a(transaction.transactionProgressDetailList, "WithdrawStatue value error. ");
                                            return null;
                                        }
                                        int iIntValue = status.intValue();
                                        updateTime = transactionProgressDetail.getUpdateTime();
                                        if (updateTime != null) {
                                            String str24 = rqg0.b.format(new Date(updateTime.longValue()));
                                            str24.getClass();
                                            stringUiText9 = new StringUiText(str24);
                                        } else {
                                            stringUiText9 = vch0.a;
                                        }
                                        arrayList.add(new b3h0(stringUiText6, stringUiText8, stringUiText9, iIntValue, 4));
                                    }
                                } else {
                                    arrayList = m2g.a;
                                }
                                str7 = transaction.tradeCode;
                                kog0[] kog0VarArr2 = kog0.a;
                                if (!Intrinsics.g(str7, "WD0004") || Intrinsics.g(transaction.tradeCode, "FE0001")) {
                                    z7 = z6;
                                } else {
                                    z7 = false;
                                }
                                if (transaction.rollbackDetail == null) {
                                    u2h0Var = new u2h0(null, null, 11);
                                } else {
                                    ResourceUiText resourceUiText17 = new ResourceUiText(R.string.page_transaction__game_id);
                                    String str25 = transaction.rollbackDetail.gameId;
                                    str25.getClass();
                                    t2h0 t2h0Var11 = new t2h0(resourceUiText17, new StringUiText(str25), 4);
                                    ResourceUiText resourceUiText18 = new ResourceUiText(R.string.page_transaction__rollback_time);
                                    String str26 = rqg0.a.format(new Date(transaction.rollbackDetail.rollbackTime));
                                    str26.getClass();
                                    t2h0 t2h0Var12 = new t2h0(resourceUiText18, new StringUiText(str26), 4);
                                    ResourceUiText resourceUiText19 = new ResourceUiText(R.string.page_transaction__home);
                                    String str27 = transaction.rollbackDetail.home;
                                    str27.getClass();
                                    t2h0 t2h0Var13 = new t2h0(resourceUiText19, new StringUiText(str27), 4);
                                    ResourceUiText resourceUiText20 = new ResourceUiText(R.string.page_transaction__away);
                                    String str28 = transaction.rollbackDetail.away;
                                    str28.getClass();
                                    t2h0 t2h0Var14 = new t2h0(resourceUiText20, new StringUiText(str28), 4);
                                    ResourceUiText resourceUiText21 = new ResourceUiText(R.string.page_transaction__pick);
                                    String str29 = transaction.rollbackDetail.selection;
                                    str29.getClass();
                                    t2h0 t2h0Var15 = new t2h0(resourceUiText21, new StringUiText(str29), 4);
                                    ResourceUiText resourceUiText22 = new ResourceUiText(R.string.page_transaction__market);
                                    String str30 = transaction.rollbackDetail.market;
                                    str30.getClass();
                                    t2h0 t2h0Var16 = new t2h0(resourceUiText22, new StringUiText(str30), 4);
                                    ResourceUiText resourceUiText23 = new ResourceUiText(R.string.page_transaction__result);
                                    String str31 = transaction.rollbackDetail.betStatus;
                                    str31.getClass();
                                    u2h0Var = new u2h0(new ResourceUiText(R.string.page_transaction__rollback_details), b.k(t2h0Var11, t2h0Var12, t2h0Var13, t2h0Var14, t2h0Var15, t2h0Var16, new t2h0(resourceUiText23, new StringUiText(str31), 4)), 6);
                                }
                                str8 = transaction.comment;
                                if (str8 != null || str8.length() == 0) {
                                    strValueOf = String.valueOf(this.v);
                                    j41[] j41VarArr2 = j41.a;
                                    if (Intrinsics.g(strValueOf, "11")) {
                                        b2h0Var = new b2h0(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip), true, new ResourceUiText(R.string.identity_verification__verify), true, c2h0.a.C0152a.a);
                                    } else if (Intrinsics.g(strValueOf, "12")) {
                                        b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_transaction__pending_verification)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip), c2h0.a.b.a, 8);
                                    } else if (Intrinsics.g(strValueOf, "13")) {
                                        b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_payment__verification_failed)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip), true, new ResourceUiText(R.string.common_functions__contact_us), true, c2h0.a.c.a);
                                    } else {
                                        b2h0Var = new b2h0(null, null, null, 63);
                                    }
                                    return t3h0.a(t3h0Var2, null, null, null, new p3h0(t2h0Var5, t2h0Var3, t2h0Var4, q3h0Var, t2h0Var6, o3h0Var, f5h0Var, t2h0Var7, t2h0Var8, t2h0Var9, t2h0Var10, t2h0Var2, arrayList, u2h0Var, z7, b2h0Var), null, 23);
                                }
                                StringUiText stringUiText14 = vch0.a;
                                String str32 = transaction.comment;
                                str32.getClass();
                                b2h0Var = new b2h0(stringUiText14, new StringUiText(str32), c2h0.b.a, 8);
                                return t3h0.a(t3h0Var2, null, null, null, new p3h0(t2h0Var5, t2h0Var3, t2h0Var4, q3h0Var, t2h0Var6, o3h0Var, f5h0Var, t2h0Var7, t2h0Var8, t2h0Var9, t2h0Var10, t2h0Var2, arrayList, u2h0Var, z7, b2h0Var), null, 23);
                            }
                            resourceUiText3 = new ResourceUiText(R.string.page_transaction__deposit_from);
                            resourceUiText2 = new ResourceUiText(R.string.page_transaction__sporty_coins);
                        }
                        resourceUiText3 = uiText2;
                        z2 = true;
                        o3h0 o3h0Var2 = new o3h0(resourceUiText3, resourceUiText2, z2);
                        String str210 = transaction.tradeId;
                        str210.getClass();
                        t2h0 t2h0Var17 = new t2h0(new ResourceUiText(R.string.page_transaction__trade_no), new StringUiText(str210), !Intrinsics.g(transaction.tradeCode, "WT0001"));
                        ResourceUiText resourceUiText110 = new ResourceUiText(R.string.page_transaction__transaction_no);
                        str2 = transaction.payChTxId;
                        if (str2 != null) {
                            stringUiText = stringUiText12;
                        } else {
                            stringUiText = stringUiText12;
                        }
                        str3 = transaction.tradeId;
                        if (str3 != null) {
                            String str211 = transaction.tradeId;
                            str211.getClass();
                            stringUiText = new StringUiText(str211);
                        }
                        if (Intrinsics.g(transaction.tradeCode, "TF0007")) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        t2h0 t2h0Var18 = new t2h0(resourceUiText110, stringUiText, z3);
                        ResourceUiText resourceUiText111 = new ResourceUiText(R.string.jackpot__round_no_dot);
                        str4 = transaction.goodsName;
                        if (str4 != null) {
                            stringUiText2 = new StringUiText(str4);
                        } else {
                            stringUiText2 = stringUiText12;
                        }
                        if (transaction.bizType == 4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        t2h0 t2h0Var19 = new t2h0(resourceUiText111, stringUiText2, z4);
                        str5 = transaction.orderId;
                        if (str5 != null) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        boolean z11 = !z5;
                        ResourceUiText resourceUiText112 = new ResourceUiText(R.string.page_transaction__ticket_id);
                        str6 = transaction.orderId;
                        f1h0 f1h0Var2 = this.f;
                        coloredUiText2 = str6 == null ? stringUiText12 : stringUiText12;
                        f5h0 f5h0Var2 = new f5h0(resourceUiText112, coloredUiText2, z11, f1h0Var2);
                        str10.getClass();
                        ResourceUiText resourceUiText113 = new ResourceUiText(R.string.page_transaction__balance);
                        boolean z12 = !Intrinsics.g(transaction.tradeCode, "WT0001");
                        if (transaction.status != 10) {
                            stringUiText3 = new StringUiText("- - -");
                        } else {
                            stringUiText3 = new StringUiText("- - -");
                        }
                        t2h0 t2h0Var110 = new t2h0(resourceUiText113, stringUiText3, z12);
                        str10.getClass();
                        if (this.i) {
                            i2 = 0;
                            t2h0Var2 = new t2h0((UiText) stringUiText12, (UiText) stringUiText12, false);
                            z6 = true;
                        } else {
                            i2 = 0;
                            ResourceUiText resourceUiText114 = new ResourceUiText(R.string.page_transaction__initial_balance);
                            l = transaction.initBal;
                            if (l != null) {
                                stringUiText4 = new StringUiText(bjb0.U(l.longValue(), Locale.US)).h(new StringUiText(" ")).h(new StringUiText(str10));
                            } else {
                                stringUiText4 = new StringUiText("- - -");
                            }
                            z6 = true;
                            t2h0Var2 = new t2h0((UiText) resourceUiText114, stringUiText4, true);
                        }
                        if (z8) {
                            arrayList2 = transaction.transactionProgressDetailList;
                            arrayList2.getClass();
                            arrayList = new ArrayList(l48.r(arrayList2, 10));
                            size = arrayList2.size();
                            i3 = i2;
                            while (i3 < size) {
                                TransactionProgressDetail transactionProgressDetail3 = arrayList2.get(i3);
                                i3++;
                                transactionProgressDetail = transactionProgressDetail3;
                                progress = transactionProgressDetail.getProgress();
                                if (progress != null) {
                                    StringUiText stringUiText15 = vch0.a;
                                    stringUiText5 = new StringUiText(progress);
                                } else {
                                    stringUiText5 = vch0.a;
                                }
                                stringUiText6 = stringUiText5;
                                content = transactionProgressDetail.getContent();
                                if (content != null) {
                                    stringUiText7 = new StringUiText(content);
                                } else {
                                    stringUiText7 = vch0.a;
                                }
                                stringUiText8 = stringUiText7;
                                status = transactionProgressDetail.getStatus();
                                if (status != null) {
                                    uj5.a(transaction.transactionProgressDetailList, "WithdrawStatue value error. ");
                                    return null;
                                }
                                int iIntValue2 = status.intValue();
                                updateTime = transactionProgressDetail.getUpdateTime();
                                if (updateTime != null) {
                                    String str212 = rqg0.b.format(new Date(updateTime.longValue()));
                                    str212.getClass();
                                    stringUiText9 = new StringUiText(str212);
                                } else {
                                    stringUiText9 = vch0.a;
                                }
                                arrayList.add(new b3h0(stringUiText6, stringUiText8, stringUiText9, iIntValue2, 4));
                            }
                        } else {
                            arrayList = m2g.a;
                        }
                        str7 = transaction.tradeCode;
                        kog0[] kog0VarArr3 = kog0.a;
                        if (Intrinsics.g(str7, "WD0004")) {
                            z7 = z6;
                        } else {
                            z7 = z6;
                        }
                        if (transaction.rollbackDetail == null) {
                            u2h0Var = new u2h0(null, null, 11);
                        } else {
                            ResourceUiText resourceUiText115 = new ResourceUiText(R.string.page_transaction__game_id);
                            String str213 = transaction.rollbackDetail.gameId;
                            str213.getClass();
                            t2h0 t2h0Var111 = new t2h0(resourceUiText115, new StringUiText(str213), 4);
                            ResourceUiText resourceUiText116 = new ResourceUiText(R.string.page_transaction__rollback_time);
                            String str214 = rqg0.a.format(new Date(transaction.rollbackDetail.rollbackTime));
                            str214.getClass();
                            t2h0 t2h0Var112 = new t2h0(resourceUiText116, new StringUiText(str214), 4);
                            ResourceUiText resourceUiText117 = new ResourceUiText(R.string.page_transaction__home);
                            String str215 = transaction.rollbackDetail.home;
                            str215.getClass();
                            t2h0 t2h0Var113 = new t2h0(resourceUiText117, new StringUiText(str215), 4);
                            ResourceUiText resourceUiText24 = new ResourceUiText(R.string.page_transaction__away);
                            String str216 = transaction.rollbackDetail.away;
                            str216.getClass();
                            t2h0 t2h0Var114 = new t2h0(resourceUiText24, new StringUiText(str216), 4);
                            ResourceUiText resourceUiText25 = new ResourceUiText(R.string.page_transaction__pick);
                            String str217 = transaction.rollbackDetail.selection;
                            str217.getClass();
                            t2h0 t2h0Var115 = new t2h0(resourceUiText25, new StringUiText(str217), 4);
                            ResourceUiText resourceUiText26 = new ResourceUiText(R.string.page_transaction__market);
                            String str33 = transaction.rollbackDetail.market;
                            str33.getClass();
                            t2h0 t2h0Var116 = new t2h0(resourceUiText26, new StringUiText(str33), 4);
                            ResourceUiText resourceUiText27 = new ResourceUiText(R.string.page_transaction__result);
                            String str34 = transaction.rollbackDetail.betStatus;
                            str34.getClass();
                            u2h0Var = new u2h0(new ResourceUiText(R.string.page_transaction__rollback_details), b.k(t2h0Var111, t2h0Var112, t2h0Var113, t2h0Var114, t2h0Var115, t2h0Var116, new t2h0(resourceUiText27, new StringUiText(str34), 4)), 6);
                        }
                        str8 = transaction.comment;
                        if (str8 != null) {
                            strValueOf = String.valueOf(this.v);
                            j41[] j41VarArr3 = j41.a;
                            if (Intrinsics.g(strValueOf, "11")) {
                                b2h0Var = new b2h0(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip), true, new ResourceUiText(R.string.identity_verification__verify), true, c2h0.a.C0152a.a);
                            } else if (Intrinsics.g(strValueOf, "12")) {
                                b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_transaction__pending_verification)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip), c2h0.a.b.a, 8);
                            } else if (Intrinsics.g(strValueOf, "13")) {
                                b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_payment__verification_failed)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip), true, new ResourceUiText(R.string.common_functions__contact_us), true, c2h0.a.c.a);
                            } else {
                                b2h0Var = new b2h0(null, null, null, 63);
                            }
                        } else {
                            strValueOf = String.valueOf(this.v);
                            j41[] j41VarArr4 = j41.a;
                            if (Intrinsics.g(strValueOf, "11")) {
                                b2h0Var = new b2h0(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip), true, new ResourceUiText(R.string.identity_verification__verify), true, c2h0.a.C0152a.a);
                            } else if (Intrinsics.g(strValueOf, "12")) {
                                b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_transaction__pending_verification)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip), c2h0.a.b.a, 8);
                            } else if (Intrinsics.g(strValueOf, "13")) {
                                b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_payment__verification_failed)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip), true, new ResourceUiText(R.string.common_functions__contact_us), true, c2h0.a.c.a);
                            } else {
                                b2h0Var = new b2h0(null, null, null, 63);
                            }
                        }
                        return t3h0.a(t3h0Var2, null, null, null, new p3h0(t2h0Var5, t2h0Var3, t2h0Var4, q3h0Var, t2h0Var6, o3h0Var2, f5h0Var2, t2h0Var17, t2h0Var18, t2h0Var19, t2h0Var110, t2h0Var2, arrayList, u2h0Var, z7, b2h0Var), null, 23);
                    }
                    resourceUiText3 = new ResourceUiText(R.string.page_transaction__deposit_from);
                    zG = Intrinsics.g(resourceUiText2, stringUiText12);
                    z2 = !zG;
                    o3h0 o3h0Var3 = new o3h0(resourceUiText3, resourceUiText2, z2);
                    String str218 = transaction.tradeId;
                    str218.getClass();
                    t2h0 t2h0Var117 = new t2h0(new ResourceUiText(R.string.page_transaction__trade_no), new StringUiText(str218), !Intrinsics.g(transaction.tradeCode, "WT0001"));
                    ResourceUiText resourceUiText118 = new ResourceUiText(R.string.page_transaction__transaction_no);
                    str2 = transaction.payChTxId;
                    if (str2 != null) {
                        stringUiText = stringUiText12;
                    } else {
                        stringUiText = stringUiText12;
                    }
                    str3 = transaction.tradeId;
                    if (str3 != null) {
                        String str219 = transaction.tradeId;
                        str219.getClass();
                        stringUiText = new StringUiText(str219);
                    }
                    if (Intrinsics.g(transaction.tradeCode, "TF0007")) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    t2h0 t2h0Var118 = new t2h0(resourceUiText118, stringUiText, z3);
                    ResourceUiText resourceUiText119 = new ResourceUiText(R.string.jackpot__round_no_dot);
                    str4 = transaction.goodsName;
                    if (str4 != null) {
                        stringUiText2 = new StringUiText(str4);
                    } else {
                        stringUiText2 = stringUiText12;
                    }
                    if (transaction.bizType == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    t2h0 t2h0Var119 = new t2h0(resourceUiText119, stringUiText2, z4);
                    str5 = transaction.orderId;
                    if (str5 != null) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    boolean z13 = !z5;
                    ResourceUiText resourceUiText1110 = new ResourceUiText(R.string.page_transaction__ticket_id);
                    str6 = transaction.orderId;
                    f1h0 f1h0Var3 = this.f;
                    if (str6 == null) {
                    }
                    f5h0 f5h0Var3 = new f5h0(resourceUiText1110, coloredUiText2, z13, f1h0Var3);
                    str10.getClass();
                    ResourceUiText resourceUiText1111 = new ResourceUiText(R.string.page_transaction__balance);
                    boolean z14 = !Intrinsics.g(transaction.tradeCode, "WT0001");
                    if (transaction.status != 10) {
                        stringUiText3 = new StringUiText("- - -");
                    } else {
                        stringUiText3 = new StringUiText("- - -");
                    }
                    t2h0 t2h0Var1110 = new t2h0(resourceUiText1111, stringUiText3, z14);
                    str10.getClass();
                    if (this.i) {
                        i2 = 0;
                        t2h0Var2 = new t2h0((UiText) stringUiText12, (UiText) stringUiText12, false);
                        z6 = true;
                    } else {
                        i2 = 0;
                        ResourceUiText resourceUiText1112 = new ResourceUiText(R.string.page_transaction__initial_balance);
                        l = transaction.initBal;
                        if (l != null) {
                            stringUiText4 = new StringUiText(bjb0.U(l.longValue(), Locale.US)).h(new StringUiText(" ")).h(new StringUiText(str10));
                        } else {
                            stringUiText4 = new StringUiText("- - -");
                        }
                        z6 = true;
                        t2h0Var2 = new t2h0((UiText) resourceUiText1112, stringUiText4, true);
                    }
                    if (z8) {
                        arrayList2 = transaction.transactionProgressDetailList;
                        arrayList2.getClass();
                        arrayList = new ArrayList(l48.r(arrayList2, 10));
                        size = arrayList2.size();
                        i3 = i2;
                        while (i3 < size) {
                            TransactionProgressDetail transactionProgressDetail4 = arrayList2.get(i3);
                            i3++;
                            transactionProgressDetail = transactionProgressDetail4;
                            progress = transactionProgressDetail.getProgress();
                            if (progress != null) {
                                StringUiText stringUiText16 = vch0.a;
                                stringUiText5 = new StringUiText(progress);
                            } else {
                                stringUiText5 = vch0.a;
                            }
                            stringUiText6 = stringUiText5;
                            content = transactionProgressDetail.getContent();
                            if (content != null) {
                                stringUiText7 = new StringUiText(content);
                            } else {
                                stringUiText7 = vch0.a;
                            }
                            stringUiText8 = stringUiText7;
                            status = transactionProgressDetail.getStatus();
                            if (status != null) {
                                uj5.a(transaction.transactionProgressDetailList, "WithdrawStatue value error. ");
                                return null;
                            }
                            int iIntValue3 = status.intValue();
                            updateTime = transactionProgressDetail.getUpdateTime();
                            if (updateTime != null) {
                                String str2110 = rqg0.b.format(new Date(updateTime.longValue()));
                                str2110.getClass();
                                stringUiText9 = new StringUiText(str2110);
                            } else {
                                stringUiText9 = vch0.a;
                            }
                            arrayList.add(new b3h0(stringUiText6, stringUiText8, stringUiText9, iIntValue3, 4));
                        }
                    } else {
                        arrayList = m2g.a;
                    }
                    str7 = transaction.tradeCode;
                    kog0[] kog0VarArr4 = kog0.a;
                    if (Intrinsics.g(str7, "WD0004")) {
                        z7 = z6;
                    } else {
                        z7 = z6;
                    }
                    if (transaction.rollbackDetail == null) {
                        u2h0Var = new u2h0(null, null, 11);
                    } else {
                        ResourceUiText resourceUiText1113 = new ResourceUiText(R.string.page_transaction__game_id);
                        String str2111 = transaction.rollbackDetail.gameId;
                        str2111.getClass();
                        t2h0 t2h0Var1111 = new t2h0(resourceUiText1113, new StringUiText(str2111), 4);
                        ResourceUiText resourceUiText1114 = new ResourceUiText(R.string.page_transaction__rollback_time);
                        String str2112 = rqg0.a.format(new Date(transaction.rollbackDetail.rollbackTime));
                        str2112.getClass();
                        t2h0 t2h0Var1112 = new t2h0(resourceUiText1114, new StringUiText(str2112), 4);
                        ResourceUiText resourceUiText1115 = new ResourceUiText(R.string.page_transaction__home);
                        String str2113 = transaction.rollbackDetail.home;
                        str2113.getClass();
                        t2h0 t2h0Var1113 = new t2h0(resourceUiText1115, new StringUiText(str2113), 4);
                        ResourceUiText resourceUiText28 = new ResourceUiText(R.string.page_transaction__away);
                        String str2114 = transaction.rollbackDetail.away;
                        str2114.getClass();
                        t2h0 t2h0Var1114 = new t2h0(resourceUiText28, new StringUiText(str2114), 4);
                        ResourceUiText resourceUiText29 = new ResourceUiText(R.string.page_transaction__pick);
                        String str2115 = transaction.rollbackDetail.selection;
                        str2115.getClass();
                        t2h0 t2h0Var1115 = new t2h0(resourceUiText29, new StringUiText(str2115), 4);
                        ResourceUiText resourceUiText210 = new ResourceUiText(R.string.page_transaction__market);
                        String str35 = transaction.rollbackDetail.market;
                        str35.getClass();
                        t2h0 t2h0Var1116 = new t2h0(resourceUiText210, new StringUiText(str35), 4);
                        ResourceUiText resourceUiText211 = new ResourceUiText(R.string.page_transaction__result);
                        String str36 = transaction.rollbackDetail.betStatus;
                        str36.getClass();
                        u2h0Var = new u2h0(new ResourceUiText(R.string.page_transaction__rollback_details), b.k(t2h0Var1111, t2h0Var1112, t2h0Var1113, t2h0Var1114, t2h0Var1115, t2h0Var1116, new t2h0(resourceUiText211, new StringUiText(str36), 4)), 6);
                    }
                    str8 = transaction.comment;
                    if (str8 != null) {
                        strValueOf = String.valueOf(this.v);
                        j41[] j41VarArr5 = j41.a;
                        if (Intrinsics.g(strValueOf, "11")) {
                            b2h0Var = new b2h0(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip), true, new ResourceUiText(R.string.identity_verification__verify), true, c2h0.a.C0152a.a);
                        } else if (Intrinsics.g(strValueOf, "12")) {
                            b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_transaction__pending_verification)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip), c2h0.a.b.a, 8);
                        } else if (Intrinsics.g(strValueOf, "13")) {
                            b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_payment__verification_failed)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip), true, new ResourceUiText(R.string.common_functions__contact_us), true, c2h0.a.c.a);
                        } else {
                            b2h0Var = new b2h0(null, null, null, 63);
                        }
                    } else {
                        strValueOf = String.valueOf(this.v);
                        j41[] j41VarArr6 = j41.a;
                        if (Intrinsics.g(strValueOf, "11")) {
                            b2h0Var = new b2h0(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip), true, new ResourceUiText(R.string.identity_verification__verify), true, c2h0.a.C0152a.a);
                        } else if (Intrinsics.g(strValueOf, "12")) {
                            b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_transaction__pending_verification)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip), c2h0.a.b.a, 8);
                        } else if (Intrinsics.g(strValueOf, "13")) {
                            b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_payment__verification_failed)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip), true, new ResourceUiText(R.string.common_functions__contact_us), true, c2h0.a.c.a);
                        } else {
                            b2h0Var = new b2h0(null, null, null, 63);
                        }
                    }
                    return t3h0.a(t3h0Var2, null, null, null, new p3h0(t2h0Var5, t2h0Var3, t2h0Var4, q3h0Var, t2h0Var6, o3h0Var3, f5h0Var3, t2h0Var117, t2h0Var118, t2h0Var119, t2h0Var1110, t2h0Var2, arrayList, u2h0Var, z7, b2h0Var), null, 23);
                }
                resourceUiText3 = new ResourceUiText(R.string.page_transaction__transfer_from);
                resourceUiText2 = new ResourceUiText(R.string.page_transaction__operator);
                z2 = true;
                o3h0 o3h0Var4 = new o3h0(resourceUiText3, resourceUiText2, z2);
                String str2116 = transaction.tradeId;
                str2116.getClass();
                t2h0 t2h0Var1117 = new t2h0(new ResourceUiText(R.string.page_transaction__trade_no), new StringUiText(str2116), !Intrinsics.g(transaction.tradeCode, "WT0001"));
                ResourceUiText resourceUiText1116 = new ResourceUiText(R.string.page_transaction__transaction_no);
                str2 = transaction.payChTxId;
                if (str2 != null) {
                    stringUiText = stringUiText12;
                } else {
                    stringUiText = stringUiText12;
                }
                str3 = transaction.tradeId;
                if (str3 != null) {
                    String str2117 = transaction.tradeId;
                    str2117.getClass();
                    stringUiText = new StringUiText(str2117);
                }
                if (Intrinsics.g(transaction.tradeCode, "TF0007")) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                t2h0 t2h0Var1118 = new t2h0(resourceUiText1116, stringUiText, z3);
                ResourceUiText resourceUiText1117 = new ResourceUiText(R.string.jackpot__round_no_dot);
                str4 = transaction.goodsName;
                if (str4 != null) {
                    stringUiText2 = new StringUiText(str4);
                } else {
                    stringUiText2 = stringUiText12;
                }
                if (transaction.bizType == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                t2h0 t2h0Var1119 = new t2h0(resourceUiText1117, stringUiText2, z4);
                str5 = transaction.orderId;
                if (str5 != null) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                boolean z15 = !z5;
                ResourceUiText resourceUiText1118 = new ResourceUiText(R.string.page_transaction__ticket_id);
                str6 = transaction.orderId;
                f1h0 f1h0Var4 = this.f;
                if (str6 == null) {
                }
                f5h0 f5h0Var4 = new f5h0(resourceUiText1118, coloredUiText2, z15, f1h0Var4);
                str10.getClass();
                ResourceUiText resourceUiText1119 = new ResourceUiText(R.string.page_transaction__balance);
                boolean z16 = !Intrinsics.g(transaction.tradeCode, "WT0001");
                if (transaction.status != 10) {
                    stringUiText3 = new StringUiText("- - -");
                } else {
                    stringUiText3 = new StringUiText("- - -");
                }
                t2h0 t2h0Var11110 = new t2h0(resourceUiText1119, stringUiText3, z16);
                str10.getClass();
                if (this.i) {
                    i2 = 0;
                    t2h0Var2 = new t2h0((UiText) stringUiText12, (UiText) stringUiText12, false);
                    z6 = true;
                } else {
                    i2 = 0;
                    ResourceUiText resourceUiText11110 = new ResourceUiText(R.string.page_transaction__initial_balance);
                    l = transaction.initBal;
                    if (l != null) {
                        stringUiText4 = new StringUiText(bjb0.U(l.longValue(), Locale.US)).h(new StringUiText(" ")).h(new StringUiText(str10));
                    } else {
                        stringUiText4 = new StringUiText("- - -");
                    }
                    z6 = true;
                    t2h0Var2 = new t2h0((UiText) resourceUiText11110, stringUiText4, true);
                }
                if (z8) {
                    arrayList2 = transaction.transactionProgressDetailList;
                    arrayList2.getClass();
                    arrayList = new ArrayList(l48.r(arrayList2, 10));
                    size = arrayList2.size();
                    i3 = i2;
                    while (i3 < size) {
                        TransactionProgressDetail transactionProgressDetail5 = arrayList2.get(i3);
                        i3++;
                        transactionProgressDetail = transactionProgressDetail5;
                        progress = transactionProgressDetail.getProgress();
                        if (progress != null) {
                            StringUiText stringUiText17 = vch0.a;
                            stringUiText5 = new StringUiText(progress);
                        } else {
                            stringUiText5 = vch0.a;
                        }
                        stringUiText6 = stringUiText5;
                        content = transactionProgressDetail.getContent();
                        if (content != null) {
                            stringUiText7 = new StringUiText(content);
                        } else {
                            stringUiText7 = vch0.a;
                        }
                        stringUiText8 = stringUiText7;
                        status = transactionProgressDetail.getStatus();
                        if (status != null) {
                            uj5.a(transaction.transactionProgressDetailList, "WithdrawStatue value error. ");
                            return null;
                        }
                        int iIntValue4 = status.intValue();
                        updateTime = transactionProgressDetail.getUpdateTime();
                        if (updateTime != null) {
                            String str2118 = rqg0.b.format(new Date(updateTime.longValue()));
                            str2118.getClass();
                            stringUiText9 = new StringUiText(str2118);
                        } else {
                            stringUiText9 = vch0.a;
                        }
                        arrayList.add(new b3h0(stringUiText6, stringUiText8, stringUiText9, iIntValue4, 4));
                    }
                } else {
                    arrayList = m2g.a;
                }
                str7 = transaction.tradeCode;
                kog0[] kog0VarArr5 = kog0.a;
                if (Intrinsics.g(str7, "WD0004")) {
                    z7 = z6;
                } else {
                    z7 = z6;
                }
                if (transaction.rollbackDetail == null) {
                    u2h0Var = new u2h0(null, null, 11);
                } else {
                    ResourceUiText resourceUiText11111 = new ResourceUiText(R.string.page_transaction__game_id);
                    String str2119 = transaction.rollbackDetail.gameId;
                    str2119.getClass();
                    t2h0 t2h0Var11111 = new t2h0(resourceUiText11111, new StringUiText(str2119), 4);
                    ResourceUiText resourceUiText11112 = new ResourceUiText(R.string.page_transaction__rollback_time);
                    String str21110 = rqg0.a.format(new Date(transaction.rollbackDetail.rollbackTime));
                    str21110.getClass();
                    t2h0 t2h0Var11112 = new t2h0(resourceUiText11112, new StringUiText(str21110), 4);
                    ResourceUiText resourceUiText11113 = new ResourceUiText(R.string.page_transaction__home);
                    String str21111 = transaction.rollbackDetail.home;
                    str21111.getClass();
                    t2h0 t2h0Var11113 = new t2h0(resourceUiText11113, new StringUiText(str21111), 4);
                    ResourceUiText resourceUiText212 = new ResourceUiText(R.string.page_transaction__away);
                    String str21112 = transaction.rollbackDetail.away;
                    str21112.getClass();
                    t2h0 t2h0Var11114 = new t2h0(resourceUiText212, new StringUiText(str21112), 4);
                    ResourceUiText resourceUiText213 = new ResourceUiText(R.string.page_transaction__pick);
                    String str21113 = transaction.rollbackDetail.selection;
                    str21113.getClass();
                    t2h0 t2h0Var11115 = new t2h0(resourceUiText213, new StringUiText(str21113), 4);
                    ResourceUiText resourceUiText214 = new ResourceUiText(R.string.page_transaction__market);
                    String str37 = transaction.rollbackDetail.market;
                    str37.getClass();
                    t2h0 t2h0Var11116 = new t2h0(resourceUiText214, new StringUiText(str37), 4);
                    ResourceUiText resourceUiText215 = new ResourceUiText(R.string.page_transaction__result);
                    String str38 = transaction.rollbackDetail.betStatus;
                    str38.getClass();
                    u2h0Var = new u2h0(new ResourceUiText(R.string.page_transaction__rollback_details), b.k(t2h0Var11111, t2h0Var11112, t2h0Var11113, t2h0Var11114, t2h0Var11115, t2h0Var11116, new t2h0(resourceUiText215, new StringUiText(str38), 4)), 6);
                }
                str8 = transaction.comment;
                if (str8 != null) {
                    strValueOf = String.valueOf(this.v);
                    j41[] j41VarArr7 = j41.a;
                    if (Intrinsics.g(strValueOf, "11")) {
                        b2h0Var = new b2h0(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip), true, new ResourceUiText(R.string.identity_verification__verify), true, c2h0.a.C0152a.a);
                    } else if (Intrinsics.g(strValueOf, "12")) {
                        b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_transaction__pending_verification)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip), c2h0.a.b.a, 8);
                    } else if (Intrinsics.g(strValueOf, "13")) {
                        b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_payment__verification_failed)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip), true, new ResourceUiText(R.string.common_functions__contact_us), true, c2h0.a.c.a);
                    } else {
                        b2h0Var = new b2h0(null, null, null, 63);
                    }
                } else {
                    strValueOf = String.valueOf(this.v);
                    j41[] j41VarArr8 = j41.a;
                    if (Intrinsics.g(strValueOf, "11")) {
                        b2h0Var = new b2h0(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip), true, new ResourceUiText(R.string.identity_verification__verify), true, c2h0.a.C0152a.a);
                    } else if (Intrinsics.g(strValueOf, "12")) {
                        b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_transaction__pending_verification)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip), c2h0.a.b.a, 8);
                    } else if (Intrinsics.g(strValueOf, "13")) {
                        b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_payment__verification_failed)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip), true, new ResourceUiText(R.string.common_functions__contact_us), true, c2h0.a.c.a);
                    } else {
                        b2h0Var = new b2h0(null, null, null, 63);
                    }
                }
                return t3h0.a(t3h0Var2, null, null, null, new p3h0(t2h0Var5, t2h0Var3, t2h0Var4, q3h0Var, t2h0Var6, o3h0Var4, f5h0Var4, t2h0Var1117, t2h0Var1118, t2h0Var1119, t2h0Var11110, t2h0Var2, arrayList, u2h0Var, z7, b2h0Var), null, 23);
            }
            coloredUiText = new ResourceUiText(R.string.page_transaction__succeed);
        }
        uiText = coloredUiText;
        ResourceUiText resourceUiText30 = new ResourceUiText(R.string.common_functions__status);
        if (transaction.status == 20) {
            z = true;
        } else {
            z = false;
        }
        q3h0 q3h0Var2 = new q3h0(resourceUiText30, uiText, z, transaction.showFixStatus, this.d);
        t2h0 t2h0Var20 = t2h0Var;
        t2h0 t2h0Var21 = new t2h0((UiText) new ResourceUiText(R.string.common_functions__type), this.e.a(Integer.valueOf(transaction.bizType), transaction.tradeCode, transaction.bizTypeName, transaction.subBizTypeName), true);
        if (!TextUtils.isEmpty(transaction.counterFull)) {
            String str110 = transaction.counterFull;
            str110.getClass();
            resourceUiText2 = new StringUiText(str110);
        } else if (TextUtils.isEmpty(transaction.counterAuthority)) {
            resourceUiText2 = stringUiText12;
        } else {
            resourceUiText2 = stringUiText12;
        }
        str = transaction.tradeCode;
        if (Intrinsics.g(str, "AD0001")) {
            if (Intrinsics.g(str, "DP0001")) {
                if (Intrinsics.g(str, "TF0005")) {
                    ResourceUiText resourceUiText120 = new ResourceUiText(R.string.page_transaction__deposit_from);
                    String str111 = transaction.counterpart;
                    str111.getClass();
                    uiText2 = resourceUiText120;
                    resourceUiText2 = new ResourceUiText(R.string.common_functions__partner_amount, ay0.S(new Object[]{str111}));
                } else {
                    if (Intrinsics.g(str, "TF0007")) {
                        if (Intrinsics.g(str, "WD0001")) {
                            resourceUiText3 = new ResourceUiText(R.string.page_transaction__withdraw_to);
                            zG = Intrinsics.g(resourceUiText2, stringUiText12);
                        } else if (Intrinsics.g(str, "WD0003")) {
                            resourceUiText3 = new ResourceUiText(R.string.page_transaction__withdraw_to);
                            resourceUiText2 = new ResourceUiText(R.string.common_functions__offline);
                        } else {
                            if (Intrinsics.g(str, "WD0004")) {
                                ResourceUiText resourceUiText121 = new ResourceUiText(R.string.page_transaction__withdraw_to);
                                String str112 = transaction.counterpart;
                                str112.getClass();
                                uiText2 = resourceUiText121;
                                resourceUiText4 = new ResourceUiText(R.string.common_functions__partner_amount, ay0.S(new Object[]{str112}));
                            } else if (Intrinsics.g(str, "AD0002")) {
                                resourceUiText3 = new ResourceUiText(R.string.page_transaction__transfer_to);
                                resourceUiText2 = new ResourceUiText(R.string.page_transaction__operator);
                            } else if (Intrinsics.g(str, "RF0001")) {
                                resourceUiText3 = new ResourceUiText(R.string.page_transaction__refundto);
                                i = transaction.payChId;
                                c100 c100Var2 = c100.e;
                                if (i == 0) {
                                    resourceUiText2 = new ResourceUiText(R.string.common_functions__balance);
                                } else if (i == 10) {
                                    String str113 = transaction.counterpart;
                                    str113.getClass();
                                    uiText2 = resourceUiText3;
                                    resourceUiText4 = new ResourceUiText(R.string.page_transaction__mpesa, ay0.S(new Object[]{str113}));
                                } else {
                                    resourceUiText2 = stringUiText12;
                                    z2 = false;
                                }
                            } else {
                                resourceUiText3 = new ResourceUiText(R.string.page_transaction__refundto);
                                i = transaction.payChId;
                                c100 c100Var3 = c100.e;
                                if (i == 0) {
                                    resourceUiText2 = new ResourceUiText(R.string.common_functions__balance);
                                } else if (i == 10) {
                                    String str114 = transaction.counterpart;
                                    str114.getClass();
                                    uiText2 = resourceUiText3;
                                    resourceUiText4 = new ResourceUiText(R.string.page_transaction__mpesa, ay0.S(new Object[]{str114}));
                                } else {
                                    resourceUiText2 = stringUiText12;
                                    z2 = false;
                                }
                            }
                            resourceUiText2 = resourceUiText4;
                        }
                        o3h0 o3h0Var5 = new o3h0(resourceUiText3, resourceUiText2, z2);
                        String str21114 = transaction.tradeId;
                        str21114.getClass();
                        t2h0 t2h0Var11117 = new t2h0(new ResourceUiText(R.string.page_transaction__trade_no), new StringUiText(str21114), !Intrinsics.g(transaction.tradeCode, "WT0001"));
                        ResourceUiText resourceUiText11114 = new ResourceUiText(R.string.page_transaction__transaction_no);
                        str2 = transaction.payChTxId;
                        if (str2 != null) {
                            stringUiText = stringUiText12;
                        } else {
                            stringUiText = stringUiText12;
                        }
                        str3 = transaction.tradeId;
                        if (str3 != null) {
                            String str21115 = transaction.tradeId;
                            str21115.getClass();
                            stringUiText = new StringUiText(str21115);
                        }
                        if (Intrinsics.g(transaction.tradeCode, "TF0007")) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        t2h0 t2h0Var11118 = new t2h0(resourceUiText11114, stringUiText, z3);
                        ResourceUiText resourceUiText11115 = new ResourceUiText(R.string.jackpot__round_no_dot);
                        str4 = transaction.goodsName;
                        if (str4 != null) {
                            stringUiText2 = new StringUiText(str4);
                        } else {
                            stringUiText2 = stringUiText12;
                        }
                        if (transaction.bizType == 4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        t2h0 t2h0Var11119 = new t2h0(resourceUiText11115, stringUiText2, z4);
                        str5 = transaction.orderId;
                        if (str5 != null) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        boolean z17 = !z5;
                        ResourceUiText resourceUiText11116 = new ResourceUiText(R.string.page_transaction__ticket_id);
                        str6 = transaction.orderId;
                        f1h0 f1h0Var5 = this.f;
                        if (str6 == null) {
                        }
                        f5h0 f5h0Var5 = new f5h0(resourceUiText11116, coloredUiText2, z17, f1h0Var5);
                        str10.getClass();
                        ResourceUiText resourceUiText11117 = new ResourceUiText(R.string.page_transaction__balance);
                        boolean z18 = !Intrinsics.g(transaction.tradeCode, "WT0001");
                        if (transaction.status != 10) {
                            stringUiText3 = new StringUiText("- - -");
                        } else {
                            stringUiText3 = new StringUiText("- - -");
                        }
                        t2h0 t2h0Var111110 = new t2h0(resourceUiText11117, stringUiText3, z18);
                        str10.getClass();
                        if (this.i) {
                            i2 = 0;
                            t2h0Var2 = new t2h0((UiText) stringUiText12, (UiText) stringUiText12, false);
                            z6 = true;
                        } else {
                            i2 = 0;
                            ResourceUiText resourceUiText11118 = new ResourceUiText(R.string.page_transaction__initial_balance);
                            l = transaction.initBal;
                            if (l != null) {
                                stringUiText4 = new StringUiText(bjb0.U(l.longValue(), Locale.US)).h(new StringUiText(" ")).h(new StringUiText(str10));
                            } else {
                                stringUiText4 = new StringUiText("- - -");
                            }
                            z6 = true;
                            t2h0Var2 = new t2h0((UiText) resourceUiText11118, stringUiText4, true);
                        }
                        if (z8) {
                            arrayList2 = transaction.transactionProgressDetailList;
                            arrayList2.getClass();
                            arrayList = new ArrayList(l48.r(arrayList2, 10));
                            size = arrayList2.size();
                            i3 = i2;
                            while (i3 < size) {
                                TransactionProgressDetail transactionProgressDetail6 = arrayList2.get(i3);
                                i3++;
                                transactionProgressDetail = transactionProgressDetail6;
                                progress = transactionProgressDetail.getProgress();
                                if (progress != null) {
                                    StringUiText stringUiText18 = vch0.a;
                                    stringUiText5 = new StringUiText(progress);
                                } else {
                                    stringUiText5 = vch0.a;
                                }
                                stringUiText6 = stringUiText5;
                                content = transactionProgressDetail.getContent();
                                if (content != null) {
                                    stringUiText7 = new StringUiText(content);
                                } else {
                                    stringUiText7 = vch0.a;
                                }
                                stringUiText8 = stringUiText7;
                                status = transactionProgressDetail.getStatus();
                                if (status != null) {
                                    uj5.a(transaction.transactionProgressDetailList, "WithdrawStatue value error. ");
                                    return null;
                                }
                                int iIntValue5 = status.intValue();
                                updateTime = transactionProgressDetail.getUpdateTime();
                                if (updateTime != null) {
                                    String str21116 = rqg0.b.format(new Date(updateTime.longValue()));
                                    str21116.getClass();
                                    stringUiText9 = new StringUiText(str21116);
                                } else {
                                    stringUiText9 = vch0.a;
                                }
                                arrayList.add(new b3h0(stringUiText6, stringUiText8, stringUiText9, iIntValue5, 4));
                            }
                        } else {
                            arrayList = m2g.a;
                        }
                        str7 = transaction.tradeCode;
                        kog0[] kog0VarArr6 = kog0.a;
                        if (Intrinsics.g(str7, "WD0004")) {
                            z7 = z6;
                        } else {
                            z7 = z6;
                        }
                        if (transaction.rollbackDetail == null) {
                            u2h0Var = new u2h0(null, null, 11);
                        } else {
                            ResourceUiText resourceUiText11119 = new ResourceUiText(R.string.page_transaction__game_id);
                            String str21117 = transaction.rollbackDetail.gameId;
                            str21117.getClass();
                            t2h0 t2h0Var111111 = new t2h0(resourceUiText11119, new StringUiText(str21117), 4);
                            ResourceUiText resourceUiText111110 = new ResourceUiText(R.string.page_transaction__rollback_time);
                            String str21118 = rqg0.a.format(new Date(transaction.rollbackDetail.rollbackTime));
                            str21118.getClass();
                            t2h0 t2h0Var111112 = new t2h0(resourceUiText111110, new StringUiText(str21118), 4);
                            ResourceUiText resourceUiText111111 = new ResourceUiText(R.string.page_transaction__home);
                            String str21119 = transaction.rollbackDetail.home;
                            str21119.getClass();
                            t2h0 t2h0Var111113 = new t2h0(resourceUiText111111, new StringUiText(str21119), 4);
                            ResourceUiText resourceUiText216 = new ResourceUiText(R.string.page_transaction__away);
                            String str211110 = transaction.rollbackDetail.away;
                            str211110.getClass();
                            t2h0 t2h0Var111114 = new t2h0(resourceUiText216, new StringUiText(str211110), 4);
                            ResourceUiText resourceUiText217 = new ResourceUiText(R.string.page_transaction__pick);
                            String str211111 = transaction.rollbackDetail.selection;
                            str211111.getClass();
                            t2h0 t2h0Var111115 = new t2h0(resourceUiText217, new StringUiText(str211111), 4);
                            ResourceUiText resourceUiText218 = new ResourceUiText(R.string.page_transaction__market);
                            String str39 = transaction.rollbackDetail.market;
                            str39.getClass();
                            t2h0 t2h0Var111116 = new t2h0(resourceUiText218, new StringUiText(str39), 4);
                            ResourceUiText resourceUiText219 = new ResourceUiText(R.string.page_transaction__result);
                            String str310 = transaction.rollbackDetail.betStatus;
                            str310.getClass();
                            u2h0Var = new u2h0(new ResourceUiText(R.string.page_transaction__rollback_details), b.k(t2h0Var111111, t2h0Var111112, t2h0Var111113, t2h0Var111114, t2h0Var111115, t2h0Var111116, new t2h0(resourceUiText219, new StringUiText(str310), 4)), 6);
                        }
                        str8 = transaction.comment;
                        if (str8 != null) {
                            strValueOf = String.valueOf(this.v);
                            j41[] j41VarArr9 = j41.a;
                            if (Intrinsics.g(strValueOf, "11")) {
                                b2h0Var = new b2h0(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip), true, new ResourceUiText(R.string.identity_verification__verify), true, c2h0.a.C0152a.a);
                            } else if (Intrinsics.g(strValueOf, "12")) {
                                b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_transaction__pending_verification)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip), c2h0.a.b.a, 8);
                            } else if (Intrinsics.g(strValueOf, "13")) {
                                b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_payment__verification_failed)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip), true, new ResourceUiText(R.string.common_functions__contact_us), true, c2h0.a.c.a);
                            } else {
                                b2h0Var = new b2h0(null, null, null, 63);
                            }
                        } else {
                            strValueOf = String.valueOf(this.v);
                            j41[] j41VarArr10 = j41.a;
                            if (Intrinsics.g(strValueOf, "11")) {
                                b2h0Var = new b2h0(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip), true, new ResourceUiText(R.string.identity_verification__verify), true, c2h0.a.C0152a.a);
                            } else if (Intrinsics.g(strValueOf, "12")) {
                                b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_transaction__pending_verification)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip), c2h0.a.b.a, 8);
                            } else if (Intrinsics.g(strValueOf, "13")) {
                                b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_payment__verification_failed)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip), true, new ResourceUiText(R.string.common_functions__contact_us), true, c2h0.a.c.a);
                            } else {
                                b2h0Var = new b2h0(null, null, null, 63);
                            }
                        }
                        return t3h0.a(t3h0Var2, null, null, null, new p3h0(t2h0Var20, t2h0Var3, t2h0Var4, q3h0Var2, t2h0Var21, o3h0Var5, f5h0Var5, t2h0Var11117, t2h0Var11118, t2h0Var11119, t2h0Var111110, t2h0Var2, arrayList, u2h0Var, z7, b2h0Var), null, 23);
                    }
                    resourceUiText3 = new ResourceUiText(R.string.page_transaction__deposit_from);
                    resourceUiText2 = new ResourceUiText(R.string.page_transaction__sporty_coins);
                }
                resourceUiText3 = uiText2;
                z2 = true;
                o3h0 o3h0Var6 = new o3h0(resourceUiText3, resourceUiText2, z2);
                String str211112 = transaction.tradeId;
                str211112.getClass();
                t2h0 t2h0Var111117 = new t2h0(new ResourceUiText(R.string.page_transaction__trade_no), new StringUiText(str211112), !Intrinsics.g(transaction.tradeCode, "WT0001"));
                ResourceUiText resourceUiText111112 = new ResourceUiText(R.string.page_transaction__transaction_no);
                str2 = transaction.payChTxId;
                if (str2 != null) {
                    stringUiText = stringUiText12;
                } else {
                    stringUiText = stringUiText12;
                }
                str3 = transaction.tradeId;
                if (str3 != null) {
                    String str211113 = transaction.tradeId;
                    str211113.getClass();
                    stringUiText = new StringUiText(str211113);
                }
                if (Intrinsics.g(transaction.tradeCode, "TF0007")) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                t2h0 t2h0Var111118 = new t2h0(resourceUiText111112, stringUiText, z3);
                ResourceUiText resourceUiText111113 = new ResourceUiText(R.string.jackpot__round_no_dot);
                str4 = transaction.goodsName;
                if (str4 != null) {
                    stringUiText2 = new StringUiText(str4);
                } else {
                    stringUiText2 = stringUiText12;
                }
                if (transaction.bizType == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                t2h0 t2h0Var111119 = new t2h0(resourceUiText111113, stringUiText2, z4);
                str5 = transaction.orderId;
                if (str5 != null) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                boolean z19 = !z5;
                ResourceUiText resourceUiText111114 = new ResourceUiText(R.string.page_transaction__ticket_id);
                str6 = transaction.orderId;
                f1h0 f1h0Var6 = this.f;
                if (str6 == null) {
                }
                f5h0 f5h0Var6 = new f5h0(resourceUiText111114, coloredUiText2, z19, f1h0Var6);
                str10.getClass();
                ResourceUiText resourceUiText111115 = new ResourceUiText(R.string.page_transaction__balance);
                boolean z110 = !Intrinsics.g(transaction.tradeCode, "WT0001");
                if (transaction.status != 10) {
                    stringUiText3 = new StringUiText("- - -");
                } else {
                    stringUiText3 = new StringUiText("- - -");
                }
                t2h0 t2h0Var1111110 = new t2h0(resourceUiText111115, stringUiText3, z110);
                str10.getClass();
                if (this.i) {
                    i2 = 0;
                    t2h0Var2 = new t2h0((UiText) stringUiText12, (UiText) stringUiText12, false);
                    z6 = true;
                } else {
                    i2 = 0;
                    ResourceUiText resourceUiText111116 = new ResourceUiText(R.string.page_transaction__initial_balance);
                    l = transaction.initBal;
                    if (l != null) {
                        stringUiText4 = new StringUiText(bjb0.U(l.longValue(), Locale.US)).h(new StringUiText(" ")).h(new StringUiText(str10));
                    } else {
                        stringUiText4 = new StringUiText("- - -");
                    }
                    z6 = true;
                    t2h0Var2 = new t2h0((UiText) resourceUiText111116, stringUiText4, true);
                }
                if (z8) {
                    arrayList2 = transaction.transactionProgressDetailList;
                    arrayList2.getClass();
                    arrayList = new ArrayList(l48.r(arrayList2, 10));
                    size = arrayList2.size();
                    i3 = i2;
                    while (i3 < size) {
                        TransactionProgressDetail transactionProgressDetail7 = arrayList2.get(i3);
                        i3++;
                        transactionProgressDetail = transactionProgressDetail7;
                        progress = transactionProgressDetail.getProgress();
                        if (progress != null) {
                            StringUiText stringUiText19 = vch0.a;
                            stringUiText5 = new StringUiText(progress);
                        } else {
                            stringUiText5 = vch0.a;
                        }
                        stringUiText6 = stringUiText5;
                        content = transactionProgressDetail.getContent();
                        if (content != null) {
                            stringUiText7 = new StringUiText(content);
                        } else {
                            stringUiText7 = vch0.a;
                        }
                        stringUiText8 = stringUiText7;
                        status = transactionProgressDetail.getStatus();
                        if (status != null) {
                            uj5.a(transaction.transactionProgressDetailList, "WithdrawStatue value error. ");
                            return null;
                        }
                        int iIntValue6 = status.intValue();
                        updateTime = transactionProgressDetail.getUpdateTime();
                        if (updateTime != null) {
                            String str211114 = rqg0.b.format(new Date(updateTime.longValue()));
                            str211114.getClass();
                            stringUiText9 = new StringUiText(str211114);
                        } else {
                            stringUiText9 = vch0.a;
                        }
                        arrayList.add(new b3h0(stringUiText6, stringUiText8, stringUiText9, iIntValue6, 4));
                    }
                } else {
                    arrayList = m2g.a;
                }
                str7 = transaction.tradeCode;
                kog0[] kog0VarArr7 = kog0.a;
                if (Intrinsics.g(str7, "WD0004")) {
                    z7 = z6;
                } else {
                    z7 = z6;
                }
                if (transaction.rollbackDetail == null) {
                    u2h0Var = new u2h0(null, null, 11);
                } else {
                    ResourceUiText resourceUiText111117 = new ResourceUiText(R.string.page_transaction__game_id);
                    String str211115 = transaction.rollbackDetail.gameId;
                    str211115.getClass();
                    t2h0 t2h0Var1111111 = new t2h0(resourceUiText111117, new StringUiText(str211115), 4);
                    ResourceUiText resourceUiText111118 = new ResourceUiText(R.string.page_transaction__rollback_time);
                    String str211116 = rqg0.a.format(new Date(transaction.rollbackDetail.rollbackTime));
                    str211116.getClass();
                    t2h0 t2h0Var1111112 = new t2h0(resourceUiText111118, new StringUiText(str211116), 4);
                    ResourceUiText resourceUiText111119 = new ResourceUiText(R.string.page_transaction__home);
                    String str211117 = transaction.rollbackDetail.home;
                    str211117.getClass();
                    t2h0 t2h0Var1111113 = new t2h0(resourceUiText111119, new StringUiText(str211117), 4);
                    ResourceUiText resourceUiText2110 = new ResourceUiText(R.string.page_transaction__away);
                    String str211118 = transaction.rollbackDetail.away;
                    str211118.getClass();
                    t2h0 t2h0Var1111114 = new t2h0(resourceUiText2110, new StringUiText(str211118), 4);
                    ResourceUiText resourceUiText2111 = new ResourceUiText(R.string.page_transaction__pick);
                    String str211119 = transaction.rollbackDetail.selection;
                    str211119.getClass();
                    t2h0 t2h0Var1111115 = new t2h0(resourceUiText2111, new StringUiText(str211119), 4);
                    ResourceUiText resourceUiText2112 = new ResourceUiText(R.string.page_transaction__market);
                    String str311 = transaction.rollbackDetail.market;
                    str311.getClass();
                    t2h0 t2h0Var1111116 = new t2h0(resourceUiText2112, new StringUiText(str311), 4);
                    ResourceUiText resourceUiText2113 = new ResourceUiText(R.string.page_transaction__result);
                    String str312 = transaction.rollbackDetail.betStatus;
                    str312.getClass();
                    u2h0Var = new u2h0(new ResourceUiText(R.string.page_transaction__rollback_details), b.k(t2h0Var1111111, t2h0Var1111112, t2h0Var1111113, t2h0Var1111114, t2h0Var1111115, t2h0Var1111116, new t2h0(resourceUiText2113, new StringUiText(str312), 4)), 6);
                }
                str8 = transaction.comment;
                if (str8 != null) {
                    strValueOf = String.valueOf(this.v);
                    j41[] j41VarArr11 = j41.a;
                    if (Intrinsics.g(strValueOf, "11")) {
                        b2h0Var = new b2h0(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip), true, new ResourceUiText(R.string.identity_verification__verify), true, c2h0.a.C0152a.a);
                    } else if (Intrinsics.g(strValueOf, "12")) {
                        b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_transaction__pending_verification)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip), c2h0.a.b.a, 8);
                    } else if (Intrinsics.g(strValueOf, "13")) {
                        b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_payment__verification_failed)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip), true, new ResourceUiText(R.string.common_functions__contact_us), true, c2h0.a.c.a);
                    } else {
                        b2h0Var = new b2h0(null, null, null, 63);
                    }
                } else {
                    strValueOf = String.valueOf(this.v);
                    j41[] j41VarArr12 = j41.a;
                    if (Intrinsics.g(strValueOf, "11")) {
                        b2h0Var = new b2h0(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip), true, new ResourceUiText(R.string.identity_verification__verify), true, c2h0.a.C0152a.a);
                    } else if (Intrinsics.g(strValueOf, "12")) {
                        b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_transaction__pending_verification)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip), c2h0.a.b.a, 8);
                    } else if (Intrinsics.g(strValueOf, "13")) {
                        b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_payment__verification_failed)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip), true, new ResourceUiText(R.string.common_functions__contact_us), true, c2h0.a.c.a);
                    } else {
                        b2h0Var = new b2h0(null, null, null, 63);
                    }
                }
                return t3h0.a(t3h0Var2, null, null, null, new p3h0(t2h0Var20, t2h0Var3, t2h0Var4, q3h0Var2, t2h0Var21, o3h0Var6, f5h0Var6, t2h0Var111117, t2h0Var111118, t2h0Var111119, t2h0Var1111110, t2h0Var2, arrayList, u2h0Var, z7, b2h0Var), null, 23);
            }
            resourceUiText3 = new ResourceUiText(R.string.page_transaction__deposit_from);
            zG = Intrinsics.g(resourceUiText2, stringUiText12);
            z2 = !zG;
            o3h0 o3h0Var7 = new o3h0(resourceUiText3, resourceUiText2, z2);
            String str2111110 = transaction.tradeId;
            str2111110.getClass();
            t2h0 t2h0Var1111117 = new t2h0(new ResourceUiText(R.string.page_transaction__trade_no), new StringUiText(str2111110), !Intrinsics.g(transaction.tradeCode, "WT0001"));
            ResourceUiText resourceUiText1111110 = new ResourceUiText(R.string.page_transaction__transaction_no);
            str2 = transaction.payChTxId;
            if (str2 != null) {
                stringUiText = stringUiText12;
            } else {
                stringUiText = stringUiText12;
            }
            str3 = transaction.tradeId;
            if (str3 != null) {
                String str2111111 = transaction.tradeId;
                str2111111.getClass();
                stringUiText = new StringUiText(str2111111);
            }
            if (Intrinsics.g(transaction.tradeCode, "TF0007")) {
                z3 = false;
            } else {
                z3 = false;
            }
            t2h0 t2h0Var1111118 = new t2h0(resourceUiText1111110, stringUiText, z3);
            ResourceUiText resourceUiText1111111 = new ResourceUiText(R.string.jackpot__round_no_dot);
            str4 = transaction.goodsName;
            if (str4 != null) {
                stringUiText2 = new StringUiText(str4);
            } else {
                stringUiText2 = stringUiText12;
            }
            if (transaction.bizType == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            t2h0 t2h0Var1111119 = new t2h0(resourceUiText1111111, stringUiText2, z4);
            str5 = transaction.orderId;
            if (str5 != null) {
                z5 = true;
            } else {
                z5 = true;
            }
            boolean z111 = !z5;
            ResourceUiText resourceUiText1111112 = new ResourceUiText(R.string.page_transaction__ticket_id);
            str6 = transaction.orderId;
            f1h0 f1h0Var7 = this.f;
            if (str6 == null) {
            }
            f5h0 f5h0Var7 = new f5h0(resourceUiText1111112, coloredUiText2, z111, f1h0Var7);
            str10.getClass();
            ResourceUiText resourceUiText1111113 = new ResourceUiText(R.string.page_transaction__balance);
            boolean z112 = !Intrinsics.g(transaction.tradeCode, "WT0001");
            if (transaction.status != 10) {
                stringUiText3 = new StringUiText("- - -");
            } else {
                stringUiText3 = new StringUiText("- - -");
            }
            t2h0 t2h0Var11111110 = new t2h0(resourceUiText1111113, stringUiText3, z112);
            str10.getClass();
            if (this.i) {
                i2 = 0;
                t2h0Var2 = new t2h0((UiText) stringUiText12, (UiText) stringUiText12, false);
                z6 = true;
            } else {
                i2 = 0;
                ResourceUiText resourceUiText1111114 = new ResourceUiText(R.string.page_transaction__initial_balance);
                l = transaction.initBal;
                if (l != null) {
                    stringUiText4 = new StringUiText(bjb0.U(l.longValue(), Locale.US)).h(new StringUiText(" ")).h(new StringUiText(str10));
                } else {
                    stringUiText4 = new StringUiText("- - -");
                }
                z6 = true;
                t2h0Var2 = new t2h0((UiText) resourceUiText1111114, stringUiText4, true);
            }
            if (z8) {
                arrayList2 = transaction.transactionProgressDetailList;
                arrayList2.getClass();
                arrayList = new ArrayList(l48.r(arrayList2, 10));
                size = arrayList2.size();
                i3 = i2;
                while (i3 < size) {
                    TransactionProgressDetail transactionProgressDetail8 = arrayList2.get(i3);
                    i3++;
                    transactionProgressDetail = transactionProgressDetail8;
                    progress = transactionProgressDetail.getProgress();
                    if (progress != null) {
                        StringUiText stringUiText110 = vch0.a;
                        stringUiText5 = new StringUiText(progress);
                    } else {
                        stringUiText5 = vch0.a;
                    }
                    stringUiText6 = stringUiText5;
                    content = transactionProgressDetail.getContent();
                    if (content != null) {
                        stringUiText7 = new StringUiText(content);
                    } else {
                        stringUiText7 = vch0.a;
                    }
                    stringUiText8 = stringUiText7;
                    status = transactionProgressDetail.getStatus();
                    if (status != null) {
                        uj5.a(transaction.transactionProgressDetailList, "WithdrawStatue value error. ");
                        return null;
                    }
                    int iIntValue7 = status.intValue();
                    updateTime = transactionProgressDetail.getUpdateTime();
                    if (updateTime != null) {
                        String str2111112 = rqg0.b.format(new Date(updateTime.longValue()));
                        str2111112.getClass();
                        stringUiText9 = new StringUiText(str2111112);
                    } else {
                        stringUiText9 = vch0.a;
                    }
                    arrayList.add(new b3h0(stringUiText6, stringUiText8, stringUiText9, iIntValue7, 4));
                }
            } else {
                arrayList = m2g.a;
            }
            str7 = transaction.tradeCode;
            kog0[] kog0VarArr8 = kog0.a;
            if (Intrinsics.g(str7, "WD0004")) {
                z7 = z6;
            } else {
                z7 = z6;
            }
            if (transaction.rollbackDetail == null) {
                u2h0Var = new u2h0(null, null, 11);
            } else {
                ResourceUiText resourceUiText1111115 = new ResourceUiText(R.string.page_transaction__game_id);
                String str2111113 = transaction.rollbackDetail.gameId;
                str2111113.getClass();
                t2h0 t2h0Var11111111 = new t2h0(resourceUiText1111115, new StringUiText(str2111113), 4);
                ResourceUiText resourceUiText1111116 = new ResourceUiText(R.string.page_transaction__rollback_time);
                String str2111114 = rqg0.a.format(new Date(transaction.rollbackDetail.rollbackTime));
                str2111114.getClass();
                t2h0 t2h0Var11111112 = new t2h0(resourceUiText1111116, new StringUiText(str2111114), 4);
                ResourceUiText resourceUiText1111117 = new ResourceUiText(R.string.page_transaction__home);
                String str2111115 = transaction.rollbackDetail.home;
                str2111115.getClass();
                t2h0 t2h0Var11111113 = new t2h0(resourceUiText1111117, new StringUiText(str2111115), 4);
                ResourceUiText resourceUiText2114 = new ResourceUiText(R.string.page_transaction__away);
                String str2111116 = transaction.rollbackDetail.away;
                str2111116.getClass();
                t2h0 t2h0Var11111114 = new t2h0(resourceUiText2114, new StringUiText(str2111116), 4);
                ResourceUiText resourceUiText2115 = new ResourceUiText(R.string.page_transaction__pick);
                String str2111117 = transaction.rollbackDetail.selection;
                str2111117.getClass();
                t2h0 t2h0Var11111115 = new t2h0(resourceUiText2115, new StringUiText(str2111117), 4);
                ResourceUiText resourceUiText2116 = new ResourceUiText(R.string.page_transaction__market);
                String str313 = transaction.rollbackDetail.market;
                str313.getClass();
                t2h0 t2h0Var11111116 = new t2h0(resourceUiText2116, new StringUiText(str313), 4);
                ResourceUiText resourceUiText2117 = new ResourceUiText(R.string.page_transaction__result);
                String str314 = transaction.rollbackDetail.betStatus;
                str314.getClass();
                u2h0Var = new u2h0(new ResourceUiText(R.string.page_transaction__rollback_details), b.k(t2h0Var11111111, t2h0Var11111112, t2h0Var11111113, t2h0Var11111114, t2h0Var11111115, t2h0Var11111116, new t2h0(resourceUiText2117, new StringUiText(str314), 4)), 6);
            }
            str8 = transaction.comment;
            if (str8 != null) {
                strValueOf = String.valueOf(this.v);
                j41[] j41VarArr13 = j41.a;
                if (Intrinsics.g(strValueOf, "11")) {
                    b2h0Var = new b2h0(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip), true, new ResourceUiText(R.string.identity_verification__verify), true, c2h0.a.C0152a.a);
                } else if (Intrinsics.g(strValueOf, "12")) {
                    b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_transaction__pending_verification)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip), c2h0.a.b.a, 8);
                } else if (Intrinsics.g(strValueOf, "13")) {
                    b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_payment__verification_failed)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip), true, new ResourceUiText(R.string.common_functions__contact_us), true, c2h0.a.c.a);
                } else {
                    b2h0Var = new b2h0(null, null, null, 63);
                }
            } else {
                strValueOf = String.valueOf(this.v);
                j41[] j41VarArr14 = j41.a;
                if (Intrinsics.g(strValueOf, "11")) {
                    b2h0Var = new b2h0(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip), true, new ResourceUiText(R.string.identity_verification__verify), true, c2h0.a.C0152a.a);
                } else if (Intrinsics.g(strValueOf, "12")) {
                    b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_transaction__pending_verification)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip), c2h0.a.b.a, 8);
                } else if (Intrinsics.g(strValueOf, "13")) {
                    b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_payment__verification_failed)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip), true, new ResourceUiText(R.string.common_functions__contact_us), true, c2h0.a.c.a);
                } else {
                    b2h0Var = new b2h0(null, null, null, 63);
                }
            }
            return t3h0.a(t3h0Var2, null, null, null, new p3h0(t2h0Var20, t2h0Var3, t2h0Var4, q3h0Var2, t2h0Var21, o3h0Var7, f5h0Var7, t2h0Var1111117, t2h0Var1111118, t2h0Var1111119, t2h0Var11111110, t2h0Var2, arrayList, u2h0Var, z7, b2h0Var), null, 23);
        }
        resourceUiText3 = new ResourceUiText(R.string.page_transaction__transfer_from);
        resourceUiText2 = new ResourceUiText(R.string.page_transaction__operator);
        z2 = true;
        o3h0 o3h0Var8 = new o3h0(resourceUiText3, resourceUiText2, z2);
        String str2111118 = transaction.tradeId;
        str2111118.getClass();
        t2h0 t2h0Var11111117 = new t2h0(new ResourceUiText(R.string.page_transaction__trade_no), new StringUiText(str2111118), !Intrinsics.g(transaction.tradeCode, "WT0001"));
        ResourceUiText resourceUiText1111118 = new ResourceUiText(R.string.page_transaction__transaction_no);
        str2 = transaction.payChTxId;
        if (str2 != null) {
            stringUiText = stringUiText12;
        } else {
            stringUiText = stringUiText12;
        }
        str3 = transaction.tradeId;
        if (str3 != null) {
            String str2111119 = transaction.tradeId;
            str2111119.getClass();
            stringUiText = new StringUiText(str2111119);
        }
        if (Intrinsics.g(transaction.tradeCode, "TF0007")) {
            z3 = false;
        } else {
            z3 = false;
        }
        t2h0 t2h0Var11111118 = new t2h0(resourceUiText1111118, stringUiText, z3);
        ResourceUiText resourceUiText1111119 = new ResourceUiText(R.string.jackpot__round_no_dot);
        str4 = transaction.goodsName;
        if (str4 != null) {
            stringUiText2 = new StringUiText(str4);
        } else {
            stringUiText2 = stringUiText12;
        }
        if (transaction.bizType == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        t2h0 t2h0Var11111119 = new t2h0(resourceUiText1111119, stringUiText2, z4);
        str5 = transaction.orderId;
        if (str5 != null) {
            z5 = true;
        } else {
            z5 = true;
        }
        boolean z113 = !z5;
        ResourceUiText resourceUiText11111110 = new ResourceUiText(R.string.page_transaction__ticket_id);
        str6 = transaction.orderId;
        f1h0 f1h0Var8 = this.f;
        if (str6 == null) {
        }
        f5h0 f5h0Var8 = new f5h0(resourceUiText11111110, coloredUiText2, z113, f1h0Var8);
        str10.getClass();
        ResourceUiText resourceUiText11111111 = new ResourceUiText(R.string.page_transaction__balance);
        boolean z114 = !Intrinsics.g(transaction.tradeCode, "WT0001");
        if (transaction.status != 10) {
            stringUiText3 = new StringUiText("- - -");
        } else {
            stringUiText3 = new StringUiText("- - -");
        }
        t2h0 t2h0Var111111110 = new t2h0(resourceUiText11111111, stringUiText3, z114);
        str10.getClass();
        if (this.i) {
            i2 = 0;
            t2h0Var2 = new t2h0((UiText) stringUiText12, (UiText) stringUiText12, false);
            z6 = true;
        } else {
            i2 = 0;
            ResourceUiText resourceUiText11111112 = new ResourceUiText(R.string.page_transaction__initial_balance);
            l = transaction.initBal;
            if (l != null) {
                stringUiText4 = new StringUiText(bjb0.U(l.longValue(), Locale.US)).h(new StringUiText(" ")).h(new StringUiText(str10));
            } else {
                stringUiText4 = new StringUiText("- - -");
            }
            z6 = true;
            t2h0Var2 = new t2h0((UiText) resourceUiText11111112, stringUiText4, true);
        }
        if (z8) {
            arrayList2 = transaction.transactionProgressDetailList;
            arrayList2.getClass();
            arrayList = new ArrayList(l48.r(arrayList2, 10));
            size = arrayList2.size();
            i3 = i2;
            while (i3 < size) {
                TransactionProgressDetail transactionProgressDetail9 = arrayList2.get(i3);
                i3++;
                transactionProgressDetail = transactionProgressDetail9;
                progress = transactionProgressDetail.getProgress();
                if (progress != null) {
                    StringUiText stringUiText111 = vch0.a;
                    stringUiText5 = new StringUiText(progress);
                } else {
                    stringUiText5 = vch0.a;
                }
                stringUiText6 = stringUiText5;
                content = transactionProgressDetail.getContent();
                if (content != null) {
                    stringUiText7 = new StringUiText(content);
                } else {
                    stringUiText7 = vch0.a;
                }
                stringUiText8 = stringUiText7;
                status = transactionProgressDetail.getStatus();
                if (status != null) {
                    uj5.a(transaction.transactionProgressDetailList, "WithdrawStatue value error. ");
                    return null;
                }
                int iIntValue8 = status.intValue();
                updateTime = transactionProgressDetail.getUpdateTime();
                if (updateTime != null) {
                    String str21111110 = rqg0.b.format(new Date(updateTime.longValue()));
                    str21111110.getClass();
                    stringUiText9 = new StringUiText(str21111110);
                } else {
                    stringUiText9 = vch0.a;
                }
                arrayList.add(new b3h0(stringUiText6, stringUiText8, stringUiText9, iIntValue8, 4));
            }
        } else {
            arrayList = m2g.a;
        }
        str7 = transaction.tradeCode;
        kog0[] kog0VarArr9 = kog0.a;
        if (Intrinsics.g(str7, "WD0004")) {
            z7 = z6;
        } else {
            z7 = z6;
        }
        if (transaction.rollbackDetail == null) {
            u2h0Var = new u2h0(null, null, 11);
        } else {
            ResourceUiText resourceUiText11111113 = new ResourceUiText(R.string.page_transaction__game_id);
            String str21111111 = transaction.rollbackDetail.gameId;
            str21111111.getClass();
            t2h0 t2h0Var111111111 = new t2h0(resourceUiText11111113, new StringUiText(str21111111), 4);
            ResourceUiText resourceUiText11111114 = new ResourceUiText(R.string.page_transaction__rollback_time);
            String str21111112 = rqg0.a.format(new Date(transaction.rollbackDetail.rollbackTime));
            str21111112.getClass();
            t2h0 t2h0Var111111112 = new t2h0(resourceUiText11111114, new StringUiText(str21111112), 4);
            ResourceUiText resourceUiText11111115 = new ResourceUiText(R.string.page_transaction__home);
            String str21111113 = transaction.rollbackDetail.home;
            str21111113.getClass();
            t2h0 t2h0Var111111113 = new t2h0(resourceUiText11111115, new StringUiText(str21111113), 4);
            ResourceUiText resourceUiText2118 = new ResourceUiText(R.string.page_transaction__away);
            String str21111114 = transaction.rollbackDetail.away;
            str21111114.getClass();
            t2h0 t2h0Var111111114 = new t2h0(resourceUiText2118, new StringUiText(str21111114), 4);
            ResourceUiText resourceUiText2119 = new ResourceUiText(R.string.page_transaction__pick);
            String str21111115 = transaction.rollbackDetail.selection;
            str21111115.getClass();
            t2h0 t2h0Var111111115 = new t2h0(resourceUiText2119, new StringUiText(str21111115), 4);
            ResourceUiText resourceUiText21110 = new ResourceUiText(R.string.page_transaction__market);
            String str315 = transaction.rollbackDetail.market;
            str315.getClass();
            t2h0 t2h0Var111111116 = new t2h0(resourceUiText21110, new StringUiText(str315), 4);
            ResourceUiText resourceUiText21111 = new ResourceUiText(R.string.page_transaction__result);
            String str316 = transaction.rollbackDetail.betStatus;
            str316.getClass();
            u2h0Var = new u2h0(new ResourceUiText(R.string.page_transaction__rollback_details), b.k(t2h0Var111111111, t2h0Var111111112, t2h0Var111111113, t2h0Var111111114, t2h0Var111111115, t2h0Var111111116, new t2h0(resourceUiText21111, new StringUiText(str316), 4)), 6);
        }
        str8 = transaction.comment;
        if (str8 != null) {
            strValueOf = String.valueOf(this.v);
            j41[] j41VarArr15 = j41.a;
            if (Intrinsics.g(strValueOf, "11")) {
                b2h0Var = new b2h0(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip), true, new ResourceUiText(R.string.identity_verification__verify), true, c2h0.a.C0152a.a);
            } else if (Intrinsics.g(strValueOf, "12")) {
                b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_transaction__pending_verification)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip), c2h0.a.b.a, 8);
            } else if (Intrinsics.g(strValueOf, "13")) {
                b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_payment__verification_failed)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip), true, new ResourceUiText(R.string.common_functions__contact_us), true, c2h0.a.c.a);
            } else {
                b2h0Var = new b2h0(null, null, null, 63);
            }
        } else {
            strValueOf = String.valueOf(this.v);
            j41[] j41VarArr16 = j41.a;
            if (Intrinsics.g(strValueOf, "11")) {
                b2h0Var = new b2h0(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_tip), true, new ResourceUiText(R.string.identity_verification__verify), true, c2h0.a.C0152a.a);
            } else if (Intrinsics.g(strValueOf, "12")) {
                b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_transaction__pending_verification)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip), c2h0.a.b.a, 8);
            } else if (Intrinsics.g(strValueOf, "13")) {
                b2h0Var = new b2h0(jz4.a(new ResourceUiText(R.string.page_withdraw__withdrawals_blocked), "(").h(new ResourceUiText(R.string.page_payment__verification_failed)).h(new StringUiText(")")), new ResourceUiText(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip), true, new ResourceUiText(R.string.common_functions__contact_us), true, c2h0.a.c.a);
            } else {
                b2h0Var = new b2h0(null, null, null, 63);
            }
        }
        return t3h0.a(t3h0Var2, null, null, null, new p3h0(t2h0Var20, t2h0Var3, t2h0Var4, q3h0Var2, t2h0Var21, o3h0Var8, f5h0Var8, t2h0Var11111117, t2h0Var11111118, t2h0Var11111119, t2h0Var111111110, t2h0Var2, arrayList, u2h0Var, z7, b2h0Var), null, 23);
    }
}
