package g9;

import a9.h1;
import a9.p1;
import android.content.Context;
import android.util.Log;
import dr.w2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements m9.f, a9.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Context f86239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public final String f86240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    public final File f86241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.m
    public final Callable<InputStream> f86242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f86243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public final m9.f f86244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a9.p f86245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f86246i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends m9.f.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f86247d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11) {
            super(i11);
            this.f86247d = i10;
        }

        @Override // m9.f.a
        public void d(m9.e db2) {
            m0.p(db2, "db");
        }

        @Override // m9.f.a
        public void f(m9.e db2) {
            m0.p(db2, "db");
            int i10 = this.f86247d;
            if (i10 < 1) {
                db2.v1(i10);
            }
        }

        @Override // m9.f.a
        public void g(m9.e db2, int i10, int i11) {
            m0.p(db2, "db");
        }
    }

    public x(@oy.l Context context, @oy.m String str, @oy.m File file, @oy.m Callable<InputStream> callable, int i10, @oy.l m9.f delegate) {
        m0.p(context, "context");
        m0.p(delegate, "delegate");
        this.f86239b = context;
        this.f86240c = str;
        this.f86241d = file;
        this.f86242e = callable;
        this.f86243f = i10;
        this.f86244g = delegate;
    }

    public final void a(File file, boolean z10) throws Throwable {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f86240c != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f86239b.getAssets().open(this.f86240c));
            m0.o(readableByteChannelNewChannel, "newChannel(...)");
        } else if (this.f86241d != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f86241d).getChannel();
            m0.o(readableByteChannelNewChannel, "getChannel(...)");
        } else {
            Callable<InputStream> callable = this.f86242e;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
                m0.o(readableByteChannelNewChannel, "newChannel(...)");
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f86239b.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        m0.m(channel);
        h9.f.a(readableByteChannelNewChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        m0.m(fileCreateTempFile);
        c(fileCreateTempFile, z10);
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    public final m9.f b(File file) {
        try {
            int iM = h9.c.m(file);
            return new n9.j().a(m9.f.b.f107129f.a(this.f86239b).d(file.getAbsolutePath()).c(new a(iM, ms.u.u(iM, 1))).b());
        } catch (IOException e10) {
            throw new RuntimeException("Malformed database file, unable to read version.", e10);
        }
    }

    public final void c(File file, boolean z10) throws IllegalAccessException, IOException, InvocationTargetException {
        a9.p pVar = this.f86245h;
        if (pVar == null) {
            m0.S("databaseConfiguration");
            pVar = null;
        }
        if (pVar.f4255q == null) {
            return;
        }
        m9.f fVarB = b(file);
        try {
            m9.e writableDatabase = z10 ? fVarB.getWritableDatabase() : fVarB.getReadableDatabase();
            a9.p pVar2 = this.f86245h;
            if (pVar2 == null) {
                m0.S("databaseConfiguration");
                pVar2 = null;
            }
            p1.f fVar = pVar2.f4255q;
            m0.m(fVar);
            fVar.a(writableDatabase);
            w2 w2Var = w2.f79517a;
            xr.c.a(fVarB, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                xr.c.a(fVarB, th2);
                throw th3;
            }
        }
    }

    @Override // m9.f, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.f86246i = false;
    }

    public final void d(@oy.l a9.p databaseConfiguration) {
        m0.p(databaseConfiguration, "databaseConfiguration");
        this.f86245h = databaseConfiguration;
    }

    @Override // m9.f
    @oy.m
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // a9.r
    @oy.l
    public m9.f getDelegate() {
        return this.f86244g;
    }

    @Override // m9.f
    @oy.l
    public m9.e getReadableDatabase() {
        if (!this.f86246i) {
            h(false);
            this.f86246i = true;
        }
        return getDelegate().getReadableDatabase();
    }

    @Override // m9.f
    @oy.l
    public m9.e getWritableDatabase() {
        if (!this.f86246i) {
            h(true);
            this.f86246i = true;
        }
        return getDelegate().getWritableDatabase();
    }

    public final void h(boolean z10) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databasePath = this.f86239b.getDatabasePath(databaseName);
        a9.p pVar = this.f86245h;
        a9.p pVar2 = null;
        if (pVar == null) {
            m0.S("databaseConfiguration");
            pVar = null;
        }
        p9.a aVar = new p9.a(databaseName, this.f86239b.getFilesDir(), pVar.f4261w);
        try {
            p9.a.c(aVar, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    m0.m(databasePath);
                    a(databasePath, z10);
                    aVar.d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                m0.m(databasePath);
                int iM = h9.c.m(databasePath);
                if (iM == this.f86243f) {
                    aVar.d();
                    return;
                }
                a9.p pVar3 = this.f86245h;
                if (pVar3 == null) {
                    m0.S("databaseConfiguration");
                    pVar3 = null;
                }
                if (pVar3.f4242d.e(iM, this.f86243f) != null) {
                    aVar.d();
                    return;
                }
                a9.p pVar4 = this.f86245h;
                if (pVar4 == null) {
                    m0.S("databaseConfiguration");
                } else {
                    pVar2 = pVar4;
                }
                if (pVar2.e(iM, this.f86243f)) {
                    aVar.d();
                    return;
                }
                if (this.f86239b.deleteDatabase(databaseName)) {
                    try {
                        a(databasePath, z10);
                        w2 w2Var = w2.f79517a;
                    } catch (IOException e11) {
                        Log.w(h1.f4135b, "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w(h1.f4135b, "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.d();
                return;
            } catch (IOException e12) {
                Log.w(h1.f4135b, "Unable to read database version.", e12);
                aVar.d();
                return;
            }
        } catch (Throwable th2) {
            aVar.d();
            throw th2;
        }
        aVar.d();
        throw th2;
    }

    @Override // m9.f
    public void setWriteAheadLoggingEnabled(boolean z10) {
        getDelegate().setWriteAheadLoggingEnabled(z10);
    }
}
