package com.fyber.inneractive.sdk.player.cache;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f45435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f45436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f45438d;

    public d(g gVar, e eVar) {
        this.f45438d = gVar;
        this.f45435a = eVar;
        this.f45436b = eVar.f45441c ? null : new boolean[gVar.f45452g];
    }

    public final void a(byte[] bArr) {
        OutputStream cVar;
        FileOutputStream fileOutputStream;
        g gVar = this.f45438d;
        if (gVar.f45452g <= 0) {
            throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.f45438d.f45452g);
        }
        synchronized (gVar) {
            try {
                e eVar = this.f45435a;
                if (eVar.f45442d != this) {
                    throw new IllegalStateException();
                }
                if (!eVar.f45441c) {
                    this.f45436b[0] = true;
                }
                File fileB = eVar.b(0);
                try {
                    fileOutputStream = new FileOutputStream(fileB);
                } catch (FileNotFoundException unused) {
                    this.f45438d.f45446a.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileB);
                    } catch (FileNotFoundException unused2) {
                        cVar = g.f45445q;
                    }
                }
                cVar = new c(this, fileOutputStream);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            cVar.write(bArr);
            Charset charset = l.f45468a;
            try {
                cVar.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused3) {
            }
        } catch (Throwable th3) {
            Charset charset2 = l.f45468a;
            if (cVar != null) {
                try {
                    cVar.close();
                } catch (RuntimeException e11) {
                    throw e11;
                } catch (Exception unused4) {
                }
            }
            throw th3;
        }
    }

    public final void a() {
        if (this.f45437c) {
            g.a(this.f45438d, this, false);
            this.f45438d.c(this.f45435a.f45439a);
        } else {
            g.a(this.f45438d, this, true);
        }
    }
}
