package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
class Ue implements P8, P8.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f60196c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<IronSource.a, Integer> f60197a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4277fa f60198b = new C4277fa();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60199a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            f60199a = iArr;
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60199a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60199a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60199a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Ue() {
        for (IronSource.a aVar : IronSource.a.values()) {
            a(aVar, 1);
        }
    }

    private void a(@oy.l IronSource.a aVar, int i10) {
        this.f60197a.put(aVar, Integer.valueOf(i10));
        int i11 = a.f60199a[aVar.ordinal()];
        if (i11 == 1) {
            this.f60198b.d(i10);
            return;
        }
        if (i11 == 2) {
            this.f60198b.b(i10);
        } else if (i11 == 3) {
            this.f60198b.a(i10);
        } else {
            if (i11 != 4) {
                return;
            }
            this.f60198b.c(i10);
        }
    }

    @Override // com.ironsource.P8.a
    public synchronized void b(IronSource.a aVar) {
        if (aVar == null) {
            return;
        }
        a(aVar, this.f60197a.get(aVar).intValue() + 1);
    }

    @Override // com.ironsource.P8
    public synchronized int a(IronSource.a aVar) {
        int iIntValue = -1;
        if (aVar == null) {
            return -1;
        }
        Integer num = this.f60197a.get(aVar);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }

    @Override // com.ironsource.P8
    public int a(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return -1;
        }
        return a(com.unity3d.mediation.a.a(adFormat)) - 1;
    }
}
