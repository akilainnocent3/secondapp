package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class vkv implements i2w<Uri, File> {
    public final Context a;

    public static final class a implements j2w<Uri, File> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.j2w
        public final i2w<Uri, File> c(wjw wjwVar) {
            return new vkv(this.a);
        }
    }

    public vkv(Context context) {
        this.a = context;
    }

    @Override // defpackage.i2w
    public final i2w.a<File> a(Uri uri, int i, int i2, s2z s2zVar) {
        Uri uri2 = uri;
        return new i2w.a<>(new acy(uri2), new b(this.a, uri2));
    }

    @Override // defpackage.i2w
    public final boolean b(Uri uri) {
        return xkv.b(uri);
    }

    public static class b implements cpc<File> {
        public static final String[] c = {"_data"};
        public final Context a;
        public final Uri b;

        public b(Context context, Uri uri) {
            this.a = context;
            this.b = uri;
        }

        @Override // defpackage.cpc
        public final Class<File> a() {
            return File.class;
        }

        @Override // defpackage.cpc
        public final void d(lw20 lw20Var, cpc.a<? super File> aVar) {
            ContentResolver contentResolver = this.a.getContentResolver();
            Uri uri = this.b;
            Cursor cursorQuery = contentResolver.query(uri, c, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.f(new File(string));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + uri));
        }

        @Override // defpackage.cpc
        public final cqc e() {
            return cqc.a;
        }

        @Override // defpackage.cpc
        public final void b() {
        }

        @Override // defpackage.cpc
        public final void cancel() {
        }
    }
}
