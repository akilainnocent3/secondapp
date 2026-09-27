package p2;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AdapterView.class), @androidx.databinding.g(attribute = "android:onItemLongClick", method = "setOnItemLongClickListener", type = AdapterView.class)})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:selectedItemPosition", type = AdapterView.class), @androidx.databinding.p(attribute = "android:selection", event = "android:selectedItemPositionAttrChanged", method = "getSelectedItemPosition", type = AdapterView.class)})
@y0({y0.a.LIBRARY})
public class e {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f120326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f120327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.databinding.o f120328d;

        public b(a aVar, c cVar, androidx.databinding.o oVar) {
            this.f120326b = aVar;
            this.f120327c = cVar;
            this.f120328d = oVar;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            a aVar = this.f120326b;
            if (aVar != null) {
                aVar.onItemSelected(adapterView, view, i10, j10);
            }
            androidx.databinding.o oVar = this.f120328d;
            if (oVar != null) {
                oVar.a();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            c cVar = this.f120327c;
            if (cVar != null) {
                cVar.onNothingSelected(adapterView);
            }
            androidx.databinding.o oVar = this.f120328d;
            if (oVar != null) {
                oVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void onNothingSelected(AdapterView<?> adapterView);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected", "android:selectedItemPositionAttrChanged"})
    public static void a(AdapterView adapterView, a aVar, c cVar, androidx.databinding.o oVar) {
        if (aVar == null && cVar == null && oVar == null) {
            adapterView.setOnItemSelectedListener(null);
        } else {
            adapterView.setOnItemSelectedListener(new b(aVar, cVar, oVar));
        }
    }

    @androidx.databinding.d({"android:selectedItemPosition"})
    public static void b(AdapterView adapterView, int i10) {
        if (adapterView.getSelectedItemPosition() != i10) {
            adapterView.setSelection(i10);
        }
    }

    @androidx.databinding.d({"android:selectedItemPosition", "android:adapter"})
    public static void c(AdapterView adapterView, int i10, Adapter adapter) {
        if (adapter != adapterView.getAdapter()) {
            adapterView.setAdapter(adapter);
            adapterView.setSelection(i10);
        } else if (adapterView.getSelectedItemPosition() != i10) {
            adapterView.setSelection(i10);
        }
    }

    @androidx.databinding.d({"android:selection"})
    public static void d(AdapterView adapterView, int i10) {
        b(adapterView, i10);
    }

    @androidx.databinding.d({"android:selection", "android:adapter"})
    public static void e(AdapterView adapterView, int i10, Adapter adapter) {
        c(adapterView, i10, adapter);
    }
}
