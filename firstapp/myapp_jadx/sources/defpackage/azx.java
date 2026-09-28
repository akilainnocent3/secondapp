package defpackage;

import com.sporty.android.common_ui.widgets.CombEditText;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class azx {
    public static final void a(zyx zyxVar, CombEditText combEditText) {
        zyxVar.getClass();
        String str = zyxVar.a;
        if (Intrinsics.g(str, combEditText.getText())) {
            return;
        }
        combEditText.setText(str);
        try {
            zi50.a aVar = zi50.b;
            combEditText.setSelection(zyxVar.b);
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
    }
}
