package com.yandex.div.core.expression.variables;

import com.yandex.div.data.Variable;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface DeclarationObserver {
    void onDeclared(@l Variable variable);

    void onUndeclared(@l Variable variable);
}
