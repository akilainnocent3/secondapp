package bl;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface k {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21793b;

        a(int i10) {
            this.f21793b = i10;
        }

        public int g() {
            return this.f21793b;
        }
    }

    @NonNull
    a a(@NonNull String str);
}
