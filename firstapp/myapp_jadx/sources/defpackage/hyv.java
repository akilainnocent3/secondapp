package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.globalpay.mobileMoney.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hyv extends saj implements Function1 {
    public final /* synthetic */ int a = 0;

    public hyv(Object obj) {
        super(1, obj, pm00.class, "onWeeklyTimeChanged", "onWeeklyTimeChanged(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                c cVar = (c) this.receiver;
                if (!cVar.R || str != null) {
                    cVar.H.setValue(str != null ? new StringUiText(str) : null);
                }
                break;
            default:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                pm00 pm00Var = (pm00) this.receiver;
                pm00Var.getClass();
                nk0 nk0Var = ijf0Var.a;
                if (nk0Var.b.length() <= 10) {
                    String str2 = nk0Var.b;
                    for (int i = 0; i < str2.length(); i++) {
                        if (Character.isDigit(str2.charAt(i))) {
                        }
                    }
                    wwd0 wwd0Var = pm00Var.a;
                    while (true) {
                        Object value = wwd0Var.getValue();
                        ijf0 ijf0Var2 = ijf0Var;
                        if (!wwd0Var.g(value, hm00.a((hm00) value, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, ijf0Var2, null, null, 196607))) {
                            ijf0Var = ijf0Var2;
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hyv(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
