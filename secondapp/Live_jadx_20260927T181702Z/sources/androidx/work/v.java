package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import k.y0;
import nj.t1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    @y0({y0.a.LIBRARY_GROUP})
    public static final b.c f20312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    @y0({y0.a.LIBRARY_GROUP})
    public static final b.C0181b f20313b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f20314a;

            public a(@NonNull Throwable exception) {
                this.f20314a = exception;
            }

            @NonNull
            public Throwable a() {
                return this.f20314a;
            }

            @NonNull
            public String toString() {
                return String.format("FAILURE (%s)", this.f20314a.getMessage());
            }
        }

        /* JADX INFO: renamed from: androidx.work.v$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0181b extends b {
            @NonNull
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0181b() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class c extends b {
            @NonNull
            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }

        @y0({y0.a.LIBRARY_GROUP})
        public b() {
        }
    }

    static {
        f20312a = new b.c();
        f20313b = new b.C0181b();
    }

    @NonNull
    t1<b.c> getResult();

    @NonNull
    LiveData<b> getState();
}
