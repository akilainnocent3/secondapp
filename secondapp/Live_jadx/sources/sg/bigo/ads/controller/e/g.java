package sg.bigo.ads.controller.e;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f134262b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<String, a> f134263a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f134264c = false;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicInteger f134265a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicInteger f134266b = new AtomicInteger(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f134267c = new AtomicInteger(0);

        public a() {
        }
    }

    @NonNull
    public final a a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = fw.b.f85379f;
        }
        a aVar = this.f134263a.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.f134263a.put(str, aVar2);
        return aVar2;
    }

    public static g a() {
        return f134262b;
    }

    public final void a(boolean z10) {
        this.f134264c = z10;
        if (z10) {
            Iterator<Map.Entry<String, a>> it = this.f134263a.entrySet().iterator();
            while (it.hasNext()) {
                a value = it.next().getValue();
                if (value != null) {
                    value.f134267c.set(0);
                }
            }
        }
    }
}
