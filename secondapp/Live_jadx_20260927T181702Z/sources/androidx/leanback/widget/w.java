package androidx.leanback.widget;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class w extends a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13122b;

    public w() {
        this(s3.a.j.f128837l);
    }

    @Override // androidx.leanback.widget.a2
    public a2.a e(ViewGroup viewGroup) {
        return new a2.a(LayoutInflater.from(viewGroup.getContext()).inflate(this.f13122b, viewGroup, false));
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public w(int i10) {
        this.f13122b = i10;
    }

    @Override // androidx.leanback.widget.a2
    public void f(a2.a aVar) {
    }

    @Override // androidx.leanback.widget.a2
    public void c(a2.a aVar, Object obj) {
    }
}
