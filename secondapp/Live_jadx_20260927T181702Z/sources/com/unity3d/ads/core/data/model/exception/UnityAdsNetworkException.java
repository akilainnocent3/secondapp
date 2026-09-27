package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.data.model.OperationType;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class UnityAdsNetworkException extends Exception {

    @m
    private final String client;

    @m
    private final Integer code;

    @m
    private final Integer cronetCode;

    @l
    private final String message;

    @m
    private final String protocol;

    @l
    private final OperationType type;

    @m
    private final String url;

    public /* synthetic */ UnityAdsNetworkException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4, int i10, x xVar) {
        this(str, (i10 & 2) != 0 ? OperationType.UNKNOWN : operationType, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : num2, (i10 & 64) != 0 ? null : str4);
    }

    @m
    public final String getClient() {
        return this.client;
    }

    @m
    public final Integer getCode() {
        return this.code;
    }

    @m
    public final Integer getCronetCode() {
        return this.cronetCode;
    }

    @Override // java.lang.Throwable
    @l
    public String getMessage() {
        return this.message;
    }

    @m
    public final String getProtocol() {
        return this.protocol;
    }

    @l
    public final OperationType getType() {
        return this.type;
    }

    @m
    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsNetworkException(@l String message, @l OperationType type, @m Integer num, @m String str, @m String str2, @m Integer num2, @m String str3) {
        super(message);
        m0.p(message, "message");
        m0.p(type, "type");
        this.message = message;
        this.type = type;
        this.code = num;
        this.url = str;
        this.protocol = str2;
        this.cronetCode = num2;
        this.client = str3;
    }
}
