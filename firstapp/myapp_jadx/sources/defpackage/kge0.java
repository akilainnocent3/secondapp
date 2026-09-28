package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class kge0 {
    public static final kge0 e;
    public final boolean a;
    public final dge0 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public static class a {
        public final AtomicLong a = new AtomicLong();
        public final AtomicLong b = new AtomicLong();
        public final AtomicLong c = new AtomicLong();
        public final AtomicLong d = new AtomicLong();
        public final AtomicLong e = new AtomicLong();
    }

    static {
        Logger logger = Logger.getLogger(kge0.class.getName());
        String property = System.getProperty("otel.javaagent.debug");
        if (property == null) {
            property = System.getenv("otel.javaagent.debug".toUpperCase(Locale.ROOT).replace('-', '_').replace('.', '_'));
        }
        Boolean boolValueOf = property == null ? null : Boolean.valueOf(Boolean.parseBoolean(property));
        boolean zBooleanValue = boolValueOf == null ? false : boolValueOf.booleanValue();
        Objects.requireNonNull(logger);
        final kge0 kge0Var = new kge0(zBooleanValue, new dge0(logger));
        if (kge0Var.a) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new ege0());
            scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: fge0
                @Override // java.lang.Runnable
                public final void run() {
                    final kge0 kge0Var2 = this.a;
                    kge0Var2.c.forEach(new BiConsumer() { // from class: hge0
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            long andSet;
                            String str = (String) obj;
                            kge0.a aVar = (kge0.a) obj2;
                            for (wqa0 wqa0Var : wqa0.values()) {
                                aVar.getClass();
                                int iOrdinal = wqa0Var.ordinal();
                                if (iOrdinal == 0) {
                                    andSet = aVar.c.getAndSet(0L);
                                } else if (iOrdinal == 1) {
                                    andSet = aVar.a.getAndSet(0L);
                                } else if (iOrdinal == 2) {
                                    andSet = aVar.b.getAndSet(0L);
                                } else if (iOrdinal != 3) {
                                    andSet = iOrdinal != 4 ? 0L : aVar.d.getAndSet(0L);
                                } else {
                                    andSet = aVar.e.getAndSet(0L);
                                }
                                if (andSet > 0) {
                                    kge0Var2.b.accept("Suppressed Spans by '" + str + "' (" + wqa0Var + ") : " + andSet);
                                }
                            }
                        }
                    });
                    kge0Var2.d.forEach(new BiConsumer() { // from class: ige0
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            String str = (String) obj;
                            long andSet = ((AtomicLong) obj2).getAndSet(0L);
                            if (andSet > 0) {
                                kge0Var2.b.accept("Counter '" + str + "' : " + andSet);
                            }
                        }
                    });
                }
            }, 5L, 5L, TimeUnit.SECONDS);
            if (scheduledExecutorServiceNewScheduledThreadPool.isTerminated()) {
                x01.a();
                return;
            }
        }
        e = kge0Var;
    }

    public kge0(boolean z, dge0 dge0Var) {
        this.a = z;
        this.b = dge0Var;
    }
}
