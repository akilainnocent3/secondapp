package com.yandex.div.evaluable.internal;

import androidx.media3.session.fe;
import com.google.android.material.badge.a;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import cs.h;
import gi.j;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;
import ql.a1;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface Token {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Bracket extends Token {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class LeftRound implements Bracket {

            @l
            public static final LeftRound INSTANCE = new LeftRound();

            private LeftRound() {
            }

            @l
            public String toString() {
                return j.f86770c;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class RightRound implements Bracket {

            @l
            public static final RightRound INSTANCE = new RightRound();

            private RightRound() {
            }

            @l
            public String toString() {
                return j.f86771d;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Function implements Token {

        @l
        private final String name;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class ArgumentDelimiter implements Token {

            @l
            public static final ArgumentDelimiter INSTANCE = new ArgumentDelimiter();

            private ArgumentDelimiter() {
            }

            @l
            public String toString() {
                return ",";
            }
        }

        public Function(@l String name) {
            m0.p(name, "name");
            this.name = name;
        }

        public static /* synthetic */ Function copy$default(Function function, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = function.name;
            }
            return function.copy(str);
        }

        @l
        public final String component1() {
            return this.name;
        }

        @l
        public final Function copy(@l String name) {
            m0.p(name, "name");
            return new Function(name);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Function) && m0.g(this.name, ((Function) obj).name);
        }

        @l
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @l
        public String toString() {
            return "Function(name=" + this.name + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Operator extends Token {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public interface Binary extends Operator {

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public interface Comparison extends Binary {

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                public static final class Greater implements Comparison {

                    @l
                    public static final Greater INSTANCE = new Greater();

                    private Greater() {
                    }

                    @l
                    public String toString() {
                        return ">";
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                public static final class GreaterOrEqual implements Comparison {

                    @l
                    public static final GreaterOrEqual INSTANCE = new GreaterOrEqual();

                    private GreaterOrEqual() {
                    }

                    @l
                    public String toString() {
                        return ">=";
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                public static final class Less implements Comparison {

                    @l
                    public static final Less INSTANCE = new Less();

                    private Less() {
                    }

                    @l
                    public String toString() {
                        return "<";
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                public static final class LessOrEqual implements Comparison {

                    @l
                    public static final LessOrEqual INSTANCE = new LessOrEqual();

                    private LessOrEqual() {
                    }

                    @l
                    public String toString() {
                        return "<=";
                    }
                }
            }

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public interface Equality extends Binary {

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                public static final class Equal implements Equality {

                    @l
                    public static final Equal INSTANCE = new Equal();

                    private Equal() {
                    }

                    @l
                    public String toString() {
                        return "==";
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                public static final class NotEqual implements Equality {

                    @l
                    public static final NotEqual INSTANCE = new NotEqual();

                    private NotEqual() {
                    }

                    @l
                    public String toString() {
                        return "!=";
                    }
                }
            }

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public interface Factor extends Binary {

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                public static final class Division implements Factor {

                    @l
                    public static final Division INSTANCE = new Division();

                    private Division() {
                    }

                    @l
                    public String toString() {
                        return c.userBaseDel;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                public static final class Modulo implements Factor {

                    @l
                    public static final Modulo INSTANCE = new Modulo();

                    private Modulo() {
                    }

                    @l
                    public String toString() {
                        return c.userBaseExtraDel2;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                public static final class Multiplication implements Factor {

                    @l
                    public static final Multiplication INSTANCE = new Multiplication();

                    private Multiplication() {
                    }

                    @l
                    public String toString() {
                        return "*";
                    }
                }
            }

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public interface Logical extends Binary {

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                public static final class And implements Logical {

                    @l
                    public static final And INSTANCE = new And();

                    private And() {
                    }

                    @l
                    public String toString() {
                        return "&&";
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                public static final class Or implements Logical {

                    @l
                    public static final Or INSTANCE = new Or();

                    private Or() {
                    }

                    @l
                    public String toString() {
                        return "||";
                    }
                }
            }

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public static final class Power implements Binary {

                @l
                public static final Power INSTANCE = new Power();

                private Power() {
                }

                @l
                public String toString() {
                    return "^";
                }
            }

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public interface Sum extends Binary {

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                public static final class Minus implements Sum {

                    @l
                    public static final Minus INSTANCE = new Minus();

                    private Minus() {
                    }

                    @l
                    public String toString() {
                        return TokenBuilder.TOKEN_DELIMITER;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                public static final class Plus implements Sum {

                    @l
                    public static final Plus INSTANCE = new Plus();

                    private Plus() {
                    }

                    @l
                    public String toString() {
                        return a.f50153v;
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Dot implements Operator {

            @l
            public static final Dot INSTANCE = new Dot();

            private Dot() {
            }

            @l
            public String toString() {
                return fe.F;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class TernaryElse implements Operator {

            @l
            public static final TernaryElse INSTANCE = new TernaryElse();

            private TernaryElse() {
            }

            @l
            public String toString() {
                return ":";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class TernaryIf implements Operator {

            @l
            public static final TernaryIf INSTANCE = new TernaryIf();

            private TernaryIf() {
            }

            @l
            public String toString() {
                return "?";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class TernaryIfElse implements Operator {

            @l
            public static final TernaryIfElse INSTANCE = new TernaryIfElse();

            private TernaryIfElse() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Try implements Operator {

            @l
            public static final Try INSTANCE = new Try();

            private Try() {
            }

            @l
            public String toString() {
                return "!:";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public interface Unary extends Operator {

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public static final class Minus implements Unary {

                @l
                public static final Minus INSTANCE = new Minus();

                private Minus() {
                }

                @l
                public String toString() {
                    return TokenBuilder.TOKEN_DELIMITER;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public static final class Not implements Unary {

                @l
                public static final Not INSTANCE = new Not();

                private Not() {
                }

                @l
                public String toString() {
                    return a1.f122330d;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public static final class Plus implements Unary {

                @l
                public static final Plus INSTANCE = new Plus();

                private Plus() {
                }

                @l
                public String toString() {
                    return a.f50153v;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class StringTemplate implements Operand {

        @l
        public static final StringTemplate INSTANCE = new StringTemplate();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class End implements Token {

            @l
            public static final End INSTANCE = new End();

            private End() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class EndOfExpression implements Token {

            @l
            public static final EndOfExpression INSTANCE = new EndOfExpression();

            private EndOfExpression() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Start implements Token {

            @l
            public static final Start INSTANCE = new Start();

            private Start() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class StartOfExpression implements Token {

            @l
            public static final StartOfExpression INSTANCE = new StartOfExpression();

            private StartOfExpression() {
            }
        }

        private StringTemplate() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Operand extends Token {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @h
        public static final class Variable implements Operand {

            @l
            private final String name;

            private /* synthetic */ Variable(String str) {
                this.name = str;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Variable m3330boximpl(String str) {
                return new Variable(str);
            }

            @l
            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static String m3331constructorimpl(@l String name) {
                m0.p(name, "name");
                return name;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m3332equalsimpl(String str, Object obj) {
                return (obj instanceof Variable) && m0.g(str, ((Variable) obj).m3336unboximpl());
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m3333equalsimpl0(String str, String str2) {
                return m0.g(str, str2);
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m3334hashCodeimpl(String str) {
                return str.hashCode();
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m3335toStringimpl(String str) {
                return "Variable(name=" + str + ')';
            }

            public boolean equals(Object obj) {
                return m3332equalsimpl(this.name, obj);
            }

            @l
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return m3334hashCodeimpl(this.name);
            }

            public String toString() {
                return m3335toStringimpl(this.name);
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ String m3336unboximpl() {
                return this.name;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public interface Literal extends Operand {

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            @h
            public static final class Num implements Literal {

                @l
                private final Number value;

                private /* synthetic */ Num(Number number) {
                    this.value = number;
                }

                /* JADX INFO: renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Num m3316boximpl(Number number) {
                    return new Num(number);
                }

                @l
                /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
                public static Number m3317constructorimpl(@l Number value) {
                    m0.p(value, "value");
                    return value;
                }

                /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
                public static boolean m3318equalsimpl(Number number, Object obj) {
                    return (obj instanceof Num) && m0.g(number, ((Num) obj).m3322unboximpl());
                }

                /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
                public static final boolean m3319equalsimpl0(Number number, Number number2) {
                    return m0.g(number, number2);
                }

                /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
                public static int m3320hashCodeimpl(Number number) {
                    return number.hashCode();
                }

                /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
                public static String m3321toStringimpl(Number number) {
                    return "Num(value=" + number + ')';
                }

                public boolean equals(Object obj) {
                    return m3318equalsimpl(this.value, obj);
                }

                @l
                public final Number getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return m3320hashCodeimpl(this.value);
                }

                public String toString() {
                    return m3321toStringimpl(this.value);
                }

                /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ Number m3322unboximpl() {
                    return this.value;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            @h
            public static final class Str implements Literal {

                @l
                private final String value;

                private /* synthetic */ Str(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Str m3323boximpl(String str) {
                    return new Str(str);
                }

                @l
                /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
                public static String m3324constructorimpl(@l String value) {
                    m0.p(value, "value");
                    return value;
                }

                /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
                public static boolean m3325equalsimpl(String str, Object obj) {
                    return (obj instanceof Str) && m0.g(str, ((Str) obj).m3329unboximpl());
                }

                /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
                public static final boolean m3326equalsimpl0(String str, String str2) {
                    return m0.g(str, str2);
                }

                /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
                public static int m3327hashCodeimpl(String str) {
                    return str.hashCode();
                }

                /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
                public static String m3328toStringimpl(String str) {
                    return "Str(value=" + str + ')';
                }

                public boolean equals(Object obj) {
                    return m3325equalsimpl(this.value, obj);
                }

                @l
                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return m3327hashCodeimpl(this.value);
                }

                public String toString() {
                    return m3328toStringimpl(this.value);
                }

                /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ String m3329unboximpl() {
                    return this.value;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            @h
            public static final class Bool implements Literal {
                private final boolean value;

                private /* synthetic */ Bool(boolean z10) {
                    this.value = z10;
                }

                /* JADX INFO: renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Bool m3309boximpl(boolean z10) {
                    return new Bool(z10);
                }

                /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
                public static boolean m3311equalsimpl(boolean z10, Object obj) {
                    return (obj instanceof Bool) && z10 == ((Bool) obj).m3315unboximpl();
                }

                /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
                public static final boolean m3312equalsimpl0(boolean z10, boolean z11) {
                    return z10 == z11;
                }

                /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
                public static int m3313hashCodeimpl(boolean z10) {
                    if (z10) {
                        return 1;
                    }
                    return z10 ? 1 : 0;
                }

                /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
                public static String m3314toStringimpl(boolean z10) {
                    return "Bool(value=" + z10 + ')';
                }

                public boolean equals(Object obj) {
                    return m3311equalsimpl(this.value, obj);
                }

                public final boolean getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return m3313hashCodeimpl(this.value);
                }

                public String toString() {
                    return m3314toStringimpl(this.value);
                }

                /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ boolean m3315unboximpl() {
                    return this.value;
                }

                /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
                public static boolean m3310constructorimpl(boolean z10) {
                    return z10;
                }
            }
        }
    }
}
