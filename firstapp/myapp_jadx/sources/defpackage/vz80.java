package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sportybet.android.share.presentation.activity.ShareCodeActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class vz80 extends vd<wz80, a> {

    public interface a {

        /* JADX INFO: renamed from: vz80$a$a, reason: collision with other inner class name */
        public static final class C1232a implements a {
            public static final C1232a a = new C1232a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1232a);
            }

            public final int hashCode() {
                return 471667585;
            }

            public final String toString() {
                return "Exit";
            }
        }

        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -15992017;
            }

            public final String toString() {
                return "LoadCodeHighLiabilityEditInMultiMaker";
            }
        }

        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 178989843;
            }

            public final String toString() {
                return "LoadCodeHighLiabilityExit";
            }
        }

        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -2101254579;
            }

            public final String toString() {
                return "LoadCodeSuccess";
            }
        }
    }

    @Override // defpackage.vd
    public final Intent a(Object obj, Context context) {
        wz80 wz80Var = (wz80) obj;
        wz80Var.getClass();
        Intent intent = new Intent(context, (Class<?>) ShareCodeActivity.class);
        intent.putExtra("imageUri", wz80Var.a);
        intent.putExtra("imageWithUserUri", wz80Var.b);
        intent.putExtra("linkUrl", wz80Var.c);
        intent.putExtra("shareCode", wz80Var.d);
        String str = wz80Var.e;
        if (str != null) {
            intent.putExtra("customCode", str);
        }
        intent.putExtra("alreadyPublished", wz80Var.f);
        String str2 = wz80Var.h;
        if (str2 != null) {
            intent.putExtra("username", str2);
        }
        String str3 = wz80Var.i;
        if (str3 != null) {
            intent.putExtra("avatarUri", str3);
        }
        String str4 = wz80Var.j;
        if (str4 != null) {
            intent.putExtra("source", str4);
        }
        String str5 = wz80Var.l;
        if (str5 != null) {
            intent.putExtra("userNote", str5);
        }
        String str6 = wz80Var.k;
        if (str6 != null) {
            intent.putExtra("orderId", str6);
        }
        intent.putExtra("isSingleBetBuilder", wz80Var.g);
        return intent;
    }

    @Override // defpackage.vd
    public final Object c(Intent intent, int i) {
        if (i == 1) {
            return a.d.a;
        }
        if (i != 2) {
            return i != 3 ? a.C1232a.a : a.b.a;
        }
        return a.c.a;
    }
}
