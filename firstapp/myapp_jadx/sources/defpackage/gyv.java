package defpackage;

import com.sportybet.android.globalpay.mobileMoney.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gyv extends saj implements Function1 {
    public final /* synthetic */ int a = 0;

    public gyv(Object obj) {
        super(1, obj, pm00.class, "onCasinoLossChanged", "onCasinoLossChanged(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                c cVar = (c) this.receiver;
                cVar.S = zBooleanValue;
                cVar.I1();
                break;
            default:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                pm00 pm00Var = (pm00) this.receiver;
                pm00Var.getClass();
                nk0 nk0Var = ijf0Var.a;
                if (nk0Var.b.length() <= 12) {
                    String str = nk0Var.b;
                    for (int i = 0; i < str.length(); i++) {
                        if (Character.isDigit(str.charAt(i))) {
                        }
                    }
                    wwd0 wwd0Var = pm00Var.a;
                    while (true) {
                        Object value = wwd0Var.getValue();
                        ijf0 ijf0Var2 = ijf0Var;
                        if (!wwd0Var.g(value, hm00.a((hm00) value, null, null, null, null, null, null, null, false, false, false, null, null, null, ijf0Var2, null, null, null, null, null, 483327))) {
                            ijf0Var = ijf0Var2;
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gyv(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
