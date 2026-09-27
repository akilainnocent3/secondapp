package wl;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class e {
    @NonNull
    public static e a(@NonNull Set<d> set) {
        return new c(set);
    }

    @NonNull
    public abstract Set<d> b();
}
