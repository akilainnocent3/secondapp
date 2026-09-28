package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cbb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cbb(Object obj, int i) {
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
                ((fgb) obj).M0();
                break;
            default:
                ViewParent parent = ((View) obj).getParent();
                eme emeVar = parent instanceof eme ? (eme) parent : null;
                if (emeVar != null && (window = emeVar.getWindow()) != null) {
                    window.clearFlags(2);
                    window.setDimAmount(0.0f);
                }
                break;
        }
        return Unit.a;
    }
}
