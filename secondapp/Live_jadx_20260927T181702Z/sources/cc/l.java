package cc;

import android.content.Context;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import tb.m;
import vb.v;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class l<T> implements m<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m<?> f22976c = new l();

    @NonNull
    public static <T> l<T> c() {
        return (l) f22976c;
    }

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
    }

    @Override // tb.m
    @NonNull
    public v<T> b(@NonNull Context context, @NonNull v<T> vVar, int i10, int i11) {
        return vVar;
    }
}
