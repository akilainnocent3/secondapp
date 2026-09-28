package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class w0g {
    public static final Logger a = Logger.getLogger(w0g.class.getName());
    public static volatile ClassLoader b;
    public static final ConcurrentHashMap c;

    public static final class a extends ClassLoader {
        public a() {
            super(null);
        }
    }

    static {
        ClassLoader classLoader = w0g.class.getClassLoader();
        if (classLoader == null) {
            classLoader = new a();
        }
        b = classLoader;
        c = new ConcurrentHashMap();
    }
}
