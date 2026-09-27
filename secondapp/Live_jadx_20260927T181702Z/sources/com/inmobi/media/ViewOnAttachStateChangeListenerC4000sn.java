package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.inmobi.media.sn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC4000sn implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lv.l0 f57657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f57658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f57659c;

    public ViewOnAttachStateChangeListenerC4000sn(lv.l0 l0Var, View view, ViewGroup viewGroup) {
        this.f57657a = l0Var;
        this.f57658b = view;
        this.f57659c = viewGroup;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v10) {
        kotlin.jvm.internal.m0.p(v10, "v");
        this.f57657a.j(Boolean.valueOf(AbstractC4075vn.a(this.f57658b, this.f57659c)));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v10) {
        kotlin.jvm.internal.m0.p(v10, "v");
        this.f57657a.j(Boolean.FALSE);
    }
}
