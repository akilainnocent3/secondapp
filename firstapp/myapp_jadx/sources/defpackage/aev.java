package defpackage;

import com.appsflyer.internal.h;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportygames.crash.models.header.snc.OdQr;
import com.twilio.voice.EventGroupType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aev {
    public final b a;
    public final Integer b;
    public final UiText c;
    public final boolean d;
    public final a e;
    public final boolean f;
    public final boolean g;
    public final s9s.b h;
    public final Function1<v1b<? super Unit>, Object> i;

    public static abstract class a {

        /* JADX INFO: renamed from: aev$a$a, reason: collision with other inner class name */
        public static final class C0015a extends a {
        }

        public static final class b extends a {
            public final int a;
            public final String b = "Available";

            public b(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && Intrinsics.g(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return h.a(this.a, "Icon(icon=", ", contentDescription=", this.b, ")");
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        public static final class c extends a {
            public final UiText a;
            public final Integer b;
            public final Integer c;
            public final Boolean d;
            public final List<j58> e;
            public final List<Float> f;
            public final Integer g;
            public final gly h;
            public final Function1<Float, gly> i;
            public final Integer j;
            public final String k;
            public final tmz l;
            public final g7f m;

            public c(UiText uiText, Integer num, List list, List list2, Integer num2, gly glyVar, Integer num3, String str, umz umzVar, g7f g7fVar, int i) {
                Integer numValueOf = Integer.valueOf(R.color.brand_secondary);
                Boolean bool = Boolean.TRUE;
                num = (i & 2) != 0 ? null : num;
                numValueOf = (i & 4) != 0 ? null : numValueOf;
                bool = (i & 16) != 0 ? null : bool;
                list = (i & 32) != 0 ? null : list;
                List list3 = (i & 64) != 0 ? null : list2;
                Integer num4 = (i & 128) != 0 ? null : num2;
                gly glyVar2 = (i & 256) != 0 ? null : glyVar;
                ufv ufvVar = (i & 512) != 0 ? null : ufv.a;
                String str2 = (i & 2048) != 0 ? null : str;
                umz umzVar2 = (i & 4096) != 0 ? null : umzVar;
                g7f g7fVar2 = (i & 8192) == 0 ? g7fVar : null;
                this.a = uiText;
                this.b = num;
                this.c = numValueOf;
                this.d = bool;
                this.e = list;
                this.f = list3;
                this.g = num4;
                this.h = glyVar2;
                this.i = ufvVar;
                this.j = num3;
                this.k = str2;
                this.l = umzVar2;
                this.m = g7fVar2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && Intrinsics.g(this.e, cVar.e) && Intrinsics.g(this.f, cVar.f) && Intrinsics.g(this.g, cVar.g) && Intrinsics.g(this.h, cVar.h) && Intrinsics.g(this.i, cVar.i) && Intrinsics.g(this.j, cVar.j) && Intrinsics.g(this.k, cVar.k) && Intrinsics.g(this.l, cVar.l) && Intrinsics.g(this.m, cVar.m);
            }

            public final int hashCode() {
                int iHashCode = this.a.hashCode() * 31;
                Integer num = this.b;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.c;
                int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 961;
                Boolean bool = this.d;
                int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                List<j58> list = this.e;
                int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
                List<Float> list2 = this.f;
                int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
                Integer num3 = this.g;
                int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
                gly glyVar = this.h;
                int iHashCode8 = (iHashCode7 + (glyVar == null ? 0 : Long.hashCode(glyVar.a))) * 31;
                Function1<Float, gly> function1 = this.i;
                int iHashCode9 = (iHashCode8 + (function1 == null ? 0 : function1.hashCode())) * 31;
                Integer num4 = this.j;
                int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
                String str = this.k;
                int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
                tmz tmzVar = this.l;
                int iHashCode12 = (iHashCode11 + (tmzVar == null ? 0 : tmzVar.hashCode())) * 31;
                g7f g7fVar = this.m;
                return iHashCode12 + (g7fVar != null ? Float.hashCode(g7fVar.a) : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Text(text=");
                sb.append(this.a);
                sb.append(", textStyleId=");
                sb.append(this.b);
                sb.append(", background=");
                sb.append(this.c);
                sb.append(", brush=null, shimmer=");
                sb.append(this.d);
                sb.append(", shimmerColors=");
                qpu.a(OdQr.YDVKVV, ", shimmerDurationMillis=", sb, this.e, this.f);
                sb.append(this.g);
                sb.append(", shimmerStartOffset=");
                sb.append(this.h);
                sb.append(", shimmerEndOffsetProvider=");
                sb.append(this.i);
                sb.append(", textColor=");
                sb.append(this.j);
                sb.append(", resourceId=");
                sb.append(this.k);
                sb.append(", contentPadding=");
                sb.append(this.l);
                sb.append(", cornerRadius=");
                sb.append(this.m);
                sb.append(")");
                return sb.toString();
            }
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public enum b {
        RECAP("recap"),
        IDENTITY_VERIFICATION("identity_verification"),
        DAILY_STREAK("daily_streak"),
        SOCIAL("social"),
        CREATE_SPORTY_SOCIAL("create_social"),
        PROMOTIONS("promotions"),
        CUSTOMER_SERVICE("customer_service"),
        NOTIFICATION_CENTER("notification_center"),
        RATE_APP("rate_app"),
        HOW_TO_PLAY("how_to_play"),
        CHANGE_REGION("change_region"),
        FEEDBACK(EventGroupType.FEEDBACK_EVENT_GROUP),
        C("update_app"),
        TAX_REPORTS("tax_reports");

        public final String a;

        b(String str) {
            this.a = str;
        }
    }

    public aev() {
        throw null;
    }

    public aev(b bVar, Integer num, ResourceUiText resourceUiText, boolean z, a aVar, boolean z2, boolean z3, qfv.d dVar, int i) {
        s9s.b bVar2 = s9s.b.e;
        z = (i & 8) != 0 ? false : z;
        aVar = (i & 16) != 0 ? null : aVar;
        z2 = (i & 32) != 0 ? false : z2;
        z3 = (i & 128) != 0 ? true : z3;
        bVar2 = (i & 256) != 0 ? null : bVar2;
        dVar = (i & 512) != 0 ? null : dVar;
        bVar.getClass();
        resourceUiText.getClass();
        this.a = bVar;
        this.b = num;
        this.c = resourceUiText;
        this.d = z;
        this.e = aVar;
        this.f = z2;
        this.g = z3;
        this.h = bVar2;
        this.i = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aev)) {
            return false;
        }
        aev aevVar = (aev) obj;
        return this.a == aevVar.a && Intrinsics.g(this.b, aevVar.b) && Intrinsics.g(this.c, aevVar.c) && this.d == aevVar.d && Intrinsics.g(this.e, aevVar.e) && this.f == aevVar.f && this.g == aevVar.g && this.h == aevVar.h && Intrinsics.g(this.i, aevVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iA = mtg0.a(yvf.a((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d);
        a aVar = this.e;
        int iA2 = mtg0.a(mtg0.a((iA + (aVar == null ? 0 : aVar.hashCode())) * 31, 961, this.f), 31, this.g);
        s9s.b bVar = this.h;
        int iHashCode2 = (iA2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Function1<v1b<? super Unit>, Object> function1 = this.i;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        return "MeFragmentRowItem(type=" + this.a + ", icon=" + this.b + ", title=" + this.c + ", isNew=" + this.d + ", trailingContent=" + this.e + ", hasRedRot=" + this.f + ", labelText=null, showArrow=" + this.g + ", repeatOnLifecycle=" + this.h + ", repeat=" + this.i + ")";
    }
}
