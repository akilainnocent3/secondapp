package i2;

import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f90287a;

    @t0(26)
    public b(@NonNull AutofillId autofillId) {
        this.f90287a = autofillId;
    }

    @NonNull
    @t0(26)
    public static b b(@NonNull AutofillId autofillId) {
        return new b(autofillId);
    }

    @NonNull
    @t0(26)
    public AutofillId a() {
        return a.a(this.f90287a);
    }
}
