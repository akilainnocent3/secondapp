package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tyb implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function0 b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    odd0.d(null, cb40.a(R.string.page_creator_credits__page_title_custom_code_breakdown, new Object[0], aVar), j58.l, erz.a(R.drawable.ic_action_bar_back, 0, aVar), null, this.b, null, aVar, 384, 81);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                qp30.c(this.b, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
