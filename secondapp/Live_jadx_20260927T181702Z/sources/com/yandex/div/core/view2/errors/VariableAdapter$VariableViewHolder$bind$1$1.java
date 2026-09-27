package com.yandex.div.core.view2.errors;

import dr.w2;
import ds.l;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class VariableAdapter$VariableViewHolder$bind$1$1 extends o0 implements l<String, w2> {
    final /* synthetic */ VariableModel $variable;
    final /* synthetic */ VariableAdapter.VariableViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariableAdapter$VariableViewHolder$bind$1$1(VariableAdapter.VariableViewHolder variableViewHolder, VariableModel variableModel) {
        super(1);
        this.this$0 = variableViewHolder;
        this.$variable = variableModel;
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ w2 invoke(String str) {
        invoke2(str);
        return w2.f79517a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@oy.l String str) {
        this.this$0.variableMutator.invoke(this.$variable.getName(), this.$variable.getPath(), str);
    }
}
