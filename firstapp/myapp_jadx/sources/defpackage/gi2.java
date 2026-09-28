package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class gi2 implements fi2 {
    public final x4s a;
    public final wwd0 b;

    public gi2(x4s x4sVar) {
        x4sVar.getClass();
        this.a = x4sVar;
        this.b = xwd0.a(ei2.a.a);
    }

    @Override // defpackage.fi2
    public final uwd0<ei2> f1() {
        return e1i.b(this.b);
    }

    @Override // defpackage.fi2
    public final void n0() {
        this.b.setValue(ei2.a.a);
    }

    @Override // defpackage.fi2
    public final void r(int i) {
        x4s x4sVar = this.a;
        x4sVar.getClass();
        dj5.b(new v4s(x4sVar, null));
        StringUiText stringUiText = vch0.a;
        this.b.k(null, new ei2.b(i, a4h.a(new hi2(new ResourceUiText(R.string.page_instant_virtual__bet_builder_tutorial_1), new ResourceUiText(R.string.page_instant_virtual__choose_a_match)), new hi2(new ResourceUiText(R.string.page_instant_virtual__bet_builder_tutorial_2), new ResourceUiText(R.string.page_instant_virtual__add_more_than_one_selection_to_create_a_bet_builder)), new hi2(new ResourceUiText(R.string.page_instant_virtual__bet_builder_tutorial_3), new ResourceUiText(R.string.page_instant_virtual__add_your_selected_bet_builder_to_betslip)))));
    }
}
