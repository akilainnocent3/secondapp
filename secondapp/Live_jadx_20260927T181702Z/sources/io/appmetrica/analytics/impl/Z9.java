package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f96868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileLock f96869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RandomAccessFile f96870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f96871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f96872e;

    public Z9(Context context, String str) {
        this(a(context, str));
    }

    public final synchronized void a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f96868a, "rw");
            this.f96870c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f96871d = channel;
            if (this.f96872e == 0) {
                this.f96869b = channel.lock();
            }
            this.f96872e++;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            this.f96868a.getAbsolutePath();
            int i10 = this.f96872e - 1;
            this.f96872e = i10;
            if (i10 == 0) {
                Ka.a(this.f96869b);
            }
            mo.a((Closeable) this.f96870c);
            mo.a((Closeable) this.f96871d);
            this.f96870c = null;
            this.f96869b = null;
            this.f96871d = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Z9(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public Z9(File file) {
        this.f96872e = 0;
        this.f96868a = file;
    }

    public static File a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
