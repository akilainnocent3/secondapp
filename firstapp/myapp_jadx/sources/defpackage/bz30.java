package defpackage;

import android.widget.TextView;
import com.sportygames.sportyherocompose.components.RangeComponent;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bz30 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bz30(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                RangeComponent rangeComponent = (RangeComponent) obj;
                int i2 = RangeComponent.g0;
                try {
                    int i3 = rangeComponent.D;
                    if (i3 == rangeComponent.b) {
                        RangeComponent.r(rangeComponent.binding.J0);
                    } else {
                        int i4 = rangeComponent.c;
                        pv80 pv80Var = rangeComponent.binding;
                        if (i3 == i4) {
                            RangeComponent.r(pv80Var.G0);
                        } else {
                            TextView textView = pv80Var.D0;
                            CharSequence text = textView.getText();
                            String strA = null;
                            String string2 = text != null ? text.toString() : null;
                            if (string2 != null && string2.length() != 0) {
                                CharSequence text2 = textView.getText();
                                if (text2 != null && (string = text2.toString()) != null) {
                                    strA = pl2.a(textView, 1, string, 0);
                                }
                                if (strA != null && strA.length() == 0) {
                                    textView.setText("0");
                                }
                                if (strA == null || strA.length() <= 0) {
                                    textView.setText("0");
                                } else {
                                    textView.setText(strA);
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                return Unit.a;
            case 1:
                return ((qhp) ((ArrayList) obj).get(0)).g();
            case 2:
                ((q1c0) obj).Z0();
                return Unit.a;
            default:
                return (String) ((x5a0) ((i96) obj).P).getValue();
        }
    }
}
