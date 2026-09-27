package com.sports.live.football.tv.models;

import fm.c;
import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class Away {

    @c("draw")
    @m
    private Integer draw;

    @c("goals")
    @m
    private GoalsDataStand goals;

    @c("lose")
    @m
    private Integer lose;

    @c("played")
    @m
    private Integer played;

    @c("win")
    @m
    private Integer win;

    public Away() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Away copy$default(Away away, Integer num, Integer num2, Integer num3, Integer num4, GoalsDataStand goalsDataStand, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = away.played;
        }
        if ((i10 & 2) != 0) {
            num2 = away.win;
        }
        if ((i10 & 4) != 0) {
            num3 = away.draw;
        }
        if ((i10 & 8) != 0) {
            num4 = away.lose;
        }
        if ((i10 & 16) != 0) {
            goalsDataStand = away.goals;
        }
        GoalsDataStand goalsDataStand2 = goalsDataStand;
        Integer num5 = num3;
        return away.copy(num, num2, num5, num4, goalsDataStand2);
    }

    @m
    public final Integer component1() {
        return this.played;
    }

    @m
    public final Integer component2() {
        return this.win;
    }

    @m
    public final Integer component3() {
        return this.draw;
    }

    @m
    public final Integer component4() {
        return this.lose;
    }

    @m
    public final GoalsDataStand component5() {
        return this.goals;
    }

    @l
    public final Away copy(@m Integer num, @m Integer num2, @m Integer num3, @m Integer num4, @m GoalsDataStand goalsDataStand) {
        return new Away(num, num2, num3, num4, goalsDataStand);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Away)) {
            return false;
        }
        Away away = (Away) obj;
        return m0.g(this.played, away.played) && m0.g(this.win, away.win) && m0.g(this.draw, away.draw) && m0.g(this.lose, away.lose) && m0.g(this.goals, away.goals);
    }

    @m
    public final Integer getDraw() {
        return this.draw;
    }

    @m
    public final GoalsDataStand getGoals() {
        return this.goals;
    }

    @m
    public final Integer getLose() {
        return this.lose;
    }

    @m
    public final Integer getPlayed() {
        return this.played;
    }

    @m
    public final Integer getWin() {
        return this.win;
    }

    public int hashCode() {
        Integer num = this.played;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.win;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.draw;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.lose;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        GoalsDataStand goalsDataStand = this.goals;
        return iHashCode4 + (goalsDataStand != null ? goalsDataStand.hashCode() : 0);
    }

    public final void setDraw(@m Integer num) {
        this.draw = num;
    }

    public final void setGoals(@m GoalsDataStand goalsDataStand) {
        this.goals = goalsDataStand;
    }

    public final void setLose(@m Integer num) {
        this.lose = num;
    }

    public final void setPlayed(@m Integer num) {
        this.played = num;
    }

    public final void setWin(@m Integer num) {
        this.win = num;
    }

    @l
    public String toString() {
        return "Away(played=" + this.played + ", win=" + this.win + ", draw=" + this.draw + ", lose=" + this.lose + ", goals=" + this.goals + j.f86771d;
    }

    public Away(@m Integer num, @m Integer num2, @m Integer num3, @m Integer num4, @m GoalsDataStand goalsDataStand) {
        this.played = num;
        this.win = num2;
        this.draw = num3;
        this.lose = num4;
        this.goals = goalsDataStand;
    }

    public /* synthetic */ Away(Integer num, Integer num2, Integer num3, Integer num4, GoalsDataStand goalsDataStand, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : num3, (i10 & 8) != 0 ? null : num4, (i10 & 16) != 0 ? new GoalsDataStand(null, null, 3, null) : goalsDataStand);
    }
}
