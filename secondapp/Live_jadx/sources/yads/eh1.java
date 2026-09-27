package yads;

import android.location.Location;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class eh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zg1 f148703a = new zg1();

    public final Location a(List list) {
        Iterator it = list.iterator();
        Location location = null;
        while (it.hasNext()) {
            Location location2 = (Location) it.next();
            this.f148703a.getClass();
            if (location != null) {
                long time = location2.getTime() - location.getTime();
                long j10 = zg1.f158806a;
                boolean z10 = time > j10;
                boolean z11 = time < (-j10);
                boolean z12 = time > 0;
                int accuracy = (int) (location2.getAccuracy() - location.getAccuracy());
                boolean z13 = accuracy > 0;
                boolean z14 = accuracy < 0;
                boolean z15 = ((long) accuracy) > 200;
                boolean zG = kotlin.jvm.internal.m0.g(location2.getProvider(), location.getProvider());
                if (!z10 && (z11 || (!z14 && ((!z12 || z13) && (!z12 || z15 || !zG))))) {
                }
            }
            location = location2;
        }
        return location;
    }
}
