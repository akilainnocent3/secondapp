package defpackage;

import android.widget.TextView;
import com.sportygames.sportyherocompose.components.OverUnderComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ndz implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ndz(Object obj, int i) {
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
                OverUnderComponent overUnderComponent = (OverUnderComponent) obj;
                int i2 = OverUnderComponent.e0;
                try {
                    int i3 = overUnderComponent.z;
                    ru80 ru80Var = overUnderComponent.binding;
                    if (i3 == 2) {
                        OverUnderComponent.l(ru80Var.T0);
                    } else {
                        TextView textView = ru80Var.L0;
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
                } catch (Exception unused) {
                }
                break;
            default:
                qub0 qub0Var = (qub0) obj;
                boolean zZ3 = qub0Var.Z3();
                qub0Var.T3();
                if (zZ3) {
                    qub0Var.I3();
                }
                break;
        }
        return Unit.a;
    }
}
