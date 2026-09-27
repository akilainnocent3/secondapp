package w1;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.TileService;
import androidx.annotation.NonNull;
import k.t;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f142024a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(24)
    public static class a {
        @t
        public static void a(TileService tileService, Intent intent) {
            tileService.startActivityAndCollapse(intent);
        }
    }

    /* JADX INFO: renamed from: w1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(34)
    public static class C1495b {
        @t
        public static void a(TileService tileService, PendingIntent pendingIntent) {
            tileService.startActivityAndCollapse(pendingIntent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void a(Intent intent);

        void b(PendingIntent pendingIntent);
    }

    @y0({y0.a.LIBRARY})
    public static void a() {
        f142024a = null;
    }

    @y0({y0.a.LIBRARY})
    public static void b(@NonNull c cVar) {
        f142024a = cVar;
    }

    public static void c(@NonNull TileService tileService, @NonNull w1.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            c cVar = f142024a;
            if (cVar != null) {
                cVar.b(aVar.f());
                return;
            } else {
                C1495b.a(tileService, aVar.f());
                return;
            }
        }
        if (i10 >= 24) {
            c cVar2 = f142024a;
            if (cVar2 != null) {
                cVar2.a(aVar.d());
            } else {
                a.a(tileService, aVar.d());
            }
        }
    }
}
