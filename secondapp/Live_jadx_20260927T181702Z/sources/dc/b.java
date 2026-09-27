package dc;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class b implements tb.l<BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb.e f78690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tb.l<Bitmap> f78691b;

    public b(wb.e eVar, tb.l<Bitmap> lVar) {
        this.f78690a = eVar;
        this.f78691b = lVar;
    }

    @Override // tb.l
    @NonNull
    public tb.c a(@NonNull tb.i iVar) {
        return this.f78691b.a(iVar);
    }

    @Override // tb.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull vb.v<BitmapDrawable> vVar, @NonNull File file, @NonNull tb.i iVar) {
        return this.f78691b.b((Bitmap) new h(vVar.get().getBitmap(), this.f78690a), file, iVar);
    }
}
