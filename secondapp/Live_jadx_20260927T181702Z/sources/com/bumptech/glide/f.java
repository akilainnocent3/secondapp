package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Queue;
import mc.p;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class f<T> implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f30425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f30426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a<T> f30427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b<T> f30428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30430g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f30432i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30431h = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f30433j = true;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<U> {
        @NonNull
        List<U> a(int i10);

        @Nullable
        m<?> b(@NonNull U u10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b<T> {
        @Nullable
        int[] a(@NonNull T t10, int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue<c> f30437a;

        public d(int i10) {
            this.f30437a = pc.o.g(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f30437a.offer(new c());
            }
        }

        public c a(int i10, int i11) {
            c cVarPoll = this.f30437a.poll();
            this.f30437a.offer(cVarPoll);
            cVarPoll.f30435c = i10;
            cVarPoll.f30434b = i11;
            return cVarPoll;
        }
    }

    public f(@NonNull n nVar, @NonNull a<T> aVar, @NonNull b<T> bVar, int i10) {
        this.f30426c = nVar;
        this.f30427d = aVar;
        this.f30428e = bVar;
        this.f30424a = i10;
        this.f30425b = new d(i10 + 1);
    }

    public final void a() {
        for (int i10 = 0; i10 < this.f30425b.f30437a.size(); i10++) {
            this.f30426c.x(this.f30425b.a(0, 0));
        }
    }

    public final void b(int i10, int i11) {
        int iMin;
        int iMax;
        if (i10 < i11) {
            iMax = Math.max(this.f30429f, i10);
            iMin = i11;
        } else {
            iMin = Math.min(this.f30430g, i10);
            iMax = i11;
        }
        int iMin2 = Math.min(this.f30432i, iMin);
        int iMin3 = Math.min(this.f30432i, Math.max(0, iMax));
        if (i10 < i11) {
            for (int i12 = iMin3; i12 < iMin2; i12++) {
                d(this.f30427d.a(i12), i12, true);
            }
        } else {
            for (int i13 = iMin2 - 1; i13 >= iMin3; i13--) {
                d(this.f30427d.a(i13), i13, false);
            }
        }
        this.f30430g = iMin3;
        this.f30429f = iMin2;
    }

    public final void c(int i10, boolean z10) {
        if (this.f30433j != z10) {
            this.f30433j = z10;
            a();
        }
        b(i10, (z10 ? this.f30424a : -this.f30424a) + i10);
    }

    public final void d(List<T> list, int i10, boolean z10) {
        int size = list.size();
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e(list.get(i11), i10, i11);
            }
            return;
        }
        for (int i12 = size - 1; i12 >= 0; i12--) {
            e(list.get(i12), i10, i12);
        }
    }

    public final void e(@Nullable T t10, int i10, int i11) {
        int[] iArrA;
        m<?> mVarB;
        if (t10 == null || (iArrA = this.f30428e.a(t10, i10, i11)) == null || (mVarB = this.f30427d.b(t10)) == null) {
            return;
        }
        mVarB.n1(this.f30425b.a(iArrA[0], iArrA[1]));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        if (this.f30432i == 0 && i12 == 0) {
            return;
        }
        this.f30432i = i12;
        int i13 = this.f30431h;
        if (i10 > i13) {
            c(i11 + i10, true);
        } else if (i10 < i13) {
            c(i10, false);
        }
        this.f30431h = i10;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements p<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public lc.e f30436d;

        @Override // mc.p
        public void d(@NonNull mc.o oVar) {
            oVar.d(this.f30435c, this.f30434b);
        }

        @Override // mc.p
        @Nullable
        public lc.e e() {
            return this.f30436d;
        }

        @Override // mc.p
        public void g(@Nullable lc.e eVar) {
            this.f30436d = eVar;
        }

        @Override // com.bumptech.glide.manager.k
        public void onDestroy() {
        }

        @Override // com.bumptech.glide.manager.k
        public void onStart() {
        }

        @Override // com.bumptech.glide.manager.k
        public void onStop() {
        }

        @Override // mc.p
        public void f(@Nullable Drawable drawable) {
        }

        @Override // mc.p
        public void h(@NonNull mc.o oVar) {
        }

        @Override // mc.p
        public void k(@Nullable Drawable drawable) {
        }

        @Override // mc.p
        public void n(@Nullable Drawable drawable) {
        }

        @Override // mc.p
        public void l(@NonNull Object obj, @Nullable nc.f<? super Object> fVar) {
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
