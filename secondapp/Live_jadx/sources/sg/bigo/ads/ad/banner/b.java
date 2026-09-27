package sg.bigo.ads.ad.banner;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.api.Ad;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<InterfaceC1296b, a> f130853a = new WeakHashMap();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long[] f130854a;

        private a() {
            this.f130854a = new long[9];
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.banner.b$b, reason: collision with other inner class name */
    public interface InterfaceC1296b {
    }

    public static <T extends Ad> long a(InterfaceC1296b interfaceC1296b, long j10) {
        if (j10 == -1) {
            return -1L;
        }
        return j10 - j(interfaceC1296b).f130854a[4];
    }

    public static <T extends Ad> void b(InterfaceC1296b interfaceC1296b) {
        a(interfaceC1296b, 1);
    }

    public static <T extends Ad> void c(InterfaceC1296b interfaceC1296b) {
        a(interfaceC1296b, 2);
    }

    public static <T extends Ad> void d(InterfaceC1296b interfaceC1296b) {
        a(interfaceC1296b, 3);
    }

    public static <T extends Ad> void e(InterfaceC1296b interfaceC1296b) {
        a(interfaceC1296b, 4);
    }

    public static <T extends Ad> void f(InterfaceC1296b interfaceC1296b) {
        a(interfaceC1296b, 5);
    }

    public static <T extends Ad> void g(InterfaceC1296b interfaceC1296b) {
        a(interfaceC1296b, 6);
    }

    public static <T extends Ad> void h(InterfaceC1296b interfaceC1296b) {
        f130853a.remove(interfaceC1296b);
    }

    public static <T extends Ad> long i(InterfaceC1296b interfaceC1296b) {
        long[] jArr = j(interfaceC1296b).f130854a;
        return jArr[6] - jArr[4];
    }

    @NonNull
    private static <T extends Ad> a j(InterfaceC1296b interfaceC1296b) {
        Map<InterfaceC1296b, a> map = f130853a;
        a aVar = map.get(interfaceC1296b);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a((byte) 0);
        map.put(interfaceC1296b, aVar2);
        return aVar2;
    }

    public static <T extends Ad> void a(InterfaceC1296b interfaceC1296b) {
        a(interfaceC1296b, 0);
    }

    private static <T extends Ad> void a(InterfaceC1296b interfaceC1296b, int i10) {
        j(interfaceC1296b).f130854a[i10] = SystemClock.elapsedRealtime();
    }
}
