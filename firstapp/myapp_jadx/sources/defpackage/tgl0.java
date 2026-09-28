package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tgl0 {
    public static dgl0 b() {
        String strB;
        ClassLoader classLoader = tgl0.class.getClassLoader();
        if (dgl0.class.equals(dgl0.class)) {
            strB = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!dgl0.class.getPackage().equals(tgl0.class.getPackage())) {
                hb5.a(dgl0.class.getName());
                return null;
            }
            strB = v70.b(dgl0.class.getPackage().getName(), ".BlazeGenerated", dgl0.class.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    try {
                        return (dgl0) dgl0.class.cast(((tgl0) Class.forName(strB, true, classLoader).getConstructor(null).newInstance(null)).a());
                    } catch (InvocationTargetException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InstantiationException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new tgl0[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        arrayList.add((dgl0) dgl0.class.cast(((tgl0) it.next()).a()));
                    } catch (ServiceConfigurationError e5) {
                        Logger.getLogger(ufl0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(dgl0.class.getSimpleName()), (Throwable) e5);
                    }
                }
                if (arrayList.size() == 1) {
                    return (dgl0) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (dgl0) dgl0.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e6) {
                    dad.a(e6);
                    return null;
                } catch (NoSuchMethodException e7) {
                    dad.a(e7);
                    return null;
                } catch (InvocationTargetException e8) {
                    dad.a(e8);
                    return null;
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public abstract dgl0 a();
}
