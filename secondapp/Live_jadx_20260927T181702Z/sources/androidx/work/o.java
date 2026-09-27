package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends o {
        @Override // androidx.work.o
        @Nullable
        public n a(@NonNull String className) {
            return null;
        }
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public static o c() {
        return new a();
    }

    @Nullable
    public abstract n a(@NonNull String className);

    @Nullable
    @y0({y0.a.LIBRARY_GROUP})
    public final n b(@NonNull String className) {
        n nVarA = a(className);
        return nVarA == null ? n.a(className) : nVarA;
    }
}
