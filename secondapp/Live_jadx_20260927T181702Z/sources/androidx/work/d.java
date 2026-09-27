package androidx.work;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<a> f20072a = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Uri f20073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20074b;

        public a(@NonNull Uri uri, boolean triggerForDescendants) {
            this.f20073a = uri;
            this.f20074b = triggerForDescendants;
        }

        @NonNull
        public Uri a() {
            return this.f20073a;
        }

        public boolean b() {
            return this.f20074b;
        }

        public boolean equals(Object o10) {
            if (this == o10) {
                return true;
            }
            if (o10 != null && a.class == o10.getClass()) {
                a aVar = (a) o10;
                if (this.f20074b == aVar.f20074b && this.f20073a.equals(aVar.f20073a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f20073a.hashCode() * 31) + (this.f20074b ? 1 : 0);
        }
    }

    public void a(@NonNull Uri uri, boolean triggerForDescendants) {
        this.f20072a.add(new a(uri, triggerForDescendants));
    }

    @NonNull
    public Set<a> b() {
        return this.f20072a;
    }

    public int c() {
        return this.f20072a.size();
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 == null || d.class != o10.getClass()) {
            return false;
        }
        return this.f20072a.equals(((d) o10).f20072a);
    }

    public int hashCode() {
        return this.f20072a.hashCode();
    }
}
