package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w8h implements a75, otk0 {
    public static final /* synthetic */ w8h a = new w8h();

    public static void b(float f, float[] fArr) {
        if (f <= 0.5f) {
            fArr[0] = 1.0f - (f * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f * 2.0f) - 1.0f;
        }
    }

    @Override // defpackage.a75
    public p65 a(kb0 kb0Var) {
        return new p65(kb0Var.b);
    }

    @Override // defpackage.otk0
    public Object zza() {
        List list = v2l0.a;
        return Long.valueOf(bol0.b.get().n());
    }
}
