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
public final class uvs extends x1 {
    public final mpe0 b = hwr.b(new tvs());

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
        return "https://s.sporty.net/ke/main/res/a33c717137d9e5d93aff511557c61989.png";
    }

    @Override // defpackage.mfb0
    public final UiText c() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_sports__league_of_legends);
    }

    @Override // defpackage.mfb0
    public final boolean g(String str) {
        str.getClass();
        return false;
    }

    @Override // defpackage.mfb0
    public final String getId() {
        return "sr:sport:110";
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
