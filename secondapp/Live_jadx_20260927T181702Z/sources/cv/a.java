package cv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum a {
    UNASSIGNED(0, "Cn"),
    UPPERCASE_LETTER(1, "Lu"),
    LOWERCASE_LETTER(2, "Ll"),
    TITLECASE_LETTER(3, "Lt"),
    MODIFIER_LETTER(4, "Lm"),
    OTHER_LETTER(5, "Lo"),
    NON_SPACING_MARK(6, "Mn"),
    ENCLOSING_MARK(7, "Me"),
    COMBINING_SPACING_MARK(8, "Mc"),
    DECIMAL_DIGIT_NUMBER(9, "Nd"),
    LETTER_NUMBER(10, "Nl"),
    OTHER_NUMBER(11, "No"),
    SPACE_SEPARATOR(12, "Zs"),
    LINE_SEPARATOR(13, "Zl"),
    PARAGRAPH_SEPARATOR(14, "Zp"),
    CONTROL(15, "Cc"),
    FORMAT(16, "Cf"),
    PRIVATE_USE(18, "Co"),
    SURROGATE(19, "Cs"),
    DASH_PUNCTUATION(20, "Pd"),
    START_PUNCTUATION(21, "Ps"),
    END_PUNCTUATION(22, "Pe"),
    CONNECTOR_PUNCTUATION(23, "Pc"),
    OTHER_PUNCTUATION(24, "Po"),
    MATH_SYMBOL(25, "Sm"),
    CURRENCY_SYMBOL(26, "Sc"),
    MODIFIER_SYMBOL(27, "Sk"),
    OTHER_SYMBOL(28, "So"),
    INITIAL_QUOTE_PUNCTUATION(29, "Pi"),
    FINAL_QUOTE_PUNCTUATION(30, "Pf");

    public static final /* synthetic */ sr.a J = sr.c.c(d());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final C0753a f77149d = new C0753a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final String f77173c;

    /* JADX INFO: renamed from: cv.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0753a {
        public /* synthetic */ C0753a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        public final a a(int i10) {
            if (i10 >= 0 && i10 < 17) {
                return a.h().get(i10);
            }
            if (18 <= i10 && i10 < 31) {
                return a.h().get(i10 - 1);
            }
            throw new IllegalArgumentException("Category #" + i10 + " is not defined.");
        }

        public C0753a() {
        }
    }

    a(int i10, String str) {
        this.f77172b = i10;
        this.f77173c = str;
    }

    @oy.l
    public static sr.a<a> h() {
        return J;
    }

    public final boolean e(char c10) {
        return Character.getType(c10) == this.f77172b;
    }

    @oy.l
    public final String g() {
        return this.f77173c;
    }

    public final int i() {
        return this.f77172b;
    }
}
