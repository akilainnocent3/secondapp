package com.yandex.div.core.util.validator;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ValidatorItemData {

    @l
    private final String labelId;

    @l
    private final BaseValidator validator;

    @l
    private final String variableName;

    public ValidatorItemData(@l BaseValidator baseValidator, @l String str, @l String str2) {
        this.validator = baseValidator;
        this.variableName = str;
        this.labelId = str2;
    }

    @l
    public final String getLabelId() {
        return this.labelId;
    }

    @l
    public final BaseValidator getValidator() {
        return this.validator;
    }

    @l
    public final String getVariableName() {
        return this.variableName;
    }
}
