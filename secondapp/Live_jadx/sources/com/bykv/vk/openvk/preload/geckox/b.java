package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static IThreadPoolCallback f31718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static ThreadPoolExecutor f31719s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.c f31721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IStatisticMonitor f31722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final INetWork f31723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f31724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f31725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.a f31726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f31727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f31728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f31729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f31730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f31731l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f31732m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f31733n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f31734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f31735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JSONObject f31736q;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private INetWork f31737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f31738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f31739c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Context f31740d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.c f31741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IStatisticMonitor f31742f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f31743g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.a f31744h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Long f31745i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f31746j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f31747k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f31748l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private File f31749m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f31750n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f31751o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f31752p;

        public a(Context context) {
            this.f31740d = context.getApplicationContext();
        }

        public final a a(String... strArr) {
            this.f31739c = Arrays.asList(strArr);
            return this;
        }

        public final a b(String... strArr) {
            this.f31738b = Arrays.asList(strArr);
            return this;
        }

        public final a c(String str) {
            this.f31748l = str;
            return this;
        }

        public final a a(INetWork iNetWork) {
            this.f31737a = iNetWork;
            return this;
        }

        public final a b() {
            this.f31745i = 38L;
            return this;
        }

        public final a a(long j10) {
            this.f31752p = j10;
            return this;
        }

        public final a b(String str) {
            this.f31747k = str;
            return this;
        }

        public final a a(IStatisticMonitor iStatisticMonitor) {
            this.f31742f = iStatisticMonitor;
            return this;
        }

        public final a a() {
            this.f31743g = false;
            return this;
        }

        public final a a(com.bykv.vk.openvk.preload.geckox.a.a.a aVar) {
            this.f31744h = aVar;
            return this;
        }

        public final a a(String str) {
            this.f31746j = str;
            return this;
        }

        public final a a(File file) {
            this.f31749m = file;
            return this;
        }
    }

    public /* synthetic */ b(a aVar, byte b10) {
        this(aVar);
    }

    public static Executor g() {
        return t();
    }

    public static Executor h() {
        return t();
    }

    public static ExecutorService t() {
        IThreadPoolCallback iThreadPoolCallback = f31718r;
        ExecutorService threadPool = iThreadPoolCallback != null ? iThreadPoolCallback.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (f31719s == null) {
            synchronized (b.class) {
                try {
                    if (f31719s == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        f31719s = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f31719s;
    }

    public final Context a() {
        return this.f31720a;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.a b() {
        return this.f31726g;
    }

    public final boolean c() {
        return this.f31734o;
    }

    public final List<String> d() {
        return this.f31725f;
    }

    public final List<String> e() {
        return this.f31724e;
    }

    public final JSONObject f() {
        return this.f31736q;
    }

    public final INetWork i() {
        return this.f31723d;
    }

    public final String j() {
        return this.f31730k;
    }

    public final long k() {
        return this.f31727h.longValue();
    }

    public final String l() {
        return this.f31732m;
    }

    public final String m() {
        return this.f31731l;
    }

    public final File n() {
        return this.f31733n;
    }

    public final String o() {
        return this.f31728i;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.c p() {
        return this.f31721b;
    }

    public final IStatisticMonitor q() {
        return this.f31722c;
    }

    public final String r() {
        return this.f31729j;
    }

    public final long s() {
        return this.f31735p;
    }

    private b(a aVar) {
        Context context = aVar.f31740d;
        this.f31720a = context;
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        List<String> list = aVar.f31738b;
        this.f31724e = list;
        this.f31725f = aVar.f31739c;
        this.f31721b = aVar.f31741e;
        this.f31726g = aVar.f31744h;
        Long l10 = aVar.f31745i;
        this.f31727h = l10;
        if (TextUtils.isEmpty(aVar.f31746j)) {
            this.f31728i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
        } else {
            this.f31728i = aVar.f31746j;
        }
        String str = aVar.f31747k;
        this.f31729j = str;
        this.f31731l = aVar.f31750n;
        this.f31732m = aVar.f31751o;
        this.f31735p = aVar.f31752p;
        if (aVar.f31749m == null) {
            this.f31733n = new File(context.getFilesDir(), "gecko_offline_res_x");
        } else {
            this.f31733n = aVar.f31749m;
        }
        String str2 = aVar.f31748l;
        this.f31730k = str2;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("host == null");
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        if (l10 == null) {
            throw new IllegalArgumentException("appId == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("deviceId key empty");
        }
        this.f31723d = aVar.f31737a;
        this.f31722c = aVar.f31742f;
        this.f31734o = aVar.f31743g;
    }

    public final void a(JSONObject jSONObject) {
        this.f31736q = jSONObject;
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback) {
        f31718r = iThreadPoolCallback;
    }
}
