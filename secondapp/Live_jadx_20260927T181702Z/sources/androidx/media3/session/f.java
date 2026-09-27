package androidx.media3.session;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@x4.m1
public final class f implements x4.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4.i f15032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f15033b;

    public f(x4.i iVar) {
        this.f15032a = iVar;
    }

    @Override // x4.i
    public nj.t1<Bitmap> a(byte[] bArr) {
        b bVar = this.f15033b;
        if (bVar != null && bVar.h(bArr)) {
            return this.f15033b.e();
        }
        nj.t1<Bitmap> t1VarA = this.f15032a.a(bArr);
        this.f15033b = new b(bArr, t1VarA);
        return t1VarA;
    }

    @Override // x4.i
    public nj.t1<Bitmap> b(Uri uri) {
        b bVar = this.f15033b;
        if (bVar != null && bVar.f(uri)) {
            return this.f15033b.e();
        }
        nj.t1<Bitmap> t1VarB = this.f15032a.b(uri);
        this.f15033b = new b(uri, t1VarB);
        return t1VarB;
    }

    @Override // x4.i
    @Nullable
    public nj.t1<Bitmap> c(u4.i1 i1Var) {
        b bVar = this.f15033b;
        if (bVar != null && bVar.g(i1Var)) {
            return this.f15033b.e();
        }
        nj.t1<Bitmap> t1VarC = this.f15032a.c(i1Var);
        if (t1VarC == null) {
            return null;
        }
        this.f15033b = new b(i1Var, t1VarC);
        return t1VarC;
    }

    @Override // x4.i
    public boolean d(String str) {
        return this.f15032a.d(str);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final byte[] f15034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Uri f15035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final nj.t1<Bitmap> f15036c;

        public final nj.t1<Bitmap> e() {
            return (nj.t1) zi.l0.E(this.f15036c);
        }

        public final boolean f(Uri uri) {
            Uri uri2 = this.f15035b;
            return uri2 != null && uri2.equals(uri);
        }

        public final boolean g(u4.i1 i1Var) {
            Uri uri = this.f15035b;
            if (uri != null && uri.equals(i1Var.f138534n)) {
                return true;
            }
            byte[] bArr = this.f15034a;
            return bArr != null && Arrays.equals(bArr, i1Var.f138531k);
        }

        public final boolean h(byte[] bArr) {
            byte[] bArr2 = this.f15034a;
            return bArr2 != null && Arrays.equals(bArr2, bArr);
        }

        public b(byte[] bArr, nj.t1<Bitmap> t1Var) {
            this.f15034a = bArr;
            this.f15035b = null;
            this.f15036c = t1Var;
        }

        public b(Uri uri, nj.t1<Bitmap> t1Var) {
            this.f15034a = null;
            this.f15035b = uri;
            this.f15036c = t1Var;
        }

        public b(u4.i1 i1Var, nj.t1<Bitmap> t1Var) {
            this.f15034a = i1Var.f138531k;
            this.f15035b = i1Var.f138534n;
            this.f15036c = t1Var;
        }
    }
}
