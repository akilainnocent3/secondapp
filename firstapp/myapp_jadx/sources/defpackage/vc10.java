package defpackage;

import com.sportybet.android.globalpay.pixBtg.withdraw.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vc10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vc10(Object obj, int i) {
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
                e.c cVar = (e.c) obj;
                cVar.getClass();
                return e.c.a(cVar, null, 0.0d, null, (s610) ((b0o) obj2).invoke(cVar.d), null, null, 55);
            default:
                j7z.b bVar = (j7z.b) obj;
                bVar.getClass();
                wwd0 wwd0Var = ((x2a0) obj2).f;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, e6z.a((e6z) value, null, null, null, null, null, bVar, null, null, null, null, false, 2015)));
                return Unit.a;
        }
    }
}
