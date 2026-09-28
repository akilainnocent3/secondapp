package defpackage;

import com.sportybet.android.widget.OneUpTwoUpCheckbox;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface yuy {

    public static final class a implements yuy {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -891882663;
        }

        public final String toString() {
            return "None";
        }
    }

    public static final class b implements yuy {
        public final OneUpTwoUpCheckbox.a a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final d f;
        public final boolean g;
        public final boolean h;
        public final boolean i;

        public b(OneUpTwoUpCheckbox.a aVar, boolean z, boolean z2, boolean z3, boolean z4, d dVar, boolean z5, boolean z6, boolean z7) {
            this.a = aVar;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = dVar;
            this.g = z5;
            this.h = z6;
            this.i = z7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + mtg0.a(mtg0.a((this.f.hashCode() + mtg0.a(mtg0.a(mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OneUpTwoUpCheckBoxState(mode=");
            sb.append(this.a);
            sb.append(", checked=");
            sb.append(this.b);
            sb.append(", supported=");
            nng.a(", reachable=", ", enabled=", sb, this.c, this.d);
            sb.append(this.e);
            sb.append(", loadingState=");
            sb.append(this.f);
            sb.append(", showUnsupportedDescription=");
            nng.a(", showMarketDescription=", ", showControlDash=", sb, this.g, this.h);
            return mq0.a(sb, this.i, ")");
        }
    }

    public static final class c implements yuy {
        public final OneUpTwoUpSwitch.c a;
        public final OneUpTwoUpSwitch.f b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final d f;
        public final boolean g;
        public final boolean h;
        public final boolean i;

        public c(OneUpTwoUpSwitch.c cVar, OneUpTwoUpSwitch.f fVar, boolean z, boolean z2, boolean z3, d dVar, boolean z4, boolean z5, boolean z6) {
            fVar.getClass();
            this.a = cVar;
            this.b = fVar;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = dVar;
            this.g = z4;
            this.h = z5;
            this.i = z6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.g(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h && this.i == cVar.i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + mtg0.a(mtg0.a((this.f.hashCode() + mtg0.a(mtg0.a(mtg0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OneUpTwoUpSwitchState(mode=");
            sb.append(this.a);
            sb.append(", state=");
            sb.append(this.b);
            sb.append(", supported=");
            nng.a(", reachable=", ", enabled=", sb, this.c, this.d);
            sb.append(this.e);
            sb.append(", loadingState=");
            sb.append(this.f);
            sb.append(", showUnsupportedDescription=");
            nng.a(", showMarketDescription=", ", showControlDash=", sb, this.g, this.h);
            return mq0.a(sb, this.i, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a;
        public static final d b;
        public static final d c;
        public static final /* synthetic */ d[] d;

        static {
            d dVar = new d("SHOW", 0);
            a = dVar;
            d dVar2 = new d("HIDE", 1);
            b = dVar2;
            d dVar3 = new d("NONE", 2);
            c = dVar3;
            d = new d[]{dVar, dVar2, dVar3};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) d.clone();
        }
    }
}
