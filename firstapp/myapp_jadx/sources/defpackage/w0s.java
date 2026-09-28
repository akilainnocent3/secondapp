package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class w0s {
    public static final Logger a = Logger.getLogger(w0s.class.getName());
    public static final k1b b;

    static {
        k1b z8e0Var;
        ArrayList arrayList;
        AtomicReference atomicReference = new AtomicReference();
        String property = System.getProperty("io.opentelemetry.context.contextStorageProvider", "");
        int i = 0;
        if (!"default".equals(property)) {
            ClassLoader classLoader = w0s.class.getClassLoader();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ServiceLoader.load(l1b.class, classLoader).iterator();
            while (true) {
                if (!it.hasNext()) {
                    if (!arrayList2.isEmpty()) {
                        if (!property.isEmpty()) {
                            int size = arrayList2.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    atomicReference.set(new IllegalStateException("io.opentelemetry.context.contextStorageProvider property set but no matching class could be found, requested: " + property + " but found providers: " + arrayList2));
                                    z8e0Var = vof0.a;
                                    break;
                                }
                                Object obj = arrayList2.get(i2);
                                i2++;
                                l1b l1bVar = (l1b) obj;
                                if (l1bVar.getClass().getName().equals(property)) {
                                    z8e0Var = l1bVar.get();
                                    break;
                                }
                            }
                        } else {
                            if (arrayList2.size() != 1) {
                                atomicReference.set(new IllegalStateException("Found multiple ContextStorageProvider. Set the io.opentelemetry.context.contextStorageProvider property to the fully qualified class name of the provider to use. Falling back to default ContextStorage. Found providers: " + arrayList2));
                                z8e0Var = vof0.a;
                                break;
                            }
                            z8e0Var = ((l1b) arrayList2.get(0)).get();
                            break;
                        }
                    } else {
                        z8e0Var = vof0.a;
                        break;
                    }
                } else {
                    l1b l1bVar2 = (l1b) it.next();
                    if (l1bVar2.getClass().getName().equals("io.opentelemetry.sdk.testing.context.SettableContextStorageProvider")) {
                        z8e0Var = l1bVar2.get();
                        break;
                    }
                    arrayList2.add(l1bVar2);
                }
            }
        } else {
            z8e0Var = vof0.a;
        }
        if (Boolean.getBoolean("io.opentelemetry.context.enableStrictContext")) {
            z8e0Var = new z8e0(z8e0Var);
        }
        synchronized (m1b.b) {
            arrayList = m1b.a;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            z8e0Var = (k1b) ((Function) obj2).apply(z8e0Var);
        }
        b = z8e0Var;
        synchronized (m1b.b) {
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            a.log(Level.WARNING, "ContextStorageProvider initialized failed. Using default", th);
        }
    }
}
