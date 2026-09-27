package r7;

import android.content.IntentFilter;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f123798c = "controlCategories";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h1 f123799d = new h1(new Bundle(), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f123800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f123801b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<String> f123802a;

        public a() {
        }

        @NonNull
        public a a(@NonNull Collection<String> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("categories must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator<String> it = collection.iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
            return this;
        }

        @NonNull
        public a b(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            if (this.f123802a == null) {
                this.f123802a = new ArrayList<>();
            }
            if (!this.f123802a.contains(str)) {
                this.f123802a.add(str);
            }
            return this;
        }

        @NonNull
        public a c(@NonNull h1 h1Var) {
            if (h1Var == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            a(h1Var.e());
            return this;
        }

        @NonNull
        public h1 d() {
            if (this.f123802a == null) {
                return h1.f123799d;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(h1.f123798c, this.f123802a);
            return new h1(bundle, this.f123802a);
        }

        public a(@NonNull h1 h1Var) {
            if (h1Var == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            h1Var.c();
            if (h1Var.f123801b.isEmpty()) {
                return;
            }
            this.f123802a = new ArrayList<>(h1Var.f123801b);
        }
    }

    public h1(Bundle bundle, List<String> list) {
        this.f123800a = bundle;
        this.f123801b = list;
    }

    @Nullable
    public static h1 d(@Nullable Bundle bundle) {
        if (bundle != null) {
            return new h1(bundle, null);
        }
        return null;
    }

    @NonNull
    public Bundle a() {
        return this.f123800a;
    }

    public boolean b(@NonNull h1 h1Var) {
        if (h1Var == null) {
            return false;
        }
        c();
        h1Var.c();
        return this.f123801b.containsAll(h1Var.f123801b);
    }

    public void c() {
        if (this.f123801b == null) {
            ArrayList<String> stringArrayList = this.f123800a.getStringArrayList(f123798c);
            this.f123801b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f123801b = Collections.EMPTY_LIST;
            }
        }
    }

    @NonNull
    public List<String> e() {
        c();
        return new ArrayList(this.f123801b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        c();
        h1Var.c();
        return this.f123801b.equals(h1Var.f123801b);
    }

    public boolean f(@Nullable String str) {
        if (str == null) {
            return false;
        }
        c();
        int size = this.f123801b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f123801b.get(i10).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        c();
        return this.f123801b.isEmpty();
    }

    public boolean h() {
        c();
        return !this.f123801b.contains(null);
    }

    public int hashCode() {
        c();
        return this.f123801b.hashCode();
    }

    public boolean i(@Nullable List<IntentFilter> list) {
        if (list == null) {
            return false;
        }
        c();
        if (this.f123801b.isEmpty()) {
            return false;
        }
        for (IntentFilter intentFilter : list) {
            if (intentFilter != null) {
                Iterator<String> it = this.f123801b.iterator();
                while (it.hasNext()) {
                    if (intentFilter.hasCategory(it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @NonNull
    public String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(e().toArray()) + " }";
    }
}
