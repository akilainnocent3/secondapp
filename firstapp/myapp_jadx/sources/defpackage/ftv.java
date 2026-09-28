package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ftv {

    public static final class a extends ftv {
        public final UiText a;
        public final UiText b;
        public final UiText c;
        public final float d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public a(UiText uiText, UiText uiText2, UiText uiText3, float f, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = uiText;
            this.b = uiText2;
            this.c = uiText3;
            this.d = f;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = z4;
        }

        @Override // defpackage.ftv
        public final boolean a() {
            return this.h;
        }

        @Override // defpackage.ftv
        public final boolean b() {
            return this.e;
        }

        @Override // defpackage.ftv
        public final boolean c() {
            return this.f;
        }

        @Override // defpackage.ftv
        public final boolean d() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Float.compare(this.d, aVar.d) == 0 && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h) + mtg0.a(mtg0.a(mtg0.a(tvh.a(this.d, yvf.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sbA = uh8.a(this.a, this.b, "BetSlip(title=", ", settledAmount=", ", missionTarget=");
            sbA.append(this.c);
            sbA.append(", progress=");
            sbA.append(this.d);
            sbA.append(", hasMinStakeRequirement=");
            nng.a(", hasOneUpRequirement=", ", hasTwoUpRequirement=", sbA, this.e, this.f);
            return lng.a(", hasEarlyGoalsRequirement=", ")", sbA, this.g, this.h);
        }
    }

    public static final class b extends ftv {
        public final UiText a;
        public final UiText b;
        public final UiText c;
        public final UiText d;
        public final UiText e;
        public final float f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;

        public b(UiText uiText, UiText uiText2, UiText uiText3, UiText uiText4, UiText uiText5, float f, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = uiText;
            this.b = uiText2;
            this.c = uiText3;
            this.d = uiText4;
            this.e = uiText5;
            this.f = f;
            this.g = z;
            this.h = z2;
            this.i = z3;
            this.j = z4;
        }

        @Override // defpackage.ftv
        public final boolean a() {
            return this.j;
        }

        @Override // defpackage.ftv
        public final boolean b() {
            return this.g;
        }

        @Override // defpackage.ftv
        public final boolean c() {
            return this.h;
        }

        @Override // defpackage.ftv
        public final boolean d() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d) && Intrinsics.g(this.e, bVar.e) && Float.compare(this.f, bVar.f) == 0 && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && this.j == bVar.j;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.j) + mtg0.a(mtg0.a(mtg0.a(tvh.a(this.f, yvf.a(yvf.a(yvf.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i);
        }

        public final String toString() {
            StringBuilder sbA = uh8.a(this.a, this.b, "BetSuccess(title=", ", subTitle=", ", moreInfo=");
            vh8.a(sbA, this.c, ", settledAmount=", this.d, ", missionTarget=");
            sbA.append(this.e);
            sbA.append(", progress=");
            sbA.append(this.f);
            sbA.append(", hasMinStakeRequirement=");
            nng.a(", hasOneUpRequirement=", ", hasTwoUpRequirement=", sbA, this.g, this.h);
            return lng.a(", hasEarlyGoalsRequirement=", ")", sbA, this.i, this.j);
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();
}
