package com.ironsource.mediationsdk.adunit.adapter.listener;

import java.util.Map;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface NetworkInitializationListener {
    void onInitFailed(int i10, @m String str);

    void onInitFailed(int i10, @m String str, Map<String, Object> map);

    void onInitSuccess();

    void onInitSuccess(Map<String, Object> map);
}
