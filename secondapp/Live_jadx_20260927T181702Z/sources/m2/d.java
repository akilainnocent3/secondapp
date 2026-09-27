package m2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class d extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @y0({y0.a.LIBRARY_GROUP})
    public int[] f106224p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @y0({y0.a.LIBRARY_GROUP})
    public int[] f106225q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f106226r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f106227s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f106228t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String[] f106229u;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        CharSequence convertToString(Cursor cursor);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        boolean setViewValue(View view, Cursor cursor, int i10);
    }

    @Deprecated
    public d(Context context, int i10, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i10, cursor);
        this.f106226r = -1;
        this.f106225q = iArr;
        this.f106229u = strArr;
        p(cursor, strArr);
    }

    @Override // m2.a, m2.b.a
    public CharSequence convertToString(Cursor cursor) {
        a aVar = this.f106227s;
        if (aVar != null) {
            return aVar.convertToString(cursor);
        }
        int i10 = this.f106226r;
        return i10 > -1 ? cursor.getString(i10) : super.convertToString(cursor);
    }

    @Override // m2.a
    public void d(View view, Context context, Cursor cursor) {
        b bVar = this.f106228t;
        int[] iArr = this.f106225q;
        int length = iArr.length;
        int[] iArr2 = this.f106224p;
        for (int i10 = 0; i10 < length; i10++) {
            View viewFindViewById = view.findViewById(iArr[i10]);
            if (viewFindViewById != null) {
                if (bVar != null ? bVar.setViewValue(viewFindViewById, cursor, iArr2[i10]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i10]);
                    if (string == null) {
                        string = "";
                    }
                    if (viewFindViewById instanceof TextView) {
                        x((TextView) viewFindViewById, string);
                    } else {
                        if (!(viewFindViewById instanceof ImageView)) {
                            throw new IllegalStateException(viewFindViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                        }
                        w((ImageView) viewFindViewById, string);
                    }
                }
            }
        }
    }

    @Override // m2.a
    public Cursor l(Cursor cursor) {
        p(cursor, this.f106229u);
        return super.l(cursor);
    }

    public void o(Cursor cursor, String[] strArr, int[] iArr) {
        this.f106229u = strArr;
        this.f106225q = iArr;
        p(cursor, strArr);
        super.a(cursor);
    }

    public final void p(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            this.f106224p = null;
            return;
        }
        int length = strArr.length;
        int[] iArr = this.f106224p;
        if (iArr == null || iArr.length != length) {
            this.f106224p = new int[length];
        }
        for (int i10 = 0; i10 < length; i10++) {
            this.f106224p[i10] = cursor.getColumnIndexOrThrow(strArr[i10]);
        }
    }

    public a q() {
        return this.f106227s;
    }

    public int r() {
        return this.f106226r;
    }

    public b s() {
        return this.f106228t;
    }

    public void t(a aVar) {
        this.f106227s = aVar;
    }

    public void u(int i10) {
        this.f106226r = i10;
    }

    public void v(b bVar) {
        this.f106228t = bVar;
    }

    public void w(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void x(TextView textView, String str) {
        textView.setText(str);
    }

    public d(Context context, int i10, Cursor cursor, String[] strArr, int[] iArr, int i11) {
        super(context, i10, cursor, i11);
        this.f106226r = -1;
        this.f106225q = iArr;
        this.f106229u = strArr;
        p(cursor, strArr);
    }
}
