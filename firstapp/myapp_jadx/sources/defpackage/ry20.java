package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import android.media.ImageReader;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.c;
import androidx.camera.core.e;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ry20 {
    public final Executor a;
    public final CameraCharacteristics b;
    public yte c;
    public ak1 d;
    public iy20 e;
    public t7n f;
    public be4 g;
    public nbp h;
    public mbp i;
    public qbp j;
    public obp k;
    public he4 l;
    public final yj30 m;
    public final boolean n;

    public static abstract class a {
        public abstract zkf<b> a();

        public abstract int b();

        public abstract List<Integer> c();

        public abstract zkf<b> d();
    }

    public static abstract class b {
        public abstract c a();

        public abstract sy20 b();
    }

    public ry20(Executor executor, CameraCharacteristics cameraCharacteristics) {
        yj30 yj30Var = xhe.a;
        if (xhe.a.b(LowMemoryQuirk.class) != null) {
            this.a = new od80(executor);
        } else {
            this.a = executor;
        }
        this.b = cameraCharacteristics;
        this.m = yj30Var;
        this.n = yj30Var.a(IncorrectJpegMetadataQuirk.class);
    }

    public final c a(b bVar) {
        sy20 sy20VarB = bVar.b();
        wj1 wj1Var = (wj1) this.e.a(bVar);
        List<Integer> list = this.d.d;
        km20.b(!list.isEmpty());
        int iIntValue = list.get(0).intValue();
        if ((wj1Var.e() == 35 || this.n) && iIntValue == 256) {
            wj1 wj1Var2 = (wj1) this.f.a(new qi1(wj1Var, sy20VarB.g));
            this.k.getClass();
            e eVar = new e(new z70(ImageReader.newInstance(wj1Var2.h().getWidth(), wj1Var2.h().getHeight(), 256, 2)));
            c cVarA = ImageProcessingUtil.a(eVar, (byte[]) wj1Var2.c());
            eVar.g();
            Objects.requireNonNull(cVarA);
            uug uugVarD = wj1Var2.d();
            Objects.requireNonNull(uugVarD);
            Rect rectB = wj1Var2.b();
            int iF = wj1Var2.f();
            Matrix matrixG = wj1Var2.g();
            e06 e06VarA = wj1Var2.a();
            androidx.camera.core.b bVar2 = (androidx.camera.core.b) cVarA;
            Size size = new Size(bVar2.c(), bVar2.b());
            bVar2.getFormat();
            wj1Var = new wj1(cVarA, uugVarD, bVar2.getFormat(), size, rectB, iF, matrixG, e06VarA);
        }
        this.j.getClass();
        c cVar = (c) wj1Var.c();
        zi80 zi80Var = new zi80(cVar, wj1Var.h(), new si1(cVar.m1().c(), cVar.m1().d(), wj1Var.f(), wj1Var.g(), cVar.m1().b()));
        Rect rectB2 = wj1Var.b();
        if (rectB2 != null) {
            Rect rect = new Rect(rectB2);
            if (!rect.intersect(0, 0, zi80Var.f, zi80Var.i)) {
                rect.setEmpty();
            }
        }
        synchronized (zi80Var.d) {
        }
        if (list.size() > 1) {
            sy20VarB.b.n(zi80Var.getFormat());
        }
        return zi80Var;
    }

    public final h8n.h b(b bVar) throws Exception {
        List<Integer> list = this.d.d;
        km20.b(!list.isEmpty());
        Integer num = list.get(0);
        int iIntValue = num.intValue();
        km20.a("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: " + num, qbn.b(iIntValue) || iIntValue == 32);
        sy20 sy20VarB = bVar.b();
        h8n.g gVar = sy20VarB.c;
        s4f0 s4f0Var = sy20VarB.b;
        int i = sy20VarB.g;
        h8n.g gVar2 = sy20VarB.d;
        km20.a("OutputFileOptions cannot be empty", gVar != null);
        wj1 wj1Var = (wj1) this.e.a(bVar);
        if (list.size() <= 1) {
            if (iIntValue != 32) {
                Objects.requireNonNull(gVar);
                return c(wj1Var, gVar, i);
            }
            Objects.requireNonNull(gVar);
            return d(wj1Var, gVar);
        }
        km20.a("The number of OutputFileOptions for simultaneous capture should be at least two", (gVar == null || gVar2 == null) ? false : true);
        if (wj1Var.e() != 32) {
            Objects.requireNonNull(gVar2);
            h8n.h hVarC = c(wj1Var, gVar2, i);
            s4f0Var.n(256);
            return hVarC;
        }
        Objects.requireNonNull(gVar);
        h8n.h hVarD = d(wj1Var, gVar);
        s4f0Var.n(32);
        return hVarD;
    }

    public final h8n.h c(wj1 wj1Var, h8n.g gVar, int i) throws Throwable {
        wj1 wj1Var2 = (wj1) this.f.a(new qi1(wj1Var, i));
        int i2 = 0;
        if (lsg0.c(wj1Var2.b(), wj1Var2.h())) {
            km20.g(null, qbn.b(wj1Var2.e()));
            this.i.getClass();
            Rect rectB = wj1Var2.b();
            byte[] bArr = (byte[]) wj1Var2.c();
            try {
                Bitmap bitmapDecodeRegion = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rectB, new BitmapFactory.Options());
                uug uugVarD = wj1Var2.d();
                Objects.requireNonNull(uugVarD);
                Rect rect = new Rect(0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                int iF = wj1Var2.f();
                Matrix matrixG = wj1Var2.g();
                RectF rectF = lsg0.a;
                Matrix matrix = new Matrix(matrixG);
                matrix.postTranslate(-rectB.left, -rectB.top);
                wj1 wj1Var3 = new wj1(bitmapDecodeRegion, uugVarD, 42, new Size(bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight()), rect, iF, matrix, wj1Var2.a());
                be4 be4Var = this.g;
                mg1 mg1Var = new mg1(wj1Var3, i);
                be4Var.getClass();
                wj1 wj1VarB = mg1Var.b();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((Bitmap) wj1VarB.c()).compress(Bitmap.CompressFormat.JPEG, mg1Var.a(), byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                uug uugVarD2 = wj1VarB.d();
                Objects.requireNonNull(uugVarD2);
                wj1Var2 = new wj1(byteArray, uugVarD2, (Build.VERSION.SDK_INT < 34 || !be4.a.a((Bitmap) wj1VarB.c())) ? 256 : 4101, wj1VarB.h(), wj1VarB.b(), wj1VarB.f(), wj1VarB.g(), wj1VarB.a());
            } catch (IOException e) {
                throw new k8n("Failed to decode JPEG.", e);
            }
        }
        nbp nbpVar = this.h;
        fj1 fj1Var = new fj1(wj1Var2, gVar);
        nbpVar.getClass();
        wj1 wj1VarB2 = fj1Var.b();
        h8n.g gVarA = fj1Var.a();
        File fileB = ilh.b(gVarA);
        byte[] bArr2 = (byte[]) wj1VarB2.c();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileB);
            try {
                fileOutputStream.write(bArr2, 0, new d0p().a(bArr2));
                fileOutputStream.close();
                uug uugVarD3 = wj1VarB2.d();
                Objects.requireNonNull(uugVarD3);
                int iF2 = wj1VarB2.f();
                try {
                    uug.a aVar = uug.b;
                    bvg bvgVar = new bvg(fileB.toString());
                    uug uugVar = new uug(bvgVar);
                    ArrayList arrayList = new ArrayList(uug.e);
                    arrayList.removeAll(uug.f);
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        String str = (String) obj;
                        String strC = uugVarD3.a.c(str);
                        String strC2 = bvgVar.c(str);
                        if (strC != null && !strC.equals(strC2)) {
                            bvgVar.E(str, strC);
                        }
                    }
                    if (uugVar.a() == 0 && iF2 != 0) {
                        uugVar.b(iF2);
                    }
                    uugVar.c();
                    ilh.c(fileB, gVarA);
                    return new h8n.h();
                } catch (IOException e2) {
                    throw new k8n("Failed to update Exif data", e2);
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e3) {
            throw new k8n("Failed to write to temp file", e3);
        }
    }

    public final h8n.h d(wj1 wj1Var, h8n.g gVar) throws Exception {
        int i;
        yte yteVar = this.c;
        if (yteVar == null) {
            CameraCharacteristics cameraCharacteristics = this.b;
            if (cameraCharacteristics == null) {
                throw new k8n("CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (wj1Var.a().e() == null) {
                throw new k8n("CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CaptureResult captureResultE = wj1Var.a().e();
            Objects.requireNonNull(captureResultE);
            DngCreator dngCreator = new DngCreator(cameraCharacteristics, captureResultE);
            yteVar = new yte();
            yteVar.a = dngCreator;
            this.c = yteVar;
        }
        ai1 ai1Var = new ai1((c) wj1Var.c(), wj1Var.f(), gVar);
        h8n.g gVar2 = ai1Var.c;
        File fileB = ilh.b(gVar2);
        c cVar = ai1Var.a;
        DngCreator dngCreator2 = yteVar.a;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileB);
                int i2 = ai1Var.b;
                if (i2 == 0) {
                    i = 1;
                } else if (i2 == 90) {
                    i = 6;
                } else if (i2 != 180) {
                    i = i2 != 270 ? 0 : 8;
                } else {
                    i = 3;
                }
                try {
                    dngCreator2.setOrientation(i);
                    dngCreator2.writeImage(fileOutputStream, cVar.t());
                    fileOutputStream.close();
                    cVar.close();
                    ilh.c(fileB, gVar2);
                    return new h8n.h();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new k8n("Failed to write to temp file", e);
            } catch (IllegalArgumentException e2) {
                throw new k8n("Image with an unsupported format was used", e2);
            } catch (IllegalStateException e3) {
                throw new k8n("Not enough metadata information has been set to write a well-formatted DNG file", e3);
            }
        } catch (Throwable th3) {
            cVar.close();
            throw th3;
        }
    }
}
