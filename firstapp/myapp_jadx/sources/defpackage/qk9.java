package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.sportybet.feature.remixbet.presentation.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qk9 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qk9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Window window;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ViewParent parent = ((View) obj).getParent();
                eme emeVar = parent instanceof eme ? (eme) parent : null;
                if (emeVar != null && (window = emeVar.getWindow()) != null) {
                    window.clearFlags(2);
                    window.setDimAmount(0.0f);
                }
                break;
            default:
                ((Function1) obj).invoke(a.c.a);
                break;
        }
        return Unit.a;
    }
}
