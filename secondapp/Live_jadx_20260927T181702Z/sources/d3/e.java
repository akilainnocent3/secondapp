package d3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import k.t0;
import v1.g;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(21)
public class e extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f77720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f77721d;

    public e(@Nullable a aVar, Context context, Uri uri) {
        super(aVar);
        this.f77720c = context;
        this.f77721d = uri;
    }

    public static void w(@Nullable AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                g.a(autoCloseable);
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    @Nullable
    public static Uri x(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // d3.a
    public boolean a() {
        return b.a(this.f77720c, this.f77721d);
    }

    @Override // d3.a
    public boolean b() {
        return b.b(this.f77720c, this.f77721d);
    }

    @Override // d3.a
    @Nullable
    public a c(String str) {
        Uri uriX = x(this.f77720c, this.f77721d, "vnd.android.document/directory", str);
        if (uriX != null) {
            return new e(this, this.f77720c, uriX);
        }
        return null;
    }

    @Override // d3.a
    @Nullable
    public a d(String str, String str2) {
        Uri uriX = x(this.f77720c, this.f77721d, str, str2);
        if (uriX != null) {
            return new e(this, this.f77720c, uriX);
        }
        return null;
    }

    @Override // d3.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f77720c.getContentResolver(), this.f77721d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // d3.a
    public boolean f() {
        return b.d(this.f77720c, this.f77721d);
    }

    @Override // d3.a
    @Nullable
    public String k() {
        return b.f(this.f77720c, this.f77721d);
    }

    @Override // d3.a
    @Nullable
    public String m() {
        return b.h(this.f77720c, this.f77721d);
    }

    @Override // d3.a
    public Uri n() {
        return this.f77721d;
    }

    @Override // d3.a
    public boolean o() {
        return b.i(this.f77720c, this.f77721d);
    }

    @Override // d3.a
    public boolean q() {
        return b.j(this.f77720c, this.f77721d);
    }

    @Override // d3.a
    public boolean r() {
        return b.k(this.f77720c, this.f77721d);
    }

    @Override // d3.a
    public long s() {
        return b.l(this.f77720c, this.f77721d);
    }

    @Override // d3.a
    public long t() {
        return b.m(this.f77720c, this.f77721d);
    }

    @Override // d3.a
    public a[] u() {
        ContentResolver contentResolver = this.f77720c.getContentResolver();
        Uri uri = this.f77721d;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursorQuery.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f77721d, cursorQuery.getString(0)));
                }
            } catch (Exception e10) {
                Log.w("DocumentFile", "Failed query: " + e10);
            }
            w(cursorQuery);
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            a[] aVarArr = new a[uriArr.length];
            for (int i10 = 0; i10 < uriArr.length; i10++) {
                aVarArr[i10] = new e(this, this.f77720c, uriArr[i10]);
            }
            return aVarArr;
        } catch (Throwable th2) {
            w(cursorQuery);
            throw th2;
        }
    }

    @Override // d3.a
    public boolean v(String str) {
        try {
            Uri uriRenameDocument = DocumentsContract.renameDocument(this.f77720c.getContentResolver(), this.f77721d, str);
            if (uriRenameDocument != null) {
                this.f77721d = uriRenameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
