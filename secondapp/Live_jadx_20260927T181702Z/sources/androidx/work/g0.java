package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<UUID> f20095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f20096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f20097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<e0.a> f20098d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<UUID> f20099a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<String> f20100b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<String> f20101c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<e0.a> f20102d = new ArrayList();

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static a f(@NonNull List<UUID> ids) {
            a aVar = new a();
            aVar.a(ids);
            return aVar;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static a g(@NonNull List<e0.a> states) {
            a aVar = new a();
            aVar.b(states);
            return aVar;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static a h(@NonNull List<String> tags) {
            a aVar = new a();
            aVar.c(tags);
            return aVar;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static a i(@NonNull List<String> uniqueWorkNames) {
            a aVar = new a();
            aVar.d(uniqueWorkNames);
            return aVar;
        }

        @NonNull
        public a a(@NonNull List<UUID> ids) {
            this.f20099a.addAll(ids);
            return this;
        }

        @NonNull
        public a b(@NonNull List<e0.a> states) {
            this.f20102d.addAll(states);
            return this;
        }

        @NonNull
        public a c(@NonNull List<String> tags) {
            this.f20101c.addAll(tags);
            return this;
        }

        @NonNull
        public a d(@NonNull List<String> uniqueWorkNames) {
            this.f20100b.addAll(uniqueWorkNames);
            return this;
        }

        @NonNull
        public g0 e() {
            if (this.f20099a.isEmpty() && this.f20100b.isEmpty() && this.f20101c.isEmpty() && this.f20102d.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new g0(this);
        }
    }

    public g0(@NonNull a builder) {
        this.f20095a = builder.f20099a;
        this.f20096b = builder.f20100b;
        this.f20097c = builder.f20101c;
        this.f20098d = builder.f20102d;
    }

    @NonNull
    public List<UUID> a() {
        return this.f20095a;
    }

    @NonNull
    public List<e0.a> b() {
        return this.f20098d;
    }

    @NonNull
    public List<String> c() {
        return this.f20097c;
    }

    @NonNull
    public List<String> d() {
        return this.f20096b;
    }
}
