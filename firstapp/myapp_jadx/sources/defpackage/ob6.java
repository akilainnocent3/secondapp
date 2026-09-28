package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public interface ob6 extends bzx {

    public static final class a implements ob6 {
        public final Function1<Throwable, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Throwable, Unit> function1) {
            this.a = function1;
        }

        @Override // defpackage.ob6
        public final void b(Throwable th) {
            this.a.invoke(th);
        }

        public final String toString() {
            return "CancelHandler.UserSupplied[" + this.a.getClass().getSimpleName() + '@' + x2d.b(this) + ']';
        }
    }

    void b(Throwable th);
}
