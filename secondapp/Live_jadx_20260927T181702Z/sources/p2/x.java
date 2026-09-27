package p2;

import android.annotation.TargetApi;
import android.widget.SearchView;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:onQueryTextFocusChange", method = "setOnQueryTextFocusChangeListener", type = SearchView.class), @androidx.databinding.g(attribute = "android:onSearchClick", method = "setOnSearchClickListener", type = SearchView.class), @androidx.databinding.g(attribute = "android:onClose", method = "setOnCloseListener", type = SearchView.class)})
@y0({y0.a.LIBRARY})
public class x {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements SearchView.OnQueryTextListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f120377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f120378b;

        public a(d dVar, c cVar) {
            this.f120377a = dVar;
            this.f120378b = cVar;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            c cVar = this.f120378b;
            if (cVar != null) {
                return cVar.onQueryTextChange(str);
            }
            return false;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            d dVar = this.f120377a;
            if (dVar != null) {
                return dVar.onQueryTextSubmit(str);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements SearchView.OnSuggestionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f120379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f120380b;

        public b(f fVar, e eVar) {
            this.f120379a = fVar;
            this.f120380b = eVar;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public boolean onSuggestionClick(int i10) {
            e eVar = this.f120380b;
            if (eVar != null) {
                return eVar.onSuggestionClick(i10);
            }
            return false;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public boolean onSuggestionSelect(int i10) {
            f fVar = this.f120379a;
            if (fVar != null) {
                return fVar.onSuggestionSelect(i10);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @TargetApi(11)
    public interface c {
        boolean onQueryTextChange(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @TargetApi(11)
    public interface d {
        boolean onQueryTextSubmit(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @TargetApi(11)
    public interface e {
        boolean onSuggestionClick(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @TargetApi(11)
    public interface f {
        boolean onSuggestionSelect(int i10);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onQueryTextSubmit", "android:onQueryTextChange"})
    public static void a(SearchView searchView, d dVar, c cVar) {
        if (dVar == null && cVar == null) {
            searchView.setOnQueryTextListener(null);
        } else {
            searchView.setOnQueryTextListener(new a(dVar, cVar));
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onSuggestionSelect", "android:onSuggestionClick"})
    public static void b(SearchView searchView, f fVar, e eVar) {
        if (fVar == null && eVar == null) {
            searchView.setOnSuggestionListener(null);
        } else {
            searchView.setOnSuggestionListener(new b(fVar, eVar));
        }
    }
}
