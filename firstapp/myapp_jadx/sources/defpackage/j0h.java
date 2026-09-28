package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.ComposeView;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j0h implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j0h(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ej5.c((v5b) obj3, null, null, new r0h((ytw) obj2, (j590) obj, null), 3);
            default:
                yp40 yp40Var = (yp40) obj3;
                ComposeView composeView = (ComposeView) obj2;
                Function0 function0 = (Function0) obj;
                if (!yp40Var.a) {
                    yp40Var.a = true;
                    x5a0 x5a0Var = (x5a0) qbg0.a;
                    x5a0Var.setValue(yi80.c((Set) x5a0Var.getValue(), composeView));
                    ViewParent parent = composeView.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(composeView);
                    }
                    function0.invoke();
                }
                return Unit.a;
        }
    }
}
