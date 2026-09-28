package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.common.Range;
import com.sporty.android.core.model.pocket.common.PaymentChannel;
import com.sporty.android.core.model.pocket.deposit.QuickInputItem;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.paybill.ExclusiveOffersLayout;
import com.sportybet.feature.payment.impl.paybill.a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.deposit.paybill.CommonPaybillViewModel$init$1", f = "CommonPaybillViewModel.kt", l = {65}, m = "invokeSuspend", v = 2)
public final class gh8 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ hh8 b;
    public final /* synthetic */ PaymentChannel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh8(hh8 hh8Var, PaymentChannel paymentChannel, v1b<? super gh8> v1bVar) {
        super(2, v1bVar);
        this.b = hh8Var;
        this.c = paymentChannel;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gh8(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gh8) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        char c;
        char c2;
        char c3;
        ExclusiveOffersLayout.a aVar;
        char c4;
        char c5;
        BigDecimal bigDecimal;
        Object obj2;
        BigDecimal bigDecimal2;
        long jLongValue;
        Long l;
        List listK;
        Map map;
        y5b y5bVar = y5b.a;
        int i = this.a;
        hh8 hh8Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            yrd yrdVar = hh8Var.a;
            this.a = 1;
            objA = yrdVar.a(this);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = obj;
        }
        ng50.b bVar = objA instanceof ng50.b ? (ng50.b) objA : null;
        PaymentChannel paymentChannel = this.c;
        xrd xrdVar = (bVar == null || (map = (Map) bVar.a) == null) ? null : (xrd) map.get(new Integer(paymentChannel.getPayChId()));
        char c6 = '\n';
        char c7 = 6;
        if (xrdVar == null) {
            aVar = null;
            c = '\n';
            c2 = 6;
            c3 = 0;
        } else {
            BigDecimal bigDecimal3 = new BigDecimal(10000);
            List<QuickInputItem> listT0 = CollectionsKt.t0(xrdVar.a, 6);
            ArrayList arrayList = new ArrayList(l48.r(listT0, 10));
            for (QuickInputItem quickInputItem : listT0) {
                ArrayList arrayList2 = xrdVar.b;
                int size = arrayList2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        c4 = c6;
                        c5 = c7;
                        bigDecimal = bigDecimal3;
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList2.get(i2);
                    i2++;
                    Range range = (Range) obj2;
                    c4 = c6;
                    c5 = c7;
                    long j = range.lower;
                    long j2 = quickInputItem.amount;
                    bigDecimal = bigDecimal3;
                    if (j <= j2 && j2 <= range.upper) {
                        break;
                    }
                    c6 = c4;
                    c7 = c5;
                    bigDecimal3 = bigDecimal;
                }
                Range range2 = (Range) obj2;
                if (range2 != null) {
                    int i3 = range2.feeType;
                    if (i3 == 1) {
                        l = new Long(range2.amount);
                        bigDecimal2 = bigDecimal;
                    } else if (i3 == 2) {
                        BigDecimal bigDecimal4 = new BigDecimal(quickInputItem.amount * range2.ratio);
                        bigDecimal2 = bigDecimal;
                        l = new Long(bigDecimal4.divide(bigDecimal2).setScale(1, RoundingMode.FLOOR).multiply(bigDecimal2).longValue());
                    } else {
                        bigDecimal2 = bigDecimal;
                        l = null;
                    }
                    if (l != null) {
                        jLongValue = l.longValue();
                    }
                    arrayList.add(new Pair(bjb0.V(quickInputItem.amount), bjb0.V(quickInputItem.amount + jLongValue)));
                    c6 = c4;
                    bigDecimal3 = bigDecimal2;
                    c7 = c5;
                } else {
                    bigDecimal2 = bigDecimal;
                }
                jLongValue = quickInputItem.bounty;
                arrayList.add(new Pair(bjb0.V(quickInputItem.amount), bjb0.V(quickInputItem.amount + jLongValue)));
                c6 = c4;
                bigDecimal3 = bigDecimal2;
                c7 = c5;
            }
            c = c6;
            c2 = c7;
            c3 = 0;
            Long lS0 = StringsKt.s0(xrdVar.c);
            String strV = bjb0.V(lS0 != null ? lS0.longValue() : 0L);
            String strE = a8b.e();
            strE.getClass();
            aVar = new ExclusiveOffersLayout.a(strV, strE, arrayList);
        }
        s400 s400Var = hh8Var.b;
        int payChId = paymentChannel.getPayChId();
        s400Var.getClass();
        if (payChId == 81) {
            ResourceUiText resourceUiText = new ResourceUiText(R.string.common_payment_providers__deposit_using_ussd_airtel_mobile_money);
            StringUiText stringUiText = new StringUiText("\n\n");
            StringUiText stringUiText2 = new StringUiText("1. ");
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.common_payment_providers__airtel_ussd_desc_1__ZM);
            StringUiText stringUiText3 = new StringUiText("\n");
            StringUiText stringUiText4 = new StringUiText("2. ");
            ResourceUiText resourceUiText3 = new ResourceUiText(R.string.common_payment_providers__airtel_ussd_desc_2__ZM);
            StringUiText stringUiText5 = new StringUiText("\n");
            StringUiText stringUiText6 = new StringUiText("3. ");
            ResourceUiText resourceUiText4 = new ResourceUiText(R.string.common_payment_providers__airtel_ussd_desc_3__ZM);
            StringUiText stringUiText7 = new StringUiText("\n");
            StringUiText stringUiText8 = new StringUiText("4. ");
            ResourceUiText resourceUiText5 = new ResourceUiText(R.string.common_payment_providers__airtel_ussd_desc_4__ZM);
            StringUiText stringUiText9 = new StringUiText("\n");
            StringUiText stringUiText10 = new StringUiText("5. ");
            ResourceUiText resourceUiText6 = new ResourceUiText(R.string.common_payment_providers__airtel_ussd_desc_5__ZM);
            StringUiText stringUiText11 = new StringUiText("\n");
            StringUiText stringUiText12 = new StringUiText("6. ");
            ResourceUiText resourceUiText7 = new ResourceUiText(R.string.common_payment_providers__airtel_ussd_desc_6__ZM);
            StringUiText stringUiText13 = new StringUiText("\n");
            StringUiText stringUiText14 = new StringUiText("\n");
            ResourceUiText resourceUiText8 = new ResourceUiText(R.string.common_payment_providers__deposit_using_airtel_app_mobile_money);
            StringUiText stringUiText15 = new StringUiText("\n\n");
            StringUiText stringUiText16 = new StringUiText("1. ");
            ResourceUiText resourceUiText9 = new ResourceUiText(R.string.common_payment_providers__airtel_app_desc_1__ZM);
            StringUiText stringUiText17 = new StringUiText("\n");
            StringUiText stringUiText18 = new StringUiText("2. ");
            ResourceUiText resourceUiText10 = new ResourceUiText(R.string.common_payment_providers__airtel_app_desc_2__ZM);
            StringUiText stringUiText19 = new StringUiText("\n");
            StringUiText stringUiText20 = new StringUiText("3. ");
            ResourceUiText resourceUiText11 = new ResourceUiText(R.string.common_payment_providers__airtel_app_desc_3__ZM);
            StringUiText stringUiText21 = new StringUiText("\n");
            StringUiText stringUiText22 = new StringUiText("4. ");
            ResourceUiText resourceUiText12 = new ResourceUiText(R.string.common_payment_providers__airtel_app_desc_4__ZM);
            StringUiText stringUiText23 = new StringUiText("\n");
            StringUiText stringUiText24 = new StringUiText("5. ");
            ResourceUiText resourceUiText13 = new ResourceUiText(R.string.common_payment_providers__airtel_app_desc_5__ZM);
            StringUiText stringUiText25 = new StringUiText("\n");
            StringUiText stringUiText26 = new StringUiText("6. ");
            ResourceUiText resourceUiText14 = new ResourceUiText(R.string.common_payment_providers__airtel_app_desc_6__ZM);
            StringUiText stringUiText27 = new StringUiText("\n");
            UiText[] uiTextArr = new UiText[41];
            uiTextArr[c3] = resourceUiText;
            uiTextArr[1] = stringUiText;
            uiTextArr[2] = stringUiText2;
            uiTextArr[3] = resourceUiText2;
            uiTextArr[4] = stringUiText3;
            uiTextArr[5] = stringUiText4;
            uiTextArr[c2] = resourceUiText3;
            uiTextArr[7] = stringUiText5;
            uiTextArr[8] = stringUiText6;
            uiTextArr[9] = resourceUiText4;
            uiTextArr[c] = stringUiText7;
            uiTextArr[11] = stringUiText8;
            uiTextArr[12] = resourceUiText5;
            uiTextArr[13] = stringUiText9;
            uiTextArr[14] = stringUiText10;
            uiTextArr[15] = resourceUiText6;
            uiTextArr[16] = stringUiText11;
            uiTextArr[17] = stringUiText12;
            uiTextArr[18] = resourceUiText7;
            uiTextArr[19] = stringUiText13;
            uiTextArr[20] = stringUiText14;
            uiTextArr[21] = resourceUiText8;
            uiTextArr[22] = stringUiText15;
            uiTextArr[23] = stringUiText16;
            uiTextArr[24] = resourceUiText9;
            uiTextArr[25] = stringUiText17;
            uiTextArr[26] = stringUiText18;
            uiTextArr[27] = resourceUiText10;
            uiTextArr[28] = stringUiText19;
            uiTextArr[29] = stringUiText20;
            uiTextArr[30] = resourceUiText11;
            uiTextArr[31] = stringUiText21;
            uiTextArr[32] = stringUiText22;
            uiTextArr[33] = resourceUiText12;
            uiTextArr[34] = stringUiText23;
            uiTextArr[35] = stringUiText24;
            uiTextArr[36] = resourceUiText13;
            uiTextArr[37] = stringUiText25;
            uiTextArr[38] = stringUiText26;
            uiTextArr[39] = resourceUiText14;
            uiTextArr[40] = stringUiText27;
            listK = b.k(uiTextArr);
        } else if (payChId == 91) {
            StringUiText stringUiText28 = new StringUiText("1. ");
            ResourceUiText resourceUiText15 = new ResourceUiText(R.string.common_payment_providers__yas_desc_1__TZ);
            StringUiText stringUiText29 = new StringUiText("\n");
            StringUiText stringUiText30 = new StringUiText("2. ");
            ResourceUiText resourceUiText16 = new ResourceUiText(R.string.common_payment_providers__yas_desc_2__TZ);
            StringUiText stringUiText31 = new StringUiText("\n");
            StringUiText stringUiText32 = new StringUiText("3. ");
            ResourceUiText resourceUiText17 = new ResourceUiText(R.string.common_payment_providers__yas_desc_3__TZ);
            StringUiText stringUiText33 = new StringUiText("\n");
            StringUiText stringUiText34 = new StringUiText("4. ");
            ResourceUiText resourceUiText18 = new ResourceUiText(R.string.common_payment_providers__yas_desc_4__TZ);
            StringUiText stringUiText35 = new StringUiText("\n");
            StringUiText stringUiText36 = new StringUiText("5. ");
            ResourceUiText resourceUiText19 = new ResourceUiText(R.string.common_payment_providers__yas_desc_5__TZ);
            StringUiText stringUiText37 = new StringUiText("\n");
            StringUiText stringUiText38 = new StringUiText("6. ");
            ResourceUiText resourceUiText20 = new ResourceUiText(R.string.common_payment_providers__yas_desc_6__TZ);
            StringUiText stringUiText39 = new StringUiText("\n");
            StringUiText stringUiText40 = new StringUiText("7. ");
            ResourceUiText resourceUiText21 = new ResourceUiText(R.string.common_payment_providers__yas_desc_7__TZ);
            UiText[] uiTextArr2 = new UiText[20];
            uiTextArr2[c3] = stringUiText28;
            uiTextArr2[1] = resourceUiText15;
            uiTextArr2[2] = stringUiText29;
            uiTextArr2[3] = stringUiText30;
            uiTextArr2[4] = resourceUiText16;
            uiTextArr2[5] = stringUiText31;
            uiTextArr2[c2] = stringUiText32;
            uiTextArr2[7] = resourceUiText17;
            uiTextArr2[8] = stringUiText33;
            uiTextArr2[9] = stringUiText34;
            uiTextArr2[c] = resourceUiText18;
            uiTextArr2[11] = stringUiText35;
            uiTextArr2[12] = stringUiText36;
            uiTextArr2[13] = resourceUiText19;
            uiTextArr2[14] = stringUiText37;
            uiTextArr2[15] = stringUiText38;
            uiTextArr2[16] = resourceUiText20;
            uiTextArr2[17] = stringUiText39;
            uiTextArr2[18] = stringUiText40;
            uiTextArr2[19] = resourceUiText21;
            listK = b.k(uiTextArr2);
        } else if (payChId == 102) {
            StringUiText stringUiText41 = new StringUiText("1. ");
            ResourceUiText resourceUiText22 = new ResourceUiText(R.string.common_payment_providers__vodacom_desc_1__TZ);
            StringUiText stringUiText42 = new StringUiText("\n");
            StringUiText stringUiText43 = new StringUiText("2. ");
            ResourceUiText resourceUiText23 = new ResourceUiText(R.string.common_payment_providers__vodacom_desc_2__TZ);
            StringUiText stringUiText44 = new StringUiText("\n");
            StringUiText stringUiText45 = new StringUiText("3. ");
            ResourceUiText resourceUiText24 = new ResourceUiText(R.string.common_payment_providers__vodacom_desc_3__TZ);
            StringUiText stringUiText46 = new StringUiText("\n");
            StringUiText stringUiText47 = new StringUiText("4. ");
            ResourceUiText resourceUiText25 = new ResourceUiText(R.string.common_payment_providers__vodacom_desc_4__TZ);
            StringUiText stringUiText48 = new StringUiText("\n");
            StringUiText stringUiText49 = new StringUiText("5. ");
            ResourceUiText resourceUiText26 = new ResourceUiText(R.string.common_payment_providers__vodacom_desc_5__TZ);
            StringUiText stringUiText50 = new StringUiText("\n");
            StringUiText stringUiText51 = new StringUiText("6. ");
            ResourceUiText resourceUiText27 = new ResourceUiText(R.string.common_payment_providers__vodacom_desc_6__TZ);
            StringUiText stringUiText52 = new StringUiText("\n");
            StringUiText stringUiText53 = new StringUiText("7. ");
            ResourceUiText resourceUiText28 = new ResourceUiText(R.string.common_payment_providers__vodacom_desc_7__TZ);
            UiText[] uiTextArr3 = new UiText[20];
            uiTextArr3[c3] = stringUiText41;
            uiTextArr3[1] = resourceUiText22;
            uiTextArr3[2] = stringUiText42;
            uiTextArr3[3] = stringUiText43;
            uiTextArr3[4] = resourceUiText23;
            uiTextArr3[5] = stringUiText44;
            uiTextArr3[c2] = stringUiText45;
            uiTextArr3[7] = resourceUiText24;
            uiTextArr3[8] = stringUiText46;
            uiTextArr3[9] = stringUiText47;
            uiTextArr3[c] = resourceUiText25;
            uiTextArr3[11] = stringUiText48;
            uiTextArr3[12] = stringUiText49;
            uiTextArr3[13] = resourceUiText26;
            uiTextArr3[14] = stringUiText50;
            uiTextArr3[15] = stringUiText51;
            uiTextArr3[16] = resourceUiText27;
            uiTextArr3[17] = stringUiText52;
            uiTextArr3[18] = stringUiText53;
            uiTextArr3[19] = resourceUiText28;
            listK = b.k(uiTextArr3);
        } else if (payChId == 111) {
            StringUiText stringUiText54 = new StringUiText("1. ");
            ResourceUiText resourceUiText29 = new ResourceUiText(R.string.common_payment_providers__airtel_desc_1__TZ);
            StringUiText stringUiText55 = new StringUiText("\n");
            StringUiText stringUiText56 = new StringUiText("2. ");
            ResourceUiText resourceUiText30 = new ResourceUiText(R.string.common_payment_providers__airtel_desc_2__TZ);
            StringUiText stringUiText57 = new StringUiText("\n");
            StringUiText stringUiText58 = new StringUiText("3. ");
            ResourceUiText resourceUiText31 = new ResourceUiText(R.string.common_payment_providers__airtel_desc_3__TZ);
            StringUiText stringUiText59 = new StringUiText("\n");
            StringUiText stringUiText60 = new StringUiText("4. ");
            ResourceUiText resourceUiText32 = new ResourceUiText(R.string.common_payment_providers__airtel_desc_4__TZ);
            StringUiText stringUiText61 = new StringUiText("\n");
            StringUiText stringUiText62 = new StringUiText("5. ");
            ResourceUiText resourceUiText33 = new ResourceUiText(R.string.common_payment_providers__airtel_desc_5__TZ);
            StringUiText stringUiText63 = new StringUiText("\n");
            StringUiText stringUiText64 = new StringUiText("6. ");
            ResourceUiText resourceUiText34 = new ResourceUiText(R.string.common_payment_providers__airtel_desc_6__TZ);
            StringUiText stringUiText65 = new StringUiText("\n");
            StringUiText stringUiText66 = new StringUiText("7. ");
            ResourceUiText resourceUiText35 = new ResourceUiText(R.string.common_payment_providers__airtel_desc_7__TZ);
            UiText[] uiTextArr4 = new UiText[20];
            uiTextArr4[c3] = stringUiText54;
            uiTextArr4[1] = resourceUiText29;
            uiTextArr4[2] = stringUiText55;
            uiTextArr4[3] = stringUiText56;
            uiTextArr4[4] = resourceUiText30;
            uiTextArr4[5] = stringUiText57;
            uiTextArr4[c2] = stringUiText58;
            uiTextArr4[7] = resourceUiText31;
            uiTextArr4[8] = stringUiText59;
            uiTextArr4[9] = stringUiText60;
            uiTextArr4[c] = resourceUiText32;
            uiTextArr4[11] = stringUiText61;
            uiTextArr4[12] = stringUiText62;
            uiTextArr4[13] = resourceUiText33;
            uiTextArr4[14] = stringUiText63;
            uiTextArr4[15] = stringUiText64;
            uiTextArr4[16] = resourceUiText34;
            uiTextArr4[17] = stringUiText65;
            uiTextArr4[18] = stringUiText66;
            uiTextArr4[19] = resourceUiText35;
            listK = b.k(uiTextArr4);
        } else if (payChId != 151) {
            listK = m2g.a;
        } else {
            StringUiText stringUiText67 = new StringUiText("1. ");
            ResourceUiText resourceUiText36 = new ResourceUiText(R.string.common_payment_providers__airtel_desc_1__UG);
            StringUiText stringUiText68 = new StringUiText("\n");
            StringUiText stringUiText69 = new StringUiText("2. ");
            ResourceUiText resourceUiText37 = new ResourceUiText(R.string.common_payment_providers__airtel_desc_2__UG);
            StringUiText stringUiText70 = new StringUiText("\n");
            StringUiText stringUiText71 = new StringUiText("3. ");
            ResourceUiText resourceUiText38 = new ResourceUiText(R.string.common_payment_providers__airtel_desc_3__UG);
            StringUiText stringUiText72 = new StringUiText("\n");
            StringUiText stringUiText73 = new StringUiText("4. ");
            ResourceUiText resourceUiText39 = new ResourceUiText(R.string.common_payment_providers__airtel_desc_4__UG);
            StringUiText stringUiText74 = new StringUiText("\n");
            StringUiText stringUiText75 = new StringUiText("5. ");
            ResourceUiText resourceUiText40 = new ResourceUiText(R.string.common_payment_providers__airtel_desc_5__UG);
            StringUiText stringUiText76 = new StringUiText("\n");
            StringUiText stringUiText77 = new StringUiText("6. ");
            ResourceUiText resourceUiText41 = new ResourceUiText(R.string.common_payment_providers__airtel_desc_6__UG);
            StringUiText stringUiText78 = new StringUiText("\n");
            StringUiText stringUiText79 = new StringUiText("7. ");
            ResourceUiText resourceUiText42 = new ResourceUiText(R.string.common_payment_providers__airtel_desc_7__UG);
            StringUiText stringUiText80 = new StringUiText("\n");
            StringUiText stringUiText81 = new StringUiText("8. ");
            ResourceUiText resourceUiText43 = new ResourceUiText(R.string.common_payment_providers__airtel_desc_8__UG);
            UiText[] uiTextArr5 = new UiText[23];
            uiTextArr5[c3] = stringUiText67;
            uiTextArr5[1] = resourceUiText36;
            uiTextArr5[2] = stringUiText68;
            uiTextArr5[3] = stringUiText69;
            uiTextArr5[4] = resourceUiText37;
            uiTextArr5[5] = stringUiText70;
            uiTextArr5[c2] = stringUiText71;
            uiTextArr5[7] = resourceUiText38;
            uiTextArr5[8] = stringUiText72;
            uiTextArr5[9] = stringUiText73;
            uiTextArr5[c] = resourceUiText39;
            uiTextArr5[11] = stringUiText74;
            uiTextArr5[12] = stringUiText75;
            uiTextArr5[13] = resourceUiText40;
            uiTextArr5[14] = stringUiText76;
            uiTextArr5[15] = stringUiText77;
            uiTextArr5[16] = resourceUiText41;
            uiTextArr5[17] = stringUiText78;
            uiTextArr5[18] = stringUiText79;
            uiTextArr5[19] = resourceUiText42;
            uiTextArr5[20] = stringUiText80;
            uiTextArr5[21] = stringUiText81;
            uiTextArr5[22] = resourceUiText43;
            listK = b.k(uiTextArr5);
        }
        List list = listK;
        if (!list.isEmpty()) {
            hh8Var.d.m(new a(paymentChannel.getChannelShowName(), paymentChannel.getChannelIconResId(), paymentChannel.getChannelIconUrl(), aVar, list));
            return Unit.a;
        }
        if (hh8Var.v == null) {
            hh8Var.v = kzh.d(new g1i(qq1.g(hh8Var.c), new fh8(hh8Var, null)), o8i0.d(hh8Var));
        }
        return Unit.a;
    }
}
