package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f47098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f47099b;

    public c(File file) {
        this.f47098a = file;
        this.f47099b = new File(file.getPath() + ".bak");
    }

    public final FileInputStream a() {
        if (this.f47099b.exists()) {
            this.f47098a.delete();
            this.f47099b.renameTo(this.f47098a);
        }
        return new FileInputStream(this.f47098a);
    }

    public final b b() throws IOException {
        if (this.f47098a.exists()) {
            if (this.f47099b.exists()) {
                this.f47098a.delete();
            } else if (!this.f47098a.renameTo(this.f47099b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.f47098a + " to backup file " + this.f47099b);
            }
        }
        try {
            return new b(this.f47098a);
        } catch (FileNotFoundException unused) {
            if (!this.f47098a.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.f47098a);
            }
            try {
                return new b(this.f47098a);
            } catch (FileNotFoundException unused2) {
                throw new IOException("Couldn't create " + this.f47098a);
            }
        }
    }
}
