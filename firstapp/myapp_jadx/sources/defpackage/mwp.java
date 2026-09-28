package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface mwp {

    public static final class a implements mwp {
        public final UiText a;
        public final ijf0 b;
        public final f8r c;

        public a(UiText uiText, ijf0 ijf0Var, f8r f8rVar) {
            ijf0Var.getClass();
            f8rVar.getClass();
            this.a = uiText;
            this.b = ijf0Var;
            this.c = f8rVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c);
        }

        @Override // defpackage.mwp
        public final UiText getTitle() {
            return this.a;
        }

        public final int hashCode() {
            return Integer.hashCode(64) + ((this.c.hashCode() + ey1.b(this.b, this.a.hashCode() * 31, 31)) * 31);
        }

        public final String toString() {
            return "NamePage(title=" + this.a + ", name=" + this.b + ", saveButtonState=" + this.c + ", maxChar=64)";
        }
    }

    public static final class b implements mwp {
        public final UiText a;
        public final boolean b;
        public final boolean c;
        public final qcn<kxq> d;
        public final f8r e;
        public final UiText f;

        /* JADX WARN: Multi-variable type inference failed */
        public b(UiText uiText, boolean z, boolean z2, qcn<? extends kxq> qcnVar, f8r f8rVar, UiText uiText2) {
            uiText.getClass();
            qcnVar.getClass();
            f8rVar.getClass();
            uiText2.getClass();
            this.a = uiText;
            this.b = z;
            this.c = z2;
            this.d = qcnVar;
            this.e = f8rVar;
            this.f = uiText2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && Intrinsics.g(this.d, bVar.d) && Intrinsics.g(this.e, bVar.e) && Intrinsics.g(this.f, bVar.f);
        }

        @Override // defpackage.mwp
        public final UiText getTitle() {
            return this.a;
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + shu.a(this.d, mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31);
        }

        public final String toString() {
            return "NumberPage(title=" + this.a + ", isColdSelected=" + this.b + ", isHotSelected=" + this.c + ", numbers=" + this.d + ", nextButtonState=" + this.e + ", nextButtonText=" + this.f + ")";
        }
    }

    UiText getTitle();
}
