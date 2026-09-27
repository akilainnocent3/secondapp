package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class NetworkTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98936a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f98937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IExecutionPolicy f98938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExponentialBackoffPolicy f98939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final UnderlyingNetworkTask f98940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f98941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f98942g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Method {
        GET,
        POST
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i10);
    }

    public NetworkTask(@NonNull Executor executor, @NonNull IExecutionPolicy iExecutionPolicy, @NonNull ExponentialBackoffPolicy exponentialBackoffPolicy, @NonNull UnderlyingNetworkTask underlyingNetworkTask, @NonNull List<ShouldTryNextHostCondition> list, @NonNull String str) {
        this.f98937b = executor;
        this.f98938c = iExecutionPolicy;
        this.f98939d = exponentialBackoffPolicy;
        this.f98940e = underlyingNetworkTask;
        this.f98941f = list;
        this.f98942g = str;
    }

    private synchronized boolean a(int i10) {
        if (!a(i10)) {
            return false;
        }
        this.f98936a = i10;
        return true;
    }

    @NonNull
    public String description() {
        return this.f98940e.description();
    }

    @NonNull
    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f98938c;
    }

    @NonNull
    public Executor getExecutor() {
        return this.f98937b;
    }

    @NonNull
    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f98939d;
    }

    @NonNull
    public RequestDataHolder getRequestDataHolder() {
        return this.f98940e.getRequestDataHolder();
    }

    @NonNull
    public ResponseDataHolder getResponseDataHolder() {
        return this.f98940e.getResponseDataHolder();
    }

    @Nullable
    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f98940e.getRetryPolicyConfig();
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.f98940e.getSslSocketFactory();
    }

    @NonNull
    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f98940e;
    }

    @Nullable
    public String getUrl() {
        return this.f98940e.getFullUrlFormer().getUrl();
    }

    @NonNull
    public String getUserAgent() {
        return this.f98942g;
    }

    public boolean isRemoved() {
        return this.f98936a == 9;
    }

    public boolean onCreateNetworkTask() {
        if (a(3)) {
            return this.f98940e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean zA = a(4);
        if (zA) {
            this.f98940e.getFullUrlFormer().incrementAttemptNumber();
            this.f98940e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f98940e.onPerformRequest();
        }
        return zA;
    }

    public boolean onRequestComplete() {
        boolean zOnRequestComplete;
        boolean z10;
        synchronized (this) {
            try {
                if (a(5, 6)) {
                    zOnRequestComplete = this.f98940e.onRequestComplete();
                    if (zOnRequestComplete) {
                        this.f98936a = 5;
                    } else {
                        this.f98936a = 6;
                    }
                    z10 = true;
                } else {
                    zOnRequestComplete = false;
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f98940e.onPostRequestComplete(zOnRequestComplete);
        }
        return zOnRequestComplete;
    }

    public void onRequestError(@Nullable Throwable th2) {
        if (a(6)) {
            this.f98940e.onRequestError(th2);
        }
    }

    public void onShouldNotExecute() {
        if (a(7)) {
            this.f98940e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean zA = a(2);
        if (zA) {
            this.f98940e.onTaskAdded();
        }
        return zA;
    }

    public void onTaskFinished() {
        int i10;
        boolean zA;
        synchronized (this) {
            i10 = this.f98936a;
            zA = a(8);
        }
        if (zA) {
            this.f98940e.onTaskFinished();
            if (i10 == 5) {
                this.f98940e.onSuccessfulTaskFinished();
            } else if (i10 == 6 || i10 == 7) {
                this.f98940e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (a(9)) {
            this.f98940e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean zHasMoreHosts;
        boolean z10;
        int i10;
        try {
            zHasMoreHosts = this.f98940e.getFullUrlFormer().hasMoreHosts();
            int responseCode = this.f98940e.getResponseDataHolder().getResponseCode();
            Iterator it = this.f98941f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                    z10 = false;
                    break;
                }
            }
            i10 = this.f98936a;
        } catch (Throwable th2) {
            throw th2;
        }
        return i10 != 9 && i10 != 8 && zHasMoreHosts && z10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0065 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x0018, B:7:0x001b, B:49:0x0077, B:52:0x0081, B:15:0x002a, B:25:0x003f, B:26:0x0042, B:28:0x0047, B:30:0x004c, B:32:0x0051, B:38:0x005d, B:39:0x0060, B:41:0x0065, B:43:0x006a, B:47:0x0071, B:53:0x0084), top: B:58:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x006a A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x0018, B:7:0x001b, B:49:0x0077, B:52:0x0081, B:15:0x002a, B:25:0x003f, B:26:0x0042, B:28:0x0047, B:30:0x004c, B:32:0x0051, B:38:0x005d, B:39:0x0060, B:41:0x0065, B:43:0x006a, B:47:0x0071, B:53:0x0084), top: B:58:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0076  */
    private synchronized boolean a(int... iArr) {
        Boolean bool;
        Boolean bool2;
        Boolean boolValueOf;
        try {
            bool = Boolean.TRUE;
            int i10 = this.f98936a;
            for (int i11 : iArr) {
                boolean z10 = true;
                switch (e.a(i11)) {
                    case 0:
                        boolValueOf = null;
                        break;
                    case 1:
                        if (i10 != 1) {
                            z10 = false;
                        }
                        boolValueOf = Boolean.valueOf(z10);
                        break;
                    case 2:
                        if (i10 == 2) {
                            boolValueOf = Boolean.TRUE;
                        } else if (i10 == 9) {
                            boolValueOf = Boolean.FALSE;
                        } else {
                            boolValueOf = null;
                        }
                        break;
                    case 3:
                        if (i10 == 3 || i10 == 5 || i10 == 6) {
                            boolValueOf = Boolean.TRUE;
                        } else if (i10 == 9) {
                            boolValueOf = Boolean.FALSE;
                        } else {
                            boolValueOf = null;
                        }
                        break;
                    case 4:
                    case 5:
                        if (i10 == 4) {
                            boolValueOf = Boolean.TRUE;
                        } else if (i10 == 9) {
                            boolValueOf = Boolean.FALSE;
                        } else {
                            boolValueOf = null;
                        }
                        break;
                    case 6:
                        if (i10 == 3) {
                            boolValueOf = Boolean.TRUE;
                        } else if (i10 == 2) {
                            boolValueOf = Boolean.TRUE;
                        } else if (i10 == 9) {
                            boolValueOf = Boolean.FALSE;
                        } else {
                            boolValueOf = null;
                        }
                        break;
                    case 7:
                        if (i10 == 5 || i10 == 6 || i10 == 7 || i10 == 2 || i10 == 3 || i10 == 4) {
                            boolValueOf = Boolean.TRUE;
                        } else if (i10 == 9) {
                            boolValueOf = Boolean.FALSE;
                        } else {
                            boolValueOf = null;
                        }
                        break;
                    case 8:
                        if (i10 == 1) {
                            boolValueOf = null;
                        } else {
                            if (i10 == 9) {
                                z10 = false;
                            }
                            boolValueOf = Boolean.valueOf(z10);
                        }
                        break;
                    default:
                        boolValueOf = Boolean.FALSE;
                        break;
                }
                if (!Boolean.TRUE.equals(boolValueOf)) {
                    bool = boolValueOf;
                    bool2 = Boolean.TRUE;
                    bool2.equals(bool);
                }
            }
            bool2 = Boolean.TRUE;
            bool2.equals(bool);
        } catch (Throwable th2) {
            throw th2;
        }
        return bool2.equals(bool);
    }
}
