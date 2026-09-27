package f1;

import android.content.LocusId;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocusId f82209b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(29)
    public static class a {
        @NonNull
        public static LocusId a(@NonNull String str) {
            return new LocusId(str);
        }

        @NonNull
        public static String b(@NonNull LocusId locusId) {
            return locusId.getId();
        }
    }

    public c0(@NonNull String str) {
        this.f82208a = (String) e2.x.q(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f82209b = a.a(str);
        } else {
            this.f82209b = null;
        }
    }

    @NonNull
    @t0(29)
    public static c0 d(@NonNull LocusId locusId) {
        e2.x.m(locusId, "locusId cannot be null");
        return new c0((String) e2.x.q(a.b(locusId), "id cannot be empty"));
    }

    @NonNull
    public String a() {
        return this.f82208a;
    }

    @NonNull
    public final String b() {
        return this.f82208a.length() + "_chars";
    }

    @NonNull
    @t0(29)
    public LocusId c() {
        return this.f82209b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        String str = this.f82208a;
        if (str == null) {
            return c0Var.f82208a == null;
        }
        return str.equals(c0Var.f82208a);
    }

    public int hashCode() {
        String str = this.f82208a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @NonNull
    public String toString() {
        return "LocusIdCompat[" + b() + C4235d4.j.f61462e;
    }
}
