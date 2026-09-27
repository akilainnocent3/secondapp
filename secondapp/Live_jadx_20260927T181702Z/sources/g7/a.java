package g7;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f86071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f86072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f86073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f86074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f86075f;

    public a(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f86070a = i10;
        this.f86071b = i11;
        this.f86072c = i12;
        this.f86073d = i13;
        this.f86074e = i14;
        this.f86075f = i15;
    }

    @Nullable
    public static a a(String str) {
        l0.d(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < strArrSplit.length; i15++) {
            String strG = zi.c.g(strArrSplit[i15].trim());
            strG.getClass();
            switch (strG) {
                case "end":
                    i12 = i15;
                    break;
                case "text":
                    i14 = i15;
                    break;
                case "layer":
                    i10 = i15;
                    break;
                case "start":
                    i11 = i15;
                    break;
                case "style":
                    i13 = i15;
                    break;
            }
        }
        if (i11 == -1 || i12 == -1 || i14 == -1) {
            return null;
        }
        return new a(i10, i11, i12, i13, i14, strArrSplit.length);
    }
}
