package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ e a;

    public c(e eVar) {
        this.a = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e eVar = this.a;
        SearchView searchView = eVar.a;
        SearchView searchView2 = eVar.a;
        if (!searchView.g()) {
            searchView2.j();
        }
        searchView2.setTransitionState(SearchView.b.d);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        e eVar = this.a;
        eVar.c.setVisibility(0);
        eVar.a.setTransitionState(SearchView.b.c);
    }
}
