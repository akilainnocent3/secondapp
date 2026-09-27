package com.yandex.div.storage.templates;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class RawTemplateData {

    @l
    private final byte[] data;

    @l
    private final String hash;

    public RawTemplateData(@l String str, @l byte[] bArr) {
        this.hash = str;
        this.data = bArr;
    }

    @l
    public final byte[] getData() {
        return this.data;
    }

    @l
    public final String getHash() {
        return this.hash;
    }
}
