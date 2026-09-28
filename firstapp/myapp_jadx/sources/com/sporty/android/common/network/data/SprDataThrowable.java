package com.sporty.android.common.network.data;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/common/network/data/SprDataThrowable;", "Lcom/sporty/android/common/network/data/SprThrowable;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SprDataThrowable extends SprThrowable {
    public final int d;
    public final String e;
    public final Object f;

    public SprDataThrowable(Object obj, String str, int i) {
        super(i, str, false);
        this.d = i;
        this.e = str;
        this.f = obj;
    }

    @Override // com.sporty.android.common.network.data.SprThrowable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getD() {
        return this.d;
    }

    @Override // com.sporty.android.common.network.data.SprThrowable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getE() {
        return this.e;
    }
}
