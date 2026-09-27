package com.unity3d.scar.adapter.common;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class n implements j {
    protected String _description;
    protected Object[] _errorArguments;
    private Enum _errorCategory;

    public n(Enum<?> r10, String str, Object... objArr) {
        this._errorCategory = r10;
        this._description = str;
        this._errorArguments = objArr;
    }

    @Override // com.unity3d.scar.adapter.common.j
    public int getCode() {
        return -1;
    }

    @Override // com.unity3d.scar.adapter.common.j
    public String getDescription() {
        return this._description;
    }

    @Override // com.unity3d.scar.adapter.common.j
    public String getDomain() {
        return null;
    }

    public Object[] getErrorArguments() {
        return this._errorArguments;
    }

    public Enum<?> getErrorCategory() {
        return this._errorCategory;
    }
}
