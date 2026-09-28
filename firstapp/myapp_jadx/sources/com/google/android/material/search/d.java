package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AnimatorListenerAdapter {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e eVar = this.a;
        eVar.c.setVisibility(8);
        SearchView searchView = eVar.a;
        if (!searchView.g()) {
            searchView.e();
        }
        searchView.setTransitionState(SearchView.b.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.setTransitionState(SearchView.b.a);
    }
}
