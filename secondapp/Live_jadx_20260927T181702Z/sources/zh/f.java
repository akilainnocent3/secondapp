package zh;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public class f extends o.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f161609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f161610d;

    public f(@NonNull Drawable drawable, int i10, int i11) {
        super(drawable);
        this.f161609c = i10;
        this.f161610d = i11;
    }

    @Override // o.c, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f161610d;
    }

    @Override // o.c, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f161609c;
    }
}
