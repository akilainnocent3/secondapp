package yads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f149661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f149662b;

    public gk(File file) {
        this.f149661a = file;
        this.f149662b = new File(file.getPath() + ".bak");
    }

    public final FileInputStream a() {
        if (this.f149662b.exists()) {
            this.f149661a.delete();
            this.f149662b.renameTo(this.f149661a);
        }
        return new FileInputStream(this.f149661a);
    }

    public final fk b() throws IOException {
        if (this.f149661a.exists()) {
            if (this.f149662b.exists()) {
                this.f149661a.delete();
            } else if (!this.f149661a.renameTo(this.f149662b)) {
                ih1.d("AtomicFile", "Couldn't rename file " + this.f149661a + " to backup file " + this.f149662b);
            }
        }
        try {
            return new fk(this.f149661a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f149661a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f149661a, e10);
            }
            try {
                return new fk(this.f149661a);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.f149661a, e11);
            }
        }
    }
}
