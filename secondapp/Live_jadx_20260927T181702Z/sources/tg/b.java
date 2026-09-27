package tg;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f136970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f136972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f136973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f136974e;

    public b(int i10, int i11, int i12, int i13, int i14) {
        this.f136970a = i10;
        this.f136971b = i11;
        this.f136972c = i12;
        this.f136973d = i13;
        this.f136974e = i14;
    }

    @Nullable
    public static b a(String str) {
        eh.a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String strG = zi.c.g(strArrSplit[i14].trim());
            strG.getClass();
            switch (strG) {
                case "end":
                    i11 = i14;
                    break;
                case "text":
                    i13 = i14;
                    break;
                case "start":
                    i10 = i14;
                    break;
                case "style":
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new b(i10, i11, i12, i13, strArrSplit.length);
    }
}
