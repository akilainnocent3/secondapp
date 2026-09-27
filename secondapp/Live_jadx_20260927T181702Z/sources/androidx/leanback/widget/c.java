package androidx.leanback.widget;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends k2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f12338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12340k;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends k2.b {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final TextView f12341s;

        public a(View view) {
            super(view);
            this.f12341s = (TextView) view.findViewById(s3.a.h.J1);
        }

        public TextView t() {
            return this.f12341s;
        }
    }

    public c(Context context, int i10) {
        this.f12339j = 0;
        this.f12338i = new ContextThemeWrapper(context.getApplicationContext(), i10);
        F(null);
    }

    public abstract void N(a aVar, Object obj);

    public void O(int i10) {
        this.f12340k = true;
        this.f12339j = i10;
    }

    @Override // androidx.leanback.widget.k2
    public k2.b k(ViewGroup viewGroup) {
        Context context = this.f12338i;
        if (context == null) {
            context = viewGroup.getContext();
        }
        View viewInflate = LayoutInflater.from(context).inflate(s3.a.j.G, viewGroup, false);
        viewInflate.setFocusable(false);
        viewInflate.setFocusableInTouchMode(false);
        a aVar = new a(viewInflate);
        if (this.f12340k) {
            aVar.f12292a.setBackgroundColor(this.f12339j);
        }
        return aVar;
    }

    @Override // androidx.leanback.widget.k2
    public boolean u() {
        return false;
    }

    @Override // androidx.leanback.widget.k2
    public void x(k2.b bVar, Object obj) {
        super.x(bVar, obj);
        N((a) bVar, obj);
    }

    public c() {
        this.f12339j = 0;
        this.f12338i = null;
        F(null);
    }
}
