package f2;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements zu.m<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f82338a;

        public a(ViewGroup viewGroup) {
            this.f82338a = viewGroup;
        }

        @Override // zu.m
        @oy.l
        public Iterator<View> iterator() {
            return f2.k(this.f82338a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<View, Iterator<? extends View>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f82339g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Iterator<View> invoke(@oy.l View view) {
            zu.m<View> mVarE;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (mVarE = f2.e(viewGroup)) == null) {
                return null;
            }
            return mVarE.iterator();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements Iterator<View>, es.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f82340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f82341c;

        public c(ViewGroup viewGroup) {
            this.f82341c = viewGroup;
        }

        @Override // java.util.Iterator
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f82341c;
            int i10 = this.f82340b;
            this.f82340b = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f82340b < this.f82341c.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f82341c;
            int i10 = this.f82340b - 1;
            this.f82340b = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,680:1\n127#2:681\n*E\n"})
    public static final class d implements zu.m<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f82342a;

        public d(ViewGroup viewGroup) {
            this.f82342a = viewGroup;
        }

        @Override // zu.m
        @oy.l
        public Iterator<View> iterator() {
            return new u1(f2.e(this.f82342a).iterator(), b.f82339g);
        }
    }

    public static final boolean a(@oy.l ViewGroup viewGroup, @oy.l View view) {
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void b(@oy.l ViewGroup viewGroup, @oy.l ds.l<? super View, dr.w2> lVar) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            lVar.invoke(viewGroup.getChildAt(i10));
        }
    }

    public static final void c(@oy.l ViewGroup viewGroup, @oy.l ds.p<? super Integer, ? super View, dr.w2> pVar) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            pVar.invoke(Integer.valueOf(i10), viewGroup.getChildAt(i10));
        }
    }

    @oy.l
    public static final View d(@oy.l ViewGroup viewGroup, int i10) {
        View childAt = viewGroup.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + viewGroup.getChildCount());
    }

    @oy.l
    public static final zu.m<View> e(@oy.l ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @oy.l
    public static final zu.m<View> f(@oy.l ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    @oy.l
    public static final ms.l g(@oy.l ViewGroup viewGroup) {
        return ms.u.W1(0, viewGroup.getChildCount());
    }

    public static final int h(@oy.l ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public static final boolean i(@oy.l ViewGroup viewGroup) {
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean j(@oy.l ViewGroup viewGroup) {
        return viewGroup.getChildCount() != 0;
    }

    @oy.l
    public static final Iterator<View> k(@oy.l ViewGroup viewGroup) {
        return new c(viewGroup);
    }

    public static final void l(@oy.l ViewGroup viewGroup, @oy.l View view) {
        viewGroup.removeView(view);
    }

    public static final void m(@oy.l ViewGroup viewGroup, @oy.l View view) {
        viewGroup.addView(view);
    }

    public static final void n(@oy.l ViewGroup.MarginLayoutParams marginLayoutParams, @k.q0 int i10) {
        marginLayoutParams.setMargins(i10, i10, i10, i10);
    }

    public static final void o(@oy.l ViewGroup.MarginLayoutParams marginLayoutParams, @k.q0 int i10, @k.q0 int i11, @k.q0 int i12, @k.q0 int i13) {
        marginLayoutParams.setMargins(i10, i11, i12, i13);
    }

    public static /* synthetic */ void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = marginLayoutParams.leftMargin;
        }
        if ((i14 & 2) != 0) {
            i11 = marginLayoutParams.topMargin;
        }
        if ((i14 & 4) != 0) {
            i12 = marginLayoutParams.rightMargin;
        }
        if ((i14 & 8) != 0) {
            i13 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i10, i11, i12, i13);
    }

    public static final void q(@oy.l ViewGroup.MarginLayoutParams marginLayoutParams, @k.q0 int i10, @k.q0 int i11, @k.q0 int i12, @k.q0 int i13) {
        marginLayoutParams.setMarginStart(i10);
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.setMarginEnd(i12);
        marginLayoutParams.bottomMargin = i13;
    }

    public static /* synthetic */ void r(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = marginLayoutParams.getMarginStart();
        }
        if ((i14 & 2) != 0) {
            i11 = marginLayoutParams.topMargin;
        }
        if ((i14 & 4) != 0) {
            i12 = marginLayoutParams.getMarginEnd();
        }
        if ((i14 & 8) != 0) {
            i13 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMarginStart(i10);
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.setMarginEnd(i12);
        marginLayoutParams.bottomMargin = i13;
    }
}
