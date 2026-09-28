package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jam implements otk0 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ jam b = new jam();

    public static final long a(boolean z, float f, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    @Override // defpackage.otk0
    public Object zza() {
        List list = v2l0.a;
        return Boolean.valueOf(((uql0) tql0.b.a.a).zza());
    }
}
