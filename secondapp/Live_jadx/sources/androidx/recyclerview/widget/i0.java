package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface i0<T> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<T> {
        void a(int i10, int i11, int i12, int i13, int i14);

        void b(int i10, int i11);

        void c(int i10);

        @SuppressLint({"UnknownNullness"})
        void d(j0.a<T> aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b<T> {
        void a(int i10, int i11);

        void b(int i10, int i11);

        @SuppressLint({"UnknownNullness"})
        void c(int i10, j0.a<T> aVar);
    }

    b<T> a(b<T> bVar);

    a<T> b(a<T> aVar);
}
