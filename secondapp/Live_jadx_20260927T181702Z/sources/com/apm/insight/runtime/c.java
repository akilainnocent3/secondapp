package com.apm.insight.runtime;

import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f26223a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ICrashCallback> f26224b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<ICrashCallback> f26225c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<ICrashCallback> f26226d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<IOOMCallback> f26227e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26228a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f26228a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26228a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26228a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26228a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26228a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final void a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f26228a[crashType.ordinal()];
        if (i10 == 1) {
            this.f26223a.add(iCrashCallback);
            this.f26224b.add(iCrashCallback);
            this.f26225c.add(iCrashCallback);
            this.f26226d.add(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f26226d.add(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f26224b.add(iCrashCallback);
        } else if (i10 == 4) {
            this.f26223a.add(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f26225c.add(iCrashCallback);
        }
    }

    public final void b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f26228a[crashType.ordinal()];
        if (i10 == 1) {
            this.f26223a.remove(iCrashCallback);
            this.f26224b.remove(iCrashCallback);
            this.f26225c.remove(iCrashCallback);
            this.f26226d.remove(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f26226d.remove(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f26224b.remove(iCrashCallback);
        } else if (i10 == 4) {
            this.f26223a.remove(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f26225c.remove(iCrashCallback);
        }
    }

    @NonNull
    public final List<ICrashCallback> c() {
        return this.f26224b;
    }

    @NonNull
    public final List<ICrashCallback> d() {
        return this.f26225c;
    }

    @NonNull
    public final List<ICrashCallback> e() {
        return this.f26226d;
    }

    public final void a(IOOMCallback iOOMCallback) {
        this.f26227e.add(iOOMCallback);
    }

    public final void b(IOOMCallback iOOMCallback) {
        this.f26227e.remove(iOOMCallback);
    }

    @NonNull
    public final List<IOOMCallback> a() {
        return this.f26227e;
    }

    @NonNull
    public final List<ICrashCallback> b() {
        return this.f26223a;
    }
}
