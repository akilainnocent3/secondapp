package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes5.dex */
public final class sjk {
    public static final Pair<UiText, UiText> a(GiftDetails giftDetails, String str, String str2, UiText uiText) {
        if (giftDetails.getCurrentBalance() == giftDetails.getInitialBalance()) {
            StringUiText stringUiText = vch0.a;
            Iterator it = b.k(new StringUiText(str2), new StringUiText(" "), new ResourceUiText(R.string.component_coupon__u_off)).iterator();
            if (!it.hasNext()) {
                zkh.a("Empty collection can't be reduced.");
                return null;
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = ((UiText) next).h((UiText) it.next());
            }
            return new Pair<>(uiText, next);
        }
        StringUiText stringUiText2 = vch0.a;
        Iterator it2 = b.k(new ResourceUiText(R.string.component_coupon__original_value_colon), new StringUiText(" "), vch0.d(giftDetails.getCurrency()), new StringUiText(" "), new StringUiText(str)).iterator();
        if (!it2.hasNext()) {
            zkh.a("Empty collection can't be reduced.");
            return null;
        }
        Object next2 = it2.next();
        while (it2.hasNext()) {
            next2 = ((UiText) next2).h((UiText) it2.next());
        }
        Iterator it3 = b.k(new StringUiText(str2), new StringUiText(" "), new ResourceUiText(R.string.component_coupon__left)).iterator();
        if (!it3.hasNext()) {
            zkh.a("Empty collection can't be reduced.");
            return null;
        }
        Object next3 = it3.next();
        while (it3.hasNext()) {
            next3 = ((UiText) next3).h((UiText) it3.next());
        }
        return new Pair<>(next2, next3);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x014b  */
    public static final eok b(GiftDetails giftDetails, String str, boolean z, xik xikVar) {
        hok hokVar;
        ResourceUiText resourceUiText;
        Integer numValueOf;
        UiText uiText;
        UiText uiText2;
        UiText uiText3;
        UiText resourceUiText2;
        String displayDescription;
        giftDetails.getClass();
        str.getClass();
        int kind = giftDetails.getKind();
        if (kind == 1) {
            hokVar = hok.c;
        } else {
            if (kind != 2) {
                if (kind == 3) {
                    hokVar = hok.e;
                }
                return null;
            }
            hokVar = hok.d;
        }
        hok hokVar2 = hokVar;
        if (xikVar == xik.b) {
            Object[] objArr = {bwf0.o((6 & 4) != 0 ? 0 : 1, giftDetails.getUsableTime(), false), bwf0.o((6 & 4) != 0 ? 0 : 1, giftDetails.getExpireTime(), false)};
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.app_common__var_to_var, ay0.S(objArr));
        } else {
            Object[] objArr2 = {bwf0.o((6 & 4) != 0 ? 0 : 1, giftDetails.getExpireTime(), false)};
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.component_coupon__expires_vtime, ay0.S(objArr2));
        }
        ResourceUiText resourceUiText3 = resourceUiText;
        String strV = bjb0.V(giftDetails.getInitialBalance());
        String strV2 = bjb0.V(giftDetails.getCurrentBalance());
        String strV3 = bjb0.V(giftDetails.getLeastOrderAmount());
        int kind2 = giftDetails.getKind();
        if (kind2 == 1) {
            numValueOf = Integer.valueOf(R.string.common_functions__cash_gift);
        } else if (kind2 == 2) {
            numValueOf = Integer.valueOf(R.string.common_functions__discount_gift);
        } else {
            numValueOf = kind2 == 3 ? Integer.valueOf(R.string.common_functions__free_bet_gift) : null;
        }
        if (numValueOf != null) {
            ResourceUiText resourceUiText4 = new ResourceUiText(numValueOf.intValue());
            int kind3 = giftDetails.getKind();
            if (kind3 != 1) {
                if (kind3 == 2) {
                    resourceUiText2 = new ResourceUiText(R.string.component_coupon__on_stakes_of_vcondition_or_more, ay0.S(new Object[]{strV3}));
                    Iterator it = b.k(new StringUiText(strV2), new StringUiText(" "), new ResourceUiText(R.string.component_coupon__u_off)).iterator();
                    if (!it.hasNext()) {
                        zkh.a("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = ((UiText) next).h((UiText) it.next());
                    }
                    uiText3 = (UiText) next;
                } else if (kind3 == 3) {
                    Pair<UiText, UiText> pairA = a(giftDetails, strV, strV2, new ResourceUiText(R.string.component_coupon__stakes_not_returned_with_winnings));
                    uiText = pairA.a;
                    uiText2 = pairA.b;
                }
                String giftId = giftDetails.getGiftId();
                String displayTitle = giftDetails.getDisplayTitle();
                displayDescription = giftDetails.getDisplayDescription();
                if (displayDescription == null) {
                    displayDescription = "";
                }
                return new eok(giftId, hokVar2, resourceUiText2, str, uiText3, resourceUiText3, resourceUiText4, displayTitle, displayDescription, z, xikVar, false);
            }
            Pair<UiText, UiText> pairA2 = a(giftDetails, strV, strV2, vch0.a);
            uiText = pairA2.a;
            uiText2 = pairA2.b;
            uiText3 = uiText2;
            resourceUiText2 = uiText;
            String giftId2 = giftDetails.getGiftId();
            String displayTitle2 = giftDetails.getDisplayTitle();
            displayDescription = giftDetails.getDisplayDescription();
            if (displayDescription == null) {
                displayDescription = "";
            }
            return new eok(giftId2, hokVar2, resourceUiText2, str, uiText3, resourceUiText3, resourceUiText4, displayTitle2, displayDescription, z, xikVar, false);
        }
        return null;
    }
}
