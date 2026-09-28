package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class lz60 implements s4i0, v26 {
    public byte[] B;
    public int w;
    public SurfaceTexture y;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final v430 c = new v430();
    public final kzi d = new kzi();
    public final pxf0<Long> e = new pxf0<>();
    public final pxf0<t430> f = new pxf0<>();
    public final float[] i = new float[16];
    public final float[] v = new float[16];
    public volatile int z = 0;
    public int A = -1;

    public final SurfaceTexture a() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            qzk.b();
            this.c.a();
            qzk.b();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            qzk.b();
            int i = iArr[0];
            qzk.a(36197, i);
            this.w = i;
        } catch (qzk.a e) {
            cft.d("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.w);
        this.y = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: kz60
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.a.a.set(true);
            }
        });
        return this.y;
    }

    @Override // defpackage.v26
    public final void c(float[] fArr, long j) {
        this.d.c.a(fArr, j);
    }

    @Override // defpackage.v26
    public final void d() {
        this.e.b();
        kzi kziVar = this.d;
        kziVar.c.b();
        kziVar.d = false;
        this.b.set(true);
    }

    @Override // defpackage.s4i0
    public final void k(long j, long j2, a aVar, MediaFormat mediaFormat) {
        int i;
        ArrayList<t430.a> arrayListA;
        this.e.a(Long.valueOf(j), j2);
        byte[] bArr = aVar.B;
        int i2 = aVar.C;
        byte[] bArr2 = this.B;
        int i3 = this.A;
        this.B = bArr;
        if (i2 == -1) {
            i2 = this.z;
        }
        this.A = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.B)) {
            return;
        }
        byte[] bArr3 = this.B;
        t430 t430Var = null;
        if (bArr3 != null) {
            int i4 = this.A;
            nsz nszVar = new nsz(bArr3);
            try {
                nszVar.J(4);
                int iJ = nszVar.j();
                nszVar.I(0);
                if (iJ == 1886547818) {
                    nszVar.J(8);
                    int i5 = nszVar.b;
                    int i6 = nszVar.c;
                    while (true) {
                        if (i5 < i6) {
                            int iJ2 = nszVar.j() + i5;
                            if (iJ2 > i5 && iJ2 <= i6) {
                                int iJ3 = nszVar.j();
                                if (iJ3 != 2037673328 && iJ3 != 1836279920) {
                                    nszVar.I(iJ2);
                                    i5 = iJ2;
                                }
                                nszVar.H(iJ2);
                                arrayListA = u430.a(nszVar);
                            }
                        }
                        arrayListA = null;
                    }
                } else {
                    arrayListA = u430.a(nszVar);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListA != null) {
                int size = arrayListA.size();
                if (size == 1) {
                    t430.a aVar2 = arrayListA.get(0);
                    t430Var = new t430(aVar2, aVar2, i4);
                } else if (size == 2) {
                    t430Var = new t430(arrayListA.get(0), arrayListA.get(1), i4);
                }
            }
        }
        if (t430Var == null || !v430.b(t430Var)) {
            int i7 = this.A;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f = radians / 36.0f;
            float f2 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < 36; i10 = i) {
                float f3 = radians / 2.0f;
                float f4 = (i10 * f) - f3;
                i = i10 + 1;
                float f5 = (i * f) - f3;
                int i11 = 0;
                while (i11 < 73) {
                    int i12 = i;
                    int i13 = 0;
                    int i14 = 2;
                    while (i13 < i14) {
                        float f6 = radians;
                        float f7 = i11 * f2;
                        float f8 = radians2;
                        double d = (f7 + 3.1415927f) - (radians2 / 2.0f);
                        double d2 = i13 == 0 ? f4 : f5;
                        fArr[i8] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i8 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i15 = i8 + 3;
                        float f9 = f;
                        fArr[i8 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i9] = f7 / f8;
                        int i16 = i9 + 2;
                        fArr2[i9 + 1] = ((i10 + i13) * f9) / f6;
                        if ((i11 == 0 && i13 == 0) || (i11 == 72 && i13 == 1)) {
                            System.arraycopy(fArr, i8, fArr, i15, 3);
                            i8 += 6;
                            i14 = 2;
                            System.arraycopy(fArr2, i9, fArr2, i16, 2);
                            i9 += 4;
                        } else {
                            i14 = 2;
                            i8 = i15;
                            i9 = i16;
                        }
                        i13++;
                        radians = f6;
                        f = f9;
                        radians2 = f8;
                    }
                    i11++;
                    i = i12;
                }
            }
            t430.a aVar3 = new t430.a(new t430.b(0, 1, fArr, fArr2));
            t430Var = new t430(aVar3, aVar3, i7);
        }
        this.f.a(t430Var, j2);
    }
}
