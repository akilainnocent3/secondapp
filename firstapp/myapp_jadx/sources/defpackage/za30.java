package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class za30<DataT> implements i2w<Uri, DataT> {
    public final Context a;
    public final i2w<File, DataT> b;
    public final i2w<Uri, DataT> c;
    public final Class<DataT> d;

    public static abstract class a<DataT> implements j2w<Uri, DataT> {
        public final Context a;
        public final Class<DataT> b;

        public a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // defpackage.j2w
        public final i2w<Uri, DataT> c(wjw wjwVar) {
            Class<DataT> cls = this.b;
            return new za30(this.a, wjwVar.b(File.class, cls), wjwVar.b(Uri.class, cls), cls);
        }
    }

    public static final class b extends a<ParcelFileDescriptor> {
    }

    public static final class c extends a<InputStream> {
    }

    public static final class d<DataT> implements cpc<DataT> {
        public static final String[] z = {"_data"};
        public final Context a;
        public final i2w<File, DataT> b;
        public final i2w<Uri, DataT> c;
        public final Uri d;
        public final int e;
        public final int f;
        public final s2z i;
        public final Class<DataT> v;
        public volatile boolean w;
        public volatile cpc<DataT> y;

        public d(Context context, i2w<File, DataT> i2wVar, i2w<Uri, DataT> i2wVar2, Uri uri, int i, int i2, s2z s2zVar, Class<DataT> cls) {
            this.a = context.getApplicationContext();
            this.b = i2wVar;
            this.c = i2wVar2;
            this.d = uri;
            this.e = i;
            this.f = i2;
            this.i = s2zVar;
            this.v = cls;
        }

        @Override // defpackage.cpc
        public final Class<DataT> a() {
            return this.v;
        }

        @Override // defpackage.cpc
        public final void b() {
            cpc<DataT> cpcVar = this.y;
            if (cpcVar != null) {
                cpcVar.b();
            }
        }

        public final cpc<DataT> c() throws Throwable {
            i2w.a<DataT> aVarA;
            Throwable th;
            boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            Context context = this.a;
            Uri requireOriginal = this.d;
            s2z s2zVar = this.i;
            int i = this.f;
            int i2 = this.e;
            if (zIsExternalStorageLegacy) {
                try {
                    Cursor cursorQuery = context.getContentResolver().query(requireOriginal, z, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + requireOriginal);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                aVarA = this.b.a(file, i2, i, s2zVar);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor == null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + requireOriginal);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                boolean zB = xkv.b(requireOriginal);
                i2w<Uri, DataT> i2wVar = this.c;
                if (zB && requireOriginal.getPathSegments().contains("picker")) {
                    aVarA = i2wVar.a(requireOriginal, i2, i, s2zVar);
                } else {
                    if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                    }
                    aVarA = i2wVar.a(requireOriginal, i2, i, s2zVar);
                }
            }
            if (aVarA != null) {
                return aVarA.c;
            }
            return null;
        }

        @Override // defpackage.cpc
        public final void cancel() {
            this.w = true;
            cpc<DataT> cpcVar = this.y;
            if (cpcVar != null) {
                cpcVar.cancel();
            }
        }

        @Override // defpackage.cpc
        public final void d(lw20 lw20Var, cpc.a<? super DataT> aVar) throws Throwable {
            try {
                cpc<DataT> cpcVarC = c();
                if (cpcVarC == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
                } else {
                    this.y = cpcVarC;
                    if (this.w) {
                        cancel();
                    } else {
                        cpcVarC.d(lw20Var, aVar);
                    }
                }
            } catch (FileNotFoundException e) {
                aVar.c(e);
            }
        }

        @Override // defpackage.cpc
        public final cqc e() {
            return cqc.a;
        }
    }

    public za30(Context context, i2w<File, DataT> i2wVar, i2w<Uri, DataT> i2wVar2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = i2wVar;
        this.c = i2wVar2;
        this.d = cls;
    }

    @Override // defpackage.i2w
    public final i2w.a a(Uri uri, int i, int i2, s2z s2zVar) {
        Uri uri2 = uri;
        return new i2w.a(new acy(uri2), new d(this.a, this.b, this.c, uri2, i, i2, s2zVar, this.d));
    }

    @Override // defpackage.i2w
    public final boolean b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && xkv.b(uri);
    }
}
