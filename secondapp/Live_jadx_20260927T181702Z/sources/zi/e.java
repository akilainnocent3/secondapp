package zi;

import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(emulated = true)
@zi.k
public abstract class e implements m0<Character> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f161677b = 65536;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends x {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f161678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e f161679e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(final e this$0, e original, final String val$description) {
            super(original);
            this.f161678d = val$description;
            this.f161679e = this$0;
        }

        @Override // zi.e.w, zi.e
        public String toString() {
            return this.f161678d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a0 extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f161680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final char[] f161681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final char[] f161682e;

        public a0(String description, char[] rangeStarts, char[] rangeEnds) {
            this.f161680c = description;
            this.f161681d = rangeStarts;
            this.f161682e = rangeEnds;
            l0.d(rangeStarts.length == rangeEnds.length);
            int i10 = 0;
            while (i10 < rangeStarts.length) {
                l0.d(rangeStarts[i10] <= rangeEnds[i10]);
                int i11 = i10 + 1;
                if (i11 < rangeStarts.length) {
                    l0.d(rangeEnds[i10] < rangeStarts[i11]);
                }
                i10 = i11;
            }
        }

        @Override // zi.e
        public boolean B(char c10) {
            int iBinarySearch = Arrays.binarySearch(this.f161681d, c10);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i10 = (~iBinarySearch) - 1;
            return i10 >= 0 && c10 <= this.f161682e[i10];
        }

        @Override // zi.e, zi.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // zi.e
        public String toString() {
            return this.f161680c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f161683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e f161684d;

        public b(e a10, e b10) {
            this.f161683c = (e) l0.E(a10);
            this.f161684d = (e) l0.E(b10);
        }

        @Override // zi.e
        public boolean B(char c10) {
            return this.f161683c.B(c10) && this.f161684d.B(c10);
        }

        @Override // zi.e
        @yi.c
        public void Q(BitSet table) {
            BitSet bitSet = new BitSet();
            this.f161683c.Q(bitSet);
            BitSet bitSet2 = new BitSet();
            this.f161684d.Q(bitSet2);
            bitSet.and(bitSet2);
            table.or(bitSet);
        }

        @Override // zi.e, zi.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // zi.e
        public String toString() {
            return "CharMatcher.and(" + this.f161683c + ", " + this.f161684d + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b0 extends a0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f161685f = new b0();

        public b0() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f161686d = new c();

        public c() {
            super("CharMatcher.any()");
        }

        @Override // zi.e
        public int A(CharSequence sequence) {
            return sequence.length() - 1;
        }

        @Override // zi.e
        public boolean B(char c10) {
            return true;
        }

        @Override // zi.e
        public boolean C(CharSequence sequence) {
            l0.E(sequence);
            return true;
        }

        @Override // zi.e
        public boolean E(CharSequence sequence) {
            return sequence.length() == 0;
        }

        @Override // zi.e.i, zi.e
        public e F() {
            return e.G();
        }

        @Override // zi.e
        public e I(e other) {
            l0.E(other);
            return this;
        }

        @Override // zi.e
        public String M(CharSequence sequence) {
            l0.E(sequence);
            return "";
        }

        @Override // zi.e
        public String N(CharSequence sequence, char replacement) {
            char[] cArr = new char[sequence.length()];
            Arrays.fill(cArr, replacement);
            return new String(cArr);
        }

        @Override // zi.e
        public String O(CharSequence sequence, CharSequence replacement) {
            StringBuilder sb2 = new StringBuilder(sequence.length() * replacement.length());
            for (int i10 = 0; i10 < sequence.length(); i10++) {
                sb2.append(replacement);
            }
            return sb2.toString();
        }

        @Override // zi.e
        public String U(CharSequence sequence) {
            l0.E(sequence);
            return "";
        }

        @Override // zi.e
        public e b(e other) {
            return (e) l0.E(other);
        }

        @Override // zi.e
        public String h(CharSequence sequence, char replacement) {
            return sequence.length() == 0 ? "" : String.valueOf(replacement);
        }

        @Override // zi.e
        public int i(CharSequence sequence) {
            return sequence.length();
        }

        @Override // zi.e
        public int n(CharSequence sequence) {
            return sequence.length() == 0 ? -1 : 0;
        }

        @Override // zi.e
        public int o(CharSequence sequence, int start) {
            int length = sequence.length();
            l0.d0(start, length);
            if (start == length) {
                return -1;
            }
            return start;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.e
    public static final class c0 extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f161687d = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f161688e = 1682554634;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f161689f = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final e f161690g = new c0();

        public c0() {
            super("CharMatcher.whitespace()");
        }

        @Override // zi.e
        public boolean B(char c10) {
            return f161687d.charAt((f161688e * c10) >>> f161689f) == c10;
        }

        @Override // zi.e
        @yi.c
        public void Q(BitSet table) {
            for (int i10 = 0; i10 < 32; i10++) {
                table.set(f161687d.charAt(i10));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final char[] f161691c;

        public d(CharSequence chars) {
            char[] charArray = chars.toString().toCharArray();
            this.f161691c = charArray;
            Arrays.sort(charArray);
        }

        @Override // zi.e
        public boolean B(char c10) {
            return Arrays.binarySearch(this.f161691c, c10) >= 0;
        }

        @Override // zi.e
        @yi.c
        public void Q(BitSet table) {
            for (char c10 : this.f161691c) {
                table.set(c10);
            }
        }

        @Override // zi.e, zi.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // zi.e
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c10 : this.f161691c) {
                sb2.append(e.R(c10));
            }
            sb2.append("\")");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: zi.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1582e extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f161692d = new C1582e();

        public C1582e() {
            super("CharMatcher.ascii()");
        }

        @Override // zi.e
        public boolean B(char c10) {
            return c10 <= 127;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.c
    public static final class f extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final BitSet f161693d;

        public /* synthetic */ f(BitSet bitSet, String str, a aVar) {
            this(bitSet, str);
        }

        @Override // zi.e
        public boolean B(char c10) {
            return this.f161693d.get(c10);
        }

        @Override // zi.e
        public void Q(BitSet bitSet) {
            bitSet.or(this.f161693d);
        }

        public f(BitSet table, String description) {
            super(description);
            this.f161693d = table.length() + 64 < table.size() ? (BitSet) table.clone() : table;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f161694c = new g();

        @Override // zi.e
        public boolean B(char c10) {
            if (c10 != ' ' && c10 != 133 && c10 != 5760) {
                if (c10 != 8199) {
                    if (c10 != 8287 && c10 != 12288 && c10 != 8232 && c10 != 8233) {
                        switch (c10) {
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                                break;
                            default:
                                if (c10 >= 8192 && c10 <= 8202) {
                                    return true;
                                }
                                break;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // zi.e, zi.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // zi.e
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h extends a0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f161695f = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final e f161696g = new h();

        public h() {
            super("CharMatcher.digit()", Z(), Y());
        }

        public static char[] Y() {
            char[] cArr = new char[37];
            for (int i10 = 0; i10 < 37; i10++) {
                cArr[i10] = (char) (f161695f.charAt(i10) + '\t');
            }
            return cArr;
        }

        public static char[] Z() {
            return f161695f.toCharArray();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class j extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m0<? super Character> f161697c;

        public j(m0<? super Character> predicate) {
            this.f161697c = (m0) l0.E(predicate);
        }

        @Override // zi.e
        public boolean B(char c10) {
            return this.f161697c.apply(Character.valueOf(c10));
        }

        @Override // zi.e, zi.m0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean apply(Character character) {
            return this.f161697c.apply(l0.E(character));
        }

        @Override // zi.e
        public String toString() {
            return "CharMatcher.forPredicate(" + this.f161697c + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class k extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final char f161698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final char f161699d;

        public k(char startInclusive, char endInclusive) {
            l0.d(endInclusive >= startInclusive);
            this.f161698c = startInclusive;
            this.f161699d = endInclusive;
        }

        @Override // zi.e
        public boolean B(char c10) {
            return this.f161698c <= c10 && c10 <= this.f161699d;
        }

        @Override // zi.e
        @yi.c
        public void Q(BitSet table) {
            table.set(this.f161698c, this.f161699d + 1);
        }

        @Override // zi.e
        public String toString() {
            return "CharMatcher.inRange('" + e.R(this.f161698c) + "', '" + e.R(this.f161699d) + "')";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class l extends a0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f161700f = "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f161701g = "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final e f161702h = new l();

        public l() {
            super("CharMatcher.invisible()", f161700f.toCharArray(), f161701g.toCharArray());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class m extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final char f161703c;

        public m(char match) {
            this.f161703c = match;
        }

        @Override // zi.e
        public boolean B(char c10) {
            return c10 == this.f161703c;
        }

        @Override // zi.e.i, zi.e
        public e F() {
            return e.s(this.f161703c);
        }

        @Override // zi.e
        public e I(e other) {
            return other.B(this.f161703c) ? other : super.I(other);
        }

        @Override // zi.e
        public String N(CharSequence sequence, char replacement) {
            return sequence.toString().replace(this.f161703c, replacement);
        }

        @Override // zi.e
        @yi.c
        public void Q(BitSet table) {
            table.set(this.f161703c);
        }

        @Override // zi.e
        public e b(e other) {
            return other.B(this.f161703c) ? this : e.G();
        }

        @Override // zi.e
        public String toString() {
            return "CharMatcher.is('" + e.R(this.f161703c) + "')";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class n extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final char f161704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final char f161705d;

        public n(char match1, char match2) {
            this.f161704c = match1;
            this.f161705d = match2;
        }

        @Override // zi.e
        public boolean B(char c10) {
            return c10 == this.f161704c || c10 == this.f161705d;
        }

        @Override // zi.e
        @yi.c
        public void Q(BitSet table) {
            table.set(this.f161704c);
            table.set(this.f161705d);
        }

        @Override // zi.e
        public String toString() {
            return "CharMatcher.anyOf(\"" + e.R(this.f161704c) + e.R(this.f161705d) + "\")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class o extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final char f161706c;

        public o(char match) {
            this.f161706c = match;
        }

        @Override // zi.e
        public boolean B(char c10) {
            return c10 != this.f161706c;
        }

        @Override // zi.e.i, zi.e
        public e F() {
            return e.q(this.f161706c);
        }

        @Override // zi.e
        public e I(e other) {
            return other.B(this.f161706c) ? e.c() : this;
        }

        @Override // zi.e
        @yi.c
        public void Q(BitSet table) {
            table.set(0, this.f161706c);
            table.set(this.f161706c + 1, 65536);
        }

        @Override // zi.e
        public e b(e other) {
            return other.B(this.f161706c) ? super.b(other) : other;
        }

        @Override // zi.e
        public String toString() {
            return "CharMatcher.isNot('" + e.R(this.f161706c) + "')";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class p extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f161707c = new p();

        @Override // zi.e
        public boolean B(char c10) {
            return Character.isDigit(c10);
        }

        @Override // zi.e, zi.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // zi.e
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class q extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f161708d = new q();

        public q() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // zi.e
        public boolean B(char c10) {
            if (c10 > 31) {
                return c10 >= 127 && c10 <= 159;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class r extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f161709c = new r();

        @Override // zi.e
        public boolean B(char c10) {
            return Character.isLetter(c10);
        }

        @Override // zi.e, zi.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // zi.e
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class s extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f161710c = new s();

        @Override // zi.e
        public boolean B(char c10) {
            return Character.isLetterOrDigit(c10);
        }

        @Override // zi.e, zi.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // zi.e
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class t extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f161711c = new t();

        @Override // zi.e
        public boolean B(char c10) {
            return Character.isLowerCase(c10);
        }

        @Override // zi.e, zi.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // zi.e
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class u extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f161712c = new u();

        @Override // zi.e
        public boolean B(char c10) {
            return Character.isUpperCase(c10);
        }

        @Override // zi.e, zi.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // zi.e
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class v extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f161713c;

        public v(String description) {
            this.f161713c = (String) l0.E(description);
        }

        @Override // zi.e
        public final String toString() {
            return this.f161713c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class w extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f161714c;

        public w(e original) {
            this.f161714c = (e) l0.E(original);
        }

        @Override // zi.e
        public boolean B(char c10) {
            return !this.f161714c.B(c10);
        }

        @Override // zi.e
        public boolean C(CharSequence sequence) {
            return this.f161714c.E(sequence);
        }

        @Override // zi.e
        public boolean E(CharSequence sequence) {
            return this.f161714c.C(sequence);
        }

        @Override // zi.e
        public e F() {
            return this.f161714c;
        }

        @Override // zi.e
        @yi.c
        public void Q(BitSet table) {
            BitSet bitSet = new BitSet();
            this.f161714c.Q(bitSet);
            bitSet.flip(0, 65536);
            table.or(bitSet);
        }

        @Override // zi.e, zi.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // zi.e
        public int i(CharSequence sequence) {
            return sequence.length() - this.f161714c.i(sequence);
        }

        @Override // zi.e
        public String toString() {
            return this.f161714c + ".negate()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class y extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f161715d = new y();

        public y() {
            super("CharMatcher.none()");
        }

        @Override // zi.e
        public int A(CharSequence sequence) {
            l0.E(sequence);
            return -1;
        }

        @Override // zi.e
        public boolean B(char c10) {
            return false;
        }

        @Override // zi.e
        public boolean C(CharSequence sequence) {
            return sequence.length() == 0;
        }

        @Override // zi.e
        public boolean E(CharSequence sequence) {
            l0.E(sequence);
            return true;
        }

        @Override // zi.e.i, zi.e
        public e F() {
            return e.c();
        }

        @Override // zi.e
        public e I(e other) {
            return (e) l0.E(other);
        }

        @Override // zi.e
        public String M(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // zi.e
        public String N(CharSequence sequence, char replacement) {
            return sequence.toString();
        }

        @Override // zi.e
        public String O(CharSequence sequence, CharSequence replacement) {
            l0.E(replacement);
            return sequence.toString();
        }

        @Override // zi.e
        public String U(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // zi.e
        public String V(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // zi.e
        public String W(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // zi.e
        public e b(e other) {
            l0.E(other);
            return this;
        }

        @Override // zi.e
        public String h(CharSequence sequence, char replacement) {
            return sequence.toString();
        }

        @Override // zi.e
        public int i(CharSequence sequence) {
            l0.E(sequence);
            return 0;
        }

        @Override // zi.e
        public int n(CharSequence sequence) {
            l0.E(sequence);
            return -1;
        }

        @Override // zi.e
        public int o(CharSequence sequence, int start) {
            l0.d0(start, sequence.length());
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class z extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f161716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e f161717d;

        public z(e a10, e b10) {
            this.f161716c = (e) l0.E(a10);
            this.f161717d = (e) l0.E(b10);
        }

        @Override // zi.e
        public boolean B(char c10) {
            return this.f161716c.B(c10) || this.f161717d.B(c10);
        }

        @Override // zi.e
        @yi.c
        public void Q(BitSet table) {
            this.f161716c.Q(table);
            this.f161717d.Q(table);
        }

        @Override // zi.e, zi.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // zi.e
        public String toString() {
            return "CharMatcher.or(" + this.f161716c + ", " + this.f161717d + gi.j.f86771d;
        }
    }

    public static e G() {
        return y.f161715d;
    }

    public static e H(CharSequence sequence) {
        return d(sequence).F();
    }

    @yi.c
    public static e L(int totalCharacters, BitSet table, String description) {
        if (totalCharacters == 0) {
            return G();
        }
        if (totalCharacters == 1) {
            return q((char) table.nextSetBit(0));
        }
        if (totalCharacters != 2) {
            return t(totalCharacters, table.length()) ? p0.a0(table, description) : new f(table, description, null);
        }
        char cNextSetBit = (char) table.nextSetBit(0);
        return r(cNextSetBit, (char) table.nextSetBit(cNextSetBit + 1));
    }

    public static String R(char c10) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = fw.b.f85389p;
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static e S() {
        return b0.f161685f;
    }

    public static e X() {
        return c0.f161690g;
    }

    public static e c() {
        return c.f161686d;
    }

    public static e d(final CharSequence sequence) {
        int length = sequence.length();
        if (length == 0) {
            return G();
        }
        if (length != 1) {
            return length != 2 ? new d(sequence) : r(sequence.charAt(0), sequence.charAt(1));
        }
        return q(sequence.charAt(0));
    }

    public static e f() {
        return C1582e.f161692d;
    }

    public static e g() {
        return g.f161694c;
    }

    @Deprecated
    public static e j() {
        return h.f161696g;
    }

    public static e l(final m0<? super Character> predicate) {
        return predicate instanceof e ? (e) predicate : new j(predicate);
    }

    public static e m(final char startInclusive, final char endInclusive) {
        return new k(startInclusive, endInclusive);
    }

    @Deprecated
    public static e p() {
        return l.f161702h;
    }

    public static e q(final char match) {
        return new m(match);
    }

    public static n r(char c10, char c11) {
        return new n(c10, c11);
    }

    public static e s(final char match) {
        return new o(match);
    }

    @yi.c
    public static boolean t(int totalCharacters, int tableLength) {
        return totalCharacters <= 1023 && tableLength > totalCharacters * 64;
    }

    @Deprecated
    public static e u() {
        return p.f161707c;
    }

    public static e v() {
        return q.f161708d;
    }

    @Deprecated
    public static e w() {
        return r.f161709c;
    }

    @Deprecated
    public static e x() {
        return s.f161710c;
    }

    @Deprecated
    public static e y() {
        return t.f161711c;
    }

    @Deprecated
    public static e z() {
        return u.f161712c;
    }

    public int A(CharSequence sequence) {
        for (int length = sequence.length() - 1; length >= 0; length--) {
            if (B(sequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean B(char c10);

    public boolean C(CharSequence sequence) {
        for (int length = sequence.length() - 1; length >= 0; length--) {
            if (!B(sequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean D(CharSequence sequence) {
        return !E(sequence);
    }

    public boolean E(CharSequence sequence) {
        return n(sequence) == -1;
    }

    public e F() {
        return new w(this);
    }

    public e I(e other) {
        return new z(this, other);
    }

    public e J() {
        return k0.h(this);
    }

    @yi.c
    public e K() {
        String strSubstring;
        BitSet bitSet = new BitSet();
        Q(bitSet);
        int iCardinality = bitSet.cardinality();
        if (iCardinality * 2 <= 65536) {
            return L(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i10 = 65536 - iCardinality;
        String string = toString();
        if (string.endsWith(".negate()")) {
            strSubstring = string.substring(0, string.length() - 9);
        } else {
            strSubstring = string + ".negate()";
        }
        return new a(this, L(i10, bitSet, strSubstring), string);
    }

    public String M(CharSequence sequence) {
        String string = sequence.toString();
        int iN = n(string);
        if (iN == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i10 = 1;
        while (true) {
            iN++;
            while (iN != charArray.length) {
                if (B(charArray[iN])) {
                    i10++;
                } else {
                    charArray[iN - i10] = charArray[iN];
                    iN++;
                }
            }
            return new String(charArray, 0, iN - i10);
        }
    }

    public String N(CharSequence sequence, char replacement) {
        String string = sequence.toString();
        int iN = n(string);
        if (iN == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iN] = replacement;
        while (true) {
            iN++;
            if (iN >= charArray.length) {
                return new String(charArray);
            }
            if (B(charArray[iN])) {
                charArray[iN] = replacement;
            }
        }
    }

    public String O(CharSequence sequence, CharSequence replacement) {
        int length = replacement.length();
        if (length == 0) {
            return M(sequence);
        }
        int i10 = 0;
        if (length == 1) {
            return N(sequence, replacement.charAt(0));
        }
        String string = sequence.toString();
        int iN = n(string);
        if (iN == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb2 = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb2.append((CharSequence) string, i10, iN);
            sb2.append(replacement);
            i10 = iN + 1;
            iN = o(string, i10);
        } while (iN != -1);
        sb2.append((CharSequence) string, i10, length2);
        return sb2.toString();
    }

    public String P(CharSequence sequence) {
        return F().M(sequence);
    }

    @yi.c
    public void Q(BitSet table) {
        for (int i10 = 65535; i10 >= 0; i10--) {
            if (B((char) i10)) {
                table.set(i10);
            }
        }
    }

    public String T(CharSequence sequence, char replacement) {
        int length = sequence.length();
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < length && B(sequence.charAt(i11))) {
            i11++;
        }
        int i12 = i10;
        while (i12 > i11 && B(sequence.charAt(i12))) {
            i12--;
        }
        if (i11 == 0 && i12 == i10) {
            return h(sequence, replacement);
        }
        int i13 = i12 + 1;
        return k(sequence, i11, i13, replacement, new StringBuilder(i13 - i11), false);
    }

    public String U(CharSequence sequence) {
        int length = sequence.length();
        int i10 = 0;
        while (i10 < length && B(sequence.charAt(i10))) {
            i10++;
        }
        int i11 = length - 1;
        while (i11 > i10 && B(sequence.charAt(i11))) {
            i11--;
        }
        return sequence.subSequence(i10, i11 + 1).toString();
    }

    public String V(CharSequence sequence) {
        int length = sequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!B(sequence.charAt(i10))) {
                return sequence.subSequence(i10, length).toString();
            }
        }
        return "";
    }

    public String W(CharSequence sequence) {
        for (int length = sequence.length() - 1; length >= 0; length--) {
            if (!B(sequence.charAt(length))) {
                return sequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    public e b(e other) {
        return new b(this, other);
    }

    @Override // zi.m0
    @Deprecated
    /* JADX INFO: renamed from: e */
    public boolean apply(Character character) {
        return B(character.charValue());
    }

    public String h(CharSequence sequence, char replacement) {
        int length = sequence.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = sequence.charAt(i10);
            if (B(cCharAt)) {
                if (cCharAt != replacement || (i10 != length - 1 && B(sequence.charAt(i10 + 1)))) {
                    StringBuilder sb2 = new StringBuilder(length);
                    sb2.append(sequence, 0, i10);
                    sb2.append(replacement);
                    return k(sequence, i10 + 1, length, replacement, sb2, true);
                }
                i10++;
            }
            i10++;
            replacement = replacement;
        }
        return sequence.toString();
    }

    public int i(CharSequence sequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < sequence.length(); i11++) {
            if (B(sequence.charAt(i11))) {
                i10++;
            }
        }
        return i10;
    }

    public final String k(CharSequence sequence, int start, int end, char replacement, StringBuilder builder, boolean inMatchingGroup) {
        while (start < end) {
            char cCharAt = sequence.charAt(start);
            if (!B(cCharAt)) {
                builder.append(cCharAt);
                inMatchingGroup = false;
            } else if (!inMatchingGroup) {
                builder.append(replacement);
                inMatchingGroup = true;
            }
            start++;
        }
        return builder.toString();
    }

    public int n(CharSequence sequence) {
        return o(sequence, 0);
    }

    public int o(CharSequence sequence, int start) {
        int length = sequence.length();
        l0.d0(start, length);
        while (start < length) {
            if (B(sequence.charAt(start))) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public String toString() {
        return super.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class i extends e {
        @Override // zi.e
        public e F() {
            return new x(this);
        }

        @Override // zi.e, zi.m0
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // zi.e
        public final e J() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class x extends w {
        public x(e original) {
            super(original);
        }

        @Override // zi.e
        public final e J() {
            return this;
        }
    }
}
