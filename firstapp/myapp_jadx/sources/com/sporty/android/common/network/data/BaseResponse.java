package com.sporty.android.common.network.data;

import defpackage.ekw;

/* JADX INFO: loaded from: classes.dex */
public class BaseResponse<T> {
    public int bizCode;
    public T data;
    public String message;
    public int total;

    public boolean hasData() {
        return isSuccessful() && this.data != null;
    }

    public boolean isSuccessful() {
        return this.bizCode == 10000;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseResponse{bizCode=");
        sb.append(this.bizCode);
        sb.append(", message='");
        sb.append(this.message);
        sb.append("', total=");
        sb.append(this.total);
        sb.append(", data=");
        return ekw.a(sb, this.data, '}');
    }
}
