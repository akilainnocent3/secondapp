package com.apm.insight.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.b.i;
import com.apm.insight.runtime.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class a implements ICrashCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f25755d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f25756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile i.a f25757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile i.a f25758c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f25759e = false;

    private a() {
    }

    public static a a() {
        if (f25755d == null) {
            synchronized (a.class) {
                try {
                    if (f25755d == null) {
                        f25755d = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f25755d;
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    public final void a(String str, i.a aVar, i.a aVar2) {
        this.f25756a = str;
        this.f25757b = aVar;
        this.f25758c = aVar2;
        if (this.f25759e) {
            return;
        }
        this.f25759e = true;
        m.a().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
