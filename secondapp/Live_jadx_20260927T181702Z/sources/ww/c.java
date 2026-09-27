package ww;

import android.util.Log;
import cv.p0;
import cv.w0;
import fr.n1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import jw.j0;
import kotlin.jvm.internal.m0;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@kw.c
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f143938b = 4000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final Map<String, String> f143940d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final c f143937a = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final CopyOnWriteArraySet<Logger> f143939c = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r10 = j0.class.getPackage();
        String name = r10 != null ? r10.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(j0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(sw.f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(ow.f.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f143940d = n1.D0(linkedHashMap);
    }

    public static /* synthetic */ void b(c cVar, String str, int i10, String str2, Throwable th2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            th2 = null;
        }
        cVar.a(str, i10, str2, th2);
    }

    public final void a(@oy.l String loggerName, int i10, @oy.l String message, @m Throwable th2) {
        int iMin;
        m0.p(loggerName, "loggerName");
        m0.p(message, "message");
        String strE = e(loggerName);
        if (Log.isLoggable(strE, i10)) {
            if (th2 != null) {
                message = message + '\n' + Log.getStackTraceString(th2);
            }
            String str = message;
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                int iI3 = p0.I3(str, '\n', i11, false, 4, null);
                if (iI3 == -1) {
                    iI3 = length;
                }
                while (true) {
                    iMin = Math.min(iI3, i11 + 4000);
                    String strSubstring = str.substring(i11, iMin);
                    m0.o(strSubstring, "substring(...)");
                    Log.println(i10, strE, strSubstring);
                    if (iMin >= iI3) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public final void c() {
        try {
            for (Map.Entry<String, String> entry : f143940d.entrySet()) {
                d(entry.getKey(), entry.getValue());
            }
        } catch (RuntimeException e10) {
            e10.printStackTrace();
        }
    }

    public final void d(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f143939c.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(d.f143941a);
        }
    }

    public final String e(String str) {
        String str2 = f143940d.get(str);
        return str2 == null ? w0.A9(str, 23) : str2;
    }
}
