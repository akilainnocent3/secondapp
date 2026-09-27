package dc;

import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class c extends fc.j<BitmapDrawable> implements vb.r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wb.e f78694c;

    public c(BitmapDrawable bitmapDrawable, wb.e eVar) {
        super(bitmapDrawable);
        this.f78694c = eVar;
    }

    @Override // vb.v
    public void a() {
        this.f78694c.d(((BitmapDrawable) this.f83890b).getBitmap());
    }

    @Override // vb.v
    @NonNull
    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // vb.v
    public int getSize() {
        return pc.o.i(((BitmapDrawable) this.f83890b).getBitmap());
    }

    @Override // fc.j, vb.r
    public void initialize() {
        ((BitmapDrawable) this.f83890b).getBitmap().prepareToDraw();
    }
}
