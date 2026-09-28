package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.instantwin.presentation.ticketdetail.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ele implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ele(Function1 function1) {
        this.a = 1;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                lle.a((vle) obj3, (a) obj, qj40.a(1));
                break;
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                ((Function1) obj3).invoke(new b.C0343b(str, str2));
                break;
            default:
                ((Integer) obj2).getClass();
                a6t.a((String) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ele(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
    }
}
