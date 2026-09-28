package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class dc80 extends f580<dc80> {
    public final /* synthetic */ AtomicReferenceArray i;

    public dc80(long j, dc80 dc80Var, int i) {
        super(j, dc80Var, i);
        this.i = new AtomicReferenceArray(cc80.f);
    }

    @Override // defpackage.f580
    public final int g() {
        return cc80.f;
    }

    @Override // defpackage.f580
    public final void h(int i, CoroutineContext coroutineContext) {
        this.i.set(i, cc80.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
