package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pkf0 extends w12 {
    public final StringBuilder D;
    public final StringBuilder E;
    public final StringBuilder F;
    public final StringBuilder G;
    public final RectF H;
    public final Matrix I;
    public final a J;
    public final b K;
    public final HashMap L;
    public final qkt<String> M;
    public final ArrayList N;
    public final ArrayList O;
    public final fkf0 P;
    public final iot Q;
    public final xmt R;
    public final ylf0 S;
    public final o58 T;
    public vuh0 U;
    public final o58 V;
    public vuh0 W;
    public final zwh X;
    public vuh0 Y;
    public final zwh Z;
    public vuh0 a0;
    public final pxo b0;
    public vuh0 c0;
    public vuh0 d0;
    public final pxo e0;
    public final pxo f0;
    public final pxo g0;

    public class a extends Paint {
    }

    public class b extends Paint {
    }

    public static class c {
        public String a = "";
        public float b = 0.0f;
    }

    public pkf0(iot iotVar, drr drrVar) {
        oe0 oe0Var;
        oe0 oe0Var2;
        de0 de0Var;
        oe0 oe0Var3;
        de0 de0Var2;
        oe0 oe0Var4;
        de0 de0Var3;
        pe0 pe0Var;
        de0 de0Var4;
        pe0 pe0Var2;
        be0 be0Var;
        pe0 pe0Var3;
        be0 be0Var2;
        pe0 pe0Var4;
        ae0 ae0Var;
        pe0 pe0Var5;
        ae0 ae0Var2;
        super(iotVar, drrVar);
        this.D = new StringBuilder(2);
        this.E = new StringBuilder(0);
        this.F = new StringBuilder(0);
        this.G = new StringBuilder(0);
        this.H = new RectF();
        this.I = new Matrix();
        a aVar = new a(1);
        aVar.setStyle(Paint.Style.FILL);
        this.J = aVar;
        b bVar = new b(1);
        bVar.setStyle(Paint.Style.STROKE);
        this.K = bVar;
        this.L = new HashMap();
        this.M = new qkt<>();
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.S = ylf0.b;
        this.Q = iotVar;
        this.R = drrVar.b;
        fkf0 fkf0Var = new fkf0((List) drrVar.q.b);
        this.P = fkf0Var;
        fkf0Var.a(this);
        g(fkf0Var);
        me0 me0Var = drrVar.r;
        if (me0Var != null && (pe0Var5 = me0Var.a) != null && (ae0Var2 = pe0Var5.a) != null) {
            u12<?, ?> u12VarB = ae0Var2.b();
            this.T = (o58) u12VarB;
            u12VarB.a(this);
            g(u12VarB);
        }
        if (me0Var != null && (pe0Var4 = me0Var.a) != null && (ae0Var = pe0Var4.b) != null) {
            u12<?, ?> u12VarB2 = ae0Var.b();
            this.V = (o58) u12VarB2;
            u12VarB2.a(this);
            g(u12VarB2);
        }
        if (me0Var != null && (pe0Var3 = me0Var.a) != null && (be0Var2 = pe0Var3.c) != null) {
            zwh zwhVarB = be0Var2.b();
            this.X = zwhVarB;
            zwhVarB.a(this);
            g(zwhVarB);
        }
        if (me0Var != null && (pe0Var2 = me0Var.a) != null && (be0Var = pe0Var2.d) != null) {
            zwh zwhVarB2 = be0Var.b();
            this.Z = zwhVarB2;
            zwhVarB2.a(this);
            g(zwhVarB2);
        }
        if (me0Var != null && (pe0Var = me0Var.a) != null && (de0Var4 = pe0Var.e) != null) {
            u12<?, ?> u12VarB3 = de0Var4.b();
            this.b0 = (pxo) u12VarB3;
            u12VarB3.a(this);
            g(u12VarB3);
        }
        if (me0Var != null && (oe0Var4 = me0Var.b) != null && (de0Var3 = oe0Var4.a) != null) {
            u12<?, ?> u12VarB4 = de0Var3.b();
            this.e0 = (pxo) u12VarB4;
            u12VarB4.a(this);
            g(u12VarB4);
        }
        if (me0Var != null && (oe0Var3 = me0Var.b) != null && (de0Var2 = oe0Var3.b) != null) {
            u12<?, ?> u12VarB5 = de0Var2.b();
            this.f0 = (pxo) u12VarB5;
            u12VarB5.a(this);
            g(u12VarB5);
        }
        if (me0Var != null && (oe0Var2 = me0Var.b) != null && (de0Var = oe0Var2.c) != null) {
            u12<?, ?> u12VarB6 = de0Var.b();
            this.g0 = (pxo) u12VarB6;
            u12VarB6.a(this);
            g(u12VarB6);
        }
        if (me0Var == null || (oe0Var = me0Var.b) == null) {
            return;
        }
        this.S = oe0Var.d;
    }

    public static void w(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void x(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final boolean A(Canvas canvas, kye kyeVar, int i, float f) {
        PointF pointF = kyeVar.l;
        PointF pointF2 = kyeVar.m;
        float fC = srh0.c();
        float f2 = (i * kyeVar.f * fC) + (pointF == null ? 0.0f : (kyeVar.f * fC) + pointF.y);
        if (this.Q.K && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + kyeVar.c) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int iOrdinal = kyeVar.d.ordinal();
        if (iOrdinal == 0) {
            canvas.translate(f3, f2);
            return true;
        }
        if (iOrdinal == 1) {
            canvas.translate((f3 + f4) - f, f2);
            return true;
        }
        if (iOrdinal != 2) {
            return true;
        }
        canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        return true;
    }

    public final List<c> B(String str, float f, a8i a8iVar, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                int iA = d8i.a(cCharAt, a8iVar.a, a8iVar.c);
                esa0<d8i> esa0Var = this.R.h;
                esa0Var.getClass();
                d8i d8iVar = (d8i) fsa0.a(esa0Var, iA);
                if (d8iVar != null) {
                    fMeasureText = (srh0.c() * ((float) d8iVar.c) * f2) + f3;
                }
            } else {
                fMeasureText = this.J.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = fMeasureText;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                c cVarY = y(i);
                if (i3 == i2) {
                    String strSubstring = str.substring(i2, i4);
                    String strTrim = strSubstring.trim();
                    float length = (f4 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f6);
                    cVarY.a = strTrim;
                    cVarY.b = length;
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    String strSubstring2 = str.substring(i2, i3 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f4 - f5) - ((strSubstring2.length() - strTrim2.length()) * f6)) - f6;
                    cVarY.a = strTrim2;
                    cVarY.b = length2;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            c cVarY2 = y(i);
            cVarY2.a = str.substring(i2);
            cVarY2.b = f4;
        }
        return this.O.subList(0, i);
    }

    @Override // defpackage.w12, defpackage.jef
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        xmt xmtVar = this.R;
        rectF.set(0.0f, 0.0f, xmtVar.k.width(), xmtVar.k.height());
    }

    @Override // defpackage.w12, defpackage.smp
    public final void i(cpt cptVar, Object obj) {
        super.i(cptVar, obj);
        PointF pointF = vot.a;
        if (obj == 1) {
            vuh0 vuh0Var = this.U;
            if (vuh0Var != null) {
                q(vuh0Var);
            }
            vuh0 vuh0Var2 = new vuh0(cptVar, null);
            this.U = vuh0Var2;
            vuh0Var2.a(this);
            g(this.U);
            return;
        }
        if (obj == 2) {
            vuh0 vuh0Var3 = this.W;
            if (vuh0Var3 != null) {
                q(vuh0Var3);
            }
            vuh0 vuh0Var4 = new vuh0(cptVar, null);
            this.W = vuh0Var4;
            vuh0Var4.a(this);
            g(this.W);
            return;
        }
        if (obj == vot.q) {
            vuh0 vuh0Var5 = this.Y;
            if (vuh0Var5 != null) {
                q(vuh0Var5);
            }
            vuh0 vuh0Var6 = new vuh0(cptVar, null);
            this.Y = vuh0Var6;
            vuh0Var6.a(this);
            g(this.Y);
            return;
        }
        if (obj == vot.r) {
            vuh0 vuh0Var7 = this.a0;
            if (vuh0Var7 != null) {
                q(vuh0Var7);
            }
            vuh0 vuh0Var8 = new vuh0(cptVar, null);
            this.a0 = vuh0Var8;
            vuh0Var8.a(this);
            g(this.a0);
            return;
        }
        if (obj == vot.D) {
            vuh0 vuh0Var9 = this.c0;
            if (vuh0Var9 != null) {
                q(vuh0Var9);
            }
            vuh0 vuh0Var10 = new vuh0(cptVar, null);
            this.c0 = vuh0Var10;
            vuh0Var10.a(this);
            g(this.c0);
            return;
        }
        if (obj != vot.K) {
            if (obj == vot.M) {
                fkf0 fkf0Var = this.P;
                fkf0Var.getClass();
                fkf0Var.j(new ekf0(new oot(), cptVar, new kye()));
                return;
            }
            return;
        }
        vuh0 vuh0Var11 = this.d0;
        if (vuh0Var11 != null) {
            q(vuh0Var11);
        }
        vuh0 vuh0Var12 = new vuh0(cptVar, null);
        this.d0 = vuh0Var12;
        vuh0Var12.a(this);
        g(this.d0);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0356 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0358  */
    /* JADX WARN: Code duplicated, block: B:103:0x035b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x035d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0360  */
    /* JADX WARN: Code duplicated, block: B:109:0x0368  */
    /* JADX WARN: Code duplicated, block: B:111:0x0370  */
    /* JADX WARN: Code duplicated, block: B:129:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:131:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:132:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:136:0x0412  */
    /* JADX WARN: Code duplicated, block: B:138:0x042b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0442  */
    /* JADX WARN: Code duplicated, block: B:142:0x0457 A[LOOP:7: B:141:0x0455->B:142:0x0457, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x0479  */
    /* JADX WARN: Code duplicated, block: B:147:0x0497  */
    /* JADX WARN: Code duplicated, block: B:148:0x049d  */
    /* JADX WARN: Code duplicated, block: B:151:0x04ab A[LOOP:9: B:149:0x04a5->B:151:0x04ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:159:0x04e0 A[LOOP:10: B:157:0x04da->B:159:0x04e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:166:0x050b  */
    /* JADX WARN: Code duplicated, block: B:169:0x0518  */
    /* JADX WARN: Code duplicated, block: B:172:0x052e A[LOOP:13: B:167:0x0512->B:172:0x052e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x0546  */
    /* JADX WARN: Code duplicated, block: B:176:0x054d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0567  */
    /* JADX WARN: Code duplicated, block: B:205:0x0534 A[EDGE_INSN: B:205:0x0534->B:173:0x0534 BREAK  A[LOOP:12: B:164:0x0505->B:171:0x0525], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:29:0x0106  */
    /* JADX WARN: Code duplicated, block: B:31:0x0119  */
    /* JADX WARN: Code duplicated, block: B:34:0x0125  */
    /* JADX WARN: Code duplicated, block: B:36:0x0144  */
    /* JADX WARN: Code duplicated, block: B:37:0x0156  */
    /* JADX WARN: Code duplicated, block: B:39:0x0161  */
    /* JADX WARN: Code duplicated, block: B:40:0x0172  */
    /* JADX WARN: Code duplicated, block: B:42:0x0189 A[LOOP:4: B:41:0x0187->B:42:0x0189, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:55:0x0252  */
    /* JADX WARN: Code duplicated, block: B:78:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x030f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0312  */
    /* JADX WARN: Code duplicated, block: B:92:0x031c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0321  */
    /* JADX WARN: Code duplicated, block: B:95:0x0325  */
    /* JADX WARN: Code duplicated, block: B:96:0x0329  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w12
    public final void m(Canvas canvas, Matrix matrix, int i, sef sefVar) {
        int i2;
        c8i c8iVar;
        String str;
        Typeface typefaceCreateFromAsset;
        itw<String> itwVar;
        HashMap map;
        Typeface typeface;
        HashMap map2;
        Typeface typeface2;
        Typeface typeface3;
        boolean zContains;
        boolean zContains2;
        int i3;
        float fFloatValue;
        float fC;
        List listAsList;
        int size;
        int i4;
        int length;
        int i5;
        PointF pointF;
        float f;
        float f2;
        int i6;
        List<c> listB;
        int i7;
        c cVar;
        int i8;
        String string;
        ArrayList arrayList;
        int length2;
        int i9;
        StringBuilder sb;
        int i10;
        String string2;
        String str2;
        int i11;
        ArrayList arrayList2;
        Bidi bidi;
        int runCount;
        byte[] bArr;
        Integer[] numArr;
        int i12;
        StringBuilder sb2;
        int i13;
        int runLevel;
        String strSubstring;
        StringBuilder sb3;
        int length3;
        Canvas canvas2;
        float fFloatValue2;
        float f3;
        int i14;
        int i15;
        PointF pointF2;
        float f4;
        float f5;
        List<c> listB2;
        int i16;
        c cVar2;
        String str3;
        int i17;
        float f6;
        xmt xmtVar;
        d8i d8iVar;
        HashMap map3;
        ArrayList arrayList3;
        int size2;
        ArrayList arrayList4;
        int i18;
        List list;
        int i19;
        b bVar;
        a aVar;
        Path pathD;
        b bVar2;
        a aVar2;
        kye kyeVarE = this.P.e();
        xmt xmtVar2 = this.R;
        a8i a8iVar = (a8i) xmtVar2.f.get(kyeVarE.b);
        if (a8iVar == null) {
            return;
        }
        String str4 = a8iVar.c;
        String str5 = a8iVar.a;
        canvas.save();
        canvas.concat(matrix);
        v(kyeVarE, i, 0);
        iot iotVar = this.Q;
        Map<String, Typeface> map4 = iotVar.z;
        String str6 = "\n";
        zwh zwhVar = this.Z;
        int i20 = 0;
        a aVar3 = this.J;
        b bVar3 = this.K;
        if (map4 == null) {
            i2 = 2;
            if (iotVar.a.h.e() > 0) {
                vuh0 vuh0Var = this.c0;
                float fFloatValue3 = vuh0Var != null ? ((Float) vuh0Var.e()).floatValue() : kyeVarE.c;
                float f7 = 0.0f;
                float[] fArr = srh0.e.get();
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f8 = srh0.f;
                fArr[2] = f8;
                fArr[3] = f8;
                float f9 = fFloatValue3 / 100.0f;
                matrix.mapPoints(fArr);
                a aVar4 = aVar3;
                iot iotVar2 = iotVar;
                xmt xmtVar3 = xmtVar2;
                String str7 = str4;
                Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
                List listAsList2 = Arrays.asList(kyeVarE.a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
                int size3 = listAsList2.size();
                float f10 = kyeVarE.e / 10.0f;
                vuh0 vuh0Var2 = this.a0;
                if (vuh0Var2 != null) {
                    fFloatValue2 = ((Float) vuh0Var2.e()).floatValue();
                } else {
                    if (zwhVar != null) {
                        fFloatValue2 = zwhVar.e().floatValue();
                    }
                    f3 = f10;
                    i14 = 0;
                    i15 = -1;
                    while (i14 < size3) {
                        String str8 = (String) listAsList2.get(i14);
                        pointF2 = kyeVarE.m;
                        if (pointF2 == null) {
                            f4 = f7;
                        } else {
                            f4 = pointF2.x;
                        }
                        f5 = f9;
                        i16 = i20;
                        for (listB2 = B(str8, f4, a8iVar, f5, f3, true); i16 < listB2.size(); listB2 = listB2) {
                            cVar2 = listB2.get(i16);
                            i15++;
                            canvas.save();
                            if (A(canvas, kyeVarE, i15, cVar2.b)) {
                                str3 = cVar2.a;
                                i17 = i20;
                                while (i17 < str3.length()) {
                                    List list2 = listAsList2;
                                    String str9 = str7;
                                    int iA = d8i.a(str3.charAt(i17), str5, str9);
                                    int i21 = i16;
                                    f6 = f3;
                                    xmtVar = xmtVar3;
                                    esa0<d8i> esa0Var = xmtVar.h;
                                    esa0Var.getClass();
                                    d8iVar = (d8i) fsa0.a(esa0Var, iA);
                                    if (d8iVar == null) {
                                        xmtVar3 = xmtVar;
                                        str3 = str3;
                                        size3 = size3;
                                        i14 = i14;
                                        i17 = i17;
                                        bVar = bVar3;
                                        iotVar2 = iotVar2;
                                        aVar = aVar4;
                                    } else {
                                        v(kyeVarE, i, i17);
                                        map3 = this.L;
                                        if (map3.containsKey(d8iVar)) {
                                            list = (List) map3.get(d8iVar);
                                        } else {
                                            arrayList3 = d8iVar.a;
                                            size2 = arrayList3.size();
                                            arrayList4 = new ArrayList(size2);
                                            i18 = i20;
                                            while (i18 < size2) {
                                                arrayList4.add(new mza(iotVar2, this, (ay80) arrayList3.get(i18), xmtVar));
                                                size2 = size2;
                                                i18++;
                                                arrayList3 = arrayList3;
                                            }
                                            map3.put(d8iVar, arrayList4);
                                            list = arrayList4;
                                        }
                                        i19 = i20;
                                        while (i19 < list.size()) {
                                            pathD = ((mza) list.get(i19)).d();
                                            xmt xmtVar4 = xmtVar;
                                            pathD.computeBounds(this.H, i20);
                                            Matrix matrix2 = this.I;
                                            matrix2.reset();
                                            List list3 = list;
                                            matrix2.preTranslate(f7, (-kyeVarE.g) * srh0.c());
                                            matrix2.preScale(f5, f5);
                                            pathD.transform(matrix2);
                                            if (kyeVarE.k) {
                                                aVar2 = aVar4;
                                                x(pathD, aVar2, canvas);
                                                bVar2 = bVar3;
                                                x(pathD, bVar2, canvas);
                                            } else {
                                                bVar2 = bVar3;
                                                aVar2 = aVar4;
                                                x(pathD, bVar2, canvas);
                                                x(pathD, aVar2, canvas);
                                            }
                                            i19++;
                                            bVar3 = bVar2;
                                            aVar4 = aVar2;
                                            list = list3;
                                            xmtVar = xmtVar4;
                                            i20 = 0;
                                            f7 = 0.0f;
                                        }
                                        xmtVar3 = xmtVar;
                                        bVar = bVar3;
                                        aVar = aVar4;
                                        canvas.translate((srh0.c() * ((float) d8iVar.c) * f5) + f6, 0.0f);
                                    }
                                    f3 = f6;
                                    bVar3 = bVar;
                                    str7 = str9;
                                    aVar4 = aVar;
                                    iotVar2 = iotVar2;
                                    i16 = i21;
                                    listAsList2 = list2;
                                    str3 = str3;
                                    i14 = i14;
                                    size3 = size3;
                                    i20 = 0;
                                    f7 = 0.0f;
                                    i17++;
                                }
                            }
                            int i22 = i16;
                            float f11 = f3;
                            List list4 = listAsList2;
                            int i23 = size3;
                            int i24 = i14;
                            b bVar4 = bVar3;
                            iot iotVar3 = iotVar2;
                            a aVar5 = aVar4;
                            String str10 = str7;
                            canvas.restore();
                            f3 = f11;
                            bVar3 = bVar4;
                            str7 = str10;
                            aVar4 = aVar5;
                            iotVar2 = iotVar3;
                            listAsList2 = list4;
                            i14 = i24;
                            size3 = i23;
                            i20 = 0;
                            f7 = 0.0f;
                            i16 = i22 + 1;
                        }
                        f9 = f5;
                        listAsList2 = listAsList2;
                        i20 = 0;
                        f7 = 0.0f;
                        i14++;
                    }
                    canvas2 = canvas;
                }
                f10 += fFloatValue2;
                f3 = f10;
                i14 = 0;
                i15 = -1;
                while (i14 < size3) {
                    String str11 = (String) listAsList2.get(i14);
                    pointF2 = kyeVarE.m;
                    if (pointF2 == null) {
                        f4 = f7;
                    } else {
                        f4 = pointF2.x;
                    }
                    f5 = f9;
                    i16 = i20;
                    while (i16 < listB2.size()) {
                        cVar2 = listB2.get(i16);
                        i15++;
                        canvas.save();
                        if (A(canvas, kyeVarE, i15, cVar2.b)) {
                            str3 = cVar2.a;
                            i17 = i20;
                            while (i17 < str3.length()) {
                                List list5 = listAsList2;
                                String str12 = str7;
                                int iA2 = d8i.a(str3.charAt(i17), str5, str12);
                                int i25 = i16;
                                f6 = f3;
                                xmtVar = xmtVar3;
                                esa0<d8i> esa0Var2 = xmtVar.h;
                                esa0Var2.getClass();
                                d8iVar = (d8i) fsa0.a(esa0Var2, iA2);
                                if (d8iVar == null) {
                                    xmtVar3 = xmtVar;
                                    str3 = str3;
                                    size3 = size3;
                                    i14 = i14;
                                    i17 = i17;
                                    bVar = bVar3;
                                    iotVar2 = iotVar2;
                                    aVar = aVar4;
                                } else {
                                    v(kyeVarE, i, i17);
                                    map3 = this.L;
                                    if (map3.containsKey(d8iVar)) {
                                        list = (List) map3.get(d8iVar);
                                    } else {
                                        arrayList3 = d8iVar.a;
                                        size2 = arrayList3.size();
                                        arrayList4 = new ArrayList(size2);
                                        i18 = i20;
                                        while (i18 < size2) {
                                            arrayList4.add(new mza(iotVar2, this, (ay80) arrayList3.get(i18), xmtVar));
                                            size2 = size2;
                                            i18++;
                                            arrayList3 = arrayList3;
                                        }
                                        map3.put(d8iVar, arrayList4);
                                        list = arrayList4;
                                    }
                                    i19 = i20;
                                    while (i19 < list.size()) {
                                        pathD = ((mza) list.get(i19)).d();
                                        xmt xmtVar5 = xmtVar;
                                        pathD.computeBounds(this.H, i20);
                                        Matrix matrix3 = this.I;
                                        matrix3.reset();
                                        List list6 = list;
                                        matrix3.preTranslate(f7, (-kyeVarE.g) * srh0.c());
                                        matrix3.preScale(f5, f5);
                                        pathD.transform(matrix3);
                                        if (kyeVarE.k) {
                                            aVar2 = aVar4;
                                            x(pathD, aVar2, canvas);
                                            bVar2 = bVar3;
                                            x(pathD, bVar2, canvas);
                                        } else {
                                            bVar2 = bVar3;
                                            aVar2 = aVar4;
                                            x(pathD, bVar2, canvas);
                                            x(pathD, aVar2, canvas);
                                        }
                                        i19++;
                                        bVar3 = bVar2;
                                        aVar4 = aVar2;
                                        list = list6;
                                        xmtVar = xmtVar5;
                                        i20 = 0;
                                        f7 = 0.0f;
                                    }
                                    xmtVar3 = xmtVar;
                                    bVar = bVar3;
                                    aVar = aVar4;
                                    canvas.translate((srh0.c() * ((float) d8iVar.c) * f5) + f6, 0.0f);
                                }
                                f3 = f6;
                                bVar3 = bVar;
                                str7 = str12;
                                aVar4 = aVar;
                                iotVar2 = iotVar2;
                                i16 = i25;
                                listAsList2 = list5;
                                str3 = str3;
                                i14 = i14;
                                size3 = size3;
                                i20 = 0;
                                f7 = 0.0f;
                                i17++;
                            }
                        }
                        int i26 = i16;
                        float f12 = f3;
                        List list7 = listAsList2;
                        int i27 = size3;
                        int i28 = i14;
                        b bVar5 = bVar3;
                        iot iotVar4 = iotVar2;
                        a aVar6 = aVar4;
                        String str13 = str7;
                        canvas.restore();
                        f3 = f12;
                        bVar3 = bVar5;
                        str7 = str13;
                        aVar4 = aVar6;
                        iotVar2 = iotVar4;
                        listAsList2 = list7;
                        i14 = i28;
                        size3 = i27;
                        i20 = 0;
                        f7 = 0.0f;
                        i16 = i26 + 1;
                    }
                    f9 = f5;
                    listAsList2 = listAsList2;
                    i20 = 0;
                    f7 = 0.0f;
                    i14++;
                }
                canvas2 = canvas;
            }
            canvas2.restore();
        }
        i2 = 2;
        vuh0 vuh0Var3 = this.d0;
        if (vuh0Var3 == null || (typefaceCreateFromAsset = (Typeface) vuh0Var3.e()) == null) {
            Map<String, Typeface> map5 = iotVar.z;
            if (map5 == null) {
                if (iotVar.getCallback() == null) {
                    c8iVar = null;
                } else {
                    c8iVar = iotVar.y;
                    if (c8iVar == null) {
                        c8iVar = new c8i(iotVar.getCallback());
                        iotVar.y = c8iVar;
                        str = iotVar.A;
                        if (str != null) {
                            c8iVar.e = str;
                        }
                    }
                }
                if (c8iVar != null) {
                    itwVar = c8iVar.a;
                    itwVar.a = str5;
                    itwVar.b = str4;
                    map = c8iVar.b;
                    typeface = (Typeface) map.get(itwVar);
                    if (typeface != null) {
                        typefaceCreateFromAsset = typeface;
                        str6 = "\n";
                    } else {
                        map2 = c8iVar.c;
                        typeface2 = (Typeface) map2.get(str5);
                        if (typeface2 != null) {
                            typefaceCreateFromAsset = typeface2;
                        } else {
                            typeface3 = a8iVar.d;
                            if (typeface3 != null) {
                                typefaceCreateFromAsset = typeface3;
                            } else {
                                StringBuilder sbB = mq0.b("fonts/", str5);
                                sbB.append(c8iVar.e);
                                typefaceCreateFromAsset = Typeface.createFromAsset(c8iVar.d, sbB.toString());
                                map2.put(str5, typefaceCreateFromAsset);
                            }
                        }
                        zContains = str4.contains("Italic");
                        zContains2 = str4.contains("Bold");
                        if (!zContains && zContains2) {
                            i3 = 3;
                        } else if (zContains) {
                            i3 = i2;
                        } else if (zContains2) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        if (typefaceCreateFromAsset.getStyle() != i3) {
                            typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i3);
                        }
                        map.put(itwVar, typefaceCreateFromAsset);
                    }
                } else {
                    str6 = "\n";
                    typefaceCreateFromAsset = null;
                }
            } else {
                if (map5.containsKey(str5)) {
                    typefaceCreateFromAsset = map5.get(str5);
                } else {
                    String str14 = a8iVar.b;
                    if (map5.containsKey(str14)) {
                        typefaceCreateFromAsset = map5.get(str14);
                    } else {
                        String strA = oxc.a(str5, "-", str4);
                        if (map5.containsKey(strA)) {
                            typefaceCreateFromAsset = map5.get(strA);
                        } else {
                            if (iotVar.getCallback() == null) {
                                c8iVar = null;
                            } else {
                                c8iVar = iotVar.y;
                                if (c8iVar == null) {
                                    c8iVar = new c8i(iotVar.getCallback());
                                    iotVar.y = c8iVar;
                                    str = iotVar.A;
                                    if (str != null) {
                                        c8iVar.e = str;
                                    }
                                }
                            }
                            if (c8iVar != null) {
                                itwVar = c8iVar.a;
                                itwVar.a = str5;
                                itwVar.b = str4;
                                map = c8iVar.b;
                                typeface = (Typeface) map.get(itwVar);
                                if (typeface != null) {
                                    typefaceCreateFromAsset = typeface;
                                } else {
                                    map2 = c8iVar.c;
                                    typeface2 = (Typeface) map2.get(str5);
                                    if (typeface2 != null) {
                                        typefaceCreateFromAsset = typeface2;
                                    } else {
                                        typeface3 = a8iVar.d;
                                        if (typeface3 != null) {
                                            typefaceCreateFromAsset = typeface3;
                                        } else {
                                            StringBuilder sbB2 = mq0.b("fonts/", str5);
                                            sbB2.append(c8iVar.e);
                                            typefaceCreateFromAsset = Typeface.createFromAsset(c8iVar.d, sbB2.toString());
                                            map2.put(str5, typefaceCreateFromAsset);
                                        }
                                    }
                                    zContains = str4.contains("Italic");
                                    zContains2 = str4.contains("Bold");
                                    if (!zContains) {
                                        if (zContains) {
                                            i3 = i2;
                                        } else if (zContains2) {
                                            i3 = 1;
                                        } else {
                                            i3 = 0;
                                        }
                                    } else if (zContains) {
                                        i3 = i2;
                                    } else if (zContains2) {
                                        i3 = 1;
                                    } else {
                                        i3 = 0;
                                    }
                                    if (typefaceCreateFromAsset.getStyle() != i3) {
                                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i3);
                                    }
                                    map.put(itwVar, typefaceCreateFromAsset);
                                }
                            } else {
                                str6 = "\n";
                                typefaceCreateFromAsset = null;
                            }
                        }
                    }
                }
                str6 = "\n";
            }
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = a8iVar.d;
            }
        } else {
            str6 = "\n";
        }
        if (typefaceCreateFromAsset != null) {
            String str15 = kyeVarE.a;
            aVar3.setTypeface(typefaceCreateFromAsset);
            vuh0 vuh0Var4 = this.c0;
            float fFloatValue4 = vuh0Var4 != null ? ((Float) vuh0Var4.e()).floatValue() : kyeVarE.c;
            aVar3.setTextSize(srh0.c() * fFloatValue4);
            bVar3.setTypeface(aVar3.getTypeface());
            bVar3.setTextSize(aVar3.getTextSize());
            float f13 = kyeVarE.e / 10.0f;
            vuh0 vuh0Var5 = this.a0;
            if (vuh0Var5 != null) {
                fFloatValue = ((Float) vuh0Var5.e()).floatValue();
            } else {
                if (zwhVar != null) {
                    fFloatValue = zwhVar.e().floatValue();
                }
                fC = ((srh0.c() * f13) * fFloatValue4) / 100.0f;
                listAsList = Arrays.asList(str15.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str6, "\r").split("\r"));
                size = listAsList.size();
                i4 = 0;
                length = 0;
                i5 = -1;
                while (i4 < size) {
                    String str16 = (String) listAsList.get(i4);
                    pointF = kyeVarE.m;
                    if (pointF == null) {
                        f = 0.0f;
                    } else {
                        f = pointF.x;
                    }
                    f2 = fC;
                    i6 = i2;
                    i7 = 0;
                    for (listB = B(str16, f, a8iVar, 0.0f, f2, false); i7 < listB.size(); listB = listB) {
                        cVar = listB.get(i7);
                        i5++;
                        canvas.save();
                        if (A(canvas, kyeVarE, i5, aVar3.measureText(cVar.a))) {
                            string = cVar.a;
                            if (Bidi.requiresBidi(string.toCharArray(), 0, string.length())) {
                                bidi = new Bidi(string, -2);
                                runCount = bidi.getRunCount();
                                bArr = new byte[runCount];
                                numArr = new Integer[runCount];
                                i12 = 0;
                                while (i12 < runCount) {
                                    bArr[i12] = (byte) bidi.getRunLevel(i12);
                                    numArr[i12] = Integer.valueOf(i12);
                                    i12++;
                                    size = size;
                                }
                                i8 = size;
                                Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                                sb2 = this.F;
                                sb2.setLength(0);
                                i13 = 0;
                                while (i13 < runCount) {
                                    int iIntValue = numArr[i13].intValue();
                                    int i29 = runCount;
                                    int runStart = bidi.getRunStart(iIntValue);
                                    Integer[] numArr2 = numArr;
                                    int runLimit = bidi.getRunLimit(iIntValue);
                                    runLevel = bidi.getRunLevel(iIntValue);
                                    strSubstring = string.substring(runStart, runLimit);
                                    if ((runLevel & 1) == 0) {
                                        sb2.append(strSubstring);
                                    } else {
                                        sb3 = this.G;
                                        length3 = 0;
                                        sb3.setLength(0);
                                        while (length3 < strSubstring.length()) {
                                            String strU = u(length3, strSubstring);
                                            sb3.insert(0, strU);
                                            length3 += strU.length();
                                            strSubstring = strSubstring;
                                        }
                                        sb2.append((CharSequence) sb3);
                                    }
                                    i13++;
                                    runCount = i29;
                                    numArr = numArr2;
                                    bidi = bidi;
                                }
                                string = sb2.toString();
                            } else {
                                i8 = size;
                            }
                            arrayList = this.N;
                            arrayList.clear();
                            length2 = 0;
                            while (length2 < string.length()) {
                                String strU2 = u(length2, string);
                                arrayList.add(strU2);
                                length2 += strU2.length();
                            }
                            i9 = 0;
                            while (i9 < arrayList.size()) {
                                sb = this.E;
                                sb.setLength(0);
                                sb.append((String) arrayList.get(i9));
                                i10 = i9 + 1;
                                while (i10 < arrayList.size()) {
                                    str2 = (String) arrayList.get(i10);
                                    i11 = 0;
                                    while (true) {
                                        if (i11 < str2.length()) {
                                            break;
                                        }
                                        arrayList2 = arrayList;
                                        if (Character.getDirectionality(str2.codePointAt(i11)) == 2) {
                                            break;
                                        }
                                        i11++;
                                        arrayList = arrayList2;
                                    }
                                    sb.insert(0, str2);
                                    i10++;
                                    arrayList = arrayList2;
                                }
                                ArrayList arrayList5 = arrayList;
                                string2 = sb.toString();
                                v(kyeVarE, i, i9 + length);
                                if (kyeVarE.k) {
                                    w(string2, aVar3, canvas);
                                    w(string2, bVar3, canvas);
                                } else {
                                    w(string2, bVar3, canvas);
                                    w(string2, aVar3, canvas);
                                }
                                canvas.translate(aVar3.measureText(string2) + f2, 0.0f);
                                i9 = i10;
                                arrayList = arrayList5;
                            }
                        } else {
                            f2 = f2;
                            listAsList = listAsList;
                            i8 = size;
                        }
                        length += cVar.a.length();
                        canvas.restore();
                        i7++;
                        a8iVar = a8iVar;
                        i6 = 2;
                        f2 = f2;
                        listAsList = listAsList;
                        size = i8;
                    }
                    i4++;
                    a8iVar = a8iVar;
                    i2 = i6;
                    fC = f2;
                    size = size;
                }
            }
            f13 += fFloatValue;
            fC = ((srh0.c() * f13) * fFloatValue4) / 100.0f;
            listAsList = Arrays.asList(str15.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str6, "\r").split("\r"));
            size = listAsList.size();
            i4 = 0;
            length = 0;
            i5 = -1;
            while (i4 < size) {
                String str17 = (String) listAsList.get(i4);
                pointF = kyeVarE.m;
                if (pointF == null) {
                    f = 0.0f;
                } else {
                    f = pointF.x;
                }
                f2 = fC;
                i6 = i2;
                i7 = 0;
                while (i7 < listB.size()) {
                    cVar = listB.get(i7);
                    i5++;
                    canvas.save();
                    if (A(canvas, kyeVarE, i5, aVar3.measureText(cVar.a))) {
                        string = cVar.a;
                        if (Bidi.requiresBidi(string.toCharArray(), 0, string.length())) {
                            bidi = new Bidi(string, -2);
                            runCount = bidi.getRunCount();
                            bArr = new byte[runCount];
                            numArr = new Integer[runCount];
                            i12 = 0;
                            while (i12 < runCount) {
                                bArr[i12] = (byte) bidi.getRunLevel(i12);
                                numArr[i12] = Integer.valueOf(i12);
                                i12++;
                                size = size;
                            }
                            i8 = size;
                            Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                            sb2 = this.F;
                            sb2.setLength(0);
                            i13 = 0;
                            while (i13 < runCount) {
                                int iIntValue2 = numArr[i13].intValue();
                                int i210 = runCount;
                                int runStart2 = bidi.getRunStart(iIntValue2);
                                Integer[] numArr3 = numArr;
                                int runLimit2 = bidi.getRunLimit(iIntValue2);
                                runLevel = bidi.getRunLevel(iIntValue2);
                                strSubstring = string.substring(runStart2, runLimit2);
                                if ((runLevel & 1) == 0) {
                                    sb2.append(strSubstring);
                                } else {
                                    sb3 = this.G;
                                    length3 = 0;
                                    sb3.setLength(0);
                                    while (length3 < strSubstring.length()) {
                                        String strU3 = u(length3, strSubstring);
                                        sb3.insert(0, strU3);
                                        length3 += strU3.length();
                                        strSubstring = strSubstring;
                                    }
                                    sb2.append((CharSequence) sb3);
                                }
                                i13++;
                                runCount = i210;
                                numArr = numArr3;
                                bidi = bidi;
                            }
                            string = sb2.toString();
                        } else {
                            i8 = size;
                        }
                        arrayList = this.N;
                        arrayList.clear();
                        length2 = 0;
                        while (length2 < string.length()) {
                            String strU4 = u(length2, string);
                            arrayList.add(strU4);
                            length2 += strU4.length();
                        }
                        i9 = 0;
                        while (i9 < arrayList.size()) {
                            sb = this.E;
                            sb.setLength(0);
                            sb.append((String) arrayList.get(i9));
                            i10 = i9 + 1;
                            while (i10 < arrayList.size()) {
                                str2 = (String) arrayList.get(i10);
                                i11 = 0;
                                while (true) {
                                    if (i11 < str2.length()) {
                                        break;
                                        break;
                                    }
                                    arrayList2 = arrayList;
                                    if (Character.getDirectionality(str2.codePointAt(i11)) == 2) {
                                        break;
                                    }
                                    i11++;
                                    arrayList = arrayList2;
                                }
                                sb.insert(0, str2);
                                i10++;
                                arrayList = arrayList2;
                            }
                            ArrayList arrayList6 = arrayList;
                            string2 = sb.toString();
                            v(kyeVarE, i, i9 + length);
                            if (kyeVarE.k) {
                                w(string2, aVar3, canvas);
                                w(string2, bVar3, canvas);
                            } else {
                                w(string2, bVar3, canvas);
                                w(string2, aVar3, canvas);
                            }
                            canvas.translate(aVar3.measureText(string2) + f2, 0.0f);
                            i9 = i10;
                            arrayList = arrayList6;
                        }
                    } else {
                        f2 = f2;
                        listAsList = listAsList;
                        i8 = size;
                    }
                    length += cVar.a.length();
                    canvas.restore();
                    i7++;
                    a8iVar = a8iVar;
                    i6 = 2;
                    f2 = f2;
                    listAsList = listAsList;
                    size = i8;
                }
                i4++;
                a8iVar = a8iVar;
                i2 = i6;
                fC = f2;
                size = size;
            }
        }
        canvas2 = canvas;
        canvas2.restore();
    }

    public final String u(int i, String str) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        qkt<String> qktVar = this.M;
        if (qktVar.c(j) >= 0) {
            return qktVar.b(j);
        }
        StringBuilder sb = this.D;
        sb.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            sb.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = sb.toString();
        qktVar.f(string, j);
        return string;
    }

    public final void v(kye kyeVar, int i, int i2) {
        vuh0 vuh0Var = this.U;
        a aVar = this.J;
        if (vuh0Var != null) {
            aVar.setColor(((Integer) vuh0Var.e()).intValue());
        } else {
            o58 o58Var = this.T;
            if (o58Var == null || !z(i2)) {
                aVar.setColor(kyeVar.h);
            } else {
                aVar.setColor(o58Var.e().intValue());
            }
        }
        vuh0 vuh0Var2 = this.W;
        b bVar = this.K;
        if (vuh0Var2 != null) {
            bVar.setColor(((Integer) vuh0Var2.e()).intValue());
        } else {
            o58 o58Var2 = this.V;
            if (o58Var2 == null || !z(i2)) {
                bVar.setColor(kyeVar.i);
            } else {
                bVar.setColor(o58Var2.e().intValue());
            }
        }
        u12<Integer, Integer> u12Var = this.w.p;
        int iIntValue = 100;
        int iIntValue2 = u12Var == null ? 100 : u12Var.e().intValue();
        pxo pxoVar = this.b0;
        if (pxoVar != null && z(i2)) {
            iIntValue = pxoVar.e().intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        aVar.setAlpha(iRound);
        bVar.setAlpha(iRound);
        vuh0 vuh0Var3 = this.Y;
        if (vuh0Var3 != null) {
            bVar.setStrokeWidth(((Float) vuh0Var3.e()).floatValue());
            return;
        }
        zwh zwhVar = this.X;
        if (zwhVar == null || !z(i2)) {
            bVar.setStrokeWidth(srh0.c() * kyeVar.j);
        } else {
            bVar.setStrokeWidth(zwhVar.e().floatValue());
        }
    }

    public final c y(int i) {
        ArrayList arrayList = this.O;
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add(new c());
        }
        return (c) arrayList.get(i - 1);
    }

    public final boolean z(int i) {
        pxo pxoVar;
        int length = this.P.e().a.length();
        pxo pxoVar2 = this.e0;
        if (pxoVar2 == null || (pxoVar = this.f0) == null) {
            return true;
        }
        int iMin = Math.min(pxoVar2.e().intValue(), pxoVar.e().intValue());
        int iMax = Math.max(pxoVar2.e().intValue(), pxoVar.e().intValue());
        pxo pxoVar3 = this.g0;
        if (pxoVar3 != null) {
            int iIntValue = pxoVar3.e().intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.S == ylf0.b) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }
}
