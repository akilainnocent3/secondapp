package xb;

import androidx.annotation.NonNull;
import e2.w;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import pc.o;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc.j<tb.f, String> f144815a = new pc.j<>(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w.a<b> f144816b = qc.a.e(10, new a());

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements qc.a.d<b> {
        public a() {
        }

        @Override // qc.a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance(to.c.algoTypeS2));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements qc.a.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MessageDigest f144818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final qc.c f144819c = qc.c.a();

        public b(MessageDigest messageDigest) {
            this.f144818b = messageDigest;
        }

        @Override // qc.a.f
        @NonNull
        public qc.c d() {
            return this.f144819c;
        }
    }

    public final String a(tb.f fVar) {
        b bVar = (b) pc.m.e(this.f144816b.a());
        try {
            fVar.a(bVar.f144818b);
            return o.A(bVar.f144818b.digest());
        } finally {
            this.f144816b.b(bVar);
        }
    }

    public String b(tb.f fVar) {
        String strJ;
        synchronized (this.f144815a) {
            strJ = this.f144815a.j(fVar);
        }
        if (strJ == null) {
            strJ = a(fVar);
        }
        synchronized (this.f144815a) {
            this.f144815a.n(fVar, strJ);
        }
        return strJ;
    }
}
