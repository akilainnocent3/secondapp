package p2;

import android.widget.AbsListView;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:listSelector", method = "setSelector", type = AbsListView.class), @androidx.databinding.g(attribute = "android:scrollingCache", method = "setScrollingCacheEnabled", type = AbsListView.class), @androidx.databinding.g(attribute = "android:smoothScrollbar", method = "setSmoothScrollbarEnabled", type = AbsListView.class), @androidx.databinding.g(attribute = "android:onMovedToScrapHeap", method = "setRecyclerListener", type = AbsListView.class)})
@y0({y0.a.LIBRARY})
public class a {

    /* JADX INFO: renamed from: p2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C1146a implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f120322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f120323b;

        public C1146a(c cVar, b bVar) {
            this.f120322a = cVar;
            this.f120323b = bVar;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            b bVar = this.f120323b;
            if (bVar != null) {
                bVar.onScroll(absListView, i10, i11, i12);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            c cVar = this.f120322a;
            if (cVar != null) {
                cVar.onScrollStateChanged(absListView, i10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void onScroll(AbsListView absListView, int i10, int i11, int i12);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void onScrollStateChanged(AbsListView absListView, int i10);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onScroll", "android:onScrollStateChanged"})
    public static void a(AbsListView absListView, b bVar, c cVar) {
        absListView.setOnScrollListener(new C1146a(cVar, bVar));
    }
}
