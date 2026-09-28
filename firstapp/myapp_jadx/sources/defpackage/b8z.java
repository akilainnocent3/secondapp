package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b8z implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b8z(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = OutcomeButton.H;
                return Float.valueOf(((OutcomeButton) obj).getTextSize());
            case 1:
                ((Function0) obj).invoke();
                return Unit.a;
            default:
                ((Function1) obj).invoke(b.q.d.a);
                return Unit.a;
        }
    }
}
