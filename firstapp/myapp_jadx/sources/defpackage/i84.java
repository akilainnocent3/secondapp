package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i84 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i84(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        n8j0.g cVar;
        Window window;
        int i = this.a;
        Window window2 = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                azm azmVar = ((j84) obj).f;
                if (azmVar != null) {
                    azmVar.d(wae.HOME);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
            case 1:
                View view = (View) obj;
                ViewParent parent = view.getParent();
                eme emeVar = parent instanceof eme ? (eme) parent : null;
                if (emeVar == null || (window = emeVar.getWindow()) == null) {
                    Context context = view.getContext();
                    Activity activity = context instanceof Activity ? (Activity) context : null;
                    if (activity != null) {
                        window2 = activity.getWindow();
                    }
                } else {
                    window2 = window;
                }
                if (window2 != null) {
                    window2.setLayout(-1, -1);
                }
                if (window2 != null) {
                    window2.setStatusBarColor(-16777216);
                    window2.setNavigationBarColor(-16777216);
                    qoa0 qoa0Var = new qoa0(view);
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 35) {
                        cVar = new n8j0.f(window2, qoa0Var);
                    } else if (i2 >= 30) {
                        cVar = new n8j0.d(window2, qoa0Var);
                    } else {
                        cVar = i2 >= 26 ? new n8j0.c(window2, qoa0Var) : new n8j0.b(window2, qoa0Var);
                    }
                    cVar.d(false);
                    cVar.c(false);
                }
                return Unit.a;
            case 2:
                ((nn40) obj).H0();
                return Unit.a;
            default:
                ((Function1) obj).invoke(fnc0.a);
                return Unit.a;
        }
    }
}
