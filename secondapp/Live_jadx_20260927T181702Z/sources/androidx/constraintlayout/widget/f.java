package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f7951c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f7952d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f7953e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f7954f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f7955g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f7956h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f7957i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f7958j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f7959k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f7960l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f7961m = -2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f7962n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f7963o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConstraintLayout.b f7964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f7965b;

    public f(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.b)) {
            throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
        }
        this.f7964a = (ConstraintLayout.b) layoutParams;
        this.f7965b = view;
    }

    public f A(float f10) {
        this.f7964a.L = f10;
        return this;
    }

    public f B(int i10, int i11) {
        switch (i10) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.f7964a).leftMargin = i11;
                return this;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.f7964a).rightMargin = i11;
                return this;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.f7964a).topMargin = i11;
                return this;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.f7964a).bottomMargin = i11;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f7964a.setMarginStart(i11);
                return this;
            case 7:
                this.f7964a.setMarginEnd(i11);
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public f C(int i10) {
        switch (i10) {
            case 1:
                ConstraintLayout.b bVar = this.f7964a;
                bVar.f7796f = -1;
                bVar.f7794e = -1;
                ((ViewGroup.MarginLayoutParams) bVar).leftMargin = -1;
                bVar.f7830w = Integer.MIN_VALUE;
                return this;
            case 2:
                ConstraintLayout.b bVar2 = this.f7964a;
                bVar2.f7800h = -1;
                bVar2.f7798g = -1;
                ((ViewGroup.MarginLayoutParams) bVar2).rightMargin = -1;
                bVar2.f7833y = Integer.MIN_VALUE;
                return this;
            case 3:
                ConstraintLayout.b bVar3 = this.f7964a;
                bVar3.f7804j = -1;
                bVar3.f7802i = -1;
                ((ViewGroup.MarginLayoutParams) bVar3).topMargin = -1;
                bVar3.f7832x = Integer.MIN_VALUE;
                return this;
            case 4:
                ConstraintLayout.b bVar4 = this.f7964a;
                bVar4.f7806k = -1;
                bVar4.f7808l = -1;
                ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin = -1;
                bVar4.f7834z = Integer.MIN_VALUE;
                return this;
            case 5:
                this.f7964a.f7810m = -1;
                return this;
            case 6:
                ConstraintLayout.b bVar5 = this.f7964a;
                bVar5.f7822s = -1;
                bVar5.f7824t = -1;
                bVar5.setMarginStart(-1);
                this.f7964a.A = Integer.MIN_VALUE;
                return this;
            case 7:
                ConstraintLayout.b bVar6 = this.f7964a;
                bVar6.f7826u = -1;
                bVar6.f7828v = -1;
                bVar6.setMarginEnd(-1);
                this.f7964a.B = Integer.MIN_VALUE;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public f D() {
        ConstraintLayout.b bVar = this.f7964a;
        int i10 = bVar.f7796f;
        int i11 = bVar.f7798g;
        if (i10 != -1 || i11 != -1) {
            f fVar = new f(((ViewGroup) this.f7965b.getParent()).findViewById(i10));
            f fVar2 = new f(((ViewGroup) this.f7965b.getParent()).findViewById(i11));
            ConstraintLayout.b bVar2 = this.f7964a;
            if (i10 != -1 && i11 != -1) {
                fVar.m(2, i11, 1, 0);
                fVar2.m(1, i10, 2, 0);
            } else if (i10 != -1 || i11 != -1) {
                int i12 = bVar2.f7800h;
                if (i12 != -1) {
                    fVar.m(2, i12, 2, 0);
                } else {
                    int i13 = bVar2.f7794e;
                    if (i13 != -1) {
                        fVar2.m(1, i13, 1, 0);
                    }
                }
            }
            C(1);
            C(2);
            return this;
        }
        int i14 = bVar.f7822s;
        int i15 = bVar.f7826u;
        if (i14 != -1 || i15 != -1) {
            f fVar3 = new f(((ViewGroup) this.f7965b.getParent()).findViewById(i14));
            f fVar4 = new f(((ViewGroup) this.f7965b.getParent()).findViewById(i15));
            ConstraintLayout.b bVar3 = this.f7964a;
            if (i14 != -1 && i15 != -1) {
                fVar3.m(7, i15, 6, 0);
                fVar4.m(6, i10, 7, 0);
            } else if (i10 != -1 || i15 != -1) {
                int i16 = bVar3.f7800h;
                if (i16 != -1) {
                    fVar3.m(7, i16, 7, 0);
                } else {
                    int i17 = bVar3.f7794e;
                    if (i17 != -1) {
                        fVar4.m(6, i17, 6, 0);
                    }
                }
            }
        }
        C(6);
        C(7);
        return this;
    }

    public f E() {
        ConstraintLayout.b bVar = this.f7964a;
        int i10 = bVar.f7804j;
        int i11 = bVar.f7806k;
        if (i10 != -1 || i11 != -1) {
            f fVar = new f(((ViewGroup) this.f7965b.getParent()).findViewById(i10));
            f fVar2 = new f(((ViewGroup) this.f7965b.getParent()).findViewById(i11));
            ConstraintLayout.b bVar2 = this.f7964a;
            if (i10 != -1 && i11 != -1) {
                fVar.m(4, i11, 3, 0);
                fVar2.m(3, i10, 4, 0);
            } else if (i10 != -1 || i11 != -1) {
                int i12 = bVar2.f7808l;
                if (i12 != -1) {
                    fVar.m(4, i12, 4, 0);
                } else {
                    int i13 = bVar2.f7802i;
                    if (i13 != -1) {
                        fVar2.m(3, i13, 3, 0);
                    }
                }
            }
        }
        C(3);
        C(4);
        return this;
    }

    public f F(float f10) {
        this.f7965b.setRotation(f10);
        return this;
    }

    public f G(float f10) {
        this.f7965b.setRotationX(f10);
        return this;
    }

    public f H(float f10) {
        this.f7965b.setRotationY(f10);
        return this;
    }

    public f I(float f10) {
        this.f7965b.setScaleY(f10);
        return this;
    }

    public final String K(int i10) {
        switch (i10) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public f L(float f10, float f11) {
        this.f7965b.setPivotX(f10);
        this.f7965b.setPivotY(f11);
        return this;
    }

    public f M(float f10) {
        this.f7965b.setPivotX(f10);
        return this;
    }

    public f N(float f10) {
        this.f7965b.setPivotY(f10);
        return this;
    }

    public f O(float f10, float f11) {
        this.f7965b.setTranslationX(f10);
        this.f7965b.setTranslationY(f11);
        return this;
    }

    public f P(float f10) {
        this.f7965b.setTranslationX(f10);
        return this;
    }

    public f Q(float f10) {
        this.f7965b.setTranslationY(f10);
        return this;
    }

    public f R(float f10) {
        this.f7965b.setTranslationZ(f10);
        return this;
    }

    public f S(float f10) {
        this.f7964a.H = f10;
        return this;
    }

    public f T(int i10) {
        this.f7964a.O = i10;
        return this;
    }

    public f U(float f10) {
        this.f7964a.M = f10;
        return this;
    }

    public f V(int i10) {
        this.f7965b.setVisibility(i10);
        return this;
    }

    public f a(int i10, int i11) {
        m(1, i10, i10 == 0 ? 1 : 2, 0);
        m(2, i11, i11 == 0 ? 2 : 1, 0);
        if (i10 != 0) {
            new f(((ViewGroup) this.f7965b.getParent()).findViewById(i10)).m(2, this.f7965b.getId(), 1, 0);
        }
        if (i11 != 0) {
            new f(((ViewGroup) this.f7965b.getParent()).findViewById(i11)).m(1, this.f7965b.getId(), 2, 0);
        }
        return this;
    }

    public f b(int i10, int i11) {
        m(6, i10, i10 == 0 ? 6 : 7, 0);
        m(7, i11, i11 == 0 ? 7 : 6, 0);
        if (i10 != 0) {
            new f(((ViewGroup) this.f7965b.getParent()).findViewById(i10)).m(7, this.f7965b.getId(), 6, 0);
        }
        if (i11 != 0) {
            new f(((ViewGroup) this.f7965b.getParent()).findViewById(i11)).m(6, this.f7965b.getId(), 7, 0);
        }
        return this;
    }

    public f c(int i10, int i11) {
        m(3, i10, i10 == 0 ? 3 : 4, 0);
        m(4, i11, i11 == 0 ? 4 : 3, 0);
        if (i10 != 0) {
            new f(((ViewGroup) this.f7965b.getParent()).findViewById(i10)).m(4, this.f7965b.getId(), 3, 0);
        }
        if (i11 != 0) {
            new f(((ViewGroup) this.f7965b.getParent()).findViewById(i11)).m(3, this.f7965b.getId(), 4, 0);
        }
        return this;
    }

    public f d(float f10) {
        this.f7965b.setAlpha(f10);
        return this;
    }

    public f f(int i10, int i11, int i12, int i13, int i14, int i15, float f10) {
        if (i12 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f10 <= 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i11 == 1 || i11 == 2) {
            m(1, i10, i11, i12);
            m(2, i13, i14, i15);
            this.f7964a.G = f10;
            return this;
        }
        if (i11 == 6 || i11 == 7) {
            m(6, i10, i11, i12);
            m(7, i13, i14, i15);
            this.f7964a.G = f10;
            return this;
        }
        m(3, i10, i11, i12);
        m(4, i13, i14, i15);
        this.f7964a.H = f10;
        return this;
    }

    public f g(int i10) {
        if (i10 == 0) {
            f(0, 1, 0, 0, 2, 0, 0.5f);
            return this;
        }
        f(i10, 2, 0, i10, 1, 0, 0.5f);
        return this;
    }

    public f h(int i10, int i11, int i12, int i13, int i14, int i15, float f10) {
        m(1, i10, i11, i12);
        m(2, i13, i14, i15);
        this.f7964a.G = f10;
        return this;
    }

    public f i(int i10) {
        if (i10 == 0) {
            f(0, 6, 0, 0, 7, 0, 0.5f);
            return this;
        }
        f(i10, 7, 0, i10, 6, 0, 0.5f);
        return this;
    }

    public f j(int i10, int i11, int i12, int i13, int i14, int i15, float f10) {
        m(6, i10, i11, i12);
        m(7, i13, i14, i15);
        this.f7964a.G = f10;
        return this;
    }

    public f k(int i10) {
        if (i10 == 0) {
            f(0, 3, 0, 0, 4, 0, 0.5f);
            return this;
        }
        f(i10, 4, 0, i10, 3, 0, 0.5f);
        return this;
    }

    public f l(int i10, int i11, int i12, int i13, int i14, int i15, float f10) {
        m(3, i10, i11, i12);
        m(4, i13, i14, i15);
        this.f7964a.H = f10;
        return this;
    }

    public f m(int i10, int i11, int i12, int i13) {
        switch (i10) {
            case 1:
                if (i12 == 1) {
                    ConstraintLayout.b bVar = this.f7964a;
                    bVar.f7794e = i11;
                    bVar.f7796f = -1;
                } else {
                    if (i12 != 2) {
                        throw new IllegalArgumentException("Left to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.b bVar2 = this.f7964a;
                    bVar2.f7796f = i11;
                    bVar2.f7794e = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f7964a).leftMargin = i13;
                return this;
            case 2:
                if (i12 == 1) {
                    ConstraintLayout.b bVar3 = this.f7964a;
                    bVar3.f7798g = i11;
                    bVar3.f7800h = -1;
                } else {
                    if (i12 != 2) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.b bVar4 = this.f7964a;
                    bVar4.f7800h = i11;
                    bVar4.f7798g = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f7964a).rightMargin = i13;
                return this;
            case 3:
                if (i12 == 3) {
                    ConstraintLayout.b bVar5 = this.f7964a;
                    bVar5.f7802i = i11;
                    bVar5.f7804j = -1;
                    bVar5.f7810m = -1;
                    bVar5.f7812n = -1;
                    bVar5.f7814o = -1;
                } else {
                    if (i12 != 4) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.b bVar6 = this.f7964a;
                    bVar6.f7804j = i11;
                    bVar6.f7802i = -1;
                    bVar6.f7810m = -1;
                    bVar6.f7812n = -1;
                    bVar6.f7814o = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f7964a).topMargin = i13;
                return this;
            case 4:
                if (i12 == 4) {
                    ConstraintLayout.b bVar7 = this.f7964a;
                    bVar7.f7808l = i11;
                    bVar7.f7806k = -1;
                    bVar7.f7810m = -1;
                    bVar7.f7812n = -1;
                    bVar7.f7814o = -1;
                } else {
                    if (i12 != 3) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.b bVar8 = this.f7964a;
                    bVar8.f7806k = i11;
                    bVar8.f7808l = -1;
                    bVar8.f7810m = -1;
                    bVar8.f7812n = -1;
                    bVar8.f7814o = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f7964a).bottomMargin = i13;
                return this;
            case 5:
                if (i12 == 5) {
                    ConstraintLayout.b bVar9 = this.f7964a;
                    bVar9.f7810m = i11;
                    bVar9.f7808l = -1;
                    bVar9.f7806k = -1;
                    bVar9.f7802i = -1;
                    bVar9.f7804j = -1;
                } else if (i12 == 3) {
                    ConstraintLayout.b bVar10 = this.f7964a;
                    bVar10.f7812n = i11;
                    bVar10.f7808l = -1;
                    bVar10.f7806k = -1;
                    bVar10.f7802i = -1;
                    bVar10.f7804j = -1;
                } else {
                    if (i12 != 4) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.b bVar11 = this.f7964a;
                    bVar11.f7814o = i11;
                    bVar11.f7808l = -1;
                    bVar11.f7806k = -1;
                    bVar11.f7802i = -1;
                    bVar11.f7804j = -1;
                }
                this.f7964a.D = i13;
                return this;
            case 6:
                if (i12 == 6) {
                    ConstraintLayout.b bVar12 = this.f7964a;
                    bVar12.f7824t = i11;
                    bVar12.f7822s = -1;
                } else {
                    if (i12 != 7) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.b bVar13 = this.f7964a;
                    bVar13.f7822s = i11;
                    bVar13.f7824t = -1;
                }
                this.f7964a.setMarginStart(i13);
                return this;
            case 7:
                if (i12 == 7) {
                    ConstraintLayout.b bVar14 = this.f7964a;
                    bVar14.f7828v = i11;
                    bVar14.f7826u = -1;
                } else {
                    if (i12 != 6) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.b bVar15 = this.f7964a;
                    bVar15.f7826u = i11;
                    bVar15.f7828v = -1;
                }
                this.f7964a.setMarginEnd(i13);
                return this;
            default:
                throw new IllegalArgumentException(K(i10) + " to " + K(i12) + " unknown");
        }
    }

    public f n(int i10) {
        this.f7964a.Q = i10;
        return this;
    }

    public f o(int i10) {
        this.f7964a.P = i10;
        return this;
    }

    public f p(int i10) {
        ((ViewGroup.MarginLayoutParams) this.f7964a).height = i10;
        return this;
    }

    public f q(int i10) {
        this.f7964a.U = i10;
        return this;
    }

    public f r(int i10) {
        this.f7964a.T = i10;
        return this;
    }

    public f s(int i10) {
        this.f7964a.S = i10;
        return this;
    }

    public f t(int i10) {
        this.f7964a.R = i10;
        return this;
    }

    public f u(int i10) {
        ((ViewGroup.MarginLayoutParams) this.f7964a).width = i10;
        return this;
    }

    public f v(String str) {
        this.f7964a.I = str;
        return this;
    }

    public f w(float f10) {
        this.f7965b.setElevation(f10);
        return this;
    }

    public f x(int i10, int i11) {
        switch (i10) {
            case 1:
                this.f7964a.f7830w = i11;
                return this;
            case 2:
                this.f7964a.f7833y = i11;
                return this;
            case 3:
                this.f7964a.f7832x = i11;
                return this;
            case 4:
                this.f7964a.f7834z = i11;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f7964a.A = i11;
                return this;
            case 7:
                this.f7964a.B = i11;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public f y(float f10) {
        this.f7964a.G = f10;
        return this;
    }

    public f z(int i10) {
        this.f7964a.N = i10;
        return this;
    }

    public f J(float f10) {
        return this;
    }

    public void e() {
    }
}
