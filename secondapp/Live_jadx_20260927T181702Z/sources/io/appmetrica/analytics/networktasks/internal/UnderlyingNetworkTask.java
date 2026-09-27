package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface UnderlyingNetworkTask {
    @NonNull
    String description();

    @NonNull
    FullUrlFormer<?> getFullUrlFormer();

    @NonNull
    RequestDataHolder getRequestDataHolder();

    @NonNull
    ResponseDataHolder getResponseDataHolder();

    @Nullable
    RetryPolicyConfig getRetryPolicyConfig();

    @Nullable
    SSLSocketFactory getSslSocketFactory();

    boolean onCreateTask();

    void onPerformRequest();

    void onPostRequestComplete(boolean z10);

    boolean onRequestComplete();

    void onRequestError(@Nullable Throwable th2);

    void onShouldNotExecute();

    void onSuccessfulTaskFinished();

    void onTaskAdded();

    void onTaskFinished();

    void onTaskRemoved();

    void onUnsuccessfulTaskFinished();
}
