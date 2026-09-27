package ic;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import tb.i;
import vb.v;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class a implements e<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap.CompressFormat f90575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90576b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // ic.e
    @Nullable
    public v<byte[]> a(@NonNull v<Bitmap> vVar, @NonNull i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.f90575a, this.f90576b, byteArrayOutputStream);
        vVar.a();
        return new ec.b(byteArrayOutputStream.toByteArray());
    }

    public a(@NonNull Bitmap.CompressFormat compressFormat, int i10) {
        this.f90575a = compressFormat;
        this.f90576b = i10;
    }
}
