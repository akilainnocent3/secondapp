package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public final class i4 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o3 f10046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f10048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a1[] f10049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v2 f10050e;

    public i4(o3 syntax, boolean messageSetWireFormat, int[] checkInitialized, a1[] fields, Object defaultInstance) {
        this.f10046a = syntax;
        this.f10047b = messageSetWireFormat;
        this.f10048c = checkInitialized;
        this.f10049d = fields;
        this.f10050e = (v2) t1.e(defaultInstance, "defaultInstance");
    }

    public static a c() {
        return new a();
    }

    public static a d(int numFields) {
        return new a(numFields);
    }

    public int[] a() {
        return this.f10048c;
    }

    public a1[] b() {
        return this.f10049d;
    }

    @Override // androidx.datastore.preferences.protobuf.t2
    public v2 getDefaultInstance() {
        return this.f10050e;
    }

    @Override // androidx.datastore.preferences.protobuf.t2
    public o3 getSyntax() {
        return this.f10046a;
    }

    @Override // androidx.datastore.preferences.protobuf.t2
    public boolean isMessageSetWireFormat() {
        return this.f10047b;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<a1> f10051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o3 f10052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10053c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f10054d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f10055e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f10056f;

        public a() {
            this.f10055e = null;
            this.f10051a = new ArrayList();
        }

        public i4 a() {
            if (this.f10053c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.f10052b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.f10053c = true;
            Collections.sort(this.f10051a);
            return new i4(this.f10052b, this.f10054d, this.f10055e, (a1[]) this.f10051a.toArray(new a1[0]), this.f10056f);
        }

        public void b(int[] checkInitialized) {
            this.f10055e = checkInitialized;
        }

        public void c(Object defaultInstance) {
            this.f10056f = defaultInstance;
        }

        public void d(a1 field) {
            if (this.f10053c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.f10051a.add(field);
        }

        public void e(boolean messageSetWireFormat) {
            this.f10054d = messageSetWireFormat;
        }

        public void f(o3 syntax) {
            this.f10052b = (o3) t1.e(syntax, "syntax");
        }

        public a(int numFields) {
            this.f10055e = null;
            this.f10051a = new ArrayList(numFields);
        }
    }
}
