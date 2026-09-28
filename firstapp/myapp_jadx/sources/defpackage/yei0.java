package defpackage;

import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class yei0 extends x1 {
    public final mpe0 b = hwr.b(new xei0());

    @Override // defpackage.mfb0
    public final String a() {
        return "https://s.sporty.net/ke/main/res/2a88ff6e8d9029b417804d0c68da4544.png";
    }

    @Override // defpackage.mfb0
    public final UiText c() {
        if (a8b.c().a == CountryCodeName.SOUTH_AFRICA) {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.common_sports__vfootball__ZA);
        }
        StringUiText stringUiText2 = vch0.a;
        return new ResourceUiText(R.string.common_sports__vfootball);
    }

    @Override // defpackage.mfb0
    public final boolean g(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == 1761) {
            return str.equals("78");
        }
        if (iHashCode == 1762) {
            return str.equals("79");
        }
        if (iHashCode == 48722) {
            return str.equals("134");
        }
        if (iHashCode == 48877) {
            return str.equals("184");
        }
        switch (iHashCode) {
            case 1634:
                return str.equals(BuildConfig.VERSION_CODE);
            case 1635:
                return str.equals("36");
            case 1636:
                return str.equals("37");
            default:
                switch (iHashCode) {
                    case 52593:
                        return str.equals("540");
                    case 52594:
                        return str.equals("541");
                    case 52595:
                        return str.equals("542");
                    case 52596:
                        return str.equals("543");
                    case 52597:
                        return str.equals("544");
                    case 52598:
                        return str.equals("545");
                    case 52599:
                        return str.equals("546");
                    case 52600:
                        return str.equals("547");
                    default:
                        return false;
                }
        }
    }

    @Override // defpackage.mfb0
    public final String getId() {
        return "sr:sport:202120001";
    }

    @Override // defpackage.mfb0
    public final boolean i(String str) {
        str.getClass();
        return Intrinsics.g(str, "66") || Intrinsics.g(str, "88");
    }

    @Override // defpackage.x1, defpackage.mfb0
    public final float l() {
        return 0.5988372f;
    }

    @Override // defpackage.mfb0
    public final boolean m(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == 1573) {
            return str.equals("16");
        }
        if (iHashCode != 48816) {
            return iHashCode == 48848 && str.equals("176");
        }
        return str.equals("165");
    }

    @Override // defpackage.mfb0
    public final RegularMarketRule n() {
        return (RegularMarketRule) CollectionsKt.firstOrNull((List) this.b.getValue());
    }

    @Override // defpackage.mfb0
    public final boolean o(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == 1727) {
            return str.equals("65");
        }
        if (iHashCode == 1753) {
            return str.equals("70");
        }
        if (iHashCode == 48782) {
            return str.equals("152");
        }
        if (iHashCode == 1730) {
            return str.equals("68");
        }
        if (iHashCode == 1731) {
            return str.equals("69");
        }
        switch (iHashCode) {
            case 1815:
                return str.equals("90");
            case 1816:
                return str.equals("91");
            case 1817:
                return str.equals("92");
            default:
                return false;
        }
    }

    @Override // defpackage.x1, defpackage.mfb0
    public final String p(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{":"}, false, 0, 6, null);
            if (listSplit$default.isEmpty()) {
                sb.append(str);
            } else {
                sb.append(listSplit$default.get(0) + "'");
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    @Override // defpackage.mfb0
    public final boolean q(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == 54608) {
            return str.equals("770");
        }
        switch (iHashCode) {
            case 54613:
                return str.equals("775");
            case 54614:
                return str.equals("776");
            case 54615:
                return str.equals("777");
            default:
                return false;
        }
    }

    @Override // defpackage.mfb0
    public final boolean r(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == 1665) {
            return str.equals("45");
        }
        if (iHashCode != 1785) {
            return iHashCode == 1823 && str.equals(CashoutMetricsPayload.Metric.KeyValueMap.FE_FORMULA_UNKNOWN);
        }
        return str.equals("81");
    }

    @Override // defpackage.mfb0
    public final List<RegularMarketRule> v() {
        return (List) this.b.getValue();
    }

    @Override // defpackage.mfb0
    public final boolean w(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case 1571:
                return str.equals("14");
            case 1575:
                return str.equals("18");
            case 1576:
                return str.equals("19");
            case 1598:
                return str.equals("20");
            case 1791:
                return str.equals("87");
            case 48727:
                return str.equals("139");
            case 48749:
                return str.equals("140");
            case 48750:
                return str.equals("141");
            case 48817:
                return str.equals("166");
            case 48818:
                return str.equals("167");
            case 48819:
                return str.equals("168");
            case 48849:
                return str.equals("177");
            case 49653:
                return str.equals("225");
            default:
                return false;
        }
    }

    @Override // defpackage.mfb0
    public final boolean z(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == 1637) {
            return str.equals("38");
        }
        if (iHashCode != 1638) {
            return iHashCode == 1660 && str.equals("40");
        }
        return str.equals("39");
    }
}
