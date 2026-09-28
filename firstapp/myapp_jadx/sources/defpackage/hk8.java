package defpackage;

import android.widget.TextView;
import androidx.fragment.app.e;
import com.sportygames.sportyherov2.components.RangeComponent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class hk8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hk8(Object obj, int i) {
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
                e activity = ((zk8) obj).getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return Unit.a;
            case 1:
                RangeComponent rangeComponent = (RangeComponent) obj;
                int i2 = RangeComponent.f0;
                try {
                    int i3 = rangeComponent.D;
                    if (i3 == rangeComponent.b) {
                        RangeComponent.s(rangeComponent.binding.J0);
                    } else {
                        int i4 = rangeComponent.c;
                        pv80 pv80Var = rangeComponent.binding;
                        if (i3 == i4) {
                            RangeComponent.s(pv80Var.G0);
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
            default:
                return ((qhp) ((List) obj).get(0)).g();
        }
    }
}
