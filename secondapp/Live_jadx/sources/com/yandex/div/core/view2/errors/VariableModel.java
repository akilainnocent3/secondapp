package com.yandex.div.core.view2.errors;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class VariableModel {

    @l
    private final String name;

    @l
    private final String path;

    @l
    private final String type;

    @l
    private final String value;

    public VariableModel(@l String str, @l String str2, @l String str3, @l String str4) {
        this.name = str;
        this.path = str2;
        this.type = str3;
        this.value = str4;
    }

    public static /* synthetic */ VariableModel copy$default(VariableModel variableModel, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = variableModel.name;
        }
        if ((i10 & 2) != 0) {
            str2 = variableModel.path;
        }
        if ((i10 & 4) != 0) {
            str3 = variableModel.type;
        }
        if ((i10 & 8) != 0) {
            str4 = variableModel.value;
        }
        return variableModel.copy(str, str2, str3, str4);
    }

    @l
    public final String component1() {
        return this.name;
    }

    @l
    public final String component2() {
        return this.path;
    }

    @l
    public final String component3() {
        return this.type;
    }

    @l
    public final String component4() {
        return this.value;
    }

    @l
    public final VariableModel copy(@l String str, @l String str2, @l String str3, @l String str4) {
        return new VariableModel(str, str2, str3, str4);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VariableModel)) {
            return false;
        }
        VariableModel variableModel = (VariableModel) obj;
        return m0.g(this.name, variableModel.name) && m0.g(this.path, variableModel.path) && m0.g(this.type, variableModel.type) && m0.g(this.value, variableModel.value);
    }

    @l
    public final String getName() {
        return this.name;
    }

    @l
    public final String getPath() {
        return this.path;
    }

    @l
    public final String getType() {
        return this.type;
    }

    @l
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.path.hashCode()) * 31) + this.type.hashCode()) * 31) + this.value.hashCode();
    }

    @l
    public String toString() {
        return "VariableModel(name=" + this.name + ", path=" + this.path + ", type=" + this.type + ", value=" + this.value + ')';
    }
}
