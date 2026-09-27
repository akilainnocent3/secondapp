package com.applovin.mediation.nativeAds.adPlacer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.p;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f30319c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30320d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30321e = 256;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30322f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f30317a = str;
    }

    public void addFixedPosition(int i10) {
        this.f30319c.add(Integer.valueOf(i10));
    }

    public String getAdUnitId() {
        return this.f30317a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f30319c;
    }

    public int getMaxAdCount() {
        return this.f30321e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f30322f;
    }

    @Nullable
    public String getPlacement() {
        return this.f30318b;
    }

    public int getRepeatingInterval() {
        return this.f30320d;
    }

    public boolean hasValidPositioning() {
        return !this.f30319c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f30320d >= 2;
    }

    public void resetFixedPositions() {
        this.f30319c.clear();
    }

    public void setMaxAdCount(int i10) {
        this.f30321e = i10;
    }

    public void setMaxPreloadedAdCount(int i10) {
        this.f30322f = i10;
    }

    public void setPlacement(@Nullable String str) {
        this.f30318b = str;
    }

    public void setRepeatingInterval(int i10) {
        if (i10 >= 2) {
            this.f30320d = i10;
            p.g("MaxAdPlacerSettings", "Repeating interval set to " + i10);
            return;
        }
        this.f30320d = 0;
        p.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i10 + ", which is less than minimum value of 2");
    }

    @NonNull
    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f30317a + "', fixedPositions=" + this.f30319c + ", repeatingInterval=" + this.f30320d + ", maxAdCount=" + this.f30321e + ", maxPreloadedAdCount=" + this.f30322f + fw.b.f85383j;
    }
}
