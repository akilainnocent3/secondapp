package hc;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import tb.k;
import vb.v;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements k<qb.a, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb.e f88166a;

    public h(wb.e eVar) {
        this.f88166a = eVar;
    }

    @Override // tb.k
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v<Bitmap> b(@NonNull qb.a aVar, int i10, int i11, @NonNull tb.i iVar) {
        return dc.h.d(aVar.h(), this.f88166a);
    }

    @Override // tb.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull qb.a aVar, @NonNull tb.i iVar) {
        return true;
    }
}
