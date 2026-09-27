package yads;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vy2 implements nr {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet f157133j = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f157134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ur f157135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls f157136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wr f157137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f157138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Random f157139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f157140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f157141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public kr f157142i;

    public vy2(File file, bf1 bf1Var, ls lsVar, wr wrVar) {
        if (!c(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f157134a = file;
        this.f157135b = bf1Var;
        this.f157136c = lsVar;
        this.f157137d = wrVar;
        this.f157138e = new HashMap();
        this.f157139f = new Random();
        this.f157140g = true;
        this.f157141h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new uy2(this, conditionVariable).start();
        conditionVariable.block();
    }

    public final void a(yy2 yy2Var) {
        this.f157136c.a(yy2Var.f158998b).f150262c.add(yy2Var);
        ArrayList arrayList = (ArrayList) this.f157138e.get(yy2Var.f158998b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                bf1 bf1Var = (bf1) ((ur) arrayList.get(size));
                bf1Var.f147163b.add(yy2Var);
                bf1Var.f147164c += yy2Var.f159000d;
                bf1Var.a(this, 0L);
            }
        }
        bf1 bf1Var2 = (bf1) this.f157135b;
        bf1Var2.f147163b.add(yy2Var);
        bf1Var2.f147164c += yy2Var.f159000d;
        bf1Var2.a(this, 0L);
    }

    public final synchronized long b(String str, long j10, long j11) {
        hs hsVar;
        if (j11 == -1) {
            j11 = Long.MAX_VALUE;
        }
        hsVar = (hs) this.f157136c.f152100a.get(str);
        return hsVar != null ? hsVar.a(j10, j11) : -j11;
    }

    public final synchronized void c(String str) {
        Iterator it = a(str).iterator();
        while (it.hasNext()) {
            b((zr) it.next());
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(this.f157136c.f152100a.values()).iterator();
        while (it.hasNext()) {
            for (zr zrVar : ((hs) it.next()).f150262c) {
                if (zrVar.f159002f.length() != zrVar.f159000d) {
                    arrayList.add(zrVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b((zr) arrayList.get(i10));
        }
    }

    public final synchronized jc0 b(String str) {
        jc0 jc0Var;
        try {
            hs hsVar = (hs) this.f157136c.f152100a.get(str);
            if (hsVar != null) {
                jc0Var = hsVar.f150264e;
            } else {
                jc0Var = jc0.f151012c;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jc0Var;
    }

    public final void b() {
        long j10;
        if (!this.f157134a.exists()) {
            try {
                a(this.f157134a);
            } catch (kr e10) {
                this.f157142i = e10;
                return;
            }
        }
        File[] fileArrListFiles = this.f157134a.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.f157134a;
            ih1.b("SimpleCache", str);
            this.f157142i = new kr(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                j10 = -1;
                break;
            }
            File file = fileArrListFiles[i10];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    j10 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    ih1.b("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
            i10++;
        }
        this.f157141h = j10;
        if (j10 == -1) {
            try {
                this.f157141h = b(this.f157134a);
            } catch (IOException e11) {
                String str2 = "Failed to create cache UID: " + this.f157134a;
                ih1.b("SimpleCache", ih1.a(str2, e11));
                this.f157142i = new kr(str2, e11);
                return;
            }
        }
        try {
            this.f157136c.a(this.f157141h);
            wr wrVar = this.f157137d;
            if (wrVar != null) {
                wrVar.a(this.f157141h);
                HashMap mapA = this.f157137d.a();
                a(this.f157134a, true, fileArrListFiles, mapA);
                this.f157137d.a(mapA.keySet());
            } else {
                a(this.f157134a, true, fileArrListFiles, null);
            }
            ls lsVar = this.f157136c;
            ja3 it = u51.a(lsVar.f152100a.keySet()).iterator();
            while (it.hasNext()) {
                lsVar.b((String) it.next());
            }
            try {
                this.f157136c.a();
            } catch (Throwable th2) {
                ih1.b("SimpleCache", ih1.a("Storing index file failed", th2));
            }
        } catch (Throwable th3) {
            String str3 = "Failed to initialize cache indices: " + this.f157134a;
            ih1.b("SimpleCache", ih1.a(str3, th3));
            this.f157142i = new kr(str3, th3);
        }
    }

    public final synchronized yy2 c(String str, long j10, long j11) {
        long j12;
        yy2 yy2VarB;
        File file;
        try {
            a();
            hs hsVar = (hs) this.f157136c.f152100a.get(str);
            if (hsVar == null) {
                j12 = j10;
                yy2VarB = new yy2(str, j12, j11, -9223372036854775807L, null);
            } else {
                j12 = j10;
                while (true) {
                    yy2VarB = hsVar.b(j12, j11);
                    if (!yy2VarB.f159001e || yy2VarB.f159002f.length() == yy2VarB.f159000d) {
                        break;
                    }
                    c();
                }
            }
            int i10 = 0;
            if (yy2VarB.f159001e) {
                if (this.f157140g) {
                    File file2 = yy2VarB.f159002f;
                    file2.getClass();
                    String name = file2.getName();
                    long j13 = yy2VarB.f159000d;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    wr wrVar = this.f157137d;
                    if (wrVar != null) {
                        try {
                            wrVar.a(name, j13, jCurrentTimeMillis);
                        } catch (IOException unused) {
                            ih1.d("SimpleCache", "Failed to update index with new touch timestamp.");
                        }
                    } else {
                        i10 = 1;
                    }
                    hs hsVar2 = (hs) this.f157136c.f152100a.get(str);
                    if (hsVar2.f150262c.remove(yy2VarB)) {
                        File file3 = yy2VarB.f159002f;
                        file3.getClass();
                        if (i10 != 0) {
                            File parentFile = file3.getParentFile();
                            parentFile.getClass();
                            long j14 = yy2VarB.f158999c;
                            int i11 = hsVar2.f150260a;
                            Pattern pattern = yy2.f158527h;
                            File file4 = new File(parentFile, i11 + androidx.media3.session.fe.F + j14 + androidx.media3.session.fe.F + jCurrentTimeMillis + ".v3.exo");
                            if (file3.renameTo(file4)) {
                                file = file4;
                            } else {
                                ih1.d("CachedContent", "Failed to rename " + file3 + " to " + file4);
                                file = file3;
                            }
                        } else {
                            file = file3;
                        }
                        if (yy2VarB.f159001e) {
                            yy2 yy2Var = new yy2(yy2VarB.f158998b, yy2VarB.f158999c, yy2VarB.f159000d, jCurrentTimeMillis, file);
                            hsVar2.f150262c.add(yy2Var);
                            ArrayList arrayList = (ArrayList) this.f157138e.get(yy2VarB.f158998b);
                            if (arrayList != null) {
                                for (int size = arrayList.size() - 1; size >= 0; size--) {
                                    bf1 bf1Var = (bf1) ((ur) arrayList.get(size));
                                    bf1Var.f147163b.remove(yy2VarB);
                                    bf1Var.f147164c -= yy2VarB.f159000d;
                                    bf1Var.f147163b.add(yy2Var);
                                    bf1Var.f147164c += yy2Var.f159000d;
                                    bf1Var.a(this, 0L);
                                }
                            }
                            bf1 bf1Var2 = (bf1) this.f157135b;
                            bf1Var2.f147163b.remove(yy2VarB);
                            bf1Var2.f147164c -= yy2VarB.f159000d;
                            bf1Var2.f147163b.add(yy2Var);
                            bf1Var2.f147164c += yy2Var.f159000d;
                            bf1Var2.a(this, 0L);
                            yy2VarB = yy2Var;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                return yy2VarB;
            }
            hs hsVarA = this.f157136c.a(str);
            long j15 = yy2VarB.f159000d;
            while (i10 < hsVarA.f150263d.size()) {
                gs gsVar = (gs) hsVarA.f150263d.get(i10);
                long j16 = gsVar.f149753a;
                if (j16 <= j12) {
                    long j17 = gsVar.f149754b;
                    if (j17 == -1 || j16 + j17 > j12) {
                        return null;
                    }
                    i10++;
                } else {
                    if (j15 == -1 || j12 + j15 > j16) {
                        return null;
                    }
                    i10++;
                }
            }
            hsVarA.f150263d.add(new gs(j12, j15));
            return yy2VarB;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(String str, rz rzVar) {
        a();
        ls lsVar = this.f157136c;
        hs hsVarA = lsVar.a(str);
        jc0 jc0Var = hsVarA.f150264e;
        jc0 jc0VarA = jc0Var.a(rzVar);
        hsVarA.f150264e = jc0VarA;
        if (!jc0VarA.equals(jc0Var)) {
            lsVar.f152104e.a(hsVarA);
        }
        try {
            this.f157136c.a();
        } catch (Throwable th2) {
            throw new kr(th2);
        }
    }

    public vy2(File file, bf1 bf1Var, jn0 jn0Var) {
        this(file, bf1Var, new ls(jn0Var, file), new wr(jn0Var));
    }

    public final synchronized void a() {
        kr krVar = this.f157142i;
        if (krVar != null) {
            throw krVar;
        }
    }

    public static void a(File file) throws kr {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        ih1.b("SimpleCache", str);
        throw new kr(str);
    }

    public final synchronized long a(String str, long j10, long j11) {
        long j12;
        long j13 = j11 == -1 ? Long.MAX_VALUE : j10 + j11;
        long j14 = j13 >= 0 ? j13 : Long.MAX_VALUE;
        long j15 = j10;
        j12 = 0;
        while (j15 < j14) {
            long jB = b(str, j15, j14 - j15);
            if (jB > 0) {
                j12 += jB;
            } else {
                jB = -jB;
            }
            j15 += jB;
        }
        return j12;
    }

    public final synchronized TreeSet a(String str) {
        TreeSet treeSet;
        try {
            hs hsVar = (hs) this.f157136c.f152100a.get(str);
            if (hsVar != null && !hsVar.f150262c.isEmpty()) {
                treeSet = new TreeSet((Collection) hsVar.f150262c);
            } else {
                treeSet = new TreeSet();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return treeSet;
    }

    public final void a(File file, boolean z10, File[] fileArr, HashMap map) {
        long j10;
        long j11;
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                a(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!name.startsWith("monetization_cached_content_index.exi") && !name.endsWith(".uid"))) {
                vr vrVar = map != null ? (vr) map.remove(name) : null;
                if (vrVar != null) {
                    j10 = vrVar.f157067a;
                    j11 = vrVar.f157068b;
                } else {
                    j10 = -1;
                    j11 = -9223372036854775807L;
                }
                yy2 yy2VarA = yy2.a(file2, j10, j11, this.f157136c);
                if (yy2VarA != null) {
                    a(yy2VarA);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void b(zr zrVar) {
        hs hsVar = (hs) this.f157136c.f152100a.get(zrVar.f158998b);
        if (hsVar == null || !hsVar.f150262c.remove(zrVar)) {
            return;
        }
        File file = zrVar.f159002f;
        if (file != null) {
            file.delete();
        }
        if (this.f157137d != null) {
            String name = zrVar.f159002f.getName();
            try {
                wr wrVar = this.f157137d;
                wrVar.f157486b.getClass();
                try {
                    wrVar.f157485a.getWritableDatabase().delete(wrVar.f157486b, "name = ?", new String[]{name});
                } catch (Throwable th2) {
                    throw new v30(th2);
                }
            } catch (IOException unused) {
                pk1.a("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        this.f157136c.b(hsVar.f150261b);
        ArrayList arrayList = (ArrayList) this.f157138e.get(zrVar.f158998b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                bf1 bf1Var = (bf1) ((ur) arrayList.get(size));
                bf1Var.f147163b.remove(zrVar);
                bf1Var.f147164c -= zrVar.f159000d;
            }
        }
        bf1 bf1Var2 = (bf1) this.f157135b;
        bf1Var2.f147163b.remove(zrVar);
        bf1Var2.f147164c -= zrVar.f159000d;
    }

    public final synchronized void a(zr zrVar) {
        ls lsVar = this.f157136c;
        hs hsVar = (hs) lsVar.f152100a.get(zrVar.f158998b);
        hsVar.getClass();
        long j10 = zrVar.f158999c;
        for (int i10 = 0; i10 < hsVar.f150263d.size(); i10++) {
            if (((gs) hsVar.f150263d.get(i10)).f149753a == j10) {
                hsVar.f150263d.remove(i10);
                this.f157136c.b(hsVar.f150261b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public static long b(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static synchronized boolean c(File file) {
        return f157133j.add(file.getAbsoluteFile());
    }
}
