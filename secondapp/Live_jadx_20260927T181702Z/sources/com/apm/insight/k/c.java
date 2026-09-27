package com.apm.insight.k;

import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f26044a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26045a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f26045a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26045a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26045a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f26046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONObject f26047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CrashType f26048c;

        public a(JSONObject jSONObject, CrashType crashType) {
            this.f26048c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f26046a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f26046a = jSONObject;
            }
            this.f26047b = jSONObject.optJSONObject("header");
        }

        @Nullable
        public final String a() {
            return this.f26046a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.f26046a.optInt("app_start_time", -1);
        }

        @Nullable
        public final String c() {
            int i10 = AnonymousClass1.f26045a[this.f26048c.ordinal()];
            if (i10 == 1) {
                return this.f26046a.optString("data", null);
            }
            if (i10 == 2) {
                return this.f26046a.optString("stack", null);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f26046a.optString("data", null);
        }
    }

    public static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f26044a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!f26044a.isEmpty()) {
            f26044a.poll();
        }
        f26044a = null;
    }
}
