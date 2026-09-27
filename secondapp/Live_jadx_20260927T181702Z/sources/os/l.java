package os;

import dr.l1;
import kotlin.jvm.internal.x;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "1.1")
public final class l extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public l(@m Exception exc) {
        super(exc);
    }

    public /* synthetic */ l(Exception exc, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : exc);
    }
}
