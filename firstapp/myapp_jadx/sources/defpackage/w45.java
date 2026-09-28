package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w45 {
    public final List<u8j> a;

    public static final class a {
        public static c a(UiText uiText, uxs uxsVar, Function0 function0, int i) {
            if ((i & 2) != 0) {
                uxsVar = uxs.ENABLE;
            }
            uxs uxsVar2 = uxsVar;
            m2g m2gVar = m2g.a;
            uxsVar2.getClass();
            m2gVar.getClass();
            function0.getClass();
            return new c("bottom_sheet_primary_button", uiText, uxsVar2, m2gVar, function0);
        }

        public static c b(UiText uiText, Function0 function0) {
            uxs uxsVar = uxs.ENABLE;
            m2g m2gVar = m2g.a;
            m2gVar.getClass();
            function0.getClass();
            return new c("bottom_sheet_secondary_button", uiText, uxsVar, m2gVar, function0);
        }
    }

    public w45(List<u8j> list) {
        this.a = list;
    }

    public abstract List<u8j> a();

    public static final class b extends w45 {
        public final op8 b;
        public final List<u8j> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(op8 op8Var, List list) {
            super(list);
            list.getClass();
            this.b = op8Var;
            this.c = list;
        }

        @Override // defpackage.w45
        public final List<u8j> a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Custom(buttonComposable=" + this.b + ", fsAttributes=" + this.c + ")";
        }

        public b(op8 op8Var) {
            this(op8Var, m2g.a);
        }
    }

    public static final class c extends w45 {
        public final String b;
        public final UiText c;
        public final uxs d;
        public final List<u8j> e;
        public final Function0<Unit> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, UiText uiText, uxs uxsVar, List<u8j> list, Function0<Unit> function0) {
            super(list);
            uiText.getClass();
            uxsVar.getClass();
            list.getClass();
            function0.getClass();
            this.b = str;
            this.c = uiText;
            this.d = uxsVar;
            this.e = list;
            this.f = function0;
        }

        @Override // defpackage.w45
        public final List<u8j> a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && this.d == cVar.d && Intrinsics.g(this.e, cVar.e) && Intrinsics.g(this.f, cVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ai50.a(y45.a(this.d, yvf.a(this.b.hashCode() * 31, 31, this.c), 31), 31, this.e);
        }

        public final String toString() {
            StringBuilder sbA = x45.a(this.c, "Default(testResourceId=", this.b, ", buttonText=", ", buttonStatus=");
            sbA.append(this.d);
            sbA.append(", fsAttributes=");
            sbA.append(this.e);
            sbA.append(", onClick=");
            sbA.append(this.f);
            sbA.append(")");
            return sbA.toString();
        }

        public c(ResourceUiText resourceUiText, String str, Function0 function0) {
            this(str, resourceUiText, uxs.ENABLE, m2g.a, function0);
        }
    }
}
