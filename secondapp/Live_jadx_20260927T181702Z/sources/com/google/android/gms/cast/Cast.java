package com.google.android.gms.cast;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.io.IOException;
import java.util.UUID;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class Cast {
    public static final int ACTIVE_INPUT_STATE_NO = 0;
    public static final int ACTIVE_INPUT_STATE_UNKNOWN = -1;
    public static final int ACTIVE_INPUT_STATE_YES = 1;

    @NonNull
    public static final Api<CastOptions> API;

    @NonNull
    public static final CastApi CastApi;

    @NonNull
    public static final String EXTRA_APP_NO_LONGER_RUNNING = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
    public static final int MAX_MESSAGE_LENGTH = 65536;
    public static final int MAX_NAMESPACE_LENGTH = 128;
    public static final int STANDBY_STATE_NO = 0;
    public static final int STANDBY_STATE_UNKNOWN = -1;
    public static final int STANDBY_STATE_YES = 1;

    @h1
    static final Api.AbstractClientBuilder zza;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface ApplicationConnectionResult extends Result {
        @Nullable
        ApplicationMetadata getApplicationMetadata();

        @Nullable
        String getApplicationStatus();

        @Nullable
        String getSessionId();

        boolean getWasLaunched();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Deprecated
    public interface CastApi {
        int getActiveInputState(@NonNull GoogleApiClient googleApiClient) throws IllegalStateException;

        @Nullable
        ApplicationMetadata getApplicationMetadata(@NonNull GoogleApiClient googleApiClient) throws IllegalStateException;

        @Nullable
        String getApplicationStatus(@NonNull GoogleApiClient googleApiClient) throws IllegalStateException;

        int getStandbyState(@NonNull GoogleApiClient googleApiClient) throws IllegalStateException;

        double getVolume(@NonNull GoogleApiClient googleApiClient) throws IllegalStateException;

        boolean isMute(@NonNull GoogleApiClient googleApiClient) throws IllegalStateException;

        @NonNull
        PendingResult<ApplicationConnectionResult> joinApplication(@NonNull GoogleApiClient googleApiClient);

        @NonNull
        PendingResult<ApplicationConnectionResult> joinApplication(@NonNull GoogleApiClient googleApiClient, @NonNull String str);

        @NonNull
        PendingResult<ApplicationConnectionResult> joinApplication(@NonNull GoogleApiClient googleApiClient, @NonNull String str, @NonNull String str2);

        @NonNull
        PendingResult<ApplicationConnectionResult> launchApplication(@NonNull GoogleApiClient googleApiClient, @NonNull String str);

        @NonNull
        PendingResult<ApplicationConnectionResult> launchApplication(@NonNull GoogleApiClient googleApiClient, @NonNull String str, @NonNull LaunchOptions launchOptions);

        @NonNull
        @Deprecated
        PendingResult<ApplicationConnectionResult> launchApplication(@NonNull GoogleApiClient googleApiClient, @NonNull String str, boolean z10);

        @NonNull
        PendingResult<Status> leaveApplication(@NonNull GoogleApiClient googleApiClient);

        void removeMessageReceivedCallbacks(@NonNull GoogleApiClient googleApiClient, @NonNull String str) throws IOException, IllegalArgumentException;

        void requestStatus(@NonNull GoogleApiClient googleApiClient) throws IllegalStateException, IOException;

        @NonNull
        PendingResult<Status> sendMessage(@NonNull GoogleApiClient googleApiClient, @NonNull String str, @NonNull String str2);

        void setMessageReceivedCallbacks(@NonNull GoogleApiClient googleApiClient, @NonNull String str, @NonNull MessageReceivedCallback messageReceivedCallback) throws IllegalStateException, IOException;

        void setMute(@NonNull GoogleApiClient googleApiClient, boolean z10) throws IllegalStateException, IOException;

        void setVolume(@NonNull GoogleApiClient googleApiClient, double d10) throws IllegalStateException, IOException, IllegalArgumentException;

        @NonNull
        PendingResult<Status> stopApplication(@NonNull GoogleApiClient googleApiClient);

        @NonNull
        PendingResult<Status> stopApplication(@NonNull GoogleApiClient googleApiClient, @NonNull String str);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class CastOptions implements Api.ApiOptions.HasOptions {
        final CastDevice zza;
        final Listener zzb;
        final Bundle zzc;
        final int zzd;
        final String zze = UUID.randomUUID().toString();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Builder {
            final CastDevice zza;
            final Listener zzb;
            private int zzc;
            private Bundle zzd;

            public Builder(@NonNull CastDevice castDevice, @NonNull Listener listener) {
                Preconditions.checkNotNull(castDevice, "CastDevice parameter cannot be null");
                Preconditions.checkNotNull(listener, "CastListener parameter cannot be null");
                this.zza = castDevice;
                this.zzb = listener;
                this.zzc = 0;
            }

            @NonNull
            public CastOptions build() {
                return new CastOptions(this, null);
            }

            @NonNull
            public Builder setVerboseLoggingEnabled(boolean z10) {
                this.zzc = z10 ? 1 : 0;
                return this;
            }

            @NonNull
            public final Builder zzc(@NonNull Bundle bundle) {
                this.zzd = bundle;
                return this;
            }
        }

        public /* synthetic */ CastOptions(Builder builder, zzn zznVar) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
            this.zzd = builder.zzc;
            this.zzc = builder.zzd;
        }

        @NonNull
        @Deprecated
        public static Builder builder(@NonNull CastDevice castDevice, @NonNull Listener listener) {
            return new Builder(castDevice, listener);
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CastOptions)) {
                return false;
            }
            CastOptions castOptions = (CastOptions) obj;
            return Objects.equal(this.zza, castOptions.zza) && Objects.checkBundlesEquality(this.zzc, castOptions.zzc) && this.zzd == castOptions.zzd && Objects.equal(this.zze, castOptions.zze);
        }

        public int hashCode() {
            return Objects.hashCode(this.zza, this.zzc, Integer.valueOf(this.zzd), this.zze);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface MessageReceivedCallback {
        void onMessageReceived(@NonNull CastDevice castDevice, @NonNull String str, @NonNull String str2);
    }

    static {
        zze zzeVar = new zze();
        zza = zzeVar;
        API = new Api<>("Cast.API", zzeVar, com.google.android.gms.cast.internal.zzak.zza);
        CastApi = new zzm();
    }

    private Cast() {
    }

    @ShowFirstParty
    public static zzr zza(Context context, CastOptions castOptions) {
        return new zzbt(context, castOptions);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Listener {
        public void onApplicationStatusChanged() {
        }

        public void onDeviceNameChanged() {
        }

        public void onVolumeChanged() {
        }

        public void onActiveInputStateChanged(int i10) {
        }

        public void onApplicationDisconnected(int i10) {
        }

        public void onApplicationMetadataChanged(@Nullable ApplicationMetadata applicationMetadata) {
        }

        public void onStandbyStateChanged(int i10) {
        }
    }
}
