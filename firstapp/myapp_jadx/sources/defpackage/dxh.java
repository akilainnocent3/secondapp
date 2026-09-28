package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class dxh extends djx<Float> {
    @Override // defpackage.djx
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return Float.valueOf(f);
        }
        s5b.a(str);
        throw null;
    }

    @Override // defpackage.djx
    public final String b() {
        return "float";
    }

    @Override // defpackage.djx
    /* JADX INFO: renamed from: d */
    public final Float h(String str) {
        str.getClass();
        return Float.valueOf(Float.parseFloat(str));
    }

    @Override // defpackage.djx
    public final void e(Bundle bundle, String str, Float f) {
        float fFloatValue = f.floatValue();
        str.getClass();
        bundle.putFloat(str, fFloatValue);
    }
}
