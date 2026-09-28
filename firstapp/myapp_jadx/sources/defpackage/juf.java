package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class juf {

    public static final class a extends juf {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1145338759;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class b extends juf {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1320409349;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c extends juf {
        public final int a;
        public final String b;
        public final ijf0 c;
        public final UiText d;
        public final String e;
        public final ijf0 f;
        public final UiText g;
        public final boolean h;

        public c(int i, String str, ijf0 ijf0Var, UiText uiText, String str2, ijf0 ijf0Var2, UiText uiText2, boolean z) {
            str.getClass();
            ijf0Var.getClass();
            str2.getClass();
            ijf0Var2.getClass();
            this.a = i;
            this.b = str;
            this.c = ijf0Var;
            this.d = uiText;
            this.e = str2;
            this.f = ijf0Var2;
            this.g = uiText2;
            this.h = z;
        }

        public static c a(c cVar, ijf0 ijf0Var, UiText uiText, ijf0 ijf0Var2, UiText uiText2, boolean z, int i) {
            int i2 = cVar.a;
            String str = cVar.b;
            if ((i & 4) != 0) {
                ijf0Var = cVar.c;
            }
            ijf0 ijf0Var3 = ijf0Var;
            if ((i & 8) != 0) {
                uiText = cVar.d;
            }
            UiText uiText3 = uiText;
            String str2 = cVar.e;
            if ((i & 32) != 0) {
                ijf0Var2 = cVar.f;
            }
            ijf0 ijf0Var4 = ijf0Var2;
            if ((i & 64) != 0) {
                uiText2 = cVar.g;
            }
            UiText uiText4 = uiText2;
            if ((i & 128) != 0) {
                z = cVar.h;
            }
            str.getClass();
            ijf0Var3.getClass();
            str2.getClass();
            ijf0Var4.getClass();
            return new c(i2, str, ijf0Var3, uiText3, str2, ijf0Var4, uiText4, z);
        }

        public final boolean b() {
            return (Intrinsics.g(this.c.a.b, this.b) && Intrinsics.g(this.f.a.b, this.e)) ? false : true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && Intrinsics.g(this.e, cVar.e) && Intrinsics.g(this.f, cVar.f) && Intrinsics.g(this.g, cVar.g) && this.h == cVar.h;
        }

        public final int hashCode() {
            int iB = ey1.b(this.c, gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31);
            UiText uiText = this.d;
            int iB2 = ey1.b(this.f, gmf0.a((iB + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.e), 31);
            UiText uiText2 = this.g;
            return Boolean.hashCode(this.h) + ((iB2 + (uiText2 != null ? uiText2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = uqe0.a(this.a, "Success(minTime=", ", originalDailyLimit=", this.b, ", dailyLimitValue=");
            sbA.append(this.c);
            sbA.append(", dailyLimitErrorMsg=");
            sbA.append(this.d);
            sbA.append(", originalWeeklyLimit=");
            sbA.append(this.e);
            sbA.append(", weeklyLimitValue=");
            sbA.append(this.f);
            sbA.append(", weeklyLimitErrorMsg=");
            sbA.append(this.g);
            sbA.append(", isSavingLimits=");
            sbA.append(this.h);
            sbA.append(")");
            return sbA.toString();
        }
    }
}
