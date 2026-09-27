package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.cache.a f45290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f45291c;

    public d0(Context context, com.fyber.inneractive.sdk.cache.a aVar) {
        this.f45289a = context;
        this.f45290b = aVar;
    }

    public com.fyber.inneractive.sdk.cache.m a() throws Throwable {
        try {
            if (!this.f45290b.d()) {
                new c0();
                return new com.fyber.inneractive.sdk.cache.m();
            }
            Object objA = this.f45290b.a(a(this.f45290b.c()));
            if (this.f45291c == null) {
                this.f45291c = this.f45289a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            return new com.fyber.inneractive.sdk.cache.m(objA, this.f45291c.getString(this.f45290b.b(), null));
        } catch (Exception unused) {
            b();
            return new com.fyber.inneractive.sdk.cache.m();
        }
    }

    public final void b(String str) {
        if (this.f45291c == null) {
            this.f45291c = this.f45289a.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        this.f45291c.edit().putString(this.f45290b.b(), str).apply();
    }

    public final void b() {
        if (this.f45291c == null) {
            this.f45291c = this.f45289a.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        this.f45291c.edit().remove(this.f45290b.b()).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public boolean a(String str, String str2) {
        boolean z10;
        int i10 = 1;
        i10 = 1;
        i10 = 1;
        IAlog.a("caching file %s", str);
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            try {
                fileOutputStreamOpenFileOutput = this.f45289a.openFileOutput(str, 0);
                fileOutputStreamOpenFileOutput.write(str2.getBytes());
                try {
                    IAlog.a("File cached successfully", new Object[0]);
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e10) {
                        IAlog.f("Failed closing cache file: %s", e10.getMessage());
                    }
                } catch (Exception e11) {
                    e = e11;
                    z10 = true;
                    IAlog.f("Failed caching file: %s", e.getMessage());
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (Exception e12) {
                            IAlog.f("Failed closing cache file: %s", e12.getMessage());
                        }
                    }
                    i10 = z10;
                }
            } catch (Throwable th2) {
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e13) {
                        Object[] objArr = new Object[i10];
                        objArr[0] = e13.getMessage();
                        IAlog.f("Failed closing cache file: %s", objArr);
                    }
                }
                throw th2;
            }
        } catch (Exception e14) {
            e = e14;
            z10 = false;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final String a(String str) throws Throwable {
        FileInputStream fileInputStreamOpenFileInput;
        IAlog.a("reading local file: %s", str);
        AssetFileDescriptor.AutoCloseInputStream autoCloseInputStream = 0;
        str = null;
        str = null;
        String str2 = null;
        try {
            try {
                fileInputStreamOpenFileInput = this.f45289a.openFileInput(str);
                try {
                    byte[] bArr = new byte[fileInputStreamOpenFileInput.available()];
                    fileInputStreamOpenFileInput.read(bArr);
                    String str3 = new String(bArr, "UTF-8");
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (Exception e10) {
                        IAlog.f("Failed closing local file: %s", e10.getMessage());
                    }
                    str2 = str3;
                } catch (Exception e11) {
                    e = e11;
                    if (!(e instanceof FileNotFoundException)) {
                        IAlog.a("Failed reading local file: %s", e.getMessage());
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (Exception e12) {
                                IAlog.f("Failed closing local file: %s", e12.getMessage());
                            }
                        }
                    } else {
                        throw new FileNotFoundException();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                autoCloseInputStream = "reading local file: %s";
                if (autoCloseInputStream != 0) {
                    try {
                        autoCloseInputStream.close();
                    } catch (Exception e13) {
                        IAlog.f("Failed closing local file: %s", e13.getMessage());
                    }
                }
                throw th;
            }
        } catch (Exception e14) {
            e = e14;
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th3) {
            th = th3;
            if (autoCloseInputStream != 0) {
                autoCloseInputStream.close();
            }
            throw th;
        }
        IAlog.a("local file %s read successfully", str);
        return str2;
    }
}
