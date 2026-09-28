package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface jj40 {

    public static final class a implements jj40 {
        public final boolean a;
        public final o2s b;
        public final UiText c;
        public final UiText d;
        public final boolean e;
        public final boolean f;
        public final int g;

        public a(boolean z, o2s o2sVar, ResourceUiText resourceUiText, ColoredUiText coloredUiText, boolean z2, boolean z3, int i) {
            z = (i & 1) != 0 ? false : z;
            o2sVar = (i & 2) != 0 ? null : o2sVar;
            if ((i & 4) != 0) {
                StringUiText stringUiText = vch0.a;
                resourceUiText = new ResourceUiText(R.string.cashout__recommended_code);
            }
            if ((i & 8) != 0) {
                StringUiText stringUiText2 = vch0.a;
                coloredUiText = new ColoredUiText(new ResourceUiText(R.string.cashout__recommended_code_description), Integer.valueOf(R.color.text_type1_primary), null);
            }
            z2 = (i & 16) != 0 ? true : z2;
            z3 = (i & 32) != 0 ? false : z3;
            int i2 = (i & 64) != 0 ? 20 : 12;
            this.a = z;
            this.b = o2sVar;
            this.c = resourceUiText;
            this.d = coloredUiText;
            this.e = z2;
            this.f = z3;
            this.g = i2;
        }

        @Override // defpackage.jj40
        public final boolean a() {
            return this.a;
        }

        @Override // defpackage.jj40
        public final int b() {
            return this.g;
        }

        @Override // defpackage.jj40
        public final o2s c() {
            return this.b;
        }

        @Override // defpackage.jj40
        public final UiText d() {
            return this.c;
        }

        @Override // defpackage.jj40
        public final boolean e() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.a) * 31;
            o2s o2sVar = this.b;
            int iA = yvf.a((iHashCode + (o2sVar == null ? 0 : o2sVar.hashCode())) * 31, 31, this.c);
            UiText uiText = this.d;
            return Integer.hashCode(this.g) + mtg0.a(mtg0.a((iA + (uiText != null ? uiText.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Collapsed(isTopDividerVisible=");
            sb.append(this.a);
            sb.append(", leadingIcon=");
            sb.append(this.b);
            sb.append(", titleUiText=");
            vh8.a(sb, this.c, ", messageUiText=", this.d, ", expandable=");
            nng.a(", hasMission=", ", viewPaddingDp=", sb, this.e, this.f);
            return zk1.a(this.g, ")", sb);
        }
    }

    public static final class b implements jj40 {
        public final boolean a;
        public final o2s b;
        public final UiText c;
        public final boolean d;
        public final int e;

        public b(boolean z, o2s o2sVar, ResourceUiText resourceUiText, boolean z2, int i) {
            z = (i & 1) != 0 ? false : z;
            o2sVar = (i & 2) != 0 ? null : o2sVar;
            if ((i & 4) != 0) {
                StringUiText stringUiText = vch0.a;
                resourceUiText = new ResourceUiText(R.string.cashout__recommended_code);
            }
            z2 = (i & 8) != 0 ? false : z2;
            this.a = z;
            this.b = o2sVar;
            this.c = resourceUiText;
            this.d = z2;
            this.e = 12;
        }

        @Override // defpackage.jj40
        public final boolean a() {
            return this.a;
        }

        @Override // defpackage.jj40
        public final int b() {
            return this.e;
        }

        @Override // defpackage.jj40
        public final o2s c() {
            return this.b;
        }

        @Override // defpackage.jj40
        public final UiText d() {
            return this.c;
        }

        @Override // defpackage.jj40
        public final boolean e() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.a) * 31;
            o2s o2sVar = this.b;
            return Integer.hashCode(this.e) + mtg0.a(yvf.a((iHashCode + (o2sVar == null ? 0 : o2sVar.hashCode())) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Expanded(isTopDividerVisible=");
            sb.append(this.a);
            sb.append(", leadingIcon=");
            sb.append(this.b);
            sb.append(", titleUiText=");
            sb.append(this.c);
            sb.append(", hasMission=");
            sb.append(this.d);
            sb.append(", viewPaddingDp=");
            return zk1.a(this.e, ")", sb);
        }
    }

    boolean a();

    int b();

    o2s c();

    UiText d();

    boolean e();
}
