package androidx.databinding;

import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class x<T> extends b implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f9528d = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f9529c;

    public x(T t10) {
        this.f9529c = t10;
    }

    @Nullable
    public T j() {
        return this.f9529c;
    }

    public void k(T t10) {
        if (t10 != this.f9529c) {
            this.f9529c = t10;
            g();
        }
    }

    public x() {
    }

    public x(u... uVarArr) {
        super(uVarArr);
    }
}
