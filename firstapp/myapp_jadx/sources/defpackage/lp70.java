package defpackage;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class lp70 {
    public final c a;

    public static class a implements c {
        public final ScrollFeedbackProvider a;

        public a(NestedScrollView nestedScrollView) {
            this.a = ScrollFeedbackProvider.createProvider(nestedScrollView);
        }

        @Override // lp70.c
        public final void onScrollLimit(int i, int i2, int i3, boolean z) {
            this.a.onScrollLimit(i, i2, i3, z);
        }

        @Override // lp70.c
        public final void onScrollProgress(int i, int i2, int i3, int i4) {
            this.a.onScrollProgress(i, i2, i3, i4);
        }
    }

    public interface c {
        void onScrollLimit(int i, int i2, int i3, boolean z);

        void onScrollProgress(int i, int i2, int i3, int i4);
    }

    public lp70(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new a(nestedScrollView);
        } else {
            this.a = new b();
        }
    }

    public static class b implements c {
        @Override // lp70.c
        public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        }

        @Override // lp70.c
        public final void onScrollProgress(int i, int i2, int i3, int i4) {
        }
    }
}
