package androidx.leanback.widget;

import android.animation.PropertyValuesHolder;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<q1.e> f12976a = new ArrayList(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Float> f12977b = new ArrayList(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Float> f12978c = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<s1> f12979d = new ArrayList(4);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends r1 {
        @Override // androidx.leanback.widget.r1
        public Number b(q1 q1Var) {
            if (this.f12976a.size() != 2) {
                throw new RuntimeException("Must use two marker values for direct mapping");
            }
            if (this.f12976a.get(0).a() != this.f12976a.get(1).a()) {
                throw new RuntimeException("Marker value must use same Property for direct mapping");
            }
            float fB = ((q1.b) this.f12976a.get(0)).b(q1Var);
            float fB2 = ((q1.b) this.f12976a.get(1)).b(q1Var);
            if (fB > fB2) {
                fB2 = fB;
                fB = fB2;
            }
            Float f10 = ((q1.a) this.f12976a.get(0).a()).get(q1Var);
            if (f10.floatValue() < fB) {
                return Float.valueOf(fB);
            }
            return f10.floatValue() > fB2 ? Float.valueOf(fB2) : f10;
        }

        @Override // androidx.leanback.widget.r1
        public float c(q1 q1Var) {
            float fG;
            int i10 = 0;
            int i11 = 0;
            float f10 = 0.0f;
            float f11 = 0.0f;
            while (i10 < this.f12976a.size()) {
                q1.b bVar = (q1.b) this.f12976a.get(i10);
                int iG = bVar.a().g();
                float fB = bVar.b(q1Var);
                float fE = q1Var.e(iG);
                if (i10 == 0) {
                    if (fE >= fB) {
                        return 0.0f;
                    }
                } else {
                    if (i11 == iG && f10 < fB) {
                        throw new IllegalStateException("marker value of same variable must be descendant order");
                    }
                    if (fE == Float.MAX_VALUE) {
                        return d((f10 - f11) / q1Var.g(), i10);
                    }
                    if (fE >= fB) {
                        if (i11 == iG) {
                            fG = (f10 - fE) / (f10 - fB);
                        } else if (f11 != -3.4028235E38f) {
                            f10 += fE - f11;
                            fG = (f10 - fE) / (f10 - fB);
                        } else {
                            fG = 1.0f - ((fE - fB) / q1Var.g());
                        }
                        return d(fG, i10);
                    }
                }
                i10++;
                f10 = fB;
                i11 = iG;
                f11 = fE;
            }
            return 1.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends r1 {
        @Override // androidx.leanback.widget.r1
        public Number b(q1 q1Var) {
            if (this.f12976a.size() != 2) {
                throw new RuntimeException("Must use two marker values for direct mapping");
            }
            if (this.f12976a.get(0).a() != this.f12976a.get(1).a()) {
                throw new RuntimeException("Marker value must use same Property for direct mapping");
            }
            int iB = ((q1.d) this.f12976a.get(0)).b(q1Var);
            int iB2 = ((q1.d) this.f12976a.get(1)).b(q1Var);
            if (iB > iB2) {
                iB2 = iB;
                iB = iB2;
            }
            Integer num = ((q1.c) this.f12976a.get(0).a()).get(q1Var);
            if (num.intValue() < iB) {
                return Integer.valueOf(iB);
            }
            return num.intValue() > iB2 ? Integer.valueOf(iB2) : num;
        }

        @Override // androidx.leanback.widget.r1
        public float c(q1 q1Var) {
            float fG;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i10 < this.f12976a.size()) {
                q1.d dVar = (q1.d) this.f12976a.get(i10);
                int iG = dVar.a().g();
                int iB = dVar.b(q1Var);
                int iF = q1Var.f(iG);
                if (i10 == 0) {
                    if (iF >= iB) {
                        return 0.0f;
                    }
                } else {
                    if (i11 == iG && i12 < iB) {
                        throw new IllegalStateException("marker value of same variable must be descendant order");
                    }
                    if (iF == Integer.MAX_VALUE) {
                        return d((i12 - i13) / q1Var.g(), i10);
                    }
                    if (iF >= iB) {
                        if (i11 == iG) {
                            fG = (i12 - iF) / (i12 - iB);
                        } else if (i13 != Integer.MIN_VALUE) {
                            i12 += iF - i13;
                            fG = (i12 - iF) / (i12 - iB);
                        } else {
                            fG = 1.0f - ((iF - iB) / q1Var.g());
                        }
                        return d(fG, i10);
                    }
                }
                i10++;
                i12 = iB;
                i11 = iG;
                i13 = iF;
            }
            return 1.0f;
        }
    }

    public final void a(s1 s1Var) {
        this.f12979d.add(s1Var);
    }

    public abstract Number b(q1 q1Var);

    public abstract float c(q1 q1Var);

    public final float d(float f10, int i10) {
        float size;
        float fFloatValue;
        if (this.f12976a.size() >= 3) {
            if (this.f12977b.size() == this.f12976a.size() - 1) {
                List<Float> list = this.f12978c;
                size = list.get(list.size() - 1).floatValue();
                f10 = (f10 * this.f12977b.get(i10 - 1).floatValue()) / size;
                if (i10 < 2) {
                    return f10;
                }
                fFloatValue = this.f12978c.get(i10 - 2).floatValue();
            } else {
                size = this.f12976a.size() - 1;
                f10 /= size;
                if (i10 >= 2) {
                    fFloatValue = i10 - 1;
                }
            }
            return f10 + (fFloatValue / size);
        }
        return f10;
    }

    public final List<q1.e> e() {
        return this.f12976a;
    }

    public final List<s1> f() {
        return this.f12979d;
    }

    @k.y0({k.y0.a.LIBRARY})
    public final List<Float> g() {
        return this.f12977b;
    }

    public final void h(q1 q1Var) {
        if (this.f12976a.size() < 2) {
            return;
        }
        if (this instanceof b) {
            q1Var.o();
        } else {
            q1Var.n();
        }
        Number numberB = null;
        float fC = 0.0f;
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f12979d.size(); i10++) {
            s1 s1Var = this.f12979d.get(i10);
            if (s1Var.b()) {
                if (numberB == null) {
                    numberB = b(q1Var);
                }
                s1Var.a(numberB);
            } else {
                if (!z10) {
                    fC = c(q1Var);
                    z10 = true;
                }
                s1Var.c(fC);
            }
        }
    }

    public final void i(s1 s1Var) {
        this.f12979d.remove(s1Var);
    }

    public final void j(q1.e... eVarArr) {
        this.f12976a.clear();
        for (q1.e eVar : eVarArr) {
            this.f12976a.add(eVar);
        }
    }

    @k.y0({k.y0.a.LIBRARY})
    public final void k(float... fArr) {
        int length = fArr.length;
        int i10 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i10 >= length) {
                this.f12977b.clear();
                this.f12978c.clear();
                for (float f11 : fArr) {
                    this.f12977b.add(Float.valueOf(f11));
                    f10 += f11;
                    this.f12978c.add(Float.valueOf(f10));
                }
                return;
            }
            if (fArr[i10] <= 0.0f) {
                throw new IllegalArgumentException();
            }
            i10++;
        }
    }

    public final r1 l(s1 s1Var) {
        this.f12979d.add(s1Var);
        return this;
    }

    public final r1 m(Object obj, PropertyValuesHolder propertyValuesHolder) {
        this.f12979d.add(new s1.b(obj, propertyValuesHolder));
        return this;
    }

    public final <T, V extends Number> r1 n(T t10, Property<T, V> property) {
        this.f12979d.add(new s1.a(t10, property));
        return this;
    }

    @k.y0({k.y0.a.LIBRARY})
    public final r1 o(float... fArr) {
        k(fArr);
        return this;
    }
}
