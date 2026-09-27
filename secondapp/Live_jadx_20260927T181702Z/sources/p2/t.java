package p2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public class t<T> extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<T> f120365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.databinding.y.a f120366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f120367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f120368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f120369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f120370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LayoutInflater f120371h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends androidx.databinding.y.a {
        public a() {
        }

        @Override // androidx.databinding.y.a
        public void a(androidx.databinding.y yVar) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.y.a
        public void e(androidx.databinding.y yVar, int i10, int i11) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.y.a
        public void f(androidx.databinding.y yVar, int i10, int i11) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.y.a
        public void g(androidx.databinding.y yVar, int i10, int i11, int i12) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.y.a
        public void h(androidx.databinding.y yVar, int i10, int i11) {
            t.this.notifyDataSetChanged();
        }
    }

    public t(Context context, List<T> list, int i10, int i11, int i12) {
        this.f120367d = context;
        this.f120369f = i10;
        this.f120368e = i11;
        this.f120370g = i12;
        this.f120371h = i10 == 0 ? null : (LayoutInflater) context.getSystemService("layout_inflater");
        b(list);
    }

    public View a(int i10, int i11, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = i10 == 0 ? new TextView(this.f120367d) : this.f120371h.inflate(i10, viewGroup, false);
        }
        int i12 = this.f120370g;
        TextView textView = (TextView) (i12 == 0 ? view : view.findViewById(i12));
        T t10 = this.f120365b.get(i11);
        textView.setText(t10 instanceof CharSequence ? (CharSequence) t10 : String.valueOf(t10));
        return view;
    }

    public void b(List<T> list) {
        List<T> list2 = this.f120365b;
        if (list2 == list) {
            return;
        }
        if (list2 instanceof androidx.databinding.y) {
            ((androidx.databinding.y) list2).J0(this.f120366c);
        }
        this.f120365b = list;
        if (list instanceof androidx.databinding.y) {
            if (this.f120366c == null) {
                this.f120366c = new a();
            }
            ((androidx.databinding.y) this.f120365b).w0(this.f120366c);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f120365b.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        return a(this.f120368e, i10, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f120365b.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        return a(this.f120369f, i10, view, viewGroup);
    }
}
