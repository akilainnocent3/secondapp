package defpackage;

import com.sportybet.android.globalpay.mobileMoney.b;
import com.sportybet.android.globalpay.mobileMoney.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eyv extends saj implements Function0 {
    public final /* synthetic */ int a = 0;

    public eyv(Object obj) {
        super(0, obj, pm00.class, "onAdvancedSettingsToggle", "onAdvancedSettingsToggle()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        hm00 hm00Var;
        switch (this.a) {
            case 0:
                c cVar = (c) this.receiver;
                wwd0 wwd0Var = cVar.N;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, c.a.a((c.a) value, null, null, false, 0, null, false, false, false, false, 383)));
                cVar.A1(b.d.a);
                break;
            default:
                wwd0 wwd0Var2 = ((pm00) this.receiver).a;
                do {
                    value2 = wwd0Var2.getValue();
                    hm00Var = (hm00) value2;
                } while (!wwd0Var2.g(value2, hm00.a(hm00Var, null, null, null, null, null, null, null, false, false, !hm00Var.j, null, null, null, null, null, null, null, null, null, 523775)));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ eyv(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
