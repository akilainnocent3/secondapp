package defpackage;

import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qzo implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qzo(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                y yVar = (y) obj2;
                y.a aVar = (y.a) obj;
                if (aVar.g() == asr.a || aVar.i() == 0) {
                    aVar.o(yVar);
                    yVar.t0(iwo.d(0L, yVar.e), 0.0f, null);
                } else {
                    long jI = ((long) (aVar.i() - yVar.a)) << 32;
                    aVar.o(yVar);
                    yVar.t0(iwo.d(jI, yVar.e), 0.0f, null);
                }
                break;
            default:
                String str = (String) obj;
                yva0.a aVar2 = yva0.c0;
                str.getClass();
                zwa0 zwa0VarC1 = ((yva0) obj2).c1();
                wwd0 wwd0Var = zwa0VarC1.E;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, wwa0.a((wwa0) value, null, null, new ijf0(str, 0L, 6), false, false, 11)));
                zwa0VarC1.D1(str);
                wwd0 wwd0Var2 = zwa0VarC1.Q;
                do {
                    value2 = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value2, yf40.a((yf40) value2, false, null, 2)));
                break;
        }
        return Unit.a;
    }
}
