package com.startapp.sdk.internal;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class d9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e9 f74672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f74673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f74674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f74675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f74676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f74677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f74678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f74679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f74680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f74681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f74682k;

    public d9(e9 e9Var) {
        if (e9Var != e9.f74723f) {
            this.f74672a = e9Var;
        } else {
            this.f74672a = e9.f74722e;
        }
        e9 e9Var2 = this.f74672a;
        if (e9Var2 == e9.f74722e || e9Var2 == e9.f74721d) {
            this.f74680i = si.a(si.a(0));
        }
        this.f74673b = 0L;
    }

    @k.t
    public static void a(@NonNull Throwable th2) {
        try {
            new d9(th2).a();
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        try {
            com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.U.f75692a;
            if (aVar != null) {
                ((t9) aVar.f74472q.a()).a(this);
            }
        } catch (Throwable unused) {
        }
    }

    @k.t
    public static void a(@NonNull Throwable th2, @NonNull e9 e9Var) {
        try {
            new d9(th2, e9Var).a();
        } catch (Throwable unused) {
        }
    }

    public d9(Throwable th2) {
        this.f74672a = e9.f74723f;
        this.f74676e = si.b(th2);
        this.f74675d = si.a(si.a(th2));
        this.f74680i = si.a(si.a(1));
        this.f74673b = 0L;
    }

    public d9(Throwable th2, e9 e9Var) {
        boolean z10 = e9Var == e9.f74724g;
        this.f74672a = e9Var;
        this.f74676e = si.b(th2);
        this.f74675d = si.a(si.a(th2));
        this.f74680i = z10 ? th2.getClass().getName() : si.a(si.a(1));
        this.f74673b = 0L;
    }

    public d9(e9 e9Var, long j10) {
        this.f74672a = e9Var;
        this.f74673b = j10;
    }
}
