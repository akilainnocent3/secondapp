package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.os.Handler;
import android.view.GestureDetector;
import androidx.recyclerview.widget.r;
import com.sportygames.sportysoccer.surfaceview.a;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class pby extends sby {
    public gpc A;
    public gzf0 B;
    public bwf C;
    public zoc D;
    public final GestureDetector E;
    public final Context e;
    public rby g;
    public qby h;
    public kmj i;
    public boolean j;
    public boolean k;
    public final a n;
    public bwf p;
    public joc q;
    public koc r;
    public bwf t;
    public wrc v;
    public dwf w;
    public vpc x;
    public ArrayList y;
    public ArrayList z;
    public String f = "init";
    public final ewf u = new ewf();
    public final ewf s = new ewf();
    public int o = r.d.DEFAULT_DRAG_ANIMATION_DURATION;
    public final Handler l = new Handler();
    public final SecureRandom m = n380.a();

    public pby(Context context, a aVar) {
        this.e = context;
        this.n = aVar;
        this.E = new GestureDetector(context, new oby(this, context));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00f0 A[LOOP:2: B:26:0x00ea->B:28:0x00f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x013f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0159 A[SYNTHETIC] */
    public final void b(float f, float f2, long j, int[] iArr, int i) {
        bwf bwfVar;
        int i2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12 = f;
        float f13 = f2;
        Resources resources = this.e.getResources();
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i3 = 0;
        bsh0.d(resources, iArr[0]);
        SecureRandom secureRandomA = n380.a();
        this.y = new ArrayList();
        int i4 = 0;
        while (true) {
            int i5 = i * 6;
            bwfVar = this.t;
            i2 = 3;
            f3 = 2.0f;
            if (i4 >= i5) {
                break;
            }
            float fNextInt = (secureRandomA.nextInt(3) + 2.0f) * bwfVar.i() * 0.1f;
            RectF rectFB = bsh0.b(f12, f13, fNextInt, fNextInt);
            int i6 = (int) fNextInt;
            bwf bwfVar2 = new bwf(bsh0.i(resources, iArr[secureRandomA.nextInt(iArr.length)], i6, i6, options), rectFB.left, rectFB.top, rectFB.right, rectFB.bottom);
            bwfVar2.i = secureRandomA.nextInt(180);
            bwfVar2.j = secureRandomA.nextInt(180);
            this.y.add(bwfVar2);
            i4++;
        }
        ArrayList arrayList = new ArrayList();
        SecureRandom secureRandomA2 = n380.a();
        float fI = bwfVar.i() * 0.9f;
        float fD = bwfVar.d() * 0.9f;
        int i7 = 0;
        while (i7 < 6) {
            int i8 = i7 % 6;
            char c = 2;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        f4 = (fI / f3) + f12;
                        f9 = f13 - (3.0f * fD);
                        f10 = f4 + fI;
                    } else if (i8 != i2) {
                        if (i8 != 4) {
                            f4 = f12 - ((3.0f * fI) / 4.0f);
                            f9 = f13 + fD;
                            f10 = f12 - fI;
                        } else {
                            f4 = ((3.0f * fI) / 4.0f) + f12;
                            f9 = f13 + fD;
                            f10 = f12 + fI;
                        }
                        f8 = (fD * f3) + f13;
                    } else {
                        f4 = f12 - (fI / f3);
                        f9 = f13 - (3.0f * fD);
                        f10 = f4 - fI;
                    }
                    f8 = f9 + fD;
                } else {
                    f4 = f12 - fI;
                    f5 = fD * f3;
                    f6 = f13 - f5;
                    f7 = f4 - fI;
                }
                while (i3 < i / 2) {
                    int i9 = i3 + 1;
                    int i10 = i * 2;
                    float f14 = f4;
                    arrayList.add(bsh0.c(secureRandomA2, j, bsh0.e(secureRandomA2, i3, (i9 * r.d.DEFAULT_DRAG_ANIMATION_DURATION) / i10), f12, f13, f14, f9, f10, f8));
                    f12 = f;
                    f13 = f2;
                    arrayList.add(bsh0.c(secureRandomA2, j, bsh0.e(secureRandomA2, ((i10 - i9) * r.d.DEFAULT_DRAG_ANIMATION_DURATION) / i10, ((i10 - i3) * r.d.DEFAULT_DRAG_ANIMATION_DURATION) / i10), f12, f13, f14, f9, f10, f8));
                    f4 = f14;
                    i3 = i9;
                    i7 = i7;
                    c = 2;
                }
                int i11 = i7;
                f11 = f4;
                if (i % 2 == 1) {
                    int i12 = (r.d.DEFAULT_DRAG_ANIMATION_DURATION / i) * 2;
                    arrayList.add(bsh0.c(secureRandomA2, j, bsh0.e(secureRandomA2, 100 - i12, 100 + i12), f, f2, f11, f9, f10, f8));
                }
                i7 = i11 + 1;
                f12 = f;
                f13 = f2;
                i3 = 0;
                i2 = 3;
                f3 = 2.0f;
            } else {
                f4 = f12 + fI;
                f5 = fD * f3;
                f6 = f13 - f5;
                f7 = f4 + fI;
            }
            float f15 = f7;
            f8 = f5 + f6;
            f9 = f6;
            f10 = f15;
            while (i3 < i / 2) {
                int i13 = i3 + 1;
                int i14 = i * 2;
                float f16 = f4;
                arrayList.add(bsh0.c(secureRandomA2, j, bsh0.e(secureRandomA2, i3, (i13 * r.d.DEFAULT_DRAG_ANIMATION_DURATION) / i14), f12, f13, f16, f9, f10, f8));
                f12 = f;
                f13 = f2;
                arrayList.add(bsh0.c(secureRandomA2, j, bsh0.e(secureRandomA2, ((i14 - i13) * r.d.DEFAULT_DRAG_ANIMATION_DURATION) / i14, ((i14 - i3) * r.d.DEFAULT_DRAG_ANIMATION_DURATION) / i14), f12, f13, f16, f9, f10, f8));
                f4 = f16;
                i3 = i13;
                i7 = i7;
                c = 2;
            }
            int i15 = i7;
            f11 = f4;
            if (i % 2 == 1) {
                int i16 = (r.d.DEFAULT_DRAG_ANIMATION_DURATION / i) * 2;
                arrayList.add(bsh0.c(secureRandomA2, j, bsh0.e(secureRandomA2, 100 - i16, 100 + i16), f, f2, f11, f9, f10, f8));
            }
            i7 = i15 + 1;
            f12 = f;
            f13 = f2;
            i3 = 0;
            i2 = 3;
            f3 = 2.0f;
        }
        this.z = arrayList;
    }

    public final void c() {
        joc jocVar = this.q;
        ewf ewfVar = this.s;
        ewf ewfVar2 = this.u;
        if (jocVar != null) {
            String str = jocVar.a;
            str.getClass();
            switch (str) {
                case "hit_target_edge":
                case "hit_target_center":
                    rby rbyVar = this.g;
                    a(rbyVar.b, rbyVar.f, rbyVar.a, ewfVar2, ewfVar, this.p, this.t);
                    ArrayList arrayList = this.y;
                    if (arrayList != null) {
                        a((awf[]) arrayList.toArray(new awf[0]));
                    }
                    a(this.g.e);
                    break;
                case "hit_nothing":
                    bwf bwfVar = this.p;
                    rby rbyVar2 = this.g;
                    a(bwfVar, rbyVar2.b, rbyVar2.f, rbyVar2.a, ewfVar2, this.t, rbyVar2.e);
                    break;
                case "touchdown":
                    rby rbyVar3 = this.g;
                    a(rbyVar3.b, rbyVar3.f, rbyVar3.a, ewfVar2, this.t, rbyVar3.e, this.C);
                    break;
                case "can_collision":
                    rby rbyVar4 = this.g;
                    a(rbyVar4.b, rbyVar4.f, rbyVar4.a, ewfVar2, this.t, rbyVar4.e, this.p, this.C);
                    break;
                case "hit_frame_edge":
                    rby rbyVar5 = this.g;
                    a(rbyVar5.b, rbyVar5.f, rbyVar5.a, ewfVar2, this.t, this.w, this.p, rbyVar5.e);
                    break;
                case "hit_frame_net":
                    rby rbyVar6 = this.g;
                    a(rbyVar6.b, rbyVar6.f, rbyVar6.a, ewfVar2, ewfVar, this.p, this.t, rbyVar6.e);
                    break;
                case "hit_goalkeeper":
                    rby rbyVar7 = this.g;
                    a(rbyVar7.b, rbyVar7.f, rbyVar7.a, ewfVar2, this.t, rbyVar7.e, this.w, this.p);
                    break;
            }
            return;
        }
        String str2 = this.f;
        if (str2.equals("init")) {
            rby rbyVar8 = this.g;
            a(rbyVar8.b, rbyVar8.f, rbyVar8.a, ewfVar2, this.t, rbyVar8.e);
        } else if (str2.equals("ready_to_kick")) {
            rby rbyVar9 = this.g;
            a(rbyVar9.b, rbyVar9.f, rbyVar9.a, ewfVar2, this.t, rbyVar9.e, ewfVar, this.p);
        } else {
            rby rbyVar10 = this.g;
            a(rbyVar10.b, rbyVar10.f, rbyVar10.a, ewfVar2, this.t, rbyVar10.e, this.p, this.C);
        }
    }

    public final void d() {
        String str = this.f;
        boolean zEquals = str.equals("init");
        ewf ewfVar = this.s;
        if (zEquals) {
            float fI = this.p.i() * 0.5f;
            float f = 0.25f * fI;
            float fA = this.p.a();
            float f2 = this.p.d;
            float f3 = fA - fI;
            float f4 = fA + fI;
            ewfVar.a = f3;
            ewfVar.b = f2 - f;
            ewfVar.c = f4;
            ewfVar.d = f2 + f;
            ewfVar.e(0.45f);
            return;
        }
        if (str.equals("ball_is_flying")) {
            String str2 = this.q.a;
            str2.getClass();
            switch (str2) {
                case "hit_target_edge":
                case "hit_target_center":
                case "hit_frame_net":
                    joc jocVar = this.q;
                    float f5 = jocVar.d * 0.5f;
                    float f6 = 0.25f * f5;
                    float f7 = jocVar.b;
                    rby rbyVar = this.g;
                    float f8 = rbyVar.l;
                    float f9 = f5 + f8;
                    float f10 = f7 - f5;
                    float f11 = f7 + f5;
                    ewfVar.a = f10;
                    ewfVar.b = f9 - f6;
                    ewfVar.c = f11;
                    ewfVar.d = f9 + f6;
                    ewfVar.e(Math.min(0.45f - (((f8 - jocVar.c) / (f8 - rbyVar.k)) * 0.19999999f), jocVar.e));
                    break;
            }
        }
    }

    public final void e(long j) {
        Iterator it = this.y.iterator();
        Iterator it2 = this.z.iterator();
        while (it.hasNext() && it2.hasNext()) {
            roc rocVarA = ((soc) it2.next()).a(j);
            bwf bwfVar = (bwf) it.next();
            bwfVar.f(rocVarA.a, rocVarA.b);
            bwfVar.e(rocVarA.c);
            bwfVar.i += rocVarA.d;
        }
    }

    public final void f(long j) {
        epc epcVarA = this.A.a(j);
        bwf bwfVar = this.g.e;
        bwfVar.f(epcVarA.a, bwfVar.b());
        bwf bwfVar2 = this.g.e;
        bwfVar2.n = Math.min(Math.max(0, epcVarA.b), bwfVar2.l.length - 1);
    }

    public final void g(int i, long j) {
        trc trcVarA = this.v.a(j);
        this.t.f(trcVarA.a, trcVarA.b);
        bwf bwfVar = this.t;
        float f = trcVarA.c;
        bwfVar.e(f);
        bwf bwfVar2 = this.t;
        float f2 = trcVarA.d;
        bwfVar2.h += f2;
        bwfVar2.j = trcVarA.e;
        float f3 = trcVarA.f;
        bwfVar2.e = f3;
        bwfVar2.f = f3;
        if (101 == i) {
            bwfVar2.k();
        }
        float fD = (this.t.d() * 0.5f) + this.g.g.top;
        float fB = (this.t.b() - fD) / ((this.g.g.bottom - (this.t.d() * 0.5f)) - fD);
        float fI = this.t.i() * 0.5f * (1.2f - (0.40000004f * fB));
        float f4 = 0.25f * fI;
        float fA = this.t.a();
        float f5 = this.g.a.d - f4;
        float f6 = fA - fI;
        ewf ewfVar = this.u;
        ewfVar.a = f6;
        ewfVar.b = f5 - f4;
        ewfVar.c = fA + fI;
        ewfVar.d = f5 + f4;
        ewfVar.e((fB * 0.19999999f) + 0.25f);
        if (i == 101) {
            ewfVar.e(0.0f);
        } else if (i != 102) {
            ewfVar.h = 0.0f;
        } else {
            ewfVar.h += f2;
            ewfVar.e(ewfVar.g * f);
        }
    }
}
