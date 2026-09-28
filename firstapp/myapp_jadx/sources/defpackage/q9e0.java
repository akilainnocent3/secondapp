package defpackage;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public final class q9e0 {
    public static final o9e0 a;

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:24:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Optional optionalOf;
        o9e0 s9hVar;
        Logger logger = Logger.getLogger(q9e0.class.getName());
        String property = System.getProperty("java.specification.version");
        if (property != null) {
            try {
                optionalOf = Optional.of(Double.valueOf(Double.parseDouble(property)));
            } catch (NumberFormatException unused) {
                optionalOf = Optional.empty();
            }
        } else {
            optionalOf = Optional.empty();
        }
        o9e0 o9e0Var = null;
        if (((Boolean) optionalOf.map(new p9e0()).orElse(Boolean.TRUE)).booleanValue()) {
            try {
                o9e0Var = (o9e0) Class.forName("io.opentelemetry.exporter.internal.marshal.VarHandleStringEncoder").getMethod("createIfAvailable", null).invoke(null, null);
            } catch (Throwable unused2) {
            }
            if (o9e0Var != null) {
                logger.log(Level.FINE, "Using VarHandleStringEncoder for optimal Java 9+ performance");
                s9hVar = o9e0Var;
            } else {
                logger.log(Level.FINE, "Using FallbackStringEncoder");
                s9hVar = new s9h();
            }
        } else {
            Unsafe unsafe = ygh0.a.a;
            if (unsafe == null) {
                s9hVar = null;
            } else {
                long jC = ygh0.c(byte[].class, "value");
                long jC2 = ygh0.c(Byte.TYPE, "coder");
                if (jC == -1 || jC2 == -1) {
                    s9hVar = null;
                } else {
                    s9hVar = new ygh0(jC, jC2, unsafe.arrayBaseOffset(byte[].class));
                }
            }
            if (s9hVar != null) {
                logger.log(Level.FINE, "Using UnsafeStringEncoder for optimized Java 8+ performance");
            } else {
                o9e0Var = (o9e0) Class.forName("io.opentelemetry.exporter.internal.marshal.VarHandleStringEncoder").getMethod("createIfAvailable", null).invoke(null, null);
                if (o9e0Var != null) {
                    logger.log(Level.FINE, "Using VarHandleStringEncoder for optimal Java 9+ performance");
                    s9hVar = o9e0Var;
                } else {
                    logger.log(Level.FINE, "Using FallbackStringEncoder");
                    s9hVar = new s9h();
                }
            }
        }
        a = s9hVar;
    }
}
