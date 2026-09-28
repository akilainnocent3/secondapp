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
public final class l160 extends x1 {
    public final mpe0 b = hwr.b(new k160());

    @Override // defpackage.mfb0
    public final String a() {
        return "https://s.sporty.net/ke/main/res/65feb1d7d7b748171cd610d645209bd6.png";
    }

    @Override // defpackage.mfb0
    public final UiText c() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_sports__rugby);
    }

    @Override // defpackage.mfb0
    public final boolean g(String str) {
        str.getClass();
        return Intrinsics.g(str, "37");
    }

    @Override // defpackage.mfb0
    public final String getId() {
        return "sr:sport:12";
    }

    @Override // defpackage.mfb0
    public final boolean i(String str) {
        str.getClass();
        return Intrinsics.g(str, "66") || Intrinsics.g(str, "486");
    }

    @Override // defpackage.x1, defpackage.mfb0
    public final RegularMarketRule j() {
        return (RegularMarketRule) ((List) this.b.getValue()).get(1);
    }

    @Override // defpackage.mfb0
    public final boolean m(String str) {
        str.getClass();
        return Intrinsics.g(str, "16") || Intrinsics.g(str, "477");
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
        if (iHashCode == 51761) {
            return str.equals("485");
        }
        if (iHashCode == 1730) {
            return str.equals("68");
        }
        if (iHashCode == 1731) {
            return str.equals("69");
        }
        switch (iHashCode) {
            case 51763:
                return str.equals("487");
            case 51764:
                return str.equals("488");
            case 51765:
                return str.equals("489");
            default:
                return false;
        }
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
            case 51731:
                return str.equals("476");
            case 51733:
                return str.equals("478");
            case 51734:
                return str.equals("479");
            case 51756:
                return str.equals("480");
            default:
                return false;
        }
    }
}
