package defpackage;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class va40<T extends View> implements p9i0<T> {
    public final T b;

    /* JADX WARN: Multi-variable type inference failed */
    public va40(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof va40) && Intrinsics.g(this.b, ((va40) obj).b);
    }

    @Override // defpackage.p9i0
    public final T getView() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.b.hashCode() * 31);
    }

    @Override // defpackage.p9i0
    public final boolean r() {
        return true;
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.b + ", subtractPadding=true)";
    }
}
