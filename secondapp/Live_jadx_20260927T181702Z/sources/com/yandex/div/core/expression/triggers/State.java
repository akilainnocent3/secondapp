package com.yandex.div.core.expression.triggers;

import dr.e0;
import dr.o0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
interface State {
    public static final /* synthetic */ Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Input.values().length];
                try {
                    iArr[Input.Letter.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Input.VarSpecial.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Input.OpeningBracket.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Input.Other.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Input.EscapeCharacter.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Input.SingleQuote.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Input.EndOfLine.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final State initialInput(Input input) {
            switch (WhenMappings.$EnumSwitchMapping$0[input.ordinal()]) {
                case 1:
                    return Variable.INSTANCE;
                case 2:
                case 3:
                case 4:
                case 5:
                    return Raw.INSTANCE;
                case 6:
                    return QuotedString.INSTANCE;
                case 7:
                    return End.INSTANCE;
                default:
                    throw new o0();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class End implements State {

        @l
        public static final End INSTANCE = new End();

        private End() {
        }

        @Override // com.yandex.div.core.expression.triggers.State
        public /* bridge */ /* synthetic */ State input(Input input, Result result) {
            return (State) m3256input(input, result);
        }

        @l
        /* JADX INFO: renamed from: input, reason: collision with other method in class */
        public Void m3256input(@l Input input, @l Result result) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class EndOfString implements State {

        @l
        public static final EndOfString INSTANCE = new EndOfString();

        private EndOfString() {
        }

        @Override // com.yandex.div.core.expression.triggers.State
        @l
        public State input(@l Input input, @l Result result) {
            result.emitRaw();
            return State.Companion.initialInput(input);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Function implements State {

        @l
        public static final Function INSTANCE = new Function();

        private Function() {
        }

        @Override // com.yandex.div.core.expression.triggers.State
        @l
        public State input(@l Input input, @l Result result) {
            result.emitRaw();
            return State.Companion.initialInput(input);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Input {
        Letter,
        VarSpecial,
        OpeningBracket,
        Other,
        SingleQuote,
        EscapeCharacter,
        EndOfLine;


        @l
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Companion {
            public /* synthetic */ Companion(x xVar) {
                this();
            }

            @l
            public final Input fromChar(char c10) {
                if (('A' <= c10 && c10 < '[') || (('a' <= c10 && c10 < '{') || c10 == '_')) {
                    return Input.Letter;
                }
                if (c10 == '.' || ('0' <= c10 && c10 < ':')) {
                    return Input.VarSpecial;
                }
                if (c10 == '(') {
                    return Input.OpeningBracket;
                }
                if (c10 == '\'') {
                    return Input.SingleQuote;
                }
                return c10 == '\\' ? Input.EscapeCharacter : Input.Other;
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class QuotedString implements State {

        @l
        public static final QuotedString INSTANCE = new QuotedString();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Input.values().length];
                try {
                    iArr[Input.Letter.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Input.VarSpecial.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Input.OpeningBracket.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Input.Other.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Input.SingleQuote.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Input.EscapeCharacter.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Input.EndOfLine.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private QuotedString() {
        }

        @Override // com.yandex.div.core.expression.triggers.State
        @l
        public State input(@l Input input, @l Result result) {
            switch (WhenMappings.$EnumSwitchMapping$0[input.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return INSTANCE;
                case 5:
                    return EndOfString.INSTANCE;
                case 6:
                    return QuotedStringEscaped.INSTANCE;
                case 7:
                    result.throwError("Invalid quoted string");
                    throw new e0();
                default:
                    throw new o0();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class QuotedStringEscaped implements State {

        @l
        public static final QuotedStringEscaped INSTANCE = new QuotedStringEscaped();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Input.values().length];
                try {
                    iArr[Input.Letter.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Input.VarSpecial.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Input.OpeningBracket.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Input.Other.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Input.EscapeCharacter.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Input.SingleQuote.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Input.EndOfLine.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private QuotedStringEscaped() {
        }

        @Override // com.yandex.div.core.expression.triggers.State
        @l
        public QuotedString input(@l Input input, @l Result result) {
            switch (WhenMappings.$EnumSwitchMapping$0[input.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return QuotedString.INSTANCE;
                case 7:
                    result.throwError("Invalid escape sequence");
                    throw new e0();
                default:
                    throw new o0();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Raw implements State {

        @l
        public static final Raw INSTANCE = new Raw();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Input.values().length];
                try {
                    iArr[Input.Other.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Input.VarSpecial.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Input.OpeningBracket.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Input.EscapeCharacter.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Input.Letter.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Input.SingleQuote.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Input.EndOfLine.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Raw() {
        }

        @Override // com.yandex.div.core.expression.triggers.State
        @l
        public State input(@l Input input, @l Result result) {
            switch (WhenMappings.$EnumSwitchMapping$0[input.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return INSTANCE;
                case 5:
                    result.emitRaw();
                    return Variable.INSTANCE;
                case 6:
                    result.emitRaw();
                    return QuotedString.INSTANCE;
                case 7:
                    result.emitRaw();
                    return End.INSTANCE;
                default:
                    throw new o0();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Start implements State {

        @l
        public static final Start INSTANCE = new Start();

        private Start() {
        }

        @Override // com.yandex.div.core.expression.triggers.State
        @l
        public State input(@l Input input, @l Result result) {
            return State.Companion.initialInput(input);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Variable implements State {

        @l
        public static final Variable INSTANCE = new Variable();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Input.values().length];
                try {
                    iArr[Input.Letter.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Input.VarSpecial.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Input.OpeningBracket.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Input.Other.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Input.EscapeCharacter.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Input.SingleQuote.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Input.EndOfLine.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Variable() {
        }

        @Override // com.yandex.div.core.expression.triggers.State
        @l
        public State input(@l Input input, @l Result result) {
            switch (WhenMappings.$EnumSwitchMapping$0[input.ordinal()]) {
                case 1:
                case 2:
                    return INSTANCE;
                case 3:
                    return Function.INSTANCE;
                case 4:
                case 5:
                    result.emitVariable();
                    return Raw.INSTANCE;
                case 6:
                    result.emitVariable();
                    return QuotedString.INSTANCE;
                case 7:
                    result.emitVariable();
                    return End.INSTANCE;
                default:
                    throw new o0();
            }
        }
    }

    @l
    State input(@l Input input, @l Result result);
}
