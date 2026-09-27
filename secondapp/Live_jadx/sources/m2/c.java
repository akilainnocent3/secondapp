package m2;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f106221m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f106222n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LayoutInflater f106223o;

    @Deprecated
    public c(Context context, int i10, Cursor cursor) {
        super(context, cursor);
        this.f106222n = i10;
        this.f106221m = i10;
        this.f106223o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // m2.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f106223o.inflate(this.f106222n, viewGroup, false);
    }

    @Override // m2.a
    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f106223o.inflate(this.f106221m, viewGroup, false);
    }

    public void m(int i10) {
        this.f106222n = i10;
    }

    public void n(int i10) {
        this.f106221m = i10;
    }

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f106222n = i10;
        this.f106221m = i10;
        this.f106223o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public c(Context context, int i10, Cursor cursor, int i11) {
        super(context, cursor, i11);
        this.f106222n = i10;
        this.f106221m = i10;
        this.f106223o = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
