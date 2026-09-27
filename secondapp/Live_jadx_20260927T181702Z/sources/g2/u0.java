package g2;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface u0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bundle f85946a;

        @y0({y0.a.LIBRARY_GROUP_PREFIX})
        public void a(@Nullable Bundle bundle) {
            this.f85946a = bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends a {
        public boolean b() {
            return this.f85946a.getBoolean(n0.Y);
        }

        public int c() {
            return this.f85946a.getInt(n0.W);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends a {
        @Nullable
        public String b() {
            return this.f85946a.getString(n0.X);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends a {
        public int b() {
            return this.f85946a.getInt(n0.f85854f0);
        }

        public int c() {
            return this.f85946a.getInt(n0.f85856g0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends a {
        public int b() {
            return this.f85946a.getInt(n0.f85850d0);
        }

        public int c() {
            return this.f85946a.getInt(n0.f85848c0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f extends a {
        public float b() {
            return this.f85946a.getFloat(n0.f85852e0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g extends a {
        public int b() {
            return this.f85946a.getInt(n0.f85846a0);
        }

        public int c() {
            return this.f85946a.getInt(n0.Z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h extends a {
        @Nullable
        public CharSequence b() {
            return this.f85946a.getCharSequence(n0.f85847b0);
        }
    }

    boolean a(@NonNull View view, @Nullable a aVar);
}
