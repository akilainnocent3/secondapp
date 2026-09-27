package androidx.recyclerview.widget;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class j0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<a<T>> f18841b = new SparseArray<>(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a<T> f18842c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T[] f18843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a<T> f18846d;

        public a(@NonNull Class<T> cls, int i10) {
            this.f18843a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i10));
        }

        public boolean a(int i10) {
            int i11 = this.f18844b;
            return i11 <= i10 && i10 < i11 + this.f18845c;
        }

        public T b(int i10) {
            return this.f18843a[i10 - this.f18844b];
        }
    }

    public j0(int i10) {
        this.f18840a = i10;
    }

    public a<T> a(a<T> aVar) {
        int iIndexOfKey = this.f18841b.indexOfKey(aVar.f18844b);
        if (iIndexOfKey < 0) {
            this.f18841b.put(aVar.f18844b, aVar);
            return null;
        }
        a<T> aVarValueAt = this.f18841b.valueAt(iIndexOfKey);
        this.f18841b.setValueAt(iIndexOfKey, aVar);
        if (this.f18842c == aVarValueAt) {
            this.f18842c = aVar;
        }
        return aVarValueAt;
    }

    public void b() {
        this.f18841b.clear();
    }

    public a<T> c(int i10) {
        if (i10 < 0 || i10 >= this.f18841b.size()) {
            return null;
        }
        return this.f18841b.valueAt(i10);
    }

    public T d(int i10) {
        a<T> aVar = this.f18842c;
        if (aVar == null || !aVar.a(i10)) {
            int iIndexOfKey = this.f18841b.indexOfKey(i10 - (i10 % this.f18840a));
            if (iIndexOfKey < 0) {
                return null;
            }
            this.f18842c = this.f18841b.valueAt(iIndexOfKey);
        }
        return this.f18842c.b(i10);
    }

    public a<T> e(int i10) {
        a<T> aVar = this.f18841b.get(i10);
        if (this.f18842c == aVar) {
            this.f18842c = null;
        }
        this.f18841b.delete(i10);
        return aVar;
    }

    public int f() {
        return this.f18841b.size();
    }
}
