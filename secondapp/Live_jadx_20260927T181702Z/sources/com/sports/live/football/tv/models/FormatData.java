package com.sports.live.football.tv.models;

import g8.a;
import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import re.d8;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class FormatData {
    private boolean checkUncheck;

    @m
    private n2 token;

    @m
    private d8.a trckGroup;

    public FormatData() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ FormatData copy$default(FormatData formatData, n2 n2Var, d8.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n2Var = formatData.token;
        }
        if ((i10 & 2) != 0) {
            aVar = formatData.trckGroup;
        }
        if ((i10 & 4) != 0) {
            z10 = formatData.checkUncheck;
        }
        return formatData.copy(n2Var, aVar, z10);
    }

    @m
    public final n2 component1() {
        return this.token;
    }

    @m
    public final d8.a component2() {
        return this.trckGroup;
    }

    public final boolean component3() {
        return this.checkUncheck;
    }

    @l
    public final FormatData copy(@m n2 n2Var, @m d8.a aVar, boolean z10) {
        return new FormatData(n2Var, aVar, z10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormatData)) {
            return false;
        }
        FormatData formatData = (FormatData) obj;
        return m0.g(this.token, formatData.token) && m0.g(this.trckGroup, formatData.trckGroup) && this.checkUncheck == formatData.checkUncheck;
    }

    public final boolean getCheckUncheck() {
        return this.checkUncheck;
    }

    @m
    public final n2 getToken() {
        return this.token;
    }

    @m
    public final d8.a getTrckGroup() {
        return this.trckGroup;
    }

    public int hashCode() {
        n2 n2Var = this.token;
        int iHashCode = (n2Var == null ? 0 : n2Var.hashCode()) * 31;
        d8.a aVar = this.trckGroup;
        return ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + a.a(this.checkUncheck);
    }

    public final void setCheckUncheck(boolean z10) {
        this.checkUncheck = z10;
    }

    public final void setToken(@m n2 n2Var) {
        this.token = n2Var;
    }

    public final void setTrckGroup(@m d8.a aVar) {
        this.trckGroup = aVar;
    }

    @l
    public String toString() {
        return "FormatData(token=" + this.token + ", trckGroup=" + this.trckGroup + ", checkUncheck=" + this.checkUncheck + j.f86771d;
    }

    public FormatData(@m n2 n2Var, @m d8.a aVar, boolean z10) {
        this.token = n2Var;
        this.trckGroup = aVar;
        this.checkUncheck = z10;
    }

    public /* synthetic */ FormatData(n2 n2Var, d8.a aVar, boolean z10, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : n2Var, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? false : z10);
    }
}
