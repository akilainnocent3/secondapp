package sg.bigo.ads.common.u.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.u.a;
import sg.bigo.ads.common.u.f;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c<T extends sg.bigo.ads.common.u.a> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f133347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final T f133348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Executor f133349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f133350m = 15000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map<String, Set<String>> f133351n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f133352o;

    public c(int i10, @NonNull T t10, boolean z10, Context context) {
        this.f133347j = i10;
        this.f133348k = t10;
        this.f133352o = z10;
        a("BIGO-Ad-Request-Id", String.valueOf(i10));
        a("User-Agent", sg.bigo.ads.common.aa.c.c(context));
    }

    @NonNull
    private Set<String> b(@NonNull String str) {
        Set<String> set = this.f133351n.get(str);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.f133351n.put(str, hashSet);
        return hashSet;
    }

    @NonNull
    public String a() {
        return "GET";
    }

    @Nullable
    public byte[] c() {
        return null;
    }

    @Nullable
    public String d() {
        return null;
    }

    public int e() {
        return -1;
    }

    public boolean f() {
        return false;
    }

    @NonNull
    public final String g() {
        return this.f133348k.a();
    }

    public final void a(String str) {
        b(str).clear();
    }

    @Nullable
    public f b() {
        return null;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        b(str).add(str2);
    }

    public void h() {
    }
}
