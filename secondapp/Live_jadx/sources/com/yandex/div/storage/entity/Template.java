package com.yandex.div.storage.entity;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class Template {

    @l
    private final byte[] data;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @l
    private final String f76741id;

    public Template(@l String str, @l byte[] bArr) {
        this.f76741id = str;
        this.data = bArr;
    }

    @l
    public final byte[] getData() {
        return this.data;
    }

    @l
    public final String getId() {
        return this.f76741id;
    }
}
