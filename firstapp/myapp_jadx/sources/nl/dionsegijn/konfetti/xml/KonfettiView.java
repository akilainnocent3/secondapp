package nl.dionsegijn.konfetti.xml;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.f3b;
import defpackage.goa;
import defpackage.gtz;
import defpackage.guz;
import defpackage.huz;
import defpackage.i620;
import defpackage.juz;
import defpackage.kuz;
import defpackage.l48;
import defpackage.m2g;
import defpackage.moy;
import defpackage.mw50;
import defpackage.mwo;
import defpackage.p48;
import defpackage.pbn;
import defpackage.px80;
import defpackage.tvh0;
import defpackage.x0g;
import defpackage.xw90;
import defpackage.zvo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0017B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lnl/dionsegijn/konfetti/xml/KonfettiView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lkuz;", "getActiveSystems", "()Ljava/util/List;", "Lmoy;", "onParticleSystemUpdateListener", "Lmoy;", "getOnParticleSystemUpdateListener", "()Lmoy;", "setOnParticleSystemUpdateListener", "(Lmoy;)V", "a", "xml_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class KonfettiView extends View {
    public final ArrayList a;
    public final a b;
    public f3b c;
    public final pbn d;
    public final Paint e;

    public static final class a {
        public long a = -1;
    }

    public KonfettiView(Context context) {
        super(context);
        this.a = new ArrayList();
        this.b = new a();
        this.c = new f3b();
        this.d = new pbn();
        this.e = new Paint();
    }

    public final void a(guz... guzVarArr) {
        ArrayList arrayList = new ArrayList(guzVarArr.length);
        for (guz guzVar : guzVarArr) {
            arrayList.add(new kuz(b(guzVar), Resources.getSystem().getDisplayMetrics().density));
        }
        this.a.addAll(arrayList);
        invalidate();
    }

    public final guz b(guz guzVar) {
        List<px80> list = guzVar.h;
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        for (px80 px80Var : list) {
            if (px80Var instanceof px80.b) {
                throw null;
            }
            arrayList.add(px80Var);
        }
        return guz.a(guzVar, 0, 0.0f, null, arrayList, null, 16255);
    }

    public final List<kuz> getActiveSystems() {
        return this.a;
    }

    public final moy getOnParticleSystemUpdateListener() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x02b6  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        x0g x0gVar;
        a aVar;
        float f;
        float f2;
        x0g x0gVar2;
        ArrayList arrayList;
        boolean z;
        float f3;
        boolean z2;
        int i;
        double dNextDouble;
        canvas.getClass();
        super.onDraw(canvas);
        a aVar2 = this.b;
        if (aVar2.a == -1) {
            aVar2.a = System.nanoTime();
        }
        long jNanoTime = System.nanoTime();
        float f4 = (jNanoTime - aVar2.a) / 1000000.0f;
        aVar2.a = jNanoTime;
        float f5 = 1000.0f;
        float f6 = f4 / 1000.0f;
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size() - 1;
        while (-1 < size) {
            kuz kuzVar = (kuz) arrayList2.get(size);
            long j = kuzVar.b;
            huz huzVar = kuzVar.c;
            x0g x0gVar3 = huzVar.b;
            ArrayList arrayList3 = kuzVar.d;
            guz guzVar = kuzVar.a;
            if (System.currentTimeMillis() - j >= 0) {
                f3b f3bVar = this.c;
                f3bVar.getClass();
                float f7 = huzVar.f + f6;
                huzVar.f = f7;
                f = f5;
                f2 = f6;
                long j2 = x0gVar3.a;
                float f8 = j2;
                float f9 = f8 / f;
                float f10 = huzVar.e;
                if (f10 == 0.0f && f2 > f9) {
                    huzVar.f = f9;
                    f7 = f9;
                }
                RandomAccess randomAccess = m2g.a;
                float f11 = 0.0f;
                float f12 = x0gVar3.b;
                float f13 = f7;
                if (f7 < f12 || (j2 != 0 && f10 >= f8)) {
                    aVar = aVar2;
                } else {
                    IntRange intRange = new IntRange(1, (int) (f13 / f12), 1);
                    ArrayList arrayList4 = new ArrayList(l48.r(intRange, 10));
                    Iterator<Integer> it = intRange.iterator();
                    while (((mwo) it).c) {
                        ((zvo) it).nextInt();
                        List<xw90> list = guzVar.f;
                        mw50 mw50Var = guzVar.l;
                        Random random = huzVar.d;
                        xw90 xw90Var = list.get(random.nextInt(list.size()));
                        i620.a aVarP = huzVar.p(guzVar.k, f3bVar);
                        Iterator<Integer> it2 = it;
                        a aVar3 = aVar2;
                        tvh0 tvh0Var = new tvh0(aVarP.a, aVarP.b);
                        float f14 = xw90Var.a * huzVar.c;
                        float f15 = xw90Var.b;
                        float fNextFloat = (random.nextFloat() * 0.2f * f15) + f15;
                        List<px80> list2 = guzVar.h;
                        px80 px80Var = list2.get(random.nextInt(list2.size()));
                        List<Integer> list3 = guzVar.g;
                        int iIntValue = list3.get(random.nextInt(list3.size())).intValue();
                        long j3 = guzVar.i;
                        boolean z3 = guzVar.j;
                        float f16 = guzVar.d;
                        float fNextFloat2 = guzVar.c;
                        if (f16 != -1.0f) {
                            fNextFloat2 = (random.nextFloat() * (f16 - fNextFloat2)) + fNextFloat2;
                        }
                        int i2 = guzVar.b;
                        float f17 = fNextFloat2;
                        int i3 = guzVar.a;
                        if (i2 == 0) {
                            dNextDouble = i3;
                        } else {
                            int i4 = i2 / 2;
                            int i5 = i3 - i4;
                            dNextDouble = (random.nextDouble() * ((double) ((i4 + i3) - i5))) + ((double) i5);
                        }
                        double radians = Math.toRadians(dNextDouble);
                        arrayList4.add(new goa(tvh0Var, iIntValue, f14, fNextFloat, px80Var, j3, z3, new tvh0(((float) Math.cos(radians)) * f17, ((float) Math.sin(radians)) * f17), guzVar.e, huzVar.q(mw50Var) * mw50Var.e, huzVar.q(mw50Var) * mw50Var.d, huzVar.c));
                        it = it2;
                        aVar2 = aVar3;
                    }
                    aVar = aVar2;
                    huzVar.f %= x0gVar3.b;
                    randomAccess = arrayList4;
                }
                huzVar.e = (f2 * f) + huzVar.e;
                arrayList3.addAll(randomAccess);
                int size2 = arrayList3.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj = arrayList3.get(i6);
                    i6++;
                    goa goaVar = (goa) obj;
                    goaVar.getClass();
                    tvh0 tvh0Var2 = goaVar.q;
                    tvh0 tvh0Var3 = goaVar.h;
                    float f18 = 1.0f / goaVar.d;
                    float f19 = (tvh0Var2.a * f18) + tvh0Var3.a;
                    tvh0Var3.a = f19;
                    float f20 = (tvh0Var2.b * f18) + tvh0Var3.b;
                    tvh0Var3.b = f20;
                    float f21 = goaVar.c;
                    tvh0 tvh0Var4 = goaVar.i;
                    tvh0 tvh0Var5 = goaVar.a;
                    int i7 = size2;
                    float f22 = f2 > f11 ? 1.0f / f2 : 60.0f;
                    goaVar.p = f22;
                    if (tvh0Var5.b > f3bVar.b) {
                        goaVar.r = 0;
                    } else {
                        float f23 = tvh0Var4.a + f19;
                        float f24 = tvh0Var4.b + f20;
                        float f25 = goaVar.j;
                        float f26 = f23 * f25;
                        tvh0Var4.a = f26;
                        float f27 = f24 * f25;
                        tvh0Var4.b = f27;
                        float f28 = f2 * f22 * goaVar.m;
                        tvh0Var5.a = (f26 * f28) + tvh0Var5.a;
                        tvh0Var5.b = (f27 * f28) + tvh0Var5.b;
                        long j4 = goaVar.f - ((long) (f2 * f));
                        goaVar.f = j4;
                        if (j4 <= 0) {
                            if (!goaVar.g || (i = goaVar.r - ((int) ((5.0f * f2) * f22))) < 0) {
                                i = 0;
                            }
                            goaVar.r = i;
                        }
                        float f29 = (goaVar.l * f2 * f22) + goaVar.n;
                        goaVar.n = f29;
                        if (f29 >= 360.0f) {
                            f3 = f11;
                            goaVar.n = f3;
                        } else {
                            f3 = f11;
                        }
                        float fAbs = goaVar.o - ((Math.abs(goaVar.k) * f2) * goaVar.p);
                        goaVar.o = fAbs;
                        if (fAbs < f3) {
                            goaVar.o = f21;
                            fAbs = f21;
                        }
                        goaVar.s = Math.abs((fAbs / f21) - 0.5f) * 2.0f;
                        goaVar.t = (goaVar.r << 24) | (goaVar.b & 16777215);
                        int i8 = (int) tvh0Var5.a;
                        int i9 = (int) tvh0Var5.b;
                        float f30 = i8;
                        if (f30 < 0.0f || f30 > f3bVar.a + 0.0f) {
                            z2 = false;
                        } else {
                            float f31 = i9;
                            if (f31 < 0.0f || f31 > f3bVar.b + 0.0f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        }
                        goaVar.u = z2;
                    }
                    x0gVar3 = x0gVar3;
                    size2 = i7;
                    f11 = 0.0f;
                }
                x0g x0gVar4 = x0gVar3;
                float f32 = 1.0f;
                p48.A(arrayList3, juz.a);
                ArrayList arrayList5 = new ArrayList();
                int size3 = arrayList3.size();
                int i10 = 0;
                while (i10 < size3) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    if (((goa) obj2).u) {
                        arrayList5.add(obj2);
                    }
                }
                ArrayList arrayList6 = new ArrayList(l48.r(arrayList5, 10));
                int size4 = arrayList5.size();
                int i11 = 0;
                while (i11 < size4) {
                    Object obj3 = arrayList5.get(i11);
                    i11++;
                    goa goaVar2 = (goa) obj3;
                    goaVar2.getClass();
                    tvh0 tvh0Var6 = goaVar2.a;
                    float f33 = tvh0Var6.a;
                    float f34 = tvh0Var6.b;
                    float f35 = goaVar2.c;
                    arrayList6.add(new gtz(f33, f34, f35, f35, goaVar2.t, goaVar2.n, goaVar2.s, goaVar2.e, goaVar2.r));
                    x0gVar4 = x0gVar4;
                }
                x0g x0gVar5 = x0gVar4;
                int size5 = arrayList6.size();
                int i12 = 0;
                while (i12 < size5) {
                    int i13 = i12 + 1;
                    gtz gtzVar = (gtz) arrayList6.get(i12);
                    int i14 = gtzVar.e;
                    ArrayList arrayList7 = arrayList3;
                    Paint paint = this.e;
                    paint.setColor(i14);
                    float f36 = gtzVar.g;
                    float f37 = gtzVar.c;
                    float f38 = (f36 * f37) / 2.0f;
                    int iSave = canvas.save();
                    canvas.translate(gtzVar.a - f38, gtzVar.b);
                    canvas.rotate(gtzVar.f, f38, f37 / 2.0f);
                    float f39 = f32;
                    canvas.scale(f36, f39);
                    px80 px80Var2 = gtzVar.h;
                    px80Var2.getClass();
                    paint.getClass();
                    this.d.getClass();
                    if (px80Var2.equals(px80.d.a)) {
                        x0gVar2 = x0gVar5;
                        arrayList = arrayList7;
                        canvas.drawRect(0.0f, 0.0f, f37, f37, paint);
                    } else {
                        x0gVar2 = x0gVar5;
                        arrayList = arrayList7;
                        if (px80Var2.equals(px80.a.a)) {
                            f3b f3bVar2 = px80.a.b;
                            f3bVar2.a = f37;
                            f3bVar2.b = f37;
                            z = false;
                            canvas.drawOval(new RectF(0.0f, 0.0f, f3bVar2.a, f3bVar2.b), paint);
                        } else {
                            z = false;
                            if (px80Var2 instanceof px80.c) {
                                float f40 = f37 * 0.0f;
                                float f41 = (f37 - f40) / 2.0f;
                                canvas.drawRect(0.0f, f41, f37, f41 + f40, paint);
                            }
                        }
                    }
                    canvas.restoreToCount(iSave);
                    i12 = i13;
                    f32 = f39;
                    arrayList3 = arrayList;
                    x0gVar5 = x0gVar2;
                }
                x0gVar = x0gVar5;
            } else {
                x0gVar = x0gVar3;
                aVar = aVar2;
                f = f5;
                f2 = f6;
            }
            ArrayList arrayList8 = arrayList3;
            long j5 = x0gVar.a;
            if (j5 > 0 && huzVar.e >= j5 && arrayList8.size() == 0) {
                arrayList2.remove(size);
            }
            size--;
            f5 = f;
            f6 = f2;
            aVar2 = aVar;
        }
        a aVar4 = aVar2;
        if (arrayList2.size() != 0) {
            invalidate();
        } else {
            aVar4.a = -1L;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.c = new f3b(i, i2);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        view.getClass();
        super.onVisibilityChanged(view, i);
        this.b.a = -1L;
    }

    public KonfettiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.b = new a();
        this.c = new f3b();
        this.d = new pbn();
        this.e = new Paint();
    }

    public KonfettiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList();
        this.b = new a();
        this.c = new f3b();
        this.d = new pbn();
        this.e = new Paint();
    }

    public final void setOnParticleSystemUpdateListener(moy moyVar) {
    }
}
