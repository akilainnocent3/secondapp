package ql;

import android.annotation.SuppressLint;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f122475a = "Firebase-Messaging-Network-Io";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f122476b = "Firebase-Messaging-Task";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f122477c = "Firebase-Messaging-File";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f122478d = "Firebase-Messaging-Intent-Handle";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f122479e = "Firebase-Messaging-Topics-Io";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f122480f = "Firebase-Messaging-Init";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f122481g = "Firebase-Messaging-File-Io";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f122482h = "Firebase-Messaging-Rpc-Task";

    @SuppressLint({"ThreadPoolCreation"})
    public static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService b() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(f122477c));
    }

    public static Executor c() {
        return a(f122481g);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ScheduledExecutorService d() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(f122480f));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService e() {
        return tl.b.a().g(new NamedThreadFactory(f122478d), tl.c.HIGH_SPEED);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(f122475a));
    }

    public static Executor g() {
        return a(f122482h);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService h() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(f122476b));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ScheduledExecutorService i() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(f122479e));
    }
}
