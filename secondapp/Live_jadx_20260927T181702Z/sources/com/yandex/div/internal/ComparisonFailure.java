package com.yandex.div.internal;

import fw.b;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ComparisonFailure extends AssertionError {

    @l
    private static final Companion Companion = new Companion(null);
    private static final int MAX_CONTEXT_LENGTH = 20;
    private static final long serialVersionUID = 1;

    @l
    private final String actual;

    @l
    private final String expected;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class ComparisonCompactor {

        @l
        public static final Companion Companion = new Companion(null);

        @l
        private static final String DELTA_END = "]";

        @l
        private static final String DELTA_START = "[";

        @l
        private static final String ELLIPSIS = "...";

        @m
        private final String actual;
        private final int contextLength;

        @m
        private final String expected;
        private int prefix;
        private int suffix;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Companion {
            public /* synthetic */ Companion(x xVar) {
                this();
            }

            private Companion() {
            }
        }

        public ComparisonCompactor(int i10, @m String str, @m String str2) {
            this.contextLength = i10;
            this.expected = str;
            this.actual = str2;
        }

        private final boolean areStringsEqual() {
            return m0.g(this.expected, this.actual);
        }

        private final String compactString(String str) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b.f85384k);
            String strSubstring = str.substring(this.prefix, (str.length() - this.suffix) + 1);
            m0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            sb2.append(b.f85385l);
            String string = sb2.toString();
            if (this.prefix > 0) {
                string = computeCommonPrefix() + string;
            }
            if (this.suffix <= 0) {
                return string;
            }
            return string + computeCommonSuffix();
        }

        private final String computeCommonPrefix() {
            String str = this.prefix > this.contextLength ? ELLIPSIS : "";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            String str2 = this.expected;
            m0.m(str2);
            String strSubstring = str2.substring(Math.max(0, this.prefix - this.contextLength), this.prefix);
            m0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            return sb2.toString();
        }

        private final String computeCommonSuffix() {
            String str = this.expected;
            m0.m(str);
            int iMin = Math.min((str.length() - this.suffix) + 1 + this.contextLength, this.expected.length());
            String str2 = (this.expected.length() - this.suffix) + 1 < this.expected.length() - this.contextLength ? ELLIPSIS : "";
            StringBuilder sb2 = new StringBuilder();
            String str3 = this.expected;
            String strSubstring = str3.substring((str3.length() - this.suffix) + 1, iMin);
            m0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            sb2.append(str2);
            return sb2.toString();
        }

        private final void findCommonPrefix() {
            this.prefix = 0;
            String str = this.expected;
            m0.m(str);
            int length = str.length();
            String str2 = this.actual;
            m0.m(str2);
            int iMin = Math.min(length, str2.length());
            while (true) {
                int i10 = this.prefix;
                if (i10 >= iMin || this.expected.charAt(i10) != this.actual.charAt(this.prefix)) {
                    return;
                } else {
                    this.prefix++;
                }
            }
        }

        private final void findCommonSuffix() {
            String str = this.expected;
            m0.m(str);
            int length = str.length() - 1;
            String str2 = this.actual;
            m0.m(str2);
            int length2 = str2.length() - 1;
            while (true) {
                int i10 = this.prefix;
                if (length2 < i10 || length < i10 || this.expected.charAt(length) != this.actual.charAt(length2)) {
                    break;
                }
                length2--;
                length--;
            }
            this.suffix = this.expected.length() - length;
        }

        @l
        public final String compact(@m String str) {
            if (this.expected == null || this.actual == null || areStringsEqual()) {
                return Assert.format(str, this.expected, this.actual);
            }
            findCommonPrefix();
            findCommonSuffix();
            return Assert.format(str, compactString(this.expected), compactString(this.actual));
        }
    }

    public ComparisonFailure(@m String str, @l String str2, @l String str3) {
        super(str);
        this.expected = str2;
        this.actual = str3;
    }

    @l
    public final String getActual() {
        return this.actual;
    }

    @l
    public final String getExpected() {
        return this.expected;
    }

    @Override // java.lang.Throwable
    @l
    public String getMessage() {
        return new ComparisonCompactor(20, this.expected, this.actual).compact(super.getMessage());
    }
}
