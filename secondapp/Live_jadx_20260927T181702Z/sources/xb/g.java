package xb;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends d {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f144788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f144789b;

        public a(Context context, String str) {
            this.f144788a = context;
            this.f144789b = str;
        }

        @Override // xb.d.c
        public File a() {
            File externalCacheDir;
            File fileB = b();
            if ((fileB == null || !fileB.exists()) && (externalCacheDir = this.f144788a.getExternalCacheDir()) != null && externalCacheDir.canWrite()) {
                return this.f144789b != null ? new File(externalCacheDir, this.f144789b) : externalCacheDir;
            }
            return fileB;
        }

        @Nullable
        public final File b() {
            File cacheDir = this.f144788a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f144789b != null ? new File(cacheDir, this.f144789b) : cacheDir;
        }
    }

    public g(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public g(Context context, long j10) {
        this(context, "image_manager_disk_cache", j10);
    }

    public g(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
