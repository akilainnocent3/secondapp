package com.startapp.sdk.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ai implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f74552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable[] f74553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f74554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f74555d;

    public ai(Throwable th2) {
        this.f74552a = th2;
        this.f74553b = th2.getSuppressed();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Throwable next() {
        int i10;
        Throwable th2 = this.f74552a;
        this.f74555d = false;
        if (th2 != null) {
            this.f74552a = th2.getCause();
        } else {
            Throwable[] thArr = this.f74553b;
            if (thArr != null && (i10 = this.f74554c) < thArr.length) {
                this.f74555d = i10 == 0;
                this.f74554c = i10 + 1;
                th2 = thArr[i10];
            }
        }
        if (th2 != null) {
            return th2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f74552a != null) {
            return true;
        }
        Throwable[] thArr = this.f74553b;
        return thArr != null && this.f74554c < thArr.length;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
