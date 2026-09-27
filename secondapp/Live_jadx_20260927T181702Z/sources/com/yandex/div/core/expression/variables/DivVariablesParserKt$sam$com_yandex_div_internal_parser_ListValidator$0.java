package com.yandex.div.core.expression.variables;

import com.yandex.div.internal.parser.ListValidator;
import dr.a0;
import ds.l;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.m0;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivVariablesParserKt$sam$com_yandex_div_internal_parser_ListValidator$0 implements ListValidator, e0 {
    private final /* synthetic */ l function;

    public DivVariablesParserKt$sam$com_yandex_div_internal_parser_ListValidator$0(l lVar) {
        this.function = lVar;
    }

    public final boolean equals(@m Object obj) {
        if ((obj instanceof ListValidator) && (obj instanceof e0)) {
            return m0.g(getFunctionDelegate(), ((e0) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.e0
    @oy.l
    public final a0<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public final /* synthetic */ boolean isValid(List list) {
        return ((Boolean) this.function.invoke(list)).booleanValue();
    }
}
