package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.function.Function;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v0g implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String strA = tug.a("META-INF/io/opentelemetry/instrumentation/", (String) obj, ".properties");
        try {
            InputStream resourceAsStream = w0g.b.getResourceAsStream(strA);
            try {
                if (resourceAsStream == null) {
                    w0g.a.log(Level.FINE, "Did not find embedded instrumentation properties file {0}", strA);
                    if (resourceAsStream == null) {
                        return null;
                    }
                    resourceAsStream.close();
                    return null;
                }
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                String property = properties.getProperty("version");
                resourceAsStream.close();
                return property;
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            w0g.a.log(Level.FINE, "Failed to load embedded instrumentation properties file ".concat(strA), (Throwable) e);
            return null;
        }
    }
}
