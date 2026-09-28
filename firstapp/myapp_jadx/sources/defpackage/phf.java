package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class phf extends x1 {
    public final mpe0 b = hwr.b(new ohf());

    @Override // defpackage.mfb0
    public final String a() {
        return "https://s.sporty.net/ke/main/res/957ddb82a42ff022221ad21d436ad98d.png";
    }

    @Override // defpackage.mfb0
    public final UiText c() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_sports__ebasketball);
    }

    @Override // defpackage.x1, defpackage.mfb0
    public final String f(String str, String str2, String str3) {
        return super.f(str2, str2, str3);
    }

    @Override // defpackage.mfb0
    public final boolean g(String str) {
        str.getClass();
        return Intrinsics.g(str, "292");
    }

    @Override // defpackage.mfb0
    public final String getId() {
        return "sr:sport:153";
    }

    @Override // defpackage.mfb0
    public final boolean i(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == 1728) {
            return str.equals("66");
        }
        if (iHashCode == 1792) {
            return str.equals("88");
        }
        if (iHashCode != 49680) {
            return iHashCode == 50550 && str.equals("303");
        }
        return str.equals("231");
    }

    @Override // defpackage.mfb0
    public final boolean m(String str) {
        str.getClass();
        return Intrinsics.g(str, "16") || Intrinsics.g(str, "223");
    }

    @Override // defpackage.mfb0
    public final RegularMarketRule n() {
        return (RegularMarketRule) CollectionsKt.firstOrNull((List) this.b.getValue());
    }

    @Override // defpackage.mfb0
    public final boolean o(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == 1730) {
            return str.equals("68");
        }
        if (iHashCode == 1731) {
            return str.equals("69");
        }
        if (iHashCode == 1753) {
            return str.equals("70");
        }
        if (iHashCode == 1815) {
            return str.equals("90");
        }
        if (iHashCode != 49681) {
            return iHashCode == 49685 && str.equals("236");
        }
        return str.equals("232");
    }

    @Override // defpackage.x1, defpackage.mfb0
    public final String p(String str, String str2, String str3) {
        return super.p(str2, str2, str3);
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
            case 49653:
                return str.equals("225");
            case 49655:
                return str.equals("227");
            case 49656:
                return str.equals("228");
            case 49872:
                return str.equals("297");
            default:
                return false;
        }
    }
}
