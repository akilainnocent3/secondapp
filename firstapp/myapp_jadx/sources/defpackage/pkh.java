package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class pkh implements qg50<File> {
    public final File a;

    public pkh(File file) {
        gm20.c(file, "Argument must not be null");
        this.a = file;
    }

    @Override // defpackage.qg50
    public final int a() {
        return 1;
    }

    @Override // defpackage.qg50
    public final Class<File> d() {
        return this.a.getClass();
    }

    @Override // defpackage.qg50
    public final File get() {
        return this.a;
    }

    @Override // defpackage.qg50
    public final void c() {
    }
}
