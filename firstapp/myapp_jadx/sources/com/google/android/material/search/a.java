package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import defpackage.ue0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AnimatorListenerAdapter {
    public final /* synthetic */ e a;

    public a(e eVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        e eVar = this.a;
        eVar.c.setVisibility(0);
        SearchBar searchBar = eVar.p;
        searchBar.u0.getClass();
        View centerView = searchBar.getCenterView();
        if (centerView instanceof ue0) {
            ((ue0) centerView).a();
        }
        if (centerView != 0) {
            centerView.setAlpha(0.0f);
        }
    }
}
