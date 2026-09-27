package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class StartupParamsItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StartupParamsItemStatus f94993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f94994c;

    public StartupParamsItem(@Nullable String str, @NonNull StartupParamsItemStatus startupParamsItemStatus, @Nullable String str2) {
        this.f94992a = str;
        this.f94993b = startupParamsItemStatus;
        this.f94994c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StartupParamsItem.class == obj.getClass()) {
            StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
            if (Objects.equals(this.f94992a, startupParamsItem.f94992a) && this.f94993b == startupParamsItem.f94993b && Objects.equals(this.f94994c, startupParamsItem.f94994c)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getErrorDetails() {
        return this.f94994c;
    }

    @Nullable
    public String getId() {
        return this.f94992a;
    }

    @NonNull
    public StartupParamsItemStatus getStatus() {
        return this.f94993b;
    }

    public int hashCode() {
        return Objects.hash(this.f94992a, this.f94993b, this.f94994c);
    }

    @NonNull
    public String toString() {
        return "StartupParamsItem{id='" + this.f94992a + "', status=" + this.f94993b + ", errorDetails='" + this.f94994c + "'}";
    }
}
