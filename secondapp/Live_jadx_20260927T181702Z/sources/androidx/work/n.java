package androidx.work;

import androidx.annotation.NonNull;
import java.util.List;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20294a = r.f("InputMerger");

    @y0({y0.a.LIBRARY_GROUP})
    public static n a(String className) {
        try {
            return (n) Class.forName(className).newInstance();
        } catch (Exception e10) {
            r.c().b(f20294a, "Trouble instantiating + " + className, e10);
            return null;
        }
    }

    @NonNull
    public abstract e b(@NonNull List<e> inputs);
}
