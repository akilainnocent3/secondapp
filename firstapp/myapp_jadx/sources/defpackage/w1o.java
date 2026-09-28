package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w1o {
    public final b a;
    public final UiText b;
    public final String c;
    public final a d;
    public final String e;

    public static abstract class a {

        /* JADX INFO: renamed from: w1o$a$a, reason: collision with other inner class name */
        public static final class C1233a extends a {
            public final String a;

            public C1233a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1233a) && Intrinsics.g(this.a, ((C1233a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("Label(text=", this.a, ")");
            }
        }

        public static final class b extends a {
            public final qcn<String> a;

            public b(qcn<String> qcnVar) {
                qcnVar.getClass();
                this.a = qcnVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return vf5.a(this.a, "Number(numberUrls=", ")");
            }
        }
    }

    public enum b {
        d("HIT", R.drawable.ic__feature__match_status_won, "selection_result_hit_icon"),
        e("MISS", R.drawable.ic__feature__match_status_lost, "selection_result_miss_icon");

        public final int a;
        public final int b;
        public final String c;

        b(String str, int i, String str2) {
            this.a = i;
            this.b = i;
            this.c = str2;
        }
    }

    public w1o(b bVar, UiText uiText, String str, a aVar, String str2) {
        this.a = bVar;
        this.b = uiText;
        this.c = str;
        this.d = aVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1o)) {
            return false;
        }
        w1o w1oVar = (w1o) obj;
        return this.a == w1oVar.a && this.b.equals(w1oVar.b) && this.c.equals(w1oVar.c) && this.d.equals(w1oVar.d) && this.e.equals(w1oVar.e);
    }

    public final int hashCode() {
        b bVar = this.a;
        return this.e.hashCode() + ((this.d.hashCode() + gmf0.a(yvf.a((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstantRacingRaceSelectionState(result=");
        sb.append(this.a);
        sb.append(", titleUiText=");
        sb.append(this.b);
        sb.append(", marketTitleText=");
        sb.append(this.c);
        sb.append(", outcomeType=");
        sb.append(this.d);
        sb.append(", oddsText=");
        return uf80.a(sb, this.e, ")");
    }
}
