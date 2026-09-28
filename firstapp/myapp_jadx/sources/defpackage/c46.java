package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c46 {
    public static final Object r = new Object();
    public static final SparseArray<Integer> s = new SparseArray<>();
    public final h36 a;
    public final Object b;
    public final d46 c;
    public final Executor d;
    public final Handler e;
    public final HandlerThread f;
    public g26 g;
    public b26 h;
    public tnh0 i;
    public n8e0 j;
    public w36 k;
    public final fo50 l;
    public final nv5.d m;
    public final d36 n;
    public a o;
    public qis<Void> p;
    public final Integer q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] f;

        static {
            a aVar = new a("UNINITIALIZED", 0);
            a = aVar;
            a aVar2 = new a("INITIALIZING", 1);
            b = aVar2;
            a aVar3 = new a("INITIALIZING_ERROR", 2);
            c = aVar3;
            a aVar4 = new a("INITIALIZED", 3);
            d = aVar4;
            a aVar5 = new a("SHUTDOWN", 4);
            e = aVar5;
            f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }
    }

    public c46() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0274, code lost:
    
        r5 = r10;
        r10 = r6;
        r11 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c46(com.sportybet.android.account.KycNativeCameraActivity r11, defpackage.das r12) {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c46.<init>(com.sportybet.android.account.KycNativeCameraActivity, das):void");
    }

    public static void a(Integer num) {
        synchronized (r) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray<Integer> sparseArray = s;
                int iIntValue = sparseArray.get(num.intValue()).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b() {
        SparseArray<Integer> sparseArray = s;
        if (sparseArray.size() == 0) {
            pgt.a = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            pgt.a = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            pgt.a = 4;
        } else if (sparseArray.get(5) != null) {
            pgt.a = 5;
        } else if (sparseArray.get(6) != null) {
            pgt.a = 6;
        }
    }
}
