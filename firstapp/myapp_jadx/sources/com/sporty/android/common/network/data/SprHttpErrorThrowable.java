package com.sporty.android.common.network.data;

import defpackage.fk50;
import defpackage.vch0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/common/network/data/SprHttpErrorThrowable;", "Lfk50;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SprHttpErrorThrowable extends fk50 {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SprHttpErrorThrowable(int i, String str) {
        super(vch0.d(str));
        str.getClass();
        this.a = i;
    }
}
