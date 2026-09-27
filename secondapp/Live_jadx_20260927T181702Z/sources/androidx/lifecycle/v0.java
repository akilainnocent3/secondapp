package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import dr.v1;
import fr.z1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n361#2,3:451\n364#2,4:455\n1#3:454\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n198#1:451,3\n198#1:455,4\n*E\n"})
public final class v0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public static final String f13454g = "values";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public static final String f13455h = "keys";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Map<String, Object> f13457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Map<String, androidx.savedstate.a.c> f13458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final Map<String, b<?>> f13459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final Map<String, nv.k0<Object>> f13460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public final androidx.savedstate.a.c f13461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public static final a f13453f = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    public static final Class<? extends Object>[] f13456i = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        @cs.o
        @k.y0({k.y0.a.LIBRARY_GROUP})
        public final v0 a(@oy.m Bundle bundle, @oy.m Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new v0();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    kotlin.jvm.internal.m0.o(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new v0(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(v0.f13454g);
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                kotlin.jvm.internal.m0.n(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new v0(linkedHashMap);
        }

        @k.y0({k.y0.a.LIBRARY_GROUP})
        public final boolean b(@oy.m Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : v0.f13456i) {
                kotlin.jvm.internal.m0.m(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        public a() {
        }
    }

    public v0(@oy.l Map<String, ? extends Object> initialState) {
        kotlin.jvm.internal.m0.p(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f13457a = linkedHashMap;
        this.f13458b = new LinkedHashMap();
        this.f13459c = new LinkedHashMap();
        this.f13460d = new LinkedHashMap();
        this.f13461e = new androidx.savedstate.a.c() { // from class: androidx.lifecycle.u0
            @Override // androidx.savedstate.a.c
            public final Bundle d() {
                return v0.p(this.f13452a);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    @oy.l
    @cs.o
    @k.y0({k.y0.a.LIBRARY_GROUP})
    public static final v0 g(@oy.m Bundle bundle, @oy.m Bundle bundle2) {
        return f13453f.a(bundle, bundle2);
    }

    public static final Bundle p(v0 this$0) {
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        for (Map.Entry entry : fr.n1.D0(this$0.f13458b).entrySet()) {
            this$0.q((String) entry.getKey(), ((androidx.savedstate.a.c) entry.getValue()).d());
        }
        Set<String> setKeySet = this$0.f13457a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f13457a.get(str));
        }
        return u1.d.b(v1.a("keys", arrayList), v1.a(f13454g, arrayList2));
    }

    @k.j0
    public final void e(@oy.l String key) {
        kotlin.jvm.internal.m0.p(key, "key");
        this.f13458b.remove(key);
    }

    @k.j0
    public final boolean f(@oy.l String key) {
        kotlin.jvm.internal.m0.p(key, "key");
        return this.f13457a.containsKey(key);
    }

    @k.j0
    @oy.m
    public final <T> T h(@oy.l String key) {
        kotlin.jvm.internal.m0.p(key, "key");
        try {
            return (T) this.f13457a.get(key);
        } catch (ClassCastException unused) {
            n(key);
            return null;
        }
    }

    @oy.l
    @k.j0
    public final <T> l0<T> i(@oy.l String key) {
        kotlin.jvm.internal.m0.p(key, "key");
        l0<T> l0VarK = k(key, false, null);
        kotlin.jvm.internal.m0.n(l0VarK, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return l0VarK;
    }

    @oy.l
    @k.j0
    public final <T> l0<T> j(@oy.l String key, T t10) {
        kotlin.jvm.internal.m0.p(key, "key");
        return k(key, true, t10);
    }

    public final <T> l0<T> k(String str, boolean z10, T t10) {
        b<?> bVar;
        b<?> bVar2 = this.f13459c.get(str);
        b<?> bVar3 = bVar2 instanceof l0 ? bVar2 : null;
        if (bVar3 != null) {
            return bVar3;
        }
        if (this.f13457a.containsKey(str)) {
            bVar = new b<>(this, str, this.f13457a.get(str));
        } else if (z10) {
            this.f13457a.put(str, t10);
            bVar = new b<>(this, str, t10);
        } else {
            bVar = new b<>(this, str);
        }
        this.f13459c.put(str, bVar);
        return bVar;
    }

    @oy.l
    @k.j0
    public final <T> nv.z0<T> l(@oy.l String key, T t10) {
        kotlin.jvm.internal.m0.p(key, "key");
        Map<String, nv.k0<Object>> map = this.f13460d;
        nv.k0<Object> k0VarA = map.get(key);
        if (k0VarA == null) {
            if (!this.f13457a.containsKey(key)) {
                this.f13457a.put(key, t10);
            }
            k0VarA = nv.b1.a(this.f13457a.get(key));
            this.f13460d.put(key, k0VarA);
            map.put(key, k0VarA);
        }
        nv.z0<T> z0VarN = nv.k.n(k0VarA);
        kotlin.jvm.internal.m0.n(z0VarN, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return z0VarN;
    }

    @oy.l
    @k.j0
    public final Set<String> m() {
        return z1.C(z1.C(this.f13457a.keySet(), this.f13458b.keySet()), this.f13459c.keySet());
    }

    @k.j0
    @oy.m
    public final <T> T n(@oy.l String key) {
        kotlin.jvm.internal.m0.p(key, "key");
        T t10 = (T) this.f13457a.remove(key);
        b<?> bVarRemove = this.f13459c.remove(key);
        if (bVarRemove != null) {
            bVarRemove.s();
        }
        this.f13460d.remove(key);
        return t10;
    }

    @oy.l
    @k.y0({k.y0.a.LIBRARY_GROUP})
    public final androidx.savedstate.a.c o() {
        return this.f13461e;
    }

    @k.j0
    public final <T> void q(@oy.l String key, @oy.m T t10) {
        kotlin.jvm.internal.m0.p(key, "key");
        if (!f13453f.b(t10)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't put value with type ");
            kotlin.jvm.internal.m0.m(t10);
            sb2.append(t10.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        b<?> bVar = this.f13459c.get(key);
        b<?> bVar2 = bVar instanceof l0 ? bVar : null;
        if (bVar2 != null) {
            bVar2.r(t10);
        } else {
            this.f13457a.put(key, t10);
        }
        nv.k0<Object> k0Var = this.f13460d.get(key);
        if (k0Var == null) {
            return;
        }
        k0Var.setValue(t10);
    }

    @k.j0
    public final void r(@oy.l String key, @oy.l androidx.savedstate.a.c provider) {
        kotlin.jvm.internal.m0.p(key, "key");
        kotlin.jvm.internal.m0.p(provider, "provider");
        this.f13458b.put(key, provider);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b<T> extends l0<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @oy.l
        public String f13462m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @oy.m
        public v0 f13463n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@oy.m v0 v0Var, @oy.l String key, T t10) {
            super(t10);
            kotlin.jvm.internal.m0.p(key, "key");
            this.f13462m = key;
            this.f13463n = v0Var;
        }

        @Override // androidx.lifecycle.l0, androidx.lifecycle.LiveData
        public void r(T t10) {
            v0 v0Var = this.f13463n;
            if (v0Var != null) {
                v0Var.f13457a.put(this.f13462m, t10);
                nv.k0 k0Var = (nv.k0) v0Var.f13460d.get(this.f13462m);
                if (k0Var != null) {
                    k0Var.setValue(t10);
                }
            }
            super.r(t10);
        }

        public final void s() {
            this.f13463n = null;
        }

        public b(@oy.m v0 v0Var, @oy.l String key) {
            kotlin.jvm.internal.m0.p(key, "key");
            this.f13462m = key;
            this.f13463n = v0Var;
        }
    }

    public v0() {
        this.f13457a = new LinkedHashMap();
        this.f13458b = new LinkedHashMap();
        this.f13459c = new LinkedHashMap();
        this.f13460d = new LinkedHashMap();
        this.f13461e = new androidx.savedstate.a.c() { // from class: androidx.lifecycle.u0
            @Override // androidx.savedstate.a.c
            public final Bundle d() {
                return v0.p(this.f13452a);
            }
        };
    }
}
