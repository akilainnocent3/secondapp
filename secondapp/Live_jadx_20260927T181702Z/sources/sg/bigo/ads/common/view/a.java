package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import k.e0;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f133611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f133612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractRunnableC1359a f133613c;

    /* JADX INFO: renamed from: sg.bigo.ads.common.view.a$a, reason: collision with other inner class name */
    public static abstract class AbstractRunnableC1359a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f133615b;

        private AbstractRunnableC1359a() {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public void run() {
            if (this.f133615b) {
                return;
            }
            a();
        }

        public /* synthetic */ AbstractRunnableC1359a(byte b10) {
            this();
        }
    }

    public a(Context context) {
        this(context, null);
    }

    private synchronized void a(boolean z10) {
        try {
            AbstractRunnableC1359a abstractRunnableC1359a = this.f133613c;
            if (abstractRunnableC1359a != null) {
                abstractRunnableC1359a.f133615b = true;
                this.f133613c = null;
            }
            if (z10) {
                AbstractRunnableC1359a abstractRunnableC1359a2 = new AbstractRunnableC1359a() { // from class: sg.bigo.ads.common.view.a.1
                    @Override // sg.bigo.ads.common.view.a.AbstractRunnableC1359a
                    public final void a() {
                        if (a.this.f133612b && a.this.b() && u.c(a.this) && sg.bigo.ads.common.ab.a.a(a.this, new Rect())) {
                            a.this.a();
                        }
                        a aVar = a.this;
                        aVar.postDelayed(this, aVar.f133611a);
                    }
                };
                this.f133613c = abstractRunnableC1359a2;
                postDelayed(abstractRunnableC1359a2, this.f133611a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract void a();

    public abstract boolean b();

    public final void c() {
        if (this.f133612b) {
            return;
        }
        this.f133612b = true;
        a(true);
    }

    public final void d() {
        this.f133612b = false;
        a(false);
    }

    public int getFlipInterval() {
        return this.f133611a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    public void setFlipInterval(@e0(from = 0) int i10) {
        this.f133611a = i10;
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f133611a = 3000;
        this.f133612b = false;
    }
}
