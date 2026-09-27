package ww;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final d f143941a = new d();

    @Override // java.util.logging.Handler
    public void publish(@oy.l LogRecord record) {
        m0.p(record, "record");
        c cVar = c.f143937a;
        String loggerName = record.getLoggerName();
        m0.o(loggerName, "getLoggerName(...)");
        int iB = e.b(record);
        String message = record.getMessage();
        m0.o(message, "getMessage(...)");
        cVar.a(loggerName, iB, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
