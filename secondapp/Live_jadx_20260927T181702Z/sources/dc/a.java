package dc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class a<DataType> implements tb.k<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb.k<DataType, Bitmap> f78688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f78689b;

    public a(Context context, tb.k<DataType, Bitmap> kVar) {
        this(context.getResources(), kVar);
    }

    @Override // tb.k
    public boolean a(@NonNull DataType datatype, @NonNull tb.i iVar) throws IOException {
        return this.f78688a.a(datatype, iVar);
    }

    @Override // tb.k
    public vb.v<BitmapDrawable> b(@NonNull DataType datatype, int i10, int i11, @NonNull tb.i iVar) throws IOException {
        return g0.f(this.f78689b, this.f78688a.b(datatype, i10, i11, iVar));
    }

    @Deprecated
    public a(Resources resources, wb.e eVar, tb.k<DataType, Bitmap> kVar) {
        this(resources, kVar);
    }

    public a(@NonNull Resources resources, @NonNull tb.k<DataType, Bitmap> kVar) {
        this.f78689b = (Resources) pc.m.e(resources);
        this.f78688a = (tb.k) pc.m.e(kVar);
    }
}
