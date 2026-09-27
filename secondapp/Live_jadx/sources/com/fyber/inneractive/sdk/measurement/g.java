package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f45106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f45107b;

    public g(List list, i iVar) {
        this.f45106a = list;
        this.f45107b = iVar;
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        if (xVar == null || this.f45106a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f45106a) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str.replace("[REASON]", String.valueOf(this.f45107b.mReason)));
            }
        }
        return arrayList;
    }
}
