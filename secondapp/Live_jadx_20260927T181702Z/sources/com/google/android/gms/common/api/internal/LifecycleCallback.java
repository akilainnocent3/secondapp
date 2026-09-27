package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import k.j0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@KeepForSdk
public class LifecycleCallback {

    @NonNull
    @KeepForSdk
    protected final LifecycleFragment mLifecycleFragment;

    @KeepForSdk
    public LifecycleCallback(@NonNull LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    @NonNull
    @KeepForSdk
    public static LifecycleFragment getFragment(@NonNull Activity activity) {
        return getFragment(new LifecycleActivity(activity));
    }

    @NonNull
    @KeepForSdk
    public Activity getActivity() {
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        Preconditions.checkNotNull(lifecycleActivity);
        return lifecycleActivity;
    }

    @NonNull
    @KeepForSdk
    public static LifecycleFragment getFragment(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public static LifecycleFragment getFragment(@NonNull LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.zza()) {
            return zzd.zza(lifecycleActivity.zzd());
        }
        if (lifecycleActivity.zzb()) {
            return zza.zza(lifecycleActivity.zzc());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @KeepForSdk
    @j0
    public void onDestroy() {
    }

    @KeepForSdk
    @j0
    public void onResume() {
    }

    @KeepForSdk
    @j0
    public void onStart() {
    }

    @KeepForSdk
    @j0
    public void onStop() {
    }

    @KeepForSdk
    @j0
    public void onCreate(@Nullable Bundle bundle) {
    }

    @KeepForSdk
    @j0
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @KeepForSdk
    @j0
    public void onActivityResult(int i10, int i11, @Nullable Intent intent) {
    }

    @KeepForSdk
    @j0
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }
}
