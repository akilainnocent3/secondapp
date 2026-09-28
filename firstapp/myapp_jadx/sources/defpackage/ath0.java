package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ath0 {
    public Function1<? super ath0, Unit> a;

    public abstract void a(tcf tcfVar);

    public Function1<ath0, Unit> b() {
        return this.a;
    }

    public final void c() {
        Function1<ath0, Unit> function1B = b();
        if (function1B != null) {
            function1B.invoke(this);
        }
    }

    public void d(b8l.a aVar) {
        this.a = aVar;
    }
}
