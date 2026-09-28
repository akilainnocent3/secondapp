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
public final class xif extends x1 {
    public final mpe0 b = hwr.b(new wif());

    @Override // defpackage.mfb0
    public final String a() {
        return "https://s.sporty.net/ke/main/res/4adb494b31cf3fc04e5f492e85c76ca6.png";
    }

    @Override // defpackage.mfb0
    public final UiText c() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_sports__eice_hockey);
    }

    @Override // defpackage.mfb0
    public final boolean g(String str) {
        str.getClass();
        return false;
    }

    @Override // defpackage.mfb0
    public final String getId() {
        return "sr:sport:195";
    }

    @Override // defpackage.mfb0
    public final boolean i(String str) {
        str.getClass();
        return Intrinsics.g(str, "460");
    }

    @Override // defpackage.mfb0
    public final boolean m(String str) {
        str.getClass();
        return Intrinsics.g(str, "16") || Intrinsics.g(str, "410");
    }

    @Override // defpackage.mfb0
    public final RegularMarketRule n() {
        return (RegularMarketRule) CollectionsKt.firstOrNull((List) this.b.getValue());
    }

    @Override // defpackage.mfb0
    public final boolean o(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case 51637:
                return str.equals("445");
            case 51638:
                return str.equals("446");
            case 51639:
                return str.equals("447");
            case 51640:
                return str.equals("448");
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
            case 51516:
                return str.equals("408");
            case 51541:
                return str.equals("412");
            case 51543:
                return str.equals("414");
            case 51544:
                return str.equals("415");
            default:
                return false;
        }
    }
}
