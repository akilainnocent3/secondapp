package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5291p4 implements ArgumentsMerger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f98104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Boolean f98105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Location f98106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Boolean f98107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Integer f98108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Integer f98109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Integer f98110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Boolean f98111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Boolean f98112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f98113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Integer f98114k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Boolean f98115l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final Boolean f98116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Boolean f98117n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final Set<String> f98118o;

    public C5291p4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7, Set set) {
        this.f98104a = str;
        this.f98105b = bool;
        this.f98106c = location;
        this.f98107d = bool2;
        this.f98108e = num;
        this.f98109f = num2;
        this.f98110g = num3;
        this.f98111h = bool3;
        this.f98112i = bool4;
        this.f98113j = map;
        this.f98114k = num4;
        this.f98115l = bool5;
        this.f98116m = bool6;
        this.f98117n = bool7;
        this.f98118o = set;
    }

    public final boolean a(@NonNull C5291p4 c5291p4) {
        return equals(c5291p4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5291p4 mergeFrom(@NonNull C5291p4 c5291p4) {
        return new C5291p4((String) WrapUtils.getOrDefaultNullable(this.f98104a, c5291p4.f98104a), (Boolean) WrapUtils.getOrDefaultNullable(this.f98105b, c5291p4.f98105b), (Location) WrapUtils.getOrDefaultNullable(this.f98106c, c5291p4.f98106c), (Boolean) WrapUtils.getOrDefaultNullable(this.f98107d, c5291p4.f98107d), (Integer) WrapUtils.getOrDefaultNullable(this.f98108e, c5291p4.f98108e), (Integer) WrapUtils.getOrDefaultNullable(this.f98109f, c5291p4.f98109f), (Integer) WrapUtils.getOrDefaultNullable(this.f98110g, c5291p4.f98110g), (Boolean) WrapUtils.getOrDefaultNullable(this.f98111h, c5291p4.f98111h), (Boolean) WrapUtils.getOrDefaultNullable(this.f98112i, c5291p4.f98112i), (Map) WrapUtils.getOrDefaultNullable(this.f98113j, c5291p4.f98113j), (Integer) WrapUtils.getOrDefaultNullable(this.f98114k, c5291p4.f98114k), (Boolean) WrapUtils.getOrDefaultNullable(this.f98115l, c5291p4.f98115l), (Boolean) WrapUtils.getOrDefaultNullable(this.f98116m, c5291p4.f98116m), (Boolean) WrapUtils.getOrDefaultNullable(this.f98117n, c5291p4.f98117n), CollectionUtils.merge(this.f98118o, c5291p4.f98118o));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return equals((C5291p4) obj);
    }

    public final boolean equals(Object obj) {
        if (obj != null && C5291p4.class == obj.getClass()) {
            C5291p4 c5291p4 = (C5291p4) obj;
            if (Objects.equals(this.f98104a, c5291p4.f98104a) && Objects.equals(this.f98105b, c5291p4.f98105b) && Objects.equals(this.f98106c, c5291p4.f98106c) && Objects.equals(this.f98107d, c5291p4.f98107d) && Objects.equals(this.f98108e, c5291p4.f98108e) && Objects.equals(this.f98109f, c5291p4.f98109f) && Objects.equals(this.f98110g, c5291p4.f98110g) && Objects.equals(this.f98111h, c5291p4.f98111h) && Objects.equals(this.f98112i, c5291p4.f98112i) && Objects.equals(this.f98113j, c5291p4.f98113j) && Objects.equals(this.f98114k, c5291p4.f98114k) && Objects.equals(this.f98115l, c5291p4.f98115l) && Objects.equals(this.f98116m, c5291p4.f98116m) && Objects.equals(this.f98117n, c5291p4.f98117n) && Objects.equals(this.f98118o, c5291p4.f98118o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f98104a, this.f98105b, this.f98106c, this.f98107d, this.f98108e, this.f98109f, this.f98110g, this.f98111h, this.f98112i, this.f98113j, this.f98114k, this.f98115l, this.f98116m, this.f98117n, this.f98118o);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f98104a + "', locationTracking=" + this.f98105b + ", manualLocation=" + this.f98106c + ", firstActivationAsUpdate=" + this.f98107d + ", sessionTimeout=" + this.f98108e + ", maxReportsCount=" + this.f98109f + ", dispatchPeriod=" + this.f98110g + ", logEnabled=" + this.f98111h + ", dataSendingEnabled=" + this.f98112i + ", clidsFromClient=" + this.f98113j + ", maxReportsInDbCount=" + this.f98114k + ", nativeCrashesEnabled=" + this.f98115l + ", revenueAutoTrackingEnabled=" + this.f98116m + ", advIdentifiersTrackingEnabled=" + this.f98117n + ", autoCollectedDataSubscribers=" + this.f98118o + fw.b.f85383j;
    }

    public C5291p4(@NonNull CounterConfiguration counterConfiguration, @Nullable Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled(), new HashSet(counterConfiguration.getAutoCollectedDataSubscribers()));
    }

    public C5291p4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashSet());
    }
}
