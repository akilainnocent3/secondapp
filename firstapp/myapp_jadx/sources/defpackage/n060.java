package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n060 implements fy80, u12.a {
    public final iot a;
    public final u12<Float, Float> b;
    public vx80 c;

    public n060(iot iotVar, w12 w12Var, m060 m060Var) {
        this.a = iotVar;
        u12<Float, Float> u12VarB = m060Var.a.b();
        this.b = u12VarB;
        w12Var.g(u12VarB);
        u12VarB.a(this);
    }

    public static int c(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // u12.a
    public final void a() {
        this.a.invalidateSelf();
    }

    @Override // defpackage.fy80
    public final vx80 e(vx80 vx80Var) {
        vx80 vx80Var2 = vx80Var;
        ArrayList arrayList = vx80Var2.a;
        if (arrayList.size() > 2) {
            float fFloatValue = this.b.e().floatValue();
            if (fFloatValue != 0.0f) {
                ArrayList arrayList2 = vx80Var2.a;
                boolean z = vx80Var2.c;
                boolean z2 = true;
                int size = arrayList2.size() - 1;
                int i = 0;
                while (size >= 0) {
                    h4c h4cVar = (h4c) arrayList2.get(size);
                    h4c h4cVar2 = (h4c) arrayList2.get(c(size - 1, arrayList2.size()));
                    PointF pointF = (size != 0 || z) ? h4cVar2.c : vx80Var2.b;
                    i = (((size != 0 || z) ? h4cVar2.b : pointF).equals(pointF) && h4cVar.a.equals(pointF) && !(!vx80Var2.c && (size == 0 || size == arrayList2.size() - 1))) ? i + 2 : i + 1;
                    size--;
                }
                vx80 vx80Var3 = this.c;
                if (vx80Var3 == null || vx80Var3.a.size() != i) {
                    ArrayList arrayList3 = new ArrayList(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList3.add(new h4c());
                    }
                    this.c = new vx80(new PointF(0.0f, 0.0f), false, arrayList3);
                }
                vx80 vx80Var4 = this.c;
                vx80Var4.c = z;
                PointF pointF2 = vx80Var2.b;
                float f = pointF2.x;
                float f2 = pointF2.y;
                PointF pointF3 = vx80Var4.b;
                if (pointF3 == null) {
                    pointF3 = new PointF();
                    vx80Var4.b = pointF3;
                }
                pointF3.set(f, f2);
                ArrayList arrayList4 = vx80Var4.a;
                boolean z3 = vx80Var2.c;
                int i3 = 0;
                int i4 = 0;
                while (i3 < arrayList.size()) {
                    h4c h4cVar3 = (h4c) arrayList.get(i3);
                    h4c h4cVar4 = (h4c) arrayList.get(c(i3 - 1, arrayList.size()));
                    h4c h4cVar5 = (h4c) arrayList.get(c(i3 - 2, arrayList.size()));
                    PointF pointF4 = (i3 != 0 || z3) ? h4cVar4.c : vx80Var2.b;
                    PointF pointF5 = (i3 != 0 || z3) ? h4cVar4.b : pointF4;
                    PointF pointF6 = h4cVar3.a;
                    PointF pointF7 = h4cVar5.c;
                    boolean z4 = z2;
                    PointF pointF8 = h4cVar3.c;
                    boolean z5 = (vx80Var2.c || !(i3 == 0 || i3 == arrayList.size() + (-1))) ? false : z4;
                    if (pointF5.equals(pointF4) && pointF6.equals(pointF4) && !z5) {
                        float f3 = pointF4.x;
                        float f4 = f3 - pointF7.x;
                        float f5 = pointF4.y;
                        float f6 = f5 - pointF7.y;
                        float f7 = pointF8.x - f3;
                        float f8 = pointF8.y - f5;
                        float fHypot = (float) Math.hypot(f4, f6);
                        float fHypot2 = (float) Math.hypot(f7, f8);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f9 = pointF4.x;
                        float fA = hxa.a(pointF7.x, f9, fMin, f9);
                        float f10 = pointF4.y;
                        float fA2 = hxa.a(pointF7.y, f10, fMin, f10);
                        float fA3 = hxa.a(pointF8.x, f9, fMin2, f9);
                        float fA4 = hxa.a(pointF8.y, f10, fMin2, f10);
                        float f11 = fA - ((fA - f9) * 0.5519f);
                        float f12 = fA2 - ((fA2 - f10) * 0.5519f);
                        float f13 = fA3 - ((fA3 - f9) * 0.5519f);
                        float f14 = fA4 - ((fA4 - f10) * 0.5519f);
                        h4c h4cVar6 = (h4c) arrayList4.get(c(i4 - 1, arrayList4.size()));
                        h4c h4cVar7 = (h4c) arrayList4.get(i4);
                        h4cVar6.b.set(fA, fA2);
                        h4cVar6.c.set(fA, fA2);
                        if (i3 == 0) {
                            PointF pointF9 = vx80Var4.b;
                            if (pointF9 == null) {
                                pointF9 = new PointF();
                                vx80Var4.b = pointF9;
                            }
                            pointF9.set(fA, fA2);
                        }
                        h4cVar7.a.set(f11, f12);
                        h4c h4cVar8 = (h4c) arrayList4.get(i4 + 1);
                        h4cVar7.b.set(f13, f14);
                        h4cVar7.c.set(fA3, fA4);
                        h4cVar8.a.set(fA3, fA4);
                        i4 += 2;
                    } else {
                        h4c h4cVar9 = (h4c) arrayList4.get(c(i4 - 1, arrayList4.size()));
                        h4c h4cVar10 = (h4c) arrayList4.get(i4);
                        PointF pointF10 = h4cVar4.b;
                        h4cVar9.b.set(pointF10.x, pointF10.y);
                        PointF pointF11 = h4cVar4.c;
                        h4cVar9.c.set(pointF11.x, pointF11.y);
                        PointF pointF12 = h4cVar3.a;
                        h4cVar10.a.set(pointF12.x, pointF12.y);
                        i4++;
                    }
                    i3++;
                    vx80Var2 = vx80Var;
                    z2 = z4;
                    arrayList = arrayList;
                    fFloatValue = fFloatValue;
                }
                return vx80Var4;
            }
        }
        return vx80Var2;
    }

    @Override // defpackage.fy80
    public final void h(ux80 ux80Var) {
        this.b.a(ux80Var);
    }

    @Override // defpackage.cza
    public final void b(List<cza> list, List<cza> list2) {
    }
}
