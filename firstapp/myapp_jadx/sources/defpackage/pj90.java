package defpackage;

import android.database.SQLException;
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
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class pj90 implements br5 {
    public static final HashSet<File> j = new HashSet<>();
    public final File a;
    public final a4s b;
    public final es5 c;
    public final rr5 d;
    public final HashMap<String, ArrayList<br5.b>> e;
    public final Random f;
    public final boolean g;
    public long h;
    public br5.a i;

    public pj90(File file, a4s a4sVar, kvd0 kvd0Var) {
        boolean zAdd;
        es5 es5Var = new es5(kvd0Var, file);
        rr5 rr5Var = new rr5(kvd0Var);
        synchronized (pj90.class) {
            zAdd = j.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            rcp.a(file, "Another SimpleCache instance uses the folder: ");
            throw null;
        }
        this.a = file;
        this.b = a4sVar;
        this.c = es5Var;
        this.d = rr5Var;
        this.e = new HashMap<>();
        this.f = new Random();
        this.g = true;
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new oj90(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void n(File file) throws br5.a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        cft.c("SimpleCache", str);
        throw new br5.a(str);
    }

    @Override // defpackage.br5
    public final synchronized long a(long j2, String str, long j3) {
        ds5 ds5VarA;
        if (j3 == -1) {
            j3 = Long.MAX_VALUE;
        }
        ds5VarA = this.c.a(str);
        return ds5VarA != null ? ds5VarA.a(j2, j3) : -j3;
    }

    @Override // defpackage.br5
    public final synchronized mbd b(String str) {
        ds5 ds5VarA;
        ds5VarA = this.c.a(str);
        return ds5VarA != null ? ds5VarA.e : mbd.c;
    }

    @Override // defpackage.br5
    public final synchronized void c(xr5 xr5Var) {
        ds5 ds5VarA = this.c.a(xr5Var.a);
        ds5VarA.getClass();
        long j2 = xr5Var.b;
        ArrayList<ds5.a> arrayList = ds5VarA.d;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).a == j2) {
                arrayList.remove(i);
                this.c.d(ds5VarA.b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.br5
    public final synchronized qj90 d(long j2, String str, long j3) {
        long j4;
        qj90 qj90VarB;
        m();
        ds5 ds5VarA = this.c.a(str);
        if (ds5VarA != null) {
            j4 = j2;
            while (true) {
                qj90VarB = ds5VarA.b(j4, j3);
                if (!qj90VarB.d) {
                    break;
                }
                File file = qj90VarB.e;
                file.getClass();
                if (file.length() == qj90VarB.c) {
                    break;
                }
                r();
            }
        } else {
            j4 = j2;
            qj90VarB = new qj90(str, j4, j3, -9223372036854775807L, null);
        }
        if (qj90VarB.d) {
            return s(str, qj90VarB);
        }
        ds5 ds5VarB = this.c.b(str);
        long j5 = qj90VarB.c;
        ArrayList<ds5.a> arrayList = ds5VarB.d;
        for (int i = 0; i < arrayList.size(); i++) {
            ds5.a aVar = arrayList.get(i);
            long j6 = aVar.a;
            if (j6 <= j4) {
                long j7 = aVar.b;
                if (j7 == -1 || j6 + j7 > j4) {
                    return null;
                }
            } else {
                if (j5 == -1 || j4 + j5 > j6) {
                    return null;
                }
            }
        }
        arrayList.add(new ds5.a(j4, j5));
        return qj90VarB;
    }

    @Override // defpackage.br5
    public final synchronized long e(long j2, String str, long j3) {
        long j4;
        long j5 = j3 == -1 ? Long.MAX_VALUE : j3 + j2;
        long j6 = j5 >= 0 ? j5 : Long.MAX_VALUE;
        j4 = 0;
        while (j2 < j6) {
            long jA = a(j2, str, j6 - j2);
            if (jA > 0) {
                j4 += jA;
            } else {
                jA = -jA;
            }
            j2 += jA;
        }
        return j4;
    }

    @Override // defpackage.br5
    public final synchronized void f(File file, long j2) {
        if (file.exists()) {
            if (j2 == 0) {
                file.delete();
                return;
            }
            qj90 qj90VarB = qj90.b(file, j2, -9223372036854775807L, this.c);
            qj90VarB.getClass();
            ds5 ds5VarA = this.c.a(qj90VarB.a);
            ds5VarA.getClass();
            ly0.f(ds5VarA.c(qj90VarB.b, qj90VarB.c));
            long jA = xza.a(ds5VarA.e);
            if (jA != -1) {
                ly0.f(qj90VarB.b + qj90VarB.c <= jA);
            }
            if (this.d == null) {
                l(qj90VarB);
                this.c.f();
                notifyAll();
                return;
            }
            try {
                this.d.d(qj90VarB.c, file.getName(), qj90VarB.f);
                l(qj90VarB);
                try {
                    this.c.f();
                    notifyAll();
                    return;
                } catch (IOException e) {
                    throw new br5.a(e);
                }
            } catch (IOException e2) {
                throw new br5.a(e2);
            }
            throw th;
        }
    }

    @Override // defpackage.br5
    public final synchronized void g(String str) {
        Iterator it = j(str).iterator();
        while (it.hasNext()) {
            q((xr5) it.next());
        }
    }

    @Override // defpackage.br5
    public final synchronized qj90 h(long j2, String str, long j3) {
        qj90 qj90VarD;
        m();
        while (true) {
            qj90VarD = d(j2, str, j3);
            if (qj90VarD == null) {
                wait();
            }
        }
        return qj90VarD;
    }

    @Override // defpackage.br5
    public final synchronized void i(String str, yza yzaVar) {
        m();
        es5 es5Var = this.c;
        ds5 ds5VarB = es5Var.b(str);
        mbd mbdVar = ds5VarB.e;
        mbd mbdVarB = mbdVar.b(yzaVar);
        ds5VarB.e = mbdVarB;
        if (!mbdVarB.equals(mbdVar)) {
            es5Var.e.a(ds5VarB);
        }
        try {
            this.c.f();
        } catch (IOException e) {
            throw new br5.a(e);
        }
    }

    @Override // defpackage.br5
    public final synchronized TreeSet j(String str) {
        ds5 ds5VarA;
        try {
            ds5VarA = this.c.a(str);
        } catch (Throwable th) {
            throw th;
        }
        return (ds5VarA == null || ds5VarA.c.isEmpty()) ? new TreeSet() : new TreeSet((Collection) ds5VarA.c);
    }

    @Override // defpackage.br5
    public final synchronized File k(long j2, String str, long j3) {
        try {
            m();
            ds5 ds5VarA = this.c.a(str);
            ds5VarA.getClass();
            ly0.f(ds5VarA.c(j2, j3));
            if (!this.a.exists()) {
                n(this.a);
                r();
            }
            a4s a4sVar = this.b;
            if (j3 != -1) {
                TreeSet<xr5> treeSet = a4sVar.a;
                while (a4sVar.b + j3 > 104857600 && !treeSet.isEmpty()) {
                    xr5 xr5VarFirst = treeSet.first();
                    synchronized (this) {
                        q(xr5VarFirst);
                    }
                }
            } else {
                a4sVar.getClass();
            }
            File file = new File(this.a, Integer.toString(this.f.nextInt(10)));
            if (!file.exists()) {
                n(file);
            }
            return qj90.c(file, ds5VarA.a, j2, System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l(qj90 qj90Var) {
        String str = qj90Var.a;
        this.c.b(str).c.add(qj90Var);
        ArrayList<br5.b> arrayList = this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(this, qj90Var);
            }
        }
        this.b.a(this, qj90Var);
    }

    public final synchronized void m() {
        br5.a aVar = this.i;
        if (aVar != null) {
            throw aVar;
        }
    }

    public final void o() {
        long jAbs;
        es5 es5Var = this.c;
        File file = this.a;
        if (!file.exists()) {
            try {
                n(file);
            } catch (br5.a e) {
                this.i = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            cft.c("SimpleCache", str);
            this.i = new br5.a(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jAbs = -1;
                break;
            }
            File file2 = fileArrListFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    jAbs = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    cft.c("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        this.h = jAbs;
        if (jAbs == -1) {
            try {
                long jNextLong = new SecureRandom().nextLong();
                jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
                File file3 = new File(file, yk10.a(Long.toString(jAbs, 16), ".uid"));
                if (!file3.createNewFile()) {
                    jre.a(file3, "Failed to create UID file: ");
                    jAbs = 0;
                }
                this.h = jAbs;
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                cft.d("SimpleCache", str2, e2);
                this.i = new br5.a(str2, e2);
                return;
            }
        }
        try {
            es5Var.c(jAbs);
            rr5 rr5Var = this.d;
            if (rr5Var != null) {
                rr5Var.b(this.h);
                HashMap mapA = rr5Var.a();
                p(file, true, fileArrListFiles, mapA);
                rr5Var.c(mapA.keySet());
            } else {
                p(file, true, fileArrListFiles, null);
            }
            lgh0 it = tcn.k(es5Var.a.keySet()).iterator();
            while (it.hasNext()) {
                es5Var.d((String) it.next());
            }
            try {
                es5Var.f();
            } catch (IOException e3) {
                cft.d("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            cft.d("SimpleCache", str3, e4);
            this.i = new br5.a(str3, e4);
        }
    }

    public final void p(File file, boolean z, File[] fileArr, Map<String, qr5> map) {
        long j2;
        long j3;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                p(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                qr5 qr5VarRemove = map != null ? map.remove(name) : null;
                if (qr5VarRemove != null) {
                    j2 = qr5VarRemove.a;
                    j3 = qr5VarRemove.b;
                } else {
                    j2 = -1;
                    j3 = -9223372036854775807L;
                }
                qj90 qj90VarB = qj90.b(file2, j2, j3, this.c);
                if (qj90VarB != null) {
                    l(qj90VarB);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void q(xr5 xr5Var) {
        String str = xr5Var.a;
        File file = xr5Var.e;
        es5 es5Var = this.c;
        ds5 ds5VarA = es5Var.a(str);
        if (ds5VarA == null || !ds5VarA.c.remove(xr5Var)) {
            return;
        }
        if (file != null) {
            file.delete();
        }
        rr5 rr5Var = this.d;
        if (rr5Var != null) {
            file.getClass();
            String name = file.getName();
            try {
                rr5Var.b.getClass();
                try {
                    rr5Var.a.getWritableDatabase().delete(rr5Var.b, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new fsc(e);
                }
            } catch (IOException unused) {
                i08.b("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        es5Var.d(ds5VarA.b);
        ArrayList<br5.b> arrayList = this.e.get(xr5Var.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).b(xr5Var);
            }
        }
        this.b.b(xr5Var);
    }

    public final void r() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(this.c.a.values()).iterator();
        while (it.hasNext()) {
            for (qj90 qj90Var : ((ds5) it.next()).c) {
                File file = qj90Var.e;
                file.getClass();
                if (file.length() != qj90Var.c) {
                    arrayList.add(qj90Var);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            q((xr5) arrayList.get(i));
        }
    }

    public final qj90 s(String str, qj90 qj90Var) {
        boolean z;
        File file;
        File file2 = qj90Var.e;
        if (!this.g) {
            return qj90Var;
        }
        file2.getClass();
        String name = file2.getName();
        long j2 = qj90Var.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        rr5 rr5Var = this.d;
        if (rr5Var != null) {
            try {
                rr5Var.d(j2, name, jCurrentTimeMillis);
            } catch (IOException unused) {
                jCurrentTimeMillis = jCurrentTimeMillis;
                cft.g("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        ds5 ds5VarA = this.c.a(str);
        ds5VarA.getClass();
        TreeSet<qj90> treeSet = ds5VarA.c;
        ly0.f(treeSet.remove(qj90Var));
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileC = qj90.c(parentFile, ds5VarA.a, qj90Var.b, jCurrentTimeMillis);
            if (file2.renameTo(fileC)) {
                file = fileC;
            } else {
                cft.g("CachedContent", "Failed to rename " + file2 + " to " + fileC);
                file = file2;
            }
        } else {
            file = file2;
        }
        ly0.f(qj90Var.d);
        qj90 qj90Var2 = new qj90(qj90Var.a, qj90Var.b, qj90Var.c, jCurrentTimeMillis, file);
        treeSet.add(qj90Var2);
        ArrayList<br5.b> arrayList = this.e.get(qj90Var.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).c(this, qj90Var, qj90Var2);
            }
        }
        this.b.c(this, qj90Var, qj90Var2);
        return qj90Var2;
    }
}
