package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.platform.features.security.newdevicelogin.loginalert.c;
import com.sporty.android.platform.features.security.newdevicelogin.loginalert.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cht implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cht(eg60 eg60Var, Function1 function1, Function0 function0, int i) {
        this.c = eg60Var;
        this.b = function1;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Function1 function1 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c.b((String) obj4, (d) obj3, function1, (a) obj, qj40.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                yf60.a((eg60) obj4, function1, (Function0) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cht(String str, d dVar, Function1 function1, int i) {
        this.c = str;
        this.d = dVar;
        this.b = function1;
    }
}
