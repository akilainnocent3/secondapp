package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.sporty.android.compose.ui.util.HintPopupUtils$createContainerView$1;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q9m implements Function0 {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ HintPopupUtils$createContainerView$1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ p9m d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ q9m(ViewGroup viewGroup, HintPopupUtils$createContainerView$1 hintPopupUtils$createContainerView$1, View view, p9m p9mVar, Function0 function0) {
        this.a = viewGroup;
        this.b = hintPopupUtils$createContainerView$1;
        this.c = view;
        this.d = p9mVar;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewGroup viewGroup = this.a;
        viewGroup.removeView(this.b);
        this.c.setTag(R.id.hint_popup_tag, null);
        viewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.d);
        this.e.invoke();
        return Unit.a;
    }
}
