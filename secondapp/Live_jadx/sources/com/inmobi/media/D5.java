package com.inmobi.media;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class D5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E5 f54485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f54486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f54487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H5 f54488d;

    public D5(H5 h10, E5 e10) {
        this.f54488d = h10;
        this.f54485a = e10;
        this.f54486b = e10.f54550c ? null : new boolean[h10.f54762h];
    }

    public final OutputStream a(int i10) {
        FileOutputStream fileOutputStream;
        C5 c10;
        synchronized (this.f54488d) {
            try {
                E5 e10 = this.f54485a;
                if (e10.f54551d != this) {
                    throw new IllegalStateException();
                }
                if (!e10.f54550c) {
                    this.f54486b[i10] = true;
                }
                File fileB = e10.b(i10);
                try {
                    fileOutputStream = new FileOutputStream(fileB);
                } catch (FileNotFoundException unused) {
                    this.f54488d.f54756b.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileB);
                    } catch (FileNotFoundException unused2) {
                        return H5.f54754q;
                    }
                }
                c10 = new C5(this, fileOutputStream);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c10;
    }
}
