package defpackage;

import com.sportybet.feature.worldcup.config.domain.model.WorldCupRelatedGame;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class l5k0 {
    public final String a;
    public final l0k0 b;

    public static final class a extends l5k0 {
        public final String c;
        public final l0k0 d;
        public final mfb0 e;
        public final RegularMarketRule f;
        public final uf00<dtg> g;
        public final int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, l0k0 l0k0Var, mfb0 mfb0Var, RegularMarketRule regularMarketRule, uf00<dtg> uf00Var, int i) {
            super(str, l0k0Var);
            str.getClass();
            l0k0Var.getClass();
            mfb0Var.getClass();
            regularMarketRule.getClass();
            uf00Var.getClass();
            this.c = str;
            this.d = l0k0Var;
            this.e = mfb0Var;
            this.f = regularMarketRule;
            this.g = uf00Var;
            this.h = i;
        }

        @Override // defpackage.l5k0
        public final l0k0 a() {
            return this.d;
        }

        @Override // defpackage.l5k0
        public final String b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.c, aVar.c) && this.d == aVar.d && Intrinsics.g(this.e, aVar.e) && Intrinsics.g(this.f, aVar.f) && Intrinsics.g(this.g, aVar.g) && this.h == aVar.h;
        }

        public final int hashCode() {
            return Integer.hashCode(this.h) + yvz.a(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31)) * 31, 31);
        }

        public final String toString() {
            return "EventList(titleRes=" + this.c + ", tab=" + this.d + ", sportRule=" + this.e + ", marketRule=" + this.f + ", events=" + this.g + ", noEventsTextRes=" + this.h + ")";
        }
    }

    public static final class b extends l5k0 {
        public final String c;
        public final l0k0 d;
        public final uf00<WorldCupRelatedGame> e;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(uf00 uf00Var) {
            l0k0 l0k0Var = l0k0.GAMES;
            l0k0Var.getClass();
            uf00Var.getClass();
            super("common_functions__games", l0k0Var);
            this.c = "common_functions__games";
            this.d = l0k0Var;
            this.e = uf00Var;
        }

        @Override // defpackage.l5k0
        public final l0k0 a() {
            return this.d;
        }

        @Override // defpackage.l5k0
        public final String b() {
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
            return Intrinsics.g(this.c, bVar.c) && this.d == bVar.d && Intrinsics.g(this.e, bVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "GameList(titleRes=" + this.c + ", tab=" + this.d + ", games=" + this.e + ")";
        }
    }

    public static final class c extends l5k0 {
        public final String c;
        public final l0k0 d;
        public final uf00<gz4> e;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(uf00 uf00Var) {
            l0k0 l0k0Var = l0k0.SPECIALS;
            l0k0Var.getClass();
            uf00Var.getClass();
            super("world_cup_tournament__specials_tab_name", l0k0Var);
            this.c = "world_cup_tournament__specials_tab_name";
            this.d = l0k0Var;
            this.e = uf00Var;
        }

        @Override // defpackage.l5k0
        public final l0k0 a() {
            return this.d;
        }

        @Override // defpackage.l5k0
        public final String b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.c, cVar.c) && this.d == cVar.d && Intrinsics.g(this.e, cVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "SpecialsList(titleRes=" + this.c + ", tab=" + this.d + ", bookingCodes=" + this.e + ")";
        }
    }

    public l5k0(String str, l0k0 l0k0Var) {
        str.getClass();
        l0k0Var.getClass();
        this.a = str;
        this.b = l0k0Var;
    }

    public l0k0 a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }
}
