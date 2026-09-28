package androidx.compose.ui.layout;

import defpackage.urr;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b0 {
    @Override // androidx.compose.ui.layout.b0
    public final float a(float f, urr urrVar, urr urrVar2) {
        return Float.intBitsToFloat((int) (urrVar2.M(urrVar, (((long) Float.floatToRawIntBits(((int) (urrVar.a() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L)) & 4294967295L));
    }
}
