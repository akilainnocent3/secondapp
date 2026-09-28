package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class wbk0 {
    public static final void a(ComposeView composeView, final x9m x9mVar, final String str, final String str2, final Function0<Unit> function0) {
        x9mVar.getClass();
        composeView.setVisibility(0);
        composeView.setViewCompositionStrategy(u6i0.c.a);
        composeView.setContent(new op8(1427878009, new Function2() { // from class: vbk0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w8m.b(x9mVar, str, str2, function0, aVar, 8, 4);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
