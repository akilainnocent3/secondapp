package defpackage;

import android.util.Base64;
import com.sportybet.android.instantwin.newtork.model.error.ErrorCode;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class c1k {
    public final qde a;

    public static abstract class a {

        /* JADX INFO: renamed from: c1k$a$a, reason: collision with other inner class name */
        public static final class C0150a extends a {
            public static final C0150a a = new C0150a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0150a);
            }

            public final int hashCode() {
                return 1639360582;
            }

            public final String toString() {
                return "ApiDisabled";
            }
        }

        public static final class b extends a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("Nonce(value=", this.a, ")");
            }
        }
    }

    public c1k(qde qdeVar) {
        this.a = qdeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        d1k d1kVar;
        if (x1bVar instanceof d1k) {
            d1kVar = (d1k) x1bVar;
            int i = d1kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d1kVar.c = i - Integer.MIN_VALUE;
            } else {
                d1kVar = new d1k(this, x1bVar);
            }
        } else {
            d1kVar = new d1k(this, x1bVar);
        }
        Object objA = d1kVar.a;
        y5b y5bVar = y5b.a;
        int i2 = d1kVar.c;
        if (i2 == 0) {
            uj50.b(objA);
            e1k e1kVar = new e1k(this, null);
            b1k b1kVar = new b1k();
            d1kVar.c = 1;
            objA = oni.a(500L, e1kVar, b1kVar, d1kVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        a aVar = (a) objA;
        return aVar == null ? a.C0150a.a : aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(x1b x1bVar) {
        f1k f1kVar;
        byte[] bArrDigest;
        if (x1bVar instanceof f1k) {
            f1kVar = (f1k) x1bVar;
            int i = f1kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f1kVar.c = i - Integer.MIN_VALUE;
            } else {
                f1kVar = new f1k(this, x1bVar);
            }
        } else {
            f1kVar = new f1k(this, x1bVar);
        }
        Object objA = f1kVar.a;
        y5b y5bVar = y5b.a;
        int i2 = f1kVar.c;
        if (i2 == 0) {
            uj50.b(objA);
            qde qdeVar = this.a;
            sl50 sl50Var = new sl50(bm50.b(ozh.c(new or60(new mde(qdeVar, null)), qdeVar.b), vch0.b));
            f1kVar.c = 1;
            objA = s0i.a(sl50Var, f1kVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        lk50 lk50Var = (lk50) objA;
        if (!(lk50Var instanceof lk50.c)) {
            if (bm50.j(lk50Var, ErrorCode.INVALID) != null) {
                return a.C0150a.a;
            }
            return null;
        }
        byte[] bytes = ((String) ((lk50.c) lk50Var).a).getBytes(Charsets.UTF_8);
        bytes.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes);
            bArrDigest = messageDigest.digest();
        } catch (Exception unused) {
            bArrDigest = new byte[0];
        }
        String strEncodeToString = bArrDigest != null ? Base64.encodeToString(bArrDigest, 10) : null;
        strEncodeToString.getClass();
        return new a.b(wae0.K(500, StringsKt.Y(strEncodeToString, 16, '=')));
    }
}
