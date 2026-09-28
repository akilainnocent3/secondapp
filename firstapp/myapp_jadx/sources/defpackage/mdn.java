package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.inappreview.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mdn implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mdn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(c.b.a);
                return Unit.a;
            case 1:
                LazyLayoutItemAnimator.a aVar = ((LazyLayoutItemAnimator) obj).j;
                if (aVar != null) {
                    rcf.a(aVar);
                }
                return Unit.a;
            case 2:
                return Integer.valueOf(((eiw) obj).a().getColor(R.color.icon_inverse_primary));
            default:
                try {
                    ((m410) obj).Q0().x1();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return Unit.a;
        }
    }
}
