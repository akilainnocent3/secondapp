package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class vye extends x1 {
    public final mpe0 b = hwr.b(new uye());

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
        return "https://s.sporty.net/ke/main/res/f9a564d1c345d63a69e7135bb392dbf3.png";
    }

    @Override // defpackage.mfb0
    public final UiText c() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_sports__dota_2);
    }

    @Override // defpackage.mfb0
    public final boolean g(String str) {
        str.getClass();
        return false;
    }

    @Override // defpackage.mfb0
    public final String getId() {
        return "sr:sport:111";
    }

    @Override // defpackage.mfb0
    public final boolean i(String str) {
        return false;
    }

    @Override // defpackage.x1, defpackage.mfb0
    public final float l() {
        return 0.0f;
    }

    @Override // defpackage.mfb0
    public final boolean m(String str) {
        return false;
    }

    @Override // defpackage.mfb0
    public final RegularMarketRule n() {
        return (RegularMarketRule) CollectionsKt.firstOrNull((List) this.b.getValue());
    }

    @Override // defpackage.mfb0
    public final boolean o(String str) {
        return false;
    }

    @Override // defpackage.mfb0
    public final List<RegularMarketRule> v() {
        return (List) this.b.getValue();
    }

    @Override // defpackage.mfb0
    public final boolean w(String str) {
        return false;
    }
}
