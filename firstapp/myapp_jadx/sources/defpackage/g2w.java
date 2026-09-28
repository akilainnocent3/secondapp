package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class g2w extends r4u<h2w.a<Object>, Object> {
    @Override // defpackage.r4u
    public final void c(h2w.a<Object> aVar, Object obj) {
        h2w.a<Object> aVar2 = aVar;
        aVar2.getClass();
        ArrayDeque arrayDeque = h2w.a.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar2);
        }
    }
}
