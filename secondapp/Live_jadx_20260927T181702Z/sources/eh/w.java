package eh;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f81237a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f81238a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f81239b;

        @qj.a
        public b a(int i10) {
            eh.a.i(!this.f81239b);
            this.f81238a.append(i10, true);
            return this;
        }

        @qj.a
        public b b(w wVar) {
            for (int i10 = 0; i10 < wVar.d(); i10++) {
                a(wVar.c(i10));
            }
            return this;
        }

        @qj.a
        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        @qj.a
        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public w e() {
            eh.a.i(!this.f81239b);
            this.f81239b = true;
            return new w(this.f81238a);
        }

        @qj.a
        public b f(int i10) {
            eh.a.i(!this.f81239b);
            this.f81238a.delete(i10);
            return this;
        }

        @qj.a
        public b g(int... iArr) {
            for (int i10 : iArr) {
                f(i10);
            }
            return this;
        }

        @qj.a
        public b h(int i10, boolean z10) {
            return z10 ? f(i10) : this;
        }
    }

    public boolean a(int i10) {
        return this.f81237a.get(i10);
    }

    public boolean b(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i10) {
        eh.a.c(i10, 0, d());
        return this.f81237a.keyAt(i10);
    }

    public int d() {
        return this.f81237a.size();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (o1.f81142a >= 24) {
            return this.f81237a.equals(wVar.f81237a);
        }
        if (d() != wVar.d()) {
            return false;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            if (c(i10) != wVar.c(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (o1.f81142a >= 24) {
            return this.f81237a.hashCode();
        }
        int iD = d();
        for (int i10 = 0; i10 < d(); i10++) {
            iD = (iD * 31) + c(i10);
        }
        return iD;
    }

    public w(SparseBooleanArray sparseBooleanArray) {
        this.f81237a = sparseBooleanArray;
    }
}
