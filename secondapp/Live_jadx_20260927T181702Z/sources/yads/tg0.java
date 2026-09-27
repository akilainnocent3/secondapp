package yads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tg0 implements mr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f155885a = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f155886b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qg0 f155887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f155888d;

    public tg0(File file, int i10) {
        this.f155887c = new qg0(file);
        this.f155888d = i10;
    }

    @Override // yads.mr
    public final synchronized void a() {
        File file = this.f155887c.f154461a;
        if (!file.exists()) {
            if (!file.mkdirs()) {
                file.getAbsolutePath();
                boolean z10 = lm3.f152057a;
                boolean z11 = ad1.f146762a;
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                long length = file2.length();
                sg0 sg0Var = new sg0(new BufferedInputStream(new FileInputStream(file2)), length);
                try {
                    try {
                        rg0 rg0VarA = rg0.a(sg0Var);
                        rg0VarA.f154948a = length;
                        String str = rg0VarA.f154949b;
                        if (this.f155885a.containsKey(str)) {
                            this.f155886b = (rg0VarA.f154948a - ((rg0) this.f155885a.get(str)).f154948a) + this.f155886b;
                        } else {
                            this.f155886b += rg0VarA.f154948a;
                        }
                        this.f155885a.put(str, rg0VarA);
                        sg0Var.close();
                    } catch (Throwable th2) {
                        sg0Var.close();
                        throw th2;
                    }
                } catch (Throwable unused) {
                }
            } catch (IOException unused2) {
                file2.delete();
            } catch (Throwable unused3) {
                file2.delete();
            }
        }
    }

    public final void b() {
        if (this.f155886b < this.f155888d) {
            return;
        }
        if (lm3.f152057a) {
            boolean z10 = ad1.f146762a;
        }
        SystemClock.elapsedRealtime();
        Iterator it = this.f155885a.entrySet().iterator();
        while (it.hasNext()) {
            rg0 rg0Var = (rg0) ((Map.Entry) it.next()).getValue();
            String str = rg0Var.f154949b;
            File file = this.f155887c.f154461a;
            int length = str.length() / 2;
            if (new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete()) {
                this.f155886b -= rg0Var.f154948a;
            } else {
                String str2 = rg0Var.f154949b;
                int length2 = str2.length() / 2;
                String.valueOf(str2.substring(0, length2).hashCode());
                String.valueOf(str2.substring(length2).hashCode());
                boolean z11 = ad1.f146762a;
            }
            it.remove();
            if (this.f155886b < this.f155888d * 0.9f) {
                break;
            }
        }
        if (lm3.f152057a) {
            SystemClock.elapsedRealtime();
            boolean z12 = ad1.f146762a;
        }
    }

    @Override // yads.mr
    public final synchronized lr get(String str) {
        rg0 rg0Var = (rg0) this.f155885a.get(str);
        if (rg0Var == null) {
            return null;
        }
        File file = this.f155887c.f154461a;
        int length = str.length() / 2;
        File file2 = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode()));
        try {
            sg0 sg0Var = new sg0(new BufferedInputStream(new FileInputStream(file2)), file2.length());
            try {
                if (TextUtils.equals(str, rg0.a(sg0Var).f154949b)) {
                    lr lrVarA = rg0Var.a(a(sg0Var, sg0Var.f155412a - sg0Var.f155413b));
                    sg0Var.close();
                    return lrVarA;
                }
                file2.getAbsolutePath();
                boolean z10 = lm3.f152057a;
                boolean z11 = ad1.f146762a;
                rg0 rg0Var2 = (rg0) this.f155885a.remove(str);
                if (rg0Var2 != null) {
                    this.f155886b -= rg0Var2.f154948a;
                }
                sg0Var.close();
                return null;
            } catch (Throwable th2) {
                sg0Var.close();
                throw th2;
            }
        } catch (IOException unused) {
            file2.getAbsolutePath();
            boolean z12 = lm3.f152057a;
            boolean z13 = ad1.f146762a;
            b(str);
            return null;
        }
    }

    @Override // yads.mr
    public final synchronized void a(String str) {
        lr lrVar = get(str);
        if (lrVar != null) {
            lrVar.f152094f = 0L;
            lrVar.f152093e = 0L;
            a(str, lrVar);
        }
    }

    public static long b(InputStream inputStream) {
        int i10 = inputStream.read();
        if (i10 != -1) {
            long j10 = ((long) i10) & 255;
            int i11 = inputStream.read();
            if (i11 != -1) {
                long j11 = j10 | ((((long) i11) & 255) << 8);
                int i12 = inputStream.read();
                if (i12 != -1) {
                    long j12 = j11 | ((((long) i12) & 255) << 16);
                    int i13 = inputStream.read();
                    if (i13 != -1) {
                        long j13 = j12 | ((((long) i13) & 255) << 24);
                        int i14 = inputStream.read();
                        if (i14 != -1) {
                            long j14 = j13 | ((((long) i14) & 255) << 32);
                            int i15 = inputStream.read();
                            if (i15 != -1) {
                                long j15 = j14 | ((((long) i15) & 255) << 40);
                                int i16 = inputStream.read();
                                if (i16 != -1) {
                                    long j16 = j15 | ((((long) i16) & 255) << 48);
                                    int i17 = inputStream.read();
                                    if (i17 != -1) {
                                        return ((((long) i17) & 255) << 56) | j16;
                                    }
                                    throw new EOFException();
                                }
                                throw new EOFException();
                            }
                            throw new EOFException();
                        }
                        throw new EOFException();
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // yads.mr
    public final synchronized void a(String str, lr lrVar) {
        long j10 = this.f155886b;
        byte[] bArr = lrVar.f152089a;
        long length = j10 + ((long) bArr.length);
        int i10 = this.f155888d;
        if (length > i10 && bArr.length > i10 * 0.9f) {
            return;
        }
        File file = this.f155887c.f154461a;
        int length2 = str.length() / 2;
        File file2 = new File(file, String.valueOf(str.substring(0, length2).hashCode()) + String.valueOf(str.substring(length2).hashCode()));
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            rg0 rg0Var = new rg0(str, lrVar.f152090b, lrVar.f152091c, lrVar.f152092d, lrVar.f152093e, lrVar.f152094f, rg0.a(lrVar));
            if (rg0Var.a(bufferedOutputStream)) {
                bufferedOutputStream.write(lrVar.f152089a);
                bufferedOutputStream.close();
                rg0Var.f154948a = file2.length();
                if (!this.f155885a.containsKey(str)) {
                    this.f155886b += rg0Var.f154948a;
                } else {
                    this.f155886b = (rg0Var.f154948a - ((rg0) this.f155885a.get(str)).f154948a) + this.f155886b;
                }
                this.f155885a.put(str, rg0Var);
                b();
                return;
            }
            bufferedOutputStream.close();
            file2.getAbsolutePath();
            boolean z10 = lm3.f152057a;
            boolean z11 = ad1.f146762a;
            throw new IOException();
        } catch (IOException unused) {
            if (!file2.delete()) {
                file2.getAbsolutePath();
                boolean z12 = lm3.f152057a;
                boolean z13 = ad1.f146762a;
            }
            if (!this.f155887c.f154461a.exists()) {
                boolean z14 = lm3.f152057a;
                boolean z15 = ad1.f146762a;
                this.f155885a.clear();
                this.f155886b = 0L;
                a();
            }
        }
    }

    public final synchronized void b(String str) {
        try {
            File file = this.f155887c.f154461a;
            int length = str.length() / 2;
            boolean zDelete = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete();
            rg0 rg0Var = (rg0) this.f155885a.remove(str);
            if (rg0Var != null) {
                this.f155886b -= rg0Var.f154948a;
            }
            if (!zDelete) {
                int length2 = str.length() / 2;
                String.valueOf(str.substring(0, length2).hashCode());
                String.valueOf(str.substring(length2).hashCode());
                boolean z10 = lm3.f152057a;
                boolean z11 = ad1.f146762a;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static int a(InputStream inputStream) {
        int i10 = inputStream.read();
        if (i10 != -1) {
            int i11 = inputStream.read();
            if (i11 != -1) {
                int i12 = i10 | (i11 << 8);
                int i13 = inputStream.read();
                if (i13 != -1) {
                    int i14 = i12 | (i13 << 16);
                    int i15 = inputStream.read();
                    if (i15 != -1) {
                        return (i15 << 24) | i14;
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public static byte[] a(sg0 sg0Var, long j10) throws IOException {
        long j11 = sg0Var.f155412a - sg0Var.f155413b;
        if (j10 >= 0 && j10 <= j11) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(sg0Var).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + j11);
    }

    public static void a(BufferedOutputStream bufferedOutputStream, int i10) {
        bufferedOutputStream.write(i10 & 255);
        bufferedOutputStream.write((i10 >> 8) & 255);
        bufferedOutputStream.write((i10 >> 16) & 255);
        bufferedOutputStream.write((i10 >> 24) & 255);
    }

    public static void a(BufferedOutputStream bufferedOutputStream, long j10) {
        bufferedOutputStream.write((byte) j10);
        bufferedOutputStream.write((byte) (j10 >>> 8));
        bufferedOutputStream.write((byte) (j10 >>> 16));
        bufferedOutputStream.write((byte) (j10 >>> 24));
        bufferedOutputStream.write((byte) (j10 >>> 32));
        bufferedOutputStream.write((byte) (j10 >>> 40));
        bufferedOutputStream.write((byte) (j10 >>> 48));
        bufferedOutputStream.write((byte) (j10 >>> 56));
    }
}
