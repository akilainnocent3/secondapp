package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.ironsource.kd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4369kd implements P7, P7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62225a = "CappingManager.IS_DELIVERY_ENABLED";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62226b = "CappingManager.IS_CAPPING_ENABLED";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62227c = "CappingManager.IS_PACING_ENABLED";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f62228d = "CappingManager.MAX_NUMBER_OF_SHOWS";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f62229e = "CappingManager.CAPPING_TYPE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f62230f = "CappingManager.SECONDS_BETWEEN_SHOWS";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f62231g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f62232h = "CappingManager.CAPPING_TIME_THRESHOLD";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f62233i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    /* JADX INFO: renamed from: com.ironsource.kd$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62234a;

        static {
            int[] iArr = new int[EnumC4387ld.values().length];
            f62234a = iArr;
            try {
                iArr[EnumC4387ld.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62234a[EnumC4387ld.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.kd$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    @Override // com.ironsource.P7
    public synchronized b a(Context context, AbstractC4535u3 abstractC4535u3, IronSource.a aVar) {
        try {
            if (context == null) {
                return b.NOT_CAPPED;
            }
            if (abstractC4535u3 == null) {
                return b.NOT_CAPPED;
            }
            String strA = a(aVar);
            if (abstractC4535u3.c() == null) {
                return b.NOT_CAPPED;
            }
            if (abstractC4535u3.a() == null) {
                return b.NOT_CAPPED;
            }
            return b(context, strA, abstractC4535u3.c());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.ironsource.P7.a
    public synchronized void b(Context context, AbstractC4535u3 abstractC4535u3, IronSource.a aVar) {
        if (context == null || abstractC4535u3 == null) {
            return;
        }
        C4316hd c4316hdA = abstractC4535u3.a();
        if (c4316hdA == null) {
            return;
        }
        a(context, a(aVar), abstractC4535u3.c(), c4316hdA);
    }

    @Override // com.ironsource.P7
    public synchronized boolean c(Context context, AbstractC4535u3 abstractC4535u3, IronSource.a aVar) {
        return a(context, abstractC4535u3, aVar) != b.NOT_CAPPED;
    }

    private b b(Context context, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.a(context, a(str, f62225a, str2), true)) {
            return b.CAPPED_PER_DELIVERY;
        }
        if (IronSourceUtils.a(context, a(str, f62227c, str2), false)) {
            if (jCurrentTimeMillis - IronSourceUtils.a(context, a(str, f62233i, str2), 0L) < IronSourceUtils.a(context, a(str, f62230f, str2), 0) * 1000) {
                return b.CAPPED_PER_PACE;
            }
        }
        if (IronSourceUtils.a(context, a(str, f62226b, str2), false)) {
            int iA = IronSourceUtils.a(context, a(str, f62228d, str2), 0);
            String strA = a(str, f62231g, str2);
            int iA2 = IronSourceUtils.a(context, strA, 0);
            String strA2 = a(str, f62232h, str2);
            if (jCurrentTimeMillis >= IronSourceUtils.a(context, strA2, 0L)) {
                IronSourceUtils.b(context, strA, 0);
                IronSourceUtils.b(context, strA2, 0L);
            } else if (iA2 >= iA) {
                return b.CAPPED_PER_COUNT;
            }
        }
        return b.NOT_CAPPED;
    }

    @Override // com.ironsource.P7.a
    public synchronized void a(Context context, String str, IronSource.a aVar) {
        if (context == null) {
            return;
        }
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(context, a(aVar), str);
    }

    private String a(String str, String str2, String str3) {
        return str + lk.e.f104695m + str2 + lk.e.f104695m + str3;
    }

    private void a(Context context, String str, String str2) {
        EnumC4387ld enumC4387ld;
        int i10 = 0;
        if (IronSourceUtils.a(context, a(str, f62227c, str2), false)) {
            IronSourceUtils.b(context, a(str, f62233i, str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.a(context, a(str, f62226b, str2), false)) {
            String strA = a(str, f62231g, str2);
            int iA = IronSourceUtils.a(context, strA, 0);
            if (iA == 0) {
                String strC = IronSourceUtils.c(context, a(str, f62229e, str2), EnumC4387ld.PER_DAY.toString());
                EnumC4387ld[] enumC4387ldArrValues = EnumC4387ld.values();
                int length = enumC4387ldArrValues.length;
                while (true) {
                    if (i10 >= length) {
                        enumC4387ld = null;
                        break;
                    }
                    enumC4387ld = enumC4387ldArrValues[i10];
                    if (enumC4387ld.f62270a.equals(strC)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                IronSourceUtils.b(context, a(str, f62232h, str2), a(enumC4387ld));
            }
            IronSourceUtils.b(context, strA, iA + 1);
        }
    }

    private long a(EnumC4387ld enumC4387ld) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i10 = a.f62234a[enumC4387ld.ordinal()];
        if (i10 == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i10 == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    private void a(Context context, String str, String str2, C4316hd c4316hd) {
        boolean zE = c4316hd.e();
        IronSourceUtils.b(context, a(str, f62225a, str2), zE);
        if (zE) {
            boolean zD = c4316hd.d();
            IronSourceUtils.b(context, a(str, f62226b, str2), zD);
            if (zD) {
                IronSourceUtils.b(context, a(str, f62228d, str2), c4316hd.b());
                IronSourceUtils.f(context, a(str, f62229e, str2), c4316hd.a().toString());
            }
            boolean zF = c4316hd.f();
            IronSourceUtils.b(context, a(str, f62227c, str2), zF);
            if (zF) {
                IronSourceUtils.b(context, a(str, f62230f, str2), c4316hd.c());
            }
        }
    }

    private String a(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceConstants.REWARDED_VIDEO_AD_UNIT;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return "Interstitial";
        }
        if (aVar == IronSource.a.BANNER) {
            return "Banner";
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return IronSourceConstants.NATIVE_AD_UNIT;
        }
        return aVar.toString();
    }
}
