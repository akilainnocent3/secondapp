package f2;

import android.view.ViewStructure;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f82453a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(23)
    public static class a {
        @k.t
        public static void a(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        @k.t
        public static void b(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        @k.t
        public static void c(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
            viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
        }

        @k.t
        public static void d(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }
    }

    public o2(@NonNull ViewStructure viewStructure) {
        this.f82453a = viewStructure;
    }

    @NonNull
    @k.t0(23)
    public static o2 f(@NonNull ViewStructure viewStructure) {
        return new o2(viewStructure);
    }

    public void a(@NonNull String str) {
        a.a((ViewStructure) this.f82453a, str);
    }

    public void b(@NonNull CharSequence charSequence) {
        a.b((ViewStructure) this.f82453a, charSequence);
    }

    public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
        a.c((ViewStructure) this.f82453a, i10, i11, i12, i13, i14, i15);
    }

    public void d(@NonNull CharSequence charSequence) {
        a.d((ViewStructure) this.f82453a, charSequence);
    }

    @NonNull
    @k.t0(23)
    public ViewStructure e() {
        return (ViewStructure) this.f82453a;
    }
}
