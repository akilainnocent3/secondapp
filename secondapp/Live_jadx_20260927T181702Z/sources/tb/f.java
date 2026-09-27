package tb;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f136430a = "UTF-8";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f136431b = Charset.forName("UTF-8");

    void a(@NonNull MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
