package com.yandex.div.core.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import k1.u0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivVariableTypefaceProvider implements DivTypefaceProvider {

    @l
    private final Context context;
    private final boolean supportFontVariations;

    public DivVariableTypefaceProvider(@l Context context) {
        this.context = context;
        this.supportFontVariations = Build.VERSION.SDK_INT >= 26;
    }

    private final Typeface createTypefaceFor(int i10) {
        return u0.c(this.context, getTypeface(), i10, false);
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @m
    public Typeface getBold() {
        return createTypefaceFor(700);
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @m
    public Typeface getLight() {
        return createTypefaceFor(300);
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @m
    public Typeface getMedium() {
        return createTypefaceFor(500);
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @m
    public Typeface getRegular() {
        return createTypefaceFor(400);
    }

    @m
    public abstract Typeface getTypeface();

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    @m
    public Typeface getTypefaceFor(int i10) {
        return this.supportFontVariations ? getTypeface() : createTypefaceFor(i10);
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public boolean isVariable() {
        return true;
    }
}
