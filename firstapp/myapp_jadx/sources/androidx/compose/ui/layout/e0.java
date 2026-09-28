package androidx.compose.ui.layout;

import defpackage.asr;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends y.a {
    public final int b;
    public final asr c;
    public final float d;
    public final float e;

    public e0(int i, asr asrVar, float f, float f2) {
        this.b = i;
        this.c = asrVar;
        this.d = f;
        this.e = f2;
    }

    @Override // androidx.compose.ui.layout.y.a
    public final asr g() {
        return this.c;
    }

    @Override // androidx.compose.ui.layout.y.a, defpackage.mmd
    public final float getDensity() {
        return this.d;
    }

    @Override // androidx.compose.ui.layout.y.a
    public final int i() {
        return this.b;
    }

    @Override // androidx.compose.ui.layout.y.a, defpackage.mmd
    public final float y1() {
        return this.e;
    }
}
