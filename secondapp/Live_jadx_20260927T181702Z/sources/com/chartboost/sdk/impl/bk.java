package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface bk {
    long a();

    View a(Context context);

    Object a(Context context, URL url, x6 x6Var, or.f fVar);

    void a(ck ckVar);

    void a(eh ehVar);

    long b();

    float getVolume();

    void pause();

    void play();

    void release();

    void setVolume(float f10);
}
