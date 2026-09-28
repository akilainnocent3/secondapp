package com.esotericsoftware.spine.android;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import com.esotericsoftware.spine.android.SpineView;
import com.esotericsoftware.spine.android.b;
import defpackage.a75;
import defpackage.b21;
import defpackage.b9p;
import defpackage.ef4;
import defpackage.efe0;
import defpackage.ei0;
import defpackage.g1a0;
import defpackage.gcy;
import defpackage.h1a0;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.i58;
import defpackage.ib5;
import defpackage.jt;
import defpackage.kb0;
import defpackage.ks40;
import defpackage.lh4;
import defpackage.mw0;
import defpackage.mx90;
import defpackage.oc0;
import defpackage.owh;
import defpackage.p65;
import defpackage.pcb0;
import defpackage.pnv;
import defpackage.ps7;
import defpackage.pvo;
import defpackage.q15;
import defpackage.q590;
import defpackage.qs40;
import defpackage.qx90;
import defpackage.uc80;
import defpackage.w8h;
import defpackage.x5y;
import defpackage.yvg0;
import defpackage.zi50;
import defpackage.ztw;
import defpackage.zza;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class SpineView extends View implements Choreographer.FrameCallback {
    public static final /* synthetic */ int F = 0;
    public b A;
    public a75 B;
    public jt C;
    public zza D;
    public boolean E;
    public long a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float i;
    public float v;
    public final a w;
    public Boolean y;
    public p65 z;

    public SpineView(Context context, b bVar) {
        super(context);
        this.a = 0L;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.i = 0.0f;
        this.v = 0.0f;
        this.w = new a();
        this.y = Boolean.TRUE;
        this.z = new p65();
        this.B = new w8h();
        this.C = jt.c;
        this.D = zza.a;
        this.E = false;
        this.A = bVar;
        if (Build.VERSION.SDK_INT < 29) {
            setLayerType(1, null);
        }
    }

    public static SpineView a(File file, File file2, Context context, b bVar) {
        SpineView spineView = new SpineView(context, bVar);
        spineView.b(file, file2);
        return spineView;
    }

    public final void b(File file, File file2) {
        final pcb0 pcb0Var = new pcb0(file, file2);
        final Handler handler = new Handler(Looper.getMainLooper());
        new Thread(new Runnable() { // from class: qcb0
            @Override // java.lang.Runnable
            public final void run() {
                int i = SpineView.F;
                pcb0 pcb0Var2 = pcb0Var;
                final kb0 kb0VarA = kb0.a(pcb0Var2.a, pcb0Var2.b);
                final SpineView spineView = this.a;
                handler.post(new Runnable() { // from class: rcb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = SpineView.F;
                        SpineView spineView2 = spineView;
                        a75 a75Var = spineView2.B;
                        kb0 kb0Var = kb0VarA;
                        spineView2.z = a75Var.a(kb0Var);
                        spineView2.c();
                        b bVar = spineView2.A;
                        bVar.c = kb0Var;
                        bVar.a.b(bVar);
                        Choreographer.getInstance().postFrameCallback(spineView2);
                    }
                });
            }
        }).start();
    }

    public final void c() {
        if (this.A == null) {
            return;
        }
        p65 p65Var = this.z;
        double d = -p65Var.a;
        double d2 = p65Var.c;
        jt jtVar = this.C;
        this.i = (float) ((d - (d2 / 2.0d)) - ((((double) jtVar.a) * d2) / 2.0d));
        double d3 = -p65Var.b;
        double d4 = p65Var.d;
        this.v = (float) ((d3 - (d4 / 2.0d)) - ((((double) jtVar.b) * d4) / 2.0d));
        int iOrdinal = this.D.ordinal();
        if (iOrdinal == 0) {
            float fMin = (float) Math.min(((double) getWidth()) / this.z.c, ((double) getHeight()) / this.z.d);
            this.f = fMin;
            this.e = fMin;
        } else if (iOrdinal == 1) {
            float fMax = (float) Math.max(((double) getWidth()) / this.z.c, ((double) getHeight()) / this.z.d);
            this.f = fMax;
            this.e = fMax;
        }
        this.c = (float) ((((double) (this.C.a * getWidth())) / 2.0d) + (((double) getWidth()) / 2.0d));
        this.d = (float) ((((double) (this.C.b * getHeight())) / 2.0d) + (((double) getHeight()) / 2.0d));
        this.A.getClass();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.E) {
            long j2 = this.a;
            if (j2 != 0) {
                this.b = (j - j2) / 1.0E9f;
            }
            this.a = j;
            invalidate();
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public jt getAlignment() {
        return this.C;
    }

    public a75 getBoundsProvider() {
        return this.B;
    }

    public zza getContentMode() {
        return this.D;
    }

    public b getController() {
        return this.A;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E = false;
    }

    /* JADX WARN: Code duplicated, block: B:288:0x0a83  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        g1a0 g1a0Var;
        int i;
        Object bVar;
        g1a0 g1a0Var2;
        g1a0 g1a0Var3;
        int i2;
        float f;
        float f2;
        g1a0[] g1a0VarArr;
        qx90 qx90Var;
        a.C0187a c0187a;
        mw0<a.b> mw0Var;
        owh owhVar;
        a.b bVar2;
        q590 q590Var;
        owh owhVar2;
        owh owhVar3;
        int i3;
        yvg0.b bVar3;
        yvg0.a aVar;
        q590 q590Var2;
        int i4;
        q590[] q590VarArr;
        owh[] owhVarArr;
        int i5;
        int i6;
        yvg0.b bVar4;
        yvg0.a aVar2;
        qx90 qx90Var2;
        float f3;
        float f4;
        a.b bVar5;
        float f5;
        float f6;
        float f7;
        float f8;
        int i7;
        int i8;
        g1a0 g1a0Var4;
        short[] sArr;
        i58 i58Var;
        float[] fArr;
        int i9;
        a.b bVar6;
        qx90 qx90Var3;
        q590 q590Var3;
        pvo pvoVar;
        owh owhVar4;
        owh owhVar5;
        owh owhVar6;
        owh owhVar7;
        qx90 qx90Var4;
        int i10;
        owh owhVar8;
        owh owhVar9;
        float f9;
        float f10;
        float f11;
        int i11;
        super.onDraw(canvas);
        b bVar7 = this.A;
        if (bVar7 == null || bVar7.c == null || !this.y.booleanValue()) {
            return;
        }
        b bVar8 = this.A;
        if (bVar8.d) {
            kb0 kb0Var = bVar8.c;
            if (kb0Var == null) {
                b9p.a("Controller is not initialized yet.");
                return;
            } else {
                kb0Var.b(this.b);
                this.A.getClass();
            }
        }
        canvas.save();
        canvas.translate(this.c, this.d);
        canvas.scale(this.e, this.f * (-1.0f));
        canvas.translate(this.i, this.v);
        this.A.getClass();
        mx90 mx90VarB = this.A.b();
        a aVar3 = this.w;
        qx90 qx90Var5 = aVar3.a;
        owh owhVar10 = qx90Var5.b;
        q590 q590Var4 = qx90Var5.f;
        owh owhVar11 = qx90Var5.e;
        owh owhVar12 = qx90Var5.d;
        i58 i58Var2 = mx90VarB.k;
        float f12 = i58Var2.a;
        float f13 = i58Var2.b;
        float f14 = i58Var2.c;
        float f15 = i58Var2.d;
        a.C0187a c0187a2 = aVar3.b;
        mw0<a.b> mw0Var2 = aVar3.c;
        c0187a2.b(mw0Var2);
        mw0Var2.clear();
        a.b bVarD = c0187a2.d();
        mw0Var2.a(bVarD);
        mw0<g1a0> mw0Var3 = mx90VarB.d;
        g1a0[] g1a0VarArr2 = mw0Var3.a;
        int i12 = mw0Var3.b;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = 1;
            g1a0 g1a0Var5 = g1a0VarArr2[i13];
            lh4 lh4Var = g1a0Var5.b;
            int i16 = i12;
            h1a0 h1a0Var = g1a0Var5.a;
            if (lh4Var.A) {
                b21 b21Var = g1a0Var5.e;
                if (b21Var == null) {
                    ps7 ps7Var = qx90Var5.h;
                    if (ps7Var != null && ps7Var.i == h1a0Var) {
                        qx90Var5.h = null;
                        qx90Var5.i = null;
                        owhVar12.b = 0;
                        owhVar11.b = 0;
                        q590Var4.b = 0;
                        owhVar10.b = 0;
                    }
                } else {
                    i2 = i13;
                    if (b21Var instanceof qs40) {
                        qs40 qs40Var = (qs40) b21Var;
                        uc80 uc80Var = qs40Var.n;
                        if (uc80Var != null) {
                            uc80Var.a(g1a0Var5, qs40Var);
                        }
                        oc0 oc0Var = qs40Var.c.a;
                        f = f12;
                        ef4 ef4Var = h1a0Var.g;
                        f2 = f14;
                        ef4 ef4Var2 = bVarD.e;
                        if (ef4Var2 == null && bVarD.f == null) {
                            bVarD.e = ef4Var;
                            bVarD.f = oc0Var;
                            ef4Var2 = ef4Var;
                        }
                        if (ef4Var2 == ef4Var && bVarD.f == oc0Var) {
                            g1a0VarArr = g1a0VarArr2;
                            if (bVarD.a.b + 8 <= 64000) {
                                ef4Var2 = ef4Var2;
                                i11 = i14;
                            }
                            owh owhVar13 = bVarD.a;
                            owhVar13.d(owhVar13.b + 8);
                            qs40Var.g(g1a0Var5, owhVar13.a, i11);
                            float[] fArr2 = qs40Var.k;
                            i58Var = qs40Var.m;
                            sArr = a.d;
                            i9 = i11;
                            g1a0Var4 = g1a0Var5;
                            fArr = fArr2;
                            i8 = 8;
                        } else {
                            ef4Var2 = ef4Var2;
                            ef4Var2 = ef4Var2;
                            g1a0VarArr = g1a0VarArr2;
                        }
                        ef4Var2 = ef4Var2;
                        bVarD = c0187a2.d();
                        mw0Var2.a(bVarD);
                        bVarD.e = ef4Var;
                        bVarD.f = oc0Var;
                        i11 = 0;
                        owh owhVar14 = bVarD.a;
                        owhVar14.d(owhVar14.b + 8);
                        qs40Var.g(g1a0Var5, owhVar14.a, i11);
                        float[] fArr3 = qs40Var.k;
                        i58Var = qs40Var.m;
                        sArr = a.d;
                        i9 = i11;
                        g1a0Var4 = g1a0Var5;
                        fArr = fArr3;
                        i8 = 8;
                    } else {
                        f = f12;
                        f2 = f14;
                        g1a0VarArr = g1a0VarArr2;
                        if (b21Var instanceof pnv) {
                            pnv pnvVar = (pnv) b21Var;
                            int i17 = pnvVar.g;
                            uc80 uc80Var2 = pnvVar.n;
                            if (uc80Var2 != null) {
                                uc80Var2.a(g1a0Var5, pnvVar);
                            }
                            oc0 oc0Var2 = pnvVar.i.a;
                            ef4 ef4Var3 = h1a0Var.g;
                            ef4 ef4Var4 = bVarD.e;
                            if (ef4Var4 == null && bVarD.f == null) {
                                bVarD.e = ef4Var3;
                                bVarD.f = oc0Var2;
                                ef4Var4 = ef4Var3;
                            }
                            if (ef4Var4 == ef4Var3 && bVarD.f == oc0Var2 && bVarD.a.b + i17 <= 64000) {
                                i7 = i14;
                            } else {
                                bVarD = c0187a2.d();
                                mw0Var2.a(bVarD);
                                bVarD.e = ef4Var3;
                                bVarD.f = oc0Var2;
                                i7 = 0;
                            }
                            owh owhVar15 = bVarD.a;
                            owhVar15.d(owhVar15.b + i17);
                            i8 = i17;
                            pnvVar.g(g1a0Var5, 0, i8, owhVar15.a, i7);
                            g1a0Var4 = g1a0Var5;
                            float[] fArr4 = pnvVar.k;
                            sArr = pnvVar.l;
                            i58Var = pnvVar.m;
                            fArr = fArr4;
                            i9 = i7;
                        } else {
                            qx90Var = qx90Var5;
                            owh owhVar16 = owhVar10;
                            c0187a = c0187a2;
                            mw0Var = mw0Var2;
                            if (b21Var instanceof ps7) {
                                ps7 ps7Var2 = (ps7) b21Var;
                                yvg0 yvg0Var = qx90Var.a;
                                if (qx90Var.h == null && (i3 = ps7Var2.g) >= 6) {
                                    qx90Var.h = ps7Var2;
                                    ps7Var2.g(g1a0Var5, 0, i3, owhVar16.d(i3), 0);
                                    qx90.a(owhVar16);
                                    float[] fArr5 = owhVar16.a;
                                    int i18 = owhVar16.b >> 1;
                                    q590 q590Var5 = yvg0Var.c;
                                    q590Var5.b = 0;
                                    short[] sArrF = q590Var5.f(i18);
                                    for (short s = 0; s < i18; s = (short) (s + 1)) {
                                        sArrF[s] = s;
                                    }
                                    q15 q15Var = yvg0Var.d;
                                    if (i18 < 0) {
                                        hb5.a(hce0.a(i18, "newSize must be >= 0: "));
                                        return;
                                    }
                                    boolean[] zArr = q15Var.a;
                                    if (i18 > zArr.length) {
                                        int iMax = Math.max(8, i18);
                                        boolean[] zArr2 = new boolean[iMax];
                                        System.arraycopy(q15Var.a, 0, zArr2, 0, Math.min(q15Var.b, iMax));
                                        q15Var.a = zArr2;
                                        zArr = zArr2;
                                    }
                                    q15Var.b = i18;
                                    for (int i19 = 0; i19 < i18; i19++) {
                                        zArr[i19] = yvg0.a(i19, i18, fArr5, sArrF);
                                    }
                                    q590 q590Var6 = yvg0Var.e;
                                    q590Var6.b = 0;
                                    int iMax2 = Math.max(0, i18 - 2) << 2;
                                    if (iMax2 < 0) {
                                        hb5.a(hce0.a(iMax2, "additionalCapacity must be >= 0: "));
                                        return;
                                    }
                                    int i20 = q590Var6.b + iMax2;
                                    if (i20 > q590Var6.a.length) {
                                        q590Var6.e(Math.max(Math.max(8, i20), (int) (q590Var6.b * 1.75f)));
                                    }
                                    int i21 = 3;
                                    while (i18 > i21) {
                                        int i22 = i18 - 1;
                                        int i23 = 1;
                                        int i24 = 0;
                                        while (true) {
                                            if (zArr[i24]) {
                                                bVar5 = bVarD;
                                            } else {
                                                int i25 = sArrF[i22] << 1;
                                                int i26 = sArrF[i24] << 1;
                                                int i27 = sArrF[i23] << 1;
                                                float f16 = fArr5[i25];
                                                float f17 = fArr5[i25 + 1];
                                                float f18 = fArr5[i26];
                                                float f19 = fArr5[i26 + 1];
                                                float f20 = fArr5[i27];
                                                float f21 = fArr5[i27 + 1];
                                                bVar5 = bVarD;
                                                int i28 = (i23 + 1) % i18;
                                                while (true) {
                                                    if (i28 == i22) {
                                                        break;
                                                    }
                                                    if (zArr[i28]) {
                                                        int i29 = sArrF[i28] << 1;
                                                        float f22 = fArr5[i29];
                                                        float f23 = fArr5[i29 + 1];
                                                        float f24 = f16;
                                                        float f25 = f17;
                                                        float f26 = f20;
                                                        float f27 = f21;
                                                        boolean zB = yvg0.b(f26, f27, f24, f25, f22, f23);
                                                        f5 = f26;
                                                        f6 = f27;
                                                        f16 = f24;
                                                        f17 = f25;
                                                        f7 = f18;
                                                        f8 = f19;
                                                        if (zB && yvg0.b(f16, f17, f7, f8, f22, f23) && yvg0.b(f7, f8, f5, f6, f22, f23)) {
                                                            break;
                                                        }
                                                    } else {
                                                        f7 = f18;
                                                        f8 = f19;
                                                        f5 = f20;
                                                        f6 = f21;
                                                    }
                                                    i28 = (i28 + 1) % i18;
                                                    f20 = f5;
                                                    f21 = f6;
                                                    f18 = f7;
                                                    f19 = f8;
                                                }
                                            }
                                            if (i23 == 0) {
                                                while (zArr[i24] && (i24 = i24 - 1) > 0) {
                                                }
                                                break;
                                            } else {
                                                i22 = i24;
                                                i24 = i23;
                                                i23 = (i23 + 1) % i18;
                                                bVarD = bVar5;
                                            }
                                        }
                                        q590Var6.b(sArrF[((i18 + i24) - 1) % i18]);
                                        q590Var6.b(sArrF[i24]);
                                        int i30 = i24 + 1;
                                        q590Var6.b(sArrF[i30 % i18]);
                                        int i31 = q590Var5.b;
                                        boolean[] zArr3 = zArr;
                                        q590 q590Var7 = q590Var4;
                                        if (i24 >= i31) {
                                            ks40.a(q590Var5.b, efe0.a(i24, "index can't be >= size: ", " >= "));
                                            return;
                                        }
                                        short[] sArr2 = q590Var5.a;
                                        short s2 = sArr2[i24];
                                        owh owhVar17 = owhVar11;
                                        int i32 = i31 - 1;
                                        q590Var5.b = i32;
                                        if (q590Var5.c) {
                                            System.arraycopy(sArr2, i30, sArr2, i24, i32 - i24);
                                        } else {
                                            sArr2[i24] = sArr2[i32];
                                        }
                                        int i33 = q15Var.b;
                                        if (i24 >= i33) {
                                            ks40.a(q15Var.b, efe0.a(i24, "index can't be >= size: ", " >= "));
                                            return;
                                        }
                                        boolean[] zArr4 = q15Var.a;
                                        boolean z = zArr4[i24];
                                        int i34 = i33 - 1;
                                        q15Var.b = i34;
                                        System.arraycopy(zArr4, i30, zArr4, i24, i34 - i24);
                                        i18--;
                                        int i35 = ((i18 + i24) - 1) % i18;
                                        if (i24 == i18) {
                                            i24 = 0;
                                        }
                                        zArr3[i35] = yvg0.a(i35, i18, fArr5, sArrF);
                                        zArr3[i24] = yvg0.a(i24, i18, fArr5, sArrF);
                                        zArr = zArr3;
                                        q590Var4 = q590Var7;
                                        owhVar11 = owhVar17;
                                        bVarD = bVar5;
                                        i21 = 3;
                                    }
                                    bVar2 = bVarD;
                                    q590Var = q590Var4;
                                    owhVar2 = owhVar11;
                                    if (i18 == i21) {
                                        q590Var6.b(sArrF[2]);
                                        q590Var6.b(sArrF[0]);
                                        q590Var6.b(sArrF[1]);
                                    }
                                    float[] fArr6 = owhVar16.a;
                                    mw0<owh> mw0Var4 = yvg0Var.a;
                                    yvg0.a aVar4 = yvg0Var.f;
                                    aVar4.b(mw0Var4);
                                    mw0Var4.clear();
                                    mw0<q590> mw0Var5 = yvg0Var.b;
                                    yvg0.b bVar9 = yvg0Var.g;
                                    bVar9.b(mw0Var5);
                                    mw0Var5.clear();
                                    q590 q590Var8 = (q590) bVar9.d();
                                    q590Var8.b = 0;
                                    owh owhVar18 = (owh) aVar4.d();
                                    owhVar18.b = 0;
                                    short[] sArr3 = q590Var6.a;
                                    int i36 = q590Var6.b;
                                    int i37 = -1;
                                    int i38 = 0;
                                    int iC = 0;
                                    while (i38 < i36) {
                                        int i39 = sArr3[i38] << 1;
                                        float[] fArr7 = fArr6;
                                        int i40 = sArr3[i38 + 1] << 1;
                                        short[] sArr4 = sArr3;
                                        int i41 = sArr3[i38 + 2] << 1;
                                        int i42 = i36;
                                        float f28 = fArr7[i39];
                                        int i43 = i38;
                                        float f29 = fArr7[i39 + 1];
                                        owh owhVar19 = owhVar16;
                                        float f30 = fArr7[i40];
                                        owh owhVar20 = owhVar12;
                                        float f31 = fArr7[i40 + 1];
                                        float f32 = fArr7[i41];
                                        float f33 = fArr7[i41 + 1];
                                        if (i37 == i39) {
                                            int i44 = i37;
                                            int i45 = owhVar18.b;
                                            int i46 = i45 - 4;
                                            float[] fArr8 = owhVar18.a;
                                            int iC2 = yvg0.c(fArr8[i46], fArr8[i45 - 3], fArr8[i45 - 2], fArr8[i45 - 1], f32, f33);
                                            qx90Var2 = qx90Var;
                                            int iC3 = yvg0.c(f32, f33, fArr8[0], fArr8[1], fArr8[2], fArr8[3]);
                                            bVar4 = bVar9;
                                            aVar2 = aVar4;
                                            f3 = f32;
                                            f4 = f33;
                                            if (iC2 == iC && iC3 == iC) {
                                                owhVar18.a(f3);
                                                owhVar18.a(f4);
                                                q590Var8.a(i41);
                                                i37 = i44;
                                            }
                                            i38 = i43 + 3;
                                            i36 = i42;
                                            fArr6 = fArr7;
                                            sArr3 = sArr4;
                                            owhVar16 = owhVar19;
                                            owhVar12 = owhVar20;
                                            bVar9 = bVar4;
                                            aVar4 = aVar2;
                                            qx90Var = qx90Var2;
                                        } else {
                                            bVar4 = bVar9;
                                            aVar2 = aVar4;
                                            qx90Var2 = qx90Var;
                                            f3 = f32;
                                            f4 = f33;
                                        }
                                        if (owhVar18.b > 0) {
                                            mw0Var4.a(owhVar18);
                                            mw0Var5.a(q590Var8);
                                            owhVar18 = (owh) aVar2.d();
                                            q590Var8 = (q590) bVar4.d();
                                        }
                                        owhVar18.b = 0;
                                        owhVar18.a(f28);
                                        owhVar18.a(f29);
                                        owhVar18.a(f30);
                                        owhVar18.a(f31);
                                        owhVar18.a(f3);
                                        owhVar18.a(f4);
                                        q590Var8.b = 0;
                                        q590Var8.a(i39);
                                        q590Var8.a(i40);
                                        q590Var8.a(i41);
                                        iC = yvg0.c(f28, f29, f30, f31, f3, f4);
                                        i37 = i39;
                                        i38 = i43 + 3;
                                        i36 = i42;
                                        fArr6 = fArr7;
                                        sArr3 = sArr4;
                                        owhVar16 = owhVar19;
                                        owhVar12 = owhVar20;
                                        bVar9 = bVar4;
                                        aVar4 = aVar2;
                                        qx90Var = qx90Var2;
                                    }
                                    owhVar = owhVar16;
                                    yvg0.b bVar10 = bVar9;
                                    yvg0.a aVar5 = aVar4;
                                    owhVar3 = owhVar12;
                                    qx90 qx90Var6 = qx90Var;
                                    if (owhVar18.b > 0) {
                                        mw0Var4.a(owhVar18);
                                        mw0Var5.a(q590Var8);
                                    }
                                    q590[] q590VarArr2 = mw0Var5.a;
                                    owh[] owhVarArr2 = mw0Var4.a;
                                    int i47 = mw0Var4.b;
                                    int i48 = 0;
                                    while (i48 < i47) {
                                        q590 q590Var9 = q590VarArr2[i48];
                                        int i49 = q590Var9.b;
                                        if (i49 != 0) {
                                            if (i49 == 0) {
                                                ib5.a("Array is empty.");
                                                return;
                                            }
                                            short s3 = q590Var9.a[0];
                                            short sD = q590Var9.d(i49 - 1);
                                            owh owhVar21 = owhVarArr2[i48];
                                            int i50 = owhVar21.b;
                                            float[] fArr9 = owhVar21.a;
                                            float f34 = fArr9[i50 - 4];
                                            float f35 = fArr9[i50 - 3];
                                            float f36 = fArr9[i50 - 2];
                                            float f37 = fArr9[i50 - 1];
                                            float f38 = fArr9[0];
                                            float f39 = fArr9[i15];
                                            float f40 = fArr9[2];
                                            int i51 = 3;
                                            float f41 = fArr9[3];
                                            int iC4 = yvg0.c(f34, f35, f36, f37, f38, f39);
                                            int i52 = 0;
                                            while (i52 < i47) {
                                                if (i52 == i48 || (i4 = (q590Var2 = q590VarArr2[i52]).b) != i51) {
                                                    q590VarArr = q590VarArr2;
                                                    owhVarArr = owhVarArr2;
                                                    i5 = i47;
                                                    i6 = i48;
                                                } else {
                                                    if (i4 == 0) {
                                                        ib5.a("Array is empty.");
                                                        return;
                                                    }
                                                    short s4 = q590Var2.a[0];
                                                    q590VarArr = q590VarArr2;
                                                    short sD2 = q590Var2.d(i15);
                                                    owhVarArr = owhVarArr2;
                                                    short sD3 = q590Var2.d(2);
                                                    owh owhVar22 = owhVarArr[i52];
                                                    i5 = i47;
                                                    float fC = owhVar22.c(owhVar22.b - 2);
                                                    float fC2 = owhVar22.c(owhVar22.b - 1);
                                                    if (s4 == s3 && sD2 == sD) {
                                                        int iC5 = yvg0.c(f34, f35, f36, f37, fC, fC2);
                                                        int iC6 = yvg0.c(fC, fC2, f38, f39, f40, f41);
                                                        i6 = i48;
                                                        if (iC5 == iC4 && iC6 == iC4) {
                                                            owhVar22.b = 0;
                                                            q590Var2.b = 0;
                                                            owhVar21.a(fC);
                                                            owhVar21.a(fC2);
                                                            q590Var9.a(sD3);
                                                            f34 = f36;
                                                            f35 = f37;
                                                            i52 = 0;
                                                            f37 = fC2;
                                                            f36 = fC;
                                                        }
                                                    } else {
                                                        i6 = i48;
                                                    }
                                                }
                                                i15 = 1;
                                                i52++;
                                                q590VarArr2 = q590VarArr;
                                                owhVarArr2 = owhVarArr;
                                                i47 = i5;
                                                i48 = i6;
                                                i51 = 3;
                                            }
                                        }
                                        i48++;
                                        q590VarArr2 = q590VarArr2;
                                        owhVarArr2 = owhVarArr2;
                                        i47 = i47;
                                    }
                                    owh[] owhVarArr3 = owhVarArr2;
                                    int i53 = mw0Var4.b - 1;
                                    while (i53 >= 0) {
                                        owh owhVar23 = owhVarArr3[i53];
                                        if (owhVar23.b == 0) {
                                            mw0Var4.e(i53);
                                            aVar = aVar5;
                                            aVar.a(owhVar23);
                                            bVar3 = bVar10;
                                            bVar3.a(mw0Var5.e(i53));
                                        } else {
                                            bVar3 = bVar10;
                                            aVar = aVar5;
                                        }
                                        i53--;
                                        aVar5 = aVar;
                                        bVar10 = bVar3;
                                    }
                                    qx90Var = qx90Var6;
                                    qx90Var.i = mw0Var4;
                                    mw0.b<owh> it = mw0Var4.iterator();
                                    while (it.hasNext()) {
                                        owh next = it.next();
                                        qx90.a(next);
                                        next.a(next.a[0]);
                                        next.a(next.a[1]);
                                    }
                                } else {
                                    owhVar = owhVar16;
                                    bVar2 = bVarD;
                                    q590Var = q590Var4;
                                    owhVar2 = owhVar11;
                                    owhVar3 = owhVar12;
                                }
                            } else {
                                owhVar = owhVar16;
                                bVar2 = bVarD;
                                q590Var = q590Var4;
                                owhVar2 = owhVar11;
                                owhVar3 = owhVar12;
                            }
                            bVarD = bVar2;
                        }
                    }
                    pvo pvoVar2 = bVarD.c;
                    owh owhVar24 = bVarD.b;
                    c0187a = c0187a2;
                    owh owhVar25 = bVarD.a;
                    mw0Var = mw0Var2;
                    q590 q590Var10 = bVarD.d;
                    i58 i58Var3 = g1a0Var4.c;
                    owh owhVar26 = owhVar10;
                    int i54 = ((int) (i58Var3.c * f2 * i58Var.c * 255.0f)) | (((int) ((i58Var.d * (i58Var3.d * f15)) * 255.0f)) << 24) | (((int) ((i58Var.a * (i58Var3.a * f)) * 255.0f)) << 16) | (((int) ((i58Var.b * (i58Var3.b * f13)) * 255.0f)) << 8);
                    int i55 = q590Var10.b;
                    int length = sArr.length;
                    if (qx90Var5.h != null) {
                        float[] fArr10 = owhVar25.a;
                        int length2 = sArr.length;
                        owh owhVar27 = qx90Var5.c;
                        mw0<owh> mw0Var6 = qx90Var5.i;
                        owh[] owhVarArr4 = mw0Var6.a;
                        int i56 = mw0Var6.b;
                        owhVar12.b = 0;
                        owhVar11.b = 0;
                        q590Var4.b = 0;
                        int i57 = 0;
                        short s5 = 0;
                        while (i57 < length2) {
                            int i58 = sArr[i57] << 1;
                            int i59 = i9 + i58;
                            int i60 = i57;
                            float f42 = fArr10[i59];
                            int i61 = length2;
                            float f43 = fArr10[i59 + 1];
                            float f44 = fArr[i58];
                            float f45 = fArr[i58 + 1];
                            int i62 = sArr[i60 + 1] << 1;
                            int i63 = i9 + i62;
                            pvo pvoVar3 = pvoVar2;
                            float f46 = fArr10[i63];
                            a.b bVar11 = bVarD;
                            float f47 = fArr10[i63 + 1];
                            float f48 = fArr[i62];
                            float f49 = fArr[i62 + 1];
                            int i64 = sArr[i60 + 2] << 1;
                            int i65 = i9 + i64;
                            short[] sArr5 = sArr;
                            float f50 = fArr10[i65];
                            float[] fArr11 = fArr;
                            float f51 = fArr10[i65 + 1];
                            float f52 = fArr11[i64];
                            float f53 = fArr11[i64 + 1];
                            q590 q590Var11 = q590Var10;
                            int i66 = 0;
                            while (true) {
                                if (i66 >= i56) {
                                    owhVar6 = owhVar24;
                                    owhVar7 = owhVar27;
                                    qx90Var4 = qx90Var5;
                                    i10 = i56;
                                    break;
                                }
                                i10 = i56;
                                int i67 = owhVar12.b;
                                owh owhVar28 = owhVarArr4[i66];
                                int i68 = i66;
                                int i69 = owhVar28.b % 4;
                                owhVar6 = owhVar24;
                                owh owhVar29 = qx90Var5.g;
                                if (i69 >= 2) {
                                    owhVar9 = owhVar27;
                                    owhVar8 = owhVar29;
                                } else {
                                    owhVar8 = owhVar27;
                                    owhVar9 = owhVar29;
                                }
                                qx90Var4 = qx90Var5;
                                owhVar9.b = 0;
                                owhVar9.a(f42);
                                owhVar9.a(f43);
                                owhVar9.a(f46);
                                owhVar9.a(f47);
                                owhVar9.a(f50);
                                owhVar9.a(f51);
                                owhVar9.a(f42);
                                owhVar9.a(f43);
                                owhVar8.b = 0;
                                int i70 = owhVar28.b - 4;
                                float[] fArr12 = owhVar28.a;
                                owh owhVar30 = owhVar8;
                                owh owhVar31 = owhVar9;
                                owh owhVar32 = owhVar30;
                                float f54 = f42;
                                int i71 = 0;
                                boolean z2 = false;
                                while (true) {
                                    float f55 = fArr12[i71];
                                    float f56 = fArr12[i71 + 1];
                                    int i72 = i71 + 2;
                                    float f57 = f55 - fArr12[i72];
                                    float f58 = f56 - fArr12[i71 + 3];
                                    f9 = f47;
                                    int i73 = owhVar32.b;
                                    float[] fArr13 = fArr12;
                                    float[] fArr14 = owhVar31.a;
                                    int i74 = owhVar31.b - 2;
                                    f10 = f43;
                                    int i75 = 0;
                                    while (i75 < i74) {
                                        float f59 = fArr14[i75];
                                        float f60 = fArr14[i75 + 1];
                                        int i76 = i75 + 2;
                                        int i77 = i74;
                                        float f61 = fArr14[i76];
                                        float f62 = fArr14[i75 + 3];
                                        boolean z3 = (f55 - f61) * f58 > (f56 - f62) * f57;
                                        float f63 = ((f55 - f59) * f58) - ((f56 - f60) * f57);
                                        if (f63 > 0.0f) {
                                            if (z3) {
                                                owhVar32.a(f61);
                                                owhVar32.a(f62);
                                            } else {
                                                float f64 = f61 - f59;
                                                float f65 = f62 - f60;
                                                float f66 = f63 / ((f64 * f58) - (f65 * f57));
                                                if (f66 < 0.0f || f66 > 1.0f) {
                                                    owhVar32.a(f61);
                                                    owhVar32.a(f62);
                                                } else {
                                                    owhVar32.a((f64 * f66) + f59);
                                                    owhVar32.a((f65 * f66) + f60);
                                                    z2 = true;
                                                }
                                            }
                                            f51 = f51;
                                        } else {
                                            if (z3) {
                                                float f67 = f61 - f59;
                                                float f68 = f62 - f60;
                                                float f69 = f63 / ((f67 * f58) - (f68 * f57));
                                                if (f69 < 0.0f || f69 > 1.0f) {
                                                    f51 = f51;
                                                    owhVar32.a(f61);
                                                    owhVar32.a(f62);
                                                } else {
                                                    owhVar32.a((f67 * f69) + f59);
                                                    owhVar32.a((f68 * f69) + f60);
                                                    owhVar32.a(f61);
                                                    owhVar32.a(f62);
                                                }
                                            }
                                            z2 = true;
                                        }
                                        i75 = i76;
                                        i74 = i77;
                                        f51 = f51;
                                    }
                                    f11 = f51;
                                    if (i73 == owhVar32.b) {
                                        owhVar27.b = 0;
                                        z2 = true;
                                        break;
                                    }
                                    owhVar32.a(owhVar32.a[0]);
                                    owhVar32.a(owhVar32.a[1]);
                                    if (i71 == i70) {
                                        if (owhVar27 != owhVar32) {
                                            owhVar27.b = 0;
                                            owhVar27.b(owhVar32.a, owhVar32.b - 2);
                                            break;
                                        } else {
                                            owhVar27.d(owhVar27.b - 2);
                                            break;
                                        }
                                    }
                                    owh owhVar33 = owhVar27;
                                    owhVar31.b = 0;
                                    owh owhVar34 = owhVar31;
                                    owhVar31 = owhVar32;
                                    owhVar32 = owhVar34;
                                    owhVar27 = owhVar33;
                                    i71 = i72;
                                    f47 = f9;
                                    fArr12 = fArr13;
                                    f43 = f10;
                                    f51 = f11;
                                }
                                if (!z2) {
                                    owhVar7 = owhVar27;
                                    int i78 = i67 + 6;
                                    float[] fArrD = owhVar12.d(i78);
                                    float[] fArrD2 = owhVar11.d(i78);
                                    fArrD[i67] = f54;
                                    int i79 = i67 + 1;
                                    fArrD[i79] = f10;
                                    int i80 = i67 + 2;
                                    fArrD[i80] = f46;
                                    int i81 = i67 + 3;
                                    fArrD[i81] = f9;
                                    int i82 = i67 + 4;
                                    fArrD[i82] = f50;
                                    int i83 = i67 + 5;
                                    fArrD[i83] = f11;
                                    fArrD2[i67] = f44;
                                    fArrD2[i79] = f45;
                                    fArrD2[i80] = f48;
                                    fArrD2[i81] = f49;
                                    fArrD2[i82] = f52;
                                    fArrD2[i83] = f53;
                                    int i84 = q590Var4.b;
                                    short[] sArrF2 = q590Var4.f(i84 + 3);
                                    sArrF2[i84] = s5;
                                    sArrF2[i84 + 1] = (short) (s5 + 1);
                                    sArrF2[i84 + 2] = (short) (s5 + 2);
                                    s5 = (short) (s5 + 3);
                                    break;
                                }
                                int i85 = owhVar27.b;
                                if (i85 != 0) {
                                    float f70 = f9 - f11;
                                    float f71 = f50 - f46;
                                    float f72 = f54 - f50;
                                    float f73 = f11 - f10;
                                    float f74 = 1.0f / (((f10 - f11) * f71) + (f70 * f72));
                                    int i86 = i85 >> 1;
                                    float[] fArr15 = owhVar27.a;
                                    int i87 = (i86 * 2) + i67;
                                    float[] fArrD3 = owhVar12.d(i87);
                                    float[] fArrD4 = owhVar11.d(i87);
                                    int i88 = 0;
                                    while (i88 < i85) {
                                        float f75 = fArr15[i88];
                                        float f76 = fArr15[i88 + 1];
                                        fArrD3[i67] = f75;
                                        int i89 = i67 + 1;
                                        fArrD3[i89] = f76;
                                        float f77 = f75 - f50;
                                        float f78 = f76 - f11;
                                        float f79 = ((f71 * f78) + (f70 * f77)) * f74;
                                        float f80 = ((f78 * f72) + (f77 * f73)) * f74;
                                        float f81 = (1.0f - f79) - f80;
                                        fArrD4[i67] = (f52 * f81) + (f48 * f80) + (f44 * f79);
                                        fArrD4[i89] = (f81 * f53) + (f80 * f49) + (f79 * f45);
                                        i88 += 2;
                                        i67 += 2;
                                    }
                                    int i90 = q590Var4.b;
                                    short[] sArrF3 = q590Var4.f(((i86 - 2) * 3) + i90);
                                    int i91 = i86 - 1;
                                    int i92 = 1;
                                    while (i92 < i91) {
                                        sArrF3[i90] = s5;
                                        int i93 = s5 + i92;
                                        sArrF3[i90 + 1] = (short) i93;
                                        sArrF3[i90 + 2] = (short) (i93 + 1);
                                        i92++;
                                        i90 += 3;
                                    }
                                    s5 = (short) (s5 + i86);
                                }
                                i66 = i68 + 1;
                                i56 = i10;
                                owhVar24 = owhVar6;
                                qx90Var5 = qx90Var4;
                                f42 = f54;
                                owhVar27 = owhVar27;
                                f47 = f9;
                                f43 = f10;
                                f51 = f11;
                            }
                            i57 = i60 + 3;
                            length2 = i61;
                            pvoVar2 = pvoVar3;
                            bVarD = bVar11;
                            sArr = sArr5;
                            fArr = fArr11;
                            q590Var10 = q590Var11;
                            i56 = i10;
                            owhVar24 = owhVar6;
                            qx90Var5 = qx90Var4;
                            owhVar27 = owhVar7;
                        }
                        bVar6 = bVarD;
                        qx90Var3 = qx90Var5;
                        pvoVar = pvoVar2;
                        owhVar25.d(owhVar12.b + i9);
                        System.arraycopy(owhVar12.a, 0, owhVar25.a, i9, owhVar12.b);
                        owhVar4 = owhVar24;
                        owhVar4.b(owhVar11.a, owhVar11.b);
                        q590Var3 = q590Var10;
                        q590Var3.c(q590Var4.a, q590Var4.b);
                        int i94 = owhVar12.b;
                        length = q590Var4.b;
                        i8 = i94;
                    } else {
                        bVar6 = bVarD;
                        qx90Var3 = qx90Var5;
                        q590Var3 = q590Var10;
                        pvoVar = pvoVar2;
                        owhVar4 = owhVar24;
                        float[] fArr16 = fArr;
                        owhVar4.b(fArr16, fArr16.length);
                        q590Var3.c(sArr, sArr.length);
                    }
                    float[] fArr17 = owhVar4.a;
                    a.b bVar12 = bVar6;
                    int width = bVar12.f.b.getWidth();
                    int height = bVar12.f.b.getHeight();
                    int i95 = i9 + i8;
                    for (int i96 = i9; i96 < i95; i96 += 2) {
                        fArr17[i96] = fArr17[i96] * width;
                        int i97 = i96 + 1;
                        fArr17[i97] = fArr17[i97] * height;
                    }
                    pvo pvoVar4 = pvoVar;
                    int i98 = i8 >> 1;
                    pvoVar4.a(pvoVar4.b + i98);
                    int[] iArr = pvoVar4.a;
                    int i99 = i9 >> 1;
                    int i100 = i98 + i99;
                    for (int i101 = i99; i101 < i100; i101++) {
                        iArr[i101] = i54;
                    }
                    short[] sArr6 = q590Var3.a;
                    int i102 = i55 + length;
                    for (int i103 = i55; i103 < i102; i103++) {
                        sArr6[i103] = (short) (sArr6[i103] + i99);
                    }
                    qx90Var = qx90Var3;
                    ps7 ps7Var3 = qx90Var.h;
                    if (ps7Var3 == null || ps7Var3.i != h1a0Var) {
                        owhVar5 = owhVar26;
                    } else {
                        qx90Var.h = null;
                        qx90Var.i = null;
                        owhVar12.b = 0;
                        owhVar11.b = 0;
                        q590Var4.b = 0;
                        owhVar5 = owhVar26;
                        owhVar5.b = 0;
                    }
                    owhVar = owhVar5;
                    bVarD = bVar12;
                    i14 = i95;
                    q590Var = q590Var4;
                    owhVar2 = owhVar11;
                    owhVar3 = owhVar12;
                }
                i13 = i2 + 1;
                qx90Var5 = qx90Var;
                i12 = i16;
                q590Var4 = q590Var;
                owhVar11 = owhVar2;
                owhVar10 = owhVar;
                f12 = f;
                f14 = f2;
                g1a0VarArr2 = g1a0VarArr;
                c0187a2 = c0187a;
                mw0Var2 = mw0Var;
                owhVar12 = owhVar3;
            } else {
                ps7 ps7Var4 = qx90Var5.h;
                if (ps7Var4 != null && ps7Var4.i == h1a0Var) {
                    qx90Var5.h = null;
                    qx90Var5.i = null;
                    owhVar12.b = 0;
                    owhVar11.b = 0;
                    q590Var4.b = 0;
                    owhVar10.b = 0;
                }
            }
            bVar2 = bVarD;
            owhVar = owhVar10;
            q590Var = q590Var4;
            owhVar2 = owhVar11;
            owhVar3 = owhVar12;
            i2 = i13;
            f = f12;
            f2 = f14;
            c0187a = c0187a2;
            mw0Var = mw0Var2;
            g1a0VarArr = g1a0VarArr2;
            qx90Var = qx90Var5;
            bVarD = bVar2;
            i13 = i2 + 1;
            qx90Var5 = qx90Var;
            i12 = i16;
            q590Var4 = q590Var;
            owhVar11 = owhVar2;
            owhVar10 = owhVar;
            f12 = f;
            f14 = f2;
            g1a0VarArr2 = g1a0VarArr;
            c0187a2 = c0187a;
            mw0Var2 = mw0Var;
            owhVar12 = owhVar3;
        }
        qx90 qx90Var7 = qx90Var5;
        owh owhVar35 = owhVar10;
        q590 q590Var12 = q590Var4;
        owh owhVar36 = owhVar11;
        owh owhVar37 = owhVar12;
        a.C0187a c0187a3 = c0187a2;
        mw0<a.b> mw0Var7 = mw0Var2;
        if (qx90Var7.h == null) {
            g1a0Var = null;
            i = 0;
        } else {
            g1a0Var = null;
            qx90Var7.h = null;
            qx90Var7.i = null;
            i = 0;
            owhVar37.b = 0;
            owhVar36.b = 0;
            q590Var12.b = 0;
            owhVar35.b = 0;
        }
        if (mw0Var7.b == 1 && mw0Var7.get(i).a.b == 0) {
            c0187a3.b(mw0Var7);
            mw0Var7.clear();
        }
        int i104 = i;
        while (i104 < mw0Var7.b) {
            a.b bVar13 = mw0Var7.get(i104);
            if (Build.VERSION.SDK_INT >= 29) {
                Canvas.VertexMode vertexMode = Canvas.VertexMode.TRIANGLES;
                owh owhVar38 = bVar13.a;
                int i105 = owhVar38.b;
                float[] fArr18 = owhVar38.a;
                float[] fArr19 = bVar13.b.a;
                int[] iArr2 = bVar13.c.a;
                q590 q590Var13 = bVar13.d;
                short[] sArr7 = q590Var13.a;
                int i106 = q590Var13.b;
                oc0 oc0Var3 = bVar13.f;
                ef4 ef4Var5 = bVar13.e;
                gcy<ef4, Paint> gcyVar = oc0Var3.c;
                int iA = gcyVar.a(ef4Var5);
                g1a0Var3 = g1a0Var;
                canvas.drawVertices(vertexMode, i105, fArr18, 0, fArr19, 0, iArr2, 0, sArr7, 0, i106, (Paint) (iA < 0 ? g1a0Var : gcyVar.c[iA]));
            } else {
                g1a0Var3 = g1a0Var;
                pvo pvoVar5 = bVar13.c;
                owh owhVar39 = bVar13.a;
                int[] iArr3 = pvoVar5.a;
                int[] iArr4 = new int[owhVar39.b];
                System.arraycopy(iArr3, i, iArr4, i, pvoVar5.b);
                Canvas.VertexMode vertexMode2 = Canvas.VertexMode.TRIANGLES;
                int i107 = owhVar39.b;
                float[] fArr20 = owhVar39.a;
                float[] fArr21 = bVar13.b.a;
                q590 q590Var14 = bVar13.d;
                short[] sArr8 = q590Var14.a;
                int i108 = q590Var14.b;
                oc0 oc0Var4 = bVar13.f;
                ef4 ef4Var6 = bVar13.e;
                gcy<ef4, Paint> gcyVar2 = oc0Var4.c;
                int iA2 = gcyVar2.a(ef4Var6);
                canvas.drawVertices(vertexMode2, i107, fArr20, 0, fArr21, 0, iArr4, 0, sArr8, 0, i108, (Paint) (iA2 < 0 ? g1a0Var3 : gcyVar2.c[iA2]));
            }
            i104++;
            g1a0Var = g1a0Var3;
        }
        g1a0 g1a0Var6 = g1a0Var;
        b bVar14 = this.A;
        ei0 ei0Var = bVar14.b;
        if (ei0Var != null) {
            ztw ztwVar = ei0Var.a;
            try {
                zi50.a aVar6 = zi50.b;
                mw0<g1a0> mw0Var8 = bVar14.b().c;
                g1a0[] g1a0VarArr3 = mw0Var8.a;
                int i109 = mw0Var8.b;
                int i110 = i;
                while (true) {
                    if (i110 >= i109) {
                        g1a0Var2 = g1a0Var6;
                        break;
                    }
                    g1a0Var2 = g1a0VarArr3[i110];
                    if (g1a0Var2.a.b.equals("number")) {
                        break;
                    } else {
                        i110++;
                    }
                }
                lh4 lh4Var2 = g1a0Var2.b;
                lh4Var2.getClass();
                float f82 = lh4Var2.e;
                float f83 = lh4Var2.f;
                float f84 = lh4Var2.h;
                bVar = new x5y.b(f82, f83, f84, lh4Var2.i);
                if (Math.abs(f84) < 1.0E-5d || Math.abs(lh4Var2.i) < 1.0E-5d) {
                    bVar = x5y.a.a;
                }
            } catch (Throwable th) {
                zi50.a aVar7 = zi50.b;
                bVar = new zi50.b(th);
            }
            Object obj = bVar;
            zi50.a aVar8 = zi50.b;
            if (obj instanceof zi50.b) {
                obj = g1a0Var6;
            }
            x5y x5yVar = (x5y) obj;
            if (x5yVar != null) {
                ztwVar.a(x5yVar);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        c();
    }

    public void setAlignment(jt jtVar) {
        this.C = jtVar;
        c();
    }

    public void setBoundsProvider(a75 a75Var) {
        this.B = a75Var;
        c();
    }

    public void setContentMode(zza zzaVar) {
        this.D = zzaVar;
        c();
    }

    public void setController(b bVar) {
        this.A = bVar;
    }

    public void setRendering(Boolean bool) {
        this.y = bool;
    }

    public SpineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0L;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.i = 0.0f;
        this.v = 0.0f;
        this.w = new a();
        this.y = Boolean.TRUE;
        this.z = new p65();
        this.B = new w8h();
        this.C = jt.c;
        this.D = zza.a;
        this.E = false;
    }

    public SpineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0L;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.i = 0.0f;
        this.v = 0.0f;
        this.w = new a();
        this.y = Boolean.TRUE;
        this.z = new p65();
        this.B = new w8h();
        this.C = jt.c;
        this.D = zza.a;
        this.E = false;
    }
}
