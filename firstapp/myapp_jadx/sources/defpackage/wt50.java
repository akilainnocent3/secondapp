package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class wt50 extends d.c implements yma, qcf, mrr {
    public final psw D;
    public final boolean E;
    public final float F;
    public final nld G;
    public final mld H;
    public bxd0 I;
    public float J;
    public boolean L;
    public long K = 0;
    public final etw<mp20> M = new etw<>((Object) null);

    @c0d(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", l = {364}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        /* JADX INFO: renamed from: wt50$a$a, reason: collision with other inner class name */
        public static final class C1266a<T> implements myh {
            public final /* synthetic */ wt50 a;
            public final /* synthetic */ v5b b;

            public C1266a(wt50 wt50Var, v5b v5bVar) {
                this.a = wt50Var;
                this.b = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                float f;
                xxo xxoVar = (xxo) obj;
                boolean z = xxoVar instanceof mp20;
                wt50 wt50Var = this.a;
                if (!z) {
                    bxd0 bxd0Var = wt50Var.I;
                    if (bxd0Var == null) {
                        bxd0Var = new bxd0(wt50Var.E, wt50Var.H);
                        rcf.a(wt50Var);
                        wt50Var.I = bxd0Var;
                    }
                    ArrayList arrayList = bxd0Var.d;
                    if (xxoVar instanceof vkm) {
                        arrayList.add(xxoVar);
                    } else if (xxoVar instanceof wkm) {
                        arrayList.remove(((wkm) xxoVar).a);
                    } else if (xxoVar instanceof c4i) {
                        arrayList.add(xxoVar);
                    } else if (xxoVar instanceof d4i) {
                        arrayList.remove(((d4i) xxoVar).a);
                    } else if (xxoVar instanceof i9f.b) {
                        arrayList.add(xxoVar);
                    } else if (xxoVar instanceof i9f.c) {
                        arrayList.remove(((i9f.c) xxoVar).a);
                    } else if (xxoVar instanceof i9f.a) {
                        arrayList.remove(((i9f.a) xxoVar).a);
                    }
                    xxo xxoVar2 = (xxo) CollectionsKt.d0(arrayList);
                    if (!Intrinsics.g(bxd0Var.e, xxoVar2)) {
                        v5b v5bVar = this.b;
                        if (xxoVar2 != null) {
                            nt50 nt50VarInvoke = bxd0Var.b.invoke();
                            boolean z2 = xxoVar2 instanceof vkm;
                            if (z2) {
                                f = nt50VarInvoke.c;
                            } else if (xxoVar2 instanceof c4i) {
                                f = nt50VarInvoke.b;
                            } else {
                                f = xxoVar2 instanceof i9f.b ? nt50VarInvoke.a : 0.0f;
                            }
                            gzg0<Float> gzg0Var = vt50.a;
                            if (!z2 && ((xxoVar2 instanceof c4i) || (xxoVar2 instanceof i9f.b))) {
                                gzg0Var = new gzg0<>(45, xkf.d, 2);
                            }
                            ej5.c(v5bVar, null, null, new zwd0(bxd0Var, f, gzg0Var, null), 3);
                        } else {
                            xxo xxoVar3 = bxd0Var.e;
                            gzg0<Float> gzg0Var2 = vt50.a;
                            if (!(xxoVar3 instanceof vkm) && !(xxoVar3 instanceof c4i) && (xxoVar3 instanceof i9f.b)) {
                                gzg0Var2 = new gzg0<>(150, xkf.d, 2);
                            }
                            ej5.c(v5bVar, null, null, new axd0(bxd0Var, gzg0Var2, null), 3);
                        }
                        bxd0Var.e = xxoVar2;
                    }
                } else if (wt50Var.L) {
                    wt50Var.p2((mp20) xxoVar);
                } else {
                    wt50Var.M.g(xxoVar);
                }
                return Unit.a;
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = wt50.this.new a(v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            v5b v5bVar = (v5b) this.b;
            wt50 wt50Var = wt50.this;
            b390 b390VarB = wt50Var.D.b();
            C1266a c1266a = new C1266a(wt50Var, v5bVar);
            this.a = 1;
            b390VarB.collect(c1266a, this);
            return y5bVar;
        }
    }

    public wt50(psw pswVar, boolean z, float f, nld nldVar, mld mldVar) {
        this.D = pswVar;
        this.E = z;
        this.F = f;
        this.G = nldVar;
        this.H = mldVar;
    }

    @Override // defpackage.qcf
    public final void A(wsr wsrVar) {
        qc6 qc6Var = wsrVar.a;
        wsrVar.b2();
        bxd0 bxd0Var = this.I;
        if (bxd0Var != null) {
            float f = this.J;
            long jA = this.G.a();
            float fFloatValue = bxd0Var.c.d().floatValue();
            if (fFloatValue > 0.0f) {
                long jC = j58.c(fFloatValue, jA);
                if (bxd0Var.a) {
                    float fD = yw90.d(qc6Var.d());
                    float fB = yw90.b(qc6Var.d());
                    qc6.b bVar = qc6Var.b;
                    long jD = bVar.d();
                    bVar.a().p();
                    try {
                        bVar.a.b(0.0f, 0.0f, fD, fB, 1);
                        tcf.n0(wsrVar, jC, f, 0L, 0.0f, null, 124);
                        hrh.a(bVar, jD);
                    } catch (Throwable th) {
                        hrh.a(bVar, jD);
                        throw th;
                    }
                } else {
                    tcf.n0(wsrVar, jC, f, 0L, 0.0f, null, 124);
                }
            }
        }
        ua0 ua0Var = (ua0) this;
        lc6 lc6VarA = qc6Var.b.a();
        RippleHostView rippleHostView = ua0Var.O;
        if (rippleHostView != null) {
            rippleHostView.m0setRipplePropertiesbiQXAtU(ua0Var.K, ycv.b(ua0Var.J), ua0Var.G.a(), ((nt50) ua0Var.H.invoke()).d);
            rippleHostView.draw(i40.c(lc6VarA));
        }
    }

    @Override // defpackage.mrr
    public final void M(long j) {
        float fC1;
        this.L = true;
        mmd mmdVar = pkd.f(this).N;
        this.K = kc6.d(j);
        float f = this.F;
        if (Float.isNaN(f)) {
            long j2 = this.K;
            float fD = yw90.d(j2);
            fC1 = gly.d((((long) Float.floatToRawIntBits(yw90.b(j2))) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32)) / 2.0f;
            if (this.E) {
                fC1 += mmdVar.C1(10.0f);
            }
        } else {
            fC1 = mmdVar.C1(f);
        }
        this.J = fC1;
        etw<mp20> etwVar = this.M;
        Object[] objArr = etwVar.a;
        int i = etwVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            p2((mp20) objArr[i2]);
        }
        etwVar.i();
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        ej5.c(d2(), null, null, new a(null), 3);
    }

    public final void p2(mp20 mp20Var) {
        RippleHostView rippleHostView;
        if (!(mp20Var instanceof mp20.b)) {
            if (mp20Var instanceof mp20.c) {
                RippleHostView rippleHostView2 = ((ua0) this).O;
                if (rippleHostView2 != null) {
                    rippleHostView2.d();
                    return;
                }
                return;
            }
            if (!(mp20Var instanceof mp20.a) || (rippleHostView = ((ua0) this).O) == null) {
                return;
            }
            rippleHostView.d();
            return;
        }
        mp20.b bVar = (mp20.b) mp20Var;
        long j = this.K;
        float f = this.J;
        ua0 ua0Var = (ua0) this;
        RippleContainer rippleContainer = ua0Var.N;
        int i = 0;
        if (rippleContainer == null) {
            Object obj = (View) zma.a(ua0Var, AndroidCompositionLocals_androidKt.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    kb5.a(aya.b(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    RippleContainer rippleContainer2 = new RippleContainer(viewGroup.getContext());
                    viewGroup.addView(rippleContainer2);
                    rippleContainer = rippleContainer2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof RippleContainer) {
                        rippleContainer = (RippleContainer) childAt;
                        break;
                    }
                    i2++;
                }
            }
            ua0Var.N = rippleContainer;
        }
        ArrayList arrayList = rippleContainer.b;
        rt50 rt50Var = rippleContainer.d;
        LinkedHashMap linkedHashMap = rt50Var.a;
        LinkedHashMap linkedHashMap2 = rt50Var.a;
        LinkedHashMap linkedHashMap3 = rt50Var.b;
        RippleHostView rippleHostView3 = (RippleHostView) linkedHashMap.get(ua0Var);
        if (rippleHostView3 == null) {
            ArrayList arrayList2 = rippleContainer.c;
            arrayList2.getClass();
            rippleHostView3 = (RippleHostView) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (rippleHostView3 == null) {
                if (rippleContainer.e > b.j(arrayList)) {
                    rippleHostView3 = new RippleHostView(rippleContainer.getContext());
                    rippleContainer.addView(rippleHostView3);
                    arrayList.add(rippleHostView3);
                } else {
                    rippleHostView3 = (RippleHostView) arrayList.get(rippleContainer.e);
                    qt50 qt50Var = (qt50) linkedHashMap3.get(rippleHostView3);
                    if (qt50Var != null) {
                        qt50Var.o1();
                        RippleHostView rippleHostView4 = (RippleHostView) linkedHashMap2.get(qt50Var);
                        if (rippleHostView4 != null) {
                        }
                        linkedHashMap2.remove(qt50Var);
                        rippleHostView3.c();
                    }
                }
                int i3 = rippleContainer.e;
                if (i3 < rippleContainer.a - 1) {
                    rippleContainer.e = i3 + 1;
                } else {
                    rippleContainer.e = 0;
                }
            }
            linkedHashMap2.put(ua0Var, rippleHostView3);
            linkedHashMap3.put(rippleHostView3, ua0Var);
        }
        int iB = ycv.b(f);
        long jA = ua0Var.G.a();
        float f2 = ((nt50) ua0Var.H.invoke()).d;
        ta0 ta0Var = new ta0(ua0Var, i);
        RippleHostView rippleHostView5 = rippleHostView3;
        rippleHostView5.b(bVar, ua0Var.E, j, iB, jA, f2, ta0Var);
        ua0Var.O = rippleHostView5;
        rcf.a(ua0Var);
    }
}
