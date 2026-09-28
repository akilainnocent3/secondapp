package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sportybet.android.bookingcode.presentation.activity.HighLiabilityCodeActivity;
import com.sportybet.plugin.realsports.data.Event;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fkl extends vd<a, b> {

    public static final class a {
        public final String a;
        public final String b;
        public final List<Event> c;
        public final String d;
        public final boolean e;

        public a(String str, String str2, String str3, boolean z, List list) {
            str.getClass();
            list.getClass();
            this.a = str;
            this.b = str2;
            this.c = list;
            this.d = str3;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b.equals(aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int iA = ai50.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return Boolean.hashCode(this.e) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("Param(bookingCode=", this.a, ", summary=", this.b, ", events=");
            gfs.a(", loadBookingCodeFrom=", this.d, ", isSmartRemixAvailable=", sbA, this.c);
            return mq0.a(sbA, this.e, ")");
        }
    }

    public interface b {

        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1564238012;
            }

            public final String toString() {
                return "EditInMultiMaker";
            }
        }

        /* JADX INFO: renamed from: fkl$b$b, reason: collision with other inner class name */
        public static final class C0571b implements b {
            public static final C0571b a = new C0571b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0571b);
            }

            public final int hashCode() {
                return 210091040;
            }

            public final String toString() {
                return "Exit";
            }
        }
    }

    @Override // defpackage.vd
    public final Intent a(Object obj, Context context) {
        a aVar = (a) obj;
        aVar.getClass();
        Intent intent = new Intent(context, (Class<?>) HighLiabilityCodeActivity.class);
        intent.putExtra("share_code", aVar.a);
        intent.putExtra("summary", aVar.b);
        List<Event> list = aVar.c;
        list.getClass();
        intent.putParcelableArrayListExtra("booking_code_event", (ArrayList) list);
        String str = aVar.d;
        if (str == null) {
            str = "";
        }
        intent.putExtra("action_load_booking_code_from", str);
        intent.putExtra("is_smart_remix_available", aVar.e);
        return intent;
    }

    @Override // defpackage.vd
    public final Object c(Intent intent, int i) {
        return i == 1 ? b.a.a : b.C0571b.a;
    }
}
