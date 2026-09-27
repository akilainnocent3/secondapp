package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f51411b;

    public k(j jVar) {
        this.f51411b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f51411b.f51401i = null;
    }
}
