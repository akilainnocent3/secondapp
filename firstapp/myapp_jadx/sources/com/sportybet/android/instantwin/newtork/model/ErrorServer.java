package com.sportybet.android.instantwin.newtork.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated(since = "Please use ErrorBody class instead")
public class ErrorServer {

    @SerializedName("causeMsg")
    public String causeMsg;

    @SerializedName("errorCode")
    public long errorCode;

    @SerializedName("errorName")
    public String errorName;

    public ErrorServer(String str, String str2, Long l) {
        this.errorName = str;
        this.causeMsg = str2;
        this.errorCode = l.longValue();
    }
}
