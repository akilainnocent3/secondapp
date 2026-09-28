package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportysoccer.activities.GameActivity;
import com.sportygames.sportysoccer.surfaceview.GameSurfaceView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class oby extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ pby b;

    public oby(pby pbyVar, Context context) {
        this.b = pbyVar;
        this.a = context;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f3;
        bwf bwfVar;
        zoc bpcVar;
        bwf bwfVar2;
        pby pbyVar = this.b;
        if (pbyVar.j) {
            bwf bwfVar3 = pbyVar.p;
            RectF rectF = new RectF(bwfVar3.a, bwfVar3.b, bwfVar3.c, bwfVar3.d);
            float fA = bsh0.a(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
            if (motionEvent.getX() >= rectF.left && motionEvent.getX() <= rectF.right && motionEvent.getY() >= rectF.top && motionEvent.getY() <= rectF.bottom && motionEvent2.getY() - motionEvent.getY() < 0.0f && fA >= 30.0f && fA <= 150.0f) {
                pby pbyVar2 = this.b;
                pbyVar2.i = new kmj(pbyVar2.k, System.currentTimeMillis());
                pby pbyVar3 = this.b;
                rby rbyVar = pbyVar3.g;
                float fMin = Math.min(Math.max(Math.abs(f2) / 1000.0f, rbyVar.o), rbyVar.p);
                pby pbyVar4 = this.b;
                rby rbyVar2 = pbyVar4.g;
                pbyVar3.r = new koc(fMin, fA, rbyVar2.m, rbyVar2.n, rbyVar2.l, rbyVar2.d, rbyVar2.i, rbyVar2.a, pbyVar4.i);
                pby pbyVar5 = this.b;
                wrc wrcVar = pbyVar5.v;
                kmj kmjVar = pbyVar5.i;
                synchronized (wrcVar) {
                    wrcVar.f = 0;
                    pqc pqcVar = wrcVar.d;
                    long jB = kmjVar.b();
                    pqcVar.getClass();
                    arrayList = new ArrayList();
                    for (long j = kmjVar.b; j < jB + 30; j += 30) {
                        arrayList.add(pqcVar.b(j, 30L));
                    }
                    wrcVar.g = arrayList;
                }
                oqc oqcVar = (oqc) rh6.a(1, arrayList);
                float f4 = oqcVar.b;
                float f5 = oqcVar.c;
                float f6 = wrcVar.b;
                bwf bwfVarClone = this.b.g.c.clone();
                bwfVarClone.g(f4, f5, f6, f6);
                koc kocVar = this.b.r;
                bwf bwfVar4 = kocVar.d;
                float fB = bwfVar4.b();
                float f7 = kocVar.b;
                int[] iArr = bsh0.a;
                long j2 = 30;
                float fLog = fB * ((float) (Math.log(f7 + 1.0f) / Math.log((0.009f * fB) + 1.0f)));
                float fA2 = bwfVar4.a() + (((-fLog) / 100.0f) * (90.0f - kocVar.c));
                float fB2 = bwfVar4.b() - fLog;
                kmj kmjVar2 = kocVar.i;
                float f8 = 0.5f;
                if (kmjVar2.a && !bsh0.f(fA2, fB2, kocVar.q * 0.5f, f4, f5, f6 * 0.5f).c) {
                    float f9 = 2.5f * f6;
                    if (bsh0.f(fA2, fB2, kocVar.q * 0.5f, f4, f5, f9 * 0.5f).c) {
                        float f10 = (f9 - f6) * 0.5f;
                        fA2 += fA2 < f4 ? f10 : -f10;
                        if (fB2 >= f5) {
                            f10 = -f10;
                        }
                        fB2 += f10;
                    }
                }
                kocVar.a = kmjVar2.b;
                kocVar.o = fA2;
                kocVar.p = fB2;
                float f11 = kocVar.q;
                joc jocVar = new joc(null, fA2, fB2, f11, 1.0f, 0.0f, false);
                bwf bwfVarClone2 = this.b.g.d.clone();
                bwfVarClone2.g(fA2, fB2, f11, f11);
                pby pbyVar6 = this.b;
                gpc gpcVar = pbyVar6.A;
                kmj kmjVar3 = pbyVar6.i;
                synchronized (gpcVar) {
                    gpcVar.f = 0;
                    pqc pqcVar2 = gpcVar.e;
                    long j3 = kmjVar3.b;
                    long jB2 = kmjVar3.b();
                    pqcVar2.getClass();
                    arrayList2 = new ArrayList();
                    while (j3 < jB2 + j2) {
                        long j4 = j2;
                        arrayList2.add(pqcVar2.b(j3, j4));
                        j3 += j4;
                        j2 = j4;
                        f8 = f8;
                    }
                    f3 = f8;
                    gpcVar.g = arrayList2;
                }
                float f12 = ((oqc) rh6.a(1, arrayList2)).b;
                bwf bwfVarClone3 = this.b.g.e.clone();
                bwfVarClone3.f(f12, bwfVarClone3.b());
                boolean z = bsh0.g(bwfVarClone, bwfVarClone2).c;
                boolean z2 = bsh0.h(bwfVarClone3, bwfVarClone2).c;
                pby pbyVar7 = this.b;
                if (!pbyVar7.i.a && z && !z2) {
                    rby rbyVar3 = pbyVar7.g;
                    Context context = this.a;
                    Resources resources = context.getResources();
                    pby pbyVar8 = this.b;
                    kmj kmjVar4 = pbyVar8.i;
                    float f13 = pbyVar8.a;
                    bwf bwfVar5 = rbyVar3.c;
                    String str = kmjVar4.c;
                    if (str.equals("ufo")) {
                        BitmapFactory.Options optionsD = bsh0.d(resources, R.drawable.sg_ufo);
                        float f14 = f13 * f3;
                        float f15 = (optionsD.outHeight * f14) / optionsD.outWidth;
                        float fI = (bwfVar5.i() * f3) - (f14 * f3);
                        float dimension = context.getResources().getDimension(R.dimen.sg_ufo_top);
                        bwfVar = new bwf(bsh0.i(resources, R.drawable.sg_ufo, (int) f14, (int) f15, optionsD), fI, dimension, fI + f14, dimension + f15, 0);
                        bpcVar = new bpc(bwfVar, jocVar, kmjVar4);
                    } else {
                        if (str.equals("lightning")) {
                            BitmapFactory.Options optionsD2 = bsh0.d(resources, R.drawable.sg_thunder);
                            float f16 = f13 * 0.4f;
                            float f17 = (optionsD2.outHeight * f16) / optionsD2.outWidth;
                            float fI2 = (bwfVar5.i() * f3) - (f16 * f3);
                            bwfVar = new bwf(bsh0.i(resources, R.drawable.sg_thunder, (int) f16, (int) f17, optionsD2), fI2, 0.0f, fI2 + f16, f17 + 0.0f, 0);
                            bpcVar = new apc(bwfVar, jocVar, kmjVar4, rbyVar3);
                        } else {
                            bwfVar2 = null;
                            bpcVar = null;
                        }
                        pbyVar7 = this.b;
                        pbyVar7.C = bwfVar2;
                        pbyVar7.D = bpcVar;
                    }
                    bwfVar2 = bwfVar;
                    pbyVar7 = this.b;
                    pbyVar7.C = bwfVar2;
                    pbyVar7.D = bpcVar;
                }
                pbyVar7.f = "ball_is_flying";
                pbyVar7.j = false;
                GameSurfaceView.a aVar = pbyVar7.n.a.a;
                if (aVar != null) {
                    lmj lmjVar = ((GameActivity) aVar).z;
                    lmjVar.d("game_start");
                    hpa0 hpa0Var = lmjVar.a;
                    if (hpa0Var != null) {
                        hpa0Var.a(ay0.K(hpa0.f, lx30.INSTANCE), false, false);
                    }
                }
            }
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }
}
