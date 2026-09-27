package mc;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e<T> implements p<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f107186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public lc.e f107188d;

    public e() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // mc.p
    public final void d(@NonNull o oVar) {
        oVar.d(this.f107186b, this.f107187c);
    }

    @Override // mc.p
    @Nullable
    public final lc.e e() {
        return this.f107188d;
    }

    @Override // mc.p
    public final void g(@Nullable lc.e eVar) {
        this.f107188d = eVar;
    }

    public e(int i10, int i11) {
        if (pc.o.x(i10, i11)) {
            this.f107186b = i10;
            this.f107187c = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStop() {
    }

    @Override // mc.p
    public final void h(@NonNull o oVar) {
    }

    @Override // mc.p
    public void k(@Nullable Drawable drawable) {
    }

    @Override // mc.p
    public void n(@Nullable Drawable drawable) {
    }
}
