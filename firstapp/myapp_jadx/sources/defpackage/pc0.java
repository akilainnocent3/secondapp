package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.OpenOption;

/* JADX INFO: loaded from: classes.dex */
public final class pc0 {
    public final mw0<oc0> a = new mw0<>();
    public final mw0<dnf0> b = new mw0<>();

    public class a extends ckh {
        public final /* synthetic */ File c;

        public a(File file) {
            this.c = file;
        }

        @Override // defpackage.ckh
        public final InputStream c() {
            try {
                return new FileInputStream(this.c);
            } catch (FileNotFoundException e) {
                gqm.a(e);
                return null;
            }
        }
    }

    public pc0(snf0 snf0Var, sq20 sq20Var) {
        mw0.b<snf0.b> it = snf0Var.a.iterator();
        while (it.hasNext()) {
            snf0.b next = it.next();
            File file = new File(next.a.b());
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(Build.VERSION.SDK_INT >= 26 ? Files.newInputStream(file.toPath(), new OpenOption[0]) : new FileInputStream(file));
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStream);
                    bufferedInputStream.close();
                    oc0 oc0Var = new oc0();
                    oc0Var.c = new gcy<>(51, 0.8f);
                    oc0Var.b = bitmapDecodeStream;
                    for (ef4 ef4Var : ef4.values()) {
                        Paint paint = new Paint();
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint.setShader(new BitmapShader(bitmapDecodeStream, tileMode, tileMode));
                        int iOrdinal = ef4Var.ordinal();
                        if (iOrdinal == 0) {
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                        } else if (iOrdinal == 1) {
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
                        } else if (iOrdinal == 2) {
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                        } else if (iOrdinal == 3) {
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
                        }
                        oc0Var.c.b(ef4Var, paint);
                    }
                    next.b = oc0Var;
                    this.a.a(oc0Var);
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                gqm.a(th3);
                throw null;
            }
        }
        mw0.b<snf0.c> it2 = snf0Var.b.iterator();
        while (it2.hasNext()) {
            snf0.c next2 = it2.next();
            oc0 oc0Var2 = next2.a.b;
            int i = next2.c;
            int i2 = next2.d;
            boolean z = next2.l;
            int i3 = z ? next2.f : next2.e;
            int i4 = z ? next2.e : next2.f;
            dnf0 dnf0Var = new dnf0();
            dnf0Var.a = oc0Var2;
            float width = 1.0f / oc0Var2.b.getWidth();
            Bitmap bitmap = oc0Var2.b;
            float height = 1.0f / bitmap.getHeight();
            float f = i * width;
            float f2 = i2 * height;
            float f3 = (i + i3) * width;
            float f4 = (i2 + i4) * height;
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            float f5 = width2;
            dnf0Var.f = Math.round(Math.abs(f3 - f) * f5);
            float f6 = height2;
            int iRound = Math.round(Math.abs(f4 - f2) * f6);
            if (dnf0Var.f == 1 && iRound == 1) {
                float f7 = 0.25f / f5;
                f += f7;
                f3 -= f7;
                float f8 = 0.25f / f6;
                f2 += f8;
                f4 -= f8;
            }
            dnf0Var.b = f;
            dnf0Var.c = f2;
            dnf0Var.d = f3;
            dnf0Var.e = f4;
            dnf0Var.f = Math.abs(i3);
            Math.abs(i4);
            dnf0Var.j = i3;
            dnf0Var.k = i4;
            dnf0Var.g = next2.b;
            dnf0Var.h = next2.g;
            dnf0Var.i = next2.h;
            dnf0Var.m = next2.j;
            dnf0Var.l = next2.i;
            dnf0Var.n = next2.k;
            this.b.a(dnf0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:199:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x019b A[PHI: r21
      0x019b: PHI (r21v6 int) = (r21v4 int), (r21v7 int) binds: [B:66:0x0199, B:61:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T[], java.lang.Object[]] */
    public static snf0 b(File file) {
        String str;
        String str2;
        mw0<snf0.c> mw0Var;
        int i;
        int i2;
        int i3;
        snf0 snf0Var = new snf0();
        a aVar = new a(file);
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            parentFile = new File("/");
        }
        String[] strArr = new String[5];
        gcy gcyVar = new gcy(15, 0.99f);
        gcyVar.b("size", new jnf0(strArr));
        gcyVar.b("format", new knf0(strArr));
        gcyVar.b("filter", new lnf0(strArr));
        gcyVar.b("repeat", new mnf0(strArr));
        gcyVar.b("pma", new nnf0(strArr));
        int i4 = 1;
        int i5 = 0;
        boolean[] zArr = {false};
        gcy gcyVar2 = new gcy(127, 0.99f);
        gcyVar2.b("xy", new onf0(strArr));
        gcyVar2.b("size", new pnf0(strArr));
        gcyVar2.b("bounds", new qnf0(strArr));
        gcyVar2.b("offset", new rnf0(strArr));
        gcyVar2.b("orig", new enf0(strArr));
        gcyVar2.b("offsets", new fnf0(strArr));
        gcyVar2.b("rotate", new gnf0(strArr));
        gcyVar2.b("index", new hnf0(strArr, zArr));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(aVar.c()), 1024);
        try {
            try {
                String line = bufferedReader.readLine();
                while (line != null) {
                    try {
                        if (line.trim().length() != 0) {
                            break;
                        }
                        line = bufferedReader.readLine();
                    } catch (Exception e) {
                        e = e;
                        str = line;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error reading texture atlas file: ");
                        sb.append(aVar);
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = "\nLine: " + str;
                        }
                        sb.append(str2);
                        throw new qyj(sb.toString(), e);
                    }
                }
                while (line != null && line.trim().length() != 0 && snf0.a(line, strArr) != 0) {
                    line = bufferedReader.readLine();
                }
                snf0.b bVar = null;
                mw0 mw0Var2 = null;
                mw0 mw0Var3 = null;
                while (true) {
                    mw0Var = snf0Var.b;
                    if (line == null) {
                        try {
                            break;
                        } catch (Throwable unused) {
                        }
                    } else {
                        int i6 = i5;
                        if (line.trim().length() == 0) {
                            line = bufferedReader.readLine();
                            i5 = i6;
                            bVar = null;
                        } else if (bVar == null) {
                            bVar = new snf0.b();
                            int length = parentFile.getPath().length();
                            llh llhVar = llh.d;
                            bVar.a = length == 0 ? new ckh(new File(line), llhVar) : new ckh(new File(parentFile, line), llhVar);
                            while (true) {
                                line = bufferedReader.readLine();
                                if (snf0.a(line, strArr) == 0) {
                                    break;
                                }
                                int iA = gcyVar.a(strArr[i6]);
                                snf0.a aVar2 = (snf0.a) (iA < 0 ? null : gcyVar.c[iA]);
                                if (aVar2 != null) {
                                    aVar2.a(bVar);
                                }
                            }
                            snf0Var.a.a(bVar);
                            i5 = i6;
                        } else {
                            snf0.c cVar = new snf0.c();
                            cVar.a = bVar;
                            cVar.b = line.trim();
                            while (true) {
                                line = bufferedReader.readLine();
                                int iA2 = snf0.a(line, strArr);
                                if (iA2 == 0) {
                                    break;
                                }
                                snf0 snf0Var2 = snf0Var;
                                File file2 = parentFile;
                                int iA3 = gcyVar2.a(strArr[i6]);
                                snf0.a aVar3 = (snf0.a) (iA3 < 0 ? null : gcyVar2.c[iA3]);
                                if (aVar3 != null) {
                                    aVar3.a(cVar);
                                } else {
                                    if (mw0Var2 == null) {
                                        mw0 mw0Var4 = new mw0(8, true);
                                        mw0Var3 = new mw0(8, true);
                                        mw0Var2 = mw0Var4;
                                    }
                                    int i7 = 0;
                                    mw0Var2.a(strArr[0]);
                                    int[] iArr = new int[iA2];
                                    while (i7 < iA2) {
                                        int i8 = i7 + 1;
                                        try {
                                            iArr[i7] = Integer.parseInt(strArr[i8]);
                                        } catch (NumberFormatException unused2) {
                                        }
                                        i7 = i8;
                                    }
                                    mw0Var3.a(iArr);
                                }
                                snf0Var = snf0Var2;
                                parentFile = file2;
                                i6 = 0;
                            }
                            if (cVar.i == 0 && cVar.j == 0) {
                                cVar.i = cVar.e;
                                cVar.j = cVar.f;
                            }
                            if (mw0Var2 != null && (i3 = mw0Var2.b) > 0) {
                                int i9 = i6;
                                System.arraycopy(mw0Var2.a, i9, new String[i3], i9, i3);
                                int i10 = mw0Var3.b;
                                System.arraycopy(mw0Var3.a, i9, new int[i10][], i9, i10);
                                mw0Var2.clear();
                                mw0Var3.clear();
                            }
                            mw0Var.a(cVar);
                            snf0Var = snf0Var;
                            parentFile = parentFile;
                            i4 = 1;
                            i5 = 0;
                        }
                    }
                }
                bufferedReader.close();
                if (zArr[i5]) {
                    inf0 inf0Var = new inf0();
                    xoa0 xoa0Var = xoa0.b;
                    if (xoa0Var == null) {
                        xoa0Var = new xoa0();
                        xoa0.b = xoa0Var;
                    }
                    ?? r3 = mw0Var.a;
                    int i11 = mw0Var.b;
                    htf0 htf0Var = xoa0Var.a;
                    if (htf0Var == null) {
                        htf0Var = new htf0();
                        xoa0Var.a = htf0Var;
                    }
                    int[] iArr2 = htf0Var.h;
                    htf0Var.f = i5;
                    int length2 = r3.length;
                    if (i11 < 0) {
                        hb5.a(pe4.b(i11, "fromIndex(0) > toIndex(", ")"));
                        return null;
                    }
                    if (i11 > length2) {
                        throw new ArrayIndexOutOfBoundsException(i11);
                    }
                    if (i11 >= 2) {
                        if (i11 < 32) {
                            htf0.a(r3, i5, i11, htf0.b(r3, i5, i11, inf0Var), inf0Var);
                        } else {
                            htf0Var.a = r3;
                            htf0Var.b = inf0Var;
                            htf0Var.e = i5;
                            int i12 = i11;
                            int i13 = i5;
                            while (i12 >= 32) {
                                i13 |= i12 & 1;
                                i12 >>= 1;
                            }
                            int i14 = i12 + i13;
                            int i15 = i11;
                            int i16 = i5;
                            while (true) {
                                int iB = htf0.b(r3, i16, i11, inf0Var);
                                if (iB < i14) {
                                    int i17 = i15 <= i14 ? i15 : i14;
                                    htf0.a(r3, i16, i16 + i17, iB + i16, inf0Var);
                                    iB = i17;
                                }
                                int[] iArr3 = htf0Var.g;
                                int i18 = htf0Var.f;
                                iArr3[i18] = i16;
                                iArr2[i18] = iB;
                                htf0Var.f = i18 + i4;
                                while (true) {
                                    int i19 = htf0Var.f;
                                    if (i19 <= i4) {
                                        i = i5;
                                        break;
                                    }
                                    int i20 = i19 - 2;
                                    if (i20 >= i4) {
                                        i = i5;
                                        if (iArr2[i19 - 3] <= iArr2[i20] + iArr2[i19 - 1]) {
                                            i2 = i19 - 3;
                                            if (iArr2[i2] < iArr2[i19 - 1]) {
                                                i20 = i2;
                                            }
                                        }
                                        htf0Var.f(i20);
                                        i5 = i;
                                    } else {
                                        i = i5;
                                    }
                                    if (i20 >= 2 && iArr2[i19 - 4] <= iArr2[i20] + iArr2[i19 - 3]) {
                                        i2 = i19 - 3;
                                        if (iArr2[i2] < iArr2[i19 - 1]) {
                                            i20 = i2;
                                        }
                                    } else if (iArr2[i20] > iArr2[i19 - 1]) {
                                        break;
                                    }
                                    htf0Var.f(i20);
                                    i5 = i;
                                }
                                i16 += iB;
                                i15 -= iB;
                                if (i15 == 0) {
                                    break;
                                }
                                i5 = i;
                            }
                            while (true) {
                                int i21 = htf0Var.f;
                                if (i21 <= i4) {
                                    break;
                                }
                                int i22 = i21 - 2;
                                if (i22 > 0) {
                                    int i23 = i21 - 3;
                                    if (iArr2[i23] < iArr2[i21 - 1]) {
                                        i22 = i23;
                                    }
                                }
                                htf0Var.f(i22);
                            }
                            Object obj = null;
                            htf0Var.a = null;
                            htf0Var.b = null;
                            T[] tArr = htf0Var.d;
                            int i24 = htf0Var.e;
                            int i25 = i;
                            while (i25 < i24) {
                                tArr[i25] = obj;
                                i25++;
                                obj = null;
                            }
                        }
                    }
                }
                return snf0Var;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused3) {
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            str = null;
        }
    }

    public final dnf0 a(String str) {
        mw0<dnf0> mw0Var = this.b;
        int i = mw0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (mw0Var.get(i2).g.equals(str)) {
                return mw0Var.get(i2);
            }
        }
        return null;
    }
}
