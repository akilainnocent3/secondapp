package com.sports.live.football.tv.models;

import gi.j;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class MoreDataModel {
    private final int image;

    @l
    private final String text;

    public MoreDataModel(int i10, @l String text) {
        m0.p(text, "text");
        this.image = i10;
        this.text = text;
    }

    public static /* synthetic */ MoreDataModel copy$default(MoreDataModel moreDataModel, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = moreDataModel.image;
        }
        if ((i11 & 2) != 0) {
            str = moreDataModel.text;
        }
        return moreDataModel.copy(i10, str);
    }

    public final int component1() {
        return this.image;
    }

    @l
    public final String component2() {
        return this.text;
    }

    @l
    public final MoreDataModel copy(int i10, @l String text) {
        m0.p(text, "text");
        return new MoreDataModel(i10, text);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreDataModel)) {
            return false;
        }
        MoreDataModel moreDataModel = (MoreDataModel) obj;
        return this.image == moreDataModel.image && m0.g(this.text, moreDataModel.text);
    }

    public final int getImage() {
        return this.image;
    }

    @l
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.image * 31) + this.text.hashCode();
    }

    @l
    public String toString() {
        return "MoreDataModel(image=" + this.image + ", text=" + this.text + j.f86771d;
    }
}
