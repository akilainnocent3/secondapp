package wd;

import android.content.Context;
import android.util.Log;
import androidx.media3.session.fe;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f142832g = "lib";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<String> f142833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e.b f142834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e.a f142835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f142836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f142837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e.d f142838f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f142839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f142840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f142841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e.c f142842e;

        public a(final Context val$context, final String val$library, final String val$version, final e.c val$listener) {
            this.f142839b = val$context;
            this.f142840c = val$library;
            this.f142841d = val$version;
            this.f142842e = val$listener;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                f.this.j(this.f142839b, this.f142840c, this.f142841d);
                this.f142842e.success();
            } catch (UnsatisfiedLinkError e10) {
                this.f142842e.a(e10);
            } catch (c e11) {
                this.f142842e.a(e11);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f142844a;

        public b(final String val$mappedLibraryName) {
            this.f142844a = val$mappedLibraryName;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File dir, String filename) {
            return filename.startsWith(this.f142844a);
        }
    }

    public f() {
        this(new g(), new wd.a());
    }

    public void b(final Context context, final String library, final String currentVersion) {
        File fileD = d(context);
        File fileE = e(context, library, currentVersion);
        File[] fileArrListFiles = fileD.listFiles(new b(this.f142834b.e(library)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f142836d || !file.getAbsolutePath().equals(fileE.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public f c() {
        this.f142836d = true;
        return this;
    }

    public File d(final Context context) {
        return context.getDir(f142832g, 0);
    }

    public File e(final Context context, final String library, final String version) {
        String strE = this.f142834b.e(library);
        if (h.a(version)) {
            return new File(d(context), strE);
        }
        return new File(d(context), strE + fe.F + version);
    }

    public void f(final Context context, final String library) {
        h(context, library, null, null);
    }

    public void g(final Context context, final String library, final String version) {
        h(context, library, version, null);
    }

    public void h(final Context context, final String library, final String version, final e.c listener) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (h.a(library)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        m("Beginning load of %s...", library);
        if (listener == null) {
            j(context, library, version);
        } else {
            new Thread(new a(context, library, version, listener)).start();
        }
    }

    public void i(final Context context, final String library, final e.c listener) {
        h(context, library, null, listener);
    }

    public final void j(final Context context, final String library, final String version) throws Throwable {
        f fVar;
        Context context2;
        xd.f fVar2;
        if (this.f142833a.contains(library) && !this.f142836d) {
            m("%s already loaded previously!", library);
            return;
        }
        try {
            this.f142834b.d(library);
            this.f142833a.add(library);
            m("%s (%s) was loaded normally!", library, version);
        } catch (UnsatisfiedLinkError e10) {
            m("Loading the library normally failed: %s", Log.getStackTraceString(e10));
            m("%s (%s) was not loaded normally, re-linking...", library, version);
            File fileE = e(context, library, version);
            if (!fileE.exists() || this.f142836d) {
                if (this.f142836d) {
                    m("Forcing a re-link of %s (%s)...", library, version);
                }
                b(context, library, version);
                fVar = this;
                context2 = context;
                this.f142835c.a(context2, this.f142834b.b(), this.f142834b.e(library), fileE, fVar);
            } else {
                fVar = this;
                context2 = context;
            }
            try {
                if (fVar.f142837e) {
                    try {
                        fVar2 = new xd.f(fileE);
                        try {
                            List<String> listH = fVar2.h();
                            fVar2.close();
                            Iterator<String> it = listH.iterator();
                            while (it.hasNext()) {
                                f(context2, fVar.f142834b.a(it.next()));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            if (fVar2 == null) {
                                throw th3;
                            }
                            fVar2.close();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fVar2 = null;
                    }
                }
            } catch (IOException unused) {
            }
            fVar.f142834b.c(fileE.getAbsolutePath());
            fVar.f142833a.add(library);
            m("%s (%s) was re-linked!", library, version);
        }
    }

    public f k(final e.d logger) {
        this.f142838f = logger;
        return this;
    }

    public void l(final String message) {
        e.d dVar = this.f142838f;
        if (dVar != null) {
            dVar.a(message);
        }
    }

    public void m(final String format, final Object... args) {
        l(String.format(Locale.US, format, args));
    }

    public f n() {
        this.f142837e = true;
        return this;
    }

    public f(final e.b libraryLoader, final e.a libraryInstaller) {
        this.f142833a = new HashSet();
        if (libraryLoader == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (libraryInstaller == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f142834b = libraryLoader;
        this.f142835c = libraryInstaller;
    }
}
