package okhttp3;

import com.google.protobuf.Reader;
import defpackage.fae;
import defpackage.hce0;
import defpackage.kb5;
import defpackage.l48;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001b\u0010\r\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007R\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007R\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0015J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 R*\u0010!\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010&R*\u0010'\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010&R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010 ¨\u00063"}, d2 = {"Lokhttp3/Dispatcher;", "", "<init>", "()V", "Ljava/util/concurrent/ExecutorService;", "executorService", "(Ljava/util/concurrent/ExecutorService;)V", "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", "call", "", "enqueue$okhttp", "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "enqueue", "cancelAll", "", "executed$okhttp", "(Lokhttp3/internal/connection/RealCall;)Z", "executed", "finished$okhttp", "finished", "(Lokhttp3/internal/connection/RealCall;)V", "", "Lokhttp3/Call;", "queuedCalls", "()Ljava/util/List;", "runningCalls", "", "queuedCallsCount", "()I", "runningCallsCount", "-deprecated_executorService", "()Ljava/util/concurrent/ExecutorService;", "maxRequests", "a", "I", "getMaxRequests", "setMaxRequests", "(I)V", "maxRequestsPerHost", "b", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "Ljava/lang/Runnable;", "c", "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "idleCallback", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Dispatcher {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int maxRequests;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int maxRequestsPerHost;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public Runnable idleCallback;
    public ExecutorService d;
    public final ArrayDeque<RealCall.AsyncCall> e;
    public final ArrayDeque<RealCall.AsyncCall> f;
    public final ArrayDeque<RealCall> g;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.e = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.g = new ArrayDeque<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Dispatcher dispatcher, RealCall.AsyncCall asyncCall, RealCall realCall, RealCall.AsyncCall asyncCall2, int i) {
        Dispatcher$promoteAndExecute$Effects dispatcher$promoteAndExecute$Effects;
        RealCall.AsyncCall asyncCallA;
        if ((i & 1) != 0) {
            asyncCall = null;
        }
        if ((i & 2) != 0) {
            realCall = null;
        }
        if ((i & 4) != 0) {
            asyncCall2 = null;
        }
        _UtilJvmKt.assertLockNotHeld(dispatcher);
        boolean zIsShutdown = dispatcher.executorService().isShutdown();
        synchronized (dispatcher) {
            if (realCall != null) {
                try {
                    if (!dispatcher.g.remove(realCall)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (asyncCall2 != null) {
                asyncCall2.getCallsPerHost().decrementAndGet();
                if (!dispatcher.f.remove(asyncCall2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (asyncCall != null) {
                dispatcher.e.add(asyncCall);
                if (!asyncCall.getC().getForWebSocket() && (asyncCallA = dispatcher.a(asyncCall.getHost())) != null) {
                    asyncCall.reuseCallsPerHostFrom(asyncCallA);
                }
            }
            final Runnable runnable = (!(realCall == null && asyncCall2 == null) && (zIsShutdown || dispatcher.f.isEmpty()) && dispatcher.g.isEmpty()) ? dispatcher.idleCallback : null;
            if (zIsShutdown) {
                final List listA0 = CollectionsKt.A0(dispatcher.e);
                dispatcher.e.clear();
                dispatcher$promoteAndExecute$Effects = new Object(listA0, runnable) { // from class: okhttp3.Dispatcher$promoteAndExecute$Effects

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    public final List<RealCall.AsyncCall> callsToExecute;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final Runnable idleCallbackToRun;

                    {
                        listA0.getClass();
                        this.callsToExecute = listA0;
                        this.idleCallbackToRun = runnable;
                    }

                    public final List<RealCall.AsyncCall> getCallsToExecute() {
                        return this.callsToExecute;
                    }

                    public final Runnable getIdleCallbackToRun() {
                        return this.idleCallbackToRun;
                    }
                };
            } else {
                final ArrayList arrayList = new ArrayList();
                Iterator<RealCall.AsyncCall> it = dispatcher.e.iterator();
                it.getClass();
                while (it.hasNext()) {
                    RealCall.AsyncCall next = it.next();
                    if (dispatcher.f.size() >= dispatcher.maxRequests) {
                        break;
                    }
                    if (next.getCallsPerHost().get() < dispatcher.maxRequestsPerHost) {
                        it.remove();
                        next.getCallsPerHost().incrementAndGet();
                        arrayList.add(next);
                        dispatcher.f.add(next);
                    }
                }
                dispatcher$promoteAndExecute$Effects = new Object(arrayList, runnable) { // from class: okhttp3.Dispatcher$promoteAndExecute$Effects

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    public final List<RealCall.AsyncCall> callsToExecute;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final Runnable idleCallbackToRun;

                    {
                        arrayList.getClass();
                        this.callsToExecute = arrayList;
                        this.idleCallbackToRun = runnable;
                    }

                    public final List<RealCall.AsyncCall> getCallsToExecute() {
                        return this.callsToExecute;
                    }

                    public final Runnable getIdleCallbackToRun() {
                        return this.idleCallbackToRun;
                    }
                };
            }
        }
        int size = dispatcher$promoteAndExecute$Effects.getCallsToExecute().size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            RealCall.AsyncCall asyncCall3 = dispatcher$promoteAndExecute$Effects.getCallsToExecute().get(i2);
            if (asyncCall3 == asyncCall) {
                z = false;
            } else {
                asyncCall3.getC().getEventListener().dispatcherQueueEnd(asyncCall3.getC(), dispatcher);
            }
            if (zIsShutdown) {
                RealCall.AsyncCall.failRejected$okhttp$default(asyncCall3, null, 1, null);
            } else {
                asyncCall3.executeOn(dispatcher.executorService());
            }
        }
        if (z && asyncCall != null) {
            asyncCall.getC().getEventListener().dispatcherQueueStart(asyncCall.getC(), dispatcher);
        }
        Runnable idleCallbackToRun = dispatcher$promoteAndExecute$Effects.getIdleCallbackToRun();
        if (idleCallbackToRun != null) {
            idleCallbackToRun.run();
        }
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_executorService, reason: not valid java name */
    public final ExecutorService m147deprecated_executorService() {
        return executorService();
    }

    public final RealCall.AsyncCall a(String str) {
        Iterator<RealCall.AsyncCall> it = this.f.iterator();
        it.getClass();
        while (it.hasNext()) {
            RealCall.AsyncCall next = it.next();
            if (Intrinsics.g(next.getHost(), str)) {
                return next;
            }
        }
        Iterator<RealCall.AsyncCall> it2 = this.e.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            RealCall.AsyncCall next2 = it2.next();
            if (Intrinsics.g(next2.getHost(), str)) {
                return next2;
            }
        }
        return null;
    }

    public final synchronized void cancelAll() {
        try {
            Iterator<RealCall.AsyncCall> it = this.e.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().getC().cancel();
            }
            Iterator<RealCall.AsyncCall> it2 = this.f.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                it2.next().getC().cancel();
            }
            Iterator<RealCall> it3 = this.g.iterator();
            it3.getClass();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void enqueue$okhttp(RealCall.AsyncCall call) {
        call.getClass();
        b(this, call, null, null, 6);
    }

    public final synchronized boolean executed$okhttp(RealCall call) {
        call.getClass();
        return this.g.add(call);
    }

    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        try {
            executorService = this.d;
            if (executorService == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Reader.READ_DONE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), _UtilJvmKt.threadFactory(_UtilJvmKt.okHttpName + " Dispatcher", false));
                this.d = threadPoolExecutor;
                executorService = threadPoolExecutor;
            }
            executorService.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final void finished$okhttp(RealCall.AsyncCall call) {
        call.getClass();
        b(this, null, null, call, 3);
    }

    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized List<Call> queuedCalls() {
        List<Call> listUnmodifiableList;
        try {
            ArrayDeque<RealCall.AsyncCall> arrayDeque = this.e;
            ArrayList arrayList = new ArrayList(l48.r(arrayDeque, 10));
            Iterator<T> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((RealCall.AsyncCall) it.next()).getC());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.e.size();
    }

    public final synchronized List<Call> runningCalls() {
        List<Call> listUnmodifiableList;
        try {
            ArrayDeque<RealCall> arrayDeque = this.g;
            ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.f;
            ArrayList arrayList = new ArrayList(l48.r(arrayDeque2, 10));
            Iterator<RealCall.AsyncCall> it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getC());
            }
            listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.i0(arrayList, arrayDeque));
            listUnmodifiableList.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.f.size() + this.g.size();
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i) {
        if (i < 1) {
            kb5.a(hce0.a(i, "max < 1: "));
            return;
        }
        synchronized (this) {
            this.maxRequests = i;
            Unit unit = Unit.a;
        }
        b(this, null, null, null, 7);
    }

    public final void setMaxRequestsPerHost(int i) {
        if (i < 1) {
            kb5.a(hce0.a(i, "max < 1: "));
            return;
        }
        synchronized (this) {
            this.maxRequestsPerHost = i;
            Unit unit = Unit.a;
        }
        b(this, null, null, null, 7);
    }

    public final void finished$okhttp(RealCall call) {
        call.getClass();
        b(this, null, call, null, 5);
    }

    public Dispatcher(ExecutorService executorService) {
        this();
        this.d = executorService;
    }
}
