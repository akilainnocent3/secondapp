package defpackage;

import com.sportygames.sportyherocompose.components.RangeComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o9c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o9c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yfx.h((hjx) obj, a0c.d.INSTANCE, null, 6);
                break;
            default:
                RangeComponent rangeComponent = (RangeComponent) obj;
                int i2 = RangeComponent.g0;
                try {
                    int i3 = rangeComponent.D;
                    if (i3 == rangeComponent.b) {
                        String strSubstring = rangeComponent.binding.J0.getText().toString().substring(0, rangeComponent.binding.J0.getText().toString().length() - 1);
                        if (strSubstring.length() > 0 && !StringsKt.M(strSubstring, ".", false)) {
                            rangeComponent.binding.J0.setText(rangeComponent.binding.J0.getText().toString().substring(0, rangeComponent.binding.J0.getText().toString().length() - 1).concat(".x"));
                        }
                    } else {
                        int i4 = rangeComponent.c;
                        pv80 pv80Var = rangeComponent.binding;
                        if (i3 == i4) {
                            String strSubstring2 = pv80Var.G0.getText().toString().substring(0, rangeComponent.binding.G0.getText().toString().length() - 1);
                            if (strSubstring2.length() > 0 && !StringsKt.M(strSubstring2, ".", false)) {
                                rangeComponent.binding.G0.setText(rangeComponent.binding.G0.getText().toString().substring(0, rangeComponent.binding.G0.getText().toString().length() - 1).concat(".x"));
                            }
                        } else {
                            String string = pv80Var.D0.getText().toString();
                            if (string.length() > 0 && !StringsKt.M(string, ".", false)) {
                                rangeComponent.binding.D0.setText(string.concat("."));
                            }
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
