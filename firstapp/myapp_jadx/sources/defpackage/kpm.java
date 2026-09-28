package defpackage;

import defpackage.ktu;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.ServiceLoader;
import java.util.StringJoiner;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class kpm<T extends ktu> {
    public static final Logger h = Logger.getLogger(kpm.class.getName());
    public final mvd0.a a;
    public String b;
    public long c = RealConnection.IDLE_CONNECTION_HEALTHY_NS;
    public final HashMap d = new HashMap();
    public final hk1 e = hk1.e;
    public final fpm f = new fpm();
    public final bf80 g = new bf80(kpm.class.getClassLoader());

    public kpm(mvd0.a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [gpm] */
    public final apm<T> a() {
        ypm ypmVar;
        SSLContext sSLContext;
        ?? r4 = new Supplier() { // from class: gpm
            @Override // java.util.function.Supplier
            public final Object get() {
                final HashMap map = new HashMap();
                Map map2 = Collections.EMPTY_MAP;
                if (map2 != null) {
                    map2.forEach(new BiConsumer() { // from class: hpm
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            List listSingletonList = Collections.singletonList((String) obj2);
                            map.put((String) obj, listSingletonList);
                        }
                    });
                }
                this.a.d.forEach(new BiConsumer() { // from class: ipm
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        List listSingletonList = Collections.singletonList((String) obj2);
                        jpm jpmVar = new jpm();
                        map.merge((String) obj, listSingletonList, jpmVar);
                    }
                });
                return map;
            }
        };
        boolean zStartsWith = this.b.startsWith("http://");
        HashMap map = new HashMap();
        for (ypm ypmVar2 : ServiceLoader.load(ypm.class, this.g.a)) {
            map.put(ypmVar2.getClass().getName(), ypmVar2);
        }
        if (map.isEmpty()) {
            ib5.a("No HttpSenderProvider found on classpath. Please add dependency on opentelemetry-exporter-sender-okhttp or opentelemetry-exporter-sender-jdk");
            return null;
        }
        int size = map.size();
        Logger logger = h;
        if (size == 1) {
            ypmVar = (ypm) map.values().stream().findFirst().get();
        } else {
            String strA = ipa.a("io.opentelemetry.exporter.internal.http.HttpSenderProvider", "");
            if (strA.isEmpty()) {
                logger.log(Level.WARNING, "Multiple HttpSenderProvider found. Please include only one, or specify preference setting io.opentelemetry.exporter.internal.http.HttpSenderProvider to the FQCN of the preferred provider.");
                ypmVar = (ypm) map.values().stream().findFirst().get();
            } else {
                if (!map.containsKey(strA)) {
                    ib5.a("No HttpSenderProvider matched configured io.opentelemetry.exporter.internal.http.HttpSenderProvider: ".concat(strA));
                    return null;
                }
                ypmVar = (ypm) map.get(strA);
            }
        }
        ypm ypmVar3 = ypmVar;
        String str = this.b;
        long j = this.c;
        if (zStartsWith) {
            sSLContext = null;
        } else {
            try {
                SSLContext sSLContext2 = SSLContext.getInstance("TLS");
                sSLContext2.init(null, null, null);
                sSLContext = sSLContext2;
            } catch (KeyManagementException | NoSuchAlgorithmException e) {
                m8j.a(e);
                return null;
            }
        }
        lmy lmyVarA = ypmVar3.a(new oi1(str, j, r4, this.e, sSLContext));
        logger.log(Level.FINE, "Using HttpSender: ".concat(lmy.class.getName()));
        return new apm<>(new mvd0(this.a), lmyVarA, this.f, this.b);
    }

    public final void b(String str) {
        try {
            URI uri = new URI(str);
            if (uri.getScheme() == null || !(uri.getScheme().equals("http") || uri.getScheme().equals("https"))) {
                z9l.a(uri, "Invalid endpoint, must start with http:// or https://: ");
            } else {
                this.b = uri.toString();
            }
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid endpoint, must be a URL: ".concat(str), e);
        }
    }

    public final String c(boolean z) {
        StringJoiner stringJoiner = z ? new StringJoiner(", ", "HttpExporterBuilder{", "}") : new StringJoiner(", ");
        stringJoiner.add("endpoint=" + this.b);
        stringJoiner.add("timeoutNanos=" + this.c);
        stringJoiner.add("proxyOptions=null");
        stringJoiner.add("compressorEncoding=" + ((String) Optional.ofNullable(null).map(new bpm()).orElse(null)));
        stringJoiner.add("connectTimeoutNanos=10000000000");
        stringJoiner.add("exportAsJson=false");
        final StringJoiner stringJoiner2 = new StringJoiner(", ", "Headers{", "}");
        this.d.forEach(new BiConsumer() { // from class: cpm
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                stringJoiner2.add(((String) obj) + "=OBFUSCATED");
            }
        });
        Map map = Collections.EMPTY_MAP;
        if (map != null) {
            map.forEach(new BiConsumer() { // from class: dpm
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    stringJoiner2.add(((String) obj) + "=OBFUSCATED");
                }
            });
        }
        stringJoiner.add("headers=" + stringJoiner2);
        hk1 hk1Var = this.e;
        if (hk1Var != null) {
            stringJoiner.add("retryPolicy=" + hk1Var);
        }
        stringJoiner.add("componentLoader=" + this.g);
        stringJoiner.add("exporterType=" + this.a);
        stringJoiner.add("internalTelemetrySchemaVersion=" + ezo.a);
        return stringJoiner.toString();
    }

    public final String toString() {
        return c(true);
    }
}
