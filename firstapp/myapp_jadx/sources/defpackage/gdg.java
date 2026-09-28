package defpackage;

import com.sportygames.sportyherocompose.components.OverUnderComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gdg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gdg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((fgg) obj).t0(null);
                break;
            default:
                OverUnderComponent overUnderComponent = (OverUnderComponent) obj;
                int i2 = OverUnderComponent.e0;
                try {
                    int i3 = overUnderComponent.z;
                    ru80 ru80Var = overUnderComponent.binding;
                    if (i3 == 2) {
                        String strSubstring = ru80Var.T0.getText().toString().substring(0, overUnderComponent.binding.T0.getText().toString().length() - 1);
                        if (strSubstring.length() > 0 && !StringsKt.M(strSubstring, ".", false)) {
                            overUnderComponent.binding.T0.setText(overUnderComponent.binding.T0.getText().toString().substring(0, overUnderComponent.binding.T0.getText().toString().length() - 1).concat(".x"));
                        }
                    } else {
                        String string = ru80Var.L0.getText().toString();
                        if (string.length() > 0 && !StringsKt.M(string, ".", false)) {
                            overUnderComponent.binding.L0.setText(string.concat("."));
                        }
                    }
                    break;
                } catch (Exception unused) {
                }
                break;
        }
        return Unit.a;
    }
}
