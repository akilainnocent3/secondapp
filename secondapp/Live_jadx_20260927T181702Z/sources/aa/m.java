package aa;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.d
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface a {
    }

    @y0({y0.a.LIBRARY})
    public m() {
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract int d();

    @NonNull
    public abstract Set<String> e();

    public abstract void f(boolean z10);

    public abstract void g(boolean z10);

    public abstract void h(boolean z10);

    public abstract void i(int i10);

    public abstract void j(@NonNull Set<String> set);
}
