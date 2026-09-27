package d3;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.Nullable;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(19)
public class d extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f77718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f77719d;

    public d(@Nullable a aVar, Context context, Uri uri) {
        super(aVar);
        this.f77718c = context;
        this.f77719d = uri;
    }

    @Override // d3.a
    public boolean a() {
        return b.a(this.f77718c, this.f77719d);
    }

    @Override // d3.a
    public boolean b() {
        return b.b(this.f77718c, this.f77719d);
    }

    @Override // d3.a
    public a c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // d3.a
    public a d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // d3.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f77718c.getContentResolver(), this.f77719d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // d3.a
    public boolean f() {
        return b.d(this.f77718c, this.f77719d);
    }

    @Override // d3.a
    @Nullable
    public String k() {
        return b.f(this.f77718c, this.f77719d);
    }

    @Override // d3.a
    @Nullable
    public String m() {
        return b.h(this.f77718c, this.f77719d);
    }

    @Override // d3.a
    public Uri n() {
        return this.f77719d;
    }

    @Override // d3.a
    public boolean o() {
        return b.i(this.f77718c, this.f77719d);
    }

    @Override // d3.a
    public boolean q() {
        return b.j(this.f77718c, this.f77719d);
    }

    @Override // d3.a
    public boolean r() {
        return b.k(this.f77718c, this.f77719d);
    }

    @Override // d3.a
    public long s() {
        return b.l(this.f77718c, this.f77719d);
    }

    @Override // d3.a
    public long t() {
        return b.m(this.f77718c, this.f77719d);
    }

    @Override // d3.a
    public a[] u() {
        throw new UnsupportedOperationException();
    }

    @Override // d3.a
    public boolean v(String str) {
        throw new UnsupportedOperationException();
    }
}
