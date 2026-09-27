package ee;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class r {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue.Builder
    public static abstract class a {
        public abstract r a();

        public abstract a b(String str);

        public abstract a c(@Nullable byte[] bArr);

        @y0({y0.a.LIBRARY_GROUP})
        public abstract a d(ae.h hVar);
    }

    public static a a() {
        return new d.b().d(ae.h.DEFAULT);
    }

    public abstract String b();

    @Nullable
    public abstract byte[] c();

    @y0({y0.a.LIBRARY_GROUP})
    public abstract ae.h d();

    public boolean e() {
        return c() != null;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public r f(ae.h hVar) {
        return a().b(b()).d(hVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
