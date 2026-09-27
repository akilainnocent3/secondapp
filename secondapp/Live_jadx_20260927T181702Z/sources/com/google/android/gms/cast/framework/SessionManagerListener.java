package com.google.android.gms.cast.framework;

import androidx.annotation.NonNull;
import com.google.android.gms.cast.framework.Session;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface SessionManagerListener<T extends Session> {
    void onSessionEnded(@NonNull T t10, int i10);

    void onSessionEnding(@NonNull T t10);

    void onSessionResumeFailed(@NonNull T t10, int i10);

    void onSessionResumed(@NonNull T t10, boolean z10);

    void onSessionResuming(@NonNull T t10, @NonNull String str);

    void onSessionStartFailed(@NonNull T t10, int i10);

    void onSessionStarted(@NonNull T t10, @NonNull String str);

    void onSessionStarting(@NonNull T t10);

    void onSessionSuspended(@NonNull T t10, int i10);
}
