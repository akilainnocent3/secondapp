package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SearchPreMatchPanel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cx70 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cx70(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = SearchPreMatchPanel.J;
                return Integer.valueOf(((SearchPreMatchPanel) obj).getResources().getDimensionPixelSize(R.dimen.empty_decoration_height));
            default:
                ((ytw) obj).setValue(Boolean.TRUE);
                return Unit.a;
        }
    }
}
