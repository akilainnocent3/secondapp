package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.instantwin.presentation.penalty.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r0s implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ haj b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                dh9.a(qj40.a(7), (op8) hajVar, (a) obj);
                break;
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                ((Function1) hajVar).invoke(new b.u(str, str2));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ r0s(Function1 function1) {
        this.b = function1;
    }
}
