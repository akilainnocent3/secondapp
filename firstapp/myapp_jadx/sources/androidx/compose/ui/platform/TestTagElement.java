package androidx.compose.ui.platform;

import defpackage.cdf0;
import defpackage.p3w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/TestTagElement;", "Lp3w;", "Lcdf0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TestTagElement extends p3w<cdf0> {
    public final String b;

    public TestTagElement(String str) {
        this.b = str;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        cdf0 cdf0Var = new cdf0();
        cdf0Var.D = this.b;
        return cdf0Var;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ((cdf0) cVar).D = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return Intrinsics.g(this.b, ((TestTagElement) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
