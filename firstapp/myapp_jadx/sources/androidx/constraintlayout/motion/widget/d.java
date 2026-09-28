package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.aai0;
import defpackage.gmp;
import defpackage.mlp;
import defpackage.n5w;
import defpackage.skf;
import defpackage.u5w;
import defpackage.wk30;
import defpackage.wlp;
import defpackage.z9i0;
import defpackage.zzc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public int a;
    public int e;
    public final gmp f;
    public final androidx.constraintlayout.widget.b.a g;
    public int j;
    public String k;
    public final Context o;
    public int b = -1;
    public boolean c = false;
    public int d = 0;
    public int h = -1;
    public int i = -1;
    public int l = 0;
    public String m = null;
    public int n = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;

    public static class a {
        public final int a;
        public final int b;
        public final n5w c;
        public final int d;
        public final e f;
        public final Interpolator g;
        public float i;
        public float j;
        public final boolean m;
        public final wlp e = new wlp();
        public boolean h = false;
        public final Rect l = new Rect();
        public long k = System.nanoTime();

        public a(e eVar, n5w n5wVar, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            this.m = false;
            this.f = eVar;
            this.c = n5wVar;
            this.d = i2;
            ArrayList<a> arrayList = eVar.d;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                eVar.d = arrayList;
            }
            arrayList.add(this);
            this.g = interpolator;
            this.a = i4;
            this.b = i5;
            if (i3 == 3) {
                this.m = true;
            }
            this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            a();
        }

        public final void a() {
            boolean z = this.h;
            int i = this.b;
            int i2 = this.a;
            Interpolator interpolator = this.g;
            n5w n5wVar = this.c;
            e eVar = this.f;
            if (z) {
                long jNanoTime = System.nanoTime();
                long j = jNanoTime - this.k;
                this.k = jNanoTime;
                float interpolation = this.i - (((float) (j * 1.0E-6d)) * this.j);
                this.i = interpolation;
                if (interpolation < 0.0f) {
                    this.i = 0.0f;
                    interpolation = 0.0f;
                }
                if (interpolator != null) {
                    interpolation = interpolator.getInterpolation(interpolation);
                }
                boolean zF = n5wVar.f(interpolation, jNanoTime, this.e, n5wVar.b);
                if (this.i <= 0.0f) {
                    if (i2 != -1) {
                        n5wVar.b.setTag(i2, Long.valueOf(System.nanoTime()));
                    }
                    if (i != -1) {
                        n5wVar.b.setTag(i, null);
                    }
                    eVar.e.add(this);
                }
                if (this.i > 0.0f || zF) {
                    eVar.a.invalidate();
                    return;
                }
                return;
            }
            long jNanoTime2 = System.nanoTime();
            long j2 = jNanoTime2 - this.k;
            this.k = jNanoTime2;
            float interpolation2 = (((float) (j2 * 1.0E-6d)) * this.j) + this.i;
            this.i = interpolation2;
            if (interpolation2 >= 1.0f) {
                this.i = 1.0f;
                interpolation2 = 1.0f;
            }
            if (interpolator != null) {
                interpolation2 = interpolator.getInterpolation(interpolation2);
            }
            boolean zF2 = n5wVar.f(interpolation2, jNanoTime2, this.e, n5wVar.b);
            if (this.i >= 1.0f) {
                if (i2 != -1) {
                    n5wVar.b.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    n5wVar.b.setTag(i, null);
                }
                if (!this.m) {
                    eVar.e.add(this);
                }
            }
            if (this.i < 1.0f || zF2) {
                eVar.a.invalidate();
            }
        }

        public final void b() {
            this.h = true;
            int i = this.d;
            if (i != -1) {
                this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            this.f.a.invalidate();
            this.k = System.nanoTime();
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0097 A[Catch: IOException -> 0x0043, XmlPullParserException -> 0x0046, TryCatch #2 {IOException -> 0x0043, XmlPullParserException -> 0x0046, blocks: (B:3:0x0028, B:37:0x00ca, B:11:0x0037, B:18:0x0049, B:19:0x0051, B:36:0x0097, B:21:0x0055, B:26:0x0066, B:24:0x005e, B:27:0x006e, B:29:0x0074, B:30:0x0078, B:32:0x0080, B:33:0x0088, B:35:0x0090), top: B:42:0x0028 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0097, please report this as an issue */
    public d(Context context, XmlResourceParser xmlResourceParser) {
        this.o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                Log.e("ViewTransition", zzc.a() + " unknown tag " + name);
                                StringBuilder sb = new StringBuilder();
                                sb.append(".xml:");
                                sb.append(xmlResourceParser.getLineNumber());
                                Log.e("ViewTransition", sb.toString());
                            } else {
                                this.g = androidx.constraintlayout.widget.b.d(context, xmlResourceParser);
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                Log.e("ViewTransition", zzc.a() + " unknown tag " + name);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(".xml:");
                                sb2.append(xmlResourceParser.getLineNumber());
                                Log.e("ViewTransition", sb2.toString());
                            } else {
                                this.f = new gmp(context, xmlResourceParser);
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                Log.e("ViewTransition", zzc.a() + " unknown tag " + name);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(".xml:");
                                sb3.append(xmlResourceParser.getLineNumber());
                                Log.e("ViewTransition", sb3.toString());
                            } else {
                                d(context, xmlResourceParser);
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                Log.e("ViewTransition", zzc.a() + " unknown tag " + name);
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(".xml:");
                                sb4.append(xmlResourceParser.getLineNumber());
                                Log.e("ViewTransition", sb4.toString());
                            } else {
                                androidx.constraintlayout.widget.a.d(context, xmlResourceParser, this.g.g);
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                Log.e("ViewTransition", zzc.a() + " unknown tag " + name);
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(".xml:");
                                sb5.append(xmlResourceParser.getLineNumber());
                                Log.e("ViewTransition", sb5.toString());
                            } else {
                                androidx.constraintlayout.widget.a.d(context, xmlResourceParser, this.g.g);
                            }
                            break;
                        default:
                            Log.e("ViewTransition", zzc.a() + " unknown tag " + name);
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(".xml:");
                            sb6.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb6.toString());
                            break;
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ViewTransition", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ViewTransition", "Error parsing XML resource", e2);
        }
    }

    public final void a(e eVar, MotionLayout motionLayout, int i, androidx.constraintlayout.widget.b bVar, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator aai0Var;
        if (this.c) {
            return;
        }
        int i2 = this.e;
        gmp gmpVar = this.f;
        int i3 = 0;
        if (i2 == 2) {
            View view = viewArr[0];
            n5w n5wVar = new n5w(view);
            u5w u5wVar = n5wVar.f;
            u5wVar.c = 0.0f;
            u5wVar.d = 0.0f;
            n5wVar.H = true;
            u5wVar.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            n5wVar.g.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            n5wVar.h.b(view);
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            n5wVar.i.b(view);
            ArrayList<mlp> arrayList = gmpVar.a.get(-1);
            if (arrayList != null) {
                n5wVar.w.addAll(arrayList);
            }
            n5wVar.i(motionLayout.getWidth(), System.nanoTime(), motionLayout.getHeight());
            int i4 = this.h;
            int i5 = this.i;
            int i6 = this.b;
            Context context = motionLayout.getContext();
            int i7 = this.l;
            if (i7 != -2) {
                if (i7 == -1) {
                    aai0Var = new aai0(skf.c(this.m));
                } else if (i7 == 0) {
                    interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                } else if (i7 == 1) {
                    interpolatorLoadInterpolator = new AccelerateInterpolator();
                } else if (i7 == 2) {
                    interpolatorLoadInterpolator = new DecelerateInterpolator();
                } else if (i7 == 4) {
                    interpolatorLoadInterpolator = new BounceInterpolator();
                } else if (i7 != 5) {
                    interpolatorLoadInterpolator = i7 != 6 ? null : new AnticipateInterpolator();
                } else {
                    interpolatorLoadInterpolator = new OvershootInterpolator();
                }
                new a(eVar, n5wVar, i4, i5, i6, aai0Var, this.p, this.q);
                return;
            }
            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.n);
            aai0Var = interpolatorLoadInterpolator;
            new a(eVar, n5wVar, i4, i5, i6, aai0Var, this.p, this.q);
            return;
        }
        androidx.constraintlayout.widget.b.a aVar = this.g;
        if (i2 == 1) {
            int[] constraintSetIds = motionLayout.getConstraintSetIds();
            int i8 = 0;
            while (i8 < constraintSetIds.length) {
                int i9 = constraintSetIds[i8];
                if (i9 != i) {
                    androidx.constraintlayout.widget.b bVarK = motionLayout.K(i9);
                    int length = viewArr.length;
                    for (int i10 = i3; i10 < length; i10++) {
                        androidx.constraintlayout.widget.b.a aVarP = bVarK.p(viewArr[i10].getId());
                        if (aVar != null) {
                            androidx.constraintlayout.widget.b.a.C0053a c0053a = aVar.h;
                            if (c0053a != null) {
                                c0053a.e(aVarP);
                            }
                            aVarP.g.putAll(aVar.g);
                        }
                    }
                }
                i8++;
                i3 = 0;
            }
        }
        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
        HashMap<Integer, androidx.constraintlayout.widget.b.a> map = bVar2.g;
        map.clear();
        for (Integer num : bVar.g.keySet()) {
            androidx.constraintlayout.widget.b.a aVar2 = bVar.g.get(num);
            if (aVar2 != null) {
                map.put(num, aVar2.clone());
            }
        }
        for (View view2 : viewArr) {
            androidx.constraintlayout.widget.b.a aVarP2 = bVar2.p(view2.getId());
            if (aVar != null) {
                androidx.constraintlayout.widget.b.a.C0053a c0053a2 = aVar.h;
                if (c0053a2 != null) {
                    c0053a2.e(aVarP2);
                }
                aVarP2.g.putAll(aVar.g);
            }
        }
        motionLayout.V(i, bVar2);
        motionLayout.V(R.id.view_transition, bVar);
        motionLayout.setState(R.id.view_transition, -1, -1);
        b.C0051b c0051b = new b.C0051b(motionLayout.F, i);
        for (View view3 : viewArr) {
            int i11 = this.h;
            if (i11 != -1) {
                c0051b.a(i11);
            }
            c0051b.p = this.d;
            int i12 = this.l;
            String str = this.m;
            int i13 = this.n;
            c0051b.e = i12;
            c0051b.f = str;
            c0051b.g = i13;
            int id = view3.getId();
            if (gmpVar != null) {
                ArrayList<mlp> arrayList2 = gmpVar.a.get(-1);
                gmp gmpVar2 = new gmp();
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    mlp mlpVar = arrayList2.get(i14);
                    i14++;
                    mlp mlpVarClone = mlpVar.clone();
                    mlpVarClone.b = id;
                    gmpVar2.b(mlpVarClone);
                }
                c0051b.k.add(gmpVar2);
            }
        }
        motionLayout.setTransition(c0051b);
        z9i0 z9i0Var = new z9i0(this, viewArr);
        motionLayout.E(1.0f);
        motionLayout.K0 = z9i0Var;
    }

    public final boolean b(View view) {
        int i = this.r;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.s;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        return this.k != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).Y) != null && str.matches(this.k);
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), wk30.G);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 8) {
                if (MotionLayout.U0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.j = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == 9) {
                this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
            } else if (index == 12) {
                this.c = typedArrayObtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == 10) {
                this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
            } else if (index == 4) {
                this.h = typedArrayObtainStyledAttributes.getInt(index, this.h);
            } else if (index == 13) {
                this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
            } else if (index == 14) {
                this.e = typedArrayObtainStyledAttributes.getInt(index, this.e);
            } else if (index == 7) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.l = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.l = -1;
                    } else {
                        this.n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    }
                } else {
                    this.l = typedArrayObtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == 11) {
                this.p = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
            } else if (index == 3) {
                this.q = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == 6) {
                this.r = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == 5) {
                this.s = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == 2) {
                this.u = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
            } else if (index == 1) {
                this.t = typedArrayObtainStyledAttributes.getInteger(index, this.t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + zzc.c(this.o, this.a) + ")";
    }
}
