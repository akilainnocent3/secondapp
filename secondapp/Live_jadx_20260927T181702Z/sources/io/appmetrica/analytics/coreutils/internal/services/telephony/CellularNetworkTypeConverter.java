package io.appmetrica.analytics.coreutils.internal.services.telephony;

import android.util.SparseArray;
import cs.o;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class CellularNetworkTypeConverter {

    @l
    public static final CellularNetworkTypeConverter INSTANCE = new CellularNetworkTypeConverter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseArray f95364a;

    static {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, "unknown");
        sparseArray.put(7, "1xRTT");
        sparseArray.put(4, "CDMA");
        sparseArray.put(2, "EDGE");
        sparseArray.put(14, "eHRPD");
        sparseArray.put(5, "EVDO rev.0");
        sparseArray.put(6, "EVDO rev.A");
        sparseArray.put(1, "GPRS");
        sparseArray.put(8, "HSDPA");
        sparseArray.put(10, "HSPA");
        sparseArray.put(15, "HSPA+");
        sparseArray.put(9, "HSUPA");
        sparseArray.put(11, "iDen");
        sparseArray.put(3, "UMTS");
        sparseArray.put(13, "LTE");
        sparseArray.put(16, "GSM");
        sparseArray.put(17, "TD_SCDMA");
        sparseArray.put(18, "IWLAN");
        if (AndroidUtils.isApiAchieved(29)) {
            sparseArray.put(20, "NR");
        }
        f95364a = sparseArray;
    }

    private CellularNetworkTypeConverter() {
    }

    @l
    @o
    public static final String convert(@m Integer num) {
        String str;
        return (num == null || (str = (String) f95364a.get(num.intValue())) == null) ? "unknown" : str;
    }
}
