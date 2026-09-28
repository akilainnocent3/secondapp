package defpackage;

import com.sportybet.android.instantwin.presentation.legends.b;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kn00 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kn00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        zb6<Unit> zb6VarZ;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yfx.h((hjx) obj, new a0c.a(true), null, 6);
                return Unit.a;
            case 1:
                wj40 wj40Var = (wj40) obj;
                synchronized (wj40Var.b) {
                    zb6VarZ = wj40Var.z();
                    if (((wj40.c) wj40Var.t.getValue()).compareTo(wj40.c.b) <= 0) {
                        Throwable th = wj40Var.d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (zb6VarZ != null) {
                    zi50.a aVar = zi50.b;
                    ((bc6) zb6VarZ).resumeWith(Unit.a);
                }
                return Unit.a;
            default:
                ((Function1) obj).invoke(b.d.a.a);
                return Unit.a;
        }
    }
}
