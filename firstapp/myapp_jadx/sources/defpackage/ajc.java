package defpackage;

import android.widget.TextView;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ajc implements pya {
    public static void a(Number number, TextView textView) {
        textView.setText(pw.j(number.doubleValue()));
    }

    @Override // defpackage.pya
    public void accept(Object obj) {
        Unit unit = Unit.a;
    }
}
