package androidx.compose.ui.layout;

import defpackage.urr;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends b0 {
    @Override // androidx.compose.ui.layout.b0
    public final float a(float f, urr urrVar, urr urrVar2) {
        return Float.intBitsToFloat((int) (urrVar2.M(urrVar, (((long) Float.floatToRawIntBits(((int) (urrVar.a() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
    }
}
