package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kwh0 extends mwh0 implements Iterable<mwh0>, dhp {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float i;
    public final float v;
    public final List<qxz> w;
    public final List<mwh0> y;

    public static final class a implements Iterator<mwh0>, dhp {
        public final Iterator<mwh0> a;

        public a(kwh0 kwh0Var) {
            this.a = kwh0Var.y.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public final mwh0 next() {
            return this.a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kwh0(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends qxz> list, List<? extends mwh0> list2) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.i = f6;
        this.v = f7;
        this.w = list;
        this.y = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof kwh0)) {
            kwh0 kwh0Var = (kwh0) obj;
            return Intrinsics.g(this.a, kwh0Var.a) && this.b == kwh0Var.b && this.c == kwh0Var.c && this.d == kwh0Var.d && this.e == kwh0Var.e && this.f == kwh0Var.f && this.i == kwh0Var.i && this.v == kwh0Var.v && Intrinsics.g(this.w, kwh0Var.w) && Intrinsics.g(this.y, kwh0Var.y);
        }
        return false;
    }

    public final int hashCode() {
        return this.y.hashCode() + ai50.a(tvh.a(this.v, tvh.a(this.i, tvh.a(this.f, tvh.a(this.e, tvh.a(this.d, tvh.a(this.c, tvh.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.w);
    }

    @Override // java.lang.Iterable
    public final Iterator<mwh0> iterator() {
        return new a(this);
    }

    public kwh0() {
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, lwh0.a, m2g.a);
    }
}
