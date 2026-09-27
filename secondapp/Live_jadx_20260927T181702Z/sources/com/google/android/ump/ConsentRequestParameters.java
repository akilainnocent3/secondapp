package com.google.android.ump;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class ConsentRequestParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f52011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f52012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ConsentDebugSettings f52013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f52014d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f52015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f52016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public ConsentDebugSettings f52017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String f52018d;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setAdMobAppId(@Nullable String str) {
            this.f52016b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(@Nullable ConsentDebugSettings consentDebugSettings) {
            this.f52017c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentSyncId(@RecentlyNonNull String str) {
            if (str == null) {
                str = null;
            } else if (!str.matches("^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$")) {
                Log.e("UserMessagingPlatform", "The UMP SDK requires a valid consent sync ID matching the following regex: ^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$. See the setConsentSyncId() API documentation for more details.");
                return this;
            }
            this.f52018d = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z10) {
            this.f52015a = z10;
            return this;
        }
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder, zzb zzbVar) {
        this.f52011a = builder.f52015a;
        this.f52012b = builder.f52016b;
        this.f52013c = builder.f52017c;
        this.f52014d = builder.f52018d;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f52013c;
    }

    @RecentlyNullable
    public String getConsentSyncId() {
        return this.f52014d;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f52011a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.f52012b;
    }
}
