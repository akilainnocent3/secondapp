package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class ore implements fre.a {
    public final long a;
    public final nyo b;

    public ore(nyo nyoVar, long j) {
        this.a = j;
        this.b = nyoVar;
    }

    @Override // fre.a
    public final pre build() {
        File cacheDir = this.b.a.getCacheDir();
        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
        if (file != null && (file.isDirectory() || file.mkdirs())) {
            return new pre(file, this.a);
        }
        return null;
    }
}
