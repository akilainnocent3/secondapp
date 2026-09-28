package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n3g implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ n3g(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                if (str.length() == 0 || ogx.a("\\d*(\\.\\d{0,2})?", str)) {
                    function1.invoke(str);
                }
                break;
            default:
                str.getClass();
                function1.invoke(new b.o.e(str));
                break;
        }
        return Unit.a;
    }
}
