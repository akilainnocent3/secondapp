package com.sportybet.plugin.realsports.data;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Categories implements Comparable<Categories> {
    public int eventSize;
    public String id;
    public String name;
    public List<Tournaments> tournaments;

    @Override // java.lang.Comparable
    public int compareTo(Categories categories) {
        if (TextUtils.equals(this.name, categories.name)) {
            return 0;
        }
        return this.name.compareTo(categories.name);
    }
}
