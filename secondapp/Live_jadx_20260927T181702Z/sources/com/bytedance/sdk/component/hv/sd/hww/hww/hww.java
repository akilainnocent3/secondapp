package com.bytedance.sdk.component.hv.sd.hww.hww;

import android.util.Log;
import androidx.media3.session.fe;
import com.bytedance.sdk.component.utils.nod;
import com.ironsource.C4235d4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import pb.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class hww implements Closeable {
    static final Pattern hww = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public static final OutputStream f34685sd = new OutputStream() { // from class: com.bytedance.sdk.component.hv.sd.hww.hww.hww.2
        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
        }
    };

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final File f34688hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final File f34689hv;
    private int khx;
    private final int nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private Writer f34690ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final int f34691ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private long f34692rs;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    final ExecutorService f34693tq;
    private final File vgm;
    private final File vy;
    private long vhb = 0;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private final LinkedHashMap<String, tq> f34687ed = new LinkedHashMap<>(0, 0.75f, true);
    private long weu = -1;
    private long wgt = 0;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private final Callable<Void> f34686bs = new Callable<Void>() { // from class: com.bytedance.sdk.component.hv.sd.hww.hww.hww.1
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (hww.this) {
                try {
                    if (hww.this.f34690ny == null) {
                        return null;
                    }
                    hww.this.ok();
                    if (hww.this.hu()) {
                        hww.this.hv();
                        hww.this.khx = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.component.hv.sd.hww.hww.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class C0323hww {

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private boolean f34694hv;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private final boolean[] f34695sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private final tq f34696tq;
        private boolean vy;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.hv.sd.hww.hww.hww$hww$hww, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C0324hww extends FilterOutputStream {
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0323hww.this.vy = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0323hww.this.vy = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    C0323hww.this.vy = true;
                }
            }

            private C0324hww(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    C0323hww.this.vy = true;
                }
            }
        }

        private C0323hww(tq tqVar) {
            this.f34696tq = tqVar;
            this.f34695sd = tqVar.vy ? null : new boolean[hww.this.nod];
        }

        public void tq() throws IOException {
            hww.this.hww(this, false);
        }

        public OutputStream hww(int i10) throws IOException {
            FileOutputStream fileOutputStream;
            C0324hww c0324hww;
            if (i10 < 0 || i10 >= hww.this.nod) {
                throw new IllegalArgumentException("Expected index " + i10 + " to be greater than 0 and less than the maximum value count of " + hww.this.nod);
            }
            synchronized (hww.this) {
                try {
                    if (this.f34696tq.f34701hv == this) {
                        if (!this.f34696tq.vy) {
                            this.f34695sd[i10] = true;
                        }
                        File fileTq = this.f34696tq.tq(i10);
                        try {
                            fileOutputStream = new FileOutputStream(fileTq);
                        } catch (FileNotFoundException unused) {
                            hww.this.vy.mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(fileTq);
                            } catch (FileNotFoundException unused2) {
                                return hww.f34685sd;
                            }
                        }
                        c0324hww = new C0324hww(fileOutputStream);
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c0324hww;
        }

        public void hww() throws IOException {
            if (this.vy) {
                hww.this.hww(this, false);
                hww.this.sd(this.f34696tq.f34703tq);
            } else {
                hww.this.hww(this, true);
            }
            this.f34694hv = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class sd implements Closeable {

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private final long[] f34697hv;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private final long f34698sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private final String f34699tq;
        private final InputStream[] vy;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.vy) {
                nod.hww(inputStream);
            }
        }

        public InputStream hww(int i10) {
            return this.vy[i10];
        }

        private sd(String str, long j10, InputStream[] inputStreamArr, long[] jArr) {
            this.f34699tq = str;
            this.f34698sd = j10;
            this.vy = inputStreamArr;
            this.f34697hv = jArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class tq {

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        private long f34700hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private C0323hww f34701hv;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private final long[] f34702sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private final String f34703tq;
        private boolean vy;

        private tq(String str) {
            this.f34703tq = str;
            this.f34702sd = new long[hww.this.nod];
        }

        private IOException tq(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File tq(int i10) {
            return new File(hww.this.vy, this.f34703tq + fe.F + i10 + ".tmp");
        }

        public String hww() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f34702sd) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hww(String[] strArr) throws IOException {
            if (strArr.length == hww.this.nod) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.f34702sd[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw tq(strArr);
                    }
                }
                return;
            }
            throw tq(strArr);
        }

        public File hww(int i10) {
            return new File(hww.this.vy, this.f34703tq + fe.F + i10);
        }
    }

    private hww(File file, int i10, int i11, long j10, ExecutorService executorService) {
        this.vy = file;
        this.f34691ok = i10;
        this.f34689hv = new File(file, b.f120607p);
        this.f34688hu = new File(file, b.f120608q);
        this.vgm = new File(file, b.f120609r);
        this.nod = i11;
        this.f34692rs = j10;
        this.f34693tq = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ok() throws IOException {
        long j10 = this.f34692rs;
        long j11 = this.weu;
        if (j11 >= 0) {
            j10 = j11;
        }
        while (this.vhb > j10) {
            sd(this.f34687ed.entrySet().iterator().next().getKey());
        }
        this.weu = -1L;
    }

    private void vgm() {
        if (this.f34690ny == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f34690ny == null) {
                return;
            }
            for (tq tqVar : new ArrayList(this.f34687ed.values())) {
                if (tqVar.f34701hv != null) {
                    tqVar.f34701hv.tq();
                }
            }
            ok();
            this.f34690ny.close();
            this.f34690ny = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hu() {
        int i10 = this.khx;
        return i10 >= 2000 && i10 >= this.f34687ed.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void hv() throws IOException {
        try {
            Writer writer = this.f34690ny;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34688hu), vy.hww));
            try {
                bufferedWriter.write(b.f120610s);
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write("1");
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(Integer.toString(this.f34691ok));
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(Integer.toString(this.nod));
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                for (tq tqVar : this.f34687ed.values()) {
                    if (tqVar.f34701hv != null) {
                        bufferedWriter.write("DIRTY " + tqVar.f34703tq + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + tqVar.f34703tq + tqVar.hww() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.f34689hv.exists()) {
                    hww(this.f34689hv, this.vgm, true);
                }
                hww(this.f34688hu, this.f34689hv, false);
                this.vgm.delete();
                this.f34690ny = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34689hv, true), vy.hww));
            } catch (Throwable th2) {
                bufferedWriter.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private void sd() throws IOException {
        com.bytedance.sdk.component.hv.sd.hww.hww.sd sdVar = new com.bytedance.sdk.component.hv.sd.hww.hww.sd(new FileInputStream(this.f34689hv), vy.hww);
        try {
            String strHww = sdVar.hww();
            String strHww2 = sdVar.hww();
            String strHww3 = sdVar.hww();
            String strHww4 = sdVar.hww();
            String strHww5 = sdVar.hww();
            if (!b.f120610s.equals(strHww) || !"1".equals(strHww2) || !Integer.toString(this.f34691ok).equals(strHww3) || !Integer.toString(this.nod).equals(strHww4) || !"".equals(strHww5)) {
                throw new IOException("unexpected journal header: [" + strHww + ", " + strHww2 + ", " + strHww4 + ", " + strHww5 + C4235d4.j.f61462e);
            }
            int i10 = 0;
            while (true) {
                try {
                    vy(sdVar.hww());
                    i10++;
                } catch (EOFException unused) {
                    this.khx = i10 - this.f34687ed.size();
                    if (sdVar.tq()) {
                        hv();
                    } else {
                        this.f34690ny = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34689hv, true), vy.hww));
                    }
                    nod.hww(sdVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            nod.hww(sdVar);
            throw th2;
        }
    }

    private void vy(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith(b.f120615x)) {
                this.f34687ed.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        tq tqVar = this.f34687ed.get(strSubstring);
        if (tqVar == null) {
            tqVar = new tq(strSubstring);
            this.f34687ed.put(strSubstring, tqVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(b.f120613v)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            tqVar.vy = true;
            tqVar.f34701hv = null;
            tqVar.hww(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(b.f120614w)) {
            tqVar.f34701hv = new C0323hww(tqVar);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith(b.f120616y)) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    public C0323hww tq(String str) throws IOException {
        return hww(str, -1L);
    }

    public void tq() throws IOException {
        close();
        vy.hww(this.vy);
    }

    public static hww hww(File file, int i10, int i11, long j10, ExecutorService executorService) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 > 0) {
            File file2 = new File(file, b.f120609r);
            if (file2.exists()) {
                File file3 = new File(file, b.f120607p);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    hww(file2, file3, false);
                }
            }
            hww hwwVar = new hww(file, i10, i11, j10, executorService);
            if (hwwVar.f34689hv.exists()) {
                try {
                    hwwVar.sd();
                    hwwVar.vy();
                    return hwwVar;
                } catch (IOException e10) {
                    Log.w("DiskLruCache ", file + " is corrupt: " + e10.getMessage() + ", removing");
                    hwwVar.tq();
                }
            }
            file.mkdirs();
            hww hwwVar2 = new hww(file, i10, i11, j10, executorService);
            hwwVar2.hv();
            return hwwVar2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    public synchronized boolean sd(String str) throws IOException {
        try {
            vgm();
            hv(str);
            tq tqVar = this.f34687ed.get(str);
            if (tqVar != null && tqVar.f34701hv == null) {
                for (int i10 = 0; i10 < this.nod; i10++) {
                    File fileHww = tqVar.hww(i10);
                    if (fileHww.exists() && !fileHww.delete()) {
                        throw new IOException("failed to delete ".concat(String.valueOf(fileHww)));
                    }
                    this.vhb -= tqVar.f34702sd[i10];
                    tqVar.f34702sd[i10] = 0;
                }
                this.khx++;
                this.f34690ny.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f34687ed.remove(str);
                if (hu()) {
                    this.f34693tq.submit(this.f34686bs);
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void vy() throws IOException {
        hww(this.f34688hu);
        Iterator<tq> it = this.f34687ed.values().iterator();
        while (it.hasNext()) {
            tq next = it.next();
            int i10 = 0;
            if (next.f34701hv != null) {
                next.f34701hv = null;
                while (i10 < this.nod) {
                    hww(next.hww(i10));
                    hww(next.tq(i10));
                    i10++;
                }
                it.remove();
            } else {
                while (i10 < this.nod) {
                    this.vhb += next.f34702sd[i10];
                    i10++;
                }
            }
        }
    }

    private static void hww(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void hww(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            hww(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void hv(String str) {
        if (hww.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    public synchronized sd hww(String str) throws Throwable {
        Throwable th2;
        InputStream inputStream;
        try {
            vgm();
            hv(str);
            tq tqVar = this.f34687ed.get(str);
            if (tqVar == null) {
                return null;
            }
            if (!tqVar.vy) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.nod];
            for (int i10 = 0; i10 < this.nod; i10++) {
                try {
                    try {
                        try {
                            inputStreamArr[i10] = new FileInputStream(tqVar.hww(i10));
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i11 = 0; i11 < this.nod && (inputStream = inputStreamArr[i11]) != null; i11++) {
                            nod.hww(inputStream);
                        }
                        return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                }
            }
            this.khx++;
            this.f34690ny.append((CharSequence) ("READ " + str + '\n'));
            if (hu()) {
                this.f34693tq.submit(this.f34686bs);
            }
            return new sd(str, tqVar.f34700hu, inputStreamArr, tqVar.f34702sd);
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        throw th2;
    }

    private synchronized C0323hww hww(String str, long j10) throws IOException {
        vgm();
        hv(str);
        tq tqVar = this.f34687ed.get(str);
        if (j10 != -1 && (tqVar == null || tqVar.f34700hu != j10)) {
            return null;
        }
        if (tqVar != null) {
            if (tqVar.f34701hv != null) {
                return null;
            }
        } else {
            tqVar = new tq(str);
            this.f34687ed.put(str, tqVar);
        }
        C0323hww c0323hww = new C0323hww(tqVar);
        tqVar.f34701hv = c0323hww;
        this.f34690ny.write("DIRTY " + str + '\n');
        this.f34690ny.flush();
        return c0323hww;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void hww(C0323hww c0323hww, boolean z10) throws IOException {
        tq tqVar = c0323hww.f34696tq;
        if (tqVar.f34701hv == c0323hww) {
            if (z10 && !tqVar.vy) {
                for (int i10 = 0; i10 < this.nod; i10++) {
                    if (c0323hww.f34695sd[i10]) {
                        if (!tqVar.tq(i10).exists()) {
                            c0323hww.tq();
                            return;
                        }
                    } else {
                        c0323hww.tq();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i10)));
                    }
                }
            }
            for (int i11 = 0; i11 < this.nod; i11++) {
                File fileTq = tqVar.tq(i11);
                if (z10) {
                    if (fileTq.exists()) {
                        File fileHww = tqVar.hww(i11);
                        fileTq.renameTo(fileHww);
                        long j10 = tqVar.f34702sd[i11];
                        long length = fileHww.length();
                        tqVar.f34702sd[i11] = length;
                        this.vhb = (this.vhb - j10) + length;
                    }
                } else {
                    hww(fileTq);
                }
            }
            this.khx++;
            tqVar.f34701hv = null;
            if (!(tqVar.vy | z10)) {
                this.f34687ed.remove(tqVar.f34703tq);
                this.f34690ny.write("REMOVE " + tqVar.f34703tq + '\n');
            } else {
                tqVar.vy = true;
                this.f34690ny.write("CLEAN " + tqVar.f34703tq + tqVar.hww() + '\n');
                if (z10) {
                    long j11 = this.wgt;
                    this.wgt = 1 + j11;
                    tqVar.f34700hu = j11;
                }
            }
            this.f34690ny.flush();
            if (this.vhb > this.f34692rs || hu()) {
                this.f34693tq.submit(this.f34686bs);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized void hww() throws IOException {
        vgm();
        ok();
        this.f34690ny.flush();
    }
}
