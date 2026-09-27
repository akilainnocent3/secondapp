package com.sports.live.football.tv.models;

import gi.j;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DataStone {

    @m
    private String data;

    public DataStone(@m String str) {
        this.data = str;
    }

    public static /* synthetic */ DataStone copy$default(DataStone dataStone, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dataStone.data;
        }
        return dataStone.copy(str);
    }

    @m
    public final String component1() {
        return this.data;
    }

    @l
    public final DataStone copy(@m String str) {
        return new DataStone(str);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataStone) && m0.g(this.data, ((DataStone) obj).data);
    }

    @m
    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        String str = this.data;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setData(@m String str) {
        this.data = str;
    }

    @l
    public String toString() {
        return "DataStone(data=" + this.data + j.f86771d;
    }
}
