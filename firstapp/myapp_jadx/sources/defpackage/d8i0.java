package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class d8i0 implements Runnable {
    final /* synthetic */ Function1<View, Unit> a;
    final /* synthetic */ View b;

    public d8i0(czd czdVar, View view) {
        this.a = czdVar;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.invoke(this.b);
    }
}
