package com.sportygames.vip.data;

import defpackage.o8i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J?\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/sportygames/vip/data/HowToPlayJsonOnboarding;", "", "howToPlayStakeSafe", "", "Lcom/sportygames/vip/data/HowToPlayStakeSafeItem;", "howToPlayTurbo", "Lcom/sportygames/vip/data/HowToPlayTurboItem;", "perks", "Lcom/sportygames/vip/data/VipPerks;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getHowToPlayStakeSafe", "()Ljava/util/List;", "getHowToPlayTurbo", "getPerks", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "vip_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HowToPlayJsonOnboarding {
    public static final int $stable = 8;
    private final List<HowToPlayStakeSafeItem> howToPlayStakeSafe;
    private final List<HowToPlayTurboItem> howToPlayTurbo;
    private final List<VipPerks> perks;

    public HowToPlayJsonOnboarding(List<HowToPlayStakeSafeItem> list, List<HowToPlayTurboItem> list2, List<VipPerks> list3) {
        this.howToPlayStakeSafe = list;
        this.howToPlayTurbo = list2;
        this.perks = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HowToPlayJsonOnboarding copy$default(HowToPlayJsonOnboarding howToPlayJsonOnboarding, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = howToPlayJsonOnboarding.howToPlayStakeSafe;
        }
        if ((i & 2) != 0) {
            list2 = howToPlayJsonOnboarding.howToPlayTurbo;
        }
        if ((i & 4) != 0) {
            list3 = howToPlayJsonOnboarding.perks;
        }
        return howToPlayJsonOnboarding.copy(list, list2, list3);
    }

    public final List<HowToPlayStakeSafeItem> component1() {
        return this.howToPlayStakeSafe;
    }

    public final List<HowToPlayTurboItem> component2() {
        return this.howToPlayTurbo;
    }

    public final List<VipPerks> component3() {
        return this.perks;
    }

    public final HowToPlayJsonOnboarding copy(List<HowToPlayStakeSafeItem> howToPlayStakeSafe, List<HowToPlayTurboItem> howToPlayTurbo, List<VipPerks> perks) {
        return new HowToPlayJsonOnboarding(howToPlayStakeSafe, howToPlayTurbo, perks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HowToPlayJsonOnboarding)) {
            return false;
        }
        HowToPlayJsonOnboarding howToPlayJsonOnboarding = (HowToPlayJsonOnboarding) other;
        return Intrinsics.g(this.howToPlayStakeSafe, howToPlayJsonOnboarding.howToPlayStakeSafe) && Intrinsics.g(this.howToPlayTurbo, howToPlayJsonOnboarding.howToPlayTurbo) && Intrinsics.g(this.perks, howToPlayJsonOnboarding.perks);
    }

    public final List<HowToPlayStakeSafeItem> getHowToPlayStakeSafe() {
        return this.howToPlayStakeSafe;
    }

    public final List<HowToPlayTurboItem> getHowToPlayTurbo() {
        return this.howToPlayTurbo;
    }

    public final List<VipPerks> getPerks() {
        return this.perks;
    }

    public int hashCode() {
        List<HowToPlayStakeSafeItem> list = this.howToPlayStakeSafe;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<HowToPlayTurboItem> list2 = this.howToPlayTurbo;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<VipPerks> list3 = this.perks;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HowToPlayJsonOnboarding(howToPlayStakeSafe=");
        sb.append(this.howToPlayStakeSafe);
        sb.append(", howToPlayTurbo=");
        sb.append(this.howToPlayTurbo);
        sb.append(", perks=");
        return o8i.a(sb, this.perks, ')');
    }
}
