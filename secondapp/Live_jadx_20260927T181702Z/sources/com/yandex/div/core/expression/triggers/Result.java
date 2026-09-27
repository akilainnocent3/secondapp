package com.yandex.div.core.expression.triggers;

import com.yandex.div.json.ParsingExceptionKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class Result {
    private int end;

    @l
    private final String input;

    @l
    private final List<ConditionPart> result = new ArrayList();
    private int start;

    public Result(@l String str) {
        this.input = str;
    }

    private final void emit(ds.l<? super String, ? extends ConditionPart> lVar) {
        List<ConditionPart> list = this.result;
        String strSubstring = this.input.substring(this.start, this.end);
        m0.o(strSubstring, "substring(...)");
        list.add(lVar.invoke(strSubstring));
        this.start = this.end;
    }

    public final void emitRaw() {
        List<ConditionPart> list = this.result;
        String strSubstring = this.input.substring(this.start, this.end);
        m0.o(strSubstring, "substring(...)");
        list.add(new ConditionPart.RawString(strSubstring));
        this.start = this.end;
    }

    public final void emitVariable() {
        List<ConditionPart> list = this.result;
        String strSubstring = this.input.substring(this.start, this.end);
        m0.o(strSubstring, "substring(...)");
        list.add(new ConditionPart.Variable(strSubstring));
        this.start = this.end;
    }

    @l
    public final String getInput() {
        return this.input;
    }

    @l
    public final List<ConditionPart> parse() {
        State stateInput = State.Start.INSTANCE;
        String str = this.input;
        for (int i10 = 0; i10 < str.length(); i10++) {
            stateInput = stateInput.input(State.Input.Companion.fromChar(str.charAt(i10)), this);
            this.end++;
        }
        stateInput.input(State.Input.EndOfLine, this);
        return this.result;
    }

    @l
    public final Void throwError(@l String str) {
        throw ParsingExceptionKt.invalidCondition(str, this.input);
    }
}
