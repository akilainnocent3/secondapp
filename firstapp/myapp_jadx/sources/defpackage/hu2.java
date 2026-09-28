package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import com.sporty.android.core.model.gift.GiftUtil;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import com.sportybet.plugin.realsports.data.BetSlipInfo;
import com.sportybet.plugin.realsports.data.FooterInfo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hu2 {
    public final lrm a;
    public final krm b;
    public final q8k c;
    public final p8k d;
    public final y8k e;
    public final ynh f;
    public final nzm g;
    public final BigDecimal h = new BigDecimal(-1);
    public final Handler i = new Handler(Looper.myLooper());

    public hu2(lrm lrmVar, krm krmVar, q8k q8kVar, p8k p8kVar, y8k y8kVar, ynh ynhVar, nzm nzmVar) {
        this.a = lrmVar;
        this.b = krmVar;
        this.c = q8kVar;
        this.d = p8kVar;
        this.e = y8kVar;
        this.f = ynhVar;
        this.g = nzmVar;
    }

    public static String d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = bigDecimal.setScale(2, roundingMode);
        BigDecimal scale2 = bigDecimal2.setScale(2, roundingMode);
        if (scale.compareTo(scale2) >= 0) {
            return gky.a.a(bjb0.L(scale2, Locale.US), false);
        }
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.US;
        sb.append(gky.a.a(bjb0.L(scale, locale), false));
        sb.append(sn5.b(yrh0.j(), R.string.app_common__tilde, new Object[0]));
        sb.append(gky.a.a(bjb0.L(scale2, locale), false));
        return sb.toString();
    }

    public static UiText g(up3 up3Var, String str, boolean z) {
        if (TextUtils.isEmpty(up3Var.c)) {
            if (z) {
                return null;
            }
            int i = up3Var.b;
            if (i <= 0) {
                StringUiText stringUiText = vch0.a;
                return new ColoredUiText(new ResourceUiText(R.string.component_coupon__gifts_none), Integer.valueOf(R.color.text_type1_primary), null);
            }
            Object[] objArr = {String.valueOf(i)};
            StringUiText stringUiText2 = vch0.a;
            return new ColoredUiText(new ResourceUiText(R.string.component_coupon__use_gifts_with_num, ay0.S(objArr)), Integer.valueOf(R.color.custom_text_type1_primary_type1), null);
        }
        if (up3Var.c.contains(GiftUtil.CLEARED_GIFT_VALUE)) {
            StringUiText stringUiText3 = vch0.a;
            return new ResourceUiText(R.string.common_functions__unused);
        }
        String strReplace = up3Var.c.replace(",", "");
        if (!TextUtils.isEmpty(str)) {
            String strReplace2 = str.replace(",", "");
            if (Double.parseDouble(strReplace) > Double.parseDouble(strReplace2)) {
                strReplace = strReplace2;
            }
        }
        UiText uiTextE = qz3.e(up3Var.e);
        String str2 = ", " + a8b.e() + " -" + String.format(Locale.US, "%,.2f", Double.valueOf(Double.parseDouble(strReplace)));
        StringUiText stringUiText4 = vch0.a;
        return uiTextE.h(new StringUiText(str2));
    }

    public static BetSlipInfo i(TaxConfigs taxConfigs, boolean z, long j, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        String strL;
        String strL2;
        Locale locale = Locale.US;
        BigDecimal bigDecimalMultiply = bigDecimal4.multiply(new BigDecimal(j));
        BigDecimal tax = taxConfigs.getTax(z, bigDecimal, bigDecimalMultiply);
        BigDecimal tax2 = taxConfigs.getTax(z, bigDecimal3, bigDecimalMultiply);
        BigDecimal netWin = taxConfigs.getNetWin(z, bigDecimal, bigDecimalMultiply);
        BigDecimal netWin2 = taxConfigs.getNetWin(z, bigDecimal3, bigDecimalMultiply);
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            strL = bjb0.L(tax2.multiply(new BigDecimal(-1)), locale);
        } else {
            strL = bjb0.L(tax.multiply(new BigDecimal(-1)), locale) + sn5.b(yrh0.j(), R.string.app_common__tilde, new Object[0]) + bjb0.L(tax2.multiply(new BigDecimal(-1)), locale);
        }
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            strL2 = bjb0.L(netWin2, locale);
        } else {
            strL2 = bjb0.L(netWin, locale) + sn5.b(yrh0.j(), R.string.app_common__tilde, new Object[0]) + bjb0.L(netWin2, locale);
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.g("[getMultipleWHTaxAndNetWin] maxPWTax = %s", tax2);
        aVar.q(MyLog.TAG_COMMON);
        aVar.g("[getMultipleWHTaxAndNetWin] type = " + taxConfigs.getType(z) + ", wh tax =" + strL + ", net win =" + strL2 + ", stake =" + bigDecimalMultiply, new Object[0]);
        return new BetSlipInfo(2, strL2, strL, bigDecimal3, bigDecimal4, bigDecimal, bigDecimal2, taxConfigs.hasRate(z));
    }

    public static FooterInfo k(boolean z, boolean z2, boolean z3, BigDecimal bigDecimal, CharSequence charSequence, String str) {
        FooterInfo footerInfo = new FooterInfo();
        footerInfo.setExistBonus(z);
        footerInfo.setBonusEnable(z2);
        footerInfo.setBonusActivated(z3);
        footerInfo.setExistBonus(false);
        footerInfo.setBonusEnable(false);
        footerInfo.setBonusActivated(false);
        footerInfo.setBonus(BigDecimal.ZERO);
        return footerInfo;
    }

    public final BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        List<BigDecimal> listC = this.b.c();
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        for (BigDecimal bigDecimal3 : listC) {
            if (bigDecimal3.compareTo(bigDecimal2) >= 0) {
                bigDecimalAdd = bigDecimalAdd.add(bigDecimal3);
            }
        }
        return bigDecimal.multiply(bigDecimalAdd).setScale(2, RoundingMode.HALF_UP);
    }

    public final BigDecimal b(TaxConfig taxConfig, BigDecimal bigDecimal, boolean z) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.g("[One Cut] checkTaxForStillingWin, stillWinning =%s", bigDecimal);
        if (taxConfig.hasRate()) {
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            lrm lrmVar = this.a;
            if (!TextUtils.isEmpty(lrmVar.d0().a)) {
                bigDecimal2 = new BigDecimal(lrmVar.d0().a);
            }
            if (z || bigDecimal.compareTo(bigDecimal2) > 0) {
                BigDecimal netWin = taxConfig.getNetWin(bigDecimal, bigDecimal2);
                aVar.q(MyLog.TAG_COMMON);
                aVar.g("[One Cut] checkTaxForStillingWin, has tax showStillWinning =%s", netWin);
                return netWin;
            }
        }
        return bigDecimal;
    }

    public final BetSlipInfo c(BigDecimal bigDecimal, BigDecimal bigDecimal2, TaxConfigs taxConfigs, boolean z, long j) {
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        lrm lrmVar = this.a;
        BigDecimal bigDecimal4 = !TextUtils.isEmpty(lrmVar.d0().a) ? new BigDecimal(lrmVar.d0().a) : bigDecimal3;
        BigDecimal bigDecimalH = h(bigDecimal4);
        BigDecimal bigDecimalH2 = h(bigDecimal4);
        boolean zEquals = bigDecimal3.equals(bigDecimal2);
        q8k q8kVar = this.c;
        if (!zEquals) {
            bigDecimalH2 = bigDecimalH.add(bigDecimal2).min(q8kVar.a());
        }
        BigDecimal bigDecimal5 = bigDecimalH2;
        krm krmVar = this.b;
        BigDecimal bigDecimalMin = bigDecimal4.multiply(krmVar.j()).min(q8kVar.a());
        if (!bigDecimal3.equals(bigDecimal)) {
            bigDecimalMin = bigDecimalMin.add(bigDecimal).min(q8kVar.a());
        }
        BetSlipInfo betSlipInfoI = i(taxConfigs, z, j, bigDecimalMin, bigDecimalH, bigDecimal5, bigDecimal4);
        betSlipInfoI.setTotalOdds(d(krmVar.j(), krmVar.M()));
        BigDecimal bigDecimalJ = krmVar.j();
        BigDecimal bigDecimalM = krmVar.M();
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = bigDecimalJ.setScale(8, roundingMode);
        BigDecimal scale2 = bigDecimalM.setScale(8, roundingMode);
        betSlipInfoI.setTotalOddsForGiftDialog(scale.compareTo(scale2) >= 0 ? scale2.toString() : scale.toString());
        betSlipInfoI.setNoRoundTotalOdds(krmVar.M());
        if (kni0.l()) {
            betSlipInfoI.setTotalOdds("-");
        }
        return betSlipInfoI;
    }

    public final imn e() {
        imn imnVarD0 = this.a.d0();
        if (!imnVarD0.a.isEmpty() && new BigDecimal(imnVarD0.a).compareTo(this.d.a()) <= 0 && new BigDecimal(imnVarD0.a).compareTo(this.e.a()) >= 0) {
            imnVarD0.b = "";
        }
        return imnVarD0;
    }

    public final BigDecimal h(BigDecimal bigDecimal) {
        return bigDecimal.multiply(this.b.M()).min(this.c.a());
    }

    public final BetSlipInfo j(TaxConfigs taxConfigs, Boolean bool, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5) {
        String strL;
        String strL2;
        BigDecimal bigDecimal6 = bigDecimal.compareTo(bigDecimal2) == 0 ? bigDecimal5 : bigDecimal4;
        BigDecimal tax = taxConfigs.getTax(bool.booleanValue(), bigDecimal, bigDecimal6);
        BigDecimal bigDecimalAdd = taxConfigs.getTax(bool.booleanValue(), bigDecimal2, bigDecimal5).add(bigDecimal3);
        BigDecimal bigDecimal7 = this.h;
        BigDecimal bigDecimalMultiply = bigDecimalAdd.multiply(bigDecimal7);
        Locale locale = Locale.US;
        String strL3 = bjb0.L(bigDecimalMultiply, locale);
        BigDecimal netWin = taxConfigs.getNetWin(bool.booleanValue(), bigDecimal, bigDecimal6);
        String strL4 = bjb0.L(taxConfigs.getNetWin(bool.booleanValue(), bigDecimal2, bigDecimal5).add(bigDecimal3).multiply(bigDecimal7), locale);
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            strL = bjb0.L(tax.add(bigDecimal3).multiply(bigDecimal7), locale);
        } else {
            strL = bjb0.L(tax.multiply(bigDecimal7), locale) + sn5.b(yrh0.j(), R.string.app_common__tilde, new Object[0]) + strL3;
        }
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            strL2 = bjb0.L(netWin.add(bigDecimal3), locale);
        } else {
            strL2 = bjb0.L(netWin, locale) + sn5.b(yrh0.j(), R.string.app_common__tilde, new Object[0]) + strL4;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.g("[getSingleFooterWHTaxAndNetWin] type = " + taxConfigs.getType(bool.booleanValue()) + ", wh tax =" + strL + ", net win =" + strL2 + ", min stake" + bigDecimal6 + ", max stake =" + bigDecimal5, new Object[0]);
        if (this.b.P()) {
            return new BetSlipInfo(1, strL2, strL4, strL, strL3, taxConfigs.hasRate(bool.booleanValue()));
        }
        return new BetSlipInfo(1, strL2, strL, taxConfigs.hasRate(bool.booleanValue()));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d4  */
    public final BetSlipInfo l(TaxConfig taxConfig, BigDecimal bigDecimal) {
        String str;
        String strL;
        Locale locale = Locale.US;
        lrm lrmVar = this.a;
        double dA = lrmVar.a();
        q8k q8kVar = this.c;
        BigDecimal bigDecimalA = q8kVar.a();
        BigDecimal scale = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_UP);
        krm krmVar = this.b;
        Iterator<BigDecimal> it = krmVar.l().values().iterator();
        while (it.hasNext()) {
            scale = scale.add(it.next());
        }
        String key = "";
        boolean z = false;
        for (Map.Entry<String, BigDecimal> entry : krmVar.q().entrySet()) {
            if (!entry.getValue().equals(BigDecimal.ZERO) && entry.getValue().subtract(bigDecimalA).signum() < 0) {
                z = true;
                key = entry.getKey();
                bigDecimalA = entry.getValue();
            }
        }
        BigDecimal bigDecimalMin = z ? bigDecimalA.min(q8kVar.a()) : BigDecimal.ZERO.setScale(2, RoundingMode.HALF_UP);
        BigDecimal bigDecimalMin2 = scale.min(q8kVar.a());
        BigDecimal bigDecimalMin3 = !BigDecimal.ZERO.equals(bigDecimal) ? bigDecimalMin2.add(bigDecimal).min(q8kVar.a()) : bigDecimalMin2;
        imn imnVar = (imn) lrmVar.u().get(key);
        if (imnVar != null) {
            String str2 = imnVar.a;
            AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
            if (str2.matches("-?\\d+(\\.\\d+)?")) {
                str = imnVar.a;
            } else {
                str = "0";
            }
        } else {
            str = "0";
        }
        BigDecimal bigDecimal2 = new BigDecimal(str);
        BigDecimal bigDecimal3 = new BigDecimal(dA);
        BigDecimal tax = taxConfig.getTax(bigDecimalMin, bigDecimal2);
        BigDecimal tax2 = taxConfig.getTax(bigDecimalMin3, bigDecimal3);
        BigDecimal netWin = taxConfig.getNetWin(bigDecimalMin, bigDecimal2);
        BigDecimal netWin2 = taxConfig.getNetWin(bigDecimalMin3, bigDecimal3);
        if (bigDecimalMin.compareTo(bigDecimalMin2) >= 0) {
            strL = bjb0.L(tax2.multiply(new BigDecimal(-1)), Locale.US);
        } else {
            BigDecimal bigDecimalMultiply = tax.multiply(new BigDecimal(-1));
            Locale locale2 = Locale.US;
            strL = bjb0.L(bigDecimalMultiply, locale2) + sn5.b(yrh0.j(), R.string.app_common__tilde, new Object[0]) + bjb0.L(tax2.multiply(new BigDecimal(-1)), locale2);
        }
        String strL2 = bigDecimalMin.compareTo(bigDecimalMin2) >= 0 ? bjb0.L(netWin2, locale) : bjb0.L(netWin, locale) + sn5.b(yrh0.j(), R.string.app_common__tilde, new Object[0]) + bjb0.L(netWin2, locale);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.g("[getSystemFooterWHTaxAndNetWin] type = " + taxConfig.getType() + ", wh tax =" + strL + ", net win =" + strL2 + ", minstake =" + bigDecimal2 + ", maxStake =" + bigDecimal3, new Object[0]);
        return new BetSlipInfo(3, strL2, strL, taxConfig.hasRate());
    }

    public static String f(String str, String str2, String str3) {
        itf0.a aVar = itf0.a;
        StringBuilder sbA = ce7.a(aVar, MyLog.TAG_COMMON, "[getFullWinningAmount] wh tax =", str, siPCzPFw.NeK);
        sbA.append(str2);
        aVar.g(sbA.toString(), new Object[0]);
        if (str3 != null) {
            try {
                if (str.contains(str3)) {
                    String[] strArrSplit = str.split(str3);
                    BigDecimal bigDecimalA = b6y.a(strArrSplit[0]);
                    BigDecimal bigDecimalA2 = b6y.a(strArrSplit[1]);
                    String[] strArrSplit2 = str2.split(str3);
                    BigDecimal bigDecimalA3 = b6y.a(strArrSplit2[0]);
                    BigDecimal bigDecimalA4 = b6y.a(strArrSplit2[1]);
                    BigDecimal bigDecimalSubtract = bigDecimalA3.subtract(bigDecimalA);
                    BigDecimal bigDecimalSubtract2 = bigDecimalA4.subtract(bigDecimalA2);
                    StringBuilder sb = new StringBuilder();
                    Locale locale = Locale.US;
                    sb.append(bjb0.L(bigDecimalSubtract, locale));
                    sb.append(str3);
                    sb.append(bjb0.L(bigDecimalSubtract2, locale));
                    return sb.toString();
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return bjb0.L(b6y.a(str).multiply(new BigDecimal(-1)).add(b6y.a(str2)), Locale.US);
    }
}
