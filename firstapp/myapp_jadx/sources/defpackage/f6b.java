package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class f6b implements Function1<Throwable, Unit> {
    public final /* synthetic */ rya a;

    public f6b(rya ryaVar) {
        this.a = ryaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        xse.a(this.a);
        return Unit.a;
    }
}
