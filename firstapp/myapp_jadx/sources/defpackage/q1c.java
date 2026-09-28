package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q1c implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ q1c(int i, Function0 function0, Function0 function1) {
        this.a = i;
        this.b = function0;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    odd0.c(null, cb40.a(R.string.page_creator_credits__page_about_title, new Object[0], aVar), this.b, this.c, aVar, 0, 1);
                } else {
                    aVar.G();
                }
                break;
            default:
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    odd0.c(null, cb40.a(R.string.common_functions__enter_password_nav_title, new Object[0], aVar2), this.b, this.c, aVar2, 0, 1);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
