package yads;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ek0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zj0 f148739a;

    public ek0(Context context) {
        this.f148739a = new zj0(context.getApplicationContext());
    }

    public final Drawable a(byte[] bArr) {
        yj0 hqVar;
        s41 s41VarA = t41.a(bArr);
        zj0 zj0Var = this.f148739a;
        zj0Var.getClass();
        int iOrdinal = s41VarA.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            hqVar = new hq();
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new dr.o0();
            }
            hqVar = new hq();
        } else {
            hqVar = new oz0();
        }
        return hqVar.a(bArr, zj0Var.f158867a.getApplicationContext());
    }
}
