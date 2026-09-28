package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class zub0 implements Function1<Throwable, Unit> {
    public final /* synthetic */ View a;

    public zub0(View view) {
        this.a = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.a.animate().cancel();
        return Unit.a;
    }
}
