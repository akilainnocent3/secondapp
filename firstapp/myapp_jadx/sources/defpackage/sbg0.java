package defpackage;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.e;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class sbg0 {
    public static final void a(e eVar, Function0 function0, op8 op8Var) {
        ymn ymnVarG;
        ViewGroup viewGroup = (ViewGroup) eVar.findViewById(R.id.content);
        if (viewGroup == null) {
            function0.invoke();
            return;
        }
        int i = 0;
        ComposeView composeView = new ComposeView(eVar, null, 6, 0);
        composeView.setViewCompositionStrategy(u6i0.a.a);
        if (Build.VERSION.SDK_INT <= 28) {
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            l8j0 l8j0VarA = r6i0.e.a(viewGroup);
            if (l8j0VarA != null && (ymnVarG = l8j0VarA.a.g(2)) != null) {
                i = ymnVarG.d;
            }
            composeView.setPadding(composeView.getPaddingLeft(), composeView.getPaddingTop(), composeView.getPaddingRight(), i);
            r6i0.d.n(composeView, new rbg0());
        }
        composeView.setContent(new op8(-1642996184, new x700(op8Var, new j0h(new yp40(), composeView, function0, 1)), true));
        viewGroup.addView(composeView, -1, -1);
        WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
        r6i0.c.c(composeView);
        x5a0 x5a0Var = (x5a0) qbg0.a;
        x5a0Var.setValue(yi80.f((Set) x5a0Var.getValue(), composeView));
    }
}
