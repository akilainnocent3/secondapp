package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class kw extends x1 {
    public final mpe0 b = hwr.b(new jw());

    @Override // defpackage.mfb0
    public final String a() {
        return "https://s.sporty.net/ke/main/res/7d08c982b6afda91e214997929f88b08.png";
    }

    @Override // defpackage.mfb0
    public final UiText c() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_sports__american_football);
    }

    @Override // defpackage.mfb0
    public final boolean g(String str) {
        str.getClass();
        return false;
    }

    @Override // defpackage.mfb0
    public final String getId() {
        return "sr:sport:16";
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
        if (iHashCode != 50550) {
            return iHashCode == 53465 && str.equals("614");
        }
        return str.equals("303");
    }

    @Override // defpackage.mfb0
    public final boolean m(String str) {
        str.getClass();
        return Intrinsics.g(str, "223");
    }

    @Override // defpackage.mfb0
    public final RegularMarketRule n() {
        return (RegularMarketRule) CollectionsKt.firstOrNull((List) this.b.getValue());
    }

    @Override // defpackage.mfb0
    public final List<RegularMarketRule> v() {
        return (List) this.b.getValue();
    }

    @Override // defpackage.mfb0
    public final boolean w(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case 49653:
                return str.equals("225");
            case 49654:
            default:
                return false;
            case 49655:
                return str.equals("227");
            case 49656:
                return str.equals("228");
        }
    }

    @Override // defpackage.mfb0
    public final boolean o(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 1727) {
            if (iHashCode != 1815) {
                if (iHashCode != 49685) {
                    if (iHashCode == 53466 && str.equals("615")) {
                        return true;
                    }
                    return false;
                }
                if (str.equals("236")) {
                    return true;
                }
                return false;
            }
            if (str.equals("90")) {
                return true;
            }
            return false;
        }
        if (str.equals(LGxrN.SlCCpQvJL)) {
            return true;
        }
        return false;
    }
}
