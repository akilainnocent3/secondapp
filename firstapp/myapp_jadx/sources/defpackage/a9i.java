package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a9i {
    public static final s4u<String, Typeface> a = new s4u<>(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final nj90<String, ArrayList<qya<a>>> d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new oa50());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new nj90<>();
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((v8i) list.get(i2)).f);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static a b(String str, Context context, List<v8i> list, int i) {
        int i2;
        Typeface typefaceB;
        s4u<String, Typeface> s4uVar = a;
        Trace.beginSection(sig0.d("getFontSync"));
        try {
            Typeface typefaceB2 = s4uVar.b(str);
            if (typefaceB2 != null) {
                a aVar = new a(typefaceB2);
                Trace.endSection();
                return aVar;
            }
            try {
                v9i.a aVarA = u8i.a(context, list);
                List<v9i.b[]> list2 = aVarA.b;
                int i3 = aVarA.a;
                if (i3 == 0) {
                    v9i.b[] bVarArr = list2.get(0);
                    if (bVarArr == null || bVarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = bVarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = bVarArr[i4].e;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    a aVar2 = new a(i2);
                    Trace.endSection();
                    return aVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    v9i.b[] bVarArr2 = list2.get(0);
                    q9h0 q9h0Var = j9h0.a;
                    Trace.beginSection(sig0.d("TypefaceCompat.createFromFontInfo"));
                    try {
                        typefaceB = j9h0.a.b(context, bVarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    q9h0 q9h0Var2 = j9h0.a;
                    Trace.beginSection(sig0.d("TypefaceCompat.createFromFontInfoWithFallback"));
                    try {
                        typefaceB = j9h0.a.c(i, context, list2);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceB == null) {
                    a aVar3 = new a(-3);
                    Trace.endSection();
                    return aVar3;
                }
                s4uVar.c(str, typefaceB);
                a aVar4 = new a(typefaceB);
                Trace.endSection();
                return aVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                a aVar5 = new a(-1);
                Trace.endSection();
                return aVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public static final class a {
        public final Typeface a;
        public final int b;

        public a(int i) {
            this.a = null;
            this.b = i;
        }

        public a(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}
