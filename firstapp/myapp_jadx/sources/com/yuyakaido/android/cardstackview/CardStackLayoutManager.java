package com.yuyakaido.android.cardstackview;

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.sportybet.android.gp.tz.R;
import defpackage.ah6;
import defpackage.bh6;
import defpackage.ch6;
import defpackage.cld0;
import defpackage.eh6;
import defpackage.eme0;
import defpackage.gs50;
import defpackage.kke0;
import defpackage.qqe;

/* JADX INFO: loaded from: classes8.dex */
public class CardStackLayoutManager extends RecyclerView.o implements RecyclerView.y.b {
    public final Context E;
    public final ah6 F;
    public final bh6 G;
    public final eh6 H;

    public class a implements Runnable {
        public final /* synthetic */ qqe a;

        public a(qqe qqeVar) {
            this.a = qqeVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CardStackLayoutManager cardStackLayoutManager = CardStackLayoutManager.this;
            ah6 ah6Var = cardStackLayoutManager.F;
            ah6Var.b1(this.a);
            if (cardStackLayoutManager.U0() != null) {
                cardStackLayoutManager.U0();
                int i = cardStackLayoutManager.H.f;
                ah6Var.getClass();
            }
        }
    }

    public CardStackLayoutManager(Context context, ah6 ah6Var) {
        this.F = ah6.h;
        bh6 bh6Var = new bh6();
        bh6Var.a = cld0.a;
        bh6Var.b = 3;
        bh6Var.c = 8.0f;
        bh6Var.d = 0.95f;
        bh6Var.e = 0.3f;
        bh6Var.f = qqe.e;
        bh6Var.g = true;
        bh6Var.h = true;
        bh6Var.i = eme0.a;
        bh6Var.j = new kke0(qqe.b, r.d.DEFAULT_DRAG_ANIMATION_DURATION, new AccelerateInterpolator());
        qqe qqeVar = qqe.a;
        bh6Var.k = new gs50(new DecelerateInterpolator());
        bh6Var.l = new LinearInterpolator();
        this.G = bh6Var;
        eh6 eh6Var = new eh6();
        eh6Var.a = eh6.a.a;
        eh6Var.b = 0;
        eh6Var.c = 0;
        eh6Var.d = 0;
        eh6Var.e = 0;
        eh6Var.f = 0;
        eh6Var.g = -1;
        eh6Var.h = 0.0f;
        this.H = eh6Var;
        this.E = context;
        this.F = ah6Var;
    }

    public static void V0(View view) {
        View viewFindViewById = view.findViewById(R.id.left_overlay);
        if (viewFindViewById != null) {
            viewFindViewById.setAlpha(0.0f);
        }
        View viewFindViewById2 = view.findViewById(R.id.right_overlay);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setAlpha(0.0f);
        }
        View viewFindViewById3 = view.findViewById(R.id.top_overlay);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setAlpha(0.0f);
        }
        View viewFindViewById4 = view.findViewById(R.id.bottom_overlay);
        if (viewFindViewById4 != null) {
            viewFindViewById4.setAlpha(0.0f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.LayoutParams G() {
        return new RecyclerView.LayoutParams(-1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int G0(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        eh6 eh6Var = this.H;
        if (eh6Var.f == a()) {
            return 0;
        }
        int iOrdinal = eh6Var.a.ordinal();
        bh6 bh6Var = this.G;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    eh6Var.d -= i;
                    X0(uVar);
                    return i;
                }
                if (iOrdinal != 3) {
                    if (iOrdinal == 5 && bh6Var.i.b()) {
                        eh6Var.d -= i;
                        X0(uVar);
                        return i;
                    }
                } else if (bh6Var.i.a()) {
                    eh6Var.d -= i;
                    X0(uVar);
                    return i;
                }
            } else if (bh6Var.i.b()) {
                eh6Var.d -= i;
                X0(uVar);
                return i;
            }
        } else if (bh6Var.i.b()) {
            eh6Var.d -= i;
            X0(uVar);
            return i;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void H0(int i) {
        if (this.G.i.a()) {
            int iA = a();
            eh6 eh6Var = this.H;
            if (i != eh6Var.f && i >= 0 && iA >= i) {
                eh6.a aVar = eh6Var.a;
                aVar.getClass();
                if (aVar != eh6.a.a) {
                    return;
                }
                eh6Var.f = i;
                F0();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int I0(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        eh6 eh6Var = this.H;
        if (eh6Var.f == a()) {
            return 0;
        }
        int iOrdinal = eh6Var.a.ordinal();
        bh6 bh6Var = this.G;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    eh6Var.e -= i;
                    X0(uVar);
                    return i;
                }
                if (iOrdinal != 3) {
                    if (iOrdinal == 5 && bh6Var.i.b()) {
                        eh6Var.e -= i;
                        X0(uVar);
                        return i;
                    }
                } else if (bh6Var.i.a()) {
                    eh6Var.e -= i;
                    X0(uVar);
                    return i;
                }
            } else if (bh6Var.i.b()) {
                eh6Var.e -= i;
                X0(uVar);
                return i;
            }
        } else if (bh6Var.i.b()) {
            eh6Var.e -= i;
            X0(uVar);
            return i;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void R0(RecyclerView recyclerView, int i) {
        if (this.G.i.a()) {
            int iA = a();
            eh6 eh6Var = this.H;
            if (i != eh6Var.f && i >= 0 && iA >= i) {
                eh6.a aVar = eh6Var.a;
                aVar.getClass();
                if (aVar != eh6.a.a) {
                    return;
                }
                if (eh6Var.f >= i) {
                    W0(i);
                    return;
                }
                eh6Var.h = 0.0f;
                eh6Var.g = i;
                ch6 ch6Var = new ch6(ch6.a.a, this);
                ch6Var.a = eh6Var.f;
                S0(ch6Var);
            }
        }
    }

    public final View U0() {
        return F(this.H.f);
    }

    public final void W0(int i) {
        View viewU0 = U0();
        eh6 eh6Var = this.H;
        if (viewU0 != null) {
            U0();
            this.F.j0(eh6Var.f);
        }
        eh6Var.h = 0.0f;
        eh6Var.g = i;
        eh6Var.f--;
        ch6 ch6Var = new ch6(ch6.a.b, this);
        ch6Var.a = eh6Var.f;
        S0(ch6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    public final void X0(RecyclerView.u uVar) {
        eh6.a aVar;
        char c;
        char c2;
        int i = this.C;
        eh6 eh6Var = this.H;
        eh6Var.b = i;
        eh6Var.c = this.D;
        eh6.a aVar2 = eh6Var.a;
        aVar2.getClass();
        char c3 = 3;
        int i2 = 1;
        ?? r10 = 0;
        if ((aVar2 == eh6.a.f || aVar2 == eh6.a.d) && eh6Var.f < eh6Var.g && (eh6Var.b < Math.abs(eh6Var.d) || eh6Var.c < Math.abs(eh6Var.e))) {
            D0(U0(), uVar);
            qqe qqeVarA = eh6Var.a();
            int iOrdinal = eh6Var.a.ordinal();
            if (iOrdinal != 3) {
                aVar = iOrdinal != 5 ? eh6.a.a : eh6.a.i;
            } else {
                aVar = eh6.a.e;
            }
            eh6Var.a = aVar;
            int i3 = eh6Var.f + 1;
            eh6Var.f = i3;
            eh6Var.d = 0;
            eh6Var.e = 0;
            if (i3 == eh6Var.g) {
                eh6Var.g = -1;
            }
            new Handler().post(new a(qqeVarA));
        }
        E(uVar);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = this.C - getPaddingLeft();
        int paddingBottom = this.D - getPaddingBottom();
        int i4 = eh6Var.f;
        while (true) {
            int i5 = eh6Var.f;
            bh6 bh6Var = this.G;
            if (i4 < i5 + bh6Var.b && i4 < a()) {
                View viewD = uVar.d(i4);
                p(viewD, r10, r10);
                c0(viewD);
                b0(viewD, paddingLeft, paddingTop, paddingLeft2, paddingBottom);
                viewD.setTranslationX(0.0f);
                viewD.setTranslationY(0.0f);
                viewD.setScaleX(1.0f);
                viewD.setScaleY(1.0f);
                viewD.setRotation(0.0f);
                V0(viewD);
                int i6 = eh6Var.f;
                if (i4 == i6) {
                    viewD.setTranslationX(eh6Var.d);
                    viewD.setTranslationY(eh6Var.e);
                    viewD.setScaleX(1.0f);
                    viewD.setScaleY(1.0f);
                    viewD.setRotation(((eh6Var.d * 20.0f) / this.C) * eh6Var.h);
                    View viewFindViewById = viewD.findViewById(R.id.left_overlay);
                    if (viewFindViewById != null) {
                        viewFindViewById.setAlpha(0.0f);
                    }
                    View viewFindViewById2 = viewD.findViewById(R.id.right_overlay);
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.setAlpha(0.0f);
                    }
                    View viewFindViewById3 = viewD.findViewById(R.id.top_overlay);
                    if (viewFindViewById3 != null) {
                        viewFindViewById3.setAlpha(0.0f);
                    }
                    View viewFindViewById4 = viewD.findViewById(R.id.bottom_overlay);
                    if (viewFindViewById4 != null) {
                        viewFindViewById4.setAlpha(0.0f);
                    }
                    qqe qqeVarA2 = eh6Var.a();
                    float interpolation = bh6Var.l.getInterpolation(eh6Var.b());
                    int iOrdinal2 = qqeVarA2.ordinal();
                    if (iOrdinal2 == 0) {
                        c2 = 3;
                        if (viewFindViewById != null) {
                            viewFindViewById.setAlpha(interpolation);
                        }
                    } else if (iOrdinal2 == i2) {
                        c2 = 3;
                        if (viewFindViewById2 != null) {
                            viewFindViewById2.setAlpha(interpolation);
                        }
                    } else if (iOrdinal2 != 2) {
                        c2 = 3;
                        if (iOrdinal2 == 3 && viewFindViewById4 != null) {
                            viewFindViewById4.setAlpha(interpolation);
                        }
                    } else {
                        c2 = 3;
                        if (viewFindViewById3 != null) {
                            viewFindViewById3.setAlpha(interpolation);
                        }
                    }
                    c = c2;
                } else {
                    c = c3;
                    int i7 = i4 - i6;
                    int i8 = i7 - 1;
                    int i9 = (int) ((bh6Var.c * this.E.getResources().getDisplayMetrics().density) + 0.5f);
                    float f = i7 * i9;
                    float fB = f - (eh6Var.b() * (f - (i9 * i8)));
                    switch (bh6Var.a.ordinal()) {
                        case 1:
                            viewD.setTranslationY(-fB);
                            break;
                        case 2:
                            float f2 = -fB;
                            viewD.setTranslationY(f2);
                            viewD.setTranslationX(f2);
                            break;
                        case 3:
                            viewD.setTranslationY(-fB);
                            viewD.setTranslationX(fB);
                            break;
                        case 4:
                            viewD.setTranslationY(fB);
                            break;
                        case 5:
                            viewD.setTranslationY(fB);
                            viewD.setTranslationX(-fB);
                            break;
                        case 6:
                            viewD.setTranslationY(fB);
                            viewD.setTranslationX(fB);
                            break;
                        case 7:
                            viewD.setTranslationX(-fB);
                            break;
                        case 8:
                            viewD.setTranslationX(fB);
                            break;
                    }
                    float f3 = 1.0f - bh6Var.d;
                    float f4 = 1.0f - (i7 * f3);
                    float fB2 = (eh6Var.b() * ((1.0f - (f3 * i8)) - f4)) + f4;
                    switch (bh6Var.a.ordinal()) {
                        case 0:
                            viewD.setScaleX(fB2);
                            viewD.setScaleY(fB2);
                            break;
                        case 1:
                            viewD.setScaleX(fB2);
                            break;
                        case 2:
                            viewD.setScaleX(fB2);
                            break;
                        case 3:
                            viewD.setScaleX(fB2);
                            break;
                        case 4:
                            viewD.setScaleX(fB2);
                            break;
                        case 5:
                            viewD.setScaleX(fB2);
                            break;
                        case 6:
                            viewD.setScaleX(fB2);
                            break;
                        case 7:
                            viewD.setScaleY(fB2);
                            break;
                        case 8:
                            viewD.setScaleY(fB2);
                            break;
                    }
                    viewD.setRotation(0.0f);
                    V0(viewD);
                }
                i4++;
                c3 = c;
                i2 = 1;
                r10 = 0;
            }
        }
        eh6.a aVar3 = eh6Var.a;
        aVar3.getClass();
        if (aVar3 == eh6.a.b) {
            eh6Var.a();
            eh6Var.b();
            this.F.getClass();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public final PointF b(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean s() {
        bh6 bh6Var = this.G;
        eme0 eme0Var = bh6Var.i;
        return (eme0Var.a() || eme0Var.b()) && bh6Var.g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean t() {
        bh6 bh6Var = this.G;
        eme0 eme0Var = bh6Var.i;
        return (eme0Var.a() || eme0Var.b()) && bh6Var.h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void t0(RecyclerView.u uVar, RecyclerView.z zVar) {
        X0(uVar);
        if (!zVar.f || U0() == null) {
            return;
        }
        U0();
        int i = this.H.f;
        this.F.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void x0(int i) {
        eh6 eh6Var = this.H;
        if (i != 0) {
            if (i == 1 && this.G.i.b()) {
                eh6Var.a = eh6.a.b;
                return;
            }
            return;
        }
        int i2 = eh6Var.g;
        eh6.a aVar = eh6.a.a;
        if (i2 == -1) {
            eh6Var.a = aVar;
            eh6Var.g = -1;
            return;
        }
        int i3 = eh6Var.f;
        if (i3 == i2) {
            eh6Var.a = aVar;
            eh6Var.g = -1;
        } else {
            if (i3 >= i2) {
                W0(i2);
                return;
            }
            eh6Var.h = 0.0f;
            eh6Var.g = i2;
            ch6 ch6Var = new ch6(ch6.a.a, this);
            ch6Var.a = eh6Var.f;
            S0(ch6Var);
        }
    }
}
