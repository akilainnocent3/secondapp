package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.google.protobuf.Reader;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class q9h0 {
    public q9h0() {
        new ConcurrentHashMap();
    }

    public static v9i.b e(v9i.b[] bVarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        v9i.b bVar = null;
        int i3 = Reader.READ_DONE;
        for (v9i.b bVar2 : bVarArr) {
            int iAbs = (Math.abs(bVar2.c - i2) * 2) + (bVar2.d == z ? 0 : 1);
            if (bVar == null || i3 > iAbs) {
                bVar = bVar2;
                i3 = iAbs;
            }
        }
        return bVar;
    }

    public Typeface a(Context context, e9i.b bVar, Resources resources, int i) {
        throw null;
    }

    public Typeface b(Context context, v9i.b[] bVarArr, int i) {
        throw null;
    }

    public Typeface c(int i, Context context, List list) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File fileC = r9h0.c(context);
        if (fileC == null) {
            return null;
        }
        try {
            if (r9h0.a(fileC, resources, i)) {
                return Typeface.createFromFile(fileC.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileC.delete();
        }
    }
}
