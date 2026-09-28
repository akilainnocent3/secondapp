package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class qw90 {
    public static final /* synthetic */ AtomicReference a = new AtomicReference(null);

    public interface a {
        m9n a(Context context);
    }

    public static final m9n a(Context context) {
        m9n m9nVar;
        m9n m9nVar2;
        AtomicReference atomicReference = a;
        Object obj = atomicReference.get();
        m9n m9nVar3 = obj instanceof m9n ? (m9n) obj : null;
        if (m9nVar3 != null) {
            return m9nVar3;
        }
        m9n m9nVarA = null;
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof m9n) {
                m9nVar = (m9n) obj2;
                m9nVar2 = m9nVarA;
            } else {
                if (m9nVarA == null) {
                    a aVar = obj2 instanceof a ? (a) obj2 : null;
                    if (aVar == null || (m9nVarA = aVar.a(context)) == null) {
                        Object applicationContext = context.getApplicationContext();
                        a aVar2 = applicationContext instanceof a ? (a) applicationContext : null;
                        m9nVarA = aVar2 != null ? aVar2.a(context) : sw90.a.a(context);
                    }
                }
                m9nVar = m9nVarA;
                m9nVar2 = m9nVar;
            }
            do {
                if (atomicReference.compareAndSet(obj2, m9nVar)) {
                    m9nVar.getClass();
                    return m9nVar;
                }
            } while (atomicReference.get() == obj2);
            m9nVarA = m9nVar2;
        }
    }
}
