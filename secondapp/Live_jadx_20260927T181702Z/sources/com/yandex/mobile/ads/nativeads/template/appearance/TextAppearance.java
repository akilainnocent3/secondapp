package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import yads.i52;
import yads.r53;
import yv.g;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@g
public final class TextAppearance implements Parcelable, i52 {

    @l
    public static final Parcelable.Creator<TextAppearance> CREATOR = new r53();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f77017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f77018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f77019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f77020e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f77021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f77022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f77023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f77024d;

        @l
        public final TextAppearance build() {
            return new TextAppearance(this.f77021a, this.f77022b, this.f77023c, this.f77024d, null);
        }

        @l
        public final Builder setFontFamilyName(@m String str) {
            this.f77024d = str;
            return this;
        }

        @l
        public final Builder setFontStyle(int i10) {
            this.f77023c = i10;
            return this;
        }

        @l
        public final Builder setTextColor(int i10) {
            this.f77021a = i10;
            return this;
        }

        @l
        public final Builder setTextSize(float f10) {
            this.f77022b = f10;
            return this;
        }
    }

    public /* synthetic */ TextAppearance(int i10, float f10, int i11, String str, x xVar) {
        this(i10, f10, i11, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(TextAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        m0.n(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance");
        TextAppearance textAppearance = (TextAppearance) obj;
        if (getTextColor() == textAppearance.getTextColor() && getTextSize() == textAppearance.getTextSize() && getFontStyle() == textAppearance.getFontStyle()) {
            return m0.g(getFontFamilyName(), textAppearance.getFontFamilyName());
        }
        return false;
    }

    @Override // yads.i52
    @m
    public String getFontFamilyName() {
        return this.f77020e;
    }

    @Override // yads.i52
    public int getFontStyle() {
        return this.f77019d;
    }

    @Override // yads.i52
    public int getTextColor() {
        return this.f77017b;
    }

    @Override // yads.i52
    public float getTextSize() {
        return this.f77018c;
    }

    public int hashCode() {
        int fontStyle = (getFontStyle() + ((Float.floatToIntBits(getTextSize()) + (getTextColor() * 31)) * 31)) * 31;
        String fontFamilyName = getFontFamilyName();
        return fontStyle + (fontFamilyName != null ? fontFamilyName.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel, int i10) {
        parcel.writeInt(this.f77017b);
        parcel.writeFloat(this.f77018c);
        parcel.writeInt(this.f77019d);
        parcel.writeString(this.f77020e);
    }

    private TextAppearance(int i10, float f10, int i11, String str) {
        this.f77017b = i10;
        this.f77018c = f10;
        this.f77019d = i11;
        this.f77020e = str;
    }
}
