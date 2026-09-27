package yads;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xc2 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return jr.g.l(Integer.valueOf(((ScanResult) obj2).level), Integer.valueOf(((ScanResult) obj).level));
    }
}
