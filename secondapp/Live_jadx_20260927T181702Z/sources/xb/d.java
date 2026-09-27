package xb;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class d implements xb.a.InterfaceC1523a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f144772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f144773d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f144774a;

        public a(String str) {
            this.f144774a = str;
        }

        @Override // xb.d.c
        public File a() {
            return new File(this.f144774a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f144775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f144776b;

        public b(String str, String str2) {
            this.f144775a = str;
            this.f144776b = str2;
        }

        @Override // xb.d.c
        public File a() {
            return new File(this.f144775a, this.f144776b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        File a();
    }

    public d(String str, long j10) {
        this(new a(str), j10);
    }

    @Override // xb.a.InterfaceC1523a
    public xb.a build() {
        File fileA = this.f144773d.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return e.d(fileA, this.f144772c);
        }
        return null;
    }

    public d(String str, String str2, long j10) {
        this(new b(str, str2), j10);
    }

    public d(c cVar, long j10) {
        this.f144772c = j10;
        this.f144773d = cVar;
    }
}
