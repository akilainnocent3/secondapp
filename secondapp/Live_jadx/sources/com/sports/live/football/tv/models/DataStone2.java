package com.sports.live.football.tv.models;

import gi.j;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DataStone2 {

    @m
    private String url;

    public DataStone2(@m String str) {
        this.url = str;
    }

    public static /* synthetic */ DataStone2 copy$default(DataStone2 dataStone2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dataStone2.url;
        }
        return dataStone2.copy(str);
    }

    @m
    public final String component1() {
        return this.url;
    }

    @l
    public final DataStone2 copy(@m String str) {
        return new DataStone2(str);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataStone2) && m0.g(this.url, ((DataStone2) obj).url);
    }

    @m
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setUrl(@m String str) {
        this.url = str;
    }

    @l
    public String toString() {
        return "DataStone2(url=" + this.url + j.f86771d;
    }
}
