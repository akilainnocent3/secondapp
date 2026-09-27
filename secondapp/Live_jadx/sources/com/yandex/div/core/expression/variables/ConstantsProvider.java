package com.yandex.div.core.expression.variables;

import com.yandex.div.evaluable.VariableProvider;
import java.util.Map;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ConstantsProvider implements VariableProvider {

    @l
    private final Map<String, Object> constants;

    public ConstantsProvider(@l Map<String, ? extends Object> map) {
        this.constants = map;
    }

    @Override // com.yandex.div.evaluable.VariableProvider
    @m
    public Object get(@l String str) {
        return this.constants.get(str);
    }
}
