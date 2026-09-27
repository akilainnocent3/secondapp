package com.sports.live.football.tv.models;

import fm.c;
import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class GoalsDataStand {

    @c("against")
    @m
    private Integer against;

    @c("for")
    @m
    private Integer fore;

    /* JADX WARN: Multi-variable type inference failed */
    public GoalsDataStand() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GoalsDataStand copy$default(GoalsDataStand goalsDataStand, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = goalsDataStand.fore;
        }
        if ((i10 & 2) != 0) {
            num2 = goalsDataStand.against;
        }
        return goalsDataStand.copy(num, num2);
    }

    @m
    public final Integer component1() {
        return this.fore;
    }

    @m
    public final Integer component2() {
        return this.against;
    }

    @l
    public final GoalsDataStand copy(@m Integer num, @m Integer num2) {
        return new GoalsDataStand(num, num2);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoalsDataStand)) {
            return false;
        }
        GoalsDataStand goalsDataStand = (GoalsDataStand) obj;
        return m0.g(this.fore, goalsDataStand.fore) && m0.g(this.against, goalsDataStand.against);
    }

    @m
    public final Integer getAgainst() {
        return this.against;
    }

    @m
    public final Integer getFore() {
        return this.fore;
    }

    public int hashCode() {
        Integer num = this.fore;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.against;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setAgainst(@m Integer num) {
        this.against = num;
    }

    public final void setFore(@m Integer num) {
        this.fore = num;
    }

    @l
    public String toString() {
        return "GoalsDataStand(fore=" + this.fore + ", against=" + this.against + j.f86771d;
    }

    public GoalsDataStand(@m Integer num, @m Integer num2) {
        this.fore = num;
        this.against = num2;
    }

    public /* synthetic */ GoalsDataStand(Integer num, Integer num2, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2);
    }
}
