package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f50961a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public b f50962b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ValueAnimator f50963c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Animator.AnimatorListener f50964d = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a0 a0Var = a0.this;
            if (a0Var.f50963c == animator) {
                a0Var.f50963c = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f50966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ValueAnimator f50967b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f50966a = iArr;
            this.f50967b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f50964d);
        this.f50961a.add(bVar);
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f50963c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f50963c = null;
        }
    }

    public void c() {
        ValueAnimator valueAnimator = this.f50963c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f50963c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f50961a.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                bVar = null;
                break;
            }
            bVar = this.f50961a.get(i10);
            if (StateSet.stateSetMatches(bVar.f50966a, iArr)) {
                break;
            } else {
                i10++;
            }
        }
        b bVar2 = this.f50962b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f50962b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }

    public final void e(@NonNull b bVar) {
        ValueAnimator valueAnimator = bVar.f50967b;
        this.f50963c = valueAnimator;
        valueAnimator.start();
    }
}
