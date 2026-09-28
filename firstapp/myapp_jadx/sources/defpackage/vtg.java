package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class vtg {
    public static final a c = new a();
    public static final LinkedHashMap d = new LinkedHashMap();
    public final ReentrantLock a;
    public final hkh b;

    public static final class a {
    }

    public vtg(String str, boolean z) {
        ReentrantLock reentrantLock;
        str.getClass();
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = reentrantLock;
        this.b = z ? new hkh(str) : null;
    }
}
