package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cmp {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        if (obj instanceof cmp) {
            return Intrinsics.g(this.a, ((cmp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
