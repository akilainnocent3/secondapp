package androidx.compose.ui.layout;

import defpackage.asr;
import defpackage.urr;
import defpackage.wgz;

/* JADX INFO: loaded from: classes.dex */
public final class x extends y.a {
    public final wgz b;

    public x(wgz wgzVar) {
        this.b = wgzVar;
    }

    @Override // androidx.compose.ui.layout.y.a
    public final urr f1() {
        return this.b.getRoot().U.d;
    }

    @Override // androidx.compose.ui.layout.y.a
    public final asr g() {
        return this.b.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.y.a, defpackage.mmd
    public final float getDensity() {
        return this.b.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.layout.y.a
    public final int i() {
        return this.b.getRoot().V.p.a;
    }

    @Override // androidx.compose.ui.layout.y.a, defpackage.mmd
    public final float y1() {
        return this.b.getDensity().y1();
    }
}
