package defpackage;

import com.sportybet.android.widget.BubbleView;
import com.sportybet.plugin.myfavorite.activities.PreMatchMyFavoriteActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c1b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c1b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                break;
            case 1:
                int i2 = PreMatchMyFavoriteActivity.b1;
                gby.b(((BubbleView) obj).getDescriptionView().getContext());
                break;
            default:
                dcb0 dcb0Var = (dcb0) ((b8b0) obj).b;
                if (dcb0Var != null) {
                    dcb0Var.y.d();
                }
                break;
        }
        return Unit.a;
    }
}
