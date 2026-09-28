package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class orc extends qlr implements Function2<qnv.a<Object>, Throwable, Unit> {
    public static final orc a = new orc(2);

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(qnv.a<Object> aVar, Throwable th) {
        qnv.a<Object> aVar2 = aVar;
        Throwable cancellationException = th;
        aVar2.getClass();
        dm8 dm8Var = aVar2.b;
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        dm8Var.F(cancellationException);
        return Unit.a;
    }
}
