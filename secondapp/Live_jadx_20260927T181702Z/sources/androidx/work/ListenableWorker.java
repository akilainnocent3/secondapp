package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import k.j0;
import k.t0;
import k.y0;
import nj.t1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ListenableWorker {

    @NonNull
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @y0({y0.a.LIBRARY_GROUP})
        public static final class C0176a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f20004a;

            public C0176a() {
                this(e.f20076c);
            }

            @Override // androidx.work.ListenableWorker.a
            @NonNull
            public e c() {
                return this.f20004a;
            }

            public boolean equals(Object o10) {
                if (this == o10) {
                    return true;
                }
                if (o10 == null || C0176a.class != o10.getClass()) {
                    return false;
                }
                return this.f20004a.equals(((C0176a) o10).f20004a);
            }

            public int hashCode() {
                return (C0176a.class.getName().hashCode() * 31) + this.f20004a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f20004a + fw.b.f85383j;
            }

            public C0176a(@NonNull e outputData) {
                this.f20004a = outputData;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @y0({y0.a.LIBRARY_GROUP})
        public static final class b extends a {
            @Override // androidx.work.ListenableWorker.a
            @NonNull
            public e c() {
                return e.f20076c;
            }

            public boolean equals(Object o10) {
                if (this == o10) {
                    return true;
                }
                return o10 != null && b.class == o10.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @y0({y0.a.LIBRARY_GROUP})
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f20005a;

            public c() {
                this(e.f20076c);
            }

            @Override // androidx.work.ListenableWorker.a
            @NonNull
            public e c() {
                return this.f20005a;
            }

            public boolean equals(Object o10) {
                if (this == o10) {
                    return true;
                }
                if (o10 == null || c.class != o10.getClass()) {
                    return false;
                }
                return this.f20005a.equals(((c) o10).f20005a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f20005a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f20005a + fw.b.f85383j;
            }

            public c(@NonNull e outputData) {
                this.f20005a = outputData;
            }
        }

        @y0({y0.a.LIBRARY_GROUP})
        public a() {
        }

        @NonNull
        public static a a() {
            return new C0176a();
        }

        @NonNull
        public static a b(@NonNull e outputData) {
            return new C0176a(outputData);
        }

        @NonNull
        public static a d() {
            return new b();
        }

        @NonNull
        public static a e() {
            return new c();
        }

        @NonNull
        public static a f(@NonNull e outputData) {
            return new c(outputData);
        }

        @NonNull
        public abstract e c();
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
        if (appContext == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParams == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = appContext;
        this.mWorkerParams = workerParams;
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    @NonNull
    public t1<k> getForegroundInfoAsync() {
        qa.c cVarU = qa.c.u();
        cVarU.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVarU;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.c();
    }

    @NonNull
    public final e getInputData() {
        return this.mWorkerParams.d();
    }

    @Nullable
    @t0(28)
    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }

    @k.e0(from = 0)
    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.i();
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public ra.a getTaskExecutor() {
        return this.mWorkerParams.j();
    }

    @NonNull
    @t0(24)
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.k();
    }

    @NonNull
    @t0(24)
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.l();
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public i0 getWorkerFactory() {
        return this.mWorkerParams.m();
    }

    @y0({y0.a.LIBRARY_GROUP})
    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public final boolean isUsed() {
        return this.mUsed;
    }

    @NonNull
    public final t1<Void> setForegroundAsync(@NonNull k foregroundInfo) {
        this.mRunInForeground = true;
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), foregroundInfo);
    }

    @NonNull
    public t1<Void> setProgressAsync(@NonNull e data) {
        return this.mWorkerParams.f().a(getApplicationContext(), getId(), data);
    }

    @y0({y0.a.LIBRARY_GROUP})
    public void setRunInForeground(boolean runInForeground) {
        this.mRunInForeground = runInForeground;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public final void setUsed() {
        this.mUsed = true;
    }

    @NonNull
    @j0
    public abstract t1<a> startWork();

    @y0({y0.a.LIBRARY_GROUP})
    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
