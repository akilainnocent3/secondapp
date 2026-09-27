package fk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface o0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue
    public static abstract class a {
        public static a a(String str, m0 m0Var) {
            return new c(str, m0Var.f(), m0Var.e());
        }

        public static a b(String str) {
            return new c(str, null, null);
        }

        @NonNull
        public abstract String c();

        @Nullable
        public abstract String d();

        @Nullable
        public abstract String e();
    }

    a a();
}
