package u2;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f137658b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final NativeSharedCounter f137659c = new NativeSharedCounter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f137660a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        public final m0 a(@oy.l ds.a<? extends File> produceFile) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            kotlin.jvm.internal.m0.p(produceFile, "produceFile");
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open(produceFile.invoke(), 939524096);
                try {
                    m0 m0VarB = b(parcelFileDescriptorOpen);
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    return m0VarB;
                } catch (Throwable th2) {
                    th = th2;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                parcelFileDescriptorOpen = null;
            }
        }

        public final m0 b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            int fd2 = parcelFileDescriptor.getFd();
            if (c().nativeTruncateFile(fd2) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long jNativeCreateSharedCounter = c().nativeCreateSharedCounter(fd2);
            if (jNativeCreateSharedCounter >= 0) {
                return new m0(jNativeCreateSharedCounter, null);
            }
            throw new IOException("Failed to mmap counter file");
        }

        @oy.l
        public final NativeSharedCounter c() {
            return m0.f137659c;
        }

        public final void d() {
            System.loadLibrary("datastore_shared_counter");
        }

        public a() {
        }
    }

    public /* synthetic */ m0(long j10, kotlin.jvm.internal.x xVar) {
        this(j10);
    }

    public final int b() {
        return f137659c.nativeGetCounterValue(this.f137660a);
    }

    public final int c() {
        return f137659c.nativeIncrementAndGetCounterValue(this.f137660a);
    }

    public m0(long j10) {
        this.f137660a = j10;
    }
}
