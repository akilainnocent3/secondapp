package androidx.databinding;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface y<T> extends List<T> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a<T extends y> {
        public abstract void a(T sender);

        public abstract void e(T sender, int positionStart, int itemCount);

        public abstract void f(T sender, int positionStart, int itemCount);

        public abstract void g(T sender, int fromPosition, int toPosition, int itemCount);

        public abstract void h(T sender, int positionStart, int itemCount);
    }

    void J0(a<? extends y<T>> callback);

    void w0(a<? extends y<T>> callback);
}
