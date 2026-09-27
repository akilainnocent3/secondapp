package l1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import f2.f0;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f103303a = "RoundedBitmapDrawableFa";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends i {
        public a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // l1.i
        public void f(int i10, int i11, int i12, Rect rect, Rect rect2) {
            f0.b(i10, i11, i12, rect, rect2, 0);
        }

        @Override // l1.i
        public boolean h() {
            Bitmap bitmap = this.f103290a;
            return bitmap != null && k1.a.c(bitmap);
        }

        @Override // l1.i
        public void o(boolean z10) {
            Bitmap bitmap = this.f103290a;
            if (bitmap != null) {
                k1.a.d(bitmap, z10);
                invalidateSelf();
            }
        }
    }

    @NonNull
    public static i a(@NonNull Resources resources, @Nullable Bitmap bitmap) {
        return new h(resources, bitmap);
    }

    @NonNull
    public static i b(@NonNull Resources resources, @NonNull InputStream inputStream) {
        i iVarA = a(resources, BitmapFactory.decodeStream(inputStream));
        if (iVarA.b() == null) {
            Log.w(f103303a, "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return iVarA;
    }

    @NonNull
    public static i c(@NonNull Resources resources, @NonNull String str) {
        i iVarA = a(resources, BitmapFactory.decodeFile(str));
        if (iVarA.b() == null) {
            Log.w(f103303a, "RoundedBitmapDrawable cannot decode " + str);
        }
        return iVarA;
    }
}
