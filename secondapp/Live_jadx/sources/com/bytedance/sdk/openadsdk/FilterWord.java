package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class FilterWord {
    private String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private boolean f35168sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f35169tq;
    private List<FilterWord> vy;

    public FilterWord(String str, String str2) {
        this.hww = str;
        this.f35169tq = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.vy == null) {
            this.vy = new ArrayList();
        }
        this.vy.add(filterWord);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }

    public String getId() {
        return this.hww;
    }

    public boolean getIsSelected() {
        return this.f35168sd;
    }

    public String getName() {
        return this.f35169tq;
    }

    public List<FilterWord> getOptions() {
        return this.vy;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.vy;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.hww) || TextUtils.isEmpty(this.f35169tq)) ? false : true;
    }

    public void setId(String str) {
        this.hww = str;
    }

    public void setIsSelected(boolean z10) {
        this.f35168sd = z10;
    }

    public void setName(String str) {
        this.f35169tq = str;
    }

    public FilterWord() {
    }
}
