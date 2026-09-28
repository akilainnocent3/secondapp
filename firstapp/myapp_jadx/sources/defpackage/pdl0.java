package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pdl0 {
    public static final Object f = new Object();
    public static volatile nbl0 g;
    public static final AtomicInteger h;
    public final fdl0 a;
    public final String b;
    public final Object c;
    public volatile int d = -1;
    public volatile Object e;

    static {
        new AtomicReference();
        h = new AtomicInteger();
    }

    public /* synthetic */ pdl0(fdl0 fdl0Var, String str, Object obj) {
        if (fdl0Var.a == null) {
            hb5.a("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        this.a = fdl0Var;
        this.b = str;
        this.c = obj;
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Code duplicated, block: B:22:0x005b A[PHI: r2
      0x005b: PHI (r2v1 l2z) = (r2v0 l2z), (r2v0 l2z), (r2v4 l2z), (r2v4 l2z) binds: [B:8:0x0014, B:10:0x0018, B:12:0x0027, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    public final Object b() {
        String str;
        Object objA;
        String strB;
        mfe0 mfe0Var;
        nj90 nj90Var;
        int i = h.get();
        if (this.d < i) {
            synchronized (this) {
                try {
                    if (this.d < i) {
                        nbl0 nbl0Var = g;
                        l2z l2zVar = y1.a;
                        Object objA2 = null;
                        if (nbl0Var == null || (mfe0Var = nbl0Var.b) == null) {
                            str = null;
                        } else {
                            mfe0Var.getClass();
                            l2zVar = (l2z) mfe0Var.get();
                            if (l2zVar.b()) {
                                ybl0 ybl0Var = (ybl0) l2zVar.a();
                                Uri uri = this.a.a;
                                String str2 = this.b;
                                if (uri != null) {
                                    nj90Var = (nj90) ybl0Var.a.get(uri.toString());
                                } else {
                                    ybl0Var.getClass();
                                    nj90Var = null;
                                }
                                if (nj90Var == null) {
                                    str = null;
                                } else {
                                    str = (String) nj90Var.get("".concat(str2));
                                }
                            } else {
                                str = null;
                            }
                        }
                        im20.h("Must call PhenotypeFlagInitializer.maybeInit() first", nbl0Var != null);
                        fdl0 fdl0Var = this.a;
                        Uri uri2 = fdl0Var.a;
                        if (uri2 == null) {
                            Context context = nbl0Var.a;
                            throw null;
                        }
                        ubl0 ubl0VarA = ucl0.a(nbl0Var.a, uri2) ? ubl0.a(nbl0Var.a.getContentResolver(), uri2, kdl0.a) : null;
                        if (ubl0VarA != null) {
                            String str3 = (String) ubl0VarA.b().get(this.b);
                            if (str3 != null) {
                                objA = a(str3);
                            } else {
                                objA = null;
                            }
                        } else {
                            objA = null;
                        }
                        if (objA == null) {
                            if (!fdl0Var.b && (strB = gcl0.a(nbl0Var.a).b(this.b)) != null) {
                                objA2 = a(strB);
                            }
                            objA = objA2 == null ? this.c : objA2;
                        }
                        if (l2zVar.b()) {
                            objA = str == null ? this.c : a(str);
                        }
                        this.e = objA;
                        this.d = i;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.e;
    }
}
