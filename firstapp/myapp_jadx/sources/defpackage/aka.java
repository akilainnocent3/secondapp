package defpackage;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class aka extends qlr implements Function1<Throwable, Unit> {
    public final /* synthetic */ CancellationSignal a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aka(CancellationSignal cancellationSignal) {
        super(1);
        this.a = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        if (th != null) {
            this.a.cancel();
        }
        return Unit.a;
    }
}
