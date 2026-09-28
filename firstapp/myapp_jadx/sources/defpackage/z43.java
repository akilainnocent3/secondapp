package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.twilio.voice.VoiceURLConnection;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface z43 {

    public static final class a implements z43 {
        public final boolean A;
        public final boolean B;
        public final boolean C;
        public final boolean D;
        public final boolean E;
        public final UiText F;
        public final boolean G;
        public final UiText H;
        public final int I;
        public final String J;
        public final UiText K;
        public final boolean L;
        public final boolean M;
        public final boolean N;
        public final boolean O;
        public final int a;
        public final Selection b;
        public final int c;
        public final boolean d;
        public final int e;
        public final EnumC1374a f;
        public final boolean g;
        public final String h;
        public final UiText i;
        public final boolean j;
        public final UiText k;
        public final UiText l;
        public final UiText m;
        public final int n;
        public final boolean o;
        public final boolean p;
        public final boolean q;
        public final yuy r;
        public final okf s;
        public final apx t;
        public final boolean u;
        public final UiText v;
        public final b w;
        public final UiText x;
        public final boolean y;
        public final UiText z;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: z43$a$a, reason: collision with other inner class name */
        public static final class EnumC1374a {
            public static final EnumC1374a a;
            public static final EnumC1374a b;
            public static final EnumC1374a c;
            public static final /* synthetic */ EnumC1374a[] d;

            static {
                EnumC1374a enumC1374a = new EnumC1374a(VoiceURLConnection.METHOD_TYPE_DELETE, 0);
                a = enumC1374a;
                EnumC1374a enumC1374a2 = new EnumC1374a("EDIT_BET_SETTLED", 1);
                b = enumC1374a2;
                EnumC1374a enumC1374a3 = new EnumC1374a("INVISIBLE", 2);
                c = enumC1374a3;
                d = new EnumC1374a[]{enumC1374a, enumC1374a2, enumC1374a3};
            }

            public EnumC1374a() {
                throw null;
            }

            public static EnumC1374a valueOf(String str) {
                return (EnumC1374a) Enum.valueOf(EnumC1374a.class, str);
            }

            public static EnumC1374a[] values() {
                return (EnumC1374a[]) d.clone();
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
                b bVar = new b("UPWARD", 0);
                a = bVar;
                b bVar2 = new b("DOWNWARD", 1);
                b = bVar2;
                b bVar3 = new b("NONE", 2);
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

        public a(int i, Selection selection, int i2, boolean z, int i3, EnumC1374a enumC1374a, String str, UiText uiText, boolean z2, StringUiText stringUiText, UiText uiText2, StringUiText stringUiText2, int i4, boolean z3, boolean z4, boolean z5, yuy yuyVar, okf okfVar, apx apxVar, boolean z6, StringUiText stringUiText3, b bVar, StringUiText stringUiText4, boolean z7, StringUiText stringUiText5, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, UiText uiText3, boolean z13, ResourceUiText resourceUiText, int i5, String str2, UiText uiText4, boolean z14, boolean z15, boolean z16, boolean z17) {
            stringUiText.getClass();
            uiText2.getClass();
            yuyVar.getClass();
            okfVar.getClass();
            apxVar.getClass();
            stringUiText3.getClass();
            stringUiText4.getClass();
            stringUiText5.getClass();
            uiText3.getClass();
            uiText4.getClass();
            this.a = i;
            this.b = selection;
            this.c = i2;
            this.d = z;
            this.e = i3;
            this.f = enumC1374a;
            this.g = true;
            this.h = str;
            this.i = uiText;
            this.j = z2;
            this.k = stringUiText;
            this.l = uiText2;
            this.m = stringUiText2;
            this.n = i4;
            this.o = z3;
            this.p = z4;
            this.q = z5;
            this.r = yuyVar;
            this.s = okfVar;
            this.t = apxVar;
            this.u = z6;
            this.v = stringUiText3;
            this.w = bVar;
            this.x = stringUiText4;
            this.y = z7;
            this.z = stringUiText5;
            this.A = z8;
            this.B = z9;
            this.C = z10;
            this.D = z11;
            this.E = z12;
            this.F = uiText3;
            this.G = z13;
            this.H = resourceUiText;
            this.I = i5;
            this.J = str2;
            this.K = uiText4;
            this.L = z14;
            this.M = z15;
            this.N = z16;
            this.O = z17;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && Intrinsics.g(this.h, aVar.h) && Intrinsics.g(this.i, aVar.i) && this.j == aVar.j && Intrinsics.g(this.k, aVar.k) && Intrinsics.g(this.l, aVar.l) && Intrinsics.g(this.m, aVar.m) && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && this.q == aVar.q && Intrinsics.g(this.r, aVar.r) && Intrinsics.g(this.s, aVar.s) && Intrinsics.g(this.t, aVar.t) && this.u == aVar.u && Intrinsics.g(this.v, aVar.v) && this.w == aVar.w && Intrinsics.g(this.x, aVar.x) && this.y == aVar.y && Intrinsics.g(this.z, aVar.z) && this.A == aVar.A && this.B == aVar.B && this.C == aVar.C && this.D == aVar.D && this.E == aVar.E && Intrinsics.g(this.F, aVar.F) && this.G == aVar.G && Intrinsics.g(this.H, aVar.H) && this.I == aVar.I && Intrinsics.g(this.J, aVar.J) && Intrinsics.g(this.K, aVar.K) && this.L == aVar.L && this.M == aVar.M && this.N == aVar.N && this.O == aVar.O;
        }

        @Override // defpackage.z43
        public final Object getId() {
            return this.b;
        }

        public final int hashCode() {
            int iA = mtg0.a((this.f.hashCode() + gpp.a(this.e, mtg0.a(gpp.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31), 31, this.d), 31)) * 31, 31, this.g);
            String str = this.h;
            int iA2 = gpp.a(this.I, yvf.a(mtg0.a(yvf.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(yvf.a(mtg0.a(yvf.a((this.w.hashCode() + yvf.a(mtg0.a((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + mtg0.a(mtg0.a(mtg0.a(gpp.a(this.n, yvf.a(yvf.a(yvf.a(mtg0.a(yvf.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31), 31, this.o), 31, this.p), 31, this.q)) * 31)) * 31)) * 31, 31, this.u), 31, this.v)) * 31, 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G), 31, this.H), 31);
            String str2 = this.J;
            return Boolean.hashCode(this.O) + mtg0.a(mtg0.a(mtg0.a(yvf.a((iA2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.K), 31, this.L), 31, this.M), 31, this.N);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BetItemViewState(index=");
            sb.append(this.a);
            sb.append(", selection=");
            sb.append(this.b);
            sb.append(", backgroundColorResId=");
            sb.append(this.c);
            sb.append(", isEditBetDeleting=");
            sb.append(this.d);
            sb.append(", mutexIndicatorColorInt=");
            sb.append(this.e);
            sb.append(", leadingIconType=");
            sb.append(this.f);
            sb.append(", isLeadingIconVisible=");
            mng.a(", sportIconUrl=", this.h, ", outcomeDescUiText=", sb, this.g);
            sb.append(this.i);
            sb.append(", isLiveLabelVisible=");
            sb.append(this.j);
            sb.append(", gameIdUiText=");
            vh8.a(sb, this.k, ", teamInfoUiText=", this.l, ", marketDescUiText=");
            sb.append(this.m);
            sb.append(", marketDescMaxLine=");
            sb.append(this.n);
            sb.append(", isBoreDrawIconVisible=");
            nng.a(", isBoostIconVisible=", ", isSettleDelayHintVisible=", sb, this.o, this.p);
            sb.append(this.q);
            sb.append(", oneTwoUpViewState=");
            sb.append(this.r);
            sb.append(", earlyPayoutViewState=");
            sb.append(this.s);
            sb.append(", neverDownViewState=");
            sb.append(this.t);
            sb.append(", isOddsVisible=");
            sb.append(this.u);
            sb.append(", oddsUiText=");
            sb.append(this.v);
            sb.append(", oddsChangedIconState=");
            sb.append(this.w);
            sb.append(", initOddsUiText=");
            sb.append(this.x);
            sb.append(", isNeverDownBoostIconVisible=");
            sb.append(this.y);
            sb.append(", boostedOddsUiText=");
            sb.append(this.z);
            sb.append(", isBoosted=");
            nng.a(", shouldPresentBoostedAnimation=", ", isFlashBoost=", sb, this.A, this.B);
            nng.a(", isBankerIconVisible=", ", isBankerChecked=", sb, this.C, this.D);
            sb.append(this.E);
            sb.append(", statusUiText=");
            sb.append(this.F);
            sb.append(", isSingleStakeEditTextVisible=");
            sb.append(this.G);
            sb.append(", singleStakeEditTextHintUiText=");
            sb.append(this.H);
            sb.append(", singleStakeEditTextInputMaxLength=");
            f78.b(this.I, ", singleStakeEditTextValue=", this.J, ", singleStakeEditTextAdditionalMsg=", sb);
            sb.append(this.K);
            sb.append(", isGoToDepositVisible=");
            sb.append(this.L);
            sb.append(", isVirtualKeyboardShown=");
            nng.a(", isUndoVisible=", ", isJoker=", sb, this.M, this.N);
            return mq0.a(sb, this.O, ")");
        }
    }

    public static final class b implements z43 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // defpackage.z43
        public final Object getId() {
            String string = UUID.randomUUID().toString();
            string.getClass();
            return string;
        }

        public final int hashCode() {
            return 91891881;
        }

        public final String toString() {
            return "BetMutexNoteViewState";
        }
    }

    public static final class c implements z43 {
        public final int a;
        public final ln7 b;
        public final int c;
        public final StringUiText d;
        public final UiText e;
        public final UiText f;
        public final UiText g;
        public final boolean h;
        public final boolean i;
        public final boolean j;

        public c(int i, ln7 ln7Var, int i2, StringUiText stringUiText, UiText uiText, StringUiText stringUiText2, UiText uiText2, boolean z, boolean z2, boolean z3) {
            uiText.getClass();
            stringUiText2.getClass();
            uiText2.getClass();
            this.a = i;
            this.b = ln7Var;
            this.c = i2;
            this.d = stringUiText;
            this.e = uiText;
            this.f = stringUiText2;
            this.g = uiText2;
            this.h = z;
            this.i = z2;
            this.j = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b.equals(cVar.b) && this.c == cVar.c && this.d.equals(cVar.d) && Intrinsics.g(this.e, cVar.e) && Intrinsics.g(this.f, cVar.f) && Intrinsics.g(this.g, cVar.g) && this.h == cVar.h && this.i == cVar.i && this.j == cVar.j;
        }

        @Override // defpackage.z43
        public final Object getId() {
            return this.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.j) + mtg0.a(mtg0.a(yvf.a(yvf.a(yvf.a((this.d.a.hashCode() + gpp.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BetSystemItemViewState(index=");
            sb.append(this.a);
            sb.append(", chuan=");
            sb.append(this.b);
            sb.append(", quickStakeToolStatus=");
            sb.append(this.c);
            sb.append(", foldsNameUiText=");
            sb.append(this.d);
            sb.append(", combinationCountUiText=");
            vh8.a(sb, this.e, ", stakeValueUiText=", this.f, ", stakeMessageUiText=");
            sb.append(this.g);
            sb.append(", isMessageWarning=");
            sb.append(this.h);
            sb.append(", isVirtualKeyboardShown=");
            return lng.a(", isGoToDepositVisible=", ")", sb, this.i, this.j);
        }
    }

    Object getId();
}
