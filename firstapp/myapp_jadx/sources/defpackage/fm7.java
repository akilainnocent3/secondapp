package defpackage;

import com.sportybet.android.choosebet.presentation.ChooseBetActivity;
import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fm7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fm7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = ChooseBetActivity.y;
                ((ChooseBetActivity) obj).finish();
                break;
            default:
                ((Function1) obj).invoke(b.x.a.a);
                break;
        }
        return Unit.a;
    }
}
