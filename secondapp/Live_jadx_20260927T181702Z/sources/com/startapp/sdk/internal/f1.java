package com.startapp.sdk.internal;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74781a;

    public f1(Context context, AttributeSet attributeSet) {
        String string = null;
        try {
            int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "adTag", -1);
            string = attributeResourceValue != -1 ? context.getResources().getString(attributeResourceValue) : attributeSet.getAttributeValue(null, "adTag");
        } catch (Exception unused) {
        }
        this.f74781a = string;
    }
}
