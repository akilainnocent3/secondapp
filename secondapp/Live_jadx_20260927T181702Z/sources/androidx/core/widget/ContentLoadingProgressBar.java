package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.g1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f9280h = 500;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f9281i = 500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f9286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f9287g;

    public ContentLoadingProgressBar(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ void c(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f9284d = false;
        if (contentLoadingProgressBar.f9285e) {
            return;
        }
        contentLoadingProgressBar.f9282b = System.currentTimeMillis();
        contentLoadingProgressBar.setVisibility(0);
    }

    public static /* synthetic */ void d(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f9283c = false;
        contentLoadingProgressBar.f9282b = -1L;
        contentLoadingProgressBar.setVisibility(8);
    }

    public void e() {
        post(new Runnable() { // from class: androidx.core.widget.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f9358b.f();
            }
        });
    }

    @g1
    public final void f() {
        this.f9285e = true;
        removeCallbacks(this.f9287g);
        this.f9284d = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f9282b;
        long j11 = jCurrentTimeMillis - j10;
        if (j11 >= 500 || j10 == -1) {
            setVisibility(8);
        } else {
            if (this.f9283c) {
                return;
            }
            postDelayed(this.f9286f, 500 - j11);
            this.f9283c = true;
        }
    }

    public final void g() {
        removeCallbacks(this.f9286f);
        removeCallbacks(this.f9287g);
    }

    public void h() {
        post(new Runnable() { // from class: androidx.core.widget.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f9357b.i();
            }
        });
    }

    @g1
    public final void i() {
        this.f9282b = -1L;
        this.f9285e = false;
        removeCallbacks(this.f9286f);
        this.f9283c = false;
        if (this.f9284d) {
            return;
        }
        postDelayed(this.f9287g, 500L);
        this.f9284d = true;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    public ContentLoadingProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f9282b = -1L;
        this.f9283c = false;
        this.f9284d = false;
        this.f9285e = false;
        this.f9286f = new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.d(this.f9355b);
            }
        };
        this.f9287g = new Runnable() { // from class: androidx.core.widget.f
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.c(this.f9356b);
            }
        };
    }
}
