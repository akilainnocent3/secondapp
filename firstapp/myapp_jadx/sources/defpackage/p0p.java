package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0p extends saj implements Function1<Set<? extends Integer>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Set<? extends Integer> set) {
        set.getClass();
        o0p o0pVar = (o0p) this.receiver;
        ReentrantLock reentrantLock = o0pVar.d;
        reentrantLock.lock();
        try {
            List listA0 = CollectionsKt.A0(o0pVar.c.values());
            reentrantLock.unlock();
            Iterator it = listA0.iterator();
            if (!it.hasNext()) {
                return Unit.a;
            }
            ((pfy) it.next()).getClass();
            throw null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
