package u1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface p {
    String a();

    @Nullable
    Locale b(@NonNull String[] strArr);

    @k.e0(from = -1)
    int c(Locale locale);

    Locale get(int i10);

    Object getLocaleList();

    boolean isEmpty();

    @k.e0(from = 0)
    int size();
}
