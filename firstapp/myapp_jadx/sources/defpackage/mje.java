package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class mje implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ mje(Object obj, Object obj2, Function0 function0, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function0 function0 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ike.j((nsf0) obj4, (Function1) obj3, (omd0) function0, (a) obj, qj40.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                smx.b((String) obj4, (String) obj3, function0, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
