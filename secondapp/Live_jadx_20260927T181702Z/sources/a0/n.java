package a0;

import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f3293b = "Token";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final p f3294a;

    public n(@NonNull p pVar) {
        this.f3294a = pVar;
    }

    @Nullable
    public static n a(@NonNull String str, @NonNull PackageManager packageManager) {
        List<byte[]> listB = l.b(str, packageManager);
        if (listB == null) {
            return null;
        }
        try {
            return new n(p.c(str, listB));
        } catch (IOException e10) {
            Log.e(f3293b, "Exception when creating token.", e10);
            return null;
        }
    }

    @NonNull
    public static n b(@NonNull byte[] bArr) {
        return new n(p.e(bArr));
    }

    public boolean c(@NonNull String str, @NonNull PackageManager packageManager) {
        return l.d(str, packageManager, this.f3294a);
    }

    @NonNull
    public byte[] d() {
        return this.f3294a.j();
    }
}
