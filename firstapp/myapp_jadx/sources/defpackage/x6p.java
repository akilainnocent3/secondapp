package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x6p implements Function1 {
    public final /* synthetic */ c7p a;

    public /* synthetic */ x6p(c7p c7pVar) {
        this.a = c7pVar;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:162:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:187:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gok gokVar;
        Integer num;
        Integer numValueOf;
        j7p j7pVar;
        int i;
        int i2;
        int i3;
        Object dokVar;
        UiText uiText;
        UiText uiText2;
        UiText resourceUiText;
        UiText uiText3;
        String displayDescription;
        Object value;
        Object value2;
        ayk aykVar;
        dyk.b bVar;
        Object value3;
        ayk aykVar2;
        zxk zxkVar = (zxk) obj;
        j7p j7pVar2 = this.a.e0;
        wwd0 wwd0Var = j7pVar2.d;
        zxkVar.getClass();
        if (zxkVar.equals(zxk.b.a)) {
            j7pVar2.x1();
        } else {
            int i4 = 1;
            if (zxkVar.equals(zxk.a.a)) {
                do {
                    value3 = wwd0Var.getValue();
                    aykVar2 = (ayk) value3;
                } while (!wwd0Var.g(value3, ayk.a(aykVar2, false, false, null, null, null, dyk.a.a, false, !StringsKt.U(aykVar2.e), null, 351)));
            } else {
                int i5 = 3;
                Integer num2 = null;
                if (zxkVar.equals(zxk.c.a)) {
                    do {
                        value2 = wwd0Var.getValue();
                        aykVar = (ayk) value2;
                        dyk dykVar = aykVar.f;
                        dyk.b bVar2 = dykVar instanceof dyk.b ? (dyk.b) dykVar : null;
                        if (bVar2 == null) {
                            bVar2 = new dyk.b((ijf0) null, 3);
                        }
                        bVar = bVar2;
                    } while (!wwd0Var.g(value2, ayk.a(aykVar, false, false, null, null, null, bVar, false, !StringsKt.U(bVar.a.a.b) && Intrinsics.g(bVar.b, vch0.a), null, 351)));
                } else {
                    int i6 = 2;
                    if (zxkVar instanceof zxk.f) {
                        Pattern pattern = j7p.f;
                        ijf0 ijf0Var = ((zxk.f) zxkVar).a;
                        if (pattern.matcher(ijf0Var.a.b).matches()) {
                            dyk dykVar2 = ((ayk) wwd0Var.getValue()).f;
                            dyk.b bVar3 = dykVar2 instanceof dyk.b ? (dyk.b) dykVar2 : null;
                            dyk.b bVarA = bVar3 != null ? dyk.b.a(bVar3, ijf0Var, null, 2) : new dyk.b(ijf0Var, 2);
                            BigDecimal bigDecimalG = b.g(ijf0Var.a.b);
                            if (bigDecimalG == null) {
                                bigDecimalG = BigDecimal.ZERO;
                            }
                            BigDecimal bigDecimal = new BigDecimal(((ayk) wwd0Var.getValue()).e);
                            UiText resourceUiText2 = bigDecimalG.compareTo(bigDecimal) > 0 ? new ResourceUiText(R.string.component_coupon__value_cannot_exceed_max_vamount, ay0.S(new Object[]{bigDecimal})) : vch0.a;
                            do {
                                value = wwd0Var.getValue();
                            } while (!wwd0Var.g(value, ayk.a((ayk) value, false, false, null, null, null, dyk.b.a(bVarA, null, resourceUiText2, 1), false, !StringsKt.U(bVarA.a.a.b) && Intrinsics.g(resourceUiText2, vch0.a), null, 351)));
                        }
                    } else if (zxkVar.equals(zxk.d.a)) {
                        j7pVar2.x1();
                    } else {
                        if (!zxkVar.equals(zxk.e.a)) {
                            uhc.a();
                            return null;
                        }
                        wwd0 wwd0Var2 = j7pVar2.e;
                        while (true) {
                            Object value4 = wwd0Var2.getValue();
                            List<GiftDetails> list = ((ayk) wwd0Var.getValue()).c;
                            ArrayList arrayList = new ArrayList();
                            for (GiftDetails giftDetails : list) {
                                String strB = j7pVar2.a.B();
                                boolean zG = Intrinsics.g(giftDetails.getGiftId(), ((ayk) j7pVar2.d.getValue()).d);
                                strB.getClass();
                                int kind = giftDetails.getKind();
                                if (kind == i4) {
                                    gokVar = gok.c;
                                } else if (kind != i6) {
                                    if (kind != i5) {
                                        j7pVar = j7pVar2;
                                        i = i4;
                                        num = num2;
                                        dokVar = num;
                                        i2 = i6;
                                        i3 = i5;
                                    } else {
                                        gokVar = gok.e;
                                    }
                                    if (dokVar != null) {
                                        arrayList.add(dokVar);
                                    }
                                    num2 = num;
                                    i5 = i3;
                                    i6 = i2;
                                    i4 = i;
                                    j7pVar2 = j7pVar;
                                } else {
                                    gokVar = gok.d;
                                }
                                gok gokVar2 = gokVar;
                                ResourceUiText resourceUiText3 = new ResourceUiText(R.string.component_coupon__expires_vtime, ay0.S(new Object[]{bwf0.o((6 & 4) != 0 ? 0 : 1, giftDetails.getExpireTime(), false)}));
                                String strV = bjb0.V(giftDetails.getInitialBalance());
                                String strV2 = bjb0.V(giftDetails.getCurrentBalance());
                                String strV3 = bjb0.V(giftDetails.getLeastOrderAmount());
                                num = num2;
                                int kind2 = giftDetails.getKind();
                                if (kind2 == i4) {
                                    numValueOf = Integer.valueOf(R.string.common_functions__cash_gift);
                                } else if (kind2 == i6) {
                                    numValueOf = Integer.valueOf(R.string.common_functions__discount_gift);
                                } else {
                                    numValueOf = kind2 == i5 ? Integer.valueOf(R.string.common_functions__free_bet_gift) : num;
                                }
                                if (numValueOf != null) {
                                    ResourceUiText resourceUiText4 = new ResourceUiText(numValueOf.intValue());
                                    int kind3 = giftDetails.getKind();
                                    if (kind3 == i4) {
                                        j7pVar = j7pVar2;
                                        i = i4;
                                        i2 = i6;
                                        if (giftDetails.getCurrentBalance() != giftDetails.getInitialBalance()) {
                                            ResourceUiText resourceUiText5 = new ResourceUiText(R.string.component_coupon__original_value_colon);
                                            StringUiText stringUiText = new StringUiText(" ");
                                            StringUiText stringUiTextD = vch0.d(giftDetails.getCurrency());
                                            StringUiText stringUiText2 = new StringUiText(" ");
                                            StringUiText stringUiText3 = new StringUiText(strV);
                                            UiText[] uiTextArr = new UiText[5];
                                            uiTextArr[0] = resourceUiText5;
                                            uiTextArr[i == true ? 1 : 0] = stringUiText;
                                            uiTextArr[i2] = stringUiTextD;
                                            uiTextArr[3] = stringUiText2;
                                            uiTextArr[4] = stringUiText3;
                                            Iterator it = kotlin.collections.b.k(uiTextArr).iterator();
                                            if (!it.hasNext()) {
                                                zkh.a("Empty collection can't be reduced.");
                                                return num;
                                            }
                                            Object next = it.next();
                                            while (it.hasNext()) {
                                                next = ((UiText) next).h((UiText) it.next());
                                            }
                                            resourceUiText = (UiText) next;
                                            StringUiText stringUiText4 = new StringUiText(strV2);
                                            StringUiText stringUiText5 = new StringUiText(" ");
                                            ResourceUiText resourceUiText6 = new ResourceUiText(R.string.component_coupon__left);
                                            UiText[] uiTextArr2 = new UiText[3];
                                            uiTextArr2[0] = stringUiText4;
                                            uiTextArr2[i == true ? 1 : 0] = stringUiText5;
                                            uiTextArr2[i2] = resourceUiText6;
                                            Iterator it2 = kotlin.collections.b.k(uiTextArr2).iterator();
                                            if (!it2.hasNext()) {
                                                zkh.a("Empty collection can't be reduced.");
                                                return num;
                                            }
                                            Object next2 = it2.next();
                                            while (it2.hasNext()) {
                                                next2 = ((UiText) next2).h((UiText) it2.next());
                                            }
                                            uiText3 = (UiText) next2;
                                        } else {
                                            StringUiText stringUiText6 = vch0.a;
                                            StringUiText stringUiText7 = new StringUiText(strV2);
                                            StringUiText stringUiText8 = new StringUiText(" ");
                                            ResourceUiText resourceUiText7 = new ResourceUiText(R.string.component_coupon__u_off);
                                            i3 = 3;
                                            UiText[] uiTextArr3 = new UiText[3];
                                            uiTextArr3[0] = stringUiText7;
                                            uiTextArr3[i == true ? 1 : 0] = stringUiText8;
                                            uiTextArr3[i2] = resourceUiText7;
                                            Iterator it3 = kotlin.collections.b.k(uiTextArr3).iterator();
                                            if (!it3.hasNext()) {
                                                zkh.a("Empty collection can't be reduced.");
                                                return num;
                                            }
                                            Object next3 = it3.next();
                                            while (it3.hasNext()) {
                                                next3 = ((UiText) next3).h((UiText) it3.next());
                                            }
                                            uiText = stringUiText6;
                                            uiText2 = (UiText) next3;
                                        }
                                        String giftId = giftDetails.getGiftId();
                                        String displayTitle = giftDetails.getDisplayTitle();
                                        displayDescription = giftDetails.getDisplayDescription();
                                        if (displayDescription == null) {
                                            displayDescription = "";
                                        }
                                        dokVar = new dok(giftId, gokVar2, uiText, strB, uiText2, resourceUiText3, resourceUiText4, displayTitle, displayDescription, zG, false);
                                    } else if (kind3 != i6) {
                                        i2 = i6;
                                        i3 = 3;
                                        if (kind3 != 3) {
                                            dokVar = num;
                                            j7pVar = j7pVar2;
                                            i = i4;
                                        } else if (giftDetails.getCurrentBalance() != giftDetails.getInitialBalance()) {
                                            ResourceUiText resourceUiText8 = new ResourceUiText(R.string.component_coupon__original_value_colon);
                                            StringUiText stringUiText9 = new StringUiText(" ");
                                            StringUiText stringUiTextD2 = vch0.d(giftDetails.getCurrency());
                                            i = i4;
                                            StringUiText stringUiText10 = new StringUiText(" ");
                                            j7pVar = j7pVar2;
                                            StringUiText stringUiText11 = new StringUiText(strV);
                                            UiText[] uiTextArr4 = new UiText[5];
                                            uiTextArr4[0] = resourceUiText8;
                                            uiTextArr4[i == true ? 1 : 0] = stringUiText9;
                                            uiTextArr4[i2] = stringUiTextD2;
                                            uiTextArr4[3] = stringUiText10;
                                            uiTextArr4[4] = stringUiText11;
                                            Iterator it4 = kotlin.collections.b.k(uiTextArr4).iterator();
                                            if (!it4.hasNext()) {
                                                zkh.a("Empty collection can't be reduced.");
                                                return num;
                                            }
                                            Object next4 = it4.next();
                                            while (it4.hasNext()) {
                                                next4 = ((UiText) next4).h((UiText) it4.next());
                                            }
                                            resourceUiText = (UiText) next4;
                                            StringUiText stringUiText12 = new StringUiText(strV2);
                                            StringUiText stringUiText13 = new StringUiText(" ");
                                            ResourceUiText resourceUiText9 = new ResourceUiText(R.string.component_coupon__left);
                                            UiText[] uiTextArr5 = new UiText[3];
                                            uiTextArr5[0] = stringUiText12;
                                            uiTextArr5[i == true ? 1 : 0] = stringUiText13;
                                            uiTextArr5[i2] = resourceUiText9;
                                            Iterator it5 = kotlin.collections.b.k(uiTextArr5).iterator();
                                            if (!it5.hasNext()) {
                                                zkh.a("Empty collection can't be reduced.");
                                                return num;
                                            }
                                            Object next5 = it5.next();
                                            while (it5.hasNext()) {
                                                next5 = ((UiText) next5).h((UiText) it5.next());
                                            }
                                            uiText3 = (UiText) next5;
                                        } else {
                                            j7pVar = j7pVar2;
                                            i = i4;
                                            resourceUiText = new ResourceUiText(R.string.component_coupon__stakes_not_returned_with_winnings);
                                            StringUiText stringUiText14 = new StringUiText(strV2);
                                            StringUiText stringUiText15 = new StringUiText(" ");
                                            ResourceUiText resourceUiText10 = new ResourceUiText(R.string.component_coupon__u_off);
                                            UiText[] uiTextArr6 = new UiText[3];
                                            uiTextArr6[0] = stringUiText14;
                                            uiTextArr6[i == true ? 1 : 0] = stringUiText15;
                                            uiTextArr6[i2] = resourceUiText10;
                                            Iterator it6 = kotlin.collections.b.k(uiTextArr6).iterator();
                                            if (!it6.hasNext()) {
                                                zkh.a("Empty collection can't be reduced.");
                                                return num;
                                            }
                                            Object next6 = it6.next();
                                            while (it6.hasNext()) {
                                                next6 = ((UiText) next6).h((UiText) it6.next());
                                            }
                                            uiText3 = (UiText) next6;
                                        }
                                    } else {
                                        j7pVar = j7pVar2;
                                        i = i4;
                                        i2 = i6;
                                        resourceUiText = new ResourceUiText(R.string.component_coupon__on_stakes_of_vcondition_or_more, ay0.S(new Object[]{strV3}));
                                        StringUiText stringUiText16 = new StringUiText(strV2);
                                        StringUiText stringUiText17 = new StringUiText(" ");
                                        ResourceUiText resourceUiText11 = new ResourceUiText(R.string.component_coupon__u_off);
                                        UiText[] uiTextArr7 = new UiText[3];
                                        uiTextArr7[0] = stringUiText16;
                                        uiTextArr7[i == true ? 1 : 0] = stringUiText17;
                                        uiTextArr7[i2] = resourceUiText11;
                                        Iterator it7 = kotlin.collections.b.k(uiTextArr7).iterator();
                                        if (!it7.hasNext()) {
                                            zkh.a("Empty collection can't be reduced.");
                                            return num;
                                        }
                                        Object next7 = it7.next();
                                        while (it7.hasNext()) {
                                            next7 = ((UiText) next7).h((UiText) it7.next());
                                        }
                                        uiText3 = (UiText) next7;
                                    }
                                    uiText = resourceUiText;
                                    uiText2 = uiText3;
                                    i3 = 3;
                                    String giftId2 = giftDetails.getGiftId();
                                    String displayTitle2 = giftDetails.getDisplayTitle();
                                    displayDescription = giftDetails.getDisplayDescription();
                                    if (displayDescription == null) {
                                        displayDescription = "";
                                    }
                                    dokVar = new dok(giftId2, gokVar2, uiText, strB, uiText2, resourceUiText3, resourceUiText4, displayTitle2, displayDescription, zG, false);
                                } else {
                                    j7pVar = j7pVar2;
                                    i = i4;
                                    i2 = i6;
                                    i3 = i5;
                                    dokVar = num;
                                }
                                if (dokVar != null) {
                                    arrayList.add(dokVar);
                                }
                                num2 = num;
                                i5 = i3;
                                i6 = i2;
                                i4 = i;
                                j7pVar2 = j7pVar;
                            }
                            j7p j7pVar3 = j7pVar2;
                            boolean z = i4;
                            Integer num3 = num2;
                            int i7 = i6;
                            int i8 = i5;
                            if (!wwd0Var2.g(value4, new nvk(a4h.b(arrayList), z))) {
                                num2 = num3;
                                i4 = z ? 1 : 0;
                                i5 = i8;
                                i6 = i7;
                                j7pVar2 = j7pVar3;
                            }
                        }
                    }
                }
            }
        }
        return Unit.a;
    }
}
