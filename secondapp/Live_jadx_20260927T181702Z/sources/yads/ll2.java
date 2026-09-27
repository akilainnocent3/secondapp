package yads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ll2 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yj3 f152046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f152047b = fr.h0.U(new kl2(xj3.f157890b, 0.25f), new kl2(xj3.f157891c, 0.5f), new kl2(xj3.f157892d, 0.75f));

    public ll2(zj3 zj3Var) {
        this.f152046a = zj3Var;
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        if (j10 != 0) {
            Iterator it = this.f152047b.iterator();
            while (it.hasNext()) {
                kl2 kl2Var = (kl2) it.next();
                if (kl2Var.f151599b * j10 <= j11) {
                    this.f152046a.a(kl2Var.f151598a);
                    it.remove();
                }
            }
        }
    }
}
