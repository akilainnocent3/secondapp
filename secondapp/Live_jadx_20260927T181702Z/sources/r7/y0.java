package r7;

import android.annotation.SuppressLint;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f124199b = "id";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f124200c = "groupMemberIds";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f124201d = "name";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f124202e = "status";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f124203f = "iconUri";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f124204g = "enabled";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f124205h = "isDynamicGroupRoute";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f124206i = "connecting";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f124207j = "connectionState";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f124208k = "controlFilters";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f124209l = "playbackType";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f124210m = "playbackStream";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f124211n = "deviceType";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f124212o = "volume";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f124213p = "volumeMax";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f124214q = "volumeHandling";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f124215r = "presentationDisplayId";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f124216s = "extras";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f124217t = "canDisconnect";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f124218u = "settingsIntent";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f124219v = "minClientVersion";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f124220w = "maxClientVersion";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f124221x = "deduplicationIds";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f124222y = "isVisibilityPublic";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f124223z = "allowedPackages";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f124224a;

    public y0(Bundle bundle) {
        this.f124224a = bundle;
    }

    @Nullable
    public static y0 c(@Nullable Bundle bundle) {
        if (bundle != null) {
            return new y0(bundle);
        }
        return null;
    }

    public boolean A() {
        return (TextUtils.isEmpty(m()) || TextUtils.isEmpty(p()) || f().contains(null)) ? false : true;
    }

    public boolean B() {
        return this.f124224a.getBoolean(f124222y, true);
    }

    @NonNull
    public Bundle a() {
        return this.f124224a;
    }

    public boolean b() {
        return this.f124224a.getBoolean(f124217t, false);
    }

    @NonNull
    public Set<String> d() {
        return !this.f124224a.containsKey(f124223z) ? new HashSet() : new HashSet(this.f124224a.getStringArrayList(f124223z));
    }

    public int e() {
        return this.f124224a.getInt(f124207j, 0);
    }

    @NonNull
    public List<IntentFilter> f() {
        return !this.f124224a.containsKey(f124208k) ? new ArrayList() : new ArrayList(this.f124224a.getParcelableArrayList(f124208k));
    }

    @NonNull
    public Set<String> g() {
        ArrayList<String> stringArrayList = this.f124224a.getStringArrayList(f124221x);
        return stringArrayList != null ? Collections.unmodifiableSet(new HashSet(stringArrayList)) : Collections.EMPTY_SET;
    }

    @Nullable
    public String h() {
        return this.f124224a.getString("status");
    }

    public int i() {
        return this.f124224a.getInt(f124211n);
    }

    @Nullable
    public Bundle j() {
        return this.f124224a.getBundle("extras");
    }

    @NonNull
    @k.y0({k.y0.a.LIBRARY})
    public List<String> k() {
        return !this.f124224a.containsKey(f124200c) ? new ArrayList() : new ArrayList(this.f124224a.getStringArrayList(f124200c));
    }

    @Nullable
    public Uri l() {
        String string = this.f124224a.getString(f124203f);
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @NonNull
    public String m() {
        return this.f124224a.getString("id");
    }

    @k.y0({k.y0.a.LIBRARY})
    public int n() {
        return this.f124224a.getInt(f124220w, Integer.MAX_VALUE);
    }

    @k.y0({k.y0.a.LIBRARY})
    public int o() {
        return this.f124224a.getInt(f124219v, 1);
    }

    @NonNull
    public String p() {
        return this.f124224a.getString("name");
    }

    public int q() {
        return this.f124224a.getInt(f124210m, -1);
    }

    public int r() {
        return this.f124224a.getInt(f124209l, 1);
    }

    public int s() {
        return this.f124224a.getInt(f124215r, -1);
    }

    @Nullable
    public IntentSender t() {
        return (IntentSender) this.f124224a.getParcelable(f124218u);
    }

    @NonNull
    public String toString() {
        return "MediaRouteDescriptor{ id=" + m() + ", groupMemberIds=" + k() + ", name=" + p() + ", description=" + h() + ", iconUri=" + l() + ", isEnabled=" + z() + ", connectionState=" + e() + ", controlFilters=" + Arrays.toString(f().toArray()) + ", playbackType=" + r() + ", playbackStream=" + q() + ", deviceType=" + i() + ", volume=" + u() + ", volumeMax=" + w() + ", volumeHandling=" + v() + ", presentationDisplayId=" + s() + ", extras=" + j() + ", isValid=" + A() + ", minClientVersion=" + o() + ", maxClientVersion=" + n() + ", isVisibilityPublic=" + B() + ", allowedPackages=" + Arrays.toString(d().toArray()) + " }";
    }

    public int u() {
        return this.f124224a.getInt("volume");
    }

    public int v() {
        return this.f124224a.getInt(f124214q, 0);
    }

    public int w() {
        return this.f124224a.getInt(f124213p);
    }

    @Deprecated
    public boolean x() {
        return this.f124224a.getBoolean(f124206i, false);
    }

    public boolean y() {
        return this.f124224a.getBoolean(f124205h, false);
    }

    public boolean z() {
        return this.f124224a.getBoolean("enabled", true);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f124225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<String> f124226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<IntentFilter> f124227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Set<String> f124228d;

        public a(@NonNull String str, @NonNull String str2) {
            this.f124226b = new ArrayList();
            this.f124227c = new ArrayList();
            this.f124228d = new HashSet();
            this.f124225a = new Bundle();
            r(str);
            v(str2);
        }

        @NonNull
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public a A() {
            this.f124225a.putBoolean(y0.f124222y, true);
            this.f124228d.clear();
            return this;
        }

        @NonNull
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public a B(@NonNull Set<String> set) {
            this.f124225a.putBoolean(y0.f124222y, false);
            this.f124228d = new HashSet(set);
            return this;
        }

        @NonNull
        public a C(int i10) {
            this.f124225a.putInt("volume", i10);
            return this;
        }

        @NonNull
        public a D(int i10) {
            this.f124225a.putInt(y0.f124214q, i10);
            return this;
        }

        @NonNull
        public a E(int i10) {
            this.f124225a.putInt(y0.f124213p, i10);
            return this;
        }

        @NonNull
        public a a(@NonNull IntentFilter intentFilter) {
            if (intentFilter == null) {
                throw new IllegalArgumentException("filter must not be null");
            }
            if (!this.f124227c.contains(intentFilter)) {
                this.f124227c.add(intentFilter);
            }
            return this;
        }

        @NonNull
        public a b(@NonNull Collection<IntentFilter> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("filters must not be null");
            }
            if (!collection.isEmpty()) {
                for (IntentFilter intentFilter : collection) {
                    if (intentFilter != null) {
                        a(intentFilter);
                    }
                }
            }
            return this;
        }

        @NonNull
        @k.y0({k.y0.a.LIBRARY})
        public a c(@NonNull String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("groupMemberId must not be empty");
            }
            if (!this.f124226b.contains(str)) {
                this.f124226b.add(str);
            }
            return this;
        }

        @NonNull
        @k.y0({k.y0.a.LIBRARY})
        public a d(@NonNull Collection<String> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("groupMemberIds must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator<String> it = collection.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
            return this;
        }

        @NonNull
        public y0 e() {
            this.f124225a.putParcelableArrayList(y0.f124208k, new ArrayList<>(this.f124227c));
            this.f124225a.putStringArrayList(y0.f124200c, new ArrayList<>(this.f124226b));
            this.f124225a.putStringArrayList(y0.f124223z, new ArrayList<>(this.f124228d));
            return new y0(this.f124225a);
        }

        @NonNull
        public a f() {
            this.f124227c.clear();
            return this;
        }

        @NonNull
        @k.y0({k.y0.a.LIBRARY})
        public a g() {
            this.f124226b.clear();
            return this;
        }

        @NonNull
        @k.y0({k.y0.a.LIBRARY})
        public a h(@NonNull String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("memberRouteId must not be empty");
            }
            this.f124226b.remove(str);
            return this;
        }

        @NonNull
        public a i(boolean z10) {
            this.f124225a.putBoolean(y0.f124217t, z10);
            return this;
        }

        @NonNull
        @Deprecated
        public a j(boolean z10) {
            this.f124225a.putBoolean(y0.f124206i, z10);
            return this;
        }

        @NonNull
        public a k(int i10) {
            this.f124225a.putInt(y0.f124207j, i10);
            return this;
        }

        @NonNull
        public a l(@NonNull Set<String> set) {
            this.f124225a.putStringArrayList(y0.f124221x, new ArrayList<>(set));
            return this;
        }

        @NonNull
        public a m(@Nullable String str) {
            this.f124225a.putString("status", str);
            return this;
        }

        @NonNull
        public a n(int i10) {
            this.f124225a.putInt(y0.f124211n, i10);
            return this;
        }

        @NonNull
        public a o(boolean z10) {
            this.f124225a.putBoolean("enabled", z10);
            return this;
        }

        @NonNull
        public a p(@Nullable Bundle bundle) {
            if (bundle == null) {
                this.f124225a.putBundle("extras", null);
                return this;
            }
            this.f124225a.putBundle("extras", new Bundle(bundle));
            return this;
        }

        @NonNull
        public a q(@NonNull Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("iconUri must not be null");
            }
            this.f124225a.putString(y0.f124203f, uri.toString());
            return this;
        }

        @NonNull
        public a r(@NonNull String str) {
            if (str == null) {
                throw new NullPointerException("id must not be null");
            }
            this.f124225a.putString("id", str);
            return this;
        }

        @NonNull
        public a s(boolean z10) {
            this.f124225a.putBoolean(y0.f124205h, z10);
            return this;
        }

        @NonNull
        @k.y0({k.y0.a.LIBRARY})
        public a t(int i10) {
            this.f124225a.putInt(y0.f124220w, i10);
            return this;
        }

        @NonNull
        @k.y0({k.y0.a.LIBRARY})
        public a u(int i10) {
            this.f124225a.putInt(y0.f124219v, i10);
            return this;
        }

        @NonNull
        public a v(@NonNull String str) {
            if (str == null) {
                throw new NullPointerException("name must not be null");
            }
            this.f124225a.putString("name", str);
            return this;
        }

        @NonNull
        public a w(int i10) {
            this.f124225a.putInt(y0.f124210m, i10);
            return this;
        }

        @NonNull
        public a x(int i10) {
            this.f124225a.putInt(y0.f124209l, i10);
            return this;
        }

        @NonNull
        public a y(int i10) {
            this.f124225a.putInt(y0.f124215r, i10);
            return this;
        }

        @NonNull
        public a z(@Nullable IntentSender intentSender) {
            this.f124225a.putParcelable(y0.f124218u, intentSender);
            return this;
        }

        public a(@NonNull y0 y0Var) {
            this.f124226b = new ArrayList();
            this.f124227c = new ArrayList();
            this.f124228d = new HashSet();
            if (y0Var != null) {
                this.f124225a = new Bundle(y0Var.f124224a);
                this.f124226b = y0Var.k();
                this.f124227c = y0Var.f();
                this.f124228d = y0Var.d();
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }
    }
}
