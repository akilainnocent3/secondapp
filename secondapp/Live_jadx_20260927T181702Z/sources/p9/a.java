package p9;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import k.y0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@s1({"SMAP\nProcessLock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLock.android.kt\nandroidx/sqlite/util/ProcessLock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
@y0({y0.a.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    public static final String f120504f = "SupportSQLiteLock";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f120506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    public final File f120507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public final Lock f120508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @m
    public FileChannel f120509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l
    public static final C1150a f120503e = new C1150a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l
    public static final Map<String, Lock> f120505g = new HashMap();

    /* JADX INFO: renamed from: p9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nProcessLock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLock.android.kt\nandroidx/sqlite/util/ProcessLock$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,97:1\n384#2,7:98\n*S KotlinDebug\n*F\n+ 1 ProcessLock.android.kt\nandroidx/sqlite/util/ProcessLock$Companion\n*L\n93#1:98,7\n*E\n"})
    public static final class C1150a {
        public /* synthetic */ C1150a(x xVar) {
            this();
        }

        public final Lock b(String str) {
            Lock lock;
            synchronized (a.f120505g) {
                try {
                    Map map = a.f120505g;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lock;
        }

        public C1150a() {
        }
    }

    public a(@l String name, @m File file, boolean z10) {
        File file2;
        m0.p(name, "name");
        this.f120506a = z10;
        if (file != null) {
            file2 = new File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.f120507b = file2;
        this.f120508c = f120503e.b(name);
    }

    public static /* synthetic */ void c(a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f120506a;
        }
        aVar.b(z10);
    }

    public final void b(boolean z10) {
        this.f120508c.lock();
        if (z10) {
            try {
                File file = this.f120507b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f120507b).getChannel();
                channel.lock();
                this.f120509d = channel;
            } catch (IOException e10) {
                this.f120509d = null;
                Log.w(f120504f, "Unable to grab file lock.", e10);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f120509d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f120508c.unlock();
    }
}
