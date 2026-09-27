package pc;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class p<T> implements com.bumptech.glide.f.b<T>, mc.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f120702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f120703b;

    public p() {
    }

    @Override // com.bumptech.glide.f.b
    @Nullable
    public int[] a(@NonNull T t10, int i10, int i11) {
        int[] iArr = this.f120702a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public void b(@NonNull View view) {
        if (this.f120702a == null && this.f120703b == null) {
            a aVar = new a(view);
            this.f120703b = aVar;
            aVar.d(this);
        }
    }

    @Override // mc.o
    public void d(int i10, int i11) {
        this.f120702a = new int[]{i10, i11};
        this.f120703b = null;
    }

    public p(@NonNull View view) {
        a aVar = new a(view);
        this.f120703b = aVar;
        aVar.d(this);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends mc.f<View, Object> {
        public a(@NonNull View view) {
            super(view);
        }

        @Override // mc.f
        public void m(@Nullable Drawable drawable) {
        }

        @Override // mc.p
        public void n(@Nullable Drawable drawable) {
        }

        @Override // mc.p
        public void l(@NonNull Object obj, @Nullable nc.f<? super Object> fVar) {
        }
    }
}
