package com.yandex.div.core.view2.errors;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.u;
import dr.w2;
import ds.q;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class VariableAdapter extends u<VariableModel, VariableViewHolder> {

    @l
    private final q<String, String, String, w2> variableMutator;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class VariableDiffUtilCallback extends k.f<VariableModel> {
        @Override // androidx.recyclerview.widget.k.f
        public boolean areContentsTheSame(@l VariableModel variableModel, @l VariableModel variableModel2) {
            return m0.g(variableModel.getValue(), variableModel2.getValue());
        }

        @Override // androidx.recyclerview.widget.k.f
        public boolean areItemsTheSame(@l VariableModel variableModel, @l VariableModel variableModel2) {
            return m0.g(variableModel.getName(), variableModel2.getName());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class VariableViewHolder extends RecyclerView.f0 {

        @l
        private final VariableView root;

        @l
        private final q<String, String, String, w2> variableMutator;

        /* JADX WARN: Multi-variable type inference failed */
        public VariableViewHolder(@l VariableView variableView, @l q<? super String, ? super String, ? super String, w2> qVar) {
            super(variableView);
            this.root = variableView;
            this.variableMutator = qVar;
        }

        private final String fullName(VariableModel variableModel) {
            if (variableModel.getPath().length() <= 0) {
                return variableModel.getName();
            }
            return variableModel.getPath() + '/' + variableModel.getName();
        }

        private final int inputType(VariableModel variableModel) {
            String type = variableModel.getType();
            return m0.g(type, "number") ? true : m0.g(type, "integer") ? 2 : 1;
        }

        public final void bind(@l VariableModel variableModel) {
            VariableView variableView = this.root;
            variableView.getNameText().setText(fullName(variableModel));
            variableView.getTypeText().setText(variableModel.getType());
            variableView.getValueText().setText(variableModel.getValue());
            variableView.getValueText().setInputType(inputType(variableModel));
            variableView.setOnEnterAction(new VariableAdapter$VariableViewHolder$bind$1$1(this, variableModel));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VariableAdapter(@l q<? super String, ? super String, ? super String, w2> qVar) {
        super(new VariableDiffUtilCallback());
        this.variableMutator = qVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@l VariableViewHolder variableViewHolder, int i10) {
        variableViewHolder.bind(getCurrentList().get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @l
    public VariableViewHolder onCreateViewHolder(@l ViewGroup viewGroup, int i10) {
        return new VariableViewHolder(new VariableView(viewGroup.getContext()), this.variableMutator);
    }
}
