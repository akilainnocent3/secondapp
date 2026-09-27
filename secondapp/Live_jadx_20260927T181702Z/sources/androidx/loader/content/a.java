package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e2.p0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import k.y0;
import u1.y;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<D> extends c<D> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile a<D>.RunnableC0099a mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile a<D>.RunnableC0099a mTask;
    long mUpdateThrottle;

    /* JADX INFO: renamed from: androidx.loader.content.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class RunnableC0099a extends d<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final CountDownLatch f13483r = new CountDownLatch(1);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f13484s;

        public RunnableC0099a() {
        }

        @Override // androidx.loader.content.d
        public void m(D d10) {
            try {
                a.this.dispatchOnCancelled(this, d10);
            } finally {
                this.f13483r.countDown();
            }
        }

        @Override // androidx.loader.content.d
        public void n(D d10) {
            try {
                a.this.dispatchOnLoadComplete(this, d10);
            } finally {
                this.f13483r.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13484s = false;
            a.this.executePendingTask();
        }

        @Override // androidx.loader.content.d
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.onLoadInBackground();
            } catch (y e10) {
                if (k()) {
                    return null;
                }
                throw e10;
            }
        }

        public void v() {
            try {
                this.f13483r.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public a(@NonNull Context context) {
        this(context, d.f13501m);
    }

    public void dispatchOnCancelled(a<D>.RunnableC0099a runnableC0099a, D d10) {
        onCanceled(d10);
        if (this.mCancellingTask == runnableC0099a) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(a<D>.RunnableC0099a runnableC0099a, D d10) {
        if (this.mTask != runnableC0099a) {
            dispatchOnCancelled(runnableC0099a, d10);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d10);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d10);
    }

    @Override // androidx.loader.content.c
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f13484s);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f13484s);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            p0.c(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            p0.b(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f13484s) {
            this.mTask.f13484s = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.e(this.mExecutor, null);
        } else {
            this.mTask.f13484s = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    @Nullable
    public abstract D loadInBackground();

    @Override // androidx.loader.content.c
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.f13484s) {
                this.mTask.f13484s = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.f13484s) {
            this.mTask.f13484s = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        boolean zA = this.mTask.a(false);
        if (zA) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zA;
    }

    @Override // androidx.loader.content.c
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new RunnableC0099a();
        executePendingTask();
    }

    @Nullable
    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j10) {
        this.mUpdateThrottle = j10;
        if (j10 != 0) {
            this.mHandler = new Handler();
        }
    }

    @y0({y0.a.LIBRARY_GROUP})
    public void waitForLoader() {
        a<D>.RunnableC0099a runnableC0099a = this.mTask;
        if (runnableC0099a != null) {
            runnableC0099a.v();
        }
    }

    public a(@NonNull Context context, @NonNull Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }

    public void cancelLoadInBackground() {
    }

    public void onCanceled(@Nullable D d10) {
    }
}
