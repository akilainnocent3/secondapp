package b9;

import dr.e0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public static final a f20893c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    public static final Map<String, ReentrantLock> f20894d = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final ReentrantLock f20895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    public final f f20896b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nExclusiveLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExclusiveLock.kt\nandroidx/room/concurrent/ExclusiveLock$Companion\n+ 2 Synchronized.jvmAndroid.kt\nandroidx/room/concurrent/Synchronized_jvmAndroidKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,77:1\n22#2:78\n384#3,7:79\n*S KotlinDebug\n*F\n+ 1 ExclusiveLock.kt\nandroidx/room/concurrent/ExclusiveLock$Companion\n*L\n70#1:78\n71#1:79,7\n*E\n"})
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public final f c(String str) {
            return new f(str);
        }

        public final ReentrantLock d(String str) {
            ReentrantLock reentrantLock;
            synchronized (this) {
                try {
                    Map map = e.f20894d;
                    Object reentrantLock2 = map.get(str);
                    if (reentrantLock2 == null) {
                        reentrantLock2 = new ReentrantLock();
                        map.put(str, reentrantLock2);
                    }
                    reentrantLock = (ReentrantLock) reentrantLock2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return reentrantLock;
        }

        public a() {
        }
    }

    public e(@l String filename, boolean z10) {
        m0.p(filename, "filename");
        a aVar = f20893c;
        this.f20895a = aVar.d(filename);
        this.f20896b = z10 ? aVar.c(filename) : null;
    }

    public final <T> T b(@l ds.a<? extends T> onLocked, @l ds.l onLockError) {
        m0.p(onLocked, "onLocked");
        m0.p(onLockError, "onLockError");
        this.f20895a.lock();
        boolean z10 = false;
        try {
            f fVar = this.f20896b;
            if (fVar != null) {
                fVar.a();
            }
            z10 = true;
            try {
                T tInvoke = onLocked.invoke();
                f fVar2 = this.f20896b;
                if (fVar2 != null) {
                    fVar2.b();
                }
                this.f20895a.unlock();
                return tInvoke;
            } catch (Throwable th2) {
                f fVar3 = this.f20896b;
                if (fVar3 != null) {
                    fVar3.b();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (z10) {
                    throw th3;
                }
                onLockError.invoke(th3);
                throw new e0();
            } catch (Throwable th4) {
                this.f20895a.unlock();
                throw th4;
            }
        }
    }
}
