package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a5b extends qlr implements Function1<Throwable, Unit> {
    public final /* synthetic */ nv5.a<Object> a;
    public final /* synthetic */ pjd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5b(nv5.a aVar, pjd pjdVar) {
        super(1);
        this.a = aVar;
        this.b = pjdVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable th2 = th;
        nv5.a<Object> aVar = this.a;
        if (th2 == null) {
            aVar.b(this.b.B());
        } else if (th2 instanceof CancellationException) {
            aVar.c();
        } else {
            aVar.d(th2);
        }
        return Unit.a;
    }
}
