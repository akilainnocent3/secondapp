package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.helper.widget.MotionEffect;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.core.widget.NestedScrollView;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import defpackage.aw0;
import defpackage.enp;
import defpackage.gkd0;
import defpackage.h1e0;
import defpackage.hce0;
import defpackage.he;
import defpackage.ii10;
import defpackage.ixa;
import defpackage.jxa;
import defpackage.kyh;
import defpackage.l5w;
import defpackage.m5w;
import defpackage.n5w;
import defpackage.n92;
import defpackage.owa;
import defpackage.q9i0;
import defpackage.qal;
import defpackage.rfi0;
import defpackage.rh6;
import defpackage.skf;
import defpackage.slx;
import defpackage.sxd0;
import defpackage.t5w;
import defpackage.tx5;
import defpackage.u5w;
import defpackage.uf80;
import defpackage.vae;
import defpackage.vx1;
import defpackage.wk30;
import defpackage.wlp;
import defpackage.x3g0;
import defpackage.y3g0;
import defpackage.yil;
import defpackage.z8i0;
import defpackage.z9i0;
import defpackage.zzc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements slx {
    public static boolean U0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public androidx.constraintlayout.motion.widget.b F;
    public int F0;
    public t5w G;
    public float G0;
    public Interpolator H;
    public final wlp H0;
    public float I;
    public boolean I0;
    public int J;
    public g J0;
    public int K;
    public z9i0 K0;
    public int L;
    public final Rect L0;
    public int M;
    public boolean M0;
    public int N;
    public i N0;
    public boolean O;
    public final e O0;
    public final HashMap<View, n5w> P;
    public boolean P0;
    public long Q;
    public final RectF Q0;
    public float R;
    public View R0;
    public float S;
    public Matrix S0;
    public float T;
    public final ArrayList<Integer> T0;
    public long U;
    public float V;
    public boolean W;
    public boolean a0;
    public h b0;
    public int c0;
    public d d0;
    public boolean e0;
    public final h1e0 f0;
    public final c g0;
    public vae h0;
    public int i0;
    public int j0;
    public boolean k0;
    public float l0;
    public float m0;
    public long n0;
    public float o0;
    public boolean p0;
    public ArrayList<MotionHelper> q0;
    public ArrayList<MotionHelper> r0;
    public ArrayList<MotionHelper> s0;
    public CopyOnWriteArrayList<h> t0;
    public int u0;
    public long v0;
    public float w0;
    public int x0;
    public float y0;
    public boolean z0;

    public class a implements Runnable {
        public final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.setNestedScrollingEnabled(true);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.J0.a();
        }
    }

    public class c extends t5w {
        public float a = 0.0f;
        public float b = 0.0f;
        public float c;

        public c() {
        }

        @Override // defpackage.t5w
        public final float a() {
            return MotionLayout.this.I;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = this.a;
            float f3 = this.c;
            MotionLayout motionLayout = MotionLayout.this;
            if (f2 > 0.0f) {
                float f4 = f2 / f3;
                if (f4 < f) {
                    f = f4;
                }
                float f5 = f3 * f;
                motionLayout.I = f2 - f5;
                return ((f2 * f) - ((f5 * f) / 2.0f)) + this.b;
            }
            float f6 = (-f2) / f3;
            if (f6 < f) {
                f = f6;
            }
            float f7 = f3 * f;
            motionLayout.I = f7 + f2;
            return ((f7 * f) / 2.0f) + (f2 * f) + this.b;
        }
    }

    public class d {
        public float[] a;
        public final int[] b;
        public final float[] c;
        public Path d;
        public final Paint e;
        public final Paint f;
        public final Paint g;
        public final Paint h;
        public final Paint i;
        public final float[] j;
        public int k;
        public final Rect l = new Rect();

        public d() {
            Paint paint = new Paint();
            this.e = paint;
            paint.setAntiAlias(true);
            paint.setColor(-21965);
            paint.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = new Paint();
            this.f = paint2;
            paint2.setAntiAlias(true);
            paint2.setColor(-2067046);
            paint2.setStrokeWidth(2.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.g = paint3;
            paint3.setAntiAlias(true);
            paint3.setColor(-13391360);
            paint3.setStrokeWidth(2.0f);
            paint3.setStyle(style);
            Paint paint4 = new Paint();
            this.h = paint4;
            paint4.setAntiAlias(true);
            paint4.setColor(-13391360);
            paint4.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.j = new float[8];
            Paint paint5 = new Paint();
            this.i = paint5;
            paint5.setAntiAlias(true);
            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
            this.c = new float[100];
            this.b = new int[50];
        }

        public final void a(Canvas canvas, int i, int i2, n5w n5wVar) {
            Canvas canvas2;
            int width;
            int height;
            float f;
            boolean z;
            Paint paint = this.g;
            int[] iArr = this.b;
            boolean z2 = false;
            int i3 = 4;
            if (i == 4) {
                int i4 = 0;
                boolean z3 = false;
                boolean z4 = false;
                while (i4 < this.k) {
                    int i5 = iArr[i4];
                    if (i5 == 1) {
                        z = z3;
                        z = true;
                    }
                    if (i5 == 0) {
                        z4 = true;
                    }
                    i4++;
                    z3 = z;
                    z4 = z4;
                }
                if (z3) {
                    float[] fArr = this.a;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
                }
                if (z4) {
                    b(canvas);
                }
            }
            if (i == 2) {
                float[] fArr2 = this.a;
                float f2 = fArr2[0];
                float f3 = fArr2[1];
                float f4 = fArr2[fArr2.length - 2];
                float f5 = fArr2[fArr2.length - 1];
                canvas2 = canvas;
                canvas2.drawLine(f2, f3, f4, f5, paint);
            } else {
                canvas2 = canvas;
            }
            if (i == 3) {
                b(canvas);
            }
            canvas2.drawLines(this.a, this.e);
            View view = n5wVar.b;
            if (view != null) {
                width = view.getWidth();
                height = n5wVar.b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            int i6 = 1;
            while (i6 < i2 - 1) {
                if (i != i3 || iArr[i6 - 1] != 0) {
                    int i7 = i6 * 2;
                    float[] fArr3 = this.c;
                    float f6 = fArr3[i7];
                    float f7 = fArr3[i7 + 1];
                    this.d.reset();
                    this.d.moveTo(f6, f7 + 10.0f);
                    this.d.lineTo(f6 + 10.0f, f7);
                    this.d.lineTo(f6, f7 - 10.0f);
                    this.d.lineTo(f6 - 10.0f, f7);
                    this.d.close();
                    int i8 = i6 - 1;
                    n5wVar.u.get(i8);
                    Paint paint2 = this.i;
                    if (i == i3) {
                        int i9 = iArr[i8];
                        if (i9 == 1) {
                            d(canvas2, f6 - 0.0f, f7 - 0.0f);
                        } else if (i9 == 0) {
                            c(canvas2, f6 - 0.0f, f7 - 0.0f);
                        } else {
                            if (i9 == 2) {
                                f = f7;
                                e(canvas2, f6 - 0.0f, f - 0.0f, width, height);
                            }
                            canvas2.drawPath(this.d, paint2);
                        }
                        f = f7;
                        canvas2.drawPath(this.d, paint2);
                    } else {
                        f = f7;
                    }
                    if (i == 2) {
                        d(canvas2, f6 - 0.0f, f - 0.0f);
                    }
                    if (i == 3) {
                        c(canvas2, f6 - 0.0f, f - 0.0f);
                    }
                    if (i == 6) {
                        e(canvas2, f6 - 0.0f, f - 0.0f, width, height);
                    }
                    canvas2.drawPath(this.d, paint2);
                }
                i6++;
                z2 = z2;
                i3 = 4;
            }
            boolean z5 = z2;
            float[] fArr4 = this.a;
            if (fArr4.length > 1) {
                float f8 = fArr4[z5 ? 1 : 0];
                float f9 = fArr4[1];
                Paint paint3 = this.f;
                canvas2.drawCircle(f8, f9, 8.0f, paint3);
                float[] fArr5 = this.a;
                canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
            }
        }

        public final void b(Canvas canvas) {
            float[] fArr = this.a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            float fMin = Math.min(f, f3);
            float fMax = Math.max(f2, f4);
            float fMax2 = Math.max(f, f3);
            float fMax3 = Math.max(f2, f4);
            Paint paint = this.g;
            canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), paint);
        }

        public final void c(Canvas canvas, float f, float f2) {
            float[] fArr = this.a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fMin = Math.min(f3, f5);
            float fMax = Math.max(f4, f6);
            float fMin2 = f - Math.min(f3, f5);
            float fMax2 = Math.max(f4, f6) - f2;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
            int length = str.length();
            Paint paint = this.h;
            Rect rect = this.l;
            paint.getTextBounds(str, 0, length, rect);
            canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f2 - 20.0f, paint);
            float fMin3 = Math.min(f3, f5);
            Paint paint2 = this.g;
            canvas.drawLine(f, f2, fMin3, f2, paint2);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
            paint.getTextBounds(str2, 0, str2.length(), rect);
            canvas.drawText(str2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), paint2);
        }

        public final void d(Canvas canvas, float f, float f2) {
            float[] fArr = this.a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (fHypot * fHypot);
            float f10 = (f7 * f9) + f3;
            float f11 = (f9 * f8) + f4;
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            int length = str.length();
            Paint paint = this.h;
            Rect rect = this.l;
            paint.getTextBounds(str, 0, length, rect);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (rect.width() / 2), -20.0f, paint);
            canvas.drawLine(f, f2, f10, f11, this.g);
        }

        public final void e(Canvas canvas, float f, float f2, int i, int i2) {
            StringBuilder sb = new StringBuilder("");
            MotionLayout motionLayout = MotionLayout.this;
            sb.append(((int) (((double) (((f - (i / 2)) * 100.0f) / (motionLayout.getWidth() - i))) + 0.5d)) / 100.0f);
            String string = sb.toString();
            int length = string.length();
            Paint paint = this.h;
            Rect rect = this.l;
            paint.getTextBounds(string, 0, length, rect);
            canvas.drawText(string, ((f / 2.0f) - (rect.width() / 2)) + 0.0f, f2 - 20.0f, paint);
            float fMin = Math.min(0.0f, 1.0f);
            Paint paint2 = this.g;
            canvas.drawLine(f, f2, fMin, f2, paint2);
            String str = "" + (((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (motionLayout.getHeight() - i2))) + 0.5d)) / 100.0f);
            paint.getTextBounds(str, 0, str.length(), rect);
            canvas.drawText(str, f + 5.0f, 0.0f - ((f2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), paint2);
        }
    }

    public class e {
        public jxa a = new jxa();
        public jxa b = new jxa();
        public androidx.constraintlayout.widget.b c = null;
        public androidx.constraintlayout.widget.b d = null;
        public int e;
        public int f;

        public e() {
        }

        public static void c(jxa jxaVar, jxa jxaVar2) {
            ixa yilVar;
            ArrayList<ixa> arrayList = jxaVar.v0;
            HashMap<ixa, ixa> map = new HashMap<>();
            map.put(jxaVar, jxaVar2);
            jxaVar2.v0.clear();
            jxaVar2.h(jxaVar, map);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                ixa ixaVar = arrayList.get(i2);
                i2++;
                ixa ixaVar2 = ixaVar;
                if (ixaVar2 instanceof vx1) {
                    yilVar = new vx1();
                } else if (ixaVar2 instanceof qal) {
                    yilVar = new qal();
                } else if (ixaVar2 instanceof kyh) {
                    yilVar = new kyh();
                } else if (ixaVar2 instanceof ii10) {
                    yilVar = new ii10();
                } else {
                    yilVar = ixaVar2 instanceof yil ? new yil() : new ixa();
                }
                jxaVar2.W(yilVar);
                map.put(ixaVar2, yilVar);
            }
            int size2 = arrayList.size();
            while (i < size2) {
                ixa ixaVar3 = arrayList.get(i);
                i++;
                ixa ixaVar4 = ixaVar3;
                map.get(ixaVar4).h(ixaVar4, map);
            }
        }

        public static ixa d(jxa jxaVar, View view) {
            if (jxaVar.i0 == view) {
                return jxaVar;
            }
            ArrayList<ixa> arrayList = jxaVar.v0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ixa ixaVar = arrayList.get(i);
                if (ixaVar.i0 == view) {
                    return ixaVar;
                }
            }
            return null;
        }

        public final void a() {
            HashMap<View, n5w> map;
            int i;
            SparseArray sparseArray;
            int[] iArr;
            int i2;
            View view;
            Rect rect;
            Rect rect2;
            Interpolator interpolatorLoadInterpolator;
            MotionLayout motionLayout = MotionLayout.this;
            int childCount = motionLayout.getChildCount();
            HashMap<View, n5w> map2 = motionLayout.P;
            map2.clear();
            SparseArray sparseArray2 = new SparseArray();
            int[] iArr2 = new int[childCount];
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                n5w n5wVar = new n5w(childAt);
                int id = childAt.getId();
                iArr2[i3] = id;
                sparseArray2.put(id, n5wVar);
                map2.put(childAt, n5wVar);
            }
            int i4 = 0;
            while (i4 < childCount) {
                View childAt2 = motionLayout.getChildAt(i4);
                n5w n5wVar2 = map2.get(childAt2);
                if (n5wVar2 == null) {
                    i = childCount;
                    map = map2;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i2 = i4;
                } else {
                    Rect rect3 = n5wVar2.a;
                    l5w l5wVar = n5wVar2.h;
                    u5w u5wVar = n5wVar2.f;
                    map = map2;
                    if (this.c != null) {
                        ixa ixaVarD = d(this.a, childAt2);
                        if (ixaVarD != null) {
                            Rect rectR = motionLayout.R(ixaVarD);
                            iArr = iArr2;
                            androidx.constraintlayout.widget.b bVar = this.c;
                            i2 = i4;
                            int width = motionLayout.getWidth();
                            sparseArray = sparseArray2;
                            int height = motionLayout.getHeight();
                            i = childCount;
                            int i5 = bVar.d;
                            if (i5 != 0) {
                                n5w.h(rectR, rect3, i5, width, height);
                            }
                            u5wVar.c = 0.0f;
                            u5wVar.d = 0.0f;
                            n5wVar2.g(u5wVar);
                            rect = rect3;
                            view = childAt2;
                            u5wVar.d(rectR.left, rectR.top, rectR.width(), rectR.height());
                            androidx.constraintlayout.widget.b.a aVarO = bVar.o(n5wVar2.c);
                            u5wVar.a(aVarO);
                            androidx.constraintlayout.widget.b.c cVar = aVarO.d;
                            n5wVar2.l = cVar.g;
                            l5wVar.d(rectR, bVar, i5, n5wVar2.c);
                            n5wVar2.C = aVarO.f.i;
                            n5wVar2.E = cVar.j;
                            n5wVar2.F = cVar.i;
                            Context context = n5wVar2.b.getContext();
                            int i6 = cVar.l;
                            String str = cVar.k;
                            int i7 = cVar.m;
                            if (i6 == -2) {
                                interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i7);
                            } else if (i6 == -1) {
                                interpolatorLoadInterpolator = new m5w(skf.c(str));
                            } else if (i6 == 0) {
                                interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                            } else if (i6 == 1) {
                                interpolatorLoadInterpolator = new AccelerateInterpolator();
                            } else if (i6 == 2) {
                                interpolatorLoadInterpolator = new DecelerateInterpolator();
                            } else if (i6 != 4) {
                                interpolatorLoadInterpolator = i6 != 5 ? null : new OvershootInterpolator();
                            } else {
                                interpolatorLoadInterpolator = new BounceInterpolator();
                            }
                            n5wVar2.G = interpolatorLoadInterpolator;
                        } else {
                            i = childCount;
                            sparseArray = sparseArray2;
                            iArr = iArr2;
                            i2 = i4;
                            view = childAt2;
                            rect = rect3;
                            if (motionLayout.c0 != 0) {
                                Log.e("MotionLayout", zzc.b() + "no widget for  " + zzc.d(view) + " (" + view.getClass().getName() + ")");
                            }
                        }
                    } else {
                        i = childCount;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i2 = i4;
                        view = childAt2;
                        rect = rect3;
                    }
                    if (this.d != null) {
                        View view2 = view;
                        ixa ixaVarD2 = d(this.b, view2);
                        if (ixaVarD2 != null) {
                            Rect rectR2 = motionLayout.R(ixaVarD2);
                            androidx.constraintlayout.widget.b bVar2 = this.d;
                            int width2 = motionLayout.getWidth();
                            int height2 = motionLayout.getHeight();
                            u5w u5wVar2 = n5wVar2.g;
                            int i8 = bVar2.d;
                            if (i8 != 0) {
                                Rect rect4 = rect;
                                n5w.h(rectR2, rect4, i8, width2, height2);
                                rect2 = rect4;
                            } else {
                                rect2 = rectR2;
                            }
                            u5wVar2.c = 1.0f;
                            u5wVar2.d = 1.0f;
                            n5wVar2.g(u5wVar2);
                            u5wVar2.d(rect2.left, rect2.top, rect2.width(), rect2.height());
                            u5wVar2.a(bVar2.o(n5wVar2.c));
                            n5wVar2.i.d(rect2, bVar2, i8, n5wVar2.c);
                        } else if (motionLayout.c0 != 0) {
                            Log.e("MotionLayout", zzc.b() + "no widget for  " + zzc.d(view2) + " (" + view2.getClass().getName() + ")");
                        }
                    }
                }
                i4 = i2 + 1;
                map2 = map;
                iArr2 = iArr;
                sparseArray2 = sparseArray;
                childCount = i;
            }
            SparseArray sparseArray3 = sparseArray2;
            int[] iArr3 = iArr2;
            int i9 = childCount;
            int i10 = 0;
            while (i10 < i9) {
                SparseArray sparseArray4 = sparseArray3;
                n5w n5wVar3 = (n5w) sparseArray4.get(iArr3[i10]);
                int i11 = n5wVar3.f.z;
                if (i11 != -1) {
                    n5w n5wVar4 = (n5w) sparseArray4.get(i11);
                    n5wVar3.f.f(n5wVar4, n5wVar4.f);
                    n5wVar3.g.f(n5wVar4, n5wVar4.g);
                }
                i10++;
                sparseArray3 = sparseArray4;
            }
        }

        public final void b(int i, int i2) {
            MotionLayout motionLayout = MotionLayout.this;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            if (motionLayout.K == motionLayout.getStartState()) {
                jxa jxaVar = this.b;
                androidx.constraintlayout.widget.b bVar = this.d;
                motionLayout.B(jxaVar, optimizationLevel, (bVar == null || bVar.d == 0) ? i : i2, (bVar == null || bVar.d == 0) ? i2 : i);
                androidx.constraintlayout.widget.b bVar2 = this.c;
                if (bVar2 != null) {
                    jxa jxaVar2 = this.a;
                    int i3 = bVar2.d;
                    int i4 = i3 == 0 ? i : i2;
                    if (i3 == 0) {
                        i = i2;
                    }
                    motionLayout.B(jxaVar2, optimizationLevel, i4, i);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.b bVar3 = this.c;
            if (bVar3 != null) {
                jxa jxaVar3 = this.a;
                int i5 = bVar3.d;
                motionLayout.B(jxaVar3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
            }
            jxa jxaVar4 = this.b;
            androidx.constraintlayout.widget.b bVar4 = this.d;
            int i6 = (bVar4 == null || bVar4.d == 0) ? i : i2;
            if (bVar4 == null || bVar4.d == 0) {
                i = i2;
            }
            motionLayout.B(jxaVar4, optimizationLevel, i6, i);
        }

        public final void e(androidx.constraintlayout.widget.b bVar, androidx.constraintlayout.widget.b bVar2) {
            this.c = bVar;
            this.d = bVar2;
            this.a = new jxa();
            jxa jxaVar = new jxa();
            this.b = jxaVar;
            jxa jxaVar2 = this.a;
            boolean z = MotionLayout.U0;
            MotionLayout motionLayout = MotionLayout.this;
            jxa jxaVar3 = motionLayout.c;
            n92.b bVar3 = jxaVar3.z0;
            jxaVar2.z0 = bVar3;
            jxaVar2.x0.f = bVar3;
            n92.b bVar4 = jxaVar3.z0;
            jxaVar.z0 = bVar4;
            jxaVar.x0.f = bVar4;
            jxaVar2.v0.clear();
            this.b.v0.clear();
            c(jxaVar3, this.a);
            c(jxaVar3, this.b);
            if (motionLayout.T > 0.5d) {
                if (bVar != null) {
                    g(this.a, bVar);
                }
                g(this.b, bVar2);
            } else {
                g(this.b, bVar2);
                if (bVar != null) {
                    g(this.a, bVar);
                }
            }
            this.a.A0 = motionLayout.y();
            jxa jxaVar4 = this.a;
            jxaVar4.w0.c(jxaVar4);
            this.b.A0 = motionLayout.y();
            jxa jxaVar5 = this.b;
            jxaVar5.w0.c(jxaVar5);
            ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
            if (layoutParams != null) {
                int i = layoutParams.width;
                ixa.a aVar = ixa.a.b;
                if (i == -2) {
                    this.a.P(aVar);
                    this.b.P(aVar);
                }
                if (layoutParams.height == -2) {
                    this.a.R(aVar);
                    this.b.R(aVar);
                }
            }
        }

        public final void f() {
            MotionLayout motionLayout = MotionLayout.this;
            int i = motionLayout.M;
            int i2 = motionLayout.N;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            motionLayout.E0 = mode;
            motionLayout.F0 = mode2;
            b(i, i2);
            int i3 = 0;
            if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                b(i, i2);
                motionLayout.A0 = this.a.s();
                motionLayout.B0 = this.a.m();
                motionLayout.C0 = this.b.s();
                int iM = this.b.m();
                motionLayout.D0 = iM;
                motionLayout.z0 = (motionLayout.A0 == motionLayout.C0 && motionLayout.B0 == iM) ? false : true;
            }
            int i4 = motionLayout.A0;
            int i5 = motionLayout.B0;
            int i6 = motionLayout.E0;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                i4 = (int) ((motionLayout.G0 * (motionLayout.C0 - i4)) + i4);
            }
            int i7 = motionLayout.F0;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i5 = (int) ((motionLayout.G0 * (motionLayout.D0 - i5)) + i5);
            }
            jxa jxaVar = this.a;
            motionLayout.A(i, i2, i4, i5, jxaVar.J0 || this.b.J0, jxaVar.K0 || this.b.K0);
            HashMap<View, n5w> map = motionLayout.P;
            int childCount = motionLayout.getChildCount();
            motionLayout.O0.a();
            motionLayout.a0 = true;
            SparseArray sparseArray = new SparseArray();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = motionLayout.getChildAt(i8);
                sparseArray.put(childAt.getId(), map.get(childAt));
            }
            int width = motionLayout.getWidth();
            int height = motionLayout.getHeight();
            androidx.constraintlayout.motion.widget.b.C0051b c0051b = motionLayout.F.c;
            int i9 = c0051b != null ? c0051b.p : -1;
            if (i9 != -1) {
                for (int i10 = 0; i10 < childCount; i10++) {
                    n5w n5wVar = map.get(motionLayout.getChildAt(i10));
                    if (n5wVar != null) {
                        n5wVar.B = i9;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[map.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                n5w n5wVar2 = map.get(motionLayout.getChildAt(i12));
                int i13 = n5wVar2.f.z;
                if (i13 != -1) {
                    sparseBooleanArray.put(i13, true);
                    iArr[i11] = n5wVar2.f.z;
                    i11++;
                }
            }
            if (motionLayout.s0 != null) {
                for (int i14 = 0; i14 < i11; i14++) {
                    n5w n5wVar3 = map.get(motionLayout.findViewById(iArr[i14]));
                    if (n5wVar3 != null) {
                        motionLayout.F.f(n5wVar3);
                    }
                }
                ArrayList<MotionHelper> arrayList = motionLayout.s0;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    MotionHelper motionHelper = arrayList.get(i15);
                    i15++;
                    motionHelper.u(motionLayout, map);
                }
                for (int i16 = 0; i16 < i11; i16++) {
                    n5w n5wVar4 = map.get(motionLayout.findViewById(iArr[i16]));
                    if (n5wVar4 != null) {
                        n5wVar4.i(width, motionLayout.getNanoTime(), height);
                    }
                }
            } else {
                for (int i17 = 0; i17 < i11; i17++) {
                    n5w n5wVar5 = map.get(motionLayout.findViewById(iArr[i17]));
                    if (n5wVar5 != null) {
                        motionLayout.F.f(n5wVar5);
                        n5wVar5.i(width, motionLayout.getNanoTime(), height);
                    }
                }
            }
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt2 = motionLayout.getChildAt(i18);
                n5w n5wVar6 = map.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && n5wVar6 != null) {
                    motionLayout.F.f(n5wVar6);
                    n5wVar6.i(width, motionLayout.getNanoTime(), height);
                }
            }
            androidx.constraintlayout.motion.widget.b.C0051b c0051b2 = motionLayout.F.c;
            float f = c0051b2 != null ? c0051b2.i : 0.0f;
            if (f != 0.0f) {
                boolean z = ((double) f) < 0.0d;
                float fAbs = Math.abs(f);
                float fMax = -3.4028235E38f;
                float fMin = Float.MAX_VALUE;
                float fMax2 = -3.4028235E38f;
                float fMin2 = Float.MAX_VALUE;
                for (int i19 = 0; i19 < childCount; i19++) {
                    n5w n5wVar7 = map.get(motionLayout.getChildAt(i19));
                    if (!Float.isNaN(n5wVar7.l)) {
                        for (int i20 = 0; i20 < childCount; i20++) {
                            n5w n5wVar8 = map.get(motionLayout.getChildAt(i20));
                            if (!Float.isNaN(n5wVar8.l)) {
                                fMin = Math.min(fMin, n5wVar8.l);
                                fMax = Math.max(fMax, n5wVar8.l);
                            }
                        }
                        while (i3 < childCount) {
                            n5w n5wVar9 = map.get(motionLayout.getChildAt(i3));
                            if (!Float.isNaN(n5wVar9.l)) {
                                n5wVar9.n = 1.0f / (1.0f - fAbs);
                                float f2 = n5wVar9.l;
                                if (z) {
                                    n5wVar9.m = fAbs - (((fMax - f2) / (fMax - fMin)) * fAbs);
                                } else {
                                    n5wVar9.m = fAbs - (((f2 - fMin) * fAbs) / (fMax - fMin));
                                }
                            }
                            i3++;
                        }
                        return;
                    }
                    u5w u5wVar = n5wVar7.g;
                    float f3 = u5wVar.e;
                    float f4 = u5wVar.f;
                    float f5 = z ? f4 - f3 : f4 + f3;
                    fMin2 = Math.min(fMin2, f5);
                    fMax2 = Math.max(fMax2, f5);
                }
                while (i3 < childCount) {
                    n5w n5wVar10 = map.get(motionLayout.getChildAt(i3));
                    u5w u5wVar2 = n5wVar10.g;
                    float f6 = u5wVar2.e;
                    float f7 = u5wVar2.f;
                    float f8 = z ? f7 - f6 : f7 + f6;
                    n5wVar10.n = 1.0f / (1.0f - fAbs);
                    n5wVar10.m = fAbs - (((f8 - fMin2) * fAbs) / (fMax2 - fMin2));
                    i3++;
                }
            }
        }

        public final void g(jxa jxaVar, androidx.constraintlayout.widget.b bVar) {
            androidx.constraintlayout.widget.b.a aVar;
            androidx.constraintlayout.widget.b.a aVar2;
            SparseArray<ixa> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams();
            sparseArray.clear();
            sparseArray.put(0, jxaVar);
            MotionLayout motionLayout = MotionLayout.this;
            sparseArray.put(motionLayout.getId(), jxaVar);
            if (bVar != null && bVar.d != 0) {
                jxa jxaVar2 = this.b;
                int optimizationLevel = motionLayout.getOptimizationLevel();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
                boolean z = MotionLayout.U0;
                motionLayout.B(jxaVar2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            ArrayList<ixa> arrayList = jxaVar.v0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                ixa ixaVar = arrayList.get(i);
                i++;
                ixa ixaVar2 = ixaVar;
                ixaVar2.k0 = true;
                sparseArray.put(((View) ixaVar2.i0).getId(), ixaVar2);
            }
            ArrayList<ixa> arrayList2 = jxaVar.v0;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                int i3 = i2 + 1;
                ixa ixaVar3 = arrayList2.get(i2);
                View view = (View) ixaVar3.i0;
                int id = view.getId();
                HashMap<Integer, androidx.constraintlayout.widget.b.a> map = bVar.g;
                if (map.containsKey(Integer.valueOf(id)) && (aVar2 = map.get(Integer.valueOf(id))) != null) {
                    aVar2.a(layoutParams);
                }
                ixaVar3.T(bVar.o(view.getId()).e.c);
                ixaVar3.O(bVar.o(view.getId()).e.d);
                if (view instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) view;
                    int id2 = constraintHelper.getId();
                    HashMap<Integer, androidx.constraintlayout.widget.b.a> map2 = bVar.g;
                    if (map2.containsKey(Integer.valueOf(id2)) && (aVar = map2.get(Integer.valueOf(id2))) != null && (ixaVar3 instanceof yil)) {
                        constraintHelper.o(aVar, (yil) ixaVar3, layoutParams, sparseArray);
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).t();
                    }
                }
                layoutParams.resolveLayoutDirection(motionLayout.getLayoutDirection());
                boolean z2 = MotionLayout.U0;
                motionLayout.u(false, view, ixaVar3, layoutParams, sparseArray);
                if (bVar.o(view.getId()).c.c == 1) {
                    ixaVar3.j0 = view.getVisibility();
                } else {
                    ixaVar3.j0 = bVar.o(view.getId()).c.b;
                }
                i2 = i3;
            }
            ArrayList<ixa> arrayList3 = jxaVar.v0;
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                ixa ixaVar4 = arrayList3.get(i4);
                i4++;
                ixa ixaVar5 = ixaVar4;
                if (ixaVar5 instanceof rfi0) {
                    ConstraintHelper constraintHelper2 = (ConstraintHelper) ixaVar5.i0;
                    yil yilVar = (yil) ixaVar5;
                    constraintHelper2.s(yilVar, sparseArray);
                    rfi0 rfi0Var = (rfi0) yilVar;
                    for (int i5 = 0; i5 < rfi0Var.w0; i5++) {
                        ixa ixaVar6 = rfi0Var.v0[i5];
                        if (ixaVar6 != null) {
                            ixaVar6.H = true;
                        }
                    }
                }
            }
        }
    }

    public static class f {
        public static final f b = new f();
        public VelocityTracker a;
    }

    public class g {
        public float a = Float.NaN;
        public float b = Float.NaN;
        public int c = -1;
        public int d = -1;

        public g() {
        }

        public final void a() {
            sxd0 sxd0Var;
            sxd0.b bVar;
            int i = this.c;
            MotionLayout motionLayout = MotionLayout.this;
            if (i != -1 || this.d != -1) {
                int i2 = this.d;
                if (i == -1) {
                    if (motionLayout.isAttachedToWindow()) {
                        e eVar = motionLayout.O0;
                        HashMap<View, n5w> map = motionLayout.P;
                        androidx.constraintlayout.motion.widget.b bVar2 = motionLayout.F;
                        if (bVar2 != null && (sxd0Var = bVar2.b) != null) {
                            int i3 = motionLayout.K;
                            sxd0.a aVar = sxd0Var.b.get(i2);
                            if (aVar != null) {
                                ArrayList<sxd0.b> arrayList = aVar.b;
                                int i4 = aVar.c;
                                if (i4 != i3) {
                                    int size = arrayList.size();
                                    int i5 = 0;
                                    do {
                                        if (i5 >= size) {
                                            i3 = i4;
                                            break;
                                        } else {
                                            bVar = arrayList.get(i5);
                                            i5++;
                                        }
                                    } while (i3 != bVar.e);
                                }
                            } else {
                                i3 = i2;
                            }
                            if (i3 != -1) {
                                i2 = i3;
                            }
                        }
                        int i6 = motionLayout.K;
                        if (i6 != i2) {
                            if (motionLayout.J == i2) {
                                motionLayout.E(0.0f);
                            } else {
                                float f = 1.0f;
                                if (motionLayout.L == i2) {
                                    motionLayout.E(1.0f);
                                } else {
                                    motionLayout.L = i2;
                                    if (i6 != -1) {
                                        motionLayout.setTransition(i6, i2);
                                        motionLayout.E(1.0f);
                                        motionLayout.T = 0.0f;
                                        motionLayout.T();
                                    } else {
                                        motionLayout.e0 = false;
                                        motionLayout.V = 1.0f;
                                        motionLayout.S = 0.0f;
                                        motionLayout.T = 0.0f;
                                        motionLayout.U = motionLayout.getNanoTime();
                                        motionLayout.Q = motionLayout.getNanoTime();
                                        motionLayout.W = false;
                                        motionLayout.G = null;
                                        motionLayout.R = motionLayout.F.c() / 1000.0f;
                                        motionLayout.J = -1;
                                        motionLayout.F.o(-1, motionLayout.L);
                                        SparseArray sparseArray = new SparseArray();
                                        int childCount = motionLayout.getChildCount();
                                        map.clear();
                                        for (int i7 = 0; i7 < childCount; i7++) {
                                            View childAt = motionLayout.getChildAt(i7);
                                            map.put(childAt, new n5w(childAt));
                                            sparseArray.put(childAt.getId(), map.get(childAt));
                                        }
                                        motionLayout.a0 = true;
                                        eVar.e(null, motionLayout.F.b(i2));
                                        motionLayout.Q();
                                        eVar.a();
                                        int childCount2 = motionLayout.getChildCount();
                                        int i8 = 0;
                                        while (i8 < childCount2) {
                                            View childAt2 = motionLayout.getChildAt(i8);
                                            n5w n5wVar = map.get(childAt2);
                                            if (n5wVar != null) {
                                                u5w u5wVar = n5wVar.f;
                                                u5wVar.c = 0.0f;
                                                u5wVar.d = 0.0f;
                                                u5wVar.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                                                l5w l5wVar = n5wVar.h;
                                                childAt2.getX();
                                                childAt2.getY();
                                                childAt2.getWidth();
                                                childAt2.getHeight();
                                                l5wVar.b(childAt2);
                                            }
                                            i8++;
                                            f = f;
                                        }
                                        float f2 = f;
                                        int width = motionLayout.getWidth();
                                        int height = motionLayout.getHeight();
                                        if (motionLayout.s0 != null) {
                                            for (int i9 = 0; i9 < childCount; i9++) {
                                                n5w n5wVar2 = map.get(motionLayout.getChildAt(i9));
                                                if (n5wVar2 != null) {
                                                    motionLayout.F.f(n5wVar2);
                                                }
                                            }
                                            ArrayList<MotionHelper> arrayList2 = motionLayout.s0;
                                            int size2 = arrayList2.size();
                                            int i10 = 0;
                                            while (i10 < size2) {
                                                MotionHelper motionHelper = arrayList2.get(i10);
                                                i10++;
                                                motionHelper.u(motionLayout, map);
                                            }
                                            for (int i11 = 0; i11 < childCount; i11++) {
                                                n5w n5wVar3 = map.get(motionLayout.getChildAt(i11));
                                                if (n5wVar3 != null) {
                                                    n5wVar3.i(width, motionLayout.getNanoTime(), height);
                                                }
                                            }
                                        } else {
                                            for (int i12 = 0; i12 < childCount; i12++) {
                                                n5w n5wVar4 = map.get(motionLayout.getChildAt(i12));
                                                if (n5wVar4 != null) {
                                                    motionLayout.F.f(n5wVar4);
                                                    n5wVar4.i(width, motionLayout.getNanoTime(), height);
                                                }
                                            }
                                        }
                                        androidx.constraintlayout.motion.widget.b.C0051b c0051b = motionLayout.F.c;
                                        float f3 = c0051b != null ? c0051b.i : 0.0f;
                                        if (f3 != 0.0f) {
                                            float fMin = Float.MAX_VALUE;
                                            float fMax = -3.4028235E38f;
                                            for (int i13 = 0; i13 < childCount; i13++) {
                                                u5w u5wVar2 = map.get(motionLayout.getChildAt(i13)).g;
                                                float f4 = u5wVar2.f + u5wVar2.e;
                                                fMin = Math.min(fMin, f4);
                                                fMax = Math.max(fMax, f4);
                                            }
                                            for (int i14 = 0; i14 < childCount; i14++) {
                                                n5w n5wVar5 = map.get(motionLayout.getChildAt(i14));
                                                u5w u5wVar3 = n5wVar5.g;
                                                float f5 = u5wVar3.e;
                                                float f6 = u5wVar3.f;
                                                n5wVar5.n = f2 / (f2 - f3);
                                                n5wVar5.m = f3 - ((((f5 + f6) - fMin) * f3) / (fMax - fMin));
                                            }
                                        }
                                        motionLayout.S = 0.0f;
                                        motionLayout.T = 0.0f;
                                        motionLayout.a0 = true;
                                        motionLayout.invalidate();
                                    }
                                }
                            }
                        }
                    } else {
                        g gVar = motionLayout.J0;
                        if (gVar == null) {
                            gVar = motionLayout.new g();
                            motionLayout.J0 = gVar;
                        }
                        gVar.d = i2;
                    }
                } else if (i2 == -1) {
                    motionLayout.setState(i, -1, -1);
                } else {
                    motionLayout.setTransition(i, i2);
                }
                motionLayout.setState(i.b);
            }
            boolean zIsNaN = Float.isNaN(this.b);
            float f7 = this.a;
            if (zIsNaN) {
                if (Float.isNaN(f7)) {
                    return;
                }
                motionLayout.setProgress(this.a);
            } else {
                motionLayout.setProgress(f7, this.b);
                this.a = Float.NaN;
                this.b = Float.NaN;
                this.c = -1;
                this.d = -1;
            }
        }
    }

    public interface h {
        void a(MotionLayout motionLayout);

        void b(MotionLayout motionLayout);

        void c(int i, MotionLayout motionLayout);

        void d(MotionLayout motionLayout);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class i {
        public static final i a;
        public static final i b;
        public static final i c;
        public static final i d;
        public static final /* synthetic */ i[] e;

        static {
            i iVar = new i("UNDEFINED", 0);
            a = iVar;
            i iVar2 = new i("SETUP", 1);
            b = iVar2;
            i iVar3 = new i("MOVING", 2);
            c = iVar3;
            i iVar4 = new i("FINISHED", 3);
            d = iVar4;
            e = new i[]{iVar, iVar2, iVar3, iVar4};
        }

        public i() {
            throw null;
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) e.clone();
        }
    }

    public MotionLayout(Context context) {
        super(context);
        this.H = null;
        this.I = 0.0f;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = 0;
        this.N = 0;
        this.O = true;
        this.P = new HashMap<>();
        this.Q = 0L;
        this.R = 1.0f;
        this.S = 0.0f;
        this.T = 0.0f;
        this.V = 0.0f;
        this.a0 = false;
        this.c0 = 0;
        this.e0 = false;
        this.f0 = new h1e0();
        this.g0 = new c();
        this.k0 = false;
        this.p0 = false;
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = 0;
        this.v0 = -1L;
        this.w0 = 0.0f;
        this.x0 = 0;
        this.y0 = 0.0f;
        this.z0 = false;
        this.H0 = new wlp();
        this.I0 = false;
        this.K0 = null;
        new HashMap();
        this.L0 = new Rect();
        this.M0 = false;
        this.N0 = i.a;
        this.O0 = new e();
        this.P0 = false;
        this.Q0 = new RectF();
        this.R0 = null;
        this.S0 = null;
        this.T0 = new ArrayList<>();
        N(null);
    }

    public final void E(float f2) {
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar == null) {
            return;
        }
        float f3 = this.T;
        float f4 = this.S;
        if (f3 != f4 && this.W) {
            this.T = f4;
            f3 = f4;
        }
        if (f3 == f2) {
            return;
        }
        this.e0 = false;
        this.V = f2;
        this.R = bVar.c() / 1000.0f;
        setProgress(this.V);
        this.G = null;
        this.H = this.F.e();
        this.W = false;
        this.Q = getNanoTime();
        this.a0 = true;
        this.S = f3;
        this.T = f3;
        invalidate();
    }

    public final void F(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            n5w n5wVar = this.P.get(getChildAt(i2));
            if (n5wVar != null && "button".equals(zzc.d(n5wVar.b)) && n5wVar.A != null) {
                int i3 = 0;
                while (true) {
                    enp[] enpVarArr = n5wVar.A;
                    if (i3 < enpVarArr.length) {
                        enpVarArr[i3].h(n5wVar.b, z ? -100.0f : 100.0f);
                        i3++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0156  */
    /* JADX WARN: Code duplicated, block: B:105:0x016d  */
    /* JADX WARN: Code duplicated, block: B:107:0x017c  */
    /* JADX WARN: Code duplicated, block: B:108:0x018e  */
    /* JADX WARN: Code duplicated, block: B:128:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:154:0x0218  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069 A[PHI: r14
      0x0069: PHI (r14v7 float) = (r14v2 float), (r14v9 float) binds: [B:35:0x0073, B:29:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e2 A[PHI: r3
      0x00e2: PHI (r3v13 float) = (r3v12 float), (r3v14 float), (r3v14 float) binds: [B:52:0x00b0, B:63:0x00d6, B:65:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x010d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0118  */
    /* JADX WARN: Code duplicated, block: B:84:0x011f A[PHI: r8
      0x011f: PHI (r8v11 float) = (r8v8 float), (r8v12 float) binds: [B:88:0x0129, B:82:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0121  */
    /* JADX WARN: Code duplicated, block: B:87:0x0125  */
    /* JADX WARN: Code duplicated, block: B:95:0x0136  */
    /* JADX WARN: Code duplicated, block: B:98:0x014b  */
    /* JADX WARN: Code duplicated, block: B:99:0x014d  */
    public final void G(boolean z) {
        boolean z2;
        float f2;
        char c2;
        i iVar;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i2;
        float f3;
        int i3;
        int i4;
        int i5;
        View childAt;
        n5w n5wVar;
        float f4;
        boolean z3;
        if (this.U == -1) {
            this.U = getNanoTime();
        }
        float f5 = this.T;
        float f6 = 0.0f;
        if (f5 > 0.0f && f5 < 1.0f) {
            this.K = -1;
        }
        boolean z4 = false;
        if (this.p0 || (this.a0 && (z || this.V != f5))) {
            float fSignum = Math.signum(this.V - f5);
            long nanoTime2 = getNanoTime();
            t5w t5wVar = this.G;
            float f7 = t5wVar == null ? (((nanoTime2 - this.U) * fSignum) * 1.0E-9f) / this.R : 0.0f;
            float f8 = this.T + f7;
            if (this.W) {
                f8 = this.V;
            }
            if (fSignum > 0.0f) {
                f2 = this.V;
                if (f8 < f2) {
                    if (fSignum <= 0.0f) {
                        f2 = this.V;
                        if (f8 <= f2) {
                            f8 = f2;
                            this.a0 = false;
                            z2 = true;
                        }
                    }
                    z2 = false;
                } else {
                    f8 = f2;
                    this.a0 = false;
                    z2 = true;
                }
            } else {
                if (fSignum <= 0.0f) {
                    f2 = this.V;
                    if (f8 <= f2) {
                        f8 = f2;
                        this.a0 = false;
                        z2 = true;
                    }
                }
                z2 = false;
            }
            this.T = f8;
            this.S = f8;
            this.U = nanoTime2;
            if (t5wVar == null || z2) {
                this.I = f7;
            } else {
                if (this.e0) {
                    float interpolation2 = t5wVar.getInterpolation((nanoTime2 - this.Q) * 1.0E-9f);
                    t5w t5wVar2 = this.G;
                    h1e0 h1e0Var = this.f0;
                    if (t5wVar2 == h1e0Var) {
                        c2 = h1e0Var.c.b() ? (char) 2 : (char) 1;
                    } else {
                        c2 = 0;
                    }
                    this.T = interpolation2;
                    this.U = nanoTime2;
                    t5w t5wVar3 = this.G;
                    if (t5wVar3 != null) {
                        float fA = t5wVar3.a();
                        this.I = fA;
                        if (Math.abs(fA) * this.R <= 1.0E-5f && c2 == 2) {
                            this.a0 = false;
                        }
                        if (fA > 0.0f && interpolation2 >= 1.0f) {
                            this.T = 1.0f;
                            this.a0 = false;
                            interpolation2 = 1.0f;
                        }
                        if (fA >= 0.0f || interpolation2 > 0.0f) {
                            f8 = interpolation2;
                        } else {
                            this.T = 0.0f;
                            this.a0 = false;
                            f8 = 0.0f;
                        }
                    } else {
                        f8 = interpolation2;
                    }
                } else {
                    float interpolation3 = t5wVar.getInterpolation(f8);
                    t5w t5wVar4 = this.G;
                    if (t5wVar4 != null) {
                        this.I = t5wVar4.a();
                    } else {
                        this.I = ((t5wVar4.getInterpolation(f8 + f7) - interpolation3) * fSignum) / f7;
                    }
                    f8 = interpolation3;
                }
                if (Math.abs(this.I) > 1.0E-5f) {
                    setState(i.c);
                }
                iVar = i.d;
                if (c2 != 1) {
                    if (fSignum > 0.0f) {
                        f4 = this.V;
                        if (f8 < f4) {
                            f8 = f4;
                            this.a0 = false;
                        } else if (fSignum <= 0.0f) {
                            f4 = this.V;
                            if (f8 <= f4) {
                                f8 = f4;
                                this.a0 = false;
                            }
                        }
                    } else if (fSignum <= 0.0f) {
                        f4 = this.V;
                        if (f8 <= f4) {
                            f8 = f4;
                            this.a0 = false;
                        }
                    }
                    if (f8 < 1.0f || f8 <= 0.0f) {
                        this.a0 = false;
                        setState(iVar);
                    }
                }
                childCount = getChildCount();
                this.p0 = false;
                nanoTime = getNanoTime();
                this.G0 = f8;
                interpolator = this.H;
                if (interpolator == null) {
                    interpolation = f8;
                } else {
                    interpolation = interpolator.getInterpolation(f8);
                }
                interpolator2 = this.H;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.R) + f8);
                    this.I = interpolation4;
                    this.I = interpolation4 - this.H.getInterpolation(f8);
                }
                i2 = 0;
                while (i2 < childCount) {
                    childAt = getChildAt(i2);
                    n5wVar = this.P.get(childAt);
                    if (n5wVar != null) {
                        this.p0 = n5wVar.f(interpolation, nanoTime, this.H0, childAt) | this.p0;
                    }
                    i2++;
                    f6 = f6;
                }
                f3 = f6;
                boolean z5 = (fSignum <= 0.0f && f8 >= this.V) || (fSignum <= f3 && f8 <= this.V);
                if (!this.p0 && !this.a0 && z5) {
                    setState(iVar);
                }
                if (this.z0) {
                    requestLayout();
                }
                this.p0 = (!z5) | this.p0;
                if (f8 <= f3 && (i5 = this.J) != -1 && this.K != i5) {
                    this.K = i5;
                    this.F.b(i5).a(this);
                    setState(iVar);
                    z4 = true;
                }
                if (f8 >= 1.0d) {
                    i3 = this.K;
                    i4 = this.L;
                    if (i3 != i4) {
                        this.K = i4;
                        this.F.b(i4).a(this);
                        setState(iVar);
                        z4 = true;
                    }
                }
                if (!this.p0 || this.a0) {
                    invalidate();
                } else if ((fSignum > 0.0f && f8 == 1.0f) || (fSignum < f3 && f8 == f3)) {
                    setState(iVar);
                }
                if (!this.p0 && !this.a0 && ((fSignum > 0.0f && f8 == 1.0f) || (fSignum < f3 && f8 == f3))) {
                    O();
                }
            }
            c2 = 0;
            if (Math.abs(this.I) > 1.0E-5f) {
                setState(i.c);
            }
            iVar = i.d;
            if (c2 != 1) {
                if (fSignum > 0.0f) {
                    f4 = this.V;
                    if (f8 < f4) {
                        f8 = f4;
                        this.a0 = false;
                    } else if (fSignum <= 0.0f) {
                        f4 = this.V;
                        if (f8 <= f4) {
                            f8 = f4;
                            this.a0 = false;
                        }
                    }
                } else if (fSignum <= 0.0f) {
                    f4 = this.V;
                    if (f8 <= f4) {
                        f8 = f4;
                        this.a0 = false;
                    }
                }
                if (f8 < 1.0f) {
                    this.a0 = false;
                    setState(iVar);
                } else {
                    this.a0 = false;
                    setState(iVar);
                }
            }
            childCount = getChildCount();
            this.p0 = false;
            nanoTime = getNanoTime();
            this.G0 = f8;
            interpolator = this.H;
            if (interpolator == null) {
                interpolation = f8;
            } else {
                interpolation = interpolator.getInterpolation(f8);
            }
            interpolator2 = this.H;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.R) + f8);
                this.I = interpolation5;
                this.I = interpolation5 - this.H.getInterpolation(f8);
            }
            i2 = 0;
            while (i2 < childCount) {
                childAt = getChildAt(i2);
                n5wVar = this.P.get(childAt);
                if (n5wVar != null) {
                    this.p0 = n5wVar.f(interpolation, nanoTime, this.H0, childAt) | this.p0;
                }
                i2++;
                f6 = f6;
            }
            f3 = f6;
            if (fSignum <= 0.0f) {
            }
            if (!this.p0) {
                setState(iVar);
            }
            if (this.z0) {
                requestLayout();
            }
            this.p0 = (!z5) | this.p0;
            if (f8 <= f3) {
                this.K = i5;
                this.F.b(i5).a(this);
                setState(iVar);
                z4 = true;
            }
            if (f8 >= 1.0d) {
                i3 = this.K;
                i4 = this.L;
                if (i3 != i4) {
                    this.K = i4;
                    this.F.b(i4).a(this);
                    setState(iVar);
                    z4 = true;
                }
            }
            if (this.p0) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.p0) {
                O();
            }
        } else {
            f3 = 0.0f;
        }
        float f9 = this.T;
        if (f9 < 1.0f) {
            if (f9 <= f3) {
                int i6 = this.K;
                int i7 = this.J;
                z3 = i6 == i7 ? z4 : true;
                this.K = i7;
            }
            this.P0 |= z4;
            if (z4 && !this.I0) {
                requestLayout();
            }
            this.S = this.T;
        }
        int i8 = this.K;
        int i9 = this.L;
        z3 = i8 == i9 ? z4 : true;
        this.K = i9;
        z4 = z3;
        this.P0 |= z4;
        if (z4) {
            requestLayout();
        }
        this.S = this.T;
    }

    public final void H() {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        if ((this.b0 == null && ((copyOnWriteArrayList = this.t0) == null || copyOnWriteArrayList.isEmpty())) || this.y0 == this.S) {
            return;
        }
        if (this.x0 != -1) {
            h hVar = this.b0;
            if (hVar != null) {
                hVar.a(this);
            }
            CopyOnWriteArrayList<h> copyOnWriteArrayList2 = this.t0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<h> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().a(this);
                }
            }
        }
        this.x0 = -1;
        this.y0 = this.S;
        h hVar2 = this.b0;
        if (hVar2 != null) {
            hVar2.b(this);
        }
        CopyOnWriteArrayList<h> copyOnWriteArrayList3 = this.t0;
        if (copyOnWriteArrayList3 != null) {
            Iterator<h> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().b(this);
            }
        }
    }

    public final void I() {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        if ((this.b0 != null || ((copyOnWriteArrayList = this.t0) != null && !copyOnWriteArrayList.isEmpty())) && this.x0 == -1) {
            this.x0 = this.K;
            ArrayList<Integer> arrayList = this.T0;
            int iIntValue = !arrayList.isEmpty() ? ((Integer) rh6.a(1, arrayList)).intValue() : -1;
            int i2 = this.K;
            if (iIntValue != i2 && i2 != -1) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        P();
        z9i0 z9i0Var = this.K0;
        if (z9i0Var != null) {
            z9i0Var.run();
            this.K0 = null;
        }
    }

    public final void J(int i2, float f2, float f3, float f4, float[] fArr) {
        View viewV = v(i2);
        n5w n5wVar = this.P.get(viewV);
        if (n5wVar != null) {
            n5wVar.d(f2, f3, f4, fArr);
            viewV.getY();
        } else {
            Log.w("MotionLayout", "WARNING could not find view id " + (viewV == null ? hce0.a(i2, "") : viewV.getContext().getResources().getResourceName(i2)));
        }
    }

    public final androidx.constraintlayout.widget.b K(int i2) {
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar == null) {
            return null;
        }
        return bVar.b(i2);
    }

    public final androidx.constraintlayout.motion.widget.b.C0051b L(int i2) {
        ArrayList<androidx.constraintlayout.motion.widget.b.C0051b> arrayList = this.F.d;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            androidx.constraintlayout.motion.widget.b.C0051b c0051b = arrayList.get(i3);
            i3++;
            androidx.constraintlayout.motion.widget.b.C0051b c0051b2 = c0051b;
            if (c0051b2.a == i2) {
                return c0051b2;
            }
        }
        return null;
    }

    public final boolean M(float f2, float f3, View view, MotionEvent motionEvent) {
        boolean z;
        boolean zOnTouchEvent;
        if (!(view instanceof ViewGroup)) {
            z = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (M((childAt.getLeft() + f2) - view.getScrollX(), (childAt.getTop() + f3) - view.getScrollY(), childAt, motionEvent)) {
                z = true;
                break;
            }
            childCount--;
        }
        if (!z) {
            float right = (view.getRight() + f2) - view.getLeft();
            float bottom = (view.getBottom() + f3) - view.getTop();
            RectF rectF = this.Q0;
            rectF.set(f2, f3, right, bottom);
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f4 = -f2;
                float f5 = -f3;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f4, f5);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f4, -f5);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f4, f5);
                    Matrix matrix2 = this.S0;
                    if (matrix2 == null) {
                        matrix2 = new Matrix();
                        this.S0 = matrix2;
                    }
                    matrix.invert(matrix2);
                    motionEventObtain.transform(this.S0);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z;
    }

    public final void O() {
        androidx.constraintlayout.motion.widget.b.C0051b c0051b;
        androidx.constraintlayout.motion.widget.c cVar;
        View viewFindViewById;
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar == null) {
            return;
        }
        if (bVar.a(this.K, this)) {
            requestLayout();
            return;
        }
        int i2 = this.K;
        if (i2 != -1) {
            androidx.constraintlayout.motion.widget.b bVar2 = this.F;
            ArrayList<androidx.constraintlayout.motion.widget.b.C0051b> arrayList = bVar2.f;
            ArrayList<androidx.constraintlayout.motion.widget.b.C0051b> arrayList2 = bVar2.d;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                androidx.constraintlayout.motion.widget.b.C0051b c0051b2 = arrayList2.get(i3);
                i3++;
                androidx.constraintlayout.motion.widget.b.C0051b c0051b3 = c0051b2;
                if (c0051b3.m.size() > 0) {
                    ArrayList<androidx.constraintlayout.motion.widget.b.C0051b.a> arrayList3 = c0051b3.m;
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        androidx.constraintlayout.motion.widget.b.C0051b.a aVar = arrayList3.get(i4);
                        i4++;
                        aVar.b(this);
                    }
                }
            }
            int size3 = arrayList.size();
            int i5 = 0;
            while (i5 < size3) {
                androidx.constraintlayout.motion.widget.b.C0051b c0051b4 = arrayList.get(i5);
                i5++;
                androidx.constraintlayout.motion.widget.b.C0051b c0051b5 = c0051b4;
                if (c0051b5.m.size() > 0) {
                    ArrayList<androidx.constraintlayout.motion.widget.b.C0051b.a> arrayList4 = c0051b5.m;
                    int size4 = arrayList4.size();
                    int i6 = 0;
                    while (i6 < size4) {
                        androidx.constraintlayout.motion.widget.b.C0051b.a aVar2 = arrayList4.get(i6);
                        i6++;
                        aVar2.b(this);
                    }
                }
            }
            int size5 = arrayList2.size();
            int i7 = 0;
            while (i7 < size5) {
                androidx.constraintlayout.motion.widget.b.C0051b c0051b6 = arrayList2.get(i7);
                i7++;
                androidx.constraintlayout.motion.widget.b.C0051b c0051b7 = c0051b6;
                if (c0051b7.m.size() > 0) {
                    ArrayList<androidx.constraintlayout.motion.widget.b.C0051b.a> arrayList5 = c0051b7.m;
                    int size6 = arrayList5.size();
                    int i8 = 0;
                    while (i8 < size6) {
                        androidx.constraintlayout.motion.widget.b.C0051b.a aVar3 = arrayList5.get(i8);
                        i8++;
                        aVar3.a(this, i2, c0051b7);
                    }
                }
            }
            int size7 = arrayList.size();
            int i9 = 0;
            while (i9 < size7) {
                androidx.constraintlayout.motion.widget.b.C0051b c0051b8 = arrayList.get(i9);
                i9++;
                androidx.constraintlayout.motion.widget.b.C0051b c0051b9 = c0051b8;
                if (c0051b9.m.size() > 0) {
                    ArrayList<androidx.constraintlayout.motion.widget.b.C0051b.a> arrayList6 = c0051b9.m;
                    int size8 = arrayList6.size();
                    int i10 = 0;
                    while (i10 < size8) {
                        androidx.constraintlayout.motion.widget.b.C0051b.a aVar4 = arrayList6.get(i10);
                        i10++;
                        aVar4.a(this, i2, c0051b9);
                    }
                }
            }
        }
        if (!this.F.p() || (c0051b = this.F.c) == null || (cVar = c0051b.l) == null) {
            return;
        }
        MotionLayout motionLayout = cVar.r;
        int i11 = cVar.d;
        if (i11 != -1) {
            viewFindViewById = motionLayout.findViewById(i11);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + zzc.c(motionLayout.getContext(), cVar.d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new x3g0());
            nestedScrollView.setOnScrollChangeListener(new y3g0());
        }
    }

    public final void P() {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        if (this.b0 == null && ((copyOnWriteArrayList = this.t0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList<Integer> arrayList = this.T0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Integer num = arrayList.get(i2);
            i2++;
            Integer num2 = num;
            h hVar = this.b0;
            if (hVar != null) {
                hVar.c(num2.intValue(), this);
            }
            CopyOnWriteArrayList<h> copyOnWriteArrayList2 = this.t0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<h> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().c(num2.intValue(), this);
                }
            }
        }
        arrayList.clear();
    }

    public final void Q() {
        this.O0.f();
        invalidate();
    }

    public final Rect R(ixa ixaVar) {
        int iU = ixaVar.u();
        Rect rect = this.L0;
        rect.top = iU;
        rect.left = ixaVar.t();
        rect.right = ixaVar.s() + rect.left;
        rect.bottom = ixaVar.m() + rect.top;
        return rect;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:63:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x010c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0116  */
    /* JADX WARN: Code duplicated, block: B:78:0x0120  */
    /* JADX WARN: Code duplicated, block: B:83:0x012a  */
    /* JADX WARN: Code duplicated, block: B:86:0x012f  */
    public final void S(int i2, float f2, float f3) {
        float f4;
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.b.C0051b c0051b;
        int i3;
        float f5;
        h1e0 h1e0Var;
        float f6;
        float f7;
        float f8;
        float f9;
        int i4;
        gkd0 gkd0Var;
        androidx.constraintlayout.motion.widget.c cVar;
        androidx.constraintlayout.motion.widget.c cVar2;
        androidx.constraintlayout.motion.widget.c cVar3;
        androidx.constraintlayout.motion.widget.c cVar4;
        androidx.constraintlayout.motion.widget.c cVar5;
        androidx.constraintlayout.motion.widget.b.C0051b c0051b2;
        androidx.constraintlayout.motion.widget.c cVar6;
        androidx.constraintlayout.motion.widget.c cVar7;
        androidx.constraintlayout.motion.widget.b.C0051b c0051b3;
        float f10;
        androidx.constraintlayout.motion.widget.c cVar8;
        if (this.F == null || this.T == f2) {
            return;
        }
        this.e0 = true;
        this.Q = getNanoTime();
        float fC = this.F.c() / 1000.0f;
        this.R = fC;
        this.V = f2;
        this.a0 = true;
        h1e0 h1e0Var2 = this.f0;
        float f11 = 0.0f;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (i2 != 1 || i2 == 7) {
                f4 = 0.0f;
            } else {
                f4 = (i2 == 2 || i2 == 6) ? 1.0f : f2;
            }
            bVar = this.F;
            c0051b = bVar.c;
            if (c0051b != null || (cVar7 = c0051b.l) == null) {
                i3 = 0;
            } else {
                i3 = cVar7.D;
            }
            f5 = this.T;
            h1e0Var = this.f0;
            if (i3 == 0) {
                float fG = bVar.g();
                c0051b2 = this.F.c;
                if (c0051b2 != null && (cVar6 = c0051b2.l) != null) {
                    f11 = cVar6.s;
                }
                h1e0Var.b(f5, f4, f3, fC, fG, f11);
            } else {
                if (c0051b != null || (cVar5 = c0051b.l) == null) {
                    f6 = 0.0f;
                } else {
                    f6 = cVar5.z;
                }
                if (c0051b != null || (cVar4 = c0051b.l) == null) {
                    f7 = 0.0f;
                } else {
                    f7 = cVar4.A;
                }
                if (c0051b != null || (cVar3 = c0051b.l) == null) {
                    f8 = 0.0f;
                } else {
                    f8 = cVar3.y;
                }
                if (c0051b != null || (cVar2 = c0051b.l) == null) {
                    f9 = 0.0f;
                } else {
                    f9 = cVar2.B;
                }
                if (c0051b != null || (cVar = c0051b.l) == null) {
                    i4 = 0;
                } else {
                    i4 = cVar.C;
                }
                gkd0Var = h1e0Var.b;
                if (gkd0Var == null) {
                    gkd0Var = new gkd0();
                    gkd0Var.a = 0.5d;
                    gkd0Var.i = 0;
                    h1e0Var.b = gkd0Var;
                }
                h1e0Var.c = gkd0Var;
                gkd0Var.c = f4;
                gkd0Var.a = f8;
                gkd0Var.e = f5;
                gkd0Var.b = f7;
                gkd0Var.g = f6;
                gkd0Var.h = f9;
                gkd0Var.i = i4;
                gkd0Var.d = 0.0f;
            }
            int i5 = this.K;
            this.V = f4;
            this.K = i5;
            this.G = h1e0Var2;
        } else {
            c cVar9 = this.g0;
            if (i2 == 4) {
                float f12 = this.T;
                float fG2 = this.F.g();
                cVar9.a = f3;
                cVar9.b = f12;
                cVar9.c = fG2;
                this.G = cVar9;
            } else if (i2 == 5) {
                float f13 = this.T;
                float fG3 = this.F.g();
                if (f3 > 0.0f) {
                    float f14 = f3 / fG3;
                    if (((f3 * f14) - (((fG3 * f14) * f14) / 2.0f)) + f13 > 1.0f) {
                        float f15 = this.T;
                        float fG4 = this.F.g();
                        cVar9.a = f3;
                        cVar9.b = f15;
                        cVar9.c = fG4;
                        this.G = cVar9;
                    } else {
                        float f16 = this.T;
                        float f17 = this.R;
                        float fG5 = this.F.g();
                        c0051b3 = this.F.c;
                        if (c0051b3 != null || (cVar8 = c0051b3.l) == null) {
                            f10 = 0.0f;
                        } else {
                            f10 = cVar8.s;
                        }
                        this.f0.b(f16, f2, f3, f17, fG5, f10);
                        this.I = 0.0f;
                        int i6 = this.K;
                        this.V = f2;
                        this.K = i6;
                        this.G = h1e0Var2;
                    }
                } else {
                    float f18 = (-f3) / fG3;
                    if ((((fG3 * f18) * f18) / 2.0f) + (f3 * f18) + f13 < 0.0f) {
                        float f19 = this.T;
                        float fG6 = this.F.g();
                        cVar9.a = f3;
                        cVar9.b = f19;
                        cVar9.c = fG6;
                        this.G = cVar9;
                    } else {
                        float f110 = this.T;
                        float f111 = this.R;
                        float fG7 = this.F.g();
                        c0051b3 = this.F.c;
                        if (c0051b3 != null) {
                            f10 = 0.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        this.f0.b(f110, f2, f3, f111, fG7, f10);
                        this.I = 0.0f;
                        int i7 = this.K;
                        this.V = f2;
                        this.K = i7;
                        this.G = h1e0Var2;
                    }
                }
            } else if (i2 == 6 || i2 == 7) {
                if (i2 != 1) {
                    f4 = 0.0f;
                } else {
                    f4 = 0.0f;
                }
                bVar = this.F;
                c0051b = bVar.c;
                if (c0051b != null) {
                    i3 = 0;
                } else {
                    i3 = 0;
                }
                f5 = this.T;
                h1e0Var = this.f0;
                if (i3 == 0) {
                    float fG8 = bVar.g();
                    c0051b2 = this.F.c;
                    if (c0051b2 != null) {
                        f11 = cVar6.s;
                    }
                    h1e0Var.b(f5, f4, f3, fC, fG8, f11);
                } else {
                    if (c0051b != null) {
                        f6 = 0.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    if (c0051b != null) {
                        f7 = 0.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    if (c0051b != null) {
                        f8 = 0.0f;
                    } else {
                        f8 = 0.0f;
                    }
                    if (c0051b != null) {
                        f9 = 0.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    if (c0051b != null) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                    }
                    gkd0Var = h1e0Var.b;
                    if (gkd0Var == null) {
                        gkd0Var = new gkd0();
                        gkd0Var.a = 0.5d;
                        gkd0Var.i = 0;
                        h1e0Var.b = gkd0Var;
                    }
                    h1e0Var.c = gkd0Var;
                    gkd0Var.c = f4;
                    gkd0Var.a = f8;
                    gkd0Var.e = f5;
                    gkd0Var.b = f7;
                    gkd0Var.g = f6;
                    gkd0Var.h = f9;
                    gkd0Var.i = i4;
                    gkd0Var.d = 0.0f;
                }
                int i8 = this.K;
                this.V = f4;
                this.K = i8;
                this.G = h1e0Var2;
            }
        }
        this.W = false;
        this.Q = getNanoTime();
        invalidate();
    }

    public final void T() {
        E(1.0f);
        this.K0 = null;
    }

    public final void U() {
        E(0.0f);
    }

    public final void V(int i2, androidx.constraintlayout.widget.b bVar) {
        androidx.constraintlayout.motion.widget.b bVar2 = this.F;
        if (bVar2 != null) {
            bVar2.g.put(i2, bVar);
        }
        this.O0.e(this.F.b(this.J), this.F.b(this.L));
        Q();
        if (this.K == i2) {
            bVar.b(this);
        }
    }

    public final void W(int i2, View... viewArr) {
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar == null) {
            Log.e("MotionLayout", " no motionScene");
            return;
        }
        androidx.constraintlayout.motion.widget.e eVar = bVar.q;
        eVar.getClass();
        MotionLayout motionLayout = eVar.a;
        ArrayList arrayList = new ArrayList();
        ArrayList<androidx.constraintlayout.motion.widget.d> arrayList2 = eVar.b;
        int size = arrayList2.size();
        androidx.constraintlayout.motion.widget.d dVar = null;
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            androidx.constraintlayout.motion.widget.d dVar2 = arrayList2.get(i3);
            if (dVar2.a == i2) {
                for (View view : viewArr) {
                    if (dVar2.b(view)) {
                        arrayList.add(view);
                    }
                }
                if (arrayList.isEmpty()) {
                    dVar = dVar2;
                } else {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    int currentState = motionLayout.getCurrentState();
                    if (dVar2.e != 2) {
                        if (currentState == -1) {
                            Log.w("ViewTransitionController", "No support for ViewTransition within transition yet. Currently: ".concat(motionLayout.toString()));
                        } else {
                            androidx.constraintlayout.widget.b bVarK = motionLayout.K(currentState);
                            if (bVarK != null) {
                                dVar = dVar2;
                                dVar.a(eVar, motionLayout, currentState, bVarK, viewArr2);
                            }
                        }
                        dVar = dVar2;
                    } else {
                        dVar = dVar2;
                        dVar.a(eVar, motionLayout, currentState, null, viewArr2);
                    }
                    arrayList.clear();
                }
            }
            i3 = i4;
        }
        if (dVar == null) {
            Log.e("ViewTransitionController", " Could not find ViewTransition");
        }
    }

    /* JADX WARN: Code duplicated, block: B:190:0x0542  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i2;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        Paint paint5;
        float fMin;
        double dA;
        Paint paint6;
        androidx.constraintlayout.motion.widget.e eVar;
        Canvas canvas2 = canvas;
        ArrayList<MotionHelper> arrayList = this.s0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                MotionHelper motionHelper = arrayList.get(i3);
                i3++;
                motionHelper.getClass();
            }
        }
        G(false);
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar != null && (eVar = bVar.q) != null) {
            ArrayList<androidx.constraintlayout.motion.widget.d.a> arrayList2 = eVar.e;
            ArrayList<androidx.constraintlayout.motion.widget.d.a> arrayList3 = eVar.d;
            if (arrayList3 != null) {
                int size2 = arrayList3.size();
                int i4 = 0;
                while (i4 < size2) {
                    androidx.constraintlayout.motion.widget.d.a aVar = arrayList3.get(i4);
                    i4++;
                    aVar.a();
                }
                eVar.d.removeAll(arrayList2);
                arrayList2.clear();
                if (eVar.d.isEmpty()) {
                    eVar.d = null;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.F == null) {
            return;
        }
        if ((this.c0 & 1) == 1 && !isInEditMode()) {
            this.u0++;
            long nanoTime = getNanoTime();
            long j = this.v0;
            if (j != -1) {
                long j2 = nanoTime - j;
                if (j2 > 200000000) {
                    this.w0 = ((int) ((this.u0 / (j2 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.u0 = 0;
                    this.v0 = nanoTime;
                }
            } else {
                this.v0 = nanoTime;
            }
            Paint paint7 = new Paint();
            paint7.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.w0);
            sb.append(" fps ");
            int i5 = this.J;
            StringBuilder sb2 = new StringBuilder(uf80.a(sb, i5 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i5), " -> "));
            int i6 = this.L;
            sb2.append(i6 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i6));
            sb2.append(" (progress: ");
            sb2.append(progress);
            sb2.append(" ) state=");
            int i7 = this.K;
            sb2.append(i7 == -1 ? "undefined" : i7 != -1 ? getContext().getResources().getResourceEntryName(i7) : "UNDEFINED");
            String string = sb2.toString();
            paint7.setColor(-16777216);
            canvas2.drawText(string, 11.0f, getHeight() - 29, paint7);
            paint7.setColor(-7864184);
            canvas2.drawText(string, 10.0f, getHeight() - 30, paint7);
        }
        if (this.c0 <= 1) {
            i2 = 0;
        } else {
            d dVar = this.d0;
            if (dVar == null) {
                dVar = new d();
                this.d0 = dVar;
            }
            int iC = this.F.c();
            int i8 = this.c0;
            Paint paint8 = dVar.g;
            Paint paint9 = dVar.f;
            Paint paint10 = dVar.i;
            Paint paint11 = dVar.e;
            MotionLayout motionLayout = MotionLayout.this;
            HashMap<View, n5w> map = this.P;
            if (map == null || map.size() == 0) {
                i2 = 0;
            } else {
                canvas2.save();
                i2 = 0;
                if (!motionLayout.isInEditMode() && (i8 & 1) == 2) {
                    String str = motionLayout.getContext().getResources().getResourceName(motionLayout.L) + ":" + motionLayout.getProgress();
                    canvas2.drawText(str, 10.0f, motionLayout.getHeight() - 30, dVar.h);
                    canvas2.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint11);
                }
                Iterator<n5w> it = map.values().iterator();
                while (it.hasNext()) {
                    n5w next = it.next();
                    u5w u5wVar = next.f;
                    u5w u5wVar2 = next.f;
                    ArrayList<u5w> arrayList4 = next.u;
                    int iMax = u5wVar.b;
                    int size3 = arrayList4.size();
                    it = it;
                    for (int i9 = 0; i9 < size3; i9++) {
                        iMax = Math.max(iMax, arrayList4.get(i9).b);
                    }
                    int iMax2 = Math.max(iMax, next.g.b);
                    if (i8 > 0 && iMax2 == 0) {
                        iMax2 = 1;
                    }
                    if (iMax2 != 0) {
                        float[] fArr = dVar.c;
                        int[] iArr = dVar.b;
                        double[] dArrG = next.j[0].g();
                        int i10 = iC;
                        int i11 = i8;
                        int i12 = 0;
                        int i13 = 0;
                        for (int size4 = arrayList4.size(); i12 < size4; size4 = size4) {
                            u5w u5wVar3 = arrayList4.get(i12);
                            i12++;
                            iArr[i13] = u5wVar3.D;
                            i13++;
                        }
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < dArrG.length) {
                            float[] fArr2 = fArr;
                            double[] dArr = dArrG;
                            next.j[0].c(dArrG[i14], next.p);
                            u5wVar2.c(dArr[i14], next.o, next.p, fArr2, i15);
                            i15 += 2;
                            i14++;
                            fArr = fArr2;
                            dArrG = dArr;
                        }
                        dVar.k = i15 / 2;
                        if (iMax2 >= 1) {
                            int i16 = i10 / 16;
                            float[] fArr3 = dVar.a;
                            if (fArr3 == null || fArr3.length != i16 * 2) {
                                dVar.a = new float[i16 * 2];
                                dVar.d = new Path();
                            }
                            canvas2.translate(1.0f, 1.0f);
                            paint11.setColor(1996488704);
                            paint10.setColor(1996488704);
                            paint9.setColor(1996488704);
                            paint8.setColor(1996488704);
                            float[] fArr4 = dVar.a;
                            float f2 = 1.0f / (i16 - 1);
                            HashMap<String, q9i0> map2 = next.y;
                            float f3 = 1.0f;
                            q9i0 q9i0Var = map2 == null ? null : map2.get("translationX");
                            HashMap<String, q9i0> map3 = next.y;
                            q9i0 q9i0Var2 = map3 == null ? null : map3.get("translationY");
                            HashMap<String, z8i0> map4 = next.z;
                            z8i0 z8i0Var = map4 == null ? null : map4.get("translationX");
                            HashMap<String, z8i0> map5 = next.z;
                            z8i0 z8i0Var2 = map5 == null ? null : map5.get("translationY");
                            int i17 = 0;
                            while (true) {
                                float f4 = Float.NaN;
                                float f5 = 0.0f;
                                if (i17 >= i16) {
                                    break;
                                }
                                int i18 = i16;
                                float f6 = i17 * f2;
                                float f7 = next.n;
                                if (f7 != f3) {
                                    float f8 = next.m;
                                    fMin = f6 < f8 ? 0.0f : f6;
                                    paint4 = paint8;
                                    paint5 = paint9;
                                    if (fMin > f8 && fMin < 1.0d) {
                                        fMin = Math.min((fMin - f8) * f7, f3);
                                    }
                                } else {
                                    paint4 = paint8;
                                    paint5 = paint9;
                                    fMin = f6;
                                }
                                double d2 = fMin;
                                skf skfVar = u5wVar.a;
                                int size5 = arrayList4.size();
                                int i19 = i17;
                                int i20 = 0;
                                while (i20 < size5) {
                                    u5w u5wVar4 = arrayList4.get(i20);
                                    i20++;
                                    ArrayList<u5w> arrayList5 = arrayList4;
                                    u5w u5wVar5 = u5wVar4;
                                    int i21 = size5;
                                    skf skfVar2 = u5wVar5.a;
                                    if (skfVar2 != null) {
                                        float f9 = u5wVar5.c;
                                        if (f9 < fMin) {
                                            f5 = f9;
                                            skfVar = skfVar2;
                                        } else if (Float.isNaN(f4)) {
                                            f4 = u5wVar5.c;
                                        }
                                    }
                                    size5 = i21;
                                    arrayList4 = arrayList5;
                                }
                                ArrayList<u5w> arrayList6 = arrayList4;
                                if (skfVar != null) {
                                    if (Float.isNaN(f4)) {
                                        f4 = 1.0f;
                                    }
                                    float f10 = f4 - f5;
                                    dA = (((float) skfVar.a((fMin - f5) / f10)) * f10) + f5;
                                } else {
                                    dA = d2;
                                }
                                next.j[0].c(dA, next.p);
                                aw0 aw0Var = next.k;
                                if (aw0Var != null) {
                                    double[] dArr2 = next.p;
                                    paint6 = paint10;
                                    if (dArr2.length > 0) {
                                        aw0Var.c(dA, dArr2);
                                    }
                                } else {
                                    paint6 = paint10;
                                }
                                int i22 = i19 * 2;
                                u5wVar2.c(dA, next.o, next.p, fArr4, i22);
                                if (z8i0Var != null) {
                                    fArr4[i22] = z8i0Var.a(fMin) + fArr4[i22];
                                } else if (q9i0Var != null) {
                                    fArr4[i22] = q9i0Var.a(fMin) + fArr4[i22];
                                }
                                if (z8i0Var2 != null) {
                                    int i23 = i22 + 1;
                                    fArr4[i23] = z8i0Var2.a(fMin) + fArr4[i23];
                                } else if (q9i0Var2 != null) {
                                    int i24 = i22 + 1;
                                    fArr4[i24] = q9i0Var2.a(fMin) + fArr4[i24];
                                }
                                i17 = i19 + 1;
                                i16 = i18;
                                paint8 = paint4;
                                paint9 = paint5;
                                arrayList4 = arrayList6;
                                paint10 = paint6;
                                f3 = 1.0f;
                            }
                            dVar.a(canvas2, iMax2, dVar.k, next);
                            paint11.setColor(-21965);
                            paint2 = paint9;
                            paint2.setColor(-2067046);
                            paint3 = paint10;
                            paint3.setColor(-2067046);
                            paint = paint8;
                            paint.setColor(-13391360);
                            canvas2.translate(-1.0f, -1.0f);
                            dVar.a(canvas2, iMax2, dVar.k, next);
                            char c2 = 5;
                            if (iMax2 == 5) {
                                float[] fArr5 = dVar.j;
                                dVar.d.reset();
                                int i25 = 0;
                                while (i25 <= 50) {
                                    char c3 = c2;
                                    next.j[0].c(next.b(i25 / 50.0f, null), next.p);
                                    int[] iArr2 = next.o;
                                    double[] dArr3 = next.p;
                                    float f11 = u5wVar.e;
                                    float fCos = u5wVar.f;
                                    float f12 = u5wVar.i;
                                    float f13 = u5wVar.v;
                                    int i26 = 0;
                                    while (true) {
                                        int[] iArr3 = iArr2;
                                        if (i26 >= iArr2.length) {
                                            break;
                                        }
                                        float f14 = (float) dArr3[i26];
                                        int i27 = iArr3[i26];
                                        if (i27 == 1) {
                                            f11 = f14;
                                        } else if (i27 == 2) {
                                            fCos = f14;
                                        } else if (i27 == 3) {
                                            f12 = f14;
                                        } else if (i27 == 4) {
                                            f13 = f14;
                                        }
                                        i26++;
                                        iArr2 = iArr3;
                                    }
                                    if (u5wVar.B != null) {
                                        double d3 = f11;
                                        double d4 = fCos;
                                        float fSin = (float) (((Math.sin(d4) * d3) + 0.0d) - ((double) (f12 / 2.0f)));
                                        fCos = (float) ((0.0d - (Math.cos(d4) * d3)) - ((double) (f13 / 2.0f)));
                                        f11 = fSin;
                                    }
                                    float f15 = f12 + f11;
                                    float f16 = f13 + fCos;
                                    Float.isNaN(Float.NaN);
                                    Float.isNaN(Float.NaN);
                                    float f17 = f11 + 0.0f;
                                    float f18 = fCos + 0.0f;
                                    float f19 = f15 + 0.0f;
                                    float f20 = f16 + 0.0f;
                                    fArr5[0] = f17;
                                    fArr5[1] = f18;
                                    fArr5[2] = f19;
                                    fArr5[3] = f18;
                                    fArr5[4] = f19;
                                    fArr5[c3] = f20;
                                    fArr5[6] = f17;
                                    fArr5[7] = f20;
                                    dVar.d.moveTo(f17, f18);
                                    dVar.d.lineTo(fArr5[2], fArr5[3]);
                                    dVar.d.lineTo(fArr5[4], fArr5[c3]);
                                    dVar.d.lineTo(fArr5[6], fArr5[7]);
                                    dVar.d.close();
                                    i25++;
                                    c2 = c3;
                                }
                                paint11.setColor(1140850688);
                                canvas2 = canvas;
                                canvas2.translate(2.0f, 2.0f);
                                canvas2.drawPath(dVar.d, paint11);
                                canvas2.translate(-2.0f, -2.0f);
                                paint11.setColor(-65536);
                                canvas2.drawPath(dVar.d, paint11);
                            }
                            paint9 = paint2;
                            paint8 = paint;
                            paint10 = paint3;
                            iC = i10;
                            i8 = i11;
                        } else {
                            paint = paint8;
                            paint2 = paint9;
                            paint3 = paint10;
                        }
                        paint9 = paint2;
                        paint8 = paint;
                        paint10 = paint3;
                        iC = i10;
                        i8 = i11;
                    }
                }
                canvas2.restore();
            }
        }
        ArrayList<MotionHelper> arrayList7 = this.s0;
        if (arrayList7 != null) {
            int size6 = arrayList7.size();
            int i28 = i2;
            while (i28 < size6) {
                MotionHelper motionHelper2 = arrayList7.get(i28);
                i28++;
                motionHelper2.getClass();
            }
        }
    }

    public int[] getConstraintSetIds() {
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar == null) {
            return null;
        }
        SparseArray<androidx.constraintlayout.widget.b> sparseArray = bVar.g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = sparseArray.keyAt(i2);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.K;
    }

    public ArrayList<androidx.constraintlayout.motion.widget.b.C0051b> getDefinedTransitions() {
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar == null) {
            return null;
        }
        return bVar.d;
    }

    public vae getDesignTool() {
        vae vaeVar = this.h0;
        if (vaeVar != null) {
            return vaeVar;
        }
        vae vaeVar2 = new vae();
        this.h0 = vaeVar2;
        return vaeVar2;
    }

    public int getEndState() {
        return this.L;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.T;
    }

    public androidx.constraintlayout.motion.widget.b getScene() {
        return this.F;
    }

    public int getStartState() {
        return this.J;
    }

    public float getTargetPosition() {
        return this.V;
    }

    public Bundle getTransitionState() {
        g gVar = this.J0;
        if (gVar == null) {
            gVar = new g();
            this.J0 = gVar;
        }
        MotionLayout motionLayout = MotionLayout.this;
        gVar.d = motionLayout.L;
        gVar.c = motionLayout.J;
        gVar.b = motionLayout.getVelocity();
        gVar.a = motionLayout.getProgress();
        g gVar2 = this.J0;
        gVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", gVar2.a);
        bundle.putFloat("motion.velocity", gVar2.b);
        bundle.putInt("motion.StartState", gVar2.c);
        bundle.putInt("motion.EndState", gVar2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar != null) {
            this.R = bVar.c() / 1000.0f;
        }
        return (long) (this.R * 1000.0f);
    }

    public float getVelocity() {
        return this.I;
    }

    @Override // defpackage.rlx
    public final void h(int i2, View view) {
        androidx.constraintlayout.motion.widget.c cVar;
        int i3;
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar != null) {
            float f2 = this.o0;
            if (f2 == 0.0f) {
                return;
            }
            float f3 = this.l0 / f2;
            float f4 = this.m0 / f2;
            androidx.constraintlayout.motion.widget.b.C0051b c0051b = bVar.c;
            if (c0051b == null || (cVar = c0051b.l) == null) {
                return;
            }
            float[] fArr = cVar.n;
            cVar.m = false;
            MotionLayout motionLayout = cVar.r;
            float progress = motionLayout.getProgress();
            cVar.r.J(cVar.d, progress, cVar.h, cVar.g, fArr);
            float f5 = cVar.k;
            float f6 = f5 != 0.0f ? (f3 * f5) / fArr[0] : (f4 * cVar.l) / fArr[1];
            if (!Float.isNaN(f6)) {
                progress += f6 / 3.0f;
            }
            if (progress == 0.0f || progress == 1.0f || (i3 = cVar.c) == 3) {
                return;
            }
            motionLayout.S(i3, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f6);
        }
    }

    @Override // defpackage.rlx
    public final void j(View view, View view2, int i2, int i3) {
        this.n0 = getNanoTime();
        this.o0 = 0.0f;
        this.l0 = 0.0f;
        this.m0 = 0.0f;
    }

    @Override // defpackage.rlx
    public final void k(View view, int i2, int i3, int[] iArr, int i4) {
        androidx.constraintlayout.motion.widget.b.C0051b c0051b;
        boolean z;
        float f2;
        androidx.constraintlayout.motion.widget.c cVar;
        float f3;
        androidx.constraintlayout.motion.widget.c cVar2;
        androidx.constraintlayout.motion.widget.c cVar3;
        androidx.constraintlayout.motion.widget.c cVar4;
        int i5;
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar == null || (c0051b = bVar.c) == null || (z = c0051b.o)) {
            return;
        }
        int i6 = -1;
        if (z || (cVar4 = c0051b.l) == null || (i5 = cVar4.e) == -1 || view.getId() == i5) {
            androidx.constraintlayout.motion.widget.b.C0051b c0051b2 = bVar.c;
            if ((c0051b2 == null || (cVar3 = c0051b2.l) == null) ? false : cVar3.u) {
                androidx.constraintlayout.motion.widget.c cVar5 = c0051b.l;
                if (cVar5 != null && (cVar5.w & 4) != 0) {
                    i6 = i3;
                }
                float f4 = this.S;
                if ((f4 == 1.0f || f4 == 0.0f) && view.canScrollVertically(i6)) {
                    return;
                }
            }
            androidx.constraintlayout.motion.widget.c cVar6 = c0051b.l;
            if (cVar6 == null || (cVar6.w & 1) == 0) {
                f2 = 0.0f;
            } else {
                float f5 = i2;
                float f6 = i3;
                androidx.constraintlayout.motion.widget.b.C0051b c0051b3 = bVar.c;
                if (c0051b3 == null || (cVar2 = c0051b3.l) == null) {
                    f2 = 0.0f;
                    f3 = 0.0f;
                } else {
                    float[] fArr = cVar2.n;
                    f2 = 0.0f;
                    cVar2.r.J(cVar2.d, cVar2.r.getProgress(), cVar2.h, cVar2.g, fArr);
                    float f7 = cVar2.k;
                    if (f7 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f3 = (f5 * f7) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f3 = (f6 * cVar2.l) / fArr[1];
                    }
                }
                float f8 = this.T;
                if ((f8 <= f2 && f3 < f2) || (f8 >= 1.0f && f3 > f2)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new a(view));
                    return;
                }
            }
            float f9 = this.S;
            long nanoTime = getNanoTime();
            float f10 = i2;
            this.l0 = f10;
            float f11 = i3;
            this.m0 = f11;
            this.o0 = (float) ((nanoTime - this.n0) * 1.0E-9d);
            this.n0 = nanoTime;
            androidx.constraintlayout.motion.widget.b.C0051b c0051b4 = bVar.c;
            if (c0051b4 != null && (cVar = c0051b4.l) != null) {
                float[] fArr2 = cVar.n;
                MotionLayout motionLayout = cVar.r;
                float progress = motionLayout.getProgress();
                if (!cVar.m) {
                    cVar.m = true;
                    motionLayout.setProgress(progress);
                }
                cVar.r.J(cVar.d, progress, cVar.h, cVar.g, fArr2);
                if (Math.abs((cVar.l * fArr2[1]) + (cVar.k * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f12 = cVar.k;
                float fMax = Math.max(Math.min(progress + (f12 != f2 ? (f10 * f12) / fArr2[0] : (f11 * cVar.l) / fArr2[1]), 1.0f), f2);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f9 != this.S) {
                iArr[0] = i2;
                iArr[1] = i3;
            }
            G(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.k0 = true;
        }
    }

    @Override // defpackage.slx
    public final void o(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (this.k0 || i2 != 0 || i3 != 0) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
        }
        this.k0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.constraintlayout.motion.widget.b.C0051b c0051b;
        int i2;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar != null && (i2 = this.K) != -1) {
            androidx.constraintlayout.widget.b bVarB = bVar.b(i2);
            this.F.n(this);
            ArrayList<MotionHelper> arrayList = this.s0;
            if (arrayList != null) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    MotionHelper motionHelper = arrayList.get(i3);
                    i3++;
                    motionHelper.getClass();
                }
            }
            if (bVarB != null) {
                bVarB.b(this);
            }
            this.J = this.K;
        }
        O();
        g gVar = this.J0;
        if (gVar != null) {
            if (this.M0) {
                post(new b());
                return;
            } else {
                gVar.a();
                return;
            }
        }
        androidx.constraintlayout.motion.widget.b bVar2 = this.F;
        if (bVar2 == null || (c0051b = bVar2.c) == null || c0051b.n != 4) {
            return;
        }
        T();
        setState(i.b);
        setState(i.c);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:67:0x0106  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        androidx.constraintlayout.motion.widget.c cVar;
        int i2;
        RectF rectFB;
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar == null || !this.O) {
            return false;
        }
        androidx.constraintlayout.motion.widget.e eVar = bVar.q;
        if (eVar != null) {
            MotionLayout motionLayout = eVar.a;
            ArrayList<androidx.constraintlayout.motion.widget.d> arrayList = eVar.b;
            int currentState = motionLayout.getCurrentState();
            if (currentState == -1) {
                z = false;
            } else {
                if (eVar.c == null) {
                    eVar.c = new HashSet<>();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        androidx.constraintlayout.motion.widget.d dVar = arrayList.get(i3);
                        i3++;
                        androidx.constraintlayout.motion.widget.d dVar2 = dVar;
                        int childCount = motionLayout.getChildCount();
                        for (int i4 = 0; i4 < childCount; i4++) {
                            View childAt = motionLayout.getChildAt(i4);
                            if (dVar2.c(childAt)) {
                                childAt.getId();
                                eVar.c.add(childAt);
                            }
                        }
                    }
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList<androidx.constraintlayout.motion.widget.d.a> arrayList2 = eVar.d;
                int i5 = 2;
                int i6 = 1;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    ArrayList<androidx.constraintlayout.motion.widget.d.a> arrayList3 = eVar.d;
                    int size2 = arrayList3.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        androidx.constraintlayout.motion.widget.d.a aVar = arrayList3.get(i7);
                        i7++;
                        androidx.constraintlayout.motion.widget.d.a aVar2 = aVar;
                        Rect rect2 = aVar2.l;
                        if (action != i6) {
                            if (action == i5) {
                                aVar2.c.b.getHitRect(rect2);
                                if (!rect2.contains((int) x, (int) y) && !aVar2.h) {
                                    aVar2.b();
                                }
                            }
                        } else if (!aVar2.h) {
                            aVar2.b();
                        }
                        i5 = 2;
                        i6 = 1;
                    }
                }
                z = false;
                if (action == 0 || action == 1) {
                    androidx.constraintlayout.widget.b bVarK = motionLayout.K(currentState);
                    int size3 = arrayList.size();
                    int i8 = 0;
                    while (i8 < size3) {
                        androidx.constraintlayout.motion.widget.d dVar3 = arrayList.get(i8);
                        i8++;
                        androidx.constraintlayout.motion.widget.d dVar4 = dVar3;
                        int i9 = dVar4.b;
                        if (i9 == 1) {
                            if (action == 0) {
                                for (View view : eVar.c) {
                                    if (dVar4.c(view)) {
                                        view.getHitRect(rect);
                                        int i10 = size3;
                                        if (rect.contains((int) x, (int) y)) {
                                            dVar4.a(eVar, motionLayout, currentState, bVarK, view);
                                        }
                                        size3 = i10;
                                    }
                                }
                            }
                        } else if (i9 == 2) {
                            if (action == 1) {
                                while (r14.hasNext()) {
                                    if (dVar4.c(view)) {
                                        view.getHitRect(rect);
                                        int i11 = size3;
                                        if (rect.contains((int) x, (int) y)) {
                                            dVar4.a(eVar, motionLayout, currentState, bVarK, view);
                                        }
                                        size3 = i11;
                                    }
                                }
                            }
                        } else if (i9 == 3 && action == 0) {
                            while (r14.hasNext()) {
                                if (dVar4.c(view)) {
                                    view.getHitRect(rect);
                                    int i12 = size3;
                                    if (rect.contains((int) x, (int) y)) {
                                        dVar4.a(eVar, motionLayout, currentState, bVarK, view);
                                    }
                                    size3 = i12;
                                }
                            }
                        }
                        size3 = size3;
                    }
                }
            }
        } else {
            z = false;
        }
        androidx.constraintlayout.motion.widget.b.C0051b c0051b = this.F.c;
        if (c0051b == null || c0051b.o || (cVar = c0051b.l) == null) {
            return z;
        }
        if ((motionEvent.getAction() == 0 && (rectFB = cVar.b(this, new RectF())) != null && !rectFB.contains(motionEvent.getX(), motionEvent.getY())) || (i2 = cVar.e) == -1) {
            return z;
        }
        View view2 = this.R0;
        if (view2 == null || view2.getId() != i2) {
            this.R0 = findViewById(i2);
        }
        View view3 = this.R0;
        if (view3 == null) {
            return z;
        }
        float left = view3.getLeft();
        float top = this.R0.getTop();
        float right = this.R0.getRight();
        float bottom = this.R0.getBottom();
        RectF rectF = this.Q0;
        rectF.set(left, top, right, bottom);
        return (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || M((float) this.R0.getLeft(), (float) this.R0.getTop(), this.R0, motionEvent)) ? z : onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.I0 = true;
        try {
            if (this.F == null) {
                super.onLayout(z, i2, i3, i4, i5);
                return;
            }
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (this.i0 != i6 || this.j0 != i7) {
                Q();
                G(true);
            }
            this.i0 = i6;
            this.j0 = i7;
        } finally {
            this.I0 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00fe A[PHI: r11
      0x00fe: PHI (r11v5 float) = (r11v2 float), (r11v6 float) binds: [B:63:0x0108, B:57:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0100  */
    /* JADX WARN: Code duplicated, block: B:62:0x0104  */
    /* JADX WARN: Code duplicated, block: B:77:0x012d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0131  */
    /* JADX WARN: Code duplicated, block: B:81:0x0137  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        boolean z;
        float f2;
        float f3;
        jxa jxaVar = this.c;
        if (this.F == null) {
            super.onMeasure(i2, i3);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.M == i2 && this.N == i3) ? false : true;
        if (this.P0) {
            this.P0 = false;
            O();
            P();
            z3 = true;
        }
        if (this.v) {
            z3 = true;
        }
        this.M = i2;
        this.N = i3;
        int iH = this.F.h();
        androidx.constraintlayout.motion.widget.b.C0051b c0051b = this.F.c;
        int i4 = c0051b == null ? -1 : c0051b.c;
        e eVar = this.O0;
        if ((!z3 && iH == eVar.e && i4 == eVar.f) || this.J == -1) {
            if (z3) {
                super.onMeasure(i2, i3);
            }
            z = true;
        } else {
            super.onMeasure(i2, i3);
            eVar.e(this.F.b(iH), this.F.b(i4));
            eVar.f();
            eVar.e = iH;
            eVar.f = i4;
            z = false;
        }
        if (this.z0 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iS = jxaVar.s() + getPaddingRight() + getPaddingLeft();
            int iM = jxaVar.m() + paddingBottom;
            int i5 = this.E0;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                int i6 = this.A0;
                iS = (int) ((this.G0 * (this.C0 - i6)) + i6);
                requestLayout();
            }
            int i7 = this.F0;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                int i8 = this.B0;
                iM = (int) ((this.G0 * (this.D0 - i8)) + i8);
                requestLayout();
            }
            setMeasuredDimension(iS, iM);
        }
        float fSignum = Math.signum(this.V - this.T);
        long nanoTime = getNanoTime();
        t5w t5wVar = this.G;
        float interpolation = this.T + (!(t5wVar instanceof h1e0) ? (((nanoTime - this.U) * fSignum) * 1.0E-9f) / this.R : 0.0f);
        if (this.W) {
            interpolation = this.V;
        }
        if (fSignum > 0.0f) {
            f2 = this.V;
            if (interpolation < f2) {
                if (fSignum <= 0.0f) {
                    f2 = this.V;
                    if (interpolation <= f2) {
                        interpolation = f2;
                    }
                }
                z2 = false;
            } else {
                interpolation = f2;
            }
        } else {
            if (fSignum <= 0.0f) {
                f2 = this.V;
                if (interpolation <= f2) {
                    interpolation = f2;
                }
            }
            z2 = false;
        }
        if (t5wVar != null && !z2) {
            interpolation = this.e0 ? t5wVar.getInterpolation((nanoTime - this.Q) * 1.0E-9f) : t5wVar.getInterpolation(interpolation);
        }
        if (fSignum > 0.0f) {
            float f4 = this.V;
            if (interpolation >= f4) {
                interpolation = f4;
            } else if (fSignum <= 0.0f) {
                f3 = this.V;
                if (interpolation <= f3) {
                    interpolation = f3;
                }
            }
        } else if (fSignum <= 0.0f) {
            f3 = this.V;
            if (interpolation <= f3) {
                interpolation = f3;
            }
        }
        this.G0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.H;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        float f5 = interpolation;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            n5w n5wVar = this.P.get(childAt);
            if (n5wVar != null) {
                n5wVar.f(f5, nanoTime2, this.H0, childAt);
            }
        }
        if (this.z0) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        androidx.constraintlayout.motion.widget.c cVar;
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar != null) {
            boolean zY = y();
            bVar.p = zY;
            androidx.constraintlayout.motion.widget.b.C0051b c0051b = bVar.c;
            if (c0051b == null || (cVar = c0051b.l) == null) {
                return;
            }
            cVar.c(zY);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0228  */
    /* JADX WARN: Code duplicated, block: B:110:0x022e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0232  */
    /* JADX WARN: Code duplicated, block: B:116:0x023c  */
    /* JADX WARN: Code duplicated, block: B:118:0x024f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0255  */
    /* JADX WARN: Code duplicated, block: B:123:0x025e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:128:0x026a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0283  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:133:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:139:0x0339  */
    /* JADX WARN: Code duplicated, block: B:141:0x033e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0344  */
    /* JADX WARN: Code duplicated, block: B:146:0x0350  */
    /* JADX WARN: Code duplicated, block: B:148:0x0354  */
    /* JADX WARN: Code duplicated, block: B:150:0x035c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0363  */
    /* JADX WARN: Code duplicated, block: B:154:0x0369  */
    /* JADX WARN: Code duplicated, block: B:155:0x0383  */
    /* JADX WARN: Code duplicated, block: B:158:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:160:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:162:0x03b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:164:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:168:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:171:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:172:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:175:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:176:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:178:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:180:0x0408  */
    /* JADX WARN: Code duplicated, block: B:182:0x040f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0418  */
    /* JADX WARN: Code duplicated, block: B:186:0x041e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0423  */
    /* JADX WARN: Code duplicated, block: B:191:0x042a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0445  */
    /* JADX WARN: Code duplicated, block: B:196:0x0472  */
    /* JADX WARN: Code duplicated, block: B:198:0x0477  */
    /* JADX WARN: Code duplicated, block: B:199:0x04ae A[PHI: r7 r13
      0x04ae: PHI (r7v20 float) = (r7v15 float), (r7v26 float) binds: [B:197:0x0475, B:195:0x046b] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r13v11 float) = (r13v6 float), (r13v16 float) binds: [B:197:0x0475, B:195:0x046b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:201:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:202:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:205:0x050b  */
    /* JADX WARN: Code duplicated, block: B:207:0x051a  */
    /* JADX WARN: Code duplicated, block: B:210:0x0521  */
    /* JADX WARN: Code duplicated, block: B:234:0x0579  */
    /* JADX WARN: Code duplicated, block: B:236:0x0581  */
    /* JADX WARN: Code duplicated, block: B:238:0x0587  */
    /* JADX WARN: Code duplicated, block: B:239:0x058c  */
    /* JADX WARN: Code duplicated, block: B:240:0x059d  */
    /* JADX WARN: Code duplicated, block: B:242:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:245:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:247:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:250:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:252:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:254:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:256:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:259:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:260:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:263:0x0635  */
    /* JADX WARN: Code duplicated, block: B:266:0x0640  */
    /* JADX WARN: Code duplicated, block: B:267:0x0644  */
    /* JADX WARN: Code duplicated, block: B:270:0x0657  */
    /* JADX WARN: Code duplicated, block: B:273:0x0660  */
    /* JADX WARN: Code duplicated, block: B:276:0x066f  */
    /* JADX WARN: Code duplicated, block: B:278:0x0675  */
    /* JADX WARN: Code duplicated, block: B:280:0x067b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:281:0x067d  */
    /* JADX WARN: Code duplicated, block: B:282:0x067f  */
    /* JADX WARN: Code duplicated, block: B:286:0x068a  */
    /* JADX WARN: Code duplicated, block: B:289:0x0691  */
    /* JADX WARN: Code duplicated, block: B:290:0x0696  */
    /* JADX WARN: Code duplicated, block: B:293:0x069b  */
    /* JADX WARN: Code duplicated, block: B:294:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:297:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:298:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:300:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:302:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:304:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:307:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:308:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:311:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:312:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:315:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:316:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:319:0x0726  */
    /* JADX WARN: Code duplicated, block: B:320:0x0728  */
    /* JADX WARN: Code duplicated, block: B:323:0x0730  */
    /* JADX WARN: Code duplicated, block: B:325:0x0736  */
    /* JADX WARN: Code duplicated, block: B:328:0x073c  */
    /* JADX WARN: Code duplicated, block: B:352:0x0787  */
    /* JADX WARN: Code duplicated, block: B:354:0x078d  */
    /* JADX WARN: Code duplicated, block: B:356:0x0793  */
    /* JADX WARN: Code duplicated, block: B:357:0x0797  */
    /* JADX WARN: Code duplicated, block: B:360:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:364:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:365:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:368:0x07d0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v20 */
    /* JADX WARN: Type inference failed for: r18v21 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.b.C0051b c0051b;
        f fVar;
        VelocityTracker velocityTracker;
        f fVar2;
        int i2;
        androidx.constraintlayout.motion.widget.c cVar;
        float[] fArr;
        f fVar3;
        MotionLayout motionLayout;
        boolean z;
        i iVar;
        VelocityTracker velocityTracker2;
        int action;
        VelocityTracker velocityTracker3;
        VelocityTracker velocityTracker4;
        float xVelocity;
        VelocityTracker velocityTracker5;
        float yVelocity;
        float progress;
        int i3;
        MotionLayout motionLayout2;
        char c2;
        char c3;
        float f2;
        float f3;
        float f4;
        float fAbs;
        float f5;
        int i4;
        float rawY;
        float rawX;
        float progress2;
        int i5;
        MotionLayout motionLayout3;
        char c4;
        char c5;
        float f6;
        float fMax;
        float progress3;
        boolean z2;
        VelocityTracker velocityTracker6;
        VelocityTracker velocityTracker7;
        float xVelocity2;
        VelocityTracker velocityTracker8;
        float yVelocity2;
        float f7;
        int[] iArr;
        VelocityTracker velocityTracker9;
        int action2;
        VelocityTracker velocityTracker10;
        VelocityTracker velocityTracker11;
        float xVelocity3;
        VelocityTracker velocityTracker12;
        float yVelocity3;
        float progress4;
        float width;
        int i6;
        int i7;
        float f8;
        int top;
        int bottom;
        int i8;
        i iVar2;
        int i9;
        float degrees;
        float f9;
        i iVar3;
        int i10;
        float width2;
        float height;
        int i11;
        int i12;
        View viewFindViewById;
        float rawX2;
        float rawY2;
        double dAtan2;
        float fAtan2;
        float f10;
        float progress5;
        boolean z3;
        int i13;
        int i14;
        ?? r18;
        float fMax2;
        float progress6;
        boolean z4;
        VelocityTracker velocityTracker13;
        VelocityTracker velocityTracker14;
        float xVelocity4;
        VelocityTracker velocityTracker15;
        float yVelocity4;
        MotionEvent motionEvent2;
        androidx.constraintlayout.motion.widget.b.C0051b c0051b2;
        int iA;
        int i15;
        float f11;
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar == null || !this.O || !bVar.p()) {
            return super.onTouchEvent(motionEvent);
        }
        androidx.constraintlayout.motion.widget.b bVar2 = this.F;
        androidx.constraintlayout.motion.widget.b.C0051b c0051b3 = bVar2.c;
        if (c0051b3 != null && c0051b3.o) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        MotionLayout motionLayout4 = bVar2.a;
        RectF rectF = new RectF();
        f fVar4 = bVar2.o;
        if (fVar4 == null) {
            motionLayout4.getClass();
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            f fVar5 = f.b;
            fVar5.a = velocityTrackerObtain;
            bVar2.o = fVar5;
            fVar4 = fVar5;
        }
        VelocityTracker velocityTracker16 = fVar4.a;
        if (velocityTracker16 != null) {
            velocityTracker16.addMovement(motionEvent);
        }
        if (currentState != -1) {
            int action3 = motionEvent.getAction();
            if (action3 == 0) {
                bVar2.r = motionEvent.getRawX();
                bVar2.s = motionEvent.getRawY();
                bVar2.l = motionEvent;
                bVar2.m = false;
                androidx.constraintlayout.motion.widget.c cVar2 = bVar2.c.l;
                if (cVar2 != null) {
                    RectF rectFA = cVar2.a(motionLayout4, rectF);
                    if (rectFA == null || rectFA.contains(bVar2.l.getX(), bVar2.l.getY())) {
                        RectF rectFB = bVar2.c.l.b(motionLayout4, rectF);
                        if (rectFB == null || rectFB.contains(bVar2.l.getX(), bVar2.l.getY())) {
                            bVar2.n = false;
                        } else {
                            bVar2.n = true;
                        }
                        androidx.constraintlayout.motion.widget.c cVar3 = bVar2.c.l;
                        float f12 = bVar2.r;
                        float f13 = bVar2.s;
                        cVar3.p = f12;
                        cVar3.q = f13;
                    } else {
                        bVar2.l = null;
                        bVar2.m = true;
                    }
                }
            } else if (action3 == 2 && !bVar2.m) {
                float rawY3 = motionEvent.getRawY() - bVar2.s;
                float rawX3 = motionEvent.getRawX() - bVar2.r;
                if ((rawX3 != 0.0d || rawY3 != 0.0d) && (motionEvent2 = bVar2.l) != null) {
                    if (currentState != -1) {
                        sxd0 sxd0Var = bVar2.b;
                        if (sxd0Var == null || (iA = sxd0Var.a(currentState)) == -1) {
                            iA = currentState;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList<androidx.constraintlayout.motion.widget.b.C0051b> arrayList2 = bVar2.d;
                        int size = arrayList2.size();
                        int i16 = 0;
                        while (i16 < size) {
                            androidx.constraintlayout.motion.widget.b.C0051b c0051b4 = arrayList2.get(i16);
                            i16++;
                            androidx.constraintlayout.motion.widget.b.C0051b c0051b5 = c0051b4;
                            if (c0051b5.d == iA || c0051b5.c == iA) {
                                arrayList.add(c0051b5);
                            }
                        }
                        RectF rectF2 = new RectF();
                        int size2 = arrayList.size();
                        float f14 = 0.0f;
                        int i17 = 0;
                        c0051b2 = null;
                        while (i17 < size2) {
                            Object obj = arrayList.get(i17);
                            i17++;
                            androidx.constraintlayout.motion.widget.b.C0051b c0051b6 = (androidx.constraintlayout.motion.widget.b.C0051b) obj;
                            arrayList = arrayList;
                            if (c0051b6.o) {
                                i15 = size2;
                                f11 = f14;
                            } else {
                                androidx.constraintlayout.motion.widget.c cVar4 = c0051b6.l;
                                if (cVar4 != null) {
                                    i15 = size2;
                                    cVar4.c(bVar2.p);
                                    RectF rectFB2 = c0051b6.l.b(motionLayout4, rectF2);
                                    if (rectFB2 != null) {
                                        f11 = f14;
                                        if (!rectFB2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        }
                                    } else {
                                        f11 = f14;
                                    }
                                    RectF rectFA2 = c0051b6.l.a(motionLayout4, rectF2);
                                    if (rectFA2 == null || rectFA2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        androidx.constraintlayout.motion.widget.c cVar5 = c0051b6.l;
                                        float fAtan3 = (cVar5.l * rawY3) + (cVar5.k * rawX3);
                                        if (cVar5.j) {
                                            float x = motionEvent2.getX();
                                            c0051b6.l.getClass();
                                            float f15 = x - 0.5f;
                                            float y = motionEvent2.getY();
                                            c0051b6.l.getClass();
                                            float f16 = y - 0.5f;
                                            fAtan3 = ((float) (Math.atan2(rawY3 + f16, rawX3 + f15) - Math.atan2(f15, f16))) * 10.0f;
                                        }
                                        f14 = fAtan3 * (c0051b6.c == currentState ? -1.0f : 1.1f);
                                        if (f14 > f11) {
                                            c0051b2 = c0051b6;
                                        }
                                        size2 = i15;
                                        rectF2 = rectF2;
                                        i17 = i17;
                                    }
                                } else {
                                    rectF2 = rectF2;
                                    i15 = size2;
                                    f11 = f14;
                                    i17 = i17;
                                    c0051b2 = c0051b2;
                                }
                                f14 = f11;
                                c0051b2 = c0051b2;
                                size2 = i15;
                                rectF2 = rectF2;
                                i17 = i17;
                            }
                            size2 = i15;
                            f14 = f11;
                        }
                    } else {
                        c0051b2 = bVar2.c;
                    }
                    if (c0051b2 != null) {
                        setTransition(c0051b2);
                        RectF rectFB3 = bVar2.c.l.b(motionLayout4, rectF);
                        bVar2.n = (rectFB3 == null || rectFB3.contains(bVar2.l.getX(), bVar2.l.getY())) ? false : true;
                        androidx.constraintlayout.motion.widget.c cVar6 = bVar2.c.l;
                        float f17 = bVar2.r;
                        float f18 = bVar2.s;
                        cVar6.p = f17;
                        cVar6.q = f18;
                        cVar6.m = false;
                    }
                    if (!bVar2.m) {
                        c0051b = bVar2.c;
                        if (c0051b != null) {
                            fArr = cVar.n;
                            if (!bVar2.n) {
                                fVar3 = bVar2.o;
                                motionLayout = cVar.r;
                                z = cVar.j;
                                iVar = i.d;
                                if (z) {
                                    iArr = cVar.o;
                                    velocityTracker9 = fVar3.a;
                                    if (velocityTracker9 != null) {
                                        velocityTracker9.addMovement(motionEvent);
                                    }
                                    action2 = motionEvent.getAction();
                                    if (action2 == 0) {
                                        cVar.p = motionEvent.getRawX();
                                        cVar.q = motionEvent.getRawY();
                                        cVar.m = false;
                                    } else if (action2 == 1) {
                                        cVar.m = false;
                                        velocityTracker10 = fVar3.a;
                                        if (velocityTracker10 != null) {
                                            velocityTracker10.computeCurrentVelocity(16);
                                        }
                                        velocityTracker11 = fVar3.a;
                                        if (velocityTracker11 != null) {
                                            xVelocity3 = velocityTracker11.getXVelocity();
                                        } else {
                                            xVelocity3 = 0.0f;
                                        }
                                        velocityTracker12 = fVar3.a;
                                        if (velocityTracker12 != null) {
                                            yVelocity3 = velocityTracker12.getYVelocity();
                                        } else {
                                            yVelocity3 = 0.0f;
                                        }
                                        progress4 = motionLayout.getProgress();
                                        width = motionLayout.getWidth() / 2.0f;
                                        float height2 = motionLayout.getHeight() / 2.0f;
                                        i6 = cVar.i;
                                        if (i6 != -1) {
                                            View viewFindViewById2 = motionLayout.findViewById(i6);
                                            motionLayout.getLocationOnScreen(iArr);
                                            width = iArr[0] + ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f);
                                            f8 = iArr[1];
                                            top = viewFindViewById2.getTop();
                                            bottom = viewFindViewById2.getBottom();
                                        } else {
                                            i7 = cVar.d;
                                            if (i7 != -1) {
                                                View viewFindViewById3 = motionLayout.findViewById(motionLayout.P.get(motionLayout.findViewById(i7)).f.z);
                                                motionLayout.getLocationOnScreen(iArr);
                                                width = iArr[0] + ((viewFindViewById3.getRight() + viewFindViewById3.getLeft()) / 2.0f);
                                                f8 = iArr[1];
                                                top = viewFindViewById3.getTop();
                                                bottom = viewFindViewById3.getBottom();
                                            } else {
                                                float rawX4 = motionEvent.getRawX() - width;
                                                float rawY4 = motionEvent.getRawY() - height2;
                                                double degrees2 = Math.toDegrees(Math.atan2(rawY4, rawX4));
                                                i8 = cVar.d;
                                                if (i8 != -1) {
                                                    iVar2 = iVar;
                                                    i9 = 6;
                                                    cVar.r.J(i8, progress4, cVar.h, cVar.g, fArr);
                                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                                } else {
                                                    iVar2 = iVar;
                                                    i9 = 6;
                                                    fArr[1] = 360.0f;
                                                }
                                                degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY4, xVelocity3 + rawX4)) - degrees2)) * 62.5f;
                                                if (Float.isNaN(degrees)) {
                                                    f9 = progress4;
                                                } else {
                                                    f9 = (((degrees * 3.0f) * cVar.v) / fArr[1]) + progress4;
                                                }
                                                if (f9 != 0.0f) {
                                                    iVar3 = iVar2;
                                                    if (0.0f < f9) {
                                                        motionLayout.setState(iVar3);
                                                    } else {
                                                        motionLayout.setState(iVar3);
                                                    }
                                                } else {
                                                    iVar3 = iVar2;
                                                    if (0.0f < f9) {
                                                        motionLayout.setState(iVar3);
                                                    } else {
                                                        motionLayout.setState(iVar3);
                                                    }
                                                }
                                            }
                                        }
                                        height2 = ((bottom + top) / 2.0f) + f8;
                                        float rawX5 = motionEvent.getRawX() - width;
                                        float rawY5 = motionEvent.getRawY() - height2;
                                        double degrees3 = Math.toDegrees(Math.atan2(rawY5, rawX5));
                                        i8 = cVar.d;
                                        if (i8 != -1) {
                                            iVar2 = iVar;
                                            i9 = 6;
                                            cVar.r.J(i8, progress4, cVar.h, cVar.g, fArr);
                                            fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
                                            iVar2 = iVar;
                                            i9 = 6;
                                            fArr[1] = 360.0f;
                                        }
                                        degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY5, xVelocity3 + rawX5)) - degrees3)) * 62.5f;
                                        if (Float.isNaN(degrees)) {
                                            f9 = (((degrees * 3.0f) * cVar.v) / fArr[1]) + progress4;
                                        } else {
                                            f9 = progress4;
                                        }
                                        if (f9 != 0.0f) {
                                            iVar3 = iVar2;
                                            if (0.0f < f9) {
                                                motionLayout.setState(iVar3);
                                            } else {
                                                motionLayout.setState(iVar3);
                                            }
                                        } else {
                                            iVar3 = iVar2;
                                            if (0.0f < f9) {
                                                motionLayout.setState(iVar3);
                                            } else {
                                                motionLayout.setState(iVar3);
                                            }
                                        }
                                    } else if (action2 == 2) {
                                        motionEvent.getRawY();
                                        motionEvent.getRawX();
                                        width2 = motionLayout.getWidth() / 2.0f;
                                        height = motionLayout.getHeight() / 2.0f;
                                        i11 = cVar.i;
                                        if (i11 != -1) {
                                            View viewFindViewById4 = motionLayout.findViewById(i11);
                                            motionLayout.getLocationOnScreen(iArr);
                                            float right = iArr[0] + ((viewFindViewById4.getRight() + viewFindViewById4.getLeft()) / 2.0f);
                                            float bottom2 = iArr[1] + ((viewFindViewById4.getBottom() + viewFindViewById4.getTop()) / 2.0f);
                                            width2 = right;
                                            height = bottom2;
                                        } else {
                                            i12 = cVar.d;
                                            if (i12 != -1) {
                                                viewFindViewById = motionLayout.findViewById(motionLayout.P.get(motionLayout.findViewById(i12)).f.z);
                                                if (viewFindViewById == null) {
                                                    Log.e("TouchResponse", "could not find view to animate to");
                                                } else {
                                                    motionLayout.getLocationOnScreen(iArr);
                                                    width2 = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                                    height = ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f) + iArr[1];
                                                }
                                            }
                                        }
                                        rawX2 = motionEvent.getRawX() - width2;
                                        rawY2 = motionEvent.getRawY() - height;
                                        dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width2);
                                        fAtan2 = (float) (((dAtan2 - Math.atan2(cVar.q - height, cVar.p - width2)) * 180.0d) / 3.141592653589793d);
                                        if (fAtan2 > 330.0f) {
                                            fAtan2 -= 360.0f;
                                        } else if (fAtan2 < -330.0f) {
                                            fAtan2 += 360.0f;
                                        }
                                        f10 = fAtan2;
                                        if (Math.abs(f10) <= 0.01d) {
                                            progress5 = motionLayout.getProgress();
                                            if (cVar.m) {
                                                z3 = true;
                                            } else {
                                                z3 = true;
                                                cVar.m = true;
                                                motionLayout.setProgress(progress5);
                                            }
                                            i13 = cVar.d;
                                            if (i13 != -1) {
                                                boolean z5 = z3;
                                                i14 = 1000;
                                                cVar.r.J(i13, progress5, cVar.h, cVar.g, fArr);
                                                fArr[z5 ? 1 : 0] = (float) Math.toDegrees(fArr[z5 ? 1 : 0]);
                                                r18 = z5;
                                            } else {
                                                boolean z6 = z3;
                                                i14 = 1000;
                                                fArr[z6 ? 1 : 0] = 360.0f;
                                                r18 = z6;
                                            }
                                            fMax2 = Math.max(Math.min(((f10 * cVar.v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                            progress6 = motionLayout.getProgress();
                                            if (fMax2 != progress6) {
                                                if (progress6 != 0.0f) {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    motionLayout.F(z4);
                                                } else {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    motionLayout.F(z4);
                                                }
                                                motionLayout.setProgress(fMax2);
                                                velocityTracker13 = fVar3.a;
                                                if (velocityTracker13 != null) {
                                                    velocityTracker13.computeCurrentVelocity(i14);
                                                }
                                                velocityTracker14 = fVar3.a;
                                                if (velocityTracker14 != null) {
                                                    xVelocity4 = velocityTracker14.getXVelocity();
                                                } else {
                                                    xVelocity4 = 0.0f;
                                                }
                                                velocityTracker15 = fVar3.a;
                                                if (velocityTracker15 != null) {
                                                    yVelocity4 = velocityTracker15.getYVelocity();
                                                } else {
                                                    yVelocity4 = 0.0f;
                                                }
                                                double d2 = yVelocity4;
                                                double d3 = xVelocity4;
                                                motionLayout.I = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d2, d3) - dAtan2) * Math.hypot(d2, d3)) / Math.hypot(rawX2, rawY2)));
                                            } else {
                                                motionLayout.I = 0.0f;
                                            }
                                            cVar.p = motionEvent.getRawX();
                                            cVar.q = motionEvent.getRawY();
                                        } else {
                                            progress5 = motionLayout.getProgress();
                                            if (cVar.m) {
                                                z3 = true;
                                                cVar.m = true;
                                                motionLayout.setProgress(progress5);
                                            } else {
                                                z3 = true;
                                            }
                                            i13 = cVar.d;
                                            if (i13 != -1) {
                                                boolean z7 = z3;
                                                i14 = 1000;
                                                cVar.r.J(i13, progress5, cVar.h, cVar.g, fArr);
                                                fArr[z7 ? 1 : 0] = (float) Math.toDegrees(fArr[z7 ? 1 : 0]);
                                                r18 = z7;
                                            } else {
                                                boolean z8 = z3;
                                                i14 = 1000;
                                                fArr[z8 ? 1 : 0] = 360.0f;
                                                r18 = z8;
                                            }
                                            fMax2 = Math.max(Math.min(((f10 * cVar.v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                            progress6 = motionLayout.getProgress();
                                            if (fMax2 != progress6) {
                                                if (progress6 != 0.0f) {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    motionLayout.F(z4);
                                                } else {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    motionLayout.F(z4);
                                                }
                                                motionLayout.setProgress(fMax2);
                                                velocityTracker13 = fVar3.a;
                                                if (velocityTracker13 != null) {
                                                    velocityTracker13.computeCurrentVelocity(i14);
                                                }
                                                velocityTracker14 = fVar3.a;
                                                if (velocityTracker14 != null) {
                                                    xVelocity4 = velocityTracker14.getXVelocity();
                                                } else {
                                                    xVelocity4 = 0.0f;
                                                }
                                                velocityTracker15 = fVar3.a;
                                                if (velocityTracker15 != null) {
                                                    yVelocity4 = velocityTracker15.getYVelocity();
                                                } else {
                                                    yVelocity4 = 0.0f;
                                                }
                                                double d4 = yVelocity4;
                                                double d5 = xVelocity4;
                                                motionLayout.I = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d4, d5) - dAtan2) * Math.hypot(d4, d5)) / Math.hypot(rawX2, rawY2)));
                                            } else {
                                                motionLayout.I = 0.0f;
                                            }
                                            cVar.p = motionEvent.getRawX();
                                            cVar.q = motionEvent.getRawY();
                                        }
                                    }
                                } else {
                                    velocityTracker2 = fVar3.a;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    action = motionEvent.getAction();
                                    if (action == 0) {
                                        cVar.p = motionEvent.getRawX();
                                        cVar.q = motionEvent.getRawY();
                                        cVar.m = false;
                                    } else if (action == 1) {
                                        cVar.m = false;
                                        velocityTracker3 = fVar3.a;
                                        if (velocityTracker3 != null) {
                                            velocityTracker3.computeCurrentVelocity(1000);
                                        }
                                        velocityTracker4 = fVar3.a;
                                        if (velocityTracker4 != null) {
                                            xVelocity = velocityTracker4.getXVelocity();
                                        } else {
                                            xVelocity = 0.0f;
                                        }
                                        velocityTracker5 = fVar3.a;
                                        if (velocityTracker5 != null) {
                                            yVelocity = velocityTracker5.getYVelocity();
                                        } else {
                                            yVelocity = 0.0f;
                                        }
                                        progress = motionLayout.getProgress();
                                        i3 = cVar.d;
                                        motionLayout2 = cVar.r;
                                        if (i3 != -1) {
                                            motionLayout2.J(i3, progress, cVar.h, cVar.g, fArr);
                                            c2 = 1;
                                            c3 = 0;
                                        } else {
                                            float fMin = Math.min(motionLayout2.getWidth(), motionLayout.getHeight());
                                            c2 = 1;
                                            fArr[1] = cVar.l * fMin;
                                            c3 = 0;
                                            fArr[0] = fMin * cVar.k;
                                        }
                                        f2 = cVar.k;
                                        f3 = fArr[c3];
                                        f4 = fArr[c2];
                                        if (f2 != 0.0f) {
                                            fAbs = xVelocity / f3;
                                        } else {
                                            fAbs = yVelocity / f4;
                                        }
                                        if (Float.isNaN(fAbs)) {
                                            f5 = progress;
                                        } else {
                                            f5 = (fAbs / 3.0f) + progress;
                                        }
                                        if (f5 == 0.0f) {
                                            if (0.0f < f5) {
                                                motionLayout.setState(iVar);
                                            } else {
                                                motionLayout.setState(iVar);
                                            }
                                        } else if (0.0f < f5) {
                                            motionLayout.setState(iVar);
                                        } else {
                                            motionLayout.setState(iVar);
                                        }
                                    } else if (action == 2) {
                                        rawY = motionEvent.getRawY() - cVar.q;
                                        rawX = motionEvent.getRawX() - cVar.p;
                                        if (Math.abs((cVar.l * rawY) + (cVar.k * rawX)) <= cVar.x) {
                                            progress2 = motionLayout.getProgress();
                                            if (!cVar.m) {
                                                cVar.m = true;
                                                motionLayout.setProgress(progress2);
                                            }
                                            i5 = cVar.d;
                                            motionLayout3 = cVar.r;
                                            if (i5 != -1) {
                                                motionLayout3.J(i5, progress2, cVar.h, cVar.g, fArr);
                                                c4 = 1;
                                                c5 = 0;
                                            } else {
                                                float fMin2 = Math.min(motionLayout3.getWidth(), motionLayout.getHeight());
                                                c4 = 1;
                                                fArr[1] = cVar.l * fMin2;
                                                c5 = 0;
                                                fArr[0] = fMin2 * cVar.k;
                                            }
                                            if (Math.abs(((cVar.l * fArr[c4]) + (cVar.k * fArr[c5])) * cVar.v) < 0.01d) {
                                                fArr[0] = 0.01f;
                                                fArr[c4] = 0.01f;
                                            }
                                            if (cVar.k != 0.0f) {
                                                f6 = rawX / fArr[0];
                                            } else {
                                                f6 = rawY / fArr[c4];
                                            }
                                            fMax = Math.max(Math.min(progress2 + f6, 1.0f), 0.0f);
                                            if (cVar.c == 6) {
                                                fMax = Math.max(fMax, 0.01f);
                                            }
                                            if (cVar.c == 7) {
                                                fMax = Math.min(fMax, 0.99f);
                                            }
                                            progress3 = motionLayout.getProgress();
                                            if (fMax != progress3) {
                                                if (progress3 != 0.0f) {
                                                    if (progress3 == 0.0f) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    motionLayout.F(z2);
                                                } else {
                                                    if (progress3 == 0.0f) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    motionLayout.F(z2);
                                                }
                                                motionLayout.setProgress(fMax);
                                                velocityTracker6 = fVar3.a;
                                                if (velocityTracker6 != null) {
                                                    velocityTracker6.computeCurrentVelocity(1000);
                                                }
                                                velocityTracker7 = fVar3.a;
                                                if (velocityTracker7 != null) {
                                                    xVelocity2 = velocityTracker7.getXVelocity();
                                                } else {
                                                    xVelocity2 = 0.0f;
                                                }
                                                velocityTracker8 = fVar3.a;
                                                if (velocityTracker8 != null) {
                                                    yVelocity2 = velocityTracker8.getYVelocity();
                                                } else {
                                                    yVelocity2 = 0.0f;
                                                }
                                                if (cVar.k != 0.0f) {
                                                    f7 = xVelocity2 / fArr[0];
                                                } else {
                                                    f7 = yVelocity2 / fArr[1];
                                                }
                                                motionLayout.I = f7;
                                            } else {
                                                motionLayout.I = 0.0f;
                                            }
                                            cVar.p = motionEvent.getRawX();
                                            cVar.q = motionEvent.getRawY();
                                        } else {
                                            progress2 = motionLayout.getProgress();
                                            if (!cVar.m) {
                                                cVar.m = true;
                                                motionLayout.setProgress(progress2);
                                            }
                                            i5 = cVar.d;
                                            motionLayout3 = cVar.r;
                                            if (i5 != -1) {
                                                motionLayout3.J(i5, progress2, cVar.h, cVar.g, fArr);
                                                c4 = 1;
                                                c5 = 0;
                                            } else {
                                                float fMin3 = Math.min(motionLayout3.getWidth(), motionLayout.getHeight());
                                                c4 = 1;
                                                fArr[1] = cVar.l * fMin3;
                                                c5 = 0;
                                                fArr[0] = fMin3 * cVar.k;
                                            }
                                            if (Math.abs(((cVar.l * fArr[c4]) + (cVar.k * fArr[c5])) * cVar.v) < 0.01d) {
                                                fArr[0] = 0.01f;
                                                fArr[c4] = 0.01f;
                                            }
                                            if (cVar.k != 0.0f) {
                                                f6 = rawX / fArr[0];
                                            } else {
                                                f6 = rawY / fArr[c4];
                                            }
                                            fMax = Math.max(Math.min(progress2 + f6, 1.0f), 0.0f);
                                            if (cVar.c == 6) {
                                                fMax = Math.max(fMax, 0.01f);
                                            }
                                            if (cVar.c == 7) {
                                                fMax = Math.min(fMax, 0.99f);
                                            }
                                            progress3 = motionLayout.getProgress();
                                            if (fMax != progress3) {
                                                if (progress3 != 0.0f) {
                                                    if (progress3 == 0.0f) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    motionLayout.F(z2);
                                                } else {
                                                    if (progress3 == 0.0f) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    motionLayout.F(z2);
                                                }
                                                motionLayout.setProgress(fMax);
                                                velocityTracker6 = fVar3.a;
                                                if (velocityTracker6 != null) {
                                                    velocityTracker6.computeCurrentVelocity(1000);
                                                }
                                                velocityTracker7 = fVar3.a;
                                                if (velocityTracker7 != null) {
                                                    xVelocity2 = velocityTracker7.getXVelocity();
                                                } else {
                                                    xVelocity2 = 0.0f;
                                                }
                                                velocityTracker8 = fVar3.a;
                                                if (velocityTracker8 != null) {
                                                    yVelocity2 = velocityTracker8.getYVelocity();
                                                } else {
                                                    yVelocity2 = 0.0f;
                                                }
                                                if (cVar.k != 0.0f) {
                                                    f7 = xVelocity2 / fArr[0];
                                                } else {
                                                    f7 = yVelocity2 / fArr[1];
                                                }
                                                motionLayout.I = f7;
                                            } else {
                                                motionLayout.I = 0.0f;
                                            }
                                            cVar.p = motionEvent.getRawX();
                                            cVar.q = motionEvent.getRawY();
                                        }
                                    }
                                }
                            }
                        }
                        bVar2.r = motionEvent.getRawX();
                        bVar2.s = motionEvent.getRawY();
                        if (motionEvent.getAction() == 1) {
                            velocityTracker = fVar.a;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                fVar2 = null;
                                fVar.a = null;
                            } else {
                                fVar2 = null;
                            }
                            bVar2.o = fVar2;
                            i2 = this.K;
                            if (i2 != -1) {
                                bVar2.a(i2, this);
                            }
                        }
                    }
                }
            } else if (!bVar2.m) {
                c0051b = bVar2.c;
                if (c0051b != null) {
                    fArr = cVar.n;
                    if (!bVar2.n) {
                        fVar3 = bVar2.o;
                        motionLayout = cVar.r;
                        z = cVar.j;
                        iVar = i.d;
                        if (z) {
                            iArr = cVar.o;
                            velocityTracker9 = fVar3.a;
                            if (velocityTracker9 != null) {
                                velocityTracker9.addMovement(motionEvent);
                            }
                            action2 = motionEvent.getAction();
                            if (action2 == 0) {
                                cVar.p = motionEvent.getRawX();
                                cVar.q = motionEvent.getRawY();
                                cVar.m = false;
                            } else if (action2 == 1) {
                                cVar.m = false;
                                velocityTracker10 = fVar3.a;
                                if (velocityTracker10 != null) {
                                    velocityTracker10.computeCurrentVelocity(16);
                                }
                                velocityTracker11 = fVar3.a;
                                if (velocityTracker11 != null) {
                                    xVelocity3 = velocityTracker11.getXVelocity();
                                } else {
                                    xVelocity3 = 0.0f;
                                }
                                velocityTracker12 = fVar3.a;
                                if (velocityTracker12 != null) {
                                    yVelocity3 = velocityTracker12.getYVelocity();
                                } else {
                                    yVelocity3 = 0.0f;
                                }
                                progress4 = motionLayout.getProgress();
                                width = motionLayout.getWidth() / 2.0f;
                                float height3 = motionLayout.getHeight() / 2.0f;
                                i6 = cVar.i;
                                if (i6 != -1) {
                                    View viewFindViewById5 = motionLayout.findViewById(i6);
                                    motionLayout.getLocationOnScreen(iArr);
                                    width = iArr[0] + ((viewFindViewById5.getRight() + viewFindViewById5.getLeft()) / 2.0f);
                                    f8 = iArr[1];
                                    top = viewFindViewById5.getTop();
                                    bottom = viewFindViewById5.getBottom();
                                } else {
                                    i7 = cVar.d;
                                    if (i7 != -1) {
                                        View viewFindViewById6 = motionLayout.findViewById(motionLayout.P.get(motionLayout.findViewById(i7)).f.z);
                                        motionLayout.getLocationOnScreen(iArr);
                                        width = iArr[0] + ((viewFindViewById6.getRight() + viewFindViewById6.getLeft()) / 2.0f);
                                        f8 = iArr[1];
                                        top = viewFindViewById6.getTop();
                                        bottom = viewFindViewById6.getBottom();
                                    } else {
                                        float rawX6 = motionEvent.getRawX() - width;
                                        float rawY6 = motionEvent.getRawY() - height3;
                                        double degrees4 = Math.toDegrees(Math.atan2(rawY6, rawX6));
                                        i8 = cVar.d;
                                        if (i8 != -1) {
                                            iVar2 = iVar;
                                            i9 = 6;
                                            cVar.r.J(i8, progress4, cVar.h, cVar.g, fArr);
                                            fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
                                            iVar2 = iVar;
                                            i9 = 6;
                                            fArr[1] = 360.0f;
                                        }
                                        degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY6, xVelocity3 + rawX6)) - degrees4)) * 62.5f;
                                        if (Float.isNaN(degrees)) {
                                            f9 = (((degrees * 3.0f) * cVar.v) / fArr[1]) + progress4;
                                        } else {
                                            f9 = progress4;
                                        }
                                        if (f9 != 0.0f) {
                                            iVar3 = iVar2;
                                            if (0.0f < f9) {
                                                motionLayout.setState(iVar3);
                                            } else {
                                                motionLayout.setState(iVar3);
                                            }
                                        } else {
                                            iVar3 = iVar2;
                                            if (0.0f < f9) {
                                                motionLayout.setState(iVar3);
                                            } else {
                                                motionLayout.setState(iVar3);
                                            }
                                        }
                                    }
                                }
                                height3 = ((bottom + top) / 2.0f) + f8;
                                float rawX7 = motionEvent.getRawX() - width;
                                float rawY7 = motionEvent.getRawY() - height3;
                                double degrees5 = Math.toDegrees(Math.atan2(rawY7, rawX7));
                                i8 = cVar.d;
                                if (i8 != -1) {
                                    iVar2 = iVar;
                                    i9 = 6;
                                    cVar.r.J(i8, progress4, cVar.h, cVar.g, fArr);
                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                } else {
                                    iVar2 = iVar;
                                    i9 = 6;
                                    fArr[1] = 360.0f;
                                }
                                degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY7, xVelocity3 + rawX7)) - degrees5)) * 62.5f;
                                if (Float.isNaN(degrees)) {
                                    f9 = (((degrees * 3.0f) * cVar.v) / fArr[1]) + progress4;
                                } else {
                                    f9 = progress4;
                                }
                                if (f9 != 0.0f) {
                                    iVar3 = iVar2;
                                    if (0.0f < f9) {
                                        motionLayout.setState(iVar3);
                                    } else {
                                        motionLayout.setState(iVar3);
                                    }
                                } else {
                                    iVar3 = iVar2;
                                    if (0.0f < f9) {
                                        motionLayout.setState(iVar3);
                                    } else {
                                        motionLayout.setState(iVar3);
                                    }
                                }
                            } else if (action2 == 2) {
                                motionEvent.getRawY();
                                motionEvent.getRawX();
                                width2 = motionLayout.getWidth() / 2.0f;
                                height = motionLayout.getHeight() / 2.0f;
                                i11 = cVar.i;
                                if (i11 != -1) {
                                    View viewFindViewById7 = motionLayout.findViewById(i11);
                                    motionLayout.getLocationOnScreen(iArr);
                                    float right2 = iArr[0] + ((viewFindViewById7.getRight() + viewFindViewById7.getLeft()) / 2.0f);
                                    float bottom3 = iArr[1] + ((viewFindViewById7.getBottom() + viewFindViewById7.getTop()) / 2.0f);
                                    width2 = right2;
                                    height = bottom3;
                                } else {
                                    i12 = cVar.d;
                                    if (i12 != -1) {
                                        viewFindViewById = motionLayout.findViewById(motionLayout.P.get(motionLayout.findViewById(i12)).f.z);
                                        if (viewFindViewById == null) {
                                            Log.e("TouchResponse", "could not find view to animate to");
                                        } else {
                                            motionLayout.getLocationOnScreen(iArr);
                                            width2 = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                            height = ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f) + iArr[1];
                                        }
                                    }
                                }
                                rawX2 = motionEvent.getRawX() - width2;
                                rawY2 = motionEvent.getRawY() - height;
                                dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width2);
                                fAtan2 = (float) (((dAtan2 - Math.atan2(cVar.q - height, cVar.p - width2)) * 180.0d) / 3.141592653589793d);
                                if (fAtan2 > 330.0f) {
                                    fAtan2 -= 360.0f;
                                } else if (fAtan2 < -330.0f) {
                                    fAtan2 += 360.0f;
                                }
                                f10 = fAtan2;
                                if (Math.abs(f10) <= 0.01d) {
                                    progress5 = motionLayout.getProgress();
                                    if (cVar.m) {
                                        z3 = true;
                                        cVar.m = true;
                                        motionLayout.setProgress(progress5);
                                    } else {
                                        z3 = true;
                                    }
                                    i13 = cVar.d;
                                    if (i13 != -1) {
                                        boolean z9 = z3;
                                        i14 = 1000;
                                        cVar.r.J(i13, progress5, cVar.h, cVar.g, fArr);
                                        fArr[z9 ? 1 : 0] = (float) Math.toDegrees(fArr[z9 ? 1 : 0]);
                                        r18 = z9;
                                    } else {
                                        boolean z10 = z3;
                                        i14 = 1000;
                                        fArr[z10 ? 1 : 0] = 360.0f;
                                        r18 = z10;
                                    }
                                    fMax2 = Math.max(Math.min(((f10 * cVar.v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                    progress6 = motionLayout.getProgress();
                                    if (fMax2 != progress6) {
                                        if (progress6 != 0.0f) {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            motionLayout.F(z4);
                                        } else {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            motionLayout.F(z4);
                                        }
                                        motionLayout.setProgress(fMax2);
                                        velocityTracker13 = fVar3.a;
                                        if (velocityTracker13 != null) {
                                            velocityTracker13.computeCurrentVelocity(i14);
                                        }
                                        velocityTracker14 = fVar3.a;
                                        if (velocityTracker14 != null) {
                                            xVelocity4 = velocityTracker14.getXVelocity();
                                        } else {
                                            xVelocity4 = 0.0f;
                                        }
                                        velocityTracker15 = fVar3.a;
                                        if (velocityTracker15 != null) {
                                            yVelocity4 = velocityTracker15.getYVelocity();
                                        } else {
                                            yVelocity4 = 0.0f;
                                        }
                                        double d6 = yVelocity4;
                                        double d7 = xVelocity4;
                                        motionLayout.I = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d6, d7) - dAtan2) * Math.hypot(d6, d7)) / Math.hypot(rawX2, rawY2)));
                                    } else {
                                        motionLayout.I = 0.0f;
                                    }
                                    cVar.p = motionEvent.getRawX();
                                    cVar.q = motionEvent.getRawY();
                                } else {
                                    progress5 = motionLayout.getProgress();
                                    if (cVar.m) {
                                        z3 = true;
                                        cVar.m = true;
                                        motionLayout.setProgress(progress5);
                                    } else {
                                        z3 = true;
                                    }
                                    i13 = cVar.d;
                                    if (i13 != -1) {
                                        boolean z11 = z3;
                                        i14 = 1000;
                                        cVar.r.J(i13, progress5, cVar.h, cVar.g, fArr);
                                        fArr[z11 ? 1 : 0] = (float) Math.toDegrees(fArr[z11 ? 1 : 0]);
                                        r18 = z11;
                                    } else {
                                        boolean z12 = z3;
                                        i14 = 1000;
                                        fArr[z12 ? 1 : 0] = 360.0f;
                                        r18 = z12;
                                    }
                                    fMax2 = Math.max(Math.min(((f10 * cVar.v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                    progress6 = motionLayout.getProgress();
                                    if (fMax2 != progress6) {
                                        if (progress6 != 0.0f) {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            motionLayout.F(z4);
                                        } else {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            motionLayout.F(z4);
                                        }
                                        motionLayout.setProgress(fMax2);
                                        velocityTracker13 = fVar3.a;
                                        if (velocityTracker13 != null) {
                                            velocityTracker13.computeCurrentVelocity(i14);
                                        }
                                        velocityTracker14 = fVar3.a;
                                        if (velocityTracker14 != null) {
                                            xVelocity4 = velocityTracker14.getXVelocity();
                                        } else {
                                            xVelocity4 = 0.0f;
                                        }
                                        velocityTracker15 = fVar3.a;
                                        if (velocityTracker15 != null) {
                                            yVelocity4 = velocityTracker15.getYVelocity();
                                        } else {
                                            yVelocity4 = 0.0f;
                                        }
                                        double d8 = yVelocity4;
                                        double d9 = xVelocity4;
                                        motionLayout.I = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d8, d9) - dAtan2) * Math.hypot(d8, d9)) / Math.hypot(rawX2, rawY2)));
                                    } else {
                                        motionLayout.I = 0.0f;
                                    }
                                    cVar.p = motionEvent.getRawX();
                                    cVar.q = motionEvent.getRawY();
                                }
                            }
                        } else {
                            velocityTracker2 = fVar3.a;
                            if (velocityTracker2 != null) {
                                velocityTracker2.addMovement(motionEvent);
                            }
                            action = motionEvent.getAction();
                            if (action == 0) {
                                cVar.p = motionEvent.getRawX();
                                cVar.q = motionEvent.getRawY();
                                cVar.m = false;
                            } else if (action == 1) {
                                cVar.m = false;
                                velocityTracker3 = fVar3.a;
                                if (velocityTracker3 != null) {
                                    velocityTracker3.computeCurrentVelocity(1000);
                                }
                                velocityTracker4 = fVar3.a;
                                if (velocityTracker4 != null) {
                                    xVelocity = velocityTracker4.getXVelocity();
                                } else {
                                    xVelocity = 0.0f;
                                }
                                velocityTracker5 = fVar3.a;
                                if (velocityTracker5 != null) {
                                    yVelocity = velocityTracker5.getYVelocity();
                                } else {
                                    yVelocity = 0.0f;
                                }
                                progress = motionLayout.getProgress();
                                i3 = cVar.d;
                                motionLayout2 = cVar.r;
                                if (i3 != -1) {
                                    motionLayout2.J(i3, progress, cVar.h, cVar.g, fArr);
                                    c2 = 1;
                                    c3 = 0;
                                } else {
                                    float fMin4 = Math.min(motionLayout2.getWidth(), motionLayout.getHeight());
                                    c2 = 1;
                                    fArr[1] = cVar.l * fMin4;
                                    c3 = 0;
                                    fArr[0] = fMin4 * cVar.k;
                                }
                                f2 = cVar.k;
                                f3 = fArr[c3];
                                f4 = fArr[c2];
                                if (f2 != 0.0f) {
                                    fAbs = xVelocity / f3;
                                } else {
                                    fAbs = yVelocity / f4;
                                }
                                if (Float.isNaN(fAbs)) {
                                    f5 = (fAbs / 3.0f) + progress;
                                } else {
                                    f5 = progress;
                                }
                                if (f5 == 0.0f) {
                                    if (0.0f < f5) {
                                        motionLayout.setState(iVar);
                                    } else {
                                        motionLayout.setState(iVar);
                                    }
                                } else if (0.0f < f5) {
                                    motionLayout.setState(iVar);
                                } else {
                                    motionLayout.setState(iVar);
                                }
                            } else if (action == 2) {
                                rawY = motionEvent.getRawY() - cVar.q;
                                rawX = motionEvent.getRawX() - cVar.p;
                                if (Math.abs((cVar.l * rawY) + (cVar.k * rawX)) <= cVar.x) {
                                    progress2 = motionLayout.getProgress();
                                    if (!cVar.m) {
                                        cVar.m = true;
                                        motionLayout.setProgress(progress2);
                                    }
                                    i5 = cVar.d;
                                    motionLayout3 = cVar.r;
                                    if (i5 != -1) {
                                        motionLayout3.J(i5, progress2, cVar.h, cVar.g, fArr);
                                        c4 = 1;
                                        c5 = 0;
                                    } else {
                                        float fMin5 = Math.min(motionLayout3.getWidth(), motionLayout.getHeight());
                                        c4 = 1;
                                        fArr[1] = cVar.l * fMin5;
                                        c5 = 0;
                                        fArr[0] = fMin5 * cVar.k;
                                    }
                                    if (Math.abs(((cVar.l * fArr[c4]) + (cVar.k * fArr[c5])) * cVar.v) < 0.01d) {
                                        fArr[0] = 0.01f;
                                        fArr[c4] = 0.01f;
                                    }
                                    if (cVar.k != 0.0f) {
                                        f6 = rawX / fArr[0];
                                    } else {
                                        f6 = rawY / fArr[c4];
                                    }
                                    fMax = Math.max(Math.min(progress2 + f6, 1.0f), 0.0f);
                                    if (cVar.c == 6) {
                                        fMax = Math.max(fMax, 0.01f);
                                    }
                                    if (cVar.c == 7) {
                                        fMax = Math.min(fMax, 0.99f);
                                    }
                                    progress3 = motionLayout.getProgress();
                                    if (fMax != progress3) {
                                        if (progress3 != 0.0f) {
                                            if (progress3 == 0.0f) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            motionLayout.F(z2);
                                        } else {
                                            if (progress3 == 0.0f) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            motionLayout.F(z2);
                                        }
                                        motionLayout.setProgress(fMax);
                                        velocityTracker6 = fVar3.a;
                                        if (velocityTracker6 != null) {
                                            velocityTracker6.computeCurrentVelocity(1000);
                                        }
                                        velocityTracker7 = fVar3.a;
                                        if (velocityTracker7 != null) {
                                            xVelocity2 = velocityTracker7.getXVelocity();
                                        } else {
                                            xVelocity2 = 0.0f;
                                        }
                                        velocityTracker8 = fVar3.a;
                                        if (velocityTracker8 != null) {
                                            yVelocity2 = velocityTracker8.getYVelocity();
                                        } else {
                                            yVelocity2 = 0.0f;
                                        }
                                        if (cVar.k != 0.0f) {
                                            f7 = xVelocity2 / fArr[0];
                                        } else {
                                            f7 = yVelocity2 / fArr[1];
                                        }
                                        motionLayout.I = f7;
                                    } else {
                                        motionLayout.I = 0.0f;
                                    }
                                    cVar.p = motionEvent.getRawX();
                                    cVar.q = motionEvent.getRawY();
                                } else {
                                    progress2 = motionLayout.getProgress();
                                    if (!cVar.m) {
                                        cVar.m = true;
                                        motionLayout.setProgress(progress2);
                                    }
                                    i5 = cVar.d;
                                    motionLayout3 = cVar.r;
                                    if (i5 != -1) {
                                        motionLayout3.J(i5, progress2, cVar.h, cVar.g, fArr);
                                        c4 = 1;
                                        c5 = 0;
                                    } else {
                                        float fMin6 = Math.min(motionLayout3.getWidth(), motionLayout.getHeight());
                                        c4 = 1;
                                        fArr[1] = cVar.l * fMin6;
                                        c5 = 0;
                                        fArr[0] = fMin6 * cVar.k;
                                    }
                                    if (Math.abs(((cVar.l * fArr[c4]) + (cVar.k * fArr[c5])) * cVar.v) < 0.01d) {
                                        fArr[0] = 0.01f;
                                        fArr[c4] = 0.01f;
                                    }
                                    if (cVar.k != 0.0f) {
                                        f6 = rawX / fArr[0];
                                    } else {
                                        f6 = rawY / fArr[c4];
                                    }
                                    fMax = Math.max(Math.min(progress2 + f6, 1.0f), 0.0f);
                                    if (cVar.c == 6) {
                                        fMax = Math.max(fMax, 0.01f);
                                    }
                                    if (cVar.c == 7) {
                                        fMax = Math.min(fMax, 0.99f);
                                    }
                                    progress3 = motionLayout.getProgress();
                                    if (fMax != progress3) {
                                        if (progress3 != 0.0f) {
                                            if (progress3 == 0.0f) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            motionLayout.F(z2);
                                        } else {
                                            if (progress3 == 0.0f) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            motionLayout.F(z2);
                                        }
                                        motionLayout.setProgress(fMax);
                                        velocityTracker6 = fVar3.a;
                                        if (velocityTracker6 != null) {
                                            velocityTracker6.computeCurrentVelocity(1000);
                                        }
                                        velocityTracker7 = fVar3.a;
                                        if (velocityTracker7 != null) {
                                            xVelocity2 = velocityTracker7.getXVelocity();
                                        } else {
                                            xVelocity2 = 0.0f;
                                        }
                                        velocityTracker8 = fVar3.a;
                                        if (velocityTracker8 != null) {
                                            yVelocity2 = velocityTracker8.getYVelocity();
                                        } else {
                                            yVelocity2 = 0.0f;
                                        }
                                        if (cVar.k != 0.0f) {
                                            f7 = xVelocity2 / fArr[0];
                                        } else {
                                            f7 = yVelocity2 / fArr[1];
                                        }
                                        motionLayout.I = f7;
                                    } else {
                                        motionLayout.I = 0.0f;
                                    }
                                    cVar.p = motionEvent.getRawX();
                                    cVar.q = motionEvent.getRawY();
                                }
                            }
                        }
                    }
                }
                bVar2.r = motionEvent.getRawX();
                bVar2.s = motionEvent.getRawY();
                if (motionEvent.getAction() == 1) {
                    velocityTracker = fVar.a;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        fVar2 = null;
                        fVar.a = null;
                    } else {
                        fVar2 = null;
                    }
                    bVar2.o = fVar2;
                    i2 = this.K;
                    if (i2 != -1) {
                        bVar2.a(i2, this);
                    }
                }
            }
        } else if (!bVar2.m) {
            c0051b = bVar2.c;
            if (c0051b != null && (cVar = c0051b.l) != null) {
                fArr = cVar.n;
                if (!bVar2.n) {
                    fVar3 = bVar2.o;
                    motionLayout = cVar.r;
                    z = cVar.j;
                    iVar = i.d;
                    if (z) {
                        iArr = cVar.o;
                        velocityTracker9 = fVar3.a;
                        if (velocityTracker9 != null) {
                            velocityTracker9.addMovement(motionEvent);
                        }
                        action2 = motionEvent.getAction();
                        if (action2 == 0) {
                            cVar.p = motionEvent.getRawX();
                            cVar.q = motionEvent.getRawY();
                            cVar.m = false;
                        } else if (action2 == 1) {
                            cVar.m = false;
                            velocityTracker10 = fVar3.a;
                            if (velocityTracker10 != null) {
                                velocityTracker10.computeCurrentVelocity(16);
                            }
                            velocityTracker11 = fVar3.a;
                            if (velocityTracker11 != null) {
                                xVelocity3 = velocityTracker11.getXVelocity();
                            } else {
                                xVelocity3 = 0.0f;
                            }
                            velocityTracker12 = fVar3.a;
                            if (velocityTracker12 != null) {
                                yVelocity3 = velocityTracker12.getYVelocity();
                            } else {
                                yVelocity3 = 0.0f;
                            }
                            progress4 = motionLayout.getProgress();
                            width = motionLayout.getWidth() / 2.0f;
                            float height4 = motionLayout.getHeight() / 2.0f;
                            i6 = cVar.i;
                            if (i6 != -1) {
                                View viewFindViewById8 = motionLayout.findViewById(i6);
                                motionLayout.getLocationOnScreen(iArr);
                                width = iArr[0] + ((viewFindViewById8.getRight() + viewFindViewById8.getLeft()) / 2.0f);
                                f8 = iArr[1];
                                top = viewFindViewById8.getTop();
                                bottom = viewFindViewById8.getBottom();
                            } else {
                                i7 = cVar.d;
                                if (i7 != -1) {
                                    View viewFindViewById9 = motionLayout.findViewById(motionLayout.P.get(motionLayout.findViewById(i7)).f.z);
                                    motionLayout.getLocationOnScreen(iArr);
                                    width = iArr[0] + ((viewFindViewById9.getRight() + viewFindViewById9.getLeft()) / 2.0f);
                                    f8 = iArr[1];
                                    top = viewFindViewById9.getTop();
                                    bottom = viewFindViewById9.getBottom();
                                } else {
                                    float rawX8 = motionEvent.getRawX() - width;
                                    float rawY8 = motionEvent.getRawY() - height4;
                                    double degrees6 = Math.toDegrees(Math.atan2(rawY8, rawX8));
                                    i8 = cVar.d;
                                    if (i8 != -1) {
                                        iVar2 = iVar;
                                        i9 = 6;
                                        cVar.r.J(i8, progress4, cVar.h, cVar.g, fArr);
                                        fArr[1] = (float) Math.toDegrees(fArr[1]);
                                    } else {
                                        iVar2 = iVar;
                                        i9 = 6;
                                        fArr[1] = 360.0f;
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY8, xVelocity3 + rawX8)) - degrees6)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                        f9 = (((degrees * 3.0f) * cVar.v) / fArr[1]) + progress4;
                                    } else {
                                        f9 = progress4;
                                    }
                                    if (f9 != 0.0f || f9 == 1.0f || (i10 = cVar.c) == 3) {
                                        iVar3 = iVar2;
                                        if (0.0f < f9 || 1.0f <= f9) {
                                            motionLayout.setState(iVar3);
                                        }
                                    } else {
                                        float fAbs2 = (degrees * cVar.v) / fArr[1];
                                        float f19 = ((double) f9) < 0.5d ? 0.0f : 1.0f;
                                        if (i10 == i9) {
                                            if (progress4 + fAbs2 < 0.0f) {
                                                fAbs2 = Math.abs(fAbs2);
                                            }
                                            f19 = 1.0f;
                                        }
                                        if (cVar.c == 7) {
                                            if (progress4 + fAbs2 > 1.0f) {
                                                fAbs2 = -Math.abs(fAbs2);
                                            }
                                            f19 = 0.0f;
                                        }
                                        motionLayout.S(cVar.c, f19, fAbs2 * 3.0f);
                                        if (0.0f >= progress4 || 1.0f <= progress4) {
                                            motionLayout.setState(iVar2);
                                        }
                                    }
                                }
                            }
                            height4 = ((bottom + top) / 2.0f) + f8;
                            float rawX9 = motionEvent.getRawX() - width;
                            float rawY9 = motionEvent.getRawY() - height4;
                            double degrees7 = Math.toDegrees(Math.atan2(rawY9, rawX9));
                            i8 = cVar.d;
                            if (i8 != -1) {
                                iVar2 = iVar;
                                i9 = 6;
                                cVar.r.J(i8, progress4, cVar.h, cVar.g, fArr);
                                fArr[1] = (float) Math.toDegrees(fArr[1]);
                            } else {
                                iVar2 = iVar;
                                i9 = 6;
                                fArr[1] = 360.0f;
                            }
                            degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY9, xVelocity3 + rawX9)) - degrees7)) * 62.5f;
                            if (Float.isNaN(degrees)) {
                                f9 = (((degrees * 3.0f) * cVar.v) / fArr[1]) + progress4;
                            } else {
                                f9 = progress4;
                            }
                            if (f9 != 0.0f) {
                                iVar3 = iVar2;
                                if (0.0f < f9) {
                                    motionLayout.setState(iVar3);
                                } else {
                                    motionLayout.setState(iVar3);
                                }
                            } else {
                                iVar3 = iVar2;
                                if (0.0f < f9) {
                                    motionLayout.setState(iVar3);
                                } else {
                                    motionLayout.setState(iVar3);
                                }
                            }
                        } else if (action2 == 2) {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            width2 = motionLayout.getWidth() / 2.0f;
                            height = motionLayout.getHeight() / 2.0f;
                            i11 = cVar.i;
                            if (i11 != -1) {
                                View viewFindViewById10 = motionLayout.findViewById(i11);
                                motionLayout.getLocationOnScreen(iArr);
                                float right3 = iArr[0] + ((viewFindViewById10.getRight() + viewFindViewById10.getLeft()) / 2.0f);
                                float bottom4 = iArr[1] + ((viewFindViewById10.getBottom() + viewFindViewById10.getTop()) / 2.0f);
                                width2 = right3;
                                height = bottom4;
                            } else {
                                i12 = cVar.d;
                                if (i12 != -1) {
                                    viewFindViewById = motionLayout.findViewById(motionLayout.P.get(motionLayout.findViewById(i12)).f.z);
                                    if (viewFindViewById == null) {
                                        Log.e("TouchResponse", "could not find view to animate to");
                                    } else {
                                        motionLayout.getLocationOnScreen(iArr);
                                        width2 = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                        height = ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f) + iArr[1];
                                    }
                                }
                            }
                            rawX2 = motionEvent.getRawX() - width2;
                            rawY2 = motionEvent.getRawY() - height;
                            dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width2);
                            fAtan2 = (float) (((dAtan2 - Math.atan2(cVar.q - height, cVar.p - width2)) * 180.0d) / 3.141592653589793d);
                            if (fAtan2 > 330.0f) {
                                fAtan2 -= 360.0f;
                            } else if (fAtan2 < -330.0f) {
                                fAtan2 += 360.0f;
                            }
                            f10 = fAtan2;
                            if (Math.abs(f10) <= 0.01d || cVar.m) {
                                progress5 = motionLayout.getProgress();
                                if (cVar.m) {
                                    z3 = true;
                                    cVar.m = true;
                                    motionLayout.setProgress(progress5);
                                } else {
                                    z3 = true;
                                }
                                i13 = cVar.d;
                                if (i13 != -1) {
                                    boolean z13 = z3;
                                    i14 = 1000;
                                    cVar.r.J(i13, progress5, cVar.h, cVar.g, fArr);
                                    fArr[z13 ? 1 : 0] = (float) Math.toDegrees(fArr[z13 ? 1 : 0]);
                                    r18 = z13;
                                } else {
                                    boolean z14 = z3;
                                    i14 = 1000;
                                    fArr[z14 ? 1 : 0] = 360.0f;
                                    r18 = z14;
                                }
                                fMax2 = Math.max(Math.min(((f10 * cVar.v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                progress6 = motionLayout.getProgress();
                                if (fMax2 != progress6) {
                                    if (progress6 != 0.0f || progress6 == 1.0f) {
                                        if (progress6 == 0.0f) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        motionLayout.F(z4);
                                    }
                                    motionLayout.setProgress(fMax2);
                                    velocityTracker13 = fVar3.a;
                                    if (velocityTracker13 != null) {
                                        velocityTracker13.computeCurrentVelocity(i14);
                                    }
                                    velocityTracker14 = fVar3.a;
                                    if (velocityTracker14 != null) {
                                        xVelocity4 = velocityTracker14.getXVelocity();
                                    } else {
                                        xVelocity4 = 0.0f;
                                    }
                                    velocityTracker15 = fVar3.a;
                                    if (velocityTracker15 != null) {
                                        yVelocity4 = velocityTracker15.getYVelocity();
                                    } else {
                                        yVelocity4 = 0.0f;
                                    }
                                    double d10 = yVelocity4;
                                    double d11 = xVelocity4;
                                    motionLayout.I = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d10, d11) - dAtan2) * Math.hypot(d10, d11)) / Math.hypot(rawX2, rawY2)));
                                } else {
                                    motionLayout.I = 0.0f;
                                }
                                cVar.p = motionEvent.getRawX();
                                cVar.q = motionEvent.getRawY();
                            }
                        }
                    } else {
                        velocityTracker2 = fVar3.a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        action = motionEvent.getAction();
                        if (action == 0) {
                            cVar.p = motionEvent.getRawX();
                            cVar.q = motionEvent.getRawY();
                            cVar.m = false;
                        } else if (action == 1) {
                            cVar.m = false;
                            velocityTracker3 = fVar3.a;
                            if (velocityTracker3 != null) {
                                velocityTracker3.computeCurrentVelocity(1000);
                            }
                            velocityTracker4 = fVar3.a;
                            if (velocityTracker4 != null) {
                                xVelocity = velocityTracker4.getXVelocity();
                            } else {
                                xVelocity = 0.0f;
                            }
                            velocityTracker5 = fVar3.a;
                            if (velocityTracker5 != null) {
                                yVelocity = velocityTracker5.getYVelocity();
                            } else {
                                yVelocity = 0.0f;
                            }
                            progress = motionLayout.getProgress();
                            i3 = cVar.d;
                            motionLayout2 = cVar.r;
                            if (i3 != -1) {
                                motionLayout2.J(i3, progress, cVar.h, cVar.g, fArr);
                                c2 = 1;
                                c3 = 0;
                            } else {
                                float fMin7 = Math.min(motionLayout2.getWidth(), motionLayout.getHeight());
                                c2 = 1;
                                fArr[1] = cVar.l * fMin7;
                                c3 = 0;
                                fArr[0] = fMin7 * cVar.k;
                            }
                            f2 = cVar.k;
                            f3 = fArr[c3];
                            f4 = fArr[c2];
                            if (f2 != 0.0f) {
                                fAbs = xVelocity / f3;
                            } else {
                                fAbs = yVelocity / f4;
                            }
                            if (Float.isNaN(fAbs)) {
                                f5 = (fAbs / 3.0f) + progress;
                            } else {
                                f5 = progress;
                            }
                            if (f5 == 0.0f && f5 != 1.0f && (i4 = cVar.c) != 3) {
                                float f20 = ((double) f5) < 0.5d ? 0.0f : 1.0f;
                                if (i4 == 6) {
                                    if (progress + fAbs < 0.0f) {
                                        fAbs = Math.abs(fAbs);
                                    }
                                    f20 = 1.0f;
                                }
                                if (cVar.c == 7) {
                                    if (progress + fAbs > 1.0f) {
                                        fAbs = -Math.abs(fAbs);
                                    }
                                    f20 = 0.0f;
                                }
                                motionLayout.S(cVar.c, f20, fAbs);
                                if (0.0f >= progress || 1.0f <= progress) {
                                    motionLayout.setState(iVar);
                                }
                            } else if (0.0f < f5 || 1.0f <= f5) {
                                motionLayout.setState(iVar);
                            }
                        } else if (action == 2) {
                            rawY = motionEvent.getRawY() - cVar.q;
                            rawX = motionEvent.getRawX() - cVar.p;
                            if (Math.abs((cVar.l * rawY) + (cVar.k * rawX)) <= cVar.x || cVar.m) {
                                progress2 = motionLayout.getProgress();
                                if (!cVar.m) {
                                    cVar.m = true;
                                    motionLayout.setProgress(progress2);
                                }
                                i5 = cVar.d;
                                motionLayout3 = cVar.r;
                                if (i5 != -1) {
                                    motionLayout3.J(i5, progress2, cVar.h, cVar.g, fArr);
                                    c4 = 1;
                                    c5 = 0;
                                } else {
                                    float fMin8 = Math.min(motionLayout3.getWidth(), motionLayout.getHeight());
                                    c4 = 1;
                                    fArr[1] = cVar.l * fMin8;
                                    c5 = 0;
                                    fArr[0] = fMin8 * cVar.k;
                                }
                                if (Math.abs(((cVar.l * fArr[c4]) + (cVar.k * fArr[c5])) * cVar.v) < 0.01d) {
                                    fArr[0] = 0.01f;
                                    fArr[c4] = 0.01f;
                                }
                                if (cVar.k != 0.0f) {
                                    f6 = rawX / fArr[0];
                                } else {
                                    f6 = rawY / fArr[c4];
                                }
                                fMax = Math.max(Math.min(progress2 + f6, 1.0f), 0.0f);
                                if (cVar.c == 6) {
                                    fMax = Math.max(fMax, 0.01f);
                                }
                                if (cVar.c == 7) {
                                    fMax = Math.min(fMax, 0.99f);
                                }
                                progress3 = motionLayout.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 != 0.0f || progress3 == 1.0f) {
                                        if (progress3 == 0.0f) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        motionLayout.F(z2);
                                    }
                                    motionLayout.setProgress(fMax);
                                    velocityTracker6 = fVar3.a;
                                    if (velocityTracker6 != null) {
                                        velocityTracker6.computeCurrentVelocity(1000);
                                    }
                                    velocityTracker7 = fVar3.a;
                                    if (velocityTracker7 != null) {
                                        xVelocity2 = velocityTracker7.getXVelocity();
                                    } else {
                                        xVelocity2 = 0.0f;
                                    }
                                    velocityTracker8 = fVar3.a;
                                    if (velocityTracker8 != null) {
                                        yVelocity2 = velocityTracker8.getYVelocity();
                                    } else {
                                        yVelocity2 = 0.0f;
                                    }
                                    if (cVar.k != 0.0f) {
                                        f7 = xVelocity2 / fArr[0];
                                    } else {
                                        f7 = yVelocity2 / fArr[1];
                                    }
                                    motionLayout.I = f7;
                                } else {
                                    motionLayout.I = 0.0f;
                                }
                                cVar.p = motionEvent.getRawX();
                                cVar.q = motionEvent.getRawY();
                            }
                        }
                    }
                }
            }
            bVar2.r = motionEvent.getRawX();
            bVar2.s = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (fVar = bVar2.o) != null) {
                velocityTracker = fVar.a;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    fVar2 = null;
                    fVar.a = null;
                } else {
                    fVar2 = null;
                }
                bVar2.o = fVar2;
                i2 = this.K;
                if (i2 != -1) {
                    bVar2.a(i2, this);
                }
            }
        }
        androidx.constraintlayout.motion.widget.b.C0051b c0051b7 = this.F.c;
        if ((c0051b7.r & 4) != 0) {
            return c0051b7.l.m;
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            CopyOnWriteArrayList<h> copyOnWriteArrayList = this.t0;
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.t0 = copyOnWriteArrayList;
            }
            copyOnWriteArrayList.add(motionHelper);
            if (motionHelper.y) {
                ArrayList<MotionHelper> arrayList = this.q0;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.q0 = arrayList;
                }
                arrayList.add(motionHelper);
            }
            if (motionHelper.z) {
                ArrayList<MotionHelper> arrayList2 = this.r0;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    this.r0 = arrayList2;
                }
                arrayList2.add(motionHelper);
            }
            if (motionHelper instanceof MotionEffect) {
                ArrayList<MotionHelper> arrayList3 = this.s0;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                    this.s0 = arrayList3;
                }
                arrayList3.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.q0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.r0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // defpackage.rlx
    public final void p(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // defpackage.rlx
    public final boolean q(View view, View view2, int i2, int i3) {
        androidx.constraintlayout.motion.widget.b.C0051b c0051b;
        androidx.constraintlayout.motion.widget.c cVar;
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        return (bVar == null || (c0051b = bVar.c) == null || (cVar = c0051b.l) == null || (cVar.w & 2) != 0) ? false : true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.b.C0051b c0051b;
        if (!this.z0 && this.K == -1 && (bVar = this.F) != null && (c0051b = bVar.c) != null) {
            int i2 = c0051b.q;
            if (i2 == 0) {
                return;
            }
            if (i2 == 2) {
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    this.P.get(getChildAt(i3)).d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int i2) {
        this.c0 = i2;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.M0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.O = z;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.F != null) {
            setState(i.c);
            Interpolator interpolatorE = this.F.e();
            if (interpolatorE != null) {
                setProgress(interpolatorE.getInterpolation(f2));
                return;
            }
        }
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList<MotionHelper> arrayList = this.r0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.r0.get(i2).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<MotionHelper> arrayList = this.q0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.q0.get(i2).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        if (f2 < 0.0f || f2 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            g gVar = this.J0;
            if (gVar == null) {
                gVar = new g();
                this.J0 = gVar;
            }
            gVar.a = f2;
            return;
        }
        i iVar = i.d;
        i iVar2 = i.c;
        if (f2 <= 0.0f) {
            if (this.T == 1.0f && this.K == this.L) {
                setState(iVar2);
            }
            this.K = this.J;
            if (this.T == 0.0f) {
                setState(iVar);
            }
        } else if (f2 >= 1.0f) {
            if (this.T == 0.0f && this.K == this.J) {
                setState(iVar2);
            }
            this.K = this.L;
            if (this.T == 1.0f) {
                setState(iVar);
            }
        } else {
            this.K = -1;
            setState(iVar2);
        }
        if (this.F == null) {
            return;
        }
        this.W = true;
        this.V = f2;
        this.S = f2;
        this.U = -1L;
        this.Q = -1L;
        this.G = null;
        this.a0 = true;
        invalidate();
    }

    public void setScene(androidx.constraintlayout.motion.widget.b bVar) {
        androidx.constraintlayout.motion.widget.c cVar;
        this.F = bVar;
        boolean zY = y();
        bVar.p = zY;
        androidx.constraintlayout.motion.widget.b.C0051b c0051b = bVar.c;
        if (c0051b != null && (cVar = c0051b.l) != null) {
            cVar.c(zY);
        }
        Q();
    }

    public void setStartState(int i2) {
        if (isAttachedToWindow()) {
            this.K = i2;
            return;
        }
        g gVar = this.J0;
        if (gVar == null) {
            gVar = new g();
            this.J0 = gVar;
        }
        gVar.c = i2;
        gVar.d = i2;
    }

    public void setState(i iVar) {
        i iVar2 = i.d;
        if (iVar == iVar2 && this.K == -1) {
            return;
        }
        i iVar3 = this.N0;
        this.N0 = iVar;
        i iVar4 = i.c;
        if (iVar3 == iVar4 && iVar == iVar4) {
            H();
        }
        int iOrdinal = iVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && iVar == iVar2) {
                I();
                return;
            }
            return;
        }
        if (iVar == iVar4) {
            H();
        }
        if (iVar == iVar2) {
            I();
        }
    }

    public void setTransition(int i2) {
        float f2;
        if (this.F != null) {
            androidx.constraintlayout.motion.widget.b.C0051b c0051bL = L(i2);
            this.J = c0051bL.d;
            this.L = c0051bL.c;
            if (!isAttachedToWindow()) {
                g gVar = this.J0;
                if (gVar == null) {
                    gVar = new g();
                    this.J0 = gVar;
                }
                gVar.c = this.J;
                gVar.d = this.L;
                return;
            }
            int i3 = this.K;
            if (i3 == this.J) {
                f2 = 0.0f;
            } else {
                f2 = i3 == this.L ? 1.0f : Float.NaN;
            }
            androidx.constraintlayout.motion.widget.b bVar = this.F;
            bVar.c = c0051bL;
            androidx.constraintlayout.motion.widget.c cVar = c0051bL.l;
            if (cVar != null) {
                cVar.c(bVar.p);
            }
            this.O0.e(this.F.b(this.J), this.F.b(this.L));
            Q();
            if (this.T != f2) {
                if (f2 == 0.0f) {
                    F(true);
                    this.F.b(this.J).b(this);
                } else if (f2 == 1.0f) {
                    F(false);
                    this.F.b(this.L).b(this);
                }
            }
            this.T = Float.isNaN(f2) ? 0.0f : f2;
            if (!Float.isNaN(f2)) {
                setProgress(f2);
            } else {
                Log.v("MotionLayout", zzc.b().concat(" transitionToStart "));
                U();
            }
        }
    }

    public void setTransitionDuration(int i2) {
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        androidx.constraintlayout.motion.widget.b.C0051b c0051b = bVar.c;
        if (c0051b != null) {
            c0051b.a(i2);
        } else {
            bVar.j = i2;
        }
    }

    public void setTransitionListener(h hVar) {
        this.b0 = hVar;
    }

    public void setTransitionState(Bundle bundle) {
        g gVar = this.J0;
        if (gVar == null) {
            gVar = new g();
            this.J0 = gVar;
        }
        gVar.getClass();
        gVar.a = bundle.getFloat("motion.progress");
        gVar.b = bundle.getFloat("motion.velocity");
        gVar.c = bundle.getInt("motion.StartState");
        gVar.d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.J0.a();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return zzc.c(context, this.J) + "->" + zzc.c(context, this.L) + " (pos:" + this.T + " Dpos/Dt:" + this.I;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void z(int i2) {
        this.z = null;
    }

    public final void N(AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.b bVar;
        U0 = isInEditMode();
        int i2 = -1;
        int i3 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wk30.v);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                int i5 = 2;
                if (index == 2) {
                    this.F = new androidx.constraintlayout.motion.widget.b(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.K = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.V = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.a0 = true;
                } else if (index == 0) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.c0 == 0) {
                        if (!typedArrayObtainStyledAttributes.getBoolean(index, false)) {
                            i5 = 0;
                        }
                        this.c0 = i5;
                    }
                } else if (index == 3) {
                    this.c0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.F == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.F = null;
            }
        }
        if (this.c0 != 0) {
            androidx.constraintlayout.motion.widget.b bVar2 = this.F;
            if (bVar2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int iH = bVar2.h();
                androidx.constraintlayout.motion.widget.b bVar3 = this.F;
                androidx.constraintlayout.widget.b bVarB = bVar3.b(bVar3.h());
                String strC = zzc.c(getContext(), iH);
                int childCount = getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    int id = childAt.getId();
                    if (id == -1) {
                        StringBuilder sbA = he.a("CHECK: ", strC, LGxrN.CbzTGyhD);
                        sbA.append(childAt.getClass().getName());
                        sbA.append(" does not!");
                        Log.w("MotionLayout", sbA.toString());
                    }
                    if (bVarB.p(id) == null) {
                        StringBuilder sbA2 = he.a("CHECK: ", strC, " NO CONSTRAINTS for ");
                        sbA2.append(zzc.d(childAt));
                        Log.w("MotionLayout", sbA2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) bVarB.g.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i7 = 0; i7 < length; i7++) {
                    iArr[i7] = numArr[i7].intValue();
                }
                for (int i8 = 0; i8 < length; i8++) {
                    int i9 = iArr[i8];
                    String strC2 = zzc.c(getContext(), i9);
                    if (findViewById(iArr[i8]) == null) {
                        Log.w("MotionLayout", "CHECK: " + strC + " NO View matches id " + strC2);
                    }
                    if (bVarB.o(i9).e.d == -1) {
                        Log.w("MotionLayout", tx5.a("CHECK: ", strC, "(", strC2, ") no LAYOUT_HEIGHT"));
                    }
                    if (bVarB.o(i9).e.c == -1) {
                        Log.w("MotionLayout", tx5.a("CHECK: ", strC, "(", strC2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                ArrayList<androidx.constraintlayout.motion.widget.b.C0051b> arrayList = this.F.d;
                int size = arrayList.size();
                while (i3 < size) {
                    androidx.constraintlayout.motion.widget.b.C0051b c0051b = arrayList.get(i3);
                    i3++;
                    androidx.constraintlayout.motion.widget.b.C0051b c0051b2 = c0051b;
                    if (c0051b2 == this.F.c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (c0051b2.d == c0051b2.c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i10 = c0051b2.d;
                    int i11 = c0051b2.c;
                    String strC3 = zzc.c(getContext(), i10);
                    String strC4 = zzc.c(getContext(), i11);
                    if (sparseIntArray.get(i10) == i11) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strC3 + "->" + strC4);
                    }
                    if (sparseIntArray2.get(i11) == i10) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strC3 + "->" + strC4);
                    }
                    sparseIntArray.put(i10, i11);
                    sparseIntArray2.put(i11, i10);
                    if (this.F.b(i10) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + strC3);
                    }
                    if (this.F.b(i11) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + strC3);
                    }
                }
            }
        }
        if (this.K == -1 && (bVar = this.F) != null) {
            this.K = bVar.h();
            this.J = this.F.h();
            androidx.constraintlayout.motion.widget.b.C0051b c0051b3 = this.F.c;
            if (c0051b3 != null) {
                i2 = c0051b3.c;
            }
            this.L = i2;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i2, int i3, int i4) {
        setState(i.b);
        this.K = i2;
        this.J = -1;
        this.L = -1;
        owa owaVar = this.z;
        if (owaVar != null) {
            owaVar.b(i2, i3, i4);
            return;
        }
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar != null) {
            bVar.b(i2).b(this);
        }
    }

    public void setProgress(float f2, float f3) {
        if (!isAttachedToWindow()) {
            g gVar = this.J0;
            if (gVar == null) {
                gVar = new g();
                this.J0 = gVar;
            }
            gVar.a = f2;
            gVar.b = f3;
            return;
        }
        setProgress(f2);
        setState(i.c);
        this.I = f3;
        if (f3 != 0.0f) {
            E(f3 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f2 == 0.0f || f2 == 1.0f) {
                return;
            }
            E(f2 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = null;
        this.I = 0.0f;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = 0;
        this.N = 0;
        this.O = true;
        this.P = new HashMap<>();
        this.Q = 0L;
        this.R = 1.0f;
        this.S = 0.0f;
        this.T = 0.0f;
        this.V = 0.0f;
        this.a0 = false;
        this.c0 = 0;
        this.e0 = false;
        this.f0 = new h1e0();
        this.g0 = new c();
        this.k0 = false;
        this.p0 = false;
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = 0;
        this.v0 = -1L;
        this.w0 = 0.0f;
        this.x0 = 0;
        this.y0 = 0.0f;
        this.z0 = false;
        this.H0 = new wlp();
        this.I0 = false;
        this.K0 = null;
        new HashMap();
        this.L0 = new Rect();
        this.M0 = false;
        this.N0 = i.a;
        this.O0 = new e();
        this.P0 = false;
        this.Q0 = new RectF();
        this.R0 = null;
        this.S0 = null;
        this.T0 = new ArrayList<>();
        N(attributeSet);
    }

    public void setTransition(int i2, int i3) {
        if (!isAttachedToWindow()) {
            g gVar = this.J0;
            if (gVar == null) {
                gVar = new g();
                this.J0 = gVar;
            }
            gVar.c = i2;
            gVar.d = i3;
            return;
        }
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        if (bVar != null) {
            this.J = i2;
            this.L = i3;
            bVar.o(i2, i3);
            this.O0.e(this.F.b(i2), this.F.b(i3));
            Q();
            this.T = 0.0f;
            U();
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.H = null;
        this.I = 0.0f;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = 0;
        this.N = 0;
        this.O = true;
        this.P = new HashMap<>();
        this.Q = 0L;
        this.R = 1.0f;
        this.S = 0.0f;
        this.T = 0.0f;
        this.V = 0.0f;
        this.a0 = false;
        this.c0 = 0;
        this.e0 = false;
        this.f0 = new h1e0();
        this.g0 = new c();
        this.k0 = false;
        this.p0 = false;
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = 0;
        this.v0 = -1L;
        this.w0 = 0.0f;
        this.x0 = 0;
        this.y0 = 0.0f;
        this.z0 = false;
        this.H0 = new wlp();
        this.I0 = false;
        this.K0 = null;
        new HashMap();
        this.L0 = new Rect();
        this.M0 = false;
        this.N0 = i.a;
        this.O0 = new e();
        this.P0 = false;
        this.Q0 = new RectF();
        this.R0 = null;
        this.S0 = null;
        this.T0 = new ArrayList<>();
        N(attributeSet);
    }

    public void setTransition(androidx.constraintlayout.motion.widget.b.C0051b c0051b) {
        androidx.constraintlayout.motion.widget.c cVar;
        androidx.constraintlayout.motion.widget.b bVar = this.F;
        bVar.c = c0051b;
        if (c0051b != null && (cVar = c0051b.l) != null) {
            cVar.c(bVar.p);
        }
        setState(i.b);
        int i2 = this.K;
        androidx.constraintlayout.motion.widget.b.C0051b c0051b2 = this.F.c;
        if (i2 == (c0051b2 == null ? -1 : c0051b2.c)) {
            this.T = 1.0f;
            this.S = 1.0f;
            this.V = 1.0f;
        } else {
            this.T = 0.0f;
            this.S = 0.0f;
            this.V = 0.0f;
        }
        this.U = (c0051b.r & 1) != 0 ? -1L : getNanoTime();
        int iH = this.F.h();
        androidx.constraintlayout.motion.widget.b bVar2 = this.F;
        androidx.constraintlayout.motion.widget.b.C0051b c0051b3 = bVar2.c;
        int i3 = c0051b3 != null ? c0051b3.c : -1;
        if (iH == this.J && i3 == this.L) {
            return;
        }
        this.J = iH;
        this.L = i3;
        bVar2.o(iH, i3);
        androidx.constraintlayout.widget.b bVarB = this.F.b(this.J);
        androidx.constraintlayout.widget.b bVarB2 = this.F.b(this.L);
        e eVar = this.O0;
        eVar.e(bVarB, bVarB2);
        int i4 = this.J;
        int i5 = this.L;
        eVar.e = i4;
        eVar.f = i5;
        eVar.f();
        Q();
    }
}
