package com.mbridge.msdk.dycreator.binding.base;

import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewdata.base.a;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class ActionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f66430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EAction f66431b;

    public a getBaseViewData() {
        return this.f66430a;
    }

    public EAction geteAction() {
        return this.f66431b;
    }

    public void setBaseViewData(a aVar) {
        this.f66430a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.f66431b = eAction;
    }
}
