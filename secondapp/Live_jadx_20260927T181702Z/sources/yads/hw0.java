package yads;

import android.content.Context;
import android.graphics.Typeface;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f150328a;

    public hw0(Context context) {
        this.f150328a = context;
    }

    public final Typeface a(sw0 sw0Var) {
        try {
            File fileB = b(sw0Var);
            if (fileB.exists()) {
                return Typeface.createFromFile(fileB);
            }
            return null;
        } catch (Exception unused) {
            boolean z10 = ad1.f146762a;
            return null;
        }
    }

    public final File b(sw0 sw0Var) {
        return new File(new File(this.f150328a.getFilesDir(), "downloaded_fonts"), g43.a(sw0Var.name() + ".ttf"));
    }
}
