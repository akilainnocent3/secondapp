package com.inmobi.media;

import com.ironsource.C4235d4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class H5 implements Closeable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f54753p = Pattern.compile("[a-z0-9_-]{1,64}");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final A5 f54754q = new A5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f54756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f54757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f54758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f54759e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F5 f54761g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f54764j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public BufferedWriter f54766l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f54767m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f54755a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f54763i = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f54765k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f54768n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final B5 f54769o = new B5(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f54760f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f54762h = 2;

    public H5(File file, long j10, F5 f10) {
        this.f54756b = file;
        this.f54757c = new File(file, pb.b.f120607p);
        this.f54758d = new File(file, pb.b.f120608q);
        this.f54759e = new File(file, pb.b.f120609r);
        this.f54764j = j10;
        this.f54761g = f10;
    }

    public final void a() throws IOException {
        File file = this.f54758d;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.f54763i.values().iterator();
        while (it.hasNext()) {
            E5 e10 = (E5) it.next();
            int i10 = 0;
            if (e10.f54551d == null) {
                while (i10 < this.f54762h) {
                    this.f54765k += e10.f54549b[i10];
                    i10++;
                }
            } else {
                e10.f54551d = null;
                while (i10 < this.f54762h) {
                    File fileA = e10.a(i10);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException();
                    }
                    File fileB = e10.b(i10);
                    if (fileB.exists() && !fileB.delete()) {
                        throw new IOException();
                    }
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void b() {
        Gj gj2 = new Gj(new FileInputStream(this.f54757c), AbstractC3571bl.f56088a);
        try {
            String strA = gj2.a();
            String strA2 = gj2.a();
            String strA3 = gj2.a();
            String strA4 = gj2.a();
            String strA5 = gj2.a();
            if (!pb.b.f120610s.equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f54760f).equals(strA3) || !Integer.toString(this.f54762h).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + C4235d4.j.f61462e);
            }
            int i10 = 0;
            while (true) {
                try {
                    c(gj2.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f54767m = i10 - this.f54763i.size();
                    AbstractC3571bl.a(gj2);
                    return;
                }
            }
        } catch (Throwable th2) {
            AbstractC3571bl.a(gj2);
            throw th2;
        }
    }

    public final void c(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith(pb.b.f120615x)) {
                this.f54763i.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        E5 e10 = (E5) this.f54763i.get(strSubstring);
        if (e10 == null) {
            e10 = new E5(this, strSubstring);
            this.f54763i.put(strSubstring, e10);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith(pb.b.f120613v)) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(pb.b.f120614w)) {
                e10.f54551d = new D5(this, e10);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith(pb.b.f120616y)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        e10.f54550c = true;
        e10.f54551d = null;
        if (strArrSplit.length != e10.f54552e.f54762h) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            try {
                e10.f54549b[i11] = Long.parseLong(strArrSplit[i11]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f54766l == null) {
                return;
            }
            Iterator it = new ArrayList(this.f54763i.values()).iterator();
            while (it.hasNext()) {
                D5 d10 = ((E5) it.next()).f54551d;
                if (d10 != null) {
                    d10.f54488d.a(d10, false);
                }
            }
            while (this.f54765k > this.f54764j) {
                d((String) ((Map.Entry) this.f54763i.entrySet().iterator().next()).getKey());
            }
            this.f54766l.close();
            this.f54766l = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d(String str) {
        if (this.f54766l == null) {
            throw new IllegalStateException("cache is closed");
        }
        if (!f54753p.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        E5 e10 = (E5) this.f54763i.get(str);
        if (e10 != null && e10.f54551d == null) {
            for (int i10 = 0; i10 < this.f54762h; i10++) {
                File file = e10.a(i10);
                if (this.f54761g != null) {
                    kotlin.jvm.internal.m0.p(file, "file");
                    if (str != null && i10 == 0) {
                        String str2 = "";
                        try {
                            String strA = AbstractC3571bl.a(new InputStreamReader(new FileInputStream(file), AbstractC3571bl.f56089b));
                            kotlin.jvm.internal.m0.o(strA, "readFully(...)");
                            str2 = strA;
                        } catch (Exception unused) {
                        }
                        Map mapJ0 = fr.n1.j0(dr.v1.a("urlKey", str), dr.v1.a("url", str2));
                        Wj wj2 = Wj.f55736a;
                        Wj.b("ResourceDiskCacheFileEvicted", mapJ0, EnumC3544ak.SDK);
                    }
                }
                if (file.exists() && !file.delete()) {
                    throw new IOException("failed to delete " + file);
                }
                long j10 = this.f54765k;
                long[] jArr = e10.f54549b;
                this.f54765k = j10 - jArr[i10];
                jArr[i10] = 0;
            }
            this.f54767m++;
            this.f54766l.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f54763i.remove(str);
            int i11 = this.f54767m;
            if (i11 >= 2000 && i11 >= this.f54763i.size()) {
                this.f54755a.submit(this.f54769o);
            }
        }
    }

    public final D5 a(String str) {
        synchronized (this) {
            try {
                if (this.f54766l != null) {
                    if (f54753p.matcher(str).matches()) {
                        E5 e10 = (E5) this.f54763i.get(str);
                        if (e10 == null) {
                            e10 = new E5(this, str);
                            this.f54763i.put(str, e10);
                        } else if (e10.f54551d != null) {
                            return null;
                        }
                        D5 d10 = new D5(this, e10);
                        e10.f54551d = d10;
                        this.f54766l.write("DIRTY " + str + '\n');
                        this.f54766l.flush();
                        return d10;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized G5 b(String key) {
        InputStream inputStream;
        if (this.f54766l != null) {
            if (f54753p.matcher(key).matches()) {
                E5 e10 = (E5) this.f54763i.get(key);
                if (e10 == null) {
                    return null;
                }
                if (!e10.f54550c) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.f54762h];
                for (int i10 = 0; i10 < this.f54762h; i10++) {
                    try {
                        inputStreamArr[i10] = new FileInputStream(e10.a(i10));
                    } catch (FileNotFoundException unused) {
                        if (this.f54761g != null) {
                            kotlin.jvm.internal.m0.p(key, "key");
                            Map mapJ0 = fr.n1.j0(dr.v1.a("urlKey", key));
                            Wj wj2 = Wj.f55736a;
                            Wj.b("ResourceDiskCacheFileMissing", mapJ0, EnumC3544ak.SDK);
                        }
                        for (int i11 = 0; i11 < this.f54762h && (inputStream = inputStreamArr[i11]) != null; i11++) {
                            AbstractC3571bl.a(inputStream);
                        }
                        return null;
                    }
                }
                this.f54767m++;
                this.f54766l.append((CharSequence) ("READ " + key + '\n'));
                int i12 = this.f54767m;
                if (i12 >= 2000 && i12 >= this.f54763i.size()) {
                    this.f54755a.submit(this.f54769o);
                }
                return new G5(inputStreamArr);
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + key + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void c() {
        try {
            BufferedWriter bufferedWriter = this.f54766l;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f54758d), AbstractC3571bl.f56088a));
            try {
                bufferedWriter2.write(pb.b.f120610s);
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write("1");
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(Integer.toString(this.f54760f));
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(Integer.toString(this.f54762h));
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                for (E5 e10 : this.f54763i.values()) {
                    if (e10.f54551d != null) {
                        bufferedWriter2.write("DIRTY " + e10.f54548a + '\n');
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(e10.f54548a);
                        StringBuilder sb3 = new StringBuilder();
                        for (long j10 : e10.f54549b) {
                            sb3.append(' ');
                            sb3.append(j10);
                        }
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        bufferedWriter2.write(sb2.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.f54757c.exists()) {
                    File file = this.f54757c;
                    File file2 = this.f54759e;
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (this.f54758d.renameTo(this.f54757c)) {
                    this.f54759e.delete();
                    this.f54766l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f54757c, true), AbstractC3571bl.f56088a));
                } else {
                    throw new IOException();
                }
            } catch (Throwable th2) {
                bufferedWriter2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void a(D5 d10, boolean z10) {
        int i10;
        E5 e10 = d10.f54485a;
        if (e10.f54551d == d10) {
            if (z10 && !e10.f54550c) {
                for (int i11 = 0; i11 < this.f54762h; i11++) {
                    if (d10.f54486b[i11]) {
                        if (!e10.b(i11).exists()) {
                            d10.f54488d.a(d10, false);
                            return;
                        }
                    } else {
                        d10.f54488d.a(d10, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                    }
                }
            }
            for (int i12 = 0; i12 < this.f54762h; i12++) {
                File fileB = e10.b(i12);
                if (z10) {
                    if (fileB.exists()) {
                        File fileA = e10.a(i12);
                        fileB.renameTo(fileA);
                        long j10 = e10.f54549b[i12];
                        long length = fileA.length();
                        e10.f54549b[i12] = length;
                        this.f54765k = (this.f54765k - j10) + length;
                    }
                } else if (fileB.exists() && !fileB.delete()) {
                    throw new IOException();
                }
            }
            this.f54767m++;
            e10.f54551d = null;
            if (e10.f54550c | z10) {
                e10.f54550c = true;
                BufferedWriter bufferedWriter = this.f54766l;
                StringBuilder sb2 = new StringBuilder("CLEAN ");
                sb2.append(e10.f54548a);
                StringBuilder sb3 = new StringBuilder();
                for (long j11 : e10.f54549b) {
                    sb3.append(' ');
                    sb3.append(j11);
                }
                sb2.append(sb3.toString());
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
                if (z10) {
                    this.f54768n++;
                }
            } else {
                this.f54763i.remove(e10.f54548a);
                this.f54766l.write("REMOVE " + e10.f54548a + '\n');
            }
            this.f54766l.flush();
            if (this.f54765k > this.f54764j || ((i10 = this.f54767m) >= 2000 && i10 >= this.f54763i.size())) {
                this.f54755a.submit(this.f54769o);
                return;
            }
            return;
        }
        throw new IllegalStateException("CurrentEditor of Entry didn't match with CurrentEditor instance.");
    }
}
