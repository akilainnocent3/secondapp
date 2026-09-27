package sj;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class o extends Exception {
    @Deprecated
    public o() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@NonNull String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@NonNull String str, @NonNull Throwable th2) {
        super(str, th2);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
