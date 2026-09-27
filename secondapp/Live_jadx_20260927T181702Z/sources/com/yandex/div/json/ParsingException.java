package com.yandex.div.json;

import com.yandex.div.internal.util.JsonNode;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class ParsingException extends RuntimeException {

    @m
    private final String jsonSummary;

    @l
    private final ParsingExceptionReason reason;

    @m
    private final JsonNode source;

    public /* synthetic */ ParsingException(ParsingExceptionReason parsingExceptionReason, String str, Throwable th2, JsonNode jsonNode, String str2, int i10, x xVar) {
        this(parsingExceptionReason, str, (i10 & 4) != 0 ? null : th2, (i10 & 8) != 0 ? null : jsonNode, (i10 & 16) != 0 ? null : str2);
    }

    @m
    public String getJsonSummary() {
        return this.jsonSummary;
    }

    @l
    public ParsingExceptionReason getReason() {
        return this.reason;
    }

    @m
    public JsonNode getSource() {
        return this.source;
    }

    public ParsingException(@l ParsingExceptionReason parsingExceptionReason, @l String str, @m Throwable th2, @m JsonNode jsonNode, @m String str2) {
        super(str, th2);
        this.reason = parsingExceptionReason;
        this.source = jsonNode;
        this.jsonSummary = str2;
    }
}
