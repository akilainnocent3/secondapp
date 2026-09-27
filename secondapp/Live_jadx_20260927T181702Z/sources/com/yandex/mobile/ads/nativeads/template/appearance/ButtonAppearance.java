package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import yads.b52;
import yads.dr;
import yv.g;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@g
public final class ButtonAppearance implements Parcelable, b52 {

    @l
    public static final Parcelable.Creator<ButtonAppearance> CREATOR = new dr();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextAppearance f76973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f76974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f76975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f76976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f76977f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f76978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f76979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f76980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f76981d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private TextAppearance f76982e;

        @l
        public final ButtonAppearance build() {
            return new ButtonAppearance(this.f76982e, this.f76978a, this.f76979b, this.f76980c, this.f76981d, null);
        }

        @l
        public final Builder setBorderColor(int i10) {
            this.f76978a = i10;
            return this;
        }

        @l
        public final Builder setBorderWidth(float f10) {
            this.f76979b = f10;
            return this;
        }

        @l
        public final Builder setNormalColor(int i10) {
            this.f76980c = i10;
            return this;
        }

        @l
        public final Builder setPressedColor(int i10) {
            this.f76981d = i10;
            return this;
        }

        @l
        public final Builder setTextAppearance(@m TextAppearance textAppearance) {
            this.f76982e = textAppearance;
            return this;
        }
    }

    public /* synthetic */ ButtonAppearance(TextAppearance textAppearance, int i10, float f10, int i11, int i12, x xVar) {
        this(textAppearance, i10, f10, i11, i12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(ButtonAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        m0.n(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance");
        ButtonAppearance buttonAppearance = (ButtonAppearance) obj;
        return m0.g(getTextAppearance(), buttonAppearance.getTextAppearance()) && getBorderColor() == buttonAppearance.getBorderColor() && getBorderWidth() == buttonAppearance.getBorderWidth() && getNormalColor() == buttonAppearance.getNormalColor() && getPressedColor() == buttonAppearance.getPressedColor();
    }

    @Override // yads.b52
    public int getBorderColor() {
        return this.f76974c;
    }

    @Override // yads.b52
    public float getBorderWidth() {
        return this.f76975d;
    }

    @Override // yads.b52
    public int getNormalColor() {
        return this.f76976e;
    }

    @Override // yads.b52
    public int getPressedColor() {
        return this.f76977f;
    }

    public int hashCode() {
        TextAppearance textAppearance = getTextAppearance();
        return getPressedColor() + ((getNormalColor() + ((Float.floatToIntBits(getBorderWidth()) + ((getBorderColor() + ((textAppearance != null ? textAppearance.hashCode() : 0) * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel, int i10) {
        TextAppearance textAppearance = this.f76973b;
        if (textAppearance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textAppearance.writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.f76974c);
        parcel.writeFloat(this.f76975d);
        parcel.writeInt(this.f76976e);
        parcel.writeInt(this.f76977f);
    }

    private ButtonAppearance(TextAppearance textAppearance, int i10, float f10, int i11, int i12) {
        this.f76973b = textAppearance;
        this.f76974c = i10;
        this.f76975d = f10;
        this.f76976e = i11;
        this.f76977f = i12;
    }

    @Override // yads.b52
    @m
    public TextAppearance getTextAppearance() {
        return this.f76973b;
    }
}
