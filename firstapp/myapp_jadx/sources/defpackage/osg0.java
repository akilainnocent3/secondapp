package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class osg0 {
    public abstract String a();

    public abstract Bitmap b(Bitmap bitmap);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof osg0) && Intrinsics.g(a(), ((osg0) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return jq40.a(getClass()).k() + "(cacheKey=" + a() + ')';
    }
}
