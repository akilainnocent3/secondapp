package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fb20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fb20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                bi50 bi50Var = (bi50) obj;
                int i2 = PreMatchEventActivity.a2;
                if (bi50Var != null) {
                    preMatchEventActivity.i();
                } else {
                    zyf0.c(1, preMatchEventActivity.getCMSString(R.string.common_feedback__sorry_something_went_wrong, new Object[0]));
                }
                break;
            default:
                Integer num = (Integer) obj;
                num.getClass();
                h2j0.x1((h2j0) obj2, null, num, null, 5);
                break;
        }
        return Unit.a;
    }
}
