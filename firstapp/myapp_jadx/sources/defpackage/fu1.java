package defpackage;

import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fu1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fu1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((y.a) obj).s((y) obj2, 0, 0, 0.0f);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                wwd0 wwd0Var = ((yhf) obj2).P0().z0;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, gw1.a((gw1) value, str, false)));
                break;
        }
        return Unit.a;
    }
}
