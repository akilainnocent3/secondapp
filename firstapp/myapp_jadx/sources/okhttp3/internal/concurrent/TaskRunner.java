package okhttp3.internal.concurrent;

import com.google.protobuf.Reader;
import defpackage.ddk0;
import defpackage.hce0;
import defpackage.ib5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0010\u0018\u0000  2\u00020\u0001:\u0003!\" B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "backend", "Ljava/util/logging/Logger;", "logger", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner$Backend;Ljava/util/logging/Logger;)V", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "", "kickCoordinator$okhttp", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "kickCoordinator", "Lokhttp3/internal/concurrent/Task;", "awaitTaskToRun", "()Lokhttp3/internal/concurrent/Task;", "newQueue", "()Lokhttp3/internal/concurrent/TaskQueue;", "", "activeQueues", "()Ljava/util/List;", "cancelAll", "()V", "a", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "getBackend", "()Lokhttp3/internal/concurrent/TaskRunner$Backend;", "b", "Ljava/util/logging/Logger;", "getLogger$okhttp", "()Ljava/util/logging/Logger;", "Companion", "Backend", "RealBackend", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaskRunner implements Lockable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final TaskRunner INSTANCE;
    public static final Logger z;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Backend backend;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Logger logger;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int i;
    public final ArrayList v;
    public final ArrayList w;
    public final TaskRunner$runnable$1 y;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H&J\"\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000bH&J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "nanoTime", "", "coordinatorNotify", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "coordinatorWait", "nanos", "decorate", "Ljava/util/concurrent/BlockingQueue;", "T", "queue", "execute", "runnable", "Ljava/lang/Runnable;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Backend {
        void coordinatorNotify(TaskRunner taskRunner);

        void coordinatorWait(TaskRunner taskRunner, long nanos);

        <T> BlockingQueue<T> decorate(BlockingQueue<T> queue);

        void execute(TaskRunner taskRunner, Runnable runnable);

        long nanoTime();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "<init>", "()V", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger getLogger() {
            return TaskRunner.z;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "", "nanoTime", "()J", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "", "coordinatorNotify", "(Lokhttp3/internal/concurrent/TaskRunner;)V", "nanos", "coordinatorWait", "(Lokhttp3/internal/concurrent/TaskRunner;J)V", "T", "Ljava/util/concurrent/BlockingQueue;", "queue", "decorate", "(Ljava/util/concurrent/BlockingQueue;)Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "runnable", "execute", "(Lokhttp3/internal/concurrent/TaskRunner;Ljava/lang/Runnable;)V", "shutdown", "()V", "Ljava/util/concurrent/ThreadPoolExecutor;", "a", "Ljava/util/concurrent/ThreadPoolExecutor;", "getExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RealBackend implements Backend {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final ThreadPoolExecutor executor;

        public RealBackend(ThreadFactory threadFactory) {
            threadFactory.getClass();
            this.executor = new ThreadPoolExecutor(0, Reader.READ_DONE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorNotify(TaskRunner taskRunner) {
            taskRunner.getClass();
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorWait(TaskRunner taskRunner, long nanos) throws InterruptedException {
            taskRunner.getClass();
            if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(taskRunner)) {
                ddk0.a(Thread.currentThread().getName(), " MUST hold lock on ", taskRunner);
                return;
            }
            if (nanos > 0) {
                long j = nanos / 1000000;
                long j2 = nanos - (1000000 * j);
                if (j > 0 || nanos > 0) {
                    taskRunner.wait(j, (int) j2);
                }
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public <T> BlockingQueue<T> decorate(BlockingQueue<T> queue) {
            queue.getClass();
            return queue;
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(TaskRunner taskRunner, Runnable runnable) {
            taskRunner.getClass();
            runnable.getClass();
            this.executor.execute(runnable);
        }

        public final ThreadPoolExecutor getExecutor() {
            return this.executor;
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long nanoTime() {
            return System.nanoTime();
        }

        public final void shutdown() {
            this.executor.shutdown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        logger.getClass();
        z = logger;
        INSTANCE = new TaskRunner(new RealBackend(_UtilJvmKt.threadFactory(_UtilJvmKt.okHttpName + " TaskRunner", true)), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [okhttp3.internal.concurrent.TaskRunner$runnable$1] */
    public TaskRunner(Backend backend, Logger logger) {
        backend.getClass();
        logger.getClass();
        this.backend = backend;
        this.logger = logger;
        this.c = 10000;
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.y = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                Task taskAwaitTaskToRun;
                long jNanoTime;
                Task taskAwaitTaskToRun2;
                TaskRunner taskRunner = this.a;
                synchronized (taskRunner) {
                    taskRunner.i++;
                    taskAwaitTaskToRun = taskRunner.awaitTaskToRun();
                }
                if (taskAwaitTaskToRun == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                while (true) {
                    try {
                        threadCurrentThread.setName(taskAwaitTaskToRun.getName());
                        Logger logger2 = this.a.getLogger();
                        TaskQueue queue = taskAwaitTaskToRun.getQueue();
                        queue.getClass();
                        boolean zIsLoggable = logger2.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = queue.getTaskRunner().getBackend().nanoTime();
                            TaskLoggerKt.access$log(logger2, taskAwaitTaskToRun, queue, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jRunOnce = taskAwaitTaskToRun.runOnce();
                            if (zIsLoggable) {
                                TaskLoggerKt.access$log(logger2, taskAwaitTaskToRun, queue, "finished run in " + TaskLoggerKt.formatDuration(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
                            }
                            TaskRunner taskRunner2 = this.a;
                            synchronized (taskRunner2) {
                                TaskRunner.access$afterRun(taskRunner2, taskAwaitTaskToRun, jRunOnce, true);
                                taskAwaitTaskToRun2 = taskRunner2.awaitTaskToRun();
                            }
                            if (taskAwaitTaskToRun2 == null) {
                                threadCurrentThread.setName(name);
                                return;
                            }
                            taskAwaitTaskToRun = taskAwaitTaskToRun2;
                        } catch (Throwable th) {
                            if (zIsLoggable) {
                                TaskLoggerKt.access$log(logger2, taskAwaitTaskToRun, queue, "failed a run in " + TaskLoggerKt.formatDuration(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            TaskRunner taskRunner3 = this.a;
                            synchronized (taskRunner3) {
                                TaskRunner.access$afterRun(taskRunner3, taskAwaitTaskToRun, -1L, false);
                                Unit unit = Unit.a;
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                                threadCurrentThread.setName(name);
                                return;
                            }
                        } catch (Throwable th3) {
                            threadCurrentThread.setName(name);
                            throw th3;
                        }
                    }
                }
            }
        };
    }

    public static final void access$afterRun(TaskRunner taskRunner, Task task, long j, boolean z2) {
        taskRunner.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(taskRunner)) {
            ddk0.a(Thread.currentThread().getName(), " MUST hold lock on ", taskRunner);
            return;
        }
        TaskQueue queue = task.getQueue();
        queue.getClass();
        if (queue.getActiveTask() != task) {
            ib5.a("Check failed.");
            return;
        }
        boolean cancelActiveTask$okhttp = queue.getCancelActiveTask();
        queue.setCancelActiveTask$okhttp(false);
        queue.setActiveTask$okhttp(null);
        taskRunner.v.remove(queue);
        if (j != -1 && !cancelActiveTask$okhttp && !queue.getShutdown()) {
            queue.scheduleAndDecide$okhttp(task, j, true);
        }
        if (queue.getFutureTasks$okhttp().isEmpty()) {
            return;
        }
        taskRunner.w.add(queue);
        if (z2) {
            return;
        }
        taskRunner.a();
    }

    public final void a() {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            ddk0.a(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return;
        }
        int i = this.f;
        if (i > this.i) {
            return;
        }
        this.f = i + 1;
        this.backend.execute(this, this.y);
    }

    public final List<TaskQueue> activeQueues() {
        ArrayList arrayListI0;
        synchronized (this) {
            arrayListI0 = CollectionsKt.i0(this.w, this.v);
        }
        return arrayListI0;
    }

    public final Task awaitTaskToRun() {
        boolean z2;
        Task task = null;
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            ddk0.a(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return null;
        }
        while (true) {
            ArrayList arrayList = this.w;
            if (arrayList.isEmpty()) {
                return task;
            }
            Backend backend = this.backend;
            long jNanoTime = backend.nanoTime();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            Task task2 = task;
            int i = 0;
            while (true) {
                if (i >= size) {
                    task = task;
                    backend = backend;
                    z2 = false;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                Task task3 = ((TaskQueue) obj).getFutureTasks$okhttp().get(0);
                task = task;
                backend = backend;
                long jMax = Math.max(0L, task3.getNextExecuteNanoTime() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task2 != null) {
                        z2 = true;
                        break;
                    }
                    task2 = task3;
                }
            }
            if (task2 != null) {
                if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
                    ddk0.a(Thread.currentThread().getName(), " MUST hold lock on ", this);
                    return task;
                }
                task2.setNextExecuteNanoTime$okhttp(-1L);
                TaskQueue queue = task2.getQueue();
                queue.getClass();
                queue.getFutureTasks$okhttp().remove(task2);
                arrayList.remove(queue);
                queue.setActiveTask$okhttp(task2);
                this.v.add(queue);
                if (z2 || (!this.d && !arrayList.isEmpty())) {
                    a();
                }
                return task2;
            }
            if (this.d) {
                if (jMin >= this.e - jNanoTime) {
                    return task;
                }
                backend.coordinatorNotify(this);
                return task;
            }
            Backend backend2 = backend;
            this.d = true;
            this.e = jNanoTime + jMin;
            try {
                try {
                    backend2.coordinatorWait(this, jMin);
                } catch (InterruptedException unused) {
                    cancelAll();
                }
                this.d = false;
                task = task;
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        }
    }

    public final void cancelAll() {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            ddk0.a(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return;
        }
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((TaskQueue) arrayList.get(size)).cancelAllAndDecide$okhttp();
            }
        }
        ArrayList arrayList2 = this.w;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            TaskQueue taskQueue = (TaskQueue) arrayList2.get(size2);
            taskQueue.cancelAllAndDecide$okhttp();
            if (taskQueue.getFutureTasks$okhttp().isEmpty()) {
                arrayList2.remove(size2);
            }
        }
    }

    public final Backend getBackend() {
        return this.backend;
    }

    /* JADX INFO: renamed from: getLogger$okhttp, reason: from getter */
    public final Logger getLogger() {
        return this.logger;
    }

    public final void kickCoordinator$okhttp(TaskQueue taskQueue) {
        taskQueue.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            ddk0.a(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return;
        }
        if (taskQueue.getActiveTask() == null) {
            boolean zIsEmpty = taskQueue.getFutureTasks$okhttp().isEmpty();
            ArrayList arrayList = this.w;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                _UtilCommonKt.addIfAbsent(arrayList, taskQueue);
            }
        }
        if (this.d) {
            this.backend.coordinatorNotify(this);
        } else {
            a();
        }
    }

    public final TaskQueue newQueue() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new TaskQueue(this, hce0.a(i, "Q"));
    }

    public /* synthetic */ TaskRunner(Backend backend, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(backend, (i & 2) != 0 ? z : logger);
    }
}
