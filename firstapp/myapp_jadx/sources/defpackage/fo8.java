package defpackage;

import com.google.android.gms.common.annotation.LjLk.llGRV;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class fo8 {

    public static class a extends fo8 {
        public static final ConcurrentHashMap c = new ConcurrentHashMap();
        public final String a;
        public volatile String b = null;

        public a(String str) {
            this.a = str;
        }

        @Override // defpackage.fo8
        public final String a() {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            this.b = this.a + llGRV.AQRkOnSEYhHemj + ((AtomicInteger) c.computeIfAbsent(this.a, new eo8())).getAndIncrement();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.b;
        }
    }

    public abstract String a();
}
