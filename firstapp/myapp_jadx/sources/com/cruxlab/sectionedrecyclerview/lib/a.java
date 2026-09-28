package com.cruxlab.sectionedrecyclerview.lib;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import com.cruxlab.sectionedrecyclerview.lib.a.b;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import defpackage.hb5;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<IVH extends b> {
    public int a;
    public d.c b;

    /* JADX INFO: renamed from: com.cruxlab.sectionedrecyclerview.lib.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0185a extends c {
    }

    public static abstract class b extends c {
    }

    public abstract int a();

    public abstract short b(int i);

    public final void d(int i) {
        d.c cVar = this.b;
        if (cVar != null) {
            int i2 = this.a;
            d dVar = d.this;
            dVar.f(i2, false);
            dVar.h(i2, i, false);
            dVar.h.notifyItemChanged(dVar.i(i2, i));
            d.C0186d c0186d = dVar.g;
            if (c0186d != null) {
                c0186d.a();
            }
        }
    }

    public final void e(int i) {
        d.c cVar = this.b;
        if (cVar != null) {
            int i2 = this.a;
            d dVar = d.this;
            dVar.f(i2, false);
            dVar.h(i2, i, false);
            dVar.g(i2, -1);
            dVar.n(i2, -1, false);
            dVar.h.notifyItemRemoved(dVar.i(i2, i));
            d.C0186d c0186d = dVar.g;
            if (c0186d != null) {
                c0186d.a();
            }
        }
    }

    public abstract void f(IVH ivh, int i);

    public abstract IVH g(ViewGroup viewGroup, short s);

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class c {
        public final View a;

        public c(View view) {
            if (view != null) {
                this.a = view;
            } else {
                hb5.a(QWvyvNzGsBpRT.LwYxD);
                throw null;
            }
        }
    }

    public final void c() {
        d.c cVar = this.b;
        if (cVar != null) {
            int i = this.a;
            d dVar = d.this;
            dVar.f(i, false);
            d.a aVar = dVar.h;
            com.cruxlab.sectionedrecyclerview.lib.c cVar2 = dVar.d.get(dVar.c.get(i).shortValue());
            int iK = dVar.k(i);
            int iA = cVar2.a.a();
            String str = LGxrN.AXEENzWyHboVjEM;
            if (iK < iA) {
                int i2 = iA - iK;
                dVar.f(i, false);
                dVar.h(i, iK, true);
                if (i2 < 0) {
                    hb5.a(str);
                    return;
                }
                dVar.g(i, i2);
                dVar.n(i, i2, false);
                aVar.notifyItemRangeInserted(dVar.i(i, iK), i2);
                d.C0186d c0186d = dVar.g;
                if (c0186d != null) {
                    c0186d.a();
                }
            } else if (iA < iK) {
                int i3 = iK - iA;
                dVar.f(i, false);
                dVar.h(i, iA, false);
                if (i3 < 0) {
                    hb5.a(str);
                    return;
                }
                dVar.e(i, iA, i3);
                int i4 = -i3;
                dVar.g(i, i4);
                int i5 = dVar.i(i, iA);
                dVar.n(i, i4, false);
                aVar.notifyItemRangeRemoved(i5, i3);
                d.C0186d c0186d2 = dVar.g;
                if (c0186d2 != null) {
                    c0186d2.a();
                }
            }
            int iMin = Math.min(iK, iA);
            if (iMin > 0) {
                dVar.f(i, false);
                dVar.h(i, 0, false);
                if (iMin < 0) {
                    hb5.a(str);
                    return;
                }
                dVar.e(i, 0, iMin);
                aVar.notifyItemRangeChanged(dVar.i(i, 0), iMin);
                d.C0186d c0186d3 = dVar.g;
                if (c0186d3 != null) {
                    c0186d3.a();
                }
            }
        }
    }
}
