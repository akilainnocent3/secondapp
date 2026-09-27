package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ul2 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f156496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vl2 f156497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gy1 f156498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bz1 f156499d;

    public ul2(y00 y00Var, vl2 vl2Var, gy1 gy1Var, bz1 bz1Var) {
        this.f156496a = y00Var;
        this.f156497b = vl2Var;
        this.f156498c = gy1Var;
        this.f156499d = bz1Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        String strValueOf;
        this.f156499d.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.rating_container);
        Float f10 = this.f156496a.f158081k;
        if (f10 == null) {
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
                return;
            }
            return;
        }
        this.f156498c.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R.id.rating_text);
        if (textView != null) {
            vl2 vl2Var = this.f156497b;
            float fFloatValue = f10.floatValue();
            vl2Var.getClass();
            try {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator(fw.b.f85380g);
                strValueOf = new DecimalFormat(fk.n0.f84864h, decimalFormatSymbols).format(fFloatValue);
            } catch (RuntimeException unused) {
                strValueOf = String.valueOf(fFloatValue);
            }
            textView.setText(strValueOf);
        }
    }

    @Override // yads.zf0
    public final void c() {
    }
}
