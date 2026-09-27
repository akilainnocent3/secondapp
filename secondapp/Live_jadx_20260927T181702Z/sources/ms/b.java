package ms;

import fr.e0;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f115125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f115126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f115127e;

    public b(char c10, char c11, int i10) {
        this.f115124b = i10;
        this.f115125c = c11;
        boolean z10 = false;
        if (i10 <= 0 ? m0.t(c10, c11) >= 0 : m0.t(c10, c11) <= 0) {
            z10 = true;
        }
        this.f115126d = z10;
        this.f115127e = z10 ? c10 : c11;
    }

    @Override // fr.e0
    public char b() {
        int i10 = this.f115127e;
        if (i10 != this.f115125c) {
            this.f115127e = this.f115124b + i10;
        } else {
            if (!this.f115126d) {
                throw new NoSuchElementException();
            }
            this.f115126d = false;
        }
        return (char) i10;
    }

    public final int d() {
        return this.f115124b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f115126d;
    }
}
