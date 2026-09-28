package defpackage;

import android.os.Parcelable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class bwk {
    public final njk a;

    public bwk(njk njkVar, d04 d04Var) {
        njkVar.getClass();
        this.a = njkVar;
    }

    public static int b(awk awkVar) {
        int iOrdinal = awkVar.ordinal();
        if (iOrdinal == 0) {
            return R.drawable.ic_lucky_wheel;
        }
        if (iOrdinal == 1) {
            return 2131231879;
        }
        if (iOrdinal == 2) {
            return 2131231945;
        }
        if (iOrdinal == 3) {
            return R.drawable.ic_free_bet_gift;
        }
        if (iOrdinal == 4) {
            return R.drawable.ic_lucky_wheel;
        }
        if (iOrdinal == 5) {
            return R.drawable.ic__feature__promotion;
        }
        uhc.a();
        return 0;
    }

    public static UiText c(awk awkVar) {
        int iOrdinal = awkVar.ordinal();
        if (iOrdinal == 0) {
            return vch0.a;
        }
        if (iOrdinal == 1) {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.gift__cash_gifts);
        }
        if (iOrdinal == 2) {
            StringUiText stringUiText2 = vch0.a;
            return new ResourceUiText(R.string.gift__discount_gifts);
        }
        if (iOrdinal == 3) {
            StringUiText stringUiText3 = vch0.a;
            return new ResourceUiText(R.string.gift__free_bet_gifts);
        }
        if (iOrdinal == 4) {
            StringUiText stringUiText4 = vch0.a;
            return new ResourceUiText(R.string.gift__lucky_wheel_tickets);
        }
        if (iOrdinal == 5) {
            StringUiText stringUiText5 = vch0.a;
            return new ResourceUiText(R.string.gift__customize_gift);
        }
        uhc.a();
        return null;
    }

    public static int d(awk awkVar, boolean z, boolean z2) {
        if (!z) {
            return R.drawable.iwqk_expired_gift_up;
        }
        if (z2) {
            return R.drawable.iwqk_wc_pass_free_bet_gift;
        }
        int iOrdinal = awkVar.ordinal();
        if (iOrdinal == 0) {
            return R.drawable.iwqk_discount_gift_up;
        }
        if (iOrdinal == 1) {
            return R.drawable.iwqk_cash_gift_up;
        }
        if (iOrdinal == 2) {
            return R.drawable.iwqk_discount_gift_up;
        }
        if (iOrdinal == 3) {
            return R.drawable.iwqk_free_bet_gift;
        }
        if (iOrdinal == 4) {
            return R.drawable.iwqk_discount_gift_up;
        }
        if (iOrdinal == 5) {
            return R.drawable.iwqk_free_bet_gift;
        }
        uhc.a();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0362  */
    /* JADX WARN: Code duplicated, block: B:169:0x0368  */
    /* JADX WARN: Code duplicated, block: B:171:0x036e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0377  */
    /* JADX WARN: Code duplicated, block: B:175:0x037a  */
    /* JADX WARN: Code duplicated, block: B:181:0x039d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x0214  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [com.sporty.android.common_ui.uitext.UiText] */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r27v1, types: [com.sporty.android.common_ui.uitext.ResourceUiText] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r33v2 */
    public final zsk a(awk awkVar, ArrayList arrayList, String str, boolean z, String str2) {
        zsk zskVar;
        ResourceUiText resourceUiText;
        boolean z2;
        ?? r22;
        UiText uiTextA;
        UiText resourceUiText2;
        UiText resourceUiText3;
        int i;
        int iA;
        int i2;
        int i3;
        int i4;
        boolean z3;
        StringUiText stringUiText;
        int i5;
        Object objA;
        Parcelable resourceUiText4;
        ArrayList arrayList2 = arrayList;
        boolean z4 = z;
        String str3 = str2;
        String strA = tug.a(str3, "_header_", awkVar.name());
        mjk.b bVar = new mjk.b(awkVar);
        UiText uiTextC = c(awkVar);
        int iB = b(awkVar);
        int iOrdinal = awkVar.ordinal();
        if (iOrdinal == 0) {
            zskVar = null;
            resourceUiText = null;
        } else if (iOrdinal == 1) {
            zskVar = null;
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.gift__used_like_cash);
        } else if (iOrdinal == 2) {
            zskVar = null;
            StringUiText stringUiText3 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.gift__offers_discounts_when_spending_a_given_amount_of_cash);
        } else if (iOrdinal == 3) {
            StringUiText stringUiText4 = vch0.a;
            zskVar = null;
            resourceUiText = new ResourceUiText(R.string.gift__win_real_money_without_the_initial_risk);
        } else if (iOrdinal == 4) {
            zskVar = null;
            resourceUiText = null;
        } else {
            if (iOrdinal != 5) {
                uhc.a();
                return null;
            }
            resourceUiText = null;
            zskVar = null;
        }
        boolean z5 = (awkVar == awk.LuckyWheel || awkVar == awk.BetslipTheme) ? false : true;
        ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
        int size = arrayList2.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList2.get(i6);
            int i7 = i6 + 1;
            eik eikVar = (eik) obj;
            String str4 = eikVar.a;
            boolean z6 = z5;
            long j = eikVar.i;
            ResourceUiText resourceUiText5 = resourceUiText;
            awk awkVar2 = eikVar.b;
            int i8 = size;
            String strA2 = tug.a(str3, "_gift_", str4);
            rvk rvkVar = eikVar.c;
            String str5 = strA;
            long j2 = eikVar.f;
            long j3 = eikVar.g;
            boolean z7 = eikVar.m;
            njk njkVar = this.a;
            pjk pjkVarC = njkVar.c(awkVar2, z4);
            if (z4 && z7) {
                pjkVarC = new pjk(R.color.text_secondary, R.color.text_secondary, pjkVarC.c, R.color.text_secondary);
            }
            int i9 = pjkVarC.a;
            int i10 = pjkVarC.d;
            String str6 = awkVar2 == awk.BetslipTheme ? "" : str;
            String str7 = eikVar.a;
            int iOrdinal2 = awkVar2.ordinal();
            int i11 = iB;
            if (iOrdinal2 == 0) {
                z2 = z7;
                r22 = zskVar;
            } else {
                if (iOrdinal2 == 1) {
                    z2 = z7;
                    if (j2 == j3 || !z) {
                        r22 = zskVar;
                    } else {
                        StringUiText stringUiText5 = vch0.a;
                        objA = jz4.a(new ResourceUiText(R.string.component_coupon__original_value_colon), lx5.a(" ", str, " ", s5y.e(Long.valueOf(j2))));
                    }
                } else if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            if (iOrdinal2 != 5) {
                                uhc.a();
                                return zskVar;
                            }
                            StringUiText stringUiText6 = vch0.a;
                            resourceUiText4 = new ResourceUiText(R.string.gift__betslip_theme);
                        }
                        z2 = z7;
                        r22 = zskVar;
                    } else if (j2 == j3 || !z4) {
                        StringUiText stringUiText7 = vch0.a;
                        resourceUiText4 = new ResourceUiText(R.string.component_coupon__stakes_not_returned_with_winnings);
                    } else {
                        StringUiText stringUiText8 = vch0.a;
                        resourceUiText4 = jz4.a(new ResourceUiText(R.string.component_coupon__original_value_colon), lx5.a(" ", str, " ", s5y.e(Long.valueOf(j2))));
                    }
                    Parcelable parcelable = resourceUiText4;
                    z2 = z7;
                    r22 = parcelable;
                } else {
                    z2 = z7;
                    Object[] objArr = {s5y.e(Long.valueOf(eikVar.j))};
                    StringUiText stringUiText9 = vch0.a;
                    objA = new ResourceUiText(R.string.component_coupon__on_stakes_of_vcondition_or_more, ay0.S(objArr));
                }
                r22 = objA;
            }
            int iOrdinal3 = awkVar2.ordinal();
            if (iOrdinal3 == 0) {
                uiTextA = vch0.a;
            } else if (iOrdinal3 == 1) {
                if (j2 == r21 && z) {
                    String strConcat = s5y.e(Long.valueOf((long) r21)).concat(" ");
                    StringUiText stringUiText10 = vch0.a;
                    stringUiText = new StringUiText(strConcat);
                    i5 = R.string.component_coupon__left;
                } else {
                    String strConcat2 = s5y.e(Long.valueOf(j2)).concat(" ");
                    StringUiText stringUiText11 = vch0.a;
                    stringUiText = new StringUiText(strConcat2);
                    i5 = R.string.component_coupon__u_off;
                }
                uiTextA = ygh.a(i5, stringUiText);
            } else if (iOrdinal3 == 2) {
                String strConcat3 = s5y.e(Long.valueOf(j2)).concat(" ");
                StringUiText stringUiText12 = vch0.a;
                stringUiText = new StringUiText(strConcat3);
                i5 = R.string.component_coupon__u_off;
                uiTextA = ygh.a(i5, stringUiText);
            } else if (iOrdinal3 == 3) {
                if (j2 == r21) {
                }
                String strConcat4 = s5y.e(Long.valueOf(j2)).concat(" ");
                StringUiText stringUiText13 = vch0.a;
                stringUiText = new StringUiText(strConcat4);
                i5 = R.string.component_coupon__u_off;
                uiTextA = ygh.a(i5, stringUiText);
            } else if (iOrdinal3 == 4) {
                uiTextA = vch0.a;
            } else {
                if (iOrdinal3 != 5) {
                    uhc.a();
                    return zskVar;
                }
                StringUiText stringUiText14 = vch0.a;
                uiTextA = ygh.a(R.string.page_loyalty__x_pick, new StringUiText("1"));
            }
            ResourceUiText resourceUiText6 = (z && rvkVar == rvk.b) ? new ResourceUiText(R.string.app_common__date_begin_end, ay0.S(new Object[]{bwf0.o((6 & 4) != 0 ? 0 : 1, eikVar.h, false), bwf0.o((6 & 4) != 0 ? 0 : 1, j, false)})) : new ResourceUiText(R.string.component_coupon__expires_vtime, ay0.S(new Object[]{bwf0.o((6 & 4) != 0 ? 0 : 1, j, false)}));
            int iOrdinal4 = awkVar2.ordinal();
            if (iOrdinal4 == 0) {
                resourceUiText2 = vch0.a;
            } else if (iOrdinal4 == 1) {
                resourceUiText2 = new ResourceUiText(R.string.common_functions__cash_gift);
            } else if (iOrdinal4 == 2) {
                resourceUiText2 = new ResourceUiText(R.string.common_functions__discount_gift);
            } else if (iOrdinal4 == 3) {
                resourceUiText2 = new ResourceUiText(R.string.common_functions__free_bet_gift);
            } else if (iOrdinal4 == 4) {
                resourceUiText2 = new ResourceUiText(R.string.gift__lucky_wheel_tickets);
            } else {
                if (iOrdinal4 != 5) {
                    uhc.a();
                    return zskVar;
                }
                resourceUiText2 = new ResourceUiText(R.string.gift__betslip_theme_pick);
            }
            ArrayList arrayList4 = eikVar.k;
            Object objA2 = arrayList4.size() != 1 ? zskVar : d04.a((c04) arrayList4.get(0));
            String str8 = eikVar.d;
            String str9 = eikVar.e;
            boolean z8 = !(str9 == null || StringsKt.U(str9));
            UiText uiText = resourceUiText2;
            int iOrdinal5 = rvkVar.ordinal();
            if (iOrdinal5 == 1) {
                resourceUiText3 = new ResourceUiText(R.string.common_functions__upcoming);
            } else if (iOrdinal5 == 2) {
                resourceUiText3 = eikVar.l ? new ResourceUiText(R.string.gift__claim) : new ResourceUiText(R.string.gift__use);
            } else if (iOrdinal5 == 3) {
                resourceUiText3 = new ResourceUiText(R.string.gift__used);
            } else if (iOrdinal5 != 4) {
                resourceUiText3 = vch0.a;
            } else {
                resourceUiText3 = j3 == j2 ? new ResourceUiText(R.string.gift__expired) : new ResourceUiText(R.string.gift__used);
            }
            boolean z9 = z && rvkVar == rvk.c;
            ResourceUiText resourceUiText7 = resourceUiText6;
            rvk rvkVar2 = rvk.b;
            int i12 = R.color.text_disable_type1_primary;
            if (rvkVar == rvkVar2 && z) {
                iA = njkVar.a(awkVar2);
            } else {
                if (z) {
                    iA = pjkVarC.c;
                } else {
                    i = R.color.text_type2_primary;
                    iA = R.color.text_disable_type1_primary;
                }
                yik yikVar = new yik(iA, i, resourceUiText3, z9);
                int iD = d(awkVar2, z, z2);
                ?? ValueOf = ((z || !z2) && z) ? Integer.valueOf(i9) : zskVar;
                if (z) {
                    i2 = R.drawable.iwqk_gift_bottom;
                } else {
                    i2 = R.drawable.iwqk_expired_gift_bottom;
                }
                int i13 = i2;
                if (z) {
                    i12 = R.color.brand_tertiary;
                }
                int i14 = i12;
                i3 = pjkVarC.b;
                if (z) {
                    i4 = i3;
                } else {
                    i4 = i9;
                }
                int i15 = pjkVarC.a;
                if (z || !z2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                arrayList3.add(new wok.b(strA2, new fok(str7, awkVar2, r22, str6, uiTextA, resourceUiText7, uiText, objA2, str8, str9, z8, yikVar, iD, ValueOf, i13, i14, i3, i4, i15, z3, eikVar)));
                arrayList2 = arrayList;
                str3 = str2;
                z4 = z;
                resourceUiText = resourceUiText5;
                size = i8;
                strA = str5;
                i6 = i7;
                bVar = bVar;
                uiTextC = uiTextC;
                iB = i11;
                z5 = z6;
            }
            i = i10;
            yik yikVar2 = new yik(iA, i, resourceUiText3, z9);
            int iD2 = d(awkVar2, z, z2);
            if (z) {
            }
            if (z) {
                i2 = R.drawable.iwqk_gift_bottom;
            } else {
                i2 = R.drawable.iwqk_expired_gift_bottom;
            }
            int i16 = i2;
            if (z) {
                i12 = R.color.brand_tertiary;
            }
            int i17 = i12;
            i3 = pjkVarC.b;
            if (z) {
                i4 = i3;
            } else {
                i4 = i9;
            }
            int i18 = pjkVarC.a;
            if (z) {
                z3 = false;
            } else {
                z3 = false;
            }
            arrayList3.add(new wok.b(strA2, new fok(str7, awkVar2, r22, str6, uiTextA, resourceUiText7, uiText, objA2, str8, str9, z8, yikVar2, iD2, ValueOf, i16, i17, i3, i4, i18, z3, eikVar)));
            arrayList2 = arrayList;
            str3 = str2;
            z4 = z;
            resourceUiText = resourceUiText5;
            size = i8;
            strA = str5;
            i6 = i7;
            bVar = bVar;
            uiTextC = uiTextC;
            iB = i11;
            z5 = z6;
        }
        return new zsk(strA, bVar, uiTextC, iB, resourceUiText, z5, arrayList3);
    }
}
