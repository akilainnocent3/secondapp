package com.airbnb.lottie;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final db.f f25003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final db.e f25004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.a f25008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xa.c f25009g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public db.f f25010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public db.e f25011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f25012c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f25013d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f25014e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public com.airbnb.lottie.a f25015f = com.airbnb.lottie.a.AUTOMATIC;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public xa.c f25016g = new xa.d();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements db.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ File f25017a;

            public a(File file) {
                this.f25017a = file;
            }

            @Override // db.e
            @NonNull
            public File a() {
                if (this.f25017a.isDirectory()) {
                    return this.f25017a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        /* JADX INFO: renamed from: com.airbnb.lottie.g0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C0251b implements db.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ db.e f25019a;

            public C0251b(db.e eVar) {
                this.f25019a = eVar;
            }

            @Override // db.e
            @NonNull
            public File a() {
                File fileA = this.f25019a.a();
                if (fileA.isDirectory()) {
                    return fileA;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        @NonNull
        public g0 a() {
            return new g0(this.f25010a, this.f25011b, this.f25012c, this.f25013d, this.f25014e, this.f25015f, this.f25016g);
        }

        @NonNull
        public b b(com.airbnb.lottie.a aVar) {
            this.f25015f = aVar;
            return this;
        }

        @NonNull
        public b c(boolean z10) {
            this.f25014e = z10;
            return this;
        }

        @NonNull
        public b d(boolean z10) {
            this.f25013d = z10;
            return this;
        }

        @NonNull
        public b e(boolean z10) {
            this.f25012c = z10;
            return this;
        }

        @NonNull
        public b f(@NonNull File file) {
            if (this.f25011b != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.f25011b = new a(file);
            return this;
        }

        @NonNull
        public b g(@NonNull db.e eVar) {
            if (this.f25011b != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.f25011b = new C0251b(eVar);
            return this;
        }

        @NonNull
        public b h(@NonNull db.f fVar) {
            this.f25010a = fVar;
            return this;
        }

        @NonNull
        public b i(xa.c cVar) {
            this.f25016g = cVar;
            return this;
        }
    }

    public g0(@Nullable db.f fVar, @Nullable db.e eVar, boolean z10, boolean z11, boolean z12, com.airbnb.lottie.a aVar, xa.c cVar) {
        this.f25003a = fVar;
        this.f25004b = eVar;
        this.f25005c = z10;
        this.f25006d = z11;
        this.f25007e = z12;
        this.f25008f = aVar;
        this.f25009g = cVar;
    }
}
