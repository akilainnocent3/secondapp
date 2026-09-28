package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class app implements rdd {
    public final View a;
    public final Function1<Boolean, Unit> b;
    public boolean c;
    public final zop d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [zop] */
    public app(s9s s9sVar, View view, Function1<? super Boolean, Unit> function1) {
        s9sVar.getClass();
        view.getClass();
        this.a = view;
        this.b = function1;
        this.d = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: zop
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Rect rect = new Rect();
                app appVar = this.a;
                View view2 = appVar.a;
                view2.getWindowVisibleDisplayFrame(rect);
                int height = view2.getRootView().getHeight();
                boolean z = ((double) (height - rect.bottom)) > ((double) height) * 0.15d;
                if (appVar.c != z) {
                    appVar.c = z;
                    appVar.b.invoke(Boolean.valueOf(z));
                }
            }
        };
        s9sVar.a(this);
    }

    @Override // defpackage.rdd
    public final void onDestroy(ibs ibsVar) {
        ibsVar.getLifecycle().d(this);
    }

    @Override // defpackage.rdd
    public final void onPause(ibs ibsVar) {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this.d);
    }

    @Override // defpackage.rdd
    public final void onResume(ibs ibsVar) {
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(this.d);
    }
}
