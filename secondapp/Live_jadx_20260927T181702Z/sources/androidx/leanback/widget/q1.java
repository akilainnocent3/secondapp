package androidx.leanback.widget;

import android.util.Property;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1<PropertyT extends Property> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<PropertyT> f12914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<PropertyT> f12915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f12916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f12917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<r1> f12918e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends Property<q1, Float> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final float f12919b = -3.4028235E38f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final float f12920c = Float.MAX_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12921a;

        public a(String str, int i10) {
            super(Float.class, str);
            this.f12921a = i10;
        }

        public final e a(float f10, float f11) {
            return new b(this, f10, f11);
        }

        public final e b(float f10) {
            return new b(this, f10, 0.0f);
        }

        public final e c(float f10) {
            return new b(this, 0.0f, f10);
        }

        public final e d() {
            return new b(this, 0.0f, 1.0f);
        }

        public final e e() {
            return new b(this, 0.0f);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Float get(q1 q1Var) {
            return Float.valueOf(q1Var.e(this.f12921a));
        }

        public final int g() {
            return this.f12921a;
        }

        public final float h(q1 q1Var) {
            return q1Var.e(this.f12921a);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final void set(q1 q1Var, Float f10) {
            q1Var.k(this.f12921a, f10.floatValue());
        }

        public final void j(q1 q1Var, float f10) {
            q1Var.k(this.f12921a, f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends e<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f12922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f12923c;

        public b(a aVar, float f10) {
            this(aVar, f10, 0.0f);
        }

        public final float b(q1 q1Var) {
            return this.f12923c == 0.0f ? this.f12922b : this.f12922b + (q1Var.g() * this.f12923c);
        }

        public b(a aVar, float f10, float f11) {
            super(aVar);
            this.f12922b = f10;
            this.f12923c = f11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends Property<q1, Integer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f12924b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f12925c = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12926a;

        public c(String str, int i10) {
            super(Integer.class, str);
            this.f12926a = i10;
        }

        public final e a(int i10, float f10) {
            return new d(this, i10, f10);
        }

        public final e b(int i10) {
            return new d(this, i10, 0.0f);
        }

        public final e c(float f10) {
            return new d(this, 0, f10);
        }

        public final e d() {
            return new d(this, 0, 1.0f);
        }

        public final e e() {
            return new d(this, 0);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Integer get(q1 q1Var) {
            return Integer.valueOf(q1Var.f(this.f12926a));
        }

        public final int g() {
            return this.f12926a;
        }

        public final int h(q1 q1Var) {
            return q1Var.f(this.f12926a);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final void set(q1 q1Var, Integer num) {
            q1Var.l(this.f12926a, num.intValue());
        }

        public final void j(q1 q1Var, int i10) {
            q1Var.l(this.f12926a, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends e<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f12928c;

        public d(c cVar, int i10) {
            this(cVar, i10, 0.0f);
        }

        public final int b(q1 q1Var) {
            return this.f12928c == 0.0f ? this.f12927b : this.f12927b + Math.round(q1Var.g() * this.f12928c);
        }

        public d(c cVar, int i10, float f10) {
            super(cVar);
            this.f12927b = i10;
            this.f12928c = f10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e<PropertyT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PropertyT f12929a;

        public e(PropertyT propertyt) {
            this.f12929a = propertyt;
        }

        public PropertyT a() {
            return this.f12929a;
        }
    }

    public q1() {
        ArrayList arrayList = new ArrayList();
        this.f12914a = arrayList;
        this.f12915b = Collections.unmodifiableList(arrayList);
        this.f12916c = new int[4];
        this.f12917d = new float[4];
        this.f12918e = new ArrayList(4);
    }

    public r1 a(e... eVarArr) {
        r1 bVar = eVarArr[0].a() instanceof c ? new r1.b() : new r1.a();
        bVar.j(eVarArr);
        this.f12918e.add(bVar);
        return bVar;
    }

    public final PropertyT b(String str) {
        int size = this.f12914a.size();
        PropertyT propertyt = (PropertyT) c(str, size);
        int i10 = 0;
        if (propertyt instanceof c) {
            int length = this.f12916c.length;
            if (length == size) {
                int[] iArr = new int[length * 2];
                while (i10 < length) {
                    iArr[i10] = this.f12916c[i10];
                    i10++;
                }
                this.f12916c = iArr;
            }
            this.f12916c[size] = Integer.MAX_VALUE;
        } else {
            if (!(propertyt instanceof a)) {
                throw new IllegalArgumentException("Invalid Property type");
            }
            int length2 = this.f12917d.length;
            if (length2 == size) {
                float[] fArr = new float[length2 * 2];
                while (i10 < length2) {
                    fArr[i10] = this.f12917d[i10];
                    i10++;
                }
                this.f12917d = fArr;
            }
            this.f12917d[size] = Float.MAX_VALUE;
        }
        this.f12914a.add(propertyt);
        return propertyt;
    }

    public abstract PropertyT c(String str, int i10);

    public List<r1> d() {
        return this.f12918e;
    }

    public final float e(int i10) {
        return this.f12917d[i10];
    }

    public final int f(int i10) {
        return this.f12916c[i10];
    }

    public abstract float g();

    public final List<PropertyT> h() {
        return this.f12915b;
    }

    public void i() {
        this.f12918e.clear();
    }

    public void j(r1 r1Var) {
        this.f12918e.remove(r1Var);
    }

    public final void k(int i10, float f10) {
        if (i10 >= this.f12914a.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f12917d[i10] = f10;
    }

    public final void l(int i10, int i11) {
        if (i10 >= this.f12914a.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f12916c[i10] = i11;
    }

    @k.i
    public void m() {
        for (int i10 = 0; i10 < this.f12918e.size(); i10++) {
            this.f12918e.get(i10).h(this);
        }
    }

    public final void n() throws IllegalStateException {
        if (this.f12914a.size() < 2) {
            return;
        }
        float fE = e(0);
        int i10 = 1;
        while (i10 < this.f12914a.size()) {
            float fE2 = e(i10);
            if (fE2 < fE) {
                Integer numValueOf = Integer.valueOf(i10);
                String name = this.f12914a.get(i10).getName();
                int i11 = i10 - 1;
                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\"", numValueOf, name, Integer.valueOf(i11), this.f12914a.get(i11).getName()));
            }
            if (fE == -3.4028235E38f && fE2 == Float.MAX_VALUE) {
                int i12 = i10 - 1;
                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER", Integer.valueOf(i12), this.f12914a.get(i12).getName(), Integer.valueOf(i10), this.f12914a.get(i10).getName()));
            }
            i10++;
            fE = fE2;
        }
    }

    public void o() throws IllegalStateException {
        if (this.f12914a.size() < 2) {
            return;
        }
        int iF = f(0);
        int i10 = 1;
        while (i10 < this.f12914a.size()) {
            int iF2 = f(i10);
            if (iF2 < iF) {
                Integer numValueOf = Integer.valueOf(i10);
                String name = this.f12914a.get(i10).getName();
                int i11 = i10 - 1;
                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\"", numValueOf, name, Integer.valueOf(i11), this.f12914a.get(i11).getName()));
            }
            if (iF == Integer.MIN_VALUE && iF2 == Integer.MAX_VALUE) {
                int i12 = i10 - 1;
                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER", Integer.valueOf(i12), this.f12914a.get(i12).getName(), Integer.valueOf(i10), this.f12914a.get(i10).getName()));
            }
            i10++;
            iF = iF2;
        }
    }
}
