package com.yandex.div.core.util.validator;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseValidator {
    private final boolean allowEmpty;

    public BaseValidator(boolean z10) {
        this.allowEmpty = z10;
    }

    public final boolean getAllowEmpty() {
        return this.allowEmpty;
    }

    public abstract boolean validate(@l String str);
}
