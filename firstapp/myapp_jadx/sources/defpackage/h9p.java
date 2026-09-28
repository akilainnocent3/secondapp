package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h9p extends saj implements Function1<Throwable, Unit> {
    public h9p(Object obj) {
        super(1, obj, j9p.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        ((j9p) this.receiver).l(th);
        return Unit.a;
    }
}
