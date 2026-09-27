package com.unity3d.ironsourceads.internal.services;

import android.content.Context;
import com.ironsource.EnumC4401m9;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d {
    public static /* synthetic */ a.AbstractC0739a a(a aVar, Context context, EnumC4401m9 enumC4401m9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroy");
        }
        if ((i10 & 2) != 0) {
            enumC4401m9 = EnumC4401m9.APP_ACTIVITY;
        }
        return aVar.a(context, enumC4401m9);
    }
}
