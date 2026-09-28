package defpackage;

import com.appsflyer.internal.b0;
import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oo3 {
    public final b a;
    public final int b;
    public final UiText c;
    public final boolean d;
    public final boolean e;
    public final List<a> f;
    public final d g;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public final String a;
        public final boolean b;
        public final List<d> c;

        public a(String str, boolean z, List<d> list) {
            str.getClass();
            this.a = str;
            this.b = z;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return ng1.a(z620.a("CategoryUi(title=", this.a, ", collapsed=", ", themes=", this.b), this.c, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("StartMission", 0);
            a = bVar;
            b bVar2 = new b("CompleteMission", 1);
            b = bVar2;
            b bVar3 = new b("None", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final /* synthetic */ c[] e;

        static {
            c cVar = new c("Unlock", 0);
            a = cVar;
            c cVar2 = new c("Apply", 1);
            b = cVar2;
            c cVar3 = new c("Applied", 2);
            c = cVar3;
            c cVar4 = new c("None", 3);
            d = cVar4;
            e = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) e.clone();
        }
    }

    public static final class d {
        public final long a;
        public final String b;
        public final String c;
        public final c d;
        public final Integer e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public d(long j, String str, String str2, c cVar, Integer num, boolean z, boolean z2, boolean z3) {
            str.getClass();
            str2.getClass();
            this.a = j;
            this.b = str;
            this.c = str2;
            this.d = cVar;
            this.e = num;
            this.f = z;
            this.g = z2;
            this.h = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && Intrinsics.g(this.b, dVar.b) && Intrinsics.g(this.c, dVar.c) && this.d == dVar.d && Intrinsics.g(this.e, dVar.e) && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + gmf0.a(gmf0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31;
            Integer num = this.e;
            return Boolean.hashCode(this.h) + mtg0.a(mtg0.a((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sbA = b0.a(this.a, "ThemeUi(id=", ", name=", this.b);
            sbA.append(", thumbnailPath=");
            sbA.append(this.c);
            sbA.append(", button=");
            sbA.append(this.d);
            sbA.append(", labelRes=");
            sbA.append(this.e);
            sbA.append(", isLoading=");
            sbA.append(this.f);
            u8.a(", enabled=", ", isBasicTheme=", sbA, this.g, this.h);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public oo3(b bVar, int i, UiText uiText, boolean z, boolean z2, List<a> list, d dVar) {
        bVar.getClass();
        uiText.getClass();
        list.getClass();
        this.a = bVar;
        this.b = i;
        this.c = uiText;
        this.d = z;
        this.e = z2;
        this.f = list;
        this.g = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo3)) {
            return false;
        }
        oo3 oo3Var = (oo3) obj;
        return this.a == oo3Var.a && this.b == oo3Var.b && Intrinsics.g(this.c, oo3Var.c) && this.d == oo3Var.d && this.e == oo3Var.e && Intrinsics.g(this.f, oo3Var.f) && Intrinsics.g(this.g, oo3Var.g);
    }

    public final int hashCode() {
        int iA = ai50.a(mtg0.a(mtg0.a(yvf.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        d dVar = this.g;
        return iA + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "BetslipCustomizationUiModel(cta=" + this.a + ", pickCount=" + this.b + ", pickText=" + this.c + ", expanded=" + this.d + ", canCustomize=" + this.e + ", categories=" + this.f + ", basicTheme=" + this.g + ")";
    }

    public oo3(b bVar, int i, ConcatUiText concatUiText, boolean z, boolean z2, m2g m2gVar, int i2) {
        this(bVar, i, (i2 & 4) != 0 ? vch0.a : concatUiText, z, z2, m2gVar, (d) null);
    }
}
