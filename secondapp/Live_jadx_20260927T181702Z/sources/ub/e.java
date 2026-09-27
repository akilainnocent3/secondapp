package ub;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f139473f = "ThumbStreamOpener";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f139474g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f139475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f139476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wb.b f139477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ContentResolver f139478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<ImageHeaderParser> f139479e;

    public e(List<ImageHeaderParser> list, d dVar, wb.b bVar, ContentResolver contentResolver) {
        this(list, f139474g, dVar, bVar, contentResolver);
    }

    public int a(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f139478d.openInputStream(uri);
                return com.bumptech.glide.load.a.b(this.f139479e, inputStreamOpenInputStream, this.f139477c);
            } finally {
                if (0 != 0) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (IOException | NullPointerException e10) {
            if (Log.isLoggable(f139473f, 3)) {
                Log.d(f139473f, "Failed to open uri: " + uri, e10);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                inputStreamOpenInputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x001b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:28), block:B:11:0x001b */
    @Nullable
    public final String b(@NonNull Uri uri) throws Throwable {
        Cursor cursorA;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            try {
                cursorA = this.f139476b.a(uri);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToFirst()) {
                            String string = cursorA.getString(0);
                            cursorA.close();
                            return string;
                        }
                    } catch (SecurityException e10) {
                        e = e10;
                        if (Log.isLoggable(f139473f, 3)) {
                            Log.d(f139473f, "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorA != null) {
                            cursorA.close();
                        }
                        return null;
                    }
                }
                if (cursorA != null) {
                    cursorA.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SecurityException e11) {
            e = e11;
            cursorA = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public final boolean c(File file) {
        return this.f139475a.a(file) && 0 < this.f139475a.c(file);
    }

    public InputStream d(Uri uri) throws Throwable {
        String strB = b(uri);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        File fileB = this.f139475a.b(strB);
        if (!c(fileB)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileB);
        try {
            return this.f139478d.openInputStream(uriFromFile);
        } catch (NullPointerException e10) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e10));
        }
    }

    public e(List<ImageHeaderParser> list, a aVar, d dVar, wb.b bVar, ContentResolver contentResolver) {
        this.f139475a = aVar;
        this.f139476b = dVar;
        this.f139477c = bVar;
        this.f139478d = contentResolver;
        this.f139479e = list;
    }
}
