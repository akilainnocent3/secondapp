package f1;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class q0 {
    public static /* synthetic */ boolean a(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }

    @NonNull
    public static e2.f0<Uri> b(@NonNull final UriMatcher uriMatcher) {
        return new e2.f0() { // from class: f1.p0
            @Override // e2.f0
            public /* synthetic */ e2.f0 a(e2.f0 f0Var) {
                return e2.e0.a(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 b(e2.f0 f0Var) {
                return e2.e0.c(this, f0Var);
            }

            @Override // e2.f0
            public /* synthetic */ e2.f0 negate() {
                return e2.e0.b(this);
            }

            @Override // e2.f0
            public final boolean test(Object obj) {
                return q0.a(uriMatcher, (Uri) obj);
            }
        };
    }
}
