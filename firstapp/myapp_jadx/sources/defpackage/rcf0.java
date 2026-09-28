package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class rcf0 extends x1 {
    public final mpe0 b = hwr.b(new qcf0());

    @Override // defpackage.x1, defpackage.mfb0
    public final ArrayList A(String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        x1.B(str, arrayList);
        if (list != null && !list.isEmpty()) {
            x1.B((String) uts.a(1, list), arrayList);
        }
        x1.B(str2, arrayList);
        return arrayList;
    }

    @Override // defpackage.mfb0
    public final String a() {
        return "https://s.sporty.net/ke/main/res/3744d51e6f6645e4ad8f91e7e07f29f.png";
    }

    @Override // defpackage.mfb0
    public final boolean b(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == 49588) {
            return str.equals("202");
        }
        if (iHashCode != 49594) {
            return iHashCode == 49617 && str.equals("210");
        }
        return str.equals("208");
    }

    @Override // defpackage.mfb0
    public final UiText c() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_sports__tennis);
    }

    @Override // defpackage.mfb0
    public final boolean g(String str) {
        str.getClass();
        return false;
    }

    @Override // defpackage.mfb0
    public final String getId() {
        return "sr:sport:5";
    }

    @Override // defpackage.mfb0
    public final boolean i(String str) {
        return false;
    }

    @Override // defpackage.mfb0
    public final boolean m(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case 48880:
                return str.equals("187");
            case 48881:
                return str.equals("188");
            case 49589:
                return str.equals("203");
            default:
                return false;
        }
    }

    @Override // defpackage.mfb0
    public final RegularMarketRule n() {
        return (RegularMarketRule) CollectionsKt.firstOrNull((List) this.b.getValue());
    }

    @Override // defpackage.mfb0
    public final boolean o(String str) {
        str.getClass();
        return Intrinsics.g(str, "204");
    }

    @Override // defpackage.mfb0
    public final List<RegularMarketRule> v() {
        return (List) this.b.getValue();
    }

    @Override // defpackage.mfb0
    public final boolean w(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case 48882:
                return str.equals("189");
            case 48904:
                return str.equals("190");
            case 48905:
                return str.equals("191");
            default:
                return false;
        }
    }

    @Override // defpackage.x1, defpackage.mfb0
    public final String y() {
        return vZBMKENANSz.ThqnpSvuuChMrYM;
    }
}
