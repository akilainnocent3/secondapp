package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.o;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o<CHILD extends o<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nc.g<? super TranscodeType> f31556b = nc.e.c();

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    public final CHILD b() {
        return (CHILD) g(nc.e.c());
    }

    public final nc.g<? super TranscodeType> c() {
        return this.f31556b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return pc.o.e(this.f31556b, ((o) obj).f31556b);
        }
        return false;
    }

    @NonNull
    public final CHILD f(int i10) {
        return (CHILD) g(new nc.h(i10));
    }

    @NonNull
    public final CHILD g(@NonNull nc.g<? super TranscodeType> gVar) {
        this.f31556b = (nc.g) pc.m.e(gVar);
        return (CHILD) e();
    }

    public int hashCode() {
        nc.g<? super TranscodeType> gVar = this.f31556b;
        if (gVar != null) {
            return gVar.hashCode();
        }
        return 0;
    }

    @NonNull
    public final CHILD i(@NonNull nc.j.a aVar) {
        return (CHILD) g(new nc.i(aVar));
    }

    public final CHILD e() {
        return this;
    }
}
