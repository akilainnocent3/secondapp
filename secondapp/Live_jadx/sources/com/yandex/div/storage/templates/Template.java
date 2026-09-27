package com.yandex.div.storage.templates;

import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class Template {

    @l
    private final String hash;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @l
    private final String f76743id;

    @l
    private final JSONObject template;

    public Template(@l String str, @l String str2, @l JSONObject jSONObject) {
        this.f76743id = str;
        this.hash = str2;
        this.template = jSONObject;
    }

    @l
    public final String getHash() {
        return this.hash;
    }

    @l
    public final String getId() {
        return this.f76743id;
    }

    @l
    public final JSONObject getTemplate() {
        return this.template;
    }
}
