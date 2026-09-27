package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface h2 extends SpinnerAdapter {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f7147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f7148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LayoutInflater f7149c;

        public a(@NonNull Context context) {
            this.f7147a = context;
            this.f7148b = LayoutInflater.from(context);
        }

        @NonNull
        public LayoutInflater a() {
            LayoutInflater layoutInflater = this.f7149c;
            return layoutInflater != null ? layoutInflater : this.f7148b;
        }

        @Nullable
        public Resources.Theme b() {
            LayoutInflater layoutInflater = this.f7149c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void c(@Nullable Resources.Theme theme) {
            if (theme == null) {
                this.f7149c = null;
            } else if (theme.equals(this.f7147a.getTheme())) {
                this.f7149c = this.f7148b;
            } else {
                this.f7149c = LayoutInflater.from(new r.d(this.f7147a, theme));
            }
        }
    }

    @Nullable
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@Nullable Resources.Theme theme);
}
