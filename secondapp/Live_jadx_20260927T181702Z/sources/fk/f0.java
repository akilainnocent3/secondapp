package fk;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class f0 {
    @NonNull
    public static f0 a(ik.f0 f0Var, String str, File file) {
        return new b(f0Var, str, file);
    }

    public abstract ik.f0 b();

    public abstract File c();

    public abstract String d();
}
