package com.mbridge.msdk.foundation.same.directory;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f67068c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f67069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<a> f67070b = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public File f67071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f67072b;

        public a(c cVar, File file) {
            this.f67072b = cVar;
            this.f67071a = file;
        }
    }

    private e(b bVar) {
        this.f67069a = bVar;
    }

    public static File a(c cVar) {
        try {
            if (b() == null || b().f67070b == null || b().f67070b.isEmpty()) {
                return null;
            }
            for (a aVar : b().f67070b) {
                if (aVar.f67072b.equals(cVar)) {
                    return aVar.f67071a;
                }
            }
            return null;
        } catch (Throwable th2) {
            q0.b("MBridgeDirManager", th2.getMessage(), th2);
            return null;
        }
    }

    public static String b(c cVar) {
        File fileA = a(cVar);
        if (fileA != null) {
            return fileA.getAbsolutePath();
        }
        return null;
    }

    public static synchronized e b() {
        try {
            if (f67068c == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                t0.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f67068c;
    }

    public static synchronized void a(b bVar) {
        if (f67068c == null) {
            f67068c = new e(bVar);
        }
    }

    public boolean a() {
        return a(this.f67069a.a());
    }

    private boolean a(com.mbridge.msdk.foundation.same.directory.a aVar) {
        String strB;
        com.mbridge.msdk.foundation.same.directory.a aVarC = aVar.c();
        if (aVarC == null) {
            strB = aVar.b();
        } else {
            File fileA = a(aVarC.d());
            if (fileA == null) {
                return false;
            }
            strB = fileA.getAbsolutePath() + File.separator + aVar.b();
        }
        File file = new File(strB);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f67070b.add(new a(aVar.d(), file));
        List<com.mbridge.msdk.foundation.same.directory.a> listA = aVar.a();
        if (listA != null) {
            Iterator<com.mbridge.msdk.foundation.same.directory.a> it = listA.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
