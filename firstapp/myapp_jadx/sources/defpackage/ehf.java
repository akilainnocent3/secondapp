package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public final class ehf {
    public static final HashMap a;
    public static final HashMap b;

    static {
        dhf dhfVar;
        HashMap map = new HashMap();
        a = map;
        HashMap map2 = new HashMap();
        b = map2;
        dhf dhfVar2 = dhf.d;
        map.put(1L, dhfVar2);
        map2.put(dhfVar2, Collections.singletonList(1L));
        map.put(2L, dhf.e);
        map2.put((dhf) map.get(2L), Collections.singletonList(2L));
        dhf dhfVar3 = dhf.f;
        map.put(4L, dhfVar3);
        map2.put(dhfVar3, Collections.singletonList(4L));
        dhf dhfVar4 = dhf.g;
        map.put(8L, dhfVar4);
        map2.put(dhfVar4, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            dhfVar = dhf.h;
            if (!zHasNext) {
                break;
            }
            a.put((Long) it.next(), dhfVar);
        }
        b.put(dhfVar, listAsList);
        List listAsList2 = Arrays.asList(Long.valueOf(RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE), 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            dhf dhfVar5 = dhf.i;
            if (!zHasNext2) {
                b.put(dhfVar5, listAsList2);
                return;
            } else {
                a.put((Long) it2.next(), dhfVar5);
            }
        }
    }

    public static Long a(dhf dhfVar, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) b.get(dhfVar);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (supportedProfiles.contains(l)) {
                return l;
            }
        }
        return null;
    }
}
