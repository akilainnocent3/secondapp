package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wkd0 {
    public final Bitmap a;

    public final boolean equals(Object obj) {
        if (obj instanceof wkd0) {
            return Intrinsics.g(this.a, ((wkd0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StableBitmap(value=" + this.a + ")";
    }
}
