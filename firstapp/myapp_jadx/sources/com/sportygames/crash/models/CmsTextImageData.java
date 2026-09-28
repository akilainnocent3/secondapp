package com.sportygames.crash.models;

import defpackage.w9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J1\u0010\u0010\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R$\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/sportygames/crash/models/CmsTextImageData;", "", "texts", "", "", "urls", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getTexts", "()Ljava/util/List;", "setTexts", "(Ljava/util/List;)V", "getUrls", "setUrls", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CmsTextImageData {
    public static final int $stable = 8;
    private List<String> texts;
    private List<String> urls;

    public CmsTextImageData(List<String> list, List<String> list2) {
        this.texts = list;
        this.urls = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CmsTextImageData copy$default(CmsTextImageData cmsTextImageData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cmsTextImageData.texts;
        }
        if ((i & 2) != 0) {
            list2 = cmsTextImageData.urls;
        }
        return cmsTextImageData.copy(list, list2);
    }

    public final List<String> component1() {
        return this.texts;
    }

    public final List<String> component2() {
        return this.urls;
    }

    public final CmsTextImageData copy(List<String> texts, List<String> urls) {
        return new CmsTextImageData(texts, urls);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CmsTextImageData)) {
            return false;
        }
        CmsTextImageData cmsTextImageData = (CmsTextImageData) other;
        return Intrinsics.g(this.texts, cmsTextImageData.texts) && Intrinsics.g(this.urls, cmsTextImageData.urls);
    }

    public final List<String> getTexts() {
        return this.texts;
    }

    public final List<String> getUrls() {
        return this.urls;
    }

    public int hashCode() {
        List<String> list = this.texts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.urls;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setTexts(List<String> list) {
        this.texts = list;
    }

    public final void setUrls(List<String> list) {
        this.urls = list;
    }

    public String toString() {
        return w9d.a("CmsTextImageData(texts=", ", urls=", ")", this.texts, this.urls);
    }
}
