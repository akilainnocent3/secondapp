package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final class ht90 {
    public static zv3 a(List list, String str, zrd0 zrd0Var, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, ResourceUiText resourceUiText, usd0 usd0Var) {
        list.getClass();
        str2.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal5.getClass();
        boolean z = zrd0Var instanceof zrd0.a;
        ord0 bVar = null;
        if (StringsKt.U(str)) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        bVar = new ord0.c(bigDecimal3);
                        break;
                    }
                } while (StringsKt.U((String) it.next()));
            } else {
                bVar = new ord0.c(bigDecimal3);
                break;
            }
        } else if (bigDecimal.compareTo(bigDecimal3) < 0) {
            bVar = new ord0.c(bigDecimal3);
        } else if (bigDecimal2.compareTo(bigDecimal4) > 0) {
            bVar = new ord0.b(bigDecimal4);
        } else if (bigDecimal2.compareTo(bigDecimal5) > 0) {
            bVar = ord0.a.a;
        }
        return new zv3(resourceUiText, str2, zrd0.a.a, h(str, bigDecimal3, true, z, bVar != null), p(bVar), z, usd0Var);
    }

    public static sg10 b(boolean z, BigDecimal bigDecimal) {
        StringUiText stringUiText = vch0.a;
        return new sg10(new ResourceUiText(R.string.component_betslip__place_bet), null, new ResourceUiText(R.string.component_betslip__about_to_pay_vamount, ay0.S(new Object[]{bjb0.L(bigDecimal, Locale.US)})), "betslip_pay_amount_text", z ? sg10.a.d : sg10.a.c);
    }

    public static zv3 c(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, zrd0 zrd0Var, String str2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, ResourceUiText resourceUiText, usd0 usd0Var) {
        ord0 bVar;
        bigDecimal.getClass();
        str2.getClass();
        bigDecimal5.getClass();
        boolean z = zrd0Var instanceof zrd0.a;
        if (bigDecimal.compareTo(bigDecimal3) < 0) {
            bVar = new ord0.c(bigDecimal3);
        } else if (bigDecimal.compareTo(bigDecimal4) > 0) {
            bVar = new ord0.b(bigDecimal4);
        } else {
            bVar = bigDecimal2.compareTo(bigDecimal5) > 0 ? ord0.a.a : null;
        }
        return new zv3(resourceUiText, str2, zrd0.a.a, h(str, bigDecimal3, true, z, bVar != null), p(bVar), z, usd0Var);
    }

    public static lr4 d() {
        StringUiText stringUiText = vch0.a;
        return new lr4(new ResourceUiText(R.string.page_instant_virtual__tap_to_expand_and_view_full_bet_details), 0.0f);
    }

    public static dqk e(List list, m780 m780Var, BigDecimal bigDecimal, String str) {
        UiText uiTextA;
        list.getClass();
        bigDecimal.getClass();
        str.getClass();
        Integer numValueOf = null;
        if (!list.isEmpty()) {
            if (m780Var == null) {
                Object[] objArr = {Integer.valueOf(list.size())};
                StringUiText stringUiText = vch0.a;
                return new dqk(new ResourceUiText(R.string.component_coupon__use_gifts_with_num, ay0.S(objArr)), dqk.a.NONE, "gift_picker_button_unselected_text");
            }
            BigDecimal bigDecimalG = b.g(m780Var.a);
            if (bigDecimalG != null) {
                int kind = m780Var.b.getKind();
                if (kind == 1) {
                    numValueOf = Integer.valueOf(R.string.common_functions__cash_gift);
                } else if (kind == 2) {
                    numValueOf = Integer.valueOf(R.string.common_functions__discount_gift);
                } else if (kind == 3) {
                    numValueOf = Integer.valueOf(R.string.common_functions__free_bet_gift);
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    StringUiText stringUiText2 = vch0.a;
                    uiTextA = jz4.a(new ResourceUiText(iIntValue), ", ");
                } else {
                    uiTextA = vch0.a;
                }
                BigDecimal bigDecimalMin = bigDecimalG.min(bigDecimal);
                StringBuilder sbB = mq0.b(str, " -");
                sbB.append(bjb0.L(bigDecimalMin, Locale.US));
                return new dqk(uiTextA.h(new StringUiText(sbB.toString())), dqk.a.SELECTED, "gift_picker_button_selected_text");
            }
        }
        return null;
    }

    public static sg10 f(String str, BigDecimal bigDecimal, boolean z) {
        ResourceUiText resourceUiText;
        ResourceUiText resourceUiText2;
        String str2;
        String str3;
        String strL = bjb0.L(bigDecimal, Locale.US);
        if (str != null) {
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.component_betslip__place_bet_with_excise_tax, ay0.S(new Object[]{strL}));
            resourceUiText2 = new ResourceUiText(R.string.component_betslip__excise_tax_stake, ay0.S(new Object[]{str}));
            str3 = "quick_bet_excise_tax_text";
            str2 = "quick_bet_pay_amount_text";
        } else {
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.component_betslip__place_bet);
            resourceUiText2 = new ResourceUiText(R.string.component_betslip__about_to_pay_vamount, ay0.S(new Object[]{strL}));
            str2 = null;
            str3 = "quick_bet_pay_amount_text";
        }
        return new sg10(resourceUiText, str2, resourceUiText2, str3, z ? sg10.a.d : sg10.a.c);
    }

    public static dg30 g(boolean z, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        String strL;
        String strL2;
        bigDecimal.getClass();
        bigDecimal2.getClass();
        if (z) {
            Locale locale = Locale.US;
            strL2 = bjb0.L(bigDecimal2, locale);
            strL = bjb0.L(bigDecimal.subtract(bigDecimal2), locale);
        } else {
            strL = bjb0.L(bigDecimal, Locale.US);
            strL2 = null;
        }
        StringUiText stringUiText = vch0.a;
        return new dg30(new ResourceUiText(R.string.component_betslip__to_win), strL2, strL);
    }

    public static asd0 h(String str, BigDecimal bigDecimal, boolean z, boolean z2, boolean z3) {
        asd0.a aVar;
        str.getClass();
        bigDecimal.getClass();
        String string = bigDecimal.toString();
        string.getClass();
        if (!z) {
            aVar = asd0.a.c;
        } else if (z3) {
            aVar = asd0.a.f;
        } else {
            aVar = z2 ? asd0.a.e : asd0.a.d;
        }
        return new asd0(string, str, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    public static usd0 i(String str, List list, List list2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        int i;
        BigDecimal bigDecimalMultiply;
        Double d;
        str.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        BigDecimal bigDecimalG = b.g(c.p(str, ",", "", false));
        if (bigDecimalG == null) {
            i = 3;
        } else {
            boolean z = bigDecimalG.compareTo(bigDecimal2) >= 0 && bigDecimalG.compareTo(bigDecimal3) <= 0;
            boolean z2 = bigDecimalG.compareTo(bigDecimal) != 0;
            if (z && z2) {
                i = 1;
            } else {
                i = 3;
            }
        }
        List listK = kotlin.collections.b.k(0, 1, 2);
        ArrayList arrayList = new ArrayList();
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (list == null || (d = (Double) CollectionsKt.V(iIntValue, list)) == null) {
                BigDecimal bigDecimal4 = (BigDecimal) CollectionsKt.V(iIntValue, list2);
                bigDecimalMultiply = bigDecimal4 != null ? bigDecimal4.multiply(heo.a) : null;
            } else {
                bigDecimalMultiply = new BigDecimal(String.valueOf(d.doubleValue()));
            }
            if (bigDecimalMultiply != null) {
                arrayList.add(bigDecimalMultiply);
            }
        }
        return new usd0(3, i, arrayList);
    }

    public static ord0 j(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        BigDecimal bigDecimalG;
        str.getClass();
        str2.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        if (!StringsKt.U(str2) || (bigDecimalG = b.g(str)) == null) {
            return null;
        }
        if (bigDecimalG.compareTo(bigDecimal) < 0) {
            return new ord0.c(bigDecimal);
        }
        if (bigDecimalG.compareTo(bigDecimal2) > 0) {
            return new ord0.b(bigDecimal2);
        }
        if (bigDecimalG.compareTo(bigDecimal3) > 0) {
            return ord0.a.a;
        }
        return null;
    }

    public static ResourceUiText k(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        bigDecimal.getClass();
        if (bigDecimal.compareTo(bigDecimal2) != 1) {
            return null;
        }
        Object[] objArr = {bjb0.Y(bigDecimal2)};
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.component_betslip__total_stake_cannot_exceed_vmaxstake, ay0.S(objArr));
    }

    public static String l(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        if (bigDecimal.compareTo(bigDecimal2) == 0) {
            return gky.a.a(bjb0.L(bigDecimal2, Locale.US), false);
        }
        Locale locale = Locale.US;
        return oxc.a(gky.a.a(bjb0.L(bigDecimal, locale), false), " ~ ", gky.a.a(bjb0.L(bigDecimal2, locale), false));
    }

    public static ResourceUiText m(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z) {
        bigDecimal2.getClass();
        if (!z) {
            return null;
        }
        StringBuilder sbB = mq0.b(str, " ");
        Locale locale = Locale.US;
        sbB.append(bjb0.L(bigDecimal, locale));
        String string = sbB.toString();
        StringBuilder sbB2 = mq0.b(str, " ");
        sbB2.append(bjb0.L(bigDecimal2, locale));
        Object[] objArr = {string, sbB2.toString()};
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.component_betslip__excise_tax_confirm_dialog_bracket, ay0.S(objArr));
    }

    public static String n(BigDecimal bigDecimal, String str) {
        str.getClass();
        return str + " " + bjb0.L(bigDecimal, Locale.US);
    }

    public static ord0 o(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5) {
        bigDecimal.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        bigDecimal5.getClass();
        if (bigDecimal.compareTo(bigDecimal3) < 0) {
            return new ord0.c(bigDecimal3);
        }
        if (bigDecimal.compareTo(bigDecimal4) > 0) {
            return new ord0.b(bigDecimal4);
        }
        if (bigDecimal2.compareTo(bigDecimal5) > 0) {
            return ord0.a.a;
        }
        return null;
    }

    public static ResourceUiText p(ord0 ord0Var) {
        if (ord0Var == null) {
            return null;
        }
        if (ord0Var instanceof ord0.a) {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.page_instant_virtual__less_balanc);
        }
        if (ord0Var instanceof ord0.c) {
            Object[] objArr = {bjb0.Y(((ord0.c) ord0Var).a)};
            StringUiText stringUiText2 = vch0.a;
            return new ResourceUiText(R.string.component_betslip__please_enter_a_value_no_less_than_vmount, ay0.S(objArr));
        }
        if (!(ord0Var instanceof ord0.b)) {
            uhc.a();
            return null;
        }
        Object[] objArr2 = {bjb0.Y(((ord0.b) ord0Var).a)};
        StringUiText stringUiText3 = vch0.a;
        return new ResourceUiText(R.string.component_betslip__total_stake_cannot_exceed_vmaxstake, ay0.S(objArr2));
    }

    public static String q(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            return bjb0.L(bigDecimal.subtract(bigDecimal3), Locale.US);
        }
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal3);
        BigDecimal bigDecimalSubtract2 = bigDecimal2.subtract(bigDecimal4);
        Locale locale = Locale.US;
        return bjb0.L(bigDecimalSubtract, locale) + " ~ " + bjb0.L(bigDecimalSubtract2, locale);
    }

    public static String r(boolean z, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        if (!z) {
            return null;
        }
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            return bjb0.L(bigDecimal3.multiply(heo.b), Locale.US);
        }
        BigDecimal bigDecimal5 = heo.b;
        BigDecimal bigDecimalMultiply = bigDecimal3.multiply(bigDecimal5);
        BigDecimal bigDecimalMultiply2 = bigDecimal4.multiply(bigDecimal5);
        Locale locale = Locale.US;
        return bjb0.L(bigDecimalMultiply, locale) + " ~ " + bjb0.L(bigDecimalMultiply2, locale);
    }

    public static boolean s(ft90 ft90Var, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5) {
        int i;
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal5.getClass();
        if (ft90Var.c) {
            List<cz2> list = ft90Var.a;
            Map<String, String> map = ft90Var.b;
            Collection<String> collectionValues = map.values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it = collectionValues.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (b.g((String) it.next()) == null && (i = i + 1) < 0) {
                        kotlin.collections.b.p();
                        throw null;
                    }
                }
            }
            if (i != list.size()) {
                Collection<String> collectionValues2 = map.values();
                if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                    Iterator<T> it2 = collectionValues2.iterator();
                    while (it2.hasNext()) {
                        BigDecimal bigDecimalG = b.g((String) it2.next());
                        if (bigDecimalG == null || bigDecimalG.compareTo(bigDecimal3) >= 0) {
                        }
                    }
                    if (bigDecimal.compareTo(bigDecimal4) != 1 && bigDecimal2.compareTo(bigDecimal5) != 1) {
                        return true;
                    }
                } else if (bigDecimal.compareTo(bigDecimal4) != 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @fae
    public static boolean t(List list, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5) {
        int i;
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        bigDecimal5.getClass();
        if (!list.isEmpty()) {
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (b.g(((dt90) it.next()).b()) == null && (i = i + 1) < 0) {
                        kotlin.collections.b.p();
                        throw null;
                    }
                }
            }
            if (i != list.size()) {
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        BigDecimal bigDecimalG = b.g(((dt90) it2.next()).b());
                        if (bigDecimalG == null || bigDecimalG.compareTo(bigDecimal3) >= 0) {
                        }
                    }
                    if (bigDecimal.compareTo(bigDecimal4) != 1) {
                        return true;
                    }
                } else if (bigDecimal.compareTo(bigDecimal4) != 1 && bigDecimal2.compareTo(bigDecimal5) != 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
