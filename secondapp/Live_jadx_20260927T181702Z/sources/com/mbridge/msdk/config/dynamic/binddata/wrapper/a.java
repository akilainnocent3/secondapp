package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, List<b<String>>> f65972a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f65973b = new HashMap();

    public void a(String str, b<String> bVar) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                ((List) this.f65972a.computeIfAbsent(str, new Function() { // from class: mn.b
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return com.mbridge.msdk.config.dynamic.binddata.wrapper.a.a((String) obj);
                    }
                })).add(bVar);
                return;
            }
            List<b<String>> copyOnWriteArrayList = this.f65972a.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.f65972a.put(str, copyOnWriteArrayList);
            }
            if (copyOnWriteArrayList.contains(bVar)) {
                return;
            }
            copyOnWriteArrayList.add(bVar);
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to add map observer: " + e10.getMessage(), e10);
        }
    }

    public boolean d() {
        return this.f65973b.isEmpty();
    }

    public int e() {
        return this.f65973b.size();
    }

    @NonNull
    public String toString() {
        return this.f65973b.toString();
    }

    public void b(String str, b<String> bVar) {
        try {
            a(str, bVar);
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to pre-register map observer: " + e10.getMessage(), e10);
        }
    }

    public Map<String, List<b<String>>> c() {
        return this.f65972a;
    }

    @Nullable
    public Object c(@Nullable Object obj) {
        return this.f65973b.remove(obj);
    }

    public Map<String, Object> b() {
        return this.f65973b;
    }

    public void b(Map<String, List<b<String>>> map) {
        this.f65972a.clear();
        this.f65972a.putAll(map);
    }

    @Nullable
    public Object b(@Nullable Object obj) {
        return this.f65973b.get(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List a(String str) {
        return new CopyOnWriteArrayList();
    }

    public boolean a(@Nullable Object obj) {
        return this.f65973b.containsKey(obj);
    }

    @NonNull
    public Set<Map.Entry<String, Object>> a() {
        return this.f65973b.entrySet();
    }

    public void a(@NonNull Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public Integer a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            this.f65973b.put(str, obj);
            a(str, obj, str);
            return 1;
        } catch (Exception e10) {
            q0.b("ObservableMap", e10.getMessage(), e10);
            return 0;
        }
    }

    public Integer a(String str, String str2, Object obj) {
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        try {
            this.f65973b.put(str2, obj);
            a(str, obj, str2);
            return 1;
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to notify map observers: " + e10.getMessage(), e10);
            return 0;
        }
    }

    private void a(final String str, final Object obj, String str2) {
        List<b<String>> list;
        if (this.f65972a.containsKey(str) && (list = this.f65972a.get(str)) != null) {
            for (final b<String> bVar : list) {
                if (bVar instanceof d) {
                    View viewA = ((d) bVar).a();
                    if (viewA != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            bVar.a(str, obj);
                        } else {
                            viewA.post(new Runnable() { // from class: mn.c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bVar.a(str, obj);
                                }
                            });
                        }
                    } else {
                        bVar.a(str, obj);
                    }
                } else {
                    bVar.a(str, obj);
                }
            }
        }
    }
}
