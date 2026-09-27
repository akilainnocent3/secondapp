package com.bykv.vk.openvk.preload.geckox.net;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class Response {
    public final String body;
    public final int code;
    public final Map<String, String> headers;
    public final String msg;

    public Response(Map<String, String> map, String str, int i10, String str2) {
        this.headers = map;
        this.body = str;
        this.code = i10;
        this.msg = str2;
    }
}
