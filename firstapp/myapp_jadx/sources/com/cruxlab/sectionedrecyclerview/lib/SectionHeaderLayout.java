package com.cruxlab.sectionedrecyclerview.lib;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b9p;
import defpackage.fil;

/* JADX INFO: loaded from: classes.dex */
public class SectionHeaderLayout extends RelativeLayout {
    public static final /* synthetic */ int e = 0;
    public RecyclerView a;
    public d.C0186d b;
    public final a c;
    public final b d;

    public class a implements fil {
        public a() {
        }
    }

    public class b extends RecyclerView.s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void b(RecyclerView recyclerView, int i, int i2) {
            SectionHeaderLayout.this.b.b();
        }
    }

    public SectionHeaderLayout(Context context) {
        super(context);
        this.c = new a();
        this.d = new b();
    }

    public final void a() {
        if (this.b == null) {
            b9p.a("SectionHeaderLayout hasn't been attached to any RecyclerView and SectionDataManager.");
            return;
        }
        this.a.k0(this.d);
        d.this.g = null;
        a aVar = this.c;
        SectionHeaderLayout sectionHeaderLayout = SectionHeaderLayout.this;
        if (sectionHeaderLayout.getChildCount() > 1) {
            sectionHeaderLayout.post(new g(aVar));
        }
        this.a = null;
        this.b = null;
    }

    public SectionHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new a();
        this.d = new b();
    }

    public SectionHeaderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new a();
        this.d = new b();
    }
}
