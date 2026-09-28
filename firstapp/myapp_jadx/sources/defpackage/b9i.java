package defpackage;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b9i implements co5 {
    public final scn<String, Typeface> a;

    public b9i(wf00 wf00Var) {
        wf00Var.getClass();
        this.a = wf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9i) && Intrinsics.g(this.a, ((b9i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FontResource(map=" + this.a + ')';
    }

    @Override // defpackage.co5
    public final void release() {
    }
}
