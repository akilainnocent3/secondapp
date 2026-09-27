package oc;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import tb.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f118994c = new c();

    @NonNull
    public static c c() {
        return f118994c;
    }

    public String toString() {
        return "EmptySignature";
    }

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
    }
}
