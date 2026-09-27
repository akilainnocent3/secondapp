package x4;

import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h {
    @Nullable
    public static nj.t1 a(i iVar, u4.i1 i1Var) {
        byte[] bArr = i1Var.f138531k;
        if (bArr != null) {
            return iVar.a(bArr);
        }
        Uri uri = i1Var.f138534n;
        if (uri != null) {
            return iVar.b(uri);
        }
        return null;
    }
}
