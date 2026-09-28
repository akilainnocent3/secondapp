package defpackage;

import com.sportybet.android.instantwin.presentation.racingevent.c;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vod implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vod(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fqd fqdVarP0 = ((jpd) obj).P0();
                wwd0 wwd0Var = fqdVarP0.A0;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, new rw1(true, (List) fqdVarP0.z0.a.getValue())));
                break;
            default:
                Function1 function1 = (Function1) obj;
                function1.invoke(c.b.a.a);
                function1.invoke(c.e.a);
                break;
        }
        return Unit.a;
    }
}
