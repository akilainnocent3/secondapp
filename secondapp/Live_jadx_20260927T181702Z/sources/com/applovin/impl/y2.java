package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o4 f29574a = new o4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeSet f29575b = new TreeSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f29576c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29578e;

    public y2(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            com.applovin.impl.sdk.p.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f29574a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f29574a.isEmpty()) {
            this.f29574a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int iIntValue = ((Integer) this.f29574a.a()).intValue();
        while (true) {
            iIntValue += repeatingInterval;
            if (this.f29574a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f29574a.add(Integer.valueOf(iIntValue));
            }
        }
    }

    public Collection b() {
        return new TreeSet((SortedSet) this.f29575b);
    }

    public int c() {
        int i10 = this.f29577d;
        if (i10 != -1 && this.f29578e != -1) {
            while (i10 <= this.f29578e) {
                if (g(i10) && !h(i10)) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public int d(int i10) {
        if (g(i10)) {
            return -1;
        }
        return i10 - a(i10, true);
    }

    public Collection e(int i10) {
        return new TreeSet((SortedSet) this.f29575b.tailSet(Integer.valueOf(i10), false));
    }

    public void f(int i10) {
        int iB = this.f29574a.b(Integer.valueOf(i10));
        for (int size = this.f29574a.size() - 1; size >= iB; size--) {
            Integer num = (Integer) this.f29574a.a(size);
            int iIntValue = num.intValue() + 1;
            a(num.intValue(), iIntValue);
            this.f29574a.a(size, Integer.valueOf(iIntValue));
        }
    }

    public boolean g(int i10) {
        return this.f29574a.contains(Integer.valueOf(i10));
    }

    public boolean h(int i10) {
        return this.f29575b.contains(Integer.valueOf(i10));
    }

    public void i(int i10) {
        int iB = this.f29574a.b(Integer.valueOf(i10));
        if (g(i10)) {
            this.f29576c.remove(Integer.valueOf(i10));
            this.f29575b.remove(Integer.valueOf(i10));
            this.f29574a.b(iB);
        }
        while (iB < this.f29574a.size()) {
            Integer num = (Integer) this.f29574a.a(iB);
            int iIntValue = num.intValue() - 1;
            a(num.intValue(), iIntValue);
            this.f29574a.a(iB, Integer.valueOf(iIntValue));
            iB++;
        }
    }

    public int b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 + a(i10 - 1, false);
    }

    public void b(int i10, int i11) {
        i(i10);
        f(i11);
    }

    public void c(int i10, int i11) {
        this.f29577d = i10;
        this.f29578e = i11;
    }

    public int c(int i10) {
        return i10 + a(i10, false);
    }

    public MaxAd a(int i10) {
        return (MaxAd) this.f29576c.get(Integer.valueOf(i10));
    }

    public void a(MaxAd maxAd, int i10) {
        this.f29576c.put(Integer.valueOf(i10), maxAd);
        this.f29575b.add(Integer.valueOf(i10));
    }

    public void a() {
        this.f29576c.clear();
        this.f29575b.clear();
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f29576c.remove(num);
            this.f29575b.remove(num);
        }
    }

    private void a(int i10, int i11) {
        if (this.f29576c.containsKey(Integer.valueOf(i10))) {
            this.f29576c.put(Integer.valueOf(i11), (MaxAd) this.f29576c.get(Integer.valueOf(i10)));
            this.f29575b.add(Integer.valueOf(i11));
            this.f29576c.remove(Integer.valueOf(i10));
            this.f29575b.remove(Integer.valueOf(i10));
        }
    }

    private int a(int i10, boolean z10) {
        int iC = this.f29574a.c(Integer.valueOf(i10));
        if (!z10) {
            int i11 = i10 + iC;
            while (iC < this.f29574a.size() && i11 >= ((Integer) this.f29574a.a(iC)).intValue()) {
                i11++;
                iC++;
            }
        }
        return iC;
    }
}
