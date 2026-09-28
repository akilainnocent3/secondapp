package defpackage;

import android.view.View;
import com.sporty.android.common_ui.uitext.UiText;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class plf implements zmy {
    public static String a(StringBuilder sb, UiText uiText, String str) {
        sb.append(uiText);
        sb.append(str);
        return sb.toString();
    }

    @Override // defpackage.zmy
    public l8j0 b(View view, l8j0 l8j0Var) {
        view.getClass();
        l8j0.l lVar = l8j0Var.a;
        ymn ymnVarG = lVar.g(8);
        ymnVarG.getClass();
        ymn ymnVarG2 = lVar.g(2);
        ymnVarG2.getClass();
        ymn ymnVarG3 = lVar.g(519);
        ymnVarG3.getClass();
        view.setPadding(0, ymnVarG3.b, 0, Math.max(ymnVarG.d, ymnVarG2.d));
        return l8j0Var;
    }
}
