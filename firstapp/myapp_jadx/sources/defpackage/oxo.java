package defpackage;

import com.sporty.android.common_ui.widgets.CombEditText;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oxo {
    public static final void a(yyx yyxVar, CombEditText combEditText) {
        yyxVar.getClass();
        String str = yyxVar.a;
        if (Intrinsics.g(str, combEditText.getText())) {
            return;
        }
        combEditText.setText(str);
        try {
            zi50.a aVar = zi50.b;
            combEditText.setSelection(yyxVar.b);
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
    }

    public static final int b(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
