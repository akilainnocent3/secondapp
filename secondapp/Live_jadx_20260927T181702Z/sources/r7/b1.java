package r7;

import android.os.Bundle;
import android.os.Parcelable;
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
public final class b1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f123685d = "routes";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f123686e = "supportsDynamicGroupRoute";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f123687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<y0> f123688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f123689c;

    public b1(@NonNull List<y0> list, boolean z10) {
        if (list.isEmpty()) {
            this.f123688b = Collections.EMPTY_LIST;
        } else {
            this.f123688b = Collections.unmodifiableList(new ArrayList(list));
        }
        this.f123689c = z10;
    }

    @Nullable
    public static b1 b(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f123685d);
        if (parcelableArrayList != null) {
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                arrayList.add(y0.c((Bundle) parcelableArrayList.get(i10)));
            }
        }
        return new b1(arrayList, bundle.getBoolean(f123686e, false));
    }

    @NonNull
    public Bundle a() {
        Bundle bundle = this.f123687a;
        if (bundle != null) {
            return bundle;
        }
        this.f123687a = new Bundle();
        if (!this.f123688b.isEmpty()) {
            int size = this.f123688b.size();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(this.f123688b.get(i10).a());
            }
            this.f123687a.putParcelableArrayList(f123685d, arrayList);
        }
        this.f123687a.putBoolean(f123686e, this.f123689c);
        return this.f123687a;
    }

    @NonNull
    public List<y0> c() {
        return this.f123688b;
    }

    public boolean d() {
        int size = c().size();
        for (int i10 = 0; i10 < size; i10++) {
            y0 y0Var = this.f123688b.get(i10);
            if (y0Var == null || !y0Var.A()) {
                return false;
            }
        }
        return true;
    }

    public boolean e() {
        return this.f123689c;
    }

    @NonNull
    public String toString() {
        return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(c().toArray()) + ", isValid=" + d() + " }";
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<y0> f123690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f123691b;

        public a() {
            this.f123690a = new ArrayList();
            this.f123691b = false;
        }

        @NonNull
        public a a(@NonNull y0 y0Var) {
            if (y0Var == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (this.f123690a.contains(y0Var)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.f123690a.add(y0Var);
            return this;
        }

        @NonNull
        public a b(@NonNull Collection<y0> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("routes must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator<y0> it = collection.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            return this;
        }

        @NonNull
        public b1 c() {
            return new b1(this.f123690a, this.f123691b);
        }

        @NonNull
        public a d(@Nullable Collection<y0> collection) {
            this.f123690a.clear();
            if (collection != null) {
                this.f123690a.addAll(collection);
            }
            return this;
        }

        @NonNull
        public a e(boolean z10) {
            this.f123691b = z10;
            return this;
        }

        public a(@NonNull b1 b1Var) {
            ArrayList arrayList = new ArrayList();
            this.f123690a = arrayList;
            this.f123691b = false;
            if (b1Var != null) {
                arrayList.addAll(b1Var.c());
                this.f123691b = b1Var.f123689c;
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }
    }
}
