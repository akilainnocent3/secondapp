package xb;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends d {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f144790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f144791b;

        public a(Context context, String str) {
            this.f144790a = context;
            this.f144791b = str;
        }

        @Override // xb.d.c
        public File a() {
            File cacheDir = this.f144790a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f144791b != null ? new File(cacheDir, this.f144791b) : cacheDir;
        }
    }

    public h(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public h(Context context, long j10) {
        this(context, "image_manager_disk_cache", j10);
    }

    public h(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
