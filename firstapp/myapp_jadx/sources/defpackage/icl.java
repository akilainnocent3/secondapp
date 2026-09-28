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
public final class icl extends x1 {
    public final mpe0 b = hwr.b(new hcl(0));

    @Override // defpackage.mfb0
    public final String a() {
        return "https://s.sporty.net/ke/main/res/4821e0c77f0cdb0482fda3bfd62d0a84.png";
    }

    @Override // defpackage.mfb0
    public final UiText c() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_sports__handball);
    }

    @Override // defpackage.mfb0
    public final boolean g(String str) {
        str.getClass();
        return false;
    }

    @Override // defpackage.mfb0
    public final String getId() {
        return "sr:sport:6";
    }

    @Override // defpackage.mfb0
    public final boolean i(String str) {
        str.getClass();
        return Intrinsics.g(str, "66");
    }

    @Override // defpackage.mfb0
    public final boolean m(String str) {
        str.getClass();
        return Intrinsics.g(str, "16");
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
        if (iHashCode != 1730) {
            return iHashCode == 1731 && str.equals("69");
        }
        return str.equals("68");
    }

    @Override // defpackage.mfb0
    public final List<RegularMarketRule> v() {
        return (List) this.b.getValue();
    }

    @Override // defpackage.mfb0
    public final boolean w(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == 1571) {
            return str.equals("14");
        }
        if (iHashCode == 1598) {
            return str.equals("20");
        }
        if (iHashCode != 1575) {
            return iHashCode == 1576 && str.equals("19");
        }
        return str.equals("18");
    }
}
