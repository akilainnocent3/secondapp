package defpackage;

import com.appsflyer.oaid.BuildConfig;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class x9i extends x1 {
    public final psm b;
    public final mpe0 c;

    public x9i(psm psmVar) {
        psmVar.getClass();
        this.b = psmVar;
        this.c = hwr.b(new w9i());
    }

    @Override // defpackage.mfb0
    public final String a() {
        return "https://s.sporty.net/ke/main/res/30e05958c7eb27e95e4b5425de3f0e04.png";
    }

    @Override // defpackage.mfb0
    public final UiText c() {
        if (this.b.getCountryCode() == CountryCodeName.SOUTH_AFRICA) {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.common_sports__football__ZA);
        }
        StringUiText stringUiText2 = vch0.a;
        return new ResourceUiText(R.string.common_sports__football);
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
        return "sr:sport:1";
    }

    @Override // defpackage.mfb0
    public final boolean i(String str) {
        str.getClass();
        return Intrinsics.g(str, "66") || Intrinsics.g(str, "88");
    }

    @Override // defpackage.x1, defpackage.mfb0
    public final float l() {
        return 0.9611111f;
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
        return (RegularMarketRule) CollectionsKt.firstOrNull((List) this.c.getValue());
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

    @Override // defpackage.mfb0
    public final boolean q(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == 54608) {
            return str.equals("770");
        }
        if (iHashCode == 54639) {
            return str.equals("780");
        }
        if (iHashCode == 1649041299) {
            return str.equals("800292");
        }
        switch (iHashCode) {
            case 54613:
                return str.equals("775");
            case 54614:
                return str.equals("776");
            case 54615:
                return str.equals("777");
            case 54616:
                return str.equals("778");
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
        return (List) this.c.getValue();
    }

    @Override // defpackage.mfb0
    public final boolean z(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case 1637:
                return str.equals("38");
            case 1638:
                return str.equals("39");
            case 1660:
                return str.equals("40");
            case 1649040096:
                return str.equals("800118");
            case 1649040097:
                return str.equals("800119");
            case 1649040314:
                return str.equals("800189");
            case 1649040336:
                return str.equals("800190");
            case 1649040337:
                return str.equals("800191");
            case 1649041117:
                return str.equals("800236");
            case 1649041118:
                return str.equals("800237");
            case 1649041119:
                return str.equals("800238");
            case 1649041120:
                return str.equals("800239");
            case 1649041151:
                return str.equals("800249");
            case 1649041174:
                return str.equals("800251");
            case 1649041303:
                return str.equals("800296");
            default:
                return false;
        }
    }

    @Override // defpackage.mfb0
    public final boolean w(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case 1571:
                if (!str.equals("14")) {
                    return false;
                }
                return true;
            case 1575:
                if (!str.equals("18")) {
                    return false;
                }
                return true;
            case 1576:
                if (!str.equals("19")) {
                    return false;
                }
                return true;
            case 1598:
                if (!str.equals("20")) {
                    return false;
                }
                return true;
            case 1791:
                if (!str.equals("87")) {
                    return false;
                }
                return true;
            case 48726:
                if (!str.equals("138")) {
                    return false;
                }
                return true;
            case 48727:
                if (!str.equals("139")) {
                    return false;
                }
                return true;
            case 48749:
                if (!str.equals("140")) {
                    return false;
                }
                return true;
            case 48750:
                if (!str.equals("141")) {
                    return false;
                }
                return true;
            case 48781:
                if (!str.equals("151")) {
                    return false;
                }
                return true;
            case 48817:
                if (!str.equals("166")) {
                    return false;
                }
                return true;
            case 48818:
                if (!str.equals("167")) {
                    return false;
                }
                return true;
            case 48819:
                if (!str.equals("168")) {
                    return false;
                }
                return true;
            case 48849:
                if (!str.equals("177")) {
                    return false;
                }
                return true;
            case 49653:
                if (!str.equals("225")) {
                    return false;
                }
                return true;
            case 51348975:
                if (!str.equals("60180")) {
                    return false;
                }
                return true;
            case 1677671130:
                if (!str.equals("900300")) {
                    return false;
                }
                return true;
            case 1677671131:
                if (!str.equals("900301")) {
                    return false;
                }
                return true;
            case 1677671132:
                if (!str.equals("900302")) {
                    return false;
                }
                return true;
            case 1677671133:
                if (!str.equals("900303")) {
                    return false;
                }
                return true;
            case 1677671134:
                if (!str.equals("900304")) {
                    return false;
                }
                return true;
            case 1677671135:
                if (!str.equals("900305")) {
                    return false;
                }
                return true;
            case 1677671136:
                if (!str.equals("900306")) {
                    return false;
                }
                return true;
            case 1677671137:
                if (!str.equals("900307")) {
                    return false;
                }
                return true;
            case 1677671256:
                if (!str.equals("900342")) {
                    return false;
                }
                return true;
            case 1677671412:
                if (!str.equals("900393")) {
                    return false;
                }
                return true;
            case 1677671413:
                if (!str.equals("900394")) {
                    return false;
                }
                return true;
            case 1677671415:
                if (!str.equals("900396")) {
                    return false;
                }
                return true;
            case 1677673177:
                if (!str.equals("900541")) {
                    return false;
                }
                return true;
            case 1677673180:
                if (!str.equals("900544")) {
                    return false;
                }
                return true;
            case 1677673181:
                if (!str.equals("900545")) {
                    return false;
                }
                return true;
            case 1677673182:
                if (!str.equals("900546")) {
                    return false;
                }
                return true;
            case 1677673183:
                if (!str.equals("900547")) {
                    return false;
                }
                return true;
            case 1677673207:
                if (!str.equals("900550")) {
                    return false;
                }
                return true;
            case 1677673209:
                if (!str.equals("900552")) {
                    return false;
                }
                return true;
            case 1677673210:
                if (!str.equals("900553")) {
                    return false;
                }
                return true;
            case 1677673213:
                if (!str.equals("900556")) {
                    return false;
                }
                return true;
            case 1677673246:
                if (!str.equals("900568")) {
                    return false;
                }
                return true;
            case 1677673247:
                if (!str.equals("900569")) {
                    return false;
                }
                return true;
            case 1677673300:
                if (!str.equals("900580")) {
                    return false;
                }
                return true;
            case 1677674022:
                if (!str.equals("900609")) {
                    return false;
                }
                return true;
            case 1677674048:
                if (!str.equals("900614")) {
                    return false;
                }
                return true;
            case 1677674049:
                if (!str.equals("900615")) {
                    return false;
                }
                return true;
            case 1677674050:
                if (!str.equals("900616")) {
                    return false;
                }
                return true;
            case 1677674077:
                if (!str.equals("900622")) {
                    return false;
                }
                return true;
            case 1677674078:
                if (!str.equals("900623")) {
                    return false;
                }
                return true;
            case 1677674079:
                if (!str.equals("900624")) {
                    return false;
                }
                return true;
            case 1677674080:
                if (!str.equals("900625")) {
                    return false;
                }
                return true;
            case 1677674081:
                if (!str.equals("900626")) {
                    return false;
                }
                return true;
            case 1677674109:
                if (!str.equals(lTGEJfVytU.Phwc)) {
                    return false;
                }
                return true;
            case 1677674110:
                if (!str.equals("900634")) {
                    return false;
                }
                return true;
            case 1677674114:
                if (!str.equals("900638")) {
                    return false;
                }
                return true;
            case 1677674115:
                if (!str.equals("900639")) {
                    return false;
                }
                return true;
            case 1677674172:
                if (!str.equals("900654")) {
                    return false;
                }
                return true;
            case 1677674173:
                if (!str.equals("900655")) {
                    return false;
                }
                return true;
            case 1677674200:
                if (!str.equals("900661")) {
                    return false;
                }
                return true;
            case 1677674208:
                if (!str.equals("900669")) {
                    return false;
                }
                return true;
            case 1677674234:
                if (!str.equals("900674")) {
                    return false;
                }
                return true;
            case 1677674235:
                if (!str.equals("900675")) {
                    return false;
                }
                return true;
            case 1677674238:
                if (!str.equals("900678")) {
                    return false;
                }
                return true;
            case 1677674239:
                if (!str.equals("900679")) {
                    return false;
                }
                return true;
            case 1677674267:
                if (!str.equals("900686")) {
                    return false;
                }
                return true;
            case 1677674268:
                if (!str.equals("900687")) {
                    return false;
                }
                return true;
            case 1677675169:
                if (!str.equals("900769")) {
                    return false;
                }
                return true;
            case 1677675199:
                if (!str.equals("900778")) {
                    return false;
                }
                return true;
            case 1677675200:
                if (!str.equals("900779")) {
                    return false;
                }
                return true;
            case 1677675224:
                if (!str.equals("900782")) {
                    return false;
                }
                return true;
            case 1677675258:
                if (!str.equals("900795")) {
                    return false;
                }
                return true;
            case 1677675259:
                if (!str.equals("900796")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }
}
