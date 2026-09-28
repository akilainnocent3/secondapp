package com.sportygames.commons.tw_commons.data;

import defpackage.ekw;

/* JADX INFO: loaded from: classes8.dex */
public class BaseResponse<T> {
    public int bizCode;
    public T data;
    public String message;
    public int total;

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
