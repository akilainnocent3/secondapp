package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class n9i0 implements Function1<Throwable, Unit> {
    public final /* synthetic */ p9i0<View> a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ o9i0 c;

    public n9i0(p9i0<View> p9i0Var, ViewTreeObserver viewTreeObserver, o9i0 o9i0Var) {
        this.a = p9i0Var;
        this.b = viewTreeObserver;
        this.c = o9i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.a.q(this.b, this.c);
        return Unit.a;
    }
}
