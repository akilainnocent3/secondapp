package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ckh {
    public File a;
    public llh b;

    public ckh(File file, llh llhVar) {
        this.a = file;
        this.b = llhVar;
    }

    public final File a() {
        if (this.b != llh.c) {
            return this.a;
        }
        throw null;
    }

    public final String b() {
        return this.a.getPath().replace('\\', '/');
    }

    public InputStream c() {
        File file = this.a;
        llh llhVar = this.b;
        if (llhVar == llh.a || ((llhVar == llh.b && !a().exists()) || (llhVar == llh.e && !a().exists()))) {
            InputStream resourceAsStream = ckh.class.getResourceAsStream("/" + file.getPath().replace('\\', '/'));
            if (resourceAsStream != null) {
                return resourceAsStream;
            }
            throw new qyj("File not found: " + file + " (" + llhVar + ")");
        }
        try {
            return new FileInputStream(a());
        } catch (Exception e) {
            if (a().isDirectory()) {
                throw new qyj("Cannot open a stream to a directory: " + file + " (" + llhVar + ")", e);
            }
            throw new qyj("Error reading file: " + file + " (" + llhVar + ")", e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ckh)) {
            return false;
        }
        ckh ckhVar = (ckh) obj;
        return this.b == ckhVar.b && b().equals(ckhVar.b());
    }

    public final int hashCode() {
        return b().hashCode() + ((this.b.hashCode() + 37) * 67);
    }

    public final String toString() {
        return this.a.getPath().replace('\\', '/');
    }

    public ckh() {
    }
}
