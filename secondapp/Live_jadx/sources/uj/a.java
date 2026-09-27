package uj;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k.a1;
import k.i1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: uj.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @KeepForSdk
    public interface InterfaceC1442a {
        @KeepForSdk
        void a();

        @KeepForSdk
        void b();

        @KeepForSdk
        void c(@NonNull Set<String> set);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @KeepForSdk
    public interface b {
        @KeepForSdk
        void a(int i10, @Nullable Bundle bundle);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @KeepForSdk
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        @KeepForSdk
        public String f139561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        @KeepForSdk
        public String f139562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        @KeepForSdk
        public Object f139563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        @KeepForSdk
        public String f139564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @KeepForSdk
        public long f139565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        @KeepForSdk
        public String f139566f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        @KeepForSdk
        public Bundle f139567g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        @KeepForSdk
        public String f139568h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        @KeepForSdk
        public Bundle f139569i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @KeepForSdk
        public long f139570j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        @KeepForSdk
        public String f139571k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        @KeepForSdk
        public Bundle f139572l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @KeepForSdk
        public long f139573m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @KeepForSdk
        public boolean f139574n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @KeepForSdk
        public long f139575o;
    }

    @KeepForSdk
    void a(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle);

    @KeepForSdk
    void b(@NonNull c cVar);

    @KeepForSdk
    void c(@NonNull String str, @NonNull String str2, @NonNull Object obj);

    @KeepForSdk
    void clearConditionalUserProperty(@NonNull @a1(max = 24, min = 1) String str, @Nullable String str2, @Nullable Bundle bundle);

    @Nullable
    @KeepForSdk
    @xj.a
    InterfaceC1442a d(@NonNull String str, @NonNull b bVar);

    @i1
    @KeepForSdk
    int e(@NonNull @a1(min = 1) String str);

    @NonNull
    @i1
    @KeepForSdk
    List<c> f(@NonNull String str, @Nullable @a1(max = 23, min = 1) String str2);

    @NonNull
    @i1
    @KeepForSdk
    Map<String, Object> g(boolean z10);
}
