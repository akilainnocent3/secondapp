package m2;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, m2.b.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final int f106207k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f106208l = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @y0({y0.a.LIBRARY_GROUP})
    public boolean f106209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @y0({y0.a.LIBRARY_GROUP})
    public boolean f106210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @y0({y0.a.LIBRARY_GROUP})
    public Cursor f106211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @y0({y0.a.LIBRARY_GROUP})
    public Context f106212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @y0({y0.a.LIBRARY_GROUP})
    public int f106213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @y0({y0.a.LIBRARY_GROUP})
    public C0997a f106214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @y0({y0.a.LIBRARY_GROUP})
    public DataSetObserver f106215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @y0({y0.a.LIBRARY_GROUP})
    public m2.b f106216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @y0({y0.a.LIBRARY_GROUP})
    public FilterQueryProvider f106217j;

    /* JADX INFO: renamed from: m2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C0997a extends ContentObserver {
        public C0997a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.j();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f106209b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f106209b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public a(Context context, Cursor cursor) {
        f(context, cursor, 1);
    }

    public void a(Cursor cursor) {
        Cursor cursorL = l(cursor);
        if (cursorL != null) {
            cursorL.close();
        }
    }

    @Override // m2.b.a
    public Cursor b() {
        return this.f106211d;
    }

    public Cursor c(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f106217j;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f106211d;
    }

    public CharSequence convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public abstract void d(View view, Context context, Cursor cursor);

    public FilterQueryProvider e() {
        return this.f106217j;
    }

    public void f(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f106210c = true;
        } else {
            this.f106210c = false;
        }
        boolean z10 = cursor != null;
        this.f106211d = cursor;
        this.f106209b = z10;
        this.f106212e = context;
        this.f106213f = z10 ? cursor.getColumnIndexOrThrow(eq.c.f81516f) : -1;
        if ((i10 & 2) == 2) {
            this.f106214g = new C0997a();
            this.f106215h = new b();
        } else {
            this.f106214g = null;
            this.f106215h = null;
        }
        if (z10) {
            C0997a c0997a = this.f106214g;
            if (c0997a != null) {
                cursor.registerContentObserver(c0997a);
            }
            DataSetObserver dataSetObserver = this.f106215h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Deprecated
    public void g(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f106209b || (cursor = this.f106211d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f106209b) {
            return null;
        }
        this.f106211d.moveToPosition(i10);
        if (view == null) {
            view = h(this.f106212e, this.f106211d, viewGroup);
        }
        d(view, this.f106212e, this.f106211d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f106216i == null) {
            this.f106216i = new m2.b(this);
        }
        return this.f106216i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f106209b || (cursor = this.f106211d) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f106211d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f106209b && (cursor = this.f106211d) != null && cursor.moveToPosition(i10)) {
            return this.f106211d.getLong(this.f106213f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f106209b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f106211d.moveToPosition(i10)) {
            if (view == null) {
                view = i(this.f106212e, this.f106211d, viewGroup);
            }
            d(view, this.f106212e, this.f106211d);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return i(context, cursor, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public abstract View i(Context context, Cursor cursor, ViewGroup viewGroup);

    public void j() {
        Cursor cursor;
        if (!this.f106210c || (cursor = this.f106211d) == null || cursor.isClosed()) {
            return;
        }
        this.f106209b = this.f106211d.requery();
    }

    public void k(FilterQueryProvider filterQueryProvider) {
        this.f106217j = filterQueryProvider;
    }

    public Cursor l(Cursor cursor) {
        Cursor cursor2 = this.f106211d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0997a c0997a = this.f106214g;
            if (c0997a != null) {
                cursor2.unregisterContentObserver(c0997a);
            }
            DataSetObserver dataSetObserver = this.f106215h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f106211d = cursor;
        if (cursor == null) {
            this.f106213f = -1;
            this.f106209b = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0997a c0997a2 = this.f106214g;
        if (c0997a2 != null) {
            cursor.registerContentObserver(c0997a2);
        }
        DataSetObserver dataSetObserver2 = this.f106215h;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f106213f = cursor.getColumnIndexOrThrow(eq.c.f81516f);
        this.f106209b = true;
        notifyDataSetChanged();
        return cursor2;
    }

    public a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public a(Context context, Cursor cursor, int i10) {
        f(context, cursor, i10);
    }
}
